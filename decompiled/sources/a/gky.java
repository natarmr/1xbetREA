package a;

import android.gov.nist.core.Separators;
import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f11467a;

    public final boolean equals(Object obj) {
        if (obj instanceof gky) {
            return Intrinsics.d(this.f11467a, ((gky) obj).f11467a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11467a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f11467a + Separators.RPAREN;
    }
}
