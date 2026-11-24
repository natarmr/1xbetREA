package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class biz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2679a;
    public final /* synthetic */ Object b;

    public /* synthetic */ biz(Object obj, byte b) {
        this.f2679a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2679a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ihz ihzVar = (ihz) obj2;
                return ihz.a(ihzVar, 0L, 0, null, null, null, null, null, null, null, null, null, null, new j0g0(obj3), false, false, ihzVar.q || !(obj3 instanceof g0g0), 57343);
            case 1:
                ihz ihzVar2 = (ihz) obj2;
                return ihz.a(ihzVar2, 0L, 0, null, null, null, null, null, null, null, null, null, new j0g0(obj3), null, false, false, ihzVar2.q || !(obj3 instanceof g0g0), 61439);
            case 2:
                ihz ihzVar3 = (ihz) obj2;
                return ihz.a(ihzVar3, 0L, 0, null, null, null, null, null, null, null, null, new j0g0(obj3), null, null, false, false, ihzVar3.q || !(obj3 instanceof g0g0), 63487);
            default:
                tcj0 tcj0Var = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var.getClass();
                return tcj0.a(tcj0Var, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, ((Boolean) obj3).booleanValue(), null, false, false, 0, -1, 2080767);
        }
    }
}
