package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class up00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36038a;
    public final /* synthetic */ bq00 b;

    public /* synthetic */ up00(bq00 bq00Var, byte b) {
        this.f36038a = b;
        this.b = bq00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        cp00 cp00Var;
        byte b = this.f36038a;
        byte b2 = 2;
        bq00 bq00Var = this.b;
        switch (b) {
            case 0:
                byte b3 = 1;
                g8d g8dVar = (g8d) bq00Var.m0.get(kh3.CONFIG);
                if (g8dVar != null) {
                    bq00Var.O(g8dVar, new up00(bq00Var, b3));
                }
                return Unit.f46060a;
            case 1:
                g8d g8dVar2 = (g8d) bq00Var.m0.get(kh3.CHECK_GEO);
                if (g8dVar2 != null) {
                    bq00Var.O(g8dVar2, new up00(bq00Var, b2));
                }
                return Unit.f46060a;
            case 2:
                jo20 jo20Var = bq00Var.m0;
                g8d g8dVar3 = (g8d) jo20Var.get(kh3.SPORT_DICTIONARY);
                if (g8dVar3 == null) {
                    itt0.a();
                    return null;
                }
                g8d g8dVar4 = (g8d) jo20Var.get(kh3.COUNTRIES_DICTIONARY);
                if (g8dVar4 == null) {
                    itt0.a();
                    return null;
                }
                g8d g8dVar5 = (g8d) jo20Var.get(kh3.USER);
                if (g8dVar5 == null) {
                    itt0.a();
                    return null;
                }
                g8d g8dVar6 = (g8d) jo20Var.get(kh3.STRINGS);
                if (g8dVar6 == null) {
                    itt0.a();
                    return null;
                }
                g8d g8dVar7 = (g8d) jo20Var.get(kh3.OTHER);
                if (g8dVar7 == null) {
                    itt0.a();
                    return null;
                }
                bq00Var.l0.add(i3t0.L(bq00Var, new ewt((gmq[]) CollectionsKt.L0(q3d.j(g8dVar3.c, g8dVar4.c, g8dVar5.c, g8dVar6.c, g8dVar7.c)).toArray(new gmq[0]), bq00Var, (byte) 21), null, null, 3));
                bq00Var.O(g8dVar3, null);
                bq00Var.O(g8dVar4, new mbz(bq00Var, g8dVar5, (byte) 12));
                bq00Var.O(g8dVar6, null);
                bq00Var.O(g8dVar7, null);
                return Unit.f46060a;
            case 3:
                bq00Var.W.f(new smi0(umi0.c, bq00Var.q.a().P0));
                return Unit.f46060a;
            case 4:
                bq00Var.G(vo00.f37743a);
                return Unit.f46060a;
            case 5:
                bq00Var.G(to00.f34261a);
                return Unit.f46060a;
            default:
                bq00Var.o.e(veo.class.getName(), Boolean.TRUE);
                p7m0 p7m0Var = bq00Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    cp00Var = (cp00) value;
                    bq00Var.f.getClass();
                } while (!p7m0Var.m(value, cp00.a(cp00Var, null, null, null, null, null, eui0.h(cp00Var.j, veo.f37295a), false, false, 130559)));
                return Unit.f46060a;
        }
    }
}
