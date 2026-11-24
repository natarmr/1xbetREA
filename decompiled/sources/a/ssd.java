package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ssd {
    public static final rsd Companion = new rsd();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new yld(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mcy f32720a;
    public final mcy b;
    public final List c;

    public /* synthetic */ ssd(int i, mcy mcyVar, mcy mcyVar2, List list) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, qsd.f29252a.getDescriptor());
            throw null;
        }
        this.f32720a = mcyVar;
        this.b = mcyVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssd)) {
            return false;
        }
        ssd ssdVar = (ssd) obj;
        return Intrinsics.d(this.f32720a, ssdVar.f32720a) && Intrinsics.d(this.b, ssdVar.b) && Intrinsics.d(this.c, ssdVar.c);
    }

    public final int hashCode() {
        mcy mcyVar = this.f32720a;
        int iHashCode = (mcyVar == null ? 0 : mcyVar.hashCode()) * 31;
        mcy mcyVar2 = this.b;
        int iHashCode2 = (iHashCode + (mcyVar2 == null ? 0 : mcyVar2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigValueDiffModel(sourceValue=");
        sb.append(this.f32720a);
        sb.append(", changedValue=");
        sb.append(this.b);
        sb.append(", possibleValues=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }

    public ssd(mcy mcyVar, mcy mcyVar2, List list) {
        this.f32720a = mcyVar;
        this.b = mcyVar2;
        this.c = list;
    }
}
