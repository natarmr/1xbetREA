package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fnw0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9859a;

    public fnw0(Object obj) {
        this.f9859a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fnw0) {
            return vsm0.D(this.f9859a, ((fnw0) obj).f9859a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9859a});
    }

    public final String toString() {
        return kng0.l("Suppliers.ofInstance(", this.f9859a.toString(), Separators.RPAREN);
    }
}
