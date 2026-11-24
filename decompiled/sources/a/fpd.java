package a;

import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fpd extends guy implements Function1 {
    public static final fpd A;
    public static final fpd B;
    public static final fpd Y;
    public static final fpd Z;
    public static final fpd b;
    public static final fpd c;
    public static final fpd d;
    public static final fpd e;
    public static final fpd f;
    public static final fpd f1;
    public static final fpd g;
    public static final fpd h;
    public static final fpd i;
    public static final fpd j;
    public static final fpd k;
    public static final fpd l;
    public static final fpd m;
    public static final fpd n;
    public static final fpd o;
    public static final fpd p;
    public static final fpd q;
    public static final fpd r;
    public static final fpd s;
    public static final fpd t;
    public static final fpd u;
    public static final fpd v;
    public static final fpd w;
    public static final fpd x;
    public static final fpd y;
    public static final fpd z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9923a;

    static {
        int i2 = 1;
        b = new fpd(i2, (byte) 0);
        c = new fpd(i2, (byte) 1);
        d = new fpd(i2, (byte) 2);
        e = new fpd(i2, (byte) 3);
        f = new fpd(i2, (byte) 4);
        g = new fpd(i2, (byte) 5);
        h = new fpd(i2, (byte) 6);
        i = new fpd(i2, (byte) 7);
        j = new fpd(i2, (byte) 8);
        k = new fpd(i2, (byte) 9);
        l = new fpd(i2, (byte) 10);
        m = new fpd(i2, (byte) 11);
        n = new fpd(i2, (byte) 12);
        o = new fpd(i2, (byte) 13);
        p = new fpd(i2, (byte) 14);
        q = new fpd(i2, (byte) 15);
        r = new fpd(i2, (byte) 16);
        s = new fpd(i2, (byte) 17);
        t = new fpd(i2, (byte) 18);
        u = new fpd(i2, (byte) 19);
        v = new fpd(i2, (byte) 20);
        w = new fpd(i2, (byte) 21);
        x = new fpd(i2, (byte) 22);
        y = new fpd(i2, (byte) 23);
        z = new fpd(i2, (byte) 24);
        A = new fpd(i2, (byte) 25);
        B = new fpd(i2, (byte) 26);
        Y = new fpd(i2, (byte) 27);
        Z = new fpd(i2, (byte) 28);
        f1 = new fpd(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fpd(int i2, byte b2) {
        super(i2);
        this.f9923a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9923a) {
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
                List list = (List) obj;
                list.getClass();
                String str = (String) ((Pair) list.get(0)).f46059a;
                Pair pair = (Pair) list.get(1);
                String str2 = (String) pair.f46059a;
                int iIntValue = ((Number) pair.b).intValue();
                if (StringsKt.W(str) && StringsKt.W(str2)) {
                    return Integer.valueOf(iIntValue);
                }
                return null;
            case 14:
                return obj;
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
