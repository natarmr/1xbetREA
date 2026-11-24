package a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s4x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wpw0 f31630a;
    public static final wpw0 b;
    public static volatile xdw0 c;
    public static final Object d;
    public static Context e;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        new wpw0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±".getBytes(charset), (byte) 0);
        new wpw0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<".getBytes(charset), (byte) 1);
        new wpw0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí".getBytes(charset), (byte) 2);
        new wpw0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì".getBytes(charset), (byte) 3);
        f31630a = new wpw0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0".getBytes(charset), (byte) 4);
        b = new wpw0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0".getBytes(charset), (byte) 5);
        d = new Object();
    }

    public static void a() {
        xdw0 lcw0Var;
        if (c != null) {
            return;
        }
        s0x.H(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder iBinderB = ogn.c(e, ogn.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = gdw0.b;
                    if (iBinderB == null) {
                        lcw0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        lcw0Var = iInterfaceQueryLocalInterface instanceof xdw0 ? (xdw0) iInterfaceQueryLocalInterface : new lcw0(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", (byte) 3);
                    }
                    c = lcw0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static cgx0 b(String str, jzw0 jzw0Var, boolean z, boolean z2) {
        try {
            a();
            s0x.H(e);
            com.google.android.gms.common.zzt zztVar = new com.google.android.gms.common.zzt(str, jzw0Var, z, z2);
            try {
                xdw0 xdw0Var = c;
                aa60 aa60Var = new aa60(e.getPackageManager());
                lcw0 lcw0Var = (lcw0) xdw0Var;
                Parcel parcelG = lcw0Var.G();
                int i = mnw0.f22111a;
                boolean z3 = true;
                parcelG.writeInt(1);
                zztVar.writeToParcel(parcelG, 0);
                mnw0.b(parcelG, aa60Var);
                Parcel parcelE = lcw0Var.E(parcelG, 5);
                if (parcelE.readInt() == 0) {
                    z3 = false;
                }
                parcelE.recycle();
                return z3 ? cgx0.e : new lex0(new o0x0(z, str, jzw0Var));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return cgx0.A("module call", e2);
            }
        } catch (lgn e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return cgx0.A("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
