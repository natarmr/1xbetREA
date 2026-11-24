package a;

import android.content.ComponentCallbacks2;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/cnj0;", "La/yx5;", "La/rg90;", "<init>", "()V", "a/gne0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cnj0 extends yx5 implements rg90 {
    public final hnm0 K1;
    public fiu0 L1;
    public ii M1;
    public final s0r N1;
    public final kiu0 O1;
    public final phf0 P1;
    public final n0o0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(cnj0.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/ShareCouponHistoryFragmentBinding;", 0), new ez40(cnj0.class, "couponId", "getCouponId()Ljava/lang/String;", 0)};
    public static final gne0 R1 = new gne0((byte) 21);
    public static final String U1 = Environment.DIRECTORY_DOWNLOADS;

    public cnj0() {
        super(R.layout.share_coupon_history_fragment);
        this.K1 = hnm0.f13359a;
        this.N1 = ltt0.o(this, ymj0.f42892a);
        xmj0 xmj0Var = new xmj0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new l9i0(new l9i0(this, (byte) 14), (byte) 15));
        this.O1 = agc.G(this, sre0.f32672a.b(hoj0.class), new s9i0(a8zVarA, (byte) 12), new s9i0(a8zVarA, (byte) 13), xmj0Var);
        this.P1 = new phf0("KEY_COUPON_ID");
        this.Q1 = maz.b(new xmj0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qog0 qog0Var = (qog0) this.Q1.getValue();
        qog0Var.getClass();
        qog0Var.f29072a.add(this);
        final byte b = 0;
        G0().g.setOnClickListener(new View.OnClickListener(this) { // from class: a.vmj0
            public final /* synthetic */ cnj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                cnj0 cnj0Var = this.b;
                switch (b2) {
                    case 0:
                        gne0 gne0Var = cnj0.R1;
                        i1w0 i1w0Var = cnj0Var.H0().j;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        gne0 gne0Var2 = cnj0.R1;
                        ((qog0) cnj0Var.Q1.getValue()).a();
                        break;
                }
            }
        });
        dyb.N(G0().d, ymx.INTERVAL_500, new Function1(this) { // from class: a.wmj0
            public final /* synthetic */ cnj0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                cnj0 cnj0Var = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        gne0 gne0Var = cnj0.R1;
                        view.getClass();
                        hoj0 hoj0VarH0 = cnj0Var.H0();
                        sac.V(jiu0.a(hoj0VarH0), new uki0(1, hoj0VarH0.k, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, hoj0VarH0.f.b, new goj0(hoj0VarH0, null, (byte) 2), 10);
                        break;
                    default:
                        gne0 gne0Var2 = cnj0.R1;
                        view.getClass();
                        cnj0Var.H0().w();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        G0().c.setOnClickListener(new View.OnClickListener(this) { // from class: a.vmj0
            public final /* synthetic */ cnj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                cnj0 cnj0Var = this.b;
                switch (b3) {
                    case 0:
                        gne0 gne0Var = cnj0.R1;
                        i1w0 i1w0Var = cnj0Var.H0().j;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        gne0 gne0Var2 = cnj0.R1;
                        ((qog0) cnj0Var.Q1.getValue()).a();
                        break;
                }
            }
        });
        dyb.O(G0().b, new Function1(this) { // from class: a.wmj0
            public final /* synthetic */ cnj0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                cnj0 cnj0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        gne0 gne0Var = cnj0.R1;
                        view.getClass();
                        hoj0 hoj0VarH0 = cnj0Var.H0();
                        sac.V(jiu0.a(hoj0VarH0), new uki0(1, hoj0VarH0.k, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, hoj0VarH0.f.b, new goj0(hoj0VarH0, null, (byte) 2), 10);
                        break;
                    default:
                        gne0 gne0Var2 = cnj0.R1;
                        view.getClass();
                        cnj0Var.H0().w();
                        break;
                }
                return Unit.f46060a;
            }
        });
        knm0.h(G0().c, false);
        knm0.h(G0().d, false);
        ccq0.V(this, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", new xmj0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qmj0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qmj0 qmj0Var = (qmj0) (ze3Var instanceof qmj0 ? ze3Var : null);
            if (qmj0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.P1.n(this, S1[1]);
                File cacheDir = o0().getCacheDir();
                cacheDir.getClass();
                v5i v5iVarA = qmj0Var.a(i1w0VarF, strN, cacheDir);
                this.L1 = v5iVarA.o();
                this.M1 = (ii) v5iVarA.t;
                return;
            }
        }
        jf4.n(b1j.i(qmj0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().n;
        yje yjeVar = null;
        bnj0 bnj0Var = new bnj0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zmj0(p7m0Var, clzVarW, bnj0Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().o;
        bnj0 bnj0Var2 = new bnj0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zmj0(p7m0Var2, clzVarW2, bnj0Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = H0().p;
        bnj0 bnj0Var3 = new bnj0(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zmj0((gmq) p7m0Var3, clzVarW3, bnj0Var3, (yje) null, (char) 0), 3);
    }

    public final dnj0 G0() {
        Object objN = this.N1.n(S1[0], this);
        objN.getClass();
        return (dnj0) objN;
    }

    public final hoj0 H0() {
        return (hoj0) this.O1.getValue();
    }

    public final void I0() {
        ii iiVar = this.M1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.confirmation);
        String strH2 = H(R.string.permission_message_data_text);
        String strH3 = H(R.string.permission_allow_button_text);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    public final void J0(Uri uri, String str, String str2) {
        g760 g760Var = new g760(o0(), str2);
        g760Var.s.icon = R.drawable.ic_save;
        g760Var.e = g760.b(H(R.string.download_completed_text));
        g760Var.f = g760.b(str);
        g760Var.j = 0;
        g760Var.c(true);
        g760Var.g = sj3.u0(o0(), uri);
        o760 o760Var = new o760(o0());
        f1e0.f8761a.getClass();
        o760Var.a(f1e0.b.b(), g760Var.a());
    }

    @Override // a.rg90
    public final void d(ArrayList arrayList) {
        if (!n7x.p(arrayList)) {
            if (n7x.s(arrayList)) {
                I0();
                return;
            } else {
                I0();
                return;
            }
        }
        hoj0 hoj0VarH0 = H0();
        sac.V(jiu0.a(hoj0VarH0), new uki0(1, hoj0VarH0.k, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, hoj0VarH0.f.b, new goj0(hoj0VarH0, null, (byte) 1), 10);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
