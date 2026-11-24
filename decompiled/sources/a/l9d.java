package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l9d implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19645a;
    public final String b;
    public final String c;
    public final String d;
    public final j9d e;
    public final k9d f;
    public final String g;

    public l9d(boolean z, String str, String str2, String str3, j9d j9dVar, k9d k9dVar) {
        brm0.B(str, str2, str3);
        this.f19645a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j9dVar;
        this.f = k9dVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9d)) {
            return false;
        }
        l9d l9dVar = (l9d) obj;
        return this.f19645a == l9dVar.f19645a && Intrinsics.d(this.b, l9dVar.b) && Intrinsics.d(this.c, l9dVar.c) && Intrinsics.d(this.d, l9dVar.d) && this.e.equals(l9dVar.e) && this.f.equals(l9dVar.f);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.g;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(Boolean.hashCode(this.f19645a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e.b);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("CommonCyberTopPlayerUiModel(isLastItem=", ", playerIndexNumber=", this.b, this.f19645a, ", playerIconUrl=");
        f140.v(sbQ, this.c, ", playerName=", this.d, ", rightFirstValue=");
        sbQ.append(this.e);
        sbQ.append(", rightSecondValue=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
