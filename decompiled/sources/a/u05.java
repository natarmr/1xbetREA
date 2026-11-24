package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u05 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34838a;
    public final /* synthetic */ w6k b;

    public /* synthetic */ u05(w6k w6kVar, byte b) {
        this.f34838a = b;
        this.b = w6kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iT;
        byte b = this.f34838a;
        w6k w6kVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                return new daq0(w6kVar.z(num.intValue()));
            case 1:
                num.getClass();
                zcl zclVar = qmk.f28987a;
                iT = w6kVar.T(40.0f);
                break;
            default:
                num.getClass();
                zcl zclVar2 = qmk.f28987a;
                iT = w6kVar.T(40.0f);
                break;
        }
        return Integer.valueOf(iT);
    }
}
