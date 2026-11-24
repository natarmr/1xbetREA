package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yf2 implements gg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42521a;

    public /* synthetic */ yf2(List list) {
        this.f42521a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yf2) {
            return this.f42521a.equals(((yf2) obj).f42521a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42521a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f42521a, "OnDeleteGamesGroups(items=", Separators.RPAREN);
    }
}
