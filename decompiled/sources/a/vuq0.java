package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vuq0 extends bvq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38062a;
    public final String b;
    public final uwx c;

    public vuq0(String str, boolean z) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f38062a = z;
        this.b = str;
        this.c = uwxVar;
    }

    @Override // a.bvq0
    public final uwx c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuq0)) {
            return false;
        }
        vuq0 vuq0Var = (vuq0) obj;
        return this.f38062a == vuq0Var.f38062a && Intrinsics.d(this.b, vuq0Var.b) && this.c == vuq0Var.c;
    }

    @Override // a.bvq0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f38062a) * 31, 31, this.b);
    }

    @Override // a.bvq0
    public final boolean i() {
        return this.f38062a;
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("CheckGeoUiModel(enable=", ", title=", this.b, this.f38062a, ", itemPosition=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
