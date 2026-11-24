package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class yix {
    public static final xix Companion = new xix();
    public static final a8z[] b = {maz.a(wez.f39042a, new qgx(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42718a;

    public /* synthetic */ yix(int i, List list) {
        if (1 == (i & 1)) {
            this.f42718a = list;
        } else {
            m2x.I(i, 1, wix.f39239a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yix) && Intrinsics.d(this.f42718a, ((yix) obj).f42718a);
    }

    public final int hashCode() {
        return this.f42718a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f42718a, "InstalledAppsRequest(apps=", Separators.RPAREN);
    }

    public yix(List list) {
        list.getClass();
        this.f42718a = list;
    }
}
