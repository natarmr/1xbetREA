package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class se50 implements te50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wul0 f32061a;
    public final List b;

    public se50(wul0 wul0Var, List list) {
        wul0Var.getClass();
        list.getClass();
        this.f32061a = wul0Var;
        this.b = list;
    }

    public static se50 d(se50 se50Var, wul0 wul0Var, List list, int i) {
        if ((i & 1) != 0) {
            wul0Var = se50Var.f32061a;
        }
        if ((i & 2) != 0) {
            list = se50Var.b;
        }
        se50Var.getClass();
        wul0Var.getClass();
        list.getClass();
        return new se50(wul0Var, list);
    }

    @Override // a.te50
    public final List c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se50)) {
            return false;
        }
        se50 se50Var = (se50) obj;
        return Intrinsics.d(this.f32061a, se50Var.f32061a) && Intrinsics.d(this.b, se50Var.b);
    }

    @Override // a.te50
    public final wul0 getRoot() {
        return this.f32061a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32061a.hashCode() * 31);
    }

    public final String toString() {
        return "Child(root=" + this.f32061a + ", screens=" + this.b + Separators.RPAREN;
    }
}
