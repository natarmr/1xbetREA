package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class arh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1346a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ u3i c;

    public /* synthetic */ arh(Function1 function1, u3i u3iVar, byte b) {
        this.f1346a = b;
        this.b = function1;
        this.c = u3iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1346a;
        u3i u3iVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(u3iVar);
                break;
            case 1:
                function1.invoke(u3iVar);
                break;
            case 2:
                function1.invoke(u3iVar);
                break;
            case 3:
                function1.invoke(u3iVar);
                break;
            case 4:
                function1.invoke(u3iVar);
                break;
            default:
                function1.invoke(u3iVar);
                break;
        }
        return Unit.f46060a;
    }
}
