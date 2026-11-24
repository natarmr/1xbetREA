package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mcd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21546a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ p3w c;

    public /* synthetic */ mcd(p3w p3wVar, Function1 function1, byte b) {
        this.f21546a = b;
        this.c = p3wVar;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21546a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        p3w p3wVar = this.c;
        Function1 function1 = this.b;
        byte b2 = 3;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wul wulVar = new wul(qul.e, oe9.f25112a, new te9(p3wVar.i), true, false, false);
                    boolean zG = fetVar.g(function1) | fetVar.g(p3wVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new gbd(function1, p3wVar, (byte) 2);
                        fetVar.o0(objP);
                    }
                    qzb.n(null, wulVar, (Function0) objP, fetVar, 0, 1);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    wul wulVar2 = new wul(qul.e, oe9.f25112a, new te9(R.drawable.ic_glyph_more_vertically), true, false, false);
                    mm40 mm40VarE0 = o2e.e0(jm40Var, "THREE_DOTS_BUTTON_COMPACT_CARD");
                    boolean zG2 = fetVar2.g(function1) | fetVar2.g(p3wVar);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new gbd(function1, p3wVar, (byte) 3);
                        fetVar2.o0(objP2);
                    }
                    qzb.n(mm40VarE0, wulVar2, (Function0) objP2, fetVar2, 6, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fetVar3.X();
                } else if (p3wVar.l) {
                    fetVar3.e0(-1263854696);
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(322225117, new mcd(p3wVar, function1, b2), fetVar3), fetVar3, 56);
                    fetVar3.r(false);
                } else {
                    fetVar3.e0(-1262917380);
                    fetVar3.r(false);
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 0.0f, 8.0f, 4.0f, 2);
                    wul wulVar3 = new wul(lul.e, oe9.c, new ue9(p3wVar.m), true, false, false);
                    boolean zG3 = fetVar4.g(function1) | fetVar4.g(p3wVar);
                    Object objP3 = fetVar4.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new gbd(function1, p3wVar, (byte) 5);
                        fetVar4.o0(objP3);
                    }
                    qzb.n(mm40VarN, wulVar3, (Function0) objP3, fetVar4, 0, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarG = o7k0.g(jm40Var, 0.0f, 32.0f, 1);
                    wul wulVar4 = new wul(qul.e, oe9.f25112a, new te9(p3wVar.i), true, false, false);
                    boolean zG4 = fetVar5.g(function1) | fetVar5.g(p3wVar);
                    Object objP4 = fetVar5.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new gbd(function1, p3wVar, (byte) 8);
                        fetVar5.o0(objP4);
                    }
                    qzb.n(mm40VarG, wulVar4, (Function0) objP4, fetVar5, 0, 0);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE1 = o2e.e0(o7k0.g(jm40Var, 0.0f, 32.0f, 1), "THREE_DOTS_BUTTON_FULL_CARD");
                    wul wulVar5 = new wul(qul.e, oe9.f25112a, new te9(R.drawable.ic_glyph_more_vertically), true, false, false);
                    boolean zG5 = fetVar6.g(function1) | fetVar6.g(p3wVar);
                    Object objP5 = fetVar6.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new gbd(function1, p3wVar, (byte) 7);
                        fetVar6.o0(objP5);
                    }
                    qzb.n(mm40VarE1, wulVar5, (Function0) objP5, fetVar6, 0, 0);
                } else {
                    fetVar6.X();
                }
                break;
            default:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarG2 = o7k0.g(jm40Var, 0.0f, 32.0f, 1);
                    wul wulVar6 = new wul(qul.e, oe9.f25112a, new te9(R.drawable.ic_glyph_copy), true, false, false);
                    boolean zG6 = fetVar7.g(function1) | fetVar7.g(p3wVar);
                    Object objP6 = fetVar7.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new gbd(function1, p3wVar, (byte) 6);
                        fetVar7.o0(objP6);
                    }
                    qzb.n(mm40VarG2, wulVar6, (Function0) objP6, fetVar7, 0, 0);
                } else {
                    fetVar7.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ mcd(Function1 function1, p3w p3wVar, byte b) {
        this.f21546a = b;
        this.b = function1;
        this.c = p3wVar;
    }
}
