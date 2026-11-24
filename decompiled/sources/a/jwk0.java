package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jwk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f17256a;
    public final List b;
    public final int c;

    public jwk0(btk0 btk0Var, List list, int i) {
        list.getClass();
        this.f17256a = btk0Var;
        this.b = list;
        this.c = i;
    }

    public static jwk0 a(jwk0 jwk0Var, btk0 btk0Var, List list, int i, int i2) {
        if ((i2 & 1) != 0) {
            btk0Var = jwk0Var.f17256a;
        }
        if ((i2 & 2) != 0) {
            list = jwk0Var.b;
        }
        if ((i2 & 4) != 0) {
            i = jwk0Var.c;
        }
        list.getClass();
        return new jwk0(btk0Var, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwk0)) {
            return false;
        }
        jwk0 jwk0Var = (jwk0) obj;
        return this.f17256a.equals(jwk0Var.f17256a) && Intrinsics.d(this.b, jwk0Var.b) && this.c == jwk0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dw9.a(this.f17256a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialEventTabWhoWinStateModel(contentStatus=");
        sb.append(this.f17256a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", selectedGroupIndex=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
