package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dt0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6639a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ st0 c;

    public /* synthetic */ dt0(Function1 function1, st0 st0Var, byte b) {
        this.f6639a = b;
        this.b = function1;
        this.c = st0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6639a;
        st0 st0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                if (function1 != null) {
                    function1.invoke(st0Var);
                }
                break;
            case 1:
                if (function1 != null) {
                    function1.invoke(st0Var);
                }
                break;
            case 2:
                if (function1 != null) {
                    function1.invoke(st0Var);
                }
                break;
            case 3:
                if (function1 != null) {
                    function1.invoke(st0Var);
                }
                break;
            case 4:
                if (function1 != null) {
                    function1.invoke(st0Var);
                }
                break;
            case 5:
                if (function1 != null) {
                    function1.invoke(st0Var);
                }
                break;
            case 6:
                if (function1 != null) {
                    function1.invoke(st0Var);
                }
                break;
            case 7:
                if (function1 != null) {
                    function1.invoke(st0Var);
                }
                break;
            case 8:
                if (function1 != null) {
                    function1.invoke(st0Var);
                }
                break;
            case 9:
                if (function1 != null) {
                    function1.invoke(st0Var);
                }
                break;
            case 10:
                function1.invoke(new kxq0(new ck0(st0Var.f32750a)));
                break;
            case 11:
                function1.invoke(new g75(st0Var.f32750a));
                break;
            default:
                long j = st0Var.f32750a;
                mtr mtrVar = st0Var.d;
                function1.invoke(new f75(mtrVar != null ? mtrVar.b : false, j));
                break;
        }
        return Unit.f46060a;
    }
}
