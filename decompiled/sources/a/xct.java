package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class xct implements zct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9a0 f40664a;
    public final ArrayList b;

    public xct(d9a0 d9a0Var, ArrayList arrayList) {
        this.f40664a = d9a0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xct)) {
            return false;
        }
        xct xctVar = (xct) obj;
        return this.f40664a.equals(xctVar.f40664a) && this.b.equals(xctVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40664a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowTeamSelectorDialog(player=" + this.f40664a + ", teamValuesIds=" + this.b + Separators.RPAREN;
    }
}
