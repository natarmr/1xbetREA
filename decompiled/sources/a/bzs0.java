package a;

import a.iiy;
import a.kge;
import a.m1r;
import a.u3v0;
import a.ufx;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.List;
import java.util.Objects;
import org.xplatform.web_rules.impl.presentation.navigation.Screens$WebRulesScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class bzs0 implements zp2, quc, lix0, xmw0 {
    public static bzs0 b;
    public static final /* synthetic */ bzs0 c = new bzs0((byte) 25);
    public static final /* synthetic */ bzs0 d = new bzs0((byte) 26);
    public static final /* synthetic */ bzs0 e = new bzs0((byte) 27);
    public static final /* synthetic */ bzs0 f = new bzs0((byte) 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3487a;

    public bzs0() {
        this.f3487a = (byte) 15;
        sto.a();
    }

    public static svv0 a(bwv0 bwv0Var, zvv0 zvv0Var, uvv0 uvv0Var, boolean z) {
        int iC = c(zvv0Var, bwv0Var.f3347a);
        int i = uvv0Var.c - uvv0Var.e;
        int i2 = i - iC;
        int iF = f(i2, z, uvv0Var);
        return iF >= 3 ? new ovv0(tvv0.f) : new qvv0(i2, i, iC, iF);
    }

    public static int c(zvv0 zvv0Var, mcz mczVar) {
        return (zvv0Var.d.f24069a - (zvv0Var.e.f24069a == 0 ? zvv0Var.f : 0)) - (-mczVar.m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.xplatform.web_rules.impl.presentation.navigation.Screens$WebRulesScreen] */
    public static Screens$WebRulesScreen d(int i, String str) {
        str.getClass();
        final kge kgeVar = new kge((byte) 0, i, str);
        return new FragmentScreen(kgeVar) { // from class: org.xplatform.web_rules.impl.presentation.navigation.Screens$WebRulesScreen

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final kge f47320a;

            {
                this.f47320a = kgeVar;
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                u3v0.P1.getClass();
                u3v0 u3v0Var = new u3v0();
                kge kgeVar2 = this.f47320a;
                int i2 = kgeVar2.f18234a;
                iiy[] iiyVarArr = u3v0.Q1;
                u3v0Var.N1.I(u3v0Var, iiyVarArr[1], i2);
                String str2 = kgeVar2.b;
                u3v0Var.O1.x(u3v0Var, iiyVarArr[2], str2);
                return u3v0Var;
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

    public static boolean e(bwv0 bwv0Var, zvv0 zvv0Var) {
        zvv0Var.getClass();
        return Math.abs(((int) (bwv0Var.f3347a.h() & 4294967295L)) - zvv0Var.d.f24069a) <= 1;
    }

    public static int f(int i, boolean z, uvv0 uvv0Var) {
        if (i == 0 || uvv0Var.g != 0) {
            return 0;
        }
        int i2 = uvv0Var.f;
        return !z ? i2 : i2 + 1;
    }

    public static final CharSequence g(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // a.lix0
    public /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // a.quc
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // a.zp2
    public void i(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza */
    public Object mo0zza() {
        switch (this.f3487a) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                List list = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.app_uninstalled_additional_ad_id_cache_time", 1, 3600000L).get();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                List list2 = btw0.f3204a;
                return (String) qhw0.c.get();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            default:
                List list4 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.sgtm.upload.batches_retrieval_limit", 46, 5L).get()).longValue());
        }
    }

    public /* synthetic */ bzs0(byte b2) {
        this.f3487a = b2;
    }

    public bzs0(Context context) {
        this.f3487a = (byte) 14;
    }
}
