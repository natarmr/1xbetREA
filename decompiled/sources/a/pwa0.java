package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pwa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27703a;
    public final long b;

    public pwa0(long j, List list) {
        this.f27703a = list;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwa0)) {
            return false;
        }
        pwa0 pwa0Var = (pwa0) obj;
        return Intrinsics.d(this.f27703a, pwa0Var.f27703a) && this.b == pwa0Var.b;
    }

    public final int hashCode() {
        List list = this.f27703a;
        return Long.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "PopUpBonusExtensionModel(checklist=" + this.f27703a + ", timerUtc=" + this.b + Separators.RPAREN;
    }
}
