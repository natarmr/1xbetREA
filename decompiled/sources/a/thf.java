package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class thf implements yhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f33959a;
    public final String b;
    public final String c;
    public final boolean d;

    public thf(ArrayList arrayList, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f33959a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thf)) {
            return false;
        }
        thf thfVar = (thf) obj;
        return this.f33959a.equals(thfVar.f33959a) && Intrinsics.d(this.b, thfVar.b) && Intrinsics.d(this.c, thfVar.c) && this.d == thfVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f33959a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerOneInfo(rounds=");
        sb.append(this.f33959a);
        sb.append(", firstRound=");
        sb.append(this.b);
        sb.append(", secondRound=");
        return defpackage.c.c(this.c, ", showDivider=", Separators.RPAREN, sb, this.d);
    }
}
