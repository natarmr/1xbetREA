package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e9c implements f9c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f7413a;
    public final List b;
    public final List c;

    public e9c(swp0 swp0Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f7413a = swp0Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9c)) {
            return false;
        }
        e9c e9cVar = (e9c) obj;
        return this.f7413a.equals(e9cVar.f7413a) && Intrinsics.d(this.b, e9cVar.b) && Intrinsics.d(this.c, e9cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f7413a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoFactoryConfirmationRequired(token=");
        sb.append(this.f7413a);
        sb.append(", availableActivationTypeList=");
        sb.append(this.b);
        sb.append(", availableRepeatActivationTypeList=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
