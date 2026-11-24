package a;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a6x0 implements tdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f339a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6x0(Object obj, byte b) {
        this.f339a = b;
        this.b = obj;
    }

    @Override // a.tdr
    public final Object apply(Object obj) {
        byte b = this.f339a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((l6x0) obj2).c)), (Throwable) obj);
                return null;
            default:
                i8x0 i8x0Var = (i8x0) obj2;
                f4x0 f4x0Var = (f4x0) obj;
                hcp0 hcp0Var = new hcp0((byte) 23);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (i8x0.j) {
                            x8x0 x8x0Var = (x8x0) i8x0Var.d.get();
                            Uri uri = i8x0Var.g;
                            trm0 trm0Var = new trm0(f4x0Var.r());
                            trm0Var.c = new hcp0[]{hcp0Var};
                            x8x0Var.a(uri, trm0Var);
                            i8x0Var.h = f4x0Var.r();
                            break;
                        }
                        synchronized (i8x0.k) {
                            x8x0 x8x0Var2 = (x8x0) i8x0Var.d.get();
                            Uri uri2 = i8x0Var.i;
                            trm0 trm0Var2 = new trm0(f4x0Var.s());
                            trm0Var2.c = new hcp0[]{hcp0Var};
                            x8x0Var2.a(uri2, trm0Var2);
                            f4x0Var.s();
                            break;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
        }
    }
}
