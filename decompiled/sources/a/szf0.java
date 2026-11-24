package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class szf0 implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentScreen f33069a;
    public final String b;

    public szf0(FragmentScreen fragmentScreen, String str) {
        str.getClass();
        this.f33069a = fragmentScreen;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szf0)) {
            return false;
        }
        szf0 szf0Var = (szf0) obj;
        return this.f33069a.equals(szf0Var.f33069a) && Intrinsics.d(this.b, szf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33069a.hashCode() * 31);
    }

    public final String toString() {
        return "RestoreState(screen=" + this.f33069a + ", tabRootScreenKey=" + this.b + Separators.RPAREN;
    }
}
