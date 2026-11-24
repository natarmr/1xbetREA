package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gi20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11325a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ms2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ j1g e;
    public final /* synthetic */ long f;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ gi20(long j, ms2 ms2Var, long j2, j1g j1gVar, long j3, byte b) {
        this.f11325a = b;
        switch (b) {
        }
        l1g l1gVar = l1g.OPEN_SCREEN;
        this.b = j;
        this.c = ms2Var;
        this.d = j2;
        this.e = j1gVar;
        this.f = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11325a;
        long j = this.f;
        j1g j1gVar = this.e;
        long j2 = this.d;
        ms2 ms2Var = this.c;
        long j3 = this.b;
        l1g l1gVar = l1g.BET_EVENT;
        n1g n1gVar = (n1g) obj;
        switch (b) {
            case 0:
                n1gVar.getClass();
                n1gVar.b(String.valueOf(j3));
                n1gVar.a(ms2Var);
                n1gVar.c = j2;
                n1gVar.f = l1gVar;
                n1gVar.d = j1gVar;
                n1gVar.b = j;
                break;
            case 1:
                n1gVar.getClass();
                n1gVar.b(String.valueOf(j3));
                n1gVar.a(ms2Var);
                n1gVar.c = j2;
                n1gVar.f = l1gVar;
                n1gVar.d = j1gVar;
                n1gVar.b = j;
                break;
            case 2:
                n1gVar.getClass();
                n1gVar.b(String.valueOf(j3));
                n1gVar.a(ms2Var);
                n1gVar.c = j2;
                n1gVar.f = l1gVar;
                n1gVar.d = j1gVar;
                n1gVar.b = j;
                break;
            default:
                n1gVar.getClass();
                n1gVar.b(String.valueOf(j3));
                n1gVar.a(ms2Var);
                n1gVar.c = j2;
                n1gVar.f = l1gVar;
                n1gVar.d = j1gVar;
                n1gVar.b = j;
                break;
        }
        return Unit.f46060a;
    }
}
