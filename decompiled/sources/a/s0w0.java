package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class s0w0 implements g1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentScreen f31429a;

    public s0w0(FragmentScreen fragmentScreen) {
        this.f31429a = fragmentScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0w0) && this.f31429a.equals(((s0w0) obj).f31429a);
    }

    public final int hashCode() {
        return this.f31429a.hashCode();
    }

    public final String toString() {
        return "BackToOrNavigate(screen=" + this.f31429a + Separators.RPAREN;
    }
}
