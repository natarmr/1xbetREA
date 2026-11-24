package a;

import a.fsa0;
import a.m1r;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.dota.impl.navigation.GameDotaScreenFactoryImpl$dotaScreen$1;
import org.xplatform.cyber.game.counterstrike.api.Cs2GameScreenParams;
import org.xplatform.cyber.game.counterstrike.impl.navigation.CyberGameCs2ScreenFactoryImpl$cs2Screen$1;
import org.xplatform.cyber.game.dota.api.presentation.CyberGameDotaScreenParams;
import org.xplatform.cyber.game.lol.api.LolScreenParams;
import org.xplatform.cyber.game.mlbb.api.MlbbGameScreenParams;
import org.xplatform.cyber.game.mlbb.impl.navigation.MlbbGameScreenFactoryImpl$mlbbScreen$1;
import org.xplatform.cyber.game.rainbow.api.RainbowGameScreenParams;
import org.xplatform.cyber.game.rainbow.impl.navigation.game.RainbowGameScreenFactoryImpl$rainbowScreen$1;
import org.xplatform.cyber.game.universal.api.EsportsUniversalScreenParams;
import org.xplatform.cyber.game.universal.impl.navigation.CyberUniversalScreenFactoryImpl$esportsUniversalScreen$1;
import org.xplatform.cyber.game.valorant.api.ValorantGameScreenParams;
import org.xplatform.cyber.game.valorant.impl.navigation.game.ValorantGameScreenFactoryImpl$valorantScreen$1;
import org.xplatform.cyber.lol.impl.navigation.CyberGameLolScreenFactoryImpl$lolScreen$1;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;
import org.xplatform.sportgame.advanced.api.SportGameAdvancedScreenParams;
import org.xplatform.sportgame.advanced.impl.navigation.SportGameAdvancedScreenFactoryImpl$getScreen$1;
import org.xplatform.sportgame.classic.api.navigation.SportGameClassicScreenParams;
import org.xplatform.sportgame.classic.impl.navigation.SportGameClassicScreenFactoryImpl$getScreen$1;
import org.xplatform.sportgame.dashboard.api.SportGameDashboardScreenParams;
import org.xplatform.sportgame.dashboard.impl.navigation.SportGameDashboardScreenFactoryImpl$getScreen$1;
import org.xplatform.sportgame.lite.api.SportGameLiteScreenParams;
import org.xplatform.sportgame.lite.impl.navigation.SportGameLiteScreenFactoryImpl$getScreen$1;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getGameFragmentScreen$1;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes4.dex */
public final class qv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29368a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public qv2(cbi cbiVar, dbi dbiVar, iot0 iot0Var) {
        this.f29368a = (byte) 2;
        this.b = iot0Var;
        this.c = mbl.b(new ebi(cbiVar, dbiVar, this, 1));
        this.d = mbl.b(new ebi(cbiVar, dbiVar, this, 2));
        this.e = mbl.b(new ebi(cbiVar, dbiVar, this, 7));
        this.f = mbl.b(new ebi(cbiVar, dbiVar, this, 8));
        this.g = mbl.b(new ebi(cbiVar, dbiVar, this, 6));
        this.h = mbl.b(new ebi(cbiVar, dbiVar, this, 9));
        this.i = mbl.b(new ebi(cbiVar, dbiVar, this, 5));
        this.j = mbl.b(new ebi(cbiVar, dbiVar, this, 11));
        this.k = mbl.b(new ebi(cbiVar, dbiVar, this, 10));
        this.l = mbl.b(new ebi(cbiVar, dbiVar, this, 4));
        this.m = mbl.b(new ebi(cbiVar, dbiVar, this, 3));
        this.n = mbl.b(new ebi(cbiVar, dbiVar, this, 0));
    }

    public njt0 A() {
        xr xrVar = new xr(z(), f());
        m0o0 m0o0VarZ = z();
        kki kkiVarF = f();
        Object obj = this.i;
        lhf0 lhf0Var = new lhf0(m0o0VarZ, kkiVarF, (m1e) obj);
        pru pruVar = (pru) this.j;
        wdd0 wdd0Var = (wdd0) this.k;
        k9u k9uVarH = wdd0Var.h();
        x1x.x(k9uVarH);
        rvt rvtVar = (rvt) this.l;
        vpt vptVarE = wdd0Var.e();
        x1x.x(vptVarE);
        return new njt0(xrVar, lhf0Var, pruVar, k9uVarH, rvtVar, vptVarE, new z8u(z()), (zoc) this.m, (m1e) obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object a(c050 c050Var, ko0 ko0Var, zje zjeVar) {
        jv2 jv2Var;
        Function1 function1 = (Function1) this.e;
        agk0 agk0Var = (agk0) this.l;
        if (zjeVar instanceof jv2) {
            jv2Var = (jv2) zjeVar;
            int i = jv2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jv2Var.k = i - Integer.MIN_VALUE;
            } else {
                jv2Var = new jv2(this, zjeVar);
            }
        } else {
            jv2Var = new jv2(this, zjeVar);
        }
        Object obj = jv2Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jv2Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                omx omxVar = (omx) this.f;
                yje yjeVar = null;
                za zaVar = new za(this, ko0Var, yjeVar, (byte) 12);
                jv2Var.k = 1;
                omxVar.getClass();
                if (d5c.J(jv2Var, new lpp(c050Var, omxVar, zaVar, yjeVar, (byte) 2)) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            Object objA = j().a(agk0Var.l());
            if (objA != null && Math.abs(agk0Var.l() - j().d(objA)) <= 0.5f && ((Boolean) function1.invoke(objA)).booleanValue()) {
                w(objA);
            }
            return Unit.f46060a;
        } catch (Throwable th) {
            Object objA2 = j().a(agk0Var.l());
            if (objA2 == null || Math.abs(agk0Var.l() - j().d(objA2)) > 0.5f || !((Boolean) function1.invoke(objA2)).booleanValue()) {
                throw th;
            }
            w(objA2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public Object b(Object obj, c050 c050Var, ydr ydrVar, zje zjeVar) throws Throwable {
        kv2 kv2Var;
        yje yjeVar;
        Function1 function1 = (Function1) this.e;
        agk0 agk0Var = (agk0) this.l;
        if (zjeVar instanceof kv2) {
            kv2Var = (kv2) zjeVar;
            int i = kv2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kv2Var.k = i - Integer.MIN_VALUE;
            } else {
                kv2Var = new kv2(this, zjeVar);
            }
        } else {
            kv2Var = new kv2(this, zjeVar);
        }
        kv2 kv2Var2 = kv2Var;
        Object obj2 = kv2Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = kv2Var2.k;
        yje yjeVar2 = null;
        try {
            if (i2 == 0) {
                z1x.P(obj2);
                if (j().f23849a.containsKey(obj)) {
                    omx omxVar = (omx) this.f;
                    yjeVar = null;
                    try {
                        xg0 xg0Var = new xg0(this, obj, ydrVar, yjeVar, (byte) 1);
                        kv2Var2.k = 1;
                        omxVar.getClass();
                        yjeVar = null;
                        if (d5c.J(kv2Var2, new lpp(c050Var, omxVar, xg0Var, yjeVar2, (byte) 2)) == wneVar) {
                            return wneVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        x(yjeVar);
                        Object objA = j().a(agk0Var.l());
                        if (objA != null && Math.abs(agk0Var.l() - j().d(objA)) <= 0.5f && ((Boolean) function1.invoke(objA)).booleanValue()) {
                            w(objA);
                        }
                        throw th;
                    }
                } else {
                    w(obj);
                }
                return Unit.f46060a;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
            yjeVar = null;
            x(yjeVar);
            Object objA2 = j().a(agk0Var.l());
            if (objA2 != null && Math.abs(agk0Var.l() - j().d(objA2)) <= 0.5f && ((Boolean) function1.invoke(objA2)).booleanValue()) {
                w(objA2);
            }
            return Unit.f46060a;
        } catch (Throwable th2) {
            th = th2;
            yjeVar = null;
        }
    }

    public boolean c() {
        List listL;
        List listA;
        rpt rptVar = (rpt) this.h;
        List listL2 = rptVar.l(true);
        return (listL2 == null || listL2.isEmpty()) && ((listL = rptVar.l(false)) == null || listL.isEmpty()) && ((listA = ((i9u) this.i).a()) == null || listA.isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d8 A[PHI: r16
  0x00d8: PHI (r16v2 long) = (r16v1 long), (r16v3 long) binds: [B:47:0x00d6, B:43:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
    
        if (r0.l(r6, r2) == r3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(a.qu6 r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qv2.d(a.qu6, a.zje):java.lang.Object");
    }

    public Object e(float f, float f2, Object obj) {
        vpj0 vpj0Var = (vpj0) this.b;
        no20 no20VarJ = j();
        float fD = no20VarJ.d(obj);
        float fFloatValue = ((Number) ((Function0) this.c).invoke()).floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    Object objB = no20VarJ.b(f, true);
                    objB.getClass();
                    return objB;
                }
                Object objB2 = no20VarJ.b(f, true);
                objB2.getClass();
                if (f >= Math.abs(Math.abs(((Number) vpj0Var.invoke(Float.valueOf(Math.abs(no20VarJ.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objB3 = no20VarJ.b(f, false);
                    objB3.getClass();
                    return objB3;
                }
                Object objB4 = no20VarJ.b(f, false);
                objB4.getClass();
                float fAbs = Math.abs(fD - Math.abs(((Number) vpj0Var.invoke(Float.valueOf(Math.abs(fD - no20VarJ.d(objB4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public kki f() {
        return new kki(new v8p((gii0) this.b, (vby) this.g), (abp) this.c, (knf0) this.f, (btt0) this.d, (f8p) this.h);
    }

    public ivn g() {
        return new ivn((duj) this.n);
    }

    public FragmentScreen h(GameScreenGeneralParams gameScreenGeneralParams) {
        pru pruVar = (pru) this.m;
        if (!gameScreenGeneralParams.e) {
            if (pruVar.a().c.d) {
                long j = gameScreenGeneralParams.c;
                if (j == 189) {
                    long j2 = gameScreenGeneralParams.f47013a;
                    boolean z = gameScreenGeneralParams.g;
                    long j3 = gameScreenGeneralParams.b;
                    long j4 = gameScreenGeneralParams.f;
                    String str = gameScreenGeneralParams.k;
                    int i = gameScreenGeneralParams.m;
                    str.getClass();
                    return new UfcScreensFactoryImpl$getGameFragmentScreen$1(i, j2, j, j3, j4, str, z);
                }
            }
            if (pruVar.a().X1) {
                r9u r9uVar = (r9u) this.n;
                ygp ygpVar = ygp.E1;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                if (j1q0Var.f15748a.d(ygpVar) && gameScreenGeneralParams.c == 314) {
                    xta0 xta0Var = (xta0) this.l;
                    final long j5 = gameScreenGeneralParams.f47013a;
                    xta0Var.getClass();
                    return new FragmentScreen() { // from class: org.xplatform.polybet.impl.navigation.PolybetScreensFactoryImpl$getPolybetEventScreen$1
                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            fsa0.V1.getClass();
                            fsa0 fsa0Var = new fsa0();
                            fsa0Var.P1.j(fsa0Var, fsa0.W1[0], j5);
                            return fsa0Var;
                        }

                        @Override // a.m7h0
                        /* JADX INFO: renamed from: b */
                        public final String getF45455a() {
                            return String.valueOf(j5);
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        /* JADX INFO: renamed from: g */
                        public final /* bridge */ boolean getB() {
                            return true;
                        }
                    };
                }
            }
            int iOrdinal = pruVar.a().h1.ordinal();
            if (iOrdinal == 0) {
                return new SportGameClassicScreenFactoryImpl$getScreen$1((r46) this.h, new SportGameClassicScreenParams(gameScreenGeneralParams.c, gameScreenGeneralParams.g, gameScreenGeneralParams.f47013a, gameScreenGeneralParams.b, gameScreenGeneralParams.f, gameScreenGeneralParams.h, gameScreenGeneralParams.n));
            }
            if (iOrdinal == 1) {
                return new SportGameAdvancedScreenFactoryImpl$getScreen$1((gle0) this.i, new SportGameAdvancedScreenParams(gameScreenGeneralParams.c, gameScreenGeneralParams.g, gameScreenGeneralParams.f47013a, gameScreenGeneralParams.h, gameScreenGeneralParams.b, gameScreenGeneralParams.f));
            }
            if (iOrdinal == 2) {
                return new SportGameDashboardScreenFactoryImpl$getScreen$1((gne0) this.k, new SportGameDashboardScreenParams(gameScreenGeneralParams.c, gameScreenGeneralParams.g, gameScreenGeneralParams.f47013a, gameScreenGeneralParams.h, gameScreenGeneralParams.b));
            }
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            return new SportGameLiteScreenFactoryImpl$getScreen$1((eke0) this.j, new SportGameLiteScreenParams(gameScreenGeneralParams.c, gameScreenGeneralParams.g, gameScreenGeneralParams.f47013a, gameScreenGeneralParams.h, gameScreenGeneralParams.b));
        }
        long j6 = gameScreenGeneralParams.d;
        GameBroadcastType gameBroadcastType = gameScreenGeneralParams.h;
        if (j6 == 1) {
            sek sekVar = (sek) this.b;
            long j7 = gameScreenGeneralParams.f47013a;
            boolean z2 = gameScreenGeneralParams.g;
            long j8 = gameScreenGeneralParams.b;
            long j9 = gameScreenGeneralParams.c;
            boolean z3 = gameBroadcastType == GameBroadcastType.f47186a;
            return new GameDotaScreenFactoryImpl$dotaScreen$1(new CyberGameDotaScreenParams(gameScreenGeneralParams.m, j7, j8, j6, j9, gameScreenGeneralParams.f, gameScreenGeneralParams.o, gameScreenGeneralParams.k, z2, z3), sekVar);
        }
        if (j6 == 46) {
            usd usdVar = (usd) this.c;
            long j10 = gameScreenGeneralParams.f47013a;
            boolean z4 = gameScreenGeneralParams.g;
            long j11 = gameScreenGeneralParams.b;
            long j12 = gameScreenGeneralParams.c;
            boolean z5 = gameBroadcastType == GameBroadcastType.f47186a;
            return new CyberGameCs2ScreenFactoryImpl$cs2Screen$1(new Cs2GameScreenParams(gameScreenGeneralParams.m, j10, j11, j6, j12, gameScreenGeneralParams.f, gameScreenGeneralParams.o, gameScreenGeneralParams.k, z4, z5), usdVar);
        }
        if (j6 == 2) {
            kud kudVar = (kud) this.d;
            long j13 = gameScreenGeneralParams.f47013a;
            boolean z6 = gameScreenGeneralParams.g;
            long j14 = gameScreenGeneralParams.b;
            long j15 = gameScreenGeneralParams.c;
            boolean z7 = gameBroadcastType == GameBroadcastType.f47186a;
            return new CyberGameLolScreenFactoryImpl$lolScreen$1(new LolScreenParams(gameScreenGeneralParams.m, j13, j14, j6, j15, gameScreenGeneralParams.f, gameScreenGeneralParams.o, gameScreenGeneralParams.k, z6, z7), kudVar);
        }
        if (j6 == 27) {
            uxs0 uxs0Var = (uxs0) this.e;
            long j16 = gameScreenGeneralParams.f47013a;
            boolean z8 = gameScreenGeneralParams.g;
            long j17 = gameScreenGeneralParams.b;
            long j18 = gameScreenGeneralParams.c;
            boolean z9 = gameBroadcastType == GameBroadcastType.f47186a;
            return new ValorantGameScreenFactoryImpl$valorantScreen$1(new ValorantGameScreenParams(gameScreenGeneralParams.m, j16, j17, j6, j18, gameScreenGeneralParams.f, gameScreenGeneralParams.o, gameScreenGeneralParams.k, z8, z9), uxs0Var);
        }
        if (j6 == 15) {
            fl70 fl70Var = (fl70) this.f;
            long j19 = gameScreenGeneralParams.f47013a;
            boolean z10 = gameScreenGeneralParams.g;
            long j20 = gameScreenGeneralParams.b;
            long j21 = gameScreenGeneralParams.c;
            boolean z11 = gameBroadcastType == GameBroadcastType.f47186a;
            return new RainbowGameScreenFactoryImpl$rainbowScreen$1(new RainbowGameScreenParams(gameScreenGeneralParams.m, j19, j20, j6, j21, gameScreenGeneralParams.f, gameScreenGeneralParams.o, gameScreenGeneralParams.k, z10, z11), fl70Var);
        }
        if (j6 == 36) {
            return new MlbbGameScreenFactoryImpl$mlbbScreen$1(new MlbbGameScreenParams(gameScreenGeneralParams.f47013a, gameScreenGeneralParams.g, gameScreenGeneralParams.b, j6, gameScreenGeneralParams.c, gameScreenGeneralParams.i, gameBroadcastType == GameBroadcastType.f47186a, gameScreenGeneralParams.k, gameScreenGeneralParams.f, gameScreenGeneralParams.m, gameScreenGeneralParams.o));
        }
        nwd nwdVar = (nwd) this.g;
        long j22 = gameScreenGeneralParams.f47013a;
        boolean z12 = gameScreenGeneralParams.g;
        long j23 = gameScreenGeneralParams.b;
        long j24 = gameScreenGeneralParams.c;
        return new CyberUniversalScreenFactoryImpl$esportsUniversalScreen$1(new EsportsUniversalScreenParams(j22, z12, j23, j24, j6, gameScreenGeneralParams.i, j24 != 40, gameBroadcastType == GameBroadcastType.f47186a, gameScreenGeneralParams.k, gameScreenGeneralParams.f, gameScreenGeneralParams.m, gameScreenGeneralParams.o), nwdVar);
    }

    public hqc i() {
        return new hqc(z());
    }

    public no20 j() {
        return (no20) ((hgk0) ((pz40) this.j)).getValue();
    }

    public ocl k() {
        return new ocl(z());
    }

    public z8u l() {
        return new z8u(z());
    }

    public i9u m() {
        return new i9u(f());
    }

    public j9u n() {
        return new j9u(z());
    }

    public rpt o() {
        return new rpt(z());
    }

    public i9u p() {
        return new i9u(f());
    }

    public n4u q() {
        return new n4u(z(), (byte) 6);
    }

    public j9u r() {
        return new j9u(z());
    }

    /* JADX WARN: Code duplicated, block: B:132:0x040f  */
    /* JADX WARN: Code duplicated, block: B:256:0x062b  */
    /* JADX WARN: Code duplicated, block: B:273:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:276:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:281:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:284:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:291:0x070e  */
    /* JADX WARN: Code duplicated, block: B:294:0x0727  */
    /* JADX WARN: Code duplicated, block: B:297:0x0732  */
    /* JADX WARN: Code duplicated, block: B:298:0x0734  */
    /* JADX WARN: Code duplicated, block: B:300:0x0739  */
    /* JADX WARN: Code duplicated, block: B:301:0x073d  */
    /* JADX WARN: Code duplicated, block: B:304:0x074a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0761  */
    /* JADX WARN: Code duplicated, block: B:319:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:322:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:329:0x080f  */
    /* JADX WARN: Code duplicated, block: B:332:0x0815  */
    /* JADX WARN: Code duplicated, block: B:338:0x083d  */
    /* JADX WARN: Code duplicated, block: B:342:0x0857  */
    /* JADX WARN: Code duplicated, block: B:344:0x085c  */
    /* JADX WARN: Code duplicated, block: B:347:0x0865  */
    /* JADX WARN: Code duplicated, block: B:348:0x0868  */
    /* JADX WARN: Code duplicated, block: B:352:0x0880 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:353:0x0882  */
    /* JADX WARN: Code duplicated, block: B:387:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x07cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0707 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x070a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x06e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:? A[LOOP:10: B:282:0x06ec->B:394:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0044  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v24 java.lang.Object, still in use, count: 2, list:
          (r10v24 java.lang.Object) from 0x040b: PHI (r10 I:??) = (r10v19 java.lang.Object), (r10v24 java.lang.Object) binds: [B:129:0x040a, B:382:0x040b] A[DONT_GENERATE, DONT_INLINE]
          (r10v24 java.lang.Object) from 0x0405: CHECK_CAST (a.q4f) (r10v24 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object s(long r74, a.zje r76) {
        /*
            Method dump skipped, instruction units count: 2258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qv2.s(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r0 == r3) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(a.vae0 r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qv2.t(a.vae0, a.zje):java.lang.Object");
    }

    public float u(float f) {
        agk0 agk0Var = (agk0) this.l;
        float fL = (Float.isNaN(agk0Var.l()) ? 0.0f : agk0Var.l()) + f;
        float fC = j().c();
        Float fH0 = CollectionsKt.h0(j().f23849a.values());
        return l1e0.c(fL, fC, fH0 != null ? fH0.floatValue() : Float.NaN);
    }

    public float v() {
        agk0 agk0Var = (agk0) this.l;
        if (!Float.isNaN(agk0Var.l())) {
            return agk0Var.l();
        }
        jf4.n("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public void w(Object obj) {
        ((hgk0) ((pz40) this.h)).setValue(obj);
    }

    public void x(Object obj) {
        ((hgk0) ((pz40) this.i)).setValue(obj);
    }

    public Object y(float f, bnn0 bnn0Var) throws Throwable {
        Object value = ((hgk0) ((pz40) this.h)).getValue();
        Object objE = e(v(), f, value);
        if (((Boolean) ((Function1) this.e).invoke(objE)).booleanValue()) {
            Object objB = b(objE, c050.f3507a, new tu2(this, f, null), bnn0Var);
            wne wneVar = wne.f39444a;
            if (objB != wneVar) {
                objB = Unit.f46060a;
            }
            return objB == wneVar ? objB : Unit.f46060a;
        }
        Object objB2 = b(value, c050.f3507a, new tu2(this, f, null), bnn0Var);
        wne wneVar2 = wne.f39444a;
        if (objB2 != wneVar2) {
            objB2 = Unit.f46060a;
        }
        return objB2 == wneVar2 ? objB2 : Unit.f46060a;
    }

    public m0o0 z() {
        return new m0o0(new wti((gii0) this.b, (byte) 10), (abp) this.c, (btt0) this.d, (mne) this.e, (knf0) this.f);
    }

    public qv2(j9c j9cVar, ert ertVar, vit0 vit0Var, hst hstVar, ymv ymvVar, qru qruVar, tqt tqtVar, znt zntVar, h9c h9cVar, zri zriVar, dq00 dq00Var, s7u s7uVar, mpc mpcVar, lhf0 lhf0Var) {
        this.f29368a = (byte) 21;
        this.b = j9cVar;
        this.c = ertVar;
        this.d = vit0Var;
        this.e = hstVar;
        this.f = ymvVar;
        this.g = qruVar;
        this.h = zntVar;
        this.i = h9cVar;
        this.j = zriVar;
        this.k = dq00Var;
        this.l = s7uVar;
        this.m = mpcVar;
        this.n = lhf0Var;
    }

    public qv2(f4u f4uVar, gxu gxuVar, rou rouVar, pru pruVar, lbu lbuVar, iqt iqtVar, jqt jqtVar, epc epcVar, jcl jclVar, phf0 phf0Var, hqx hqxVar, pzt pztVar, r9u r9uVar) {
        this.f29368a = (byte) 19;
        rouVar.getClass();
        pruVar.getClass();
        lbuVar.getClass();
        r9uVar.getClass();
        this.b = f4uVar;
        this.c = gxuVar;
        this.d = rouVar;
        this.e = pruVar;
        this.f = lbuVar;
        this.g = iqtVar;
        this.h = jqtVar;
        this.i = epcVar;
        this.j = jclVar;
        this.k = phf0Var;
        this.l = hqxVar;
        this.m = pztVar;
        this.n = r9uVar;
    }

    public qv2(rtu rtuVar, ieu ieuVar, k7u k7uVar, rpt rptVar, x4u x4uVar, w8u w8uVar, rpt rptVar2, i9u i9uVar, v7i v7iVar, wsc wscVar, r9u r9uVar, j9u j9uVar, pru pruVar) {
        this.f29368a = (byte) 20;
        this.b = rtuVar;
        this.c = ieuVar;
        this.d = k7uVar;
        this.e = rptVar;
        this.f = x4uVar;
        this.g = w8uVar;
        this.h = rptVar2;
        this.i = i9uVar;
        this.j = v7iVar;
        this.k = wscVar;
        this.l = r9uVar;
        this.m = j9uVar;
        this.n = maz.b(new b6u(pruVar, (byte) 24));
    }

    public qv2(sek sekVar, usd usdVar, kud kudVar, uxs0 uxs0Var, fl70 fl70Var, htz htzVar, nwd nwdVar, r46 r46Var, gle0 gle0Var, eke0 eke0Var, gne0 gne0Var, kys0 kys0Var, xta0 xta0Var, pru pruVar, r9u r9uVar) {
        this.f29368a = (byte) 18;
        xta0Var.getClass();
        r9uVar.getClass();
        this.b = sekVar;
        this.c = usdVar;
        this.d = kudVar;
        this.e = uxs0Var;
        this.f = fl70Var;
        this.g = nwdVar;
        this.h = r46Var;
        this.i = gle0Var;
        this.j = eke0Var;
        this.k = gne0Var;
        this.l = xta0Var;
        this.m = pruVar;
        this.n = r9uVar;
    }

    public qv2(ii iiVar, xak xakVar, a6u a6uVar, wyu wyuVar, y3v y3vVar, i1w0 i1w0Var, evz evzVar, mne mneVar, s64 s64Var, wgu wguVar, dpc dpcVar, ani0 ani0Var, duj dujVar) {
        this.f29368a = (byte) 8;
        this.b = wyuVar;
        this.c = xakVar;
        this.d = a6uVar;
        this.e = y3vVar;
        this.f = evzVar;
        this.g = i1w0Var;
        this.h = mneVar;
        this.i = s64Var;
        this.j = wguVar;
        this.k = dpcVar;
        this.l = ani0Var;
        this.m = dujVar;
        this.n = new ugi(this, (byte) 20);
    }

    public qv2(dvz dvzVar, cad cadVar, ii iiVar, btt0 btt0Var, gii0 gii0Var, knf0 knf0Var, ctf0 ctf0Var, i1w0 i1w0Var, duj dujVar) {
        this.f29368a = (byte) 9;
        this.b = dvzVar;
        this.c = gii0Var;
        this.d = btt0Var;
        this.e = knf0Var;
        this.f = ctf0Var;
        this.g = cadVar;
        this.h = i1w0Var;
        this.i = dujVar;
        byte b = 4;
        this.j = mbl.b(new rii(this, 3, b));
        this.k = mbl.b(new rii(this, 2, b));
        this.l = mbl.b(new rii(this, 1, b));
        this.m = mbl.b(new rii(this, b, b));
        this.n = new rii(this, 0, b);
    }

    public qv2(jyz jyzVar, cad cadVar, ii iiVar, btt0 btt0Var, gii0 gii0Var, knf0 knf0Var, us00 us00Var, i1w0 i1w0Var, duj dujVar) {
        this.f29368a = (byte) 10;
        this.b = jyzVar;
        this.c = gii0Var;
        this.d = btt0Var;
        this.e = knf0Var;
        this.f = us00Var;
        this.g = cadVar;
        this.h = i1w0Var;
        this.i = dujVar;
        byte b = 5;
        this.j = mbl.b(new rii(this, 3, b));
        this.k = mbl.b(new rii(this, 2, b));
        this.l = mbl.b(new rii(this, 1, b));
        this.m = mbl.b(new rii(this, 4, b));
        this.n = new rii(this, 0, b);
    }

    public qv2(cad cadVar, kki kkiVar, duj dujVar, gii0 gii0Var, String str, m1e m1eVar, i1w0 i1w0Var, ctf0 ctf0Var, ocl oclVar, knf0 knf0Var, vjp vjpVar, r9u r9uVar) {
        this.f29368a = (byte) 7;
        this.b = dujVar;
        this.c = cadVar;
        this.d = gii0Var;
        this.e = knf0Var;
        this.f = m1eVar;
        this.g = i1w0Var;
        this.h = kkiVar;
        this.i = oclVar;
        this.j = str;
        this.k = r9uVar;
        this.l = ctf0Var;
        this.m = vjpVar;
        this.n = new yei(this, (byte) 29);
    }

    public qv2(htz htzVar, cad cadVar, ii iiVar, btt0 btt0Var, gii0 gii0Var, i1w0 i1w0Var, duj dujVar, ctf0 ctf0Var, kwz kwzVar, njo njoVar) {
        this.f29368a = (byte) 5;
        this.b = htzVar;
        this.c = gii0Var;
        this.d = kwzVar;
        this.e = njoVar;
        this.f = btt0Var;
        this.g = ctf0Var;
        this.h = i1w0Var;
        this.i = cadVar;
        this.j = dujVar;
        byte b = 13;
        this.k = mbl.b(new dci(this, 3, b));
        this.l = mbl.b(new dci(this, 2, b));
        this.m = mbl.b(new dci(this, 1, b));
        this.n = new dci(this, 0, b);
    }

    public qv2(cad cadVar, duj dujVar, m1e m1eVar, gg5 gg5Var, i1w0 i1w0Var, sa10 sa10Var, gii0 gii0Var, ntu ntuVar, knf0 knf0Var, x0u x0uVar, b3c0 b3c0Var, iqt iqtVar, wdk0 wdk0Var) {
        this.f29368a = (byte) 4;
        this.b = cadVar;
        this.c = gg5Var;
        this.d = dujVar;
        this.e = m1eVar;
        this.f = i1w0Var;
        this.g = gii0Var;
        this.h = knf0Var;
        this.i = b3c0Var;
        this.j = ntuVar;
        this.k = x0uVar;
        this.l = iqtVar;
        this.m = sa10Var;
        this.n = new uci(this, (byte) 6);
    }

    public qv2(Integer num, Long l, mne mneVar, ctf0 ctf0Var, lye lyeVar, m0f m0fVar, ave aveVar, us3 us3Var, knf0 knf0Var, vwb0 vwb0Var, q7d0 q7d0Var, gii0 gii0Var) {
        this.f29368a = (byte) 3;
        this.b = num;
        this.c = l;
        this.d = lyeVar;
        this.e = m0fVar;
        this.f = aveVar;
        this.g = gii0Var;
        this.h = vwb0Var;
        this.i = q7d0Var;
        this.j = us3Var;
        this.k = knf0Var;
        this.l = mneVar;
        this.m = ctf0Var;
        this.n = new pai(this, (byte) 14);
    }

    public qv2(cad cadVar, ehf0 ehf0Var, crm0 crm0Var, s91 s91Var, oeg0 oeg0Var, ctf0 ctf0Var, qu quVar, zr1 zr1Var, r2v r2vVar, ytt yttVar, bzt bztVar, ii iiVar, wiu wiuVar) {
        this.f29368a = (byte) 16;
        this.b = ehf0Var;
        this.c = ctf0Var;
        this.d = oeg0Var;
        this.e = cadVar;
        this.f = s91Var;
        this.g = wiuVar;
        this.h = quVar;
        this.i = zr1Var;
        this.j = r2vVar;
        this.k = bztVar;
        this.l = yttVar;
        this.m = crm0Var;
        this.n = new yxi(this, (byte) 3);
    }

    public qv2(cad cadVar, lef0 lef0Var, d1p d1pVar, i1w0 i1w0Var, ii iiVar, m1e m1eVar, kt2 kt2Var, duj dujVar, g2v g2vVar, ctf0 ctf0Var, btt0 btt0Var, knf0 knf0Var, gii0 gii0Var, wdk0 wdk0Var) {
        this.f29368a = (byte) 1;
        this.b = gii0Var;
        this.c = knf0Var;
        this.d = btt0Var;
        this.e = cadVar;
        this.f = lef0Var;
        this.g = m1eVar;
        this.h = kt2Var;
        this.i = g2vVar;
        this.j = ctf0Var;
        this.k = d1pVar;
        this.l = i1w0Var;
        this.m = dujVar;
        this.n = new n8i(this, (byte) 3);
    }

    public qv2(cad cadVar, duj dujVar, ilp0 ilp0Var, sa10 sa10Var, ntu ntuVar, n4u n4uVar, wgu wguVar, iqt iqtVar, hru hruVar, hse0 hse0Var, ii iiVar, zri zriVar, c8c c8cVar) {
        this.f29368a = (byte) 14;
        this.b = dujVar;
        this.c = ntuVar;
        this.d = ilp0Var;
        this.e = cadVar;
        this.f = wguVar;
        this.g = n4uVar;
        this.h = iqtVar;
        this.i = hruVar;
        this.j = hse0Var;
        this.k = sa10Var;
        this.l = zriVar;
        byte b = 5;
        this.m = n0k0.a(new msi(this, 0, b));
        this.n = n0k0.a(new msi(this, 1, b));
    }

    public qv2(cad cadVar, d1p d1pVar, yox yoxVar, i1w0 i1w0Var, duj dujVar, m1e m1eVar, kt2 kt2Var, sa10 sa10Var, pru pruVar, bzt bztVar, btt0 btt0Var, gii0 gii0Var, wdk0 wdk0Var, kd30 kd30Var) {
        this.f29368a = (byte) 13;
        this.b = cadVar;
        this.c = btt0Var;
        this.d = gii0Var;
        this.e = kt2Var;
        this.f = d1pVar;
        this.g = i1w0Var;
        this.h = dujVar;
        this.i = sa10Var;
        this.j = yoxVar;
        this.k = bztVar;
        this.l = pruVar;
        this.m = m1eVar;
        this.n = new rti(this, (byte) 4);
    }

    public qv2(pyg pygVar, epi0 epi0Var, CyberChampParams cyberChampParams, m1e m1eVar, mne mneVar, g2v g2vVar, ctf0 ctf0Var, wdk0 wdk0Var, wgu wguVar, pmi pmiVar, pru pruVar, ih5 ih5Var, zr1 zr1Var) {
        this.f29368a = (byte) 15;
        this.b = cyberChampParams;
        this.c = mneVar;
        this.d = m1eVar;
        this.e = pygVar;
        this.f = pmiVar;
        this.g = wguVar;
        this.h = epi0Var;
        this.i = ctf0Var;
        this.j = g2vVar;
        this.k = pruVar;
        this.l = ih5Var;
        this.m = zr1Var;
        this.n = n0k0.a(new xvi(this, (byte) 1));
    }

    public qv2(cad cadVar, wsf0 wsf0Var, i1w0 i1w0Var, Boolean bool, String str, gii0 gii0Var, m1e m1eVar, knf0 knf0Var, ctf0 ctf0Var, bzt bztVar, kuy kuyVar, gle0 gle0Var) {
        this.f29368a = (byte) 17;
        this.b = i1w0Var;
        this.c = cadVar;
        this.d = knf0Var;
        this.e = kuyVar;
        this.f = gii0Var;
        this.g = wsf0Var;
        this.h = bztVar;
        this.i = gle0Var;
        this.j = m1eVar;
        this.k = str;
        this.l = bool;
        this.m = ctf0Var;
        this.n = new yxi(this, (byte) 8);
    }

    public qv2(pyu pyuVar, wsz wszVar, uuz uuzVar, jru jruVar, onv onvVar, xsu xsuVar, ii iiVar, uf3 uf3Var, duj dujVar, btt0 btt0Var, b8u b8uVar, sek sekVar, vd1 vd1Var, vby vbyVar, sa10 sa10Var, knf0 knf0Var, m1e m1eVar, gii0 gii0Var, pru pruVar, wdk0 wdk0Var) {
        this.f29368a = (byte) 11;
        this.b = b8uVar;
        this.c = gii0Var;
        this.d = knf0Var;
        this.e = btt0Var;
        this.f = vbyVar;
        this.g = pruVar;
        this.h = uf3Var;
        this.i = sekVar;
        this.j = vd1Var;
        this.k = sa10Var;
        this.l = dujVar;
        this.m = m1eVar;
        this.n = n0k0.a(new fri(this, (byte) 11));
    }

    public qv2(wdd0 wdd0Var, abp abpVar, f8p f8pVar, btt0 btt0Var, gii0 gii0Var, mne mneVar, knf0 knf0Var, duj dujVar, pru pruVar, rvt rvtVar, zoc zocVar, m1e m1eVar, vby vbyVar) {
        this.f29368a = (byte) 6;
        this.b = gii0Var;
        this.c = abpVar;
        this.d = btt0Var;
        this.e = mneVar;
        this.f = knf0Var;
        this.g = vbyVar;
        this.h = f8pVar;
        this.i = m1eVar;
        this.j = pruVar;
        this.k = wdd0Var;
        this.l = rvtVar;
        this.m = zocVar;
        this.n = dujVar;
    }

    public qv2(cad cadVar, onv onvVar, lef0 lef0Var, pv00 pv00Var, ii iiVar, qgd qgdVar, rjo rjoVar, vqi0 vqi0Var, duj dujVar, je jeVar, s31 s31Var, owp0 owp0Var, m1e m1eVar, wdk0 wdk0Var, zn00 zn00Var) {
        this.f29368a = (byte) 12;
        this.b = owp0Var;
        this.c = lef0Var;
        this.d = vqi0Var;
        this.e = pv00Var;
        this.f = qgdVar;
        this.g = zn00Var;
        this.h = s31Var;
        this.i = jeVar;
        this.j = rjoVar;
        this.k = cadVar;
        this.l = dujVar;
        this.m = m1eVar;
        this.n = n0k0.a(new fri(this, (byte) 29));
    }

    public qv2(fht0 fht0Var, ort ortVar, pq pqVar, a7q a7qVar, oif0 oif0Var, ocl oclVar, pru pruVar, h0q0 h0q0Var, zas0 zas0Var, dpi0 dpi0Var, r9u r9uVar, psc pscVar, dqc dqcVar) {
        this.f29368a = (byte) 22;
        this.b = fht0Var;
        this.c = ortVar;
        this.d = pqVar;
        this.e = a7qVar;
        this.f = oif0Var;
        this.g = oclVar;
        this.h = pruVar;
        this.i = h0q0Var;
        this.j = zas0Var;
        this.k = dpi0Var;
        this.l = r9uVar;
        this.m = pscVar;
        this.n = dqcVar;
    }

    public qv2(ypj0 ypj0Var, vpj0 vpj0Var, Function0 function0, goi0 goi0Var, Function1 function1) {
        this.f29368a = (byte) 0;
        this.b = vpj0Var;
        this.c = function0;
        this.d = goi0Var;
        this.e = function1;
        this.f = new omx();
        this.g = new pv2(this);
        this.h = androidx.compose.runtime.e.e(ypj0Var);
        this.k = jgk0.b(new iv2(this, (byte) 0));
        jgk0.b(new iv2(this, (byte) 1));
        this.l = androidx.compose.runtime.e.a(Float.NaN);
        new a14(0);
        xfk0.h().g();
        v960.f37020a.getClass();
        this.m = androidx.compose.runtime.e.a(0.0f);
        this.i = androidx.compose.runtime.e.e(null);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.j = androidx.compose.runtime.e.e(new no20(lunVar));
        this.n = new mv2(this);
    }
}
