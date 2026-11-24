package a;

import a.axq;
import a.ca70;
import a.htz;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.security.Provider;
import java.util.List;
import javax.crypto.Cipher;
import org.xplatform.web.impl.di.feature.WebGameScreenFactoryImpl$getWebGameScreen$2;

/* JADX INFO: loaded from: classes2.dex */
public final class uxs0 implements quc, lix0, xmw0 {
    public static final /* synthetic */ uxs0 b = new uxs0((byte) 25);
    public static final /* synthetic */ uxs0 c = new uxs0((byte) 26);
    public static final /* synthetic */ uxs0 d = new uxs0((byte) 27);
    public static final /* synthetic */ uxs0 e = new uxs0((byte) 28);
    public static final /* synthetic */ uxs0 f = new uxs0((byte) 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36458a;

    public uxs0(sxs0 sxs0Var) {
        this.f36458a = (byte) 6;
    }

    public static ar20 a(char c2) {
        if (c2 == '\"') {
            return cy2.C;
        }
        if (c2 == '\'') {
            return cy2.B;
        }
        if (c2 == '(') {
            return cy2.D;
        }
        if (c2 == ')') {
            return cy2.E;
        }
        if (c2 == '[') {
            return cy2.F;
        }
        if (c2 == ']') {
            return cy2.G;
        }
        if (c2 == '<') {
            return cy2.H;
        }
        return c2 == '>' ? cy2.I : cy2.i0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.xplatform.web.impl.di.feature.WebGameScreenFactoryImpl$getWebGameScreen$2] */
    public static WebGameScreenFactoryImpl$getWebGameScreen$2 c(uxs0 uxs0Var, final long j, csr csrVar, final boolean z, final String str, int i) {
        if ((i & 2) != 0) {
            csrVar = csr.e;
        }
        final csr csrVar2 = csrVar;
        uxs0Var.getClass();
        csrVar2.getClass();
        str.getClass();
        return new FragmentScreen() { // from class: org.xplatform.web.impl.di.feature.WebGameScreenFactoryImpl$getWebGameScreen$2
            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                htz htzVar = ca70.U1;
                String strG = str;
                if (strG.length() == 0) {
                    strG = axq.g();
                }
                htzVar.getClass();
                return htz.g(j, csrVar2, false, z, strG);
            }

            @Override // a.m7h0
            /* JADX INFO: renamed from: b */
            public final String getF46460a() {
                return ufx.C(this);
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final /* bridge */ boolean g() {
                return true;
            }
        };
    }

    public static char[] d(String str) {
        int length = str.length();
        int i = 0;
        int iCharAt = 0;
        for (int i2 = 0; i2 < length; i2 += 2) {
            iCharAt += str.charAt(i2);
        }
        char[] cArr = new char[iCharAt];
        int i3 = 0;
        while (i < str.length()) {
            int i4 = i + 1;
            int iCharAt2 = str.charAt(i);
            i += 2;
            char cCharAt = str.charAt(i4);
            do {
                cArr[i3] = cCharAt;
                iCharAt2--;
                i3++;
            } while (iCharAt2 > 0);
        }
        return cArr;
    }

    public static final xew0 e(Object obj, long j) {
        xew0 xew0Var = (xew0) pgw0.h(obj, j);
        if (((kdw0) xew0Var).f18126a) {
            return xew0Var;
        }
        int size = xew0Var.size();
        xew0 xew0VarZzg = xew0Var.zzg(size == 0 ? 10 : size + size);
        pgw0.i(obj, j, xew0VarZzg);
        return xew0VarZzg;
    }

    @Override // a.lix0
    public /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // a.quc
    public long getTime() {
        return System.currentTimeMillis();
    }

    public String toString() {
        switch (this.f36458a) {
            case 17:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza */
    public Object mo0zza() {
        switch (this.f36458a) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new Boolean(((Boolean) nhw0.f23556a.get()).booleanValue());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                List list = btw0.f3204a;
                return (String) qhw0.f28763a.get();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                List list2 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.max_conversions_per_day", 68, 10000L).get()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            default:
                List list4 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.sgtm.batch.retry_max_wait", 43, 21600000L).get();
        }
    }

    public /* synthetic */ uxs0(byte b2) {
        this.f36458a = b2;
    }
}
