package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.Window;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Pair;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/qz9;", "La/by5;", "La/rz9;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qz9 extends by5<rz9> {
    public fbi b2;
    public ii c2;
    public final yzn0 d2 = new yzn0("quality_param");
    public final yzn0 e2 = new yzn0("RESULT_KEY");
    public final nae0 f2 = ltt0.p(this, kz9.f19143a);
    public final kiu0 g2;
    public final a8z h2;
    public final a8z i2;
    public final a8z j2;
    public final a8z k2;
    public final a8z l2;
    public final a8z m2;
    public final a8z n2;
    public final a8z o2;
    public final a8z p2;
    public okz q2;
    public final a8z r2;
    public final a8z s2;
    public static final /* synthetic */ iiy[] u2 = {new ez40(qz9.class, "qualityType", "getQualityType()Lorg/xplatform/camera/api/presentation/models/QualityType;", 0), new ez40(qz9.class, "cameraResult", "getCameraResult-d1pmJ48()Ljava/lang/Object;", 0), new j0d0(qz9.class, "binding", "getBinding()Lorg/xplatform/camera/impl/databinding/CameraFragmentBinding;", 0)};
    public static final kl5 t2 = new kl5();

    public qz9() {
        byte b = 8;
        hz9 hz9Var = new hz9(this, b);
        h79 h79Var = new h79(this, (byte) 7);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new h79(h79Var, b));
        this.g2 = agc.G(this, sre0.f32672a.b(d4a.class), new rt6(a8zVarA, (byte) 22), new rt6(a8zVarA, (byte) 23), hz9Var);
        this.h2 = maz.a(wezVar, new mn9((byte) 14));
        this.i2 = maz.a(wezVar, new hz9(this, (byte) 11));
        this.j2 = maz.a(wezVar, new hz9(this, (byte) 12));
        this.k2 = maz.a(wezVar, new hz9(this, (byte) 13));
        this.l2 = maz.a(wezVar, new hz9(this, (byte) 1));
        this.m2 = maz.a(wezVar, new hz9(this, (byte) 2));
        this.n2 = maz.a(wezVar, new hz9(this, (byte) 3));
        this.o2 = maz.a(wezVar, new hz9(this, (byte) 4));
        this.p2 = maz.a(wezVar, new hz9(this, (byte) 5));
        this.r2 = maz.a(wezVar, new hz9(this, (byte) 9));
        this.s2 = maz.a(wezVar, new hz9(this, (byte) 10));
    }

    @Override // a.by5
    public final void K0() {
        byte b = 6;
        ccq0.T(this, "REQUEST_KEY_PERMISSION_DIALOG", new hz9(this, b));
        ccq0.V(this, "REQUEST_KEY_PERMISSION_DIALOG", new hz9(this, (byte) 7));
        byte b2 = 0;
        ccq0.V(this, "REQUEST_KEY_CAMERA_UNAVAILABLE_DIALOG", new hz9(this, b2));
        DsSegmentedGroup.f(I0().n, new iz9(this, b2));
        dyb.c0(I0().k, new iz9(this, (byte) 1));
        dyb.c0(I0().i, new iz9(this, (byte) 2));
        dyb.c0(I0().l, new iz9(this, (byte) 3));
        dyb.c0(I0().f, new iz9(this, (byte) 4));
        dyb.c0(I0().b, new iz9(this, (byte) 5));
        dyb.c0(I0().c, new iz9(this, b));
    }

    @Override // a.by5
    public final void L0() {
        Object value;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        Bitmap bitmapG = null;
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(sz9.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof sz9)) {
                ze3Var = null;
            }
            sz9 sz9Var = (sz9) ze3Var;
            if (sz9Var != null) {
                Context applicationContext = o0().getApplicationContext();
                applicationContext.getClass();
                Size size = new Size(applicationContext.getResources().getDisplayMetrics().widthPixels, applicationContext.getResources().getDisplayMetrics().heightPixels);
                cad cadVar = sz9Var.f33060a;
                ii iiVar = sz9Var.b;
                iiVar.getClass();
                this.b2 = (fbi) ((n5d0) new khf0(cadVar, iiVar, size).d).get();
                this.c2 = iiVar;
                d4a d4aVarS0 = S0();
                try {
                    File file = new File(o0().getCacheDir(), "temporary_blur_image.jpg");
                    if (file.exists()) {
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
                        bitmapDecodeFile.getClass();
                        bitmapG = wb.G(bitmapDecodeFile, 0.0f);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                p7m0 p7m0Var = d4aVarS0.k;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, bitmapG));
                return;
            }
        }
        jf4.n(b1j.i(sz9.class, "Cannot create dependency "));
    }

    @Override // a.by5
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final rz9 I0() {
        Object objN = this.f2.n(u2[2], this);
        objN.getClass();
        return (rz9) objN;
    }

    public final d4a S0() {
        return (d4a) this.g2.getValue();
    }

    public final void T0(boolean z) {
        View decorView;
        Window window = D0().getWindow();
        if (window != null) {
            Window window2 = D0().getWindow();
            cjv0 cjv0Var = (window2 == null || (decorView = window2.getDecorView()) == null) ? null : new cjv0(window, decorView);
            if (cjv0Var != null) {
                cjv0Var.c(2);
            }
            if (z) {
                if (cjv0Var != null) {
                    cjv0Var.a(519);
                }
                window.addFlags(512);
            } else {
                if (cjv0Var != null) {
                    cjv0Var.d(519);
                }
                window.clearFlags(512);
            }
        }
    }

    public final void U0() {
        v1r v1rVarR = n0().r();
        j0g0 j0g0Var = (j0g0) this.e2.n(this, u2[1]);
        v1rVarR.t0(i120.V(new Pair(m2a.class.getName(), j0g0Var)), m2a.class.getName());
    }

    public final void V0(boolean z) {
        I0().j.setVisibility(z ? 0 : 8);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        T0(true);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void h0() {
        super.h0();
        try {
            Bitmap bitmap = (Bitmap) S0().k.getValue();
            if (bitmap != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(o0().getCacheDir(), "temporary_blur_image.jpg"));
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, ((kkd0) this.d2.n(this, u2[0])).f18432a, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(fileOutputStream, th);
                        throw th2;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DsSegmentedGroup dsSegmentedGroup = I0().n;
        int childCount = dsSegmentedGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            dsSegmentedGroup.getChildAt(i).animate().cancel();
        }
        I0().j.animate().cancel();
        I0().k.animate().cancel();
        I0().i.animate().cancel();
        I0().c.animate().cancel();
        T0(false);
        try {
            e0g0 e0g0Var = j0g0.b;
            ((lyb0) this.k2.getValue()).f20855a.C();
        } catch (Throwable unused) {
            e0g0 e0g0Var2 = j0g0.b;
        }
        ((ig00) this.i2.getValue()).cancel(true);
        ((oz9) this.r2.getValue()).disable();
        d4a d4aVarS0 = S0();
        d4aVarS0.B();
        p7m0 p7m0Var = d4aVarS0.h;
        p7m0Var.getClass();
        p7m0Var.o(null, elu0.f8019a);
    }

    @Override // a.by5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        n0().setTheme(qem0.p(o0()));
        M0();
        p7m0 p7m0Var = S0().h;
        yje yjeVar = null;
        nz9 nz9Var = new nz9(this, yjeVar, (byte) 6);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new l19(p7m0Var, clzVarW, nz9Var, (yje) null, (byte) 0, (byte) 0), 3);
        p7m0 p7m0Var2 = S0().k;
        nz9 nz9Var2 = new nz9(this, yjeVar, (byte) 3);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new l19(p7m0Var2, clzVarW2, nz9Var2, (yje) null, 0), 3);
        p7m0 p7m0Var3 = S0().n;
        nz9 nz9Var3 = new nz9(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new l19((gmq) p7m0Var3, clzVarW3, nz9Var3, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var4 = S0().m;
        nz9 nz9Var4 = new nz9(this, yjeVar, (byte) 2);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new l19((gmq) p7m0Var4, clzVarW4, nz9Var4, (yje) null, (char) 0), 3);
        ol60 ol60Var = S0().i;
        nz9 nz9Var5 = new nz9(this, yjeVar, (byte) 5);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new l19((gmq) ol60Var, clzVarW5, nz9Var5, (yje) null, (byte) 0, false), 3);
    }
}
