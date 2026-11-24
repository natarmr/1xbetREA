package a;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class z9c extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq8 f44009a;
    public final n0o0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public y9c f;
    public Function0 g;
    public sps0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9c(Context context) {
        super(context, null, 0);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_chest, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            hny.u("rootView");
            throw null;
        }
        ImageView imageView = (ImageView) viewInflate;
        this.f44009a = new nq8(imageView, imageView, (byte) 19);
        this.b = maz.b(new w9c(this, (byte) 4));
        this.c = maz.b(new w9c(this, (byte) 5));
        this.d = maz.b(new w9c(this, (byte) 6));
        this.e = maz.b(new w9c(this, (byte) 7));
        this.f = y9c.b;
        this.g = new zxb((byte) 3);
        this.h = new yk5();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    public static final AnimatorSet c(z9c z9cVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(z9cVar.getDisappearAnim(), z9cVar.getAppearAnim());
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    public static final AnimatorSet e(z9c z9cVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(z9cVar.getDisappearAnim(), z9cVar.getAppearAnim());
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    private final AnimatorSet getAppearAnim() {
        return (AnimatorSet) this.b.getValue();
    }

    private final AnimatorSet getCloseAnim() {
        return (AnimatorSet) this.e.getValue();
    }

    private final AnimatorSet getDisappearAnim() {
        return (AnimatorSet) this.c.getValue();
    }

    private final AnimatorSet getOpenAnim() {
        return (AnimatorSet) this.d.getValue();
    }

    public final boolean a() {
        return getOpenAnim().isRunning() || getCloseAnim().isRunning() || getAppearAnim().isRunning();
    }

    public final void b() {
        if (this.f != y9c.f42237a || a()) {
            return;
        }
        getAppearAnim().removeAllListeners();
        getDisappearAnim().addListener(new x73(null, new w9c(this, (byte) 0), 11));
        getCloseAnim().addListener(new x73(null, new w9c(this, (byte) 1), 11));
        getCloseAnim().start();
    }

    public final void d(int i, cym0 cym0Var) {
        if (this.f != y9c.b || a()) {
            return;
        }
        this.g = new x9c(this, i, (byte) 0);
        getDisappearAnim().addListener(new x73(null, new w9c(this, (byte) 2), 11));
        getAppearAnim().addListener(new x73(null, new w9c(this, (byte) 3), 11));
        getOpenAnim().addListener(new x73(null, new yw9(this, cym0Var, (byte) 12), 11));
        getOpenAnim().start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDisappearAnim().cancel();
        getAppearAnim().cancel();
        getOpenAnim().cancel();
        getCloseAnim().cancel();
    }

    public final void setListener(sps0 sps0Var) {
        sps0Var.getClass();
        this.h = sps0Var;
    }
}
