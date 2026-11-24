package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cia implements dia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4401a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public cia(List list, List list2, boolean z, boolean z2) {
        list.getClass();
        list2.getClass();
        this.f4401a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cia)) {
            return false;
        }
        cia ciaVar = (cia) obj;
        return Intrinsics.d(this.f4401a, ciaVar.f4401a) && Intrinsics.d(this.b, ciaVar.b) && this.c == ciaVar.c && this.d == ciaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(dw9.a(this.f4401a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", ruLng=", Separators.RPAREN, w6x.t("TeamDefenders(firstTeamDef=", ", secondTeamDef=", this.f4401a, ", animate=", this.b), this.c, this.d);
    }
}
