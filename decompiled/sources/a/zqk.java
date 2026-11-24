package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zqk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44811a;
    public final /* synthetic */ crk b;

    public /* synthetic */ zqk(crk crkVar, byte b) {
        this.f44811a = b;
        this.b = crkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44811a;
        crk crkVar = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                xak xakVar = crk.W1;
                uidVar.getClass();
                crkVar.G0().x(new uok(uidVar));
                break;
            case 1:
                ipk ipkVar = (ipk) obj;
                xak xakVar2 = crk.W1;
                ipkVar.getClass();
                crkVar.G0().x(ipkVar);
                break;
            default:
                bem bemVar = (bem) obj;
                xak xakVar3 = crk.W1;
                bemVar.getClass();
                crkVar.G0().x(new vok(bemVar));
                break;
        }
        return Unit.f46060a;
    }
}
