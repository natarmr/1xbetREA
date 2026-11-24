package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b4l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1964a;
    public final /* synthetic */ a5l b;

    public /* synthetic */ b4l(a5l a5lVar, int i) {
        this.f1964a = (byte) 2;
        this.b = a5lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1964a;
        a5l a5lVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k7x.b(a5lVar.b, null, o2e.e0(o7k0.c, "TEAM_IMAGE_TAG"), a8k0.F(R.drawable.dota_team_logo_placeholder, 0, fetVar), a8k0.F(R.drawable.dota_team_logo_placeholder, 0, fetVar), null, null, null, null, null, gqw0.A, null, fetVar, 37296, 6, 31712);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str = a5lVar.c;
                    n0q n0qVar = o7k0.c;
                    zcl zclVar = qmk.f28987a;
                    k7x.b(str, null, o2e.e0(lgb.J(n0qVar, vgg0.a(4.0f)), "HERO_IMAGE_TAG"), a8k0.F(R.drawable.ic_hero_indicator_placeholder, 0, fetVar2), a8k0.F(R.drawable.ic_hero_indicator_placeholder, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar2, 36912, 6, 31712);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jd8.u(a5lVar, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ b4l(a5l a5lVar, byte b) {
        this.f1964a = b;
        this.b = a5lVar;
    }
}
