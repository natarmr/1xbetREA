package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24867a;
    public final List b;
    public final String c;
    public final long d;

    public o98(long j, String str, String str2, List list) {
        list.getClass();
        this.f24867a = str;
        this.b = list;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o98)) {
            return false;
        }
        o98 o98Var = (o98) obj;
        return this.f24867a.equals(o98Var.f24867a) && Intrinsics.d(this.b, o98Var.b) && this.c.equals(o98Var.c) && this.d == o98Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ua80.b(dw9.a(this.f24867a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("BlockRuleStageModel(content=", this.f24867a, ", items=", this.b, ", title=");
        defpackage.c.i(sbF, this.d, this.c, ", id=");
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
