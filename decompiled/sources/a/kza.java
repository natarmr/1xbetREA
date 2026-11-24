package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kza extends kpb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19145a;
    public final List b;

    public kza(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f19145a = list;
        this.b = list2;
    }

    @Override // a.kpb
    public final int I() {
        return this.b.size();
    }

    @Override // a.kpb
    public final int J() {
        return this.f19145a.size();
    }

    @Override // a.kpb
    public final boolean s(int i, int i2) {
        p6t0 p6t0Var = (p6t0) this.f19145a.get(i);
        return p6t0Var.h(p6t0Var, (p6t0) this.b.get(i2));
    }

    @Override // a.kpb
    public final boolean t(int i, int i2) {
        p6t0 p6t0Var = (p6t0) this.f19145a.get(i);
        return p6t0Var.g(p6t0Var, (p6t0) this.b.get(i2));
    }

    @Override // a.kpb
    public final Object z(int i, int i2) {
        p6t0 p6t0Var = (p6t0) this.f19145a.get(i);
        return p6t0Var.o(p6t0Var, (p6t0) this.b.get(i2));
    }
}
