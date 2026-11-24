package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.check_box.old.DsCheckBoxOld;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/x6w;", "La/nw5;", "La/c1w;", "<init>", "()V", "a/art", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x6w extends nw5<c1w> {
    public fiu0 e2;
    public final kiu0 f2;
    public final nae0 g2;
    public final a8z h2;
    public final yzn0 i2;
    public final yzn0 j2;
    public static final /* synthetic */ iiy[] l2 = {new j0d0(x6w.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/HistoryFilterDialogBinding;", 0), new ez40(x6w.class, "historyType", "getHistoryType()Lorg/xplatform/bethistory/domain/model/BetHistoryTypeModel;", 0), new ez40(x6w.class, "typeHistoryScreen", "getTypeHistoryScreen()Lorg/xplatform/bethistory/domain/model/TypeHistoryScreen;", 0)};
    public static final art k2 = new art();

    public x6w() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.t6w
            public final /* synthetic */ x6w b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                x6w x6wVar = this.b;
                switch (b2) {
                    case 0:
                        fiu0 fiu0Var = x6wVar.e2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        art artVar = x6w.k2;
                        t3t t3tVar = new t3t(x6wVar, (byte) 28);
                        y6w y6wVar = new y6w();
                        dp dpVar = (dp) y6wVar.e;
                        t3t t3tVar2 = new t3t(y6wVar, (byte) 29);
                        dpVar.b(new gbn(new x2w((byte) 5), new pkv(3, (byte) 17), new f3s(t3tVar2, t3tVar, (byte) 27), btv.m));
                        return y6wVar;
                }
            }
        };
        t7t t7tVar = new t7t(this, (byte) 28);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new t7t(t7tVar, (byte) 29));
        this.f2 = agc.G(this, sre0.f32672a.b(wnm0.class), new qwv(a8zVarA, (byte) 12), new qwv(a8zVarA, (byte) 13), function0);
        this.g2 = ltt0.p(this, u6w.f35156a);
        final byte b2 = 1;
        this.h2 = maz.a(wezVar, new Function0(this) { // from class: a.t6w
            public final /* synthetic */ x6w b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                x6w x6wVar = this.b;
                switch (b3) {
                    case 0:
                        fiu0 fiu0Var = x6wVar.e2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        art artVar = x6w.k2;
                        t3t t3tVar = new t3t(x6wVar, (byte) 28);
                        y6w y6wVar = new y6w();
                        dp dpVar = (dp) y6wVar.e;
                        t3t t3tVar2 = new t3t(y6wVar, (byte) 29);
                        dpVar.b(new gbn(new x2w((byte) 5), new pkv(3, (byte) 17), new f3s(t3tVar2, t3tVar, (byte) 27), btv.m));
                        return y6wVar;
                }
            }
        });
        this.i2 = new yzn0("EXTRA_BET_HISTORY_TYPE");
        this.j2 = new yzn0("TYPE_HISTORY_SCREEN");
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void O0() throws Exception {
        L0().b.setOnClickListener(new q10(this, (byte) 24));
        jk3 jk3Var = L0().c;
        ((TextView) jk3Var.d).setText(G().getString(R.string.all));
        ((DsCheckBoxOld) jk3Var.c).setOnClickListener(new wg(this, jk3Var, (byte) 26));
        ((ConstraintLayout) jk3Var.f).setOnClickListener(new q10(jk3Var, (byte) 25));
        L0().d.setLayoutManager(new LinearLayoutManager(B()));
        L0().d.setAdapter((y6w) this.h2.getValue());
        xae0 xae0VarN = vtb.N(U0().k);
        yje yjeVar = null;
        w6w w6wVar = new w6w(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r1w(xae0VarN, clzVarW, w6wVar, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(U0().j);
        w6w w6wVar2 = new w6w(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new r1w(xae0VarN2, clzVarW2, w6wVar2, (yje) null, (byte) 0), 3);
        vae0 vae0VarM = vtb.M(U0().l);
        w6w w6wVar3 = new w6w(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new r1w(vae0VarM, clzVarW3, w6wVar3, (yje) null), 3);
    }

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(rnm0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            rnm0 rnm0Var = (rnm0) (ze3Var instanceof rnm0 ? ze3Var : null);
            if (rnm0Var != null) {
                iiy[] iiyVarArr = l2;
                this.e2 = rnm0Var.a((s77) this.i2.n(this, iiyVarArr[1]), a4n0.f(this), (sys0) this.j2.n(this, iiyVarArr[2])).y();
                return;
            }
        }
        jf4.n(b1j.i(rnm0.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent;
    }

    @Override // a.nw5
    public final String S0() {
        String string = G().getString(R.string.bet_filter_new);
        string.getClass();
        return string;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final c1w L0() {
        Object objN = this.g2.n(l2[0], this);
        objN.getClass();
        return (c1w) objN;
    }

    public final wnm0 U0() {
        return (wnm0) this.f2.getValue();
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Dialog dialog = this.S1;
        if (dialog != null) {
            dialog.setOnShowListener(new yae(dialog, (byte) 1));
        }
    }
}
