package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ayl implements dyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1673a;
    public final o0x b;
    public final float c;
    public final Integer d;
    public final Boolean e;

    public ayl(String str, o0x o0xVar, float f, Integer num, Boolean bool) {
        str.getClass();
        this.f1673a = str;
        this.b = o0xVar;
        this.c = f;
        this.d = num;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayl)) {
            return false;
        }
        ayl aylVar = (ayl) obj;
        return Intrinsics.d(this.f1673a, aylVar.f1673a) && Intrinsics.d(this.b, aylVar.b) && ycl.b(this.c, aylVar.c) && Intrinsics.d(this.d, aylVar.d) && Intrinsics.d(this.e, aylVar.e);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(w6x.d(this.b, this.f1673a.hashCode() * 31, 31), this.c, 31);
        Integer num = this.d;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String strC = ycl.c(this.c);
        StringBuilder sb = new StringBuilder("LabelWithLeftIcon(label=");
        sb.append(this.f1673a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", iconRadius=");
        axq.x(this.d, strC, ", placeholder=", ", tintEnable=", sb);
        return defpackage.c.e(sb, this.e, Separators.RPAREN);
    }

    public ayl(String str, o0x o0xVar, Boolean bool, int i) {
        this(str, o0xVar, 0.0f, null, (i & 16) != 0 ? Boolean.TRUE : bool);
    }
}
