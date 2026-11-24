package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f23454a;
    public static final HashMap b;
    public static final HashMap c;
    public static final LinkedHashSet d;

    static {
        mft0[] mft0VarArrValues = mft0.values();
        ArrayList arrayList = new ArrayList(mft0VarArrValues.length);
        for (mft0 mft0Var : mft0VarArrValues) {
            arrayList.add(mft0Var.b);
        }
        f23454a = CollectionsKt.P0(arrayList);
        lft0[] lft0VarArrValues = lft0.values();
        ArrayList arrayList2 = new ArrayList(lft0VarArrValues.length);
        for (lft0 lft0Var : lft0VarArrValues) {
            arrayList2.add(lft0Var.f19974a);
        }
        CollectionsKt.P0(arrayList2);
        b = new HashMap();
        c = new HashMap();
        xp20.e(new Pair(lft0.UBYTEARRAY, g950.e("ubyteArrayOf")), new Pair(lft0.USHORTARRAY, g950.e("ushortArrayOf")), new Pair(lft0.UINTARRAY, g950.e("uintArrayOf")), new Pair(lft0.ULONGARRAY, g950.e("ulongArrayOf")));
        mft0[] mft0VarArrValues2 = mft0.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (mft0 mft0Var2 : mft0VarArrValues2) {
            linkedHashSet.add(mft0Var2.c.f());
        }
        d = linkedHashSet;
        for (mft0 mft0Var3 : mft0.values()) {
            HashMap map = b;
            qlc qlcVar = mft0Var3.c;
            qlc qlcVar2 = mft0Var3.f21711a;
            map.put(qlcVar, qlcVar2);
            c.put(qlcVar2, mft0Var3.c);
        }
    }

    public static final boolean a(wsy wsyVar) {
        foc focVarN;
        wsyVar.getClass();
        if (e0t0.m(wsyVar) || (focVarN = wsyVar.S().n()) == null) {
            return false;
        }
        vjj vjjVarJ = focVarN.j();
        return (vjjVarJ instanceof mg80) && Intrinsics.d(((ng80) ((mg80) vjjVarJ)).f, j4m0.l) && f23454a.contains(focVarN.getName());
    }
}
