package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9602a;
    public final String b;
    public final String c;

    public fis(List list, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f9602a = list;
        this.b = str;
        this.c = str2;
    }

    public static fis a(fis fisVar, ArrayList arrayList) {
        String str = fisVar.b;
        String str2 = fisVar.c;
        str.getClass();
        str2.getClass();
        return new fis(arrayList, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fis)) {
            return false;
        }
        fis fisVar = (fis) obj;
        return this.f9602a.equals(fisVar.f9602a) && Intrinsics.d(this.b, fisVar.b) && Intrinsics.d(this.c, fisVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f9602a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(ua80.o("GameItemsWithCategory(gameItems=", ", categoryId=", this.b, this.f9602a, ", categoryName="), this.c, Separators.RPAREN);
    }
}
