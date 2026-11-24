package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class f1w0 implements g1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentScreen f8787a;

    public f1w0(FragmentScreen fragmentScreen) {
        this.f8787a = fragmentScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1w0) && this.f8787a.equals(((f1w0) obj).f8787a);
    }

    public final int hashCode() {
        return this.f8787a.hashCode();
    }

    public final String toString() {
        return "StartChildChain(screen=" + this.f8787a + Separators.RPAREN;
    }
}
