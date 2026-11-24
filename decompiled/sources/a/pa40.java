package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pa40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f26637a;
    public final String b;
    public final String c;
    public final int d;

    public pa40(n0x n0xVar, String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.f26637a = n0xVar;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa40)) {
            return false;
        }
        pa40 pa40Var = (pa40) obj;
        return this.f26637a.equals(pa40Var.f26637a) && Intrinsics.d(this.b, pa40Var.b) && Intrinsics.d(this.c, pa40Var.c) && this.d == pa40Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b(ua80.b(this.f26637a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetaEventCardOpponentUiModel(iconUrl=");
        sb.append(this.f26637a);
        sb.append(", coef=");
        sb.append(this.b);
        sb.append(", score=");
        return brm0.j(this.d, this.c, ", winCount=", Separators.RPAREN, sb);
    }
}
