package a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class beq extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final beq f2463a = new beq(1, eeq.class, "checkForFingerprintPreAuthenticationErrors", "checkForFingerprintPreAuthenticationErrors(Landroidx/biometric/internal/FingerprintManagerCompat;)I", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        ieq ieqVar = (ieq) obj;
        ieqVar.getClass();
        Context context = ieqVar.f14646a;
        FingerprintManager fingerprintManagerB = geq.b(context);
        if (fingerprintManagerB == null || !geq.d(fingerprintManagerB)) {
            i = 12;
        } else {
            FingerprintManager fingerprintManagerB2 = geq.b(context);
            i = (fingerprintManagerB2 == null || !geq.c(fingerprintManagerB2)) ? 11 : 0;
        }
        return Integer.valueOf(i);
    }
}
