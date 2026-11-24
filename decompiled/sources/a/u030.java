package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class u030 implements h130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f34835a;

    public u030(LinkedHashMap linkedHashMap) {
        this.f34835a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u030) && this.f34835a.equals(((u030) obj).f34835a);
    }

    public final int hashCode() {
        return this.f34835a.hashCode();
    }

    public final String toString() {
        return "UpdateInsightsNames(insightsNames=" + this.f34835a + Separators.RPAREN;
    }
}
