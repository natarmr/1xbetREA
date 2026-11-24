package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nk3 implements ok3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23663a;
    public final List b;
    public final pl3 c;

    public nk3(String str, List list, pl3 pl3Var) {
        str.getClass();
        list.getClass();
        this.f23663a = str;
        this.b = list;
        this.c = pl3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk3)) {
            return false;
        }
        nk3 nk3Var = (nk3) obj;
        return Intrinsics.d(this.f23663a, nk3Var.f23663a) && Intrinsics.d(this.b, nk3Var.b) && this.c.equals(nk3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f23663a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("FloatingButtonsScreenStyle(description=", this.f23663a, ", dropDownCardList=", this.b, ", appUpdateDownloadUiModel=");
        sbF.append(this.c);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
