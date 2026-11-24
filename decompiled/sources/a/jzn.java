package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jzn extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17423a;
    public final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jzn(Function1 function1, byte b) {
        super(1);
        this.f17423a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17423a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                long j = ((qkx) obj).f28908a;
                return new qkx((((long) ((Number) function1.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L));
            case 1:
                return new ikx(((long) ((Number) function1.invoke(Integer.valueOf((int) (((qkx) obj).f28908a & 4294967295L)))).intValue()) & 4294967295L);
            default:
                return new ikx(((long) ((Number) function1.invoke(Integer.valueOf((int) (((qkx) obj).f28908a & 4294967295L)))).intValue()) & 4294967295L);
        }
    }
}
