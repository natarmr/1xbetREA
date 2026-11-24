package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a2w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144a;
    public final List b;
    public final List c;
    public final boolean d;
    public final v1w e;

    public a2w(String str, List list, List list2, boolean z, v1w v1wVar) {
        list.getClass();
        list2.getClass();
        this.f144a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = v1wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2w)) {
            return false;
        }
        a2w a2wVar = (a2w) obj;
        return this.f144a.equals(a2wVar.f144a) && Intrinsics.d(this.b, a2wVar.b) && Intrinsics.d(this.c, a2wVar.c) && this.d == a2wVar.d && this.e == a2wVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(dw9.a(dw9.a(this.f144a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("TeamUnit(name=", this.f144a, ", images=", this.b, ", teamIds=");
        rz4.z(sbF, ", homeAway=", this.c, ", homeAwayFlag=", this.d);
        sbF.append(this.e);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
