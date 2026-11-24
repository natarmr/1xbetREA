package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kxe0 implements zxe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19051a;

    public kxe0(String str) {
        str.getClass();
        this.f19051a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxe0) && Intrinsics.d(this.f19051a, ((kxe0) obj).f19051a);
    }

    public final int hashCode() {
        return this.f19051a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(url=", this.f19051a, Separators.RPAREN);
    }
}
