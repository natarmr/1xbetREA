package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class idm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14592a;
    public final /* synthetic */ long b;
    public final /* synthetic */ qol c;
    public final /* synthetic */ iol d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ idm(long j, qol qolVar, iol iolVar, Function0 function0, byte b) {
        this.f14592a = b;
        switch (b) {
        }
        tol tolVar = tol.f34290a;
        this.b = j;
        this.c = qolVar;
        this.d = iolVar;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14592a) {
            case 0:
                tol tolVar = tol.f34290a;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(1642051228, new idm(this.b, this.c, this.d, this.e, (byte) 1), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            default:
                tol tolVar2 = tol.b;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fxb.i(this.b, this.c, null, tolVar2, null, this.d, this.e, fetVar2, 0, 20);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
