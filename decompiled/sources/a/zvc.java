package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zvc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mvc f45047a;
    public final String b;
    public final ArrayList c;

    public zvc(mvc mvcVar, String str, ArrayList arrayList) {
        this.f45047a = mvcVar;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvc)) {
            return false;
        }
        zvc zvcVar = (zvc) obj;
        return this.f45047a == zvcVar.f45047a && this.b.equals(zvcVar.b) && this.c.equals(zvcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f45047a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CmsBannerTypeCatalogModel(typeCode=");
        sb.append(this.f45047a);
        sb.append(", typeName=");
        sb.append(this.b);
        sb.append(", banners=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
