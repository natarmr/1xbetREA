package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class muy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22433a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;

    public muy(int i, String str, String str2, String str3, String str4, String str5, List list) {
        list.getClass();
        this.f22433a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muy)) {
            return false;
        }
        muy muyVar = (muy) obj;
        return Intrinsics.d(this.f22433a, muyVar.f22433a) && this.b.equals(muyVar.b) && this.c.equals(muyVar.c) && this.d.equals(muyVar.d) && this.e == muyVar.e && this.f.equals(muyVar.f) && this.g.equals(muyVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(twn.a(this.e, ua80.b(ua80.b(ua80.b(this.f22433a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("LanguageModel(androidNames=", ", codeIso=", this.b, this.f22433a, ", localeCode=");
        f140.v(sbO, this.c, ", engName=", this.d, ", id=");
        kng0.w(this.e, ", name=", this.f, ", translation=", sbO);
        return axq.n(sbO, this.g, Separators.RPAREN);
    }
}
