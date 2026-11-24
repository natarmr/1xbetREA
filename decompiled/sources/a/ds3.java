package a;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;
import org.platform.app.ApplicationLoader;
import org.xplatform.domain.resolver.impl.di.DaggerDomainResolverComponent;
import org.xplatform.fingerprint.impl.AudioTract;
import org.xplatform.fingerprint.impl.JniProfiler;
import org.xplatform.fingerprint.impl.MathTribunal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ds3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6592a;
    public final /* synthetic */ ApplicationLoader b;

    public /* synthetic */ ds3(ApplicationLoader applicationLoader, byte b) {
        this.f6592a = b;
        this.b = applicationLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OkHttpClient okHttpClientA;
        byte b = 7;
        byte b2 = 5;
        byte b3 = 0;
        byte b4 = 6;
        switch (this.f6592a) {
            case 0:
                ApplicationLoader applicationLoader = this.b;
                ApplicationLoader applicationLoader2 = ApplicationLoader.v1;
                xyk xykVarFactory = DaggerDomainResolverComponent.factory();
                a1d a1dVar = new a1d((Object) new ds3(applicationLoader, b), (byte) 18);
                z8w0 z8w0VarA = ((v4w0) applicationLoader.o1.getValue()).a();
                ((usd) xykVarFactory).getClass();
                return new nfi(new ddk(), a1dVar, z8w0VarA);
            case 1:
                ApplicationLoader applicationLoader3 = this.b;
                ApplicationLoader applicationLoader4 = ApplicationLoader.v1;
                byte b5 = 4;
                j6a j6aVar = new j6a(new ds3(applicationLoader3, b5));
                svs0 svs0Var = new svs0((byte) 20);
                ibi ibiVar = new ibi();
                ibiVar.f14488a = mbl.b(new p8i(svs0Var, (byte) 14));
                zix zixVarA = zix.a(j6aVar);
                ibiVar.b = zixVarA;
                byte b6 = 1;
                ibiVar.c = mbl.b(new d7w0(svs0Var, ibiVar.f14488a, mbl.b(new a7w0(svs0Var, mbl.b(new t6w0(svs0Var, zixVarA, b5)), b6)), b6));
                n5d0 n5d0VarB = mbl.b(new a7w0(svs0Var, ibiVar.b, b3));
                ibiVar.d = n5d0VarB;
                byte b7 = 2;
                ibiVar.e = mbl.b(new d7w0(svs0Var, ibiVar.c, n5d0VarB, b7));
                n5d0 n5d0VarB2 = mbl.b(new p8i(svs0Var, (byte) 16));
                ibiVar.f = n5d0VarB2;
                ibiVar.g = mbl.b(new a7w0(svs0Var, n5d0VarB2, b2));
                ibiVar.h = mbl.b(new p8i(svs0Var, (byte) 15));
                ibiVar.i = mbl.b(new a7w0(svs0Var, ibiVar.b, b4));
                ibiVar.j = mbl.b(new d7w0(svs0Var, ibiVar.d, mbl.b(new a7w0(svs0Var, ibiVar.b, b7)), b3));
                ibiVar.k = mbl.b(new p8i(svs0Var, (byte) 13));
                ibiVar.l = mbl.b(new vgq(svs0Var, ibiVar.e, ibiVar.g, ibiVar.h, ibiVar.i, ibiVar.j, ibiVar.k, mbl.b(new a7w0(svs0Var, ibiVar.f, (byte) 3))));
                ibiVar.m = mbl.b(new a7w0(svs0Var, ibiVar.f, b5));
                return ibiVar;
            case 2:
                ApplicationLoader applicationLoader5 = this.b;
                ApplicationLoader applicationLoader6 = ApplicationLoader.v1;
                us00 us00Var = (us00) applicationLoader5.t1.getValue();
                us00Var.getClass();
                return new x7w0(us00Var, new kys0((byte) 20), new ln4(us00Var), new JniProfiler(), new wxs0((byte) 20), new MathTribunal(), new AudioTract());
            case 3:
                ApplicationLoader applicationLoader7 = this.b;
                ApplicationLoader applicationLoader8 = ApplicationLoader.v1;
                euc eucVar = (euc) applicationLoader7.c().K1.get();
                synchronized (eucVar) {
                    buc bucVar = new buc(eucVar, b3);
                    duc ducVar = eucVar.j;
                    if (ducVar == null) {
                        okHttpClientA = eucVar.a(CollectionsKt.q0(eucVar.c, kotlin.collections.a.c(bucVar)));
                        eucVar.j = new duc(okHttpClientA);
                    } else if (System.currentTimeMillis() - ducVar.b < 300000) {
                        okHttpClientA = ducVar.f6692a;
                    } else {
                        okHttpClientA = eucVar.a(CollectionsKt.q0(eucVar.c, kotlin.collections.a.c(bucVar)));
                        eucVar.j = new duc(okHttpClientA);
                    }
                }
                return okHttpClientA;
            case 4:
                ApplicationLoader applicationLoader9 = this.b;
                ApplicationLoader applicationLoader10 = ApplicationLoader.v1;
                return applicationLoader9.c();
            case 5:
                ApplicationLoader applicationLoader11 = this.b;
                ApplicationLoader applicationLoader12 = ApplicationLoader.v1;
                return applicationLoader11.c();
            case 6:
                ApplicationLoader applicationLoader13 = this.b;
                ApplicationLoader applicationLoader14 = ApplicationLoader.v1;
                return applicationLoader13.c();
            case 7:
                ApplicationLoader applicationLoader15 = this.b;
                ApplicationLoader applicationLoader16 = ApplicationLoader.v1;
                return applicationLoader15.c();
            case 8:
                ApplicationLoader applicationLoader17 = this.b;
                ApplicationLoader applicationLoader18 = ApplicationLoader.v1;
                us00 us00Var2 = (us00) applicationLoader17.t1.getValue();
                jvq jvqVar = (jvq) applicationLoader17.m1.getValue();
                t5w0 t5w0Var = (t5w0) applicationLoader17.n1.getValue();
                nfi nfiVar = (nfi) applicationLoader17.p1.getValue();
                v4w0 v4w0Var = (v4w0) applicationLoader17.o1.getValue();
                ibi ibiVar2 = (ibi) applicationLoader17.q1.getValue();
                x7w0 x7w0Var = (x7w0) applicationLoader17.r1.getValue();
                us00Var2.getClass();
                jvqVar.getClass();
                t5w0Var.getClass();
                nfiVar.getClass();
                v4w0Var.getClass();
                ibiVar2.getClass();
                x7w0Var.getClass();
                return new g8i(new dl50(), new kud(), new kl5(), new g9m0(), new gl5(b), new g9m0(), new lme0((byte) 29), new sek(), new uuz(), t5w0Var, nfiVar, v4w0Var, ibiVar2, x7w0Var, us00Var2, jvqVar);
            case 9:
                ApplicationLoader applicationLoader19 = this.b;
                ApplicationLoader applicationLoader20 = ApplicationLoader.v1;
                return new us00(applicationLoader19, (l4x) applicationLoader19.u1.getValue());
            case 10:
                ApplicationLoader applicationLoader21 = this.b;
                ApplicationLoader applicationLoader22 = ApplicationLoader.v1;
                return new es3(applicationLoader21);
            case 11:
                ApplicationLoader applicationLoader23 = this.b;
                ApplicationLoader applicationLoader24 = ApplicationLoader.v1;
                return new js3(applicationLoader23);
            case 12:
                ApplicationLoader applicationLoader25 = this.b;
                ApplicationLoader applicationLoader26 = ApplicationLoader.v1;
                return new jvq((us00) applicationLoader25.t1.getValue());
            case 13:
                ApplicationLoader applicationLoader27 = this.b;
                ApplicationLoader applicationLoader28 = ApplicationLoader.v1;
                return new t5w0(new kys0((byte) 19), 22, new yjh0(new ds3(applicationLoader27, b2)));
            default:
                ApplicationLoader applicationLoader29 = this.b;
                ApplicationLoader applicationLoader30 = ApplicationLoader.v1;
                n0o0 n0o0Var = applicationLoader29.n1;
                wnh0 wnh0Var = (wnh0) ((t5w0) n0o0Var.getValue()).c.get();
                mmy mmyVarA = ((t5w0) n0o0Var.getValue()).a();
                psc pscVar = new psc(new ds3(applicationLoader29, b4), b4);
                wnh0Var.getClass();
                mmyVarA.getClass();
                return new v4w0(new std(), 22, wnh0Var, mmyVarA, applicationLoader29, pscVar);
        }
    }
}
