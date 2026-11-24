package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ip30 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15144a;
    public final /* synthetic */ cgk0 b;

    public /* synthetic */ ip30(cgk0 cgk0Var, byte b) {
        this.f15144a = b;
        this.b = cgk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15144a;
        cgk0 cgk0Var = this.b;
        switch (b) {
            case 0:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                cgk0Var.m((int) (j6zVar.g() & 4294967295L));
                break;
            case 1:
                j6z j6zVar2 = (j6z) obj;
                j6zVar2.getClass();
                cgk0Var.m((int) (j6zVar2.g() & 4294967295L));
                break;
            case 2:
                j6z j6zVar3 = (j6z) obj;
                j6zVar3.getClass();
                cgk0Var.m((int) (j6zVar3.g() & 4294967295L));
                break;
            case 3:
                j6z j6zVar4 = (j6z) obj;
                j6zVar4.getClass();
                cgk0Var.m((int) (j6zVar4.g() & 4294967295L));
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                if (cgk0Var.l() < iIntValue) {
                    cgk0Var.m(iIntValue);
                }
                break;
        }
        return Unit.f46060a;
    }
}
