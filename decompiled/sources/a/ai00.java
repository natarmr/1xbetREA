package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ai00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f901a;
    public final String b;
    public final boolean c;
    public final List d;
    public final int e;

    public ai00(int i, long j, String str, List list, boolean z) {
        str.getClass();
        list.getClass();
        this.f901a = j;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai00)) {
            return false;
        }
        ai00 ai00Var = (ai00) obj;
        return this.f901a == ai00Var.f901a && Intrinsics.d(this.b, ai00Var.b) && this.c == ai00Var.c && Intrinsics.d(this.d, ai00Var.d) && this.e == ai00Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + dw9.a(brm0.e(ua80.b(Long.hashCode(this.f901a) * 31, 961, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f901a, "LiveExpressBetGroupMapUiModel(id=", ", groupName=", this.b);
        esw0.l(sbO, ", subGameName=, subGameVisible=", this.c, ", coefButtonList=", this.d);
        return vqd.p(sbO, ", columnCount=", this.e, Separators.RPAREN);
    }
}
