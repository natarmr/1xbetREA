package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class bip implements dip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2667a;

    public bip(List list) {
        this.f2667a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bip) && this.f2667a.equals(((bip) obj).f2667a);
    }

    public final int hashCode() {
        return this.f2667a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f2667a, "Success(content=", Separators.RPAREN);
    }
}
