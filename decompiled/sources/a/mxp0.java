package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mxp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f22569a;

    public mxp0(Map map) {
        this.f22569a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxp0) && this.f22569a.equals(((mxp0) obj).f22569a);
    }

    public final int hashCode() {
        return this.f22569a.hashCode();
    }

    public final String toString() {
        return "TennisSummariesModel(summaries=" + this.f22569a + Separators.RPAREN;
    }
}
