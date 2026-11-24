package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vhf implements yhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37426a;
    public final String b;
    public final String c;
    public final boolean d;

    public vhf(ArrayList arrayList, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f37426a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhf)) {
            return false;
        }
        vhf vhfVar = (vhf) obj;
        return this.f37426a.equals(vhfVar.f37426a) && Intrinsics.d(this.b, vhfVar.b) && Intrinsics.d(this.c, vhfVar.c) && this.d == vhfVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f37426a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerTwoInfo(rounds=");
        sb.append(this.f37426a);
        sb.append(", firstRound=");
        sb.append(this.b);
        sb.append(", secondRound=");
        return defpackage.c.c(this.c, ", showDivider=", Separators.RPAREN, sb, this.d);
    }
}
