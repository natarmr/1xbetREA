package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class btb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3175a;
    public final mcy b;
    public final mcy c;
    public final ipb d;
    public final String e;
    public final mcy f;
    public final List g;

    public btb(String str, mcy mcyVar, mcy mcyVar2, ipb ipbVar, String str2, mcy mcyVar3, List list) {
        this.f3175a = str;
        this.b = mcyVar;
        this.c = mcyVar2;
        this.d = ipbVar;
        this.e = str2;
        this.f = mcyVar3;
        this.g = list;
    }

    public static btb a(btb btbVar, String str, mcy mcyVar, int i) {
        String str2 = btbVar.f3175a;
        mcy mcyVar2 = btbVar.b;
        mcy mcyVar3 = btbVar.c;
        ipb ipbVar = btbVar.d;
        if ((i & 16) != 0) {
            str = btbVar.e;
        }
        String str3 = str;
        List list = btbVar.g;
        str3.getClass();
        return new btb(str2, mcyVar2, mcyVar3, ipbVar, str3, mcyVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btb)) {
            return false;
        }
        btb btbVar = (btb) obj;
        return this.f3175a.equals(btbVar.f3175a) && Intrinsics.d(this.b, btbVar.b) && Intrinsics.d(this.c, btbVar.c) && this.d == btbVar.d && this.e.equals(btbVar.e) && Intrinsics.d(this.f, btbVar.f) && Intrinsics.d(this.g, btbVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.f3175a.hashCode() * 31;
        mcy mcyVar = this.b;
        int iHashCode2 = (iHashCode + (mcyVar == null ? 0 : mcyVar.hashCode())) * 31;
        mcy mcyVar2 = this.c;
        int iB = ua80.b((this.d.hashCode() + ((iHashCode2 + (mcyVar2 == null ? 0 : mcyVar2.hashCode())) * 31)) * 31, 31, this.e);
        mcy mcyVar3 = this.f;
        int iHashCode3 = (iB + (mcyVar3 == null ? 0 : mcyVar3.hashCode())) * 31;
        List list = this.g;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeValueBSDialogState(key=");
        sb.append(this.f3175a);
        sb.append(", sourceValue=");
        sb.append(this.b);
        sb.append(", changedValue=");
        sb.append(this.c);
        sb.append(", keyType=");
        sb.append(this.d);
        sb.append(", enteredValue=");
        sb.append(this.e);
        sb.append(", previewEnteredValue=");
        sb.append(this.f);
        sb.append(", possibleValues=");
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
