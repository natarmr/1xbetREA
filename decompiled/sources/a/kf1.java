package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kf1 implements nf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18177a;

    public kf1(String str) {
        str.getClass();
        this.f18177a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf1) && Intrinsics.d(this.f18177a, ((kf1) obj).f18177a);
    }

    public final int hashCode() {
        return this.f18177a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(link=", this.f18177a, Separators.RPAREN);
    }
}
