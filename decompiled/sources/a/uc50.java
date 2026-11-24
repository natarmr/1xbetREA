package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uc50 implements vc50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35413a;
    public final ArrayList b;
    public final List c;

    public uc50(String str) {
        ArrayList arrayList = new ArrayList();
        iun iunVar = iun.f15405a;
        str.getClass();
        iunVar.getClass();
        this.f35413a = str;
        this.b = arrayList;
        this.c = iunVar;
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
        return false;
    }

    @Override // a.vc50
    public final List d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc50)) {
            return false;
        }
        uc50 uc50Var = (uc50) obj;
        return Intrinsics.d(this.f35413a, uc50Var.f35413a) && this.b.equals(uc50Var.b) && this.c.equals(uc50Var.c);
    }

    @Override // a.vc50
    public final String getTitle() {
        return this.f35413a;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(brm0.e((this.b.hashCode() + (this.f35413a.hashCode() * 31)) * 31, 31, false), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Title(title=");
        sb.append(this.f35413a);
        sb.append(", buttonList=");
        sb.append(this.b);
        sb.append(", titleIconVisible=false, showSeparator=false, navigationBarActions=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
