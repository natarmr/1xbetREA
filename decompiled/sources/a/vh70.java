package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vh70 extends zh70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37415a;

    public vh70(boolean z) {
        this.f37415a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vh70) && this.f37415a == ((vh70) obj).f37415a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37415a);
    }

    public final String toString() {
        return defpackage.c.d("ShowBetMenu(show=", Separators.RPAREN, this.f37415a);
    }
}
