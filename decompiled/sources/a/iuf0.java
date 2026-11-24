package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/iuf0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class iuf0 extends yx5 {
    public static final /* synthetic */ iiy[] R1 = {new j0d0(iuf0.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentResponsibleGameBinding;", 0)};
    public final hnm0 K1;
    public yri L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final n0o0 P1;
    public ndk0 Q1;

    public iuf0() {
        super(R.layout.fragment_responsible_game);
        this.K1 = hnm0.f13359a;
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.guf0
            public final /* synthetic */ iuf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                iuf0 iuf0Var = this.b;
                switch (b2) {
                    case 0:
                        iiy[] iiyVarArr = iuf0.R1;
                        i1w0 i1w0VarF = a4n0.f(iuf0Var);
                        yri yriVar = iuf0Var.L1;
                        if (yriVar != null) {
                            return new ry3(i1w0VarF, yriVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        iiy[] iiyVarArr2 = iuf0.R1;
                        aif0 aif0Var = new aif0(1, iuf0Var.H0(), wuf0.class, "onLinkClicked", "onLinkClicked$impl(Ljava/lang/String;)V", 0, (byte) 10);
                        due0 due0Var = new due0(2, iuf0Var.H0(), wuf0.class, "onListItemClicked", "onListItemClicked$impl(Lorg/xplatform/responsible_game/impl/presentation/responsible_game/models/ResponsibleUiEnum;Ljava/io/File;)V", 0, (byte) 8);
                        ttf0 ttf0Var = new ttf0(ttf0.f);
                        gbn gbnVar = new gbn(new vtf0((byte) 0), new o5c0(3, (byte) 20), new wtf0((byte) 0), x4c0.w);
                        dp dpVar = ttf0Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new k8e0((byte) 28), new o5c0(3, (byte) 18), new eme0(aif0Var, (byte) 15), x4c0.u));
                        dpVar.b(new gbn(new k8e0((byte) 27), new o5c0(3, (byte) 17), new eme0(due0Var, (byte) 14), x4c0.t));
                        dpVar.b(new gbn(new k8e0((byte) 29), new o5c0(3, (byte) 19), new bue0((byte) 29), x4c0.v));
                        return ttf0Var;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new lce0(new lce0(this, (byte) 21), (byte) 22));
        this.N1 = agc.G(this, sre0.f32672a.b(wuf0.class), new wbe0(a8zVarA, (byte) 22), new wbe0(a8zVarA, (byte) 23), function0);
        this.O1 = ltt0.o(this, huf0.f13678a);
        final byte b2 = 1;
        this.P1 = maz.b(new Function0(this) { // from class: a.guf0
            public final /* synthetic */ iuf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                iuf0 iuf0Var = this.b;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = iuf0.R1;
                        i1w0 i1w0VarF = a4n0.f(iuf0Var);
                        yri yriVar = iuf0Var.L1;
                        if (yriVar != null) {
                            return new ry3(i1w0VarF, yriVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        iiy[] iiyVarArr2 = iuf0.R1;
                        aif0 aif0Var = new aif0(1, iuf0Var.H0(), wuf0.class, "onLinkClicked", "onLinkClicked$impl(Ljava/lang/String;)V", 0, (byte) 10);
                        due0 due0Var = new due0(2, iuf0Var.H0(), wuf0.class, "onListItemClicked", "onListItemClicked$impl(Lorg/xplatform/responsible_game/impl/presentation/responsible_game/models/ResponsibleUiEnum;Ljava/io/File;)V", 0, (byte) 8);
                        ttf0 ttf0Var = new ttf0(ttf0.f);
                        gbn gbnVar = new gbn(new vtf0((byte) 0), new o5c0(3, (byte) 20), new wtf0((byte) 0), x4c0.w);
                        dp dpVar = ttf0Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new k8e0((byte) 28), new o5c0(3, (byte) 18), new eme0(aif0Var, (byte) 15), x4c0.u));
                        dpVar.b(new gbn(new k8e0((byte) 27), new o5c0(3, (byte) 17), new eme0(due0Var, (byte) 14), x4c0.t));
                        dpVar.b(new gbn(new k8e0((byte) 29), new o5c0(3, (byte) 19), new bue0((byte) 29), x4c0.v));
                        return ttf0Var;
                }
            }
        });
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        G0().h.setNavigationOnClickListener(new jpe0(this, b));
        RecyclerView recyclerView = G0().g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((ttf0) this.P1.getValue());
        final byte b2 = 0;
        vvw.o(recyclerView, false, 3);
        dyb.O(G0().c, new Function1(this) { // from class: a.fuf0
            public final /* synthetic */ iuf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                iuf0 iuf0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = iuf0.R1;
                        view.getClass();
                        iuf0Var.H0().w();
                        break;
                    default:
                        iiy[] iiyVarArr2 = iuf0.R1;
                        view.getClass();
                        iuf0Var.H0().x();
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O(G0().b, new Function1(this) { // from class: a.fuf0
            public final /* synthetic */ iuf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                iuf0 iuf0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = iuf0.R1;
                        view.getClass();
                        iuf0Var.H0().w();
                        break;
                    default:
                        iiy[] iiyVarArr2 = iuf0.R1;
                        view.getClass();
                        iuf0Var.H0().x();
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(juf0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            juf0 juf0Var = (juf0) (ze3Var instanceof juf0 ? ze3Var : null);
            if (juf0Var != null) {
                pyu pyuVar = juf0Var.o;
                uf3 uf3Var = juf0Var.b;
                duj dujVar = juf0Var.f17151a;
                btt0 btt0Var = juf0Var.c;
                b8u b8uVar = juf0Var.d;
                sek sekVar = juf0Var.e;
                vd1 vd1Var = juf0Var.f;
                vby vbyVar = juf0Var.g;
                sa10 sa10Var = juf0Var.h;
                knf0 knf0Var = juf0Var.i;
                m1e m1eVar = juf0Var.j;
                gii0 gii0Var = juf0Var.l;
                ii iiVar = juf0Var.k;
                pru pruVar = juf0Var.m;
                wdk0 wdk0Var = juf0Var.n;
                wsz wszVar = juf0Var.p;
                uuz uuzVar = juf0Var.q;
                jru jruVar = juf0Var.r;
                onv onvVar = juf0Var.s;
                xsu xsuVar = juf0Var.t;
                iiVar.getClass();
                btt0Var.getClass();
                vbyVar.getClass();
                knf0Var.getClass();
                m1eVar.getClass();
                gii0Var.getClass();
                wdk0Var.getClass();
                this.L1 = (yri) ((n5d0) new qv2(pyuVar, wszVar, uuzVar, jruVar, onvVar, xsuVar, iiVar, uf3Var, dujVar, btt0Var, b8uVar, sekVar, vd1Var, vbyVar, sa10Var, knf0Var, m1eVar, gii0Var, pruVar, wdk0Var).n).get();
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(juf0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().r;
        Class<iuf0> cls = iuf0.class;
        jjc0 jjc0Var = new jjc0(2, this, cls, "handleViewState", "handleViewState(Lorg/xplatform/responsible_game/impl/presentation/responsible_game/ResponsibleGamblingViewModel$ViewState;)V", 4, (byte) 21);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w7f0(p7m0Var, clzVarW, jjc0Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().s;
        int i = 4;
        jjc0 jjc0Var2 = new jjc0(2, this, cls, "handleContactsState", "handleContactsState(Lorg/xplatform/responsible_game/impl/presentation/responsible_game/ResponsibleGamblingViewModel$ContactsState;)V", i, (byte) 22);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new w7f0((gmq) p7m0Var2, clzVarW2, jjc0Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = H0().q;
        jjc0 jjc0Var3 = new jjc0(2, this, cls, "handlePolicyState", "handlePolicyState(Lorg/xplatform/responsible_game/impl/presentation/responsible_game/ResponsibleGamblingViewModel$PolicyUiState;)V", i, (byte) 23);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new w7f0((gmq) p7m0Var3, clzVarW3, jjc0Var3, (yje) null, (char) 0), 3);
        qoj0 qoj0Var = H0().t;
        jjc0 jjc0Var4 = new jjc0(2, this, cls, "handlePhoneUri", "handlePhoneUri(Landroid/net/Uri;)V", i, (byte) 24);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new w7f0(qoj0Var, clzVarW4, jjc0Var4, (yje) null, 0), 3);
    }

    public final g4r G0() {
        Object objN = this.O1.n(R1[0], this);
        objN.getClass();
        return (g4r) objN;
    }

    public final wuf0 H0() {
        return (wuf0) this.N1.getValue();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
