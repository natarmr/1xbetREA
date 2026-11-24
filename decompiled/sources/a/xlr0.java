package a;

import android.hardware.SensorManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.ufc.api.weight_class_rating.UfcWeightClassRatingParams;

/* JADX INFO: loaded from: classes6.dex */
public final class xlr0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41089a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xlr0(Object obj, Object obj2, byte b) {
        this.f41089a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41089a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return ((efr0) obj3).invoke(Integer.valueOf(iIntValue), ((a4x) obj2).get(iIntValue));
            case 1:
                return ((t9r0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 2:
                return ((t9r0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 3:
                return ((g4s0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 4:
                return ((g4s0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 5:
                int iIntValue2 = ((Number) obj).intValue();
                return ((efr0) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 6:
                return ((g4s0) obj3).invoke(((i4) obj2).get(((Number) obj).intValue()));
            case 7:
                return ((g4s0) obj3).invoke(((i4) obj2).get(((Number) obj).intValue()));
            case 8:
                return ((g4s0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 9:
                int iIntValue3 = ((Number) obj).intValue();
                return ((efr0) obj3).invoke(Integer.valueOf(iIntValue3), ((List) obj2).get(iIntValue3));
            case 10:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                if (bemVar instanceof wdm) {
                    ((Function1) obj3).invoke(new cgt0((agt0) obj2));
                }
                return Unit.f46060a;
            case 11:
                String strR = tnq0.r(((UfcWeightClassRatingParams) obj3).b, ((s7p0) obj2).b);
                pz40 pz40Var = s6t0.f31722a;
                return new a8v0(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strR, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
            case 12:
                Throwable th = (Throwable) obj;
                if (th instanceof eqv0) {
                    ((og00) obj3).c.compareAndSet(-256, ((eqv0) th).f8255a);
                }
                ((ig00) obj2).cancel(false);
                return Unit.f46060a;
            default:
                ((SensorManager) ((rkt0) obj3).b).unregisterListener((o4w0) obj2);
                return Unit.f46060a;
        }
    }
}
