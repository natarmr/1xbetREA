package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ueh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35527a;
    public final List b;
    public final qeh c;

    public ueh(int i, List list, qeh qehVar) {
        list.getClass();
        this.f35527a = i;
        this.b = list;
        this.c = qehVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueh)) {
            return false;
        }
        ueh uehVar = (ueh) obj;
        return this.f35527a == uehVar.f35527a && Intrinsics.d(this.b, uehVar.b) && this.c.equals(uehVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(Integer.hashCode(this.f35527a) * 31, 31, this.b);
    }

    public final String toString() {
        return "CyberStageTableModel(sportId=" + this.f35527a + ", teams=" + this.b + ", responseInfo=" + this.c + Separators.RPAREN;
    }
}
