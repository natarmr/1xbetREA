package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ux4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36423a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ms2 c;

    public /* synthetic */ ux4(long j, ms2 ms2Var, byte b) {
        this.f36423a = b;
        this.b = j;
        this.c = ms2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36423a;
        ms2 ms2Var = this.c;
        long j = this.b;
        n1g n1gVar = (n1g) obj;
        switch (b) {
            case 0:
                n1gVar.getClass();
                n1gVar.b(String.valueOf(j));
                n1gVar.a(ms2Var);
                n1gVar.f = l1g.BET_EVENT;
                break;
            default:
                n1gVar.getClass();
                n1gVar.b(String.valueOf(j));
                n1gVar.a(ms2Var);
                n1gVar.f = l1g.BET_EVENT;
                break;
        }
        return Unit.f46060a;
    }
}
