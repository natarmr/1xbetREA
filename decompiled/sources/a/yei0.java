package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class yei0 implements dfi0 {
    public static final xei0 Companion = new xei0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42488a;
    public final wei0 b;

    public /* synthetic */ yei0(int i, String str, wei0 wei0Var) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, tei0.f33823a.getDescriptor());
            throw null;
        }
        this.f42488a = str;
        this.b = wei0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yei0)) {
            return false;
        }
        yei0 yei0Var = (yei0) obj;
        return Intrinsics.d(this.f42488a, yei0Var.f42488a) && Intrinsics.d(this.b, yei0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f42488a.hashCode() * 31;
        wei0 wei0Var = this.b;
        return iHashCode + (wei0Var == null ? 0 : wei0Var.hashCode());
    }

    public final String toString() {
        return "TextMessageRequest(text=" + this.f42488a + ", command=" + this.b + Separators.RPAREN;
    }

    public yei0(String str, wei0 wei0Var) {
        str.getClass();
        this.f42488a = str;
        this.b = wei0Var;
    }
}
