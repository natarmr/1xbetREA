package org.xplatform.favorites.impl.presentation.category;

import a.a6u;
import a.aq2;
import a.atj;
import a.bby;
import a.c4m0;
import a.cq2;
import a.ctc;
import a.ctf0;
import a.cyu;
import a.duj;
import a.etr;
import a.f0s;
import a.f5o;
import a.g2v;
import a.gmq;
import a.hc0;
import a.i1w0;
import a.iia;
import a.j3c;
import a.je;
import a.jiu0;
import a.kep;
import a.kia;
import a.l0s;
import a.lbu;
import a.lep;
import a.lia;
import a.luu;
import a.m0k0;
import a.m1e;
import a.m97;
import a.maz;
import a.mep;
import a.mia;
import a.mne;
import a.n0o0;
import a.nia;
import a.oia;
import a.ol60;
import a.p7m0;
import a.pep;
import a.pru;
import a.q7m0;
import a.qjj;
import a.s31;
import a.ss3;
import a.t9f;
import a.vzg0;
import a.w3k;
import a.y78;
import a.yje;
import a.zn00;
import a.zxj0;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends w3k implements etr, f0s {
    public c4m0 A;
    public c4m0 B;
    public final i1w0 c;
    public final a6u d;
    public final duj e;
    public final l0s f;
    public final y78 g;
    public final ctf0 h;
    public final lbu i;
    public final g2v j;
    public final zn00 k;
    public final luu l;
    public final mne m;
    public final m1e n;
    public final j3c o;
    public final je p;
    public final s31 q;
    public final cyu r;
    public final n0o0 s;
    public bby t;
    public final FavoriteCategoryUiState u;
    public final n0o0 v;
    public final n0o0 w;
    public final p7m0 x;
    public final p7m0 y;
    public c4m0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vzg0 vzg0Var, i1w0 i1w0Var, a6u a6uVar, duj dujVar, l0s l0sVar, y78 y78Var, ctf0 ctf0Var, lbu lbuVar, pru pruVar, g2v g2vVar, zn00 zn00Var, luu luuVar, mne mneVar, m1e m1eVar, j3c j3cVar, je jeVar, s31 s31Var, cyu cyuVar) {
        super(vzg0Var, kotlin.collections.a.c(l0sVar));
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        this.c = i1w0Var;
        this.d = a6uVar;
        this.e = dujVar;
        this.f = l0sVar;
        this.g = y78Var;
        this.h = ctf0Var;
        this.i = lbuVar;
        this.j = g2vVar;
        this.k = zn00Var;
        this.l = luuVar;
        this.m = mneVar;
        this.n = m1eVar;
        this.o = j3cVar;
        this.p = jeVar;
        this.q = s31Var;
        this.r = cyuVar;
        this.s = maz.b(new hc0(pruVar, (byte) 20));
        FavoriteCategoryUiState favoriteCategoryUiState = (FavoriteCategoryUiState) vzg0Var.a("category_state_param_key");
        if (favoriteCategoryUiState == null) {
            throw new ss3();
        }
        this.u = favoriteCategoryUiState;
        this.v = maz.b(new kep(this, (byte) 0));
        this.w = maz.b(new kep(this, (byte) 1));
        this.x = q7m0.a(lep.f19914a);
        this.y = q7m0.a("");
        int iOrdinal = b.a(favoriteCategoryUiState).ordinal();
        if (iOrdinal == 0) {
            l0sVar.z = new cq2();
        } else if (iOrdinal == 1) {
            l0sVar.z = new aq2();
        } else {
            t9f.b();
            throw null;
        }
    }

    @Override // a.etr
    public final void b(kia kiaVar) {
        String str;
        long j = kiaVar.c;
        long j2 = kiaVar.d;
        long j3 = kiaVar.g;
        boolean z = kiaVar.e;
        FavoriteCategoryUiState favoriteCategoryUiState = this.u;
        if (favoriteCategoryUiState != null) {
            if (!(favoriteCategoryUiState instanceof FavoriteCategoryUiState.Team)) {
                str = favoriteCategoryUiState instanceof FavoriteCategoryUiState.Championship ? "favorite_championship" : "favorite_team";
            }
            this.p.f(j, j2, j3, str, z);
            this.f.b(kiaVar);
            return;
        }
        t9f.b();
    }

    @Override // a.etr
    public final void c(mia miaVar) {
        this.f.c(miaVar);
    }

    @Override // a.etr
    public final void d(oia oiaVar) {
        this.f.d(oiaVar);
    }

    @Override // a.f0s
    public final void e(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f.e(zxj0Var, m0k0Var);
    }

    @Override // a.f0s
    public final gmq h() {
        return this.f.B;
    }

    @Override // a.etr
    public final void i(iia iiaVar) {
        this.f.i(iiaVar);
    }

    @Override // a.f0s
    public final void j() {
        this.f.j();
    }

    @Override // a.etr
    public final void k(nia niaVar) {
        this.f.k(niaVar);
    }

    @Override // a.f0s
    public final ol60 l() {
        return this.f.A;
    }

    @Override // a.etr
    public final void m(oia oiaVar) {
        this.f.m(oiaVar);
    }

    @Override // a.f0s
    public final void n(m0k0 m0k0Var, m97 m97Var, boolean z) {
        this.f.n(m0k0Var, m97Var, z);
    }

    @Override // a.etr
    public final void o(lia liaVar) {
        this.f.o(liaVar);
    }

    @Override // a.f0s
    public final void q(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f.q(zxj0Var, m0k0Var);
    }

    @Override // a.etr
    public final void r(iia iiaVar) {
        l0s l0sVar = this.f;
        l0sVar.getClass();
        l0sVar.v(iiaVar, ctc.b);
    }

    public final void w() {
        c4m0 c4m0Var = this.z;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.z = qjj.W(jiu0.a(this), this.m.b, null, new atj(this, yjeVar, (byte) 4), 2);
    }

    public final void x(Throwable th) {
        pep pepVar = (pep) CollectionsKt.firstOrNull(this.x.d());
        if (((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) && (pepVar instanceof mep)) {
            th.printStackTrace();
        } else {
            this.e.b(th, new f5o(this, (byte) 16));
        }
    }
}
