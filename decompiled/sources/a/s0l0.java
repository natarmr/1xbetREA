package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s0l0 implements v0l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31414a;

    public final boolean equals(Object obj) {
        if (obj instanceof s0l0) {
            return this.f31414a == ((s0l0) obj).f31414a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31414a);
    }

    public final String toString() {
        return defpackage.c.d("OnTextFieldFocusChanged(focus=", Separators.RPAREN, this.f31414a);
    }
}
