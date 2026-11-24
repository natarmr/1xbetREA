package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ctu0 {
    public static final btu0 Companion = new btu0();
    public static final a8z[] b = {maz.a(wez.f39042a, new o1u0(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4961a;

    public /* synthetic */ ctu0(int i, List list) {
        if ((i & 1) == 0) {
            this.f4961a = null;
        } else {
            this.f4961a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctu0) && Intrinsics.d(this.f4961a, ((ctu0) obj).f4961a);
    }

    public final int hashCode() {
        List list = this.f4961a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f4961a, "MainSection(info=", Separators.RPAREN);
    }
}
