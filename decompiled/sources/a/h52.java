package a;

import android.gov.nist.core.LexerCore;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;
import org.xplatform.ui_core.calendar.model.DateRangeCalendarBottomSheetParams;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes3.dex */
public final class h52 extends i3t0 {
    public final HistoryTypeModel o;
    public final f8w p;
    public final uyn q;
    public final o470 r;
    public final ugf0 s;
    public final pru t;
    public final ctf0 u;
    public final f4u v;
    public final epi0 w;
    public final hnu x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h52(HistoryTypeModel historyTypeModel, f8w f8wVar, uyn uynVar, o470 o470Var, ugf0 ugf0Var, pru pruVar, ctf0 ctf0Var, f4u f4uVar, epi0 epi0Var, r9u r9uVar, hnu hnuVar, mne mneVar) {
        super(null, new pg1((Object) pruVar, (Object) hnuVar, (Object) historyTypeModel, (Object) f8wVar, (Object) uynVar, (Object) f4uVar, (Object) r9uVar, (byte) 3), new df1(ctf0Var, f8wVar, (byte) 11), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        r9uVar.getClass();
        this.o = historyTypeModel;
        this.p = f8wVar;
        this.q = uynVar;
        this.r = o470Var;
        this.s = ugf0Var;
        this.t = pruVar;
        this.u = ctf0Var;
        this.v = f4uVar;
        this.w = epi0Var;
        this.x = hnuVar;
    }

    public final void M(s3q s3qVar) {
        int iOrdinal = s3qVar.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            List list = ((c52) D()).b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((h0w) it.next()).b && (i = i + 1) < 0) {
                        q3d.o();
                        throw null;
                    }
                }
            }
            if (i == ((c52) D()).f3750a.size()) {
                return;
            }
            H(new xg1((byte) 22));
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        List list2 = ((c52) D()).d;
        if (!list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((un7) it2.next()).b && (i = i + 1) < 0) {
                    q3d.o();
                    throw null;
                }
            }
        }
        if (i == ((c52) D()).c.size()) {
            return;
        }
        H(new xg1((byte) 23));
    }

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
        Object value;
        Object next2;
        int i;
        Object next3;
        int i2;
        Object value2;
        Object value3;
        Object value4;
        c52 c52Var;
        o42 o42Var = (o42) obj;
        o42Var.getClass();
        super.x(o42Var);
        if (o42Var.equals(k42.f17647a)) {
            E();
            return;
        }
        boolean z = true;
        z = true;
        z = true;
        final byte b = 0;
        if (o42Var.equals(g42.f10641a)) {
            gm7 gm7Var = this.t.a().f32117a.f12063a;
            if (!gm7Var.m && !gm7Var.n && !gm7Var.q) {
                z = false;
            }
            hnu hnuVar = this.x;
            HistoryTypeModel historyTypeModel = this.o;
            f8w f8wVar = this.p;
            List listH = hnuVar.h(historyTypeModel, f8wVar, z);
            List listK = this.q.k(historyTypeModel);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listK) {
                un7 un7Var = (un7) obj2;
                if (gm7Var.s || un7Var.f35947a != q4f.l) {
                    arrayList.add(obj2);
                }
            }
            if (Intrinsics.d(((xdj) ((prc) this.v.b).b).f40695a, ((c52) D()).e) && arrayList.equals(((c52) D()).d) && listH.equals(((c52) D()).b)) {
                G(w42.f38524a);
                return;
            }
            wdj wdjVar = ((c52) D()).e;
            epi0 epi0Var = this.w;
            epi0Var.getClass();
            wdjVar.getClass();
            xdj xdjVar = (xdj) ((prc) epi0Var.b).b;
            xdjVar.getClass();
            xdjVar.f40695a = wdjVar;
            this.r.h(((c52) D()).d);
            this.s.f0(((c52) D()).b, historyTypeModel, f8wVar);
            G(v42.f36758a);
            return;
        }
        boolean zEquals = o42Var.equals(n42.f22878a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                c52Var = (c52) value4;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, c52.a(c52Var, c52Var.f3750a, c52Var.c, c52Var.f, 4069)));
            return;
        }
        if (o42Var.equals(m42.f21145a)) {
            Parcelable.Creator<HistoryDateFilterTypeModel> creator = HistoryDateFilterTypeModel.CREATOR;
            G(new x42());
            return;
        }
        if (o42Var instanceof l42) {
            l42 l42Var = (l42) o42Var;
            long j = l42Var.f19383a;
            long j2 = l42Var.b;
            if (j2 == 0) {
                G(new z42(j, ((c52) D()).k));
                return;
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, c52.a((c52) value3, null, null, new vdj(j, j2), 4079)));
            return;
        }
        if (o42Var instanceof j42) {
            SimpleDate simpleDate = ((j42) o42Var).f15863a;
            Calendar calendar = Calendar.getInstance();
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
                calendar.getClass();
                wdx.J(simpleDate, calendar);
            } while (!p7m0Var3.m(value2, c52.a((c52) value2, null, null, new tdj(calendar.getTimeInMillis() / 1000), 4079)));
            return;
        }
        if (o42Var instanceof i42) {
            DateRangeModel dateRangeModel = ((i42) o42Var).f14124a;
            SimpleDate simpleDate2 = dateRangeModel.f47284a;
            SimpleDate simpleDate3 = dateRangeModel.b;
            if (simpleDate2 == null && simpleDate3 == null) {
                return;
            }
            H(new g52(simpleDate2, Calendar.getInstance(), simpleDate3, b));
            return;
        }
        if (!(o42Var instanceof h42)) {
            t9f.b();
            return;
        }
        h42 h42Var = (h42) o42Var;
        long j3 = h42Var.b;
        int iOrdinal = h42Var.f12412a.ordinal();
        final byte b2 = 2;
        if (iOrdinal == 0) {
            int i3 = (int) j3;
            Iterator it = j3q.c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((j3q) next).f15849a != i3);
            j3q j3qVar = (j3q) next;
            if (j3qVar == null) {
                return;
            }
            int iOrdinal2 = j3qVar.ordinal();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ctf0 ctf0Var = this.u;
            if (iOrdinal2 == 2) {
                Calendar calendar2 = Calendar.getInstance();
                SimpleDate simpleDateG0 = bsr0.g0(calendar2.getTimeInMillis(), calendar2);
                calendar2.add(5, -(((c52) D()).k - 1));
                SimpleDate simpleDateG1 = bsr0.g0(calendar2.getTimeInMillis(), calendar2);
                String strA = ctf0Var.b.a(R.string.calendar_date_module_select_date, Arrays.copyOf(new Object[0], 0));
                wdj wdjVar2 = ((c52) D()).e;
                tdj tdjVar = wdjVar2 instanceof tdj ? (tdj) wdjVar2 : null;
                G(new a52(new DateCalendarBottomSheetParams(strA, simpleDateG1, simpleDateG0, tdjVar != null ? bsr0.g0(timeUnit.toMillis(tdjVar.f33771a), calendar2) : null)));
                return;
            }
            if (iOrdinal2 == 3) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value, c52.a((c52) value, null, null, udj.f35481a, 4079)));
                return;
            }
            if (iOrdinal2 != 4) {
                return;
            }
            if (!((c52) D()).j) {
                G(new z42(0L, ((c52) D()).k));
                return;
            }
            Calendar calendar3 = Calendar.getInstance();
            SimpleDate simpleDateG2 = bsr0.g0(calendar3.getTimeInMillis(), calendar3);
            calendar3.add(5, -(((c52) D()).k - 1));
            SimpleDate simpleDateG3 = bsr0.g0(calendar3.getTimeInMillis(), calendar3);
            wdj wdjVar3 = ((c52) D()).e;
            vdj vdjVar = wdjVar3 instanceof vdj ? (vdj) wdjVar3 : null;
            lsm0 lsm0Var = ctf0Var.b;
            lsm0 lsm0Var2 = ctf0Var.b;
            G(new y42(new DateRangeCalendarBottomSheetParams(lsm0Var.a(R.string.calendar_date_module_select_period, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.start_date_period, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.end_date_period, Arrays.copyOf(new Object[0], 0)), simpleDateG3, simpleDateG2, null, ((c52) D()).k, vdjVar != null ? new DateRangeModel(bsr0.g0(timeUnit.toMillis(vdjVar.f37235a), calendar3), bsr0.g0(timeUnit.toMillis(vdjVar.b), calendar3)) : null)));
            return;
        }
        if (iOrdinal == 1) {
            int i4 = (int) j3;
            j3q[] j3qVarArr = j3q.b;
            if (i4 == -100) {
                M(s3q.b);
                return;
            }
            Iterator it2 = ((c52) D()).b.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (xnm0.k((h0w) next2) != i4);
            final h0w h0wVar = (h0w) next2;
            if (h0wVar == null) {
                return;
            }
            List list = ((c52) D()).b;
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it3 = list.iterator();
                i = 0;
                while (it3.hasNext()) {
                    if (((h0w) it3.next()).b && (i = i + 1) < 0) {
                        q3d.o();
                        throw null;
                    }
                }
            }
            if (i == ((c52) D()).f3750a.size()) {
                H(new Function2() { // from class: a.f52
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b3 = b;
                        h0w h0wVar2 = h0wVar;
                        oyg0 oyg0Var2 = (oyg0) obj3;
                        c52 c52Var2 = (c52) obj4;
                        switch (b3) {
                            case 0:
                                oyg0Var2.getClass();
                                c52Var2.getClass();
                                List<h0w> list2 = c52Var2.b;
                                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                                for (h0w h0wVar3 : list2) {
                                    arrayList2.add(h0w.a(h0wVar3, Intrinsics.d(h0wVar3.f12253a, h0wVar2.f12253a)));
                                }
                                return c52.a(c52Var2, arrayList2, null, null, LexerCore.ID_NO_WHITESPACE);
                            case 1:
                                oyg0Var2.getClass();
                                c52Var2.getClass();
                                List<h0w> list3 = c52Var2.b;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                                for (h0w h0wVarA : list3) {
                                    if (Intrinsics.d(h0wVarA.f12253a, h0wVar2.f12253a)) {
                                        h0wVarA = h0w.a(h0wVarA, false);
                                    }
                                    arrayList3.add(h0wVarA);
                                }
                                return c52.a(c52Var2, arrayList3, null, null, LexerCore.ID_NO_WHITESPACE);
                            default:
                                oyg0Var2.getClass();
                                c52Var2.getClass();
                                List<h0w> list4 = c52Var2.b;
                                ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                                for (h0w h0wVarA2 : list4) {
                                    if (Intrinsics.d(h0wVarA2.f12253a, h0wVar2.f12253a)) {
                                        h0wVarA2 = h0w.a(h0wVarA2, true);
                                    }
                                    arrayList4.add(h0wVarA2);
                                }
                                return c52.a(c52Var2, arrayList4, null, null, LexerCore.ID_NO_WHITESPACE);
                        }
                    }
                });
                return;
            }
            boolean z2 = h0wVar.b;
            if (z2 && i > 1) {
                final byte b3 = z ? (byte) 1 : (byte) 0;
                H(new Function2() { // from class: a.f52
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b4 = b3;
                        h0w h0wVar2 = h0wVar;
                        oyg0 oyg0Var2 = (oyg0) obj3;
                        c52 c52Var2 = (c52) obj4;
                        switch (b4) {
                            case 0:
                                oyg0Var2.getClass();
                                c52Var2.getClass();
                                List<h0w> list2 = c52Var2.b;
                                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                                for (h0w h0wVar3 : list2) {
                                    arrayList2.add(h0w.a(h0wVar3, Intrinsics.d(h0wVar3.f12253a, h0wVar2.f12253a)));
                                }
                                return c52.a(c52Var2, arrayList2, null, null, LexerCore.ID_NO_WHITESPACE);
                            case 1:
                                oyg0Var2.getClass();
                                c52Var2.getClass();
                                List<h0w> list3 = c52Var2.b;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                                for (h0w h0wVarA : list3) {
                                    if (Intrinsics.d(h0wVarA.f12253a, h0wVar2.f12253a)) {
                                        h0wVarA = h0w.a(h0wVarA, false);
                                    }
                                    arrayList3.add(h0wVarA);
                                }
                                return c52.a(c52Var2, arrayList3, null, null, LexerCore.ID_NO_WHITESPACE);
                            default:
                                oyg0Var2.getClass();
                                c52Var2.getClass();
                                List<h0w> list4 = c52Var2.b;
                                ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                                for (h0w h0wVarA2 : list4) {
                                    if (Intrinsics.d(h0wVarA2.f12253a, h0wVar2.f12253a)) {
                                        h0wVarA2 = h0w.a(h0wVarA2, true);
                                    }
                                    arrayList4.add(h0wVarA2);
                                }
                                return c52.a(c52Var2, arrayList4, null, null, LexerCore.ID_NO_WHITESPACE);
                        }
                    }
                });
                return;
            } else if (!z2) {
                H(new Function2() { // from class: a.f52
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b4 = b2;
                        h0w h0wVar2 = h0wVar;
                        oyg0 oyg0Var2 = (oyg0) obj3;
                        c52 c52Var2 = (c52) obj4;
                        switch (b4) {
                            case 0:
                                oyg0Var2.getClass();
                                c52Var2.getClass();
                                List<h0w> list2 = c52Var2.b;
                                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                                for (h0w h0wVar3 : list2) {
                                    arrayList2.add(h0w.a(h0wVar3, Intrinsics.d(h0wVar3.f12253a, h0wVar2.f12253a)));
                                }
                                return c52.a(c52Var2, arrayList2, null, null, LexerCore.ID_NO_WHITESPACE);
                            case 1:
                                oyg0Var2.getClass();
                                c52Var2.getClass();
                                List<h0w> list3 = c52Var2.b;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                                for (h0w h0wVarA : list3) {
                                    if (Intrinsics.d(h0wVarA.f12253a, h0wVar2.f12253a)) {
                                        h0wVarA = h0w.a(h0wVarA, false);
                                    }
                                    arrayList3.add(h0wVarA);
                                }
                                return c52.a(c52Var2, arrayList3, null, null, LexerCore.ID_NO_WHITESPACE);
                            default:
                                oyg0Var2.getClass();
                                c52Var2.getClass();
                                List<h0w> list4 = c52Var2.b;
                                ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                                for (h0w h0wVarA2 : list4) {
                                    if (Intrinsics.d(h0wVarA2.f12253a, h0wVar2.f12253a)) {
                                        h0wVarA2 = h0w.a(h0wVarA2, true);
                                    }
                                    arrayList4.add(h0wVarA2);
                                }
                                return c52.a(c52Var2, arrayList4, null, null, LexerCore.ID_NO_WHITESPACE);
                        }
                    }
                });
                return;
            } else {
                if (z2 && i == 1) {
                    H(new xg1((byte) 24));
                    return;
                }
                return;
            }
        }
        if (iOrdinal != 2) {
            t9f.b();
            return;
        }
        int i5 = (int) j3;
        j3q[] j3qVarArr2 = j3q.b;
        if (i5 == -200) {
            M(s3q.c);
            return;
        }
        Iterator it4 = ((c52) D()).d.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (((un7) next3).f35947a.a() != i5);
        final un7 un7Var2 = (un7) next3;
        if (un7Var2 == null) {
            return;
        }
        List list2 = ((c52) D()).d;
        if (list2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it5 = list2.iterator();
            i2 = 0;
            while (it5.hasNext()) {
                if (((un7) it5.next()).b && (i2 = i2 + 1) < 0) {
                    q3d.o();
                    throw null;
                }
            }
        }
        if (i2 == ((c52) D()).c.size()) {
            final byte b4 = z ? (byte) 1 : (byte) 0;
            H(new Function2() { // from class: a.e52
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    byte b5 = b4;
                    un7 un7Var3 = un7Var2;
                    oyg0 oyg0Var2 = (oyg0) obj3;
                    c52 c52Var2 = (c52) obj4;
                    switch (b5) {
                        case 0:
                            oyg0Var2.getClass();
                            c52Var2.getClass();
                            List<un7> list3 = c52Var2.d;
                            ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                            for (un7 un7VarA : list3) {
                                if (un7VarA.f35947a == un7Var3.f35947a) {
                                    un7VarA = un7.a(un7VarA, true);
                                }
                                arrayList2.add(un7VarA);
                            }
                            return c52.a(c52Var2, null, arrayList2, null, 4087);
                        case 1:
                            oyg0Var2.getClass();
                            c52Var2.getClass();
                            List<un7> list4 = c52Var2.d;
                            ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
                            for (un7 un7Var4 : list4) {
                                arrayList3.add(un7.a(un7Var4, un7Var4.f35947a == un7Var3.f35947a));
                            }
                            return c52.a(c52Var2, null, arrayList3, null, 4087);
                        default:
                            oyg0Var2.getClass();
                            c52Var2.getClass();
                            List<un7> list5 = c52Var2.d;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list5, 10));
                            for (un7 un7VarA2 : list5) {
                                if (un7VarA2.f35947a == un7Var3.f35947a) {
                                    un7VarA2 = un7.a(un7VarA2, false);
                                }
                                arrayList4.add(un7VarA2);
                            }
                            return c52.a(c52Var2, null, arrayList4, null, 4087);
                    }
                }
            });
            return;
        }
        boolean z3 = un7Var2.b;
        if (z3 && i2 > 1) {
            H(new Function2() { // from class: a.e52
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    byte b5 = b2;
                    un7 un7Var3 = un7Var2;
                    oyg0 oyg0Var2 = (oyg0) obj3;
                    c52 c52Var2 = (c52) obj4;
                    switch (b5) {
                        case 0:
                            oyg0Var2.getClass();
                            c52Var2.getClass();
                            List<un7> list3 = c52Var2.d;
                            ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                            for (un7 un7VarA : list3) {
                                if (un7VarA.f35947a == un7Var3.f35947a) {
                                    un7VarA = un7.a(un7VarA, true);
                                }
                                arrayList2.add(un7VarA);
                            }
                            return c52.a(c52Var2, null, arrayList2, null, 4087);
                        case 1:
                            oyg0Var2.getClass();
                            c52Var2.getClass();
                            List<un7> list4 = c52Var2.d;
                            ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
                            for (un7 un7Var4 : list4) {
                                arrayList3.add(un7.a(un7Var4, un7Var4.f35947a == un7Var3.f35947a));
                            }
                            return c52.a(c52Var2, null, arrayList3, null, 4087);
                        default:
                            oyg0Var2.getClass();
                            c52Var2.getClass();
                            List<un7> list5 = c52Var2.d;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list5, 10));
                            for (un7 un7VarA2 : list5) {
                                if (un7VarA2.f35947a == un7Var3.f35947a) {
                                    un7VarA2 = un7.a(un7VarA2, false);
                                }
                                arrayList4.add(un7VarA2);
                            }
                            return c52.a(c52Var2, null, arrayList4, null, 4087);
                    }
                }
            });
            return;
        }
        if (!z3) {
            H(new Function2() { // from class: a.e52
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    byte b5 = b;
                    un7 un7Var3 = un7Var2;
                    oyg0 oyg0Var2 = (oyg0) obj3;
                    c52 c52Var2 = (c52) obj4;
                    switch (b5) {
                        case 0:
                            oyg0Var2.getClass();
                            c52Var2.getClass();
                            List<un7> list3 = c52Var2.d;
                            ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                            for (un7 un7VarA : list3) {
                                if (un7VarA.f35947a == un7Var3.f35947a) {
                                    un7VarA = un7.a(un7VarA, true);
                                }
                                arrayList2.add(un7VarA);
                            }
                            return c52.a(c52Var2, null, arrayList2, null, 4087);
                        case 1:
                            oyg0Var2.getClass();
                            c52Var2.getClass();
                            List<un7> list4 = c52Var2.d;
                            ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
                            for (un7 un7Var4 : list4) {
                                arrayList3.add(un7.a(un7Var4, un7Var4.f35947a == un7Var3.f35947a));
                            }
                            return c52.a(c52Var2, null, arrayList3, null, 4087);
                        default:
                            oyg0Var2.getClass();
                            c52Var2.getClass();
                            List<un7> list5 = c52Var2.d;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list5, 10));
                            for (un7 un7VarA2 : list5) {
                                if (un7VarA2.f35947a == un7Var3.f35947a) {
                                    un7VarA2 = un7.a(un7VarA2, false);
                                }
                                arrayList4.add(un7VarA2);
                            }
                            return c52.a(c52Var2, null, arrayList4, null, 4087);
                    }
                }
            });
        } else if (z3 && i2 == 1) {
            H(new xg1((byte) 21));
        }
    }
}
