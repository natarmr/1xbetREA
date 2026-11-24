package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class x0z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40095a;
    public final /* synthetic */ agk0 b;

    public /* synthetic */ x0z(agk0 agk0Var, byte b) {
        this.f40095a = b;
        this.b = agk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40095a;
        agk0 agk0Var = this.b;
        switch (b) {
            case 0:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                j6z j6zVarU = j6zVar.U();
                agk0Var.m(Float.intBitsToFloat((int) ((j6zVarU != null ? j6zVarU.I(j6zVar, 0L) : 0L) & 4294967295L)));
                break;
            default:
                j6z j6zVar2 = (j6z) obj;
                j6zVar2.getClass();
                j6z j6zVarU2 = j6zVar2.U();
                agk0Var.m(Float.intBitsToFloat((int) ((j6zVarU2 != null ? j6zVarU2.I(j6zVar2, 0L) : 0L) & 4294967295L)));
                break;
        }
        return Unit.f46060a;
    }
}
