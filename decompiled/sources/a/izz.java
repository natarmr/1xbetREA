package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class izz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f15656a;
    public final LinkedHashMap b;

    public izz(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f15656a = linkedHashMap;
        this.b = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izz)) {
            return false;
        }
        izz izzVar = (izz) obj;
        return this.f15656a.equals(izzVar.f15656a) && this.b.equals(izzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15656a.hashCode() * 31);
    }

    public final String toString() {
        return "LimitsModel(moneyLimitModels=" + this.f15656a + ", timeLimitModels=" + this.b + Separators.RPAREN;
    }
}
