package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ome0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25500a;
    public final String b;
    public final String c;
    public final bre d;
    public final String e;

    public ome0(String str, String str2, String str3, bre breVar, String str4) {
        breVar.getClass();
        this.f25500a = str;
        this.b = str2;
        this.c = str3;
        this.d = breVar;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ome0)) {
            return false;
        }
        ome0 ome0Var = (ome0) obj;
        return this.f25500a.equals(ome0Var.f25500a) && this.b.equals(ome0Var.b) && this.c.equals(ome0Var.c) && Intrinsics.d(this.d, ome0Var.d) && this.e.equals(ome0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(this.f25500a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RefereesListItemUiModel(id=", this.f25500a, ", name=", this.b, ", shortName=");
        sbN.append(this.c);
        sbN.append(", country=");
        sbN.append(this.d);
        sbN.append(", image=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
