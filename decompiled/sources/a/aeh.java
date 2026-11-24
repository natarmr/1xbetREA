package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class aeh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f728a;
    public final int b;
    public final List c;
    public final String d;

    public aeh(int i, int i2, String str, List list) {
        list.getClass();
        this.f728a = i;
        this.b = i2;
        this.c = list;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeh)) {
            return false;
        }
        aeh aehVar = (aeh) obj;
        return this.f728a == aehVar.f728a && this.b == aehVar.b && Intrinsics.d(this.c, aehVar.c) && this.d.equals(aehVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(twn.a(this.b, Integer.hashCode(this.f728a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CyberStageTableBodyColumnModel(id=", this.f728a, ", contentType=", ", value=", this.b);
        sbT.append(this.c);
        sbT.append(", teamId=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
