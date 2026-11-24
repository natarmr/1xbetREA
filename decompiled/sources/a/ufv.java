package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ufv implements j2h0, ah60, zjo {
    public static final String o = wv00.h("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35593a;
    public final xzj c;
    public boolean d;
    public final ezb0 g;
    public final okt0 h;
    public final wsd i;
    public Boolean k;
    public final zas0 l;
    public final fpv0 m;
    public final h0q0 n;
    public final HashMap b = new HashMap();
    public final Object e = new Object();
    public final fck0 f = new fck0(new ea70((byte) 3));
    public final HashMap j = new HashMap();

    public ufv(Context context, wsd wsdVar, lds0 lds0Var, ezb0 ezb0Var, okt0 okt0Var, fpv0 fpv0Var) {
        this.f35593a = context;
        cad cadVar = wsdVar.e;
        this.c = new xzj(this, cadVar, wsdVar.d);
        h0q0 h0q0Var = new h0q0();
        h0q0Var.f12247a = cadVar;
        h0q0Var.b = okt0Var;
        h0q0Var.c = new Object();
        h0q0Var.d = new LinkedHashMap();
        this.n = h0q0Var;
        this.m = fpv0Var;
        this.l = new zas0(lds0Var);
        this.i = wsdVar;
        this.g = ezb0Var;
        this.h = okt0Var;
    }

    @Override // a.ah60
    public final void a(ppv0 ppv0Var, w4e w4eVar) {
        xov0 xov0VarK = jpm0.k(ppv0Var);
        boolean z = w4eVar instanceof u4e;
        okt0 okt0Var = this.h;
        h0q0 h0q0Var = this.n;
        String str = o;
        fck0 fck0Var = this.f;
        if (z) {
            if (fck0Var.a(xov0VarK)) {
                return;
            }
            wv00.f().a(str, "Constraints met: Scheduling work ID " + xov0VarK);
            h6m0 h6m0VarI = fck0Var.i(xov0VarK);
            h0q0Var.A(h6m0VarI);
            okt0Var.getClass();
            okt0Var.j(h6m0VarI, null);
            return;
        }
        wv00.f().a(str, "Constraints not met: Cancelling work ID " + xov0VarK);
        h6m0 h6m0VarH = fck0Var.h(xov0VarK);
        if (h6m0VarH != null) {
            h0q0Var.j(h6m0VarH);
            int i = ((v4e) w4eVar).f36773a;
            okt0Var.getClass();
            okt0Var.k(h6m0VarH, i);
        }
    }

    @Override // a.j2h0
    public final void b(String str) {
        List<h6m0> listD;
        Runnable runnable;
        String str2 = o;
        Boolean boolValueOf = this.k;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(zyb0.a(this.f35593a, this.i));
            this.k = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            wv00.f().g(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        wv00.f().a(str2, "Cancelling work ID " + str);
        xzj xzjVar = this.c;
        if (xzjVar != null && (runnable = (Runnable) xzjVar.c.remove(str)) != null) {
            ((Handler) xzjVar.b.b).removeCallbacks(runnable);
        }
        fck0 fck0Var = this.f;
        fck0Var.getClass();
        str.getClass();
        synchronized (fck0Var.c) {
            listD = ((ea70) fck0Var.b).d(str);
        }
        for (h6m0 h6m0Var : listD) {
            this.n.j(h6m0Var);
            okt0 okt0Var = this.h;
            okt0Var.getClass();
            okt0Var.k(h6m0Var, -512);
        }
    }

    @Override // a.zjo
    public final void c(xov0 xov0Var, boolean z) {
        bby bbyVar;
        h6m0 h6m0VarH = this.f.h(xov0Var);
        if (h6m0VarH != null) {
            this.n.j(h6m0VarH);
        }
        synchronized (this.e) {
            bbyVar = (bby) this.b.remove(xov0Var);
        }
        if (bbyVar != null) {
            wv00.f().a(o, "Stopping tracking for " + xov0Var);
            bbyVar.cancel(null);
        }
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.j.remove(xov0Var);
        }
    }

    @Override // a.j2h0
    public final void d(ppv0... ppv0VarArr) {
        long jMax;
        Boolean boolValueOf = this.k;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(zyb0.a(this.f35593a, this.i));
            this.k = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            wv00.f().g(o, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        HashSet<ppv0> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        boolean z = false;
        for (ppv0 ppv0Var : ppv0VarArr) {
            if (!this.f.a(jpm0.k(ppv0Var))) {
                synchronized (this.e) {
                    try {
                        xov0 xov0VarK = jpm0.k(ppv0Var);
                        tfv tfvVar = (tfv) this.j.get(xov0VarK);
                        if (tfvVar == null) {
                            int i = ppv0Var.k;
                            s2m0 s2m0Var = this.i.d;
                            tfvVar = new tfv(i, System.currentTimeMillis());
                            this.j.put(xov0VarK, tfvVar);
                        }
                        jMax = (((long) Math.max((ppv0Var.k - tfvVar.f33883a) - 5, 0)) * 30000) + tfvVar.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(ppv0Var.a(), jMax);
                s2m0 s2m0Var2 = this.i.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (ppv0Var.b == zov0.f44733a) {
                    if (jCurrentTimeMillis < jMax2) {
                        xzj xzjVar = this.c;
                        if (xzjVar != null) {
                            cad cadVar = xzjVar.b;
                            HashMap map = xzjVar.c;
                            Runnable runnable = (Runnable) map.remove(ppv0Var.f27390a);
                            if (runnable != null) {
                                ((Handler) cadVar.b).removeCallbacks(runnable);
                            }
                            lfr lfrVar = new lfr(xzjVar, ppv0Var, z, (byte) 8);
                            map.put(ppv0Var.f27390a, lfrVar);
                            ((Handler) cadVar.b).postDelayed(lfrVar, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!Intrinsics.d(o4e.j, ppv0Var.j)) {
                        o4e o4eVar = ppv0Var.j;
                        if (o4eVar.d) {
                            wv00.f().a(o, "Ignoring " + ppv0Var + ". Requires device idle.");
                        } else if (o4eVar.i.isEmpty()) {
                            hashSet.add(ppv0Var);
                            hashSet2.add(ppv0Var.f27390a);
                        } else {
                            wv00.f().a(o, "Ignoring " + ppv0Var + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f.a(jpm0.k(ppv0Var))) {
                        wv00.f().a(o, "Starting work for " + ppv0Var.f27390a);
                        fck0 fck0Var = this.f;
                        fck0Var.getClass();
                        h6m0 h6m0VarI = fck0Var.i(jpm0.k(ppv0Var));
                        this.n.A(h6m0VarI);
                        okt0 okt0Var = this.h;
                        okt0Var.getClass();
                        okt0Var.j(h6m0VarI, null);
                    }
                }
            }
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    wv00.f().a(o, "Starting tracking for " + TextUtils.join(Separators.COMMA, hashSet2));
                    for (ppv0 ppv0Var2 : hashSet) {
                        xov0 xov0VarK2 = jpm0.k(ppv0Var2);
                        if (!this.b.containsKey(xov0VarK2)) {
                            this.b.put(xov0VarK2, pov0.a(this.l, ppv0Var2, this.m.b, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a.j2h0
    public final boolean e() {
        return false;
    }
}
