package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class me50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentScreen f21628a;

    public me50(FragmentScreen fragmentScreen) {
        this.f21628a = fragmentScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me50) && this.f21628a.equals(((me50) obj).f21628a);
    }

    public final int hashCode() {
        return this.f21628a.hashCode();
    }

    public final String toString() {
        return "StartChildChain(screen=" + this.f21628a + Separators.RPAREN;
    }
}
