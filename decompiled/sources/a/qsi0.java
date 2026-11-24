package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class qsi0 {
    public static final msi0 Companion = new msi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29260a;

    public /* synthetic */ qsi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f29260a = list;
        } else {
            m2x.I(i, 1, isi0.f15306a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qsi0) && Intrinsics.d(this.f29260a, ((qsi0) obj).f29260a);
    }

    public final int hashCode() {
        return this.f29260a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f29260a, "SetSelfExcludeLimitsRequest(limits=", Separators.RPAREN);
    }

    public qsi0(List list) {
        list.getClass();
        this.f29260a = list;
    }
}
