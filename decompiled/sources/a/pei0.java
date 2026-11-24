package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pei0 extends rei0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26855a;
    public final List b;
    public final Date c;
    public final String d;
    public final boolean e;

    public pei0(String str, List list, Date date, String str2, boolean z) {
        str.getClass();
        list.getClass();
        date.getClass();
        str2.getClass();
        this.f26855a = str;
        this.b = list;
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
        if (!(obj instanceof pei0)) {
            return false;
        }
        pei0 pei0Var = (pei0) obj;
        return Intrinsics.d(this.f26855a, pei0Var.f26855a) && Intrinsics.d(this.b, pei0Var.b) && Intrinsics.d(this.c, pei0Var.c) && Intrinsics.d(this.d, pei0Var.d) && this.e == pei0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(brm0.i(this.c, dw9.a(this.f26855a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("MediaMessage(text=", this.f26855a, ", files=", this.b, ", createdDate=");
        sbF.append(this.c);
        sbF.append(", keyForLocalStore=");
        sbF.append(this.d);
        sbF.append(", sendWithError=");
        return rw2.p(sbF, this.e, Separators.RPAREN);
    }

    public /* synthetic */ pei0(String str, List list, Date date) {
        this(str, list, date, axq.g(), false);
    }
}
