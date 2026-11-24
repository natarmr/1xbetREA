package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jp00 implements kp00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16877a;
    public final xyw b;
    public final List c;

    public jp00(String str, xyw xywVar, List list) {
        str.getClass();
        xywVar.getClass();
        list.getClass();
        this.f16877a = str;
        this.b = xywVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp00)) {
            return false;
        }
        jp00 jp00Var = (jp00) obj;
        return Intrinsics.d(this.f16877a, jp00Var.f16877a) && Intrinsics.d(this.b, jp00Var.b) && Intrinsics.d(this.c, jp00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f16877a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmartImage(appVersion=");
        sb.append(this.f16877a);
        sb.append(", imageBackgroundType=");
        sb.append(this.b);
        sb.append(", smartImageRes=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
