package a;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes2.dex */
public final class uew0 extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sew0 f35551a;
    public final tew0 b;

    public uew0(sew0 sew0Var, tew0 tew0Var) {
        this.f35551a = sew0Var;
        this.b = tew0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iE = ((oew0) this.f35551a).e(i);
        ((cpw0) this.b).getClass();
        fdw0 fdw0VarA = fdw0.a(iE);
        return fdw0VarA == null ? fdw0.UNKNOWN : fdw0VarA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((oew0) this.f35551a).c;
    }
}
