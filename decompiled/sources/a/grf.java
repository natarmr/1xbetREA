package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class grf {
    public static final frf Companion = new frf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11776a;
    public final Integer b;
    public final gsf c;
    public final lsf d;

    public grf(edy edyVar) {
        edyVar.getClass();
        Integer numValueOf = Integer.valueOf(piz.K(edyVar, "ctScore"));
        Integer numValueOf2 = Integer.valueOf(piz.K(edyVar, "tScore"));
        fsf fsfVar = gsf.Companion;
        Integer numValueOf3 = Integer.valueOf(piz.K(edyVar, "winner"));
        fsfVar.getClass();
        gsf gsfVarA = fsf.a(numValueOf3);
        ksf ksfVar = lsf.Companion;
        int iK = piz.K(edyVar, "winType");
        ksfVar.getClass();
        for (Object obj : lsf.d) {
            if (((lsf) obj).f20576a.equals(String.valueOf(iK))) {
                this.f11776a = numValueOf;
                this.b = numValueOf2;
                this.c = gsfVarA;
                this.d = (lsf) obj;
            }
        }
        obj = null;
        this.f11776a = numValueOf;
        this.b = numValueOf2;
        this.c = gsfVarA;
        this.d = (lsf) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grf)) {
            return false;
        }
        grf grfVar = (grf) obj;
        return Intrinsics.d(this.f11776a, grfVar.f11776a) && Intrinsics.d(this.b, grfVar.b) && this.c == grfVar.c && this.d == grfVar.d;
    }

    public final int hashCode() {
        Integer num = this.f11776a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        gsf gsfVar = this.c;
        int iHashCode3 = (iHashCode2 + (gsfVar == null ? 0 : gsfVar.hashCode())) * 31;
        lsf lsfVar = this.d;
        return iHashCode3 + (lsfVar != null ? lsfVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("Cs2RoundedGameLogResponse(ctScore=", this.f11776a, ", tScore=", this.b, ", winner=");
        sbQ.append(this.c);
        sbQ.append(", winType=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public /* synthetic */ grf(int i, Integer num, Integer num2, gsf gsfVar, lsf lsfVar) {
        if ((i & 1) == 0) {
            this.f11776a = null;
        } else {
            this.f11776a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = gsfVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = lsfVar;
        }
    }
}
