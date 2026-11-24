package a;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class yqy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43096a;
    public final /* synthetic */ ary b;

    public /* synthetic */ yqy(ary aryVar, byte b) {
        this.f43096a = b;
        this.b = aryVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43096a;
        ary aryVar = this.b;
        switch (b) {
            case 0:
                return Arrays.asList(aryVar.l().c0(j4m0.l), aryVar.l().c0(j4m0.n), aryVar.l().c0(j4m0.o), aryVar.l().c0(j4m0.m));
            default:
                EnumMap enumMap = new EnumMap(iwb0.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (iwb0 iwb0Var : iwb0.values()) {
                    String strB = iwb0Var.f15481a.b();
                    if (strB == null) {
                        ary.a(47);
                        throw null;
                    }
                    kzj0 kzj0VarI = aryVar.k(strB).I();
                    if (kzj0VarI == null) {
                        ary.a(48);
                        throw null;
                    }
                    String strB2 = iwb0Var.b.b();
                    if (strB2 == null) {
                        ary.a(47);
                        throw null;
                    }
                    kzj0 kzj0VarI2 = aryVar.k(strB2).I();
                    if (kzj0VarI2 == null) {
                        ary.a(48);
                        throw null;
                    }
                    enumMap.put(iwb0Var, kzj0VarI2);
                    map.put(kzj0VarI, kzj0VarI2);
                    map2.put(kzj0VarI2, kzj0VarI);
                }
                return new zqy(enumMap, map, map2);
        }
    }
}
