package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cyl implements dyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f5182a;
    public final m0x b;
    public final Integer c;

    public cyl(o0x o0xVar, m0x m0xVar, Integer num) {
        this.f5182a = o0xVar;
        this.b = m0xVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyl)) {
            return false;
        }
        cyl cylVar = (cyl) obj;
        if (!this.f5182a.equals(cylVar.f5182a) || !this.b.equals(cylVar.b) || !ycl.b(0.0f, 0.0f) || !ycl.b(0.0f, 0.0f) || !this.c.equals(cylVar.c)) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && obj2.equals(obj2);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + defpackage.c.a(defpackage.c.a(cs0.a(this.b, this.f5182a.hashCode() * 31, 31), 0.0f, 31), 0.0f, 31)) * 961;
        Boolean bool = Boolean.FALSE;
        return bool.hashCode() + ((bool.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        String strC = ycl.c(0.0f);
        String strC2 = ycl.c(0.0f);
        Boolean bool = Boolean.FALSE;
        StringBuilder sb = new StringBuilder("TwoIcons(leftIcon=");
        sb.append(this.f5182a);
        sb.append(", rightIcon=");
        sb.append(this.b);
        sb.append(", leftIconRadius=");
        f140.v(sb, strC, ", rigthIconRadius=", strC2, ", leftIconPlaceholder=");
        brm0.z(bool, this.c, ", rightIconPlaceholder=null, leftIconTintEnable=", ", rightIconTintEnable=", sb);
        return defpackage.c.e(sb, bool, Separators.RPAREN);
    }
}
