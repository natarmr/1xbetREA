package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13925a;
    public final LinkedHashMap b;

    public hzz(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f13925a = linkedHashMap;
        this.b = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzz)) {
            return false;
        }
        hzz hzzVar = (hzz) obj;
        return this.f13925a.equals(hzzVar.f13925a) && this.b.equals(hzzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13925a.hashCode() * 31);
    }

    public final String toString() {
        return "LimitsModel(moneyLimitModels=" + this.f13925a + ", timeLimitModels=" + this.b + Separators.RPAREN;
    }
}
