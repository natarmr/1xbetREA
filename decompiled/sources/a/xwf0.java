package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xwf0 {
    public static final wwf0 Companion = new wwf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41608a;

    public /* synthetic */ xwf0(int i, String str) {
        if (1 == (i & 1)) {
            this.f41608a = str;
        } else {
            m2x.I(i, 1, vwf0.f38149a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwf0) && Intrinsics.d(this.f41608a, ((xwf0) obj).f41608a);
    }

    public final int hashCode() {
        return this.f41608a.hashCode();
    }

    public final String toString() {
        return kng0.l("RestoreByPhoneRequest(phone=", this.f41608a, Separators.RPAREN);
    }

    public xwf0(String str) {
        str.getClass();
        this.f41608a = str;
    }
}
