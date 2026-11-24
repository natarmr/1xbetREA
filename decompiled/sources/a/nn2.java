package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nn2 implements on2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tdp f23799a;
    public final vm2 b;

    public nn2(tdp tdpVar, vm2 vm2Var) {
        this.f23799a = tdpVar;
        this.b = vm2Var;
    }

    @Override // a.on2
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn2)) {
            return false;
        }
        nn2 nn2Var = (nn2) obj;
        return this.f23799a.equals(nn2Var.f23799a) && this.b.equals(nn2Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(1) + ((this.b.hashCode() + (this.f23799a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ViewedCard(model=" + this.f23799a + ", action=" + this.b + ", spanSize=1)";
    }
}
