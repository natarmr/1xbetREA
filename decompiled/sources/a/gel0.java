package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class gel0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final del0 f11161a;

    public gel0(del0 del0Var) {
        this.f11161a = del0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gel0) && this.f11161a.equals(((gel0) obj).f11161a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.sport_new) + (this.f11161a.hashCode() * 31);
    }

    public final String toString() {
        return "SportIconUiModel(sportIconUrl=" + this.f11161a + ", placeholder=" + R.drawable.sport_new + Separators.RPAREN;
    }
}
