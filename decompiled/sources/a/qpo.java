package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qpo implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29130a;
    public final String b;
    public final a4x c;
    public final npo d;
    public final chl0 e;

    public qpo(long j, String str, a4x a4xVar, npo npoVar, chl0 chl0Var) {
        str.getClass();
        a4xVar.getClass();
        this.f29130a = j;
        this.b = str;
        this.c = a4xVar;
        this.d = npoVar;
        this.e = chl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpo)) {
            return false;
        }
        qpo qpoVar = (qpo) obj;
        return this.f29130a == qpoVar.f29130a && Intrinsics.d(this.b, qpoVar.b) && Intrinsics.d(this.c, qpoVar.c) && this.d == qpoVar.d && this.e.equals(qpoVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cs0.b(this.c, ua80.b(Long.hashCode(this.f29130a) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f29130a, "ExpressEventUiItem(id=", ", eventTitle=", this.b);
        sbO.append(", sportUiModelList=");
        sbO.append(this.c);
        sbO.append(", style=");
        sbO.append(this.d);
        sbO.append(", marketUiModel=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
