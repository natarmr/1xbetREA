package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class byl implements dyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3425a;
    public final m0x b;
    public final Integer c;
    public final Boolean d;

    public byl(String str, m0x m0xVar, Integer num, Boolean bool, int i) {
        num = (i & 8) != 0 ? null : num;
        bool = (i & 16) != 0 ? Boolean.TRUE : bool;
        str.getClass();
        this.f3425a = str;
        this.b = m0xVar;
        this.c = num;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byl)) {
            return false;
        }
        byl bylVar = (byl) obj;
        return Intrinsics.d(this.f3425a, bylVar.f3425a) && this.b.equals(bylVar.b) && ycl.b(0.0f, 0.0f) && Intrinsics.d(this.c, bylVar.c) && Intrinsics.d(this.d, bylVar.d);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(cs0.a(this.b, this.f3425a.hashCode() * 31, 31), 0.0f, 31);
        Integer num = this.c;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String strC = ycl.c(0.0f);
        StringBuilder sb = new StringBuilder("LabelWithRightIcon(label=");
        sb.append(this.f3425a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", iconRadius=");
        axq.x(this.c, strC, ", placeholder=", ", tintEnable=", sb);
        return defpackage.c.e(sb, this.d, Separators.RPAREN);
    }
}
