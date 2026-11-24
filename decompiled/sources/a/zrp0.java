package a;

import org.xplatform.onexdatabase.OnexDatabase;
import org.xplatform.statistic.team.impl.team_statistic.domain.models.TypeParam;

/* JADX INFO: loaded from: classes4.dex */
public final class zrp0 implements ze3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cad f44868a;
    public final gii0 b;
    public final sjl0 c;
    public final OnexDatabase d;
    public final duj e;
    public final m1e f;
    public final r9u g;
    public final uyu h;
    public final u58 i;
    public final ocl j;
    public final knf0 k;
    public final pru l;
    public final ctf0 m;
    public final d1p n;
    public final ugf0 o;
    public final yo4 p;
    public final pmi0 q;
    public final lme0 r;
    public final g9m0 s;
    public final qzt t;
    public final wyu u;

    public zrp0(cad cadVar, gii0 gii0Var, sjl0 sjl0Var, OnexDatabase onexDatabase, duj dujVar, m1e m1eVar, r9u r9uVar, uyu uyuVar, u58 u58Var, ocl oclVar, knf0 knf0Var, pru pruVar, ctf0 ctf0Var, d1p d1pVar, ugf0 ugf0Var, yo4 yo4Var, pmi0 pmi0Var, lme0 lme0Var, g9m0 g9m0Var, qzt qztVar, wyu wyuVar) {
        gii0Var.getClass();
        sjl0Var.getClass();
        onexDatabase.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        knf0Var.getClass();
        ctf0Var.getClass();
        d1pVar.getClass();
        wyuVar.getClass();
        this.f44868a = cadVar;
        this.b = gii0Var;
        this.c = sjl0Var;
        this.d = onexDatabase;
        this.e = dujVar;
        this.f = m1eVar;
        this.g = r9uVar;
        this.h = uyuVar;
        this.i = u58Var;
        this.j = oclVar;
        this.k = knf0Var;
        this.l = pruVar;
        this.m = ctf0Var;
        this.n = d1pVar;
        this.o = ugf0Var;
        this.p = yo4Var;
        this.q = pmi0Var;
        this.r = lme0Var;
        this.s = g9m0Var;
        this.t = qztVar;
        this.u = wyuVar;
    }

    public final hbi a(i1w0 i1w0Var, TypeParam typeParam, long j, String str, int i, int i2) {
        i1w0Var.getClass();
        str.getClass();
        String strA = org.xplatform.statistic.team.impl.team_statistic.domain.models.c.a(typeParam);
        d1p d1pVar = this.n;
        d1pVar.getClass();
        ctf0 ctf0Var = this.m;
        ctf0Var.getClass();
        gii0 gii0Var = this.b;
        gii0Var.getClass();
        r9u r9uVar = this.g;
        r9uVar.getClass();
        this.c.getClass();
        this.d.getClass();
        strA.getClass();
        m1e m1eVar = this.f;
        m1eVar.getClass();
        knf0 knf0Var = this.k;
        knf0Var.getClass();
        wyu wyuVar = this.u;
        wyuVar.getClass();
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        Long lValueOf = Long.valueOf(j);
        hbi hbiVar = new hbi();
        hbiVar.b = i1w0Var;
        hbiVar.c = this.f44868a;
        hbiVar.d = this.q;
        hbiVar.f12771a = this.j;
        hbiVar.e = wyuVar;
        hbiVar.f = this.t;
        hbiVar.g = this.h;
        hbiVar.h = ctf0Var;
        hbiVar.i = m1eVar;
        hbiVar.j = this.e;
        hbiVar.k = gii0Var;
        hbiVar.l = knf0Var;
        hbiVar.m = this.i;
        hbiVar.n = this.o;
        hbiVar.o = d1pVar;
        hbiVar.p = this.s;
        hbiVar.q = r9uVar;
        hbiVar.r = this.p;
        hbiVar.s = typeParam;
        hbiVar.t = strA;
        hbiVar.u = lValueOf;
        hbiVar.v = numValueOf;
        hbiVar.w = numValueOf2;
        hbiVar.x = str;
        hbiVar.y = this.l;
        hbiVar.z = new msi(hbiVar, 0, (byte) 10);
        hbiVar.A = new msi(hbiVar, 1, (byte) 10);
        return hbiVar;
    }
}
