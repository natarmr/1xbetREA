package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class bne0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f2880a;
    public final Pair b;

    public bne0(Pair pair, Pair pair2) {
        ctt0 ctt0Var = ctt0.f4959a;
        llk0 llk0Var = llk0.f20252a;
        flk0 flk0Var = flk0.f9742a;
        this.f2880a = pair;
        this.b = pair2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bne0)) {
            return false;
        }
        bne0 bne0Var = (bne0) obj;
        ctt0 ctt0Var = ctt0.f4959a;
        if (!this.f2880a.equals(bne0Var.f2880a) || !this.b.equals(bne0Var.b)) {
            return false;
        }
        llk0 llk0Var = llk0.f20252a;
        flk0 flk0Var = flk0.f9742a;
        return true;
    }

    public final int hashCode() {
        return flk0.f9742a.hashCode() + ((llk0.f20252a.hashCode() + ((this.b.hashCode() + ((this.f2880a.hashCode() + (ctt0.f4959a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ReferralFilterModel(selectedUserType=" + ctt0.f4959a + ", dateRange=" + this.f2880a + ", profitRange=" + this.b + ", sortType=" + llk0.f20252a + ", sortDirection=" + flk0.f9742a + Separators.RPAREN;
    }
}
