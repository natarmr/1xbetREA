package a;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.huawei.hms.api.ConnectionResult;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class l58 extends Fragment {
    public t58 H1;
    public final Handler I1 = new Handler(Looper.getMainLooper());

    public final boolean A0() {
        return Build.VERSION.SDK_INT <= 28 && hmw0.Z(this.H1.r);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[LOOP:1: B:23:0x004b->B:27:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x003e, please report this as an issue */
    public final boolean B0() {
        Bundle bundle;
        Context contextD;
        boolean z;
        String str;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            Context contextD2 = D();
            if (contextD2 == null || this.H1.e == null) {
                if (Build.VERSION.SDK_INT == 28) {
                    bundle = this.g;
                    contextD = D();
                    if (contextD == null && contextD.getPackageManager() != null && contextD.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!bundle.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (i2 != 28) {
                if (Build.VERSION.SDK_INT == 28) {
                    bundle = this.g;
                    contextD = D();
                    if (contextD == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (!bundle.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            if (str2 == null) {
                str = Build.MODEL;
                if (str == null) {
                    if (Build.VERSION.SDK_INT == 28) {
                        bundle = this.g;
                        contextD = D();
                        if (contextD == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (!bundle.getBoolean("has_fingerprint", z)) {
                        }
                    }
                    return false;
                }
                for (String str4 : contextD2.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                    if (str.startsWith(str4)) {
                    }
                }
                if (Build.VERSION.SDK_INT == 28) {
                    bundle = this.g;
                    contextD = D();
                    if (contextD == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (!bundle.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            for (String str5 : contextD2.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                if (!str2.equalsIgnoreCase(str5)) {
                }
            }
            str = Build.MODEL;
            if (str == null) {
                if (Build.VERSION.SDK_INT == 28) {
                    bundle = this.g;
                    contextD = D();
                    if (contextD == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (!bundle.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            while (i < r5) {
                if (str.startsWith(str4)) {
                }
            }
            if (Build.VERSION.SDK_INT == 28) {
                bundle = this.g;
                contextD = D();
                if (contextD == null) {
                    z = false;
                } else {
                    z = false;
                }
                if (!bundle.getBoolean("has_fingerprint", z)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void C0() {
        Context contextD = D();
        KeyguardManager keyguardManager = contextD != null ? (KeyguardManager) contextD.getSystemService(KeyguardManager.class) : null;
        if (keyguardManager == null) {
            D0(12, H(R.string.generic_error_no_keyguard));
            return;
        }
        yzn0 yzn0Var = this.H1.d;
        Intent intentCreateConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(yzn0Var != null ? (CharSequence) yzn0Var.f43523a : null, null);
        if (intentCreateConfirmDeviceCredentialIntent == null) {
            D0(14, H(R.string.generic_error_no_device_credential));
            return;
        }
        this.H1.n = true;
        if (B0()) {
            z0();
        }
        intentCreateConfirmDeviceCredentialIntent.setFlags(134742016);
        startActivityForResult(intentCreateConfirmDeviceCredentialIntent, 1);
    }

    public final void D0(int i, CharSequence charSequence) {
        E0(i, charSequence);
        y0();
    }

    public final void E0(int i, CharSequence charSequence) {
        t58 t58Var = this.H1;
        if (t58Var.n) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!t58Var.m) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        t58Var.m = false;
        Executor xz3Var = t58Var.b;
        if (xz3Var == null) {
            xz3Var = new xz3((byte) 1);
        }
        xz3Var.execute(new e58(this, i, charSequence));
    }

    public final void F0(p58 p58Var) {
        t58 t58Var = this.H1;
        if (t58Var.m) {
            t58Var.m = false;
            Executor xz3Var = t58Var.b;
            if (xz3Var == null) {
                xz3Var = new xz3((byte) 1);
            }
            xz3Var.execute(new fy2(this, p58Var, (byte) 12));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        y0();
    }

    public final void G0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = H(R.string.default_error_msg);
        }
        this.H1.w(2);
        t58 t58Var = this.H1;
        hy40 hy40Var = t58Var.C;
        if (hy40Var == null) {
            hy40Var = new hy40();
            t58Var.C = hy40Var;
        }
        t58.z(hy40Var, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    public final void H0() {
        int i;
        CancellationSignal cancellationSignal;
        if (this.H1.l) {
            return;
        }
        if (D() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        t58 t58Var = this.H1;
        t58Var.l = true;
        t58Var.m = true;
        Context contextD = D();
        if (contextD != null) {
            if (!contextD.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                if (Build.VERSION.SDK_INT == 29) {
                    int i2 = this.H1.r;
                    if ((i2 & 255) == 255 && hmw0.Z(i2)) {
                        this.H1.q = true;
                    }
                }
            }
            C0();
            return;
        }
        byte b = 2;
        CharSequence charSequence = null;
        cuVar = null;
        cuVar = null;
        cuVar = null;
        cuVar = null;
        cuVar = null;
        cu cuVar = null;
        if (!B0()) {
            BiometricPrompt.Builder builderD = h58.d(o0().getApplicationContext());
            yzn0 yzn0Var = this.H1.d;
            CharSequence charSequence2 = yzn0Var != null ? (CharSequence) yzn0Var.f43523a : null;
            if (charSequence2 != null) {
                h58.f(builderD, charSequence2);
            }
            t58 t58Var2 = this.H1;
            String str = t58Var2.j;
            if (str != null) {
                charSequence = str;
            } else {
                yzn0 yzn0Var2 = t58Var2.d;
                if (yzn0Var2 != null && (charSequence = (CharSequence) yzn0Var2.b) == null) {
                    charSequence = "";
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                Executor xz3Var = this.H1.b;
                if (xz3Var == null) {
                    xz3Var = new xz3((byte) 1);
                }
                t58 t58Var3 = this.H1;
                so4 so4Var = t58Var3.h;
                if (so4Var == null) {
                    so4Var = new so4(t58Var3, (byte) 3);
                    t58Var3.h = so4Var;
                }
                h58.e(builderD, charSequence, xz3Var, so4Var);
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                i58.a(builderD, this.H1.d == null);
            }
            int i4 = this.H1.r;
            if (i3 >= 30) {
                j58.a(builderD, i4);
            } else if (i3 >= 29) {
                i58.b(builderD, hmw0.Z(i4));
            }
            if (i3 >= 35) {
                t58 t58Var4 = this.H1;
                yzn0 yzn0Var3 = t58Var4.d;
                if (t58Var4.b == null) {
                    new Handler(Looper.getMainLooper());
                }
                t58 t58Var5 = this.H1;
                if (t58Var5.i == null) {
                    t58Var5.i = new so4(t58Var5, (byte) 2);
                }
            }
            BiometricPrompt biometricPromptC = h58.c(builderD);
            Context contextD2 = D();
            BiometricPrompt.CryptoObject cryptoObjectW = wwb.W(this.H1.e);
            t58 t58Var6 = this.H1;
            t5a t5aVar = t58Var6.g;
            if (t5aVar == null) {
                t5aVar = new t5a();
                t58Var6.g = t5aVar;
            }
            CancellationSignal cancellationSignal2 = t5aVar.f33358a;
            if (cancellationSignal2 == null) {
                cancellationSignal2 = new CancellationSignal();
                t5aVar.f33358a = cancellationSignal2;
            }
            k03 k03Var = new k03((byte) 1);
            t58 t58Var7 = this.H1;
            lo4 lo4Var = t58Var7.f;
            if (lo4Var == null) {
                lo4Var = new lo4(new ro4(t58Var7));
                t58Var7.f = lo4Var;
            }
            ko4 ko4Var = lo4Var.f20373a;
            if (ko4Var == null) {
                ko4 ko4Var2 = new ko4(lo4Var.c);
                lo4Var.f20373a = ko4Var2;
                ko4Var = ko4Var2;
            }
            try {
                if (cryptoObjectW == null) {
                    h58.b(biometricPromptC, cancellationSignal2, k03Var, ko4Var);
                } else {
                    h58.a(biometricPromptC, cryptoObjectW, cancellationSignal2, k03Var, ko4Var);
                }
                return;
            } catch (NullPointerException e) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
                D0(1, contextD2 != null ? contextD2.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = o0().getApplicationContext();
        FingerprintManager fingerprintManagerB = geq.b(applicationContext);
        if (fingerprintManagerB == null || !geq.d(fingerprintManagerB)) {
            i = 12;
        } else {
            FingerprintManager fingerprintManagerB2 = geq.b(applicationContext);
            i = (fingerprintManagerB2 == null || !geq.c(fingerprintManagerB2)) ? 11 : 0;
        }
        if (i != 0) {
            D0(i, fxb.C(i, applicationContext));
            return;
        }
        if (N()) {
            this.H1.y = true;
            String str2 = Build.MODEL;
            if (!gkb.X(applicationContext)) {
                this.I1.postDelayed(new e58(this, b), 500L);
                boolean z = this.g.getBoolean("host_activity", true);
                zdq zdqVar = new zdq();
                Bundle bundle = new Bundle();
                bundle.putBoolean("host_activity", z);
                zdqVar.s0(bundle);
                zdqVar.H0(F(), "androidx.biometric.internal.FingerprintDialogFragment");
            }
            t58 t58Var8 = this.H1;
            t58Var8.k = (byte) 0;
            q58 q58Var = t58Var8.e;
            if (q58Var != null) {
                Cipher cipher = (Cipher) q58Var.c;
                if (cipher != null) {
                    cuVar = new cu(cipher);
                } else {
                    Signature signature = (Signature) q58Var.b;
                    if (signature != null) {
                        cuVar = new cu(signature);
                    } else {
                        Mac mac = (Mac) q58Var.d;
                        if (mac != null) {
                            cuVar = new cu(mac);
                        } else {
                            int i5 = Build.VERSION.SDK_INT;
                            if (i5 >= 30 && ((IdentityCredential) q58Var.f) != null) {
                                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                            } else if (i5 >= 33 && ((PresentationSession) q58Var.g) != null) {
                                Log.e("CryptoObjectUtils", "Presentation session is not supported by FingerprintManager.");
                            } else if (i5 >= 36) {
                                if ((i5 < 36 ? 100000 * i5 : Build.VERSION.SDK_INT_FULL) >= 3600001 && ((KeyAgreement) q58Var.e) != null) {
                                    Log.e("CryptoObjectUtils", "Key agreement is not supported by FingerprintManager.");
                                } else if (i5 >= 35) {
                                    Log.e("CryptoObjectUtils", "Operation handle is not supported by FingerprintManager.");
                                }
                            } else if (i5 >= 35) {
                                Log.e("CryptoObjectUtils", "Operation handle is not supported by FingerprintManager.");
                            }
                        }
                    }
                }
            }
            t58 t58Var9 = this.H1;
            t5a t5aVar2 = t58Var9.g;
            if (t5aVar2 == null) {
                t5aVar2 = new t5a();
                t58Var9.g = t5aVar2;
            }
            s88 s88Var = t5aVar2.b;
            if (s88Var == null) {
                s88Var = new s88((byte) 3, false);
                t5aVar2.b = s88Var;
            }
            t58 t58Var10 = this.H1;
            lo4 lo4Var2 = t58Var10.f;
            if (lo4Var2 == null) {
                lo4Var2 = new lo4(new ro4(t58Var10));
                t58Var10.f = lo4Var2;
            }
            if (lo4Var2.b == null) {
                lo4Var2.b = new rek0((byte) 27);
            }
            try {
                synchronized (s88Var) {
                    try {
                        if (((CancellationSignal) s88Var.c) == null) {
                            CancellationSignal cancellationSignal3 = new CancellationSignal();
                            s88Var.c = cancellationSignal3;
                            if (s88Var.b) {
                                cancellationSignal3.cancel();
                            }
                        }
                        cancellationSignal = (CancellationSignal) s88Var.c;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                FingerprintManager fingerprintManagerB3 = geq.b(applicationContext);
                if (fingerprintManagerB3 != null) {
                    geq.a(fingerprintManagerB3, geq.e(cuVar), cancellationSignal, new feq());
                }
            } catch (NullPointerException e2) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e2);
                D0(1, fxb.C(1, applicationContext));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void U(int i, int i2, Intent intent) {
        super.U(i, i2, intent);
        int i3 = 1;
        if (i == 1) {
            t58 t58Var = this.H1;
            t58Var.n = false;
            if (i2 != -1) {
                D0(10, H(R.string.generic_error_user_canceled));
                return;
            }
            if (t58Var.q) {
                t58Var.q = false;
                i3 = -1;
            }
            F0(new p58(null, i3));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        t58 t58VarP = this.H1;
        final byte b = 1;
        if (t58VarP == null) {
            t58VarP = m0x0.P(this, this.g.getBoolean("host_activity", true));
            this.H1 = t58VarP;
        }
        hy40 hy40Var = t58VarP.s;
        if (hy40Var == null) {
            hy40Var = new hy40();
            t58VarP.s = hy40Var;
        }
        final byte b2 = 0;
        hy40Var.e(this, new ee60(this) { // from class: a.g58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0167  */
            /* JADX WARN: Code duplicated, block: B:102:0x016b  */
            /* JADX WARN: Code duplicated, block: B:103:0x016f  */
            /* JADX WARN: Code duplicated, block: B:105:0x017f  */
            /* JADX WARN: Code duplicated, block: B:108:0x0188  */
            /* JADX WARN: Code duplicated, block: B:111:0x0193 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:113:0x0196  */
            /* JADX WARN: Code duplicated, block: B:87:0x0143  */
            /* JADX WARN: Code duplicated, block: B:89:0x0149 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:91:0x014c  */
            /* JADX WARN: Code duplicated, block: B:94:0x0159  */
            /* JADX WARN: Code duplicated, block: B:98:0x0160  */
            /* JADX WARN: Instruction removed from duplicated block: B:113:0x0196, please report this as an issue */
            @Override // a.ee60
            public final void a(Object obj) {
                t58 t58Var;
                Context contextD;
                byte b3;
                byte b4 = b2;
                byte b5 = 0;
                CharSequence charSequenceH = null;
                l58 l58Var = this.b;
                switch (b4) {
                    case 0:
                        p58 p58Var = (p58) obj;
                        if (p58Var != null) {
                            l58Var.F0(p58Var);
                            t58 t58Var2 = l58Var.H1;
                            hy40 hy40Var2 = t58Var2.s;
                            if (hy40Var2 == null) {
                                hy40Var2 = new hy40();
                                t58Var2.s = hy40Var2;
                            }
                            t58.z(hy40Var2, null);
                        }
                        break;
                    case 1:
                        d58 d58Var = (d58) obj;
                        if (d58Var != null) {
                            int i = d58Var.f5492a;
                            CharSequence charSequenceC = d58Var.b;
                            switch (i) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 20:
                                case 22:
                                    break;
                                case 6:
                                case 16:
                                case 17:
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                default:
                                    i = 8;
                                    break;
                                case 18:
                                case 21:
                                    i = 1;
                                    break;
                            }
                            Context contextD2 = l58Var.D();
                            if (Build.VERSION.SDK_INT < 29 && ((i == 7 || i == 9) && contextD2 != null)) {
                                KeyguardManager keyguardManager = (KeyguardManager) contextD2.getSystemService(KeyguardManager.class);
                                if ((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) && hmw0.Z(l58Var.H1.r)) {
                                    l58Var.C0();
                                } else if (l58Var.B0()) {
                                    if (charSequenceC == null) {
                                        charSequenceC = fxb.C(i, l58Var.D());
                                    }
                                    t58Var = l58Var.H1;
                                    if (i == 5) {
                                        b3 = t58Var.k;
                                        if (b3 != 0) {
                                            l58Var.E0(i, charSequenceC);
                                        } else {
                                            l58Var.E0(i, charSequenceC);
                                        }
                                        l58Var.y0();
                                    } else {
                                        if (t58Var.y) {
                                            l58Var.D0(i, charSequenceC);
                                        } else {
                                            l58Var.G0(charSequenceC);
                                            Handler handler = l58Var.I1;
                                            f58 f58Var = new f58(l58Var, i, charSequenceC, b5);
                                            contextD = l58Var.D();
                                            if (contextD != null) {
                                                String str = Build.MODEL;
                                                if (gkb.X(contextD)) {
                                                }
                                            }
                                            handler.postDelayed(f58Var, b5);
                                        }
                                        l58Var.H1.y = true;
                                    }
                                } else {
                                    if (charSequenceC == null) {
                                        charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                    }
                                    l58Var.D0(i, charSequenceC);
                                }
                            } else if (l58Var.B0()) {
                                if (charSequenceC == null) {
                                    charSequenceC = fxb.C(i, l58Var.D());
                                }
                                t58Var = l58Var.H1;
                                if (i == 5) {
                                    b3 = t58Var.k;
                                    if (b3 != 0 || b3 == 3) {
                                        l58Var.E0(i, charSequenceC);
                                    }
                                    l58Var.y0();
                                } else {
                                    if (t58Var.y) {
                                        l58Var.D0(i, charSequenceC);
                                    } else {
                                        l58Var.G0(charSequenceC);
                                        Handler handler2 = l58Var.I1;
                                        f58 f58Var2 = new f58(l58Var, i, charSequenceC, b5);
                                        contextD = l58Var.D();
                                        if (contextD != null) {
                                            String str2 = Build.MODEL;
                                            b5 = gkb.X(contextD) ? (byte) 0 : (byte) 2000;
                                        }
                                        handler2.postDelayed(f58Var2, b5);
                                    }
                                    l58Var.H1.y = true;
                                }
                            } else {
                                if (charSequenceC == null) {
                                    charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                }
                                l58Var.D0(i, charSequenceC);
                            }
                            t58 t58Var3 = l58Var.H1;
                            hy40 hy40Var3 = t58Var3.t;
                            if (hy40Var3 == null) {
                                hy40Var3 = new hy40();
                                t58Var3.t = hy40Var3;
                            }
                            t58.z(hy40Var3, null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (l58Var.B0()) {
                                l58Var.G0(charSequence);
                            }
                            t58 t58Var4 = l58Var.H1;
                            hy40 hy40Var4 = t58Var4.t;
                            if (hy40Var4 == null) {
                                hy40Var4 = new hy40();
                                t58Var4.t = hy40Var4;
                            }
                            t58.z(hy40Var4, null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.B0()) {
                                l58Var.G0(l58Var.H(R.string.fingerprint_not_recognized));
                            }
                            t58 t58Var5 = l58Var.H1;
                            if (t58Var5.m) {
                                Executor xz3Var = t58Var5.b;
                                if (xz3Var == null) {
                                    xz3Var = new xz3((byte) 1);
                                }
                                xz3Var.execute(new e58(l58Var, b5));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            t58 t58Var6 = l58Var.H1;
                            hy40 hy40Var5 = t58Var6.v;
                            if (hy40Var5 == null) {
                                hy40Var5 = new hy40();
                                t58Var6.v = hy40Var5;
                            }
                            t58.z(hy40Var5, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.A0()) {
                                l58Var.C0();
                            } else {
                                t58 t58Var7 = l58Var.H1;
                                String str3 = t58Var7.j;
                                if (str3 != null) {
                                    charSequenceH = str3;
                                } else {
                                    yzn0 yzn0Var = t58Var7.d;
                                    if (yzn0Var != null && (charSequenceH = (CharSequence) yzn0Var.b) == null) {
                                        charSequenceH = "";
                                    }
                                }
                                if (charSequenceH == null) {
                                    charSequenceH = l58Var.H(R.string.default_error_msg);
                                }
                                l58Var.D0(13, charSequenceH);
                                l58Var.x0(2);
                            }
                            l58Var.H1.x(false);
                        }
                        break;
                    case 5:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.D0(22, l58Var.H(R.string.content_view_more_options_button_clicked));
                            l58Var.x0(4);
                            t58 t58Var8 = l58Var.H1;
                            hy40 hy40Var6 = t58Var8.x;
                            if (hy40Var6 == null) {
                                hy40Var6 = new hy40();
                                t58Var8.x = hy40Var6;
                            }
                            t58.z(hy40Var6, Boolean.FALSE);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.x0(1);
                            l58Var.y0();
                            t58 t58Var9 = l58Var.H1;
                            hy40 hy40Var7 = t58Var9.z;
                            if (hy40Var7 == null) {
                                hy40Var7 = new hy40();
                                t58Var9.z = hy40Var7;
                            }
                            t58.z(hy40Var7, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        t58 t58Var = this.H1;
        hy40 hy40Var2 = t58Var.t;
        if (hy40Var2 == null) {
            hy40Var2 = new hy40();
            t58Var.t = hy40Var2;
        }
        hy40Var2.e(this, new ee60(this) { // from class: a.g58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0167  */
            /* JADX WARN: Code duplicated, block: B:102:0x016b  */
            /* JADX WARN: Code duplicated, block: B:103:0x016f  */
            /* JADX WARN: Code duplicated, block: B:105:0x017f  */
            /* JADX WARN: Code duplicated, block: B:108:0x0188  */
            /* JADX WARN: Code duplicated, block: B:111:0x0193 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:113:0x0196  */
            /* JADX WARN: Code duplicated, block: B:87:0x0143  */
            /* JADX WARN: Code duplicated, block: B:89:0x0149 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:91:0x014c  */
            /* JADX WARN: Code duplicated, block: B:94:0x0159  */
            /* JADX WARN: Code duplicated, block: B:98:0x0160  */
            /* JADX WARN: Instruction removed from duplicated block: B:113:0x0196, please report this as an issue */
            @Override // a.ee60
            public final void a(Object obj) {
                t58 t58Var2;
                Context contextD;
                byte b3;
                byte b4 = b;
                byte b5 = 0;
                CharSequence charSequenceH = null;
                l58 l58Var = this.b;
                switch (b4) {
                    case 0:
                        p58 p58Var = (p58) obj;
                        if (p58Var != null) {
                            l58Var.F0(p58Var);
                            t58 t58Var3 = l58Var.H1;
                            hy40 hy40Var3 = t58Var3.s;
                            if (hy40Var3 == null) {
                                hy40Var3 = new hy40();
                                t58Var3.s = hy40Var3;
                            }
                            t58.z(hy40Var3, null);
                        }
                        break;
                    case 1:
                        d58 d58Var = (d58) obj;
                        if (d58Var != null) {
                            int i = d58Var.f5492a;
                            CharSequence charSequenceC = d58Var.b;
                            switch (i) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 20:
                                case 22:
                                    break;
                                case 6:
                                case 16:
                                case 17:
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                default:
                                    i = 8;
                                    break;
                                case 18:
                                case 21:
                                    i = 1;
                                    break;
                            }
                            Context contextD2 = l58Var.D();
                            if (Build.VERSION.SDK_INT < 29 && ((i == 7 || i == 9) && contextD2 != null)) {
                                KeyguardManager keyguardManager = (KeyguardManager) contextD2.getSystemService(KeyguardManager.class);
                                if ((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) && hmw0.Z(l58Var.H1.r)) {
                                    l58Var.C0();
                                } else if (l58Var.B0()) {
                                    if (charSequenceC == null) {
                                        charSequenceC = fxb.C(i, l58Var.D());
                                    }
                                    t58Var2 = l58Var.H1;
                                    if (i == 5) {
                                        b3 = t58Var2.k;
                                        if (b3 != 0) {
                                            l58Var.E0(i, charSequenceC);
                                        } else {
                                            l58Var.E0(i, charSequenceC);
                                        }
                                        l58Var.y0();
                                    } else {
                                        if (t58Var2.y) {
                                            l58Var.D0(i, charSequenceC);
                                        } else {
                                            l58Var.G0(charSequenceC);
                                            Handler handler2 = l58Var.I1;
                                            f58 f58Var2 = new f58(l58Var, i, charSequenceC, b5);
                                            contextD = l58Var.D();
                                            if (contextD != null) {
                                                String str2 = Build.MODEL;
                                                if (gkb.X(contextD)) {
                                                }
                                            }
                                            handler2.postDelayed(f58Var2, b5);
                                        }
                                        l58Var.H1.y = true;
                                    }
                                } else {
                                    if (charSequenceC == null) {
                                        charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                    }
                                    l58Var.D0(i, charSequenceC);
                                }
                            } else if (l58Var.B0()) {
                                if (charSequenceC == null) {
                                    charSequenceC = fxb.C(i, l58Var.D());
                                }
                                t58Var2 = l58Var.H1;
                                if (i == 5) {
                                    b3 = t58Var2.k;
                                    if (b3 != 0 || b3 == 3) {
                                        l58Var.E0(i, charSequenceC);
                                    }
                                    l58Var.y0();
                                } else {
                                    if (t58Var2.y) {
                                        l58Var.D0(i, charSequenceC);
                                    } else {
                                        l58Var.G0(charSequenceC);
                                        Handler handler3 = l58Var.I1;
                                        f58 f58Var3 = new f58(l58Var, i, charSequenceC, b5);
                                        contextD = l58Var.D();
                                        if (contextD != null) {
                                            String str3 = Build.MODEL;
                                            b5 = gkb.X(contextD) ? (byte) 0 : (byte) 2000;
                                        }
                                        handler3.postDelayed(f58Var3, b5);
                                    }
                                    l58Var.H1.y = true;
                                }
                            } else {
                                if (charSequenceC == null) {
                                    charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                }
                                l58Var.D0(i, charSequenceC);
                            }
                            t58 t58Var4 = l58Var.H1;
                            hy40 hy40Var4 = t58Var4.t;
                            if (hy40Var4 == null) {
                                hy40Var4 = new hy40();
                                t58Var4.t = hy40Var4;
                            }
                            t58.z(hy40Var4, null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (l58Var.B0()) {
                                l58Var.G0(charSequence);
                            }
                            t58 t58Var5 = l58Var.H1;
                            hy40 hy40Var5 = t58Var5.t;
                            if (hy40Var5 == null) {
                                hy40Var5 = new hy40();
                                t58Var5.t = hy40Var5;
                            }
                            t58.z(hy40Var5, null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.B0()) {
                                l58Var.G0(l58Var.H(R.string.fingerprint_not_recognized));
                            }
                            t58 t58Var6 = l58Var.H1;
                            if (t58Var6.m) {
                                Executor xz3Var = t58Var6.b;
                                if (xz3Var == null) {
                                    xz3Var = new xz3((byte) 1);
                                }
                                xz3Var.execute(new e58(l58Var, b5));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            t58 t58Var7 = l58Var.H1;
                            hy40 hy40Var6 = t58Var7.v;
                            if (hy40Var6 == null) {
                                hy40Var6 = new hy40();
                                t58Var7.v = hy40Var6;
                            }
                            t58.z(hy40Var6, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.A0()) {
                                l58Var.C0();
                            } else {
                                t58 t58Var8 = l58Var.H1;
                                String str4 = t58Var8.j;
                                if (str4 != null) {
                                    charSequenceH = str4;
                                } else {
                                    yzn0 yzn0Var = t58Var8.d;
                                    if (yzn0Var != null && (charSequenceH = (CharSequence) yzn0Var.b) == null) {
                                        charSequenceH = "";
                                    }
                                }
                                if (charSequenceH == null) {
                                    charSequenceH = l58Var.H(R.string.default_error_msg);
                                }
                                l58Var.D0(13, charSequenceH);
                                l58Var.x0(2);
                            }
                            l58Var.H1.x(false);
                        }
                        break;
                    case 5:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.D0(22, l58Var.H(R.string.content_view_more_options_button_clicked));
                            l58Var.x0(4);
                            t58 t58Var9 = l58Var.H1;
                            hy40 hy40Var7 = t58Var9.x;
                            if (hy40Var7 == null) {
                                hy40Var7 = new hy40();
                                t58Var9.x = hy40Var7;
                            }
                            t58.z(hy40Var7, Boolean.FALSE);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.x0(1);
                            l58Var.y0();
                            t58 t58Var10 = l58Var.H1;
                            hy40 hy40Var8 = t58Var10.z;
                            if (hy40Var8 == null) {
                                hy40Var8 = new hy40();
                                t58Var10.z = hy40Var8;
                            }
                            t58.z(hy40Var8, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        t58 t58Var2 = this.H1;
        hy40 hy40Var3 = t58Var2.u;
        if (hy40Var3 == null) {
            hy40Var3 = new hy40();
            t58Var2.u = hy40Var3;
        }
        final byte b3 = 2;
        hy40Var3.e(this, new ee60(this) { // from class: a.g58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0167  */
            /* JADX WARN: Code duplicated, block: B:102:0x016b  */
            /* JADX WARN: Code duplicated, block: B:103:0x016f  */
            /* JADX WARN: Code duplicated, block: B:105:0x017f  */
            /* JADX WARN: Code duplicated, block: B:108:0x0188  */
            /* JADX WARN: Code duplicated, block: B:111:0x0193 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:113:0x0196  */
            /* JADX WARN: Code duplicated, block: B:87:0x0143  */
            /* JADX WARN: Code duplicated, block: B:89:0x0149 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:91:0x014c  */
            /* JADX WARN: Code duplicated, block: B:94:0x0159  */
            /* JADX WARN: Code duplicated, block: B:98:0x0160  */
            /* JADX WARN: Instruction removed from duplicated block: B:113:0x0196, please report this as an issue */
            @Override // a.ee60
            public final void a(Object obj) {
                t58 t58Var3;
                Context contextD;
                byte b4;
                byte b5 = b3;
                byte b6 = 0;
                CharSequence charSequenceH = null;
                l58 l58Var = this.b;
                switch (b5) {
                    case 0:
                        p58 p58Var = (p58) obj;
                        if (p58Var != null) {
                            l58Var.F0(p58Var);
                            t58 t58Var4 = l58Var.H1;
                            hy40 hy40Var4 = t58Var4.s;
                            if (hy40Var4 == null) {
                                hy40Var4 = new hy40();
                                t58Var4.s = hy40Var4;
                            }
                            t58.z(hy40Var4, null);
                        }
                        break;
                    case 1:
                        d58 d58Var = (d58) obj;
                        if (d58Var != null) {
                            int i = d58Var.f5492a;
                            CharSequence charSequenceC = d58Var.b;
                            switch (i) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 20:
                                case 22:
                                    break;
                                case 6:
                                case 16:
                                case 17:
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                default:
                                    i = 8;
                                    break;
                                case 18:
                                case 21:
                                    i = 1;
                                    break;
                            }
                            Context contextD2 = l58Var.D();
                            if (Build.VERSION.SDK_INT < 29 && ((i == 7 || i == 9) && contextD2 != null)) {
                                KeyguardManager keyguardManager = (KeyguardManager) contextD2.getSystemService(KeyguardManager.class);
                                if ((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) && hmw0.Z(l58Var.H1.r)) {
                                    l58Var.C0();
                                } else if (l58Var.B0()) {
                                    if (charSequenceC == null) {
                                        charSequenceC = fxb.C(i, l58Var.D());
                                    }
                                    t58Var3 = l58Var.H1;
                                    if (i == 5) {
                                        b4 = t58Var3.k;
                                        if (b4 != 0) {
                                            l58Var.E0(i, charSequenceC);
                                        } else {
                                            l58Var.E0(i, charSequenceC);
                                        }
                                        l58Var.y0();
                                    } else {
                                        if (t58Var3.y) {
                                            l58Var.D0(i, charSequenceC);
                                        } else {
                                            l58Var.G0(charSequenceC);
                                            Handler handler3 = l58Var.I1;
                                            f58 f58Var3 = new f58(l58Var, i, charSequenceC, b6);
                                            contextD = l58Var.D();
                                            if (contextD != null) {
                                                String str3 = Build.MODEL;
                                                if (gkb.X(contextD)) {
                                                }
                                            }
                                            handler3.postDelayed(f58Var3, b6);
                                        }
                                        l58Var.H1.y = true;
                                    }
                                } else {
                                    if (charSequenceC == null) {
                                        charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                    }
                                    l58Var.D0(i, charSequenceC);
                                }
                            } else if (l58Var.B0()) {
                                if (charSequenceC == null) {
                                    charSequenceC = fxb.C(i, l58Var.D());
                                }
                                t58Var3 = l58Var.H1;
                                if (i == 5) {
                                    b4 = t58Var3.k;
                                    if (b4 != 0 || b4 == 3) {
                                        l58Var.E0(i, charSequenceC);
                                    }
                                    l58Var.y0();
                                } else {
                                    if (t58Var3.y) {
                                        l58Var.D0(i, charSequenceC);
                                    } else {
                                        l58Var.G0(charSequenceC);
                                        Handler handler4 = l58Var.I1;
                                        f58 f58Var4 = new f58(l58Var, i, charSequenceC, b6);
                                        contextD = l58Var.D();
                                        if (contextD != null) {
                                            String str4 = Build.MODEL;
                                            b6 = gkb.X(contextD) ? (byte) 0 : (byte) 2000;
                                        }
                                        handler4.postDelayed(f58Var4, b6);
                                    }
                                    l58Var.H1.y = true;
                                }
                            } else {
                                if (charSequenceC == null) {
                                    charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                }
                                l58Var.D0(i, charSequenceC);
                            }
                            t58 t58Var5 = l58Var.H1;
                            hy40 hy40Var5 = t58Var5.t;
                            if (hy40Var5 == null) {
                                hy40Var5 = new hy40();
                                t58Var5.t = hy40Var5;
                            }
                            t58.z(hy40Var5, null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (l58Var.B0()) {
                                l58Var.G0(charSequence);
                            }
                            t58 t58Var6 = l58Var.H1;
                            hy40 hy40Var6 = t58Var6.t;
                            if (hy40Var6 == null) {
                                hy40Var6 = new hy40();
                                t58Var6.t = hy40Var6;
                            }
                            t58.z(hy40Var6, null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.B0()) {
                                l58Var.G0(l58Var.H(R.string.fingerprint_not_recognized));
                            }
                            t58 t58Var7 = l58Var.H1;
                            if (t58Var7.m) {
                                Executor xz3Var = t58Var7.b;
                                if (xz3Var == null) {
                                    xz3Var = new xz3((byte) 1);
                                }
                                xz3Var.execute(new e58(l58Var, b6));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            t58 t58Var8 = l58Var.H1;
                            hy40 hy40Var7 = t58Var8.v;
                            if (hy40Var7 == null) {
                                hy40Var7 = new hy40();
                                t58Var8.v = hy40Var7;
                            }
                            t58.z(hy40Var7, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.A0()) {
                                l58Var.C0();
                            } else {
                                t58 t58Var9 = l58Var.H1;
                                String str5 = t58Var9.j;
                                if (str5 != null) {
                                    charSequenceH = str5;
                                } else {
                                    yzn0 yzn0Var = t58Var9.d;
                                    if (yzn0Var != null && (charSequenceH = (CharSequence) yzn0Var.b) == null) {
                                        charSequenceH = "";
                                    }
                                }
                                if (charSequenceH == null) {
                                    charSequenceH = l58Var.H(R.string.default_error_msg);
                                }
                                l58Var.D0(13, charSequenceH);
                                l58Var.x0(2);
                            }
                            l58Var.H1.x(false);
                        }
                        break;
                    case 5:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.D0(22, l58Var.H(R.string.content_view_more_options_button_clicked));
                            l58Var.x0(4);
                            t58 t58Var10 = l58Var.H1;
                            hy40 hy40Var8 = t58Var10.x;
                            if (hy40Var8 == null) {
                                hy40Var8 = new hy40();
                                t58Var10.x = hy40Var8;
                            }
                            t58.z(hy40Var8, Boolean.FALSE);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.x0(1);
                            l58Var.y0();
                            t58 t58Var11 = l58Var.H1;
                            hy40 hy40Var9 = t58Var11.z;
                            if (hy40Var9 == null) {
                                hy40Var9 = new hy40();
                                t58Var11.z = hy40Var9;
                            }
                            t58.z(hy40Var9, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        t58 t58Var3 = this.H1;
        hy40 hy40Var4 = t58Var3.v;
        if (hy40Var4 == null) {
            hy40Var4 = new hy40();
            t58Var3.v = hy40Var4;
        }
        final byte b4 = 3;
        hy40Var4.e(this, new ee60(this) { // from class: a.g58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0167  */
            /* JADX WARN: Code duplicated, block: B:102:0x016b  */
            /* JADX WARN: Code duplicated, block: B:103:0x016f  */
            /* JADX WARN: Code duplicated, block: B:105:0x017f  */
            /* JADX WARN: Code duplicated, block: B:108:0x0188  */
            /* JADX WARN: Code duplicated, block: B:111:0x0193 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:113:0x0196  */
            /* JADX WARN: Code duplicated, block: B:87:0x0143  */
            /* JADX WARN: Code duplicated, block: B:89:0x0149 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:91:0x014c  */
            /* JADX WARN: Code duplicated, block: B:94:0x0159  */
            /* JADX WARN: Code duplicated, block: B:98:0x0160  */
            /* JADX WARN: Instruction removed from duplicated block: B:113:0x0196, please report this as an issue */
            @Override // a.ee60
            public final void a(Object obj) {
                t58 t58Var4;
                Context contextD;
                byte b5;
                byte b6 = b4;
                byte b7 = 0;
                CharSequence charSequenceH = null;
                l58 l58Var = this.b;
                switch (b6) {
                    case 0:
                        p58 p58Var = (p58) obj;
                        if (p58Var != null) {
                            l58Var.F0(p58Var);
                            t58 t58Var5 = l58Var.H1;
                            hy40 hy40Var5 = t58Var5.s;
                            if (hy40Var5 == null) {
                                hy40Var5 = new hy40();
                                t58Var5.s = hy40Var5;
                            }
                            t58.z(hy40Var5, null);
                        }
                        break;
                    case 1:
                        d58 d58Var = (d58) obj;
                        if (d58Var != null) {
                            int i = d58Var.f5492a;
                            CharSequence charSequenceC = d58Var.b;
                            switch (i) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 20:
                                case 22:
                                    break;
                                case 6:
                                case 16:
                                case 17:
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                default:
                                    i = 8;
                                    break;
                                case 18:
                                case 21:
                                    i = 1;
                                    break;
                            }
                            Context contextD2 = l58Var.D();
                            if (Build.VERSION.SDK_INT < 29 && ((i == 7 || i == 9) && contextD2 != null)) {
                                KeyguardManager keyguardManager = (KeyguardManager) contextD2.getSystemService(KeyguardManager.class);
                                if ((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) && hmw0.Z(l58Var.H1.r)) {
                                    l58Var.C0();
                                } else if (l58Var.B0()) {
                                    if (charSequenceC == null) {
                                        charSequenceC = fxb.C(i, l58Var.D());
                                    }
                                    t58Var4 = l58Var.H1;
                                    if (i == 5) {
                                        b5 = t58Var4.k;
                                        if (b5 != 0) {
                                            l58Var.E0(i, charSequenceC);
                                        } else {
                                            l58Var.E0(i, charSequenceC);
                                        }
                                        l58Var.y0();
                                    } else {
                                        if (t58Var4.y) {
                                            l58Var.D0(i, charSequenceC);
                                        } else {
                                            l58Var.G0(charSequenceC);
                                            Handler handler4 = l58Var.I1;
                                            f58 f58Var4 = new f58(l58Var, i, charSequenceC, b7);
                                            contextD = l58Var.D();
                                            if (contextD != null) {
                                                String str4 = Build.MODEL;
                                                if (gkb.X(contextD)) {
                                                }
                                            }
                                            handler4.postDelayed(f58Var4, b7);
                                        }
                                        l58Var.H1.y = true;
                                    }
                                } else {
                                    if (charSequenceC == null) {
                                        charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                    }
                                    l58Var.D0(i, charSequenceC);
                                }
                            } else if (l58Var.B0()) {
                                if (charSequenceC == null) {
                                    charSequenceC = fxb.C(i, l58Var.D());
                                }
                                t58Var4 = l58Var.H1;
                                if (i == 5) {
                                    b5 = t58Var4.k;
                                    if (b5 != 0 || b5 == 3) {
                                        l58Var.E0(i, charSequenceC);
                                    }
                                    l58Var.y0();
                                } else {
                                    if (t58Var4.y) {
                                        l58Var.D0(i, charSequenceC);
                                    } else {
                                        l58Var.G0(charSequenceC);
                                        Handler handler5 = l58Var.I1;
                                        f58 f58Var5 = new f58(l58Var, i, charSequenceC, b7);
                                        contextD = l58Var.D();
                                        if (contextD != null) {
                                            String str5 = Build.MODEL;
                                            b7 = gkb.X(contextD) ? (byte) 0 : (byte) 2000;
                                        }
                                        handler5.postDelayed(f58Var5, b7);
                                    }
                                    l58Var.H1.y = true;
                                }
                            } else {
                                if (charSequenceC == null) {
                                    charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                }
                                l58Var.D0(i, charSequenceC);
                            }
                            t58 t58Var6 = l58Var.H1;
                            hy40 hy40Var6 = t58Var6.t;
                            if (hy40Var6 == null) {
                                hy40Var6 = new hy40();
                                t58Var6.t = hy40Var6;
                            }
                            t58.z(hy40Var6, null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (l58Var.B0()) {
                                l58Var.G0(charSequence);
                            }
                            t58 t58Var7 = l58Var.H1;
                            hy40 hy40Var7 = t58Var7.t;
                            if (hy40Var7 == null) {
                                hy40Var7 = new hy40();
                                t58Var7.t = hy40Var7;
                            }
                            t58.z(hy40Var7, null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.B0()) {
                                l58Var.G0(l58Var.H(R.string.fingerprint_not_recognized));
                            }
                            t58 t58Var8 = l58Var.H1;
                            if (t58Var8.m) {
                                Executor xz3Var = t58Var8.b;
                                if (xz3Var == null) {
                                    xz3Var = new xz3((byte) 1);
                                }
                                xz3Var.execute(new e58(l58Var, b7));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            t58 t58Var9 = l58Var.H1;
                            hy40 hy40Var8 = t58Var9.v;
                            if (hy40Var8 == null) {
                                hy40Var8 = new hy40();
                                t58Var9.v = hy40Var8;
                            }
                            t58.z(hy40Var8, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.A0()) {
                                l58Var.C0();
                            } else {
                                t58 t58Var10 = l58Var.H1;
                                String str6 = t58Var10.j;
                                if (str6 != null) {
                                    charSequenceH = str6;
                                } else {
                                    yzn0 yzn0Var = t58Var10.d;
                                    if (yzn0Var != null && (charSequenceH = (CharSequence) yzn0Var.b) == null) {
                                        charSequenceH = "";
                                    }
                                }
                                if (charSequenceH == null) {
                                    charSequenceH = l58Var.H(R.string.default_error_msg);
                                }
                                l58Var.D0(13, charSequenceH);
                                l58Var.x0(2);
                            }
                            l58Var.H1.x(false);
                        }
                        break;
                    case 5:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.D0(22, l58Var.H(R.string.content_view_more_options_button_clicked));
                            l58Var.x0(4);
                            t58 t58Var11 = l58Var.H1;
                            hy40 hy40Var9 = t58Var11.x;
                            if (hy40Var9 == null) {
                                hy40Var9 = new hy40();
                                t58Var11.x = hy40Var9;
                            }
                            t58.z(hy40Var9, Boolean.FALSE);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.x0(1);
                            l58Var.y0();
                            t58 t58Var12 = l58Var.H1;
                            hy40 hy40Var10 = t58Var12.z;
                            if (hy40Var10 == null) {
                                hy40Var10 = new hy40();
                                t58Var12.z = hy40Var10;
                            }
                            t58.z(hy40Var10, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        t58 t58Var4 = this.H1;
        hy40 hy40Var5 = t58Var4.w;
        if (hy40Var5 == null) {
            hy40Var5 = new hy40();
            t58Var4.w = hy40Var5;
        }
        final byte b5 = 4;
        hy40Var5.e(this, new ee60(this) { // from class: a.g58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0167  */
            /* JADX WARN: Code duplicated, block: B:102:0x016b  */
            /* JADX WARN: Code duplicated, block: B:103:0x016f  */
            /* JADX WARN: Code duplicated, block: B:105:0x017f  */
            /* JADX WARN: Code duplicated, block: B:108:0x0188  */
            /* JADX WARN: Code duplicated, block: B:111:0x0193 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:113:0x0196  */
            /* JADX WARN: Code duplicated, block: B:87:0x0143  */
            /* JADX WARN: Code duplicated, block: B:89:0x0149 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:91:0x014c  */
            /* JADX WARN: Code duplicated, block: B:94:0x0159  */
            /* JADX WARN: Code duplicated, block: B:98:0x0160  */
            /* JADX WARN: Instruction removed from duplicated block: B:113:0x0196, please report this as an issue */
            @Override // a.ee60
            public final void a(Object obj) {
                t58 t58Var5;
                Context contextD;
                byte b6;
                byte b7 = b5;
                byte b8 = 0;
                CharSequence charSequenceH = null;
                l58 l58Var = this.b;
                switch (b7) {
                    case 0:
                        p58 p58Var = (p58) obj;
                        if (p58Var != null) {
                            l58Var.F0(p58Var);
                            t58 t58Var6 = l58Var.H1;
                            hy40 hy40Var6 = t58Var6.s;
                            if (hy40Var6 == null) {
                                hy40Var6 = new hy40();
                                t58Var6.s = hy40Var6;
                            }
                            t58.z(hy40Var6, null);
                        }
                        break;
                    case 1:
                        d58 d58Var = (d58) obj;
                        if (d58Var != null) {
                            int i = d58Var.f5492a;
                            CharSequence charSequenceC = d58Var.b;
                            switch (i) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 20:
                                case 22:
                                    break;
                                case 6:
                                case 16:
                                case 17:
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                default:
                                    i = 8;
                                    break;
                                case 18:
                                case 21:
                                    i = 1;
                                    break;
                            }
                            Context contextD2 = l58Var.D();
                            if (Build.VERSION.SDK_INT < 29 && ((i == 7 || i == 9) && contextD2 != null)) {
                                KeyguardManager keyguardManager = (KeyguardManager) contextD2.getSystemService(KeyguardManager.class);
                                if ((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) && hmw0.Z(l58Var.H1.r)) {
                                    l58Var.C0();
                                } else if (l58Var.B0()) {
                                    if (charSequenceC == null) {
                                        charSequenceC = fxb.C(i, l58Var.D());
                                    }
                                    t58Var5 = l58Var.H1;
                                    if (i == 5) {
                                        b6 = t58Var5.k;
                                        if (b6 != 0) {
                                            l58Var.E0(i, charSequenceC);
                                        } else {
                                            l58Var.E0(i, charSequenceC);
                                        }
                                        l58Var.y0();
                                    } else {
                                        if (t58Var5.y) {
                                            l58Var.D0(i, charSequenceC);
                                        } else {
                                            l58Var.G0(charSequenceC);
                                            Handler handler5 = l58Var.I1;
                                            f58 f58Var5 = new f58(l58Var, i, charSequenceC, b8);
                                            contextD = l58Var.D();
                                            if (contextD != null) {
                                                String str5 = Build.MODEL;
                                                if (gkb.X(contextD)) {
                                                }
                                            }
                                            handler5.postDelayed(f58Var5, b8);
                                        }
                                        l58Var.H1.y = true;
                                    }
                                } else {
                                    if (charSequenceC == null) {
                                        charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                    }
                                    l58Var.D0(i, charSequenceC);
                                }
                            } else if (l58Var.B0()) {
                                if (charSequenceC == null) {
                                    charSequenceC = fxb.C(i, l58Var.D());
                                }
                                t58Var5 = l58Var.H1;
                                if (i == 5) {
                                    b6 = t58Var5.k;
                                    if (b6 != 0 || b6 == 3) {
                                        l58Var.E0(i, charSequenceC);
                                    }
                                    l58Var.y0();
                                } else {
                                    if (t58Var5.y) {
                                        l58Var.D0(i, charSequenceC);
                                    } else {
                                        l58Var.G0(charSequenceC);
                                        Handler handler6 = l58Var.I1;
                                        f58 f58Var6 = new f58(l58Var, i, charSequenceC, b8);
                                        contextD = l58Var.D();
                                        if (contextD != null) {
                                            String str6 = Build.MODEL;
                                            b8 = gkb.X(contextD) ? (byte) 0 : (byte) 2000;
                                        }
                                        handler6.postDelayed(f58Var6, b8);
                                    }
                                    l58Var.H1.y = true;
                                }
                            } else {
                                if (charSequenceC == null) {
                                    charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                }
                                l58Var.D0(i, charSequenceC);
                            }
                            t58 t58Var7 = l58Var.H1;
                            hy40 hy40Var7 = t58Var7.t;
                            if (hy40Var7 == null) {
                                hy40Var7 = new hy40();
                                t58Var7.t = hy40Var7;
                            }
                            t58.z(hy40Var7, null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (l58Var.B0()) {
                                l58Var.G0(charSequence);
                            }
                            t58 t58Var8 = l58Var.H1;
                            hy40 hy40Var8 = t58Var8.t;
                            if (hy40Var8 == null) {
                                hy40Var8 = new hy40();
                                t58Var8.t = hy40Var8;
                            }
                            t58.z(hy40Var8, null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.B0()) {
                                l58Var.G0(l58Var.H(R.string.fingerprint_not_recognized));
                            }
                            t58 t58Var9 = l58Var.H1;
                            if (t58Var9.m) {
                                Executor xz3Var = t58Var9.b;
                                if (xz3Var == null) {
                                    xz3Var = new xz3((byte) 1);
                                }
                                xz3Var.execute(new e58(l58Var, b8));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            t58 t58Var10 = l58Var.H1;
                            hy40 hy40Var9 = t58Var10.v;
                            if (hy40Var9 == null) {
                                hy40Var9 = new hy40();
                                t58Var10.v = hy40Var9;
                            }
                            t58.z(hy40Var9, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.A0()) {
                                l58Var.C0();
                            } else {
                                t58 t58Var11 = l58Var.H1;
                                String str7 = t58Var11.j;
                                if (str7 != null) {
                                    charSequenceH = str7;
                                } else {
                                    yzn0 yzn0Var = t58Var11.d;
                                    if (yzn0Var != null && (charSequenceH = (CharSequence) yzn0Var.b) == null) {
                                        charSequenceH = "";
                                    }
                                }
                                if (charSequenceH == null) {
                                    charSequenceH = l58Var.H(R.string.default_error_msg);
                                }
                                l58Var.D0(13, charSequenceH);
                                l58Var.x0(2);
                            }
                            l58Var.H1.x(false);
                        }
                        break;
                    case 5:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.D0(22, l58Var.H(R.string.content_view_more_options_button_clicked));
                            l58Var.x0(4);
                            t58 t58Var12 = l58Var.H1;
                            hy40 hy40Var10 = t58Var12.x;
                            if (hy40Var10 == null) {
                                hy40Var10 = new hy40();
                                t58Var12.x = hy40Var10;
                            }
                            t58.z(hy40Var10, Boolean.FALSE);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.x0(1);
                            l58Var.y0();
                            t58 t58Var13 = l58Var.H1;
                            hy40 hy40Var11 = t58Var13.z;
                            if (hy40Var11 == null) {
                                hy40Var11 = new hy40();
                                t58Var13.z = hy40Var11;
                            }
                            t58.z(hy40Var11, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        t58 t58Var5 = this.H1;
        hy40 hy40Var6 = t58Var5.x;
        if (hy40Var6 == null) {
            hy40Var6 = new hy40();
            t58Var5.x = hy40Var6;
        }
        final byte b6 = 5;
        hy40Var6.e(this, new ee60(this) { // from class: a.g58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0167  */
            /* JADX WARN: Code duplicated, block: B:102:0x016b  */
            /* JADX WARN: Code duplicated, block: B:103:0x016f  */
            /* JADX WARN: Code duplicated, block: B:105:0x017f  */
            /* JADX WARN: Code duplicated, block: B:108:0x0188  */
            /* JADX WARN: Code duplicated, block: B:111:0x0193 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:113:0x0196  */
            /* JADX WARN: Code duplicated, block: B:87:0x0143  */
            /* JADX WARN: Code duplicated, block: B:89:0x0149 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:91:0x014c  */
            /* JADX WARN: Code duplicated, block: B:94:0x0159  */
            /* JADX WARN: Code duplicated, block: B:98:0x0160  */
            /* JADX WARN: Instruction removed from duplicated block: B:113:0x0196, please report this as an issue */
            @Override // a.ee60
            public final void a(Object obj) {
                t58 t58Var6;
                Context contextD;
                byte b7;
                byte b8 = b6;
                byte b9 = 0;
                CharSequence charSequenceH = null;
                l58 l58Var = this.b;
                switch (b8) {
                    case 0:
                        p58 p58Var = (p58) obj;
                        if (p58Var != null) {
                            l58Var.F0(p58Var);
                            t58 t58Var7 = l58Var.H1;
                            hy40 hy40Var7 = t58Var7.s;
                            if (hy40Var7 == null) {
                                hy40Var7 = new hy40();
                                t58Var7.s = hy40Var7;
                            }
                            t58.z(hy40Var7, null);
                        }
                        break;
                    case 1:
                        d58 d58Var = (d58) obj;
                        if (d58Var != null) {
                            int i = d58Var.f5492a;
                            CharSequence charSequenceC = d58Var.b;
                            switch (i) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 20:
                                case 22:
                                    break;
                                case 6:
                                case 16:
                                case 17:
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                default:
                                    i = 8;
                                    break;
                                case 18:
                                case 21:
                                    i = 1;
                                    break;
                            }
                            Context contextD2 = l58Var.D();
                            if (Build.VERSION.SDK_INT < 29 && ((i == 7 || i == 9) && contextD2 != null)) {
                                KeyguardManager keyguardManager = (KeyguardManager) contextD2.getSystemService(KeyguardManager.class);
                                if ((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) && hmw0.Z(l58Var.H1.r)) {
                                    l58Var.C0();
                                } else if (l58Var.B0()) {
                                    if (charSequenceC == null) {
                                        charSequenceC = fxb.C(i, l58Var.D());
                                    }
                                    t58Var6 = l58Var.H1;
                                    if (i == 5) {
                                        b7 = t58Var6.k;
                                        if (b7 != 0) {
                                            l58Var.E0(i, charSequenceC);
                                        } else {
                                            l58Var.E0(i, charSequenceC);
                                        }
                                        l58Var.y0();
                                    } else {
                                        if (t58Var6.y) {
                                            l58Var.D0(i, charSequenceC);
                                        } else {
                                            l58Var.G0(charSequenceC);
                                            Handler handler6 = l58Var.I1;
                                            f58 f58Var6 = new f58(l58Var, i, charSequenceC, b9);
                                            contextD = l58Var.D();
                                            if (contextD != null) {
                                                String str6 = Build.MODEL;
                                                if (gkb.X(contextD)) {
                                                }
                                            }
                                            handler6.postDelayed(f58Var6, b9);
                                        }
                                        l58Var.H1.y = true;
                                    }
                                } else {
                                    if (charSequenceC == null) {
                                        charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                    }
                                    l58Var.D0(i, charSequenceC);
                                }
                            } else if (l58Var.B0()) {
                                if (charSequenceC == null) {
                                    charSequenceC = fxb.C(i, l58Var.D());
                                }
                                t58Var6 = l58Var.H1;
                                if (i == 5) {
                                    b7 = t58Var6.k;
                                    if (b7 != 0 || b7 == 3) {
                                        l58Var.E0(i, charSequenceC);
                                    }
                                    l58Var.y0();
                                } else {
                                    if (t58Var6.y) {
                                        l58Var.D0(i, charSequenceC);
                                    } else {
                                        l58Var.G0(charSequenceC);
                                        Handler handler7 = l58Var.I1;
                                        f58 f58Var7 = new f58(l58Var, i, charSequenceC, b9);
                                        contextD = l58Var.D();
                                        if (contextD != null) {
                                            String str7 = Build.MODEL;
                                            b9 = gkb.X(contextD) ? (byte) 0 : (byte) 2000;
                                        }
                                        handler7.postDelayed(f58Var7, b9);
                                    }
                                    l58Var.H1.y = true;
                                }
                            } else {
                                if (charSequenceC == null) {
                                    charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                }
                                l58Var.D0(i, charSequenceC);
                            }
                            t58 t58Var8 = l58Var.H1;
                            hy40 hy40Var8 = t58Var8.t;
                            if (hy40Var8 == null) {
                                hy40Var8 = new hy40();
                                t58Var8.t = hy40Var8;
                            }
                            t58.z(hy40Var8, null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (l58Var.B0()) {
                                l58Var.G0(charSequence);
                            }
                            t58 t58Var9 = l58Var.H1;
                            hy40 hy40Var9 = t58Var9.t;
                            if (hy40Var9 == null) {
                                hy40Var9 = new hy40();
                                t58Var9.t = hy40Var9;
                            }
                            t58.z(hy40Var9, null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.B0()) {
                                l58Var.G0(l58Var.H(R.string.fingerprint_not_recognized));
                            }
                            t58 t58Var10 = l58Var.H1;
                            if (t58Var10.m) {
                                Executor xz3Var = t58Var10.b;
                                if (xz3Var == null) {
                                    xz3Var = new xz3((byte) 1);
                                }
                                xz3Var.execute(new e58(l58Var, b9));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            t58 t58Var11 = l58Var.H1;
                            hy40 hy40Var10 = t58Var11.v;
                            if (hy40Var10 == null) {
                                hy40Var10 = new hy40();
                                t58Var11.v = hy40Var10;
                            }
                            t58.z(hy40Var10, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.A0()) {
                                l58Var.C0();
                            } else {
                                t58 t58Var12 = l58Var.H1;
                                String str8 = t58Var12.j;
                                if (str8 != null) {
                                    charSequenceH = str8;
                                } else {
                                    yzn0 yzn0Var = t58Var12.d;
                                    if (yzn0Var != null && (charSequenceH = (CharSequence) yzn0Var.b) == null) {
                                        charSequenceH = "";
                                    }
                                }
                                if (charSequenceH == null) {
                                    charSequenceH = l58Var.H(R.string.default_error_msg);
                                }
                                l58Var.D0(13, charSequenceH);
                                l58Var.x0(2);
                            }
                            l58Var.H1.x(false);
                        }
                        break;
                    case 5:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.D0(22, l58Var.H(R.string.content_view_more_options_button_clicked));
                            l58Var.x0(4);
                            t58 t58Var13 = l58Var.H1;
                            hy40 hy40Var11 = t58Var13.x;
                            if (hy40Var11 == null) {
                                hy40Var11 = new hy40();
                                t58Var13.x = hy40Var11;
                            }
                            t58.z(hy40Var11, Boolean.FALSE);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.x0(1);
                            l58Var.y0();
                            t58 t58Var14 = l58Var.H1;
                            hy40 hy40Var12 = t58Var14.z;
                            if (hy40Var12 == null) {
                                hy40Var12 = new hy40();
                                t58Var14.z = hy40Var12;
                            }
                            t58.z(hy40Var12, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        t58 t58Var6 = this.H1;
        hy40 hy40Var7 = t58Var6.z;
        if (hy40Var7 == null) {
            hy40Var7 = new hy40();
            t58Var6.z = hy40Var7;
        }
        final byte b7 = 6;
        hy40Var7.e(this, new ee60(this) { // from class: a.g58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0167  */
            /* JADX WARN: Code duplicated, block: B:102:0x016b  */
            /* JADX WARN: Code duplicated, block: B:103:0x016f  */
            /* JADX WARN: Code duplicated, block: B:105:0x017f  */
            /* JADX WARN: Code duplicated, block: B:108:0x0188  */
            /* JADX WARN: Code duplicated, block: B:111:0x0193 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:113:0x0196  */
            /* JADX WARN: Code duplicated, block: B:87:0x0143  */
            /* JADX WARN: Code duplicated, block: B:89:0x0149 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:91:0x014c  */
            /* JADX WARN: Code duplicated, block: B:94:0x0159  */
            /* JADX WARN: Code duplicated, block: B:98:0x0160  */
            /* JADX WARN: Instruction removed from duplicated block: B:113:0x0196, please report this as an issue */
            @Override // a.ee60
            public final void a(Object obj) {
                t58 t58Var7;
                Context contextD;
                byte b8;
                byte b9 = b7;
                byte b10 = 0;
                CharSequence charSequenceH = null;
                l58 l58Var = this.b;
                switch (b9) {
                    case 0:
                        p58 p58Var = (p58) obj;
                        if (p58Var != null) {
                            l58Var.F0(p58Var);
                            t58 t58Var8 = l58Var.H1;
                            hy40 hy40Var8 = t58Var8.s;
                            if (hy40Var8 == null) {
                                hy40Var8 = new hy40();
                                t58Var8.s = hy40Var8;
                            }
                            t58.z(hy40Var8, null);
                        }
                        break;
                    case 1:
                        d58 d58Var = (d58) obj;
                        if (d58Var != null) {
                            int i = d58Var.f5492a;
                            CharSequence charSequenceC = d58Var.b;
                            switch (i) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 20:
                                case 22:
                                    break;
                                case 6:
                                case 16:
                                case 17:
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                default:
                                    i = 8;
                                    break;
                                case 18:
                                case 21:
                                    i = 1;
                                    break;
                            }
                            Context contextD2 = l58Var.D();
                            if (Build.VERSION.SDK_INT < 29 && ((i == 7 || i == 9) && contextD2 != null)) {
                                KeyguardManager keyguardManager = (KeyguardManager) contextD2.getSystemService(KeyguardManager.class);
                                if ((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) && hmw0.Z(l58Var.H1.r)) {
                                    l58Var.C0();
                                } else if (l58Var.B0()) {
                                    if (charSequenceC == null) {
                                        charSequenceC = fxb.C(i, l58Var.D());
                                    }
                                    t58Var7 = l58Var.H1;
                                    if (i == 5) {
                                        b8 = t58Var7.k;
                                        if (b8 != 0) {
                                            l58Var.E0(i, charSequenceC);
                                        } else {
                                            l58Var.E0(i, charSequenceC);
                                        }
                                        l58Var.y0();
                                    } else {
                                        if (t58Var7.y) {
                                            l58Var.D0(i, charSequenceC);
                                        } else {
                                            l58Var.G0(charSequenceC);
                                            Handler handler7 = l58Var.I1;
                                            f58 f58Var7 = new f58(l58Var, i, charSequenceC, b10);
                                            contextD = l58Var.D();
                                            if (contextD != null) {
                                                String str7 = Build.MODEL;
                                                if (gkb.X(contextD)) {
                                                }
                                            }
                                            handler7.postDelayed(f58Var7, b10);
                                        }
                                        l58Var.H1.y = true;
                                    }
                                } else {
                                    if (charSequenceC == null) {
                                        charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                    }
                                    l58Var.D0(i, charSequenceC);
                                }
                            } else if (l58Var.B0()) {
                                if (charSequenceC == null) {
                                    charSequenceC = fxb.C(i, l58Var.D());
                                }
                                t58Var7 = l58Var.H1;
                                if (i == 5) {
                                    b8 = t58Var7.k;
                                    if (b8 != 0 || b8 == 3) {
                                        l58Var.E0(i, charSequenceC);
                                    }
                                    l58Var.y0();
                                } else {
                                    if (t58Var7.y) {
                                        l58Var.D0(i, charSequenceC);
                                    } else {
                                        l58Var.G0(charSequenceC);
                                        Handler handler8 = l58Var.I1;
                                        f58 f58Var8 = new f58(l58Var, i, charSequenceC, b10);
                                        contextD = l58Var.D();
                                        if (contextD != null) {
                                            String str8 = Build.MODEL;
                                            b10 = gkb.X(contextD) ? (byte) 0 : (byte) 2000;
                                        }
                                        handler8.postDelayed(f58Var8, b10);
                                    }
                                    l58Var.H1.y = true;
                                }
                            } else {
                                if (charSequenceC == null) {
                                    charSequenceC = l58Var.H(R.string.default_error_msg) + Separators.SP + i;
                                }
                                l58Var.D0(i, charSequenceC);
                            }
                            t58 t58Var9 = l58Var.H1;
                            hy40 hy40Var9 = t58Var9.t;
                            if (hy40Var9 == null) {
                                hy40Var9 = new hy40();
                                t58Var9.t = hy40Var9;
                            }
                            t58.z(hy40Var9, null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (l58Var.B0()) {
                                l58Var.G0(charSequence);
                            }
                            t58 t58Var10 = l58Var.H1;
                            hy40 hy40Var10 = t58Var10.t;
                            if (hy40Var10 == null) {
                                hy40Var10 = new hy40();
                                t58Var10.t = hy40Var10;
                            }
                            t58.z(hy40Var10, null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.B0()) {
                                l58Var.G0(l58Var.H(R.string.fingerprint_not_recognized));
                            }
                            t58 t58Var11 = l58Var.H1;
                            if (t58Var11.m) {
                                Executor xz3Var = t58Var11.b;
                                if (xz3Var == null) {
                                    xz3Var = new xz3((byte) 1);
                                }
                                xz3Var.execute(new e58(l58Var, b10));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            t58 t58Var12 = l58Var.H1;
                            hy40 hy40Var11 = t58Var12.v;
                            if (hy40Var11 == null) {
                                hy40Var11 = new hy40();
                                t58Var12.v = hy40Var11;
                            }
                            t58.z(hy40Var11, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (l58Var.A0()) {
                                l58Var.C0();
                            } else {
                                t58 t58Var13 = l58Var.H1;
                                String str9 = t58Var13.j;
                                if (str9 != null) {
                                    charSequenceH = str9;
                                } else {
                                    yzn0 yzn0Var = t58Var13.d;
                                    if (yzn0Var != null && (charSequenceH = (CharSequence) yzn0Var.b) == null) {
                                        charSequenceH = "";
                                    }
                                }
                                if (charSequenceH == null) {
                                    charSequenceH = l58Var.H(R.string.default_error_msg);
                                }
                                l58Var.D0(13, charSequenceH);
                                l58Var.x0(2);
                            }
                            l58Var.H1.x(false);
                        }
                        break;
                    case 5:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.D0(22, l58Var.H(R.string.content_view_more_options_button_clicked));
                            l58Var.x0(4);
                            t58 t58Var14 = l58Var.H1;
                            hy40 hy40Var12 = t58Var14.x;
                            if (hy40Var12 == null) {
                                hy40Var12 = new hy40();
                                t58Var14.x = hy40Var12;
                            }
                            t58.z(hy40Var12, Boolean.FALSE);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            l58Var.x0(1);
                            l58Var.y0();
                            t58 t58Var15 = l58Var.H1;
                            hy40 hy40Var13 = t58Var15.z;
                            if (hy40Var13 == null) {
                                hy40Var13 = new hy40();
                                t58Var15.z = hy40Var13;
                            }
                            t58.z(hy40Var13, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void g0() {
        this.j1 = true;
        if (Build.VERSION.SDK_INT == 29 && hmw0.Z(this.H1.r)) {
            t58 t58Var = this.H1;
            t58Var.p = true;
            this.I1.postDelayed(new k58(t58Var, (byte) 2), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        t58 t58Var = this.H1;
        if (!t58Var.l || t58Var.n) {
            return;
        }
        kxq kxqVarB = B();
        if (this.m) {
            if (kxqVarB == null || !kxqVarB.isChangingConfigurations()) {
                x0(0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x0(int i) {
        if (i == 3 || !this.H1.p) {
            if (B0()) {
                this.H1.k = i;
                if (i == 1) {
                    E0(10, fxb.C(10, D()));
                }
            }
            t58 t58Var = this.H1;
            t5a t5aVar = t58Var.g;
            if (t5aVar == null) {
                t5aVar = new t5a();
                t58Var.g = t5aVar;
            }
            t5aVar.a();
        }
    }

    public final void y0() {
        z0();
        t58 t58Var = this.H1;
        t58Var.l = false;
        if (!t58Var.n && N()) {
            zb5 zb5Var = new zb5(F());
            zb5Var.n(this);
            zb5Var.g(true, true);
        }
        Context contextD = D();
        if (contextD != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : contextD.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        t58 t58Var2 = this.H1;
                        t58Var2.o = true;
                        this.I1.postDelayed(new k58(t58Var2, (byte) 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void z0() {
        this.H1.l = false;
        if (N()) {
            androidx.fragment.app.e eVarF = F();
            zdq zdqVar = (zdq) eVarF.J("androidx.biometric.internal.FingerprintDialogFragment");
            if (zdqVar != null) {
                if (zdqVar.N()) {
                    zdqVar.y0();
                    return;
                }
                zb5 zb5Var = new zb5(eVarF);
                zb5Var.n(zdqVar);
                zb5Var.g(true, true);
            }
        }
    }
}
