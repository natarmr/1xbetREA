package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h6b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12522a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ m3b c;

    public /* synthetic */ h6b(Function1 function1, m3b m3bVar, byte b) {
        this.f12522a = b;
        this.b = function1;
        this.c = m3bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12522a;
        m3b m3bVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                wgl0 wgl0Var = (wgl0) obj;
                wgl0Var.getClass();
                if (wgl0Var instanceof vgl0) {
                    function1.invoke(new a6b(new a130(((vgl0) wgl0Var).f37387a, m3bVar.b, m3bVar.c)));
                }
                break;
            case 1:
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.getClass();
                function1.invoke(new a6b(new b130(xgl0Var, m3bVar.b, m3bVar.c)));
                break;
            case 2:
                xgl0 xgl0Var2 = (xgl0) obj;
                xgl0Var2.getClass();
                function1.invoke(new a6b(new b130(xgl0Var2, m3bVar.b, m3bVar.c)));
                break;
            case 3:
                wgl0 wgl0Var2 = (wgl0) obj;
                wgl0Var2.getClass();
                if (wgl0Var2 instanceof vgl0) {
                    function1.invoke(new a6b(new a130(((vgl0) wgl0Var2).f37387a, m3bVar.b, m3bVar.c)));
                }
                break;
            case 4:
                wgl0 wgl0Var3 = (wgl0) obj;
                wgl0Var3.getClass();
                if (wgl0Var3 instanceof vgl0) {
                    function1.invoke(new a6b(new a130(((vgl0) wgl0Var3).f37387a, m3bVar.b, m3bVar.c)));
                }
                break;
            case 5:
                xgl0 xgl0Var3 = (xgl0) obj;
                xgl0Var3.getClass();
                function1.invoke(new a6b(new b130(xgl0Var3, m3bVar.b, m3bVar.c)));
                break;
            case 6:
                wgl0 wgl0Var4 = (wgl0) obj;
                wgl0Var4.getClass();
                if (wgl0Var4 instanceof vgl0) {
                    function1.invoke(new a6b(new a130(((vgl0) wgl0Var4).f37387a, m3bVar.b, m3bVar.c)));
                }
                break;
            default:
                xgl0 xgl0Var4 = (xgl0) obj;
                xgl0Var4.getClass();
                function1.invoke(new a6b(new b130(xgl0Var4, m3bVar.b, m3bVar.c)));
                break;
        }
        return Unit.f46060a;
    }
}
