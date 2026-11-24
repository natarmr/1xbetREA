package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class gpp0 implements wnp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11694a;
    public final ArrayList b;

    public gpp0(ArrayList arrayList, ArrayList arrayList2) {
        this.f11694a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpp0)) {
            return false;
        }
        gpp0 gpp0Var = (gpp0) obj;
        return this.f11694a.equals(gpp0Var.f11694a) && this.b.equals(gpp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11694a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamsContentUiModel(firstTeamPlayers=" + this.f11694a + ", secondTeamPlayers=" + this.b + Separators.RPAREN;
    }
}
