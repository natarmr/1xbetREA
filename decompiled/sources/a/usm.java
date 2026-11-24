package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class usm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36218a;
    public final o0x b;
    public final String c;

    public usm(int i, o0x o0xVar, String str) {
        str.getClass();
        this.f36218a = i;
        this.b = o0xVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usm)) {
            return false;
        }
        usm usmVar = (usm) obj;
        return this.f36218a == usmVar.f36218a && this.b.equals(usmVar.b) && Intrinsics.d(this.c, usmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w6x.d(this.b, Integer.hashCode(this.f36218a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsSportCollectionUiModel(id=");
        sb.append(this.f36218a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", label=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
