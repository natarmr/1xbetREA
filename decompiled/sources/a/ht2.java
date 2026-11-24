package a;

import android.gov.nist.core.Separators;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ht2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f13610a = q7m0.a(iun.f15405a);
    public final n0o0 b = maz.b(new t32((byte) 18));

    public final void a(String str) {
        String str2 = ((SimpleDateFormat) this.b.getValue()).format(new Date());
        p7m0 p7m0Var = this.f13610a;
        p7m0Var.o(null, CollectionsKt.r0((Collection) p7m0Var.getValue(), str2 + Separators.RETURN + str));
    }
}
