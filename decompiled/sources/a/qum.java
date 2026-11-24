package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qum implements rum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vum f29352a;
    public final vum b;
    public final a2m c;
    public final String d;
    public final String e;
    public final mum f;
    public final boolean g;

    public qum(vum vumVar, vum vumVar2, a2m a2mVar, String str, String str2, mum mumVar, boolean z) {
        str.getClass();
        str2.getClass();
        this.f29352a = vumVar;
        this.b = vumVar2;
        this.c = a2mVar;
        this.d = str;
        this.e = str2;
        this.f = mumVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qum)) {
            return false;
        }
        qum qumVar = (qum) obj;
        return this.f29352a.equals(qumVar.f29352a) && this.b.equals(qumVar.b) && this.c.equals(qumVar.c) && Intrinsics.d(this.d, qumVar.d) && Intrinsics.d(this.e, qumVar.e) && this.f.equals(qumVar.f) && this.g == qumVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ua80.b(ua80.b(rz4.a(this.c, (this.b.hashCode() + (this.f29352a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V4(firstOpponentModel=");
        sb.append(this.f29352a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", infoLabel=");
        sb.append(this.d);
        sb.append(", tagLive=");
        sb.append(this.e);
        sb.append(", options=");
        sb.append(this.f);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
