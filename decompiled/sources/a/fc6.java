package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class fc6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9295a;
    public final ArrayList b;

    public fc6(String str, ArrayList arrayList) {
        this.f9295a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc6)) {
            return false;
        }
        fc6 fc6Var = (fc6) obj;
        return this.f9295a.equals(fc6Var.f9295a) && this.b.equals(fc6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9295a.hashCode() * 31);
    }

    public final String toString() {
        return "BestHeroTeamModel(teamName=" + this.f9295a + ", players=" + this.b + Separators.RPAREN;
    }
}
