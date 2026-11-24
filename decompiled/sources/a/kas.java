package a;

import java.util.function.BiFunction;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kas implements BiFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17980a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ kas(Function2 function2, byte b) {
        this.f17980a = b;
        this.b = function2;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        byte b = this.f17980a;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                return (das) ((jv1) function2).invoke(obj, obj2);
            case 1:
                return (das) ((jar) function2).invoke(obj, obj2);
            case 2:
                return (das) ((a21) function2).invoke(obj, obj2);
            default:
                return (das) ((ub4) function2).invoke(obj, obj2);
        }
    }
}
