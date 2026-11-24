package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vkb0 implements xkb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37565a;
    public final egd b;
    public final egd c;

    public vkb0(ArrayList arrayList, egd egdVar, egd egdVar2) {
        this.f37565a = arrayList;
        this.b = egdVar;
        this.c = egdVar2;
    }

    @Override // a.xkb0
    public final skb0 b() {
        return skb0.ShowSports;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkb0)) {
            return false;
        }
        vkb0 vkb0Var = (vkb0) obj;
        return this.f37565a.equals(vkb0Var.f37565a) && Intrinsics.d(this.b, vkb0Var.b) && Intrinsics.d(this.c, vkb0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f37565a.hashCode() * 31;
        egd egdVar = this.b;
        int iHashCode2 = (iHashCode + (egdVar == null ? 0 : egdVar.hashCode())) * 31;
        egd egdVar2 = this.c;
        return iHashCode2 + (egdVar2 != null ? egdVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSports(coords=" + this.f37565a + ", btnAll=" + this.b + ", btnFilter=" + this.c + Separators.RPAREN;
    }
}
