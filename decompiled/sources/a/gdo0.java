package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class gdo0 {
    public static final edo0 Companion = new edo0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11113a;
    public final uko0 b;

    static {
        qko0 qko0Var = uko0.Companion;
    }

    public /* synthetic */ gdo0(int i, String str, uko0 uko0Var) {
        if ((i & 1) == 0) {
            this.f11113a = null;
        } else {
            this.f11113a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = uko0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdo0)) {
            return false;
        }
        gdo0 gdo0Var = (gdo0) obj;
        return Intrinsics.d(this.f11113a, gdo0Var.f11113a) && Intrinsics.d(this.b, gdo0Var.b);
    }

    public final int hashCode() {
        String str = this.f11113a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        uko0 uko0Var = this.b;
        return iHashCode + (uko0Var != null ? uko0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TabResponse(title=" + this.f11113a + ", table=" + this.b + Separators.RPAREN;
    }
}
