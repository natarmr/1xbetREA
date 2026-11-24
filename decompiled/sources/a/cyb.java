package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class cyb {
    public static final byb Companion = new byb();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cxb f5165a;
    public final List b;

    static {
        l640 l640Var = n640.Companion;
        c = new a8z[]{null, maz.a(wez.f39042a, new zxb((byte) 0))};
    }

    public /* synthetic */ cyb(int i, cxb cxbVar, List list) {
        if ((i & 1) == 0) {
            this.f5165a = null;
        } else {
            this.f5165a = cxbVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyb)) {
            return false;
        }
        cyb cybVar = (cyb) obj;
        return Intrinsics.d(this.f5165a, cybVar.f5165a) && Intrinsics.d(this.b, cybVar.b);
    }

    public final int hashCode() {
        cxb cxbVar = this.f5165a;
        int iHashCode = (cxbVar == null ? 0 : cxbVar.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ChatResponse(chat=" + this.f5165a + ", users=" + this.b + Separators.RPAREN;
    }
}
