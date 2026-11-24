package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q2m implements t2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28006a;
    public final y3d b;
    public final y3d c;

    public q2m(String str, y3d y3dVar, y3d y3dVar2) {
        str.getClass();
        this.f28006a = str;
        this.b = y3dVar;
        this.c = y3dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2m)) {
            return false;
        }
        q2m q2mVar = (q2m) obj;
        return Intrinsics.d(this.f28006a, q2mVar.f28006a) && this.b.equals(q2mVar.b) && this.c.equals(q2mVar.c);
    }

    @Override // a.t2m
    public final String getId() {
        return "BADGE_LABEL_ID";
    }

    public final int hashCode() {
        int iB = ua80.b(1271635102, 31, this.f28006a);
        long j = this.b.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c.f41946a) + rw2.b(iB, 961, j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Label(id=BADGE_LABEL_ID, label=");
        sb.append(this.f28006a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", labelColor=null, borderColor=");
        return hne.p(sb, this.c, Separators.RPAREN);
    }
}
