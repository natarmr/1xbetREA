package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/nmq0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nmq0 extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(nmq0.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentTimeoutBinding;", 0)};
    public ixi K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final n0o0 P1;

    public nmq0() {
        super(R.layout.fragment_timeout);
        imq0 imq0Var = new imq0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new mfo0(new mfo0(this, (byte) 27), (byte) 28));
        this.N1 = agc.G(this, sre0.f32672a.b(wmq0.class), new r5p0(a8zVarA, (byte) 20), new r5p0(a8zVarA, (byte) 21), imq0Var);
        this.O1 = ltt0.o(this, lmq0.f20310a);
        this.P1 = maz.b(new imq0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().c.c.setText(H(R.string.limit_for_24h));
        G0().g.c.setText(H(R.string.limit_for_7d));
        G0().d.c.setText(H(R.string.limit_for_30d));
        final byte b = 0;
        G0().b.setOnClickListener(new View.OnClickListener(this) { // from class: a.jmq0
            public final /* synthetic */ nmq0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                nmq0 nmq0Var = this.b;
                switch (b2) {
                    case 0:
                        iiy[] iiyVarArr = nmq0.Q1;
                        ii iiVar = nmq0Var.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = nmq0Var.H(R.string.caution);
                        String strH2 = nmq0Var.H(R.string.timeout_dialog_message);
                        strH2.getClass();
                        Spanned spannedFromHtml = Html.fromHtml(strH2, 0);
                        spannedFromHtml.getClass();
                        SpannableString spannableString = new SpannableString(spannedFromHtml);
                        String strH3 = nmq0Var.H(R.string.yes);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) spannableString, (CharSequence) strH3, nmq0Var.H(R.string.no), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = nmq0Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                        return;
                    default:
                        iiy[] iiyVarArr2 = nmq0.Q1;
                        i1w0 i1w0Var = nmq0Var.H0().c;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (!pawVar.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                        break;
                }
            }
        });
        Iterator it = ((List) this.P1.getValue()).iterator();
        final int i = 0;
        while (true) {
            final byte b2 = 1;
            if (!it.hasNext()) {
                G0().f.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: a.jmq0
                    public final /* synthetic */ nmq0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        nmq0 nmq0Var = this.b;
                        switch (b3) {
                            case 0:
                                iiy[] iiyVarArr = nmq0.Q1;
                                ii iiVar = nmq0Var.L1;
                                if (iiVar == null) {
                                    Intrinsics.h("actionDialogManager");
                                    throw null;
                                }
                                String strH = nmq0Var.H(R.string.caution);
                                String strH2 = nmq0Var.H(R.string.timeout_dialog_message);
                                strH2.getClass();
                                Spanned spannedFromHtml = Html.fromHtml(strH2, 0);
                                spannedFromHtml.getClass();
                                SpannableString spannableString = new SpannableString(spannedFromHtml);
                                String strH3 = nmq0Var.H(R.string.yes);
                                strH3.getClass();
                                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) spannableString, (CharSequence) strH3, nmq0Var.H(R.string.no), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                                androidx.fragment.app.e eVarC = nmq0Var.C();
                                eVarC.getClass();
                                iiVar.d(dialogFields, eVarC);
                                return;
                            default:
                                iiy[] iiyVarArr2 = nmq0.Q1;
                                i1w0 i1w0Var = nmq0Var.H0().c;
                                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                                while (true) {
                                    paw pawVar = (paw) listIteratorP;
                                    if (!pawVar.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar.next());
                                    }
                                }
                                break;
                        }
                    }
                });
                ccq0.V(this, "SET_LIMIT_REQUEST_KEY", new imq0(this, (byte) 2));
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            cxx cxxVar = (cxx) next;
            FrameLayout frameLayout = cxxVar.f5146a;
            frameLayout.getClass();
            dyb.O(frameLayout, new Function1(this) { // from class: a.kmq0
                public final /* synthetic */ nmq0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object value;
                    g9i0 g9i0Var;
                    Object value2;
                    g9i0 g9i0Var2;
                    byte b3 = b;
                    int i3 = i;
                    nmq0 nmq0Var = this.b;
                    View view = (View) obj;
                    switch (b3) {
                        case 0:
                            iiy[] iiyVarArr = nmq0.Q1;
                            view.getClass();
                            wmq0 wmq0VarH0 = nmq0Var.H0();
                            p7m0 p7m0Var = wmq0VarH0.g;
                            do {
                                value = p7m0Var.getValue();
                                g9i0Var = g9i0.values()[i3];
                                wmq0VarH0.b.e("CURRENT_SELECTED_LIMIT_BUNDLE_KEY", g9i0Var);
                            } while (!p7m0Var.m(value, g9i0Var));
                            break;
                        default:
                            iiy[] iiyVarArr2 = nmq0.Q1;
                            view.getClass();
                            wmq0 wmq0VarH1 = nmq0Var.H0();
                            p7m0 p7m0Var2 = wmq0VarH1.g;
                            do {
                                value2 = p7m0Var2.getValue();
                                g9i0Var2 = g9i0.values()[i3];
                                wmq0VarH1.b.e("CURRENT_SELECTED_LIMIT_BUNDLE_KEY", g9i0Var2);
                            } while (!p7m0Var2.m(value2, g9i0Var2));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            dyb.O(cxxVar.b, new Function1(this) { // from class: a.kmq0
                public final /* synthetic */ nmq0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object value;
                    g9i0 g9i0Var;
                    Object value2;
                    g9i0 g9i0Var2;
                    byte b3 = b2;
                    int i3 = i;
                    nmq0 nmq0Var = this.b;
                    View view = (View) obj;
                    switch (b3) {
                        case 0:
                            iiy[] iiyVarArr = nmq0.Q1;
                            view.getClass();
                            wmq0 wmq0VarH0 = nmq0Var.H0();
                            p7m0 p7m0Var = wmq0VarH0.g;
                            do {
                                value = p7m0Var.getValue();
                                g9i0Var = g9i0.values()[i3];
                                wmq0VarH0.b.e("CURRENT_SELECTED_LIMIT_BUNDLE_KEY", g9i0Var);
                            } while (!p7m0Var.m(value, g9i0Var));
                            break;
                        default:
                            iiy[] iiyVarArr2 = nmq0.Q1;
                            view.getClass();
                            wmq0 wmq0VarH1 = nmq0Var.H0();
                            p7m0 p7m0Var2 = wmq0VarH1.g;
                            do {
                                value2 = p7m0Var2.getValue();
                                g9i0Var2 = g9i0.values()[i3];
                                wmq0VarH1.b.e("CURRENT_SELECTED_LIMIT_BUNDLE_KEY", g9i0Var2);
                            } while (!p7m0Var2.m(value2, g9i0Var2));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            i = i2;
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(omq0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            omq0 omq0Var = (omq0) (ze3Var instanceof omq0 ? ze3Var : null);
            if (omq0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                xio xioVar = omq0Var.f25515a;
                czz czzVar = omq0Var.b;
                duj dujVar = omq0Var.c;
                ii iiVar = omq0Var.e;
                btt0 btt0Var = omq0Var.d;
                dzz dzzVar = omq0Var.f;
                gii0 gii0Var = omq0Var.g;
                knf0 knf0Var = omq0Var.h;
                wdk0 wdk0Var = omq0Var.i;
                iiVar.getClass();
                xioVar.getClass();
                czzVar.getClass();
                btt0Var.getClass();
                dzzVar.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                wdk0Var.getClass();
                this.K1 = (ixi) new dri(iiVar, xioVar, czzVar, i1w0VarF, dujVar, btt0Var, dzzVar, gii0Var, knf0Var, wdk0Var, (byte) 1).i.get();
                this.L1 = iiVar;
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(omq0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().g);
        Class<nmq0> cls = nmq0.class;
        bdl0 bdl0Var = new bdl0(2, this, cls, "limitChosen", "limitChosen(Lorg/xplatform/responsible_game/impl/presentation/limits/selflimits/SelfLimitUiEnum;)V", 4, (byte) 25);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hlq0(xae0VarN, clzVarW, bdl0Var, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(H0().f);
        int i = 4;
        bdl0 bdl0Var2 = new bdl0(2, this, cls, "showProgress", "showProgress(Z)V", i, (byte) 26);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new hlq0(xae0VarN2, clzVarW2, bdl0Var2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().h;
        bdl0 bdl0Var3 = new bdl0(2, this, cls, "handleActions", "handleActions(Lorg/xplatform/responsible_game/impl/presentation/limits/timeout/TimeoutViewModel$Action;)V", i, (byte) 27);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new hlq0((gmq) ol60Var, clzVarW3, bdl0Var3, (yje) null, (byte) 0, (char) 0), 3);
    }

    public final y5r G0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (y5r) objN;
    }

    public final wmq0 H0() {
        return (wmq0) this.N1.getValue();
    }

    public final void I0(RadioButton radioButton) {
        Iterator it = ((List) this.P1.getValue()).iterator();
        while (it.hasNext()) {
            ((cxx) it.next()).b.setChecked(false);
        }
        radioButton.setChecked(true);
    }
}
