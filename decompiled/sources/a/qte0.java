package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qte0 {
    public static final pte0 Companion = new pte0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29297a;
    public final g6a b;

    public /* synthetic */ qte0(int i, String str, g6a g6aVar) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, ote0.f25826a.getDescriptor());
            throw null;
        }
        this.f29297a = str;
        this.b = g6aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qte0)) {
            return false;
        }
        qte0 qte0Var = (qte0) obj;
        return Intrinsics.d(this.f29297a, qte0Var.f29297a) && Intrinsics.d(this.b, qte0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29297a.hashCode() * 31);
    }

    public final String toString() {
        return "RegisterSendSmsRequest(registrationGuid=" + this.f29297a + ", captcha=" + this.b + Separators.RPAREN;
    }

    public qte0(String str, g6a g6aVar) {
        str.getClass();
        this.f29297a = str;
        this.b = g6aVar;
    }
}
