package a;

import a.m1r;
import a.ppe0;
import a.ufx;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import java.util.Collections;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.referral.api.presentation.ReferralNetworkParams;
import org.xplatform.referral.api.presentation.ReferralsListParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jne0;", "La/yx5;", "<init>", "()V", "a/gne0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jne0 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public ljf0 M1;
    public ii N1;
    public wdk0 O1;
    public final khf0 P1;
    public final kiu0 Q1;
    public final s0r R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(jne0.class, "params", "getParams()Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;", 0), new j0d0(jne0.class, "viewBinding", "getViewBinding()Lorg/xplatform/referral/impl/databinding/FragmentReferralNetworkBinding;", 0)};
    public static final gne0 S1 = new gne0((byte) 0);

    public jne0() {
        super(R.layout.fragment_referral_network);
        this.K1 = hnm0.f13359a;
        this.P1 = new khf0("params");
        dne0 dne0Var = new dne0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new lce0(new lce0(this, (byte) 3), (byte) 4));
        this.Q1 = agc.G(this, sre0.f32672a.b(xne0.class), new wbe0(a8zVarA, (byte) 6), new wbe0(a8zVarA, (byte) 7), dne0Var);
        this.R1 = ltt0.o(this, ine0.f15070a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        qcc.X(this, new dne0(this, b));
        final w3r w3rVarG0 = G0();
        zkk zkkVar = w3rVarG0.b;
        final byte b2 = 0;
        knm0.h((LinearLayout) zkkVar.g, false);
        ljf0 ljf0Var = this.M1;
        if (ljf0Var == null) {
            Intrinsics.h("shortReferralRecyclerFragmentDelegate");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) zkkVar.h;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((gkz) ljf0Var.f20148a);
        vvw.o(recyclerView, false, 3);
        recyclerView.setItemAnimator(null);
        recyclerView.setVisibility(0);
        zkk zkkVar2 = w3rVarG0.c;
        ((MaterialToolbar) zkkVar2.i).setNavigationOnClickListener(new l910(this, (byte) 28));
        dyb.O((MaterialButton) zkkVar2.g, new Function1(this) { // from class: a.ene0
            public final /* synthetic */ jne0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                jne0 jne0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        gne0 gne0Var = jne0.S1;
                        view.getClass();
                        xne0 xne0VarH0 = jne0Var.H0();
                        Object value = xne0VarH0.j.getValue();
                        one0 one0Var = value instanceof one0 ? (one0) value : null;
                        if (one0Var != null) {
                            sac.V(jiu0.a(xne0VarH0), new d8e0(1, xne0VarH0.h, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, null, new wne0(null, one0Var, xne0VarH0), 14);
                        }
                        break;
                    case 1:
                        gne0 gne0Var2 = jne0.S1;
                        view.getClass();
                        xne0 xne0VarH1 = jne0Var.H0();
                        final ReferralsListParams referralsListParams = new ReferralsListParams(((ReferralNetworkParams) jne0Var.P1.n(jne0Var, jne0.U1[0])).f46844a.e);
                        pzu pzuVar = xne0VarH1.g;
                        pzuVar.getClass();
                        i1w0 i1w0VarC = ((oeg0) pzuVar.f27863a).c();
                        k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                        k0w0VarI.h(new FragmentScreen() { // from class: org.xplatform.referral.impl.navigation.ReferralProgramScreenFactoryImpl$referralsListScreen$1
                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            public final Fragment a(m1r m1rVar) {
                                m1rVar.getClass();
                                ppe0.S1.getClass();
                                ppe0 ppe0Var = new ppe0();
                                ppe0Var.O1.J(ppe0Var, ppe0.U1[0], referralsListParams);
                                return ppe0Var;
                            }

                            @Override // a.m7h0
                            /* JADX INFO: renamed from: b */
                            public final String getF45455a() {
                                return ufx.C(this);
                            }

                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            /* JADX INFO: renamed from: g */
                            public final /* bridge */ boolean getB() {
                                return true;
                            }
                        });
                        ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        gne0 gne0Var3 = jne0.S1;
                        view.getClass();
                        pzu pzuVar2 = jne0Var.H0().g;
                        ((oeg0) pzuVar2.f27863a).c().d(new bod0(pzuVar2));
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O((MaterialButton) zkkVar.b, new Function1(this) { // from class: a.fne0
            public final /* synthetic */ jne0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                w3r w3rVar = w3rVarG0;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        gne0 gne0Var = jne0.S1;
                        view.getClass();
                        xne0 xne0VarH0 = this.b.H0();
                        String string = w3rVar.b.d.getText().toString();
                        string.getClass();
                        pzu pzuVar = xne0VarH0.g;
                        pzuVar.getClass();
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", string);
                        intent.setType("text/plain");
                        Intent intentCreateChooser = Intent.createChooser(intent, null);
                        intentCreateChooser.addFlags(268435456);
                        ((us00) pzuVar.b).startActivity(intentCreateChooser);
                        return Unit.f46060a;
                    default:
                        gne0 gne0Var2 = jne0.S1;
                        view.getClass();
                        jne0 jne0Var = this.b;
                        wdk0 wdk0Var = jne0Var.O1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        String string2 = w3rVar.b.d.getText().toString();
                        String strH = jne0Var.H(R.string.referral_url_was_copy);
                        strH.getClass();
                        j120.M(jne0Var, wdk0Var, "referralUrl", string2, strH, null, Integer.valueOf(R.drawable.data_copy_icon), null, 80);
                        return Unit.f46060a;
                }
            }
        });
        dyb.O((TextView) zkkVar.e, new Function1(this) { // from class: a.ene0
            public final /* synthetic */ jne0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                jne0 jne0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        gne0 gne0Var = jne0.S1;
                        view.getClass();
                        xne0 xne0VarH0 = jne0Var.H0();
                        Object value = xne0VarH0.j.getValue();
                        one0 one0Var = value instanceof one0 ? (one0) value : null;
                        if (one0Var != null) {
                            sac.V(jiu0.a(xne0VarH0), new d8e0(1, xne0VarH0.h, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, null, new wne0(null, one0Var, xne0VarH0), 14);
                        }
                        break;
                    case 1:
                        gne0 gne0Var2 = jne0.S1;
                        view.getClass();
                        xne0 xne0VarH1 = jne0Var.H0();
                        final ReferralsListParams referralsListParams = new ReferralsListParams(((ReferralNetworkParams) jne0Var.P1.n(jne0Var, jne0.U1[0])).f46844a.e);
                        pzu pzuVar = xne0VarH1.g;
                        pzuVar.getClass();
                        i1w0 i1w0VarC = ((oeg0) pzuVar.f27863a).c();
                        k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                        k0w0VarI.h(new FragmentScreen() { // from class: org.xplatform.referral.impl.navigation.ReferralProgramScreenFactoryImpl$referralsListScreen$1
                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            public final Fragment a(m1r m1rVar) {
                                m1rVar.getClass();
                                ppe0.S1.getClass();
                                ppe0 ppe0Var = new ppe0();
                                ppe0Var.O1.J(ppe0Var, ppe0.U1[0], referralsListParams);
                                return ppe0Var;
                            }

                            @Override // a.m7h0
                            /* JADX INFO: renamed from: b */
                            public final String getF45455a() {
                                return ufx.C(this);
                            }

                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            /* JADX INFO: renamed from: g */
                            public final /* bridge */ boolean getB() {
                                return true;
                            }
                        });
                        ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        gne0 gne0Var3 = jne0.S1;
                        view.getClass();
                        pzu pzuVar2 = jne0Var.H0().g;
                        ((oeg0) pzuVar2.f27863a).c().d(new bod0(pzuVar2));
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O((LinearLayout) zkkVar.i, new Function1(this) { // from class: a.fne0
            public final /* synthetic */ jne0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                w3r w3rVar = w3rVarG0;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        gne0 gne0Var = jne0.S1;
                        view.getClass();
                        xne0 xne0VarH0 = this.b.H0();
                        String string = w3rVar.b.d.getText().toString();
                        string.getClass();
                        pzu pzuVar = xne0VarH0.g;
                        pzuVar.getClass();
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", string);
                        intent.setType("text/plain");
                        Intent intentCreateChooser = Intent.createChooser(intent, null);
                        intentCreateChooser.addFlags(268435456);
                        ((us00) pzuVar.b).startActivity(intentCreateChooser);
                        return Unit.f46060a;
                    default:
                        gne0 gne0Var2 = jne0.S1;
                        view.getClass();
                        jne0 jne0Var = this.b;
                        wdk0 wdk0Var = jne0Var.O1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        String string2 = w3rVar.b.d.getText().toString();
                        String strH = jne0Var.H(R.string.referral_url_was_copy);
                        strH.getClass();
                        j120.M(jne0Var, wdk0Var, "referralUrl", string2, strH, null, Integer.valueOf(R.drawable.data_copy_icon), null, 80);
                        return Unit.f46060a;
                }
            }
        });
        final byte b3 = 2;
        dyb.O((ImageView) zkkVar2.b, new Function1(this) { // from class: a.ene0
            public final /* synthetic */ jne0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                jne0 jne0Var = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        gne0 gne0Var = jne0.S1;
                        view.getClass();
                        xne0 xne0VarH0 = jne0Var.H0();
                        Object value = xne0VarH0.j.getValue();
                        one0 one0Var = value instanceof one0 ? (one0) value : null;
                        if (one0Var != null) {
                            sac.V(jiu0.a(xne0VarH0), new d8e0(1, xne0VarH0.h, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, null, new wne0(null, one0Var, xne0VarH0), 14);
                        }
                        break;
                    case 1:
                        gne0 gne0Var2 = jne0.S1;
                        view.getClass();
                        xne0 xne0VarH1 = jne0Var.H0();
                        final ReferralsListParams referralsListParams = new ReferralsListParams(((ReferralNetworkParams) jne0Var.P1.n(jne0Var, jne0.U1[0])).f46844a.e);
                        pzu pzuVar = xne0VarH1.g;
                        pzuVar.getClass();
                        i1w0 i1w0VarC = ((oeg0) pzuVar.f27863a).c();
                        k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                        k0w0VarI.h(new FragmentScreen() { // from class: org.xplatform.referral.impl.navigation.ReferralProgramScreenFactoryImpl$referralsListScreen$1
                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            public final Fragment a(m1r m1rVar) {
                                m1rVar.getClass();
                                ppe0.S1.getClass();
                                ppe0 ppe0Var = new ppe0();
                                ppe0Var.O1.J(ppe0Var, ppe0.U1[0], referralsListParams);
                                return ppe0Var;
                            }

                            @Override // a.m7h0
                            /* JADX INFO: renamed from: b */
                            public final String getF45455a() {
                                return ufx.C(this);
                            }

                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            /* JADX INFO: renamed from: g */
                            public final /* bridge */ boolean getB() {
                                return true;
                            }
                        });
                        ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        gne0 gne0Var3 = jne0.S1;
                        view.getClass();
                        pzu pzuVar2 = jne0Var.H0().g;
                        ((oeg0) pzuVar2.f27863a).c().d(new bod0(pzuVar2));
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "approveMoveMoney", new dne0(this, b3));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kne0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            kne0 kne0Var = (kne0) (ze3Var instanceof kne0 ? ze3Var : null);
            if (kne0Var != null) {
                ReferralNetworkParams referralNetworkParams = (ReferralNetworkParams) this.P1.n(this, U1[0]);
                btt0 btt0Var = kne0Var.b;
                gst0 gst0Var = kne0Var.c;
                gii0 gii0Var = kne0Var.d;
                wsf0 wsf0Var = kne0Var.g;
                ii iiVar = kne0Var.e;
                pzu pzuVar = kne0Var.f18582a;
                duj dujVar = kne0Var.f;
                zpu zpuVar = kne0Var.h;
                ioe0 ioe0Var = kne0Var.i;
                wdk0 wdk0Var = kne0Var.j;
                iiVar.getClass();
                btt0Var.getClass();
                gst0Var.getClass();
                gii0Var.getClass();
                ioe0Var.getClass();
                wdk0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = referralNetworkParams;
                ruVar.c = ioe0Var;
                ruVar.d = gii0Var;
                ruVar.e = btt0Var;
                ruVar.f = gst0Var;
                ruVar.g = wsf0Var;
                ruVar.h = pzuVar;
                ruVar.b = dujVar;
                ruVar.i = zpuVar;
                ruVar.j = new ppi(ruVar, (byte) 25);
                this.L1 = new fiu0(Collections.singletonMap(xne0.class, (ppi) ruVar.j));
                gkz gkzVar = new gkz(gkz.i);
                gkzVar.d.b(new gbn(new ogj0((byte) 16), new gsh0(3, (byte) 29), new thj0((byte) 10), wjj0.f));
                this.M1 = new ljf0(gkzVar);
                this.N1 = iiVar;
                this.O1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(kne0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().j;
        hne0 hne0Var = new hne0(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g4e0(p7m0Var, clzVarW, hne0Var, (yje) null), 3);
        qoj0 qoj0Var = H0().k;
        hne0 hne0Var2 = new hne0(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g4e0(qoj0Var, clzVarW2, hne0Var2, (yje) null, (byte) 0), 3);
    }

    public final w3r G0() {
        Object objN = this.R1.n(U1[1], this);
        objN.getClass();
        return (w3r) objN;
    }

    public final xne0 H0() {
        return (xne0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        if (this.M1 != null) {
            ((RecyclerView) G0().b.h).setAdapter(null);
        } else {
            Intrinsics.h("shortReferralRecyclerFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
