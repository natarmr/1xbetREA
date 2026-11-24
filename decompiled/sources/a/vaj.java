package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vaj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37090a;
    public final List b;
    public final List c;
    public final w3t d;
    public final boolean e;
    public final boolean f;

    public vaj(boolean z, List list, List list2, w3t w3tVar, boolean z2, boolean z3) {
        list.getClass();
        list2.getClass();
        this.f37090a = z;
        this.b = list;
        this.c = list2;
        this.d = w3tVar;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaj)) {
            return false;
        }
        vaj vajVar = (vaj) obj;
        return this.f37090a == vajVar.f37090a && Intrinsics.d(this.b, vajVar.b) && Intrinsics.d(this.c, vajVar.c) && this.d.equals(vajVar.d) && this.e == vajVar.e && this.f == vajVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e((this.d.hashCode() + dw9.a(dw9.a(Boolean.hashCode(this.f37090a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataContentMapperState(loading=");
        sb.append(this.f37090a);
        sb.append(", bonuses=");
        sb.append(this.b);
        sb.append(", craftingBonuses=");
        sb.append(this.c);
        sb.append(", sourceScreen=");
        sb.append(this.d);
        sb.append(", bonusGameAllowed=");
        return ohs0.p(", hasGamesWildFreebet=", Separators.RPAREN, sb, this.e, this.f);
    }
}
