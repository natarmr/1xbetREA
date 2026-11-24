package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/yfc0;", "La/stl;", "La/zo8;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yfc0 extends stl<zo8> {
    public fiu0 g2;
    public final kiu0 h2;
    public final nae0 i2;
    public final a8z j2;
    public final phf0 k2;
    public static final /* synthetic */ iiy[] m2 = {new j0d0(yfc0.class, "binding", "getBinding()Lorg/xplatform/makebet_promocodes/impl/databinding/BottomSheetFragmentPromoCodesBinding;", 0), new ez40(yfc0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final xi70 l2 = new xi70();

    public yfc0() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.vfc0
            public final /* synthetic */ yfc0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                yfc0 yfc0Var = this.b;
                switch (b2) {
                    case 0:
                        fiu0 fiu0Var = yfc0Var.g2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        xi70 xi70Var = yfc0.l2;
                        l8c0 l8c0Var = new l8c0(1, (jhc0) yfc0Var.h2.getValue(), jhc0.class, "onPromoCodeClicked", "onPromoCodeClicked(Ljava/lang/String;)V", 0, (byte) 15);
                        tfc0 tfc0Var = new tfc0();
                        ((dp) tfc0Var.e).b(new gbn(new t4c0((byte) 17), new o5c0(3, (byte) 9), new ppb0(l8c0Var, (byte) 15), x4c0.l));
                        return tfc0Var;
                }
            }
        };
        g8b0 g8b0Var = new g8b0(this, (byte) 15);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new g8b0(g8b0Var, (byte) 16));
        this.h2 = agc.G(this, sre0.f32672a.b(jhc0.class), new x6b0(a8zVarA, (byte) 18), new x6b0(a8zVarA, (byte) 19), function0);
        this.i2 = ltt0.p(this, wfc0.f39065a);
        final byte b2 = 1;
        this.j2 = maz.a(wezVar, new Function0(this) { // from class: a.vfc0
            public final /* synthetic */ yfc0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                yfc0 yfc0Var = this.b;
                switch (b3) {
                    case 0:
                        fiu0 fiu0Var = yfc0Var.g2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        xi70 xi70Var = yfc0.l2;
                        l8c0 l8c0Var = new l8c0(1, (jhc0) yfc0Var.h2.getValue(), jhc0.class, "onPromoCodeClicked", "onPromoCodeClicked(Ljava/lang/String;)V", 0, (byte) 15);
                        tfc0 tfc0Var = new tfc0();
                        ((dp) tfc0Var.e).b(new gbn(new t4c0((byte) 17), new o5c0(3, (byte) 9), new ppb0(l8c0Var, (byte) 15), x4c0.l));
                        return tfc0Var;
                }
            }
        });
        this.k2 = new phf0("REQUEST_KEY");
    }

    @Override // a.stl
    public final void S0() throws Exception {
        Q0().d.setAdapter((tfc0) this.j2.getValue());
        byte b = 1;
        Q0().d.m(new wn8(epv0.U(R.drawable.divider_drawable_opacity_with_spaces, o0()), b));
        kiu0 kiu0Var = this.h2;
        xae0 xae0VarN = vtb.N(((jhc0) kiu0Var.getValue()).n);
        yje yjeVar = null;
        xfc0 xfc0Var = new xfc0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new p8c0(xae0VarN, clzVarW, xfc0Var, (yje) null), 3);
        ol60 ol60Var = ((jhc0) kiu0Var.getValue()).o;
        xfc0 xfc0Var2 = new xfc0(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new p8c0(ol60Var, clzVarW2, xfc0Var2, (yje) null), 3);
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(jgc0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            jgc0 jgc0Var = (jgc0) (ze3Var instanceof jgc0 ? ze3Var : null);
            if (jgc0Var != null) {
                cad cadVar = jgc0Var.f16473a;
                ctf0 ctf0Var = jgc0Var.b;
                gst0 gst0Var = jgc0Var.c;
                wsf0 wsf0Var = jgc0Var.d;
                lgc0 lgc0Var = jgc0Var.e;
                sue sueVar = jgc0Var.f;
                m1e m1eVar = jgc0Var.g;
                iw20 iw20Var = jgc0Var.h;
                sueVar.getClass();
                ctf0Var.getClass();
                gst0Var.getClass();
                lgc0Var.getClass();
                m1eVar.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = lgc0Var;
                g45Var.b = ctf0Var;
                g45Var.c = cadVar;
                g45Var.d = sueVar;
                g45Var.e = wsf0Var;
                g45Var.f = gst0Var;
                g45Var.g = m1eVar;
                g45Var.h = iw20Var;
                g45Var.i = new ppi(g45Var, (byte) 2);
                this.g2 = new fiu0(Collections.singletonMap(jhc0.class, (ppi) g45Var.i));
                return;
            }
        }
        jf4.n(b1j.i(jgc0.class, "Cannot create dependency "));
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final zo8 Q0() {
        Object objN = this.i2.n(m2[0], this);
        objN.getClass();
        return (zo8) objN;
    }
}
