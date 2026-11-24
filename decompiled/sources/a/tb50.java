package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tb50 implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentScreen f33647a;
    public final String b;

    public tb50(FragmentScreen fragmentScreen, String str) {
        str.getClass();
        this.f33647a = fragmentScreen;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb50)) {
            return false;
        }
        tb50 tb50Var = (tb50) obj;
        return this.f33647a.equals(tb50Var.f33647a) && Intrinsics.d(this.b, tb50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33647a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigateToTab(screen=" + this.f33647a + ", tabRootScreenKey=" + this.b + Separators.RPAREN;
    }
}
