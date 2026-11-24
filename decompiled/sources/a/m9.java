package a;

import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class m9 extends guy implements Function1 {
    public static final m9 A;
    public static final m9 B;
    public static final m9 Y;
    public static final m9 Z;
    public static final m9 b;
    public static final m9 c;
    public static final m9 d;
    public static final m9 e;
    public static final m9 f;
    public static final m9 f1;
    public static final m9 g;
    public static final m9 h;
    public static final m9 i;
    public static final m9 j;
    public static final m9 k;
    public static final m9 l;
    public static final m9 m;
    public static final m9 n;
    public static final m9 o;
    public static final m9 p;
    public static final m9 q;
    public static final m9 r;
    public static final m9 s;
    public static final m9 t;
    public static final m9 u;
    public static final m9 v;
    public static final m9 w;
    public static final m9 x;
    public static final m9 y;
    public static final m9 z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21391a;

    static {
        int i2 = 1;
        b = new m9(i2, (byte) 0);
        c = new m9(i2, (byte) 1);
        d = new m9(i2, (byte) 2);
        e = new m9(i2, (byte) 3);
        f = new m9(i2, (byte) 4);
        g = new m9(i2, (byte) 5);
        h = new m9(i2, (byte) 6);
        i = new m9(i2, (byte) 7);
        j = new m9(i2, (byte) 8);
        k = new m9(i2, (byte) 9);
        l = new m9(i2, (byte) 10);
        m = new m9(i2, (byte) 11);
        n = new m9(i2, (byte) 12);
        o = new m9(i2, (byte) 13);
        p = new m9(i2, (byte) 14);
        q = new m9(i2, (byte) 15);
        r = new m9(i2, (byte) 16);
        s = new m9(i2, (byte) 17);
        t = new m9(i2, (byte) 18);
        u = new m9(i2, (byte) 19);
        v = new m9(i2, (byte) 20);
        w = new m9(i2, (byte) 21);
        x = new m9(i2, (byte) 22);
        y = new m9(i2, (byte) 23);
        z = new m9(i2, (byte) 24);
        A = new m9(i2, (byte) 25);
        B = new m9(i2, (byte) 26);
        Y = new m9(i2, (byte) 27);
        Z = new m9(i2, (byte) 28);
        f1 = new m9(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9(int i2, byte b2) {
        super(i2);
        this.f21391a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21391a) {
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
                return ay3.e0(kzn.d(ro4.m0(220, 90, null, 4), 0.0f, 2).a(kzn.f(ro4.m0(220, 90, null, 4), 0.92f, 4)), kzn.e(ro4.m0(90, 0, null, 6), 2));
            case 21:
            case 22:
                return obj;
            case 23:
                return null;
            case 24:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return rw2.e((ViewGroup) obj);
            default:
                return rw2.e((ViewGroup) obj);
        }
    }
}
