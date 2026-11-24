package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p5m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26410a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p5m(Object obj, Object obj2, byte b) {
        this.f26410a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26410a;
        byte b2 = 7;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                bkb.r((mm40) obj4, (r5m) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                ckb.I((mm40) obj4, (e6m) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                xkb.C((mm40) obj4, (j8n) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                ulb.j((mm40) obj4, (i8n) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                oja0.u((mm40) obj4, (b7m) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                oja0.U((mm40) obj4, (an90) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                dub.y((mm40) obj4, (l7m) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                dub.m((mm40) obj4, (f7m) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                fbc.s((x7z) obj4, (m9m) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                o9m.c((mm40) obj4, (n9m) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                vbc.w((ybm) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                vfc.n((mm40) obj4, (lcm) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 12:
                vkm vkmVar = (vkm) obj4;
                imm immVar = (imm) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.X();
                } else if (vkmVar.b) {
                    fetVar.e0(-1923374231);
                    hlm.a(immVar, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1923298095);
                    hlm.f(immVar, fetVar, 0);
                    fetVar.r(false);
                }
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                dub.M((mm40) obj4, (uj60) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                omm ommVar = (omm) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dub.b(o7k0.d(jm40.b, 1.0f), ommVar, function1, fetVar2, 6);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 15:
                omm ommVar2 = (omm) obj4;
                xk80 xk80Var = (xk80) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ommVar2.getClass();
                    fetVar3.e0(1764259639);
                    dub.L(null, xk80Var, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                dub.L((mm40) obj4, (xk80) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                r1n r1nVar = (r1n) obj4;
                k6z k6zVar = (k6z) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ulb.m(null, vjm.f37535a, r1nVar.d, r1nVar.e, k6zVar == k6z.b, 0L, fetVar4, 432, 65);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                rcb.A((mm40) obj4, (r1n) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                rcb.Q((mm40) obj4, (u1n) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                s1n s1nVar = (s1n) obj4;
                k6z k6zVar2 = (k6z) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ulb.m(null, vjm.f37535a, s1nVar.e, s1nVar.f, k6zVar2 == k6z.b, 0L, fetVar5, 432, 65);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                vdb.y((mm40) obj4, (s1n) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                vdb.O((mm40) obj4, (v1n) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                feb.o((mm40) obj4, (n4i) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                q56 q56Var = (q56) obj4;
                Function1 function2 = (Function1) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    long jA = q56Var.a();
                    t76 t76VarD = q56Var.d();
                    function2.getClass();
                    pz40 pz40VarF = androidx.compose.runtime.e.f(Long.valueOf(jA), fetVar6);
                    Object objP = fetVar6.P();
                    if (objP == cl5Var) {
                        objP = new jg2(function2, pz40VarF, b2);
                        fetVar6.o0(objP);
                    }
                    Function1 function3 = (Function1) objP;
                    boolean z = t76VarD instanceof o76;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar6.e0(-1153387990);
                        aac.i(jm40Var, ((o76) t76VarD).f24770a, function3, fetVar6, 384, 0);
                        fetVar6.r(false);
                    } else if (t76VarD instanceof s76) {
                        fetVar6.e0(-1153141974);
                        aac.i(jm40Var, ((s76) t76VarD).f31734a, function3, fetVar6, 384, 0);
                        fetVar6.r(false);
                    } else if (t76VarD instanceof r76) {
                        fetVar6.e0(-1152891990);
                        aac.i(jm40Var, ((r76) t76VarD).f29963a, function3, fetVar6, 384, 0);
                        fetVar6.r(false);
                    } else if (t76VarD instanceof q76) {
                        fetVar6.e0(-1152646966);
                        aac.i(jm40Var, ((q76) t76VarD).f28235a, function3, fetVar6, 384, 0);
                        fetVar6.r(false);
                    } else {
                        if (!(t76VarD instanceof p76)) {
                            throw b1j.f(239887031, fetVar6, false);
                        }
                        fetVar6.e0(-1152397974);
                        aac.i(jm40Var, ((p76) t76VarD).f26492a, function3, fetVar6, 384, 0);
                        fetVar6.r(false);
                    }
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                w56 w56Var = (w56) obj4;
                Function1 function4 = (Function1) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    long jA2 = w56Var.a();
                    o96 o96VarD = w56Var.d();
                    function4.getClass();
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f(Long.valueOf(jA2), fetVar7);
                    Object objP2 = fetVar7.P();
                    if (objP2 == cl5Var) {
                        objP2 = new jg2(function4, pz40VarF2, (byte) 8);
                        fetVar7.o0(objP2);
                    }
                    Function1 function5 = (Function1) objP2;
                    boolean z2 = o96VarD instanceof j96;
                    jm40 jm40Var2 = jm40.b;
                    if (z2) {
                        fetVar7.e0(82008538);
                        aac.i(jm40Var2, ((j96) o96VarD).f16121a, function5, fetVar7, 384, 0);
                        fetVar7.r(false);
                    } else if (o96VarD instanceof n96) {
                        fetVar7.e0(82254554);
                        aac.i(jm40Var2, ((n96) o96VarD).f23123a, function5, fetVar7, 384, 0);
                        fetVar7.r(false);
                    } else if (o96VarD instanceof m96) {
                        fetVar7.e0(82504538);
                        aac.i(jm40Var2, ((m96) o96VarD).f21396a, function5, fetVar7, 384, 0);
                        fetVar7.r(false);
                    } else if (o96VarD instanceof l96) {
                        fetVar7.e0(82749562);
                        aac.i(jm40Var2, ((l96) o96VarD).f19635a, function5, fetVar7, 384, 0);
                        fetVar7.r(false);
                    } else {
                        if (!(o96VarD instanceof k96)) {
                            throw b1j.f(-690092793, fetVar7, false);
                        }
                        fetVar7.e0(82998554);
                        aac.i(jm40Var2, ((k96) o96VarD).f17900a, function5, fetVar7, 384, 0);
                        fetVar7.r(false);
                    }
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                bkb.i((mm40) obj4, (vnm) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                ckb.l((mm40) obj4, (wnm) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                gkb.k((mm40) obj4, (xnm) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                fxb.v((mm40) obj4, (uum) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ p5m(Object obj, Object obj2, int i, byte b) {
        this.f26410a = b;
        this.b = obj;
        this.c = obj2;
    }
}
