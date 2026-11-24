package a;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class oke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f25402a = Collections.unmodifiableSet(EnumSet.of(zx9.d, zx9.e, zx9.f, zx9.g));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(ay9.d, ay9.f1660a));
    public static final Set c;
    public static final Set d;

    static {
        yx9 yx9Var = yx9.e;
        yx9 yx9Var2 = yx9.d;
        yx9 yx9Var3 = yx9.f43409a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(yx9Var, yx9Var2, yx9Var3));
        c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(yx9Var2);
        enumSetCopyOf.remove(yx9Var3);
        d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0179 A[PHI: r7
  0x0179: PHI (r7v7 char) = (r7v1 char), (r7v0 char) binds: [B:122:0x01a7, B:101:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean a(j9a j9aVar, boolean z) {
        char c2;
        char c3;
        pz2 metadata = j9aVar.b.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
        key.getClass();
        metadata.getClass();
        CaptureResult captureResult = metadata.f27824a;
        Integer num = (Integer) captureResult.get(key);
        char c4 = 5;
        char c5 = 3;
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 5)) {
            c2 = 2;
        } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            c2 = 3;
        } else if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 3)) {
            c2 = 4;
        } else {
            if (num != null && l8x.f0("CXCP")) {
                Log.d("CXCP", "Unknown AF mode (" + num.intValue() + ") for " + ((Object) f7r.a(captureResult.getFrameNumber())) + '!');
            }
            c2 = 1;
        }
        boolean z2 = c2 == 2 || f25402a.contains(j9aVar.m());
        pz2 metadata2 = j9aVar.b.getMetadata();
        CaptureResult.Key key2 = CaptureResult.CONTROL_AE_MODE;
        key2.getClass();
        metadata2.getClass();
        CaptureResult captureResult2 = metadata2.f27824a;
        Integer num2 = (Integer) captureResult2.get(key2);
        if (num2 != null && num2.intValue() == 0) {
            c3 = 2;
        } else if (num2 != null && num2.intValue() == 1) {
            c3 = 3;
        } else if (num2 != null && num2.intValue() == 2) {
            c3 = 4;
        } else if (num2 != null && num2.intValue() == 3) {
            c3 = 5;
        } else if (num2 != null && num2.intValue() == 4) {
            c3 = 6;
        } else {
            if (num2 != null && l8x.f0("CXCP")) {
                Log.d("CXCP", "Unknown AE mode (" + num2.intValue() + ") for " + ((Object) f7r.a(captureResult2.getFrameNumber())) + '!');
            }
            c3 = 1;
        }
        boolean z3 = c3 == 2;
        boolean z4 = !z ? !(z3 || c.contains(j9aVar.p())) : !(z3 || d.contains(j9aVar.p()));
        pz2 metadata3 = j9aVar.b.getMetadata();
        CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
        key3.getClass();
        metadata3.getClass();
        CaptureResult captureResult3 = metadata3.f27824a;
        Integer num3 = (Integer) captureResult3.get(key3);
        if (num3 != null && num3.intValue() == 0) {
            c4 = 2;
        } else if (num3 != null && num3.intValue() == 1) {
            c4 = c5;
        } else if (num3 != null && num3.intValue() == 2) {
            c4 = 4;
        } else if (num3 == null || num3.intValue() != 3) {
            if (num3 != null && num3.intValue() == 4) {
                c4 = 6;
            } else {
                c5 = 7;
                if (num3 != null && num3.intValue() == 5) {
                    c4 = c5;
                } else {
                    c4 = '\b';
                    if (num3 == null || num3.intValue() != 6) {
                        if (num3 != null && num3.intValue() == 7) {
                            c4 = '\t';
                        } else if (num3 != null && num3.intValue() == 8) {
                            c4 = '\n';
                        } else {
                            if (num3 != null && l8x.f0("CXCP")) {
                                Log.d("CXCP", "Unknown AWB mode (" + num3.intValue() + ") for " + ((Object) f7r.a(captureResult3.getFrameNumber())) + '!');
                            }
                            c4 = 1;
                        }
                    }
                }
            }
        }
        boolean z5 = c4 == 2 || b.contains(j9aVar.o());
        l8x.U("ConvergenceUtils", "checkCaptureResult, AE=" + j9aVar.p() + " AF =" + j9aVar.m() + " AWB=" + j9aVar.o());
        return z2 && z4 && z5;
    }
}
