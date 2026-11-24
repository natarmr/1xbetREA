package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ghd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11291a;
    public final /* synthetic */ ym6 b;

    public /* synthetic */ ghd(ym6 ym6Var, byte b) {
        this.f11291a = b;
        this.b = ym6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long separator;
        byte b = this.f11291a;
        ym6 ym6Var = this.b;
        switch (b) {
            case 0:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                return pi9Var.a(new ghd(ym6Var, (byte) 1));
            default:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                if (ym6Var.e) {
                    pz40 pz40Var = s6t0.f31722a;
                    separator = s6t0.b().f33626a.getPrimary60();
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    separator = s6t0.b().f33626a.getSeparator();
                }
                long j = separator;
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(12.0f);
                fhl.o0(fhlVar, j, 0L, 0L, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), new vtm0(fhlVar.w0(1.0f), 0.0f, 0, 0, null, 30), 230);
                return Unit.f46060a;
        }
    }
}
