package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class f51 {
    public static final e51 Companion = new e51();
    public static final a8z[] b = {maz.a(wez.f39042a, new c51(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8937a;

    public /* synthetic */ f51(int i, List list) {
        if ((i & 1) == 0) {
            this.f8937a = null;
        } else {
            this.f8937a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f51) && Intrinsics.d(this.f8937a, ((f51) obj).f8937a);
    }

    public final int hashCode() {
        List list = this.f8937a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f8937a, "AggregatorLayoutConfigurationResponse(contentBlocks=", Separators.RPAREN);
    }
}
