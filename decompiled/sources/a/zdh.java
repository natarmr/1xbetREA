package a;

import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class zdh extends guy implements Function1 {
    public static final zdh A;
    public static final zdh B;
    public static final zdh Y;
    public static final zdh Z;
    public static final zdh b;
    public static final zdh c;
    public static final zdh d;
    public static final zdh e;
    public static final zdh f;
    public static final zdh f1;
    public static final zdh g;
    public static final zdh h;
    public static final zdh i;
    public static final zdh j;
    public static final zdh k;
    public static final zdh l;
    public static final zdh m;
    public static final zdh n;
    public static final zdh o;
    public static final zdh p;
    public static final zdh q;
    public static final zdh r;
    public static final zdh s;
    public static final zdh t;
    public static final zdh u;
    public static final zdh v;
    public static final zdh w;
    public static final zdh x;
    public static final zdh y;
    public static final zdh z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44214a;

    static {
        int i2 = 1;
        b = new zdh(i2, (byte) 0);
        c = new zdh(i2, (byte) 1);
        d = new zdh(i2, (byte) 2);
        e = new zdh(i2, (byte) 3);
        f = new zdh(i2, (byte) 4);
        g = new zdh(i2, (byte) 5);
        h = new zdh(i2, (byte) 6);
        i = new zdh(i2, (byte) 7);
        j = new zdh(i2, (byte) 8);
        k = new zdh(i2, (byte) 9);
        l = new zdh(i2, (byte) 10);
        m = new zdh(i2, (byte) 11);
        n = new zdh(i2, (byte) 12);
        o = new zdh(i2, (byte) 13);
        p = new zdh(i2, (byte) 14);
        q = new zdh(i2, (byte) 15);
        r = new zdh(i2, (byte) 16);
        s = new zdh(i2, (byte) 17);
        t = new zdh(i2, (byte) 18);
        u = new zdh(i2, (byte) 19);
        v = new zdh(i2, (byte) 20);
        w = new zdh(i2, (byte) 21);
        x = new zdh(i2, (byte) 22);
        y = new zdh(i2, (byte) 23);
        z = new zdh(i2, (byte) 24);
        A = new zdh(i2, (byte) 25);
        B = new zdh(i2, (byte) 26);
        Y = new zdh(i2, (byte) 27);
        Z = new zdh(i2, (byte) 28);
        f1 = new zdh(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zdh(int i2, byte b2) {
        super(i2);
        this.f44214a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44214a) {
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
                return rw2.e((ViewGroup) obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return rw2.e((ViewGroup) obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                long j2 = ((ils0) obj).f14995a;
                return new q73(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            default:
                q73 q73Var = (q73) obj;
                return new ils0(osm0.e(q73Var.f28229a, q73Var.b));
        }
    }
}
