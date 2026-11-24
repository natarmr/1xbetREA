package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38547a;
    public final z4m b;
    public final a5m c;

    public w4m(a4x a4xVar, z4m z4mVar, a5m a5mVar) {
        a4xVar.getClass();
        this.f38547a = a4xVar;
        this.b = z4mVar;
        this.c = a5mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4m)) {
            return false;
        }
        w4m w4mVar = (w4m) obj;
        return Intrinsics.d(this.f38547a, w4mVar.f38547a) && this.b.equals(w4mVar.b) && this.c == w4mVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f38547a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DsCyberGameChartValueUiModel(items=" + this.f38547a + ", xFormatType=" + this.b + ", yFormatType=" + this.c + Separators.RPAREN;
    }
}
