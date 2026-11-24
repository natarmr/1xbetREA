package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xm7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41109a;
    public final long b;
    public final String c;

    public xm7(long j, String str, ArrayList arrayList) {
        this.f41109a = arrayList;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm7)) {
            return false;
        }
        xm7 xm7Var = (xm7) obj;
        return this.f41109a.equals(xm7Var.f41109a) && this.b == xm7Var.b && Intrinsics.d(this.c, xm7Var.c);
    }

    public final int hashCode() {
        int iB = rw2.b(this.f41109a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetSubGameModel(betGroups=");
        sb.append(this.f41109a);
        sb.append(", subGameId=");
        sb.append(this.b);
        return rw2.o(sb, ", subGameName=", this.c, Separators.RPAREN);
    }
}
