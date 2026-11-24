package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oz60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td00 f26091a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public oz60(td00 td00Var, String str, String str2, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.f26091a = td00Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public static oz60 a(oz60 oz60Var, td00 td00Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = oz60Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = oz60Var.c;
        }
        String str4 = oz60Var.d;
        String str5 = oz60Var.e;
        str4.getClass();
        str5.getClass();
        return new oz60(td00Var, str3, str2, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz60)) {
            return false;
        }
        oz60 oz60Var = (oz60) obj;
        return this.f26091a.equals(oz60Var.f26091a) && this.b.equals(oz60Var.b) && this.c.equals(oz60Var.c) && Intrinsics.d(this.d, oz60Var.d) && Intrinsics.d(this.e, oz60Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f26091a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesPopularClassicState(listState=");
        sb.append(this.f26091a);
        sb.append(", gameCollectionViewType=");
        sb.append(this.b);
        sb.append(", tagText=");
        f140.v(sb, this.c, ", headerText=", this.d, ", buttonAllText=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
