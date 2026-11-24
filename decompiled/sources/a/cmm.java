package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1i f4611a;
    public final bmm b;
    public final boolean c;
    public final ee d;
    public final sd e;

    public cmm(i1i i1iVar, bmm bmmVar, boolean z, ee eeVar, sd sdVar) {
        this.f4611a = i1iVar;
        this.b = bmmVar;
        this.c = z;
        this.d = eeVar;
        this.e = sdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmm)) {
            return false;
        }
        cmm cmmVar = (cmm) obj;
        return this.f4611a.equals(cmmVar.f4611a) && this.b.equals(cmmVar.b) && this.c == cmmVar.c && this.d.equals(cmmVar.d) && Intrinsics.d(this.e, cmmVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + brm0.e(brm0.e((this.b.hashCode() + (this.f4611a.hashCode() * 31)) * 31, 31, this.c), 31, false)) * 31;
        sd sdVar = this.e;
        return iHashCode + (sdVar != null ? sdVar.hashCode() : 0);
    }

    public final String toString() {
        return "DsNavigationBarPopularStyle(type=" + this.f4611a + ", logo=" + this.b + ", searchAvailable=" + this.c + ", showSeparator=false, accountControlStyle=" + this.d + ", accountControlDsModel=" + this.e + Separators.RPAREN;
    }
}
