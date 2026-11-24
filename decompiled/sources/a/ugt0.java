package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ugt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f35642a;
    public final a4x b;
    public final boolean c;

    public ugt0(mdm mdmVar, i4 i4Var, boolean z) {
        i4Var.getClass();
        this.f35642a = mdmVar;
        this.b = i4Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugt0)) {
            return false;
        }
        ugt0 ugt0Var = (ugt0) obj;
        return Intrinsics.d(this.f35642a, ugt0Var.f35642a) && Intrinsics.d(this.b, ugt0Var.b) && this.c == ugt0Var.c;
    }

    public final int hashCode() {
        mdm mdmVar = this.f35642a;
        return Boolean.hashCode(this.c) + cs0.b(this.b, (mdmVar == null ? 0 : mdmVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpcomingEventsUiState(error=");
        sb.append(this.f35642a);
        sb.append(", upcomingEventsList=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
