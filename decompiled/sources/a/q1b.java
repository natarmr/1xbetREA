package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1b f27944a;
    public final o1b b;
    public final o1b c;
    public final p1b d;

    /* JADX WARN: Illegal instructions before constructor call */
    public q1b() {
        a570.Companion.getClass();
        a570 a570VarA = t470.a(false, -1L);
        iun iunVar = iun.f15405a;
        this(null, null, null, new p1b(new jza(a570VarA, iunVar, 0.0d, "", 0.0d, iunVar, 0.0d, 0.0d, 0.0d, 0.0d, 0L), "", false, "", "", true));
    }

    public static q1b a(q1b q1bVar, o1b o1bVar, o1b o1bVar2, o1b o1bVar3, p1b p1bVar, int i) {
        if ((i & 1) != 0) {
            o1bVar = q1bVar.f27944a;
        }
        if ((i & 2) != 0) {
            o1bVar2 = q1bVar.b;
        }
        if ((i & 4) != 0) {
            o1bVar3 = q1bVar.c;
        }
        if ((i & 8) != 0) {
            p1bVar = q1bVar.d;
        }
        q1bVar.getClass();
        p1bVar.getClass();
        return new q1b(o1bVar, o1bVar2, o1bVar3, p1bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1b)) {
            return false;
        }
        q1b q1bVar = (q1b) obj;
        return Intrinsics.d(this.f27944a, q1bVar.f27944a) && Intrinsics.d(this.b, q1bVar.b) && Intrinsics.d(this.c, q1bVar.c) && Intrinsics.d(this.d, q1bVar.d);
    }

    public final int hashCode() {
        o1b o1bVar = this.f27944a;
        int iHashCode = (o1bVar == null ? 0 : o1bVar.hashCode()) * 31;
        o1b o1bVar2 = this.b;
        int iHashCode2 = (iHashCode + (o1bVar2 == null ? 0 : o1bVar2.hashCode())) * 31;
        o1b o1bVar3 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (o1bVar3 != null ? o1bVar3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CashbackViewState(userFirstGame=" + this.f27944a + ", userSecondGame=" + this.b + ", companyGame=" + this.c + ", progress=" + this.d + Separators.RPAREN;
    }

    public q1b(o1b o1bVar, o1b o1bVar2, o1b o1bVar3, p1b p1bVar) {
        this.f27944a = o1bVar;
        this.b = o1bVar2;
        this.c = o1bVar3;
        this.d = p1bVar;
    }
}
