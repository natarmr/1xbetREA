package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class axa0 {
    public static final zwa0 Companion = new zwa0();
    public static final a8z[] c = {maz.a(wez.f39042a, new npa0(7)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1615a;
    public final Long b;

    public /* synthetic */ axa0(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f1615a = null;
        } else {
            this.f1615a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axa0)) {
            return false;
        }
        axa0 axa0Var = (axa0) obj;
        return Intrinsics.d(this.f1615a, axa0Var.f1615a) && Intrinsics.d(this.b, axa0Var.b);
    }

    public final int hashCode() {
        List list = this.f1615a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "PopUpExtensionResponse(checkList=" + this.f1615a + ", timerUtc=" + this.b + Separators.RPAREN;
    }
}
