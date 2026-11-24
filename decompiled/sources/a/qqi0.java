package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class qqi0 {
    public static final lqi0 Companion = new lqi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29168a;

    public /* synthetic */ qqi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f29168a = list;
        } else {
            m2x.I(i, 1, gqi0.f11735a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqi0) && Intrinsics.d(this.f29168a, ((qqi0) obj).f29168a);
    }

    public final int hashCode() {
        return this.f29168a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f29168a, "SetMoneyLimitsRequest(limits=", Separators.RPAREN);
    }

    public qqi0(List list) {
        list.getClass();
        this.f29168a = list;
    }
}
