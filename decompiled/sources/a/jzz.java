package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17437a;
    public final LinkedHashMap b;

    public jzz(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f17437a = linkedHashMap;
        this.b = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzz)) {
            return false;
        }
        jzz jzzVar = (jzz) obj;
        return this.f17437a.equals(jzzVar.f17437a) && this.b.equals(jzzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17437a.hashCode() * 31);
    }

    public final String toString() {
        return "LimitsModel(moneyLimitModels=" + this.f17437a + ", timeLimitModels=" + this.b + Separators.RPAREN;
    }
}
