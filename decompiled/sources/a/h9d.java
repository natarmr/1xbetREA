package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h9d implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12669a;
    public final String b;
    public final j9d c;
    public final k9d d;

    public h9d(String str, String str2, j9d j9dVar, k9d k9dVar) {
        str.getClass();
        str2.getClass();
        this.f12669a = str;
        this.b = str2;
        this.c = j9dVar;
        this.d = k9dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9d)) {
            return false;
        }
        h9d h9dVar = (h9d) obj;
        return Intrinsics.d(this.f12669a, h9dVar.f12669a) && Intrinsics.d(this.b, h9dVar.b) && this.c.equals(h9dVar.c) && this.d.equals(h9dVar.d);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return h9d.class;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f12669a.hashCode() * 31, 31, this.b), 31, this.c.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CommonCyberTopPlayerHeaderUiModel(firstLeftColumnTitle=", this.f12669a, ", secondLeftColumnTitle=", this.b, ", firstRightColumnTitle=");
        sbN.append(this.c);
        sbN.append(", secondRightColumnTitle=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
