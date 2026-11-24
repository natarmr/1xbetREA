package a;

import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class gzn extends guy implements Function1 {
    public static final gzn A;
    public static final gzn B;
    public static final gzn Y;
    public static final gzn Z;
    public static final gzn b;
    public static final gzn c;
    public static final gzn d;
    public static final gzn e;
    public static final gzn f;
    public static final gzn f1;
    public static final gzn g;
    public static final gzn h;
    public static final gzn i;
    public static final gzn j;
    public static final gzn k;
    public static final gzn l;
    public static final gzn m;
    public static final gzn n;
    public static final gzn o;
    public static final gzn p;
    public static final gzn q;
    public static final gzn r;
    public static final gzn s;
    public static final gzn t;
    public static final gzn u;
    public static final gzn v;
    public static final gzn w;
    public static final gzn x;
    public static final gzn y;
    public static final gzn z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12187a;

    static {
        int i2 = 1;
        b = new gzn(i2, (byte) 0);
        c = new gzn(i2, (byte) 1);
        d = new gzn(i2, (byte) 2);
        e = new gzn(i2, (byte) 3);
        f = new gzn(i2, (byte) 4);
        g = new gzn(i2, (byte) 5);
        h = new gzn(i2, (byte) 6);
        i = new gzn(i2, (byte) 7);
        j = new gzn(i2, (byte) 8);
        k = new gzn(i2, (byte) 9);
        l = new gzn(i2, (byte) 10);
        m = new gzn(i2, (byte) 11);
        n = new gzn(i2, (byte) 12);
        o = new gzn(i2, (byte) 13);
        p = new gzn(i2, (byte) 14);
        q = new gzn(i2, (byte) 15);
        r = new gzn(i2, (byte) 16);
        s = new gzn(i2, (byte) 17);
        t = new gzn(i2, (byte) 18);
        u = new gzn(i2, (byte) 19);
        v = new gzn(i2, (byte) 20);
        w = new gzn(i2, (byte) 21);
        x = new gzn(i2, (byte) 22);
        y = new gzn(i2, (byte) 23);
        z = new gzn(i2, (byte) 24);
        A = new gzn(i2, (byte) 25);
        B = new gzn(i2, (byte) 26);
        Y = new gzn(i2, (byte) 27);
        Z = new gzn(i2, (byte) 28);
        f1 = new gzn(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gzn(int i2, byte b2) {
        super(i2);
        this.f12187a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f12187a) {
            case 0:
                return ro4.g0(0.0f, 0.0f, null, 7);
            case 1:
                ((Number) obj).intValue();
                return 0;
            case 2:
                long j2 = ((qkx) obj).f28908a;
                return new qkx(0L);
            case 3:
                long j3 = ((qkx) obj).f28908a;
                return new qkx(0L);
            case 4:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 5:
                long j4 = ((qkx) obj).f28908a;
                return new ikx(0L);
            case 6:
                qkx qkxVar = (qkx) obj;
                long j5 = qkxVar.f28908a;
                return qkxVar;
            case 7:
                return kzn.d;
            case 8:
                StackTraceElement stackTraceElement = (StackTraceElement) obj;
                stackTraceElement.getClass();
                String string = stackTraceElement.toString();
                string.getClass();
                return string;
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
