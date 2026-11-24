package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wb40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f38859a;

    public wb40(Map map) {
        this.f38859a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb40) && this.f38859a.equals(((wb40) obj).f38859a);
    }

    public final int hashCode() {
        return this.f38859a.hashCode();
    }

    public final String toString() {
        return "MetaHeroesModel(positions=" + this.f38859a + Separators.RPAREN;
    }
}
