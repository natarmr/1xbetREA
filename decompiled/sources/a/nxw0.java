package a;

import android.net.Uri;
import com.google.android.gms.measurement.internal.zzao;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class nxw0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24303a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public nxw0(m6x0 m6x0Var, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.f24303a = (byte) 2;
        this.c = zzrVar;
        Objects.requireNonNull(m6x0Var);
        this.b = m6x0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.f24303a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                m6x0 m6x0Var = ((oyw0) obj).f26078a;
                m6x0Var.V();
                zlw0 zlw0Var = m6x0Var.c;
                m6x0.T(zlw0Var);
                return zlw0Var.i2((String) obj2);
            case 1:
                m6x0 m6x0Var2 = ((oyw0) obj).f26078a;
                m6x0Var2.V();
                return new zzao(m6x0Var2.p0(((com.google.android.gms.measurement.internal.zzr) obj2).f45550a));
            case 2:
                com.google.android.gms.measurement.internal.zzr zzrVar = (com.google.android.gms.measurement.internal.zzr) obj2;
                String str = zzrVar.f45550a;
                s0x.H(str);
                m6x0 m6x0Var3 = (m6x0) obj;
                xyw0 xyw0VarA = m6x0Var3.a(str);
                wyw0 wyw0Var = wyw0.ANALYTICS_STORAGE;
                if (xyw0VarA.i(wyw0Var) && xyw0.c(100, zzrVar.s).i(wyw0Var)) {
                    return m6x0Var3.c0(zzrVar).F();
                }
                m6x0Var3.r().o.a("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                glt0 glt0Var = (glt0) obj2;
                y7x0 y7x0Var = (y7x0) obj;
                c1x0 c1x0Var = (c1x0) glt0Var.b;
                hcp0 hcp0Var = new hcp0((byte) 23);
                try {
                    x8x0 x8x0Var = (x8x0) c1x0Var.f.get();
                    Uri uri = (Uri) glt0Var.c;
                    trm0 trm0Var = new trm0(y7x0Var);
                    trm0Var.c = new hcp0[]{hcp0Var};
                    break;
                } catch (IOException | RuntimeException e) {
                    k7n0.I(Level.WARNING, c1x0Var.a(), e, "Failed to update snapshot for %s flags may be stale.", (String) glt0Var.d);
                }
                return null;
        }
    }

    public /* synthetic */ nxw0(oyw0 oyw0Var, Object obj, byte b) {
        this.f24303a = b;
        this.c = obj;
        this.b = oyw0Var;
    }

    public /* synthetic */ nxw0(glt0 glt0Var, y7x0 y7x0Var) {
        this.f24303a = (byte) 3;
        this.c = glt0Var;
        this.b = y7x0Var;
    }
}
