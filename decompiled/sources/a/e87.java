package a;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e87 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7359a = 1;
    public final /* synthetic */ LinkedHashMap b;

    public /* synthetic */ e87(zri zriVar, LinkedHashMap linkedHashMap) {
        this.b = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7359a) {
            case 0:
                i77 i77Var = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var.getClass();
                return i77.a(i77Var, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, this.b, -1, 2039);
            default:
                jkp jkpVar = (jkp) obj;
                jkp jkpVar2 = (jkp) obj2;
                jkpVar.getClass();
                LinkedHashMap linkedHashMap = this.b;
                Integer num = (Integer) linkedHashMap.get(jkpVar);
                int iIntValue = num != null ? num.intValue() : -1;
                jkpVar2.getClass();
                Integer num2 = (Integer) linkedHashMap.get(jkpVar2);
                return Integer.valueOf(Intrinsics.e(iIntValue, num2 != null ? num2.intValue() : -1));
        }
    }
}
