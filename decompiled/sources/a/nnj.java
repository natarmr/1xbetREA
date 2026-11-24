package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nnj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23824a;
    public final boolean b;
    public final String c;
    public final String d;
    public final oo5 e;
    public final int f;

    public nnj(boolean z, boolean z2, String str, String str2, oo5 oo5Var, int i) {
        this.f23824a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = oo5Var;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnj)) {
            return false;
        }
        nnj nnjVar = (nnj) obj;
        return this.f23824a == nnjVar.f23824a && this.b == nnjVar.b && this.c.equals(nnjVar.c) && this.d.equals(nnjVar.d) && this.e == nnjVar.e && this.f == nnjVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + twn.a(this.f, (this.e.hashCode() + ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f23824a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("NewsPager(showNavBar=", ", needAuth=", ", translateId=", this.f23824a, this.b);
        f140.v(sbQ, this.c, ", title=", this.d, ", actionType=");
        sbQ.append(this.e);
        sbQ.append(", prizeFlag=");
        sbQ.append(this.f);
        sbQ.append(", hasBackStack=false)");
        return sbQ.toString();
    }
}
