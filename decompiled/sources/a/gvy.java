package a;

import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes2.dex */
public final class gvy extends guy implements Function1 {
    public static final gvy A;
    public static final gvy B;
    public static final gvy Y;
    public static final gvy Z;
    public static final gvy b;
    public static final gvy c;
    public static final gvy d;
    public static final gvy e;
    public static final gvy f;
    public static final gvy f1;
    public static final gvy g;
    public static final gvy h;
    public static final gvy i;
    public static final gvy j;
    public static final gvy k;
    public static final gvy l;
    public static final gvy m;
    public static final gvy n;
    public static final gvy o;
    public static final gvy p;
    public static final gvy q;
    public static final gvy r;
    public static final gvy s;
    public static final gvy t;
    public static final gvy u;
    public static final gvy v;
    public static final gvy w;
    public static final gvy x;
    public static final gvy y;
    public static final gvy z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11997a;

    static {
        int i2 = 1;
        b = new gvy(i2, (byte) 0);
        c = new gvy(i2, (byte) 1);
        d = new gvy(i2, (byte) 2);
        e = new gvy(i2, (byte) 3);
        f = new gvy(i2, (byte) 4);
        g = new gvy(i2, (byte) 5);
        h = new gvy(i2, (byte) 6);
        i = new gvy(i2, (byte) 7);
        j = new gvy(i2, (byte) 8);
        k = new gvy(i2, (byte) 9);
        l = new gvy(i2, (byte) 10);
        m = new gvy(i2, (byte) 11);
        n = new gvy(i2, (byte) 12);
        o = new gvy(i2, (byte) 13);
        p = new gvy(i2, (byte) 14);
        q = new gvy(i2, (byte) 15);
        r = new gvy(i2, (byte) 16);
        s = new gvy(i2, (byte) 17);
        t = new gvy(i2, (byte) 18);
        u = new gvy(i2, (byte) 19);
        v = new gvy(i2, (byte) 20);
        w = new gvy(i2, (byte) 21);
        x = new gvy(i2, (byte) 22);
        y = new gvy(i2, (byte) 23);
        z = new gvy(i2, (byte) 24);
        A = new gvy(i2, (byte) 25);
        B = new gvy(i2, (byte) 26);
        Y = new gvy(i2, (byte) 27);
        Z = new gvy(i2, (byte) 28);
        f1 = new gvy(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvy(int i2, byte b2) {
        super(i2);
        this.f11997a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11997a) {
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
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                String lowerCase = ((String) matchResult.a().get(1)).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return lowerCase;
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
                return String.format("%02x", Byte.valueOf(((Number) obj).byteValue()));
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
