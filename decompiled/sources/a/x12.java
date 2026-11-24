package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x12 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x12 f40099a = new x12(2, qi30.class, "min", "min(II)I", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
