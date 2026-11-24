package a;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vif0;", "La/yx5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vif0 extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public final cgx0 M1;
    public final s0r N1;
    public final a8z O1;
    public final kiu0 P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(vif0.class, "form2faAlert", "getForm2faAlert()Z", 0), new j0d0(vif0.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentRemoveTwoFactorAuthenticationBinding;", 0)};
    public static final cge0 Q1 = new cge0((byte) 7);

    public vif0() {
        super(R.layout.fragment_remove_two_factor_authentication);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        this.M1 = new cgx0("FROM_2FA_ALERT_KEY", false);
        this.N1 = ltt0.o(this, tif0.f34007a);
        rif0 rif0Var = new rif0(this, (byte) 0);
        wez wezVar = wez.b;
        this.O1 = maz.a(wezVar, rif0Var);
        lce0 lce0Var = new lce0(new rif0(this, (byte) 1), (byte) 14);
        a8z a8zVarA = maz.a(wezVar, new lce0(new lce0(this, (byte) 15), (byte) 16));
        this.P1 = agc.G(this, sre0.f32672a.b(gjf0.class), new wbe0(a8zVarA, (byte) 16), new wbe0(a8zVarA, (byte) 17), lce0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        TextView textView = G0().c;
        Drawable drawable = textView.getContext().getDrawable(R.drawable.ic_glyph_info_circle);
        if (drawable == null) {
            return;
        }
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(R.dimen.size_62);
        final byte b = 0;
        drawable.setBounds(new Rect(0, 0, dimensionPixelSize, dimensionPixelSize));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        G0().d.a(new da0(new Function1(this) { // from class: a.sif0
            public final /* synthetic */ vif0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                vif0 vif0Var = this.b;
                switch (b2) {
                    case 0:
                        Editable editable = (Editable) obj;
                        cge0 cge0Var = vif0.Q1;
                        editable.getClass();
                        vif0Var.H0().w(editable);
                        break;
                    default:
                        cge0 cge0Var2 = vif0.Q1;
                        ((View) obj).getClass();
                        vif0Var.H0().j.f(zif0.f44437a);
                        break;
                }
                return Unit.f46060a;
            }
        }));
        TextView textView2 = G0().c;
        String strH = H(R.string.tfa_support_text_new);
        strH.getClass();
        final byte b2 = 1;
        List listC = kotlin.collections.a.c(new Function1(this) { // from class: a.sif0
            public final /* synthetic */ vif0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                vif0 vif0Var = this.b;
                switch (b3) {
                    case 0:
                        Editable editable = (Editable) obj;
                        cge0 cge0Var = vif0.Q1;
                        editable.getClass();
                        vif0Var.H0().w(editable);
                        break;
                    default:
                        cge0 cge0Var2 = vif0.Q1;
                        ((View) obj).getClass();
                        vif0Var.H0().j.f(zif0.f44437a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        listC.getClass();
        List listSplit$default = StringsKt__StringsKt.split$default(strH, new String[]{"~"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listSplit$default) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            if (i % 2 == 1) {
                arrayList.add(obj);
            }
            i = i2;
        }
        ArrayList<Pair> arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        int i3 = 0;
        for (Object obj2 : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            arrayList2.add(new Pair((String) obj2, listC.get(i3 / 2)));
            i3 = i4;
        }
        textView2.setText(kotlin.text.c.r(strH, "~", "", false));
        SpannableString spannableString = new SpannableString(textView2.getText());
        for (Pair pair : arrayList2) {
            vhd vhdVar = new vhd(pair);
            int iV = StringsKt.V(textView2.getText().toString(), (String) pair.f46059a, 0, false, 6);
            spannableString.setSpan(vhdVar, iV, ((String) pair.f46059a).length() + iV, 33);
        }
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(spannableString, TextView.BufferType.SPANNABLE);
        mc50.a(G0().e, new rif0(this, (byte) 4));
        DsBottomBar.u(G0().b, new rif0(this, (byte) 5));
        uvw.R(G0().b, this, null);
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        H0().w(G0().d.getText());
        p7m0 p7m0Var = H0().i;
        yje yjeVar = null;
        uif0 uif0Var = new uif0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w7f0(p7m0Var, clzVarW, uif0Var, (yje) null), 3);
        ol60 ol60Var = H0().j;
        uif0 uif0Var2 = new uif0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new w7f0(ol60Var, clzVarW2, uif0Var2, (yje) null, (byte) 0), 3);
    }

    public final d4r G0() {
        Object objN = this.N1.n(R1[1], this);
        objN.getClass();
        return (d4r) objN;
    }

    public final gjf0 H0() {
        return (gjf0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new rif0(this, (byte) 2));
        ccq0.V(this, "REQUEST_CONSULTANT_KEY", new rif0(this, (byte) 3));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        hxm0.m(G0().f5468a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(G0().f5468a);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
