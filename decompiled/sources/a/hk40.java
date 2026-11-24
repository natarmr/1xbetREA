package a;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class hk40 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = e000Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new hk40((gmq) this.l, (clz) obj3, (xr10) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (xr10) obj2, yjeVar);
            case 2:
                hk40 hk40Var = new hk40(obj3, obj2, yjeVar, (byte) 2);
                hk40Var.l = obj;
                return hk40Var;
            case 3:
                lkz lkzVar3 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (e000) obj2, yjeVar);
            case 4:
                lkz lkzVar4 = lkz.f20223a;
                return new hk40((gmq) this.l, (clz) obj3, (m450) obj2, yjeVar);
            case 5:
                lkz lkzVar5 = lkz.f20223a;
                return new hk40((gmq) this.l, (clz) obj3, (m450) obj2, yjeVar, (byte) 0);
            case 6:
                return new hk40(this.l, obj3, obj2, yjeVar, (byte) 6);
            case 7:
                return new hk40(this.l, obj3, obj2, yjeVar, (byte) 7);
            case 8:
                return new hk40(this.l, obj3, obj2, yjeVar, (byte) 8);
            case 9:
                return new hk40(this.l, obj3, this.m, yjeVar, (byte) 9);
            case 10:
                hk40 hk40Var2 = new hk40(obj3, obj2, yjeVar, (byte) 10);
                hk40Var2.l = obj;
                return hk40Var2;
            case 11:
                hk40 hk40Var3 = new hk40(obj3, obj2, yjeVar, (byte) 11);
                hk40Var3.l = obj;
                return hk40Var3;
            case 12:
                hk40 hk40Var4 = new hk40(obj3, obj2, yjeVar, (byte) 12);
                hk40Var4.l = obj;
                return hk40Var4;
            case 13:
                lkz lkzVar6 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (e000) obj2, yjeVar, (byte) 0);
            case 14:
                lkz lkzVar7 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (e000) obj2, yjeVar, (char) 0);
            case 15:
                lkz lkzVar8 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar);
            case 16:
                lkz lkzVar9 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar, (byte) 0);
            case 17:
                hk40 hk40Var5 = new hk40(obj3, obj2, yjeVar, (byte) 17);
                hk40Var5.l = obj;
                return hk40Var5;
            case 18:
                hk40 hk40Var6 = new hk40(obj3, obj2, yjeVar, (byte) 18);
                hk40Var6.l = obj;
                return hk40Var6;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar10 = lkz.f20223a;
                return new hk40((xae0) this.l, (clz) obj3, (vr50) obj2, yjeVar);
            case 20:
                lkz lkzVar11 = lkz.f20223a;
                return new hk40((gmq) this.l, (clz) obj3, (vr50) obj2, yjeVar);
            case 21:
                lkz lkzVar12 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar, (char) 0);
            case 22:
                return new hk40(this.l, obj3, obj2, yjeVar, (byte) 22);
            case 23:
                lkz lkzVar13 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar, 0);
            case 24:
                lkz lkzVar14 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar, (short) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar15 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar, (byte) 0, false);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new hk40(this.l, obj3, obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar16 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar, (byte) 0, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar17 = lkz.f20223a;
                return new hk40((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar, (byte) 0, (char) 0);
            default:
                return new hk40(this.l, obj3, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((hk40) create((hpa0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((hk40) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((hk40) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((hk40) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((hk40) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((hk40) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hk40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023e  */
    /* JADX WARN: Code duplicated, block: B:436:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x021e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0229 A[LOOP:1: B:90:0x0218->B:95:0x0229, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x022f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [a.dn0] */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v68 */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Long] */
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
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objD;
        Object objI;
        Function0 g8lVar;
        Object objM0;
        Object objM1;
        nv70 nv70Var;
        Pair pair;
        int i;
        List list;
        Iterator it;
        byte b = 2;
        byte b2 = 10;
        byte b3 = 11;
        byte b4 = 15;
        byte b5 = 3;
        byte b6 = 12;
        byte b7 = 16;
        byte b8 = 13;
        byte b9 = 0;
        int i2 = 0;
        b9 = 0;
        ?? l = 0;
        Object obj2 = null;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var = new kb40((xr10) this.m, b);
                    this.j = true;
                    if (bq9VarB.c(kb40Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var2 = new kb40((xr10) this.m, b5);
                    this.j = true;
                    if (bq9VarB2.c(kb40Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    hpa0 hpa0Var = (hpa0) this.l;
                    j6u0 j6u0Var = new j6u0();
                    fs40 fs40Var = new fs40((lms0) this.k, b9);
                    s43 s43Var = new s43(j6u0Var, b8);
                    htb htbVar = (htb) this.m;
                    gs40 gs40Var = new gs40(htbVar, j6u0Var, b9);
                    gs40 gs40Var2 = new gs40(htbVar, j6u0Var, (byte) 1);
                    hs40 hs40Var = new hs40(j6u0Var, htbVar, b9);
                    this.j = true;
                    Object objY = ebc.Y(hpa0Var, new es40(fs40Var, s43Var, hs40Var, gs40Var2, gs40Var, null), this);
                    Object obj3 = objY;
                    if (objY != wneVar3) {
                        obj3 = Unit.f46060a;
                    }
                    if (obj3 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var3 = new kb40((e000) this.m, (byte) 5);
                    this.j = true;
                    if (bq9VarB3.c(kb40Var3, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var4 = new kb40((m450) this.m, (byte) 6);
                    this.j = true;
                    if (bq9VarB4.c(kb40Var4, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bq9 bq9VarB5 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var5 = new kb40((m450) this.m, (byte) 7);
                    this.j = true;
                    if (bq9VarB5.c(kb40Var5, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                d650 d650Var = (d650) this.l;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    xfu xfuVar = d650Var.v0;
                    long jLongValue = ((Long) this.k).longValue();
                    this.j = true;
                    objD = xfuVar.d(jLongValue, this);
                    if (objD == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD = obj;
                }
                String str = (String) objD;
                vbj qbjVar = !StringsKt.W(str) ? new qbj(new g8y(str, (lr5) this.m), false) : nbj.f23243a;
                int i3 = d650.k1;
                d650Var.b0(qbjVar);
                return Unit.f46060a;
            case 7:
                ha8 ha8Var = (ha8) this.m;
                p850 p850Var = (p850) this.l;
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    age ageVar = (age) this.k;
                    this.j = true;
                    int i4 = p850.p0;
                    xi0 xi0Var = (xi0) ageVar.f819a.a();
                    Integer num = xi0Var.c;
                    if (num != null && num.intValue() == 847) {
                        objI = p850Var.l0.z(xi0Var.d, num.intValue(), this, xi0Var.e);
                    } else if (num != null && num.intValue() == 825) {
                        objI = p850Var.l0.z(xi0Var.d, num.intValue(), this, xi0Var.e);
                    } else if (num != null && num.intValue() == 824) {
                        objI = p850Var.l0.z(xi0Var.d, num.intValue(), this, xi0Var.e);
                    } else {
                        ali aliVar = p850Var.k0;
                        Integer num2 = xi0Var.h;
                        l = num != null ? new Long(num.intValue()) : 0;
                        String str2 = xi0Var.e;
                        int i5 = xi0Var.d;
                        sff0 sff0VarA = ((pru) aliVar.c).a();
                        nbu nbuVar = (nbu) aliVar.f1068a;
                        objI = nbuVar.f23258a.i(num2, l, str2, i5, ((ntu) aliVar.b).a(), ((iqt) aliVar.d).f15225a.a(), nbuVar.b.f15748a.a(), sff0VarA.b.N, this);
                    }
                    if (objI == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI = obj;
                }
                List list2 = (List) objI;
                if (list2.isEmpty()) {
                    b850 b850Var = new b850(ha8Var.getKey(), b5);
                    int i6 = p850.p0;
                    p850Var.H(b850Var);
                } else {
                    d850 d850Var = new d850(b9, ha8Var.getKey(), list2);
                    int i7 = p850.p0;
                    p850Var.H(d850Var);
                }
                return Unit.f46060a;
            case 8:
                oms0 oms0Var = (oms0) this.l;
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new kb50(oms0Var, b9));
                    yj2 yj2Var = new yj2((Object) oms0Var, this.k, this.m, (byte) 27);
                    this.j = true;
                    Object objC = vsg0VarV.c(new nr30(yj2Var, b6), this);
                    if (objC != wneVar9) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(ydx.V(null, (Function0) this.l));
                    clu cluVar = new clu((qj50) this.k, this.m, (byte) 21);
                    this.j = true;
                    if (gmqVarW.c(cluVar, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    hzb0 hzb0Var = (hzb0) this.l;
                    NetworkRequest networkRequestA = ((o4e) this.k).a();
                    if (networkRequestA == null) {
                        sl50 sl50Var = ((o4e) this.k).f24629a;
                        if (sl50Var == sl50.f32381a) {
                            networkRequestA = null;
                        } else {
                            NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                            if (Build.VERSION.SDK_INT < 30 || sl50Var != sl50.f) {
                                int iOrdinal = sl50Var.ordinal();
                                if (iOrdinal == 2) {
                                    builderRemoveCapability = builderRemoveCapability.addCapability(11);
                                } else if (iOrdinal == 3) {
                                    builderRemoveCapability = builderRemoveCapability.addCapability(18);
                                } else if (iOrdinal == 4) {
                                    builderRemoveCapability = builderRemoveCapability.addTransportType(0);
                                }
                                networkRequestA = builderRemoveCapability.build();
                            } else {
                                networkRequestA = builderRemoveCapability.addCapability(25).build();
                            }
                        }
                    }
                    if (networkRequestA == null) {
                        hzb0Var.getClass();
                        hzb0Var.e0(null);
                        return Unit.f46060a;
                    }
                    rw40 rw40Var = new rw40(qjj.W(hzb0Var, null, null, new j940((il50) this.m, hzb0Var, l, b8), 3), hzb0Var, (byte) 10);
                    if (Build.VERSION.SDK_INT >= 30) {
                        uoj0 uoj0Var = uoj0.f36019a;
                        ConnectivityManager connectivityManager = ((il50) this.m).f14959a;
                        uoj0Var.getClass();
                        synchronized (uoj0.b) {
                            LinkedHashMap linkedHashMap = uoj0.c;
                            if (linkedHashMap.isEmpty()) {
                                wv00.f().a(pov0.f27347a, "NetworkRequestConstraintController register shared callback");
                                try {
                                    connectivityManager.registerDefaultNetworkCallback(uoj0Var);
                                } catch (SecurityException e) {
                                    wv00.f().e(pov0.f27347a, "NetworkRequestConstraintController couldn't register callback", e);
                                    rw40Var.invoke(new v4e(7));
                                    g8lVar = new hwi0((byte) 13);
                                }
                            } else if (uoj0.e && uoj0.f != null) {
                                wv00.f().a(pov0.f27347a, "NetworkRequestConstraintController send initial capabilities");
                                NetworkCapabilities networkCapabilities = uoj0.d;
                                Boolean bool = uoj0.f;
                                bool.getClass();
                                if (!bool.booleanValue() && networkRequestA.canBeSatisfiedBy(networkCapabilities)) {
                                    b9 = 1;
                                }
                                rw40Var.invoke(b9 != 0 ? u4e.f35042a : new v4e(7));
                            }
                            break;
                        }
                        g8lVar = new x6h0(rw40Var, connectivityManager, (byte) 21);
                    } else {
                        int i8 = o1e.c;
                        ConnectivityManager connectivityManager2 = ((il50) this.m).f14959a;
                        o1e o1eVar = new o1e(rw40Var);
                        hie0 hie0Var = new hie0();
                        try {
                            wv00.f().a(pov0.f27347a, "NetworkRequestConstraintController register callback");
                            connectivityManager2.registerNetworkCallback(networkRequestA, o1eVar);
                            hie0Var.f13108a = true;
                        } catch (SecurityException e2) {
                            wv00.f().e(pov0.f27347a, "NetworkRequestConstraintController couldn't register callback", e2);
                            rw40Var.invoke(new v4e(7));
                        } catch (RuntimeException e3) {
                            if (!kotlin.text.c.n(e3.getClass().getName(), "TooManyRequestsException", false)) {
                                throw e3;
                            }
                            wv00.f().c(pov0.f27347a, "NetworkRequestConstraintController couldn't register callback", e3);
                            rw40Var.invoke(new v4e(7));
                        }
                        g8lVar = new g8l(hie0Var, connectivityManager2, o1eVar, b7);
                    }
                    a2z a2zVar = new a2z(g8lVar, (byte) 18);
                    this.j = true;
                    if (q7x.t(hzb0Var, a2zVar, this) == wneVar11) {
                        return wneVar11;
                    }
                    break;
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                qpg0 qpg0Var = (qpg0) this.l;
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    sj3 sj3Var = ((vn50) this.k).b;
                    un50 un50Var = (un50) this.m;
                    this.l = null;
                    this.j = true;
                    objM0 = sj3Var.m0(qpg0Var, un50Var, this);
                    if (objM0 == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objM0 = obj;
                }
                return new Long(((Number) objM0).longValue());
            case 12:
                qpg0 qpg0Var2 = (qpg0) this.l;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    sj3 sj3Var2 = ((vn50) this.k).b;
                    ArrayList arrayList = (ArrayList) this.m;
                    this.l = null;
                    this.j = true;
                    if (sj3Var2.k0(qpg0Var2, arrayList) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var6 = new kb40((e000) this.m, (byte) 8);
                    this.j = true;
                    if (bq9VarB6.c(kb40Var6, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var7 = new kb40((e000) this.m, (byte) 9);
                    this.j = true;
                    if (bq9VarB7.c(kb40Var7, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var8 = new kb40((gq50) this.m, b2);
                    this.j = true;
                    if (bq9VarB8.c(kb40Var8, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    bq9 bq9VarB9 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var9 = new kb40((gq50) this.m, b3);
                    this.j = true;
                    if (bq9VarB9.c(kb40Var9, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                qpg0 qpg0Var3 = (qpg0) this.l;
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    sj3 sj3Var3 = ((sr50) this.k).b;
                    rr50 rr50Var = (rr50) this.m;
                    this.l = null;
                    this.j = true;
                    objM1 = sj3Var3.m0(qpg0Var3, rr50Var, this);
                    if (objM1 == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objM1 = obj;
                }
                return new Long(((Number) objM1).longValue());
            case 18:
                qpg0 qpg0Var4 = (qpg0) this.l;
                wne wneVar19 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    sj3 sj3Var4 = ((sr50) this.k).b;
                    ArrayList arrayList2 = (ArrayList) this.m;
                    this.l = null;
                    this.j = true;
                    if (sj3Var4.k0(qpg0Var4, arrayList2) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var10 = new kb40((vr50) this.m, b6);
                    this.j = true;
                    if (bq9VarB10.c(kb40Var10, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var11 = new kb40((vr50) this.m, b8);
                    this.j = true;
                    if (bq9VarB11.c(kb40Var11, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var12 = new kb40((gq50) this.m, (byte) 14);
                    this.j = true;
                    if (bq9VarB12.c(kb40Var12, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                int i9 = ((uo5) this.m).f35994a;
                wne wneVar23 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    ut50 ut50Var = (ut50) this.l;
                    wv70 wv70Var = ut50Var.p;
                    int i10 = ((ct5) this.k).f4919a;
                    for (Object obj4 : ut50Var.r) {
                        if (((xs5) ((Pair) obj4).f46059a).f41399a == i9) {
                            obj2 = obj4;
                            pair = (Pair) obj2;
                            i = -1000;
                            i = -1000;
                            i = -1000;
                            if (pair != null && (list = (List) pair.b) != null) {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        i2 = -1;
                                    } else if (((kr5) it.next()).b == i10) {
                                        i2++;
                                    }
                                }
                                if (i2 >= 0) {
                                    i = i2;
                                }
                            }
                            nv70Var = new nv70(i10, i, i9);
                            this.j = true;
                            wv70Var.getClass();
                            if (wv70Var.a(nv70Var, this) == wneVar23) {
                                return wneVar23;
                            }
                        }
                    }
                    pair = (Pair) obj2;
                    i = -1000;
                    i = -1000;
                    i = -1000;
                    if (pair != null) {
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i2 = -1;
                            } else if (((kr5) it.next()).b == i10) {
                                i2++;
                            }
                        }
                        if (i2 >= 0) {
                            i = i2;
                        }
                    }
                    nv70Var = new nv70(i10, i, i9);
                    this.j = true;
                    wv70Var.getClass();
                    if (wv70Var.a(nv70Var, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var13 = new kb40((gq50) this.m, b4);
                    this.j = true;
                    if (bq9VarB13.c(kb40Var13, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var14 = new kb40((gq50) this.m, b7);
                    this.j = true;
                    if (bq9VarB14.c(kb40Var14, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var15 = new kb40((gq50) this.m, (byte) 17);
                    this.j = true;
                    if (bq9VarB15.c(kb40Var15, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    ekf0 ekf0Var = (ekf0) this.l;
                    String str3 = ((d160) this.k).c;
                    long j = ((l2l0) ((m2l0) this.m)).f19315a;
                    this.j = true;
                    if (ekf0Var.h(str3, j, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB16 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var16 = new kb40((gq50) this.m, (byte) 19);
                    this.j = true;
                    if (bq9VarB16.c(kb40Var16, this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    kb40 kb40Var17 = new kb40((gq50) this.m, (byte) 20);
                    this.j = true;
                    if (bq9VarB17.c(kb40Var17, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                ywv0 ywv0Var = (ywv0) this.k;
                wne wneVar30 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    mie0 mie0VarJ = ohs0.j(obj);
                    vsg0 vsg0VarV2 = ydx.V((ufk0) this.l, new wd60(ywv0Var, (l7m0) this.m));
                    clu cluVar2 = new clu(mie0VarJ, ywv0Var, (byte) 23);
                    this.j = true;
                    if (vsg0VarV2.c(cluVar2, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = e000Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = e000Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, xr10 xr10Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = xr10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(gmq gmqVar, clz clzVar, xr10 xr10Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = xr10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(gmq gmqVar, clz clzVar, m450 m450Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = m450Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(gmq gmqVar, clz clzVar, m450 m450Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = m450Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(gmq gmqVar, clz clzVar, vr50 vr50Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = vr50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk40(xae0 xae0Var, clz clzVar, vr50 vr50Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = vr50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk40(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk40(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = obj2;
        this.m = obj3;
    }
}
