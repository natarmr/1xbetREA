package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vxf implements wxf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38196a;

    public vxf(String str) {
        str.getClass();
        this.f38196a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxf) && Intrinsics.d(this.f38196a, ((vxf) obj).f38196a);
    }

    public final int hashCode() {
        return this.f38196a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecurityLevelDisable(title=", this.f38196a, Separators.RPAREN);
    }
}
