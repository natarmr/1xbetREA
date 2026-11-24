package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s780 implements x780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31738a;

    public s780(List list) {
        this.f31738a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s780) && this.f31738a.equals(((s780) obj).f31738a);
    }

    public final int hashCode() {
        return this.f31738a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f31738a, "ShowCallBackThemesSelectorDialog(themes=", Separators.RPAREN);
    }
}
