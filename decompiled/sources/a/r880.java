package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r880 implements w880 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30013a;

    public r880(List list) {
        this.f30013a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r880) && this.f30013a.equals(((r880) obj).f30013a);
    }

    public final int hashCode() {
        return this.f30013a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f30013a, "ShowCallThemesSelectorDialog(themes=", Separators.RPAREN);
    }
}
