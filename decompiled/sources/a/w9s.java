package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f38796a;
    public final boolean b;
    public final String c;
    public final List d;
    public final String e;
    public final kts f;
    public final ubr g;

    public w9s(Map map, boolean z, String str, List list, String str2, kts ktsVar, ubr ubrVar) {
        list.getClass();
        this.f38796a = map;
        this.b = z;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = ktsVar;
        this.g = ubrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9s)) {
            return false;
        }
        w9s w9sVar = (w9s) obj;
        return this.f38796a.equals(w9sVar.f38796a) && this.b == w9sVar.b && this.c.equals(w9sVar.c) && Intrinsics.d(this.d, w9sVar.d) && this.e.equals(w9sVar.e) && this.f.equals(w9sVar.f) && this.g.equals(w9sVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ua80.b(dw9.a(ua80.b(brm0.e(this.f38796a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameEventCacheModel(coefs=");
        sb.append(this.f38796a);
        sb.append(", coefsSupported=");
        sb.append(this.b);
        sb.append(", mainScore=");
        cs0.y(this.c, ", overScore=", ", periodFullScore=", sb, this.d);
        sb.append(this.e);
        sb.append(", subScore=");
        sb.append(this.f);
        sb.append(", fullScoreDetailsModel=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
