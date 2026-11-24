package a;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rk50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f30632a;
    public static final /* synthetic */ rk50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    rk50 EF1;

    static {
        rk50 rk50Var = new rk50("MOBILE", 0);
        rk50 rk50Var2 = new rk50("WIFI", 1);
        rk50 rk50Var3 = new rk50("MOBILE_MMS", 2);
        rk50 rk50Var4 = new rk50("MOBILE_SUPL", 3);
        rk50 rk50Var5 = new rk50("MOBILE_DUN", 4);
        rk50 rk50Var6 = new rk50("MOBILE_HIPRI", 5);
        rk50 rk50Var7 = new rk50("WIMAX", 6);
        rk50 rk50Var8 = new rk50("BLUETOOTH", 7);
        rk50 rk50Var9 = new rk50("DUMMY", 8);
        rk50 rk50Var10 = new rk50("ETHERNET", 9);
        rk50 rk50Var11 = new rk50("MOBILE_FOTA", 10);
        rk50 rk50Var12 = new rk50("MOBILE_IMS", 11);
        rk50 rk50Var13 = new rk50("MOBILE_CBS", 12);
        rk50 rk50Var14 = new rk50("WIFI_P2P", 13);
        rk50 rk50Var15 = new rk50("MOBILE_IA", 14);
        rk50 rk50Var16 = new rk50("MOBILE_EMERGENCY", 15);
        rk50 rk50Var17 = new rk50("PROXY", 16);
        rk50 rk50Var18 = new rk50("VPN", 17);
        rk50 rk50Var19 = new rk50("NONE", 18);
        b = new rk50[]{rk50Var, rk50Var2, rk50Var3, rk50Var4, rk50Var5, rk50Var6, rk50Var7, rk50Var8, rk50Var9, rk50Var10, rk50Var11, rk50Var12, rk50Var13, rk50Var14, rk50Var15, rk50Var16, rk50Var17, rk50Var18, rk50Var19};
        SparseArray sparseArray = new SparseArray();
        f30632a = sparseArray;
        sparseArray.put(0, rk50Var);
        sparseArray.put(1, rk50Var2);
        sparseArray.put(2, rk50Var3);
        sparseArray.put(3, rk50Var4);
        sparseArray.put(4, rk50Var5);
        sparseArray.put(5, rk50Var6);
        sparseArray.put(6, rk50Var7);
        sparseArray.put(7, rk50Var8);
        sparseArray.put(8, rk50Var9);
        sparseArray.put(9, rk50Var10);
        sparseArray.put(10, rk50Var11);
        sparseArray.put(11, rk50Var12);
        sparseArray.put(12, rk50Var13);
        sparseArray.put(13, rk50Var14);
        sparseArray.put(14, rk50Var15);
        sparseArray.put(15, rk50Var16);
        sparseArray.put(16, rk50Var17);
        sparseArray.put(17, rk50Var18);
        sparseArray.put(-1, rk50Var19);
    }

    public static rk50 valueOf(String str) {
        return (rk50) Enum.valueOf(rk50.class, str);
    }

    public static rk50[] values() {
        return (rk50[]) b.clone();
    }
}
