package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kt0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18839a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ cgk0 d;

    public /* synthetic */ kt0(vne vneVar, cgk0 cgk0Var, pz40 pz40Var) {
        this.f18839a = (byte) 0;
        this.b = vneVar;
        this.d = cgk0Var;
        this.c = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18839a;
        vne vneVar = this.b;
        switch (b) {
            case 0:
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                rwj rwjVar = tvk.f34603a;
                qjj.W(vneVar, ys10.f43147a.x(), null, new qa(a9q0Var, this.d, null, (byte) 13), 2);
                this.c.setValue(Boolean.valueOf(a9q0Var.f()));
                break;
            case 1:
                a9q0 a9q0Var2 = (a9q0) obj;
                a9q0Var2.getClass();
                rwj rwjVar2 = tvk.f34603a;
                qjj.W(vneVar, ys10.f43147a.x(), null, new vge0(a9q0Var2, this.c, this.d, null, (byte) 0), 2);
                break;
            case 2:
                a9q0 a9q0Var3 = (a9q0) obj;
                a9q0Var3.getClass();
                rwj rwjVar3 = tvk.f34603a;
                qjj.W(vneVar, ys10.f43147a.x(), null, new vge0(a9q0Var3, this.c, this.d, null, (byte) 1), 2);
                break;
            default:
                a9q0 a9q0Var4 = (a9q0) obj;
                a9q0Var4.getClass();
                rwj rwjVar4 = tvk.f34603a;
                qjj.W(vneVar, ys10.f43147a.x(), null, new vge0(a9q0Var4, this.c, this.d, null, (byte) 2), 2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ kt0(vne vneVar, pz40 pz40Var, cgk0 cgk0Var, byte b) {
        this.f18839a = b;
        this.b = vneVar;
        this.c = pz40Var;
        this.d = cgk0Var;
    }
}
