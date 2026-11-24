package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gf1 implements nf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11183a;

    public gf1(String str) {
        str.getClass();
        this.f11183a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf1) && Intrinsics.d(this.f11183a, ((gf1) obj).f11183a);
    }

    public final int hashCode() {
        return this.f11183a.hashCode();
    }

    public final String toString() {
        return kng0.l("CheckAndOpenTelegram(link=", this.f11183a, Separators.RPAREN);
    }
}
