package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eeh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7674a;
    public final List b;

    public eeh(int i, List list) {
        list.getClass();
        this.f7674a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eeh)) {
            return false;
        }
        eeh eehVar = (eeh) obj;
        return this.f7674a == eehVar.f7674a && Intrinsics.d(this.b, eehVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f7674a) * 31);
    }

    public final String toString() {
        return "CyberStageTableBodyModel(id=" + this.f7674a + ", valueColumn=" + this.b + Separators.RPAREN;
    }
}
