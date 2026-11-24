package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yeg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42483a;
    public final /* synthetic */ afg b;

    public /* synthetic */ yeg(afg afgVar, byte b) {
        this.f42483a = b;
        this.b = afgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42483a;
        afg afgVar = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                std stdVar = afg.S1;
                uidVar.getClass();
                afgVar.G0().x(new peg(uidVar));
                break;
            case 1:
                ueg uegVar = (ueg) obj;
                std stdVar2 = afg.S1;
                uegVar.getClass();
                afgVar.G0().x(uegVar);
                break;
            default:
                bem bemVar = (bem) obj;
                std stdVar3 = afg.S1;
                bemVar.getClass();
                afgVar.G0().x(new qeg(bemVar));
                break;
        }
        return Unit.f46060a;
    }
}
