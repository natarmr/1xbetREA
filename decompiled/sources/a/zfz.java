package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zfz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44321a;
    public final /* synthetic */ cgz b;

    public /* synthetic */ zfz(cgz cgzVar, byte b) {
        this.f44321a = b;
        this.b = cgzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44321a;
        cgz cgzVar = this.b;
        switch (b) {
            case 0:
                g2v g2vVar = cgzVar.k2;
                if (g2vVar != null) {
                    return g2v.b(g2vVar, pb10.v, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                }
                Intrinsics.h("lottieEmptyConfigurator");
                throw null;
            default:
                sqt sqtVar = cgz.m2;
                j120.Y(cgzVar);
                return Unit.f46060a;
        }
    }
}
