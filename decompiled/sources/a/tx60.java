package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tx60 implements vx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd50 f34682a;
    public final mdm b;
    public final mdm c;
    public final in5 d;
    public final ijl e;

    public tx60(cd50 cd50Var, mdm mdmVar, mdm mdmVar2, in5 in5Var, ijl ijlVar) {
        cd50Var.getClass();
        in5Var.getClass();
        ijlVar.getClass();
        this.f34682a = cd50Var;
        this.b = mdmVar;
        this.c = mdmVar2;
        this.d = in5Var;
        this.e = ijlVar;
    }

    @Override // a.vx60
    public final cd50 a() {
        return this.f34682a;
    }

    @Override // a.vx60
    public final in5 b() {
        return this.d;
    }

    @Override // a.vx60
    public final ijl c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx60)) {
            return false;
        }
        tx60 tx60Var = (tx60) obj;
        return Intrinsics.d(this.f34682a, tx60Var.f34682a) && Intrinsics.d(this.b, tx60Var.b) && Intrinsics.d(this.c, tx60Var.c) && Intrinsics.d(this.d, tx60Var.d) && this.e == tx60Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.f34682a.f4145a.hashCode() * 31;
        mdm mdmVar = this.b;
        int iHashCode2 = (iHashCode + (mdmVar == null ? 0 : mdmVar.hashCode())) * 31;
        mdm mdmVar2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (mdmVar2 != null ? mdmVar2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Error(navigationBarUiState=" + this.f34682a + ", config=" + this.b + ", umConfig=" + this.c + ", balanceUiState=" + this.d + ", accountSelectionStyle=" + this.e + Separators.RPAREN;
    }
}
