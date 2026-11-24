package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zzx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final az6 f45277a;
    public final um5 b;
    public final yw6 c;
    public final String d;
    public final boolean e;

    public zzx(az6 az6Var, um5 um5Var, yw6 yw6Var, String str, boolean z) {
        str.getClass();
        this.f45277a = az6Var;
        this.b = um5Var;
        this.c = yw6Var;
        this.d = str;
        this.e = z;
    }

    public static zzx a(zzx zzxVar, um5 um5Var, yw6 yw6Var, boolean z, int i) {
        az6 az6Var = zzxVar.f45277a;
        if ((i & 2) != 0) {
            um5Var = zzxVar.b;
        }
        um5 um5Var2 = um5Var;
        if ((i & 4) != 0) {
            yw6Var = zzxVar.c;
        }
        yw6 yw6Var2 = yw6Var;
        String str = zzxVar.d;
        if ((i & 16) != 0) {
            z = zzxVar.e;
        }
        zzxVar.getClass();
        str.getClass();
        return new zzx(az6Var, um5Var2, yw6Var2, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzx)) {
            return false;
        }
        zzx zzxVar = (zzx) obj;
        return this.f45277a.equals(zzxVar.f45277a) && this.b.equals(zzxVar.b) && this.c.equals(zzxVar.c) && Intrinsics.d(this.d, zzxVar.d) && this.e == zzxVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f45277a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JackpotBetState(betGameInfoUiState=");
        sb.append(this.f45277a);
        sb.append(", balanceState=");
        sb.append(this.b);
        sb.append(", betFieldState=");
        sb.append(this.c);
        sb.append(", taxInfoLabel=");
        sb.append(this.d);
        sb.append(", lastConnection=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
