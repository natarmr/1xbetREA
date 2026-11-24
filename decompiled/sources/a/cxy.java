package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class cxy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5147a;
    public final /* synthetic */ l6w b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ cxy(l6w l6wVar, Function1 function1, byte b) {
        this.f5147a = b;
        this.b = l6wVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5147a;
        Function1 function1 = this.c;
        l6w l6wVar = this.b;
        switch (b) {
            case 0:
                if (l6wVar.d) {
                    function1.invoke(new nb2(l6wVar.f19528a));
                }
                break;
            case 1:
                if (l6wVar.d) {
                    function1.invoke(new sb2(l6wVar.f19528a));
                }
                break;
            case 2:
                if (l6wVar.d) {
                    function1.invoke(new nb2(l6wVar.f19528a));
                }
                break;
            case 3:
                if (l6wVar.d) {
                    function1.invoke(new sb2(l6wVar.f19528a));
                }
                break;
            case 4:
                if (l6wVar.d) {
                    function1.invoke(new nb2(l6wVar.f19528a));
                }
                break;
            case 5:
                if (l6wVar.d) {
                    function1.invoke(new sb2(l6wVar.f19528a));
                }
                break;
            case 6:
                if (l6wVar.d) {
                    function1.invoke(new nb2(l6wVar.f19528a));
                }
                break;
            default:
                if (l6wVar.d) {
                    function1.invoke(new sb2(l6wVar.f19528a));
                }
                break;
        }
        return Unit.f46060a;
    }
}
