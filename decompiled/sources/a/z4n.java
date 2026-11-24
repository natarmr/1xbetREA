package a;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class z4n extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43778a;
    public final /* synthetic */ bk30 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ LinkedHashMap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4n(bk30 bk30Var, List list, LinkedHashMap linkedHashMap, byte b) {
        super(1);
        this.f43778a = b;
        this.b = bk30Var;
        this.c = list;
        this.d = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43778a;
        LinkedHashMap linkedHashMap = this.d;
        List list = this.c;
        bk30 bk30Var = this.b;
        switch (b) {
            case 0:
                bk30Var.e((ou90) obj, list, linkedHashMap);
                break;
            case 1:
                bk30Var.e((ou90) obj, list, linkedHashMap);
                break;
            case 2:
                bk30Var.e((ou90) obj, list, linkedHashMap);
                break;
            default:
                bk30Var.e((ou90) obj, list, linkedHashMap);
                break;
        }
        return Unit.f46060a;
    }
}
