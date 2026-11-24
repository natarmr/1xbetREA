package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jda0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kda0 f16319a;
    public final List b;

    public jda0(kda0 kda0Var, List list) {
        list.getClass();
        this.f16319a = kda0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jda0)) {
            return false;
        }
        jda0 jda0Var = (jda0) obj;
        return this.f16319a.equals(jda0Var.f16319a) && Intrinsics.d(this.b, jda0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16319a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerTransfersModel(player=" + this.f16319a + ", transfers=" + this.b + Separators.RPAREN;
    }
}
