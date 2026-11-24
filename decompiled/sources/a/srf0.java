package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class srf0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f32674a;
    public final sje b;
    public mrf0 c;
    public Function1 d;
    public final TranslateAnimation e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srf0(Context context) {
        super(context, null, 0, 0);
        context.getClass();
        this.f32674a = maz.a(wez.b, new sue0(this, this, (byte) 5));
        rwj rwjVar = tvk.f34603a;
        this.b = d5c.a(ys10.f43147a);
        this.d = new bue0((byte) 27);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -40.0f, 0.0f);
        translateAnimation.setInterpolator(new BounceInterpolator());
        translateAnimation.setDuration(500L);
        this.e = translateAnimation;
        getBinding().b.setScaleType(ImageView.ScaleType.FIT_END);
        a(new mrf0(15), false);
    }

    public static final Unit b(srf0 srf0Var, mrf0 mrf0Var) {
        qrf0 qrf0Var = mrf0Var.d;
        srf0Var.setSafeImage(qrf0Var);
        if (q3d.j(qrf0.e, qrf0.f29208a).contains(qrf0Var)) {
            qjj.W(srf0Var.b, null, null, new k6d0((Object) srf0Var, (Object) mrf0Var, (yje) null, (byte) 14), 3);
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(srf0Var.getBinding().c, (Property<TextView, Float>) View.TRANSLATION_Y, 100.0f, 0.0f), ObjectAnimator.ofFloat(srf0Var.getBinding().c, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f));
            animatorSet.addListener(unh0.h0(s7n0.l(srf0Var), new rrf0(srf0Var, mrf0Var, (byte) 1), new rrf0(srf0Var, mrf0Var, (byte) 2), 10));
            animatorSet.setDuration(500L);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.start();
        }
        return Unit.f46060a;
    }

    public static final Unit c(srf0 srf0Var, mrf0 mrf0Var) {
        srf0Var.getBinding().c.setVisibility(0);
        TextView textView = srf0Var.getBinding().c;
        StringBuilder sb = new StringBuilder("+");
        pn40 pn40Var = pn40.f27267a;
        sb.append(pn40.d(mrf0Var.f22270a, mrf0Var.b, p3u0.c));
        textView.setText(sb);
        return Unit.f46060a;
    }

    public static final Unit d(srf0 srf0Var, mrf0 mrf0Var) {
        srf0Var.getBinding().c.setVisibility(8);
        srf0Var.d.invoke(mrf0Var);
        return Unit.f46060a;
    }

    private final lku0 getBinding() {
        return (lku0) this.f32674a.getValue();
    }

    private final void setSafeImage(qrf0 qrf0Var) {
        int i;
        ImageView imageView = getBinding().b;
        switch (qrf0Var.ordinal()) {
            case 0:
                i = R.drawable.ic_resident_safe_dynamite;
                break;
            case 1:
                i = R.drawable.ic_resident_safe_cup;
                break;
            case 2:
                i = R.drawable.ic_resident_safe_gold;
                break;
            case 3:
                i = R.drawable.ic_resident_safe_alcohol;
                break;
            case 4:
                i = R.drawable.ic_resident_safe_empty;
                break;
            case 5:
                i = R.drawable.ic_resident_safe_dynamite_2_life;
                break;
            case 6:
                i = R.drawable.ic_resident_safe_closed;
                break;
            default:
                t9f.b();
                return;
        }
        imageView.setImageResource(i);
    }

    public final void a(mrf0 mrf0Var, boolean z) {
        mrf0 mrf0Var2 = this.c;
        qrf0 qrf0Var = mrf0Var2 != null ? mrf0Var2.d : null;
        qrf0 qrf0Var2 = mrf0Var.d;
        if (qrf0Var == qrf0Var2) {
            this.d.invoke(mrf0Var);
            this.c = mrf0Var;
            return;
        }
        if (qrf0Var2 == qrf0.f29208a) {
            if ((mrf0Var2 != null ? mrf0Var2.d : null) == qrf0.f) {
                if (mrf0Var2 != null) {
                    this.d.invoke(mrf0Var2);
                    return;
                }
                return;
            }
        }
        if (z && !q3d.j(qrf0.g, qrf0.f).contains(qrf0Var2)) {
            f73 f73Var = new f73(new rrf0(this, mrf0Var, (byte) 0), new f33((byte) 2), (byte) 0);
            TranslateAnimation translateAnimation = this.e;
            translateAnimation.setAnimationListener(f73Var);
            startAnimation(translateAnimation);
        } else if (qrf0Var2 == qrf0.f) {
            setSafeImage(qrf0Var2);
            mrf0 mrf0Var3 = this.c;
            if ((mrf0Var3 != null ? mrf0Var3.d : null) == qrf0.g) {
                this.d.invoke(mrf0Var);
            }
        } else {
            setSafeImage(qrf0Var2);
            this.d.invoke(mrf0Var);
        }
        this.c = mrf0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        d5c.G(this.b, null);
        super.onDetachedFromWindow();
    }

    public final void setOnApplyListener(Function1<? super mrf0, Unit> function1) {
        function1.getClass();
        this.d = function1;
    }
}
