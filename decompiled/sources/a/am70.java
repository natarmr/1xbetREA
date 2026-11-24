package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class am70 extends im70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1097a;

    public am70(boolean z) {
        this.f1097a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am70) && this.f1097a == ((am70) obj).f1097a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1097a);
    }

    public final String toString() {
        return defpackage.c.d("ControlsClickable(enable=", Separators.RPAREN, this.f1097a);
    }
}
