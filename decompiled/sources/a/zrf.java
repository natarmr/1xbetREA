package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zrf {
    public static final yrf Companion = new yrf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44851a;
    public final gsf b;
    public final String c;

    public zrf(edy edyVar) {
        edyVar.getClass();
        String strL = piz.L(edyVar, "player");
        fsf fsfVar = gsf.Companion;
        Integer numValueOf = Integer.valueOf(piz.K(edyVar, "side"));
        fsfVar.getClass();
        gsf gsfVarA = fsf.a(numValueOf);
        String strL2 = piz.L(edyVar, "weapon");
        this.f44851a = strL;
        this.b = gsfVarA;
        this.c = strL2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrf)) {
            return false;
        }
        zrf zrfVar = (zrf) obj;
        return Intrinsics.d(this.f44851a, zrfVar.f44851a) && this.b == zrfVar.b && Intrinsics.d(this.c, zrfVar.c);
    }

    public final int hashCode() {
        String str = this.f44851a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        gsf gsfVar = this.b;
        int iHashCode2 = (iHashCode + (gsfVar == null ? 0 : gsfVar.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2SuicideGameLogResponse(player=");
        sb.append(this.f44851a);
        sb.append(", side=");
        sb.append(this.b);
        sb.append(", weapon=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }

    public /* synthetic */ zrf(int i, String str, gsf gsfVar, String str2) {
        if ((i & 1) == 0) {
            this.f44851a = null;
        } else {
            this.f44851a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = gsfVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }
}
