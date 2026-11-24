package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.app_update.api.presentation.AppUpdateScreenParams;
import org.xplatform.app_update.impl.navigation.AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.mailing.impl.navigation.MailingScreenFactoryImpl$getMailingManagementFragment$1;

/* JADX INFO: loaded from: classes5.dex */
public final class oej0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ org.xplatform.settings.impl.presentation.a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oej0(org.xplatform.settings.impl.presentation.a aVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = aVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        org.xplatform.settings.impl.presentation.a aVar = this.k;
        switch (b) {
            case 0:
                return new oej0(aVar, yjeVar, (byte) 0);
            case 1:
                return new oej0(aVar, yjeVar, (byte) 1);
            case 2:
                return new oej0(aVar, yjeVar, (byte) 2);
            case 3:
                return new oej0(aVar, yjeVar, (byte) 3);
            case 4:
                return new oej0(aVar, yjeVar, (byte) 4);
            case 5:
                return new oej0(aVar, yjeVar, (byte) 5);
            case 6:
                return new oej0(aVar, yjeVar, (byte) 6);
            case 7:
                return new oej0(aVar, yjeVar, (byte) 7);
            case 8:
                return new oej0(aVar, yjeVar, (byte) 8);
            case 9:
                return new oej0(aVar, yjeVar, (byte) 9);
            case 10:
                return new oej0(aVar, yjeVar, (byte) 10);
            case 11:
                return new oej0(aVar, yjeVar, (byte) 11);
            case 12:
                oej0 oej0Var = new oej0(aVar, yjeVar, (byte) 12);
                oej0Var.j = ((Boolean) obj).booleanValue();
                return oej0Var;
            case 13:
                return new oej0(aVar, yjeVar, (byte) 13);
            default:
                return new oej0(aVar, yjeVar, (byte) 14);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((oej0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((oej0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objE;
        Object objF;
        m2c0 m2c0VarC;
        Object objA2;
        Object objA3;
        Object objA4;
        Object objI;
        Object objB;
        Object value;
        byte b = this.i;
        boolean z = false;
        org.xplatform.settings.impl.presentation.a aVar = this.k;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    im4 im4Var = aVar.m0;
                    ll4 ll4Var = new ll4(aVar.V0);
                    this.j = true;
                    im4Var.getClass();
                    if (im4Var.a(ll4Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    aVar.Y.a();
                    rou rouVar = aVar.w;
                    this.j = true;
                    objA = rouVar.a(false, this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                if (((m2c0) objA).m0) {
                    aVar.G(l1j0.f19257a, null);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (z4) {
                    if (z4) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                rou rouVar2 = aVar.w;
                z = aVar.J0.r0 || aVar.N0;
                this.j = true;
                Object objA5 = rouVar2.a(z, this);
                return objA5 == wneVar3 ? wneVar3 : objA5;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (z5) {
                    if (z5) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                tsu tsuVar = aVar.T;
                boolean z6 = aVar.N0;
                this.j = true;
                Enum enumT = tsuVar.f34479a.t(z6, this);
                return enumT == wneVar4 ? wneVar4 : enumT;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    a6u a6uVar = aVar.k0;
                    this.j = true;
                    objE = a6uVar.E(true, this);
                    if (objE == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                aVar.G(new u0j0(nsm0.l((String) objE, aVar.F.a())), null);
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    nhf0 nhf0Var = aVar.s0;
                    this.j = true;
                    objF = nhf0Var.f(true, false, this);
                    if (objF == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objF = obj;
                }
                gm3 gm3Var = (gm3) objF;
                rek0 rek0Var = aVar.t0;
                AppUpdateScreenParams appUpdateScreenParams = new AppUpdateScreenParams(gm3Var.f11523a, gm3Var.b, gm3Var.c);
                rek0Var.getClass();
                AppUpdateScreenFactoryImpl$getAppUpdateScreen$1 appUpdateScreenFactoryImpl$getAppUpdateScreen$1 = new AppUpdateScreenFactoryImpl$getAppUpdateScreen$1(appUpdateScreenParams);
                i1w0 i1w0Var = aVar.k;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                if (appUpdateScreenFactoryImpl$getAppUpdateScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) appUpdateScreenFactoryImpl$getAppUpdateScreen$1)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(appUpdateScreenFactoryImpl$getAppUpdateScreen$1)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    if (aVar.U.f15225a.a()) {
                        rou rouVar3 = aVar.w;
                        this.j = true;
                        objA2 = rouVar3.a(false, this);
                        if (objA2 == wneVar7) {
                            return wneVar7;
                        }
                    } else {
                        m2c0VarC = u7x.C();
                    }
                    sac.V(jiu0.a(aVar), new wvi0((byte) 26), null, aVar.s.c, new kbh0(m2c0VarC, aVar, yjeVar, (byte) 8), 10);
                    return Unit.f46060a;
                }
                if (!z9) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA2 = obj;
                m2c0VarC = (m2c0) objA2;
                sac.V(jiu0.a(aVar), new wvi0((byte) 26), null, aVar.s.c, new kbh0(m2c0VarC, aVar, yjeVar, (byte) 8), 10);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    rou rouVar4 = aVar.w;
                    this.j = true;
                    objA3 = rouVar4.a(false, this);
                    if (objA3 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                aVar.u0.f6892a.f42100a.f("DELETED_ACCOUNT_ID_KEY", ((m2c0) objA3).S);
                aVar.W0.f(s0j0.f31411a);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z11 = this.j;
                boolean z12 = false;
                if (!z11) {
                    z1x.P(obj);
                    o470 o470Var = aVar.C0;
                    List list = aVar.Q0;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((z540) it.next()).b);
                    }
                    this.j = true;
                    pzu pzuVar = (pzu) o470Var.f24619a;
                    if (qjj.d0(((mne) pzuVar.f).b, new ys8((Object) pzuVar, (Object) arrayList, z12, (yje) null, (byte) 22), this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var2 = aVar.k;
                k0w0 k0w0VarI = cs0.i(i1w0Var2, i1w0Var2);
                aVar.p.getClass();
                k0w0VarI.h(new MailingScreenFactoryImpl$getMailingManagementFragment$1());
                ListIterator listIteratorO2 = b1j.o(i1w0Var2, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    o470 o470Var2 = aVar.C0;
                    List list2 = aVar.Q0;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((z540) it2.next()).b);
                    }
                    this.j = true;
                    pzu pzuVar2 = (pzu) o470Var2.f24619a;
                    if (qjj.d0(((mne) pzuVar2.f).b, new ys8((Object) pzuVar2, (Object) arrayList2, false, (yje) null, (byte) 22), this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z14 = this.j;
                org.xplatform.settings.impl.presentation.a aVar2 = this.k;
                if (!z14) {
                    z1x.P(obj);
                    nou nouVar = aVar2.e0;
                    this.j = true;
                    objA4 = nouVar.a(tl5.c, this);
                    if (objA4 == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA4 = obj;
                }
                ql5 ql5Var = (ql5) objA4;
                sac.V(jiu0.a(aVar2), new kej0(aVar2, (byte) 11), null, aVar2.s.b, new qej0(aVar2, ql5Var.f28916a, aVar2.L0 == pej0.f26857a, null), 10);
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    cmt cmtVar = aVar.K;
                    this.j = true;
                    objI = ((j910) cmtVar.b).i(this);
                    if (objI == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI = obj;
                }
                aVar.G(new x0j0(((kf3) objI).f18179a), null);
                return Unit.f46060a;
            case 12:
                boolean z16 = this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = aVar.X0;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    boolean z17 = z16;
                    if (p7m0Var.m(value2, caj0.a((caj0) value2, false, false, false, null, false, false, null, null, false, false, false, z17, false, false, false, false, null, false, false, false, false, false, 33538047))) {
                        if (!aVar.M0 && z17) {
                            sac.V(jiu0.a(aVar), new kej0(aVar, z ? (byte) 1 : (byte) 0), new lej0(aVar, z ? (byte) 1 : (byte) 0), null, new xej0(aVar, yjeVar, b2), 12);
                        }
                        aVar.M0 = z17;
                        return Unit.f46060a;
                    }
                    z16 = z17;
                }
                break;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    sd60 sd60VarI = ((uii) aVar.r.f43005a).I();
                    this.j = true;
                    if (sd60VarI.i("", this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar15 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    ahu ahuVar = aVar.f;
                    this.j = true;
                    objB = ahuVar.b(bm5.f2822a, this);
                    if (objB == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                baj0 baj0Var = new baj0(aVar.i0.a(), ((ql5) objB).f, aVar.K0 ? false : aVar.g0.g());
                p7m0 p7m0Var2 = aVar.X0;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, caj0.a((caj0) value, false, false, false, null, false, false, null, baj0Var, false, false, false, false, false, false, false, false, null, false, false, false, false, false, 33553919)));
                return Unit.f46060a;
        }
    }
}
