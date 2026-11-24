package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/gbq0;", "La/stl;", "La/pjk;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gbq0 extends stl<pjk> {
    public fiu0 g2;
    public final nae0 h2 = ltt0.p(this, fbq0.f9274a);
    public final kiu0 i2;
    public final es j2;
    public final phf0 k2;
    public final n0o0 l2;
    public static final /* synthetic */ iiy[] n2 = {new j0d0(gbq0.class, "binding", "getBinding()Lorg/xplatform/callback/impl/databinding/DialogThemeSelectorBinding;", 0), new ez40(gbq0.class, "items", "getItems()Ljava/util/List;", 0), new ez40(gbq0.class, "resultKey", "getResultKey()Ljava/lang/String;", 0)};
    public static final s2m0 m2 = new s2m0();

    public gbq0() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.ebq0
            public final /* synthetic */ gbq0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                gbq0 gbq0Var = this.b;
                switch (b2) {
                    case 0:
                        s2m0 s2m0Var = gbq0.m2;
                        fiu0 fiu0Var = gbq0Var.g2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        s2m0 s2m0Var2 = gbq0.m2;
                        w6q0 w6q0Var = new w6q0(1, (nbq0) gbq0Var.i2.getValue(), nbq0.class, "onClickedCallTheme", "onClickedCallTheme(I)V", 0, (byte) 2);
                        cbq0 cbq0Var = new cbq0();
                        cbq0Var.d.b(new gbn(new im8((byte) 13), new lq4(3, (byte) 15), new d38(w6q0Var, (byte) 22), zx3.y));
                        return cbq0Var;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new mfo0(new mfo0(this, (byte) 15), (byte) 16));
        this.i2 = agc.G(this, sre0.f32672a.b(nbq0.class), new r5p0(a8zVarA, (byte) 8), new r5p0(a8zVarA, (byte) 9), function0);
        this.j2 = new es("BUNDLE_THEME_ITEMS");
        this.k2 = new phf0("BUNDLE_RESULT_KEY");
        final byte b2 = 1;
        this.l2 = maz.b(new Function0(this) { // from class: a.ebq0
            public final /* synthetic */ gbq0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                gbq0 gbq0Var = this.b;
                switch (b3) {
                    case 0:
                        s2m0 s2m0Var = gbq0.m2;
                        fiu0 fiu0Var = gbq0Var.g2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        s2m0 s2m0Var2 = gbq0.m2;
                        w6q0 w6q0Var = new w6q0(1, (nbq0) gbq0Var.i2.getValue(), nbq0.class, "onClickedCallTheme", "onClickedCallTheme(I)V", 0, (byte) 2);
                        cbq0 cbq0Var = new cbq0();
                        cbq0Var.d.b(new gbn(new im8((byte) 13), new lq4(3, (byte) 15), new d38(w6q0Var, (byte) 22), zx3.y));
                        return cbq0Var;
                }
            }
        });
    }

    @Override // a.stl
    public final yfu0 Q0() {
        Object objN = this.h2.n(n2[0], this);
        objN.getClass();
        return (pjk) objN;
    }

    @Override // a.stl
    public final void S0() {
        Object objN = this.h2.n(n2[0], this);
        objN.getClass();
        ((pjk) objN).b.setAdapter((cbq0) this.l2.getValue());
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(dbq0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (((dbq0) (ze3Var instanceof dbq0 ? ze3Var : null)) != null) {
                this.g2 = new fiu0(Collections.singletonMap(nbq0.class, (xvi) new chf0(this.j2.n(this, n2[1])).c));
                return;
            }
        }
        jf4.n(b1j.i(dbq0.class, "Cannot create dependency "));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        kiu0 kiu0Var = this.i2;
        h2c h2cVar = new h2c(((nbq0) kiu0Var.getValue()).c, (byte) 23);
        int i = 4;
        Class<gbq0> cls = gbq0.class;
        bdl0 bdl0Var = new bdl0(2, this, cls, "handleEvent", "handleEvent(Lorg/xplatform/callback/impl/presentation/theme_selector/model/ThemeSelectorEvent;)V", i, (byte) 12);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new lto0(h2cVar, clzVarW, bdl0Var, (yje) null), 3);
        p7m0 p7m0Var = ((nbq0) kiu0Var.getValue()).d;
        bdl0 bdl0Var2 = new bdl0(2, this, cls, "handleUiState", "handleUiState(Lorg/xplatform/callback/impl/presentation/theme_selector/model/ThemeSelectorUiState;)V", i, (byte) 13);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new lto0(p7m0Var, clzVarW2, bdl0Var2, (yje) null), 3);
    }

    @Override // a.stl, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        U0();
    }
}
