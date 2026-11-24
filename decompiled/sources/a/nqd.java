package a;

import android.content.Context;
import android.os.Looper;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nqd implements qgk0, rmv, phi0, v8x0 {
    public static final nqd c;
    public static final nqd d;
    public static final nqd e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23954a;
    public boolean b;

    static {
        boolean z = true;
        c = new nqd((byte) 0, z);
        byte b = 1;
        d = new nqd(b, z);
        e = new nqd(b, false);
    }

    public nqd(ke60 ke60Var, je60 je60Var) throws ie60 {
        this.f23954a = (byte) 5;
        int i = je60Var.f16358a;
        ByteBuffer byteBuffer = je60Var.b;
        x0x.A(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        q8b q8bVar = new q8b(bArr, iMin);
        if (ke60Var.f18139a) {
            throw new ie60();
        }
        if (q8bVar.f()) {
            this.b = false;
            return;
        }
        int iG = q8bVar.g(2);
        boolean zF = q8bVar.f();
        if (ke60Var.b) {
            throw new ie60();
        }
        if (!zF) {
            this.b = true;
            return;
        }
        boolean zF2 = (iG == 3 || iG == 0) ? true : q8bVar.f();
        q8bVar.n();
        if (!ke60Var.d) {
            throw new ie60();
        }
        if (q8bVar.f()) {
            if (!ke60Var.e) {
                throw new ie60();
            }
            q8bVar.n();
        }
        if (ke60Var.c) {
            throw new ie60();
        }
        if (iG != 3) {
            q8bVar.n();
        }
        q8bVar.o(ke60Var.f);
        if (iG != 2 && iG != 0 && !zF2) {
            q8bVar.o(3);
        }
        this.b = ((iG == 3 || iG == 0) ? 255 : q8bVar.g(8)) != 0;
    }

    @Override // a.phi0
    public void G(sgy sgyVar, Function1 function1) {
        sgyVar.getClass();
    }

    @Override // a.rmv
    public boolean a() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.v8x0
    public /* bridge */ /* synthetic */ Object b(h0q0 h0q0Var) {
        q3x0 q3x0VarA;
        InputStream inputStreamY = cem0.y(h0q0Var);
        try {
            int i = 4096;
            if (this.b) {
                if (inputStreamY instanceof e9x0) {
                    long length = ((e9x0) inputStreamY).zza().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                q3x0VarA = q3x0.a(tdw0.h(inputStreamY, i), true);
            } else {
                q3x0VarA = q3x0.a(tdw0.h(inputStreamY, 4096), false);
            }
            bkb.E(inputStreamY, null);
            return q3x0VarA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bkb.E(inputStreamY, th);
                throw th2;
            }
        }
    }

    @Override // a.rmv
    public boolean c(f7k0 f7k0Var) {
        return this.b;
    }

    public bjk d() {
        return new bjk(null, false, false, this.b);
    }

    public void e(File file, BufferedInputStream bufferedInputStream, byte[] bArr) throws IOException {
        switch (this.f23954a) {
            case 10:
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    byte[] bArr2 = new byte[8192];
                    int i = 0;
                    while (i != -1) {
                        if (this.b) {
                            this.b = false;
                            bufferedInputStream.read(bArr2);
                            if (!Arrays.equals(bArr2, bArr)) {
                                throw new qoe();
                            }
                        } else {
                            fileOutputStream.write(bArr2, 0, i);
                            i = bufferedInputStream.read(bArr2);
                        }
                    }
                    fileOutputStream.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(fileOutputStream, th);
                        throw th2;
                    }
                }
            default:
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    byte[] bArr3 = new byte[8192];
                    int i2 = 0;
                    while (i2 != -1) {
                        if (this.b) {
                            this.b = false;
                            bufferedInputStream.read(bArr3);
                            if (!Arrays.equals(bArr3, bArr)) {
                                throw new qoe();
                            }
                        } else {
                            fileOutputStream2.write(bArr3, 0, i2);
                            i2 = bufferedInputStream.read(bArr3);
                        }
                    }
                    fileOutputStream2.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        bkb.E(fileOutputStream2, th3);
                        throw th4;
                    }
                }
        }
    }

    public void f(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }

    @Override // a.phi0
    public void h(sgy sgyVar, sgy sgyVar2, jiy jiyVar) {
        c3x c3xVarL = jiyVar.getDescriptor().l();
        if ((c3xVarL instanceof tua0) || Intrinsics.d(c3xVarL, ygi0.b)) {
            c99.p("Serializer for ", sgyVar2.J(), " can't be registered as a subclass for polymorphic serialization because its kind ", c3xVarL, " is not concrete. To work with multiple hierarchies, register it as a base class.");
            return;
        }
        if (this.b) {
            if (Intrinsics.d(c3xVarL, aum0.c) || Intrinsics.d(c3xVarL, aum0.d) || (c3xVarL instanceof zvb0) || (c3xVarL instanceof zgi0)) {
                c99.p("Serializer for ", sgyVar2.J(), " of kind ", c3xVarL, " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    public String toString() {
        switch (this.f23954a) {
            case 1:
                return rw2.p(new StringBuilder("IncorrectFragmentation{expected="), !this.b, "}");
            default:
                return super.toString();
        }
    }

    @Override // a.phi0
    public void B(sgy sgyVar, Function1 function1) {
    }

    @Override // a.phi0
    public void K(sgy sgyVar, Function1 function1) {
    }

    public /* synthetic */ nqd(byte b, boolean z) {
        this.f23954a = b;
        this.b = z;
    }

    public nqd(dcy dcyVar) {
        this.f23954a = (byte) 4;
        this.b = dcyVar.h != olc.f25445a;
    }

    public nqd() {
        this.f23954a = (byte) 7;
        this.b = khk.f18297a.b(SurfaceOrderQuirk.class) != null;
    }

    public nqd(Context context, Looper looper, l9o0 l9o0Var) {
        this.f23954a = (byte) 9;
        new bzs0(context.getApplicationContext());
        l9o0Var.a(looper, null);
        l9o0Var.a(Looper.getMainLooper(), null);
    }

    public /* synthetic */ nqd(byte b) {
        this.f23954a = b;
    }
}
