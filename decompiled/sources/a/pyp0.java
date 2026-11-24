package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType;
import org.xplatform.statistic.tennis.impl.summary.presentation.chose_filter.ChoseFilterUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class pyp0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final vzg0 o;
    public final i1w0 p;
    public final ctf0 q;
    public final x4u r;
    public final psu s;
    public final psu t;
    public final osc u;
    public final lsn v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyp0(vzg0 vzg0Var, mne mneVar, i1w0 i1w0Var, ctf0 ctf0Var, x4u x4uVar, psu psuVar, psu psuVar2, osc oscVar, lsn lsnVar) {
        Object value;
        super(null, new mhp0((byte) 27), new h0j0(ctf0Var, (byte) 18), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = ctf0Var;
        this.r = x4uVar;
        this.s = psuVar;
        this.t = psuVar2;
        this.u = oscVar;
        this.v = lsnVar;
        TennisSummaryFilterModel tennisSummaryFilterModelF = x4uVar.f();
        TennisSummaryFilterModel tennisSummaryFilterModel = (TennisSummaryFilterModel) vzg0Var.a("START_FILTER_MODEL_KEY");
        TennisSummaryFilterModel tennisSummaryFilterModel2 = (TennisSummaryFilterModel) vzg0Var.a("CURRENT_FILTER_MODEL_KEY");
        if (tennisSummaryFilterModel == null || tennisSummaryFilterModel2 == null) {
            qjj.W(jiu0.a(this), null, null, new lcl0(this, tennisSummaryFilterModelF, null, (byte) 24), 3);
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            tennisSummaryFilterModelF.getClass();
        } while (!p7m0Var.m(value, new nyp0(tennisSummaryFilterModel, tennisSummaryFilterModel2, tennisSummaryFilterModelF)));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        gyp0 gyp0Var = (gyp0) obj;
        gyp0Var.getClass();
        if (!(gyp0Var instanceof zxp0)) {
            if (gyp0Var instanceof ayp0) {
                G(dzp0.f6950a);
                return;
            }
            boolean z = gyp0Var instanceof byp0;
            yje yjeVar = null;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            byte b = 10;
            vzg0 vzg0Var = this.o;
            if (z) {
                TennisSummaryFilterModel tennisSummaryFilterModelF = this.r.f();
                vzg0Var.e("CURRENT_FILTER_MODEL_KEY", tennisSummaryFilterModelF);
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, nyp0.a((nyp0) value3, tennisSummaryFilterModelF)));
                qjj.W(jiu0.a(this), null, null, new z2n0(this, yjeVar, b), 3);
                return;
            }
            boolean z2 = gyp0Var instanceof cyp0;
            ctf0 ctf0Var = this.q;
            if (z2) {
                String strE0 = l7x.e0(ctf0Var, ((nyp0) D()).b.f47097a);
                List<String> listL0 = CollectionsKt.L0(this.t.f27531a.c.f34767a.f22569a.keySet());
                ArrayList arrayList = new ArrayList(r3d.q(listL0, 10));
                for (String str : listL0) {
                    String strE1 = l7x.e0(ctf0Var, str);
                    arrayList.add(new ChoseFilterUiModel(strE1, str, strE1.equals(strE0)));
                }
                G(new czp0(pic.f27036a, ctf0Var.b.a(R.string.season_header, Arrays.copyOf(new Object[0], 0)), arrayList));
                return;
            }
            boolean z3 = gyp0Var instanceof eyp0;
            osc oscVar = this.u;
            if (z3) {
                String str2 = ((nyp0) D()).b.f47097a;
                str2.getClass();
                ctf0Var.getClass();
                lsm0 lsm0Var = ctf0Var.b;
                List<TennisSurfaceType> listA = oscVar.a(str2.equals(lsm0Var.a(R.string.tennis_summary_for_career, Arrays.copyOf(new Object[0], 0))) ? "0" : str2);
                ArrayList arrayList2 = new ArrayList(r3d.q(listA, 10));
                for (TennisSurfaceType tennisSurfaceType : listA) {
                    arrayList2.add(new ChoseFilterUiModel(ghm0.s(tennisSurfaceType, ctf0Var), tennisSurfaceType.f47098a, tennisSurfaceType == ((nyp0) D()).b.b));
                }
                G(new czp0(pic.b, lsm0Var.a(R.string.tennis_surface_type, Arrays.copyOf(new Object[0], 0)), arrayList2));
                return;
            }
            if (gyp0Var instanceof yxp0) {
                qjj.W(jiu0.a(this), null, null, new z2n0(this, yjeVar, b), 3);
                return;
            }
            if (gyp0Var instanceof dyp0) {
                String str3 = ((dyp0) gyp0Var).f6905a;
                TennisSurfaceType tennisSurfaceType2 = ((nyp0) D()).b.b;
                ctf0Var.getClass();
                if (!oscVar.a(str3.equals(ctf0Var.b.a(R.string.tennis_summary_for_career, Arrays.copyOf(new Object[0], 0))) ? "0" : str3).contains(tennisSurfaceType2)) {
                    tennisSurfaceType2 = TennisSurfaceType.UNKNOWN;
                }
                TennisSummaryFilterModel tennisSummaryFilterModel = new TennisSummaryFilterModel(str3, tennisSurfaceType2);
                vzg0Var.e("CURRENT_FILTER_MODEL_KEY", tennisSummaryFilterModel);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, nyp0.a((nyp0) value2, tennisSummaryFilterModel)));
                return;
            }
            if (!(gyp0Var instanceof fyp0)) {
                if (gyp0Var.equals(xxp0.f41669a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            String str4 = ((fyp0) gyp0Var).f10371a;
            String str5 = ((nyp0) D()).b.f47097a;
            TennisSurfaceType.b.getClass();
            TennisSummaryFilterModel tennisSummaryFilterModel2 = new TennisSummaryFilterModel(str5, m6m0.e(str4));
            vzg0Var.e("CURRENT_FILTER_MODEL_KEY", tennisSummaryFilterModel2);
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, nyp0.a((nyp0) value, tennisSummaryFilterModel2)));
            return;
        }
        i1w0 i1w0Var = this.p;
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
}
