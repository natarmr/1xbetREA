package a;

import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class fvr extends guy implements Function1 {
    public static final fvr A;
    public static final fvr B;
    public static final fvr Y;
    public static final fvr Z;
    public static final fvr b;
    public static final fvr c;
    public static final fvr d;
    public static final fvr e;
    public static final fvr f;
    public static final fvr f1;
    public static final fvr g;
    public static final fvr h;
    public static final fvr i;
    public static final fvr j;
    public static final fvr k;
    public static final fvr l;
    public static final fvr m;
    public static final fvr n;
    public static final fvr o;
    public static final fvr p;
    public static final fvr q;
    public static final fvr r;
    public static final fvr s;
    public static final fvr t;
    public static final fvr u;
    public static final fvr v;
    public static final fvr w;
    public static final fvr x;
    public static final fvr y;
    public static final fvr z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10227a;

    static {
        int i2 = 1;
        b = new fvr(i2, (byte) 0);
        c = new fvr(i2, (byte) 1);
        d = new fvr(i2, (byte) 2);
        e = new fvr(i2, (byte) 3);
        f = new fvr(i2, (byte) 4);
        g = new fvr(i2, (byte) 5);
        h = new fvr(i2, (byte) 6);
        i = new fvr(i2, (byte) 7);
        j = new fvr(i2, (byte) 8);
        k = new fvr(i2, (byte) 9);
        l = new fvr(i2, (byte) 10);
        m = new fvr(i2, (byte) 11);
        n = new fvr(i2, (byte) 12);
        o = new fvr(i2, (byte) 13);
        p = new fvr(i2, (byte) 14);
        q = new fvr(i2, (byte) 15);
        r = new fvr(i2, (byte) 16);
        s = new fvr(i2, (byte) 17);
        t = new fvr(i2, (byte) 18);
        u = new fvr(i2, (byte) 19);
        v = new fvr(i2, (byte) 20);
        w = new fvr(i2, (byte) 21);
        x = new fvr(i2, (byte) 22);
        y = new fvr(i2, (byte) 23);
        z = new fvr(i2, (byte) 24);
        A = new fvr(i2, (byte) 25);
        B = new fvr(i2, (byte) 26);
        Y = new fvr(i2, (byte) 27);
        Z = new fvr(i2, (byte) 28);
        f1 = new fvr(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fvr(int i2, byte b2) {
        super(i2);
        this.f10227a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10227a) {
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
                return Unit.f46060a;
            case 22:
                fhl.u((fhl) obj, y3d.f, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
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
