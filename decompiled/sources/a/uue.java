package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36295a;
    public final int b;
    public final double c;
    public final ay3 d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final List k;

    public uue(int i, int i2, double d, ay3 ay3Var, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, List list) {
        list.getClass();
        this.f36295a = i;
        this.b = i2;
        this.c = d;
        this.d = ay3Var;
        this.e = z;
        this.f = str;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uue)) {
            return false;
        }
        uue uueVar = (uue) obj;
        return this.f36295a == uueVar.f36295a && this.b == uueVar.b && Double.compare(this.c, uueVar.c) == 0 && this.d.equals(uueVar.d) && this.e == uueVar.e && this.f.equals(uueVar.f) && this.g == uueVar.g && this.h == uueVar.h && this.i == uueVar.i && this.j == uueVar.j && Intrinsics.d(this.k, uueVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e((this.d.hashCode() + brm0.d(this.c, twn.a(this.b, Integer.hashCode(this.f36295a) * 31, 31), 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("BlockConfiguredModel(blockId=", this.f36295a, ", numberBlock=", ", blockBet=", this.b);
        sbT.append(this.c);
        sbT.append(", blockBetState=");
        sbT.append(this.d);
        hne.u(", canShowBlockBetSum=", ", currencySymbol=", this.f, sbT, this.e);
        w6x.A(", showLobby=", ", showBlockBet=", sbT, this.g, this.h);
        w6x.A(", showMultiSingle=", ", showBlockError=", sbT, this.i, this.j);
        return ohs0.s(sbT, ", blockEvents=", this.k, Separators.RPAREN);
    }
}
