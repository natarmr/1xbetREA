package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes4.dex */
public final class c6y extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new c6y((e6y) obj2, yjeVar);
            case 1:
                gmq gmqVar = (gmq) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new c6y(gmqVar, clzVar, (i6y) obj2, yjeVar);
            case 2:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new c6y(gmqVar2, clzVar2, (i6y) obj2, yjeVar, (byte) 0);
            case 3:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new c6y(gmqVar3, clzVar3, (i6y) obj2, yjeVar, (char) 0);
            case 4:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new c6y(gmqVar4, clzVar4, (i6y) obj2, yjeVar, 0);
            case 5:
                return new c6y(this.k, this.l, this.m, yjeVar, (byte) 5);
            case 6:
                return new c6y(this.k, this.l, obj2, yjeVar, (byte) 6);
            case 7:
                return new c6y(this.k, this.l, obj2, yjeVar, (byte) 7);
            case 8:
                a1t a1tVar = (a1t) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new c6y(a1tVar, clzVar5, (kaw) obj2, yjeVar);
            case 9:
                c6y c6yVar = new c6y((jxy) this.l, (hxy) obj2, yjeVar);
                c6yVar.k = obj;
                return c6yVar;
            case 10:
                i89 i89Var = (i89) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new c6y(i89Var, clzVar6, (ens) obj2, yjeVar);
            case 11:
                return new c6y(this.k, this.l, obj2, yjeVar, (byte) 11);
            case 12:
                i89 i89Var2 = (i89) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new c6y(i89Var2, clzVar7, (ens) obj2, yjeVar, (byte) 0);
            case 13:
                return new c6y(this.k, this.l, obj2, yjeVar, (byte) 13);
            case 14:
                return new c6y(this.k, this.l, obj2, yjeVar, (byte) 14);
            case 15:
                i89 i89Var3 = (i89) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new c6y(i89Var3, clzVar8, (ens) obj2, yjeVar, (char) 0);
            case 16:
                i89 i89Var4 = (i89) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new c6y(i89Var4, clzVar9, (ens) obj2, yjeVar, 0);
            case 17:
                i89 i89Var5 = (i89) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new c6y(i89Var5, clzVar10, (ens) obj2, yjeVar, (short) 0);
            case 18:
                i89 i89Var6 = (i89) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new c6y(i89Var6, clzVar11, (ens) obj2, yjeVar, (byte) 0, false);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i89 i89Var7 = (i89) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new c6y(i89Var7, clzVar12, (ens) obj2, yjeVar, (byte) 0, (byte) 0);
            case 20:
                i89 i89Var8 = (i89) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new c6y(i89Var8, clzVar13, (ens) obj2, yjeVar, (byte) 0, (char) 0);
            case 21:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new c6y(gmqVar5, clzVar14, (pfl) obj2, yjeVar);
            case 22:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new c6y(gmqVar6, clzVar15, (pfl) obj2, yjeVar, (byte) 0);
            case 23:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new c6y(gmqVar7, clzVar16, (pfl) obj2, yjeVar, (char) 0);
            case 24:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new c6y(gmqVar8, clzVar17, (cin) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i89 i89Var9 = (i89) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new c6y(i89Var9, clzVar18, (ens) obj2, yjeVar, (byte) 0, 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                i89 i89Var10 = (i89) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new c6y(i89Var10, clzVar19, (ens) obj2, yjeVar, (byte) 0, (short) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i89 i89Var11 = (i89) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new c6y(i89Var11, clzVar20, (e000) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i89 i89Var12 = (i89) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new c6y(i89Var12, clzVar21, (e000) obj2, yjeVar, (byte) 0);
            default:
                a1g a1gVar = (a1g) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new c6y(a1gVar, clzVar22, (ae00) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((c6y) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((c6y) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        v88 v88Var;
        i1w0 i1w0Var;
        byte b = this.i;
        byte b2 = 2;
        byte b3 = 3;
        byte b4 = 6;
        Object obj2 = this.m;
        yje yjeVar = null;
        byte b5 = 1;
        switch (b) {
            case 0:
                e6y e6yVar = (e6y) obj2;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    v88 v88Var2 = e6yVar.t;
                    i1w0 i1w0Var2 = e6yVar.C;
                    khf0 khf0Var = e6yVar.s;
                    bm5 bm5Var = bm5.m;
                    this.k = v88Var2;
                    this.l = i1w0Var2;
                    this.j = true;
                    Serializable serializableG = khf0.G(khf0Var, bm5Var, this);
                    if (serializableG == wneVar) {
                        return wneVar;
                    }
                    obj = serializableG;
                    v88Var = v88Var2;
                    i1w0Var = i1w0Var2;
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i1w0Var = (i1w0) this.l;
                    v88Var = (v88) this.k;
                    z1x.P(obj);
                }
                ql5 ql5Var = (ql5) obj;
                e6yVar.u.a(bm5.m, ql5Var);
                v88.b(v88Var, i1w0Var, ql5Var.f28916a, 2);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar = new v6w((i6y) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB.c(v6wVar, this) == wneVar2) {
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
                    v6w v6wVar2 = new v6w((i6y) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB2.c(v6wVar2, this) == wneVar3) {
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
                    v6w v6wVar3 = new v6w((i6y) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB3.c(v6wVar3, this) == wneVar4) {
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
                    bq9 bq9VarB4 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar4 = new v6w((i6y) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB4.c(v6wVar4, this) == wneVar5) {
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
                    gmq data = ((s8y) this.k).c.getData();
                    this.j = true;
                    obj = ntb.M(data, this);
                    if (obj == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                az40 az40Var = (az40) obj;
                if (az40Var != null) {
                    zsb0 zsb0Var = (zsb0) this.l;
                    zsb0Var.getClass();
                    Object objCopyOf = az40Var.f1700a.get(zsb0Var);
                    if (objCopyOf instanceof byte[]) {
                        byte[] bArr = (byte[]) objCopyOf;
                        objCopyOf = Arrays.copyOf(bArr, bArr.length);
                    }
                    if (objCopyOf != null) {
                        return objCopyOf;
                    }
                }
                return obj2;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (z7) {
                    if (z7) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                wbj wbjVar = ((s8y) this.k).c;
                khx khxVar = new khx((zsb0) this.l, (Long) obj2, yjeVar, b5);
                this.j = true;
                Object objA = wbjVar.a(new kyh(khxVar, null, (byte) 3), this);
                return objA == wneVar7 ? wneVar7 : objA;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    this.j = true;
                    MediaType mediaType = rny.m;
                    if (((rny) this.k).b((String) this.l, (tny) obj2, this) == wneVar8) {
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
                    bq9 bq9VarB5 = hkb.B((a1t) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar5 = new v6w((kaw) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB5.c(v6wVar5, this) == wneVar9) {
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
                qpg0 qpg0Var = (qpg0) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (((jxy) this.l).b.l0(qpg0Var, (hxy) obj2) == wneVar10) {
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
                    bq9 bq9VarB6 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar6 = new v6w((ens) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB6.c(v6wVar6, this) == wneVar11) {
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
                    this.j = true;
                    if (((dgu) this.k).B((String) this.l, (n3q) obj2, this) == wneVar12) {
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
                    bq9 bq9VarB7 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar7 = new v6w((ens) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB7.c(v6wVar7, this) == wneVar13) {
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
                zaz zazVar = (zaz) this.k;
                pz40 pz40Var = zazVar.j;
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                try {
                    if (!z14) {
                        z1x.P(obj);
                        t33 t33Var = zazVar.q;
                        Float f = new Float(0.0f);
                        cfq cfqVar = (cfq) this.l;
                        yaz yazVar = new yaz((dfv) obj2, zazVar, b5);
                        this.j = true;
                        if (t33.a(t33Var, f, cfqVar, null, yazVar, this, 4) == wneVar14) {
                            return wneVar14;
                        }
                    } else {
                        if (!z14) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    ((hgk0) zazVar.k).setValue(Boolean.TRUE);
                    ((hgk0) pz40Var).setValue(Boolean.FALSE);
                    return Unit.f46060a;
                } catch (Throwable th) {
                    ((hgk0) pz40Var).setValue(Boolean.FALSE);
                    throw th;
                }
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(ydx.V(null, (Function0) this.k));
                    clu cluVar = new clu((pdz) this.l, (String) obj2, b4);
                    this.j = true;
                    if (gmqVarW.c(cluVar, this) == wneVar15) {
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
                    bq9 bq9VarB8 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar8 = new v6w((ens) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB8.c(v6wVar8, this) == wneVar16) {
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
                    bq9 bq9VarB9 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar = new poz((ens) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB9.c(pozVar, this) == wneVar17) {
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
                    bq9 bq9VarB10 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar2 = new poz((ens) obj2, b5);
                    this.j = true;
                    if (bq9VarB10.c(pozVar2, this) == wneVar18) {
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
                    bq9 bq9VarB11 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar3 = new poz((ens) obj2, b2);
                    this.j = true;
                    if (bq9VarB11.c(pozVar3, this) == wneVar19) {
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
                    bq9 bq9VarB12 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar4 = new poz((ens) obj2, b3);
                    this.j = true;
                    if (bq9VarB12.c(pozVar4, this) == wneVar20) {
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
                    bq9 bq9VarB13 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar5 = new poz((ens) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB13.c(pozVar5, this) == wneVar21) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar6 = new poz((pfl) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB14.c(pozVar6, this) == wneVar22) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar7 = new poz((pfl) obj2, b4);
                    this.j = true;
                    if (bq9VarB15.c(pozVar7, this) == wneVar23) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar8 = new poz((pfl) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB16.c(pozVar8, this) == wneVar24) {
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
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar9 = new poz((cin) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB17.c(pozVar9, this) == wneVar25) {
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
                    bq9 bq9VarB18 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar10 = new poz((ens) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB18.c(pozVar10, this) == wneVar26) {
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
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar11 = new poz((ens) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB19.c(pozVar11, this) == wneVar27) {
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
                    bq9 bq9VarB20 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar12 = new poz((e000) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB20.c(pozVar12, this) == wneVar28) {
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
                    bq9 bq9VarB21 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar13 = new poz((e000) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB21.c(pozVar13, this) == wneVar29) {
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
                    bq9 bq9VarB22 = hkb.B((a1g) this.k, ((clz) this.l).x(), lkz.d);
                    poz pozVar14 = new poz((ae00) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB22.c(pozVar14, this) == wneVar30) {
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
    public c6y(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b, int i) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b, short s) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = e000Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = e000Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(a1g a1gVar, clz clzVar, ae00 ae00Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = a1gVar;
        this.l = clzVar;
        this.m = ae00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(gmq gmqVar, clz clzVar, cin cinVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = cinVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(gmq gmqVar, clz clzVar, i6y i6yVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = i6yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(gmq gmqVar, clz clzVar, i6y i6yVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = i6yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(gmq gmqVar, clz clzVar, i6y i6yVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = i6yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(gmq gmqVar, clz clzVar, i6y i6yVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = i6yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(a1t a1tVar, clz clzVar, kaw kawVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = a1tVar;
        this.l = clzVar;
        this.m = kawVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(e6y e6yVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.m = e6yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y(jxy jxyVar, hxy hxyVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        this.l = jxyVar;
        this.m = hxyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6y(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
