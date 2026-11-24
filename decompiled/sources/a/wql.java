package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wql implements zql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sql f39596a;
    public final o0x b;
    public final sql c;
    public final String d;

    public wql(sql sqlVar, n0x n0xVar, sql sqlVar2, String str) {
        str.getClass();
        this.f39596a = sqlVar;
        this.b = n0xVar;
        this.c = sqlVar2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wql)) {
            return false;
        }
        wql wqlVar = (wql) obj;
        return this.f39596a.equals(wqlVar.f39596a) && Intrinsics.d(this.b, wqlVar.b) && this.c.equals(wqlVar.c) && Intrinsics.d(this.d, wqlVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f39596a.hashCode() * 31;
        o0x o0xVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Active(firstModel=" + this.f39596a + ", decorationPicture=" + this.b + ", additionalModel=" + this.c + ", header=" + this.d + Separators.RPAREN;
    }
}
