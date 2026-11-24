package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class dbm implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5812a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ jbm c;

    public /* synthetic */ dbm(Function2 function2, jbm jbmVar, byte b) {
        this.f5812a = b;
        this.b = function2;
        this.c = jbmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5812a;
        jbm jbmVar = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function2.invoke(jbmVar.f16244a, str);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                function2.invoke(jbmVar.f16244a, str2);
                break;
        }
        return Unit.f46060a;
    }
}
