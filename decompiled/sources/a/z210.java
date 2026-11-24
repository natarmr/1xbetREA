package a;

import android.util.Log;
import android.view.textclassifier.TextClassifier;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class z210 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z210(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                return new z210((b310) obj2, yjeVar, (byte) 0);
            case 1:
                return new z210((pn10) obj2, yjeVar, (byte) 1);
            case 2:
                return new z210((ds10) obj2, yjeVar, (byte) 2);
            case 3:
                return new z210((hv10) obj2, yjeVar, (byte) 3);
            case 4:
                return new z210((f120) obj2, yjeVar, (byte) 4);
            case 5:
                return new z210((o720) obj2, yjeVar, (byte) 5);
            case 6:
                return new z210((i820) obj2, yjeVar, (byte) 6);
            case 7:
                return new z210((x920) obj2, yjeVar, (byte) 7);
            case 8:
                return new z210((rg20) obj2, yjeVar, (byte) 8);
            case 9:
                return new z210((mn20) obj2, yjeVar, (byte) 9);
            case 10:
                return new z210((kn20) obj2, yjeVar, (byte) 10);
            case 11:
                return new z210((nn20) obj2, yjeVar, (byte) 11);
            case 12:
                return new z210((l830) obj2, yjeVar, (byte) 12);
            case 13:
                return new z210((rg30) obj2, yjeVar, (byte) 13);
            case 14:
                return new z210((wk40) obj2, yjeVar, (byte) 14);
            case 15:
                return new z210((jx40) obj2, yjeVar, (byte) 15);
            case 16:
                return new z210((rb50) obj2, yjeVar, (byte) 16);
            case 17:
                return new z210((kw50) obj2, yjeVar, (byte) 17);
            case 18:
                return new z210((eh70) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new z210((ji70) obj2, yjeVar, (byte) 19);
            case 20:
                return new z210((sp70) obj2, yjeVar, (byte) 20);
            case 21:
                return new z210((gz70) obj2, yjeVar, (byte) 21);
            case 22:
                return new z210((gz80) obj2, yjeVar, (byte) 22);
            case 23:
                return new z210((org.xplatform.security.impl.presentation.password.change.input_password.f) obj2, yjeVar, (byte) 23);
            case 24:
                return new z210((g090) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new z210((j790) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new z210((p990) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new z210((ep90) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new z210((lw90) obj2, yjeVar, (byte) 28);
            default:
                return new z210((nz90) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((z210) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((z210) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((z210) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((z210) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((z210) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((z210) create((q4f) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((z210) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((z210) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((z210) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((z210) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((z210) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((z210) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((z210) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((z210) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        dxh0 dxh0Var;
        m97 m97Var;
        List listJ;
        Object value;
        lg30 lg30Var;
        Object value2;
        byte b = this.i;
        byte b2 = 19;
        byte b3 = 11;
        int i3 = 2;
        yje yjeVar = null;
        byte b4 = 1;
        byte b5 = 0;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((b310) obj2).w();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                pn10 pn10Var = (pn10) obj2;
                pn10Var.o.d(new u400(pn10Var, s470.LUCKY_WHEEL.b(), b2));
                return Unit.f46060a;
            case 2:
                int i4 = 5;
                int i5 = 2;
                int i6 = 3;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ds10 ds10Var = (ds10) obj2;
                zvh0 zvh0Var = ds10Var.c.a().g.x;
                p7m0 p7m0Var = ds10Var.e;
                while (true) {
                    Object value3 = p7m0Var.getValue();
                    ru9 ru9Var = (ru9) value3;
                    int iOrdinal = zvh0Var.ordinal();
                    if (iOrdinal == 0) {
                        i = i6;
                        i2 = i5;
                        dxh0Var = axh0.f1625a;
                    } else if (iOrdinal != 1) {
                        i2 = i5;
                        if (iOrdinal != i2) {
                            i = i6;
                            if (iOrdinal != i) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        } else {
                            i = i6;
                            dxh0Var = cxh0.f5122a;
                        }
                    } else {
                        i = i6;
                        i2 = i5;
                        dxh0Var = zwh0.f45106a;
                    }
                    int i7 = i4;
                    if (p7m0Var.m(value3, ru9.a(ru9Var, dxh0Var, 0, i7))) {
                        return Unit.f46060a;
                    }
                    i5 = i2;
                    i6 = i;
                    i4 = i7;
                }
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                hv10 hv10Var = (hv10) obj2;
                sj3.O(hv10Var);
                sj3.T(hv10Var);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                f120 f120Var = (f120) obj2;
                int i8 = f120.p0;
                f120Var.Q();
                if (((v020) f120Var.D()).m.f7815a) {
                    f120Var.S();
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                o720 o720Var = (o720) obj2;
                p7m0 p7m0Var2 = o720Var.c;
                j720 j720Var = new j720(o720Var.b.f(R.string.error_something_went_wrong, new Object[0]));
                p7m0Var2.getClass();
                p7m0Var2.o(null, j720Var);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                i820 i820Var = (i820) obj2;
                atz atzVar = i820.U1;
                i820Var.G0().u.e(i820Var.R1, false);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var3 = ((x920) obj2).C;
                p7m0Var3.getClass();
                p7m0Var3.o(null, "");
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var4 = ((rg20) obj2).I;
                p7m0Var4.getClass();
                p7m0Var4.o(null, fe20.f9384a);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                mn20 mn20Var = (mn20) obj2;
                if (((nb7) ((h03) mn20Var.B.f6397a).b).f23225a.getValue() == null && (m97Var = (m97) mn20Var.y.a("BET_INFO_SAVE_STATE_KEY")) != null) {
                    mn20Var.z.a(m97Var);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0Var = ((kn20) obj2).d;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                c8d c8dVar = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0Var, copyOnWriteArrayListQ).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                nn20 nn20Var = (nn20) obj2;
                int i9 = nn20.c1;
                nwo0 nwo0VarC = nn20Var.y.c();
                boolean zD = Intrinsics.d(nn20Var.l0.b(), duw.d);
                boolean z = ((b820) nn20Var.D()).k;
                if (((b820) nn20Var.D()).j && (nwo0VarC.f24244a || ((!zD && z) || (nwo0VarC.b && z)))) {
                    nn20Var.H(new ei20(b3));
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                l830 l830Var = (l830) obj2;
                sac.T(new fnq(((n9s) l830Var.o.f40284a).a(), new mq10(l830Var, yjeVar, b2), (byte) 4), jiu0.a(l830Var), e830.h);
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                rg30 rg30Var = (rg30) obj2;
                zzp0 zzp0VarA = rg30Var.p.a();
                yqt yqtVar = rg30Var.o;
                int i10 = zzp0VarA.f45266a;
                if (i10 != 0) {
                    ArrayList arrayList = (ArrayList) yqtVar.f43091a.f17481a.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (((rgv0) obj3).b == i10) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((rgv0) it.next()).f30457a);
                    }
                    listJ = CollectionsKt.L0(CollectionsKt.O0(arrayList3));
                } else {
                    yqtVar.getClass();
                    listJ = q3d.j(lg30.f19988a, lg30.b);
                }
                List list = listJ;
                p7m0 p7m0Var5 = rg30Var.i.f25029a;
                do {
                    value = p7m0Var5.getValue();
                    value.getClass();
                    lg30Var = zzp0VarA.b;
                    list.getClass();
                } while (!p7m0Var5.m(value, new tg30(lg30Var, list)));
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                ((wk40) obj2).x();
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                Log.i("onCreate", "Current screen: ".concat(((rb50) obj2).getClass().getName()));
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                kw50 kw50Var = (kw50) obj2;
                String str = ((zv50) kw50Var.D()).b.c.b;
                String str2 = ((zv50) kw50Var.D()).b.c.f43189a;
                if (str.length() > 0) {
                    kw50Var.y.a(str);
                } else if (str2.length() > 0) {
                    i1w0 i1w0Var2 = kw50Var.C;
                    k0w0 k0w0VarI = cs0.i(i1w0Var2, i1w0Var2);
                    k0w0VarI.h(((h6i) kw50Var.x.f24171a).c().h(str2));
                    ListIterator listIteratorO = b1j.o(i1w0Var2, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO;
                        if (pawVar2.hasNext()) {
                            i1w0Var2.a((oe50) pawVar2.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                ((eh70) obj2).w = true;
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                ((ji70) obj2).u = true;
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                sp70 sp70Var = (sp70) obj2;
                sp70Var.b.d(new cd60((Object) sp70Var, (byte) 20));
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = gz70.E;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                gz70 gz70Var = (gz70) obj2;
                gz70Var.getClass();
                c4m0 c4m0Var2 = gz70.D;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    vsg0 vsg0Var = new vsg0(new fot(i3, yjeVar, b3));
                    g45 g45Var = gz70Var.d.f25659a;
                    m430 m430Var = new m430(new w7e(((vae) g45Var.b).h, g45Var, (byte) 2), gz70Var, (byte) 10);
                    m430 m430Var2 = new m430(new va(((vae) gz70Var.c.f16283a.b).i, (byte) 10), gz70Var, (byte) 11);
                    m430 m430Var3 = new m430(new va(((vae) gz70Var.l.f10012a.b).m, (byte) 6), gz70Var, (byte) 12);
                    m430 m430Var4 = new m430(new va(((vae) gz70Var.s.f8933a.b).l, (byte) 8), gz70Var, (byte) 13);
                    m430 m430Var5 = new m430(new va(((vae) gz70Var.m.f8933a.b).n, (byte) 5), gz70Var, (byte) 14);
                    m430 m430Var6 = new m430(new va(((vae) gz70Var.e.f25659a.b).o, (byte) 7), gz70Var, (byte) 15);
                    g45 g45Var2 = gz70Var.y.f15374a;
                    gz70.D = slb.U(new dnq(new dnq(aoq.c(new fnq(aoq.c(i120.W(aoq.b(vsg0Var, m430Var, m430Var2, m430Var3, m430Var4, m430Var5, m430Var6, new m430(new w7e(((vae) g45Var2.b).p, g45Var2, (byte) 0), gz70Var, (byte) 16))), new ly70(b5, yjeVar, gz70Var)), new my70(b5, yjeVar, gz70Var), (byte) 4), new ly70(b4, yjeVar, gz70Var)), new qos((Object) gz70Var, yjeVar, (byte) 26), (byte) 1), new y0g(gz70Var, (yje) null, (byte) 8), (byte) 0), d5c.a(gz70Var.C.b));
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                gz80 gz80Var = (gz80) obj2;
                if (gz80Var.C.f27342a.d().r(fk60.CYBER_PARTNERS)) {
                    gz80Var.G(yy80.f43455a);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                org.xplatform.security.impl.presentation.password.change.input_password.f fVar = (org.xplatform.security.impl.presentation.password.change.input_password.f) obj2;
                fVar.p.f(a090.f16a);
                p7m0 p7m0Var6 = fVar.m;
                Boolean bool = Boolean.TRUE;
                p7m0Var6.getClass();
                p7m0Var6.o(null, bool);
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                d190 d190Var = (d190) ((g090) obj2).f10448a;
                d190Var.getClass();
                try {
                    String strC = q7d0.c(d190Var.f5302a, "ACCOUNT_FIELDS_KEY");
                    if (strC != null && strC.length() != 0) {
                        vby vbyVar = d190Var.b;
                        qaj qajVar = vbyVar.b;
                        sgy sgyVarB = sre0.f32672a.b(gd.class);
                        qajVar.getClass();
                        jiy jiyVarD = qajVar.d(sgyVarB, iun.f15405a);
                        if (jiyVarD != null) {
                            return (List) vbyVar.b(new zw3(jiyVarD, (byte) 0), strC);
                        }
                        throw new fhi0(j2e.Q(sgyVarB));
                    }
                    return iun.f15405a;
                } catch (Exception unused) {
                    return iun.f15405a;
                }
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                j790 j790Var = (j790) obj2;
                j790Var.G(new t690(j790Var.x.f15748a.b()));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                ((p990) obj2).y.f(a990.f467a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                vcc.f0(i120.V(new Pair("PICKER_DIALOG_TAG", Boolean.TRUE)), (ep90) obj2, "PICKER_DIALOG_TAG");
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                lw90 lw90Var = (lw90) obj2;
                TextClassifier textClassifierG = ia3.g(lw90Var.b, lw90Var.c);
                lw90Var.f = textClassifierG;
                return textClassifierG;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                nz90 nz90Var = (nz90) obj2;
                int i11 = ((x48) nz90Var.D()).f + 1;
                nz90Var.o.e("KEY_CURRENT_PHOTO", Integer.valueOf(i11));
                p7m0 p7m0Var7 = nz90Var.i.f25029a;
                do {
                    value2 = p7m0Var7.getValue();
                    value2.getClass();
                    nz90Var.f.getClass();
                } while (!p7m0Var7.m(value2, x48.a((x48) value2, false, false, false, i11, 31)));
                return Unit.f46060a;
        }
    }
}
