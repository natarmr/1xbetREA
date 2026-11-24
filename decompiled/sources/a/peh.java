package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class peh {
    public static final oeh Companion = new oeh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26852a;
    public final leh b;

    static {
        keh kehVar = leh.Companion;
    }

    public /* synthetic */ peh(int i, String str, leh lehVar) {
        if ((i & 1) == 0) {
            this.f26852a = null;
        } else {
            this.f26852a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = lehVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof peh)) {
            return false;
        }
        peh pehVar = (peh) obj;
        return Intrinsics.d(this.f26852a, pehVar.f26852a) && Intrinsics.d(this.b, pehVar.b);
    }

    public final int hashCode() {
        String str = this.f26852a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        leh lehVar = this.b;
        return iHashCode + (lehVar != null ? lehVar.hashCode() : 0);
    }

    public final String toString() {
        return "CyberStageTableGroupResponse(title=" + this.f26852a + ", table=" + this.b + Separators.RPAREN;
    }
}
