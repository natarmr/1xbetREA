package a;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class vc80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37175a;
    public final /* synthetic */ List b;
    public final /* synthetic */ a4x c;

    public /* synthetic */ vc80(List list, a4x a4xVar, byte b) {
        this.f37175a = b;
        this.b = list;
        this.c = a4xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37175a;
        a4x a4xVar = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return sre0.f32672a.b(a4xVar.get(iIntValue).getClass());
            default:
                int iIntValue2 = ((Number) obj).intValue();
                return sre0.f32672a.b(a4xVar.get(iIntValue2).getClass());
        }
    }
}
