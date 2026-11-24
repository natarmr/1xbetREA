package a;

import android.graphics.Bitmap;
import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class meq0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public meq0(boolean z, pz40 pz40Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        this.j = z;
        this.k = pz40Var;
        this.l = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new meq0(this.k, obj2, yjeVar, (byte) 0);
            case 1:
                return new meq0(this.k, obj2, yjeVar, (byte) 1);
            case 2:
                return new meq0(this.k, obj2, yjeVar, (byte) 2);
            case 3:
                return new meq0(obj2, yjeVar, (byte) 3);
            case 4:
                return new meq0(this.k, obj2, yjeVar, (byte) 4);
            case 5:
                return new meq0(this.k, obj2, yjeVar, (byte) 5);
            case 6:
                return new meq0(this.k, obj2, yjeVar, (byte) 6);
            case 7:
                return new meq0(this.k, obj2, yjeVar, (byte) 7);
            case 8:
                return new meq0(this.k, obj2, yjeVar, (byte) 8);
            case 9:
                meq0 meq0Var = new meq0(obj2, yjeVar, (byte) 9);
                meq0Var.k = obj;
                return meq0Var;
            case 10:
                return new meq0(obj2, yjeVar, (byte) 10);
            case 11:
                return new meq0(this.k, obj2, yjeVar, (byte) 11);
            case 12:
                meq0 meq0Var2 = new meq0(obj2, yjeVar, (byte) 12);
                meq0Var2.k = obj;
                return meq0Var2;
            case 13:
                return new meq0(this.j, (pz40) this.k, (pz40) obj2, yjeVar);
            case 14:
                return new meq0(this.k, obj2, yjeVar, (byte) 14);
            case 15:
                meq0 meq0Var3 = new meq0(obj2, yjeVar, (byte) 15);
                meq0Var3.k = obj;
                return meq0Var3;
            case 16:
                return new meq0(this.k, obj2, yjeVar, (byte) 16);
            case 17:
                meq0 meq0Var4 = new meq0(obj2, yjeVar, (byte) 17);
                meq0Var4.k = obj;
                return meq0Var4;
            case 18:
                meq0 meq0Var5 = new meq0((els0) obj2, this.j, yjeVar);
                meq0Var5.k = ((j0g0) obj).f15681a;
                return meq0Var5;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new meq0(this.k, obj2, yjeVar, (byte) 19);
            case 20:
                return new meq0(this.k, obj2, yjeVar, (byte) 20);
            case 21:
                return new meq0(obj2, yjeVar, (byte) 21);
            case 22:
                meq0 meq0Var6 = new meq0(obj2, yjeVar, (byte) 22);
                meq0Var6.k = obj;
                return meq0Var6;
            case 23:
                meq0 meq0Var7 = new meq0(obj2, yjeVar, (byte) 23);
                meq0Var7.k = obj;
                return meq0Var7;
            case 24:
                return new meq0(this.k, obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new meq0(this.k, obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new meq0(this.k, obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                meq0 meq0Var8 = new meq0(obj2, yjeVar, (byte) 27);
                meq0Var8.k = obj;
                return meq0Var8;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new meq0(this.k, obj2, yjeVar, (byte) 28);
            default:
                return new meq0(this.k, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((meq0) create((d0t) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((meq0) create((slb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((meq0) create((gu1) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((meq0) create((wgs0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                j0g0 j0g0Var = (j0g0) obj;
                Object obj3 = j0g0Var.f15681a;
                return ((meq0) create(j0g0Var, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((meq0) create((jz80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((meq0) create((lva0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((meq0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((meq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objJ;
        Object objD;
        Object objH;
        Object objE;
        Object objC;
        sff0 sff0Var;
        Object value;
        Object value2;
        sas0 sas0VarA;
        Object objA;
        Object value3;
        Object value4;
        qx90 qx90Var;
        Object objH2;
        Object objC2;
        byte b = this.i;
        byte b2 = 12;
        Object obj2 = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    if (((oeq0) this.k).m.a((Throwable) obj2, this) == wneVar) {
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
                    this.j = true;
                    if (((wfq0) this.k).h.f((zy5) obj2, this) == wneVar2) {
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
                    this.j = true;
                    if (((wfq0) this.k).b.a((Throwable) obj2, this) == wneVar3) {
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
                wfq0 wfq0Var = (wfq0) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    wfq0Var.x();
                    hru hruVar = wfq0Var.p;
                    s470 s470Var = wfq0Var.r.f42064a;
                    this.k = wfq0Var;
                    this.j = true;
                    objJ = hruVar.j(s470Var, this);
                    if (objJ == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wfq0Var = (wfq0) this.k;
                    z1x.P(obj);
                    objJ = obj;
                }
                wfq0Var.w((List) objJ);
                return Unit.f46060a;
            case 4:
                ugq0 ugq0Var = (ugq0) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jV0 = ibc.v0(3, bfn.SECONDS);
                    z2n0 z2n0Var = new z2n0(ugq0Var, yjeVar, (byte) 17);
                    this.j = true;
                    objD = j0x.D(4, jV0, this, "updateLocalTimeDiffUseCase", iun.f15405a, z2n0Var);
                    if (objD == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD = ((j0g0) obj).f15681a;
                }
                e0g0 e0g0Var = j0g0.b;
                if (!(objD instanceof g0g0)) {
                }
                vne vneVar = (vne) obj2;
                Throwable thA = j0g0.a(objD);
                if (thA != null) {
                    thA.getLocalizedMessage();
                    ugq0Var.f(thA, vneVar);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    lnq lnqVarZ = dtb.z(((m1e) this.k).b(), 1);
                    mmq0 mmq0Var = new mmq0((yqq0) obj2, (byte) 5);
                    this.j = true;
                    if (lnqVarZ.c(mmq0Var, this) == wneVar6) {
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
                xtq0 xtq0Var = (xtq0) this.k;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    xex xexVar = xtq0Var.I;
                    this.j = true;
                    objH = xexVar.H(this);
                    if (objH == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH = obj;
                }
                if (((Boolean) objH).booleanValue()) {
                    xtq0Var.C0.f(new ftq0(rek0.b, xtq0Var.w.b.a(R.string.access_denied_with_bonus_currency_message, Arrays.copyOf(new Object[0], 0))));
                } else {
                    ((atq0) obj2).invoke();
                }
                return Unit.f46060a;
            case 7:
                xtq0 xtq0Var2 = (xtq0) this.k;
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    ouu ouuVar = xtq0Var2.e;
                    this.j = true;
                    objE = ouuVar.E(this);
                    if (objE == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                if (((Boolean) objE).booleanValue()) {
                    xtq0Var2.C0.f(etq0.f8389a);
                } else {
                    i1w0 i1w0Var = xtq0Var2.y;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    FragmentScreen fragmentScreenQ = xtq0Var2.m.q((lr1) obj2);
                    if (fragmentScreenQ instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenQ)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenQ)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 8:
                xtq0 xtq0Var3 = (xtq0) this.k;
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    this.j = true;
                    if (xtq0Var3.j0.b((ArrayList) obj2, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                xtq0Var3.F();
                return Unit.f46060a;
            case 9:
                d0t d0tVar = (d0t) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    int i = m5r0.E;
                    if (((m5r0) obj2).P(d0tVar, this) == wneVar10) {
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
                g7r0 g7r0Var = (g7r0) obj2;
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    sff0 sff0VarA = g7r0Var.s.a();
                    j3c j3cVar = g7r0Var.w;
                    this.k = sff0VarA;
                    this.j = true;
                    objC = j3cVar.c(this);
                    if (objC == wneVar11) {
                        return wneVar11;
                    }
                    sff0Var = sff0VarA;
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sff0Var = (sff0) this.k;
                    z1x.P(obj);
                    objC = obj;
                }
                mum0 mum0Var = sff0Var.g;
                h8l0 h8l0Var = mum0Var.v;
                boolean z12 = sff0Var.J1;
                boolean z13 = sff0Var.J;
                g8l0 g8l0Var = mum0Var.z;
                v5l0 v5l0Var = mum0Var.y;
                boolean zJ = g7r0Var.y.j();
                r9u r9uVar = g7r0Var.A;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                g7r0Var.H(new im10(h8l0Var, g8l0Var, v5l0Var, (wcb) objC, zJ, z13, z12, j1q0Var.f15748a.d(ygpVar)));
                return Unit.f46060a;
            case 11:
                xk80 xk80Var = (xk80) this.k;
                wne wneVar12 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    int iK = xk80Var.k();
                    int i2 = ((adr0) obj2).b.f40661a;
                    if (iK != i2) {
                        this.j = true;
                        if (xk80.g(xk80Var, i2, null, this, 6) == wneVar12) {
                            return wneVar12;
                        }
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                slb0 slb0Var = (slb0) this.k;
                wne wneVar13 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    if (slb0Var != null) {
                        this.k = null;
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (((xcz) obj2).f(0, 0, this) == wneVar13) {
                            return wneVar13;
                        }
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                pz40 pz40Var = (pz40) obj2;
                pz40 pz40Var2 = (pz40) this.k;
                iiy[] iiyVarArr = ter0.f33835a;
                pz40Var.setValue(new daq0((((Boolean) pz40Var2.getValue()).booleanValue() || !this.j) ? qmk.u : qmk.w));
                return Unit.f46060a;
            case 14:
                ofr0 ofr0Var = (ofr0) this.k;
                wne wneVar15 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    this.j = true;
                    if (ofr0Var.h0.b((ArrayList) obj2, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = ofr0.U0;
                ofr0Var.Z();
                return Unit.f46060a;
            case 15:
                gu1 gu1Var = (gu1) this.k;
                wne wneVar16 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    uen uenVar2 = wen.b;
                    long jW0 = ibc.w0(1000L, bfn.MILLISECONDS);
                    this.k = gu1Var;
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i4 = l7s0.z;
                p7m0 p7m0Var = ((l7s0) obj2).i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, e7s0.a((e7s0) value, new q7s0(gu1Var), false, gu1Var.n, false, WarningHeader.MISCELLANEOUS_WARNING)));
                return Unit.f46060a;
            case 16:
                yas0 yas0Var = (yas0) this.k;
                oyg0 oyg0Var = yas0Var.f;
                ocj ocjVar = yas0Var.i;
                ctf0 ctf0Var = yas0Var.q;
                wne wneVar17 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    yas0Var.x.a(true, ((sas0) yas0Var.D()).f31900a);
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        sas0VarA = (sas0) value2;
                        oyg0Var.getClass();
                        fas0 fas0Var = sas0VarA.c;
                        if (fas0Var instanceof cas0) {
                            sas0VarA = sas0.a(sas0VarA, cas0.a((cas0) fas0Var, null, true, 1), false, 27);
                        }
                    } while (!p7m0Var2.m(value2, sas0VarA));
                    this.j = true;
                    objA = yas0Var.v.a(((sas0) yas0Var.D()).f31900a, (z1s0) obj2, this);
                    if (objA == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                y0s0 y0s0Var = (y0s0) objA;
                int i5 = yas0.z;
                if (!(y0s0Var instanceof t0s0) && !(y0s0Var instanceof x0s0)) {
                    long j = ((sas0) yas0Var.D()).f31900a;
                    boolean z19 = y0s0Var instanceof r0s0;
                    s0s0 s0s0Var = y0s0Var instanceof s0s0 ? (s0s0) y0s0Var : null;
                    Integer numValueOf = s0s0Var != null ? Integer.valueOf(s0s0Var.b) : null;
                    yas0Var.t.b(j, numValueOf, "providers_tournament", z19);
                    yas0Var.u.a(j, numValueOf, "providers_tournament", z19);
                }
                if (y0s0Var != null) {
                    if (y0s0Var instanceof x0s0) {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var3.getValue();
                            value3.getClass();
                        } while (!p7m0Var3.m(value3, sas0.a((sas0) value3, null, true, 15)));
                        i1w0 i1w0VarC = yas0Var.p.c();
                        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC);
                        c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
                        ListIterator listIterator = cs0.h(copyOnWriteArrayListQ2, c8dVar, c8dVar, i1w0VarC, copyOnWriteArrayListQ2).listIterator(0);
                        while (true) {
                            paw pawVar2 = (paw) listIterator;
                            if (pawVar2.hasNext()) {
                                i1w0VarC.a((oe50) pawVar2.next());
                            }
                        }
                    } else if (y0s0Var instanceof t0s0) {
                        yas0Var.r.b(new AggregatorScreenModel(null, null, 0L, new sm1(0L), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE), new AggregatorScreenModel(null, null, 0L, new qm1(((sas0) yas0Var.D()).f31900a, s9s0.b, ((sas0) yas0Var.D()).b, false), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                    } else if (y0s0Var instanceof r0s0) {
                        yas0Var.G(new pas0(((sas0) yas0Var.D()).f31900a, ((sas0) yas0Var.D()).b));
                        yas0Var.M(false, false);
                    } else if (y0s0Var instanceof s0s0) {
                        String strA = ((s0s0) y0s0Var).f31425a;
                        if (strA.length() == 0) {
                            strA = ctf0Var.b.a(R.string.unknown_service_error, Arrays.copyOf(new Object[0], 0));
                        }
                        String strA2 = ctf0Var.b.a(R.string.tournamenet_dialor_title, Arrays.copyOf(new Object[0], 0));
                        String strA3 = ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0));
                        n12 n12Var = n12.f22727a;
                        yas0Var.G(new qas0(strA2, strA, strA3));
                    } else if (y0s0Var instanceof w0s0) {
                        lsm0 lsm0Var = ctf0Var.b;
                        lsm0 lsm0Var2 = ctf0Var.b;
                        String strA4 = lsm0Var.a(R.string.tournamenet_dialor_title, Arrays.copyOf(new Object[0], 0));
                        String strA5 = lsm0Var2.a(R.string.unknown_service_error, Arrays.copyOf(new Object[0], 0));
                        String strA6 = lsm0Var2.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0));
                        n12 n12Var2 = n12.f22727a;
                        yas0Var.G(new qas0(strA4, strA5, strA6));
                    }
                }
                return Unit.f46060a;
            case 17:
                wgs0 wgs0Var = (wgs0) this.k;
                wne wneVar18 = wne.f39444a;
                boolean z20 = this.j;
                if (z20) {
                    if (z20) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                w5z w5zVar = ((vgs0) obj2).b;
                Long l = wgs0Var.b;
                Long l2 = wgs0Var.c;
                int i6 = wgs0Var.f39133a;
                boolean z21 = wgs0Var.d;
                this.k = null;
                this.j = true;
                Object objU = w5zVar.U(l, l2, i6, z21, this);
                return objU == wneVar18 ? wneVar18 : objU;
            case 18:
                Object obj3 = this.k;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                boolean z22 = this.j;
                int i7 = els0.w;
                p7m0 p7m0Var4 = ((els0) obj2).i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, pks0.a((pks0) value4, 0L, new j0g0(obj3), null, false, z22, null, null, null, 3951)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z23 = this.j;
                if (z23) {
                    if (z23) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qoj0 qoj0VarA = ((tpx) this.k).a();
                jz6 jz6Var = new jz6((cqs0) obj2, b2);
                this.j = true;
                qoj0VarA.c(jz6Var, this);
                return wneVar20;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    this.j = true;
                    if (((cqs0) this.k).c.m((i16) obj2, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                cqs0 cqs0Var = (cqs0) obj2;
                wne wneVar22 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    qx90 qx90Var2 = ((qps0) ((h0q0) cqs0Var.h.f41434a).f12247a).f29136a;
                    if (!Intrinsics.d(qx90Var2, new qx90(0, 0, 0, 0L))) {
                        cqs0Var.k.d(false);
                        wsf0 wsf0Var = cqs0Var.c;
                        a16 a16Var = new a16(new le8(qx90Var2.c, qx90Var2.d, qx90Var2.b));
                        this.k = qx90Var2;
                        this.j = true;
                        if (wsf0Var.m(a16Var, this) == wneVar22) {
                            return wneVar22;
                        }
                        qx90Var = qx90Var2;
                    }
                    return Unit.f46060a;
                }
                if (!z25) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qx90Var = (qx90) this.k;
                z1x.P(obj);
                p7m0 p7m0Var5 = cqs0Var.l;
                vps0 vps0Var = new vps0(cqs0Var.n, qx90Var.d);
                p7m0Var5.getClass();
                p7m0Var5.o(null, vps0Var);
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z26 = this.j;
                if (z26) {
                    if (z26) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                jz80 jz80Var = (jz80) this.k;
                this.j = true;
                Object objD2 = ((jrs0) obj2).d(jz80Var, this);
                return objD2 == wneVar23 ? wneVar23 : objD2;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z27 = this.j;
                if (z27) {
                    if (z27) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                lva0 lva0Var = (lva0) this.k;
                this.j = true;
                Object objA2 = ((krs0) obj2).a(lva0Var, this);
                return objA2 == wneVar24 ? wneVar24 : objA2;
            case 24:
                hox hoxVar = (hox) obj2;
                wne wneVar25 = wne.f39444a;
                boolean z28 = this.j;
                try {
                    if (!z28) {
                        z1x.P(obj);
                        jrs0 jrs0Var = (jrs0) this.k;
                        this.j = true;
                        objH2 = jrs0Var.h(this);
                        if (objH2 == wneVar25) {
                            return wneVar25;
                        }
                    } else {
                        if (!z28) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objH2 = obj;
                    }
                    hoxVar.invoke();
                    return Unit.f46060a;
                } catch (Throwable th) {
                    hoxVar.invoke();
                    throw th;
                }
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Function0 function0 = (Function0) obj2;
                wne wneVar26 = wne.f39444a;
                boolean z29 = this.j;
                try {
                    if (!z29) {
                        z1x.P(obj);
                        krs0 krs0Var = (krs0) this.k;
                        this.j = true;
                        objC2 = krs0Var.c(this);
                        if (objC2 == wneVar26) {
                            return wneVar26;
                        }
                    } else {
                        if (!z29) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objC2 = obj;
                    }
                    function0.invoke();
                    return Unit.f46060a;
                } catch (Throwable th2) {
                    function0.invoke();
                    throw th2;
                }
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    if (((nts0) this.k).d instanceof fyl) {
                        qt2 qt2Var = qt2.f29279a;
                        this.j = true;
                        if (dv2.d((rv2) obj2, qt2Var, this) == wneVar27) {
                            return wneVar27;
                        }
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                jvs0 jvs0Var = (jvs0) obj2;
                kmq kmqVar = (kmq) this.k;
                wne wneVar28 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    int iD = jvs0Var.c.d(R.dimen.size_200);
                    x23 x23Var = new x23(jvs0Var.b);
                    x23Var.f40148a = iD;
                    x23Var.b = iD;
                    Bitmap bitmapB = x23Var.b();
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(bitmapB, this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new fu7((t33) this.k, (byte) 12));
                    x6s0 x6s0Var = new x6s0((agk0) obj2, (byte) 11);
                    this.j = true;
                    if (vsg0VarV.c(x6s0Var, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    j3t0 j3t0Var = (j3t0) this.k;
                    this.j = true;
                    if (j3t0Var.a(obj2, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z33) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ meq0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ meq0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public meq0(els0 els0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        this.l = els0Var;
        this.j = z;
    }
}
