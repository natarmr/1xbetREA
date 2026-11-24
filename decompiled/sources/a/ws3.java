package a;

import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ws3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39673a;
    public final /* synthetic */ z7z b;

    public /* synthetic */ ws3(z7z z7zVar, byte b) {
        this.f39673a = b;
        this.b = z7zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OkHttpClient okHttpClientA;
        OkHttpClient okHttpClientA2;
        OkHttpClient okHttpClientB;
        byte b = this.f39673a;
        z7z z7zVar = this.b;
        switch (b) {
            case 0:
                return ((bzt) z7zVar.get()).f3488a.a();
            case 1:
                euc eucVar = (euc) z7zVar.get();
                synchronized (eucVar) {
                    duc ducVar = eucVar.i;
                    if (ducVar == null) {
                        okHttpClientA = eucVar.a(eucVar.b);
                        eucVar.i = new duc(okHttpClientA);
                    } else if (System.currentTimeMillis() - ducVar.b < 300000) {
                        okHttpClientA = ducVar.f6692a;
                    } else {
                        okHttpClientA = eucVar.a(eucVar.b);
                        eucVar.i = new duc(okHttpClientA);
                    }
                }
                return okHttpClientA;
            case 2:
                euc eucVar2 = (euc) z7zVar.get();
                synchronized (eucVar2) {
                    duc ducVar2 = eucVar2.g;
                    if (ducVar2 == null) {
                        okHttpClientA2 = eucVar2.a(eucVar2.b);
                        eucVar2.g = new duc(okHttpClientA2);
                    } else if (System.currentTimeMillis() - ducVar2.b < 300000) {
                        okHttpClientA2 = ducVar2.f6692a;
                    } else {
                        okHttpClientA2 = eucVar2.a(eucVar2.b);
                        eucVar2.g = new duc(okHttpClientA2);
                    }
                }
                return okHttpClientA2;
            case 3:
                return new xb70(((wyu) z7zVar.get()).a(), "", null, false, false, true, false, false, x870.f40450a, false, false, 0, false, new fa70(false, false, false, false, -1L, false, true, false), new f970(false, false, false, 0.0d, false, false, false), new c970(false, csr.e, b970.c), new z870(0, bm5.d, false, false, new ql5(0L, 0.0d, false, false, 0L, "", "", 0, txs0.b, "", "", false, ""), false));
            case 4:
                euc eucVar3 = (euc) z7zVar.get();
                synchronized (eucVar3) {
                    duc ducVar3 = eucVar3.k;
                    if (ducVar3 == null) {
                        okHttpClientB = eucVar3.b(eucVar3.d);
                        eucVar3.k = new duc(okHttpClientB);
                    } else if (System.currentTimeMillis() - ducVar3.b < 300000) {
                        okHttpClientB = ducVar3.f6692a;
                    } else {
                        okHttpClientB = eucVar3.b(eucVar3.d);
                        eucVar3.k = new duc(okHttpClientB);
                    }
                }
                return okHttpClientB;
            default:
                return (gii0) z7zVar.get();
        }
    }
}
