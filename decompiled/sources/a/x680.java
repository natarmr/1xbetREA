package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x680 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40350a;
    public final String b;
    public final buy c;

    public x680(String str, String str2, buy buyVar) {
        str.getClass();
        str2.getClass();
        this.f40350a = str;
        this.b = str2;
        this.c = buyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x680)) {
            return false;
        }
        x680 x680Var = (x680) obj;
        return Intrinsics.d(this.f40350a, x680Var.f40350a) && Intrinsics.d(this.b, x680Var.b) && this.c.equals(x680Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f40350a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OptionalLabelItemUiModel(id=", this.f40350a, ", label=", this.b, ", content=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
