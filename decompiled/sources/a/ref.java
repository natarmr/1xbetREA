package a;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Charsets;
import org.xplatform.secret.impl.KeysImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ref {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmy f30332a;

    public ref(mmy mmyVar) {
        this.f30332a = mmyVar;
    }

    public final byte[] a(String str, rhi0 rhi0Var, String str2) {
        byte[] bArrDoFinal;
        str.getClass();
        rhi0Var.getClass();
        str2.getClass();
        byte[] bytes = b(rhi0Var).getBytes(Charsets.UTF_8);
        bytes.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(zvv.c(str2));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            bArrDoFinal = cipher.doFinal(zvv.c(str));
        } catch (Throwable unused) {
            e0g0 e0g0Var2 = j0g0.b;
            bArrDoFinal = null;
        }
        Arrays.fill(bytes, (byte) 0);
        return bArrDoFinal;
    }

    public final String b(rhi0 rhi0Var) {
        int iOrdinal = rhi0Var.ordinal();
        mmy mmyVar = this.f30332a;
        if (iOrdinal == 0) {
            return (String) eeq.U(kotlin.coroutines.g.f46065a, new din0((KeysImpl) mmyVar, 0, (yje) null));
        }
        if (iOrdinal == 1) {
            return (String) eeq.U(kotlin.coroutines.g.f46065a, new din0((KeysImpl) mmyVar, 1, (yje) null));
        }
        t9f.b();
        return null;
    }
}
