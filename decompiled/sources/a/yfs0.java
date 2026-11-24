package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yfs0 implements lvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42555a;
    public final String b;
    public final f3w c;
    public final f3w d;

    public yfs0(String str, String str2, f3w f3wVar, f3w f3wVar2) {
        str.getClass();
        str2.getClass();
        this.f42555a = str;
        this.b = str2;
        this.c = f3wVar;
        this.d = f3wVar2;
    }

    @Override // a.lvw
    public final String a() {
        return this.f42555a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfs0)) {
            return false;
        }
        yfs0 yfs0Var = (yfs0) obj;
        return Intrinsics.d(this.f42555a, yfs0Var.f42555a) && Intrinsics.d(this.b, yfs0Var.b) && this.c.equals(yfs0Var.c) && this.d.equals(yfs0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f42555a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TransactionItemUiModel(itemKey=", this.f42555a, ", date=", this.b, ", payoutSumItem=");
        sbN.append(this.c);
        sbN.append(", downgradeSumItem=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
