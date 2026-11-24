package a;

import android.content.SharedPreferences;
import androidx.media3.common.MediaItem;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.platform.app.ApplicationLoader;
import org.xplatform.domain.resolver.impl.di.DomainResolverDependencies;

/* JADX INFO: loaded from: classes3.dex */
public final class a1d implements pp9, ybf, qe60, h5g, giu0, DomainResolverDependencies, zy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f66a;
    public final Object b;

    public a1d(gii0 gii0Var, byte b) {
        this.f66a = b;
        byte b2 = 26;
        gii0Var.getClass();
        switch (b) {
            case 2:
                this.b = new sza(gii0Var, (byte) 14);
                break;
            case 17:
                this.b = new sza(gii0Var, b2);
                break;
            case 23:
                this.b = new wgn(gii0Var, (byte) 7);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.b = new wgn(gii0Var, (byte) 21);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.b = new wgn(gii0Var, b2);
                break;
            default:
                this.b = new sza(gii0Var, (byte) 13);
                break;
        }
    }

    public static ytj a(d9x d9xVar) {
        new edu();
        d9xVar.getClass();
        new HashMap();
        throw null;
    }

    public static void h(a1d a1dVar, long j, long j2, boolean z) {
        ((goo) a1dVar.b).c(j, j2, z, false);
    }

    @Override // a.zy3
    public ig00 apply(Object obj) {
        return ro4.a0(((eer) this.b).mo11apply(obj));
    }

    public cil b(MediaItem mediaItem) {
        mediaItem.b.getClass();
        mediaItem.b.getClass();
        return cil.f4421a;
    }

    @Override // a.giu0
    public diu0 c(Object obj) {
        byte b = this.f66a;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                c7i c7iVar = (c7i) obj2;
                k6i k6iVar = (k6i) c7iVar.c;
                v88 v88VarU0 = k6iVar.f17771a.u0();
                wsf0 wsf0VarF0 = k6iVar.f17771a.f0();
                mne mneVarV1 = k6iVar.f17771a.v1();
                fpi0 fpi0Var = (fpi0) k6iVar.m.get();
                fq fqVar = (fq) k6iVar.x.get();
                db dbVar = (db) c7iVar.d;
                return new wm70((i1w0) obj, v88VarU0, wsf0VarF0, mneVarV1, fpi0Var, fqVar, (dqx) ((n5d0) dbVar.h).get(), (itt) k6iVar.u.get(), (qni0) k6iVar.i0.get(), (l1u) k6iVar.c0.get(), (lg60) k6iVar.j0.get(), (qa60) k6iVar.F.get(), (ppb) ((n5d0) dbVar.m).get(), (i5m0) k6iVar.k0.get(), (lzt) k6iVar.f.get(), (xcc) k6iVar.U.get(), (ztt) k6iVar.k.get(), (d3c) k6iVar.e.get(), (xyb) k6iVar.h.get(), (oqt) k6iVar.p.get(), (y5s) k6iVar.T.get(), (t0u) k6iVar.X.get());
            case 9:
                xfi xfiVar = (xfi) ((c7i) obj2).c;
                qa60 qa60Var = (qa60) xfiVar.F.get();
                xcc xccVar = (xcc) xfiVar.U.get();
                return new gh70((fq) xfiVar.x.get(), xccVar, xfiVar.f40791a.v1(), (lzt) xfiVar.f.get(), qa60Var, (i1w0) obj);
            case 10:
                c7i c7iVar2 = (c7i) obj2;
                wri wriVar = (wri) c7iVar2.c;
                v88 v88VarU1 = wriVar.f39644a.u0();
                wsf0 wsf0VarF1 = wriVar.f39644a.f0();
                mne mneVarV2 = wriVar.f39644a.v1();
                fpi0 fpi0Var2 = (fpi0) wriVar.m.get();
                fq fqVar2 = (fq) wriVar.x.get();
                r8i r8iVar = (r8i) c7iVar2.d;
                return new wm70((i1w0) obj, v88VarU1, wsf0VarF1, mneVarV2, fpi0Var2, fqVar2, (dqx) ((n5d0) r8iVar.g).get(), (itt) wriVar.u.get(), (qni0) wriVar.l0.get(), (l1u) ((n5d0) r8iVar.l).get(), (lg60) wriVar.m0.get(), (qa60) wriVar.F.get(), (ppb) ((n5d0) r8iVar.m).get(), (i5m0) wriVar.n0.get(), (lzt) wriVar.f.get(), (xcc) wriVar.U.get(), (ztt) wriVar.k.get(), (d3c) wriVar.e.get(), (xyb) wriVar.h.get(), (oqt) wriVar.p.get(), (y5s) wriVar.T.get(), (t0u) wriVar.X.get());
            default:
                c7i c7iVar3 = (c7i) obj2;
                gxi gxiVar = (gxi) c7iVar3.c;
                v88 v88VarU2 = gxiVar.f12079a.u0();
                wsf0 wsf0VarF2 = gxiVar.f12079a.f0();
                mne mneVarV3 = gxiVar.f12079a.v1();
                fpi0 fpi0Var3 = (fpi0) gxiVar.n.get();
                fq fqVar3 = (fq) gxiVar.y.get();
                dxi dxiVar = (dxi) c7iVar3.d;
                return new wm70((i1w0) obj, v88VarU2, wsf0VarF2, mneVarV3, fpi0Var3, fqVar3, (dqx) dxiVar.g.get(), (itt) gxiVar.v.get(), (qni0) gxiVar.f0.get(), (l1u) gxiVar.k0.get(), (lg60) gxiVar.h0.get(), (qa60) gxiVar.G.get(), (ppb) dxiVar.l.get(), (i5m0) gxiVar.i0.get(), (lzt) gxiVar.g.get(), (xcc) gxiVar.V.get(), (ztt) gxiVar.l.get(), (d3c) gxiVar.f.get(), (xyb) gxiVar.i.get(), (oqt) gxiVar.q.get(), (y5s) gxiVar.U.get(), (t0u) gxiVar.Y.get());
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object d(int i, int i2, String str, int i3, int i4, boolean z, int i5, zje zjeVar) {
        ouk oukVar;
        if (zjeVar instanceof ouk) {
            oukVar = (ouk) zjeVar;
            int i6 = oukVar.k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                oukVar.k = i6 - Integer.MIN_VALUE;
            } else {
                oukVar = new ouk(this, zjeVar);
            }
        } else {
            oukVar = new ouk(this, zjeVar);
        }
        ouk oukVar2 = oukVar;
        Object objA = oukVar2.i;
        wne wneVar = wne.f39444a;
        int i7 = oukVar2.k;
        if (i7 == 0) {
            z1x.P(objA);
            gmg gmgVar = (gmg) ((sza) this.b).invoke();
            oukVar2.k = 1;
            objA = gmgVar.a(i, i4, str, i2, i3, z, i5, oukVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i7 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    public z8u e() {
        return new z8u(((qv2) this.b).z());
    }

    public ArrayList f(uaq0 uaq0Var, boolean z) {
        g0h g0hVar = (g0h) this.b;
        Collection collectionR0 = g0h.d;
        if (z) {
            collectionR0 = CollectionsKt.r0(CollectionsKt.r0(CollectionsKt.r0(CollectionsKt.r0(CollectionsKt.q0(CollectionsKt.q0(collectionR0, aog.d), pnh.d), qhh.d), uah.d), nag.d), bah.d);
        }
        ArrayList arrayList = new ArrayList(r3d.q(collectionR0, 10));
        Iterator it = collectionR0.iterator();
        while (it.hasNext()) {
            arrayList.add(vfc.O((vdh) it.next(), StringsKt.O(g0hVar.c.c(), "ru", false), uaq0Var));
        }
        return arrayList;
    }

    @Override // a.pp9
    public void g(to9 to9Var, jtf0 jtf0Var) {
        boolean z = jtf0Var.f17098a.q;
        pdd pddVar = (pdd) this.b;
        if (z) {
            pddVar.complete(jtf0Var.b);
        } else {
            pddVar.completeExceptionally(new rtw(jtf0Var));
        }
    }

    @Override // org.xplatform.domain.resolver.impl.di.DomainResolverDependencies
    public yyk getDomainResolverConfig() {
        return ((g8i) ((ds3) this.b).invoke()).getDomainResolverConfig();
    }

    @Override // org.xplatform.domain.resolver.impl.di.DomainResolverDependencies
    public zyk getDomainResolverListener() {
        ((g8i) ((ds3) this.b).invoke()).getClass();
        ApplicationLoader applicationLoader = ApplicationLoader.v1;
        return xf0.N();
    }

    @Override // org.xplatform.domain.resolver.impl.di.DomainResolverDependencies
    public azk getDomainResolverLogger() {
        return ((g8i) ((ds3) this.b).invoke()).getDomainResolverLogger();
    }

    @Override // org.xplatform.domain.resolver.impl.di.DomainResolverDependencies
    public mmy getKeys() {
        return ((g8i) ((ds3) this.b).invoke()).getKeys();
    }

    @Override // org.xplatform.domain.resolver.impl.di.DomainResolverDependencies
    public tiu getLocalDnsUseCase() {
        return ((g8i) ((ds3) this.b).invoke()).getLocalDnsUseCase();
    }

    @Override // org.xplatform.domain.resolver.impl.di.DomainResolverDependencies
    public nk50 getNetworkAvailableUtil() {
        return ((g8i) ((ds3) this.b).invoke()).getNetworkAvailableUtil();
    }

    @Override // org.xplatform.domain.resolver.impl.di.DomainResolverDependencies
    public wsb0 getPreferenceDataSource() {
        return ((g8i) ((ds3) this.b).invoke()).getPreferenceDataSource();
    }

    @Override // org.xplatform.domain.resolver.impl.di.DomainResolverDependencies
    public zjh0 getSecretLibSettingsRepository() {
        return ((g8i) ((ds3) this.b).invoke()).getSecretLibSettingsRepository();
    }

    @Override // org.xplatform.domain.resolver.impl.di.DomainResolverDependencies
    public wnh0 getSecurity() {
        return ((g8i) ((ds3) this.b).invoke()).getSecurity();
    }

    @Override // org.xplatform.domain.resolver.impl.di.DomainResolverDependencies
    public kii0 getServiceProvider() {
        return ((g8i) ((ds3) this.b).invoke()).getServiceProvider();
    }

    public boolean i() {
        return ((SharedPreferences) ((xwb0) this.b).c.getValue()).getBoolean("fingerprint_auth_enabled", false);
    }

    public void j(Object obj) {
        e0u e0uVar = (e0u) obj;
        e0uVar.getClass();
        n5a n5aVar = (n5a) this.b;
        if (n5aVar.q() instanceof j660) {
            e0g0 e0g0Var = j0g0.b;
            n5aVar.resumeWith(new g0g0(e0uVar));
        }
    }

    public void k(Object obj) {
        g0u g0uVar = (g0u) obj;
        g0uVar.getClass();
        n5a n5aVar = (n5a) this.b;
        if (n5aVar.q() instanceof j660) {
            e0g0 e0g0Var = j0g0.b;
            n5aVar.resumeWith(g0uVar);
        }
    }

    @Override // a.pp9
    public void m(to9 to9Var, Throwable th) {
        ((pdd) this.b).completeExceptionally(th);
    }

    @Override // a.qe60
    public int n(int i) {
        return l1e0.d(i, 0, ((j83) this.b).b.length());
    }

    @Override // a.qe60
    public int s(int i) {
        return l1e0.d(i, 0, ((j83) this.b).b.length());
    }

    public a1d(tgk tgkVar) {
        this.f66a = (byte) 16;
        tgkVar.getClass();
        this.b = tgkVar;
    }

    public a1d(goo gooVar) {
        this.f66a = (byte) 22;
        gooVar.getClass();
        this.b = gooVar;
    }

    public a1d(xwb0 xwb0Var) {
        this.f66a = (byte) 25;
        xwb0Var.getClass();
        this.b = xwb0Var;
    }

    public a1d(or9 or9Var) {
        this.f66a = (byte) 15;
        or9Var.getClass();
        this.b = or9Var;
    }

    public /* synthetic */ a1d(Object obj, byte b) {
        this.f66a = b;
        this.b = obj;
    }

    public a1d(wdd0 wdd0Var, abp abpVar, f8p f8pVar, rvt rvtVar, zoc zocVar, btt0 btt0Var, gii0 gii0Var, pru pruVar, mne mneVar, knf0 knf0Var, duj dujVar, m1e m1eVar, j1q0 j1q0Var, vby vbyVar) {
        this.f66a = (byte) 24;
        wdd0Var.getClass();
        abpVar.getClass();
        f8pVar.getClass();
        btt0Var.getClass();
        gii0Var.getClass();
        knf0Var.getClass();
        m1eVar.getClass();
        j1q0Var.getClass();
        vbyVar.getClass();
        this.b = new qv2(wdd0Var, abpVar, f8pVar, btt0Var, gii0Var, mneVar, knf0Var, dujVar, pruVar, rvtVar, zocVar, m1eVar, vbyVar);
    }

    public a1d(byte b) {
        this.f66a = b;
        switch (b) {
            case 21:
                this.b = on40.e;
                break;
            default:
                this.b = new Object();
                break;
        }
    }
}
