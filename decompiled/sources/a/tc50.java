package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tc50 implements vc50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33704a;
    public final ArrayList b;
    public final boolean c;
    public final List d;
    public final String e;

    public tc50(int i, String str, String str2, ArrayList arrayList) {
        arrayList = (i & 2) != 0 ? new ArrayList() : arrayList;
        boolean z = (i & 4) == 0;
        iun iunVar = iun.f15405a;
        str.getClass();
        iunVar.getClass();
        str2.getClass();
        this.f33704a = str;
        this.b = arrayList;
        this.c = z;
        this.d = iunVar;
        this.e = str2;
    }

    @Override // a.vc50
    public final ArrayList a() {
        return this.b;
    }

    @Override // a.vc50
    public final boolean b() {
        return false;
    }

    @Override // a.vc50
    public final boolean c() {
        return this.c;
    }

    @Override // a.vc50
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc50)) {
            return false;
        }
        tc50 tc50Var = (tc50) obj;
        return Intrinsics.d(this.f33704a, tc50Var.f33704a) && this.b.equals(tc50Var.b) && this.c == tc50Var.c && this.d.equals(tc50Var.d) && Intrinsics.d(this.e, tc50Var.e);
    }

    @Override // a.vc50
    public final String getTitle() {
        return this.f33704a;
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(brm0.e(brm0.e((this.b.hashCode() + (this.f33704a.hashCode() * 31)) * 31, 31, this.c), 31, false), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Subtitle(title=");
        sb.append(this.f33704a);
        sb.append(", buttonList=");
        sb.append(this.b);
        sb.append(", titleIconVisible=");
        vqd.y(sb, ", showSeparator=false, navigationBarActions=", this.d, ", subtitle=", this.c);
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
