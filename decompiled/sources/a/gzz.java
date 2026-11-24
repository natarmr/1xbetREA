package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class gzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f12206a;
    public final LinkedHashMap b;

    public gzz(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f12206a = linkedHashMap;
        this.b = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzz)) {
            return false;
        }
        gzz gzzVar = (gzz) obj;
        return this.f12206a.equals(gzzVar.f12206a) && this.b.equals(gzzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12206a.hashCode() * 31);
    }

    public final String toString() {
        return "LimitsModel(moneyLimitModels=" + this.f12206a + ", timeLimitModels=" + this.b + Separators.RPAREN;
    }
}
