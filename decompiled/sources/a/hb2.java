package a;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.results.impl.presentation.alt_history.GamesHistoryResultsParams;

/* JADX INFO: loaded from: classes5.dex */
public final class hb2 extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public final boolean A;
    public bby B;
    public bby C;
    public bby D;
    public final vzg0 o;
    public final GamesHistoryResultsParams p;
    public final luu q;
    public final hru r;
    public final qrc s;
    public final cmt t;
    public final j3c u;
    public final m1e v;
    public final mne w;
    public final i1w0 x;
    public final g2g0 y;
    public final reu z;

    /* JADX WARN: Illegal instructions before constructor call */
    public hb2(vzg0 vzg0Var, GamesHistoryResultsParams gamesHistoryResultsParams, luu luuVar, hru hruVar, qrc qrcVar, cmt cmtVar, j3c j3cVar, m1e m1eVar, ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, g2g0 g2g0Var, reu reuVar, pru pruVar, bzt bztVar, r9u r9uVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        yje yjeVar = null;
        super(new pg1(pruVar, bztVar, vzg0Var, hruVar, gamesHistoryResultsParams, r9uVar, qrcVar), g090VarP, new df1(ctf0Var, gamesHistoryResultsParams, (byte) 16), (yzn0) null);
        this.o = vzg0Var;
        this.p = gamesHistoryResultsParams;
        this.q = luuVar;
        this.r = hruVar;
        this.s = qrcVar;
        this.t = cmtVar;
        this.u = j3cVar;
        this.v = m1eVar;
        this.w = mneVar;
        this.x = i1w0Var;
        this.y = g2g0Var;
        this.z = reuVar;
        this.A = gamesHistoryResultsParams.c;
        i3t0.K(this, null, null, new fb2(this, yjeVar, (byte) 1), 3);
        i3t0.K(this, null, null, new fb2(this, yjeVar, (byte) 0), 3);
        i3t0.K(this, null, null, new fb2(this, yjeVar, (byte) 2), 3);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    public final void M(boolean z) {
        p7m0 p7m0Var;
        Object value;
        Object value2;
        List list;
        if (z) {
            v3c.N(this.B);
        }
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            boolean z2 = ((ab2) D()).d instanceof xa2;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z2) {
                za2 za2Var = ((ab2) D()).d;
                xa2 xa2Var = za2Var instanceof xa2 ? (xa2) za2Var : null;
                if (xa2Var == null || (list = xa2Var.b) == null || !list.isEmpty()) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value2, ab2.a((ab2) value2, null, null, false, null, false, true, false, null, null, null, 65023)));
                } else {
                    p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value, ab2.a((ab2) value, null, null, false, ya2.f42274a, false, false, false, null, null, null, 65007)));
                }
            } else {
                p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value, ab2.a((ab2) value, null, null, false, ya2.f42274a, false, false, false, null, null, null, 65007)));
            }
            this.B = sac.V(jiu0.a(this), new m51(this, (byte) 16), null, this.w.f22085a, new gb2(this, null), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        ea2 ea2Var = (ea2) obj;
        ea2Var.getClass();
        byte b = 1;
        if (ea2Var.equals(w92.f38755a)) {
            Date date = ((ab2) D()).b;
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(calendar.get(1) - 2, calendar.get(2), calendar.get(5));
            G(new ua2(date, calendar2.getTimeInMillis(), calendar.getTimeInMillis()));
            return;
        }
        boolean z = ea2Var instanceof v92;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        vzg0 vzg0Var = this.o;
        if (z) {
            v92 v92Var = (v92) ea2Var;
            int i = v92Var.f37013a;
            int i2 = v92Var.b;
            int i3 = v92Var.c;
            Calendar calendar3 = Calendar.getInstance();
            Date date2 = ((ab2) D()).b;
            if (date2 != null) {
                calendar3.setTimeInMillis(date2.getTime());
            }
            Calendar calendar4 = Calendar.getInstance();
            int i4 = calendar4.get(11);
            int i5 = calendar4.get(12);
            int i6 = calendar4.get(13);
            Calendar calendar5 = Calendar.getInstance();
            calendar5.set(i, i2, i3, i4, i5, i6);
            if (((ab2) D()).b != null) {
                calendar3.getClass();
                if (calendar5.get(1) == calendar3.get(1) && calendar5.get(2) == calendar3.get(2) && calendar5.get(5) == calendar3.get(5)) {
                    return;
                }
            }
            Date time = calendar5.getTime();
            time.getClass();
            this.s.a(time, this.A);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value6 = p7m0Var.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value6, ab2.a((ab2) value6, null, calendar5.getTime(), false, null, false, false, false, null, null, null, 65533)));
            vzg0Var.e("KEY_CURRENT_DATE", calendar5.getTime());
            M(true);
            return;
        }
        if (!ea2Var.equals(u92.f35261a)) {
            if (ea2Var instanceof y92) {
                String str = ((y92) ea2Var).f42224a;
                if (Intrinsics.d(StringsKt.u0(str).toString(), StringsKt.u0(((ab2) D()).f558a).toString())) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value3, ab2.a((ab2) value3, str, null, false, null, false, false, false, null, null, null, 65534)));
                } else {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var3.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value4, ab2.a((ab2) value4, str, null, false, null, false, false, true, null, null, null, 64510)));
                }
                vzg0Var.e("KEY_SEARCH_INPUT", str);
                return;
            }
            if (ea2Var.equals(ca2.f3988a)) {
                M(true);
                return;
            }
            if (ea2Var.equals(aa2.f503a)) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var4.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value2, ab2.a((ab2) value2, null, null, false, null, true, false, false, null, null, null, 65279)));
                return;
            }
            boolean zEquals = ea2Var.equals(x92.f40489a);
            sa2 sa2Var = sa2.f31873a;
            if (zEquals) {
                G(sa2Var);
                return;
            }
            if (ea2Var.equals(t92.f33540a)) {
                G(sa2Var);
                return;
            }
            if (ea2Var.equals(q92.f28326a)) {
                E();
                return;
            }
            if (ea2Var.equals(r92.f30056a)) {
                bby bbyVar = this.D;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.D = i3t0.K(this, null, null, new fb2(this, null, (byte) 3), 3);
                }
                v3c.N(this.C);
                this.C = i3t0.F(this, this.y, null, null, new ma2(b), 119);
                return;
            }
            if (ea2Var.equals(s92.f31831a)) {
                v3c.N(this.C);
                v3c.N(this.B);
                v3c.N(this.D);
                return;
            }
            if (ea2Var.equals(z92.f43996a)) {
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value = p7m0Var5.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value, ab2.a((ab2) value, null, null, false, null, false, false, false, null, null, null, 64511)));
                return;
            }
            if (ea2Var.equals(ba2.f2237a)) {
                M(false);
                return;
            } else if (!(ea2Var instanceof da2)) {
                t9f.b();
                return;
            } else {
                i3t0.A(this, this.y, q0x.U(((da2) ea2Var).f5728a), null, null, 6);
                return;
            }
        }
        if (((ab2) D()).h) {
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value5 = p7m0Var6.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var6.m(value5, ab2.a((ab2) value5, "", null, false, null, false, false, false, null, null, null, 65278)));
            vzg0Var.e("KEY_SEARCH_INPUT", "");
            return;
        }
        i1w0 i1w0Var = this.x;
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
