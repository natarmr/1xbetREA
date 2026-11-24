package a;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class prb0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f27456a = new Handler(Looper.getMainLooper());
    public final AtomicReference b;
    public final lh3 c;
    public final lh3 d;

    public prb0(View view, lh3 lh3Var, lh3 lh3Var2) {
        this.b = new AtomicReference(view);
        this.c = lh3Var;
        this.d = lh3Var2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        lh3 lh3Var = this.c;
        Handler handler = this.f27456a;
        handler.post(lh3Var);
        handler.postAtFrontOfQueue(this.d);
        return true;
    }
}
