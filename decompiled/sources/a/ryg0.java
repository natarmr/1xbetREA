package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ryg0 implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentScreen f31313a;
    public final String b;

    public ryg0(FragmentScreen fragmentScreen, String str) {
        str.getClass();
        this.f31313a = fragmentScreen;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryg0)) {
            return false;
        }
        ryg0 ryg0Var = (ryg0) obj;
        return this.f31313a.equals(ryg0Var.f31313a) && Intrinsics.d(this.b, ryg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31313a.hashCode() * 31);
    }

    public final String toString() {
        return "SaveState(screen=" + this.f31313a + ", tabRootScreenKey=" + this.b + Separators.RPAREN;
    }
}
