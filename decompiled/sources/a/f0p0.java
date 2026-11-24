package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class f0p0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8727a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ f0p0(Function1 function1, byte b) {
        this.f8727a = b;
        this.b = function1;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f8727a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(obj);
                break;
            case 1:
                function1.invoke(obj);
                break;
            case 2:
                function1.invoke(obj);
                break;
            case 3:
                function1.invoke(obj);
                break;
            case 4:
                function1.invoke(obj);
                break;
            case 5:
                function1.invoke(obj);
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    function1.invoke(lyv0.f20882a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
