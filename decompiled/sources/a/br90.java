package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class br90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3068a;
    public final zqp b;
    public final boolean c;
    public final String d;
    public final List e;
    public final boolean f;

    public br90(boolean z, zqp zqpVar, boolean z2, String str, List list, boolean z3) {
        list.getClass();
        this.f3068a = z;
        this.b = zqpVar;
        this.c = z2;
        this.d = str;
        this.e = list;
        this.f = z3;
    }

    public static br90 a(br90 br90Var, zqp zqpVar, String str, ArrayList arrayList, boolean z, int i) {
        boolean z2 = br90Var.f3068a;
        if ((i & 2) != 0) {
            zqpVar = br90Var.b;
        }
        zqp zqpVar2 = zqpVar;
        boolean z3 = (i & 4) != 0 ? br90Var.c : true;
        if ((i & 8) != 0) {
            str = br90Var.d;
        }
        String str2 = str;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = br90Var.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            z = br90Var.f;
        }
        br90Var.getClass();
        list2.getClass();
        return new br90(z2, zqpVar2, z3, str2, list2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br90)) {
            return false;
        }
        br90 br90Var = (br90) obj;
        return this.f3068a == br90Var.f3068a && this.b.equals(br90Var.b) && this.c == br90Var.c && this.d.equals(br90Var.d) && Intrinsics.d(this.e, br90Var.e) && this.f == br90Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + dw9.a(ua80.b(brm0.e((this.b.hashCode() + (Boolean.hashCode(this.f3068a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickerState(customPhoneCodeInputAllowed=");
        sb.append(this.f3068a);
        sb.append(", fieldPhoneCodeStateModel=");
        sb.append(this.b);
        sb.append(", enterCodeActive=");
        f140.s(", searchValue=", this.d, ", content=", sb, this.c);
        sb.append(this.e);
        sb.append(", isContentDialogVisible=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
