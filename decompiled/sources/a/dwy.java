package a;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class dwy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6821a;
    public final /* synthetic */ pua b;
    public final /* synthetic */ List c;

    public /* synthetic */ dwy(pua puaVar, List list, byte b) {
        this.f6821a = b;
        this.b = puaVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6821a;
        List list = this.c;
        pua puaVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return puaVar.invoke(Integer.valueOf(iIntValue), list.get(iIntValue));
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                return puaVar.invoke(Integer.valueOf(iIntValue2), list.get(iIntValue2));
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                return puaVar.invoke(Integer.valueOf(iIntValue3), list.get(iIntValue3));
            case 3:
                int iIntValue4 = ((Number) obj).intValue();
                return puaVar.invoke(Integer.valueOf(iIntValue4), list.get(iIntValue4));
            default:
                int iIntValue5 = ((Number) obj).intValue();
                return puaVar.invoke(Integer.valueOf(iIntValue5), list.get(iIntValue5));
        }
    }
}
