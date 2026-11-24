package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qg implements tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28659a;

    public final boolean equals(Object obj) {
        if (obj instanceof qg) {
            return this.f28659a == ((qg) obj).f28659a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28659a);
    }

    public final String toString() {
        return defpackage.c.d("Checked(value=", Separators.RPAREN, this.f28659a);
    }
}
