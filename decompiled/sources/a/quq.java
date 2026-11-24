package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class quq implements ruq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f29357a;
    public final j9m0 b;
    public final boolean c;
    public final kpm d;
    public final List e;

    public quq(zdm0 zdm0Var, j9m0 j9m0Var, boolean z, kpm kpmVar, List list) {
        list.getClass();
        this.f29357a = zdm0Var;
        this.b = j9m0Var;
        this.c = z;
        this.d = kpmVar;
        this.e = list;
    }

    @Override // a.ruq
    public final boolean a() {
        return this.c;
    }

    @Override // a.ruq
    public final j9m0 d() {
        return this.b;
    }

    @Override // a.ruq
    public final zdm0 e() {
        return this.f29357a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quq)) {
            return false;
        }
        quq quqVar = (quq) obj;
        return this.f29357a.equals(quqVar.f29357a) && this.b.equals(quqVar.b) && this.c == quqVar.c && this.d.equals(quqVar.d) && Intrinsics.d(this.e, quqVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.c(this.d, brm0.e(w6x.h(this.b, this.f29357a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(headerUiModel=");
        sb.append(this.f29357a);
        sb.append(", backgroundUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        sb.append(this.c);
        sb.append(", forecastScore=");
        sb.append(this.d);
        sb.append(", forecastFacts=");
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
