package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h74 implements k74 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12559a;

    public h74(String str) {
        str.getClass();
        this.f12559a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h74) && Intrinsics.d(this.f12559a, ((h74) obj).f12559a);
    }

    public final int hashCode() {
        return this.f12559a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSessionItemClick(appGuid=", this.f12559a, Separators.RPAREN);
    }
}
