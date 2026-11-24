package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class usb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36203a;
    public final Long b;

    public usb0(String str, Long l) {
        this.f36203a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usb0)) {
            return false;
        }
        usb0 usb0Var = (usb0) obj;
        return this.f36203a.equals(usb0Var.f36203a) && this.b.equals(usb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36203a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.f36203a + ", value=" + this.b + Separators.RPAREN;
    }
}
