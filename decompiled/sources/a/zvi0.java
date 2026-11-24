package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zvi0 implements gwi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45059a;

    public zvi0(String str) {
        str.getClass();
        this.f45059a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zvi0) && Intrinsics.d(this.f45059a, ((zvi0) obj).f45059a);
    }

    public final int hashCode() {
        return this.f45059a.hashCode();
    }

    public final String toString() {
        return kng0.l("SettingHeaderTop(description=", this.f45059a, Separators.RPAREN);
    }
}
