package a;

import android.gov.nist.core.Separators;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class btv extends guy implements Function1 {
    public static final btv A;
    public static final btv B;
    public static final btv Y;
    public static final btv Z;
    public static final btv b;
    public static final btv c;
    public static final btv d;
    public static final btv e;
    public static final btv f;
    public static final btv f1;
    public static final btv g;
    public static final btv h;
    public static final btv i;
    public static final btv j;
    public static final btv k;
    public static final btv l;
    public static final btv m;
    public static final btv n;
    public static final btv o;
    public static final btv p;
    public static final btv q;
    public static final btv r;
    public static final btv s;
    public static final btv t;
    public static final btv u;
    public static final btv v;
    public static final btv w;
    public static final btv x;
    public static final btv y;
    public static final btv z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3202a;

    static {
        int i2 = 1;
        b = new btv(i2, (byte) 0);
        c = new btv(i2, (byte) 1);
        d = new btv(i2, (byte) 2);
        e = new btv(i2, (byte) 3);
        f = new btv(i2, (byte) 4);
        g = new btv(i2, (byte) 5);
        h = new btv(i2, (byte) 6);
        i = new btv(i2, (byte) 7);
        j = new btv(i2, (byte) 8);
        k = new btv(i2, (byte) 9);
        l = new btv(i2, (byte) 10);
        m = new btv(i2, (byte) 11);
        n = new btv(i2, (byte) 12);
        o = new btv(i2, (byte) 13);
        p = new btv(i2, (byte) 14);
        q = new btv(i2, (byte) 15);
        r = new btv(i2, (byte) 16);
        s = new btv(i2, (byte) 17);
        t = new btv(i2, (byte) 18);
        u = new btv(i2, (byte) 19);
        v = new btv(i2, (byte) 20);
        w = new btv(i2, (byte) 21);
        x = new btv(i2, (byte) 22);
        y = new btv(i2, (byte) 23);
        z = new btv(i2, (byte) 24);
        A = new btv(i2, (byte) 25);
        B = new btv(i2, (byte) 26);
        Y = new btv(i2, (byte) 27);
        Z = new btv(i2, (byte) 28);
        f1 = new btv(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ btv(int i2, byte b2) {
        super(i2);
        this.f3202a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3202a) {
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
                Pair pair = (Pair) obj;
                pair.getClass();
                StringBuilder sb = new StringBuilder(Separators.LPAREN);
                String strPattern = ((Regex) pair.f46059a).f46072a.pattern();
                strPattern.getClass();
                sb.append(strPattern);
                sb.append(')');
                return sb.toString();
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
                return rw2.e((ViewGroup) obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return rw2.e((ViewGroup) obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return rw2.e((ViewGroup) obj);
            default:
                return rw2.e((ViewGroup) obj);
        }
    }
}
