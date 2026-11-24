package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hqb0 implements iqg {
    public static final gqb0 Companion = new gqb0();
    public static final a8z[] b = {maz.a(wez.f39042a, new npa0(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13477a;

    public /* synthetic */ hqb0(int i, List list) {
        if ((i & 1) == 0) {
            this.f13477a = null;
        } else {
            this.f13477a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqb0) && Intrinsics.d(this.f13477a, ((hqb0) obj).f13477a);
    }

    public final int hashCode() {
        List list = this.f13477a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f13477a, "PowerOfPowerResponse(heroTable=", Separators.RPAREN);
    }

    public hqb0() {
        this.f13477a = null;
    }
}
