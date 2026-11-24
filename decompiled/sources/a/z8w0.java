package a;

import java.util.Arrays;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Charsets;
import org.xplatform.secret.impl.SecurityImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class z8w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnh0 f43989a;

    public z8w0(wnh0 wnh0Var) {
        this.f43989a = wnh0Var;
    }

    public static String a(String str, byte[] bArr, byte[] bArr2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
            byte[] bArrDoFinal = cipher.doFinal(defpackage.b.b(str));
            bArrDoFinal.getClass();
            return new String(bArrDoFinal, Charsets.UTF_8);
        } finally {
            qx3.n(bArr2);
            Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        }
    }

    public static byte[] b(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    public static String c(String str, byte[] bArr, byte[] bArr2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            bArrDoFinal.getClass();
            return defpackage.b.a(bArrDoFinal);
        } finally {
            qx3.n(bArr2);
            Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(zje zjeVar, String str, boolean z) {
        b9w0 b9w0Var;
        String str2;
        z8w0 z8w0Var;
        byte[] bArrB;
        String str3;
        if (zjeVar instanceof b9w0) {
            b9w0Var = (b9w0) zjeVar;
            int i = b9w0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                b9w0Var.o = i - Integer.MIN_VALUE;
            } else {
                b9w0Var = new b9w0(this, zjeVar);
            }
        } else {
            b9w0Var = new b9w0(this, zjeVar);
        }
        Object objF = b9w0Var.m;
        wne wneVar = wne.f39444a;
        int i2 = b9w0Var.o;
        wnh0 wnh0Var = this.f43989a;
        if (i2 == 0) {
            z1x.P(objF);
            b9w0Var.i = str;
            b9w0Var.j = this;
            b9w0Var.l = z;
            b9w0Var.o = 1;
            objF = ((SecurityImpl) wnh0Var).f(z, b9w0Var);
            if (objF != wneVar) {
                str2 = str;
                z8w0Var = this;
            }
            return wneVar;
        }
        if (i2 == 1) {
            z = b9w0Var.l;
            z8w0Var = (z8w0) b9w0Var.j;
            str2 = b9w0Var.i;
            z1x.P(objF);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = b9w0Var.k;
            bArrB = (byte[]) b9w0Var.j;
            str3 = b9w0Var.i;
            z1x.P(objF);
        }
        this.getClass();
        try {
            return a(str3, b((String) objF), bArrB);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return str3;
        }
        z8w0Var.getClass();
        bArrB = b((String) objF);
        b9w0Var.i = str2;
        b9w0Var.j = bArrB;
        b9w0Var.k = this;
        b9w0Var.l = z;
        b9w0Var.o = 2;
        objF = ((SecurityImpl) wnh0Var).e(z, b9w0Var);
        if (objF != wneVar) {
            str3 = str2;
            this.getClass();
            return a(str3, b((String) objF), bArrB);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zje zjeVar, String str, boolean z) {
        n4w0 n4w0Var;
        String str2;
        z8w0 z8w0Var;
        byte[] bArrB;
        String str3;
        if (zjeVar instanceof n4w0) {
            n4w0Var = (n4w0) zjeVar;
            int i = n4w0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                n4w0Var.o = i - Integer.MIN_VALUE;
            } else {
                n4w0Var = new n4w0(this, zjeVar);
            }
        } else {
            n4w0Var = new n4w0(this, zjeVar);
        }
        Object objF = n4w0Var.m;
        wne wneVar = wne.f39444a;
        int i2 = n4w0Var.o;
        wnh0 wnh0Var = this.f43989a;
        if (i2 == 0) {
            z1x.P(objF);
            n4w0Var.i = str;
            n4w0Var.j = this;
            n4w0Var.l = z;
            n4w0Var.o = 1;
            objF = ((SecurityImpl) wnh0Var).f(z, n4w0Var);
            if (objF != wneVar) {
                str2 = str;
                z8w0Var = this;
            }
            return wneVar;
        }
        if (i2 == 1) {
            z = n4w0Var.l;
            z8w0Var = (z8w0) n4w0Var.j;
            str2 = n4w0Var.i;
            z1x.P(objF);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = n4w0Var.k;
            bArrB = (byte[]) n4w0Var.j;
            str3 = n4w0Var.i;
            z1x.P(objF);
        }
        this.getClass();
        try {
            return new klj(a(str3, b((String) objF), bArrB), true);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new klj(str3, false);
        }
        z8w0Var.getClass();
        bArrB = b((String) objF);
        n4w0Var.i = str2;
        n4w0Var.j = bArrB;
        n4w0Var.k = this;
        n4w0Var.l = z;
        n4w0Var.o = 2;
        objF = ((SecurityImpl) wnh0Var).e(z, n4w0Var);
        if (objF != wneVar) {
            str3 = str2;
            this.getClass();
            return new klj(a(str3, b((String) objF), bArrB), true);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, zje zjeVar) {
        p5w0 p5w0Var;
        String str2;
        z8w0 z8w0Var;
        byte[] bArrB;
        String str3;
        if (zjeVar instanceof p5w0) {
            p5w0Var = (p5w0) zjeVar;
            int i = p5w0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                p5w0Var.n = i - Integer.MIN_VALUE;
            } else {
                p5w0Var = new p5w0(this, zjeVar);
            }
        } else {
            p5w0Var = new p5w0(this, zjeVar);
        }
        Object objF = p5w0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = p5w0Var.n;
        wnh0 wnh0Var = this.f43989a;
        if (i2 == 0) {
            z1x.P(objF);
            p5w0Var.i = str;
            p5w0Var.j = this;
            p5w0Var.n = 1;
            objF = ((SecurityImpl) wnh0Var).f(false, p5w0Var);
            if (objF != wneVar) {
                str2 = str;
                z8w0Var = this;
            }
            return wneVar;
        }
        if (i2 == 1) {
            z8w0Var = (z8w0) p5w0Var.j;
            str2 = p5w0Var.i;
            z1x.P(objF);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = p5w0Var.k;
            bArrB = (byte[]) p5w0Var.j;
            str3 = p5w0Var.i;
            z1x.P(objF);
        }
        this.getClass();
        return c(str3, b((String) objF), bArrB);
        z8w0Var.getClass();
        bArrB = b((String) objF);
        p5w0Var.i = str2;
        p5w0Var.j = bArrB;
        p5w0Var.k = this;
        p5w0Var.n = 2;
        objF = ((SecurityImpl) wnh0Var).e(false, p5w0Var);
        if (objF != wneVar) {
            str3 = str2;
            this.getClass();
            return c(str3, b((String) objF), bArrB);
        }
        return wneVar;
    }
}
