package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mva f12569a;
    public final mva b;
    public final mva c;
    public final dp00 d;
    public final dp00 e;

    public h7d(mva mvaVar, mva mvaVar2, mva mvaVar3, dp00 dp00Var, dp00 dp00Var2) {
        mvaVar.getClass();
        mvaVar2.getClass();
        mvaVar3.getClass();
        dp00Var.getClass();
        this.f12569a = mvaVar;
        this.b = mvaVar2;
        this.c = mvaVar3;
        this.d = dp00Var;
        this.e = dp00Var2;
        if (dp00Var.e && dp00Var2 != null) {
            boolean z = dp00Var2.e;
        }
        boolean z2 = dp00Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h7d.class != obj.getClass()) {
            return false;
        }
        h7d h7dVar = (h7d) obj;
        return Intrinsics.d(this.f12569a, h7dVar.f12569a) && Intrinsics.d(this.b, h7dVar.b) && Intrinsics.d(this.c, h7dVar.c) && Intrinsics.d(this.d, h7dVar.d) && Intrinsics.d(this.e, h7dVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f12569a.hashCode() * 31)) * 31)) * 31)) * 31;
        dp00 dp00Var = this.e;
        return iHashCode + (dp00Var != null ? dp00Var.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f12569a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}
