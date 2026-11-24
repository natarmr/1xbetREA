package a;

import android.media.MediaCodecList;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.view.LayoutInflater;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.dto.common.id.UserId;
import java.io.File;
import java.lang.reflect.Field;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class w7f extends guy implements Function0 {
    public static final w7f A;
    public static final w7f B;
    public static final w7f Y;
    public static final w7f Z;
    public static final w7f b;
    public static final w7f c;
    public static final w7f d;
    public static final w7f e;
    public static final w7f f;
    public static final w7f f1;
    public static final w7f g;
    public static final w7f h;
    public static final w7f i;
    public static final w7f j;
    public static final w7f k;
    public static final w7f l;
    public static final w7f m;
    public static final w7f n;
    public static final w7f o;
    public static final w7f p;
    public static final w7f q;
    public static final w7f r;
    public static final w7f s;
    public static final w7f t;
    public static final w7f u;
    public static final w7f v;
    public static final w7f w;
    public static final w7f x;
    public static final w7f y;
    public static final w7f z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38670a;

    static {
        int i2 = 0;
        b = new w7f(i2, (byte) 0);
        c = new w7f(i2, (byte) 1);
        d = new w7f(i2, (byte) 2);
        e = new w7f(i2, (byte) 3);
        f = new w7f(i2, (byte) 4);
        g = new w7f(i2, (byte) 5);
        h = new w7f(i2, (byte) 6);
        i = new w7f(i2, (byte) 7);
        j = new w7f(i2, (byte) 8);
        k = new w7f(i2, (byte) 9);
        l = new w7f(i2, (byte) 10);
        m = new w7f(i2, (byte) 11);
        n = new w7f(i2, (byte) 12);
        o = new w7f(i2, (byte) 13);
        p = new w7f(i2, (byte) 14);
        q = new w7f(i2, (byte) 15);
        r = new w7f(i2, (byte) 16);
        s = new w7f(i2, (byte) 17);
        t = new w7f(i2, (byte) 18);
        u = new w7f(i2, (byte) 19);
        v = new w7f(i2, (byte) 20);
        w = new w7f(i2, (byte) 21);
        x = new w7f(i2, (byte) 22);
        y = new w7f(i2, (byte) 23);
        z = new w7f(i2, (byte) 24);
        A = new w7f(i2, (byte) 25);
        B = new w7f(i2, (byte) 26);
        Y = new w7f(i2, (byte) 27);
        Z = new w7f(i2, (byte) 28);
        f1 = new w7f(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7f(int i2, byte b2) {
        super(i2);
        this.f38670a = b2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchFieldException {
        switch (this.f38670a) {
            case 0:
                String str = Build.SUPPORTED_ABIS[0];
                str.getClass();
                return str;
            case 1:
                Runtime runtime = Runtime.getRuntime();
                runtime.getClass();
                return Integer.valueOf(runtime.availableProcessors());
            case 2:
                return null;
            case 3:
                Locale locale = Locale.getDefault();
                locale.getClass();
                String language = locale.getLanguage();
                language.getClass();
                return language;
            case 4:
                TimeZone timeZone = TimeZone.getDefault();
                timeZone.getClass();
                String displayName = timeZone.getDisplayName();
                displayName.getClass();
                return displayName;
            case 5:
                Provider[] providers = Security.getProviders();
                providers.getClass();
                ArrayList arrayList = new ArrayList(providers.length);
                for (Provider provider : providers) {
                    provider.getClass();
                    String name = provider.getName();
                    name.getClass();
                    String info = provider.getInfo();
                    if (info == null) {
                        info = "";
                    }
                    arrayList.add(new Pair(name, info));
                }
                return arrayList;
            case 6:
                return Boolean.TRUE;
            case 7:
                return new MediaCodecList(1);
            case 8:
                File rootDirectory = Environment.getRootDirectory();
                rootDirectory.getClass();
                String absolutePath = rootDirectory.getAbsolutePath();
                absolutePath.getClass();
                return new StatFs(absolutePath);
            case 9:
                Field declaredField = LayoutInflater.class.getDeclaredField("mConstructorArgs");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    return declaredField;
                }
                jf4.o("No constructor arguments field found in LayoutInflater!");
                return null;
            case 10:
                return new Regex("\\{\"key\":\"([a-zA-Z0-9._%-]+)\",\"value\":\"[^\"]*\"", nse0.IGNORE_CASE);
            case 11:
                return new Regex("(\\{\"key\":)<HIDE>(,\"value\":\"[^\"]*\")", nse0.IGNORE_CASE);
            case 12:
                return y43.d;
            case 13:
                List list = rnh0.b;
                return g8x.A(cui0.b(CommonConstant.KEY_ACCESS_TOKEN));
            case 14:
                String str2 = Build.VERSION.RELEASE;
                str2.getClass();
                return str2;
            case 15:
                String str3 = Build.FINGERPRINT;
                str3.getClass();
                return str3;
            case 16:
                String property = System.getProperty("os.version");
                property.getClass();
                return property;
            case 17:
                String str4 = Build.MANUFACTURER;
                str4.getClass();
                return str4;
            case 18:
                String str5 = Build.MODEL;
                str5.getClass();
                return str5;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return String.valueOf(Build.VERSION.SDK_INT);
            case 20:
                return new StringBuilder();
            case 21:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 22:
                fvt0 fvt0Var = tut0.c;
                if (fvt0Var == null) {
                    Intrinsics.h("authManager");
                    throw null;
                }
                uut0 uut0VarQ = fvt0Var.q();
                if (uut0VarQ == null) {
                    return kotlin.collections.a.c(new xut0(0, 0L, UserId.b, "", null));
                }
                return kotlin.collections.a.c(new xut0(uut0VarQ.h, uut0VarQ.d, uut0VarQ.f36319a, uut0VarQ.b, uut0VarQ.c));
            case 23:
                return new uxs0((byte) 5);
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return "";
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return vv00.NONE;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return kotlin.collections.a.c(new xut0(0, 0L, UserId.b, "", null));
            default:
                return Boolean.FALSE;
        }
    }
}
