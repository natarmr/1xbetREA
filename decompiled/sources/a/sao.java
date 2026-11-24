package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31896a;
    public final tao b;
    public final int c;
    public final int d;

    public sao(List list, tao taoVar, int i, int i2) {
        list.getClass();
        this.f31896a = list;
        this.b = taoVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sao)) {
            return false;
        }
        sao saoVar = (sao) obj;
        return Intrinsics.d(this.f31896a, saoVar.f31896a) && this.b == saoVar.b && this.c == saoVar.c && this.d == saoVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, (this.b.hashCode() + (this.f31896a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MeasureParams(measureRows=");
        sb.append(this.f31896a);
        sb.append(", measureType=");
        sb.append(this.b);
        sb.append(", rowCount=");
        return w6x.o(this.c, this.d, ", headerCount=", Separators.RPAREN, sb);
    }
}
