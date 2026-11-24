package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class bc5 implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentScreen f2336a;

    public bc5(FragmentScreen fragmentScreen) {
        this.f2336a = fragmentScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc5) && this.f2336a.equals(((bc5) obj).f2336a);
    }

    public final int hashCode() {
        return this.f2336a.hashCode();
    }

    public final String toString() {
        return "BackToOrOpen(screen=" + this.f2336a + Separators.RPAREN;
    }
}
