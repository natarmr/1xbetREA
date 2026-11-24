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
import org.xplatform.registration.success.api.RegistrationSuccessParams;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CurrencyStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.RegionStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.SocialStateModel;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class ocf0 extends i3t0 {
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
    public final j910 y0;
    public final aqt z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ocf0(es esVar, h03 h03Var, bk3 bk3Var, s64 s64Var, vqb vqbVar, gqc gqcVar, vqc vqcVar, m1e m1eVar, mne mneVar, cyh cyhVar, ali aliVar, pmi pmiVar, duj dujVar, sek sekVar, lsn lsnVar, ivn ivnVar, a7q a7qVar, a7q a7qVar2, a7q a7qVar3, a7q a7qVar4, cmt cmtVar, cmt cmtVar2, rpt rptVar, rpt rptVar2, aqt aqtVar, rqt rqtVar, tqt tqtVar, ytt yttVar, bzt bztVar, m0u m0uVar, n4u n4uVar, a6u a6uVar, a6u a6uVar2, f7u f7uVar, f7u f7uVar2, b8u b8uVar, b8u b8uVar2, lbu lbuVar, ieu ieuVar, reu reuVar, xfu xfuVar, fnu fnuVar, fnu fnuVar2, fnu fnuVar3, gnu gnuVar, jru jruVar, pru pruVar, ntu ntuVar, svu svuVar, bzu bzuVar, yox yoxVar, nh70 nh70Var, mi70 mi70Var, vrb0 vrb0Var, lme0 lme0Var, xte0 xte0Var, lhf0 lhf0Var, ctf0 ctf0Var, vzg0 vzg0Var, roi0 roi0Var, owp0 owp0Var, h0q0 h0q0Var, bzs0 bzs0Var, tkt0 tkt0Var, i1w0 i1w0Var, z4w0 z4w0Var) {
        aqtVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new x4f0(pruVar, f7uVar2, n4uVar, vzg0Var, rqtVar, lbuVar, bztVar, (byte) 1), g090VarP, new iv80(ctf0Var, (byte) 22), (yzn0) null);
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
        this.x0 = q7m0.a(((mbf0) D()).j);
        byte b = 3;
        this.y0 = new j910(vzg0Var, new pbf0(this, b), (byte) 20);
        byte b2 = 1;
        sac.V(jiu0.a(this), icf0.f14534a, null, mneVar.c, new hcf0(this, yjeVar, b2), 10);
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
            if (p7m0Var.m(value, mbf0.a((mbf0) value, false, false, null, null, null, arrayList3, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741791))) {
                qjj.W(jiu0.a(this), this.Z.f22085a, null, new jcf0(this, yjeVar, b2), 2);
                slb.U(new dnq(new fnq(this.o0.b(), new hcf0(this, yjeVar, (byte) 2), (byte) 4), new pr60(b, yjeVar, (byte) 25), (byte) 1), jiu0.a(this));
                return;
            }
            arrayList2 = arrayList3;
        }
    }

    public static DateCalendarBottomSheetParams M(ocf0 ocf0Var, long j, Long l, Long l2, int i) {
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
        String strA = ocf0Var.a0.b.a(R.string.calendar_date_module_select_date, Arrays.copyOf(new Object[0], 0));
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
        tbf0 tbf0Var;
        String str;
        if (zjeVar instanceof tbf0) {
            tbf0Var = (tbf0) zjeVar;
            int i = tbf0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbf0Var.m = i - Integer.MIN_VALUE;
            } else {
                tbf0Var = new tbf0(this, zjeVar);
            }
        } else {
            tbf0Var = new tbf0(this, zjeVar);
        }
        Object obj = tbf0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = tbf0Var.m;
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
                tbf0Var.i = arrayList;
                tbf0Var.j = str2;
                tbf0Var.m = 1;
                Object objB0 = this.S.f37848a.b0(strConcat, tbf0Var);
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
        str = tbf0Var.j;
        arrayList = tbf0Var.i;
        z1x.P(obj);
        o4c o4cVar = (o4c) obj;
        if (o4cVar.b.length() > 0) {
            w3d.y(arrayList, new bue0((byte) 15));
            arrayList.add(new u1q(true, twn.p("[^0-9]", str, ""), o4cVar.f24626a));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(zje zjeVar) {
        ubf0 ubf0Var;
        if (zjeVar instanceof ubf0) {
            ubf0Var = (ubf0) zjeVar;
            int i = ubf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ubf0Var.k = i - Integer.MIN_VALUE;
            } else {
                ubf0Var = new ubf0(this, zjeVar);
            }
        } else {
            ubf0Var = new ubf0(this, zjeVar);
        }
        Object objI = ubf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ubf0Var.k;
        if (i2 == 0) {
            z1x.P(objI);
            CountryStateModel countryStateModel = ((mbf0) D()).g.g;
            int i3 = countryStateModel != null ? countryStateModel.f46863a : -1;
            CurrencyStateModel currencyStateModel = ((mbf0) D()).g.h;
            int i4 = currencyStateModel != null ? currencyStateModel.f46864a : -1;
            ubf0Var.k = 1;
            objI = this.M.i(i3, i4, ubf0Var);
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
            i1w0Var.d(new xwe0(this, qu4Var, (byte) 28));
            return;
        }
        PhoneStateModel phoneStateModel = ((mbf0) D()).g.r;
        String str = phoneStateModel != null ? phoneStateModel.c : null;
        if (str == null) {
            str = "";
        }
        lm90 lm90Var = new lm90(twn.p("\\d", str, TokenNames.X), TokenNames.X);
        PhoneStateModel phoneStateModel2 = ((mbf0) D()).g.r;
        String strB = lm90Var.b(String.valueOf(phoneStateModel2 != null ? phoneStateModel2.f46866a : null));
        PhoneStateModel phoneStateModel3 = ((mbf0) D()).g.r;
        i1w0Var.d(new zlb0(this, qu4Var, w6x.q(phoneStateModel3 != null ? phoneStateModel3.b : null, Separators.SP, strB), (byte) 17));
    }

    public final void Q() {
        sac.V(jiu0.a(this), new qye0(1, this, ocf0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, this.Z.f22085a, new qo6(this, null, (byte) 6), 10);
    }

    public final void R(Throwable th) {
        Object value;
        G(fbf0.f9255a);
        th.printStackTrace();
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, mbf0.a((mbf0) value, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741822)));
    }

    public final void S(nq90 nq90Var) {
        Object value;
        Object next;
        boolean z = nq90Var instanceof iq90;
        j910 j910Var = this.y0;
        if (z && ((iq90) nq90Var).f15199a != 126) {
            Iterator it = ((mbf0) D()).d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((q0f0) next) instanceof zze0));
            q0f0 q0f0Var = (q0f0) next;
            if (q0f0Var != null) {
                boolean zA = q0f0Var.a();
                byte b = 1;
                if (zA && ((mbf0) D()).r.J) {
                    ((pbf0) j910Var.c).invoke(new z9f0(j910Var, b));
                }
            }
        }
        ((pbf0) j910Var.c).invoke(new xwe0(nq90Var, j910Var, (byte) 26));
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, mbf0.a((mbf0) value, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741822)));
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x021e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0222  */
    /* JADX WARN: Code duplicated, block: B:92:0x0231  */
    /* JADX WARN: Code duplicated, block: B:94:0x0247  */
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
        kbf0 kbf0Var;
        boolean z2;
        byte b;
        j910 j910Var;
        boolean z3;
        duj dujVar;
        q7f0 q7f0Var;
        int i;
        Map map;
        Object next;
        Object value;
        boolean z4 = th instanceof t3c;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        String strA = "";
        jrp jrpVar = jrp.f17014a;
        boolean z5 = true;
        z5 = true;
        final byte b2 = 0;
        xte0 xte0Var = this.i0;
        if (z4) {
            String str = ((t3c) th).f33259a;
            strA = str != null ? str : "";
            u0f0 u0f0Var = u0f0.l;
            l0(u0f0Var, new mrp(strA));
            G(new ebf0(strA));
            PhoneStateModel phoneStateModel = ((mbf0) D()).g.r;
            String str2 = phoneStateModel != null ? phoneStateModel.b : null;
            if (str2 != null && str2.length() != 0) {
                z5 = false;
            }
            Map mapB = wp20.b(new Pair(u0f0Var, new mrp(strA)));
            p1f0 p1f0Var = ((mbf0) D()).g;
            q7f0 q7f0Var2 = ((mbf0) D()).g.M;
            if (q7f0Var2 == null) {
                q7f0Var2 = q7f0.FULL;
            }
            xte0Var.l(z5, mapB, q7f0Var2);
        } else {
            boolean z6 = th instanceof dox;
            ctf0 ctf0Var = this.a0;
            if (z6) {
                Map map2 = ((dox) th).f6433a;
                if (map2.isEmpty()) {
                    z = th instanceof mm90;
                    kbf0Var = kbf0.f18012a;
                    if (z) {
                        G(kbf0Var);
                    } else {
                        z2 = th instanceof nqt0;
                        b = 2;
                        j910Var = this.y0;
                        if (z2) {
                            xte0Var.q();
                            G(kbf0Var);
                            ((pbf0) j910Var.c).invoke(new z9f0(j910Var, b));
                        } else {
                            z3 = th instanceof vkk0;
                            dujVar = this.c0;
                            if (z3) {
                                xte0Var.q();
                                ((pbf0) j910Var.c).invoke(new z9f0(j910Var, b));
                                dujVar.b(th, new Function2(this) { // from class: a.rbf0
                                    public final /* synthetic */ ocf0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        byte b3 = b2;
                                        Throwable th2 = th;
                                        ocf0 ocf0Var = this.b;
                                        Throwable th3 = (Throwable) obj;
                                        String str3 = (String) obj2;
                                        switch (b3) {
                                            case 0:
                                                th3.getClass();
                                                str3.getClass();
                                                ocf0Var.G(new ibf0(((vkk0) th2).f37578a));
                                                break;
                                            default:
                                                th3.getClass();
                                                str3.getClass();
                                                String message = th2.getMessage();
                                                if (message == null) {
                                                    message = ocf0Var.a0.b.a(R.string.error_during_registration, Arrays.copyOf(new Object[0], 0));
                                                }
                                                ocf0Var.G(new ibf0(message));
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                            } else if (th instanceof orv0) {
                                l0(u0f0.h, srp.f32690a);
                                G(new ebf0(ctf0Var.b.a(R.string.input_correct_phone, Arrays.copyOf(new Object[0], 0))));
                            } else if (th instanceof zhi0) {
                                zhi0 zhi0Var = (zhi0) th;
                                q7f0Var = ((mbf0) D()).g.M;
                                if (q7f0Var == null) {
                                    q7f0Var = q7f0.FULL;
                                }
                                p1f0 p1f0Var2 = ((mbf0) D()).g;
                                xte0Var.g(zhi0Var, q7f0Var);
                                final byte b3 = z5 ? (byte) 1 : (byte) 0;
                                dujVar.b(th, new Function2(this) { // from class: a.rbf0
                                    public final /* synthetic */ ocf0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        byte b4 = b3;
                                        Throwable th2 = th;
                                        ocf0 ocf0Var = this.b;
                                        Throwable th3 = (Throwable) obj;
                                        String str3 = (String) obj2;
                                        switch (b4) {
                                            case 0:
                                                th3.getClass();
                                                str3.getClass();
                                                ocf0Var.G(new ibf0(((vkk0) th2).f37578a));
                                                break;
                                            default:
                                                th3.getClass();
                                                str3.getClass();
                                                String message = th2.getMessage();
                                                if (message == null) {
                                                    message = ocf0Var.a0.b.a(R.string.error_during_registration, Arrays.copyOf(new Object[0], 0));
                                                }
                                                ocf0Var.G(new ibf0(message));
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                            } else {
                                dujVar.b(th, new yr0(th, (byte) 27));
                            }
                        }
                    }
                } else {
                    PhoneStateModel phoneStateModel2 = ((mbf0) D()).g.r;
                    String str3 = phoneStateModel2 != null ? phoneStateModel2.b : null;
                    boolean z7 = str3 == null || str3.length() == 0;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map2.entrySet()) {
                        if (!Intrinsics.d(entry.getValue(), jrpVar)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    p1f0 p1f0Var3 = ((mbf0) D()).g;
                    q7f0 q7f0Var3 = ((mbf0) D()).g.M;
                    if (q7f0Var3 == null) {
                        q7f0Var3 = q7f0.FULL;
                    }
                    xte0Var.l(z7, linkedHashMap, q7f0Var3);
                    q7f0 q7f0Var4 = ((mbf0) D()).j;
                    if (q7f0Var4 == null) {
                        q7f0Var4 = q7f0.FULL;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(((mbf0) D()).e);
                    linkedHashMap2.put(q7f0Var4, map2);
                    p7m0 p7m0Var = ocjVar.f25029a;
                    while (true) {
                        Object value2 = p7m0Var.getValue();
                        value2.getClass();
                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                        oyg0Var.getClass();
                        if (p7m0Var.m(value2, mbf0.a((mbf0) value2, false, false, null, null, linkedHashMap3, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741807))) {
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
                            Object obj = map2.get(u0f0Var2);
                            mrp mrpVar = obj instanceof mrp ? (mrp) obj : null;
                            String str4 = mrpVar != null ? mrpVar.f22284a : null;
                            if (str4 != null) {
                                strA = str4;
                            }
                        }
                    }
                    G(new ebf0(strA));
                }
            } else {
                z = th instanceof mm90;
                kbf0Var = kbf0.f18012a;
                if (z) {
                    G(kbf0Var);
                } else {
                    z2 = th instanceof nqt0;
                    b = 2;
                    j910Var = this.y0;
                    if (z2) {
                        xte0Var.q();
                        G(kbf0Var);
                        ((pbf0) j910Var.c).invoke(new z9f0(j910Var, b));
                    } else {
                        z3 = th instanceof vkk0;
                        dujVar = this.c0;
                        if (z3) {
                            xte0Var.q();
                            ((pbf0) j910Var.c).invoke(new z9f0(j910Var, b));
                            dujVar.b(th, new Function2(this) { // from class: a.rbf0
                                public final /* synthetic */ ocf0 b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    byte b4 = b2;
                                    Throwable th2 = th;
                                    ocf0 ocf0Var = this.b;
                                    Throwable th3 = (Throwable) obj2;
                                    String str5 = (String) obj3;
                                    switch (b4) {
                                        case 0:
                                            th3.getClass();
                                            str5.getClass();
                                            ocf0Var.G(new ibf0(((vkk0) th2).f37578a));
                                            break;
                                        default:
                                            th3.getClass();
                                            str5.getClass();
                                            String message = th2.getMessage();
                                            if (message == null) {
                                                message = ocf0Var.a0.b.a(R.string.error_during_registration, Arrays.copyOf(new Object[0], 0));
                                            }
                                            ocf0Var.G(new ibf0(message));
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                        } else if (th instanceof orv0) {
                            l0(u0f0.h, srp.f32690a);
                            G(new ebf0(ctf0Var.b.a(R.string.input_correct_phone, Arrays.copyOf(new Object[0], 0))));
                        } else if (th instanceof zhi0) {
                            zhi0 zhi0Var2 = (zhi0) th;
                            q7f0Var = ((mbf0) D()).g.M;
                            if (q7f0Var == null) {
                                q7f0Var = q7f0.FULL;
                            }
                            p1f0 p1f0Var4 = ((mbf0) D()).g;
                            xte0Var.g(zhi0Var2, q7f0Var);
                            final byte b4 = z5 ? (byte) 1 : (byte) 0;
                            dujVar.b(th, new Function2(this) { // from class: a.rbf0
                                public final /* synthetic */ ocf0 b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    byte b5 = b4;
                                    Throwable th2 = th;
                                    ocf0 ocf0Var = this.b;
                                    Throwable th3 = (Throwable) obj2;
                                    String str5 = (String) obj3;
                                    switch (b5) {
                                        case 0:
                                            th3.getClass();
                                            str5.getClass();
                                            ocf0Var.G(new ibf0(((vkk0) th2).f37578a));
                                            break;
                                        default:
                                            th3.getClass();
                                            str5.getClass();
                                            String message = th2.getMessage();
                                            if (message == null) {
                                                message = ocf0Var.a0.b.a(R.string.error_during_registration, Arrays.copyOf(new Object[0], 0));
                                            }
                                            ocf0Var.G(new ibf0(message));
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                        } else {
                            dujVar.b(th, new yr0(th, (byte) 27));
                        }
                    }
                }
            }
        }
        q7f0 q7f0Var5 = ((mbf0) D()).j;
        if (q7f0Var5 == null || (map = (Map) ((mbf0) D()).e.get(q7f0Var5)) == null) {
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (Intrinsics.d(((Map.Entry) next).getValue(), jrpVar));
        Map.Entry entry2 = (Map.Entry) next;
        u0f0 u0f0Var3 = entry2 != null ? (u0f0) entry2.getKey() : null;
        if (u0f0Var3 != null) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, mbf0.a((mbf0) value, false, false, null, null, null, null, null, null, null, null, null, u0f0Var3, null, false, null, null, null, null, null, null, null, null, 1073725439)));
        }
    }

    public final void U(zqt0 zqt0Var) {
        String strValueOf = String.valueOf(zqt0Var.f44823a);
        String str = zqt0Var.b;
        PhoneStateModel phoneStateModel = ((mbf0) D()).g.r;
        String str2 = phoneStateModel != null ? phoneStateModel.b : null;
        String str3 = str2 == null ? "" : str2;
        PhoneStateModel phoneStateModel2 = ((mbf0) D()).g.r;
        String str4 = phoneStateModel2 != null ? phoneStateModel2.f46866a : null;
        String str5 = str4 == null ? "" : str4;
        CountryStateModel countryStateModel = ((mbf0) D()).g.g;
        Integer numValueOf = countryStateModel != null ? Integer.valueOf(countryStateModel.f46863a) : null;
        q7f0 q7f0Var = ((mbf0) D()).g.M;
        if (q7f0Var == null) {
            q7f0Var = q7f0.FULL;
        }
        q7f0 q7f0Var2 = q7f0Var;
        String str6 = ((mbf0) D()).g.u;
        String str7 = str6 == null ? "" : str6;
        BonusStateModel bonusStateModel = ((mbf0) D()).g.c;
        String str8 = bonusStateModel != null ? bonusStateModel.b : null;
        String str9 = str8 == null ? "" : str8;
        CountryStateModel countryStateModel2 = ((mbf0) D()).g.g;
        String str10 = countryStateModel2 != null ? countryStateModel2.b : null;
        String str11 = str10 == null ? "" : str10;
        CurrencyStateModel currencyStateModel = ((mbf0) D()).g.h;
        String str12 = currencyStateModel != null ? currencyStateModel.b : null;
        String str13 = str12 == null ? "" : str12;
        CountryStateModel countryStateModel3 = ((mbf0) D()).g.g;
        String str14 = countryStateModel3 != null ? countryStateModel3.e : null;
        RegistrationSuccessParams registrationSuccessParams = new RegistrationSuccessParams(strValueOf, str, str3, str5, numValueOf, q7f0Var2, str14 == null ? "" : str14, str7, str11, str13, str9, ((mbf0) D()).A.f4650a, ((mbf0) D()).g.D);
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

    /* JADX WARN: Code duplicated, block: B:58:0x0153 A[PHI: r3
  0x0153: PHI (r3v7 org.xplatform.registration.api.domain.models.BonusInfoModel) = 
  (r3v6 org.xplatform.registration.api.domain.models.BonusInfoModel)
  (r3v9 org.xplatform.registration.api.domain.models.BonusInfoModel)
  (r3v11 org.xplatform.registration.api.domain.models.BonusInfoModel)
 binds: [B:46:0x012c, B:54:0x0147, B:56:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
    
        if (r1 == r3) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(a.zje r38) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ocf0.V(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(zje zjeVar) {
        dcf0 dcf0Var;
        if (zjeVar instanceof dcf0) {
            dcf0Var = (dcf0) zjeVar;
            int i = dcf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dcf0Var.k = i - Integer.MIN_VALUE;
            } else {
                dcf0Var = new dcf0(this, zjeVar);
            }
        } else {
            dcf0Var = new dcf0(this, zjeVar);
        }
        Object objE = dcf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dcf0Var.k;
        if (i2 == 0) {
            z1x.P(objE);
            List list = ((mbf0) D()).d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof kze0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                dcf0Var.k = 1;
                objE = this.H.e(dcf0Var);
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
            j910 j910Var = this.y0;
            j910Var.getClass();
            jkcVar.getClass();
            ((pbf0) j910Var.c).invoke(new xwe0(jkcVar, j910Var, (byte) 23));
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
    public final Object X(zje zjeVar) {
        ecf0 ecf0Var;
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
        if (zjeVar instanceof ecf0) {
            ecf0Var = (ecf0) zjeVar;
            int i5 = ecf0Var.m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ecf0Var.m = i5 - Integer.MIN_VALUE;
            } else {
                ecf0Var = new ecf0(this, zjeVar);
            }
        } else {
            ecf0Var = new ecf0(this, zjeVar);
        }
        Object objI = ecf0Var.k;
        wne wneVar = wne.f39444a;
        int i6 = ecf0Var.m;
        j910 j910Var = this.y0;
        boolean z = false;
        Object obj = null;
        if (i6 == 0) {
            z1x.P(objI);
            ecf0Var.m = 1;
            objI = this.J.i(ecf0Var);
            if (objI != wneVar) {
            }
            return wneVar;
        }
        if (i6 == 1) {
            z1x.P(objI);
        } else {
            if (i6 == 2) {
                eltVar = ecf0Var.i;
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
                j910Var.getClass();
                rktVar.getClass();
                ((pbf0) j910Var.c).invoke(new xwe0(rktVar, j910Var, (byte) 25));
                countryStateModel = ((mbf0) D()).g.g;
                if (countryStateModel != null) {
                    i = countryStateModel.f46863a;
                } else {
                    i = -1;
                }
                ecf0Var.i = eltVar;
                ecf0Var.m = 3;
                objI = this.U.e(i, ecf0Var);
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
                        regionStateModel = ((mbf0) D()).g.v;
                        if (regionStateModel != null) {
                            i3 = regionStateModel.f46867a;
                        } else {
                            i3 = eltVar.f;
                        }
                        ecf0Var.i = eltVar;
                        ecf0Var.j = i2;
                        ecf0Var.m = 4;
                        objB = this.V.b(i3, ecf0Var);
                        if (objB != wneVar) {
                            int i7 = i2;
                            objI = objB;
                            i4 = i7;
                            eltVar2 = eltVar;
                        }
                    }
                    str = eltVar.c;
                    str2 = eltVar.d;
                    b = 26;
                    if (str.length() > 0) {
                        ((pbf0) j910Var.c).invoke(new xwe0(new lq90(eltVar.c, eltVar.f, true), j910Var, b));
                    }
                    if (str2.length() > 0) {
                        ((pbf0) j910Var.c).invoke(new xwe0(new fq90(str2, eltVar.g, true), j910Var, b));
                    }
                    return Unit.f46060a;
                }
                return wneVar;
            }
            if (i6 == 3) {
                eltVar = ecf0Var.i;
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
                    regionStateModel = ((mbf0) D()).g.v;
                    if (regionStateModel != null) {
                        i3 = regionStateModel.f46867a;
                    } else {
                        i3 = eltVar.f;
                    }
                    ecf0Var.i = eltVar;
                    ecf0Var.j = i2;
                    ecf0Var.m = 4;
                    objB = this.V.b(i3, ecf0Var);
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
                b = 26;
                if (str.length() > 0 && i2 != 0) {
                    ((pbf0) j910Var.c).invoke(new xwe0(new lq90(eltVar.c, eltVar.f, true), j910Var, b));
                }
                if (str2.length() > 0 && z) {
                    ((pbf0) j910Var.c).invoke(new xwe0(new fq90(str2, eltVar.g, true), j910Var, b));
                }
                return Unit.f46060a;
            }
            if (i6 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = ecf0Var.j;
            eltVar2 = ecf0Var.i;
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
        b = 26;
        if (str.length() > 0) {
            ((pbf0) j910Var.c).invoke(new xwe0(new lq90(eltVar.c, eltVar.f, true), j910Var, b));
        }
        if (str2.length() > 0) {
            ((pbf0) j910Var.c).invoke(new xwe0(new fq90(str2, eltVar.g, true), j910Var, b));
        }
        return Unit.f46060a;
        eltVar = (elt) objI;
        ecf0Var.i = eltVar;
        ecf0Var.m = 2;
        objI = this.Y.u(ecf0Var);
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
            j910Var.getClass();
            rktVar.getClass();
            ((pbf0) j910Var.c).invoke(new xwe0(rktVar, j910Var, (byte) 25));
            countryStateModel = ((mbf0) D()).g.g;
            if (countryStateModel != null) {
                i = countryStateModel.f46863a;
            } else {
                i = -1;
            }
            ecf0Var.i = eltVar;
            ecf0Var.m = 3;
            objI = this.U.e(i, ecf0Var);
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
                    regionStateModel = ((mbf0) D()).g.v;
                    if (regionStateModel != null) {
                        i3 = regionStateModel.f46867a;
                    } else {
                        i3 = eltVar.f;
                    }
                    ecf0Var.i = eltVar;
                    ecf0Var.j = i2;
                    ecf0Var.m = 4;
                    objB = this.V.b(i3, ecf0Var);
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
                b = 26;
                if (str.length() > 0) {
                    ((pbf0) j910Var.c).invoke(new xwe0(new lq90(eltVar.c, eltVar.f, true), j910Var, b));
                }
                if (str2.length() > 0) {
                    ((pbf0) j910Var.c).invoke(new xwe0(new fq90(str2, eltVar.g, true), j910Var, b));
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
    public final java.lang.Object Y(a.zje r13) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ocf0.Y(a.zje):java.lang.Object");
    }

    public final void Z(boolean z) {
        p1f0 p1f0Var = ((mbf0) D()).g;
        q7f0 q7f0Var = ((mbf0) D()).g.M;
        if (q7f0Var == null) {
            q7f0Var = q7f0.FULL;
        }
        this.i0.k(q7f0Var, z);
    }

    public final void a0() {
        H(new k8e0((byte) 20));
    }

    public final void b0() {
        H(new k8e0((byte) 21));
    }

    public final void c0() {
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
        } while (!p7m0Var.m(value, mbf0.a((mbf0) value, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741822)));
    }

    public final void d0() {
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

    public final void e0() {
        sac.V(jiu0.a(this), lcf0.f19797a, null, this.Z.b, new zye0((Object) this, (yje) null, (byte) 9), 10);
    }

    public final void f0() {
        H(new k8e0((byte) 22));
    }

    public final void g0() {
        u0f0 u0f0Var = u0f0.h;
        j910 j910Var = this.y0;
        j910Var.C(u0f0Var, "");
        j910Var.C(u0f0.k, "");
    }

    public final void h0(File file, dxk dxkVar) {
        sac.V(jiu0.a(this), new pbf0(this, (byte) 0), null, this.Z.f22085a, new pnd0((byte) 6, null, file, this, dxkVar), 10);
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
    public final java.lang.Object i0(java.util.List r10, a.ynb0 r11, int r12, boolean r13, boolean r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ocf0.i0(java.util.List, a.ynb0, int, boolean, boolean, a.zje):java.lang.Object");
    }

    public final void j0() {
        G(uaf0.f35325a);
        sac.V(jiu0.a(this), new qye0(1, this, ocf0.class, "handleRegistrationExceptions", "handleRegistrationExceptions(Ljava/lang/Throwable;)V", 0, (byte) 22), null, this.Z.f22085a, new zye0((Object) this, (yje) null, (byte) 10), 10);
    }

    public final void k0() {
        qbf0 qbf0Var = new qbf0(this, (byte) 0);
        i1w0 i1w0Var = this.b0;
        i1w0Var.f("PICKER_DIALOG_SHOWN_KEY", qbf0Var);
        i1w0Var.f("PICKER_DIALOG_ITEM_SELECTED_KEY", new qbf0(this, (byte) 1));
    }

    public final void l0(u0f0 u0f0Var, urp urpVar) {
        Object value;
        q7f0 q7f0Var = ((mbf0) D()).j;
        if (q7f0Var == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(((mbf0) D()).e);
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
        } while (!p7m0Var.m(value, mbf0.a((mbf0) value, false, false, null, null, linkedHashMap, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741807)));
    }

    @Override // a.diu0
    public final void v() {
        ((yse0) this.e0.b).b.f41413a.clear();
        ((gkc) this.f0.b).b.f9684a.clear();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [a.j910, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v152, types: [a.m7h0, org.xplatform.web_rules.impl.presentation.navigation.Screens$WebRulesScreen] */
    /* JADX WARN: Type inference failed for: r1v173, types: [a.m7h0, org.xplatform.web_rules.impl.presentation.navigation.Screens$WebRulesScreen] */
    /* JADX WARN: Type inference failed for: r1v194, types: [a.m7h0, org.xplatform.web_rules.impl.presentation.navigation.Screens$WebRulesScreen] */
    /* JADX WARN: Type inference failed for: r2v26, types: [a.m7h0, org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1] */
    /* JADX WARN: Type inference failed for: r2v36, types: [a.m7h0, org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1] */
    /* JADX WARN: Type inference failed for: r2v46, types: [a.m7h0, org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1] */
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
        Object next;
        Integer intOrNull;
        String str;
        boolean zD;
        String str2;
        String str3;
        s9f0 s9f0Var = (s9f0) obj;
        s9f0Var.getClass();
        boolean zEquals = s9f0Var.equals(s8f0.f31797a);
        i1w0 i1w0Var = this.b0;
        xte0 xte0Var = this.i0;
        boolean z = false;
        iIntValue = 0;
        int iIntValue = 0;
        final byte b = 1;
        ?? r10 = 0;
        Object obj2 = null;
        if (zEquals) {
            p1f0 p1f0Var = ((mbf0) D()).g;
            q7f0 q7f0Var = ((mbf0) D()).g.M;
            if (q7f0Var == null) {
                q7f0Var = q7f0.FULL;
            }
            xte0Var.j(q7f0Var);
            List list = ((mbf0) D()).d;
            ArrayList<q0f0> arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (!((q0f0) obj3).a()) {
                    arrayList.add(obj3);
                }
            }
            for (q0f0 q0f0Var : arrayList) {
                if (q0f0Var == null) {
                    zD = true;
                } else if (q0f0Var instanceof gze0) {
                    String str4 = ((mbf0) D()).g.f26199a;
                    if (str4 == null || str4.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof hze0) {
                    if (((mbf0) D()).g.b) {
                        zD = false;
                    } else {
                        zD = true;
                    }
                } else if (q0f0Var instanceof jze0) {
                    zD = Intrinsics.d(((mbf0) D()).v, ((mbf0) D()).g.c);
                } else if (q0f0Var instanceof kze0) {
                    zD = Intrinsics.d(((mbf0) D()).w, ((mbf0) D()).g.o);
                } else if (q0f0Var instanceof lze0) {
                    zD = Intrinsics.d(((mbf0) D()).x, ((mbf0) D()).g.d);
                } else if (q0f0Var instanceof mze0) {
                    if (((mbf0) D()).g.e) {
                        zD = false;
                    } else {
                        zD = true;
                    }
                } else if (q0f0Var instanceof nze0) {
                    zD = Intrinsics.d(((mbf0) D()).s, ((mbf0) D()).g.g);
                } else if (q0f0Var instanceof oze0) {
                    zD = Intrinsics.d(((mbf0) D()).u, ((mbf0) D()).g.h);
                } else if (q0f0Var instanceof pze0) {
                    if (((mbf0) D()).g.i == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof qze0) {
                    if (((mbf0) D()).g.j == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof rze0) {
                    String str5 = ((mbf0) D()).g.k;
                    if (str5 == null || str5.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof sze0) {
                    String str6 = ((mbf0) D()).g.l;
                    if (str6 == null || str6.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof tze0) {
                    if (((mbf0) D()).g.F == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof uze0) {
                    String str7 = ((mbf0) D()).g.m;
                    if (str7 == null || str7.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof wze0) {
                    String str8 = ((mbf0) D()).g.n;
                    if (str8 == null || str8.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof xze0) {
                    if (((mbf0) D()).g.f == ((mbf0) D()).B) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof yze0) {
                    if (((mbf0) D()).g.I == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof zze0) {
                    if (((mbf0) D()).g.J == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof a0f0) {
                    String str9 = ((mbf0) D()).g.p;
                    if (str9 == null || str9.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof b0f0) {
                    String str10 = ((mbf0) D()).g.q;
                    if (str10 == null || str10.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof c0f0) {
                    PhoneStateModel phoneStateModel = ((mbf0) D()).g.r;
                    String str11 = phoneStateModel != null ? phoneStateModel.f46866a : null;
                    if (str11 == null || str11.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof d0f0) {
                    if (((mbf0) D()).g.s == null) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof e0f0) {
                    String str12 = ((mbf0) D()).g.t;
                    if (str12 == null || str12.length() == 0) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                } else if (q0f0Var instanceof f0f0) {
                    zD = Intrinsics.d(((mbf0) D()).y, ((mbf0) D()).g.u);
                } else if (q0f0Var instanceof g0f0) {
                    zD = Intrinsics.d(((mbf0) D()).t, ((mbf0) D()).g.v);
                } else if (!(q0f0Var instanceof h0f0) ? !(!(q0f0Var instanceof i0f0) ? !(!(q0f0Var instanceof j0f0) ? !(!(q0f0Var instanceof k0f0) ? !(!(q0f0Var instanceof l0f0) ? !(!(q0f0Var instanceof m0f0) ? !(!(q0f0Var instanceof n0f0) ? !(!(q0f0Var instanceof o0f0) ? !(!(q0f0Var instanceof p0f0) || ((mbf0) D()).g.D == null) : ((mbf0) D()).g.C) : ((mbf0) D()).g.L) : ((mbf0) D()).g.B) : ((mbf0) D()).g.A) : !((str2 = ((mbf0) D()).g.z) == null || str2.length() == 0)) : ((mbf0) D()).g.y) : ((mbf0) D()).g.x) : !((str3 = ((mbf0) D()).g.w) == null || str3.length() == 0)) {
                    zD = true;
                } else {
                    zD = false;
                }
                if (!zD) {
                    G(xaf0.f40551a);
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
            boolean z2 = s9f0Var instanceof n8f0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            final ?? r15 = this.y0;
            if (z2) {
                int i = (int) ((n8f0) s9f0Var).f23084a;
                q7f0.b.getClass();
                q7f0 q7f0VarC = gne0.c(i);
                r15.getClass();
                ((pbf0) r15.c).invoke(new xwe0(q7f0VarC, r15, (byte) 27));
                p7m0 p7m0Var = ocjVar.f25029a;
                while (true) {
                    Object value = p7m0Var.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                    q7f0 q7f0Var2 = q7f0VarC;
                    if (p7m0Var.m(value, mbf0.a((mbf0) value, false, false, null, null, null, null, null, null, null, q7f0Var2, null, null, null, false, null, null, null, null, null, null, null, null, 1073740799))) {
                        p7m0 p7m0Var2 = this.x0;
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, q7f0Var2);
                        return;
                    }
                    q7f0VarC = q7f0Var2;
                }
            } else {
                if (s9f0Var instanceof m8f0) {
                    m8f0 m8f0Var = (m8f0) s9f0Var;
                    u0f0 u0f0Var = m8f0Var.f21367a;
                    File file = m8f0Var.b;
                    int iOrdinal = u0f0Var.ordinal();
                    bzs0 bzs0Var = this.q;
                    yox yoxVar = this.p;
                    switch (iOrdinal) {
                        case 33:
                            String str13 = ((mbf0) D()).m.m.t;
                            boolean z3 = ((mbf0) D()).m.p0;
                            xte0Var.i();
                            if (StringsKt.O(str13, "https://", false) && z3) {
                                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                                yoxVar.getClass();
                                ?? paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str13);
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
                                G(new waf0(str13));
                            } else if (str13.length() <= 0) {
                                h0(file, dxk.FULL_DOC_RULES);
                            } else {
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                bzs0Var.getClass();
                                ?? D = bzs0.d(R.string.rules_title, str13);
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
                            String str14 = ((mbf0) D()).m.m.y;
                            boolean z4 = ((mbf0) D()).m.p0;
                            if (StringsKt.O(str14, "https://", false) && z4) {
                                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                                yoxVar.getClass();
                                ?? paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$2 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str14);
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
                                G(new waf0(str14));
                            } else if (str14.length() <= 0) {
                                h0(file, dxk.PRIVACY_POLICY_DOC_RULES);
                            } else {
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                                bzs0Var.getClass();
                                ?? D2 = bzs0.d(R.string.info_privacy_policy, str14);
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
                            String str15 = ((mbf0) D()).m.m.u;
                            boolean z5 = ((mbf0) D()).m.p0;
                            if (StringsKt.O(str15, "https://", false) && z5) {
                                CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                                yoxVar.getClass();
                                ?? paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$3 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str15);
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
                                G(new waf0(str15));
                            } else if (str15.length() <= 0) {
                                h0(file, dxk.RESPONSIBLE_GAMING_DOC_RULES);
                            } else {
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                                bzs0Var.getClass();
                                ?? D3 = bzs0.d(R.string.responsible_game, str15);
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
                if (s9f0Var instanceof w8f0) {
                    u0f0 u0f0Var2 = ((w8f0) s9f0Var).f38719a;
                    r15.getClass();
                    ((pbf0) r15.c).invoke(new xwe0(r15, u0f0Var2, (byte) 24));
                    return;
                }
                byte b2 = 14;
                byte b3 = 8;
                if (s9f0Var instanceof p9f0) {
                    p9f0 p9f0Var = (p9f0) s9f0Var;
                    u0f0 u0f0Var3 = p9f0Var.f26603a;
                    ?? r0 = p9f0Var.b;
                    r15.C(u0f0Var3, r0);
                    if (u0f0Var3 == u0f0.l) {
                        bby bbyVar = this.v0;
                        if (bbyVar != null) {
                            bbyVar.cancel(null);
                        }
                        this.v0 = sac.V(jiu0.a(this), new bue0(b2), null, null, new kpb0((Object) r0, this, (yje) r10, b3), 14);
                    }
                    u0f0 u0f0Var4 = u0f0.n;
                    if (u0f0Var3 != u0f0Var4 || (str = ((mbf0) D()).g.q) == null || str.length() == 0) {
                        return;
                    }
                    l0(u0f0Var4, r0.equals(str) ? jrp.f17014a : orp.f25745a);
                    return;
                }
                boolean z6 = s9f0Var instanceof q9f0;
                byte b4 = 2;
                byte b5 = 4;
                byte b6 = 3;
                byte b7 = 17;
                mne mneVar = this.Z;
                if (z6) {
                    int iOrdinal2 = ((q9f0) s9f0Var).f28344a.f17928a.ordinal();
                    byte b8 = 9;
                    if (iOrdinal2 == 3) {
                        sac.V(jiu0.a(this), new qye0(1, this, ocf0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, mneVar.b, new kpb0(this, r10, b8), 10);
                        return;
                    }
                    if (iOrdinal2 == 4) {
                        sac.V(jiu0.a(this), new qye0(1, this, ocf0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, mneVar.b, new xbf0(this, r10, b4), 10);
                        return;
                    }
                    if (iOrdinal2 == 5) {
                        sac.V(jiu0.a(this), new qye0(1, this, ocf0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, mneVar.b, new xbf0(this, r10, z ? (byte) 1 : (byte) 0), 10);
                        return;
                    }
                    if (iOrdinal2 == 6) {
                        Calendar calendar = Calendar.getInstance();
                        Iterator it = ((mbf0) D()).d.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!(((q0f0) next) instanceof pze0));
                        pze0 pze0Var = next instanceof pze0 ? (pze0) next : null;
                        if (pze0Var != null && (intOrNull = StringsKt.toIntOrNull(pze0Var.e)) != null) {
                            iIntValue = intOrNull.intValue();
                        }
                        calendar.add(1, -iIntValue);
                        calendar.add(5, -1);
                        long timeInMillis = calendar.getTimeInMillis();
                        Long l = ((mbf0) D()).g.i;
                        long jLongValue = l != null ? l.longValue() : timeInMillis;
                        if (jLongValue > timeInMillis) {
                            jLongValue = timeInMillis;
                        }
                        G(new vaf0(M(this, jLongValue, null, Long.valueOf(timeInMillis), 2)));
                        return;
                    }
                    if (iOrdinal2 == 8) {
                        sac.V(jiu0.a(this), new qye0(1, this, ocf0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, mneVar.b, new xbf0(this, r10, b), 10);
                        return;
                    }
                    if (iOrdinal2 == 9) {
                        G(bbf0.f2306a);
                        return;
                    }
                    if (iOrdinal2 == 14) {
                        sac.V(jiu0.a(this), new qye0(1, this, ocf0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, mneVar.b, new zye0((Object) this, (yje) r10, (byte) 7), 10);
                        return;
                    }
                    if (iOrdinal2 == 15) {
                        sac.V(jiu0.a(this), new qye0(1, this, ocf0.class, "handlePickerLoadDataError", "handlePickerLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, mneVar.b, new gc1(this, (yje) r10, b7), 10);
                        return;
                    }
                    if (iOrdinal2 != 36) {
                        if (iOrdinal2 != 37) {
                            return;
                        }
                        Calendar calendar2 = Calendar.getInstance();
                        Long l2 = ((mbf0) D()).g.I;
                        long jLongValue2 = l2 != null ? l2.longValue() : calendar2.getTimeInMillis();
                        if (jLongValue2 <= calendar2.getTimeInMillis()) {
                            jLongValue2 = calendar2.getTimeInMillis();
                        }
                        G(new yaf0(M(this, jLongValue2, Long.valueOf(calendar2.getTimeInMillis()), null, 4)));
                        return;
                    }
                    if (((mbf0) D()).g.j != null) {
                        long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                        Long l3 = ((mbf0) D()).g.J;
                        long jLongValue3 = l3 != null ? l3.longValue() : timeInMillis2;
                        if (jLongValue3 > timeInMillis2) {
                            jLongValue3 = timeInMillis2;
                        }
                        G(new zaf0(M(this, jLongValue3, null, Long.valueOf(timeInMillis2), 2)));
                        return;
                    }
                    return;
                }
                if (s9f0Var instanceof a9f0) {
                    ggt ggtVar = ((a9f0) s9f0Var).f473a;
                    r15.getClass();
                    ((pbf0) r15.c).invoke(new xwe0(ggtVar, r15, (byte) 20));
                    return;
                }
                if (s9f0Var instanceof j9f0) {
                    ((pbf0) r15.c).invoke(new caf0(((j9f0) s9f0Var).f16135a == vpa0.YES, r15, b));
                    return;
                }
                if (s9f0Var instanceof o9f0) {
                    ((pbf0) r15.c).invoke(new z08(((o9f0) s9f0Var).f24877a, (Object) r15, b7));
                    return;
                }
                if (s9f0Var instanceof t8f0) {
                    final SimpleDate simpleDate = ((t8f0) s9f0Var).f33509a;
                    r15.getClass();
                    pbf0 pbf0Var = (pbf0) r15.c;
                    final byte b9 = z ? (byte) 1 : (byte) 0;
                    pbf0Var.invoke(new Function1() { // from class: a.aaf0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            byte b10 = b9;
                            j910 j910Var = r15;
                            SimpleDate simpleDate2 = simpleDate;
                            switch (b10) {
                                case 0:
                                    mbf0 mbf0Var = (mbf0) obj4;
                                    mbf0Var.getClass();
                                    p1f0 p1f0Var2 = mbf0Var.g;
                                    Calendar calendar3 = Calendar.getInstance();
                                    calendar3.getClass();
                                    wdx.J(simpleDate2, calendar3);
                                    p1f0 p1f0VarA = p1f0.a(p1f0Var2, null, false, null, null, false, false, null, null, Long.valueOf(calendar3.getTimeInMillis()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -257, 127);
                                    List listC = kotlin.collections.a.c(u0f0.g);
                                    j910Var.getClass();
                                    Map mapE = j910.e(mbf0Var, listC);
                                    ((vzg0) j910Var.b).e("DATE", p1f0VarA.i);
                                    return new Pair(p1f0VarA, mapE);
                                default:
                                    mbf0 mbf0Var2 = (mbf0) obj4;
                                    mbf0Var2.getClass();
                                    p1f0 p1f0Var3 = mbf0Var2.g;
                                    Calendar calendar4 = Calendar.getInstance();
                                    calendar4.getClass();
                                    wdx.J(simpleDate2, calendar4);
                                    p1f0 p1f0VarA2 = p1f0.a(p1f0Var3, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, Long.valueOf(calendar4.getTimeInMillis()), null, false, false, null, -1, 123);
                                    List listC2 = kotlin.collections.a.c(u0f0.m1);
                                    j910Var.getClass();
                                    Map mapE2 = j910.e(mbf0Var2, listC2);
                                    ((vzg0) j910Var.b).e("PASSPORT_DATE_EXPIRE", p1f0VarA2.I);
                                    return new Pair(p1f0VarA2, mapE2);
                            }
                        }
                    });
                    return;
                }
                if (s9f0Var instanceof x8f0) {
                    this.N.a(((x8f0) s9f0Var).f40459a);
                    return;
                }
                if (s9f0Var instanceof g9f0) {
                    final SimpleDate simpleDate2 = ((g9f0) s9f0Var).f10912a;
                    r15.getClass();
                    ((pbf0) r15.c).invoke(new Function1() { // from class: a.aaf0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            byte b10 = b;
                            j910 j910Var = r15;
                            SimpleDate simpleDate3 = simpleDate2;
                            switch (b10) {
                                case 0:
                                    mbf0 mbf0Var = (mbf0) obj4;
                                    mbf0Var.getClass();
                                    p1f0 p1f0Var2 = mbf0Var.g;
                                    Calendar calendar3 = Calendar.getInstance();
                                    calendar3.getClass();
                                    wdx.J(simpleDate3, calendar3);
                                    p1f0 p1f0VarA = p1f0.a(p1f0Var2, null, false, null, null, false, false, null, null, Long.valueOf(calendar3.getTimeInMillis()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -257, 127);
                                    List listC = kotlin.collections.a.c(u0f0.g);
                                    j910Var.getClass();
                                    Map mapE = j910.e(mbf0Var, listC);
                                    ((vzg0) j910Var.b).e("DATE", p1f0VarA.i);
                                    return new Pair(p1f0VarA, mapE);
                                default:
                                    mbf0 mbf0Var2 = (mbf0) obj4;
                                    mbf0Var2.getClass();
                                    p1f0 p1f0Var3 = mbf0Var2.g;
                                    Calendar calendar4 = Calendar.getInstance();
                                    calendar4.getClass();
                                    wdx.J(simpleDate3, calendar4);
                                    p1f0 p1f0VarA2 = p1f0.a(p1f0Var3, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, Long.valueOf(calendar4.getTimeInMillis()), null, false, false, null, -1, 123);
                                    List listC2 = kotlin.collections.a.c(u0f0.m1);
                                    j910Var.getClass();
                                    Map mapE2 = j910.e(mbf0Var2, listC2);
                                    ((vzg0) j910Var.b).e("PASSPORT_DATE_EXPIRE", p1f0VarA2.I);
                                    return new Pair(p1f0VarA2, mapE2);
                            }
                        }
                    });
                    return;
                }
                if (s9f0Var instanceof m9f0) {
                    ghk0 ghk0Var = ((m9f0) s9f0Var).f21408a;
                    String str16 = ghk0Var.f11305a == 13 ? ((mbf0) D()).r.m : this.d0.f11725a.f15748a.o() ? ((mbf0) D()).r.l : ((mbf0) D()).r.k;
                    int i2 = ghk0Var.f11305a;
                    SocialStateModel socialStateModel = new SocialStateModel(i2, ghk0Var.d, i2, ghk0Var.c, str16, ghk0Var.e, ghk0Var.f, ghk0Var.g, ghk0Var.h, ghk0Var.b);
                    r15.getClass();
                    ((pbf0) r15.c).invoke(new xwe0(socialStateModel, r15, (byte) 21));
                    if (ghk0Var.f11305a == 17) {
                        this.p0.f(hfi0.TELEGRAM);
                    }
                    j0();
                    return;
                }
                if (s9f0Var instanceof y8f0) {
                    int i3 = ((y8f0) s9f0Var).f42192a;
                    for (Object obj4 : ((mbf0) D()).o) {
                        if (((BonusInfoModel) obj4).f46848a == i3) {
                            obj2 = obj4;
                            break;
                        }
                    }
                    BonusInfoModel bonusInfoModel = (BonusInfoModel) obj2;
                    if (bonusInfoModel == null) {
                        return;
                    }
                    String str17 = bonusInfoModel.b;
                    String str18 = bonusInfoModel.c;
                    r15.getClass();
                    str17.getClass();
                    str18.getClass();
                    ((pbf0) r15.c).invoke(new baf0(i3, str17, str18, r15, (byte) 1));
                    return;
                }
                if (s9f0Var instanceof q8f0) {
                    q8f0 q8f0Var = (q8f0) s9f0Var;
                    sac.V(jiu0.a(this), kcf0.f18056a, null, mneVar.f22085a, new a48(this, q8f0Var.f28296a, q8f0Var.b, r10, (byte) 5), 10);
                    return;
                }
                if (s9f0Var instanceof o8f0) {
                    sac.V(jiu0.a(this), new pbf0(this, b4), null, mneVar.f22085a, new defpackage.e(this, ((o8f0) s9f0Var).f24827a, r10, b3), 10);
                    return;
                }
                if (s9f0Var instanceof b9f0) {
                    u0f0 u0f0Var5 = ((b9f0) s9f0Var).f2206a;
                    Set setKeySet = ((mbf0) D()).i.keySet();
                    int iA = wp20.a(r3d.q(setKeySet, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                    for (Object obj5 : setKeySet) {
                        linkedHashMap.put(obj5, Boolean.FALSE);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    linkedHashMap2.put(u0f0Var5, Boolean.FALSE);
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    while (true) {
                        Object value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                        if (p7m0Var3.m(value2, mbf0.a((mbf0) value2, false, false, null, null, null, null, null, null, linkedHashMap3, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741567))) {
                            G(uaf0.f35325a);
                            return;
                        }
                        linkedHashMap2 = linkedHashMap3;
                    }
                } else if (s9f0Var instanceof d9f0) {
                    u0f0 u0f0Var6 = ((d9f0) s9f0Var).f5698a;
                    Set setKeySet2 = ((mbf0) D()).i.keySet();
                    int iA2 = wp20.a(r3d.q(setKeySet2, 10));
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                    for (Object obj6 : setKeySet2) {
                        linkedHashMap4.put(obj6, Boolean.FALSE);
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(linkedHashMap4);
                    List listL0 = CollectionsKt.L0(((mbf0) D()).h.keySet());
                    for (Object obj7 : CollectionsKt.O(listL0, listL0.indexOf(u0f0Var6) + 1)) {
                        if (((u0f0) obj7) != u0f0.h || ((mbf0) D()).g.r != null) {
                            r10 = obj7;
                            break;
                        }
                    }
                    u0f0 u0f0Var7 = (u0f0) r10;
                    if (u0f0Var7 != null) {
                        linkedHashMap5.put(u0f0Var7, Boolean.TRUE);
                    }
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    while (true) {
                        Object value3 = p7m0Var4.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                        LinkedHashMap linkedHashMap6 = linkedHashMap5;
                        if (p7m0Var4.m(value3, mbf0.a((mbf0) value3, false, false, null, null, null, null, null, null, linkedHashMap6, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741567))) {
                            return;
                        } else {
                            linkedHashMap5 = linkedHashMap6;
                        }
                    }
                } else {
                    if (!s9f0Var.equals(c9f0.f3959a)) {
                        if (s9f0Var.equals(h9f0.f12673a)) {
                            ((pbf0) r15.c).invoke(new z9f0(r15, b5));
                            return;
                        }
                        if (s9f0Var.equals(n9f0.f23136a)) {
                            ((pbf0) r15.c).invoke(new z9f0(r15, b6));
                            return;
                        }
                        if (s9f0Var.equals(k9f0.f17913a)) {
                            G(hbf0.f12767a);
                            return;
                        }
                        if (Intrinsics.d(s9f0Var, l9f0.f19649a)) {
                            j0();
                            return;
                        }
                        if (Intrinsics.d(s9f0Var, k8f0.f17870a)) {
                            E();
                            return;
                        }
                        if (Intrinsics.d(s9f0Var, v8f0.f36979a)) {
                            c0();
                            return;
                        }
                        if (Intrinsics.d(s9f0Var, p8f0.f26551a)) {
                            a0();
                            return;
                        }
                        if (Intrinsics.d(s9f0Var, r8f0.f30022a)) {
                            b0();
                            return;
                        }
                        if (Intrinsics.d(s9f0Var, z8f0.f43963a)) {
                            d0();
                            return;
                        }
                        if (Intrinsics.d(s9f0Var, r9f0.f30078a)) {
                            g0();
                            return;
                        }
                        if (Intrinsics.d(s9f0Var, u8f0.f35229a)) {
                            Q();
                            return;
                        }
                        if (Intrinsics.d(s9f0Var, i9f0.f14382a)) {
                            e0();
                            return;
                        }
                        if (Intrinsics.d(s9f0Var, l8f0.f19601a)) {
                            f0();
                            return;
                        }
                        if (Intrinsics.d(s9f0Var, e9f0.f7418a)) {
                            Z(false);
                            return;
                        } else if (Intrinsics.d(s9f0Var, f9f0.f9151a)) {
                            Z(true);
                            return;
                        } else {
                            t9f.b();
                            return;
                        }
                    }
                    Set setKeySet3 = ((mbf0) D()).i.keySet();
                    int iA3 = wp20.a(r3d.q(setKeySet3, 10));
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap(iA3 >= 16 ? iA3 : 16);
                    for (Object obj8 : setKeySet3) {
                        linkedHashMap7.put(obj8, Boolean.FALSE);
                    }
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap(linkedHashMap7);
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    while (true) {
                        Object value4 = p7m0Var5.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                        LinkedHashMap linkedHashMap9 = linkedHashMap8;
                        if (p7m0Var5.m(value4, mbf0.a((mbf0) value4, false, false, null, null, null, null, null, null, linkedHashMap9, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741567))) {
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
