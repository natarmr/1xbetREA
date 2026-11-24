package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class apg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1250a;
    public final int b;
    public final List c;

    public apg(int i, int i2, List list) {
        list.getClass();
        this.f1250a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apg)) {
            return false;
        }
        apg apgVar = (apg) obj;
        return this.f1250a == apgVar.f1250a && this.b == apgVar.b && Intrinsics.d(this.c, apgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, twn.a(R.color.static_black_60, Integer.hashCode(this.f1250a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CyberGameMapsUiModel(activeColorView=", this.f1250a, ", notActiveColorView=", ", score=", R.color.static_black_60);
        sbT.append(this.b);
        sbT.append(", fillView=");
        sbT.append(this.c);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
