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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.registration.api.domain.models.BonusInfoModel;
import org.xplatform.registration.success.api.RegistrationSuccessParams;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.BonusStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CurrencyStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.PhoneStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.RegionStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.SocialStateModel;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class eze0 extends i3t0 {
    public static final /* synthetic */ int y0 = 0;
    public final aqt A;
    public final tkt0 B;
    public final owp0 C;
    public final fnu D;
    public final h0q0 E;
    public final a7q F;
    public final roi0 G;
    public final bk3 H;
    public final a7q I;
    public final ntu J;
    public final ieu K;
    public final cmt L;
    public final m0u M;
    public final ivn N;
    public final z4w0 O;
    public final svu P;
    public final fnu Q;
    public final gnu R;
    public final vrb0 S;
    public final vqb T;
    public final rpt U;
    public final xfu V;
    public final cmt W;
    public final cyh X;
    public final reu Y;
    public final lhf0 Z;
    public final mne a0;
    public final ctf0 b0;
    public final i1w0 c0;
    public final duj d0;
    public final gqc e0;
    public final vqc f0;
    public final h03 g0;
    public final lsn h0;
    public final ytt i0;
    public final xte0 j0;
    public final ali k0;
    public final mi70 l0;
    public final rpt m0;
    public final rqt n0;
    public final RegistrationDefaultScreenParams o;
    public final m1e o0;
    public final sek p;
    public final s64 p0;
    public final yox q;
    public final a7q q0;
    public final bzs0 r;
    public final bzu r0;
    public final b8u s;
    public final nh70 s0;
    public final es t;
    public final lme0 t0;
    public final pmi u;
    public final a7q u0;
    public final f7u v;
    public bby v0;
    public final a6u w;
    public c4m0 w0;
    public final a6u x;
    public final dq00 x0;
    public final fnu y;
    public final b8u z;

    /* JADX WARN: Illegal instructions before constructor call */
    public eze0(vzg0 vzg0Var, RegistrationDefaultScreenParams registrationDefaultScreenParams, sek sekVar, yox yoxVar, bzs0 bzs0Var, b8u b8uVar, es esVar, pmi pmiVar, f7u f7uVar, a6u a6uVar, a6u a6uVar2, fnu fnuVar, b8u b8uVar2, aqt aqtVar, tkt0 tkt0Var, owp0 owp0Var, fnu fnuVar2, h0q0 h0q0Var, a7q a7qVar, roi0 roi0Var, bk3 bk3Var, a7q a7qVar2, ntu ntuVar, ieu ieuVar, cmt cmtVar, m0u m0uVar, ivn ivnVar, z4w0 z4w0Var, svu svuVar, fnu fnuVar3, gnu gnuVar, vrb0 vrb0Var, vqb vqbVar, rpt rptVar, xfu xfuVar, cmt cmtVar2, cyh cyhVar, reu reuVar, lhf0 lhf0Var, mne mneVar, ctf0 ctf0Var, i1w0 i1w0Var, duj dujVar, gqc gqcVar, vqc vqcVar, h03 h03Var, lsn lsnVar, ytt yttVar, n4u n4uVar, xte0 xte0Var, ali aliVar, mi70 mi70Var, tqt tqtVar, rpt rptVar2, rqt rqtVar, m1e m1eVar, s64 s64Var, lbu lbuVar, bzt bztVar, a7q a7qVar3, f7u f7uVar2, pru pruVar, bzu bzuVar, nh70 nh70Var, lme0 lme0Var, a7q a7qVar4, g2v g2vVar) {
        aqtVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new h92(pruVar, f7uVar2, n4uVar, vzg0Var, registrationDefaultScreenParams, rqtVar, lbuVar, bztVar, g2vVar), g090VarP, new iv80(ctf0Var, (byte) 19), (yzn0) null);
        this.o = registrationDefaultScreenParams;
        this.p = sekVar;
        this.q = yoxVar;
        this.r = bzs0Var;
        this.s = b8uVar;
        this.t = esVar;
        this.u = pmiVar;
        this.v = f7uVar;
        this.w = a6uVar;
        this.x = a6uVar2;
        this.y = fnuVar;
        this.z = b8uVar2;
        this.A = aqtVar;
        this.B = tkt0Var;
        this.C = owp0Var;
        this.D = fnuVar2;
        this.E = h0q0Var;
        this.F = a7qVar;
        this.G = roi0Var;
        this.H = bk3Var;
        this.I = a7qVar2;
        this.J = ntuVar;
        this.K = ieuVar;
        this.L = cmtVar;
        this.M = m0uVar;
        this.N = ivnVar;
        this.O = z4w0Var;
        this.P = svuVar;
        this.Q = fnuVar3;
        this.R = gnuVar;
        this.S = vrb0Var;
        this.T = vqbVar;
        this.U = rptVar;
        this.V = xfuVar;
        this.W = cmtVar2;
        this.X = cyhVar;
        this.Y = reuVar;
        this.Z = lhf0Var;
        this.a0 = mneVar;
        this.b0 = ctf0Var;
        this.c0 = i1w0Var;
        this.d0 = dujVar;
        this.e0 = gqcVar;
        this.f0 = vqcVar;
        this.g0 = h03Var;
        this.h0 = lsnVar;
        this.i0 = yttVar;
        this.j0 = xte0Var;
        this.k0 = aliVar;
        this.l0 = mi70Var;
        this.m0 = rptVar2;
        this.n0 = rqtVar;
        this.o0 = m1eVar;
        this.p0 = s64Var;
        this.q0 = a7qVar3;
        this.r0 = bzuVar;
        this.s0 = nh70Var;
        this.t0 = lme0Var;
        this.u0 = a7qVar4;
        eye0 eye0Var = new eye0(this, (byte) 2);
        dq00 dq00Var = new dq00(vzg0Var, eye0Var, (byte) 23);
        this.x0 = dq00Var;
        q7f0 q7f0Var = registrationDefaultScreenParams.f46869a;
        q7f0Var.getClass();
        eye0Var.invoke(new xwe0(q7f0Var, dq00Var, (byte) 4));
        a0(q7f0Var);
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
            if (p7m0Var.m(value, aye0.a((aye0) value, false, false, false, null, null, null, arrayList3, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483583))) {
                slb.U(new dnq(new fnq(this.o0.b(), new coc0(this, yjeVar, (byte) 18), (byte) 4), new pr60(3, null, (byte) 23), (byte) 1), jiu0.a(this));
                return;
            }
            arrayList2 = arrayList3;
        }
    }

    public static DateCalendarBottomSheetParams M(eze0 eze0Var, long j, Long l, Long l2, int i) {
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
        String strA = eze0Var.b0.b.a(R.string.calendar_date_module_select_date, Arrays.copyOf(new Object[0], 0));
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
        iye0 iye0Var;
        String str;
        if (zjeVar instanceof iye0) {
            iye0Var = (iye0) zjeVar;
            int i = iye0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                iye0Var.m = i - Integer.MIN_VALUE;
            } else {
                iye0Var = new iye0(this, zjeVar);
            }
        } else {
            iye0Var = new iye0(this, zjeVar);
        }
        Object obj = iye0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = iye0Var.m;
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
                iye0Var.i = arrayList;
                iye0Var.j = str2;
                iye0Var.m = 1;
                Object objB0 = this.T.f37848a.b0(strConcat, iye0Var);
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
        str = iye0Var.j;
        arrayList = iye0Var.i;
        z1x.P(obj);
        o4c o4cVar = (o4c) obj;
        if (o4cVar.b.length() > 0) {
            w3d.y(arrayList, new bue0((byte) 3));
            arrayList.add(new u1q(true, twn.p("[^0-9]", str, ""), o4cVar.f24626a));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(zje zjeVar) {
        jye0 jye0Var;
        if (zjeVar instanceof jye0) {
            jye0Var = (jye0) zjeVar;
            int i = jye0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jye0Var.k = i - Integer.MIN_VALUE;
            } else {
                jye0Var = new jye0(this, zjeVar);
            }
        } else {
            jye0Var = new jye0(this, zjeVar);
        }
        Object objI = jye0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jye0Var.k;
        if (i2 == 0) {
            z1x.P(objI);
            CountryStateModel countryStateModel = ((aye0) D()).h.g;
            int i3 = countryStateModel != null ? countryStateModel.f46874a : -1;
            CurrencyStateModel currencyStateModel = ((aye0) D()).h.h;
            int i4 = currencyStateModel != null ? currencyStateModel.f46875a : -1;
            jye0Var.k = 1;
            objI = this.N.i(i3, i4, jye0Var);
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
        i1w0 i1w0Var = this.c0;
        if (clVar == clVar2) {
            i1w0Var.d(new xwe0(this, qu4Var, (byte) 6));
            return;
        }
        PhoneStateModel phoneStateModel = ((aye0) D()).h.r;
        String str = phoneStateModel != null ? phoneStateModel.c : null;
        if (str == null) {
            str = "";
        }
        lm90 lm90Var = new lm90(twn.p("\\d", str, TokenNames.X), TokenNames.X);
        PhoneStateModel phoneStateModel2 = ((aye0) D()).h.r;
        String strB = lm90Var.b(String.valueOf(phoneStateModel2 != null ? phoneStateModel2.f46877a : null));
        PhoneStateModel phoneStateModel3 = ((aye0) D()).h.r;
        i1w0Var.d(new zlb0(this, qu4Var, w6x.q(phoneStateModel3 != null ? phoneStateModel3.b : null, Separators.SP, strB), (byte) 12));
    }

    public final void Q() {
        sac.V(jiu0.a(this), new d8e0(1, this, eze0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, this.a0.f22085a, new qo6(this, null, (byte) 5), 10);
    }

    public final void R(Throwable th) {
        Object value;
        G(txe0.f34695a);
        th.printStackTrace();
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, aye0.a((aye0) value, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483646)));
    }

    public final void S(nq90 nq90Var) {
        Object value;
        SimpleDate simpleDate;
        Object next;
        boolean z = nq90Var instanceof iq90;
        dq00 dq00Var = this.x0;
        if (z && ((iq90) nq90Var).f15199a != 126) {
            Iterator it = ((aye0) D()).e.iterator();
            do {
                simpleDate = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((q0f0) next) instanceof zze0));
            q0f0 q0f0Var = (q0f0) next;
            if (q0f0Var != null && q0f0Var.a() && ((aye0) D()).r.J) {
                ((eye0) dq00Var.c).invoke(new vwe0(simpleDate, dq00Var, (byte) 2));
            }
        }
        ((eye0) dq00Var.c).invoke(new oac0(nq90Var, dq00Var, (byte) 27));
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, aye0.a((aye0) value, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483646)));
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x021a  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e  */
    /* JADX WARN: Code duplicated, block: B:91:0x022d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0243  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final void T(final Throwable th) {
        boolean z;
        yxe0 yxe0Var;
        boolean z2;
        dq00 dq00Var;
        boolean z3;
        duj dujVar;
        q7f0 q7f0Var;
        int i;
        Map map;
        Object value;
        boolean z4 = th instanceof t3c;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        String strA = "";
        jrp jrpVar = jrp.f17014a;
        final byte b = 1;
        Object[] objArr = 0;
        Object obj = null;
        xte0 xte0Var = this.j0;
        if (z4) {
            String str = ((t3c) th).f33259a;
            strA = str != null ? str : "";
            u0f0 u0f0Var = u0f0.l;
            n0(u0f0Var, new mrp(strA));
            G(new sxe0(strA));
            PhoneStateModel phoneStateModel = ((aye0) D()).h.r;
            String str2 = phoneStateModel != null ? phoneStateModel.b : null;
            boolean z5 = str2 == null || str2.length() == 0;
            Map mapB = wp20.b(new Pair(u0f0Var, new mrp(strA)));
            q1f0 q1f0Var = ((aye0) D()).h;
            q7f0 q7f0Var2 = ((aye0) D()).h.M;
            if (q7f0Var2 == null) {
                q7f0Var2 = q7f0.FULL;
            }
            xte0Var.l(z5, mapB, q7f0Var2);
        } else {
            boolean z6 = th instanceof dox;
            ctf0 ctf0Var = this.b0;
            if (z6) {
                Map map2 = ((dox) th).f6433a;
                if (map2.isEmpty()) {
                    z = th instanceof mm90;
                    yxe0Var = yxe0.f43416a;
                    if (z) {
                        G(yxe0Var);
                    } else {
                        z2 = th instanceof nqt0;
                        dq00Var = this.x0;
                        if (z2) {
                            xte0Var.q();
                            G(yxe0Var);
                            ((eye0) dq00Var.c).invoke(new uwe0(dq00Var, (byte) 1));
                        } else {
                            z3 = th instanceof vkk0;
                            dujVar = this.d0;
                            if (z3) {
                                xte0Var.q();
                                ((eye0) dq00Var.c).invoke(new uwe0(dq00Var, (byte) 1));
                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                dujVar.b(th, new Function2(this) { // from class: a.gye0
                                    public final /* synthetic */ eze0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        byte b2 = objArr2;
                                        Throwable th2 = th;
                                        eze0 eze0Var = this.b;
                                        Throwable th3 = (Throwable) obj2;
                                        String str3 = (String) obj3;
                                        switch (b2) {
                                            case 0:
                                                th3.getClass();
                                                str3.getClass();
                                                eze0Var.G(new wxe0(((vkk0) th2).f37578a));
                                                break;
                                            default:
                                                th3.getClass();
                                                str3.getClass();
                                                String message = th2.getMessage();
                                                if (message == null) {
                                                    message = eze0Var.b0.b.a(R.string.error_during_registration, Arrays.copyOf(new Object[0], 0));
                                                }
                                                eze0Var.G(new wxe0(message));
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                            } else if (th instanceof orv0) {
                                n0(u0f0.h, srp.f32690a);
                                G(new sxe0(ctf0Var.b.a(R.string.input_correct_phone, Arrays.copyOf(new Object[0], 0))));
                            } else if (th instanceof zhi0) {
                                zhi0 zhi0Var = (zhi0) th;
                                q7f0Var = ((aye0) D()).h.M;
                                if (q7f0Var == null) {
                                    q7f0Var = q7f0.FULL;
                                }
                                q1f0 q1f0Var2 = ((aye0) D()).h;
                                xte0Var.g(zhi0Var, q7f0Var);
                                dujVar.b(th, new Function2(this) { // from class: a.gye0
                                    public final /* synthetic */ eze0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        byte b2 = b;
                                        Throwable th2 = th;
                                        eze0 eze0Var = this.b;
                                        Throwable th3 = (Throwable) obj2;
                                        String str3 = (String) obj3;
                                        switch (b2) {
                                            case 0:
                                                th3.getClass();
                                                str3.getClass();
                                                eze0Var.G(new wxe0(((vkk0) th2).f37578a));
                                                break;
                                            default:
                                                th3.getClass();
                                                str3.getClass();
                                                String message = th2.getMessage();
                                                if (message == null) {
                                                    message = eze0Var.b0.b.a(R.string.error_during_registration, Arrays.copyOf(new Object[0], 0));
                                                }
                                                eze0Var.G(new wxe0(message));
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                            } else {
                                dujVar.b(th, new yr0(th, (byte) 25));
                            }
                        }
                    }
                } else {
                    PhoneStateModel phoneStateModel2 = ((aye0) D()).h.r;
                    String str3 = phoneStateModel2 != null ? phoneStateModel2.b : null;
                    boolean z7 = str3 == null || str3.length() == 0;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map2.entrySet()) {
                        if (!Intrinsics.d(entry.getValue(), jrpVar)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    q1f0 q1f0Var3 = ((aye0) D()).h;
                    q7f0 q7f0Var3 = ((aye0) D()).h.M;
                    if (q7f0Var3 == null) {
                        q7f0Var3 = q7f0.FULL;
                    }
                    xte0Var.l(z7, linkedHashMap, q7f0Var3);
                    q7f0 q7f0Var4 = ((aye0) D()).k;
                    if (q7f0Var4 == null) {
                        q7f0Var4 = q7f0.FULL;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(((aye0) D()).f);
                    linkedHashMap2.put(q7f0Var4, map2);
                    p7m0 p7m0Var = ocjVar.f25029a;
                    while (true) {
                        Object value2 = p7m0Var.getValue();
                        value2.getClass();
                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                        oyg0Var.getClass();
                        if (p7m0Var.m(value2, aye0.a((aye0) value2, false, false, false, null, null, linkedHashMap3, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483615))) {
                            break;
                        } else {
                            linkedHashMap2 = linkedHashMap3;
                        }
                    }
                    if (map2.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = map2.entrySet().iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!Intrinsics.d(((Map.Entry) it.next()).getValue(), jrpVar)) {
                                i++;
                            }
                        }
                    }
                    if (i <= 1) {
                        u0f0 u0f0Var2 = u0f0.l;
                        if (Intrinsics.d(map2.get(u0f0Var2), nrp.f24014a)) {
                            strA = ctf0Var.b.a(R.string.does_not_meet_the_requirements_error, Arrays.copyOf(new Object[0], 0));
                        } else {
                            Object obj2 = map2.get(u0f0Var2);
                            mrp mrpVar = obj2 instanceof mrp ? (mrp) obj2 : null;
                            String str4 = mrpVar != null ? mrpVar.f22284a : null;
                            if (str4 != null) {
                                strA = str4;
                            }
                        }
                    }
                    G(new sxe0(strA));
                }
            } else {
                z = th instanceof mm90;
                yxe0Var = yxe0.f43416a;
                if (z) {
                    G(yxe0Var);
                } else {
                    z2 = th instanceof nqt0;
                    dq00Var = this.x0;
                    if (z2) {
                        xte0Var.q();
                        G(yxe0Var);
                        ((eye0) dq00Var.c).invoke(new uwe0(dq00Var, (byte) 1));
                    } else {
                        z3 = th instanceof vkk0;
                        dujVar = this.d0;
                        if (z3) {
                            xte0Var.q();
                            ((eye0) dq00Var.c).invoke(new uwe0(dq00Var, (byte) 1));
                            final byte objArr3 = objArr == true ? 1 : 0;
                            dujVar.b(th, new Function2(this) { // from class: a.gye0
                                public final /* synthetic */ eze0 b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    byte b2 = objArr3;
                                    Throwable th2 = th;
                                    eze0 eze0Var = this.b;
                                    Throwable th3 = (Throwable) obj3;
                                    String str5 = (String) obj4;
                                    switch (b2) {
                                        case 0:
                                            th3.getClass();
                                            str5.getClass();
                                            eze0Var.G(new wxe0(((vkk0) th2).f37578a));
                                            break;
                                        default:
                                            th3.getClass();
                                            str5.getClass();
                                            String message = th2.getMessage();
                                            if (message == null) {
                                                message = eze0Var.b0.b.a(R.string.error_during_registration, Arrays.copyOf(new Object[0], 0));
                                            }
                                            eze0Var.G(new wxe0(message));
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                        } else if (th instanceof orv0) {
                            n0(u0f0.h, srp.f32690a);
                            G(new sxe0(ctf0Var.b.a(R.string.input_correct_phone, Arrays.copyOf(new Object[0], 0))));
                        } else if (th instanceof zhi0) {
                            zhi0 zhi0Var2 = (zhi0) th;
                            q7f0Var = ((aye0) D()).h.M;
                            if (q7f0Var == null) {
                                q7f0Var = q7f0.FULL;
                            }
                            q1f0 q1f0Var4 = ((aye0) D()).h;
                            xte0Var.g(zhi0Var2, q7f0Var);
                            dujVar.b(th, new Function2(this) { // from class: a.gye0
                                public final /* synthetic */ eze0 b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    byte b2 = b;
                                    Throwable th2 = th;
                                    eze0 eze0Var = this.b;
                                    Throwable th3 = (Throwable) obj3;
                                    String str5 = (String) obj4;
                                    switch (b2) {
                                        case 0:
                                            th3.getClass();
                                            str5.getClass();
                                            eze0Var.G(new wxe0(((vkk0) th2).f37578a));
                                            break;
                                        default:
                                            th3.getClass();
                                            str5.getClass();
                                            String message = th2.getMessage();
                                            if (message == null) {
                                                message = eze0Var.b0.b.a(R.string.error_during_registration, Arrays.copyOf(new Object[0], 0));
                                            }
                                            eze0Var.G(new wxe0(message));
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                        } else {
                            dujVar.b(th, new yr0(th, (byte) 25));
                        }
                    }
                }
            }
        }
        q7f0 q7f0Var5 = ((aye0) D()).k;
        if (q7f0Var5 == null || (map = (Map) ((aye0) D()).f.get(q7f0Var5)) == null) {
            return;
        }
        List list = ((aye0) D()).e;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(x2x.s0((q0f0) it2.next()));
        }
        for (Object obj3 : arrayList) {
            urp urpVar = (urp) map.get((u0f0) obj3);
            if (urpVar != null && (!urpVar.equals(jrpVar))) {
                obj = obj3;
                break;
            }
        }
        u0f0 u0f0Var3 = (u0f0) obj;
        if (u0f0Var3 != null) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, aye0.a((aye0) value, false, false, false, null, null, null, null, null, null, null, u0f0Var3, null, false, null, null, null, null, null, null, null, null, 2147467263)));
        }
    }

    public final void U(zqt0 zqt0Var) {
        String strValueOf = String.valueOf(zqt0Var.f44823a);
        String str = zqt0Var.b;
        PhoneStateModel phoneStateModel = ((aye0) D()).h.r;
        String str2 = phoneStateModel != null ? phoneStateModel.b : null;
        String str3 = str2 == null ? "" : str2;
        PhoneStateModel phoneStateModel2 = ((aye0) D()).h.r;
        String str4 = phoneStateModel2 != null ? phoneStateModel2.f46877a : null;
        String str5 = str4 == null ? "" : str4;
        CountryStateModel countryStateModel = ((aye0) D()).h.g;
        Integer numValueOf = countryStateModel != null ? Integer.valueOf(countryStateModel.f46874a) : null;
        q7f0 q7f0Var = ((aye0) D()).h.M;
        if (q7f0Var == null) {
            q7f0Var = q7f0.FULL;
        }
        q7f0 q7f0Var2 = q7f0Var;
        String str6 = ((aye0) D()).h.u;
        String str7 = str6 == null ? "" : str6;
        BonusStateModel bonusStateModel = ((aye0) D()).h.c;
        String str8 = bonusStateModel != null ? bonusStateModel.b : null;
        String str9 = str8 == null ? "" : str8;
        CountryStateModel countryStateModel2 = ((aye0) D()).h.g;
        String str10 = countryStateModel2 != null ? countryStateModel2.b : null;
        String str11 = str10 == null ? "" : str10;
        CurrencyStateModel currencyStateModel = ((aye0) D()).h.h;
        String str12 = currencyStateModel != null ? currencyStateModel.b : null;
        String str13 = str12 == null ? "" : str12;
        CountryStateModel countryStateModel3 = ((aye0) D()).h.g;
        String str14 = countryStateModel3 != null ? countryStateModel3.e : null;
        RegistrationSuccessParams registrationSuccessParams = new RegistrationSuccessParams(strValueOf, str, str3, str5, numValueOf, q7f0Var2, str14 == null ? "" : str14, str7, str11, str13, str9, ((aye0) D()).A.f4650a, ((aye0) D()).h.D);
        i1w0 i1w0Var = this.c0;
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

    /* JADX WARN: Code duplicated, block: B:58:0x0151 A[PHI: r3
  0x0151: PHI (r3v7 org.xplatform.registration.api.domain.models.BonusInfoModel) = 
  (r3v6 org.xplatform.registration.api.domain.models.BonusInfoModel)
  (r3v9 org.xplatform.registration.api.domain.models.BonusInfoModel)
  (r3v11 org.xplatform.registration.api.domain.models.BonusInfoModel)
 binds: [B:46:0x012a, B:54:0x0145, B:56:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        if (r1 == r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(a.zje r37) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eze0.V(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(zje zjeVar) {
        vye0 vye0Var;
        if (zjeVar instanceof vye0) {
            vye0Var = (vye0) zjeVar;
            int i = vye0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vye0Var.k = i - Integer.MIN_VALUE;
            } else {
                vye0Var = new vye0(this, zjeVar);
            }
        } else {
            vye0Var = new vye0(this, zjeVar);
        }
        Object objE = vye0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = vye0Var.k;
        if (i2 == 0) {
            z1x.P(objE);
            List list = ((aye0) D()).e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof kze0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                vye0Var.k = 1;
                objE = this.I.e(vye0Var);
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
            dq00 dq00Var = this.x0;
            dq00Var.getClass();
            jkcVar.getClass();
            ((eye0) dq00Var.c).invoke(new oac0(jkcVar, dq00Var, (byte) 29));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce A[PHI: r2 r14
  0x00ce: PHI (r2v4 a.elt) = (r2v3 a.elt), (r2v10 a.elt) binds: [B:44:0x00cb, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r14v20 java.lang.Object) = (r14v17 java.lang.Object), (r14v1 java.lang.Object) binds: [B:44:0x00cb, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x012e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x0170 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[LOOP:0: B:72:0x0132->B:89:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[LOOP:1: B:52:0x00e3->B:92:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[LOOP:2: B:27:0x0076->B:95:?, LOOP_END, SYNTHETIC] */
    public final Object X(zje zjeVar) {
        wye0 wye0Var;
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
        if (zjeVar instanceof wye0) {
            wye0Var = (wye0) zjeVar;
            int i5 = wye0Var.m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                wye0Var.m = i5 - Integer.MIN_VALUE;
            } else {
                wye0Var = new wye0(this, zjeVar);
            }
        } else {
            wye0Var = new wye0(this, zjeVar);
        }
        Object objI = wye0Var.k;
        wne wneVar = wne.f39444a;
        int i6 = wye0Var.m;
        dq00 dq00Var = this.x0;
        byte b2 = 0;
        Object obj = null;
        if (i6 == 0) {
            z1x.P(objI);
            wye0Var.m = 1;
            objI = this.K.i(wye0Var);
            if (objI != wneVar) {
            }
            return wneVar;
        }
        if (i6 == 1) {
            z1x.P(objI);
        } else {
            if (i6 == 2) {
                eltVar = wye0Var.i;
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
                dq00Var.getClass();
                rktVar.getClass();
                ((eye0) dq00Var.c).invoke(new xwe0(rktVar, dq00Var, b2));
                countryStateModel = ((aye0) D()).h.g;
                if (countryStateModel != null) {
                    i = countryStateModel.f46874a;
                } else {
                    i = -1;
                }
                wye0Var.i = eltVar;
                wye0Var.m = 3;
                objI = this.V.e(i, wye0Var);
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
                        regionStateModel = ((aye0) D()).h.v;
                        if (regionStateModel != null) {
                            i3 = regionStateModel.f46878a;
                        } else {
                            i3 = eltVar.f;
                        }
                        wye0Var.i = eltVar;
                        wye0Var.j = i2;
                        wye0Var.m = 4;
                        objB = this.W.b(i3, wye0Var);
                        if (objB != wneVar) {
                            int i7 = i2;
                            objI = objB;
                            i4 = i7;
                            eltVar2 = eltVar;
                        }
                    }
                    str = eltVar.c;
                    str2 = eltVar.d;
                    b = 27;
                    if (str.length() > 0) {
                        ((eye0) dq00Var.c).invoke(new oac0(new lq90(eltVar.c, eltVar.f, true), dq00Var, b));
                    }
                    if (str2.length() > 0) {
                        ((eye0) dq00Var.c).invoke(new oac0(new fq90(str2, eltVar.g, true), dq00Var, b));
                    }
                    return Unit.f46060a;
                }
                return wneVar;
            }
            if (i6 == 3) {
                eltVar = wye0Var.i;
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
                    regionStateModel = ((aye0) D()).h.v;
                    if (regionStateModel != null) {
                        i3 = regionStateModel.f46878a;
                    } else {
                        i3 = eltVar.f;
                    }
                    wye0Var.i = eltVar;
                    wye0Var.j = i2;
                    wye0Var.m = 4;
                    objB = this.W.b(i3, wye0Var);
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
                b = 27;
                if (str.length() > 0 && i2 != 0) {
                    ((eye0) dq00Var.c).invoke(new oac0(new lq90(eltVar.c, eltVar.f, true), dq00Var, b));
                }
                if (str2.length() > 0 && b2 != 0) {
                    ((eye0) dq00Var.c).invoke(new oac0(new fq90(str2, eltVar.g, true), dq00Var, b));
                }
                return Unit.f46060a;
            }
            if (i6 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = wye0Var.j;
            eltVar2 = wye0Var.i;
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
                b2 = 1;
                break;
            }
        }
        str = eltVar.c;
        str2 = eltVar.d;
        b = 27;
        if (str.length() > 0) {
            ((eye0) dq00Var.c).invoke(new oac0(new lq90(eltVar.c, eltVar.f, true), dq00Var, b));
        }
        if (str2.length() > 0) {
            ((eye0) dq00Var.c).invoke(new oac0(new fq90(str2, eltVar.g, true), dq00Var, b));
        }
        return Unit.f46060a;
        eltVar = (elt) objI;
        wye0Var.i = eltVar;
        wye0Var.m = 2;
        objI = this.Z.u(wye0Var);
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
            dq00Var.getClass();
            rktVar.getClass();
            ((eye0) dq00Var.c).invoke(new xwe0(rktVar, dq00Var, b2));
            countryStateModel = ((aye0) D()).h.g;
            if (countryStateModel != null) {
                i = countryStateModel.f46874a;
            } else {
                i = -1;
            }
            wye0Var.i = eltVar;
            wye0Var.m = 3;
            objI = this.V.e(i, wye0Var);
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
                    regionStateModel = ((aye0) D()).h.v;
                    if (regionStateModel != null) {
                        i3 = regionStateModel.f46878a;
                    } else {
                        i3 = eltVar.f;
                    }
                    wye0Var.i = eltVar;
                    wye0Var.j = i2;
                    wye0Var.m = 4;
                    objB = this.W.b(i3, wye0Var);
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
                                    b2 = 1;
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
                                    b2 = 1;
                                    break;
                                }
                            }
                        }
                    }
                }
                str = eltVar.c;
                str2 = eltVar.d;
                b = 27;
                if (str.length() > 0) {
                    ((eye0) dq00Var.c).invoke(new oac0(new lq90(eltVar.c, eltVar.f, true), dq00Var, b));
                }
                if (str2.length() > 0) {
                    ((eye0) dq00Var.c).invoke(new oac0(new fq90(str2, eltVar.g, true), dq00Var, b));
                }
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r13 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(a.zje r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eze0.Y(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object Z(zje zjeVar) {
        yye0 yye0Var;
        Object g0g0Var;
        Object obj;
        if (zjeVar instanceof yye0) {
            yye0Var = (yye0) zjeVar;
            int i = yye0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yye0Var.k = i - Integer.MIN_VALUE;
            } else {
                yye0Var = new yye0(this, zjeVar);
            }
        } else {
            yye0Var = new yye0(this, zjeVar);
        }
        Object objA = yye0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = yye0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                b8u b8uVar = this.s;
                yye0Var.k = 1;
                objA = ((t090) b8uVar.f2175a).a(yye0Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objA);
            }
            g0g0Var = (List) objA;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            obj = g0g0Var;
        } else {
            List list = (List) g0g0Var;
            p7m0 p7m0Var = this.i.f25029a;
            while (true) {
                Object value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                obj = g0g0Var;
                if (p7m0Var.m(value, aye0.a((aye0) value, false, false, false, list, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483639))) {
                    break;
                }
                g0g0Var = obj;
            }
        }
        Throwable thA = j0g0.a(obj);
        if (thA != null) {
            thA.printStackTrace();
        }
        return Unit.f46060a;
    }

    public final void a0(q7f0 q7f0Var) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, aye0.a((aye0) value, false, true, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483641)));
        sac.V(jiu0.a(this), new eye0(this, (byte) 3), new tie0(this, (byte) 12), this.a0.f22085a, new zye0(this, q7f0Var, null, (byte) 0), 8);
    }

    public final void b0(boolean z) {
        q1f0 q1f0Var = ((aye0) D()).h;
        q7f0 q7f0Var = ((aye0) D()).h.M;
        if (q7f0Var == null) {
            q7f0Var = q7f0.FULL;
        }
        this.j0.k(q7f0Var, z);
    }

    public final void c0() {
        H(new k8e0((byte) 17));
    }

    public final void d0() {
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
        } while (!p7m0Var.m(value, aye0.a((aye0) value, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483646)));
    }

    public final void e0() {
        i1w0 i1w0Var = this.c0;
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

    public final void f0() {
        sac.V(jiu0.a(this), bze0.f3464a, null, this.a0.b, new zye0(this, (yje) null, (byte) 1), 10);
    }

    public final void g0() {
        q7f0 q7f0Var = ((aye0) D()).k;
        if (q7f0Var == null) {
            q7f0Var = this.o.f46869a;
        }
        a0(q7f0Var);
    }

    public final void h0() {
        H(new k8e0((byte) 16));
    }

    public final void i0() {
        u0f0 u0f0Var = u0f0.h;
        dq00 dq00Var = this.x0;
        dq00Var.m(u0f0Var, "");
        dq00Var.m(u0f0.k, "");
    }

    public final void j0(File file, dxk dxkVar) {
        sac.V(jiu0.a(this), new eye0(this, (byte) 1), null, this.a0.f22085a, new pnd0((byte) 4, null, file, this, dxkVar), 10);
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
    public final java.lang.Object k0(java.util.List r10, a.ynb0 r11, int r12, boolean r13, boolean r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eze0.k0(java.util.List, a.ynb0, int, boolean, boolean, a.zje):java.lang.Object");
    }

    public final void l0() {
        G(ixe0.f15539a);
        sac.V(jiu0.a(this), new qye0(1, this, eze0.class, "handleRegistrationExceptions", "handleRegistrationExceptions(Ljava/lang/Throwable;)V", 0, (byte) 1), null, this.a0.f22085a, new zye0(this, (yje) null, (byte) 2), 10);
    }

    public final void m0() {
        fye0 fye0Var = new fye0(this, (byte) 1);
        i1w0 i1w0Var = this.c0;
        i1w0Var.f("PICKER_DIALOG_SHOWN_KEY", fye0Var);
        i1w0Var.f("PICKER_DIALOG_ITEM_SELECTED_KEY", new fye0(this, (byte) 2));
    }

    public final void n0(u0f0 u0f0Var, urp urpVar) {
        Object value;
        q7f0 q7f0Var = ((aye0) D()).k;
        if (q7f0Var == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(((aye0) D()).f);
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
        } while (!p7m0Var.m(value, aye0.a((aye0) value, false, false, false, null, null, linkedHashMap, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483615)));
    }

    @Override // a.diu0
    public final void v() {
        ((yse0) this.f0.b).b.f41413a.clear();
        ((gkc) this.g0.b).b.f9684a.clear();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v161, types: [a.m7h0, org.xplatform.web_rules.impl.presentation.navigation.Screens$WebRulesScreen] */
    /* JADX WARN: Type inference failed for: r1v182, types: [a.m7h0, org.xplatform.web_rules.impl.presentation.navigation.Screens$WebRulesScreen] */
    /* JADX WARN: Type inference failed for: r1v203, types: [a.m7h0, org.xplatform.web_rules.impl.presentation.navigation.Screens$WebRulesScreen] */
    /* JADX WARN: Type inference failed for: r2v31, types: [a.m7h0, org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1] */
    /* JADX WARN: Type inference failed for: r2v41, types: [a.m7h0, org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1] */
    /* JADX WARN: Type inference failed for: r2v51, types: [a.m7h0, org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.dq00, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
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
        Object next;
        Object next2;
        String str;
        Object next3;
        Integer intOrNull;
        String str2;
        boolean zD;
        String str3;
        String str4;
        hwe0 hwe0Var = (hwe0) obj;
        hwe0Var.getClass();
        boolean zEquals = hwe0Var.equals(fve0.f10211a);
        i1w0 i1w0Var = this.c0;
        xte0 xte0Var = this.j0;
        boolean z = false;
        iIntValue = 0;
        int iIntValue = 0;
        ?? r9 = 0;
        byte b = 1;
        if (zEquals) {
            q1f0 q1f0Var = ((aye0) D()).h;
            q7f0 q7f0Var = ((aye0) D()).h.M;
            if (q7f0Var == null) {
                q7f0Var = q7f0.FULL;
            }
            xte0Var.j(q7f0Var);
            List list = ((aye0) D()).e;
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
                    String str5 = ((aye0) D()).h.f27950a;
                    if (str5 == null || str5.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof hze0) {
                    if (((aye0) D()).h.b) {
                        zD = false;
                    } else {
                        zD = true;
                    }
                } else if (q0f0Var instanceof jze0) {
                    zD = Intrinsics.d(((aye0) D()).v, ((aye0) D()).h.c);
                } else if (q0f0Var instanceof kze0) {
                    zD = Intrinsics.d(((aye0) D()).w, ((aye0) D()).h.o);
                } else if (q0f0Var instanceof lze0) {
                    zD = Intrinsics.d(((aye0) D()).x, ((aye0) D()).h.d);
                } else if (q0f0Var instanceof mze0) {
                    if (((aye0) D()).h.e) {
                        zD = false;
                    } else {
                        zD = true;
                    }
                } else if (q0f0Var instanceof nze0) {
                    zD = Intrinsics.d(((aye0) D()).s, ((aye0) D()).h.g);
                } else if (q0f0Var instanceof oze0) {
                    zD = Intrinsics.d(((aye0) D()).u, ((aye0) D()).h.h);
                } else if (q0f0Var instanceof pze0) {
                    if (((aye0) D()).h.i == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof qze0) {
                    if (((aye0) D()).h.j == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof rze0) {
                    String str6 = ((aye0) D()).h.k;
                    if (str6 == null || str6.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof sze0) {
                    String str7 = ((aye0) D()).h.l;
                    if (str7 == null || str7.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof tze0) {
                    if (((aye0) D()).h.F == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof uze0) {
                    String str8 = ((aye0) D()).h.m;
                    if (str8 == null || str8.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof wze0) {
                    String str9 = ((aye0) D()).h.n;
                    if (str9 == null || str9.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof xze0) {
                    if (((aye0) D()).h.f == ((aye0) D()).B) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof yze0) {
                    if (((aye0) D()).h.I == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof zze0) {
                    if (((aye0) D()).h.J == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof a0f0) {
                    String str10 = ((aye0) D()).h.p;
                    if (str10 == null || str10.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof b0f0) {
                    String str11 = ((aye0) D()).h.q;
                    if (str11 == null || str11.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof c0f0) {
                    PhoneStateModel phoneStateModel = ((aye0) D()).h.r;
                    String str12 = phoneStateModel != null ? phoneStateModel.f46877a : null;
                    if (str12 == null || str12.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof d0f0) {
                    if (((aye0) D()).h.s == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof e0f0) {
                    String str13 = ((aye0) D()).h.t;
                    if (str13 == null || str13.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof f0f0) {
                    zD = Intrinsics.d(((aye0) D()).y, ((aye0) D()).h.u);
                } else if (q0f0Var instanceof g0f0) {
                    zD = Intrinsics.d(((aye0) D()).t, ((aye0) D()).h.v);
                } else if (!(q0f0Var instanceof h0f0) ? !(!(q0f0Var instanceof i0f0) ? !(!(q0f0Var instanceof j0f0) ? !(!(q0f0Var instanceof k0f0) ? !(!(q0f0Var instanceof l0f0) ? !(!(q0f0Var instanceof m0f0) ? !(!(q0f0Var instanceof n0f0) ? !(!(q0f0Var instanceof o0f0) ? !(!(q0f0Var instanceof p0f0) || ((aye0) D()).h.D == null) : ((aye0) D()).h.C) : ((aye0) D()).h.L) : ((aye0) D()).h.B) : ((aye0) D()).h.A) : !((str3 = ((aye0) D()).h.z) == null || str3.length() == 0)) : ((aye0) D()).h.y) : ((aye0) D()).h.x) : !((str4 = ((aye0) D()).h.w) == null || str4.length() == 0)) {
                    zD = true;
                } else {
                    zD = false;
                }
                if (!zD) {
                    G(lxe0.f20812a);
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
            if (hwe0Var instanceof ave0) {
                ave0 ave0Var = (ave0) hwe0Var;
                u0f0 u0f0Var = ave0Var.f1522a;
                File file = ave0Var.b;
                int iOrdinal = u0f0Var.ordinal();
                bzs0 bzs0Var = this.r;
                yox yoxVar = this.q;
                switch (iOrdinal) {
                    case 33:
                        String str14 = ((aye0) D()).m.m.t;
                        boolean z2 = ((aye0) D()).m.p0;
                        xte0Var.i();
                        if (StringsKt.O(str14, "https://", false) && z2) {
                            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                            yoxVar.getClass();
                            ?? paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str14);
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
                        } else if (StringsKt.O(str14, "https://", false)) {
                            G(new kxe0(str14));
                        } else if (str14.length() <= 0) {
                            j0(file, dxk.FULL_DOC_RULES);
                        } else {
                            i1w0Var.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                            bzs0Var.getClass();
                            ?? D = bzs0.d(R.string.rules_title, str14);
                            if (D instanceof DialogScreen) {
                                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) D)));
                            } else {
                                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(D)));
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
                        String str15 = ((aye0) D()).m.m.y;
                        boolean z3 = ((aye0) D()).m.p0;
                        if (StringsKt.O(str15, "https://", false) && z3) {
                            CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                            yoxVar.getClass();
                            ?? paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$2 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str15);
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
                        } else if (StringsKt.O(str15, "https://", false)) {
                            G(new kxe0(str15));
                        } else if (str15.length() <= 0) {
                            j0(file, dxk.PRIVACY_POLICY_DOC_RULES);
                        } else {
                            i1w0Var.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                            bzs0Var.getClass();
                            ?? D2 = bzs0.d(R.string.info_privacy_policy, str15);
                            if (D2 instanceof DialogScreen) {
                                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) D2)));
                            } else {
                                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(D2)));
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
                        String str16 = ((aye0) D()).m.m.u;
                        boolean z4 = ((aye0) D()).m.p0;
                        if (StringsKt.O(str16, "https://", false) && z4) {
                            CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                            yoxVar.getClass();
                            ?? paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$3 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str16);
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
                        } else if (StringsKt.O(str16, "https://", false)) {
                            G(new kxe0(str16));
                        } else if (str16.length() <= 0) {
                            j0(file, dxk.RESPONSIBLE_GAMING_DOC_RULES);
                        } else {
                            i1w0Var.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                            bzs0Var.getClass();
                            ?? D3 = bzs0.d(R.string.responsible_game, str16);
                            if (D3 instanceof DialogScreen) {
                                copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) D3)));
                            } else {
                                copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new w0w0(D3)));
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
            boolean z5 = hwe0Var instanceof jve0;
            ?? r6 = this.x0;
            if (z5) {
                u0f0 u0f0Var2 = ((jve0) hwe0Var).f17200a;
                r6.getClass();
                ((eye0) r6.c).invoke(new xwe0(r6, u0f0Var2));
                return;
            }
            byte b2 = 4;
            byte b3 = 3;
            if (hwe0Var instanceof ewe0) {
                ewe0 ewe0Var = (ewe0) hwe0Var;
                u0f0 u0f0Var3 = ewe0Var.f8521a;
                ?? r0 = ewe0Var.b;
                r6.m(u0f0Var3, r0);
                if (u0f0Var3 == u0f0.l) {
                    bby bbyVar = this.v0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    this.v0 = sac.V(jiu0.a(this), new bue0(b2), null, null, new kpb0((Object) r0, this, (yje) r9, b3), 14);
                }
                u0f0 u0f0Var4 = u0f0.n;
                if (u0f0Var3 != u0f0Var4 || (str2 = ((aye0) D()).h.q) == null || str2.length() == 0) {
                    return;
                }
                n0(u0f0Var4, r0.equals(str2) ? jrp.f17014a : orp.f25745a);
                return;
            }
            boolean z6 = hwe0Var instanceof fwe0;
            byte b4 = 2;
            byte b5 = 15;
            byte b6 = 6;
            mne mneVar = this.a0;
            if (z6) {
                int iOrdinal2 = ((fwe0) hwe0Var).f10255a.f19669a.ordinal();
                if (iOrdinal2 == 3) {
                    sac.V(jiu0.a(this), new d8e0(1, this, eze0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, mneVar.b, new kpb0(this, r9, b2), 10);
                    return;
                }
                if (iOrdinal2 == 4) {
                    sac.V(jiu0.a(this), new qye0(1, this, eze0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, mneVar.b, new mye0(this, r9, b4), 10);
                    return;
                }
                if (iOrdinal2 == 5) {
                    sac.V(jiu0.a(this), new d8e0(1, this, eze0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, mneVar.b, new mye0(this, r9, z ? (byte) 1 : (byte) 0), 10);
                    return;
                }
                if (iOrdinal2 == 6) {
                    Calendar calendar = Calendar.getInstance();
                    Iterator it = ((aye0) D()).e.iterator();
                    do {
                        if (!it.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it.next();
                    } while (!(((q0f0) next3) instanceof pze0));
                    pze0 pze0Var = next3 instanceof pze0 ? (pze0) next3 : null;
                    if (pze0Var != null && (intOrNull = StringsKt.toIntOrNull(pze0Var.e)) != null) {
                        iIntValue = intOrNull.intValue();
                    }
                    calendar.add(1, -iIntValue);
                    calendar.add(5, -1);
                    long timeInMillis = calendar.getTimeInMillis();
                    Long l = ((aye0) D()).h.i;
                    long jLongValue = l != null ? l.longValue() : timeInMillis;
                    if (jLongValue > timeInMillis) {
                        jLongValue = timeInMillis;
                    }
                    G(new jxe0(M(this, jLongValue, null, Long.valueOf(timeInMillis), 2)));
                    return;
                }
                if (iOrdinal2 == 8) {
                    sac.V(jiu0.a(this), new d8e0(1, this, eze0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, mneVar.b, new mye0(this, r9, b), 10);
                    return;
                }
                if (iOrdinal2 == 9) {
                    G(pxe0.f27750a);
                    return;
                }
                byte b7 = 14;
                if (iOrdinal2 == 14) {
                    sac.V(jiu0.a(this), new d8e0(1, this, eze0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, mneVar.b, new er60((Object) this, (yje) r9, (byte) 29), 10);
                    return;
                }
                if (iOrdinal2 == 15) {
                    sac.V(jiu0.a(this), new d8e0(1, this, eze0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, mneVar.b, new gc1(this, (yje) r9, b7), 10);
                    return;
                }
                if (iOrdinal2 != 36) {
                    if (iOrdinal2 != 37) {
                        return;
                    }
                    Calendar calendar2 = Calendar.getInstance();
                    Long l2 = ((aye0) D()).h.I;
                    long jLongValue2 = l2 != null ? l2.longValue() : calendar2.getTimeInMillis();
                    if (jLongValue2 <= calendar2.getTimeInMillis()) {
                        jLongValue2 = calendar2.getTimeInMillis();
                    }
                    G(new mxe0(M(this, jLongValue2, Long.valueOf(calendar2.getTimeInMillis()), null, 4)));
                    return;
                }
                if (((aye0) D()).h.j != null) {
                    long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                    Long l3 = ((aye0) D()).h.J;
                    long jLongValue3 = l3 != null ? l3.longValue() : timeInMillis2;
                    if (jLongValue3 > timeInMillis2) {
                        jLongValue3 = timeInMillis2;
                    }
                    G(new nxe0(M(this, jLongValue3, null, Long.valueOf(timeInMillis2), 2)));
                    return;
                }
                return;
            }
            if (hwe0Var instanceof nve0) {
                hgt hgtVar = ((nve0) hwe0Var).f24186a;
                r6.getClass();
                ((eye0) r6.c).invoke(new xwe0(hgtVar, r6, b3));
                return;
            }
            if (hwe0Var instanceof xve0) {
                ((eye0) r6.c).invoke(new ywe0(((xve0) hwe0Var).f41555a == wpa0.YES, r6, (byte) 1));
                return;
            }
            if (hwe0Var instanceof dwe0) {
                ((eye0) r6.c).invoke(new z08(((dwe0) hwe0Var).f6796a, (Object) r6, b5));
                return;
            }
            if (hwe0Var instanceof gve0) {
                SimpleDate simpleDate = ((gve0) hwe0Var).f11971a;
                r6.getClass();
                ((eye0) r6.c).invoke(new vwe0(simpleDate, r6, z ? (byte) 1 : (byte) 0));
                return;
            }
            if (hwe0Var instanceof kve0) {
                this.O.a(((kve0) hwe0Var).f18953a);
                return;
            }
            if (hwe0Var instanceof tve0) {
                SimpleDate simpleDate2 = ((tve0) hwe0Var).f34596a;
                r6.getClass();
                ((eye0) r6.c).invoke(new vwe0(simpleDate2, r6, b));
                return;
            }
            if (hwe0Var instanceof uve0) {
                ((eye0) r6.c).invoke(new vwe0(((uve0) hwe0Var).f36346a, r6, b4));
                return;
            }
            if (hwe0Var instanceof bwe0) {
                ghk0 ghk0Var = ((bwe0) hwe0Var).f3320a;
                String str17 = ghk0Var.f11305a == 13 ? ((aye0) D()).r.m : this.e0.f11725a.f15748a.o() ? ((aye0) D()).r.l : ((aye0) D()).r.k;
                int i = ghk0Var.f11305a;
                SocialStateModel socialStateModel = new SocialStateModel(i, ghk0Var.d, i, ghk0Var.c, str17, ghk0Var.e, ghk0Var.f, ghk0Var.g, ghk0Var.h, ghk0Var.b);
                r6.getClass();
                ((eye0) r6.c).invoke(new oac0(socialStateModel, r6, (byte) 28));
                if (ghk0Var.f11305a == 17) {
                    this.p0.f(hfi0.TELEGRAM);
                }
                l0();
                return;
            }
            if (hwe0Var instanceof lve0) {
                lve0 lve0Var = (lve0) hwe0Var;
                int i2 = lve0Var.f20711a;
                String str18 = lve0Var.b;
                Iterator it2 = ((aye0) D()).o.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (((BonusInfoModel) next2).f46848a != i2);
                BonusInfoModel bonusInfoModel = (BonusInfoModel) next2;
                String str19 = (bonusInfoModel == null || (str = bonusInfoModel.b) == null) ? str18 : str;
                r9 = bonusInfoModel != null ? bonusInfoModel.c : 0;
                if (r9 == 0) {
                    r9 = "";
                }
                r6.getClass();
                ((eye0) r6.c).invoke(new wwe0(i2, str19, r9, r6, (byte) 1));
                return;
            }
            if (hwe0Var instanceof dve0) {
                dve0 dve0Var = (dve0) hwe0Var;
                sac.V(jiu0.a(this), aze0.f1714a, null, mneVar.f22085a, new a48(this, dve0Var.f6740a, dve0Var.b, r9, (byte) 3), 10);
                return;
            }
            if (hwe0Var instanceof bve0) {
                sac.V(jiu0.a(this), new eye0(this, z ? (byte) 1 : (byte) 0), null, mneVar.f22085a, new defpackage.e(this, ((bve0) hwe0Var).f3277a, r9, b6), 10);
                return;
            }
            boolean z7 = hwe0Var instanceof ove0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z7) {
                u0f0 u0f0Var5 = ((ove0) hwe0Var).f25921a;
                Set setKeySet = ((aye0) D()).j.keySet();
                int iA = wp20.a(r3d.q(setKeySet, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                for (Object obj3 : setKeySet) {
                    linkedHashMap.put(obj3, Boolean.FALSE);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(u0f0Var5, Boolean.FALSE);
                p7m0 p7m0Var = ocjVar.f25029a;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    if (p7m0Var.m(value2, aye0.a((aye0) value2, false, false, false, null, null, null, null, null, null, linkedHashMap3, null, null, false, null, null, null, null, null, null, null, null, 2147483135))) {
                        G(ixe0.f15539a);
                        return;
                    }
                    linkedHashMap2 = linkedHashMap3;
                }
            } else if (hwe0Var instanceof qve0) {
                u0f0 u0f0Var6 = ((qve0) hwe0Var).f29383a;
                Set setKeySet2 = ((aye0) D()).j.keySet();
                int iA2 = wp20.a(r3d.q(setKeySet2, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                for (Object obj4 : setKeySet2) {
                    linkedHashMap4.put(obj4, Boolean.FALSE);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(linkedHashMap4);
                List listL0 = CollectionsKt.L0(((aye0) D()).i.keySet());
                Iterator it3 = CollectionsKt.O(listL0, listL0.indexOf(u0f0Var6) + 1).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        if (((u0f0) next) != u0f0.h) {
                            break;
                        }
                    }
                } while (((aye0) D()).h.r == null);
                u0f0 u0f0Var7 = (u0f0) next;
                if (u0f0Var7 != null) {
                    linkedHashMap5.put(u0f0Var7, Boolean.TRUE);
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                    LinkedHashMap linkedHashMap6 = linkedHashMap5;
                    if (p7m0Var2.m(value3, aye0.a((aye0) value3, false, false, false, null, null, null, null, null, null, linkedHashMap6, null, null, false, null, null, null, null, null, null, null, null, 2147483135))) {
                        return;
                    } else {
                        linkedHashMap5 = linkedHashMap6;
                    }
                }
            } else {
                if (!hwe0Var.equals(pve0.f27659a)) {
                    if (hwe0Var.equals(vve0.f38095a)) {
                        ((eye0) r6.c).invoke(new uwe0(r6, (byte) 3));
                        return;
                    }
                    if (hwe0Var.equals(cwe0.f5077a)) {
                        ((eye0) r6.c).invoke(new uwe0(r6, (byte) 0));
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, yve0.f43315a)) {
                        G(vxe0.f38195a);
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, zve0.f45052a)) {
                        l0();
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, awe0.f1570a)) {
                        g0();
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, yue0.f43265a)) {
                        E();
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, ive0.f15442a)) {
                        d0();
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, cve0.f5027a)) {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value = p7m0Var3.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var3.m(value, aye0.a((aye0) value, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483646)));
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, eve0.f8464a)) {
                        c0();
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, mve0.f22453a)) {
                        e0();
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, gwe0.f12023a)) {
                        i0();
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, hve0.f13724a)) {
                        Q();
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, wve0.f39834a)) {
                        f0();
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, zue0.f45007a)) {
                        h0();
                        return;
                    }
                    if (Intrinsics.d(hwe0Var, rve0.f31164a)) {
                        b0(false);
                        return;
                    } else if (Intrinsics.d(hwe0Var, sve0.f32861a)) {
                        b0(true);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                Set setKeySet3 = ((aye0) D()).j.keySet();
                int iA3 = wp20.a(r3d.q(setKeySet3, 10));
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(iA3 >= 16 ? iA3 : 16);
                for (Object obj5 : setKeySet3) {
                    linkedHashMap7.put(obj5, Boolean.FALSE);
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(linkedHashMap7);
                p7m0 p7m0Var4 = ocjVar.f25029a;
                while (true) {
                    Object value4 = p7m0Var4.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                    LinkedHashMap linkedHashMap9 = linkedHashMap8;
                    if (p7m0Var4.m(value4, aye0.a((aye0) value4, false, false, false, null, null, null, null, null, null, linkedHashMap9, null, null, false, null, null, null, null, null, null, null, null, 2147483135))) {
                        return;
                    } else {
                        linkedHashMap8 = linkedHashMap9;
                    }
                }
            }
        }
    }
}
