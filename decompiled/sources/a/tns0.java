package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tns0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34251a;
    public final Map b;
    public final String c;
    public final Map d;
    public final String e;
    public final String f;
    public final ysw g;
    public final List h;
    public final clg0 i;

    public tns0(String str, Map map, String str2, Map map2, String str3, String str4, ysw yswVar, List list, clg0 clg0Var) {
        list.getClass();
        this.f34251a = str;
        this.b = map;
        this.c = str2;
        this.d = map2;
        this.e = str3;
        this.f = str4;
        this.g = yswVar;
        this.h = list;
        this.i = clg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tns0)) {
            return false;
        }
        tns0 tns0Var = (tns0) obj;
        return this.f34251a.equals(tns0Var.f34251a) && this.b.equals(tns0Var.b) && this.c.equals(tns0Var.c) && this.d.equals(tns0Var.d) && this.e.equals(tns0Var.e) && this.f.equals(tns0Var.f) && this.g.equals(tns0Var.g) && Intrinsics.d(this.h, tns0Var.h) && this.i == tns0Var.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + dw9.a((this.g.hashCode() + ua80.b(ua80.b(ohs0.f(this.d, ua80.b(ohs0.f(this.b, this.f34251a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31, this.f)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranslationModel(title=");
        sb.append(this.f34251a);
        sb.append(", titleLocalized=");
        sb.append(this.b);
        sb.append(", textDescription=");
        sb.append(this.c);
        sb.append(", textDescriptionLocalized=");
        sb.append(this.d);
        sb.append(", image=");
        f140.v(sb, this.e, ", style=", this.f, ", href=");
        sb.append(this.g);
        sb.append(", info=");
        sb.append(this.h);
        sb.append(", type=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
