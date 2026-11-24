package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b07 extends w46 {
    public static final List w = q3d.j(1, 2, 3, 4, 5, 10, 25, 50, 100);
    public final i1w0 b;
    public final ctf0 c;
    public final v88 d;
    public final mne e;
    public final duj f;
    public final iqi g;
    public final dq00 h;
    public final y3v i;
    public final b8u j;
    public final bsu k;
    public final urt l;
    public final m1e m;
    public final wsf0 n;
    public final toc0 o;
    public final ol60 p;
    public final ax5 q;
    public String r;
    public double s;
    public int t;
    public int u;
    public List v;

    public b07(i1w0 i1w0Var, ctf0 ctf0Var, v88 v88Var, mne mneVar, duj dujVar, iqi iqiVar, dq00 dq00Var, y3v y3vVar, b8u b8uVar, bsu bsuVar, urt urtVar, m1e m1eVar, wsf0 wsf0Var, pru pruVar) {
        i1w0Var.getClass();
        this.b = i1w0Var;
        this.c = ctf0Var;
        this.d = v88Var;
        this.e = mneVar;
        this.f = dujVar;
        this.g = iqiVar;
        this.h = dq00Var;
        this.i = y3vVar;
        this.j = b8uVar;
        this.k = bsuVar;
        this.l = urtVar;
        this.m = m1eVar;
        this.n = wsf0Var;
        this.o = pruVar.a().l;
        this.p = new ol60(3);
        this.q = new ax5(this);
        this.r = "";
        this.t = 1;
        this.v = iun.f15405a;
        sac.V(jiu0.a(this), new ur6(1, this, b07.class, "handleShopLoadError", "handleShopLoadError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, null, new mz6(this, null, (byte) 0), 14);
    }

    public final void A() {
        List list = w;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new g6s(iIntValue, iIntValue == this.t));
        }
        z(new wz6(arrayList));
    }

    public final void w(Throwable th) {
        byte b = 1;
        if (saj.Y(th)) {
            sac.V(jiu0.a(this), a07.f12a, null, this.e.f22085a, new mz6(this, null, b), 10);
        } else {
            if (!(th instanceof qct)) {
                this.f.a(th);
                return;
            }
            if (yz6.f43502a[((qct) th).b.ordinal()] == 1) {
                z(new sz6(th));
            } else {
                z(new qz6(th));
            }
        }
    }

    public final void x(Throwable th) {
        z(new tz6(false));
        if (saj.Y(th)) {
            return;
        }
        w(th);
        z(oz6.b);
    }

    public final Object y(rg5 rg5Var, bnn0 bnn0Var) {
        if (!rg5Var.e) {
            return qjj.d0(this.e.b, new zz6(this, rg5Var, null, (byte) 1), bnn0Var);
        }
        return new Pair(Double.valueOf(wvb.N(50.0f)), this.c.f(R.string.pts_symbol, new Object[0]));
    }

    public final void z(xz6 xz6Var) {
        sac.V(jiu0.a(this), new h26((byte) 17), null, null, new yp6(this, xz6Var, null, (byte) 6), 14);
    }
}
