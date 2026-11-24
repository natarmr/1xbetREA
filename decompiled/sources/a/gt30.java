package a;

import android.animation.AnimatorSet;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class gt30 extends FrameLayout {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f11862a;
    public boolean b;
    public o9k0 c;
    public AnimatorSet d;
    public final a8z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt30(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f11862a = new Path();
        this.e = maz.a(wez.b, new ha30(this, this, (byte) 4));
        if (!isInEditMode()) {
            getBinding().c.setImageResource(R.drawable.ic_memory_init);
        }
        setLayerType(1, null);
    }

    private final ciu0 getBinding() {
        return (ciu0) this.e.getValue();
    }

    public final void a(int i, int i2, f73 f73Var) {
        if (this.b) {
            return;
        }
        this.b = true;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.end();
        }
        if (i2 == -1) {
            getBinding().b.setImageResource(R.drawable.memory_question);
        } else {
            ImageView imageView = getBinding().b;
            String str = String.format(Locale.ENGLISH, "/static/img/android/games/background/1xMemory/%d/redesign/icon_%d.png", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
            iun iunVar = iun.f15405a;
            tr20 tr20Var = new tr20((byte) 23);
            tr20 tr20Var2 = new tr20((byte) 24);
            Context context = imageView.getContext();
            context.getClass();
            if (sj3.q0(context)) {
                Drawable drawableU = epv0.U(R.drawable.ic_memory_init, imageView.getContext());
                Drawable drawableU2 = epv0.U(R.drawable.ic_memory_promo, imageView.getContext());
                Context context2 = imageView.getContext();
                context2.getClass();
                if (sj3.q0(context2)) {
                    List list = u0d.f34849a;
                    if (u0d.c(str)) {
                        imageView.setImageDrawable(drawableU);
                    } else {
                        StringBuilder sb = new StringBuilder(ujn.h);
                        if (str.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str, '/'));
                        }
                        String string = sb.toString();
                        gbe0 gbe0VarA = o5k0.a(imageView.getContext());
                        k1x k1xVar = new k1x(imageView.getContext());
                        k1xVar.c = string;
                        t1x.h(k1xVar, imageView);
                        t1x.a(k1xVar, false);
                        k1xVar.i = u0d.b(string);
                        k1xVar.f = u0d.b(string);
                        t1x.g(k1xVar, drawableU);
                        t1x.d(k1xVar, drawableU2);
                        prs0 prs0VarO = dtb.O(ezw.f8691a);
                        vi9 vi9Var = (vi9) prs0VarO.f27482a;
                        vi9 vi9Var2 = (vi9) prs0VarO.b;
                        vi9 vi9Var3 = (vi9) prs0VarO.c;
                        k1xVar.n = vi9Var;
                        k1xVar.m = vi9Var2;
                        k1xVar.o = vi9Var3;
                        Context context3 = imageView.getContext();
                        context3.getClass();
                        q1x.b(k1xVar, dtb.P(context3, iunVar));
                        k1xVar.e = new jw20(tr20Var2, tr20Var, imageView);
                        t1x.b(k1xVar, true);
                        gbe0VarA.a(k1xVar.a());
                    }
                }
            }
        }
        ukq ukqVar = new ukq(getBinding().c, getBinding().b);
        ukqVar.setAnimationListener(f73Var);
        startAnimation(ukqVar);
    }

    public final void b() {
        if (this.b) {
            final byte b = 0;
            this.b = false;
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null && animatorSet.isRunning()) {
                animatorSet.end();
            }
            ukq ukqVar = new ukq(getBinding().b, getBinding().c);
            startAnimation(ukqVar);
            final byte b2 = 1;
            ukqVar.setAnimationListener(new f73(new Function0(this) { // from class: a.ft30
                public final /* synthetic */ gt30 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b3 = b;
                    gt30 gt30Var = this.b;
                    switch (b3) {
                        case 0:
                            o9k0 o9k0Var = gt30Var.c;
                            if (o9k0Var != null) {
                                o9k0Var.onAnimationEnd();
                            }
                            break;
                        default:
                            o9k0 o9k0Var2 = gt30Var.c;
                            if (o9k0Var2 != null) {
                                o9k0Var2.onAnimationStart();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, new Function0(this) { // from class: a.ft30
                public final /* synthetic */ gt30 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b3 = b2;
                    gt30 gt30Var = this.b;
                    switch (b3) {
                        case 0:
                            o9k0 o9k0Var = gt30Var.c;
                            if (o9k0Var != null) {
                                o9k0Var.onAnimationEnd();
                            }
                            break;
                        default:
                            o9k0 o9k0Var2 = gt30Var.c;
                            if (o9k0Var2 != null) {
                                o9k0Var2.onAnimationStart();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, (byte) 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        canvas.clipPath(this.f11862a);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f2 = i;
        float f3 = 0.1f * f2;
        Path path = this.f11862a;
        path.reset();
        path.addRoundRect(new RectF(0.0f, 0.0f, f2, i2), f3, f3, Path.Direction.CW);
    }

    public final void setListener(o9k0 o9k0Var) {
        o9k0Var.getClass();
        this.c = o9k0Var;
    }
}
