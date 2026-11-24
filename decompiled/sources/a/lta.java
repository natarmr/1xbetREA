package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class lta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f20623a;
    public final ArrayList b;

    public lta(udl0 udl0Var, ArrayList arrayList) {
        this.f20623a = udl0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lta)) {
            return false;
        }
        lta ltaVar = (lta) obj;
        return this.f20623a == ltaVar.f20623a && this.b.equals(ltaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20623a.hashCode() * 31);
    }

    public final String toString() {
        return "CardsInfoOrderModel(sportGameType=" + this.f20623a + ", order=" + this.b + Separators.RPAREN;
    }
}
