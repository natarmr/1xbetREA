package a;

import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;

/* JADX INFO: loaded from: classes3.dex */
public final class so6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr f32530a;
    public final gs6 b;
    public final knf0 c;
    public final vby d;
    public final mne e;
    public final btt0 f;

    public so6(xr xrVar, gs6 gs6Var, knf0 knf0Var, vby vbyVar, mne mneVar, btt0 btt0Var) {
        gs6Var.getClass();
        knf0Var.getClass();
        vbyVar.getClass();
        btt0Var.getClass();
        this.f32530a = xrVar;
        this.b = gs6Var;
        this.c = knf0Var;
        this.d = vbyVar;
        this.e = mneVar;
        this.f = btt0Var;
    }

    public final RequestBody$Companion$toRequestBody$3 a(uco ucoVar) {
        MediaType mediaTypeA;
        int i = RequestBody.f46110a;
        vby vbyVar = this.d;
        vbyVar.getClass();
        String strD = vbyVar.d(uco.Companion.serializer(), ucoVar);
        Regex regex = MediaType.e;
        try {
            mediaTypeA = MediaType.Companion.a("application/json; charset=utf-8");
        } catch (IllegalArgumentException unused) {
            mediaTypeA = null;
        }
        return RequestBody.Companion.a(strD, mediaTypeA);
    }
}
