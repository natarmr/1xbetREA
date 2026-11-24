package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yso0 implements ato0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43179a;

    public yso0(String str) {
        str.getClass();
        this.f43179a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yso0) && Intrinsics.d(this.f43179a, ((yso0) obj).f43179a);
    }

    public final int hashCode() {
        return this.f43179a.hashCode();
    }

    public final String toString() {
        return kng0.l("TakeAllTypeBet(title=", this.f43179a, Separators.RPAREN);
    }
}
