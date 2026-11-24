package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pn0 implements un0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27262a;

    public pn0(List list) {
        this.f27262a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pn0) && this.f27262a.equals(((pn0) obj).f27262a);
    }

    public final int hashCode() {
        return this.f27262a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f27262a, "Empty(categories=", Separators.RPAREN);
    }
}
