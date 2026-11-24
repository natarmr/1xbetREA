package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class teh {
    public static final seh Companion = new seh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ydh f33820a;

    static {
        xdh xdhVar = ydh.Companion;
    }

    public /* synthetic */ teh(int i, ydh ydhVar) {
        if ((i & 1) == 0) {
            this.f33820a = null;
        } else {
            this.f33820a = ydhVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof teh) && Intrinsics.d(this.f33820a, ((teh) obj).f33820a);
    }

    public final int hashCode() {
        ydh ydhVar = this.f33820a;
        if (ydhVar == null) {
            return 0;
        }
        return ydhVar.hashCode();
    }

    public final String toString() {
        return "CyberStageTableInfoResponse(internalTable=" + this.f33820a + Separators.RPAREN;
    }
}
