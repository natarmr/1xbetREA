package a;

import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gyw implements ept0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12152a;
    public final wy40 b;

    public gyw(wy40 wy40Var, byte b) {
        this.f12152a = b;
        switch (b) {
            case 1:
                this.b = wy40Var;
                u15 u15Var = xto0.A0;
                Class cls = (Class) wy40Var.e(u15Var, null);
                if (cls != null && !cls.equals(mzw.class)) {
                    itt0.l("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                wy40Var.y(fpt0.N0, hpt0.f13459a);
                wy40Var.y(u15Var, mzw.class);
                u15 u15Var2 = xto0.z0;
                if (wy40Var.e(u15Var2, null) == null) {
                    wy40Var.y(u15Var2, mzw.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.b = wy40Var;
                u15 u15Var3 = xto0.A0;
                Class cls2 = (Class) wy40Var.e(u15Var3, null);
                if (cls2 != null && !cls2.equals(oub0.class)) {
                    itt0.l("Invalid target class configuration for ", this, ": ", cls2);
                    throw null;
                }
                wy40Var.y(fpt0.N0, hpt0.b);
                wy40Var.y(u15Var3, oub0.class);
                u15 u15Var4 = xto0.z0;
                if (wy40Var.e(u15Var4, null) == null) {
                    wy40Var.y(u15Var4, oub0.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                u15 u15Var5 = w0x.n0;
                if (((Integer) wy40Var.e(u15Var5, -1)).intValue() == -1) {
                    wy40Var.y(u15Var5, 2);
                    return;
                }
                return;
            default:
                this.b = wy40Var;
                u15 u15Var6 = xto0.A0;
                Class cls3 = (Class) wy40Var.e(u15Var6, null);
                if (cls3 != null && !cls3.equals(jyw.class)) {
                    itt0.l("Invalid target class configuration for ", this, ": ", cls3);
                    throw null;
                }
                wy40Var.y(fpt0.N0, hpt0.c);
                wy40Var.y(u15Var6, jyw.class);
                u15 u15Var7 = xto0.z0;
                if (wy40Var.e(u15Var7, null) == null) {
                    wy40Var.y(u15Var7, jyw.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    public mzw a() {
        u15 u15Var = nzw.e;
        wy40 wy40Var = this.b;
        Integer num = (Integer) wy40Var.e(u15Var, null);
        if (num != null) {
            wy40Var.y(h0x.h0, num);
        } else {
            jzw jzwVar = mzw.C;
            u15 u15Var2 = nzw.f;
            if (Objects.equals(wy40Var.e(u15Var2, null), 2)) {
                wy40Var.y(h0x.h0, 32);
            } else if (Objects.equals(wy40Var.e(u15Var2, null), 3)) {
                wy40Var.y(h0x.h0, 32);
                wy40Var.y(h0x.i0, 256);
            } else if (Objects.equals(wy40Var.e(u15Var2, null), 1)) {
                wy40Var.y(h0x.h0, 4101);
                wy40Var.y(h0x.j0, agn.c);
            } else {
                wy40Var.y(h0x.h0, 256);
            }
        }
        nzw nzwVar = new nzw(b780.j(wy40Var));
        w0x.t(nzwVar);
        mzw mzwVar = new mzw(nzwVar);
        Size size = (Size) wy40Var.e(w0x.o0, null);
        if (size != null) {
            mzwVar.v = new Rational(size.getWidth(), size.getHeight());
        }
        z1x.x((Executor) wy40Var.e(uox.u0, vox.a()), "The IO executor can't be null");
        u15 u15Var3 = nzw.c;
        if (wy40Var.f2093a.containsKey(u15Var3)) {
            Integer num2 = (Integer) wy40Var.d(u15Var3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                e9d0.i(num2, "The flash mode is not allowed to set: ");
                return null;
            }
            if (num2.intValue() == 3 && wy40Var.e(nzw.k, null) == null) {
                jf4.o("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return null;
            }
        }
        return mzwVar;
    }

    @Override // a.xro
    public final wy40 b() {
        switch (this.f12152a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }

    @Override // a.ept0
    public final fpt0 e() {
        byte b = this.f12152a;
        wy40 wy40Var = this.b;
        switch (b) {
            case 0:
                return new myw(b780.j(wy40Var));
            case 1:
                return new nzw(b780.j(wy40Var));
            default:
                return new pub0(b780.j(wy40Var));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gyw(byte b) {
        this(wy40.l(), (byte) 0);
        this.f12152a = b;
        switch (b) {
            case 1:
                this(wy40.l(), (byte) 1);
                break;
            case 2:
                this(wy40.l(), (byte) 2);
                break;
            default:
                break;
        }
    }
}
