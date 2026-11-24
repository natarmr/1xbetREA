package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class jng implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16810a;
    public final len b;
    public final boolean c;

    public jng(ArrayList arrayList, len lenVar, boolean z) {
        this.f16810a = arrayList;
        this.b = lenVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jng)) {
            return false;
        }
        jng jngVar = (jng) obj;
        return this.f16810a.equals(jngVar.f16810a) && this.b == jngVar.b && this.c == jngVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f16810a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardOnTable(cards=");
        sb.append(this.f16810a);
        sb.append(", matchState=");
        sb.append(this.b);
        sb.append(", firstPlayerAttacked=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
