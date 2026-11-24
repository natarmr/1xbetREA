package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class pcm0 {
    public static final ncm0 Companion = new ncm0();
    public static final a8z[] b = {maz.a(wez.f39042a, new x9m0(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26767a;

    public /* synthetic */ pcm0(int i, List list) {
        if ((i & 1) == 0) {
            this.f26767a = null;
        } else {
            this.f26767a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcm0) && Intrinsics.d(this.f26767a, ((pcm0) obj).f26767a);
    }

    public final int hashCode() {
        List list = this.f26767a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f26767a, "StatisticContentResponse(statisticByYear=", Separators.RPAREN);
    }
}
