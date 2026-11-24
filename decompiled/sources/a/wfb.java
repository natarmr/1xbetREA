package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class wfb {
    public static final vfb Companion = new vfb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f39062a;
    public final rfb b;

    static {
        qfb qfbVar = rfb.Companion;
    }

    public /* synthetic */ wfb(int i, Long l, rfb rfbVar) {
        if ((i & 1) == 0) {
            this.f39062a = null;
        } else {
            this.f39062a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = rfbVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfb)) {
            return false;
        }
        wfb wfbVar = (wfb) obj;
        return Intrinsics.d(this.f39062a, wfbVar.f39062a) && Intrinsics.d(this.b, wfbVar.b);
    }

    public final int hashCode() {
        Long l = this.f39062a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        rfb rfbVar = this.b;
        return iHashCode + (rfbVar != null ? rfbVar.hashCode() : 0);
    }

    public final String toString() {
        return "ChampStatisticResponse(sportId=" + this.f39062a + ", response=" + this.b + Separators.RPAREN;
    }
}
