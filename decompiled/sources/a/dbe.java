package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.consultantchat.presentation.dialogs.rate.model.RatingModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/dbe;", "La/nw5;", "La/iik;", "<init>", "()V", "a/kud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dbe extends nw5<iik> {
    public final nae0 e2 = ltt0.p(this, abe.f573a);
    public final kiu0 f2;
    public final bbe g2;
    public final Handler h2;
    public final khf0 i2;
    public ii j2;
    public static final /* synthetic */ iiy[] l2 = {new j0d0(dbe.class, "binding", "getBinding()Lorg/xplatform/consultantchat/impl/databinding/DialogConsultantChatRateBinding;", 0), new ez40(dbe.class, "ratingModel", "getRatingModel()Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel;", 0)};
    public static final kud k2 = new kud();

    public dbe() {
        a8z a8zVarA = maz.a(wez.b, new svc(new svc(this, (byte) 22), (byte) 23));
        this.f2 = agc.G(this, sre0.f32672a.b(ibe.class), new wpb(a8zVarA, (byte) 28), new wpb(a8zVarA, (byte) 29), new h5((Object) this, (Object) a8zVarA, (byte) 21));
        this.g2 = new bbe(true);
        this.h2 = new Handler(Looper.getMainLooper());
        this.i2 = new khf0(RatingModel.NoValue.f46450a, "RATING_MODEL_KEY");
    }

    @Override // a.nw5, a.yo8, a.sd3, a.sik
    public final Dialog C0(Bundle bundle) {
        wo8 wo8Var = new wo8(o0(), this.M1);
        wo8Var.setCancelable(false);
        wo8Var.setCanceledOnTouchOutside(false);
        wo8Var.setOnShowListener(new yae(wo8Var, (byte) 0));
        return wo8Var;
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.nw5
    public final void O0() throws Exception {
        ccq0.V(this, "DIALOG_EXIT_REQUEST", new jwd(this, (byte) 6));
        BottomSheetBehavior bottomSheetBehaviorM0 = M0();
        Object[] objArr = 0;
        if (bottomSheetBehaviorM0 != null) {
            bottomSheetBehaviorM0.L(false);
        }
        Dialog dialog = this.S1;
        dialog.getClass();
        ((wo8) dialog).k().a(K(), this.g2);
        iik iikVarL0 = L0();
        ConstraintLayout constraintLayout = iikVarL0.c;
        final Object[] objArr2 = objArr == true ? 1 : 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: a.zae
            public final /* synthetic */ dbe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object value2;
                byte b = objArr2;
                dbe dbeVar = this.b;
                switch (b) {
                    case 0:
                        kud kudVar = dbe.k2;
                        ibe ibeVarU0 = dbeVar.U0();
                        vsf0 vsf0Var = vsf0.b;
                        p7m0 p7m0Var = ibeVarU0.b;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, hbe.a((hbe) value, vsf0Var, null, 2)));
                        break;
                    case 1:
                        kud kudVar2 = dbe.k2;
                        ibe ibeVarU1 = dbeVar.U0();
                        vsf0 vsf0Var2 = vsf0.c;
                        p7m0 p7m0Var2 = ibeVarU1.b;
                        do {
                            value2 = p7m0Var2.getValue();
                        } while (!p7m0Var2.m(value2, hbe.a((hbe) value2, vsf0Var2, null, 2)));
                        break;
                    default:
                        kud kudVar3 = dbe.k2;
                        ibe ibeVarU2 = dbeVar.U0();
                        qjj.W(jiu0.a(ibeVarU2), null, null, new igb(ibeVarU2, (yje) null, (byte) 10), 3);
                        break;
                }
            }
        });
        final byte b = 1;
        iikVarL0.b.setOnClickListener(new View.OnClickListener(this) { // from class: a.zae
            public final /* synthetic */ dbe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object value2;
                byte b2 = b;
                dbe dbeVar = this.b;
                switch (b2) {
                    case 0:
                        kud kudVar = dbe.k2;
                        ibe ibeVarU0 = dbeVar.U0();
                        vsf0 vsf0Var = vsf0.b;
                        p7m0 p7m0Var = ibeVarU0.b;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, hbe.a((hbe) value, vsf0Var, null, 2)));
                        break;
                    case 1:
                        kud kudVar2 = dbe.k2;
                        ibe ibeVarU1 = dbeVar.U0();
                        vsf0 vsf0Var2 = vsf0.c;
                        p7m0 p7m0Var2 = ibeVarU1.b;
                        do {
                            value2 = p7m0Var2.getValue();
                        } while (!p7m0Var2.m(value2, hbe.a((hbe) value2, vsf0Var2, null, 2)));
                        break;
                    default:
                        kud kudVar3 = dbe.k2;
                        ibe ibeVarU2 = dbeVar.U0();
                        qjj.W(jiu0.a(ibeVarU2), null, null, new igb(ibeVarU2, (yje) null, (byte) 10), 3);
                        break;
                }
            }
        });
        LinearLayout linearLayout = iikVarL0.g;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt == null) {
                v4i0.m(f140.j(i, "Index: ", linearLayout.getChildCount(), ", Size: "));
                return;
            }
            childAt.setOnClickListener(new nva(this, i, b));
        }
        final byte b2 = 2;
        iikVarL0.f.setOnClickListener(new View.OnClickListener(this) { // from class: a.zae
            public final /* synthetic */ dbe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object value2;
                byte b3 = b2;
                dbe dbeVar = this.b;
                switch (b3) {
                    case 0:
                        kud kudVar = dbe.k2;
                        ibe ibeVarU0 = dbeVar.U0();
                        vsf0 vsf0Var = vsf0.b;
                        p7m0 p7m0Var = ibeVarU0.b;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, hbe.a((hbe) value, vsf0Var, null, 2)));
                        break;
                    case 1:
                        kud kudVar2 = dbe.k2;
                        ibe ibeVarU1 = dbeVar.U0();
                        vsf0 vsf0Var2 = vsf0.c;
                        p7m0 p7m0Var2 = ibeVarU1.b;
                        do {
                            value2 = p7m0Var2.getValue();
                        } while (!p7m0Var2.m(value2, hbe.a((hbe) value2, vsf0Var2, null, 2)));
                        break;
                    default:
                        kud kudVar3 = dbe.k2;
                        ibe ibeVarU2 = dbeVar.U0();
                        qjj.W(jiu0.a(ibeVarU2), null, null, new igb(ibeVarU2, (yje) null, (byte) 10), 3);
                        break;
                }
            }
        });
        iik iikVarL1 = L0();
        p7m0 p7m0Var = U0().b;
        ee0 ee0Var = new ee0((Object) iikVarL1, (Object) this, (yje) null, (byte) 27);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cxd(p7m0Var, clzVarW, ee0Var, (yje) null), 3);
        qoj0 qoj0Var = U0().c;
        cbe cbeVar = new cbe(this, null);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cxd(qoj0Var, clzVarW2, cbeVar, (yje) null), 3);
    }

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(f7e.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            f7e f7eVar = (f7e) (ze3Var instanceof f7e ? ze3Var : null);
            if (f7eVar != null) {
                this.j2 = (ii) f7eVar.a(a4n0.f(this)).e;
                return;
            }
        }
        jf4.n(b1j.i(f7e.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.root;
    }

    @Override // a.nw5
    public final String S0() {
        String strH = H(R.string.rate_consultant);
        strH.getClass();
        return strH;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final iik L0() {
        Object objN = this.e2.n(l2[0], this);
        objN.getClass();
        return (iik) objN;
    }

    public final ibe U0() {
        return (ibe) this.f2.getValue();
    }

    @Override // a.nw5, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        U0().w((RatingModel) this.i2.n(this, l2[1]));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        this.h2.removeCallbacksAndMessages(null);
    }
}
