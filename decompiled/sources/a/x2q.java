package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40181a;
    public final String b;
    public final w3q c;
    public final List d;

    public x2q(String str, String str2, w3q w3qVar, List list) {
        str.getClass();
        str2.getClass();
        w3qVar.getClass();
        list.getClass();
        this.f40181a = str;
        this.b = str2;
        this.c = w3qVar;
        this.d = list;
    }

    public static x2q a(x2q x2qVar, List list) {
        String str = x2qVar.f40181a;
        String str2 = x2qVar.b;
        w3q w3qVar = x2qVar.c;
        x2qVar.getClass();
        str.getClass();
        str2.getClass();
        w3qVar.getClass();
        list.getClass();
        return new x2q(str, str2, w3qVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2q)) {
            return false;
        }
        x2q x2qVar = (x2q) obj;
        return Intrinsics.d(this.f40181a, x2qVar.f40181a) && Intrinsics.d(this.b, x2qVar.b) && this.c == x2qVar.c && Intrinsics.d(this.d, x2qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f40181a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FilterCategoryModel(id=", this.f40181a, ", categoryName=", this.b, ", type=");
        sbN.append(this.c);
        sbN.append(", filtersList=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
