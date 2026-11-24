package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class vh4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37412a;

    public vh4(boolean z) {
        this.f37412a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vh4) && this.f37412a == ((vh4) obj).f37412a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37412a);
    }

    public final String toString() {
        return defpackage.c.d("OnAuthPickerVisibleChange(isVisible=", Separators.RPAREN, this.f37412a);
    }
}
