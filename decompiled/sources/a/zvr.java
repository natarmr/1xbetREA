package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zvr implements ewr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45071a;
    public final List b;
    public final String c;

    public zvr(List list, String str, String str2) {
        str.getClass();
        list.getClass();
        this.f45071a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvr)) {
            return false;
        }
        zvr zvrVar = (zvr) obj;
        return Intrinsics.d(this.f45071a, zvrVar.f45071a) && Intrinsics.d(this.b, zvrVar.b) && this.c.equals(zvrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f45071a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(defpackage.c.f("FirstTeam(teamName=", this.f45071a, ", teamCards=", this.b, ", teamCombination="), this.c, Separators.RPAREN);
    }
}
