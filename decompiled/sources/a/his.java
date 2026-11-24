package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class his implements sis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13130a;

    public final boolean equals(Object obj) {
        if (obj instanceof his) {
            return this.f13130a == ((his) obj).f13130a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13130a);
    }

    public final String toString() {
        return defpackage.c.d("BackClick(isSystemBack=", Separators.RPAREN, this.f13130a);
    }
}
