package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kiw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18356a;
    public final /* synthetic */ piw b;

    public /* synthetic */ kiw(piw piwVar, byte b) {
        this.f18356a = b;
        this.b = piwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18356a;
        piw piwVar = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                sqt sqtVar = piw.Y1;
                uidVar.getClass();
                piwVar.H0().x(new chw(uidVar));
                break;
            case 1:
                bjw bjwVar = (bjw) obj;
                sqt sqtVar2 = piw.Y1;
                bjwVar.getClass();
                piwVar.X1 = bjwVar;
                break;
            case 2:
                yhw yhwVar = (yhw) obj;
                sqt sqtVar3 = piw.Y1;
                yhwVar.getClass();
                piwVar.H0().x(yhwVar);
                break;
            default:
                bem bemVar = (bem) obj;
                sqt sqtVar4 = piw.Y1;
                bemVar.getClass();
                piwVar.H0().x(new ehw(bemVar));
                break;
        }
        return Unit.f46060a;
    }
}
