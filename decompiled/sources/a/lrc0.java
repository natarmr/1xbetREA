package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xplatform.favorites.impl.di.FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getFighterFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lrc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20525a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lrc0(Object obj, Object obj2, boolean z, byte b) {
        this.f20525a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        m7h0 favoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;
        byte b = this.f20525a;
        byte b2 = 1;
        boolean z = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                qrc0 qrc0Var = (qrc0) obj3;
                ((Throwable) obj).getClass();
                sac.V(jiu0.a(qrc0Var), new ljc0((byte) 8), null, null, new ys8(obj2, (Object) qrc0Var, this.b, (yje) null, (byte) 29), 14);
                return Unit.f46060a;
            case 1:
                v7f0 v7f0Var = (v7f0) obj3;
                Function1 function1 = (Function1) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                if (z) {
                    hcz.g(hczVar, 4, null, null, phu0.g, 6);
                } else {
                    a4x a4xVar = v7f0Var.f36922a;
                    hczVar.f(a4xVar.size(), new zu90((byte) 29, new bue0(b2), a4xVar), new d1c0(a4xVar, (byte) 12), new ugd(802480018, true, new a100(a4xVar, function1, (byte) 28)));
                }
                return Unit.f46060a;
            case 2:
                ekf0 ekf0Var = (ekf0) obj3;
                ((lwk) obj).getClass();
                if (z) {
                    ekf0Var.p.add(obj2);
                }
                return new pr0(ekf0Var, obj2, (byte) 20);
            case 3:
                a4x a4xVar2 = (a4x) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(a4xVar2.size(), null, new d1c0(a4xVar2, (byte) 16), new ugd(802480018, true, new o0i(a4xVar2, (Function2) obj2, (byte) 5)));
                if (z) {
                    hcz.e(hczVar2, null, null, y0x0.f, 3);
                }
                return Unit.f46060a;
            case 4:
                List list = (List) obj2;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                float fFloatValue = ((Number) ((l7m0) obj3).getValue()).floatValue() * fIntBitsToFloat * 1.5f;
                if (z) {
                    fFloatValue = fIntBitsToFloat - fFloatValue;
                }
                float f = 1.5f * fIntBitsToFloat;
                fhl.r(fhlVar, new e900(list, null, (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(z ? fFloatValue - f : fFloatValue + f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), 0.0f, null, null, 0, 122);
                return Unit.f46060a;
            case 5:
                vh0 vh0Var = (vh0) obj3;
                sff0 sff0Var = (sff0) obj2;
                iz30 iz30Var = (iz30) obj;
                iz30Var.getClass();
                int iOrdinal = iz30Var.ordinal();
                if (iOrdinal != 32) {
                    if (iOrdinal != 33) {
                        if (iOrdinal != 61) {
                            return iOrdinal != 65 ? new sx10(iz30Var, z) : new vx10(iz30Var);
                        }
                        return new gx10(iz30.A, vh0Var);
                    }
                    StringBuilder sb = new StringBuilder(ujn.h);
                    if (StringsKt.O("/static/img/ImgDefault/MMA/UFC/Menu_Button.png", ujn.h, false) || kotlin.text.c.x("/static/img/ImgDefault/MMA/UFC/Menu_Button.png", "https://", false)) {
                        sb.setLength(0);
                        sb.append("/static/img/ImgDefault/MMA/UFC/Menu_Button.png");
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0("/static/img/ImgDefault/MMA/UFC/Menu_Button.png", '/'));
                    }
                    return new wx10(iz30Var, sb.toString());
                }
                iz30 iz30Var2 = iz30.l;
                int i = sff0Var.c.n;
                if (i != 0) {
                    bzu bzuVar = new bzu((byte) 23);
                    bzuVar.g("static");
                    bzuVar.g("img");
                    bzuVar.g("ImgDefault");
                    bzuVar.g("Esports");
                    bzuVar.g("ButtonImage");
                    bzuVar.g(i + ".png");
                    string = ((StringBuilder) bzuVar.b).toString();
                } else {
                    string = "";
                }
                return new mx10(iz30Var2, string);
            case 6:
                ren0 ren0Var = (ren0) obj3;
                nmp0 nmp0Var = (nmp0) obj2;
                long j = nmp0Var.f23784a;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                if (z) {
                    ren0Var.y.getClass();
                    favoritesScreenFactoryImpl$getGamesByTeamIdScreen$1 = new UfcScreensFactoryImpl$getFighterFragmentScreen$1(j);
                } else {
                    lk5 lk5Var = ren0Var.z;
                    String str = nmp0Var.b;
                    lk5Var.getClass();
                    favoritesScreenFactoryImpl$getGamesByTeamIdScreen$1 = new FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1(lk5Var, j, str);
                }
                k0w0Var.h(favoritesScreenFactoryImpl$getGamesByTeamIdScreen$1);
                return Unit.f46060a;
            default:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar = (c8d) k0w0Var2.b(new b1w0(new hnp((znj) obj3, this.b, k0w0Var2, (daf) obj2, (yje) null))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ lrc0(Object obj, boolean z, Object obj2, byte b) {
        this.f20525a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ lrc0(boolean z, Object obj, Object obj2, byte b) {
        this.f20525a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
