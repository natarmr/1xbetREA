package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zxl implements dyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45165a;
    public final n0x b;
    public final Boolean c;

    public zxl(int i, n0x n0xVar, String str) {
        Boolean bool = (i & 16) != 0 ? Boolean.TRUE : Boolean.FALSE;
        str.getClass();
        this.f45165a = str;
        this.b = n0xVar;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxl)) {
            return false;
        }
        zxl zxlVar = (zxl) obj;
        return Intrinsics.d(this.f45165a, zxlVar.f45165a) && this.b.equals(zxlVar.b) && ycl.b(0.0f, 0.0f) && Intrinsics.d(this.c, zxlVar.c);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(f140.f(this.b, this.f45165a.hashCode() * 31, 31), 0.0f, 961);
        Boolean bool = this.c;
        return iA + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "LabelWithActionIcon(label=" + this.f45165a + ", icon=" + this.b + ", iconRadius=" + ycl.c(0.0f) + ", placeholder=null, tintEnable=" + this.c + Separators.RPAREN;
    }
}
