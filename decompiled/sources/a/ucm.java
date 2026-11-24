package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ucm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35437a;
    public final qcm b;
    public final String c;
    public final tcm d;
    public final boolean e;

    public ucm(long j, qcm qcmVar, String str, tcm tcmVar, boolean z) {
        str.getClass();
        this.f35437a = j;
        this.b = qcmVar;
        this.c = str;
        this.d = tcmVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucm)) {
            return false;
        }
        ucm ucmVar = (ucm) obj;
        return this.f35437a == ucmVar.f35437a && this.b.equals(ucmVar.b) && Intrinsics.d(this.c, ucmVar.c) && this.d.equals(ucmVar.d) && this.e == ucmVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ua80.b((this.b.hashCode() + (Long.hashCode(this.f35437a) * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCyberTransferCardTeamUiModel(id=");
        sb.append(this.f35437a);
        sb.append(", cardImage=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", tag=");
        sb.append(this.d);
        return f140.n(sb, ", hasStat=", this.e, Separators.RPAREN);
    }
}
