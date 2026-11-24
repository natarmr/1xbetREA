package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vxb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                vxb vxbVar = new vxb(obj2, yjeVar, (byte) 0);
                vxbVar.l = obj;
                return vxbVar;
            case 1:
                gmq gmqVar = (gmq) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new vxb(gmqVar, clzVar, (q0c) obj2, yjeVar);
            case 2:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new vxb(gmqVar2, clzVar2, (q0c) obj2, yjeVar, (byte) 0);
            case 3:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new vxb(gmqVar3, clzVar3, (q0c) obj2, yjeVar, (char) 0);
            case 4:
                vxb vxbVar2 = new vxb(this.k, obj2, yjeVar, (byte) 4);
                vxbVar2.l = obj;
                return vxbVar2;
            case 5:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new vxb(gmqVar4, clzVar4, (k5c) obj2, yjeVar);
            case 6:
                dnq dnqVar = (dnq) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new vxb(dnqVar, clzVar5, (k5c) obj2, yjeVar);
            case 7:
                vxb vxbVar3 = new vxb(this.k, obj2, yjeVar, (byte) 7);
                vxbVar3.l = obj;
                return vxbVar3;
            case 8:
                vxb vxbVar4 = new vxb((p5a) this.k, yjeVar, (v7c) obj2);
                vxbVar4.l = obj;
                return vxbVar4;
            case 9:
                i89 i89Var = (i89) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new vxb(i89Var, clzVar6, (o47) obj2, yjeVar);
            case 10:
                i89 i89Var2 = (i89) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new vxb(i89Var2, clzVar7, (o47) obj2, yjeVar, (byte) 0);
            case 11:
                i89 i89Var3 = (i89) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new vxb(i89Var3, clzVar8, (o47) obj2, yjeVar, (char) 0);
            case 12:
                return new vxb(obj2, yjeVar, (byte) 12);
            case 13:
                i89 i89Var4 = (i89) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new vxb(i89Var4, clzVar9, (mhc) obj2, yjeVar);
            case 14:
                i89 i89Var5 = (i89) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new vxb(i89Var5, clzVar10, (mhc) obj2, yjeVar, (byte) 0);
            case 15:
                i89 i89Var6 = (i89) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new vxb(i89Var6, clzVar11, (mhc) obj2, yjeVar, (char) 0);
            case 16:
                i89 i89Var7 = (i89) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new vxb(i89Var7, clzVar12, (mhc) obj2, yjeVar, 0);
            case 17:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new vxb(gmqVar5, clzVar13, (c48) obj2, yjeVar);
            case 18:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new vxb(gmqVar6, clzVar14, (c48) obj2, yjeVar, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xae0 xae0Var = (xae0) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new vxb(xae0Var, clzVar15, (rvc) obj2, yjeVar);
            case 20:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new vxb(gmqVar7, clzVar16, (rvc) obj2, yjeVar);
            case 21:
                p7m0 p7m0Var = (p7m0) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new vxb(p7m0Var, clzVar17, (xwc) obj2, yjeVar);
            case 22:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new vxb(gmqVar8, clzVar18, (xwc) obj2, yjeVar);
            case 23:
                i89 i89Var8 = (i89) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new vxb(i89Var8, clzVar19, (xwc) obj2, yjeVar);
            case 24:
                vxb vxbVar5 = new vxb(this.k, obj2, yjeVar, (byte) 24);
                vxbVar5.l = obj;
                return vxbVar5;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                dnq dnqVar2 = (dnq) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new vxb(dnqVar2, clzVar20, (mud) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                dnq dnqVar3 = (dnq) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new vxb(dnqVar3, clzVar21, (mud) obj2, yjeVar, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new vxb(gmqVar9, clzVar22, (mud) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i89 i89Var9 = (i89) this.k;
                clz clzVar23 = (clz) this.l;
                lkz lkzVar23 = lkz.f20223a;
                return new vxb(i89Var9, clzVar23, (mhc) obj2, yjeVar, (short) 0);
            default:
                dnq dnqVar4 = (dnq) this.k;
                clz clzVar24 = (clz) this.l;
                lkz lkzVar24 = lkz.f20223a;
                return new vxb(dnqVar4, clzVar24, (dxd) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((vxb) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.vne] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.bby] */
    /* JADX WARN: Type inference failed for: r1v5, types: [a.bby] */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object value;
        Object value2;
        String strA;
        Object objD;
        String str;
        Object objN;
        byte b = this.i;
        byte b2 = 0;
        byte b3 = 4;
        byte b4 = 10;
        byte b5 = 3;
        Object obj2 = this.m;
        byte b6 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                yxb yxbVar = (yxb) obj2;
                ?? r1 = (vne) this.l;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                try {
                    if (!z) {
                        z1x.P(obj);
                        c4m0 c4m0VarW = qjj.W(r1, null, null, new mxb(yxbVar, yjeVar, b3), 3);
                        jcl jclVar = yxbVar.h;
                        this.l = null;
                        this.k = c4m0VarW;
                        this.j = true;
                        objB = jclVar.b(60, this, true);
                        r1 = c4m0VarW;
                        if (objB == wneVar) {
                            return wneVar;
                        }
                    } else {
                        if (!z) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c4m0 c4m0Var = (c4m0) this.k;
                        z1x.P(obj);
                        objB = obj;
                        r1 = c4m0Var;
                    }
                    if (((List) objB).size() < 60) {
                        yxbVar.B = true;
                        break;
                    }
                    r1.cancel(null);
                    return Unit.f46060a;
                } catch (Throwable th) {
                    r1.cancel(null);
                    throw th;
                }
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    f5b f5bVar = new f5b((q0c) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB.c(f5bVar, this) == wneVar2) {
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
                    bq9 bq9VarB2 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    f5b f5bVar2 = new f5b((q0c) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB2.c(f5bVar2, this) == wneVar3) {
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
                    bq9 bq9VarB3 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    f5b f5bVar3 = new f5b((q0c) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB3.c(f5bVar3, this) == wneVar4) {
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
                vne vneVar = (vne) this.l;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    p7m0 p7m0Var = ((s1c) this.k).x;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, f1c.a((f1c) value, null, false, false, true, 127)));
                    this.l = null;
                    this.j = true;
                    if (((Function2) obj2).invoke(vneVar, this) == wneVar5) {
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
                    bq9 bq9VarB4 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.e);
                    f5b f5bVar4 = new f5b((k5c) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB4.c(f5bVar4, this) == wneVar6) {
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
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bq9 bq9VarB5 = hkb.B((dnq) this.k, ((clz) this.l).x(), lkz.d);
                    f5b f5bVar5 = new f5b((k5c) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB5.c(f5bVar5, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                vne vneVar2 = (vne) this.l;
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    p7m0 p7m0Var2 = ((v7c) this.k).Q;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, i7c.a((i7c) value2, null, null, null, null, false, false, true, 8191)));
                    this.l = null;
                    this.j = true;
                    if (((Function2) obj2).invoke(vneVar2, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    kmq kmqVar = (kmq) this.l;
                    p5a p5aVar = (p5a) this.k;
                    na naVar = new na(kmqVar, (v7c) obj2, (byte) 21);
                    this.l = null;
                    this.j = true;
                    if (p5aVar.c(naVar, this) == wneVar9) {
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
                    bq9 bq9VarB6 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar = new idc((o47) obj2, b2);
                    this.j = true;
                    if (bq9VarB6.c(idcVar, this) == wneVar10) {
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
                    bq9 bq9VarB7 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar2 = new idc((o47) obj2, b6);
                    this.j = true;
                    if (bq9VarB7.c(idcVar2, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar3 = new idc((o47) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB8.c(idcVar3, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                ygc ygcVar = (ygc) obj2;
                ctf0 ctf0Var = ygcVar.u;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    String strA2 = ctf0Var.b.a(R.string.language_selection_new, Arrays.copyOf(new Object[0], 0));
                    strA = ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
                    f4u f4uVar = ygcVar.q;
                    this.k = strA2;
                    this.l = strA;
                    this.j = true;
                    objD = f4uVar.d(this);
                    if (objD == wneVar13) {
                        return wneVar13;
                    }
                    str = strA2;
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    strA = (String) this.l;
                    String str2 = (String) this.k;
                    z1x.P(obj);
                    str = str2;
                    objD = obj;
                }
                String str3 = strA;
                List list = (List) objD;
                String strA3 = ygcVar.p.a();
                p7m0 p7m0Var3 = ygcVar.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    value3.getClass();
                    String str4 = str;
                    String str5 = str3;
                    if (p7m0Var3.m(value3, egc.a((egc) value3, str, str3, null, dyb.o0(list), strA3, 4))) {
                        return Unit.f46060a;
                    }
                    str = str4;
                    str3 = str5;
                }
                break;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB9 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar4 = new idc((mhc) obj2, b5);
                    this.j = true;
                    if (bq9VarB9.c(idcVar4, this) == wneVar14) {
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
                    bq9 bq9VarB10 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar5 = new idc((mhc) obj2, b3);
                    this.j = true;
                    if (bq9VarB10.c(idcVar5, this) == wneVar15) {
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
                    bq9 bq9VarB11 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar6 = new idc((mhc) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB11.c(idcVar6, this) == wneVar16) {
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
                    bq9 bq9VarB12 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar7 = new idc((mhc) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB12.c(idcVar7, this) == wneVar17) {
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
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar8 = new idc((c48) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB13.c(idcVar8, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar9 = new idc((c48) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB14.c(idcVar9, this) == wneVar19) {
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
                    bq9 bq9VarB15 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar10 = new idc((rvc) obj2, b4);
                    this.j = true;
                    if (bq9VarB15.c(idcVar10, this) == wneVar20) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar11 = new idc((rvc) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB16.c(idcVar11, this) == wneVar21) {
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
                    bq9 bq9VarB17 = hkb.B((p7m0) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar12 = new idc((xwc) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB17.c(idcVar12, this) == wneVar22) {
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
                wne wneVar23 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar13 = new idc((xwc) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB18.c(idcVar13, this) == wneVar23) {
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
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar14 = new idc((xwc) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB19.c(idcVar14, this) == wneVar24) {
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
                t0d t0dVar = (t0d) this.k;
                vne vneVar3 = (vne) this.l;
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                yje yjeVar2 = null;
                if (!z25) {
                    z1x.P(obj);
                    gbe0 gbe0VarA = o5k0.a(t0dVar.f33114a);
                    ArrayList arrayList = (ArrayList) obj2;
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(qjj.M(vneVar3, null, new ic1((Object) t0dVar, it.next(), (Object) gbe0VarA, yjeVar2, (byte) 12), 3));
                    }
                    this.l = null;
                    this.j = true;
                    objN = qjj.N(arrayList2, this);
                    if (objN == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objN = obj;
                }
                List list2 = (List) objN;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Object obj3 = ((j0g0) it2.next()).f15681a;
                        boolean z26 = obj3 instanceof g0g0;
                        if (!z26) {
                            if (z26) {
                                obj3 = null;
                            }
                            if (!(obj3 instanceof hhn0)) {
                            }
                        }
                        return ptb0.f27556a;
                    }
                }
                return qtb0.f29291a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((dnq) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar15 = new idc((mud) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB20.c(idcVar15, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((dnq) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar16 = new idc((mud) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB21.c(idcVar16, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB22 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar17 = new idc((mud) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB22.c(idcVar17, this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    bq9 bq9VarB23 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar18 = new idc((mhc) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB23.c(idcVar18, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    bq9 bq9VarB24 = hkb.B((dnq) this.k, ((clz) this.l).x(), lkz.d);
                    idc idcVar19 = new idc((dxd) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB24.c(idcVar19, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(i89 i89Var, clz clzVar, xwc xwcVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = xwcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(p5a p5aVar, yje yjeVar, v7c v7cVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        this.k = p5aVar;
        this.m = v7cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(gmq gmqVar, clz clzVar, q0c q0cVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = q0cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(gmq gmqVar, clz clzVar, q0c q0cVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = q0cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(gmq gmqVar, clz clzVar, q0c q0cVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = q0cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(gmq gmqVar, clz clzVar, k5c k5cVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k5cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(gmq gmqVar, clz clzVar, rvc rvcVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = rvcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(gmq gmqVar, clz clzVar, xwc xwcVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = xwcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(gmq gmqVar, clz clzVar, mud mudVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = mudVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(dnq dnqVar, clz clzVar, k5c k5cVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = k5cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(dnq dnqVar, clz clzVar, mud mudVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = mudVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(dnq dnqVar, clz clzVar, mud mudVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = mudVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(dnq dnqVar, clz clzVar, dxd dxdVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = dxdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(xae0 xae0Var, clz clzVar, rvc rvcVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = rvcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(p7m0 p7m0Var, clz clzVar, xwc xwcVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = p7m0Var;
        this.l = clzVar;
        this.m = xwcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vxb(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vxb(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.m = obj2;
    }
}
