package a;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s23 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n5a f31482a;
    public final /* synthetic */ Function1 b;

    public s23(n5a n5aVar, t23 t23Var, Function1 function1) {
        this.f31482a = n5aVar;
        this.b = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object g0g0Var;
        Function1 function1 = this.b;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = function1.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        this.f31482a.resumeWith(g0g0Var);
    }
}
