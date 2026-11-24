package a;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class mnu0 extends guy implements Function1 {
    public static final mnu0 b;
    public static final mnu0 c;
    public static final mnu0 d;
    public static final mnu0 e;
    public static final mnu0 f;
    public static final mnu0 g;
    public static final mnu0 h;
    public static final mnu0 i;
    public static final mnu0 j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22107a;

    static {
        int i2 = 1;
        b = new mnu0(i2, (byte) 0);
        c = new mnu0(i2, (byte) 1);
        d = new mnu0(i2, (byte) 2);
        e = new mnu0(i2, (byte) 3);
        f = new mnu0(i2, (byte) 4);
        g = new mnu0(i2, (byte) 5);
        h = new mnu0(i2, (byte) 6);
        i = new mnu0(i2, (byte) 7);
        j = new mnu0(i2, (byte) 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mnu0(int i2, byte b2) {
        super(i2);
        this.f22107a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22107a) {
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
                return new qkx((((long) ((int) (((qkx) obj).f28908a >> 32))) << 32) | (((long) 0) & 4294967295L));
            default:
                return new qkx((((long) ((int) (((qkx) obj).f28908a >> 32))) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
