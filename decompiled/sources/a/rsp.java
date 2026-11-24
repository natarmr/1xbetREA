package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rsp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7v0 f31041a;
    public final xsp b;
    public final List c;

    public rsp(f7v0 f7v0Var, xsp xspVar, List list) {
        list.getClass();
        this.f31041a = f7v0Var;
        this.b = xspVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsp)) {
            return false;
        }
        rsp rspVar = (rsp) obj;
        return this.f31041a == rspVar.f31041a && Intrinsics.d(this.b, rspVar.b) && Intrinsics.d(this.c, rspVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f31041a.hashCode() * 31;
        xsp xspVar = this.b;
        return this.c.hashCode() + ((iHashCode + (xspVar == null ? 0 : xspVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FightInfoModel(weightClass=");
        sb.append(this.f31041a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", corners=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
