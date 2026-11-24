package a;

import android.content.ComponentCallbacks2;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hvs0;", "La/sik;", "<init>", "()V", "a/s9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hvs0 extends sik {
    public final s0r Y1;
    public final a8z Z1;
    public final kiu0 a2;
    public final phf0 b2;
    public static final /* synthetic */ iiy[] d2 = {new j0d0(hvs0.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/DialogTwoFactorAuthenticationQrCodeBinding;", 0), new ez40(hvs0.class, "authString", "getAuthString()Ljava/lang/String;", 0)};
    public static final s9m0 c2 = new s9m0();

    public hvs0() {
        super(R.layout.dialog_two_factor_authentication_qr_code);
        this.Y1 = ltt0.o(this, gvs0.f11991a);
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.fvs0
            public final /* synthetic */ hvs0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                hvs0 hvs0Var = this.b;
                switch (b2) {
                    case 0:
                        s9m0 s9m0Var = hvs0.c2;
                        ComponentCallbacks2 application = hvs0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(ivs0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof ivs0)) {
                                ze3Var = null;
                            }
                            ivs0 ivs0Var = (ivs0) ze3Var;
                            if (ivs0Var != null) {
                                String strN = hvs0Var.b2.n(hvs0Var, hvs0.d2[1]);
                                strN.getClass();
                                ctf0 ctf0Var = ivs0Var.f15459a;
                                ctf0Var.getClass();
                                return new lyi(ctf0Var, strN);
                            }
                        }
                        jf4.n(b1j.i(ivs0.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new fiu0(Collections.singletonMap(jvs0.class, ((lyi) hvs0Var.Z1.getValue()).c));
                }
            }
        };
        wez wezVar = wez.b;
        this.Z1 = maz.a(wezVar, function0);
        final byte b2 = 1;
        Function0 function1 = new Function0(this) { // from class: a.fvs0
            public final /* synthetic */ hvs0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                hvs0 hvs0Var = this.b;
                switch (b3) {
                    case 0:
                        s9m0 s9m0Var = hvs0.c2;
                        ComponentCallbacks2 application = hvs0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(ivs0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof ivs0)) {
                                ze3Var = null;
                            }
                            ivs0 ivs0Var = (ivs0) ze3Var;
                            if (ivs0Var != null) {
                                String strN = hvs0Var.b2.n(hvs0Var, hvs0.d2[1]);
                                strN.getClass();
                                ctf0 ctf0Var = ivs0Var.f15459a;
                                ctf0Var.getClass();
                                return new lyi(ctf0Var, strN);
                            }
                        }
                        jf4.n(b1j.i(ivs0.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new fiu0(Collections.singletonMap(jvs0.class, ((lyi) hvs0Var.Z1.getValue()).c));
                }
            }
        };
        a8z a8zVarA = maz.a(wezVar, new cvs0(new cvs0(this, (byte) 3), (byte) 4));
        this.a2 = agc.G(this, sre0.f32672a.b(jvs0.class), new p7r0(a8zVarA, (byte) 26), new p7r0(a8zVarA, (byte) 27), function1);
        this.b2 = new phf0("authString");
    }

    public final rjk I0() {
        Object objN = this.Y1.n(d2[0], this);
        objN.getClass();
        return (rjk) objN;
    }

    @Override // androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        Bitmap bitmap;
        view.getClass();
        I0().b.setOnClickListener(new jpe0(this, (byte) 15));
        Drawable drawable = I0().c.getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            bitmap.recycle();
        }
        Window window = D0().getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dnq dnqVar = new dnq(new vsg0(new meq0((jvs0) this.a2.getValue(), (yje) null, (byte) 27)), new pyn0(3, null, (byte) 4), (byte) 1);
        lkz lkzVar = lkz.f20223a;
        k5r0 k5r0Var = new k5r0(2, I0().c, ImageView.class, "setImageBitmap", "setImageBitmap(Landroid/graphics/Bitmap;)V", 4, (byte) 11);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0(dnqVar, clzVarW, k5r0Var, (yje) null), 3);
    }
}
