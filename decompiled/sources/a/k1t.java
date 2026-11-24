package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k1t implements n1t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17544a;

    public k1t(boolean z) {
        this.f17544a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1t) && this.f17544a == ((k1t) obj).f17544a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17544a);
    }

    public final String toString() {
        return defpackage.c.d("Error(isControlPanelVisible=", Separators.RPAREN, this.f17544a);
    }
}
