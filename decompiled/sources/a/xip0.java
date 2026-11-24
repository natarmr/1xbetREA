package a;

import android.content.ComponentCallbacks2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/xip0;", "La/nw5;", "La/ijp0;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xip0 extends nw5<ijp0> {
    public fiu0 e2;
    public final kiu0 f2;
    public final phf0 g2;
    public final phf0 h2;
    public final zz2 i2;
    public final zz2 j2;
    public final es k2;
    public final a8z l2;
    public final nae0 m2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(xip0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(xip0.class, "title", "getTitle()Ljava/lang/String;", 0), new ez40(xip0.class, "gameId", "getGameId()I", 0), new ez40(xip0.class, "playerId", "getPlayerId()I", 0), new ez40(xip0.class, "teamValuesIds", "getTeamValuesIds()Ljava/util/List;", 0), new j0d0(xip0.class, "binding", "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/TeamSelectorDialogBinding;", 0)};
    public static final g9m0 n2 = new g9m0();

    public xip0() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.vip0
            public final /* synthetic */ xip0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                xip0 xip0Var = this.b;
                switch (b2) {
                    case 0:
                        fiu0 fiu0Var = xip0Var.e2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        g9m0 g9m0Var = xip0.n2;
                        ttn0 ttn0Var = new ttn0(xip0Var, (byte) 26);
                        uip0 uip0Var = new uip0();
                        dp dpVar = (dp) uip0Var.e;
                        dpVar.b(new gbn(new hhd((byte) 27), new l9(3, (byte) 16), new wt(ttn0Var, (byte) 0), m9.r));
                        dpVar.b(new gbn(new k8e0((byte) 24), new o5c0(3, (byte) 16), new wt(ttn0Var, (byte) 1), x4c0.s));
                        return uip0Var;
                }
            }
        };
        mfo0 mfo0Var = new mfo0(this, (byte) 9);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new mfo0(mfo0Var, (byte) 10));
        this.f2 = agc.G(this, sre0.f32672a.b(ujp0.class), new r5p0(a8zVarA, (byte) 2), new r5p0(a8zVarA, (byte) 3), function0);
        this.g2 = new phf0("EXTRA_REQUEST_KEY");
        this.h2 = new phf0("EXTRA_TITLE");
        this.i2 = new zz2("EXTRA_GAME_ID");
        this.j2 = new zz2("EXTRA_PLAYER_ID");
        this.k2 = new es("EXTRA_ITEMS");
        final byte b2 = 1;
        this.l2 = maz.a(wezVar, new Function0(this) { // from class: a.vip0
            public final /* synthetic */ xip0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                xip0 xip0Var = this.b;
                switch (b3) {
                    case 0:
                        fiu0 fiu0Var = xip0Var.e2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        g9m0 g9m0Var = xip0.n2;
                        ttn0 ttn0Var = new ttn0(xip0Var, (byte) 26);
                        uip0 uip0Var = new uip0();
                        dp dpVar = (dp) uip0Var.e;
                        dpVar.b(new gbn(new hhd((byte) 27), new l9(3, (byte) 16), new wt(ttn0Var, (byte) 0), m9.r));
                        dpVar.b(new gbn(new k8e0((byte) 24), new o5c0(3, (byte) 16), new wt(ttn0Var, (byte) 1), x4c0.s));
                        return uip0Var;
                }
            }
        });
        this.m2 = ltt0.p(this, wip0.f39228a);
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.m2.n(o2[5], this);
        objN.getClass();
        return (ijp0) objN;
    }

    @Override // a.nw5
    public final void O0() throws Exception {
        iiy[] iiyVarArr = o2;
        iiy iiyVar = iiyVarArr[5];
        nae0 nae0Var = this.m2;
        Object objN = nae0Var.n(iiyVar, this);
        objN.getClass();
        ((ijp0) objN).b.setAdapter((uip0) this.l2.getValue());
        wn8 wn8Var = new wn8(epv0.U(R.drawable.divider_drawable_opacity, o0()), (byte) 1);
        Object objN2 = nae0Var.n(iiyVarArr[5], this);
        objN2.getClass();
        ((ijp0) objN2).b.m(wn8Var);
        xae0 xae0VarN = vtb.N(((ujp0) this.f2.getValue()).b);
        ssl0 ssl0Var = new ssl0((Object) this, (yje) null, (byte) 15);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new lto0(xae0VarN, clzVarW, ssl0Var, (yje) null), 3);
    }

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(jjp0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            jjp0 jjp0Var = (jjp0) (ze3Var instanceof jjp0 ? ze3Var : null);
            if (jjp0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                List listN = this.k2.n(this, o2[4]);
                i1w0VarF.getClass();
                cad cadVar = jjp0Var.f16629a;
                ctf0 ctf0Var = jjp0Var.b;
                ctf0Var.getClass();
                this.e2 = new kki(cadVar, listN, ctf0Var).A();
                return;
            }
        }
        jf4.n(b1j.i(jjp0.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.root;
    }

    @Override // a.nw5
    public final String S0() {
        return this.h2.n(this, o2[1]);
    }
}
