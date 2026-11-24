package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12250a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ long f;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ h0s(long j, long j2, l0s l0sVar, j1g j1gVar, long j3, byte b) {
        this.f12250a = b;
        switch (b) {
        }
        l1g l1gVar = l1g.OPEN_SCREEN;
        this.b = j;
        this.c = j2;
        this.d = l0sVar;
        this.e = j1gVar;
        this.f = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12250a;
        Object obj2 = this.e;
        long j = this.f;
        long j2 = this.c;
        long j3 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                l1g l1gVar = l1g.ADD_TO_COUPON;
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.b(String.valueOf(j3));
                n1gVar.c = j2;
                n1gVar.e = ((l0s) obj3).z;
                n1gVar.d = (j1g) obj2;
                n1gVar.f = l1gVar;
                n1gVar.b = j;
                break;
            case 1:
                l1g l1gVar2 = l1g.ADD_TO_COUPON;
                n1g n1gVar2 = (n1g) obj;
                n1gVar2.getClass();
                n1gVar2.b(String.valueOf(j3));
                n1gVar2.c = j2;
                n1gVar2.e = ((l0s) obj3).z;
                n1gVar2.d = (j1g) obj2;
                n1gVar2.f = l1gVar2;
                n1gVar2.b = j;
                break;
            default:
                String str = (String) obj2;
                n1g n1gVar3 = (n1g) obj;
                n1gVar3.getClass();
                n1gVar3.a((ms2) obj3);
                n1gVar3.d = j1g.REAL;
                n1gVar3.f = l1g.ADD_TO_COUPON;
                if (j3 != 40) {
                    j2 = j3;
                }
                n1gVar3.c = j2;
                n1gVar3.b = j;
                n1gVar3.b(str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ h0s(long j, long j2, long j3, ms2 ms2Var, String str) {
        this.f12250a = (byte) 2;
        this.d = ms2Var;
        this.b = j;
        this.c = j2;
        this.f = j3;
        this.e = str;
    }
}
