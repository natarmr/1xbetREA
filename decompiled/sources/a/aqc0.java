package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.promo.impl.promocodes.navigation.PromoCodesScreenFactory$getPromoShopDetailScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class aqc0 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final long o;
    public final m1e p;
    public final gpu q;
    public final rl70 r;
    public final b4j s;
    public final x20 t;
    public final mne u;
    public final oeg0 v;
    public final duj w;
    public final ol60 x;
    public bby y;
    public bby z;

    public aqc0(vzg0 vzg0Var, long j, m1e m1eVar, gpu gpuVar, rl70 rl70Var, b4j b4jVar, x20 x20Var, mne mneVar, oeg0 oeg0Var, duj dujVar, ctf0 ctf0Var) {
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        wg2 wg2Var = new wg2(vzg0Var, (byte) 9);
        ljc0 ljc0Var = new ljc0((byte) 6);
        rwj rwjVar = mneVar.f22085a;
        super(null, wg2Var, ljc0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = j;
        this.p = m1eVar;
        this.q = gpuVar;
        this.r = rl70Var;
        this.s = b4jVar;
        this.t = x20Var;
        this.u = mneVar;
        this.v = oeg0Var;
        this.w = dujVar;
        this.x = new ol60(3);
        M(false);
    }

    public final void M(boolean z) {
        bby bbyVar = this.y;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.y = sac.i0(jiu0.a(this), "PromoShopCategoriesViewModel.loadPage", 3, 0L, q3d.j(SocketTimeoutException.class, UnknownHostException.class, oqt0.class), q3d.j(Integer.valueOf(i2o.NotFound.getErrorCode()), Integer.valueOf(i2o.Forbidden.getErrorCode()), Integer.valueOf(i2o.BadRequest.getErrorCode()), Integer.valueOf(i2o.l1.getErrorCode()), Integer.valueOf(i2o.TooManyRequests.getErrorCode())), new xpc0(this, null, (byte) 0), null, this.u.b, new ij90((Object) this, z, (byte) 4), null, 580);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        kpc0 kpc0Var = (kpc0) obj;
        kpc0Var.getClass();
        super.x(kpc0Var);
        if (kpc0Var.equals(epc0.f8180a)) {
            E();
            return;
        }
        boolean z = kpc0Var instanceof gpc0;
        oeg0 oeg0Var = this.v;
        if (z) {
            yrc0 yrc0Var = ((gpc0) kpc0Var).f11676a;
            Iterator it = ((wpc0) D()).e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((vrc0) next).getId() != yrc0Var.getId());
            vrc0 vrc0Var = (vrc0) next;
            if (vrc0Var == null) {
                return;
            }
            vrc0 vrc0VarG0 = vrc0Var.g0("codes_list");
            xi70 xi70Var = src0.f32669a;
            long jB = vrc0VarG0.B();
            xi70Var.getClass();
            String strA = xi70.e(jB).a();
            long id = vrc0VarG0.getId();
            b4j b4jVar = this.s;
            b4jVar.getClass();
            b4jVar.f1961a.a("promo_shop_call", xp20.f(new Pair("promo_id", Long.valueOf(id)), new Pair("screen", strA)));
            int id2 = (int) vrc0VarG0.getId();
            x20 x20Var = this.t;
            x20Var.getClass();
            x20Var.f40143a.a(tx3.l0(new k1p[]{new i1p(id2, (byte) 2), new j1p(strA, (byte) 0)}), 3305L);
            i1w0 i1w0VarC = oeg0Var.c();
            i1w0VarC.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.r.getClass();
            FragmentScreen promoCodesScreenFactory$getPromoShopDetailScreen$1 = new PromoCodesScreenFactory$getPromoShopDetailScreen$1(vrc0VarG0);
            if (promoCodesScreenFactory$getPromoShopDetailScreen$1 instanceof DialogScreen) {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promoCodesScreenFactory$getPromoShopDetailScreen$1)));
            } else {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(promoCodesScreenFactory$getPromoShopDetailScreen$1)));
            }
            ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            if (kpc0Var.equals(hpc0.f13435a)) {
                v3c.N(this.y);
                M(true);
                return;
            }
            if (!kpc0Var.equals(fpc0.f9922a)) {
                if (kpc0Var.equals(ipc0.f15156a)) {
                    M(false);
                    return;
                } else if (!kpc0Var.equals(jpc0.f16893a)) {
                    t9f.b();
                    return;
                } else {
                    v3c.N(this.y);
                    v3c.N(this.z);
                    return;
                }
            }
            i1w0 i1w0VarC2 = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC2);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC2, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
