package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class rsi0 {
    public static final nsi0 Companion = new nsi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31032a;

    public /* synthetic */ rsi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f31032a = list;
        } else {
            m2x.I(i, 1, jsi0.f17054a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsi0) && Intrinsics.d(this.f31032a, ((rsi0) obj).f31032a);
    }

    public final int hashCode() {
        return this.f31032a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f31032a, "SetSelfExcludeLimitsRequest(limits=", Separators.RPAREN);
    }

    public rsi0(List list) {
        list.getClass();
        this.f31032a = list;
    }
}
