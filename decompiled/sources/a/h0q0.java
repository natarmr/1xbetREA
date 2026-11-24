package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.EmailAuthCredential;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.text.StringsKt;
import org.xplatform.secret.impl.KeysImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class h0q0 implements dqt0, ylu0, ngw0, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12247a;
    public Object b;
    public Object c;
    public Object d;

    public h0q0(piu0 piu0Var, miu0 miu0Var, wbf wbfVar) {
        piu0Var.getClass();
        miu0Var.getClass();
        wbfVar.getClass();
        this.f12247a = piu0Var;
        this.b = miu0Var;
        this.c = wbfVar;
        this.d = new s2m0();
    }

    public void A(h6m0 h6m0Var) {
        h6m0Var.getClass();
        qaq0 qaq0Var = new qaq0(this, h6m0Var, (byte) 3);
        synchronized (this.c) {
        }
        ((Handler) ((cad) this.f12247a).b).postDelayed(qaq0Var, 5400000L);
    }

    public jlw0 B(jlw0 jlw0Var) {
        return ((okt0) this.b).s(this, jlw0Var);
    }

    public uqw0 C() throws GeneralSecurityException {
        rkt0 rkt0Var;
        icw0 icw0VarB;
        brw0 brw0Var = (brw0) this.f12247a;
        if (brw0Var == null) {
            hny.o("Cannot build without parameters");
            return null;
        }
        rkt0 rkt0Var2 = (rkt0) this.b;
        if (rkt0Var2 == null || (rkt0Var = (rkt0) this.c) == null) {
            hny.o("Cannot build without key material");
            return null;
        }
        if (brw0Var.f3100a != ((icw0) rkt0Var2.b).f14556a.length) {
            hny.o("AES key size mismatch");
            return null;
        }
        if (brw0Var.b != ((icw0) rkt0Var.b).f14556a.length) {
            hny.o("HMAC key size mismatch");
            return null;
        }
        if (brw0Var.a() && ((Integer) this.d) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((brw0) this.f12247a).a() && ((Integer) this.d) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        arw0 arw0Var = ((brw0) this.f12247a).e;
        if (arw0Var == arw0.e) {
            icw0VarB = q6x0.f28222a;
        } else if (arw0Var == arw0.d) {
            icw0VarB = q6x0.a(((Integer) this.d).intValue());
        } else {
            if (arw0Var != arw0.c) {
                jf4.n("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(arw0Var)));
                return null;
            }
            icw0VarB = q6x0.b(((Integer) this.d).intValue());
        }
        return new uqw0((brw0) this.f12247a, (rkt0) this.b, (rkt0) this.c, icw0VarB, (Integer) this.d);
    }

    public mrw0 D() throws GeneralSecurityException {
        Integer num = (Integer) this.f12247a;
        if (num == null) {
            hny.o("Key size is not set");
            return null;
        }
        if (((p50) this.d) == null) {
            hny.o("Variant is not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            hny.o("IV size is not set");
            return null;
        }
        if (((Integer) this.c) != null) {
            return new mrw0(num.intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (p50) this.d);
        }
        hny.o("Tag size is not set");
        return null;
    }

    public e0x0 E() throws GeneralSecurityException {
        d0x0 d0x0Var = (d0x0) this.f12247a;
        if (d0x0Var == null) {
            hny.o("HPKE KEM parameter is not set");
            return null;
        }
        c0x0 c0x0Var = (c0x0) this.b;
        if (c0x0Var == null) {
            hny.o("HPKE KDF parameter is not set");
            return null;
        }
        if (((b0x0) this.c) == null) {
            hny.o("HPKE AEAD parameter is not set");
            return null;
        }
        if (((m60) this.d) == null) {
            hny.o("HPKE variant is not set");
            return null;
        }
        if (d0x0Var != d0x0.g || c0x0Var.equals(c0x0.c)) {
            return new e0x0((d0x0) this.f12247a, (c0x0) this.b, (b0x0) this.c, (m60) this.d);
        }
        hny.o("Only SHA256 KDF is supported with X-Wing KEM");
        return null;
    }

    public p8x0 F() throws GeneralSecurityException {
        Integer num = (Integer) this.f12247a;
        if (num == null) {
            hny.o("key size is not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            hny.o("tag size is not set");
            return null;
        }
        if (((o8x0) this.c) == null) {
            hny.o("hash type is not set");
            return null;
        }
        if (((arw0) this.d) == null) {
            hny.o("variant is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f12247a));
        }
        Integer num2 = (Integer) this.b;
        int iIntValue = num2.intValue();
        o8x0 o8x0Var = (o8x0) this.c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (o8x0Var == o8x0.b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (o8x0Var == o8x0.c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (o8x0Var == o8x0.d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (o8x0Var == o8x0.e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (o8x0Var != o8x0.f) {
                hny.o("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new p8x0(((Integer) this.f12247a).intValue(), ((Integer) this.b).intValue(), (arw0) this.d, (o8x0) this.c);
    }

    public void G() {
        this.b = 12;
    }

    public jlw0 H(rew0 rew0Var) {
        jlw0 jlw0VarS = jlw0.V0;
        Iterator itJ = rew0Var.j();
        while (itJ.hasNext()) {
            jlw0VarS = ((okt0) this.b).s(this, rew0Var.l(((Integer) itJ.next()).intValue()));
            if (jlw0VarS instanceof kgw0) {
                break;
            }
        }
        return jlw0VarS;
    }

    public void I(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f12247a = Integer.valueOf(i);
    }

    public h0q0 J() {
        return new h0q0(this, (okt0) this.b);
    }

    public void K() {
        this.c = 16;
    }

    public boolean L(String str) {
        if (((HashMap) this.c).containsKey(str)) {
            return true;
        }
        h0q0 h0q0Var = (h0q0) this.f12247a;
        if (h0q0Var != null) {
            return h0q0Var.L(str);
        }
        return false;
    }

    public void M(String str, jlw0 jlw0Var) {
        h0q0 h0q0Var;
        HashMap map = (HashMap) this.c;
        if (!map.containsKey(str) && (h0q0Var = (h0q0) this.f12247a) != null && h0q0Var.L(str)) {
            h0q0Var.M(str, jlw0Var);
        } else {
            if (((HashMap) this.d).containsKey(str)) {
                return;
            }
            if (jlw0Var == null) {
                map.remove(str);
            } else {
                map.put(str, jlw0Var);
            }
        }
    }

    public void N(String str, jlw0 jlw0Var) {
        if (((HashMap) this.d).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.c;
        if (jlw0Var == null) {
            map.remove(str);
        } else {
            map.put(str, jlw0Var);
        }
    }

    public jlw0 O(String str) {
        HashMap map = (HashMap) this.c;
        if (map.containsKey(str)) {
            return (jlw0) map.get(str);
        }
        h0q0 h0q0Var = (h0q0) this.f12247a;
        if (h0q0Var != null) {
            return h0q0Var.O(str);
        }
        jf4.o(ohs0.n(str, " is not defined"));
        return null;
    }

    @Override // a.ylu0
    public int a(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        itt0.n(b1j.m(i, "requested global type ", " does not belong to the adapter:"), ((nj50) this.c).c);
        return 0;
    }

    @Override // a.ylu0
    public int b(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f12247a;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey > -1) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        h8m0 h8m0Var = (h8m0) this.d;
        nj50 nj50Var = (nj50) this.c;
        int i2 = h8m0Var.b;
        h8m0Var.b = i2 + 1;
        h8m0Var.f12634a.put(i2, nj50Var);
        sparseIntArray.put(i, i2);
        ((SparseIntArray) this.b).put(i2, i);
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // a.dqt0
    public Object c(pn pnVar, yje yjeVar) {
        eqt0 eqt0Var;
        Float fValueOf;
        n0o0 n0o0Var = (n0o0) this.d;
        if (yjeVar instanceof eqt0) {
            eqt0Var = (eqt0) yjeVar;
            int i = eqt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                eqt0Var.k = i - Integer.MIN_VALUE;
            } else {
                eqt0Var = new eqt0(this, (zje) yjeVar);
            }
        } else {
            eqt0Var = new eqt0(this, (zje) yjeVar);
        }
        Object objInvoke = eqt0Var.i;
        Object obj = wne.f39444a;
        int i2 = eqt0Var.k;
        Boolean boolValueOf = null;
        if (i2 == 0) {
            z1x.P(objInvoke);
            Log.d("CXCP", "shouldUseTorchAsFlash: hasUwCameraUnderexposedFlashCaptureQuirk = " + ((Boolean) n0o0Var.getValue()).booleanValue());
            if (!((Boolean) n0o0Var.getValue()).booleanValue()) {
                return Boolean.TRUE;
            }
            if (Build.VERSION.SDK_INT < 29) {
                Log.w("CXCP", "shouldUseTorchAsFlash: API level is too low to know if it's ultra wide camera, defaulting to workaround for safety.");
                return Boolean.TRUE;
            }
            eqt0Var.k = 1;
            objInvoke = pnVar.invoke(eqt0Var);
            if (objInvoke == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objInvoke);
        }
        pz2 pz2Var = (pz2) objInvoke;
        if (pz2Var == null) {
            Log.w("CXCP", "shouldUseTorchAsFlash: frameMetadata is null, defaulting to workaround for safety.");
            return Boolean.TRUE;
        }
        CaptureResult.Key key = CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID;
        key.getClass();
        String str = (String) pz2Var.f27824a.get(key);
        if (str == null) {
            Log.w("CXCP", "isUltraWideCamera: could not get active physical camera ID to identify if it's ultra wide camera.");
        } else {
            zy9 zy9Var = (zy9) this.b;
            g0a.a(str);
            c1a c1aVarB = zy9.b(zy9Var, str);
            try {
                try {
                    fValueOf = Float.valueOf(((jnx) this.c).b(c1aVarB) / jnx.a(jnx.c(c1aVarB), jnx.d(c1aVarB)));
                } catch (Exception e) {
                    throw new IllegalStateException("Failed to get a valid view angle", e);
                }
            } catch (Exception e2) {
                Log.e("CXCP", "Failed to get the intrinsic zoom ratio", e2);
                fValueOf = null;
            }
            if (fValueOf != null) {
                float fFloatValue = fValueOf.floatValue();
                Log.d("CXCP", "isUltraWideCamera: cameraId = " + str + ", intrinsicZoomRatio = " + fFloatValue);
                boolValueOf = Boolean.valueOf(fFloatValue < 1.0f);
            } else {
                Log.w("CXCP", "isUltraWideCamera: could not calculate intrinsic zoom ratio.");
            }
        }
        return Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : true);
    }

    @Override // a.dqt0
    public boolean d() {
        return !((Boolean) ((n0o0) this.d).getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object e(zje zjeVar) {
        b8w0 b8w0Var;
        Object[] objArr;
        Object[] objArr2;
        String str;
        String str2;
        Object[] objArr3;
        Object[] objArr4;
        l7w0 l7w0Var = (l7w0) this.c;
        if (zjeVar instanceof b8w0) {
            b8w0Var = (b8w0) zjeVar;
            int i = b8w0Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                b8w0Var.q = i - Integer.MIN_VALUE;
            } else {
                b8w0Var = new b8w0(this, zjeVar);
            }
        } else {
            b8w0Var = new b8w0(this, zjeVar);
        }
        Object objZ = b8w0Var.o;
        wne wneVar = wne.f39444a;
        int i2 = b8w0Var.q;
        if (i2 == 0) {
            z1x.P(objZ);
            objArr = new Object[1];
            objArr2 = new Object[3];
            mmy mmyVar = (mmy) this.b;
            str = "%s";
            b8w0Var.i = "%s";
            b8w0Var.j = objArr;
            str2 = "%3$s%2$s%1$s";
            b8w0Var.k = "%3$s%2$s%1$s";
            b8w0Var.l = objArr2;
            b8w0Var.m = objArr;
            b8w0Var.n = objArr2;
            b8w0Var.q = 1;
            objZ = ((KeysImpl) mmyVar).Z(b8w0Var);
            if (objZ != wneVar) {
                objArr3 = objArr2;
                objArr4 = objArr;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objZ);
                return objZ;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        objArr2 = b8w0Var.n;
        objArr = b8w0Var.m;
        objArr3 = b8w0Var.l;
        str2 = b8w0Var.k;
        objArr4 = b8w0Var.j;
        str = b8w0Var.i;
        z1x.P(objZ);
        objArr2[0] = objZ;
        objArr3[1] = l7w0Var.c();
        objArr3[2] = ((Context) this.f12247a).getString(l7w0Var.a());
        objArr[0] = String.format(str2, Arrays.copyOf(objArr3, objArr3.length));
        String str3 = String.format(str, Arrays.copyOf(objArr4, objArr4.length));
        z8w0 z8w0Var = (z8w0) this.d;
        b8w0Var.i = null;
        b8w0Var.j = null;
        b8w0Var.k = null;
        b8w0Var.l = null;
        b8w0Var.m = null;
        b8w0Var.n = null;
        b8w0Var.q = 2;
        Object objD = z8w0Var.d(b8w0Var, str3, false);
        return objD == wneVar ? wneVar : objD;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0190 A[PHI: r0 r3 r4 r12 r14
  0x0190: PHI (r0v19 java.lang.Object) = (r0v18 java.lang.Object), (r0v1 java.lang.Object) binds: [B:32:0x018d, B:20:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0190: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v9 java.lang.String) binds: [B:32:0x018d, B:20:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0190: PHI (r4v7 boolean) = (r4v6 boolean), (r4v10 boolean) binds: [B:32:0x018d, B:20:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0190: PHI (r12v7 java.lang.String) = (r12v6 java.lang.String), (r12v12 java.lang.String) binds: [B:32:0x018d, B:20:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0190: PHI (r14v5 java.lang.String) = (r14v4 java.lang.String), (r14v12 java.lang.String) binds: [B:32:0x018d, B:20:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x01c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Serializable, java.lang.Object[]] */
    public Object f(String str, zje zjeVar) {
        k8w0 k8w0Var;
        Object objP;
        int i;
        String str2;
        String str3;
        String str4;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        char c;
        String str5;
        Object[] objArr6;
        Object[] objArr7;
        String str6;
        Object[] objArr8;
        String str7;
        boolean z;
        String str8;
        Object objD;
        String str9;
        String strC;
        z8w0 z8w0Var = (z8w0) this.d;
        Context context = (Context) this.f12247a;
        mmy mmyVar = (mmy) this.b;
        l7w0 l7w0Var = (l7w0) this.c;
        if (zjeVar instanceof k8w0) {
            k8w0Var = (k8w0) zjeVar;
            int i2 = k8w0Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k8w0Var.s = i2 - Integer.MIN_VALUE;
            } else {
                k8w0Var = new k8w0(this, zjeVar);
            }
        } else {
            k8w0Var = new k8w0(this, zjeVar);
        }
        Object objD2 = k8w0Var.q;
        wne wneVar = wne.f39444a;
        int i3 = k8w0Var.s;
        String str10 = "%2$s%1$s%3$s";
        String str11 = "%s";
        if (i3 == 0) {
            z1x.P(objD2);
            ?? r10 = new Object[1];
            ?? r11 = new Object[3];
            k8w0Var.i = str;
            k8w0Var.j = "%s";
            k8w0Var.k = r10;
            k8w0Var.l = "%2$s%1$s%3$s";
            k8w0Var.m = r11;
            k8w0Var.n = r10;
            k8w0Var.o = r11;
            k8w0Var.s = 1;
            objP = ((KeysImpl) mmyVar).P(k8w0Var);
            if (objP != wneVar) {
                i = 1;
                str2 = str;
                str3 = "%2$s%1$s%3$s";
                str4 = "%s";
                objArr = r10;
                objArr2 = r11;
                objArr4 = r10;
                objArr3 = r11;
            }
            return wneVar;
        }
        if (i3 == 1) {
            Object[] objArr9 = k8w0Var.o;
            Object[] objArr10 = k8w0Var.n;
            Object[] objArr11 = (Object[]) k8w0Var.m;
            String str12 = (String) k8w0Var.l;
            Object[] objArr12 = (Object[]) k8w0Var.k;
            String str13 = k8w0Var.j;
            str2 = k8w0Var.i;
            z1x.P(objD2);
            objP = objD2;
            objArr = objArr12;
            str4 = str13;
            str3 = str12;
            i = 1;
            objArr2 = objArr9;
            objArr4 = objArr10;
            objArr3 = objArr11;
        } else {
            if (i3 == 2) {
                objArr7 = k8w0Var.p;
                Object[] objArr13 = k8w0Var.o;
                Object[] objArr14 = k8w0Var.n;
                String str14 = (String) k8w0Var.m;
                Object[] objArr15 = (Object[]) k8w0Var.l;
                String str15 = (String) k8w0Var.k;
                str5 = k8w0Var.j;
                str6 = k8w0Var.i;
                z1x.P(objD2);
                objArr5 = objArr14;
                str10 = str14;
                str11 = str15;
                objArr6 = objArr15;
                objArr8 = objArr13;
                c = 2;
                objArr7[0] = objD2;
                objArr5[1] = l7w0Var.j();
                objArr5[c] = context.getString(l7w0Var.d());
                objArr8[0] = String.format(str10, Arrays.copyOf(objArr5, objArr5.length));
                String str16 = String.format(str11, Arrays.copyOf(objArr6, objArr6.length));
                k8w0Var.i = str6;
                k8w0Var.j = str5;
                str7 = null;
                k8w0Var.k = null;
                k8w0Var.l = null;
                k8w0Var.m = null;
                k8w0Var.n = null;
                k8w0Var.o = null;
                k8w0Var.p = null;
                k8w0Var.s = 3;
                z = false;
                objD2 = z8w0Var.d(k8w0Var, str16, false);
                if (objD2 != wneVar) {
                    str8 = (String) objD2;
                    k8w0Var.i = str6;
                    k8w0Var.j = str7;
                    k8w0Var.k = str7;
                    k8w0Var.l = str8;
                    k8w0Var.s = 4;
                    objD = z8w0Var.d(k8w0Var, str5, z);
                    if (objD != wneVar) {
                        str9 = str8;
                        objD2 = objD;
                    }
                }
                return wneVar;
            }
            if (i3 == 3) {
                String str17 = k8w0Var.j;
                String str18 = k8w0Var.i;
                z1x.P(objD2);
                str5 = str17;
                str7 = null;
                str6 = str18;
                z = false;
                str8 = (String) objD2;
                k8w0Var.i = str6;
                k8w0Var.j = str7;
                k8w0Var.k = str7;
                k8w0Var.l = str8;
                k8w0Var.s = 4;
                objD = z8w0Var.d(k8w0Var, str5, z);
                if (objD != wneVar) {
                    str9 = str8;
                    objD2 = objD;
                }
                return wneVar;
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD2);
                return objD2;
            }
            str9 = (String) k8w0Var.l;
            String str19 = k8w0Var.i;
            z1x.P(objD2);
            str6 = str19;
            str7 = null;
        }
        k8w0Var.i = str7;
        k8w0Var.j = str7;
        k8w0Var.k = str7;
        k8w0Var.l = str7;
        k8w0Var.m = str7;
        k8w0Var.s = 5;
        strC = z8w0.c(str6, z8w0.b(str9), z8w0.b((String) objD2));
        if (strC != wneVar) {
            return wneVar;
        }
        return strC;
        objArr2[0] = objP;
        objArr3[i] = l7w0Var.e();
        objArr3[r14] = context.getString(l7w0Var.i());
        objArr4[0] = String.format(str3, Arrays.copyOf(objArr3, objArr3.length));
        String str20 = String.format(str4, Arrays.copyOf(objArr, objArr.length));
        ?? r12 = new Object[i];
        objArr5 = new Object[3];
        k8w0Var.i = str2;
        k8w0Var.j = str20;
        k8w0Var.k = "%s";
        k8w0Var.l = r12;
        k8w0Var.m = "%2$s%1$s%3$s";
        k8w0Var.n = objArr5;
        k8w0Var.o = r12;
        k8w0Var.p = objArr5;
        c = 2;
        k8w0Var.s = 2;
        Object objQ = ((KeysImpl) mmyVar).Q(k8w0Var);
        if (objQ != wneVar) {
            str5 = str20;
            objD2 = objQ;
            objArr6 = r12;
            objArr7 = objArr5;
            str6 = str2;
            objArr8 = r12;
            objArr7[0] = objD2;
            objArr5[1] = l7w0Var.j();
            objArr5[c] = context.getString(l7w0Var.d());
            objArr8[0] = String.format(str10, Arrays.copyOf(objArr5, objArr5.length));
            String str110 = String.format(str11, Arrays.copyOf(objArr6, objArr6.length));
            k8w0Var.i = str6;
            k8w0Var.j = str5;
            str7 = null;
            k8w0Var.k = null;
            k8w0Var.l = null;
            k8w0Var.m = null;
            k8w0Var.n = null;
            k8w0Var.o = null;
            k8w0Var.p = null;
            k8w0Var.s = 3;
            z = false;
            objD2 = z8w0Var.d(k8w0Var, str110, false);
            if (objD2 != wneVar) {
                str8 = (String) objD2;
                k8w0Var.i = str6;
                k8w0Var.j = str7;
                k8w0Var.k = str7;
                k8w0Var.l = str8;
                k8w0Var.s = 4;
                objD = z8w0Var.d(k8w0Var, str5, z);
                if (objD != wneVar) {
                    str9 = str8;
                    objD2 = objD;
                    k8w0Var.i = str7;
                    k8w0Var.j = str7;
                    k8w0Var.k = str7;
                    k8w0Var.l = str7;
                    k8w0Var.m = str7;
                    k8w0Var.s = 5;
                    strC = z8w0.c(str6, z8w0.b(str9), z8w0.b((String) objD2));
                    if (strC != wneVar) {
                        return strC;
                    }
                }
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(int i, long j, zje zjeVar, String str) {
        eyu0 eyu0Var;
        kys0 kys0Var;
        if (zjeVar instanceof eyu0) {
            eyu0Var = (eyu0) zjeVar;
            int i2 = eyu0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eyu0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                eyu0Var = new eyu0(this, zjeVar);
            }
        } else {
            eyu0Var = new eyu0(this, zjeVar);
        }
        Object obj = eyu0Var.j;
        wne wneVar = wne.f39444a;
        int i3 = eyu0Var.l;
        if (i3 == 0) {
            z1x.P(obj);
            kys0 kys0Var2 = (kys0) this.b;
            uvu0 uvu0Var = (uvu0) ((lkr0) this.d).invoke();
            String strA = ((btt0) this.f12247a).a();
            lq lqVar = new lq(str, i, j);
            eyu0Var.i = kys0Var2;
            eyu0Var.l = 1;
            Object objA = uvu0Var.a(strA, lqVar, eyu0Var);
            if (objA == wneVar) {
                return wneVar;
            }
            obj = objA;
            kys0Var = kys0Var2;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kys0Var = eyu0Var.i;
            z1x.P(obj);
        }
        oq oqVar = (oq) ((q16) obj).a();
        kys0Var.getClass();
        String str2 = oqVar.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        Long l = oqVar.f25664a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = oqVar.c;
        return new vvu0(jLongValue, l2 != null ? l2.longValue() : 0L, str3);
    }

    @Override // a.ngw0
    public void h(xfw0 xfw0Var) {
        ((nmt0) this.d).f(new mhw0((EmailAuthCredential) this.f12247a, ((zzaia) xfw0Var).b, (String) this.b), (hcp0) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0190 A[PHI: r0 r3 r4 r12 r14
  0x0190: PHI (r0v19 java.lang.Object) = (r0v18 java.lang.Object), (r0v1 java.lang.Object) binds: [B:32:0x018d, B:20:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0190: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v9 java.lang.String) binds: [B:32:0x018d, B:20:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0190: PHI (r4v7 boolean) = (r4v6 boolean), (r4v10 boolean) binds: [B:32:0x018d, B:20:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0190: PHI (r12v7 java.lang.String) = (r12v6 java.lang.String), (r12v12 java.lang.String) binds: [B:32:0x018d, B:20:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0190: PHI (r14v5 java.lang.String) = (r14v4 java.lang.String), (r14v12 java.lang.String) binds: [B:32:0x018d, B:20:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x01c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Serializable, java.lang.Object[]] */
    public Object i(String str, zje zjeVar) {
        g8w0 g8w0Var;
        Object objQ;
        int i;
        String str2;
        String str3;
        String str4;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        char c;
        String str5;
        Object[] objArr6;
        Object[] objArr7;
        String str6;
        Object[] objArr8;
        String str7;
        boolean z;
        String str8;
        Object objD;
        String str9;
        String strC;
        z8w0 z8w0Var = (z8w0) this.d;
        Context context = (Context) this.f12247a;
        mmy mmyVar = (mmy) this.b;
        l7w0 l7w0Var = (l7w0) this.c;
        if (zjeVar instanceof g8w0) {
            g8w0Var = (g8w0) zjeVar;
            int i2 = g8w0Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g8w0Var.s = i2 - Integer.MIN_VALUE;
            } else {
                g8w0Var = new g8w0(this, zjeVar);
            }
        } else {
            g8w0Var = new g8w0(this, zjeVar);
        }
        Object objD2 = g8w0Var.q;
        wne wneVar = wne.f39444a;
        int i3 = g8w0Var.s;
        String str10 = "%1$s%3$s%2$s";
        String str11 = "%s";
        if (i3 == 0) {
            z1x.P(objD2);
            ?? r10 = new Object[1];
            ?? r11 = new Object[3];
            g8w0Var.i = str;
            g8w0Var.j = "%s";
            g8w0Var.k = r10;
            g8w0Var.l = "%1$s%3$s%2$s";
            g8w0Var.m = r11;
            g8w0Var.n = r10;
            g8w0Var.o = r11;
            g8w0Var.s = 1;
            objQ = ((KeysImpl) mmyVar).q(g8w0Var);
            if (objQ != wneVar) {
                i = 1;
                str2 = str;
                str3 = "%1$s%3$s%2$s";
                str4 = "%s";
                objArr = r10;
                objArr2 = r11;
                objArr4 = r10;
                objArr3 = r11;
            }
            return wneVar;
        }
        if (i3 == 1) {
            Object[] objArr9 = g8w0Var.o;
            Object[] objArr10 = g8w0Var.n;
            Object[] objArr11 = (Object[]) g8w0Var.m;
            String str12 = (String) g8w0Var.l;
            Object[] objArr12 = (Object[]) g8w0Var.k;
            String str13 = g8w0Var.j;
            str2 = g8w0Var.i;
            z1x.P(objD2);
            objQ = objD2;
            objArr = objArr12;
            str4 = str13;
            str3 = str12;
            i = 1;
            objArr2 = objArr9;
            objArr4 = objArr10;
            objArr3 = objArr11;
        } else {
            if (i3 == 2) {
                objArr7 = g8w0Var.p;
                Object[] objArr13 = g8w0Var.o;
                Object[] objArr14 = g8w0Var.n;
                String str14 = (String) g8w0Var.m;
                Object[] objArr15 = (Object[]) g8w0Var.l;
                String str15 = (String) g8w0Var.k;
                str5 = g8w0Var.j;
                str6 = g8w0Var.i;
                z1x.P(objD2);
                objArr5 = objArr14;
                str10 = str14;
                str11 = str15;
                objArr6 = objArr15;
                objArr8 = objArr13;
                c = 2;
                objArr7[0] = objD2;
                objArr5[1] = l7w0Var.f();
                objArr5[c] = context.getString(l7w0Var.m());
                objArr8[0] = String.format(str10, Arrays.copyOf(objArr5, objArr5.length));
                String str16 = String.format(str11, Arrays.copyOf(objArr6, objArr6.length));
                g8w0Var.i = str6;
                g8w0Var.j = str5;
                str7 = null;
                g8w0Var.k = null;
                g8w0Var.l = null;
                g8w0Var.m = null;
                g8w0Var.n = null;
                g8w0Var.o = null;
                g8w0Var.p = null;
                g8w0Var.s = 3;
                z = false;
                objD2 = z8w0Var.d(g8w0Var, str16, false);
                if (objD2 != wneVar) {
                    str8 = (String) objD2;
                    g8w0Var.i = str6;
                    g8w0Var.j = str7;
                    g8w0Var.k = str7;
                    g8w0Var.l = str8;
                    g8w0Var.s = 4;
                    objD = z8w0Var.d(g8w0Var, str5, z);
                    if (objD != wneVar) {
                        str9 = str8;
                        objD2 = objD;
                    }
                }
                return wneVar;
            }
            if (i3 == 3) {
                String str17 = g8w0Var.j;
                String str18 = g8w0Var.i;
                z1x.P(objD2);
                str5 = str17;
                str7 = null;
                str6 = str18;
                z = false;
                str8 = (String) objD2;
                g8w0Var.i = str6;
                g8w0Var.j = str7;
                g8w0Var.k = str7;
                g8w0Var.l = str8;
                g8w0Var.s = 4;
                objD = z8w0Var.d(g8w0Var, str5, z);
                if (objD != wneVar) {
                    str9 = str8;
                    objD2 = objD;
                }
                return wneVar;
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD2);
                return objD2;
            }
            str9 = (String) g8w0Var.l;
            String str19 = g8w0Var.i;
            z1x.P(objD2);
            str6 = str19;
            str7 = null;
        }
        g8w0Var.i = str7;
        g8w0Var.j = str7;
        g8w0Var.k = str7;
        g8w0Var.l = str7;
        g8w0Var.m = str7;
        g8w0Var.s = 5;
        strC = z8w0.c(str6, z8w0.b(str9), z8w0.b((String) objD2));
        if (strC != wneVar) {
            return wneVar;
        }
        return strC;
        objArr2[0] = objQ;
        objArr3[i] = l7w0Var.b();
        objArr3[r14] = context.getString(l7w0Var.k());
        objArr4[0] = String.format(str3, Arrays.copyOf(objArr3, objArr3.length));
        String str20 = String.format(str4, Arrays.copyOf(objArr, objArr.length));
        ?? r12 = new Object[i];
        objArr5 = new Object[3];
        g8w0Var.i = str2;
        g8w0Var.j = str20;
        g8w0Var.k = "%s";
        g8w0Var.l = r12;
        g8w0Var.m = "%1$s%3$s%2$s";
        g8w0Var.n = objArr5;
        g8w0Var.o = r12;
        g8w0Var.p = objArr5;
        c = 2;
        g8w0Var.s = 2;
        Object objR = ((KeysImpl) mmyVar).r(g8w0Var);
        if (objR != wneVar) {
            str5 = str20;
            objD2 = objR;
            objArr6 = r12;
            objArr7 = objArr5;
            str6 = str2;
            objArr8 = r12;
            objArr7[0] = objD2;
            objArr5[1] = l7w0Var.f();
            objArr5[c] = context.getString(l7w0Var.m());
            objArr8[0] = String.format(str10, Arrays.copyOf(objArr5, objArr5.length));
            String str110 = String.format(str11, Arrays.copyOf(objArr6, objArr6.length));
            g8w0Var.i = str6;
            g8w0Var.j = str5;
            str7 = null;
            g8w0Var.k = null;
            g8w0Var.l = null;
            g8w0Var.m = null;
            g8w0Var.n = null;
            g8w0Var.o = null;
            g8w0Var.p = null;
            g8w0Var.s = 3;
            z = false;
            objD2 = z8w0Var.d(g8w0Var, str110, false);
            if (objD2 != wneVar) {
                str8 = (String) objD2;
                g8w0Var.i = str6;
                g8w0Var.j = str7;
                g8w0Var.k = str7;
                g8w0Var.l = str8;
                g8w0Var.s = 4;
                objD = z8w0Var.d(g8w0Var, str5, z);
                if (objD != wneVar) {
                    str9 = str8;
                    objD2 = objD;
                    g8w0Var.i = str7;
                    g8w0Var.j = str7;
                    g8w0Var.k = str7;
                    g8w0Var.l = str7;
                    g8w0Var.m = str7;
                    g8w0Var.s = 5;
                    strC = z8w0.c(str6, z8w0.b(str9), z8w0.b((String) objD2));
                    if (strC != wneVar) {
                        return strC;
                    }
                }
            }
        }
        return wneVar;
    }

    public void j(h6m0 h6m0Var) {
        Runnable runnable;
        h6m0Var.getClass();
        synchronized (this.c) {
            runnable = (Runnable) ((LinkedHashMap) this.d).remove(h6m0Var);
        }
        if (runnable != null) {
            ((Handler) ((cad) this.f12247a).b).removeCallbacks(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(long j, zje zjeVar) {
        fyu0 fyu0Var;
        bzs0 bzs0Var;
        if (zjeVar instanceof fyu0) {
            fyu0Var = (fyu0) zjeVar;
            int i = fyu0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                fyu0Var.l = i - Integer.MIN_VALUE;
            } else {
                fyu0Var = new fyu0(this, zjeVar);
            }
        } else {
            fyu0Var = new fyu0(this, zjeVar);
        }
        Object obj = fyu0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = fyu0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            bzs0 bzs0Var2 = (bzs0) this.c;
            uvu0 uvu0Var = (uvu0) ((lkr0) this.d).invoke();
            String strA = ((btt0) this.f12247a).a();
            t4k t4kVar = new t4k(j);
            fyu0Var.i = bzs0Var2;
            fyu0Var.l = 1;
            Object objB = uvu0Var.b(strA, t4kVar, fyu0Var);
            if (objB == wneVar) {
                return wneVar;
            }
            obj = objB;
            bzs0Var = bzs0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bzs0Var = fyu0Var.i;
            z1x.P(obj);
        }
        oq oqVar = (oq) ((q16) obj).a();
        bzs0Var.getClass();
        String str = oqVar.b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Long l = oqVar.c;
        return new vvu0(0L, l != null ? l.longValue() : 0L, str2);
    }

    public bsv0 l() {
        return (bsv0) ((hgk0) ((pz40) this.f12247a)).getValue();
    }

    public msv0 m() {
        return (msv0) ((hgk0) ((pz40) this.b)).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable n(int i, List list, boolean z, long j, jvn jvnVar, long j2, zje zjeVar) {
        t5r0 t5r0Var;
        long j3;
        if (zjeVar instanceof t5r0) {
            t5r0Var = (t5r0) zjeVar;
            int i2 = t5r0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t5r0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                t5r0Var = new t5r0(this, zjeVar);
            }
        } else {
            t5r0Var = new t5r0(this, zjeVar);
        }
        Object objB = t5r0Var.j;
        wne wneVar = wne.f39444a;
        int i3 = t5r0Var.l;
        if (i3 == 0) {
            z1x.P(objB);
            TreeMap treeMapQ = q(i, list, z, j, jvnVar);
            w4p0 w4p0Var = (w4p0) this.f12247a;
            t5r0Var.i = j2;
            t5r0Var.l = 1;
            objB = ((w5r0) ((enj0) w4p0Var.b).invoke()).b(treeMapQ, t5r0Var);
            if (objB == wneVar) {
                return wneVar;
            }
            j3 = j2;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = t5r0Var.i;
            z1x.P(objB);
        }
        Iterable iterable = (Iterable) ((dx5) objB).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(g7x.a0((su10) it.next(), sip.b, j3));
        }
        ((s5r0) this.b).b.d(arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable o(int i, List list, boolean z, long j, jvn jvnVar, zje zjeVar) {
        u5r0 u5r0Var;
        h0q0 h0q0Var;
        if (zjeVar instanceof u5r0) {
            u5r0Var = (u5r0) zjeVar;
            int i2 = u5r0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u5r0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                u5r0Var = new u5r0(this, zjeVar);
            }
        } else {
            u5r0Var = new u5r0(this, zjeVar);
        }
        Object objA = u5r0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = u5r0Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            h0q0Var = this;
            TreeMap treeMapQ = h0q0Var.q(i, list, z, j, jvnVar);
            w4p0 w4p0Var = (w4p0) h0q0Var.f12247a;
            u5r0Var.k = 1;
            objA = ((w5r0) ((enj0) w4p0Var.b).invoke()).a(treeMapQ, u5r0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
            h0q0Var = this;
        }
        Iterable<su10> iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (su10 su10Var : iterable) {
            bek bekVar = sip.f32274a;
            arrayList.add(g7x.Z(su10Var));
        }
        ((s5r0) h0q0Var.b).f31667a.d(arrayList);
        return arrayList;
    }

    public bxv0 p() {
        return (bxv0) ((hgk0) ((pz40) this.d)).getValue();
    }

    public TreeMap q(int i, List list, boolean z, long j, jvn jvnVar) {
        knf0 knf0Var = (knf0) this.c;
        m2c0 m2c0VarA = ((x2c0) this.d).a();
        Integer intOrNull = m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null;
        int iB = knf0Var.b();
        String strC = knf0Var.c();
        jvnVar.getClass();
        list.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("cfView", Integer.valueOf(jvnVar.getId()));
        jo20Var.put("count", Integer.valueOf(i));
        if (intOrNull != null) {
            jo20Var.put("country", intOrNull);
        }
        jo20Var.put("fcountry", Integer.valueOf(iB));
        jo20Var.put("gr", 1357);
        jo20Var.put("lng", strC);
        jo20Var.put("ref", 1);
        if (!list.isEmpty()) {
            jo20Var.put("sportIds", CollectionsKt.b0(CollectionsKt.z0(list), Separators.COMMA, null, null, null, 62));
        }
        if (z) {
            jo20Var.put("userId", Long.valueOf(j));
        }
        return new TreeMap(w6x.j(22, jo20Var, "whence"));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Serializable r(int i, boolean z, Integer num, zje zjeVar) {
        n9s0 n9s0Var;
        Object g0g0Var;
        knf0 knf0Var = (knf0) this.f12247a;
        if (zjeVar instanceof n9s0) {
            n9s0Var = (n9s0) zjeVar;
            int i2 = n9s0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n9s0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                n9s0Var = new n9s0(this, zjeVar);
            }
        } else {
            n9s0Var = new n9s0(this, zjeVar);
        }
        n9s0 n9s0Var2 = n9s0Var;
        Object objC = n9s0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = n9s0Var2.k;
        if (i3 == 0) {
            z1x.P(objC);
            l9s0 l9s0Var = (l9s0) this.b;
            knf0Var.getClass();
            String strC = knf0Var.c();
            String strA = z ? ((btt0) this.d).a() : null;
            n9s0Var2.k = 1;
            objC = l9s0Var.c(strA, 22, strC, 1, i, num, new fk9(false), n9s0Var2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        Iterable<bzr0> iterable = ((fzr0) ((dx5) objC).a()).f10423a;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (bzr0 bzr0Var : iterable) {
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = eyr0.a(bzr0Var);
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (g0g0Var instanceof g0g0) {
                g0g0Var = null;
            }
            myr0 myr0Var = (myr0) g0g0Var;
            if (myr0Var != null) {
                arrayList.add(myr0Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Serializable s(ArrayList arrayList, zje zjeVar) {
        o9s0 o9s0Var;
        knf0 knf0Var = (knf0) this.f12247a;
        if (zjeVar instanceof o9s0) {
            o9s0Var = (o9s0) zjeVar;
            int i = o9s0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                o9s0Var.k = i - Integer.MIN_VALUE;
            } else {
                o9s0Var = new o9s0(this, zjeVar);
            }
        } else {
            o9s0Var = new o9s0(this, zjeVar);
        }
        o9s0 o9s0Var2 = o9s0Var;
        Object objA = o9s0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = o9s0Var2.k;
        if (i2 == 0) {
            z1x.P(objA);
            l9s0 l9s0Var = (l9s0) this.b;
            knf0Var.getClass();
            String strC = knf0Var.c();
            String strA = ((btt0) this.d).a();
            String strB0 = CollectionsKt.b0(arrayList, Separators.COMMA, null, null, null, 62);
            o9s0Var2.k = 1;
            objA = l9s0Var.a(strA, strB0, 22, strC, new fk9(false), o9s0Var2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        Iterable iterable = ((v9s0) ((dx5) objA).a()).f37050a;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(yum0.o((z2s0) it.next()));
        }
        return arrayList2;
    }

    public diu0 t(sgy sgyVar, String str) {
        diu0 diu0Var;
        diu0 diu0VarB;
        sgyVar.getClass();
        synchronized (((s2m0) this.d)) {
            try {
                diu0Var = (diu0) ((piu0) this.f12247a).f27059a.get(str);
                if (sgyVar.r(diu0Var)) {
                    miu0 miu0Var = (miu0) this.b;
                    if (miu0Var instanceof r0h0) {
                        r0h0 r0h0Var = (r0h0) miu0Var;
                        diu0Var.getClass();
                        glz glzVar = r0h0Var.d;
                        if (glzVar != null) {
                            kd30 kd30Var = r0h0Var.e;
                            kd30Var.getClass();
                            azw.A(diu0Var, kd30Var, glzVar);
                        }
                    }
                    diu0Var.getClass();
                } else {
                    by40 by40Var = new by40((wbf) this.c);
                    by40Var.f38875a.put(oiu0.f25329a, str);
                    miu0 miu0Var2 = (miu0) this.b;
                    miu0Var2.getClass();
                    try {
                        try {
                            diu0VarB = miu0Var2.a(sgyVar, by40Var);
                        } catch (AbstractMethodError unused) {
                            diu0VarB = miu0Var2.c(azw.G(sgyVar), by40Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        diu0VarB = miu0Var2.b(azw.G(sgyVar));
                    }
                    diu0Var = diu0VarB;
                    piu0 piu0Var = (piu0) this.f12247a;
                    piu0Var.getClass();
                    diu0Var.getClass();
                    diu0 diu0Var2 = (diu0) piu0Var.f27059a.put(str, diu0Var);
                    if (diu0Var2 != null) {
                        diu0Var2.t();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return diu0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String str = (String) this.f12247a;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            s0x.H(exception);
            SparseArray sparseArray = jfw0.f16450a;
            if (exception instanceof rfq ? ((rfq) exception).b.endsWith("INVALID_RECAPTCHA_TOKEN") : false) {
                if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                    Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
                }
                return ((zcw0) this.b).c(str, Boolean.TRUE, (RecaptchaAction) this.c).continueWithTask((ikt0) this.d);
            }
        }
        return task;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object u(kka kkaVar, boolean z, boolean z2, zje zjeVar) {
        clt0 clt0Var;
        krt0 krt0VarA;
        Object objB;
        boolean z3;
        Iterator it;
        Object next;
        w500 w500Var;
        Double d;
        int i;
        teo teoVar;
        if (zjeVar instanceof clt0) {
            clt0Var = (clt0) zjeVar;
            int i2 = clt0Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clt0Var.o = i2 - Integer.MIN_VALUE;
            } else {
                clt0Var = new clt0(this, zjeVar);
            }
        } else {
            clt0Var = new clt0(this, zjeVar);
        }
        clt0 clt0Var2 = clt0Var;
        Object objM = clt0Var2.m;
        wne wneVar = wne.f39444a;
        int i3 = clt0Var2.o;
        if (i3 == 0) {
            z1x.P(objM);
            krt0VarA = ((gst0) this.b).f11847a.a();
            b3c0 b3c0Var = (b3c0) this.c;
            clt0Var2.i = kkaVar;
            clt0Var2.j = krt0VarA;
            clt0Var2.k = z;
            clt0Var2.l = z2;
            clt0Var2.o = 1;
            objB = b3c0Var.b(clt0Var2);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            z2 = clt0Var2.l;
            z = clt0Var2.k;
            krt0 krt0Var = clt0Var2.j;
            kka kkaVar2 = clt0Var2.i;
            z1x.P(objM);
            krt0VarA = krt0Var;
            kkaVar = kkaVar2;
            objB = objM;
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = clt0Var2.k;
            kkaVar = clt0Var2.i;
            z1x.P(objM);
        }
        it = ((a600) objM).c.iterator();
        while (true) {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            w500 w500Var2 = (w500) next;
            i = w500Var2.f38563a;
            teoVar = kkaVar.j;
            if (i != teoVar.f33830a && w500Var2.e == teoVar.d && w500Var2.b == teoVar.c.f3953a) {
                break;
            }
        }
        w500Var = (w500) next;
        if (w500Var == null) {
            return kkaVar;
        }
        if (z3) {
            d = new Double(kkaVar.j.e);
        } else {
            d = null;
        }
        return kka.a(kkaVar, teo.a(kkaVar.j, w500Var.c, d, w500Var.d), null, null, 32255);
        boolean z4 = z2;
        z220 z220Var = (z220) this.f12247a;
        int i4 = kkaVar.f18426a;
        int id = ((uzc) this.d).b().getId();
        int i5 = (int) krt0VarA.f18785a;
        int i6 = kkaVar.j.i;
        boolean z5 = krt0VarA.b;
        String str = ((m2c0) objB).c;
        clt0Var2.i = kkaVar;
        clt0Var2.j = null;
        clt0Var2.k = z;
        clt0Var2.l = z4;
        clt0Var2.o = 2;
        objM = z220Var.m(i4, id, i5, str, i6, z5, z4, clt0Var2);
        if (objM != wneVar) {
            z3 = z;
            it = ((a600) objM).c.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                w500 w500Var3 = (w500) next;
                i = w500Var3.f38563a;
                teoVar = kkaVar.j;
                if (i != teoVar.f33830a) {
                }
            }
            w500Var = (w500) next;
            if (w500Var == null) {
                return kkaVar;
            }
            if (z3) {
                d = new Double(kkaVar.j.e);
            } else {
                d = null;
            }
            return kka.a(kkaVar, teo.a(kkaVar.j, w500Var.c, d, w500Var.d), null, null, 32255);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:32:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:33:0x020f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0216 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object v(String str, s77 s77Var, String str2, boolean z, long j, int i, boolean z2, List list, boolean z3, boolean z4, zje zjeVar) {
        bjt0 bjt0Var;
        String str3;
        s77 s77Var2;
        String str4;
        boolean z5;
        Object obj;
        long j2;
        int i2;
        boolean z6;
        wne wneVar;
        List list2;
        boolean z7;
        long j3;
        rrd rrdVar;
        boolean z8;
        boolean z9;
        int i3;
        boolean z10;
        boolean z11;
        rrd rrdVar2;
        List list3;
        wne wneVar2;
        List list4;
        boolean z12;
        s77 s77Var3;
        String str5;
        boolean z13;
        boolean z14;
        int i4;
        int i5;
        boolean z15;
        Object obj2;
        boolean z16;
        long j4;
        String str6;
        long j5;
        List list5;
        boolean zJ;
        rrd rrdVar3;
        List list6;
        boolean z17;
        boolean z18;
        bjt0 bjt0Var2;
        wne wneVar3;
        rg7 rg7VarA;
        Object objK;
        if (zjeVar instanceof bjt0) {
            bjt0Var = (bjt0) zjeVar;
            int i6 = bjt0Var.A;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bjt0Var.A = i6 - Integer.MIN_VALUE;
            } else {
                bjt0Var = new bjt0(this, zjeVar);
            }
        } else {
            bjt0Var = new bjt0(this, zjeVar);
        }
        Object obj3 = bjt0Var.y;
        wne wneVar4 = wne.f39444a;
        int i7 = bjt0Var.A;
        if (i7 != 0) {
            if (i7 == 1) {
                boolean z19 = bjt0Var.t;
                boolean z20 = bjt0Var.s;
                int i8 = bjt0Var.x;
                long j6 = bjt0Var.v;
                boolean z21 = bjt0Var.r;
                boolean z22 = bjt0Var.q;
                boolean z23 = bjt0Var.p;
                int i9 = bjt0Var.w;
                long j7 = bjt0Var.u;
                boolean z24 = bjt0Var.o;
                String str7 = bjt0Var.m;
                s77 s77Var4 = bjt0Var.l;
                String str8 = bjt0Var.k;
                rrd rrdVar4 = bjt0Var.j;
                List list7 = bjt0Var.i;
                z1x.P(obj3);
                j2 = j6;
                list2 = list7;
                z7 = z24;
                str3 = str8;
                i2 = i8;
                rrdVar = rrdVar4;
                obj = obj3;
                i3 = i9;
                s77Var2 = s77Var4;
                z5 = z20;
                z8 = z21;
                wneVar = wneVar4;
                z9 = z22;
                j3 = j7;
                str4 = str7;
                z10 = z23;
                z6 = z19;
            } else {
                if (i7 != 2) {
                    if (i7 == 3) {
                        z1x.P(obj3);
                        return obj3;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z25 = bjt0Var.t;
                boolean z26 = bjt0Var.s;
                int i10 = bjt0Var.x;
                long j8 = bjt0Var.v;
                boolean z27 = bjt0Var.r;
                boolean z28 = bjt0Var.q;
                boolean z29 = bjt0Var.p;
                int i11 = bjt0Var.w;
                long j9 = bjt0Var.u;
                boolean z30 = bjt0Var.o;
                List list8 = bjt0Var.n;
                String str9 = bjt0Var.m;
                s77 s77Var5 = bjt0Var.l;
                String str10 = bjt0Var.k;
                rrd rrdVar5 = bjt0Var.j;
                List list9 = bjt0Var.i;
                z1x.P(obj3);
                z16 = z26;
                obj2 = obj3;
                z15 = z30;
                list3 = list8;
                str5 = str9;
                rrdVar2 = rrdVar5;
                list4 = list9;
                j4 = j9;
                j5 = j8;
                z13 = z29;
                z12 = z28;
                z14 = z25;
                s77Var3 = s77Var5;
                wneVar2 = wneVar4;
                i5 = i11;
                i4 = i10;
                z11 = z27;
                str6 = str10;
            }
            list5 = (List) obj2;
            zJ = ((j1q0) this.d).f15748a.j();
            bjt0Var.i = null;
            bjt0Var.j = null;
            bjt0Var.k = null;
            bjt0Var.l = null;
            bjt0Var.m = null;
            bjt0Var.n = null;
            bjt0Var.o = z15;
            bjt0Var.u = j4;
            bjt0Var.w = i5;
            bjt0Var.p = z13;
            bjt0Var.q = z12;
            bjt0Var.r = z11;
            bjt0Var.A = 3;
            if (z16) {
                wneVar3 = wneVar2;
                objK = rrdVar2.k(str6, j5, s77Var3, str5, i4, z14, list3, list5, list4, zJ, z12, z11, bjt0Var);
            } else {
                rrdVar3 = rrdVar2;
                list6 = list3;
                z17 = z11;
                z18 = z12;
                bjt0Var2 = bjt0Var;
                wneVar3 = wneVar2;
                rg7VarA = ((m0w) rrdVar3.g).a(str6);
                if (rg7VarA != null) {
                    objK = bkb.r0(rg7VarA, s77Var3, str5, z14, list6, list5, zJ, list4, z18, z17);
                } else {
                    objK = rrdVar3.k(str6, j5, s77Var3, str5, i4, z14, list6, list5, list4, zJ, z18, z17, bjt0Var2);
                }
            }
            if (objK == wneVar3) {
                return wneVar3;
            }
            return objK;
        }
        z1x.P(obj3);
        rrd rrdVar6 = (rrd) this.f12247a;
        edo edoVar = (edo) this.c;
        bjt0Var.i = list;
        bjt0Var.j = rrdVar6;
        str3 = str;
        bjt0Var.k = str3;
        s77Var2 = s77Var;
        bjt0Var.l = s77Var2;
        str4 = str2;
        bjt0Var.m = str4;
        bjt0Var.o = z;
        bjt0Var.u = j;
        bjt0Var.w = i;
        bjt0Var.p = z2;
        bjt0Var.q = z3;
        bjt0Var.r = z4;
        bjt0Var.v = j;
        bjt0Var.x = i;
        bjt0Var.s = z;
        bjt0Var.t = z2;
        bjt0Var.A = 1;
        Object objB = edoVar.b(bjt0Var);
        if (objB == wneVar4) {
            return wneVar4;
        }
        z5 = z;
        obj = objB;
        j2 = j;
        i2 = i;
        z6 = z2;
        wneVar = wneVar4;
        list2 = list;
        z7 = z5;
        j3 = j2;
        rrdVar = rrdVar6;
        z8 = z4;
        z9 = z3;
        i3 = i2;
        z10 = z6;
        List list10 = (List) obj;
        zfo zfoVar = (zfo) this.b;
        bjt0Var.i = list2;
        bjt0Var.j = rrdVar;
        bjt0Var.k = str3;
        bjt0Var.l = s77Var2;
        bjt0Var.m = str4;
        bjt0Var.n = list10;
        bjt0Var.o = z7;
        bjt0Var.u = j3;
        bjt0Var.w = i3;
        bjt0Var.p = z10;
        bjt0Var.q = z9;
        bjt0Var.r = z8;
        boolean z31 = z7;
        boolean z32 = z8;
        bjt0Var.v = j2;
        int i12 = i2;
        bjt0Var.x = i12;
        boolean z33 = z5;
        bjt0Var.s = z33;
        bjt0Var.t = z6;
        bjt0Var.A = 2;
        Object objB2 = zfoVar.b(bjt0Var);
        wne wneVar5 = wneVar;
        if (objB2 == wneVar5) {
            return wneVar5;
        }
        rrd rrdVar7 = rrdVar;
        z11 = z32;
        rrdVar2 = rrdVar7;
        list3 = list10;
        wneVar2 = wneVar5;
        list4 = list2;
        z12 = z9;
        s77Var3 = s77Var2;
        str5 = str4;
        z13 = z10;
        z14 = z6;
        i4 = i12;
        i5 = i3;
        z15 = z31;
        long j10 = j2;
        obj2 = objB2;
        z16 = z33;
        j4 = j3;
        str6 = str3;
        j5 = j10;
        list5 = (List) obj2;
        zJ = ((j1q0) this.d).f15748a.j();
        bjt0Var.i = null;
        bjt0Var.j = null;
        bjt0Var.k = null;
        bjt0Var.l = null;
        bjt0Var.m = null;
        bjt0Var.n = null;
        bjt0Var.o = z15;
        bjt0Var.u = j4;
        bjt0Var.w = i5;
        bjt0Var.p = z13;
        bjt0Var.q = z12;
        bjt0Var.r = z11;
        bjt0Var.A = 3;
        if (z16) {
            wneVar3 = wneVar2;
            objK = rrdVar2.k(str6, j5, s77Var3, str5, i4, z14, list3, list5, list4, zJ, z12, z11, bjt0Var);
        } else {
            rrdVar3 = rrdVar2;
            list6 = list3;
            z17 = z11;
            z18 = z12;
            bjt0Var2 = bjt0Var;
            wneVar3 = wneVar2;
            rg7VarA = ((m0w) rrdVar3.g).a(str6);
            if (rg7VarA != null) {
                objK = bkb.r0(rg7VarA, s77Var3, str5, z14, list6, list5, zJ, list4, z18, z17);
            } else {
                objK = rrdVar3.k(str6, j5, s77Var3, str5, i4, z14, list6, list5, list4, zJ, z18, z17, bjt0Var2);
            }
        }
        if (objK == wneVar3) {
            return wneVar3;
        }
        return objK;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a A[LOOP:4: B:55:0x0104->B:57:0x010a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    /* JADX WARN: Code duplicated, block: B:64:0x013b A[LOOP:5: B:62:0x0130->B:64:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x016f  */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x014e A[EDGE_INSN: B:99:0x014e->B:65:0x014e BREAK  A[LOOP:5: B:62:0x0130->B:64:0x013b], SYNTHETIC] */
    public Object w(ArrayList arrayList, int i, zje zjeVar) {
        gjt0 gjt0Var;
        List list;
        boolean zA;
        List list2;
        List list3;
        List list4;
        boolean z;
        List list5;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        int iA;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        iil iilVar;
        ArrayList arrayList4;
        Iterator it3;
        Object next;
        vzf vzfVar;
        boolean z2;
        ArrayList arrayList5;
        vuf vufVar;
        Iterator it4;
        Object next2;
        vuf vufVar2;
        Iterator it5;
        Object next3;
        if (zjeVar instanceof gjt0) {
            gjt0Var = (gjt0) zjeVar;
            int i2 = gjt0Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gjt0Var.o = i2 - Integer.MIN_VALUE;
            } else {
                gjt0Var = new gjt0(this, zjeVar);
            }
        } else {
            gjt0Var = new gjt0(this, zjeVar);
        }
        Object objI = gjt0Var.m;
        wne wneVar = wne.f39444a;
        int i3 = gjt0Var.o;
        if (i3 == 0) {
            z1x.P(objI);
            c5k c5kVar = (c5k) this.f12247a;
            gjt0Var.i = arrayList;
            gjt0Var.k = i;
            gjt0Var.o = 1;
            objI = c5kVar.i(i, gjt0Var);
            list = arrayList;
            if (objI != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            i = gjt0Var.k;
            List list6 = gjt0Var.i;
            z1x.P(objI);
            list = list6;
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = gjt0Var.l;
            list3 = gjt0Var.j;
            List list7 = gjt0Var.i;
            z1x.P(objI);
            list4 = list7;
        }
        list2 = (List) objI;
        zA = z;
        list5 = list4;
        arrayList2 = new ArrayList();
        for (Object obj : list5) {
            vufVar2 = (vuf) obj;
            it5 = list3.iterator();
            do {
                if (it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
            } while (((vzf) next3).f38295a != vufVar2.f38045a);
            if (next3 != null) {
                arrayList2.add(obj);
            }
        }
        if (zA) {
            arrayList5 = new ArrayList();
            for (Object obj2 : arrayList2) {
                vufVar = (vuf) obj2;
                it4 = list2.iterator();
                do {
                    if (it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (((ql5) next2).e != vufVar.f38045a);
                if (next2 != null) {
                    arrayList5.add(obj2);
                }
            }
            arrayList2 = arrayList5;
        }
        arrayList3 = new ArrayList(r3d.q(list3, 10));
        it = list3.iterator();
        while (it.hasNext()) {
            axq.t(((vzf) it.next()).f38295a, arrayList3);
        }
        rx3 rx3VarS0 = CollectionsKt.S0(arrayList3);
        iA = wp20.a(r3d.q(rx3VarS0, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        it2 = rx3VarS0.iterator();
        while (true) {
            iilVar = (iil) it2;
            if (iilVar.b.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) iilVar.next();
            linkedHashMap.put(indexedValue.b, new Integer(indexedValue.f46061a));
        }
        List<vuf> listA0 = CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, (byte) 7));
        dq00 dq00Var = (dq00) this.b;
        arrayList4 = new ArrayList(r3d.q(listA0, 10));
        for (vuf vufVar3 : listA0) {
            it3 = list3.iterator();
            do {
                if (it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((vzf) next).f38295a != vufVar3.f38045a);
            vzfVar = (vzf) next;
            if (vzfVar != null) {
                z2 = vzfVar.b;
            } else {
                z2 = false;
            }
            vufVar3.getClass();
            arrayList4.add(new hq90((int) vufVar3.f38045a, vufVar3.b, vufVar3.c, z2));
        }
        dq00Var.k(arrayList4);
        return Unit.f46060a;
        List list8 = (List) objI;
        zA = ((gst0) this.d).a();
        if (zA) {
            urt urtVar = (urt) this.c;
            gjt0Var.i = list;
            gjt0Var.j = list8;
            gjt0Var.k = i;
            gjt0Var.l = zA;
            gjt0Var.o = 2;
            Object objA = urt.a(urtVar, gjt0Var);
            if (objA != wneVar) {
                objI = objA;
                list3 = list8;
                list4 = list;
                z = zA;
                list2 = (List) objI;
                zA = z;
                list5 = list4;
            }
            return wneVar;
        }
        list2 = iun.f15405a;
        list3 = list8;
        list5 = list;
        arrayList2 = new ArrayList();
        while (r13.hasNext()) {
            vufVar2 = (vuf) obj;
            it5 = list3.iterator();
            do {
                if (it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
            } while (((vzf) next3).f38295a != vufVar2.f38045a);
            if (next3 != null) {
                arrayList2.add(obj);
            }
        }
        if (zA) {
            arrayList5 = new ArrayList();
            while (r0.hasNext()) {
                vufVar = (vuf) obj2;
                it4 = list2.iterator();
                do {
                    if (it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (((ql5) next2).e != vufVar.f38045a);
                if (next2 != null) {
                    arrayList5.add(obj2);
                }
            }
            arrayList2 = arrayList5;
        }
        arrayList3 = new ArrayList(r3d.q(list3, 10));
        it = list3.iterator();
        while (it.hasNext()) {
            axq.t(((vzf) it.next()).f38295a, arrayList3);
        }
        rx3 rx3VarS1 = CollectionsKt.S0(arrayList3);
        iA = wp20.a(r3d.q(rx3VarS1, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        it2 = rx3VarS1.iterator();
        while (true) {
            iilVar = (iil) it2;
            if (iilVar.b.hasNext()) {
                break;
                break;
            }
            IndexedValue indexedValue2 = (IndexedValue) iilVar.next();
            linkedHashMap.put(indexedValue2.b, new Integer(indexedValue2.f46061a));
        }
        List<vuf> listA1 = CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, (byte) 7));
        dq00 dq00Var2 = (dq00) this.b;
        arrayList4 = new ArrayList(r3d.q(listA1, 10));
        while (r13.hasNext()) {
            it3 = list3.iterator();
            do {
                if (it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((vzf) next).f38295a != vufVar3.f38045a);
            vzfVar = (vzf) next;
            if (vzfVar != null) {
                z2 = vzfVar.b;
            } else {
                z2 = false;
            }
            vufVar3.getClass();
            arrayList4.add(new hq90((int) vufVar3.f38045a, vufVar3.b, vufVar3.c, z2));
        }
        dq00Var2.k(arrayList4);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(boolean z, boolean z2, zje zjeVar) {
        oev0 oev0Var;
        boolean z3;
        if (zjeVar instanceof oev0) {
            oev0Var = (oev0) zjeVar;
            int i = oev0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                oev0Var.m = i - Integer.MIN_VALUE;
            } else {
                oev0Var = new oev0(this, zjeVar);
            }
        } else {
            oev0Var = new oev0(this, zjeVar);
        }
        Object objA = oev0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = oev0Var.m;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objA);
            rtu rtuVar = (rtu) this.f12247a;
            oev0Var.i = z;
            oev0Var.j = z2;
            oev0Var.m = 1;
            objA = rtuVar.a(z, 0, oev0Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z2 = oev0Var.j;
            z = oev0Var.i;
            z1x.P(objA);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = oev0Var.j;
            z1x.P(objA);
        }
        return aoq.c((gmq) objA, new xpp(yjeVar, (Object) this, z3, (byte) 17));
        boolean z4 = z;
        drm0 drm0Var = (drm0) this.c;
        oev0Var.i = z4;
        oev0Var.j = z2;
        oev0Var.m = 2;
        objA = bkb.h0(60L, TimeUnit.SECONDS, new xj1(drm0Var.f6568a, z4, objA, yjeVar, (byte) 23));
        if (objA != wneVar) {
            z3 = z2;
            return aoq.c((gmq) objA, new xpp(yjeVar, (Object) this, z3, (byte) 17));
        }
        return wneVar;
    }

    public boolean y(tfk tfkVar) {
        if (((tfk) this.b).equals(tfkVar)) {
            return true;
        }
        h0q0 h0q0Var = (h0q0) this.f12247a;
        return h0q0Var != null ? h0q0Var.y(tfkVar) : false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object z(long j, zje zjeVar) {
        rps0 rps0Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof rps0) {
            rps0Var = (rps0) zjeVar;
            int i = rps0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rps0Var.k = i - Integer.MIN_VALUE;
            } else {
                rps0Var = new rps0(this, zjeVar);
            }
        } else {
            rps0Var = new rps0(this, zjeVar);
        }
        Object objA = rps0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = rps0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            g090 g090Var = (g090) this.b;
            String strA = ((btt0) this.c).a();
            mx90 mx90Var = new mx90(j, knf0Var.c());
            rps0Var.k = 1;
            objA = ((kps0) ((qir0) g090Var.b).invoke()).a(strA, mx90Var, rps0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        px90 px90Var = (px90) ((u2t) objA).a();
        Long l = px90Var.f27743a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num = px90Var.b;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        Integer num2 = px90Var.c;
        if (num2 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue2 = num2.intValue();
        Integer num3 = px90Var.d;
        if (num3 == null) {
            jf4.k(null);
            return null;
        }
        qx90 qx90Var = new qx90(iIntValue, iIntValue2, num3.intValue(), jLongValue);
        qps0 qps0Var = (qps0) this.f12247a;
        qps0Var.getClass();
        qps0Var.f29136a = qx90Var;
        return qx90Var;
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((hcp0) this.c).a(msm0.v(str));
    }

    public h0q0(h0q0 h0q0Var, okt0 okt0Var) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.f12247a = h0q0Var;
        this.b = okt0Var;
    }

    public h0q0(z220 z220Var, gst0 gst0Var, b3c0 b3c0Var, uzc uzcVar) {
        gst0Var.getClass();
        b3c0Var.getClass();
        this.f12247a = z220Var;
        this.b = gst0Var;
        this.c = b3c0Var;
        this.d = uzcVar;
    }

    public h0q0(rrd rrdVar, zfo zfoVar, edo edoVar, j1q0 j1q0Var) {
        zfoVar.getClass();
        edoVar.getClass();
        j1q0Var.getClass();
        this.f12247a = rrdVar;
        this.b = zfoVar;
        this.c = edoVar;
        this.d = j1q0Var;
    }

    public /* synthetic */ h0q0(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f12247a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
