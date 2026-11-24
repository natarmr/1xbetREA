package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ctb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ipb f4928a;
    public final String b;
    public final String c;
    public final boolean d;
    public final wul e;
    public final wul f;
    public final wul g;
    public final hjm h;
    public final hjm i;
    public final boolean j;
    public final hjm k;
    public final hjm l;
    public final hjm m;
    public final c6q0 n;
    public final Boolean o;
    public final List p;

    public ctb(ipb ipbVar, String str, String str2, boolean z, wul wulVar, wul wulVar2, wul wulVar3, hjm hjmVar, hjm hjmVar2, boolean z2, hjm hjmVar3, hjm hjmVar4, hjm hjmVar5, c6q0 c6q0Var, Boolean bool, ArrayList arrayList) {
        str2.getClass();
        this.f4928a = ipbVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = wulVar;
        this.f = wulVar2;
        this.g = wulVar3;
        this.h = hjmVar;
        this.i = hjmVar2;
        this.j = z2;
        this.k = hjmVar3;
        this.l = hjmVar4;
        this.m = hjmVar5;
        this.n = c6q0Var;
        this.o = bool;
        this.p = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctb)) {
            return false;
        }
        ctb ctbVar = (ctb) obj;
        return this.f4928a == ctbVar.f4928a && this.b.equals(ctbVar.b) && Intrinsics.d(this.c, ctbVar.c) && this.d == ctbVar.d && this.e.equals(ctbVar.e) && this.f.equals(ctbVar.f) && this.g.equals(ctbVar.g) && this.h.equals(ctbVar.h) && this.i.equals(ctbVar.i) && this.j == ctbVar.j && this.k.equals(ctbVar.k) && this.l.equals(ctbVar.l) && this.m.equals(ctbVar.m) && this.n.equals(ctbVar.n) && Intrinsics.d(this.o, ctbVar.o) && Intrinsics.d(this.p, ctbVar.p);
    }

    public final int hashCode() {
        int iHashCode = (this.n.hashCode() + hne.e(this.m, hne.e(this.l, hne.e(this.k, brm0.e(hne.e(this.i, hne.e(this.h, i8i.a(this.g, i8i.a(this.f, i8i.a(this.e, brm0.e(ua80.b(ua80.b(this.f4928a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31), 31), 31, this.j), 31), 31), 31)) * 31;
        Boolean bool = this.o;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.p;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeValueBSDialogUiState(keyType=");
        sb.append(this.f4928a);
        sb.append(", enteredValue=");
        sb.append(this.b);
        sb.append(", dialogTitle=");
        brm0.C(this.c, ", changedAlertVisible=", ", resetButtonModel=", sb, this.d);
        sb.append(this.e);
        sb.append(", setNullButtonModel=");
        sb.append(this.f);
        sb.append(", applyButtonModel=");
        sb.append(this.g);
        sb.append(", headerKeyModel=");
        sb.append(this.h);
        sb.append(", headerSourceValueModel=");
        sb.append(this.i);
        sb.append(", sourceValueEmpty=");
        sb.append(this.j);
        sb.append(", sourceValueEmptyModel=");
        sb.append(this.k);
        sb.append(", headerChangedAlertTitleModel=");
        sb.append(this.l);
        sb.append(", headerKeyChangedValueTitleModel=");
        sb.append(this.m);
        sb.append(", textInputModel=");
        sb.append(this.n);
        sb.append(", twoVariantChose=");
        sb.append(this.o);
        sb.append(", possibleValues=");
        sb.append(this.p);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
