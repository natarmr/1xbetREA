package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tv40 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sv40 f34582a;

    public tv40(sv40 sv40Var) {
        this.f34582a = sv40Var;
    }

    @Override // a.tj30
    public final int a(cnx cnxVar, List list, int i) {
        return this.f34582a.a(cnxVar, g8x.C(cnxVar), i);
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        return this.f34582a.b(vj30Var, g8x.C(vj30Var), j);
    }

    @Override // a.tj30
    public final int c(cnx cnxVar, List list, int i) {
        return this.f34582a.c(cnxVar, g8x.C(cnxVar), i);
    }

    @Override // a.tj30
    public final int d(cnx cnxVar, List list, int i) {
        return this.f34582a.d(cnxVar, g8x.C(cnxVar), i);
    }

    @Override // a.tj30
    public final int e(cnx cnxVar, List list, int i) {
        return this.f34582a.e(cnxVar, g8x.C(cnxVar), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv40) && Intrinsics.d(this.f34582a, ((tv40) obj).f34582a);
    }

    public final int hashCode() {
        return this.f34582a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f34582a + Separators.RPAREN;
    }
}
