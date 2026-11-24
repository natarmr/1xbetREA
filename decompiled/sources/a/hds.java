package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class hds implements Serializable {
    public static final dds Companion = new dds();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12884a;
    public final String b;
    public final String c;
    public final lz60 d;

    public /* synthetic */ hds(int i, String str, String str2, String str3, lz60 lz60Var) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, cds.f4176a.getDescriptor());
            throw null;
        }
        this.f12884a = str;
        this.b = str2;
        this.c = str3;
        this.d = lz60Var;
    }

    public final lz60 a(String str) {
        jz60 jz60Var = jz60.f17395a;
        if (str == null) {
            return jz60Var;
        }
        return (str.equals(this.f12884a) || str.equals(this.b) || str.equals(this.c)) ? this.d : jz60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hds)) {
            return false;
        }
        hds hdsVar = (hds) obj;
        return Intrinsics.d(this.f12884a, hdsVar.f12884a) && Intrinsics.d(this.b, hdsVar.b) && Intrinsics.d(this.c, hdsVar.c) && Intrinsics.d(this.d, hdsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f12884a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strA = gds.a(this.f12884a);
        String strA2 = gds.a(this.b);
        String strA3 = gds.a(this.c);
        StringBuilder sbN = b1j.n("GameImageInfo(rect=", strA, ", square=", strA2, ", circle=");
        sbN.append(strA3);
        sbN.append(", imageVariant=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public hds(String str, String str2, String str3, lz60 lz60Var) {
        this.f12884a = str;
        this.b = str2;
        this.c = str3;
        this.d = lz60Var;
    }
}
