package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class heq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12935a;

    public heq0(boolean z) {
        this.f12935a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof heq0) && this.f12935a == ((heq0) obj).f12935a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12935a);
    }

    public final String toString() {
        return defpackage.c.d("EnableButtons(enable=", Separators.RPAREN, this.f12935a);
    }
}
