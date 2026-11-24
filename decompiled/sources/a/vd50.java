package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class vd50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentScreen f37216a;

    public vd50(FragmentScreen fragmentScreen) {
        this.f37216a = fragmentScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd50) && this.f37216a.equals(((vd50) obj).f37216a);
    }

    public final int hashCode() {
        return this.f37216a.hashCode();
    }

    public final String toString() {
        return "BackToOrNavigate(screen=" + this.f37216a + Separators.RPAREN;
    }
}
