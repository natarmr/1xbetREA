package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class lsd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20574a;
    public final ArrayList b;

    public lsd0(String str, ArrayList arrayList) {
        this.f20574a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsd0)) {
            return false;
        }
        lsd0 lsd0Var = (lsd0) obj;
        return this.f20574a.equals(lsd0Var.f20574a) && this.b.equals(lsd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20574a.hashCode() * 31);
    }

    public final String toString() {
        return "RaceStatisticModel(raceTitle=" + this.f20574a + ", playersStatistic=" + this.b + Separators.RPAREN;
    }
}
