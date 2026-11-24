package a;

import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ugu0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35643a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ugu0(Object obj, Object obj2, byte b) {
        this.f35643a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0189  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d7  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        Object obj;
        Object obj2;
        byte b = this.f35643a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((x1) obj4).removeOnAttachStateChangeListener((j14) obj3);
                return Unit.f46060a;
            case 1:
                ((glz) obj4).f((g02) obj3);
                return Unit.f46060a;
            case 2:
                ((Function1) obj4).invoke((pnu0) obj3);
                return Unit.f46060a;
            case 3:
                gfg gfgVar = (gfg) obj4;
                n0o0 n0o0Var = gfgVar.f;
                n0o0 n0o0Var2 = gfgVar.e;
                n0o0 n0o0Var3 = gfgVar.d;
                fee feeVar = (fee) n0o0Var3.getValue();
                j0g0 j0g0Var = ((upu0) obj3).c;
                if (j0g0Var != null) {
                    Object obj5 = j0g0Var.f15681a;
                    if (obj5 instanceof g0g0) {
                        obj5 = null;
                    }
                    fqu0 fqu0Var = (fqu0) obj5;
                    if (fqu0Var != null) {
                        Object obj6 = fqu0Var.c.f15681a;
                        if (obj6 instanceof g0g0) {
                            obj6 = null;
                        }
                        list = (List) obj6;
                    } else {
                        list = null;
                    }
                } else {
                    list = null;
                }
                if (list == null) {
                    list = iun.f15405a;
                }
                feeVar.d(list);
                fee feeVar2 = (fee) n0o0Var2.getValue();
                if (j0g0Var != null) {
                    Object obj7 = j0g0Var.f15681a;
                    if (obj7 instanceof g0g0) {
                        obj7 = null;
                    }
                    fqu0 fqu0Var2 = (fqu0) obj7;
                    if (fqu0Var2 != null) {
                        Object obj8 = fqu0Var2.f9993a.f15681a;
                        if (obj8 instanceof g0g0) {
                            obj8 = null;
                        }
                        obj = (List) obj8;
                        if (obj == null) {
                            obj = iun.f15405a;
                        }
                    } else {
                        obj = iun.f15405a;
                    }
                } else {
                    obj = iun.f15405a;
                }
                feeVar2.d(obj);
                fee feeVar3 = (fee) n0o0Var.getValue();
                if (j0g0Var != null) {
                    Object obj9 = j0g0Var.f15681a;
                    if (obj9 instanceof g0g0) {
                        obj9 = null;
                    }
                    fqu0 fqu0Var3 = (fqu0) obj9;
                    if (fqu0Var3 != null) {
                        Object obj10 = fqu0Var3.b.f15681a;
                        obj2 = (List) (obj10 instanceof g0g0 ? null : obj10);
                        if (obj2 == null) {
                            obj2 = iun.f15405a;
                        }
                    } else {
                        obj2 = iun.f15405a;
                    }
                } else {
                    obj2 = iun.f15405a;
                }
                feeVar3.d(obj2);
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.addAll((Collection) ((fee) n0o0Var2.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var3.getValue()).b());
                return twn.k(lc00VarB, (Collection) ((fee) n0o0Var.getValue()).b(), lc00VarB);
            case 4:
                boolean z = ((xrs) obj4).c;
                String str = (String) ((vzg0) obj3).a("SUM_TEXT_STATE");
                if (str == null) {
                    str = "";
                }
                return new txu0(z, str, true, new axu0(false, 0.0d, "", 0.0d, "", 0.0d), new fwu0(gwu0.f12046a, hwu0.f13783a, false), null, false, false, 0.0d);
            case 5:
                ((Function1) obj4).invoke(((hdv0) obj3).c);
                return Unit.f46060a;
            case 6:
                mcz mczVarJ = ((xcz) obj4).j();
                float fW0 = ((w6k) obj3).w0(36.0f);
                ncz nczVar = (ncz) CollectionsKt.firstOrNull(mczVarJ.l);
                ncz nczVar2 = (ncz) CollectionsKt.f0(mczVarJ.l);
                return new Pair(Float.valueOf(nczVar != null ? l1e0.c((mczVarJ.m - nczVar.p) / fW0, 0.0f, 1.0f) : 0.0f), Float.valueOf(nczVar2 != null ? l1e0.c(((nczVar2.p + nczVar2.q) - mczVarJ.n) / fW0, 0.0f, 1.0f) : 0.0f));
            case 7:
                ((jhv0) ((w4p0) obj4).b).b((ad3) obj3);
                return Unit.f46060a;
            case 8:
                ((ywv0) obj4).j.m = false;
                ywv0 ywv0Var = ((qwv0) obj3).f29454a;
                pkk0 pkk0Var = (pkk0) ((hgk0) ywv0Var.f43392a.g).getValue();
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                wpq wpqVar = (wpq) ((hgk0) ywv0Var.f43392a.h).getValue();
                if (wpqVar != null) {
                    ((ypq) wpqVar).b(true);
                }
                return Unit.f46060a;
            case 9:
                ((wzu0) obj4).invoke((lwv0) obj3);
                return Unit.f46060a;
            case 10:
                wwv0 wwv0Var = (wwv0) obj4;
                fck0 fck0Var = wwv0Var.f39904a;
                bsv0 bsv0Var = new bsv0((dsv0) fck0Var.b, (esv0) fck0Var.c);
                msv0 msv0Var = new msv0(120.0f);
                ssv0 ssv0Var = ssv0.b;
                g2e0 g2e0Var = wwv0Var.b;
                cxv0 cxv0Var = new cxv0(20.0f, g2e0Var.f10555a);
                ktv0 ktv0Var = wwv0Var.c;
                ywv0 ywv0Var2 = new ywv0(bsv0Var, msv0Var, ssv0Var, new bxv0(cxv0Var, new jtv0(ktv0Var.f18884a, ktv0Var.b, ktv0Var.c, ktv0Var.d, ktv0Var.e), (isv0) g2e0Var.c, g2e0Var.b, false, stv0.f32793a));
                ywv0Var2.f43392a.e((euv0) obj3);
                return ywv0Var2;
            case 11:
                ((ywv0) obj4).f43392a.e((euv0) obj3);
                return Unit.f46060a;
            default:
                return new s4w0((akh0) obj4, (vby) obj3);
        }
    }
}
