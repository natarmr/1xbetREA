package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class of8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25152a;
    public final ArrayList b;

    public of8(ArrayList arrayList, boolean z) {
        this.f25152a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of8)) {
            return false;
        }
        of8 of8Var = (of8) obj;
        return this.f25152a == of8Var.f25152a && this.b.equals(of8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f25152a) * 31);
    }

    public final String toString() {
        return "BonusInfoModel(showBio=" + this.f25152a + ", list=" + this.b + Separators.RPAREN;
    }
}
