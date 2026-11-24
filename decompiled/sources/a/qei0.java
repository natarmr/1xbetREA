package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qei0 extends rei0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28586a;
    public final h8d b;
    public final Date c;
    public final String d;
    public final boolean e;

    public qei0(String str, h8d h8dVar, Date date, String str2, boolean z) {
        str.getClass();
        h8dVar.getClass();
        date.getClass();
        str2.getClass();
        this.f28586a = str;
        this.b = h8dVar;
        this.c = date;
        this.d = str2;
        this.e = z;
    }

    @Override // a.rei0
    public final Date a() {
        return this.c;
    }

    @Override // a.rei0
    public final String b() {
        return this.d;
    }

    @Override // a.rei0
    public final boolean c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qei0)) {
            return false;
        }
        qei0 qei0Var = (qei0) obj;
        return Intrinsics.d(this.f28586a, qei0Var.f28586a) && Intrinsics.d(this.b, qei0Var.b) && Intrinsics.d(this.c, qei0Var.c) && Intrinsics.d(this.d, qei0Var.d) && this.e == qei0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(brm0.i(this.c, (this.b.hashCode() + (this.f28586a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextMessage(text=");
        sb.append(this.f28586a);
        sb.append(", commandModel=");
        sb.append(this.b);
        sb.append(", createdDate=");
        sb.append(this.c);
        sb.append(", keyForLocalStore=");
        sb.append(this.d);
        sb.append(", sendWithError=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }

    public /* synthetic */ qei0(String str, h8d h8dVar, Date date) {
        this(str, h8dVar, date, axq.g(), false);
    }
}
