package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class htg0 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f13633a;
    public gtg0 b;
    public sps0 c;
    public AnimatorSet d;

    public htg0(Context context) {
        super(context, null, 0);
        this.f13633a = maz.a(wez.b, new sue0(this, this, (byte) 10));
        this.b = gtg0.f11879a;
        View.inflate(context, R.layout.view_safe, this);
    }

    public static final Unit b(htg0 htg0Var, int i, cym0 cym0Var) {
        htg0Var.b = gtg0.c;
        htg0Var.getBinding().b.setVisibility(8);
        htg0Var.setPrize(i);
        Handler handler = htg0Var.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new oh60(cym0Var, htg0Var, (byte) 17), 500L);
        return Unit.f46060a;
    }

    private final nku0 getBinding() {
        return (nku0) this.f13633a.getValue();
    }

    private final void setPrize(int i) {
        if (i == 0) {
            getBinding().c.setImageResource(R.drawable.ic_safe_empty);
        } else if (i <= 50) {
            getBinding().c.setImageResource(R.drawable.ic_safe_money);
        } else {
            getBinding().c.setImageResource(R.drawable.ic_safe_gold);
        }
    }

    public final void a() {
        gtg0 gtg0Var = this.b;
        gtg0 gtg0Var2 = gtg0.f11879a;
        if (gtg0Var != gtg0Var2) {
            getBinding().c.setImageResource(R.drawable.ic_safe);
            getBinding().b.setRotation(0.0f);
            getBinding().b.setVisibility(0);
            this.b = gtg0Var2;
            sps0 sps0Var = this.c;
            if (sps0Var != null) {
                sps0Var.c();
            }
        }
    }

    public final void c(int i, cym0 cym0Var) {
        if (this.b != gtg0.f11879a) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        int[] iArr = new int[5];
        f1e0.f8761a.getClass();
        iArr[0] = f1e0.b.f(180);
        for (int i2 = 1; i2 < 5; i2++) {
            int i3 = iArr[i2 - 1];
            f1e0.f8761a.getClass();
            iArr[i2] = f1e0.b.f(180) + i3;
        }
        AppCompatImageView appCompatImageView = getBinding().b;
        float[] fArr = {0.0f, iArr[0]};
        Property property = View.ROTATION;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) property, fArr);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setInterpolator(new f0p((byte) 1));
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(getBinding().b, (Property<AppCompatImageView, Float>) property, 0.0f, iArr[0]));
        for (int i4 = 1; i4 < 5; i4++) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getBinding().b, (Property<AppCompatImageView, Float>) property, iArr[i4 - 1], iArr[i4]);
            objectAnimatorOfFloat2.setDuration(600L);
            objectAnimatorOfFloat2.setInterpolator(new f0p((byte) 1));
            long j = i4;
            objectAnimatorOfFloat2.setStartDelay((j * 100) + (j * 600));
            builderPlay.with(objectAnimatorOfFloat2);
        }
        animatorSet.addListener(new x73(new a7g0(this, (byte) 6), new bh1(this, i, cym0Var, (byte) 9), 10));
        this.d = animatorSet;
        animatorSet.start();
    }

    public final void d(int i) {
        if (this.b != gtg0.f11879a) {
            return;
        }
        setPrize(i);
        this.b = gtg0.c;
        getBinding().b.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getHandler().removeCallbacksAndMessages(null);
    }

    public final void setListener(sps0 sps0Var) {
        sps0Var.getClass();
        this.c = sps0Var;
    }
}
