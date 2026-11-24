package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nk1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23660a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ eol c;

    public /* synthetic */ nk1(Function1 function1, eol eolVar, byte b) {
        this.f23660a = b;
        this.b = function1;
        this.c = eolVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23660a;
        eol eolVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new ek1(eolVar.f8144a));
                break;
            case 1:
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(!eolVar.c));
                }
                break;
            case 2:
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(!eolVar.c));
                }
                break;
            case 3:
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(!eolVar.c));
                }
                break;
            default:
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(!eolVar.c));
                }
                break;
        }
        return Unit.f46060a;
    }
}
