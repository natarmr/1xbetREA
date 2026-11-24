package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m2z implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21087a;
    public final f2z b;
    public final a4x c;
    public final boolean d;
    public final int e;
    public final boolean f;

    public m2z(String str, f2z f2zVar, i4 i4Var, boolean z, int i, boolean z2) {
        i4Var.getClass();
        this.f21087a = str;
        this.b = f2zVar;
        this.c = i4Var;
        this.d = z;
        this.e = i;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2z)) {
            return false;
        }
        m2z m2zVar = (m2z) obj;
        return this.f21087a.equals(m2zVar.f21087a) && this.b.equals(m2zVar.b) && Intrinsics.d(this.c, m2zVar.c) && this.d == m2zVar.d && this.e == m2zVar.e && this.f == m2zVar.f;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f21087a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.a(this.e, brm0.e(cs0.b(this.c, (this.b.hashCode() + (this.f21087a.hashCode() * 31)) * 31, 31), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastMatchesUiModel(key=");
        sb.append(this.f21087a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", lastMatchesItemList=");
        sb.append(this.c);
        sb.append(", needFooter=");
        sb.append(this.d);
        sb.append(", footerIcon=");
        return ohs0.k(this.e, ", supportRtl=", Separators.RPAREN, sb, this.f);
    }
}
