package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v6b implements w6b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f36868a;
    public final boolean b;
    public final mdm c;

    public v6b(udl0 udl0Var, boolean z, mdm mdmVar) {
        this.f36868a = udl0Var;
        this.b = z;
        this.c = mdmVar;
    }

    @Override // a.w6b
    public final boolean a() {
        return this.b;
    }

    @Override // a.w6b
    public final udl0 b() {
        return this.f36868a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6b)) {
            return false;
        }
        v6b v6bVar = (v6b) obj;
        return this.f36868a == v6bVar.f36868a && this.b == v6bVar.b && this.c.equals(v6bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f36868a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchEmpty(sportGameType=");
        sb.append(this.f36868a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", lottieConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
