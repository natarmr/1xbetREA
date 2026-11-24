package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a2j0 implements c2j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f127a;

    public final boolean equals(Object obj) {
        if (obj instanceof a2j0) {
            return this.f127a == ((a2j0) obj).f127a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127a);
    }

    public final String toString() {
        return defpackage.c.d("AutoMaxToggleChangeState(value=", Separators.RPAREN, this.f127a);
    }
}
