package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La/y370;", "La/yx5;", "La/jhg0;", "La/cg60;", "<init>", "()V", "a/wsz", "games_list"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y370 extends yx5 implements jhg0, cg60 {
    public final i9o0 K1;
    public hdo0 L1;
    public oeg0 M1;
    public uf3 N1;
    public final boolean O1;
    public final phf0 P1;
    public final phf0 Q1;
    public final cgx0 R1;
    public final r34 S1;
    public final zz2 U1;
    public final a8z V1;
    public final a8z W1;
    public final n0o0 X1;
    public static final /* synthetic */ iiy[] Z1 = {new ez40(y370.class, "tabTag", "getTabTag()Ljava/lang/String;", 0), new ez40(y370.class, "webGameSessionId", "getWebGameSessionId()Ljava/lang/String;", 0), new ez40(y370.class, "restoredFragment", "getRestoredFragment()Z", 0), new ez40(y370.class, "gameIdToOpen", "getGameIdToOpen()J", 0), new ez40(y370.class, "promoTypeId", "getPromoTypeId()I", 0)};
    public static final wsz Y1 = new wsz();

    public y370() {
        super(R.layout.onexgames_tab_container_fragment);
        this.K1 = i9o0.f14396a;
        final byte b = 1;
        this.O1 = true;
        this.P1 = new phf0("ARG_TAB_TAG");
        this.Q1 = new phf0("WEB_GAME_SESSION_ID");
        this.R1 = new cgx0("ARG_RESTORED_FRAGMENT");
        this.S1 = new r34("ARG_GAME_ID", 0L);
        final byte b2 = 0;
        this.U1 = new zz2("ARG_PROMO_TYPE_ID", 0);
        Function0 function0 = new Function0(this) { // from class: a.x370
            public final /* synthetic */ y370 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                y370 y370Var = this.b;
                switch (b3) {
                    case 0:
                        return r270.valueOf(y370Var.P1.n(y370Var, y370.Z1[0]));
                    case 1:
                        hdo0 hdo0Var = y370Var.L1;
                        if (hdo0Var == null) {
                            Intrinsics.h("oneXGamesTabRouterHolder");
                            throw null;
                        }
                        r270 r270Var = (r270) y370Var.V1.getValue();
                        r270Var.getClass();
                        ConcurrentHashMap concurrentHashMap = hdo0Var.b;
                        Object obj = concurrentHashMap.get(r270Var);
                        if (obj == null) {
                            o1w0 o1w0Var = hdo0Var.f12879a;
                            o1w0Var.getClass();
                            i1w0 i1w0Var = new i1w0();
                            o1w0Var.a(i1w0Var);
                            ejc ejcVar = new ejc(i1w0Var);
                            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(r270Var, ejcVar);
                            obj = objPutIfAbsent == null ? ejcVar : objPutIfAbsent;
                        }
                        ejc ejcVar2 = (ejc) obj;
                        if (!y370Var.R1.n(y370Var, y370.Z1[2]).booleanValue()) {
                            ejcVar2.f7902a.d(new cd60(y370Var, (byte) 13));
                        }
                        return ejcVar2;
                    default:
                        wsz wszVar = y370.Y1;
                        kxq kxqVarN0 = y370Var.n0();
                        androidx.fragment.app.e eVarC = y370Var.C();
                        eVarC.getClass();
                        return new p270(kxqVarN0, eVarC, a4n0.e(y370Var));
                }
            }
        };
        wez wezVar = wez.b;
        this.V1 = maz.a(wezVar, function0);
        this.W1 = maz.a(wezVar, new Function0(this) { // from class: a.x370
            public final /* synthetic */ y370 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                y370 y370Var = this.b;
                switch (b3) {
                    case 0:
                        return r270.valueOf(y370Var.P1.n(y370Var, y370.Z1[0]));
                    case 1:
                        hdo0 hdo0Var = y370Var.L1;
                        if (hdo0Var == null) {
                            Intrinsics.h("oneXGamesTabRouterHolder");
                            throw null;
                        }
                        r270 r270Var = (r270) y370Var.V1.getValue();
                        r270Var.getClass();
                        ConcurrentHashMap concurrentHashMap = hdo0Var.b;
                        Object obj = concurrentHashMap.get(r270Var);
                        if (obj == null) {
                            o1w0 o1w0Var = hdo0Var.f12879a;
                            o1w0Var.getClass();
                            i1w0 i1w0Var = new i1w0();
                            o1w0Var.a(i1w0Var);
                            ejc ejcVar = new ejc(i1w0Var);
                            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(r270Var, ejcVar);
                            obj = objPutIfAbsent == null ? ejcVar : objPutIfAbsent;
                        }
                        ejc ejcVar2 = (ejc) obj;
                        if (!y370Var.R1.n(y370Var, y370.Z1[2]).booleanValue()) {
                            ejcVar2.f7902a.d(new cd60(y370Var, (byte) 13));
                        }
                        return ejcVar2;
                    default:
                        wsz wszVar = y370.Y1;
                        kxq kxqVarN0 = y370Var.n0();
                        androidx.fragment.app.e eVarC = y370Var.C();
                        eVarC.getClass();
                        return new p270(kxqVarN0, eVarC, a4n0.e(y370Var));
                }
            }
        });
        final byte b3 = 2;
        this.X1 = maz.b(new Function0(this) { // from class: a.x370
            public final /* synthetic */ y370 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                y370 y370Var = this.b;
                switch (b4) {
                    case 0:
                        return r270.valueOf(y370Var.P1.n(y370Var, y370.Z1[0]));
                    case 1:
                        hdo0 hdo0Var = y370Var.L1;
                        if (hdo0Var == null) {
                            Intrinsics.h("oneXGamesTabRouterHolder");
                            throw null;
                        }
                        r270 r270Var = (r270) y370Var.V1.getValue();
                        r270Var.getClass();
                        ConcurrentHashMap concurrentHashMap = hdo0Var.b;
                        Object obj = concurrentHashMap.get(r270Var);
                        if (obj == null) {
                            o1w0 o1w0Var = hdo0Var.f12879a;
                            o1w0Var.getClass();
                            i1w0 i1w0Var = new i1w0();
                            o1w0Var.a(i1w0Var);
                            ejc ejcVar = new ejc(i1w0Var);
                            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(r270Var, ejcVar);
                            obj = objPutIfAbsent == null ? ejcVar : objPutIfAbsent;
                        }
                        ejc ejcVar2 = (ejc) obj;
                        if (!y370Var.R1.n(y370Var, y370.Z1[2]).booleanValue()) {
                            ejcVar2.f7902a.d(new cd60(y370Var, (byte) 13));
                        }
                        return ejcVar2;
                    default:
                        wsz wszVar = y370.Y1;
                        kxq kxqVarN0 = y370Var.n0();
                        androidx.fragment.app.e eVarC = y370Var.C();
                        eVarC.getClass();
                        return new p270(kxqVarN0, eVarC, a4n0.e(y370Var));
                }
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        if (!(application instanceof vmv)) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
        if (applicationLoader.c() == null) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        g8i g8iVarC = applicationLoader.c();
        if (g8iVarC == null) {
            hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.OneXGamesDependencies");
            return;
        }
        i1w0 i1w0VarE = a4n0.e(this);
        i1w0VarE.getClass();
        new pmi(g8iVarC, i1w0VarE);
        hdo0 hdo0Var = (hdo0) g8iVarC.h5.get();
        x1x.x(hdo0Var);
        this.L1 = hdo0Var;
        oeg0 oeg0Var = (oeg0) g8iVarC.w3.get();
        x1x.x(oeg0Var);
        this.M1 = oeg0Var;
        this.N1 = g8iVarC.T();
        x1x.x(g8iVarC.h4());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        this.R1.v(this, Z1[2], bundle != null);
        super.W(bundle);
        C().u0("CHANGE_TAB_REQUEST_KEY", this, new ex60(this, (byte) 3));
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        o2t.d(eVarC, this, "OneXGamesTabContainerFragment.UM_RESULT_KEY", new zz(1, F(), o2t.class, "sendUMResult", "sendUMResult(Landroidx/fragment/app/FragmentManager;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V", 1, (byte) 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        eVarC.g("GamesActionsFragmentResultModel.UM_RESULT_KEYOneXGamesTabContainerFragment.UM_RESULT_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        ((ejc) this.W1.getValue()).f7902a.f14021a.b = null;
        oeg0 oeg0Var = this.M1;
        if (oeg0Var == null) {
            Intrinsics.h("rootRouterHolder");
            throw null;
        }
        oeg0Var.f25121a.remove(ghg0.f11297a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        oeg0 oeg0Var = this.M1;
        if (oeg0Var == null) {
            Intrinsics.h("rootRouterHolder");
            throw null;
        }
        a8z a8zVar = this.W1;
        oeg0Var.a(ghg0.f11297a, ((ejc) a8zVar.getValue()).f7902a);
        ((ejc) a8zVar.getValue()).f7902a.f14021a.q((rs3) this.X1.getValue());
    }

    @Override // a.jhg0
    public final i1w0 getRouter() {
        return ((ejc) this.W1.getValue()).f7902a;
    }

    @Override // a.cg60
    public final boolean j() {
        i0h0 i0h0VarI = C().I(R.id.onexgames_tab_content);
        cg60 cg60Var = i0h0VarI instanceof cg60 ? (cg60) i0h0VarI : null;
        if (cg60Var != null ? cg60Var.j() : true) {
            int iP = C().P();
            p0w0 p0w0Var = p0w0.f26173a;
            if (iP > 1) {
                i1w0 i1w0Var = ((ejc) this.W1.getValue()).f7902a;
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        break;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
            } else {
                i1w0 i1w0VarE = a4n0.e(this);
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarE);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0VarE, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        break;
                    }
                    i1w0VarE.a((oe50) pawVar2.next());
                }
            }
        }
        return false;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getW1() {
        return this.O1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
