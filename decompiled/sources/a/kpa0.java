package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class kpa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18666a;

    public /* synthetic */ kpa0(int i) {
        this.f18666a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kpa0) {
            return this.f18666a == ((kpa0) obj).f18666a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18666a);
    }

    public final String toString() {
        return ua80.e(this.f18666a, "PointerKeyboardModifiers(packedValue=", Separators.RPAREN);
    }
}
