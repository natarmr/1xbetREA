package a;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.WeakHashMap;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class y50 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42027a;

    public /* synthetic */ y50(byte b) {
        this.f42027a = b;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.f42027a) {
            case 0:
                try {
                    return (Cipher) lyn.b.f20870a.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    itt0.o(e);
                    return null;
                }
            case 1:
                try {
                    return (Cipher) lyn.b.f20870a.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    itt0.o(e2);
                    return null;
                }
            case 2:
                try {
                    return (Cipher) lyn.b.f20870a.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    itt0.o(e3);
                    return null;
                }
            case 3:
                try {
                    return (Cipher) lyn.b.f20870a.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e4) {
                    itt0.o(e4);
                    return null;
                }
            case 4:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    r23 r23Var = new r23(choreographer, thb.y(looperMyLooper));
                    return kotlin.coroutines.e.c(r23Var, r23Var.l);
                }
                jf4.n("no Looper on this thread");
                return null;
            case 5:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 6:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            case 7:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
            case 8:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return j120.T();
                }
                if (Looper.myLooper() != null) {
                    return new lmv(new Handler(Looper.myLooper()));
                }
                return null;
            case 9:
                try {
                    return (Cipher) lyn.b.f20870a.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e5) {
                    itt0.o(e5);
                    return null;
                }
            case 10:
                SecureRandom secureRandom2 = new SecureRandom();
                secureRandom2.nextLong();
                return secureRandom2;
            case 11:
                return new PathMeasure();
            case 12:
                return new Path();
            case 13:
                return new Path();
            case 14:
                return new float[4];
            case 15:
                return Boolean.FALSE;
            case 16:
                adw0 adw0Var = new adw0();
                adw0Var.f701a = 0;
                return adw0Var;
            case 17:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
                gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
                simpleDateFormat.setCalendar(gregorianCalendar);
                return simpleDateFormat;
            case 18:
                return 0L;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                try {
                    return (Cipher) gix0.b.f11371a.zza("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e6) {
                    itt0.o(e6);
                    return null;
                }
            case 20:
                try {
                    Cipher cipher = (Cipher) gix0.b.f11371a.zza("AES/GCM-SIV/NoPadding");
                    if (bww0.a(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e7) {
                    itt0.o(e7);
                    return null;
                }
            case 21:
                Provider providerA0 = hew0.a0();
                if (providerA0 == null) {
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerA0);
                    } catch (GeneralSecurityException unused) {
                        try {
                            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                        } catch (Throwable unused2) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused3) {
                                secureRandom = new SecureRandom();
                            }
                        } else {
                            secureRandom = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom.nextLong();
                return secureRandom;
            case 22:
                try {
                    return (Cipher) gix0.b.f11371a.zza("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e8) {
                    itt0.o(e8);
                    return null;
                }
            case 23:
                m0x0.U(Thread.currentThread());
                bex0 bex0Var = new bex0();
                bex0Var.f2474a = false;
                bex0Var.b = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = wcx0.c;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, bex0Var);
                    break;
                }
                return bex0Var;
            case 24:
                return new Random();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                try {
                    return (Cipher) gix0.b.f11371a.zza("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e9) {
                    itt0.o(e9);
                    return null;
                }
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                try {
                    return (Cipher) gix0.b.f11371a.zza("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e10) {
                    itt0.o(e10);
                    return null;
                }
            default:
                try {
                    return (Cipher) gix0.b.f11371a.zza("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e11) {
                    itt0.o(e11);
                    return null;
                }
        }
    }
}
