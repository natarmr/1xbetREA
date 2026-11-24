package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ge20 implements he20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f11130a;
    public final hxu b;
    public final String c;
    public final ArrayList d;

    static {
        hxu hxuVar = hxu.h;
    }

    public ge20(ank0 ank0Var, hxu hxuVar, String str, ArrayList arrayList) {
        hxuVar.getClass();
        str.getClass();
        this.f11130a = ank0Var;
        this.b = hxuVar;
        this.c = str;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge20)) {
            return false;
        }
        ge20 ge20Var = (ge20) obj;
        return this.f11130a.equals(ge20Var.f11130a) && Intrinsics.d(this.b, ge20Var.b) && Intrinsics.d(this.c, ge20Var.c) && this.d.equals(ge20Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f11130a.f1159a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Value(headerValue=" + this.f11130a + ", taxModel=" + this.b + ", currencySymbol=" + this.c + ", taxItemUiModels=" + this.d + Separators.RPAREN;
    }
}
