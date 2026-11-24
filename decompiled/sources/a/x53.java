package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x53 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40294a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ vpl c;

    public /* synthetic */ x53(Function2 function2, vpl vplVar, byte b) {
        this.f40294a = b;
        this.b = function2;
        this.c = vplVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40294a;
        vpl vplVar = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                if (function2 != null) {
                    function2.invoke(Long.valueOf(vplVar.f37811a), vplVar.c);
                }
                break;
            case 1:
                if (function2 != null) {
                    function2.invoke(Long.valueOf(vplVar.f37811a), vplVar.c);
                }
                break;
            case 2:
                if (function2 != null) {
                    function2.invoke(Long.valueOf(vplVar.f37811a), vplVar.c);
                }
                break;
            case 3:
                if (function2 != null) {
                    function2.invoke(Long.valueOf(vplVar.f37811a), vplVar.c);
                }
                break;
            default:
                if (function2 != null) {
                    function2.invoke(Long.valueOf(vplVar.f37811a), vplVar.c);
                }
                break;
        }
        return Unit.f46060a;
    }
}
