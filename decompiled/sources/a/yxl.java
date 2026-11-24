package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yxl implements dyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43428a;
    public final n0x b;
    public final m0x c;
    public final Integer d;

    public yxl(String str, n0x n0xVar, m0x m0xVar, Integer num) {
        str.getClass();
        this.f43428a = str;
        this.b = n0xVar;
        this.c = m0xVar;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxl)) {
            return false;
        }
        yxl yxlVar = (yxl) obj;
        if (!Intrinsics.d(this.f43428a, yxlVar.f43428a) || !this.b.equals(yxlVar.b) || !this.c.equals(yxlVar.c) || !ycl.b(0.0f, 0.0f) || !ycl.b(0.0f, 0.0f) || !this.d.equals(yxlVar.d)) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        if (!obj2.equals(obj2)) {
            return false;
        }
        Object obj3 = Boolean.TRUE;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return Boolean.TRUE.hashCode() + ((Boolean.FALSE.hashCode() + ((this.d.hashCode() + defpackage.c.a(defpackage.c.a(cs0.a(this.c, f140.f(this.b, this.f43428a.hashCode() * 31, 31), 31), 0.0f, 31), 0.0f, 31)) * 961)) * 31);
    }

    public final String toString() {
        String strC = ycl.c(0.0f);
        String strC2 = ycl.c(0.0f);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        StringBuilder sb = new StringBuilder("LabelWithActionAndLeftIcons(label=");
        sb.append(this.f43428a);
        sb.append(", leftIcon=");
        sb.append(this.b);
        sb.append(", actionIcon=");
        sb.append(this.c);
        sb.append(", leftIconRadius=");
        sb.append(strC);
        sb.append(", actionIconRadius=");
        axq.x(this.d, strC2, ", leftIconPlaceholder=", ", actionIconPlaceholder=null, leftIconTintEnable=", sb);
        sb.append(bool);
        sb.append(", actionIconTintEnable=");
        sb.append(bool2);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
