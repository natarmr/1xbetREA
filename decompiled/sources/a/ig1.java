package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ig1 implements kg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14713a;
    public final ad b;
    public final mdm c;

    public ig1(String str, ad adVar, mdm mdmVar) {
        str.getClass();
        adVar.getClass();
        mdmVar.getClass();
        this.f14713a = str;
        this.b = adVar;
        this.c = mdmVar;
    }

    @Override // a.kg1
    public final String a() {
        return this.f14713a;
    }

    @Override // a.kg1
    public final ad b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig1)) {
            return false;
        }
        ig1 ig1Var = (ig1) obj;
        return Intrinsics.d(this.f14713a, ig1Var.f14713a) && Intrinsics.d(this.b, ig1Var.b) && Intrinsics.d(this.c, ig1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f14713a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty(screenTitle=");
        sb.append(this.f14713a);
        sb.append(", accountBalance=");
        sb.append(this.b);
        sb.append(", emptyConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
