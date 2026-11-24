package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class wbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f38875a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof wbf) {
            return this.f38875a.equals(((wbf) obj).f38875a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38875a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f38875a + Separators.RPAREN;
    }
}
