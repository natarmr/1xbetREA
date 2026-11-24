package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gs40 extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11811a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs40(Object obj, Object obj2, byte b) {
        super(0);
        this.f11811a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11811a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((htb) obj2).f(new js40(false, 9205357640488583168L, ((j6u0) obj).a(wpm0.g(Float.MAX_VALUE, Float.MAX_VALUE))));
                return Unit.f46060a;
            case 1:
                ((htb) obj2).f(new js40(false, 9205357640488583168L, ((j6u0) obj).a(wpm0.g(Float.MAX_VALUE, Float.MAX_VALUE))));
                return Unit.f46060a;
            default:
                ar20 ar20Var = (ar20) obj;
                ArrayList arrayList = ((qb00) obj2).f28423a;
                int[] iArr = new int[arrayList.size()];
                int i = -1;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    if (Intrinsics.d(((wvq0) arrayList.get(size)).e(), ar20Var)) {
                        i = size;
                    }
                    iArr[size] = i;
                }
                return iArr;
        }
    }
}
