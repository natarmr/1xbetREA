package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class paf implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26653a;
    public final List b;
    public final List c;
    public final we50 d;

    public paf(String str, List list, List list2, we50 we50Var) {
        str.getClass();
        list.getClass();
        list2.getClass();
        we50Var.getClass();
        this.f26653a = str;
        this.b = list;
        this.c = list2;
        this.d = we50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paf)) {
            return false;
        }
        paf pafVar = (paf) obj;
        return Intrinsics.d(this.f26653a, pafVar.f26653a) && Intrinsics.d(this.b, pafVar.b) && Intrinsics.d(this.c, pafVar.c) && this.d == pafVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(dw9.a(this.f26653a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("CreateNewPasswordParams(currentPassword=", this.f26653a, ", availableActivationTypeList=", this.b, ", availableRepeatActivationTypeList=");
        sbF.append(this.c);
        sbF.append(", navigation=");
        sbF.append(this.d);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
