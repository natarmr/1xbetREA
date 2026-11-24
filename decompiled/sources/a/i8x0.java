package a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class i8x0 {
    public static final Object j = new Object();
    public static final Object k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14363a;
    public final lin0 b;
    public final lin0 c;
    public final lin0 d;
    public final lin0 e;
    public final lin0 f;
    public final Uri g;
    public volatile w3x0 h;
    public final Uri i;

    public i8x0(Context context, lin0 lin0Var, lin0 lin0Var2, lin0 lin0Var3) {
        this.f14363a = context;
        this.c = lin0Var;
        this.b = lin0Var3;
        this.d = lin0Var2;
        Pattern pattern = b9x0.f2232a;
        zcw0 zcw0Var = new zcw0(context);
        zcw0Var.g("phenotype_storage_info");
        zcw0Var.k("storage-info.pb");
        this.g = zcw0Var.l();
        zcw0 zcw0Var2 = new zcw0(context);
        zcw0Var2.g("phenotype_storage_info");
        zcw0Var2.k("device-encrypted-storage-info.pb");
        Set set = b9x0.d;
        aem0.C(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        zcw0Var2.b = "directboot-files";
        this.i = zcw0Var2.l();
        byte b = 1;
        this.e = hfm0.z(new h1x0(this, b));
        this.f = hfm0.z(new n1x0(lin0Var, b));
    }

    public final void a() {
        if (!m0x0.X(this.f14363a) || c().v() + 86400000 >= System.currentTimeMillis()) {
            n3x n3xVar = n3x.b;
            return;
        }
        fr40 fr40Var = (fr40) this.c.get();
        fr40Var.getClass();
        ig00 ig00VarJ = hkb.J((ig00) this.f.get());
        int i = fpq.h;
        n5.q(ig00VarJ instanceof fpq ? (fpq) ig00VarJ : new hwq(ig00VarJ), new v5x0(this, (byte) 2), fr40Var);
    }

    public final t7x0 b() {
        w3x0 w3x0VarC = c();
        return new t7x0(w3x0VarC.t(), b4x.o(w3x0VarC.y()), w3x0VarC.s(), w3x0VarC.u(), (w3x0VarC.z() && w3x0VarC.A().s() == ((long) Build.VERSION.SDK_INT)) ? w3x0VarC.A().r() : "", b4x.o(w3x0VarC.w()), b4x.o(w3x0VarC.x()), w3x0VarC.r(), w3x0VarC.C(), w3x0VarC.B(), w3x0VarC.D());
    }

    public final w3x0 c() {
        w3x0 w3x0VarF;
        w3x0 w3x0Var = this.h;
        if (w3x0Var != null) {
            return w3x0Var;
        }
        synchronized (j) {
            w3x0VarF = this.h;
            if (w3x0VarF == null) {
                w3x0VarF = w3x0.F();
                if (m0x0.X(this.f14363a)) {
                    yfw0 yfw0Var = (yfw0) w3x0VarF.q(7);
                    bew0 bew0Var = bew0.b;
                    int i = ldw0.f19874a;
                    bew0 bew0Var2 = bew0.c;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream inputStreamY = cem0.y(((x8x0) this.d.get()).b(this.g));
                        try {
                            mew0 mew0VarA = ((jew0) yfw0Var).a(inputStreamY, bew0Var2);
                            if (inputStreamY != null) {
                                inputStreamY.close();
                            }
                            w3x0 w3x0Var2 = (w3x0) mew0VarA;
                            StrictMode.setThreadPolicy(threadPolicy);
                            w3x0VarF = w3x0Var2;
                        } catch (Throwable th) {
                            if (inputStreamY != null) {
                                try {
                                    inputStreamY.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th3;
                    }
                    this.h = w3x0VarF;
                }
            }
        }
        return w3x0VarF;
    }
}
