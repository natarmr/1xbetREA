package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.CompoundButton;
import java.util.List;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xbq0;", "La/yx5;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xbq0 extends yx5 {
    public final hnm0 K1;
    public cxi L1;
    public final kiu0 M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(xbq0.class, "binding", "getBinding()Lorg/xplatform/themesettings/impl/databinding/FragmentThemeSettingsUiKitBinding;", 0)};
    public static final m6m0 O1 = new m6m0(19);

    public xbq0() {
        super(R.layout.fragment_theme_settings_ui_kit);
        this.K1 = hnm0.f13359a;
        sbq0 sbq0Var = new sbq0(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new mfo0(new mfo0(this, (byte) 17), (byte) 18));
        this.M1 = agc.G(this, sre0.f32672a.b(zbq0.class), new r5p0(a8zVarA, (byte) 10), new r5p0(a8zVarA, (byte) 11), sbq0Var);
        this.N1 = ltt0.o(this, wbq0.f38892a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        zbq0 zbq0VarK0 = K0();
        boolean zIs24HourFormat = DateFormat.is24HourFormat(I0().f36838a.getContext());
        v6j0 v6j0Var = zbq0VarK0.j.f43485a;
        int iE = v6j0Var.e();
        int iD = v6j0Var.d();
        int iC = v6j0Var.c();
        int iB = v6j0Var.b();
        p7m0 p7m0Var = zbq0VarK0.n;
        List list = zbq0VarK0.e.f3488a.a().d;
        v6j0 v6j0Var2 = zbq0VarK0.f.b;
        uaq0 uaq0VarG = v6j0Var2.g();
        boolean zF = zbq0VarK0.h.f36139a.f();
        s9m0 s9m0Var = uaq0.f35345a;
        uaq0 uaq0VarG2 = v6j0Var2.g();
        s9m0Var.getClass();
        p7m0Var.o(null, new obq0(list, uaq0VarG, zF, s9m0.l(uaq0VarG2), zbq0VarK0.w(iD, iE, zIs24HourFormat), zbq0VarK0.w(iB, iC, zIs24HourFormat)));
        final byte b = 0;
        I0().h.b(new sbq0(this, b));
        I0().d.setOnClickListener(new View.OnClickListener(this) { // from class: a.ubq0
            public final /* synthetic */ xbq0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                xbq0 xbq0Var = this.b;
                switch (b2) {
                    case 0:
                        m6m0 m6m0Var = xbq0.O1;
                        xbq0Var.K0().y();
                        break;
                    case 1:
                        m6m0 m6m0Var2 = xbq0.O1;
                        xbq0Var.K0().x();
                        break;
                    default:
                        m6m0 m6m0Var3 = xbq0.O1;
                        xbq0Var.K0().z();
                        break;
                }
            }
        });
        final byte b2 = 1;
        I0().b.setOnClickListener(new View.OnClickListener(this) { // from class: a.ubq0
            public final /* synthetic */ xbq0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                xbq0 xbq0Var = this.b;
                switch (b3) {
                    case 0:
                        m6m0 m6m0Var = xbq0.O1;
                        xbq0Var.K0().y();
                        break;
                    case 1:
                        m6m0 m6m0Var2 = xbq0.O1;
                        xbq0Var.K0().x();
                        break;
                    default:
                        m6m0 m6m0Var3 = xbq0.O1;
                        xbq0Var.K0().z();
                        break;
                }
            }
        });
        final byte b3 = 2;
        I0().f.setOnClickListener(new View.OnClickListener(this) { // from class: a.ubq0
            public final /* synthetic */ xbq0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                xbq0 xbq0Var = this.b;
                switch (b4) {
                    case 0:
                        m6m0 m6m0Var = xbq0.O1;
                        xbq0Var.K0().y();
                        break;
                    case 1:
                        m6m0 m6m0Var2 = xbq0.O1;
                        xbq0Var.K0().x();
                        break;
                    default:
                        m6m0 m6m0Var3 = xbq0.O1;
                        xbq0Var.K0().z();
                        break;
                }
            }
        });
        I0().j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: a.vbq0
            public final /* synthetic */ xbq0 b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                byte b4 = b;
                xbq0 xbq0Var = this.b;
                switch (b4) {
                    case 0:
                        m6m0 m6m0Var = xbq0.O1;
                        compoundButton.getClass();
                        if (z) {
                            xbq0Var.K0().y();
                        }
                        break;
                    case 1:
                        m6m0 m6m0Var2 = xbq0.O1;
                        compoundButton.getClass();
                        if (z) {
                            xbq0Var.K0().x();
                        }
                        break;
                    default:
                        m6m0 m6m0Var3 = xbq0.O1;
                        compoundButton.getClass();
                        if (z) {
                            xbq0Var.K0().z();
                        }
                        break;
                }
            }
        });
        I0().i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: a.vbq0
            public final /* synthetic */ xbq0 b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                byte b4 = b2;
                xbq0 xbq0Var = this.b;
                switch (b4) {
                    case 0:
                        m6m0 m6m0Var = xbq0.O1;
                        compoundButton.getClass();
                        if (z) {
                            xbq0Var.K0().y();
                        }
                        break;
                    case 1:
                        m6m0 m6m0Var2 = xbq0.O1;
                        compoundButton.getClass();
                        if (z) {
                            xbq0Var.K0().x();
                        }
                        break;
                    default:
                        m6m0 m6m0Var3 = xbq0.O1;
                        compoundButton.getClass();
                        if (z) {
                            xbq0Var.K0().z();
                        }
                        break;
                }
            }
        });
        I0().k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: a.vbq0
            public final /* synthetic */ xbq0 b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                byte b4 = b3;
                xbq0 xbq0Var = this.b;
                switch (b4) {
                    case 0:
                        m6m0 m6m0Var = xbq0.O1;
                        compoundButton.getClass();
                        if (z) {
                            xbq0Var.K0().y();
                        }
                        break;
                    case 1:
                        m6m0 m6m0Var2 = xbq0.O1;
                        compoundButton.getClass();
                        if (z) {
                            xbq0Var.K0().x();
                        }
                        break;
                    default:
                        m6m0 m6m0Var3 = xbq0.O1;
                        compoundButton.getClass();
                        if (z) {
                            xbq0Var.K0().z();
                        }
                        break;
                }
            }
        });
        String str = "TIME_PICKER_ON_DIALOG_KEY";
        byte b4 = 14;
        byte b5 = 15;
        C().u0("TIME_PICKER_ON_DIALOG_KEY", this, new uq(str, new a6p0(this, str, b4), b5));
        String str2 = "TIME_PICKER_OFF_DIALOG_KEY";
        C().u0("TIME_PICKER_OFF_DIALOG_KEY", this, new uq(str2, new a6p0(this, str2, b4), b5));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(abq0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            abq0 abq0Var = (abq0) (ze3Var instanceof abq0 ? ze3Var : null);
            if (abq0Var != null) {
                String simpleName = xbq0.class.getSimpleName();
                drm0 drm0Var = abq0Var.f592a;
                v6k v6kVar = abq0Var.b;
                d1p d1pVar = abq0Var.c;
                wyu wyuVar = abq0Var.d;
                kt2 kt2Var = abq0Var.e;
                v6j0 v6j0Var = abq0Var.f;
                fsd fsdVar = abq0Var.g;
                d1pVar.getClass();
                wyuVar.getClass();
                kt2Var.getClass();
                v6j0Var.getClass();
                fsdVar.getClass();
                g45 g45Var = new g45();
                g45Var.g = simpleName;
                g45Var.f10647a = kt2Var;
                g45Var.b = wyuVar;
                g45Var.c = fsdVar;
                g45Var.d = v6j0Var;
                g45Var.e = drm0Var;
                g45Var.f = v6kVar;
                g45Var.h = d1pVar;
                g45Var.i = n0k0.a(new xvi(g45Var, (byte) 16));
                this.L1 = (cxi) ((n5d0) g45Var.i).get();
                return;
            }
        }
        jf4.n(b1j.i(abq0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = K0().n;
        bdl0 bdl0Var = new bdl0(2, this, xbq0.class, "handleState", "handleState(Lorg/xplatform/themesettings/impl/presentation/theme/model/ThemeState;)V", 4, (byte) 14);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new lto0(p7m0Var, clzVarW, bdl0Var, (yje) null, (byte) 0), 3);
    }

    public final Drawable G0() {
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        Drawable drawable = o0().getDrawable(R.drawable.il_theme_back);
        if (drawable == null || (constantState = drawable.getConstantState()) == null || (drawableNewDrawable = constantState.newDrawable()) == null) {
            return null;
        }
        return drawableNewDrawable.mutate();
    }

    public final Drawable H0() {
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        Drawable drawable = o0().getDrawable(R.drawable.il_theme);
        if (drawable == null || (constantState = drawable.getConstantState()) == null || (drawableNewDrawable = constantState.newDrawable()) == null) {
            return null;
        }
        return drawableNewDrawable.mutate();
    }

    public final v5r I0() {
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        return (v5r) objN;
    }

    public final int J0(uaq0 uaq0Var, int i) {
        Context contextO0 = o0();
        return m5d.f(contextO0, i, false, m5d.e(fem0.o(uaq0Var), contextO0));
    }

    public final zbq0 K0() {
        return (zbq0) this.M1.getValue();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
