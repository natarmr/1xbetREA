package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rh3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30469a;
    public final /* synthetic */ ij3 b;

    public /* synthetic */ rh3(ij3 ij3Var, byte b) {
        this.f30469a = b;
        this.b = ij3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f30469a;
        byte b2 = 3;
        ij3 ij3Var = this.b;
        switch (b) {
            case 0:
                ij3Var.b.e(veo.class.getName(), Boolean.TRUE);
                p7m0 p7m0Var = ij3Var.j0;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, jh3.a((jh3) p7m0Var.getValue(), null, null, null, null, null, null, null, eui0.g(((jh3) p7m0Var.getValue()).j, cui0.b(veo.f37295a)), false, false, 3583)));
                return Unit.f46060a;
            case 1:
                ij3Var.M.f(new smi0(umi0.c, ij3Var.d.a().P0));
                return Unit.f46060a;
            case 2:
                p7m0 p7m0Var2 = ij3Var.f0;
                p7m0Var2.getClass();
                p7m0Var2.o(null, ng3.f23465a);
                return Unit.f46060a;
            case 3:
                jo20 jo20Var = ij3Var.m0;
                g8d g8dVar = (g8d) jo20Var.get(kh3.SPORT_DICTIONARY);
                if (g8dVar == null) {
                    itt0.a();
                    return null;
                }
                g8d g8dVar2 = (g8d) jo20Var.get(kh3.COUNTRIES_DICTIONARY);
                if (g8dVar2 == null) {
                    itt0.a();
                    return null;
                }
                g8d g8dVar3 = (g8d) jo20Var.get(kh3.USER);
                if (g8dVar3 == null) {
                    itt0.a();
                    return null;
                }
                g8d g8dVar4 = (g8d) jo20Var.get(kh3.STRINGS);
                if (g8dVar4 == null) {
                    itt0.a();
                    return null;
                }
                g8d g8dVar5 = (g8d) jo20Var.get(kh3.OTHER);
                if (g8dVar5 == null) {
                    itt0.a();
                    return null;
                }
                ij3Var.i0.add(sac.T(new c00((gmq[]) CollectionsKt.L0(q3d.j(g8dVar.c, g8dVar2.c, g8dVar3.c, g8dVar4.c, g8dVar5.c)).toArray(new gmq[0]), ij3Var, (byte) 8), d5c.S(jiu0.a(ij3Var), ij3Var.e.c), ui3.h));
                ij3Var.z(g8dVar, null);
                ij3Var.z(g8dVar2, new mc((Object) ij3Var, (Object) g8dVar3, (byte) 26));
                ij3Var.z(g8dVar4, null);
                ij3Var.z(g8dVar5, null);
                return Unit.f46060a;
            case 4:
                g8d g8dVar6 = (g8d) ij3Var.m0.get(kh3.CONFIG);
                if (g8dVar6 != null) {
                    ij3Var.z(g8dVar6, new rh3(ij3Var, (byte) 7));
                }
                return Unit.f46060a;
            case 5:
                return ij3Var.d.a();
            case 6:
                p7m0 p7m0Var3 = ij3Var.f0;
                if (p7m0Var3.getValue() instanceof mg3) {
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, lg3.f19987a);
                }
                return Unit.f46060a;
            default:
                g8d g8dVar7 = (g8d) ij3Var.m0.get(kh3.CHECK_GEO);
                if (g8dVar7 != null) {
                    ij3Var.z(g8dVar7, new rh3(ij3Var, b2));
                }
                return Unit.f46060a;
        }
    }
}
