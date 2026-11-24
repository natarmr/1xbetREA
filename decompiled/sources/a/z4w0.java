package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class z4w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6w0 f43792a;

    public z4w0(j6w0 j6w0Var) {
        this.f43792a = j6w0Var;
    }

    public final void a(iqt0 iqt0Var) {
        iqt0Var.getClass();
        m7a m7aVar = iqt0Var.b.d;
        LinkedHashMap linkedHashMap = this.f43792a.f16010a;
        mz40 mz40VarB = (mz40) linkedHashMap.get(m7aVar);
        if (mz40VarB == null) {
            mz40VarB = roj0.b(1, 0, i99.b, 2);
            linkedHashMap.put(m7aVar, mz40VarB);
        }
        mz40VarB.g(iqt0Var);
    }
}
