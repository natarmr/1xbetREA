package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pyp f29545a;
    public final gxp b;
    public final String c;

    public qyp(pyp pypVar, gxp gxpVar, String str) {
        pypVar.getClass();
        str.getClass();
        this.f29545a = pypVar;
        this.b = gxpVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyp)) {
            return false;
        }
        qyp qypVar = (qyp) obj;
        return Intrinsics.d(this.f29545a, qypVar.f29545a) && Intrinsics.d(this.b, qypVar.b) && Intrinsics.d(this.c, qypVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f29545a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FighterUiState(toolbarState=");
        sb.append(this.f29545a);
        sb.append(", contentState=");
        sb.append(this.b);
        sb.append(", backgroundImage=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }

    public /* synthetic */ qyp(gxp gxpVar, String str) {
        this(oyp.f26067a, gxpVar, str);
    }
}
