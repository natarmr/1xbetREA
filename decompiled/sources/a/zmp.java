package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zmp implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44637a;
    public final /* synthetic */ nnp b;

    public /* synthetic */ zmp(nnp nnpVar, byte b) {
        this.f44637a = b;
        this.b = nnpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44637a;
        nnp nnpVar = this.b;
        int iIntValue = ((Integer) obj).intValue();
        switch (b) {
            case 0:
                nnpVar.G(new vmp(iIntValue));
                break;
            default:
                vmp vmpVar = new vmp(iIntValue);
                int i = nnp.a0;
                nnpVar.G(vmpVar);
                break;
        }
        return Unit.f46060a;
    }
}
