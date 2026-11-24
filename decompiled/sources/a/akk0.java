package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class akk0 {
    public static final wjk0 Companion = new wjk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1026a;
    public final String b;
    public final zjk0 c;

    public /* synthetic */ akk0(int i, String str, String str2, zjk0 zjk0Var) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, vjk0.f37532a.getDescriptor());
            throw null;
        }
        this.f1026a = str;
        this.b = str2;
        this.c = zjk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akk0)) {
            return false;
        }
        akk0 akk0Var = (akk0) obj;
        return Intrinsics.d(this.f1026a, akk0Var.f1026a) && Intrinsics.d(this.b, akk0Var.b) && Intrinsics.d(this.c, akk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f1026a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SocketAuthorizationWithTokenRequest(id=", this.f1026a, ", rt=", this.b, ", payload=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public akk0(String str, zjk0 zjk0Var) {
        str.getClass();
        this.f1026a = str;
        this.b = "http://company.com/Feeds/System/Auth.json?v=2";
        this.c = zjk0Var;
    }
}
