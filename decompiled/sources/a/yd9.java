package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yd9 implements zd9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42422a;

    public yd9(String str) {
        str.getClass();
        this.f42422a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd9) && Intrinsics.d(this.f42422a, ((yd9) obj).f42422a);
    }

    public final int hashCode() {
        return this.f42422a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowPushServiceName(name=", this.f42422a, Separators.RPAREN);
    }
}
