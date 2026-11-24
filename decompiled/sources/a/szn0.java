package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class szn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33079a;
    public final /* synthetic */ xcz b;
    public final /* synthetic */ xcz c;

    public /* synthetic */ szn0(xcz xczVar, xcz xczVar2, byte b) {
        this.f33079a = b;
        this.b = xczVar;
        this.c = xczVar2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039 A[PHI: r3
  0x0039: PHI (r3v5 float) = (r3v4 float), (r3v7 float) binds: [B:12:0x0052, B:8:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fE;
        float fE2;
        byte b = this.f33079a;
        xcz xczVar = this.c;
        xcz xczVar2 = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        switch (b) {
            case 0:
                float f = -fFloatValue;
                fE = xczVar2.j.e(f);
                fE2 = xczVar.j.e(f);
                if (Math.abs(fE) < Math.abs(fE2)) {
                    fE = fE2;
                }
                break;
            case 1:
                float f2 = -fFloatValue;
                fE = xczVar2.j.e(f2);
                fE2 = xczVar.j.e(f2);
                if (Math.abs(fE) < Math.abs(fE2)) {
                    fE = fE2;
                }
                break;
            default:
                float f3 = -fFloatValue;
                fE = xczVar2.j.e(f3);
                xczVar.e(f3);
                break;
        }
        return Float.valueOf(-fE);
    }
}
