package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vab extends zab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37077a;

    public vab(List list) {
        this.f37077a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vab) && this.f37077a.equals(((vab) obj).f37077a);
    }

    public final int hashCode() {
        return this.f37077a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f37077a, "Content(games=", Separators.RPAREN);
    }
}
