package a;

import java.util.List;
import kotlin.Unit;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class v8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vby f36997a;
    public final wgn b;

    public v8p(gii0 gii0Var, vby vbyVar) {
        gii0Var.getClass();
        vbyVar.getClass();
        this.f36997a = vbyVar;
        this.b = new wgn(gii0Var, (byte) 9);
    }

    public final Object a(String str, long j, Boolean bool, w8p w8pVar) {
        MediaType mediaTypeA;
        qr qrVar = new qr(j, bool);
        c9p c9pVar = (c9p) this.b.invoke();
        int i = RequestBody.f46110a;
        vby vbyVar = this.f36997a;
        vbyVar.getClass();
        String strD = vbyVar.d(qr.Companion.serializer(), qrVar);
        Regex regex = MediaType.e;
        try {
            mediaTypeA = MediaType.Companion.a("application/json; charset=utf-8");
        } catch (IllegalArgumentException unused) {
            mediaTypeA = null;
        }
        Object objB = c9pVar.b(str, RequestBody.Companion.a(strD, mediaTypeA), w8pVar);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    public final Object b(String str, List list, Boolean bool, x8p x8pVar) {
        MediaType mediaTypeA;
        a5k a5kVar = new a5k(list, bool);
        c9p c9pVar = (c9p) this.b.invoke();
        int i = RequestBody.f46110a;
        vby vbyVar = this.f36997a;
        vbyVar.getClass();
        String strD = vbyVar.d(a5k.Companion.serializer(), a5kVar);
        Regex regex = MediaType.e;
        try {
            mediaTypeA = MediaType.Companion.a("application/json; charset=utf-8");
        } catch (IllegalArgumentException unused) {
            mediaTypeA = null;
        }
        Object objC = c9pVar.c(str, RequestBody.Companion.a(strD, mediaTypeA), x8pVar);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }
}
