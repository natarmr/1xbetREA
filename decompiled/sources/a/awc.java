package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class awc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mvc f1566a;
    public final String b;
    public final List c;

    public awc(mvc mvcVar, String str, List list) {
        list.getClass();
        this.f1566a = mvcVar;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awc)) {
            return false;
        }
        awc awcVar = (awc) obj;
        return this.f1566a == awcVar.f1566a && this.b.equals(awcVar.b) && Intrinsics.d(this.c, awcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f1566a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CmsBannerTypeModel(typeCode=");
        sb.append(this.f1566a);
        sb.append(", typeName=");
        sb.append(this.b);
        sb.append(", banners=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
