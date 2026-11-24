package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class cdf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4160a;
    public final ArrayList b;

    public cdf(String str, ArrayList arrayList) {
        this.f4160a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdf)) {
            return false;
        }
        cdf cdfVar = (cdf) obj;
        return this.f4160a.equals(cdfVar.f4160a) && this.b.equals(cdfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4160a.hashCode() * 31);
    }

    public final String toString() {
        return "CricketBallsUiModel(players=" + this.f4160a + ", balls=" + this.b + Separators.RPAREN;
    }
}
