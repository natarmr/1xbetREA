package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class exy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8600a;
    public final /* synthetic */ l6w b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ exy(l6w l6wVar, Function1 function1, byte b) {
        this.f8600a = b;
        this.b = l6wVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8600a;
        Function1 function1 = this.c;
        l6w l6wVar = this.b;
        switch (b) {
            case 0:
                ((h2l0) obj).getClass();
                if (l6wVar.d) {
                    function1.invoke(new sb2(l6wVar.f19528a));
                }
                break;
            case 1:
                ((h2l0) obj).getClass();
                if (l6wVar.d) {
                    function1.invoke(new sb2(l6wVar.f19528a));
                }
                break;
            case 2:
                ((h2l0) obj).getClass();
                if (l6wVar.d) {
                    function1.invoke(new sb2(l6wVar.f19528a));
                }
                break;
            default:
                ((h2l0) obj).getClass();
                if (l6wVar.d) {
                    function1.invoke(new sb2(l6wVar.f19528a));
                }
                break;
        }
        return Unit.f46060a;
    }
}
