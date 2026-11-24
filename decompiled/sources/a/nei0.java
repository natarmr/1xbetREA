package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nei0 extends oei0 {
    public static final mei0 Companion = new mei0();
    public final String b;
    public final b8d c;
    public final Date d;
    public final String e;
    public final Boolean f;

    public /* synthetic */ nei0(int i, String str, b8d b8dVar, Date date, String str2, Boolean bool) {
        if (28 != (i & 28)) {
            m2x.I(i, 28, lei0.f19904a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = b8dVar;
        }
        this.d = date;
        this.e = str2;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nei0)) {
            return false;
        }
        nei0 nei0Var = (nei0) obj;
        return Intrinsics.d(this.b, nei0Var.b) && Intrinsics.d(this.c, nei0Var.c) && Intrinsics.d(this.d, nei0Var.d) && Intrinsics.d(this.e, nei0Var.e) && Intrinsics.d(this.f, nei0Var.f);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b8d b8dVar = this.c;
        int iHashCode2 = (iHashCode + (b8dVar == null ? 0 : b8dVar.hashCode())) * 31;
        Date date = this.d;
        int iB = ua80.b((iHashCode2 + (date == null ? 0 : date.hashCode())) * 31, 31, this.e);
        Boolean bool = this.f;
        return iB + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextMessage(text=");
        sb.append(this.b);
        sb.append(", command=");
        sb.append(this.c);
        sb.append(", createdDate=");
        sb.append(this.d);
        sb.append(", keyForLocalStore=");
        sb.append(this.e);
        sb.append(", sendWithError=");
        return defpackage.c.e(sb, this.f, Separators.RPAREN);
    }

    public nei0(String str, b8d b8dVar, Date date, String str2, Boolean bool) {
        str2.getClass();
        this.b = str;
        this.c = b8dVar;
        this.d = date;
        this.e = str2;
        this.f = bool;
    }
}
