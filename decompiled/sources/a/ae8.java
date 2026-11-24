package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ae8 {
    public static final zd8 Companion = new zd8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yd8 f715a;

    public /* synthetic */ ae8(int i, yd8 yd8Var) {
        if ((i & 1) == 0) {
            this.f715a = null;
        } else {
            this.f715a = yd8Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae8) && Intrinsics.d(this.f715a, ((ae8) obj).f715a);
    }

    public final int hashCode() {
        yd8 yd8Var = this.f715a;
        if (yd8Var == null) {
            return 0;
        }
        return yd8Var.hashCode();
    }

    public final String toString() {
        return "BonusCountResponse(data=" + this.f715a + Separators.RPAREN;
    }
}
