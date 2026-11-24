package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class y830 implements z830 {
    public static final x830 Companion = new x830();
    public static final a8z[] b = {maz.a(wez.f39042a, new n230(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42177a;

    public /* synthetic */ y830(int i, List list) {
        if ((i & 1) == 0) {
            this.f42177a = null;
        } else {
            this.f42177a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y830) && Intrinsics.d(this.f42177a, ((y830) obj).f42177a);
    }

    public final int hashCode() {
        List list = this.f42177a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f42177a, "ParagraphContent(content=", Separators.RPAREN);
    }
}
