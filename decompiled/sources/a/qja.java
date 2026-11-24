package a;

import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class qja extends guy implements Function1 {
    public static final qja A;
    public static final qja B;
    public static final qja Y;
    public static final qja Z;
    public static final qja b;
    public static final qja c;
    public static final qja d;
    public static final qja e;
    public static final qja f;
    public static final qja f1;
    public static final qja g;
    public static final qja h;
    public static final qja i;
    public static final qja j;
    public static final qja k;
    public static final qja l;
    public static final qja m;
    public static final qja n;
    public static final qja o;
    public static final qja p;
    public static final qja q;
    public static final qja r;
    public static final qja s;
    public static final qja t;
    public static final qja u;
    public static final qja v;
    public static final qja w;
    public static final qja x;
    public static final qja y;
    public static final qja z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28828a;

    static {
        int i2 = 1;
        b = new qja(i2, (byte) 0);
        c = new qja(i2, (byte) 1);
        d = new qja(i2, (byte) 2);
        e = new qja(i2, (byte) 3);
        f = new qja(i2, (byte) 4);
        g = new qja(i2, (byte) 5);
        h = new qja(i2, (byte) 6);
        i = new qja(i2, (byte) 7);
        j = new qja(i2, (byte) 8);
        k = new qja(i2, (byte) 9);
        l = new qja(i2, (byte) 10);
        m = new qja(i2, (byte) 11);
        n = new qja(i2, (byte) 12);
        o = new qja(i2, (byte) 13);
        p = new qja(i2, (byte) 14);
        q = new qja(i2, (byte) 15);
        r = new qja(i2, (byte) 16);
        s = new qja(i2, (byte) 17);
        t = new qja(i2, (byte) 18);
        u = new qja(i2, (byte) 19);
        v = new qja(i2, (byte) 20);
        w = new qja(i2, (byte) 21);
        x = new qja(i2, (byte) 22);
        y = new qja(i2, (byte) 23);
        z = new qja(i2, (byte) 24);
        A = new qja(i2, (byte) 25);
        B = new qja(i2, (byte) 26);
        Y = new qja(i2, (byte) 27);
        Z = new qja(i2, (byte) 28);
        f1 = new qja(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qja(int i2, byte b2) {
        super(i2);
        this.f28828a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28828a) {
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
                long jB = y3d.b(((y3d) obj).f41946a, a5d.x);
                return new s73(y3d.d(jB), y3d.h(jB), y3d.g(jB), y3d.e(jB));
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
