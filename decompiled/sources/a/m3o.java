package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m3o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21125a;
    public final boolean b;
    public final String c;
    public final List d;
    public final ArrayList e;

    public m3o(List list, boolean z, String str, List list2, ArrayList arrayList) {
        list.getClass();
        str.getClass();
        list2.getClass();
        this.f21125a = list;
        this.b = z;
        this.c = str;
        this.d = list2;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3o)) {
            return false;
        }
        m3o m3oVar = (m3o) obj;
        return Intrinsics.d(this.f21125a, m3oVar.f21125a) && this.b == m3oVar.b && Intrinsics.d(this.c, m3oVar.c) && Intrinsics.d(this.d, m3oVar.d) && this.e.equals(m3oVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(ua80.b(brm0.e(this.f21125a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsportsGamesScenarioModel(games=");
        sb.append(this.f21125a);
        sb.append(", multiline=");
        sb.append(this.b);
        sb.append(", searchFilter=");
        cs0.y(this.c, ", specialEventList=", ", sportIconUrls=", sb, this.d);
        return rz4.n(sb, this.e, Separators.RPAREN);
    }
}
