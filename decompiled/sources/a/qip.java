package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qip implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28802a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ qip(long j, boolean z, long j2) {
        this.c = j;
        this.b = z;
        this.d = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28802a;
        boolean z = this.b;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.u(fhlVar, this.c, 0L, 0L, 0.0f, null, null, 0, 126);
                if (z) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - (fhlVar.w0(1.0f) / 2.0f);
                    fhl.Q(fhlVar, this.d, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)))) << 32), fhlVar.w0(1.0f), 0, null, 496);
                }
                break;
            default:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                long j = this.c;
                long j2 = this.d;
                List listJ = z ? q3d.j(new y3d(j), new y3d(j2)) : q3d.j(new y3d(j2), new y3d(j));
                iiy[] iiyVarArr = cbi0.f4063a;
                listJ.getClass();
                zai0 zai0Var = cbi0.e;
                iiy iiyVar = cbi0.f4063a[3];
                zai0Var.getClass();
                abi0Var.b(zai0Var, listJ);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qip(boolean z, long j, long j2) {
        this.b = z;
        this.c = j;
        this.d = j2;
    }
}
