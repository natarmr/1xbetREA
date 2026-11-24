package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class bt40 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3164a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bt40(Object obj, int i, byte b) {
        super(2);
        this.f3164a = b;
        this.b = obj;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3164a;
        int i = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                n6x.h((agk0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                n6x.h((agk0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((ArrayList) obj3).add(new sgi0(new IntRange(((Number) obj).intValue() + i, i + ((Number) obj2).intValue(), 1), cy2.z));
                break;
        }
        return Unit.f46060a;
    }
}
