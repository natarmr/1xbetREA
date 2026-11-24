package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dyl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6899a;
    public final String b;
    public final lho c;
    public final mim0 d;
    public final kbo e;
    public final List f;
    public final List g;

    public dyl0(long j, String str, lho lhoVar, mim0 mim0Var, kbo kboVar, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f6899a = j;
        this.b = str;
        this.c = lhoVar;
        this.d = mim0Var;
        this.e = kboVar;
        this.f = list;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyl0)) {
            return false;
        }
        dyl0 dyl0Var = (dyl0) obj;
        return this.f6899a == dyl0Var.f6899a && this.b.equals(dyl0Var.b) && this.c == dyl0Var.c && this.d.equals(dyl0Var.d) && this.e.equals(dyl0Var.e) && Intrinsics.d(this.f, dyl0Var.f) && Intrinsics.d(this.g, dyl0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ua80.b(Long.hashCode(this.f6899a) * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f6899a, "StageBottomSheetItemUiModel(feedGameId=", ", gameId=", this.b);
        sbO.append(", statusType=");
        sbO.append(this.c);
        sbO.append(", card=");
        sbO.append(this.d);
        sbO.append(", model=");
        sbO.append(this.e);
        sbO.append(", subTeams1=");
        sbO.append(this.f);
        return ohs0.s(sbO, ", subTeams2=", this.g, Separators.RPAREN);
    }
}
