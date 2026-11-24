package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zsh0 implements bth0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44905a;

    public final boolean equals(Object obj) {
        if (obj instanceof zsh0) {
            return this.f44905a == ((zsh0) obj).f44905a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44905a);
    }

    public final String toString() {
        return defpackage.c.d("Enabled(value=", Separators.RPAREN, this.f44905a);
    }
}
