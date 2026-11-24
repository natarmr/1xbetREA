package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wog0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39496a;
    public final List b;
    public final List c;
    public final opg0 d;

    public wog0(List list, List list2, List list3, opg0 opg0Var) {
        b1j.B(list, list2, list3);
        this.f39496a = list;
        this.b = list2;
        this.c = list3;
        this.d = opg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wog0)) {
            return false;
        }
        wog0 wog0Var = (wog0) obj;
        return Intrinsics.d(this.f39496a, wog0Var.f39496a) && Intrinsics.d(this.b, wog0Var.b) && Intrinsics.d(this.c, wog0Var.c) && this.d == wog0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(dw9.a(this.f39496a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("RussianLottoModel(firstPlayerParams=", ", secondPlayerParams=", this.f39496a, ", numsPlayed=", this.b);
        sbT.append(this.c);
        sbT.append(", winType=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
