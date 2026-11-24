package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zud implements evd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45005a;

    public zud(String str) {
        str.getClass();
        this.f45005a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zud) && Intrinsics.d(this.f45005a, ((zud) obj).f45005a);
    }

    public final int hashCode() {
        return this.f45005a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowLimitErrorDialog(message=", this.f45005a, Separators.RPAREN);
    }
}
