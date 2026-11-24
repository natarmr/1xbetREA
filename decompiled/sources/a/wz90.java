package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class wz90 {
    public static final vz90 Companion = new vz90();
    public static final a8z[] b = {maz.a(wez.f39042a, new wm90(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40014a;

    public /* synthetic */ wz90(int i, List list) {
        if ((i & 1) == 0) {
            this.f40014a = null;
        } else {
            this.f40014a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wz90) && Intrinsics.d(this.f40014a, ((wz90) obj).f40014a);
    }

    public final int hashCode() {
        List list = this.f40014a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f40014a, "PlayerCareerInfoResponse(tabsList=", Separators.RPAREN);
    }
}
