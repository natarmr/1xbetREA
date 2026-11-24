package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class cxd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(i89 i89Var, clz clzVar, bce bceVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = bceVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new cxd((dnq) this.l, (clz) obj3, (dxd) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (dxd) obj2, yjeVar);
            case 2:
                cxd cxdVar = new cxd(obj3, obj2, yjeVar, (byte) 2);
                cxdVar.l = obj;
                return cxdVar;
            case 3:
                lkz lkzVar3 = lkz.f20223a;
                return new cxd((xae0) this.l, (clz) obj3, (nyd) obj2, yjeVar);
            case 4:
                lkz lkzVar4 = lkz.f20223a;
                return new cxd((vae0) this.l, (clz) obj3, (nyd) obj2, yjeVar);
            case 5:
                lkz lkzVar5 = lkz.f20223a;
                return new cxd((dnq) this.l, (clz) obj3, (wyd) obj2, yjeVar);
            case 6:
                lkz lkzVar6 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (wyd) obj2, yjeVar);
            case 7:
                lkz lkzVar7 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (fob) obj2, yjeVar);
            case 8:
                lkz lkzVar8 = lkz.f20223a;
                return new cxd((dnq) this.l, (clz) obj3, (c48) obj2, yjeVar);
            case 9:
                lkz lkzVar9 = lkz.f20223a;
                return new cxd((dnq) this.l, (clz) obj3, (c48) obj2, yjeVar, (byte) 0);
            case 10:
                return new cxd(obj3, obj2, yjeVar, (byte) 10);
            case 11:
                lkz lkzVar10 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (fob) obj2, yjeVar, (byte) 0);
            case 12:
                lkz lkzVar11 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (d7e) obj2, yjeVar);
            case 13:
                lkz lkzVar12 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (c48) obj2, yjeVar);
            case 14:
                lkz lkzVar13 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (d7e) obj2, yjeVar, (byte) 0);
            case 15:
                lkz lkzVar14 = lkz.f20223a;
                return new cxd((dnq) this.l, (clz) obj3, (d7e) obj2, yjeVar);
            case 16:
                lkz lkzVar15 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (d7e) obj2, yjeVar, (char) 0);
            case 17:
                lkz lkzVar16 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (d7e) obj2, yjeVar, 0);
            case 18:
                lkz lkzVar17 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (d7e) obj2, yjeVar, (short) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar18 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (d7e) obj2, yjeVar, (byte) 0, false);
            case 20:
                lkz lkzVar19 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (d7e) obj2, yjeVar, (byte) 0, (byte) 0);
            case 21:
                lkz lkzVar20 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (d7e) obj2, yjeVar, (byte) 0, (char) 0);
            case 22:
                lkz lkzVar21 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (d7e) obj2, yjeVar, (byte) 0, 0);
            case 23:
                return new cxd(this.l, obj3, obj2, yjeVar, (byte) 23);
            case 24:
                return new cxd(this.l, obj3, obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar22 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (cbe) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar23 = lkz.f20223a;
                return new cxd((gmq) this.l, (clz) obj3, (ee0) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar24 = lkz.f20223a;
                return new cxd((i89) this.l, (clz) obj3, (bce) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar25 = lkz.f20223a;
                return new cxd((itb) this.l, (clz) obj3, (bce) obj2, yjeVar);
            default:
                lkz lkzVar26 = lkz.f20223a;
                return new cxd((p7m0) this.l, (clz) obj3, (mw0) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
        }
        return ((cxd) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        mie0 mie0Var;
        Object objA;
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((dnq) this.l, ((clz) obj3).x(), lkz.d);
                    idc idcVar = new idc((dxd) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB.c(idcVar, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    idc idcVar2 = new idc((dxd) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB2.c(idcVar2, this) == wneVar2) {
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
                vne vneVar = (vne) this.l;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    p7m0 p7m0Var = ((kyd) obj3).B;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, wxd.a((wxd) value, true, null, false, false, false, 254)));
                    this.l = null;
                    this.j = true;
                    if (((yxd) obj2).invoke(vneVar, this) == wneVar3) {
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
                    bq9 bq9VarB3 = hkb.B((xae0) this.l, ((clz) obj3).x(), lkz.d);
                    idc idcVar3 = new idc((nyd) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB3.c(idcVar3, this) == wneVar4) {
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
                    bq9 bq9VarB4 = hkb.B((vae0) this.l, ((clz) obj3).x(), lkz.d);
                    idc idcVar4 = new idc((nyd) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB4.c(idcVar4, this) == wneVar5) {
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
                    bq9 bq9VarB5 = hkb.B((dnq) this.l, ((clz) obj3).x(), lkz.d);
                    idc idcVar5 = new idc((wyd) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB5.c(idcVar5, this) == wneVar6) {
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
                    bq9 bq9VarB6 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    idc idcVar6 = new idc((wyd) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB6.c(idcVar6, this) == wneVar7) {
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
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.e);
                    idc idcVar7 = new idc((fob) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB7.c(idcVar7, this) == wneVar8) {
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
                    bq9 bq9VarB8 = hkb.B((dnq) this.l, ((clz) obj3).x(), lkz.d);
                    idc idcVar8 = new idc((c48) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB8.c(idcVar8, this) == wneVar9) {
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
                    bq9 bq9VarB9 = hkb.B((dnq) this.l, ((clz) obj3).x(), lkz.d);
                    idc idcVar9 = new idc((c48) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB9.c(idcVar9, this) == wneVar10) {
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
                    mie0Var = (mie0) obj3;
                    this.l = mie0Var;
                    this.j = true;
                    objA = ((hva0) obj2).a(this);
                    if (objA == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mie0 mie0Var2 = (mie0) this.l;
                    z1x.P(obj);
                    mie0Var = mie0Var2;
                    objA = obj;
                }
                mie0Var.f21842a = objA;
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    idc idcVar10 = new idc((fob) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB10.c(idcVar10, this) == wneVar12) {
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
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.c);
                    c7e c7eVar = new c7e((d7e) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB11.c(c7eVar, this) == wneVar13) {
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
                    bq9 bq9VarB12 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar2 = new c7e((c48) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB12.c(c7eVar2, this) == wneVar14) {
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
                    bq9 bq9VarB13 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar3 = new c7e((d7e) obj2, b2);
                    this.j = true;
                    if (bq9VarB13.c(c7eVar3, this) == wneVar15) {
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
                    bq9 bq9VarB14 = hkb.B((dnq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar4 = new c7e((d7e) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB14.c(c7eVar4, this) == wneVar16) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar5 = new c7e((d7e) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB15.c(c7eVar5, this) == wneVar17) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar6 = new c7e((d7e) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB16.c(c7eVar6, this) == wneVar18) {
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
                    bq9 bq9VarB17 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar7 = new c7e((d7e) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB17.c(c7eVar7, this) == wneVar19) {
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
                    bq9 bq9VarB18 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar8 = new c7e((d7e) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB18.c(c7eVar8, this) == wneVar20) {
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
                    bq9 bq9VarB19 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar9 = new c7e((d7e) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB19.c(c7eVar9, this) == wneVar21) {
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
                    bq9 bq9VarB20 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar10 = new c7e((d7e) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB20.c(c7eVar10, this) == wneVar22) {
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
                    bq9 bq9VarB21 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar11 = new c7e((d7e) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB21.c(c7eVar11, this) == wneVar23) {
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
                fae faeVar = (fae) this.l;
                wne wneVar24 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    if (!faeVar.w()) {
                        this.j = true;
                        if (faeVar.c.c((rei0) obj3, this) == wneVar24) {
                            return wneVar24;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z24) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ((Function0) obj2).invoke();
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    this.j = true;
                    if (((vae) this.l).k((String) obj3, (JSONObject) obj2, this) == wneVar25) {
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
                    bq9 bq9VarB22 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar12 = new c7e((cbe) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB22.c(c7eVar12, this) == wneVar26) {
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
                    bq9 bq9VarB23 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar13 = new c7e((ee0) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB23.c(c7eVar13, this) == wneVar27) {
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
                    bq9 bq9VarB24 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar14 = new c7e((bce) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB24.c(c7eVar14, this) == wneVar28) {
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
                    bq9 bq9VarB25 = hkb.B((itb) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar15 = new c7e((bce) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB25.c(c7eVar15, this) == wneVar29) {
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
                wne wneVar30 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    bq9 bq9VarB26 = hkb.B((p7m0) this.l, ((clz) obj3).x(), lkz.d);
                    c7e c7eVar16 = new c7e((mw0) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB26.c(c7eVar16, this) == wneVar30) {
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
    public cxd(itb itbVar, clz clzVar, bce bceVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.l = itbVar;
        this.k = clzVar;
        this.m = bceVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, ee0 ee0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = ee0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, fob fobVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = fobVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, fob fobVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = fobVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, dxd dxdVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = dxdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, wyd wydVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = wydVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar, byte b, int i) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(gmq gmqVar, clz clzVar, cbe cbeVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = cbeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(dnq dnqVar, clz clzVar, c48 c48Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.l = dnqVar;
        this.k = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(dnq dnqVar, clz clzVar, c48 c48Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.l = dnqVar;
        this.k = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(dnq dnqVar, clz clzVar, dxd dxdVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.l = dnqVar;
        this.k = clzVar;
        this.m = dxdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(dnq dnqVar, clz clzVar, wyd wydVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.l = dnqVar;
        this.k = clzVar;
        this.m = wydVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(dnq dnqVar, clz clzVar, d7e d7eVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.l = dnqVar;
        this.k = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(vae0 vae0Var, clz clzVar, nyd nydVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.l = vae0Var;
        this.k = clzVar;
        this.m = nydVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(xae0 xae0Var, clz clzVar, nyd nydVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = nydVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(p7m0 p7m0Var, clz clzVar, mw0 mw0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.l = p7m0Var;
        this.k = clzVar;
        this.m = mw0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cxd(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cxd(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = obj2;
        this.m = obj3;
    }
}
