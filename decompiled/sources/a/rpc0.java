package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class rpc0 implements vpc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f30881a;
    public final String b;

    public rpc0(String str, ArrayList arrayList) {
        this.f30881a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpc0)) {
            return false;
        }
        rpc0 rpc0Var = (rpc0) obj;
        return this.f30881a.equals(rpc0Var.f30881a) && this.b.equals(rpc0Var.b);
    }

    @Override // a.vpc0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30881a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(categories=" + this.f30881a + ", title=" + this.b + Separators.RPAREN;
    }
}
