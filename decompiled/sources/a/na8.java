package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class na8 implements qa8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23177a;

    public final boolean equals(Object obj) {
        if (obj instanceof na8) {
            return this.f23177a.equals(((na8) obj).f23177a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23177a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f23177a, "BlockEvents(value=", Separators.RPAREN);
    }
}
