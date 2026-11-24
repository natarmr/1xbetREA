package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class q030 implements h130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f27876a;

    public q030(LinkedHashMap linkedHashMap) {
        this.f27876a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q030) && this.f27876a.equals(((q030) obj).f27876a);
    }

    public final int hashCode() {
        return this.f27876a.hashCode();
    }

    public final String toString() {
        return "UpdateCategoryEvents(events=" + this.f27876a + Separators.RPAREN;
    }
}
