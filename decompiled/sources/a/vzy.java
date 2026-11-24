package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f38320a;
    public final a4x b;
    public final boolean c;

    public vzy(mdm mdmVar, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f38320a = mdmVar;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzy)) {
            return false;
        }
        vzy vzyVar = (vzy) obj;
        return Intrinsics.d(this.f38320a, vzyVar.f38320a) && Intrinsics.d(this.b, vzyVar.b) && this.c == vzyVar.c;
    }

    public final int hashCode() {
        mdm mdmVar = this.f38320a;
        return Boolean.hashCode(this.c) + cs0.b(this.b, (mdmVar == null ? 0 : mdmVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastGamePlayerUiState(dsEmptyConfig=");
        sb.append(this.f38320a);
        sb.append(", gamesResultList=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
