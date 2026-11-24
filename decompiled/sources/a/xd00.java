package a;

import android.content.ComponentCallbacks2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xd00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40674a;
    public final /* synthetic */ ce00 b;

    public /* synthetic */ xd00(ce00 ce00Var, byte b) {
        this.f40674a = b;
        this.b = ce00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40674a;
        ce00 ce00Var = this.b;
        switch (b) {
            case 0:
                wsz wszVar = ce00.P1;
                ComponentCallbacks2 application = ce00Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(de00.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof de00)) {
                        ze3Var = null;
                    }
                    de00 de00Var = (de00) ze3Var;
                    if (de00Var != null) {
                        i1w0 i1w0VarF = a4n0.f(ce00Var);
                        i1w0VarF.getClass();
                        gr70 gr70Var = de00Var.y;
                        y3v y3vVar = de00Var.C;
                        db dbVar = de00Var.f5923a;
                        lp4 lp4Var = de00Var.b;
                        ugf0 ugf0Var = de00Var.d;
                        ok50 ok50Var = de00Var.e;
                        e6e e6eVar = de00Var.c;
                        y58 y58Var = de00Var.f;
                        hru hruVar = de00Var.g;
                        bwl bwlVar = de00Var.h;
                        mct mctVar = de00Var.i;
                        roi0 roi0Var = de00Var.j;
                        he1 he1Var = de00Var.k;
                        wsf0 wsf0Var = de00Var.m;
                        yqc yqcVar = de00Var.l;
                        zx10 zx10Var = de00Var.n;
                        lef0 lef0Var = de00Var.o;
                        iip iipVar = de00Var.p;
                        pyg pygVar = de00Var.q;
                        ok50 ok50Var2 = de00Var.r;
                        nr00 nr00Var = de00Var.s;
                        nh70 nh70Var = de00Var.t;
                        peg0 peg0Var = de00Var.u;
                        evz evzVar = de00Var.A;
                        s2m0 s2m0Var = de00Var.v;
                        zx10 zx10Var2 = de00Var.w;
                        kl5 kl5Var = de00Var.x;
                        qho qhoVar = de00Var.z;
                        r2u r2uVar = de00Var.B;
                        nv20 nv20Var = de00Var.D;
                        wxs0 wxs0Var = de00Var.E;
                        gr70Var.getClass();
                        e6eVar.getClass();
                        lp4Var.getClass();
                        y58Var.getClass();
                        mctVar.getClass();
                        iipVar.getClass();
                        pygVar.getClass();
                        return new uji(dbVar, ugf0Var, e6eVar, lp4Var, ok50Var, hruVar, bwlVar, mctVar, roi0Var, he1Var, yqcVar, wsf0Var, zx10Var, lef0Var, iipVar, pygVar, ok50Var2, nr00Var, nh70Var, s2m0Var, zx10Var2, kl5Var, peg0Var, gr70Var, evzVar, nv20Var, wxs0Var, i1w0VarF, qhoVar, r2uVar, y3vVar);
                    }
                }
                jf4.n(b1j.i(de00.class, "Cannot create dependency "));
                return null;
            case 1:
                wsz wszVar2 = ce00.P1;
                return (tji) ((uji) ce00Var.M1.getValue()).y.get();
            default:
                wsz wszVar3 = ce00.P1;
                wd00 wd00Var = new wd00(ce00Var, (byte) 1);
                wd00 wd00Var2 = new wd00(ce00Var, (byte) 2);
                Class<ef00> cls = ef00.class;
                e000 e000Var = new e000(2, ce00Var.H0(), cls, "onOneXGameClicked", "onOneXGameClicked(Lorg/xplatform/uikit_web_games/game_collection/GameCollectionItemModel;Ljava/lang/String;)V", 0, (byte) 2);
                byte b2 = 3;
                wd00 wd00Var3 = new wd00(ce00Var, b2);
                wd00 wd00Var4 = new wd00(ce00Var, (byte) 4);
                o0t o0tVar = new o0t(0, ce00Var.H0(), cls, "onEndCallClicked", "onEndCallClicked()V", 0, (byte) 12);
                vd00 vd00Var = new vd00();
                gbn gbnVarN = phu0.N(wd00Var);
                dp dpVar = vd00Var.d;
                dpVar.b(gbnVarN);
                dpVar.b(k9x.L(wd00Var));
                dpVar.b(egm0.i(wd00Var));
                dpVar.b(m7x.L(wd00Var2));
                dpVar.b(gkb.T(wd00Var));
                dpVar.b(e3c.y(wd00Var));
                dpVar.b(pym0.k(wd00Var, e000Var));
                dpVar.b(pzw.H(wd00Var));
                dpVar.b(ro4.X(wd00Var));
                dpVar.b(rsr0.U(o0tVar, wd00Var));
                dpVar.b(new gbn(new b4u0((byte) 21), new d8q0(b2, (byte) 24), new sbt0(wd00Var3, (byte) 26), mnu0.c));
                dpVar.b(p8a.Q(wd00Var4));
                dpVar.b(ycm0.r(wd00Var));
                dpVar.b(wvb.Q(wd00Var));
                dpVar.b(new gbn(new efr0((byte) 28), new d8q0(b2, (byte) 17), new xar0(wd00Var, (byte) 22), pfo0.z));
                dpVar.b(q7x.A(wd00Var));
                return vd00Var;
        }
    }
}
