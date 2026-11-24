package a;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class q9d extends dzj0 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9d(String str, byte b) {
        super(str);
        this.b = b;
    }

    @Override // a.nw70, a.qjt
    public void a(htw htwVar, String str, j jVar) {
        switch (this.b) {
            case 1:
                jVar.getClass();
                if (!(jVar instanceof id00)) {
                    throw new byw("");
                }
                c(htwVar, str, jVar);
                zkd zkdVar = jVar.d;
                if (!(zkdVar instanceof xc00)) {
                    throw new byw("");
                }
                boolean zBooleanValue = ((Boolean) ((xc00) zkdVar).f.getValue()).booleanValue();
                for (j jVar2 : ((zkd) jVar).e) {
                    if (!Intrinsics.d(jVar2.f15657a, wb.v) || zBooleanValue) {
                        htwVar.e0(jVar2);
                    } else {
                        nd00.b.a(htwVar, str, jVar2);
                    }
                }
                htwVar.g0(this.f6946a);
                return;
            default:
                super.a(htwVar, str, jVar);
                return;
        }
    }

    @Override // a.dzj0, a.nw70
    public void c(htw htwVar, String str, j jVar) {
        j jVarL;
        CharSequence charSequenceN;
        String string;
        String string2;
        switch (this.b) {
            case 0:
                jVar.getClass();
                j jVarL2 = dwi0.L(jVar, wb.p);
                String strM = null;
                if (jVarL2 != null && (jVarL = dwi0.L(jVarL2, cy2.Z)) != null && (charSequenceN = dwi0.N(jVarL, str)) != null && (string = charSequenceN.toString()) != null && (string2 = StringsKt.u0(string).toString()) != null) {
                    String strY0 = StringsKt.y0(vqd.k(1, 0, string2), '0');
                    if (!strY0.equals("1")) {
                        StringBuilder sb = new StringBuilder("start=\"");
                        if (strY0.length() == 0) {
                            strY0 = "0";
                        }
                        strM = axq.m(sb, strY0, '\"');
                    }
                }
                htwVar.h0(jVar, "ol", new CharSequence[]{strM}, false);
                break;
            default:
                super.c(htwVar, str, jVar);
                break;
        }
    }
}
