package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class fel0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eel0 f9413a;

    public fel0(eel0 eel0Var) {
        this.f9413a = eel0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fel0) && this.f9413a.equals(((fel0) obj).f9413a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.sport_new) + (this.f9413a.hashCode() * 31);
    }

    public final String toString() {
        return "SportIconUiModel(sportIconUrl=" + this.f9413a + ", placeholder=" + R.drawable.sport_new + Separators.RPAREN;
    }
}
