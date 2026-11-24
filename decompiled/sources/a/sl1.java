package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoSettingsScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sl1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32376a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sl1(cyu cyuVar, long j, zuc0 zuc0Var, boolean z) {
        this.f32376a = (byte) 14;
        this.b = j;
        this.d = zuc0Var;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fIntBitsToFloat;
        byte b = this.f32376a;
        byte b2 = 2;
        boolean z = this.c;
        long j = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.e(jdk0.f(this.b, "", 0L, this.c, 0L, false, false, 0, false, true, false, (String) obj2, true));
                return Unit.f46060a;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                m92 m92Var = new m92((byte) 0, this.b, null, (n92) obj2, this.c);
                k0w0Var2.getClass();
                c8d c8dVar = (c8d) k0w0Var2.b(new b1w0(m92Var)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 2:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                c8d c8dVar2 = (c8d) k0w0Var3.b(new b1w0(new dk2((byte) 2, this.b, null, (qi2) obj2, this.c))).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case 3:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                c8d c8dVar3 = (c8d) k0w0Var4.b(new b1w0(new dk2((byte) 0, this.b, null, (fk2) obj2, this.c))).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                return Unit.f46060a;
            case 4:
                pi9 pi9Var = (pi9) obj;
                return pi9Var.b(new t13(obj2, this.c, (Object) eeq.Q(pi9Var, Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) / 2.0f), (Object) new m78(j, 5), (byte) 0));
            case 5:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                c8d c8dVar4 = (c8d) k0w0Var5.b(new b1w0(new m92((byte) 1, this.b, null, (vqg) obj2, this.c))).f14945a;
                bjk bjkVar4 = cfx0.o;
                c8dVar4.f3908a = new v7d(true, bjkVar4, bjkVar4);
                return Unit.f46060a;
            case 6:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.c = ((gbd0) obj2).c;
                n1gVar.e = new jq2(j);
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = z ? k1g.OPEN_FROM_PUSH : k1g.OPEN_FROM_BANNER;
                n1gVar.b = j;
                return Unit.f46060a;
            case 7:
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                g7zVar.a();
                a6a a6aVar = g7zVar.f10839a;
                for (jwo jwoVar : tx3.l0((jwo[]) obj2)) {
                    iwo iwoVarL = vcc.L(a6aVar.d(), jwoVar);
                    float fW0 = z ? g7zVar.w0(48.0f) : 0.0f;
                    int iOrdinal = jwoVar.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        fIntBitsToFloat = Float.intBitsToFloat((int) (a6aVar.d() >> 32));
                    } else {
                        if (iOrdinal != 2 && iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        fIntBitsToFloat = Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L));
                    }
                    fhl.r(g7zVar, yk5.k(new Pair[]{new Pair(Float.valueOf(0.0f), new y3d(j)), new Pair(Float.valueOf(fW0 / fIntBitsToFloat), new y3d(y3d.f))}, iwoVarL.f15500a, iwoVarL.b, 8), 0L, a6aVar.d(), 0.0f, null, null, 0, 122);
                }
                return Unit.f46060a;
            case 8:
                final spr sprVar = (spr) obj2;
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                final byte b3 = 0;
                final long j2 = this.b;
                final boolean z2 = this.c;
                c8d c8dVar5 = (c8d) k0w0Var6.b(new a1w0(new Function0() { // from class: a.dor
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        diu0 diu0Var = sprVar;
                        switch (b4) {
                            case 0:
                                spr sprVar2 = (spr) diu0Var;
                                bvc bvcVarA = jiu0.a(sprVar2);
                                vs10 vs10Var = sprVar2.q.c;
                                sac.V(bvcVarA, new pop(1, sprVar2, spr.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, vs10Var, new bk5((byte) 2, j2, null, sprVar2, z2), 10);
                                break;
                            case 1:
                                k4s k4sVar = (k4s) diu0Var;
                                bvc bvcVarA2 = jiu0.a(k4sVar);
                                vs10 vs10Var2 = k4sVar.p.c;
                                sac.V(bvcVarA2, new h2s(1, k4sVar, k4s.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, vs10Var2, new bk5((byte) 3, j2, null, k4sVar, z2), 10);
                                break;
                            case 2:
                                g9s g9sVar = (g9s) diu0Var;
                                bvc bvcVarA3 = jiu0.a(g9sVar);
                                vs10 vs10Var3 = g9sVar.q.c;
                                sac.V(bvcVarA3, new h2s(1, g9sVar, g9s.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, vs10Var3, new bk5((byte) 4, j2, null, g9sVar, z2), 10);
                                break;
                            case 3:
                                yks yksVar = (yks) diu0Var;
                                bvc bvcVarA4 = jiu0.a(yksVar);
                                vs10 vs10Var4 = yksVar.q.c;
                                sac.V(bvcVarA4, new h2s(1, yksVar, yks.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, vs10Var4, new bk5((byte) 5, j2, null, yksVar, z2), 10);
                                break;
                            default:
                                ncl0 ncl0Var = (ncl0) diu0Var;
                                bvc bvcVarA5 = jiu0.a(ncl0Var);
                                dvj dvjVar = ncl0Var.o.b;
                                sac.V(bvcVarA5, new kcl0(1, ncl0Var, ncl0.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, dvjVar, new bk5((byte) 7, j2, null, ncl0Var, z2), 10);
                                break;
                        }
                        return Unit.f46060a;
                    }
                })).f14945a;
                bjk bjkVar5 = cfx0.o;
                c8dVar5.f3908a = new v7d(true, bjkVar5, bjkVar5);
                return Unit.f46060a;
            case 9:
                final k4s k4sVar = (k4s) obj2;
                k0w0 k0w0Var7 = (k0w0) obj;
                k0w0Var7.getClass();
                final byte b4 = 1;
                final long j3 = this.b;
                final boolean z3 = this.c;
                c8d c8dVar6 = (c8d) k0w0Var7.b(new a1w0(new Function0() { // from class: a.dor
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b5 = b4;
                        diu0 diu0Var = k4sVar;
                        switch (b5) {
                            case 0:
                                spr sprVar2 = (spr) diu0Var;
                                bvc bvcVarA = jiu0.a(sprVar2);
                                vs10 vs10Var = sprVar2.q.c;
                                sac.V(bvcVarA, new pop(1, sprVar2, spr.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, vs10Var, new bk5((byte) 2, j3, null, sprVar2, z3), 10);
                                break;
                            case 1:
                                k4s k4sVar2 = (k4s) diu0Var;
                                bvc bvcVarA2 = jiu0.a(k4sVar2);
                                vs10 vs10Var2 = k4sVar2.p.c;
                                sac.V(bvcVarA2, new h2s(1, k4sVar2, k4s.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, vs10Var2, new bk5((byte) 3, j3, null, k4sVar2, z3), 10);
                                break;
                            case 2:
                                g9s g9sVar = (g9s) diu0Var;
                                bvc bvcVarA3 = jiu0.a(g9sVar);
                                vs10 vs10Var3 = g9sVar.q.c;
                                sac.V(bvcVarA3, new h2s(1, g9sVar, g9s.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, vs10Var3, new bk5((byte) 4, j3, null, g9sVar, z3), 10);
                                break;
                            case 3:
                                yks yksVar = (yks) diu0Var;
                                bvc bvcVarA4 = jiu0.a(yksVar);
                                vs10 vs10Var4 = yksVar.q.c;
                                sac.V(bvcVarA4, new h2s(1, yksVar, yks.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, vs10Var4, new bk5((byte) 5, j3, null, yksVar, z3), 10);
                                break;
                            default:
                                ncl0 ncl0Var = (ncl0) diu0Var;
                                bvc bvcVarA5 = jiu0.a(ncl0Var);
                                dvj dvjVar = ncl0Var.o.b;
                                sac.V(bvcVarA5, new kcl0(1, ncl0Var, ncl0.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, dvjVar, new bk5((byte) 7, j3, null, ncl0Var, z3), 10);
                                break;
                        }
                        return Unit.f46060a;
                    }
                })).f14945a;
                bjk bjkVar6 = cfx0.o;
                c8dVar6.f3908a = new v7d(true, bjkVar6, bjkVar6);
                return Unit.f46060a;
            case 10:
                final g9s g9sVar = (g9s) obj2;
                k0w0 k0w0Var8 = (k0w0) obj;
                k0w0Var8.getClass();
                final byte b5 = 2;
                final long j4 = this.b;
                final boolean z4 = this.c;
                c8d c8dVar7 = (c8d) k0w0Var8.b(new a1w0(new Function0() { // from class: a.dor
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b6 = b5;
                        diu0 diu0Var = g9sVar;
                        switch (b6) {
                            case 0:
                                spr sprVar2 = (spr) diu0Var;
                                bvc bvcVarA = jiu0.a(sprVar2);
                                vs10 vs10Var = sprVar2.q.c;
                                sac.V(bvcVarA, new pop(1, sprVar2, spr.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, vs10Var, new bk5((byte) 2, j4, null, sprVar2, z4), 10);
                                break;
                            case 1:
                                k4s k4sVar2 = (k4s) diu0Var;
                                bvc bvcVarA2 = jiu0.a(k4sVar2);
                                vs10 vs10Var2 = k4sVar2.p.c;
                                sac.V(bvcVarA2, new h2s(1, k4sVar2, k4s.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, vs10Var2, new bk5((byte) 3, j4, null, k4sVar2, z4), 10);
                                break;
                            case 2:
                                g9s g9sVar2 = (g9s) diu0Var;
                                bvc bvcVarA3 = jiu0.a(g9sVar2);
                                vs10 vs10Var3 = g9sVar2.q.c;
                                sac.V(bvcVarA3, new h2s(1, g9sVar2, g9s.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, vs10Var3, new bk5((byte) 4, j4, null, g9sVar2, z4), 10);
                                break;
                            case 3:
                                yks yksVar = (yks) diu0Var;
                                bvc bvcVarA4 = jiu0.a(yksVar);
                                vs10 vs10Var4 = yksVar.q.c;
                                sac.V(bvcVarA4, new h2s(1, yksVar, yks.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, vs10Var4, new bk5((byte) 5, j4, null, yksVar, z4), 10);
                                break;
                            default:
                                ncl0 ncl0Var = (ncl0) diu0Var;
                                bvc bvcVarA5 = jiu0.a(ncl0Var);
                                dvj dvjVar = ncl0Var.o.b;
                                sac.V(bvcVarA5, new kcl0(1, ncl0Var, ncl0.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, dvjVar, new bk5((byte) 7, j4, null, ncl0Var, z4), 10);
                                break;
                        }
                        return Unit.f46060a;
                    }
                })).f14945a;
                bjk bjkVar7 = cfx0.o;
                c8dVar7.f3908a = new v7d(true, bjkVar7, bjkVar7);
                return Unit.f46060a;
            case 11:
                final yks yksVar = (yks) obj2;
                k0w0 k0w0Var9 = (k0w0) obj;
                k0w0Var9.getClass();
                final byte b6 = 3;
                final long j5 = this.b;
                final boolean z5 = this.c;
                c8d c8dVar8 = (c8d) k0w0Var9.b(new a1w0(new Function0() { // from class: a.dor
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b7 = b6;
                        diu0 diu0Var = yksVar;
                        switch (b7) {
                            case 0:
                                spr sprVar2 = (spr) diu0Var;
                                bvc bvcVarA = jiu0.a(sprVar2);
                                vs10 vs10Var = sprVar2.q.c;
                                sac.V(bvcVarA, new pop(1, sprVar2, spr.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, vs10Var, new bk5((byte) 2, j5, null, sprVar2, z5), 10);
                                break;
                            case 1:
                                k4s k4sVar2 = (k4s) diu0Var;
                                bvc bvcVarA2 = jiu0.a(k4sVar2);
                                vs10 vs10Var2 = k4sVar2.p.c;
                                sac.V(bvcVarA2, new h2s(1, k4sVar2, k4s.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, vs10Var2, new bk5((byte) 3, j5, null, k4sVar2, z5), 10);
                                break;
                            case 2:
                                g9s g9sVar2 = (g9s) diu0Var;
                                bvc bvcVarA3 = jiu0.a(g9sVar2);
                                vs10 vs10Var3 = g9sVar2.q.c;
                                sac.V(bvcVarA3, new h2s(1, g9sVar2, g9s.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, vs10Var3, new bk5((byte) 4, j5, null, g9sVar2, z5), 10);
                                break;
                            case 3:
                                yks yksVar2 = (yks) diu0Var;
                                bvc bvcVarA4 = jiu0.a(yksVar2);
                                vs10 vs10Var4 = yksVar2.q.c;
                                sac.V(bvcVarA4, new h2s(1, yksVar2, yks.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, vs10Var4, new bk5((byte) 5, j5, null, yksVar2, z5), 10);
                                break;
                            default:
                                ncl0 ncl0Var = (ncl0) diu0Var;
                                bvc bvcVarA5 = jiu0.a(ncl0Var);
                                dvj dvjVar = ncl0Var.o.b;
                                sac.V(bvcVarA5, new kcl0(1, ncl0Var, ncl0.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, dvjVar, new bk5((byte) 7, j5, null, ncl0Var, z5), 10);
                                break;
                        }
                        return Unit.f46060a;
                    }
                })).f14945a;
                bjk bjkVar8 = cfx0.o;
                c8dVar8.f3908a = new v7d(true, bjkVar8, bjkVar8);
                return Unit.f46060a;
            case 12:
                k0w0 k0w0Var10 = (k0w0) obj;
                k0w0Var10.getClass();
                c8d c8dVar9 = (c8d) k0w0Var10.b(new b1w0(new m92((byte) 2, this.b, null, (b310) obj2, this.c))).f14945a;
                bjk bjkVar9 = cfx0.o;
                c8dVar9.f3908a = new v7d(true, bjkVar9, bjkVar9);
                return Unit.f46060a;
            case 13:
                k0w0 k0w0Var11 = (k0w0) obj;
                k0w0Var11.getClass();
                c8d c8dVar10 = (c8d) k0w0Var11.b(new b1w0(new m92((byte) 3, this.b, null, (wk40) obj2, this.c))).f14945a;
                bjk bjkVar10 = cfx0.o;
                c8dVar10.f3908a = new v7d(true, bjkVar10, bjkVar10);
                return Unit.f46060a;
            case 14:
                k0w0 k0w0Var12 = (k0w0) obj;
                k0w0Var12.getClass();
                c8d c8dVar11 = (c8d) k0w0Var12.h(new PromoScreenFactoryImpl$getPromoSettingsScreen$1((zuc0) obj2, j)).f14945a;
                bjk bjkVar11 = cfx0.o;
                nqd nqdVar = new nqd(b2);
                nqdVar.b = z;
                c8dVar11.f3908a = new v7d(true, bjkVar11, nqdVar.d());
                return Unit.f46060a;
            case 15:
                k0w0 k0w0Var13 = (k0w0) obj;
                k0w0Var13.getClass();
                c8d c8dVar12 = (c8d) k0w0Var13.b(new b1w0(new m92((byte) 5, this.b, null, (hxd0) obj2, this.c))).f14945a;
                bjk bjkVar12 = cfx0.o;
                c8dVar12.f3908a = new v7d(true, bjkVar12, bjkVar12);
                return Unit.f46060a;
            case 16:
                final ncl0 ncl0Var = (ncl0) obj2;
                k0w0 k0w0Var14 = (k0w0) obj;
                k0w0Var14.getClass();
                final byte b7 = 4;
                final long j6 = this.b;
                final boolean z6 = this.c;
                c8d c8dVar13 = (c8d) k0w0Var14.b(new a1w0(new Function0() { // from class: a.dor
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b8 = b7;
                        diu0 diu0Var = ncl0Var;
                        switch (b8) {
                            case 0:
                                spr sprVar2 = (spr) diu0Var;
                                bvc bvcVarA = jiu0.a(sprVar2);
                                vs10 vs10Var = sprVar2.q.c;
                                sac.V(bvcVarA, new pop(1, sprVar2, spr.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, vs10Var, new bk5((byte) 2, j6, null, sprVar2, z6), 10);
                                break;
                            case 1:
                                k4s k4sVar2 = (k4s) diu0Var;
                                bvc bvcVarA2 = jiu0.a(k4sVar2);
                                vs10 vs10Var2 = k4sVar2.p.c;
                                sac.V(bvcVarA2, new h2s(1, k4sVar2, k4s.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, vs10Var2, new bk5((byte) 3, j6, null, k4sVar2, z6), 10);
                                break;
                            case 2:
                                g9s g9sVar2 = (g9s) diu0Var;
                                bvc bvcVarA3 = jiu0.a(g9sVar2);
                                vs10 vs10Var3 = g9sVar2.q.c;
                                sac.V(bvcVarA3, new h2s(1, g9sVar2, g9s.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, vs10Var3, new bk5((byte) 4, j6, null, g9sVar2, z6), 10);
                                break;
                            case 3:
                                yks yksVar2 = (yks) diu0Var;
                                bvc bvcVarA4 = jiu0.a(yksVar2);
                                vs10 vs10Var4 = yksVar2.q.c;
                                sac.V(bvcVarA4, new h2s(1, yksVar2, yks.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, vs10Var4, new bk5((byte) 5, j6, null, yksVar2, z6), 10);
                                break;
                            default:
                                ncl0 ncl0Var2 = (ncl0) diu0Var;
                                bvc bvcVarA5 = jiu0.a(ncl0Var2);
                                dvj dvjVar = ncl0Var2.o.b;
                                sac.V(bvcVarA5, new kcl0(1, ncl0Var2, ncl0.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, dvjVar, new bk5((byte) 7, j6, null, ncl0Var2, z6), 10);
                                break;
                        }
                        return Unit.f46060a;
                    }
                })).f14945a;
                bjk bjkVar13 = cfx0.o;
                c8dVar13.f3908a = new v7d(true, bjkVar13, bjkVar13);
                return Unit.f46060a;
            default:
                k0w0 k0w0Var15 = (k0w0) obj;
                k0w0Var15.getClass();
                c8d c8dVar14 = (c8d) k0w0Var15.b(new b1w0(new m92((byte) 6, this.b, null, (tzt0) obj2, this.c))).f14945a;
                bjk bjkVar14 = cfx0.o;
                c8dVar14.f3908a = new v7d(true, bjkVar14, bjkVar14);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ sl1(long j, Function0 function0, boolean z) {
        this.f32376a = (byte) 4;
        this.b = j;
        this.d = function0;
        this.c = z;
    }

    public /* synthetic */ sl1(gr00 gr00Var, long j, boolean z, String str) {
        this.f32376a = (byte) 0;
        this.b = j;
        this.c = z;
        this.d = str;
    }

    public /* synthetic */ sl1(Object obj, long j, boolean z, byte b) {
        this.f32376a = b;
        this.d = obj;
        this.b = j;
        this.c = z;
    }

    public /* synthetic */ sl1(boolean z, i3t0 i3t0Var, long j, byte b) {
        this.f32376a = b;
        this.c = z;
        this.d = i3t0Var;
        this.b = j;
    }

    public /* synthetic */ sl1(jwo[] jwoVarArr, boolean z, long j) {
        this.f32376a = (byte) 7;
        this.d = jwoVarArr;
        this.c = z;
        this.b = j;
    }
}
