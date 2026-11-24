package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class hik0 {
    public static final fik0 Companion = new fik0();
    public static final a8z[] c = {maz.a(wez.f39042a, new pdk0(7)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gik0 f13117a;
    public final String b;

    public /* synthetic */ hik0(int i, gik0 gik0Var, String str) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, eik0.f7865a.getDescriptor());
            throw null;
        }
        this.f13117a = gik0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hik0)) {
            return false;
        }
        hik0 hik0Var = (hik0) obj;
        return this.f13117a == hik0Var.f13117a && Intrinsics.d(this.b, hik0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13117a.hashCode() * 31);
    }

    public final String toString() {
        return "SocialNetModel(type=" + this.f13117a + ", link=" + this.b + Separators.RPAREN;
    }

    public hik0(gik0 gik0Var, String str) {
        str.getClass();
        this.f13117a = gik0Var;
        this.b = str;
    }
}
