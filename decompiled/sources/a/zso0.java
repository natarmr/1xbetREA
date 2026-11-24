package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zso0 implements ato0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44915a;

    public zso0(String str) {
        str.getClass();
        this.f44915a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zso0) && Intrinsics.d(this.f44915a, ((zso0) obj).f44915a);
    }

    public final int hashCode() {
        return this.f44915a.hashCode();
    }

    public final String toString() {
        return kng0.l("TakeAllTypeGame(title=", this.f44915a, Separators.RPAREN);
    }
}
