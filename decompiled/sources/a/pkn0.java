package a;

import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pkn0 implements t1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final roi0 f27144a;

    public pkn0(roi0 roi0Var) {
        this.f27144a = roi0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((rkn0) this.f27144a.f30839a).close();
    }

    @Override // a.t1e
    public final Object m(boolean z, Function2 function2, zje zjeVar) {
        rkn0 rkn0Var = (rkn0) this.f27144a.f30839a;
        rkn0Var.getClass();
        return function2.invoke(new tkn0(new okn0(rkn0Var.G0())), zjeVar);
    }
}
