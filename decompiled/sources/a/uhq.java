package a;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class uhq implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f35694a = new Handler(Looper.getMainLooper());
    public final AtomicReference b;
    public final lh3 c;

    public uhq(View view, lh3 lh3Var) {
        this.b = new AtomicReference(view);
        this.c = lh3Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new thq(this, view));
        this.f35694a.postAtFrontOfQueue(this.c);
    }
}
