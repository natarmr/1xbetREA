package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class upa extends dqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36054a;

    public upa(boolean z) {
        this.f36054a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof upa) && this.f36054a == ((upa) obj).f36054a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36054a);
    }

    public final String toString() {
        return defpackage.c.d("IsPointEnable(isPointEnable=", Separators.RPAREN, this.f36054a);
    }
}
