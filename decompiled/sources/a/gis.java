package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11364a;
    public final String b;
    public final String c;

    public gis(List list, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f11364a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gis)) {
            return false;
        }
        gis gisVar = (gis) obj;
        return this.f11364a.equals(gisVar.f11364a) && Intrinsics.d(this.b, gisVar.b) && Intrinsics.d(this.c, gisVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f11364a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(ua80.o("GameItemsWithCategory(gameItems=", ", categoryId=", this.b, this.f11364a, ", categoryName="), this.c, Separators.RPAREN);
    }
}
