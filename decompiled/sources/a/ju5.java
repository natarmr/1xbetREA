package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ju5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ju5 f17135a;
    public static final ju5 b;
    public static final ju5 c;
    public static final ju5 d;
    public static final ju5 e;
    public static final ju5 f;
    public static final ju5 g;
    public static final ju5 h;
    public static final ju5 i;
    public static final ju5 j;
    public static final ju5 k;
    public static final ju5 l;
    public static final ju5 m;
    public static final ju5 n;
    public static final ju5 o;
    public static final ju5 p;
    public static final ju5 q;
    public static final /* synthetic */ ju5[] r;

    static {
        ju5 ju5Var = new ju5("AZTEC", 0);
        f17135a = ju5Var;
        ju5 ju5Var2 = new ju5("CODABAR", 1);
        b = ju5Var2;
        ju5 ju5Var3 = new ju5("CODE_39", 2);
        c = ju5Var3;
        ju5 ju5Var4 = new ju5("CODE_93", 3);
        d = ju5Var4;
        ju5 ju5Var5 = new ju5("CODE_128", 4);
        e = ju5Var5;
        ju5 ju5Var6 = new ju5("DATA_MATRIX", 5);
        f = ju5Var6;
        ju5 ju5Var7 = new ju5("EAN_8", 6);
        g = ju5Var7;
        ju5 ju5Var8 = new ju5("EAN_13", 7);
        h = ju5Var8;
        ju5 ju5Var9 = new ju5("ITF", 8);
        i = ju5Var9;
        ju5 ju5Var10 = new ju5("MAXICODE", 9);
        j = ju5Var10;
        ju5 ju5Var11 = new ju5("PDF_417", 10);
        k = ju5Var11;
        ju5 ju5Var12 = new ju5(CommonConstant.RETKEY.QR_CODE, 11);
        l = ju5Var12;
        ju5 ju5Var13 = new ju5("RSS_14", 12);
        m = ju5Var13;
        ju5 ju5Var14 = new ju5("RSS_EXPANDED", 13);
        n = ju5Var14;
        ju5 ju5Var15 = new ju5("UPC_A", 14);
        o = ju5Var15;
        ju5 ju5Var16 = new ju5("UPC_E", 15);
        p = ju5Var16;
        ju5 ju5Var17 = new ju5("UPC_EAN_EXTENSION", 16);
        q = ju5Var17;
        r = new ju5[]{ju5Var, ju5Var2, ju5Var3, ju5Var4, ju5Var5, ju5Var6, ju5Var7, ju5Var8, ju5Var9, ju5Var10, ju5Var11, ju5Var12, ju5Var13, ju5Var14, ju5Var15, ju5Var16, ju5Var17};
    }

    public static ju5 valueOf(String str) {
        return (ju5) Enum.valueOf(ju5.class, str);
    }

    public static ju5[] values() {
        return (ju5[]) r.clone();
    }
}
