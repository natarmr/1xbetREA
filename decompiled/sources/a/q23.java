package a;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q23 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r23 f27981a;

    public q23(r23 r23Var) {
        this.f27981a = r23Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f27981a.d.removeCallbacks(this);
        this.f27981a.x();
        r23 r23Var = this.f27981a;
        synchronized (r23Var.e) {
            if (r23Var.j) {
                r23Var.j = false;
                ArrayList arrayList = r23Var.g;
                r23Var.g = r23Var.h;
                r23Var.h = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27981a.x();
        r23 r23Var = this.f27981a;
        synchronized (r23Var.e) {
            if (r23Var.g.isEmpty()) {
                r23Var.c.removeFrameCallback(this);
                r23Var.j = false;
            }
        }
    }
}
