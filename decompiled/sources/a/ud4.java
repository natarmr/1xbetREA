package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ud4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35462a;

    public ud4(boolean z) {
        this.f35462a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud4) && this.f35462a == ((ud4) obj).f35462a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35462a);
    }

    public final String toString() {
        return defpackage.c.d("OnAuthPickerVisibleChange(isVisible=", Separators.RPAREN, this.f35462a);
    }
}
