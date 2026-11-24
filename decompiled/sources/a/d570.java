package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d570 extends g570 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5491a;

    public d570(List list) {
        this.f5491a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d570) && this.f5491a.equals(((d570) obj).f5491a);
    }

    public final int hashCode() {
        return this.f5491a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f5491a, "Content(gameItemsWithCategoryList=", Separators.RPAREN);
    }
}
