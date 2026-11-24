package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ecb0 extends rkb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7558a;
    public final boolean b;

    public ecb0(ArrayList arrayList, boolean z) {
        this.f7558a = arrayList;
        this.b = z;
    }

    @Override // a.rkb0
    public final String c() {
        return "LIVE";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecb0)) {
            return false;
        }
        ecb0 ecb0Var = (ecb0) obj;
        return this.f7558a.equals(ecb0Var.f7558a) && this.b == ecb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + twn.g(this.f7558a, 72447124, 31);
    }

    public final String toString() {
        return "PopularGamesLiveUiItem(id=LIVE, games=" + this.f7558a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}
