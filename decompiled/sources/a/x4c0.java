package a;

import android.gov.nist.core.Separators;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes5.dex */
public final class x4c0 extends guy implements Function1 {
    public static final x4c0 A;
    public static final x4c0 B;
    public static final x4c0 Y;
    public static final x4c0 Z;
    public static final x4c0 b;
    public static final x4c0 c;
    public static final x4c0 d;
    public static final x4c0 e;
    public static final x4c0 f;
    public static final x4c0 f1;
    public static final x4c0 g;
    public static final x4c0 h;
    public static final x4c0 i;
    public static final x4c0 j;
    public static final x4c0 k;
    public static final x4c0 l;
    public static final x4c0 m;
    public static final x4c0 n;
    public static final x4c0 o;
    public static final x4c0 p;
    public static final x4c0 q;
    public static final x4c0 r;
    public static final x4c0 s;
    public static final x4c0 t;
    public static final x4c0 u;
    public static final x4c0 v;
    public static final x4c0 w;
    public static final x4c0 x;
    public static final x4c0 y;
    public static final x4c0 z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40258a;

    static {
        int i2 = 1;
        b = new x4c0(i2, (byte) 0);
        c = new x4c0(i2, (byte) 1);
        d = new x4c0(i2, (byte) 2);
        e = new x4c0(i2, (byte) 3);
        f = new x4c0(i2, (byte) 4);
        g = new x4c0(i2, (byte) 5);
        h = new x4c0(i2, (byte) 6);
        i = new x4c0(i2, (byte) 7);
        j = new x4c0(i2, (byte) 8);
        k = new x4c0(i2, (byte) 9);
        l = new x4c0(i2, (byte) 10);
        m = new x4c0(i2, (byte) 11);
        n = new x4c0(i2, (byte) 12);
        o = new x4c0(i2, (byte) 13);
        p = new x4c0(i2, (byte) 14);
        q = new x4c0(i2, (byte) 15);
        r = new x4c0(i2, (byte) 16);
        s = new x4c0(i2, (byte) 17);
        t = new x4c0(i2, (byte) 18);
        u = new x4c0(i2, (byte) 19);
        v = new x4c0(i2, (byte) 20);
        w = new x4c0(i2, (byte) 21);
        x = new x4c0(i2, (byte) 22);
        y = new x4c0(i2, (byte) 23);
        z = new x4c0(i2, (byte) 24);
        A = new x4c0(i2, (byte) 25);
        B = new x4c0(i2, (byte) 26);
        Y = new x4c0(i2, (byte) 27);
        Z = new x4c0(i2, (byte) 28);
        f1 = new x4c0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4c0(int i2, byte b2) {
        super(i2);
        this.f40258a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40258a) {
            case 0:
                return rw2.e((ViewGroup) obj);
            case 1:
                return rw2.e((ViewGroup) obj);
            case 2:
                return rw2.e((ViewGroup) obj);
            case 3:
                return rw2.e((ViewGroup) obj);
            case 4:
                return rw2.e((ViewGroup) obj);
            case 5:
                return rw2.e((ViewGroup) obj);
            case 6:
                return rw2.e((ViewGroup) obj);
            case 7:
                return rw2.e((ViewGroup) obj);
            case 8:
                return rw2.e((ViewGroup) obj);
            case 9:
                return rw2.e((ViewGroup) obj);
            case 10:
                return rw2.e((ViewGroup) obj);
            case 11:
                return rw2.e((ViewGroup) obj);
            case 12:
                return rw2.e((ViewGroup) obj);
            case 13:
                return rw2.e((ViewGroup) obj);
            case 14:
                return rw2.e((ViewGroup) obj);
            case 15:
                return rw2.e((ViewGroup) obj);
            case 16:
                return rw2.e((ViewGroup) obj);
            case 17:
                return rw2.e((ViewGroup) obj);
            case 18:
                return rw2.e((ViewGroup) obj);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return rw2.e((ViewGroup) obj);
            case 20:
                return rw2.e((ViewGroup) obj);
            case 21:
                return rw2.e((ViewGroup) obj);
            case 22:
                return rw2.e((ViewGroup) obj);
            case 23:
                return rw2.e((ViewGroup) obj);
            case 24:
                return rw2.e((ViewGroup) obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return rw2.e((ViewGroup) obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                return axq.n(new StringBuilder(), (String) matchResult.a().get(1), "=<HIDE>");
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                MatchResult matchResult2 = (MatchResult) obj;
                matchResult2.getClass();
                return axq.n(new StringBuilder(), (String) matchResult2.a().get(1), ":<HIDE>");
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                MatchResult matchResult3 = (MatchResult) obj;
                matchResult3.getClass();
                return axq.n(new StringBuilder(Separators.DOUBLE_QUOTE), (String) matchResult3.a().get(1), "\":\"<HIDE>\"");
            default:
                MatchResult matchResult4 = (MatchResult) obj;
                matchResult4.getClass();
                return axq.n(new StringBuilder(Separators.DOUBLE_QUOTE), (String) matchResult4.a().get(1), ":<HIDE>\"}");
        }
    }
}
