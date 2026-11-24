package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.registration.api.domain.models.BonusInfoModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CurrencyStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.PhoneStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.RegionStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.SocialStateModel;
import org.xplatform.registration.success.api.RegistrationSuccessParams;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.web_rules.impl.presentation.navigation.Screens$WebRulesScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class x5f0 extends i3t0 {
    public static final /* synthetic */ int z0 = 0;
    public final tkt0 A;
    public final owp0 B;
    public final fnu C;
    public final h0q0 D;
    public final a7q E;
    public final roi0 F;
    public final bk3 G;
    public final a7q H;
    public final ntu I;
    public final ieu J;
    public final cmt K;
    public final m0u L;
    public final ivn M;
    public final z4w0 N;
    public final svu O;
    public final fnu P;
    public final gnu Q;
    public final vrb0 R;
    public final vqb S;
    public final rpt T;
    public final xfu U;
    public final cmt V;
    public final cyh W;
    public final reu X;
    public final lhf0 Y;
    public final mne Z;
    public final ctf0 a0;
    public final i1w0 b0;
    public final duj c0;
    public final gqc d0;
    public final vqc e0;
    public final h03 f0;
    public final lsn g0;
    public final ytt h0;
    public final xte0 i0;
    public final ali j0;
    public final mi70 k0;
    public final jru l0;
    public final rpt m0;
    public final rqt n0;
    public final sek o;
    public final m1e o0;
    public final yox p;
    public final s64 p0;
    public final bzs0 q;
    public final a7q q0;
    public final b8u r;
    public final bzu r0;
    public final es s;
    public final nh70 s0;
    public final pmi t;
    public final lme0 t0;
    public final f7u u;
    public final a7q u0;
    public final a6u v;
    public bby v0;
    public final a6u w;
    public c4m0 w0;
    public final fnu x;
    public final p7m0 x0;
    public final b8u y;
    public final g090 y0;
    public final aqt z;

    /* JADX WARN: Illegal instructions before constructor call */
    public x5f0(es esVar, h03 h03Var, bk3 bk3Var, s64 s64Var, vqb vqbVar, gqc gqcVar, vqc vqcVar, m1e m1eVar, mne mneVar, cyh cyhVar, ali aliVar, pmi pmiVar, duj dujVar, sek sekVar, lsn lsnVar, ivn ivnVar, a7q a7qVar, a7q a7qVar2, a7q a7qVar3, a7q a7qVar4, cmt cmtVar, cmt cmtVar2, rpt rptVar, rpt rptVar2, aqt aqtVar, rqt rqtVar, tqt tqtVar, ytt yttVar, bzt bztVar, m0u m0uVar, n4u n4uVar, a6u a6uVar, a6u a6uVar2, f7u f7uVar, f7u f7uVar2, b8u b8uVar, b8u b8uVar2, lbu lbuVar, ieu ieuVar, reu reuVar, xfu xfuVar, fnu fnuVar, fnu fnuVar2, fnu fnuVar3, gnu gnuVar, jru jruVar, pru pruVar, ntu ntuVar, svu svuVar, bzu bzuVar, yox yoxVar, nh70 nh70Var, mi70 mi70Var, vrb0 vrb0Var, lme0 lme0Var, xte0 xte0Var, lhf0 lhf0Var, ctf0 ctf0Var, vzg0 vzg0Var, roi0 roi0Var, owp0 owp0Var, h0q0 h0q0Var, bzs0 bzs0Var, tkt0 tkt0Var, i1w0 i1w0Var, z4w0 z4w0Var) {
        aqtVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new x4f0(pruVar, f7uVar2, n4uVar, vzg0Var, rqtVar, lbuVar, bztVar, (byte) 0), g090VarP, new iv80(ctf0Var, (byte) 20), (yzn0) null);
        this.o = sekVar;
        this.p = yoxVar;
        this.q = bzs0Var;
        this.r = b8uVar;
        this.s = esVar;
        this.t = pmiVar;
        this.u = f7uVar;
        this.v = a6uVar;
        this.w = a6uVar2;
        this.x = fnuVar;
        this.y = b8uVar2;
        this.z = aqtVar;
        this.A = tkt0Var;
        this.B = owp0Var;
        this.C = fnuVar2;
        this.D = h0q0Var;
        this.E = a7qVar;
        this.F = roi0Var;
        this.G = bk3Var;
        this.H = a7qVar2;
        this.I = ntuVar;
        this.J = ieuVar;
        this.K = cmtVar;
        this.L = m0uVar;
        this.M = ivnVar;
        this.N = z4w0Var;
        this.O = svuVar;
        this.P = fnuVar3;
        this.Q = gnuVar;
        this.R = vrb0Var;
        this.S = vqbVar;
        this.T = rptVar;
        this.U = xfuVar;
        this.V = cmtVar2;
        this.W = cyhVar;
        this.X = reuVar;
        this.Y = lhf0Var;
        this.Z = mneVar;
        this.a0 = ctf0Var;
        this.b0 = i1w0Var;
        this.c0 = dujVar;
        this.d0 = gqcVar;
        this.e0 = vqcVar;
        this.f0 = h03Var;
        this.g0 = lsnVar;
        this.h0 = yttVar;
        this.i0 = xte0Var;
        this.j0 = aliVar;
        this.k0 = mi70Var;
        this.l0 = jruVar;
        this.m0 = rptVar2;
        this.n0 = rqtVar;
        this.o0 = m1eVar;
        this.p0 = s64Var;
        this.q0 = a7qVar3;
        this.r0 = bzuVar;
        this.s0 = nh70Var;
        this.t0 = lme0Var;
        this.u0 = a7qVar4;
        this.x0 = q7m0.a(((u4f0) D()).j);
        byte b = 1;
        this.y0 = new g090(vzg0Var, new y4f0(this, b));
        sac.V(jiu0.a(this), r5f0.f29882a, null, mneVar.c, new q5f0(this, yjeVar, b), 10);
        lc00 lc00VarF = tqt.f(pruVar.a().k);
        ArrayList arrayList = new ArrayList(r3d.q(lc00VarF, 10));
        ListIterator listIterator = lc00VarF.listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                break;
            } else {
                arrayList.add(Integer.valueOf(((t54) pawVar.next()).f33350a));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).intValue() != 11 || ((xr) this.m0.f30901a).i() == rl40.GMS) {
                arrayList2.add(obj);
            }
        }
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            ArrayList arrayList3 = arrayList2;
            if (p7m0Var.m(value, u4f0.a((u4f0) value, false, false, null, null, null, arrayList3, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741791))) {
                qjj.W(jiu0.a(this), this.Z.f22085a, null, new s5f0(this, yjeVar, b), 2);
                slb.U(new dnq(new fnq(this.o0.b(), new q5f0(this, yjeVar, (byte) 2), (byte) 4), new pr60(3, yjeVar, (byte) 24), (byte) 1), jiu0.a(this));
                return;
            }
            arrayList2 = arrayList3;
        }
    }

    public static DateCalendarBottomSheetParams M(x5f0 x5f0Var, long j, Long l, Long l2, int i) {
        SimpleDate simpleDateG0;
        SimpleDate simpleDate;
        SimpleDate simpleDate2;
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            l2 = null;
        }
        Calendar calendar = Calendar.getInstance();
        if (l != null) {
            long jLongValue = l.longValue();
            calendar.getClass();
            simpleDateG0 = bsr0.g0(jLongValue, calendar);
        } else {
            simpleDateG0 = null;
        }
        if (l2 != null) {
            long jLongValue2 = l2.longValue();
            calendar.getClass();
            simpleDate = bsr0.g0(jLongValue2, calendar);
        } else {
            simpleDate = null;
        }
        String strA = x5f0Var.a0.b.a(R.string.calendar_date_module_select_date, Arrays.copyOf(new Object[0], 0));
        if (simpleDateG0 != null) {
            simpleDate2 = simpleDateG0;
        } else {
            if (simpleDate == null) {
                jf4.o("Required value was null.");
                return null;
            }
            simpleDate2 = new SimpleDate(simpleDate.f47286a - 100, simpleDate.b, simpleDate.c);
        }
        if (simpleDate == null) {
            if (simpleDateG0 == null) {
                jf4.o("Required value was null.");
                return null;
            }
            simpleDate = new SimpleDate(simpleDateG0.f47286a + 100, simpleDateG0.b, simpleDateG0.c);
        }
        calendar.getClass();
        return new DateCalendarBottomSheetParams(strA, simpleDate2, simpleDate, bsr0.g0(j, calendar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(ArrayList arrayList, zje zjeVar) {
        c5f0 c5f0Var;
        String str;
        if (zjeVar instanceof c5f0) {
            c5f0Var = (c5f0) zjeVar;
            int i = c5f0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5f0Var.m = i - Integer.MIN_VALUE;
            } else {
                c5f0Var = new c5f0(this, zjeVar);
            }
        } else {
            c5f0Var = new c5f0(this, zjeVar);
        }
        Object obj = c5f0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = c5f0Var.m;
        if (i2 == 0) {
            ArrayList arrayListT = twn.t(obj);
            for (Object obj2 : arrayList) {
                if (obj2 instanceof u1q) {
                    arrayListT.add(obj2);
                }
            }
            u1q u1qVar = (u1q) CollectionsKt.firstOrNull(arrayListT);
            String str2 = u1qVar != null ? u1qVar.b : null;
            if (str2 == null) {
                str2 = "";
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof u1q) {
                    arrayList2.add(obj3);
                }
            }
            u1q u1qVar2 = (u1q) CollectionsKt.firstOrNull(arrayList2);
            String str3 = u1qVar2 != null ? u1qVar2.c : null;
            if (str3 == null) {
                str3 = "";
            }
            if (!StringsKt.W(str2)) {
                String strConcat = str3.concat(str2);
                c5f0Var.i = arrayList;
                c5f0Var.j = str2;
                c5f0Var.m = 1;
                Object objB0 = this.S.f37848a.b0(strConcat, c5f0Var);
                if (objB0 == wneVar) {
                    return wneVar;
                }
                String str4 = str2;
                obj = objB0;
                str = str4;
            }
            return arrayList;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = c5f0Var.j;
        arrayList = c5f0Var.i;
        z1x.P(obj);
        o4c o4cVar = (o4c) obj;
        if (o4cVar.b.length() > 0) {
            w3d.y(arrayList, new bue0((byte) 7));
            arrayList.add(new u1q(true, twn.p("[^0-9]", str, ""), o4cVar.f24626a));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(zje zjeVar) {
        d5f0 d5f0Var;
        if (zjeVar instanceof d5f0) {
            d5f0Var = (d5f0) zjeVar;
            int i = d5f0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                d5f0Var.k = i - Integer.MIN_VALUE;
            } else {
                d5f0Var = new d5f0(this, zjeVar);
            }
        } else {
            d5f0Var = new d5f0(this, zjeVar);
        }
        Object objI = d5f0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = d5f0Var.k;
        if (i2 == 0) {
            z1x.P(objI);
            CountryStateModel countryStateModel = ((u4f0) D()).g.g;
            int i3 = countryStateModel != null ? countryStateModel.f46853a : -1;
            CurrencyStateModel currencyStateModel = ((u4f0) D()).g.h;
            int i4 = currencyStateModel != null ? currencyStateModel.f46854a : -1;
            d5f0Var.k = 1;
            objI = this.M.i(i3, i4, d5f0Var);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objI);
        }
        return new Integer(((BonusInfoModel) objI).f46848a);
    }

    public final void P(qu4 qu4Var) {
        cl clVar = qu4Var.c;
        cl clVar2 = cl.f4533a;
        i1w0 i1w0Var = this.b0;
        if (clVar == clVar2) {
            i1w0Var.d(new xwe0(this, qu4Var, (byte) 17));
            return;
        }
        PhoneStateModel phoneStateModel = ((u4f0) D()).g.r;
        String str = phoneStateModel != null ? phoneStateModel.c : null;
        if (str == null) {
            str = "";
        }
        lm90 lm90Var = new lm90(twn.p("\\d", str, TokenNames.X), TokenNames.X);
        PhoneStateModel phoneStateModel2 = ((u4f0) D()).g.r;
        String strB = lm90Var.b(String.valueOf(phoneStateModel2 != null ? phoneStateModel2.f46856a : null));
        PhoneStateModel phoneStateModel3 = ((u4f0) D()).g.r;
        i1w0Var.d(new zlb0(this, qu4Var, w6x.q(phoneStateModel3 != null ? phoneStateModel3.b : null, Separators.SP, strB), (byte) 15));
    }

    public final void Q(Throwable th) {
        Object value;
        G(n4f0.f22895a);
        th.printStackTrace();
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, u4f0.a((u4f0) value, false, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741820)));
    }

    public final void R(nq90 nq90Var) {
        Object value;
        Object next;
        boolean z = nq90Var instanceof iq90;
        g090 g090Var = this.y0;
        if (z && ((iq90) nq90Var).f15199a != 126) {
            Iterator it = ((u4f0) D()).d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((q0f0) next) instanceof zze0));
            q0f0 q0f0Var = (q0f0) next;
            if (q0f0Var != null && q0f0Var.a() && ((u4f0) D()).r.J) {
                ((y4f0) g090Var.b).invoke(new t1f0(g090Var, (byte) 3));
            }
        }
        ((y4f0) g090Var.b).invoke(new xwe0(nq90Var, g090Var, (byte) 8));
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, u4f0.a((u4f0) value, false, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741820)));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void S(final Throwable th) {
        jrp jrpVar;
        int i;
        String str;
        boolean z = th instanceof t3c;
        String strA = "";
        boolean z2 = true;
        z2 = true;
        final byte b = 0;
        xte0 xte0Var = this.i0;
        if (z) {
            String str2 = ((t3c) th).f33259a;
            strA = str2 != null ? str2 : "";
            u0f0 u0f0Var = u0f0.l;
            j0(u0f0Var, new mrp(strA));
            G(new m4f0(strA));
            PhoneStateModel phoneStateModel = ((u4f0) D()).g.r;
            str = phoneStateModel != null ? phoneStateModel.b : null;
            if (str != null && str.length() != 0) {
                z2 = false;
            }
            Map mapB = wp20.b(new Pair(u0f0Var, new mrp(strA)));
            r1f0 r1f0Var = ((u4f0) D()).g;
            q7f0 q7f0Var = ((u4f0) D()).g.M;
            if (q7f0Var == null) {
                q7f0Var = q7f0.FULL;
            }
            xte0Var.l(z2, mapB, q7f0Var);
            return;
        }
        boolean z3 = th instanceof dox;
        ctf0 ctf0Var = this.a0;
        if (z3) {
            Map map = ((dox) th).f6433a;
            if (!map.isEmpty()) {
                PhoneStateModel phoneStateModel2 = ((u4f0) D()).g.r;
                String str3 = phoneStateModel2 != null ? phoneStateModel2.b : null;
                boolean z4 = str3 == null || str3.length() == 0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = map.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    jrpVar = jrp.f17014a;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!Intrinsics.d(entry.getValue(), jrpVar)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                r1f0 r1f0Var2 = ((u4f0) D()).g;
                q7f0 q7f0Var2 = ((u4f0) D()).g.M;
                if (q7f0Var2 == null) {
                    q7f0Var2 = q7f0.FULL;
                }
                xte0Var.l(z4, linkedHashMap, q7f0Var2);
                q7f0 q7f0Var3 = ((u4f0) D()).j;
                if (q7f0Var3 == null) {
                    q7f0Var3 = q7f0.FULL;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(((u4f0) D()).e);
                linkedHashMap2.put(q7f0Var3, map);
                p7m0 p7m0Var = this.i.f25029a;
                while (true) {
                    Object value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    if (p7m0Var.m(value, u4f0.a((u4f0) value, false, false, null, null, linkedHashMap3, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741807))) {
                        break;
                    } else {
                        linkedHashMap2 = linkedHashMap3;
                    }
                }
                if (map.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it2 = map.entrySet().iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (!Intrinsics.d(((Map.Entry) it2.next()).getValue(), jrpVar)) {
                            i++;
                        }
                    }
                }
                if (i <= 1) {
                    u0f0 u0f0Var2 = u0f0.l;
                    if (Intrinsics.d(map.get(u0f0Var2), nrp.f24014a)) {
                        strA = ctf0Var.b.a(R.string.does_not_meet_the_requirements_error, Arrays.copyOf(new Object[0], 0));
                    } else {
                        Object obj = map.get(u0f0Var2);
                        mrp mrpVar = obj instanceof mrp ? (mrp) obj : null;
                        str = mrpVar != null ? mrpVar.f22284a : null;
                        if (str != null) {
                            strA = str;
                        }
                    }
                }
                G(new m4f0(strA));
                return;
            }
        }
        boolean z5 = th instanceof mm90;
        s4f0 s4f0Var = s4f0.f31602a;
        if (z5) {
            G(s4f0Var);
            return;
        }
        boolean z6 = th instanceof nqt0;
        byte b2 = 2;
        g090 g090Var = this.y0;
        if (z6) {
            xte0Var.q();
            G(s4f0Var);
            ((y4f0) g090Var.b).invoke(new t1f0(g090Var, b2));
            return;
        }
        boolean z7 = th instanceof vkk0;
        duj dujVar = this.c0;
        if (z7) {
            xte0Var.q();
            ((y4f0) g090Var.b).invoke(new t1f0(g090Var, b2));
            dujVar.b(th, new Function2(this) { // from class: a.a5f0
                public final /* synthetic */ x5f0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    byte b3 = b;
                    Throwable th2 = th;
                    x5f0 x5f0Var = this.b;
                    Throwable th3 = (Throwable) obj2;
                    String str4 = (String) obj3;
                    switch (b3) {
                        case 0:
                            th3.getClass();
                            str4.getClass();
                            x5f0Var.G(new q4f0(((vkk0) th2).f37578a));
                            break;
                        default:
                            th3.getClass();
                            str4.getClass();
                            String message = th2.getMessage();
                            if (message == null) {
                                message = x5f0Var.a0.b.a(R.string.error_during_registration, Arrays.copyOf(new Object[0], 0));
                            }
                            x5f0Var.G(new q4f0(message));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (th instanceof orv0) {
            j0(u0f0.h, srp.f32690a);
            G(new m4f0(ctf0Var.f(R.string.input_correct_phone, new Object[0])));
            return;
        }
        if (!(th instanceof zhi0)) {
            dujVar.b(th, new yr0(th, (byte) 26));
            return;
        }
        zhi0 zhi0Var = (zhi0) th;
        q7f0 q7f0Var4 = ((u4f0) D()).g.M;
        if (q7f0Var4 == null) {
            q7f0Var4 = q7f0.FULL;
        }
        r1f0 r1f0Var3 = ((u4f0) D()).g;
        xte0Var.g(zhi0Var, q7f0Var4);
        final byte b3 = z2 ? (byte) 1 : (byte) 0;
        dujVar.b(th, new Function2(this) { // from class: a.a5f0
            public final /* synthetic */ x5f0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                byte b4 = b3;
                Throwable th2 = th;
                x5f0 x5f0Var = this.b;
                Throwable th3 = (Throwable) obj2;
                String str4 = (String) obj3;
                switch (b4) {
                    case 0:
                        th3.getClass();
                        str4.getClass();
                        x5f0Var.G(new q4f0(((vkk0) th2).f37578a));
                        break;
                    default:
                        th3.getClass();
                        str4.getClass();
                        String message = th2.getMessage();
                        if (message == null) {
                            message = x5f0Var.a0.b.a(R.string.error_during_registration, Arrays.copyOf(new Object[0], 0));
                        }
                        x5f0Var.G(new q4f0(message));
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    public final void T(zqt0 zqt0Var) {
        String strValueOf = String.valueOf(zqt0Var.f44823a);
        String str = zqt0Var.b;
        PhoneStateModel phoneStateModel = ((u4f0) D()).g.r;
        String str2 = phoneStateModel != null ? phoneStateModel.b : null;
        String str3 = str2 == null ? "" : str2;
        PhoneStateModel phoneStateModel2 = ((u4f0) D()).g.r;
        String str4 = phoneStateModel2 != null ? phoneStateModel2.f46856a : null;
        String str5 = str4 == null ? "" : str4;
        CountryStateModel countryStateModel = ((u4f0) D()).g.g;
        Integer numValueOf = countryStateModel != null ? Integer.valueOf(countryStateModel.f46853a) : null;
        q7f0 q7f0Var = ((u4f0) D()).g.M;
        if (q7f0Var == null) {
            q7f0Var = q7f0.FULL;
        }
        q7f0 q7f0Var2 = q7f0Var;
        String str6 = ((u4f0) D()).g.u;
        String str7 = str6 == null ? "" : str6;
        BonusStateModel bonusStateModel = ((u4f0) D()).g.c;
        String str8 = bonusStateModel != null ? bonusStateModel.b : null;
        String str9 = str8 == null ? "" : str8;
        CountryStateModel countryStateModel2 = ((u4f0) D()).g.g;
        String str10 = countryStateModel2 != null ? countryStateModel2.b : null;
        String str11 = str10 == null ? "" : str10;
        CurrencyStateModel currencyStateModel = ((u4f0) D()).g.h;
        String str12 = currencyStateModel != null ? currencyStateModel.b : null;
        String str13 = str12 == null ? "" : str12;
        CountryStateModel countryStateModel3 = ((u4f0) D()).g.g;
        String str14 = countryStateModel3 != null ? countryStateModel3.e : null;
        RegistrationSuccessParams registrationSuccessParams = new RegistrationSuccessParams(strValueOf, str, str3, str5, numValueOf, q7f0Var2, str14 == null ? "" : str14, str7, str11, str13, str9, ((u4f0) D()).A.f4650a, ((u4f0) D()).g.D);
        i1w0 i1w0Var = this.b0;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        this.t0.getClass();
        k0w0VarI.l(lme0.a(registrationSuccessParams));
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01a3 A[PHI: r3
  0x01a3: PHI (r3v7 org.xplatform.registration.api.domain.models.BonusInfoModel) = 
  (r3v6 org.xplatform.registration.api.domain.models.BonusInfoModel)
  (r3v9 org.xplatform.registration.api.domain.models.BonusInfoModel)
  (r3v11 org.xplatform.registration.api.domain.models.BonusInfoModel)
 binds: [B:50:0x017c, B:58:0x0197, B:60:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
    
        if (r1 == r3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(a.zje r41) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x5f0.U(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V(zje zjeVar) {
        m5f0 m5f0Var;
        if (zjeVar instanceof m5f0) {
            m5f0Var = (m5f0) zjeVar;
            int i = m5f0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                m5f0Var.k = i - Integer.MIN_VALUE;
            } else {
                m5f0Var = new m5f0(this, zjeVar);
            }
        } else {
            m5f0Var = new m5f0(this, zjeVar);
        }
        Object objE = m5f0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = m5f0Var.k;
        if (i2 == 0) {
            z1x.P(objE);
            List list = ((u4f0) D()).d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof kze0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                m5f0Var.k = 1;
                objE = this.H.e(m5f0Var);
                if (objE == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objE);
        List list2 = (List) objE;
        if (list2.size() == 1) {
            jkc jkcVar = (jkc) CollectionsKt.U(list2);
            g090 g090Var = this.y0;
            g090Var.getClass();
            jkcVar.getClass();
            ((y4f0) g090Var.b).invoke(new xwe0(jkcVar, g090Var, (byte) 11));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0 A[PHI: r2 r14
  0x00d0: PHI (r2v4 a.elt) = (r2v3 a.elt), (r2v10 a.elt) binds: [B:44:0x00cd, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r14v20 java.lang.Object) = (r14v17 java.lang.Object), (r14v1 java.lang.Object) binds: [B:44:0x00cd, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:65:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0130  */
    /* JADX WARN: Code duplicated, block: B:74:0x013a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x0172 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[LOOP:0: B:72:0x0134->B:89:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[LOOP:1: B:52:0x00e5->B:92:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[LOOP:2: B:27:0x0076->B:95:?, LOOP_END, SYNTHETIC] */
    public final Object W(zje zjeVar) {
        n5f0 n5f0Var;
        elt eltVar;
        List list;
        rkt rktVar;
        CountryStateModel countryStateModel;
        int i;
        Iterable iterable;
        Iterator it;
        int i2;
        RegionStateModel regionStateModel;
        int i3;
        Object objB;
        int i4;
        elt eltVar2;
        String str;
        String str2;
        byte b;
        Iterable iterable2;
        Iterator it2;
        if (zjeVar instanceof n5f0) {
            n5f0Var = (n5f0) zjeVar;
            int i5 = n5f0Var.m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                n5f0Var.m = i5 - Integer.MIN_VALUE;
            } else {
                n5f0Var = new n5f0(this, zjeVar);
            }
        } else {
            n5f0Var = new n5f0(this, zjeVar);
        }
        Object objI = n5f0Var.k;
        wne wneVar = wne.f39444a;
        int i6 = n5f0Var.m;
        g090 g090Var = this.y0;
        boolean z = false;
        Object obj = null;
        if (i6 == 0) {
            z1x.P(objI);
            n5f0Var.m = 1;
            objI = this.J.i(n5f0Var);
            if (objI != wneVar) {
            }
            return wneVar;
        }
        if (i6 == 1) {
            z1x.P(objI);
        } else {
            if (i6 == 2) {
                eltVar = n5f0Var.i;
                z1x.P(objI);
                list = (List) objI;
                for (Object obj2 : list) {
                    if (((rkt) obj2).f30664a == eltVar.e) {
                        obj = obj2;
                        break;
                    }
                }
                rktVar = (rkt) obj;
                if (rktVar == null) {
                    if (list.size() == 1) {
                        return Unit.f46060a;
                    }
                    rktVar = (rkt) CollectionsKt.U(list);
                }
                g090Var.getClass();
                rktVar.getClass();
                ((y4f0) g090Var.b).invoke(new xwe0(rktVar, g090Var, (byte) 13));
                countryStateModel = ((u4f0) D()).g.g;
                if (countryStateModel != null) {
                    i = countryStateModel.f46853a;
                } else {
                    i = -1;
                }
                n5f0Var.i = eltVar;
                n5f0Var.m = 3;
                objI = this.U.e(i, n5f0Var);
                if (objI != wneVar) {
                    iterable = (Iterable) objI;
                    if (iterable instanceof Collection) {
                        it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = 0;
                                break;
                            }
                            if (((qse0) it.next()).f29255a == eltVar.f) {
                                i2 = 1;
                                break;
                            }
                        }
                    } else {
                        it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = 0;
                                break;
                            }
                            if (((qse0) it.next()).f29255a == eltVar.f) {
                                i2 = 1;
                                break;
                            }
                        }
                    }
                    if (i2 != 0) {
                        regionStateModel = ((u4f0) D()).g.v;
                        if (regionStateModel != null) {
                            i3 = regionStateModel.f46857a;
                        } else {
                            i3 = eltVar.f;
                        }
                        n5f0Var.i = eltVar;
                        n5f0Var.j = i2;
                        n5f0Var.m = 4;
                        objB = this.V.b(i3, n5f0Var);
                        if (objB != wneVar) {
                            int i7 = i2;
                            objI = objB;
                            i4 = i7;
                            eltVar2 = eltVar;
                        }
                    }
                    str = eltVar.c;
                    str2 = eltVar.d;
                    b = 8;
                    if (str.length() > 0) {
                        ((y4f0) g090Var.b).invoke(new xwe0(new lq90(eltVar.c, eltVar.f, true), g090Var, b));
                    }
                    if (str2.length() > 0) {
                        ((y4f0) g090Var.b).invoke(new xwe0(new fq90(str2, eltVar.g, true), g090Var, b));
                    }
                    return Unit.f46060a;
                }
                return wneVar;
            }
            if (i6 == 3) {
                eltVar = n5f0Var.i;
                z1x.P(objI);
                iterable = (Iterable) objI;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = 0;
                            break;
                        }
                        if (((qse0) it.next()).f29255a == eltVar.f) {
                            i2 = 1;
                            break;
                        }
                    }
                } else {
                    i2 = 0;
                    break;
                }
                if (i2 != 0) {
                    regionStateModel = ((u4f0) D()).g.v;
                    if (regionStateModel != null) {
                        i3 = regionStateModel.f46857a;
                    } else {
                        i3 = eltVar.f;
                    }
                    n5f0Var.i = eltVar;
                    n5f0Var.j = i2;
                    n5f0Var.m = 4;
                    objB = this.V.b(i3, n5f0Var);
                    if (objB != wneVar) {
                        int i8 = i2;
                        objI = objB;
                        i4 = i8;
                        eltVar2 = eltVar;
                    }
                    return wneVar;
                }
                str = eltVar.c;
                str2 = eltVar.d;
                b = 8;
                if (str.length() > 0 && i2 != 0) {
                    ((y4f0) g090Var.b).invoke(new xwe0(new lq90(eltVar.c, eltVar.f, true), g090Var, b));
                }
                if (str2.length() > 0 && z) {
                    ((y4f0) g090Var.b).invoke(new xwe0(new fq90(str2, eltVar.g, true), g090Var, b));
                }
                return Unit.f46060a;
            }
            if (i6 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = n5f0Var.j;
            eltVar2 = n5f0Var.i;
            z1x.P(objI);
        }
        iterable2 = (Iterable) objI;
        if (!(iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            i2 = i4;
            eltVar = eltVar2;
            break;
        }
        it2 = iterable2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i2 = i4;
                eltVar = eltVar2;
                break;
            }
            if (((skc) it2.next()).f32339a == eltVar2.g) {
                i2 = i4;
                eltVar = eltVar2;
                z = true;
                break;
            }
        }
        str = eltVar.c;
        str2 = eltVar.d;
        b = 8;
        if (str.length() > 0) {
            ((y4f0) g090Var.b).invoke(new xwe0(new lq90(eltVar.c, eltVar.f, true), g090Var, b));
        }
        if (str2.length() > 0) {
            ((y4f0) g090Var.b).invoke(new xwe0(new fq90(str2, eltVar.g, true), g090Var, b));
        }
        return Unit.f46060a;
        eltVar = (elt) objI;
        n5f0Var.i = eltVar;
        n5f0Var.m = 2;
        objI = this.Y.u(n5f0Var);
        if (objI != wneVar) {
            list = (List) objI;
            while (r5.hasNext()) {
                if (((rkt) obj2).f30664a == eltVar.e) {
                    obj = obj2;
                    break;
                }
            }
            rktVar = (rkt) obj;
            if (rktVar == null) {
                if (list.size() == 1) {
                    return Unit.f46060a;
                }
                rktVar = (rkt) CollectionsKt.U(list);
            }
            g090Var.getClass();
            rktVar.getClass();
            ((y4f0) g090Var.b).invoke(new xwe0(rktVar, g090Var, (byte) 13));
            countryStateModel = ((u4f0) D()).g.g;
            if (countryStateModel != null) {
                i = countryStateModel.f46853a;
            } else {
                i = -1;
            }
            n5f0Var.i = eltVar;
            n5f0Var.m = 3;
            objI = this.U.e(i, n5f0Var);
            if (objI != wneVar) {
                iterable = (Iterable) objI;
                if (iterable instanceof Collection) {
                    it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = 0;
                            break;
                        }
                        if (((qse0) it.next()).f29255a == eltVar.f) {
                            i2 = 1;
                            break;
                        }
                    }
                } else {
                    it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = 0;
                            break;
                        }
                        if (((qse0) it.next()).f29255a == eltVar.f) {
                            i2 = 1;
                            break;
                        }
                    }
                }
                if (i2 != 0) {
                    regionStateModel = ((u4f0) D()).g.v;
                    if (regionStateModel != null) {
                        i3 = regionStateModel.f46857a;
                    } else {
                        i3 = eltVar.f;
                    }
                    n5f0Var.i = eltVar;
                    n5f0Var.j = i2;
                    n5f0Var.m = 4;
                    objB = this.V.b(i3, n5f0Var);
                    if (objB != wneVar) {
                        int i9 = i2;
                        objI = objB;
                        i4 = i9;
                        eltVar2 = eltVar;
                        iterable2 = (Iterable) objI;
                        if (!(iterable2 instanceof Collection)) {
                            it2 = iterable2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    i2 = i4;
                                    eltVar = eltVar2;
                                    break;
                                }
                                if (((skc) it2.next()).f32339a == eltVar2.g) {
                                    i2 = i4;
                                    eltVar = eltVar2;
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = iterable2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    i2 = i4;
                                    eltVar = eltVar2;
                                    break;
                                }
                                if (((skc) it2.next()).f32339a == eltVar2.g) {
                                    i2 = i4;
                                    eltVar = eltVar2;
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                str = eltVar.c;
                str2 = eltVar.d;
                b = 8;
                if (str.length() > 0) {
                    ((y4f0) g090Var.b).invoke(new xwe0(new lq90(eltVar.c, eltVar.f, true), g090Var, b));
                }
                if (str2.length() > 0) {
                    ((y4f0) g090Var.b).invoke(new xwe0(new fq90(str2, eltVar.g, true), g090Var, b));
                }
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (r13 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(a.zje r13) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x5f0.X(a.zje):java.lang.Object");
    }

    public final void Y(boolean z) {
        r1f0 r1f0Var = ((u4f0) D()).g;
        q7f0 q7f0Var = ((u4f0) D()).g.M;
        if (q7f0Var == null) {
            q7f0Var = q7f0.FULL;
        }
        this.i0.k(q7f0Var, z);
    }

    public final void Z(int i) {
        Object next;
        Iterator it = ((u4f0) D()).o.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((BonusInfoModel) next).f46848a != i);
        BonusInfoModel bonusInfoModel = (BonusInfoModel) next;
        if (bonusInfoModel == null) {
            return;
        }
        String str = bonusInfoModel.b;
        String str2 = bonusInfoModel.c;
        g090 g090Var = this.y0;
        g090Var.getClass();
        str.getClass();
        str2.getClass();
        ((y4f0) g090Var.b).invoke(new u1f0(i, str, str2, g090Var, (byte) 0));
    }

    public final void a0() {
        Object value;
        c4m0 c4m0Var = this.w0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, u4f0.a((u4f0) value, false, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741820)));
    }

    public final void b0() {
        i1w0 i1w0Var = this.b0;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void c0() {
        sac.V(jiu0.a(this), u5f0.f35091a, null, this.Z.b, new zye0((Object) this, (yje) null, (byte) 5), 10);
    }

    public final void d0(boolean z) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, u4f0.a((u4f0) value, false, false, null, null, null, null, null, null, null, null, null, z, null, false, null, null, null, null, null, null, null, null, 1073725439)));
    }

    public final void e0() {
        u0f0 u0f0Var = u0f0.h;
        g090 g090Var = this.y0;
        g090Var.x(u0f0Var, "");
        g090Var.x(u0f0.k, "");
    }

    public final void f0(File file, dxk dxkVar) {
        sac.V(jiu0.a(this), new y4f0(this, (byte) 3), null, this.Z.f22085a, new pnd0((byte) 5, null, file, this, dxkVar), 10);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r15 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        if (r15 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        if (r15 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        if (r15 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
    
        if (r15 == r0) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(java.util.List r10, a.ynb0 r11, int r12, boolean r13, boolean r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x5f0.g0(java.util.List, a.ynb0, int, boolean, boolean, a.zje):java.lang.Object");
    }

    public final void h0() {
        G(d4f0.f5452a);
        sac.V(jiu0.a(this), new qye0(1, this, x5f0.class, "handleRegistrationExceptions", "handleRegistrationExceptions(Ljava/lang/Throwable;)V", 0, (byte) 10), null, this.Z.f22085a, new zye0((Object) this, (yje) null, (byte) 6), 10);
    }

    public final void i0() {
        this.b0.f("PICKER_DIALOG_ITEM_SELECTED_KEY", new z4f0(this, (byte) 1));
    }

    public final void j0(u0f0 u0f0Var, urp urpVar) {
        Object value;
        q7f0 q7f0Var = ((u4f0) D()).j;
        if (q7f0Var == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(((u4f0) D()).e);
        Map map = (Map) linkedHashMap.get(q7f0Var);
        LinkedHashMap linkedHashMap2 = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
        if (urpVar instanceof jrp) {
            linkedHashMap2.remove(u0f0Var);
        } else {
            linkedHashMap2.put(u0f0Var, urpVar);
        }
        linkedHashMap.put(q7f0Var, linkedHashMap2);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, u4f0.a((u4f0) value, false, false, null, null, linkedHashMap, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741807)));
    }

    @Override // a.diu0
    public final void v() {
        ((yse0) this.e0.b).b.f41413a.clear();
        ((gkc) this.f0.b).b.f9684a.clear();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
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
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object next;
        Object next2;
        Integer intOrNull;
        String str;
        bby bbyVar;
        boolean zD;
        String str2;
        String str3;
        q3f0 q3f0Var = (q3f0) obj;
        q3f0Var.getClass();
        super.x(q3f0Var);
        boolean zEquals = q3f0Var.equals(q2f0.f27997a);
        i1w0 i1w0Var = this.b0;
        xte0 xte0Var = this.i0;
        boolean z = false;
        iIntValue = 0;
        int iIntValue = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        final byte b = 1;
        if (zEquals) {
            r1f0 r1f0Var = ((u4f0) D()).g;
            q7f0 q7f0Var = ((u4f0) D()).g.M;
            if (q7f0Var == null) {
                q7f0Var = q7f0.FULL;
            }
            xte0Var.j(q7f0Var);
            List list = ((u4f0) D()).d;
            ArrayList<q0f0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!((q0f0) obj2).a()) {
                    arrayList.add(obj2);
                }
            }
            for (q0f0 q0f0Var : arrayList) {
                if (q0f0Var == null) {
                    zD = true;
                } else if (q0f0Var instanceof gze0) {
                    String str4 = ((u4f0) D()).g.f29678a;
                    if (str4 == null || str4.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof hze0) {
                    if (((u4f0) D()).g.b) {
                        zD = false;
                    } else {
                        zD = true;
                    }
                } else if (q0f0Var instanceof jze0) {
                    zD = Intrinsics.d(((u4f0) D()).v, ((u4f0) D()).g.c);
                } else if (q0f0Var instanceof kze0) {
                    zD = Intrinsics.d(((u4f0) D()).w, ((u4f0) D()).g.o);
                } else if (q0f0Var instanceof lze0) {
                    zD = Intrinsics.d(((u4f0) D()).x, ((u4f0) D()).g.d);
                } else if (q0f0Var instanceof mze0) {
                    if (((u4f0) D()).g.e) {
                        zD = false;
                    } else {
                        zD = true;
                    }
                } else if (q0f0Var instanceof nze0) {
                    zD = Intrinsics.d(((u4f0) D()).s, ((u4f0) D()).g.g);
                } else if (q0f0Var instanceof oze0) {
                    zD = Intrinsics.d(((u4f0) D()).u, ((u4f0) D()).g.h);
                } else if (q0f0Var instanceof pze0) {
                    if (((u4f0) D()).g.i == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof qze0) {
                    if (((u4f0) D()).g.j == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof rze0) {
                    String str5 = ((u4f0) D()).g.k;
                    if (str5 == null || str5.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof sze0) {
                    String str6 = ((u4f0) D()).g.l;
                    if (str6 == null || str6.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof tze0) {
                    if (((u4f0) D()).g.F == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof uze0) {
                    String str7 = ((u4f0) D()).g.m;
                    if (str7 == null || str7.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof wze0) {
                    String str8 = ((u4f0) D()).g.n;
                    if (str8 == null || str8.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof xze0) {
                    if (((u4f0) D()).g.f == ((u4f0) D()).B) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof yze0) {
                    if (((u4f0) D()).g.I == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof zze0) {
                    if (((u4f0) D()).g.J == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof a0f0) {
                    String str9 = ((u4f0) D()).g.p;
                    if (str9 == null || str9.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof b0f0) {
                    String str10 = ((u4f0) D()).g.q;
                    if (str10 == null || str10.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof c0f0) {
                    PhoneStateModel phoneStateModel = ((u4f0) D()).g.r;
                    String str11 = phoneStateModel != null ? phoneStateModel.f46856a : null;
                    if (str11 == null || str11.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof d0f0) {
                    if (((u4f0) D()).g.s == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof e0f0) {
                    String str12 = ((u4f0) D()).g.t;
                    if (str12 == null || str12.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof f0f0) {
                    zD = Intrinsics.d(((u4f0) D()).y, ((u4f0) D()).g.u);
                } else if (q0f0Var instanceof g0f0) {
                    zD = Intrinsics.d(((u4f0) D()).t, ((u4f0) D()).g.v);
                } else if (!(q0f0Var instanceof h0f0) ? !(!(q0f0Var instanceof i0f0) ? !(!(q0f0Var instanceof j0f0) ? !(!(q0f0Var instanceof k0f0) ? !(!(q0f0Var instanceof l0f0) ? !(!(q0f0Var instanceof m0f0) ? !(!(q0f0Var instanceof n0f0) ? !(!(q0f0Var instanceof o0f0) ? !(!(q0f0Var instanceof p0f0) || ((u4f0) D()).g.D == null) : ((u4f0) D()).g.C) : ((u4f0) D()).g.L) : ((u4f0) D()).g.B) : ((u4f0) D()).g.A) : !((str2 = ((u4f0) D()).g.z) == null || str2.length() == 0)) : ((u4f0) D()).g.y) : ((u4f0) D()).g.x) : !((str3 = ((u4f0) D()).g.w) == null || str3.length() == 0)) {
                    zD = true;
                } else {
                    zD = false;
                }
                if (!zD) {
                    G(g4f0.f10663a);
                    return;
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            boolean z2 = q3f0Var instanceof m3f0;
            byte b2 = 14;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            final g090 g090Var = this.y0;
            if (z2) {
                q7f0 q7f0Var2 = (q7f0) CollectionsKt.W(((m3f0) q3f0Var).f21113a, ((u4f0) D()).l);
                if (q7f0Var2 == null) {
                    return;
                }
                byte b3 = q7f0Var2.f28247a;
                q7f0.b.getClass();
                q7f0 q7f0VarC = gne0.c(b3);
                g090Var.getClass();
                ((y4f0) g090Var.b).invoke(new xwe0(q7f0VarC, g090Var, b2));
                p7m0 p7m0Var = ocjVar.f25029a;
                while (true) {
                    Object value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                    q7f0 q7f0Var3 = q7f0VarC;
                    if (p7m0Var.m(value3, u4f0.a((u4f0) value3, false, false, null, null, null, null, null, null, null, q7f0Var3, null, false, null, false, null, null, null, null, null, null, null, null, 1073740799))) {
                        p7m0 p7m0Var2 = this.x0;
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, q7f0Var3);
                        return;
                    }
                    q7f0VarC = q7f0Var3;
                }
            } else {
                if (q3f0Var instanceof l2f0) {
                    l2f0 l2f0Var = (l2f0) q3f0Var;
                    u0f0 u0f0Var = l2f0Var.f19305a;
                    File file = l2f0Var.b;
                    int iOrdinal = u0f0Var.ordinal();
                    bzs0 bzs0Var = this.q;
                    yox yoxVar = this.p;
                    switch (iOrdinal) {
                        case 33:
                            String str13 = ((u4f0) D()).m.m.t;
                            boolean z3 = ((u4f0) D()).m.p0;
                            xte0Var.i();
                            if (StringsKt.O(str13, "https://", false) && z3) {
                                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                                yoxVar.getClass();
                                PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str13);
                                if (paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 instanceof DialogScreen) {
                                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1)));
                                } else {
                                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1)));
                                }
                                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                                while (true) {
                                    paw pawVar2 = (paw) listIteratorO;
                                    if (pawVar2.hasNext()) {
                                        i1w0Var.a((oe50) pawVar2.next());
                                    }
                                }
                            } else if (StringsKt.O(str13, "https://", false)) {
                                G(new f4f0(str13));
                            } else if (str13.length() <= 0) {
                                f0(file, dxk.FULL_DOC_RULES);
                            } else {
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                bzs0Var.getClass();
                                Screens$WebRulesScreen screens$WebRulesScreenD = bzs0.d(R.string.rules_title, str13);
                                if (screens$WebRulesScreenD instanceof DialogScreen) {
                                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) screens$WebRulesScreenD)));
                                } else {
                                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(screens$WebRulesScreenD)));
                                }
                                ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                                while (true) {
                                    paw pawVar3 = (paw) listIteratorO2;
                                    if (pawVar3.hasNext()) {
                                        i1w0Var.a((oe50) pawVar3.next());
                                    }
                                }
                            }
                            break;
                        case 34:
                            xte0Var.h();
                            String str14 = ((u4f0) D()).m.m.y;
                            boolean z4 = ((u4f0) D()).m.p0;
                            if (StringsKt.O(str14, "https://", false) && z4) {
                                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                                yoxVar.getClass();
                                PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$2 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str14);
                                if (paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$2 instanceof DialogScreen) {
                                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$2)));
                                } else {
                                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$2)));
                                }
                                ListIterator listIteratorO3 = b1j.o(i1w0Var, copyOnWriteArrayListQ3, 0);
                                while (true) {
                                    paw pawVar4 = (paw) listIteratorO3;
                                    if (pawVar4.hasNext()) {
                                        i1w0Var.a((oe50) pawVar4.next());
                                    }
                                }
                            } else if (StringsKt.O(str14, "https://", false)) {
                                G(new f4f0(str14));
                            } else if (str14.length() <= 0) {
                                f0(file, dxk.PRIVACY_POLICY_DOC_RULES);
                            } else {
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                                bzs0Var.getClass();
                                Screens$WebRulesScreen screens$WebRulesScreenD2 = bzs0.d(R.string.info_privacy_policy, str14);
                                if (screens$WebRulesScreenD2 instanceof DialogScreen) {
                                    copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) screens$WebRulesScreenD2)));
                                } else {
                                    copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(screens$WebRulesScreenD2)));
                                }
                                ListIterator listIteratorO4 = b1j.o(i1w0Var, copyOnWriteArrayList2, 0);
                                while (true) {
                                    paw pawVar5 = (paw) listIteratorO4;
                                    if (pawVar5.hasNext()) {
                                        i1w0Var.a((oe50) pawVar5.next());
                                    }
                                }
                            }
                            break;
                        case 35:
                            String str15 = ((u4f0) D()).m.m.u;
                            boolean z5 = ((u4f0) D()).m.p0;
                            if (StringsKt.O(str15, "https://", false) && z5) {
                                CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                                yoxVar.getClass();
                                PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$3 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str15);
                                if (paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$3 instanceof DialogScreen) {
                                    copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$3)));
                                } else {
                                    copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$3)));
                                }
                                ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayListQ4, 0);
                                while (true) {
                                    paw pawVar6 = (paw) listIteratorO5;
                                    if (pawVar6.hasNext()) {
                                        i1w0Var.a((oe50) pawVar6.next());
                                    }
                                }
                            } else if (StringsKt.O(str15, "https://", false)) {
                                G(new f4f0(str15));
                            } else if (str15.length() <= 0) {
                                f0(file, dxk.RESPONSIBLE_GAMING_DOC_RULES);
                            } else {
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                                bzs0Var.getClass();
                                Screens$WebRulesScreen screens$WebRulesScreenD3 = bzs0.d(R.string.responsible_game, str15);
                                if (screens$WebRulesScreenD3 instanceof DialogScreen) {
                                    copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) screens$WebRulesScreenD3)));
                                } else {
                                    copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new w0w0(screens$WebRulesScreenD3)));
                                }
                                ListIterator listIteratorO6 = b1j.o(i1w0Var, copyOnWriteArrayList3, 0);
                                while (true) {
                                    paw pawVar7 = (paw) listIteratorO6;
                                    if (pawVar7.hasNext()) {
                                        i1w0Var.a((oe50) pawVar7.next());
                                    }
                                }
                            }
                            break;
                    }
                    return;
                }
                if (q3f0Var instanceof u2f0) {
                    u0f0 u0f0Var2 = ((u2f0) q3f0Var).f34943a;
                    g090Var.getClass();
                    ((y4f0) g090Var.b).invoke(new xwe0(g090Var, u0f0Var2, (byte) 12));
                    return;
                }
                byte b4 = 8;
                byte b5 = 5;
                if (q3f0Var instanceof n3f0) {
                    n3f0 n3f0Var = (n3f0) q3f0Var;
                    u0f0 u0f0Var3 = n3f0Var.f22847a;
                    String str16 = n3f0Var.b;
                    g090Var.x(u0f0Var3, str16);
                    if (u0f0Var3 == u0f0.l && ((bbyVar = this.v0) == null || !bbyVar.isActive())) {
                        this.v0 = sac.V(jiu0.a(this), new bue0(b4), null, null, new kpb0((Object) str16, (Object) this, (yje) (objArr9 == true ? 1 : 0), b5), 14);
                    }
                    u0f0 u0f0Var4 = u0f0.n;
                    if (u0f0Var3 != u0f0Var4 || (str = ((u4f0) D()).g.q) == null || str.length() == 0) {
                        return;
                    }
                    j0(u0f0Var4, str16.equals(str) ? jrp.f17014a : orp.f25745a);
                    return;
                }
                boolean z6 = q3f0Var instanceof o3f0;
                byte b6 = 2;
                byte b7 = 4;
                byte b8 = 15;
                mne mneVar = this.Z;
                if (z6) {
                    int iOrdinal2 = ((o3f0) q3f0Var).f24582a.f21423a.ordinal();
                    byte b9 = 6;
                    byte b10 = 3;
                    if (iOrdinal2 == 3) {
                        sac.V(jiu0.a(this), new qye0(1, this, x5f0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, mneVar.b, new kpb0(this, objArr3 == true ? 1 : 0, b9), 10);
                        return;
                    }
                    if (iOrdinal2 == 4) {
                        sac.V(jiu0.a(this), new qye0(1, this, x5f0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, mneVar.b, new g5f0(this, objArr4 == true ? 1 : 0, b6), 10);
                        return;
                    }
                    if (iOrdinal2 == 5) {
                        sac.V(jiu0.a(this), new qye0(1, this, x5f0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, mneVar.b, new g5f0(this, objArr5 == true ? 1 : 0, z ? (byte) 1 : (byte) 0), 10);
                        return;
                    }
                    if (iOrdinal2 == 6) {
                        Calendar calendar = Calendar.getInstance();
                        Iterator it = ((u4f0) D()).d.iterator();
                        do {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                        } while (!(((q0f0) next2) instanceof pze0));
                        pze0 pze0Var = next2 instanceof pze0 ? (pze0) next2 : null;
                        if (pze0Var != null && (intOrNull = StringsKt.toIntOrNull(pze0Var.e)) != null) {
                            iIntValue = intOrNull.intValue();
                        }
                        calendar.add(1, -iIntValue);
                        calendar.add(5, -1);
                        long timeInMillis = calendar.getTimeInMillis();
                        Long l = ((u4f0) D()).g.i;
                        long jLongValue = l != null ? l.longValue() : timeInMillis;
                        if (jLongValue > timeInMillis) {
                            jLongValue = timeInMillis;
                        }
                        G(new e4f0(M(this, jLongValue, null, Long.valueOf(timeInMillis), 2)));
                        return;
                    }
                    if (iOrdinal2 == 8) {
                        sac.V(jiu0.a(this), new qye0(1, this, x5f0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, mneVar.b, new g5f0(this, objArr6 == true ? 1 : 0, b), 10);
                        return;
                    }
                    if (iOrdinal2 == 9) {
                        G(k4f0.f17667a);
                        return;
                    }
                    if (iOrdinal2 == 14) {
                        sac.V(jiu0.a(this), new qye0(1, this, x5f0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, mneVar.b, new zye0((Object) this, (yje) (objArr7 == true ? 1 : 0), b10), 10);
                        return;
                    }
                    if (iOrdinal2 == 15) {
                        sac.V(jiu0.a(this), new qye0(1, this, x5f0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, mneVar.b, new gc1((Object) this, (yje) (objArr8 == true ? 1 : 0), b8), 10);
                        return;
                    }
                    if (iOrdinal2 != 36) {
                        if (iOrdinal2 != 37) {
                            return;
                        }
                        Calendar calendar2 = Calendar.getInstance();
                        Long l2 = ((u4f0) D()).g.I;
                        long jLongValue2 = l2 != null ? l2.longValue() : calendar2.getTimeInMillis();
                        if (jLongValue2 <= calendar2.getTimeInMillis()) {
                            jLongValue2 = calendar2.getTimeInMillis();
                        }
                        G(new h4f0(M(this, jLongValue2, Long.valueOf(calendar2.getTimeInMillis()), null, 4)));
                        return;
                    }
                    if (((u4f0) D()).g.j != null) {
                        long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                        Long l3 = ((u4f0) D()).g.J;
                        long jLongValue3 = l3 != null ? l3.longValue() : timeInMillis2;
                        if (jLongValue3 > timeInMillis2) {
                            jLongValue3 = timeInMillis2;
                        }
                        G(new i4f0(M(this, jLongValue3, null, Long.valueOf(timeInMillis2), 2)));
                        return;
                    }
                    return;
                }
                if (q3f0Var instanceof x2f0) {
                    igt igtVar = ((x2f0) q3f0Var).f40164a;
                    g090Var.getClass();
                    ((y4f0) g090Var.b).invoke(new xwe0(igtVar, g090Var, b8));
                    return;
                }
                if (q3f0Var instanceof g3f0) {
                    ((y4f0) g090Var.b).invoke(new ij90(((g3f0) q3f0Var).f10608a == xpa0.YES, g090Var, b5));
                    return;
                }
                byte b11 = 16;
                if (q3f0Var instanceof l3f0) {
                    ((y4f0) g090Var.b).invoke(new z08(((l3f0) q3f0Var).f19356a, g090Var, b11));
                    return;
                }
                if (q3f0Var instanceof r2f0) {
                    final SimpleDate simpleDate = ((r2f0) q3f0Var).f29731a;
                    g090Var.getClass();
                    ((y4f0) g090Var.b).invoke(new Function1() { // from class: a.s1f0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            byte b12 = b;
                            g090 g090Var2 = g090Var;
                            SimpleDate simpleDate2 = simpleDate;
                            switch (b12) {
                                case 0:
                                    u4f0 u4f0Var = (u4f0) obj3;
                                    u4f0Var.getClass();
                                    r1f0 r1f0Var2 = u4f0Var.g;
                                    Calendar calendar3 = Calendar.getInstance();
                                    calendar3.getClass();
                                    wdx.J(simpleDate2, calendar3);
                                    r1f0 r1f0VarA = r1f0.a(r1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, Long.valueOf(calendar3.getTimeInMillis()), null, false, false, null, -1, 123);
                                    List listC = kotlin.collections.a.c(u0f0.m1);
                                    g090Var2.getClass();
                                    Map mapF = g090.f(u4f0Var, listC);
                                    ((vzg0) g090Var2.f10448a).e("PASSPORT_DATE_EXPIRE", r1f0VarA.I);
                                    return new Pair(r1f0VarA, mapF);
                                default:
                                    u4f0 u4f0Var2 = (u4f0) obj3;
                                    u4f0Var2.getClass();
                                    r1f0 r1f0Var3 = u4f0Var2.g;
                                    Calendar calendar4 = Calendar.getInstance();
                                    calendar4.getClass();
                                    wdx.J(simpleDate2, calendar4);
                                    r1f0 r1f0VarA2 = r1f0.a(r1f0Var3, null, false, null, null, false, false, null, null, Long.valueOf(calendar4.getTimeInMillis()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -257, 127);
                                    List listC2 = kotlin.collections.a.c(u0f0.g);
                                    g090Var2.getClass();
                                    Map mapF2 = g090.f(u4f0Var2, listC2);
                                    ((vzg0) g090Var2.f10448a).e("DATE", r1f0VarA2.i);
                                    return new Pair(r1f0VarA2, mapF2);
                            }
                        }
                    });
                    return;
                }
                if (q3f0Var instanceof v2f0) {
                    this.N.a(((v2f0) q3f0Var).f36678a);
                    return;
                }
                if (q3f0Var instanceof d3f0) {
                    final SimpleDate simpleDate2 = ((d3f0) q3f0Var).f5401a;
                    g090Var.getClass();
                    y4f0 y4f0Var = (y4f0) g090Var.b;
                    final byte b12 = z ? (byte) 1 : (byte) 0;
                    y4f0Var.invoke(new Function1() { // from class: a.s1f0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            byte b13 = b12;
                            g090 g090Var2 = g090Var;
                            SimpleDate simpleDate3 = simpleDate2;
                            switch (b13) {
                                case 0:
                                    u4f0 u4f0Var = (u4f0) obj3;
                                    u4f0Var.getClass();
                                    r1f0 r1f0Var2 = u4f0Var.g;
                                    Calendar calendar3 = Calendar.getInstance();
                                    calendar3.getClass();
                                    wdx.J(simpleDate3, calendar3);
                                    r1f0 r1f0VarA = r1f0.a(r1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, Long.valueOf(calendar3.getTimeInMillis()), null, false, false, null, -1, 123);
                                    List listC = kotlin.collections.a.c(u0f0.m1);
                                    g090Var2.getClass();
                                    Map mapF = g090.f(u4f0Var, listC);
                                    ((vzg0) g090Var2.f10448a).e("PASSPORT_DATE_EXPIRE", r1f0VarA.I);
                                    return new Pair(r1f0VarA, mapF);
                                default:
                                    u4f0 u4f0Var2 = (u4f0) obj3;
                                    u4f0Var2.getClass();
                                    r1f0 r1f0Var3 = u4f0Var2.g;
                                    Calendar calendar4 = Calendar.getInstance();
                                    calendar4.getClass();
                                    wdx.J(simpleDate3, calendar4);
                                    r1f0 r1f0VarA2 = r1f0.a(r1f0Var3, null, false, null, null, false, false, null, null, Long.valueOf(calendar4.getTimeInMillis()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -257, 127);
                                    List listC2 = kotlin.collections.a.c(u0f0.g);
                                    g090Var2.getClass();
                                    Map mapF2 = g090.f(u4f0Var2, listC2);
                                    ((vzg0) g090Var2.f10448a).e("DATE", r1f0VarA2.i);
                                    return new Pair(r1f0VarA2, mapF2);
                            }
                        }
                    });
                    return;
                }
                if (q3f0Var instanceof j3f0) {
                    ghk0 ghk0Var = ((j3f0) q3f0Var).f15830a;
                    String str17 = ghk0Var.f11305a == 13 ? ((u4f0) D()).r.m : this.d0.f11725a.f15748a.o() ? ((u4f0) D()).r.l : ((u4f0) D()).r.k;
                    int i = ghk0Var.f11305a;
                    SocialStateModel socialStateModel = new SocialStateModel(i, ghk0Var.d, i, ghk0Var.c, str17, ghk0Var.e, ghk0Var.f, ghk0Var.g, ghk0Var.h, ghk0Var.b);
                    g090Var.getClass();
                    ((y4f0) g090Var.b).invoke(new xwe0(socialStateModel, g090Var, b11));
                    if (ghk0Var.f11305a == 17) {
                        this.p0.f(hfi0.TELEGRAM);
                    }
                    h0();
                    return;
                }
                if (q3f0Var instanceof o2f0) {
                    o2f0 o2f0Var = (o2f0) q3f0Var;
                    sac.V(jiu0.a(this), t5f0.f33366a, null, mneVar.f22085a, new a48(this, o2f0Var.f24527a, o2f0Var.b, objArr2 == true ? 1 : 0, (byte) 4), 10);
                    return;
                }
                if (q3f0Var instanceof m2f0) {
                    sac.V(jiu0.a(this), new y4f0(this, b6), null, mneVar.f22085a, new defpackage.e(this, ((m2f0) q3f0Var).f21056a, objArr == true ? 1 : 0, (byte) 7), 10);
                    return;
                }
                if (q3f0Var instanceof y2f0) {
                    u0f0 u0f0Var5 = ((y2f0) q3f0Var).f41901a;
                    Set setKeySet = ((u4f0) D()).i.keySet();
                    int iA = wp20.a(r3d.q(setKeySet, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                    for (Object obj3 : setKeySet) {
                        linkedHashMap.put(obj3, Boolean.FALSE);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    linkedHashMap2.put(u0f0Var5, Boolean.FALSE);
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    while (true) {
                        Object value4 = p7m0Var3.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                        if (p7m0Var3.m(value4, u4f0.a((u4f0) value4, false, false, null, null, null, null, null, null, linkedHashMap3, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741567))) {
                            G(d4f0.f5452a);
                            return;
                        }
                        linkedHashMap2 = linkedHashMap3;
                    }
                } else if (q3f0Var instanceof a3f0) {
                    u0f0 u0f0Var6 = ((a3f0) q3f0Var).f169a;
                    Set setKeySet2 = ((u4f0) D()).i.keySet();
                    int iA2 = wp20.a(r3d.q(setKeySet2, 10));
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                    for (Object obj4 : setKeySet2) {
                        linkedHashMap4.put(obj4, Boolean.FALSE);
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(linkedHashMap4);
                    List listL0 = CollectionsKt.L0(((u4f0) D()).h.keySet());
                    Iterator it2 = CollectionsKt.O(listL0, listL0.indexOf(u0f0Var6) + 1).iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (((u0f0) next) != u0f0.h) {
                                break;
                            }
                        }
                    } while (((u4f0) D()).g.r == null);
                    u0f0 u0f0Var7 = (u0f0) next;
                    if (u0f0Var7 != null) {
                        linkedHashMap5.put(u0f0Var7, Boolean.TRUE);
                    }
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    while (true) {
                        Object value5 = p7m0Var4.getValue();
                        value5.getClass();
                        oyg0Var.getClass();
                        LinkedHashMap linkedHashMap6 = linkedHashMap5;
                        if (p7m0Var4.m(value5, u4f0.a((u4f0) value5, false, false, null, null, null, null, null, null, linkedHashMap6, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741567))) {
                            return;
                        } else {
                            linkedHashMap5 = linkedHashMap6;
                        }
                    }
                } else {
                    if (!q3f0Var.equals(z2f0.f43668a)) {
                        if (q3f0Var.equals(e3f0.f7132a)) {
                            ((y4f0) g090Var.b).invoke(new t1f0(g090Var, b));
                            return;
                        }
                        if (q3f0Var.equals(k3f0.f17615a)) {
                            ((y4f0) g090Var.b).invoke(new t1f0(g090Var, b7));
                            return;
                        }
                        if (q3f0Var.equals(h3f0.f12382a)) {
                            G(p4f0.f26349a);
                            return;
                        }
                        if (q3f0Var.equals(i3f0.f14094a)) {
                            h0();
                            return;
                        }
                        if (q3f0Var.equals(j2f0.f15778a)) {
                            E();
                            return;
                        }
                        if (q3f0Var.equals(t2f0.f33213a)) {
                            a0();
                            return;
                        }
                        if (q3f0Var.equals(n2f0.f22797a)) {
                            p7m0 p7m0Var5 = ocjVar.f25029a;
                            do {
                                value2 = p7m0Var5.getValue();
                                value2.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var5.m(value2, u4f0.a((u4f0) value2, false, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741820)));
                            return;
                        }
                        if (q3f0Var.equals(p2f0.f26248a)) {
                            p7m0 p7m0Var6 = ocjVar.f25029a;
                            do {
                                value = p7m0Var6.getValue();
                                value.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var6.m(value, u4f0.a((u4f0) value, false, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741820)));
                            return;
                        }
                        if (q3f0Var.equals(w2f0.f38444a)) {
                            b0();
                            return;
                        }
                        if (Intrinsics.d(q3f0Var, p3f0.f26298a)) {
                            e0();
                            return;
                        }
                        if (q3f0Var instanceof s2f0) {
                            Z(((s2f0) q3f0Var).f31499a);
                            return;
                        }
                        if (Intrinsics.d(q3f0Var, f3f0.f8860a)) {
                            c0();
                            return;
                        }
                        if (q3f0Var instanceof k2f0) {
                            d0(((k2f0) q3f0Var).f17568a);
                            return;
                        }
                        if (Intrinsics.d(q3f0Var, b3f0.f1901a)) {
                            Y(false);
                            return;
                        } else if (Intrinsics.d(q3f0Var, c3f0.f3672a)) {
                            Y(true);
                            return;
                        } else {
                            t9f.b();
                            return;
                        }
                    }
                    Set setKeySet3 = ((u4f0) D()).i.keySet();
                    int iA3 = wp20.a(r3d.q(setKeySet3, 10));
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap(iA3 >= 16 ? iA3 : 16);
                    for (Object obj5 : setKeySet3) {
                        linkedHashMap7.put(obj5, Boolean.FALSE);
                    }
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap(linkedHashMap7);
                    p7m0 p7m0Var7 = ocjVar.f25029a;
                    while (true) {
                        Object value6 = p7m0Var7.getValue();
                        value6.getClass();
                        oyg0Var.getClass();
                        LinkedHashMap linkedHashMap9 = linkedHashMap8;
                        if (p7m0Var7.m(value6, u4f0.a((u4f0) value6, false, false, null, null, null, null, null, null, linkedHashMap9, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741567))) {
                            return;
                        } else {
                            linkedHashMap8 = linkedHashMap9;
                        }
                    }
                }
            }
        }
    }
}
