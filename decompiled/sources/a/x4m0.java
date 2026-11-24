package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class x4m0 implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentScreen f40273a;

    public x4m0(FragmentScreen fragmentScreen) {
        this.f40273a = fragmentScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4m0) && this.f40273a.equals(((x4m0) obj).f40273a);
    }

    public final int hashCode() {
        return this.f40273a.hashCode();
    }

    public final String toString() {
        return "StartChildChain(screen=" + this.f40273a + Separators.RPAREN;
    }
}
