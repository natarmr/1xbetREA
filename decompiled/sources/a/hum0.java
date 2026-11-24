package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class hum0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f13689a;
    public final ydr b;
    public final ydr c;
    public final xdr d;

    public hum0(Function1 function1, ydr ydrVar, ydr ydrVar2, xdr xdrVar) {
        this.f13689a = function1;
        this.b = ydrVar;
        this.c = ydrVar2;
        this.d = xdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hum0)) {
            return false;
        }
        hum0 hum0Var = (hum0) obj;
        return this.f13689a.equals(hum0Var.f13689a) && this.b.equals(hum0Var.b) && this.c.equals(hum0Var.c) && this.d.equals(hum0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13689a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StyleMapping(rowFactory=" + this.f13689a + ", marketGroupWithHeaderAndLabelFactory=" + this.b + ", marketGroupWithHeaderFactory=" + this.c + ", marketGroupWithoutHeaderFactory=" + this.d + Separators.RPAREN;
    }
}
