package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zmr implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44640a;
    public final /* synthetic */ dnr b;

    public /* synthetic */ zmr(dnr dnrVar, byte b) {
        this.f44640a = b;
        this.b = dnrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44640a;
        dnr dnrVar = this.b;
        switch (b) {
            case 0:
                f0k0 f0k0Var = (f0k0) obj;
                ddk ddkVar = dnr.c2;
                f0k0Var.getClass();
                dnrVar.I0().x(new rmr(f0k0Var));
                break;
            case 1:
                dja djaVar = (dja) obj;
                ddk ddkVar2 = dnr.c2;
                djaVar.getClass();
                dnrVar.I0().x(new qmr(djaVar));
                break;
            case 2:
                dja djaVar2 = (dja) obj;
                ddk ddkVar3 = dnr.c2;
                djaVar2.getClass();
                dnrVar.I0().x(new kmr(djaVar2));
                break;
            case 3:
                String str = (String) obj;
                ddk ddkVar4 = dnr.c2;
                str.getClass();
                dnrVar.I0().x(new smr(str));
                break;
            default:
                String str2 = (String) obj;
                ddk ddkVar5 = dnr.c2;
                str2.getClass();
                dnrVar.I0().x(new omr(str2));
                break;
        }
        return Unit.f46060a;
    }
}
