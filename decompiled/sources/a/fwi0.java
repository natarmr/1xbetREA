package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fwi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10262a;

    public fwi0(boolean z) {
        this.f10262a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwi0) && this.f10262a == ((fwi0) obj).f10262a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10262a);
    }

    public final String toString() {
        return defpackage.c.d("SettingBlockPayload(isChecked=", Separators.RPAREN, this.f10262a);
    }
}
