package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dcb0 extends rkb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5842a;
    public final boolean b;

    public dcb0(ArrayList arrayList, boolean z) {
        this.f5842a = arrayList;
        this.b = z;
    }

    @Override // a.rkb0
    public final String c() {
        return "LINE";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcb0)) {
            return false;
        }
        dcb0 dcb0Var = (dcb0) obj;
        return this.f5842a.equals(dcb0Var.f5842a) && this.b == dcb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + twn.g(this.f5842a, 72439436, 31);
    }

    public final String toString() {
        return "PopularGamesLineUiItem(id=LINE, games=" + this.f5842a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}
