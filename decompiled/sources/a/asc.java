package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class asc implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentScreen f1384a;
    public final String b;

    public asc(FragmentScreen fragmentScreen, String str) {
        str.getClass();
        this.f1384a = fragmentScreen;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asc)) {
            return false;
        }
        asc ascVar = (asc) obj;
        return this.f1384a.equals(ascVar.f1384a) && Intrinsics.d(this.b, ascVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1384a.hashCode() * 31);
    }

    public final String toString() {
        return "ClearState(screen=" + this.f1384a + ", tabRootScreenKey=" + this.b + Separators.RPAREN;
    }
}
