package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class r53 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29865a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r53(ArrayList arrayList, byte b) {
        super(1);
        this.f29865a = b;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29865a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                ou90 ou90Var = (ou90) obj;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ou90Var.g((pu90) arrayList.get(i), 0, 0, 0.0f);
                }
                return Unit.f46060a;
            default:
                List list = (List) obj;
                list.getClass();
                return CollectionsKt.y0(arrayList, new IntRange(((Number) list.get(0)).intValue() + 1, ((Number) list.get(1)).intValue() - 1, 1));
        }
    }
}
