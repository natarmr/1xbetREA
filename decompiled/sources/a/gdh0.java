package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gdh0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11104a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;

    public gdh0(List list, List list2, String str, String str2, String str3, List list3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f11104a = list;
        this.b = list2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = list3;
        this.g = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdh0)) {
            return false;
        }
        gdh0 gdh0Var = (gdh0) obj;
        return Intrinsics.d(this.f11104a, gdh0Var.f11104a) && Intrinsics.d(this.b, gdh0Var.b) && this.c.equals(gdh0Var.c) && this.d.equals(gdh0Var.d) && this.e.equals(gdh0Var.e) && Intrinsics.d(this.f, gdh0Var.f) && Intrinsics.d(this.g, gdh0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a(ua80.b(ua80.b(ua80.b(dw9.a(this.f11104a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("SeaBattleModel(playerOneSeaBattleShipModelList=", ", playerTwoSeaBattleShipModelList=", this.f11104a, ", playerOneScore=", this.b);
        f140.v(sbT, this.c, ", playerTwoScore=", this.d, ", playerTurn=");
        cs0.y(this.e, ", playerOneShotCoordinatesModelList=", ", playerTwoShotCoordinatesModelList=", sbT, this.f);
        return dw9.r(sbT, this.g, Separators.RPAREN);
    }
}
