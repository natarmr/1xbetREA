package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class km60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18524a;

    public km60(boolean z) {
        this.f18524a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof km60) && this.f18524a == ((km60) obj).f18524a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18524a);
    }

    public final String toString() {
        return defpackage.c.d("OneXGameBgConfig(nyEnabled=", Separators.RPAREN, this.f18524a);
    }
}
