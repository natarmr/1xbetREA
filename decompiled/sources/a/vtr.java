package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vtr implements cur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38021a;

    public final boolean equals(Object obj) {
        if (obj instanceof vtr) {
            return this.f38021a == ((vtr) obj).f38021a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38021a);
    }

    public final String toString() {
        return defpackage.c.d("NotificationVisible(value=", Separators.RPAREN, this.f38021a);
    }
}
