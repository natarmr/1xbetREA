package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vbh implements xbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37140a;
    public final tbh b;
    public final a4x c;
    public final boolean d;

    public vbh(String str, tbh tbhVar, a4x a4xVar, boolean z) {
        str.getClass();
        a4xVar.getClass();
        this.f37140a = str;
        this.b = tbhVar;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbh)) {
            return false;
        }
        vbh vbhVar = (vbh) obj;
        return Intrinsics.d(this.f37140a, vbhVar.f37140a) && this.b == vbhVar.b && Intrinsics.d(this.c, vbhVar.c) && this.d == vbhVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, (this.b.hashCode() + (this.f37140a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(message=");
        sb.append(this.f37140a);
        sb.append(", loadingState=");
        sb.append(this.b);
        sb.append(", games=");
        return rz4.m(sb, this.c, ", supportRtl=", this.d, Separators.RPAREN);
    }
}
