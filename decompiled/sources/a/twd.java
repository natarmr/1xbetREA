package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class twd extends i3t0 {
    public final rqc A;
    public final ni9 B;
    public final au0 C;
    public final bsc D;
    public final mne E;
    public final f4u F;
    public final lpi0 G;
    public final o470 H;
    public final wgu o;
    public final noc p;
    public final rpc q;
    public final rrc r;
    public final yoc s;
    public final yoc t;
    public final grc u;
    public final gsb v;
    public final zg w;
    public final c1d0 x;
    public final pek0 y;
    public final noc z;

    public twd(wgu wguVar, noc nocVar, rpc rpcVar, rrc rrcVar, yoc yocVar, yoc yocVar2, grc grcVar, gsb gsbVar, zg zgVar, c1d0 c1d0Var, pek0 pek0Var, noc nocVar2, rqc rqcVar, ni9 ni9Var, au0 au0Var, bsc bscVar, ctf0 ctf0Var, mne mneVar, f4u f4uVar, lpi0 lpi0Var, o470 o470Var) {
        wguVar.getClass();
        c1d0Var.getClass();
        ctf0Var.getClass();
        owd owdVar = new owd(ctf0Var, (byte) 0);
        y2d y2dVar = new y2d((byte) 29);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, owdVar, y2dVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = wguVar;
        this.p = nocVar;
        this.q = rpcVar;
        this.r = rrcVar;
        this.s = yocVar;
        this.t = yocVar2;
        this.u = grcVar;
        this.v = gsbVar;
        this.w = zgVar;
        this.x = c1d0Var;
        this.y = pek0Var;
        this.z = nocVar2;
        this.A = rqcVar;
        this.B = ni9Var;
        this.C = au0Var;
        this.D = bscVar;
        this.E = mneVar;
        this.F = f4uVar;
        this.G = lpi0Var;
        this.H = o470Var;
        sac.V(jiu0.a(this), swd.f32917a, null, rwjVar, new rwd(this, null, (byte) 1), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(zje zjeVar) {
        pwd pwdVar;
        if (zjeVar instanceof pwd) {
            pwdVar = (pwd) zjeVar;
            int i = pwdVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pwdVar.k = i - Integer.MIN_VALUE;
            } else {
                pwdVar = new pwd(this, zjeVar);
            }
        } else {
            pwdVar = new pwd(this, zjeVar);
        }
        Object obj = pwdVar.i;
        wne wneVar = wne.f39444a;
        int i2 = pwdVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            String string = this.p.f23861a.c.a().getString("ISO_CODE_TO_CHANGE", "");
            String str = string != null ? string : "";
            if (str.length() > 0) {
                kuy kuyVar = (kuy) ((yox) this.H.f24619a).f43005a;
                kuyVar.getClass();
                kuyVar.b = str;
                kuyVar.f18934a.g("ISO_CODE_KEY", str);
            }
            lpi0 lpi0Var = this.G;
            pwdVar.k = 1;
            if (lpi0Var.a(pwdVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        ukt uktVar = this.A.f30924a.b;
        uktVar.f35844a.clear();
        uktVar.b.clear();
        uktVar.c.clear();
        this.q.a();
        ((emg0) ((pzu) this.r.b).f27863a).f8045a.clear();
        this.u.a();
        pbt pbtVar = this.s.f42977a;
        g7d g7dVar = pbtVar.c;
        g7dVar.e(null);
        g7dVar.g.n(xun.f41520a);
        pbtVar.e.a();
        pbt pbtVar2 = this.t.f42977a;
        pbtVar2.d.f26269a.h("GAME_ACTIONS_KEY");
        pbtVar2.e.a();
        this.v.f11822a.b.f44472a = null;
        ((lye) this.B.f23572a.f10647a).d.clear();
        this.x.c().f25728a.f41850a.f15729a.o(null, new l1d0(0L));
        vff0 vff0Var = this.z.f23861a;
        vff0Var.o = null;
        vff0Var.p = null;
        vff0Var.q = null;
        vff0Var.k.clear();
        vff0Var.j.clear();
        vff0Var.m.clear();
        this.y.getClass();
        z220 z220Var = this.D.f3123a;
        ((yvn0) z220Var.d).e = 0L;
        iun iunVar = iun.f15405a;
        z220Var.a(iunVar);
        z220Var.b(iunVar);
        ((yvn0) z220Var.d).f43330a.d("KEY_PREF_SWIPE_ACTION_CONFIRM_REQUIRE", true);
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        cwd cwdVar = (cwd) obj;
        cwdVar.getClass();
        boolean z = cwdVar instanceof zvd;
        ewd ewdVar = ewd.f8518a;
        if (z) {
            G(ewdVar);
            return;
        }
        if (cwdVar instanceof awd) {
            this.w.h(((gwd) D()).c, hfc.RELOAD_LATER);
            this.C.o(((gwd) D()).c, "reload_later");
            G(ewdVar);
            return;
        }
        if (cwdVar instanceof bwd) {
            sac.V(jiu0.a(this), qwd.f29429a, null, this.E.f22085a, new rwd(this, null, (byte) 0), 10);
            G(dwd.f6793a);
        } else if (cwdVar instanceof yvd) {
            E();
        }
    }
}
