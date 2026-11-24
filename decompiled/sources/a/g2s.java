package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g2s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10575a;
    public final /* synthetic */ j2s b;

    public /* synthetic */ g2s(j2s j2sVar, byte b) {
        this.f10575a = b;
        this.b = j2sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10575a;
        j2s j2sVar = this.b;
        switch (b) {
            case 0:
                d0k0 d0k0Var = (d0k0) obj;
                xak xakVar = j2s.b2;
                d0k0Var.getClass();
                j2sVar.J0().x(new q1s(d0k0Var));
                break;
            case 1:
                dja djaVar = (dja) obj;
                xak xakVar2 = j2s.b2;
                djaVar.getClass();
                j2sVar.J0().x(new g1s(djaVar));
                break;
            case 2:
                dja djaVar2 = (dja) obj;
                xak xakVar3 = j2s.b2;
                djaVar2.getClass();
                j2sVar.J0().x(new e1s(djaVar2));
                break;
            case 3:
                String str = (String) obj;
                xak xakVar4 = j2s.b2;
                str.getClass();
                j2sVar.J0().x(new s1s(str));
                break;
            default:
                String str2 = (String) obj;
                xak xakVar5 = j2s.b2;
                str2.getClass();
                j2sVar.J0().x(new m1s(str2));
                break;
        }
        return Unit.f46060a;
    }
}
