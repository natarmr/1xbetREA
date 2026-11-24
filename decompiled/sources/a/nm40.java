package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nm40 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23756a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ d39 c;

    public /* synthetic */ nm40(vne vneVar, d39 d39Var, byte b) {
        this.f23756a = b;
        this.b = vneVar;
        this.c = d39Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f23756a;
        d39 d39Var = this.c;
        vne vneVar = this.b;
        yje yjeVar = null;
        iqq iqqVar = (iqq) obj;
        iqqVar.getClass();
        switch (b) {
            case 0:
                if (iqqVar.b()) {
                    qjj.W(vneVar, null, null, new pm40(d39Var, yjeVar, (byte) 2), 3);
                }
                break;
            case 1:
                if (iqqVar.b()) {
                    qjj.W(vneVar, null, null, new pm40(d39Var, yjeVar, (byte) 0), 3);
                }
                break;
            default:
                if (iqqVar.b()) {
                    qjj.W(vneVar, null, null, new pm40(d39Var, yjeVar, (byte) 1), 3);
                }
                break;
        }
        return Unit.f46060a;
    }
}
