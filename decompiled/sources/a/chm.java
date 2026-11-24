package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class chm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f4367a;
    public final int b;
    public final String c;

    public chm(m0x m0xVar, int i, String str) {
        str.getClass();
        this.f4367a = m0xVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chm)) {
            return false;
        }
        chm chmVar = (chm) obj;
        return this.f4367a.equals(chmVar.f4367a) && this.b == chmVar.b && Intrinsics.d(this.c, chmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f4367a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsFavoriteWidgetsButtonUiModel(image=");
        sb.append(this.f4367a);
        sb.append(", counter=");
        sb.append(this.b);
        sb.append(", title=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
