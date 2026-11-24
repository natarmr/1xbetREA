package a;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class d0x extends mb00 {
    public static final Regex e = new Regex("[^a-zA-Z0-9 ]");
    public final xme0 c;
    public final gdx d = new gdx();

    public d0x(pb00 pb00Var) {
        this.c = new xme0(pb00Var, (byte) 0);
    }

    @Override // a.mb00
    public final lb00 b(j jVar, String str) {
        jVar.getClass();
        j jVarL = dwi0.L(jVar, wb.D);
        if (jVarL != null) {
            return this.d.b(jVarL, str);
        }
        j jVarL2 = dwi0.L(jVar, wb.E);
        if (jVarL2 == null) {
            jVarL2 = dwi0.L(jVar, wb.F);
        }
        if (jVarL2 != null) {
            return this.c.b(jVarL2, str);
        }
        return null;
    }

    @Override // a.mb00
    public final void d(htw htwVar, String str, j jVar, lb00 lb00Var) {
        String str2;
        jVar.getClass();
        StringBuilder sb = new StringBuilder("src=\"");
        CharSequence charSequence = lb00Var.b;
        c(charSequence);
        sb.append((Object) charSequence);
        sb.append('\"');
        String string = sb.toString();
        String str3 = "alt=\"" + ((Object) e(lb00Var.f19733a, str)) + '\"';
        CharSequence charSequence2 = lb00Var.c;
        if (charSequence2 != null) {
            str2 = "title=\"" + ((Object) charSequence2) + '\"';
        } else {
            str2 = null;
        }
        htwVar.h0(jVar, "img", new CharSequence[]{string, str3, str2}, true);
    }

    public final String e(j jVar, String str) {
        ar20 ar20Var = jVar.f15657a;
        if (Intrinsics.d(ar20Var, wb.A)) {
            return e.replace(dwi0.N(jVar, str), "");
        }
        if (!(jVar instanceof fiz)) {
            return CollectionsKt.b0(jVar.a(), "", null, null, new fne(this, str, (byte) 1), 30);
        }
        if (Intrinsics.d(ar20Var, cy2.T) || Intrinsics.d(ar20Var, cy2.U) || Intrinsics.d(ar20Var, cy2.V) || Intrinsics.d(ar20Var, cy2.K) || Intrinsics.d(ar20Var, cy2.F) || Intrinsics.d(ar20Var, cy2.G) || Intrinsics.d(ar20Var, cy2.D) || Intrinsics.d(ar20Var, cy2.E) || Intrinsics.d(ar20Var, cy2.z)) {
            return "";
        }
        Map map = tzn.f34812a;
        return tzn.a(dwi0.N(jVar, str), true, true);
    }
}
