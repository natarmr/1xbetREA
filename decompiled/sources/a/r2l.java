package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class r2l implements u2l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29740a;

    public final boolean equals(Object obj) {
        if (obj instanceof r2l) {
            return this.f29740a.equals(((r2l) obj).f29740a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29740a.hashCode();
    }

    public final String toString() {
        return hne.o("HeroPick(value=", Separators.RPAREN, this.f29740a);
    }
}
