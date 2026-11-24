package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e1w implements i1w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvw f7057a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public e1w(jvw jvwVar, String str, boolean z, boolean z2) {
        jvwVar.getClass();
        str.getClass();
        this.f7057a = jvwVar;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1w)) {
            return false;
        }
        e1w e1wVar = (e1w) obj;
        return Intrinsics.d(this.f7057a, e1wVar.f7057a) && Intrinsics.d(this.b, e1wVar.b) && this.c == e1wVar.c && this.d == e1wVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f7057a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryCouponStatusDialogUiModel(historyCouponStatusModel=");
        sb.append(this.f7057a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isChecked=");
        return ohs0.p(", isSeparator=", Separators.RPAREN, sb, this.c, this.d);
    }
}
