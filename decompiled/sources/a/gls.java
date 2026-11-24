package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class gls {
    public static final fls Companion = new fls();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11509a;
    public final a3h b;
    public final Integer c;
    public final d3h d;

    public /* synthetic */ gls(int i, Integer num, a3h a3hVar, Integer num2, d3h d3hVar) {
        if ((i & 1) == 0) {
            this.f11509a = null;
        } else {
            this.f11509a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = a3hVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d3hVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gls)) {
            return false;
        }
        gls glsVar = (gls) obj;
        return Intrinsics.d(this.f11509a, glsVar.f11509a) && this.b == glsVar.b && Intrinsics.d(this.c, glsVar.c) && this.d == glsVar.d;
    }

    public final int hashCode() {
        Integer num = this.f11509a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        a3h a3hVar = this.b;
        int iHashCode2 = (iHashCode + (a3hVar == null ? 0 : a3hVar.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        d3h d3hVar = this.d;
        return iHashCode3 + (d3hVar != null ? d3hVar.hashCode() : 0);
    }

    public final String toString() {
        return "GameLogItemResponse(minute=" + this.f11509a + ", number=" + this.b + ", side=" + this.c + ", eventType=" + this.d + Separators.RPAREN;
    }
}
