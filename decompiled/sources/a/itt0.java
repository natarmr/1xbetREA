package a;

import android.javax.sip.InvalidArgumentException;
import com.google.android.recaptcha.internal.zzce;
import com.google.android.recaptcha.internal.zznm;
import com.google.android.recaptcha.internal.zznn;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.NoSuchElementException;
import okhttp3.EventListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class itt0 implements iuo, sky, EventListener.Factory {
    public static /* synthetic */ void a() {
        throw new NoSuchElementException();
    }

    public static void c(int i) {
        throw new vdt0(twn.m(i, "An unknown field for index "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void g(int i, int i2, Throwable th) throws zzce {
        throw new zzce(i, i2, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(int i, long j) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + j);
    }

    public static /* synthetic */ void i(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    public static /* synthetic */ void j(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void o(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void p() throws yew0 {
        throw new yew0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void q(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void r(String str) throws InvalidArgumentException {
        throw new InvalidArgumentException(str);
    }

    public static /* synthetic */ void s(Throwable th) {
        throw new tiu0(th);
    }

    public static /* synthetic */ void t() throws zznm {
        throw new zznm("Protocol message tag had invalid wire type.");
    }

    public static /* synthetic */ void u(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void v(String str) throws zznn {
        throw new zznn(str);
    }

    public static /* synthetic */ void w(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void x(String str) throws zew0 {
        throw new zew0(str);
    }

    @Override // a.sky
    public l7x b(dhi0 dhi0Var) throws GeneralSecurityException {
        y60 y60Var;
        w4d0 w4d0Var = (w4d0) dhi0Var;
        if (!w4d0Var.f38538a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            jf4.o("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
            return null;
        }
        try {
            vxv0 vxv0VarA = vxv0.A(w4d0Var.c, qso.a());
            if (vxv0VarA.y() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            af80 af80Var = w4d0Var.e;
            int iOrdinal = af80Var.ordinal();
            if (iOrdinal == 1) {
                y60Var = y60.h;
            } else if (iOrdinal == 2) {
                y60Var = y60.i;
            } else if (iOrdinal == 3) {
                y60Var = y60.j;
            } else {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + af80Var.b());
                }
                y60Var = y60.i;
            }
            return wxv0.h0(y60Var, new iw20(sg9.a(vxv0VarA.x().h())), w4d0Var.f);
        } catch (ynx unused) {
            hny.o("Parsing XChaCha20Poly1305Key failed");
            return null;
        }
    }

    @Override // a.iuo
    public fuo[] f() {
        return new fuo[]{new a1v0()};
    }
}
