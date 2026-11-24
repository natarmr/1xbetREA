package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class lr6 implements nr6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9a0 f20514a;
    public final ArrayList b;

    public lr6(d9a0 d9a0Var, ArrayList arrayList) {
        this.f20514a = d9a0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr6)) {
            return false;
        }
        lr6 lr6Var = (lr6) obj;
        return this.f20514a.equals(lr6Var.f20514a) && this.b.equals(lr6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20514a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowTeamSelectorDialog(player=" + this.f20514a + ", teamValuesIds=" + this.b + Separators.RPAREN;
    }
}
