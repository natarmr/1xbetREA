package a;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class dfn {
    public static final double a(double d, bfn bfnVar, bfn bfnVar2) {
        bfnVar.getClass();
        TimeUnit timeUnit = bfnVar2.f2510a;
        TimeUnit timeUnit2 = bfnVar.f2510a;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d * jConvert : d / timeUnit2.convert(1L, timeUnit);
    }

    public static final long b(long j, bfn bfnVar, bfn bfnVar2) {
        bfnVar.getClass();
        bfnVar2.getClass();
        return bfnVar2.f2510a.convert(j, bfnVar.f2510a);
    }

    public static bfn c(TimeUnit timeUnit) {
        timeUnit.getClass();
        switch (cfn.f4270a[timeUnit.ordinal()]) {
            case 1:
                return bfn.NANOSECONDS;
            case 2:
                return bfn.MICROSECONDS;
            case 3:
                return bfn.MILLISECONDS;
            case 4:
                return bfn.SECONDS;
            case 5:
                return bfn.MINUTES;
            case 6:
                return bfn.HOURS;
            case 7:
                return bfn.DAYS;
            default:
                t9f.b();
                return null;
        }
    }
}
