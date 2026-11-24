package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ewh implements hwh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zvh f8525a;
    public final boolean b;
    public final a4x c;
    public final a4x d;
    public final long e;
    public final int f;

    public ewh(zvh zvhVar, boolean z, a4x a4xVar, a4x a4xVar2, long j, int i) {
        a4xVar2.getClass();
        this.f8525a = zvhVar;
        this.b = z;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = j;
        this.f = i;
    }

    @Override // a.hwh
    public final boolean a() {
        return this.b;
    }

    @Override // a.hwh
    public final zvh b() {
        return this.f8525a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewh)) {
            return false;
        }
        ewh ewhVar = (ewh) obj;
        return this.f8525a.equals(ewhVar.f8525a) && this.b == ewhVar.b && this.c.equals(ewhVar.c) && Intrinsics.d(this.d, ewhVar.d) && this.e == ewhVar.e && this.f == ewhVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + rw2.b(cs0.b(this.d, cs0.b(this.c, brm0.e(this.f8525a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(cyclingPlayerStatisticsHeaderUiModel=");
        sb.append(this.f8525a);
        sb.append(", headerIsLoaded=");
        sb.append(this.b);
        sb.append(", chipsList=");
        hne.y(sb, this.c, ", pagerData=", this.d, ", checkedChipsPosition=");
        ua80.v(sb, this.e, ", pageCount=", this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
