package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c89 implements f89 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3902a;

    public c89(boolean z) {
        this.f3902a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c89) && this.f3902a == ((c89) obj).f3902a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3902a);
    }

    public final String toString() {
        return defpackage.c.d("Error(isControlPanelVisible=", Separators.RPAREN, this.f3902a);
    }
}
