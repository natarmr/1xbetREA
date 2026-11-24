package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yd60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(eu4 eu4Var, clz clzVar, vf20 vf20Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = eu4Var;
        this.l = clzVar;
        this.m = vf20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                return new yd60(this.k, obj3, obj2, yjeVar, (byte) 0);
            case 1:
                return new yd60(this.k, obj3, obj2, yjeVar, (byte) 1);
            case 2:
                return new yd60(this.k, obj3, obj2, yjeVar, (byte) 2);
            case 3:
                lkz lkzVar = lkz.f20223a;
                return new yd60((i89) this.k, (clz) obj3, (gq50) obj2, yjeVar);
            case 4:
                lkz lkzVar2 = lkz.f20223a;
                return new yd60((gmq) this.k, (clz) obj3, (nf60) obj2, yjeVar);
            case 5:
                return new yd60(obj3, obj2, yjeVar, (byte) 5);
            case 6:
                lkz lkzVar3 = lkz.f20223a;
                return new yd60((xae0) this.k, (clz) obj3, (vf20) obj2, yjeVar);
            case 7:
                lkz lkzVar4 = lkz.f20223a;
                return new yd60((gmq) this.k, (clz) obj3, (vf20) obj2, yjeVar);
            case 8:
                lkz lkzVar5 = lkz.f20223a;
                return new yd60((i89) this.k, (clz) obj3, (gq50) obj2, yjeVar, (byte) 0);
            case 9:
                return new yd60(this.k, obj3, obj2, yjeVar, (byte) 9);
            case 10:
                lkz lkzVar6 = lkz.f20223a;
                return new yd60((itb) this.k, (clz) obj3, (do60) obj2, yjeVar);
            case 11:
                lkz lkzVar7 = lkz.f20223a;
                return new yd60((gmq) this.k, (clz) obj3, (do60) obj2, yjeVar);
            case 12:
                lkz lkzVar8 = lkz.f20223a;
                return new yd60((gmq) this.k, (clz) obj3, (jo60) obj2, yjeVar);
            case 13:
                lkz lkzVar9 = lkz.f20223a;
                return new yd60((itb) this.k, (clz) obj3, (jo60) obj2, yjeVar);
            case 14:
                lkz lkzVar10 = lkz.f20223a;
                return new yd60((gmq) this.k, (clz) obj3, (jo60) obj2, yjeVar, (byte) 0);
            case 15:
                yd60 yd60Var = new yd60(obj3, obj2, yjeVar, (byte) 15);
                yd60Var.k = obj;
                return yd60Var;
            case 16:
                lkz lkzVar11 = lkz.f20223a;
                return new yd60((i89) this.k, (clz) obj3, (yd60) obj2, yjeVar);
            case 17:
                lkz lkzVar12 = lkz.f20223a;
                return new yd60((i89) this.k, (clz) obj3, (gq50) obj2, yjeVar, (char) 0);
            case 18:
                lkz lkzVar13 = lkz.f20223a;
                return new yd60((i89) this.k, (clz) obj3, (nf60) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar14 = lkz.f20223a;
                return new yd60((eu4) this.k, (clz) obj3, (vf20) obj2, yjeVar);
            case 20:
                lkz lkzVar15 = lkz.f20223a;
                return new yd60((gmq) this.k, (clz) obj3, (vf20) obj2, yjeVar, (byte) 0);
            case 21:
                lkz lkzVar16 = lkz.f20223a;
                return new yd60((gmq) this.k, (clz) obj3, (vf20) obj2, yjeVar, (char) 0);
            case 22:
                lkz lkzVar17 = lkz.f20223a;
                return new yd60((gmq) this.k, (clz) obj3, (vf20) obj2, yjeVar, 0);
            case 23:
                lkz lkzVar18 = lkz.f20223a;
                return new yd60((gmq) this.k, (clz) obj3, (vf20) obj2, yjeVar, (short) 0);
            case 24:
                lkz lkzVar19 = lkz.f20223a;
                return new yd60((gmq) this.k, (clz) obj3, (vf20) obj2, yjeVar, (byte) 0, false);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar20 = lkz.f20223a;
                return new yd60((gmq) this.k, (clz) obj3, (vf20) obj2, yjeVar, (byte) 0, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar21 = lkz.f20223a;
                return new yd60((i89) this.k, (clz) obj3, (vf20) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar22 = lkz.f20223a;
                return new yd60((i89) this.k, (clz) obj3, (gq50) obj2, yjeVar, 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar23 = lkz.f20223a;
                return new yd60((i89) this.k, (clz) obj3, (nf60) obj2, yjeVar, (byte) 0);
            default:
                lkz lkzVar24 = lkz.f20223a;
                return new yd60((i89) this.k, (clz) obj3, (gq50) obj2, yjeVar, (short) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((yd60) create((q370) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yd60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objD0;
        Object objL;
        ArrayList arrayList;
        Object objA;
        byte b = this.i;
        byte b2 = 28;
        byte b3 = 2;
        byte b4 = 4;
        byte b5 = 10;
        byte b6 = 0;
        Object obj2 = this.m;
        Object obj3 = this.l;
        byte b7 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                byte b8 = 1;
                if (!z) {
                    z1x.P(obj);
                    lnq lnqVarZ = dtb.z(ydx.V((ufk0) this.k, new td60((ywv0) obj3, b8)), 1);
                    wo50 wo50Var = new wo50((Function0) obj2, (byte) 1);
                    this.j = true;
                    if (lnqVarZ.c(wo50Var, this) == wneVar) {
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
                of60 of60Var = (of60) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    mne mneVar = of60Var.h2;
                    if (mneVar == null) {
                        Intrinsics.h("coroutineDispatchers");
                        throw null;
                    }
                    dvj dvjVar = mneVar.b;
                    nf60 nf60Var = new nf60(of60Var, (Map) obj2, yjeVar, b6);
                    this.j = true;
                    objD0 = qjj.d0(dvjVar, nf60Var, this);
                    if (objD0 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                String str = (String) objD0;
                if (str == null) {
                    evz evzVar = of60.i2;
                    of60Var.F().t0(i120.V(new Pair("ERROR_SOCIAL", of60Var.H(R.string.something_went_wrong))), "ERROR_SOCIAL");
                    of60Var.y0();
                } else {
                    String str2 = (String) obj3;
                    evz evzVar2 = of60.i2;
                    of60Var.getClass();
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString("last_name", "");
                    String strOptString2 = jSONObject.optString(CommonConstant.KEY_UID, "");
                    strOptString2.getClass();
                    String strOptString3 = jSONObject.optString("name", "");
                    strOptString3.getClass();
                    strOptString.getClass();
                    if (StringsKt.O(strOptString3, strOptString, false)) {
                        strOptString3 = kotlin.text.c.r(kotlin.text.c.r(strOptString3, strOptString, "", false), Separators.SP, "", false);
                    }
                    of60Var.F().t0(i120.V(new Pair("SUCCESS_SOCIAL", new ghk0(5, str2, null, strOptString2, strOptString3, strOptString, null, null, 196))), "SUCCESS_SOCIAL");
                    of60Var.y0();
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    gr00 gr00Var = (gr00) ((pyu) this.k).f27815a;
                    String str3 = (String) obj3;
                    this.j = true;
                    vby vbyVar = (vby) gr00Var.b;
                    vbyVar.getClass();
                    o2v0 o2v0Var = (o2v0) vbyVar.b(o2v0.Companion.serializer(), (String) obj2);
                    String str4 = o2v0Var.f24550a;
                    String str5 = o2v0Var.b;
                    if (!Intrinsics.d(str4, "ready")) {
                        if (Intrinsics.d(str4, "token")) {
                            if (str5 == null) {
                                jf4.k(null);
                                return null;
                            }
                            ((p2v0) gr00Var.d).f26270a.g(new k2v0(str5));
                        }
                        objL = Unit.f46060a;
                    } else {
                        if (str5 == null) {
                            jf4.k(null);
                            return null;
                        }
                        objL = gr00Var.l(str3, str5, this);
                        if (objL != wneVar3) {
                            objL = Unit.f46060a;
                        }
                    }
                    if (objL == wneVar3) {
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
                    bq9 bq9VarB = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    kb40 kb40Var = new kb40((gq50) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB.c(kb40Var, this) == wneVar4) {
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
                    bq9 bq9VarB2 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    kb40 kb40Var2 = new kb40((nf60) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB2.c(kb40Var2, this) == wneVar5) {
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
                pz40 pz40Var = (pz40) obj2;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    List list = (List) obj3;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fgd fgdVar = (fgd) it.next();
                        long jQ = n2x.Q(fgdVar.f9486a);
                        jge0 jge0Var = fgdVar.e;
                        float f = jge0Var.f16474a;
                        float f2 = jge0Var.b;
                        long jA = ne60.a((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(rw2.z(jge0Var.d, f2, 2.0f, f2))) & 4294967295L), Float.intBitsToFloat((int) (fgdVar.c >> 32)), 0.0f, b3);
                        Iterator it2 = it;
                        int i = (int) (jQ >> 32);
                        long jF = ne60.f(jA, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat(i) / 2.0f) << 32));
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jF >> 32)) - (Float.intBitsToFloat(i) / 2.0f);
                        arrayList2.add(new vto0(k9x.r((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jF & 4294967295L)) - (Float.intBitsToFloat((int) (jQ & 4294967295L)) / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), jQ), fgdVar.g));
                        it = it2;
                        b3 = 2;
                    }
                    if (((List) pz40Var.getValue()).isEmpty() || arrayList2.isEmpty()) {
                        pz40Var.setValue(arrayList2);
                    } else {
                        uen uenVar = wen.b;
                        long jW0 = ibc.w0(10L, bfn.MILLISECONDS);
                        this.k = arrayList2;
                        this.j = true;
                        if (qcc.P(jW0, this) == wneVar6) {
                            return wneVar6;
                        }
                        arrayList = arrayList2;
                    }
                    return Unit.f46060a;
                }
                if (!z6) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = (ArrayList) this.k;
                z1x.P(obj);
                pz40Var.setValue(arrayList);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    kb40 kb40Var3 = new kb40((vf20) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB3.c(kb40Var3, this) == wneVar7) {
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
                    bq9 bq9VarB4 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    kb40 kb40Var4 = new kb40((vf20) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB4.c(kb40Var4, this) == wneVar8) {
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
                    bq9 bq9VarB5 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    kb40 kb40Var5 = new kb40((gq50) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB5.c(kb40Var5, this) == wneVar9) {
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
                a570 a570Var = (a570) obj3;
                pm60 pm60Var = (pm60) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    z4u z4uVar = pm60Var.l;
                    long jD = x1x.D(a570Var);
                    this.j = true;
                    objA = z4uVar.a(jD, this);
                    if (objA == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                pm60Var.k.c().d(new t13((Object) pm60Var, (Object) a570Var, obj2, !((Boolean) objA).booleanValue(), (byte) 14));
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B((itb) this.k, ((clz) obj3).x(), lkz.d);
                    kb40 kb40Var6 = new kb40((do60) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB6.c(kb40Var6, this) == wneVar11) {
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
                    bq9 bq9VarB7 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    kb40 kb40Var7 = new kb40((do60) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB7.c(kb40Var7, this) == wneVar12) {
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
                    bq9 bq9VarB8 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    kb40 kb40Var8 = new kb40((jo60) obj2, b2);
                    this.j = true;
                    if (bq9VarB8.c(kb40Var8, this) == wneVar13) {
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
                    bq9 bq9VarB9 = hkb.B((itb) this.k, ((clz) obj3).x(), lkz.d);
                    kb40 kb40Var9 = new kb40((jo60) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB9.c(kb40Var9, this) == wneVar14) {
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
                    bq9 bq9VarB10 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var = new io60((jo60) obj2, b6);
                    this.j = true;
                    if (bq9VarB10.c(io60Var, this) == wneVar15) {
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
                gs60 gs60Var = (gs60) obj2;
                kiu0 kiu0Var = gs60Var.P1;
                q370 q370Var = (q370) this.k;
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                wo60 wo60Var = wo60.f39479a;
                if (!z16) {
                    z1x.P(obj);
                    if (q370Var instanceof n370) {
                        this.k = null;
                        this.j = true;
                        v0h0 v0h0Var = d9z.w;
                        if (((d9z) obj3).l(0, 0, this) == wneVar16) {
                            return wneVar16;
                        }
                    } else {
                        uuz uuzVar = gs60.R1;
                        if (q370Var != null) {
                            if (q370Var instanceof l370) {
                                ((k370) kiu0Var.getValue()).y(y270.f41893a);
                            } else if (q370Var instanceof m370) {
                                ((k370) kiu0Var.getValue()).y(new z270(true));
                            } else if (q370Var instanceof p370) {
                                ynb ynbVar = gs60Var.O1;
                                if (ynbVar == null) {
                                    Intrinsics.h("changeBalanceDialogProvider");
                                    throw null;
                                }
                                bm5 bm5Var = bm5.d;
                                androidx.fragment.app.e eVarC = gs60Var.C();
                                eVarC.getClass();
                                ynb.b(ynbVar, bm5Var, null, eVarC, false, "SELECT_BALANCE_REQUEST_KEY", 494);
                                gs60Var.C().u0("SELECT_BALANCE_REQUEST_KEY", gs60Var, new viq(gs60Var, b2));
                            } else if (q370Var instanceof o370) {
                                afm0 afm0VarB = ((z7i) gs60Var.M1.getValue()).j.b();
                                x1x.x(afm0VarB);
                                afm0VarB.q(gs60Var, ((o370) q370Var).f24569a, new cs60(gs60Var, b4), new cs60(gs60Var, b7));
                            }
                        }
                        gs60Var.G0().x(wo60Var);
                    }
                    return Unit.f46060a;
                }
                if (!z16) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                uuz uuzVar2 = gs60.R1;
                gs60Var.G0().x(wo60Var);
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var2 = new io60((yd60) obj2, b7);
                    this.j = true;
                    if (bq9VarB11.c(io60Var2, this) == wneVar17) {
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
                    bq9 bq9VarB12 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var3 = new io60((gq50) obj2, b3);
                    this.j = true;
                    if (bq9VarB12.c(io60Var3, this) == wneVar18) {
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
                    bq9 bq9VarB13 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var4 = new io60((nf60) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB13.c(io60Var4, this) == wneVar19) {
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
                    bq9 bq9VarB14 = hkb.B((eu4) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var5 = new io60((vf20) obj2, b4);
                    this.j = true;
                    if (bq9VarB14.c(io60Var5, this) == wneVar20) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var6 = new io60((vf20) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB15.c(io60Var6, this) == wneVar21) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var7 = new io60((vf20) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB16.c(io60Var7, this) == wneVar22) {
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
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var8 = new io60((vf20) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB17.c(io60Var8, this) == wneVar23) {
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
                    bq9 bq9VarB18 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var9 = new io60((vf20) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB18.c(io60Var9, this) == wneVar24) {
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
                    bq9 bq9VarB19 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var10 = new io60((vf20) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB19.c(io60Var10, this) == wneVar25) {
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
                    bq9 bq9VarB20 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var11 = new io60((vf20) obj2, b5);
                    this.j = true;
                    if (bq9VarB20.c(io60Var11, this) == wneVar26) {
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
                    bq9 bq9VarB21 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var12 = new io60((vf20) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB21.c(io60Var12, this) == wneVar27) {
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
                    bq9 bq9VarB22 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var13 = new io60((gq50) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB22.c(io60Var13, this) == wneVar28) {
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
                    bq9 bq9VarB23 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var14 = new io60((nf60) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB23.c(io60Var14, this) == wneVar29) {
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
                    bq9 bq9VarB24 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    io60 io60Var15 = new io60((gq50) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB24.c(io60Var15, this) == wneVar30) {
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
    public yd60(i89 i89Var, clz clzVar, vf20 vf20Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = vf20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(i89 i89Var, clz clzVar, yd60 yd60Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = yd60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(i89 i89Var, clz clzVar, nf60 nf60Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nf60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(i89 i89Var, clz clzVar, nf60 nf60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nf60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(itb itbVar, clz clzVar, do60 do60Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = itbVar;
        this.l = clzVar;
        this.m = do60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(itb itbVar, clz clzVar, jo60 jo60Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = itbVar;
        this.l = clzVar;
        this.m = jo60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(gmq gmqVar, clz clzVar, vf20 vf20Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vf20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(gmq gmqVar, clz clzVar, vf20 vf20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vf20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(gmq gmqVar, clz clzVar, vf20 vf20Var, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vf20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(gmq gmqVar, clz clzVar, vf20 vf20Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vf20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(gmq gmqVar, clz clzVar, vf20 vf20Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vf20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(gmq gmqVar, clz clzVar, vf20 vf20Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vf20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(gmq gmqVar, clz clzVar, vf20 vf20Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vf20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(gmq gmqVar, clz clzVar, nf60 nf60Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nf60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(gmq gmqVar, clz clzVar, do60 do60Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = do60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(gmq gmqVar, clz clzVar, jo60 jo60Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jo60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(gmq gmqVar, clz clzVar, jo60 jo60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jo60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd60(xae0 xae0Var, clz clzVar, vf20 vf20Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = vf20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd60(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd60(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
