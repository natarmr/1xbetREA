package a;

import android.content.ComponentCallbacks2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/a64;", "La/stl;", "La/hik;", "<init>", "()V", "a/jdk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a64 extends stl<hik> {
    public fiu0 g2;
    public final nae0 h2 = ltt0.p(this, y54.f42031a);
    public final kiu0 i2;
    public final n0o0 j2;
    public final cgx0 k2;
    public static final /* synthetic */ iiy[] m2 = {new j0d0(a64.class, "binding", "getBinding()Lorg/xplatform/auth/entrypoints/impl/databinding/DialogAuthEntryPointsBinding;", 0), new ez40(a64.class, "isOnlySocialEntryPoints", "isOnlySocialEntryPoints()Z", 0)};
    public static final jdk0 l2 = new jdk0();

    public a64() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.x54
            public final /* synthetic */ a64 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                a64 a64Var = this.b;
                switch (b2) {
                    case 0:
                        jdk0 jdk0Var = a64.l2;
                        fiu0 fiu0Var = a64Var.g2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        jdk0 jdk0Var2 = a64.l2;
                        bk2 bk2Var = new bk2(1, (m64) a64Var.i2.getValue(), m64.class, "onAuthEntryPointClick", "onAuthEntryPointClick(I)V", 0, (byte) 26);
                        w54 w54Var = new w54();
                        w54Var.d.b(new gbn(new o33((byte) 11), new l9(3, (byte) 24), new b33(bk2Var, (byte) 14), zx3.d));
                        return w54Var;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new f80(new f80(this, (byte) 24), (byte) 25));
        this.i2 = agc.G(this, sre0.f32672a.b(m64.class), new t51(a8zVarA, (byte) 16), new t51(a8zVarA, (byte) 17), function0);
        final byte b2 = 1;
        this.j2 = maz.b(new Function0(this) { // from class: a.x54
            public final /* synthetic */ a64 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                a64 a64Var = this.b;
                switch (b3) {
                    case 0:
                        jdk0 jdk0Var = a64.l2;
                        fiu0 fiu0Var = a64Var.g2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        jdk0 jdk0Var2 = a64.l2;
                        bk2 bk2Var = new bk2(1, (m64) a64Var.i2.getValue(), m64.class, "onAuthEntryPointClick", "onAuthEntryPointClick(I)V", 0, (byte) 26);
                        w54 w54Var = new w54();
                        w54Var.d.b(new gbn(new o33((byte) 11), new l9(3, (byte) 24), new b33(bk2Var, (byte) 14), zx3.d));
                        return w54Var;
                }
            }
        });
        this.k2 = new cgx0("KEY_PARAMS");
    }

    @Override // a.sik
    public final int B0() {
        return R.style.ThemeOverlay_AppTheme_BottomSheetDialog;
    }

    @Override // a.stl
    public final yfu0 Q0() {
        Object objN = this.h2.n(m2[0], this);
        objN.getClass();
        return (hik) objN;
    }

    @Override // a.stl
    public final void S0() {
        Object objN = this.h2.n(m2[0], this);
        objN.getClass();
        ((hik) objN).b.setAdapter((w54) this.j2.getValue());
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(b64.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            b64 b64Var = (b64) (ze3Var instanceof b64 ? ze3Var : null);
            if (b64Var != null) {
                Boolean boolN = this.k2.n(this, m2[1]);
                ctf0 ctf0Var = b64Var.f2034a;
                yox yoxVar = b64Var.c;
                pru pruVar = b64Var.b;
                ctf0Var.getClass();
                gr00 gr00Var = new gr00();
                gr00Var.f11760a = boolN;
                gr00Var.b = pruVar;
                gr00Var.c = yoxVar;
                gr00Var.d = ctf0Var;
                gr00Var.e = new n8i(gr00Var, (byte) 1);
                this.g2 = new fiu0(Collections.singletonMap(m64.class, (n8i) gr00Var.e));
                return;
            }
        }
        jf4.n(b1j.i(b64.class, "Cannot create dependency "));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        kiu0 kiu0Var = this.i2;
        m64 m64Var = (m64) kiu0Var.getValue();
        c00 c00Var = new c00(m64Var.d, m64Var, (byte) 13);
        yje yjeVar = null;
        z54 z54Var = new z54(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tg3(c00Var, clzVarW, z54Var, (yje) null), 3);
        lr lrVar = new lr(((m64) kiu0Var.getValue()).e, (byte) 22);
        z54 z54Var2 = new z54(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new tg3(lrVar, clzVarW2, z54Var2, (yje) null), 3);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K = true;
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.N(3);
        }
    }
}
