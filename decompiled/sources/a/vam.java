package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37096a;
    public final r2m b;
    public final String c;
    public final a4x d;
    public final boolean e;

    public vam(String str, r2m r2mVar, String str2, i4 i4Var, boolean z) {
        str.getClass();
        i4Var.getClass();
        this.f37096a = str;
        this.b = r2mVar;
        this.c = str2;
        this.d = i4Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vam)) {
            return false;
        }
        vam vamVar = (vam) obj;
        return Intrinsics.d(this.f37096a, vamVar.f37096a) && this.b.equals(vamVar.b) && this.c.equals(vamVar.c) && Intrinsics.d(this.d, vamVar.d) && this.e == vamVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cs0.b(this.d, ua80.b((this.b.hashCode() + (this.f37096a.hashCode() * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCyberSyntheticResultTableRowUiModel(number=");
        sb.append(this.f37096a);
        sb.append(", playerBadge=");
        sb.append(this.b);
        sb.append(", playerLabel=");
        cs0.B(sb, this.c, ", labels=", this.d, ", active=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
