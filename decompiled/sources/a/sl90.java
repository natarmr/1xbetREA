package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sl90 implements ul90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32388a;

    public final boolean equals(Object obj) {
        if (obj instanceof sl90) {
            return this.f32388a.equals(((sl90) obj).f32388a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32388a.hashCode();
    }

    public final String toString() {
        return kng0.l("PhoneCode(value=", this.f32388a, Separators.RPAREN);
    }
}
