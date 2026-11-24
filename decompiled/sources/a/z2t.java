package a;

import android.text.InputFilter;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La/z2t;", "La/nw5;", "La/yjk;", "<init>", "()V", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z2t extends nw5<yjk> {
    public static final /* synthetic */ iiy[] h2 = {new j0d0(z2t.class, "binding", "getBinding()Lorg/xplatform/core/databinding/DialogXgamesBetSettingsBinding;", 0)};
    public z6i e2;
    public final kiu0 f2;
    public final nae0 g2;

    public z2t() {
        x2t x2tVar = new x2t(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new jfl(new jfl(this, (byte) 27), (byte) 28));
        this.f2 = agc.G(this, sre0.f32672a.b(q3t.class), new r6p(a8zVarA, (byte) 14), new r6p(a8zVarA, (byte) 15), x2tVar);
        this.g2 = ltt0.p(this, y2t.f41921a);
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void O0() throws Exception {
        itb itbVarV = xkb.V(V0().n);
        yje yjeVar = null;
        j0s j0sVar = new j0s(this, yjeVar, (byte) 10);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        tkz tkzVarQ = x0x.Q(clzVarW.x());
        fns fnsVar = new fns(itbVarV, clzVarW, j0sVar, (yje) null);
        final byte b = 3;
        qjj.W(tkzVarQ, null, null, fnsVar, 3);
        final byte b2 = 0;
        L0().i.setOnClickListener(new View.OnClickListener(this) { // from class: a.v2t
            public final /* synthetic */ z2t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                z2t z2tVar = this.b;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.f38333a);
                        z2tVar.L0().i.a(true);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.b);
                        z2tVar.L0().g.a(true);
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.c);
                        z2tVar.L0().e.a(true);
                        break;
                    case 3:
                        iiy[] iiyVarArr4 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.d);
                        z2tVar.L0().f.a(true);
                        break;
                    default:
                        iiy[] iiyVarArr5 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.e);
                        z2tVar.L0().h.a(true);
                        break;
                }
            }
        });
        final byte b3 = 1;
        L0().g.setOnClickListener(new View.OnClickListener(this) { // from class: a.v2t
            public final /* synthetic */ z2t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                z2t z2tVar = this.b;
                switch (b4) {
                    case 0:
                        iiy[] iiyVarArr = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.f38333a);
                        z2tVar.L0().i.a(true);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.b);
                        z2tVar.L0().g.a(true);
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.c);
                        z2tVar.L0().e.a(true);
                        break;
                    case 3:
                        iiy[] iiyVarArr4 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.d);
                        z2tVar.L0().f.a(true);
                        break;
                    default:
                        iiy[] iiyVarArr5 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.e);
                        z2tVar.L0().h.a(true);
                        break;
                }
            }
        });
        final byte b4 = 2;
        L0().e.setOnClickListener(new View.OnClickListener(this) { // from class: a.v2t
            public final /* synthetic */ z2t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b4;
                z2t z2tVar = this.b;
                switch (b5) {
                    case 0:
                        iiy[] iiyVarArr = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.f38333a);
                        z2tVar.L0().i.a(true);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.b);
                        z2tVar.L0().g.a(true);
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.c);
                        z2tVar.L0().e.a(true);
                        break;
                    case 3:
                        iiy[] iiyVarArr4 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.d);
                        z2tVar.L0().f.a(true);
                        break;
                    default:
                        iiy[] iiyVarArr5 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.e);
                        z2tVar.L0().h.a(true);
                        break;
                }
            }
        });
        L0().f.setOnClickListener(new View.OnClickListener(this) { // from class: a.v2t
            public final /* synthetic */ z2t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b;
                z2t z2tVar = this.b;
                switch (b5) {
                    case 0:
                        iiy[] iiyVarArr = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.f38333a);
                        z2tVar.L0().i.a(true);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.b);
                        z2tVar.L0().g.a(true);
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.c);
                        z2tVar.L0().e.a(true);
                        break;
                    case 3:
                        iiy[] iiyVarArr4 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.d);
                        z2tVar.L0().f.a(true);
                        break;
                    default:
                        iiy[] iiyVarArr5 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.e);
                        z2tVar.L0().h.a(true);
                        break;
                }
            }
        });
        final byte b5 = 4;
        L0().h.setOnClickListener(new View.OnClickListener(this) { // from class: a.v2t
            public final /* synthetic */ z2t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b6 = b5;
                z2t z2tVar = this.b;
                switch (b6) {
                    case 0:
                        iiy[] iiyVarArr = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.f38333a);
                        z2tVar.L0().i.a(true);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.b);
                        z2tVar.L0().g.a(true);
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.c);
                        z2tVar.L0().e.a(true);
                        break;
                    case 3:
                        iiy[] iiyVarArr4 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.d);
                        z2tVar.L0().f.a(true);
                        break;
                    default:
                        iiy[] iiyVarArr5 = z2t.h2;
                        z2tVar.W0();
                        z2tVar.V0().w(w05.e);
                        z2tVar.L0().h.a(true);
                        break;
                }
            }
        });
        hxm0.y(L0().d, new x2t(this, (byte) 1));
        hxm0.y(L0().c, new x2t(this, (byte) 2));
        hxm0.y(L0().b, new x2t(this, (byte) 3));
        L0().d.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: a.w2t
            public final /* synthetic */ z2t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                byte b6 = b4;
                z2t z2tVar = this.b;
                switch (b6) {
                    case 0:
                        iiy[] iiyVarArr = z2t.h2;
                        z2tVar.V0().A(gxo.b, z, String.valueOf(z2tVar.L0().c.getText()));
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = z2t.h2;
                        z2tVar.V0().A(gxo.c, z, String.valueOf(z2tVar.L0().b.getText()));
                        break;
                    default:
                        iiy[] iiyVarArr3 = z2t.h2;
                        z2tVar.V0().A(gxo.f12086a, z, String.valueOf(z2tVar.L0().d.getText()));
                        break;
                }
            }
        });
        L0().c.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: a.w2t
            public final /* synthetic */ z2t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                byte b6 = b2;
                z2t z2tVar = this.b;
                switch (b6) {
                    case 0:
                        iiy[] iiyVarArr = z2t.h2;
                        z2tVar.V0().A(gxo.b, z, String.valueOf(z2tVar.L0().c.getText()));
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = z2t.h2;
                        z2tVar.V0().A(gxo.c, z, String.valueOf(z2tVar.L0().b.getText()));
                        break;
                    default:
                        iiy[] iiyVarArr3 = z2t.h2;
                        z2tVar.V0().A(gxo.f12086a, z, String.valueOf(z2tVar.L0().d.getText()));
                        break;
                }
            }
        });
        L0().b.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: a.w2t
            public final /* synthetic */ z2t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                byte b6 = b3;
                z2t z2tVar = this.b;
                switch (b6) {
                    case 0:
                        iiy[] iiyVarArr = z2t.h2;
                        z2tVar.V0().A(gxo.b, z, String.valueOf(z2tVar.L0().c.getText()));
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = z2t.h2;
                        z2tVar.V0().A(gxo.c, z, String.valueOf(z2tVar.L0().b.getText()));
                        break;
                    default:
                        iiy[] iiyVarArr3 = z2t.h2;
                        z2tVar.V0().A(gxo.f12086a, z, String.valueOf(z2tVar.L0().d.getText()));
                        break;
                }
            }
        });
        L0().d.setFilters(new InputFilter[]{new tjj(13, 2)});
        L0().c.setFilters(new InputFilter[]{new tjj(13, 2)});
        L0().b.setFilters(new InputFilter[]{new tjj(13, 2)});
        q3t q3tVarV0 = V0();
        sac.V(jiu0.a(q3tVarV0), new h2s(1, q3tVarV0, q3t.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, q3tVarV0.l.f22085a, new gkr(q3tVarV0, yjeVar, (byte) 5), 10);
    }

    @Override // a.nw5
    public final void P0() {
        h5t h5tVar;
        Fragment fragment = this.y;
        Fragment fragment2 = fragment != null ? fragment.y : null;
        bn70 bn70Var = fragment2 instanceof bn70 ? (bn70) fragment2 : null;
        if (bn70Var == null || (h5tVar = bn70Var.L1) == null) {
            return;
        }
        h5tVar.j(this);
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.gameRootView;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final yjk L0() {
        Object objN = this.g2.n(h2[0], this);
        objN.getClass();
        return (yjk) objN;
    }

    public final AppCompatEditText U0(gxo gxoVar) {
        int iOrdinal = gxoVar.ordinal();
        if (iOrdinal == 0) {
            return L0().d;
        }
        if (iOrdinal == 1) {
            return L0().c;
        }
        if (iOrdinal == 2) {
            return L0().b;
        }
        t9f.b();
        return null;
    }

    public final q3t V0() {
        return (q3t) this.f2.getValue();
    }

    public final void W0() {
        L0().i.a(false);
        L0().g.a(false);
        L0().e.a(false);
        L0().f.a(false);
        L0().h.a(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        V0().B(gxo.f12086a, String.valueOf(L0().d.getText()));
        V0().B(gxo.b, String.valueOf(L0().c.getText()));
        V0().B(gxo.c, String.valueOf(L0().b.getText()));
        this.j1 = true;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        BottomSheetBehavior bottomSheetBehaviorM0 = M0();
        if (bottomSheetBehaviorM0 != null) {
            bottomSheetBehaviorM0.K = true;
        }
        J0();
    }
}
