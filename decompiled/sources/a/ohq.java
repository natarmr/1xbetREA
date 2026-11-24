package a;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ohq implements jgd, iuo, ols0, Continuation, OnFailureListener, yvb0, sky, fh60, cxw, eer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25276a;

    public /* synthetic */ ohq(pzu pzuVar) {
        this.f25276a = (byte) 6;
    }

    public static /* synthetic */ void c(int i, int i2, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(("No parameter with index " + i + '+' + i2 + ((Object) " (name=") + obj + ((Object) " type=") + obj2 + ((Object) ") in ") + obj3).toString());
    }

    public static /* synthetic */ void g(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static /* synthetic */ void h(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(int i, String str, Object obj) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void j(Object obj, Object obj2, String str) {
        throw new ss3(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void l(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, int i) throws IOException {
        throw new IOException(str + obj + obj2 + i);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + '\'').toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void p(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void q(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void r(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void s(String str) throws wch0 {
        throw new wch0(str);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new poe(str + obj);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new poe(str + obj);
    }

    public static /* synthetic */ void v(Object obj, String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj);
    }

    @Override // a.yvb0
    public Object a(l7x l7xVar) throws GeneralSecurityException {
        cjc cjcVar = new cjc();
        if (brm0.b(2)) {
            return cjcVar;
        }
        hny.o("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        return null;
    }

    @Override // a.ols0, a.eer
    /* JADX INFO: renamed from: apply */
    public Object mo11apply(Object obj) {
        switch (this.f25276a) {
            case 2:
                nd90 nd90Var = (nd90) obj;
                try {
                    int iG = nd90Var.g(null);
                    byte[] bArr = new byte[iG];
                    qyc qycVar = new qyc(bArr, iG);
                    nd90Var.h(qycVar);
                    if (iG - qycVar.d == 0) {
                        return bArr;
                    }
                    throw new IllegalStateException("Did not write as much data as expected.");
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + nd90.class.getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            default:
                return null;
        }
    }

    @Override // a.sky
    public l7x b(dhi0 dhi0Var) throws GeneralSecurityException {
        w4d0 w4d0Var = (w4d0) dhi0Var;
        if (!w4d0Var.f38538a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            jf4.o("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            lfw lfwVarC = lfw.C(w4d0Var.c, qso.a());
            if (lfwVarC.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            f7u f7uVar = new f7u();
            f7uVar.b = null;
            f7uVar.c = null;
            f7uVar.d = null;
            f7uVar.e = pfw.f;
            f7uVar.b = Integer.valueOf(lfwVarC.y().size());
            f7uVar.c = Integer.valueOf(lfwVarC.z().z());
            f7uVar.d = tfw.a(lfwVarC.z().y());
            f7uVar.e = tfw.b(w4d0Var.e);
            qfw qfwVarA = f7uVar.a();
            gxu gxuVar = new gxu();
            gxuVar.b = null;
            gxuVar.c = null;
            gxuVar.f12096a = qfwVarA;
            gxuVar.b = new iw20(sg9.a(lfwVarC.y().h()));
            gxuVar.c = w4d0Var.f;
            return gxuVar.a();
        } catch (ynx | IllegalArgumentException unused) {
            hny.o("Parsing HmacKey failed");
            return null;
        }
    }

    @Override // a.cxw
    public boolean e(int i, int i2, int i3, int i4, int i5) {
        switch (this.f25276a) {
            case 17:
                return false;
            default:
                return i != 2 ? !(i2 == 65 && i3 == 80 && i4 == 73 && i5 == 67) : !(i2 == 80 && i3 == 73 && i4 == 67);
        }
    }

    @Override // a.iuo
    public fuo[] f() {
        switch (this.f25276a) {
            case 1:
                return new fuo[]{new yiq()};
            default:
                return new fuo[]{new gpq()};
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.f25276a) {
            case 7:
                exc.getClass();
                exc.printStackTrace();
                break;
            default:
                exc.getClass();
                exc.printStackTrace();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            l("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            l("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            l(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        l("SERVICE_NOT_AVAILABLE");
        return null;
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        return FirebaseSessionsRegistrar.getComponents$lambda$1(pzuVar);
    }

    public /* synthetic */ ohq(byte b) {
        this.f25276a = b;
    }
}
