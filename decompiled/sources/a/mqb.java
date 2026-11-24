package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mqb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f22216a;
    public final List b;
    public final List c;

    public mqb(swp0 swp0Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f22216a = swp0Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqb)) {
            return false;
        }
        mqb mqbVar = (mqb) obj;
        return this.f22216a.equals(mqbVar.f22216a) && Intrinsics.d(this.b, mqbVar.b) && Intrinsics.d(this.c, mqbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f22216a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangePhoneModel(token=");
        sb.append(this.f22216a);
        sb.append(", codeTypesAvailable=");
        sb.append(this.b);
        sb.append(", codeRepeatTypesAvailable=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
