package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v43 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36759a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v43(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.f36759a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36759a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                return new u43((SnapshotStateList) obj4, obj3, (i53) obj2, (byte) 0);
            default:
                ((ot40) obj4).e((ou90) obj, (List) obj3, (LinkedHashMap) obj2);
                return Unit.f46060a;
        }
    }
}
