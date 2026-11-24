package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pz00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pz00 f27823a;
    public static final pz00 b;
    public static final pz00 c;
    public static final pz00 d;
    public static final pz00 e;
    public static final pz00 f;
    public static final pz00 g;
    public static final pz00 h;
    public static final pz00 i;
    public static final pz00 j;
    public static final pz00 k;
    public static final /* synthetic */ pz00[] l;

    static {
        pz00 pz00Var = new pz00(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f27823a = pz00Var;
        pz00 pz00Var2 = new pz00("FIRST_EVENT", 1);
        b = pz00Var2;
        pz00 pz00Var3 = new pz00("SECOND_EVENT", 2);
        c = pz00Var3;
        pz00 pz00Var4 = new pz00("THIRD_EVENT", 3);
        d = pz00Var4;
        pz00 pz00Var5 = new pz00("FOURTH_EVENT", 4);
        e = pz00Var5;
        pz00 pz00Var6 = new pz00("FIFTH_EVENT", 5);
        f = pz00Var6;
        pz00 pz00Var7 = new pz00("SIXTH_EVENT", 6);
        g = pz00Var7;
        pz00 pz00Var8 = new pz00("SEVENTH_EVENT", 7);
        h = pz00Var8;
        pz00 pz00Var9 = new pz00("EIGHTH_EVENT", 8);
        i = pz00Var9;
        pz00 pz00Var10 = new pz00("NINTH_EVENT", 9);
        j = pz00Var10;
        pz00 pz00Var11 = new pz00("TENTH_EVENT", 10);
        k = pz00Var11;
        l = new pz00[]{pz00Var, pz00Var2, pz00Var3, pz00Var4, pz00Var5, pz00Var6, pz00Var7, pz00Var8, pz00Var9, pz00Var10, pz00Var11};
    }

    public static pz00 valueOf(String str) {
        return (pz00) Enum.valueOf(pz00.class, str);
    }

    public static pz00[] values() {
        return (pz00[]) l.clone();
    }
}
