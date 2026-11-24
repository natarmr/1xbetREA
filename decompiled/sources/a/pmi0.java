package a;

import android.net.Uri;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import org.xplatform.onexdatabase.OnexDatabase;
import org.xplatform.settings.impl.navigation.SettingsScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class pmi0 implements iq00, w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27236a;

    public pmi0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 18:
                this.f27236a = new enj0(gii0Var, (byte) 6);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 22:
            case 23:
            case 24:
            default:
                this.f27236a = new rta0(gii0Var, (byte) 28);
                break;
            case 21:
                this.f27236a = new enj0(gii0Var, (byte) 10);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                this.f27236a = new enj0(gii0Var, (byte) 16);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.f27236a = new enj0(gii0Var, (byte) 19);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.f27236a = new enj0(gii0Var, (byte) 22);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.f27236a = new enj0(gii0Var, (byte) 27);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.f27236a = new lkr0(gii0Var, (byte) 5);
                break;
        }
    }

    public static SettingsScreenFactoryImpl$getScreen$1 b(pmi0 pmi0Var, boolean z) {
        d6j0 d6j0Var = d6j0.f5551a;
        pmi0Var.getClass();
        return new SettingsScreenFactoryImpl$getScreen$1(pmi0Var, d6j0Var);
    }

    public static void i(pmi0 pmi0Var) {
        ((fme) ((zas0) pmi0Var.f27236a).b).f9776a.f(new qkt0(null));
    }

    @Override // a.iq00
    public void a(kq00 kq00Var, long j, long j2, int i) {
        mq80 mq80Var = (mq80) kq00Var;
        jrs0 jrs0Var = (jrs0) this.f27236a;
        if (jrs0Var.f17020a) {
            wn00 wn00VarC = jrs0.c(mq80Var, j, j2);
            zhl zhlVar = (zhl) jrs0Var.g;
            zhlVar.getClass();
            zhlVar.f(wn00VarC, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(long j, zje zjeVar, String str) {
        y9p0 y9p0Var;
        if (zjeVar instanceof y9p0) {
            y9p0Var = (y9p0) zjeVar;
            int i = y9p0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y9p0Var.k = i - Integer.MIN_VALUE;
            } else {
                y9p0Var = new y9p0(this, zjeVar);
            }
        } else {
            y9p0Var = new y9p0(this, zjeVar);
        }
        Object objA = y9p0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = y9p0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            o8p0 o8p0Var = (o8p0) ((enj0) this.f27236a).invoke();
            y9p0Var.k = 1;
            objA = o8p0Var.a(j, str, y9p0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r6 == r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(a.sip r7, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage r8, a.jo20 r9, a.zje r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f27236a
            a.enj0 r0 = (a.enj0) r0
            boolean r1 = r10 instanceof a.h7r0
            if (r1 == 0) goto L17
            r1 = r10
            a.h7r0 r1 = (a.h7r0) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.h7r0 r1 = new a.h7r0
            r1.<init>(r6, r10)
        L1c:
            java.lang.Object r6 = r1.i
            a.wne r10 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L57
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            a.z1x.P(r6)
            goto L71
        L39:
            a.z1x.P(r6)
            int r6 = r7.ordinal()
            if (r6 == 0) goto L5e
            if (r6 != r5) goto L5a
            java.lang.Object r6 = r0.invoke()
            a.bog r6 = (a.bog) r6
            java.lang.String r7 = org.xplatform.cyber.section.api.domain.entity.d.b(r8)
            r1.k = r4
            java.lang.Object r6 = r6.l(r7, r9, r1)
            if (r6 != r10) goto L57
            goto L70
        L57:
            a.dx5 r6 = (a.dx5) r6
            goto L73
        L5a:
            a.t9f.b()
            return r3
        L5e:
            java.lang.Object r6 = r0.invoke()
            a.bog r6 = (a.bog) r6
            java.lang.String r7 = org.xplatform.cyber.section.api.domain.entity.d.b(r8)
            r1.k = r5
            java.lang.Object r6 = r6.c(r7, r9, r1)
            if (r6 != r10) goto L71
        L70:
            return r10
        L71:
            a.dx5 r6 = (a.dx5) r6
        L73:
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pmi0.d(a.sip, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage, a.jo20, a.zje):java.lang.Object");
    }

    @Override // a.w7
    public boolean e(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f27236a;
        if (!swipeDismissBehavior.x(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        byte b = swipeDismissBehavior.e;
        int width = (!(b == 0 && z) && (b != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = rgu0.f30456a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        yk50 yk50Var = swipeDismissBehavior.b;
        if (yk50Var != null) {
            yk50Var.h(view);
        }
        return true;
    }

    public Unit f() {
        p7m0 p7m0Var = ((t2g) this.f27236a).f33214a.f31500a;
        p7m0Var.o(null, Boolean.valueOf(!((Boolean) p7m0Var.getValue()).booleanValue()));
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }

    public void g(ljj ljjVar) {
        fjj fjjVar = (fjj) ((clc) this.f27236a).b;
        fjjVar.getClass();
        fjjVar.f9643a.g("DEBUG_CONSOLE_KEY", ljjVar.toString());
        p7m0 p7m0Var = (p7m0) ((qz40) fjjVar.b.getValue());
        p7m0Var.getClass();
        p7m0Var.o(null, ljjVar);
    }

    public void h(ab50 ab50Var) {
        eb50 eb50Var = (eb50) ((nr00) this.f27236a).f23980a;
        eb50Var.getClass();
        eb50Var.f7504a.o(null, ab50Var);
    }

    public void j(long j) {
        ((m8l0) ((lef0) this.f27236a).f19899a).d.o(null, new ynq0(j));
    }

    @Override // a.iq00
    public void n(kq00 kq00Var, long j, long j2, boolean z) {
        mq80 mq80Var = (mq80) kq00Var;
        jrs0 jrs0Var = (jrs0) this.f27236a;
        if (jrs0Var.f17020a) {
            wn00 wn00VarC = jrs0.c(mq80Var, j, j2);
            zhl zhlVar = (zhl) jrs0Var.g;
            zhlVar.getClass();
            zhlVar.b(wn00VarC, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    @Override // a.iq00
    public void u(kq00 kq00Var, long j, long j2) {
        mq80 mq80Var = (mq80) kq00Var;
        if (((jrs0) this.f27236a).f17020a) {
            uom0 uom0Var = (uom0) mq80Var.f;
            uom0Var.getClass();
            jrs0 jrs0Var = (jrs0) this.f27236a;
            jrs0Var.h = uom0Var;
            ((q9o0) jrs0Var.d).e(new oh60(this, uom0Var, (byte) 24));
            jrs0 jrs0Var2 = (jrs0) this.f27236a;
            Uri uriP = (Uri) jrs0Var2.e;
            uriP.getClass();
            Uri uri = uom0Var.c;
            byte b = 0;
            if (uri != null) {
                String string = uri.toString();
                uriP = (string == null || msm0.m(string)[0] == -1) ? msm0.p(uriP.toString(), uri.toString()) : uri;
            }
            jrs0Var2.e = uriP;
            long j3 = uom0Var.b;
            if (j3 == -9223372036854775807L) {
                j3 = 300000;
            }
            q9o0 q9o0Var = (q9o0) ((jrs0) this.f27236a).i;
            q9o0Var.getClass();
            q9o0Var.f28360a.postDelayed(new vom0((jrs0) this.f27236a, b), j3);
            wn00 wn00VarC = jrs0.c(mq80Var, j, j2);
            zhl zhlVar = (zhl) ((jrs0) this.f27236a).g;
            zhlVar.getClass();
            zhlVar.c(wn00VarC, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    @Override // a.iq00
    public ejx w(kq00 kq00Var, long j, long j2, IOException iOException, int i) {
        long j3;
        mq80 mq80Var = (mq80) kq00Var;
        jrs0 jrs0Var = (jrs0) this.f27236a;
        boolean z = jrs0Var.f17020a;
        ejx ejxVar = lhf0.f;
        if (!z) {
            return ejxVar;
        }
        int i2 = iOException instanceof ptw ? ((ptw) iOException).c : Integer.MAX_VALUE;
        if (i2 == 410) {
            lhf0 lhf0Var = (lhf0) jrs0Var.j;
            lhf0Var.getClass();
            lhf0Var.F(null);
            q9o0 q9o0Var = (q9o0) jrs0Var.i;
            q9o0Var.getClass();
            q9o0Var.f();
            j3 = -9223372036854775807L;
        } else {
            j3 = 300000;
            if (i2 == 429) {
                List list = (List) mq80Var.d.d.get("Retry-After");
                if (list != null) {
                    try {
                        j3 = Long.parseLong((String) list.get(0)) * 1000;
                    } catch (NumberFormatException unused) {
                        f1t0.g0("SteeringManifestTracker", "Retry-After header string doesn't contain a parsable long");
                    }
                }
            } else {
                uom0 uom0Var = (uom0) jrs0Var.h;
                if (uom0Var != null) {
                    long j4 = uom0Var.b;
                    if (j4 != -9223372036854775807L) {
                        j3 = j4;
                    }
                }
            }
        }
        byte b = 1;
        if (j3 != -9223372036854775807L) {
            q9o0 q9o0Var2 = (q9o0) jrs0Var.i;
            q9o0Var2.getClass();
            q9o0Var2.f28360a.postDelayed(new vom0(jrs0Var, b), j3);
        }
        boolean z2 = j3 == -9223372036854775807L;
        ((q9o0) jrs0Var.d).e(new hp2(this, iOException, z2));
        wn00 wn00VarC = jrs0.c(mq80Var, j, j2);
        zhl zhlVar = (zhl) jrs0Var.g;
        zhlVar.getClass();
        zhlVar.e(wn00VarC, 8, iOException, z2);
        return ejxVar;
    }

    public pmi0(t2g t2gVar) {
        t2gVar.getClass();
        this.f27236a = t2gVar;
    }

    public pmi0(twz twzVar) {
        twzVar.getClass();
        this.f27236a = twzVar;
    }

    public pmi0(l1f0 l1f0Var) {
        l1f0Var.getClass();
        this.f27236a = l1f0Var;
    }

    public pmi0(hm7 hm7Var) {
        hm7Var.getClass();
        this.f27236a = hm7Var;
    }

    public /* synthetic */ pmi0(Object obj) {
        this.f27236a = obj;
    }

    public pmi0(lmi0 lmi0Var) {
        lmi0Var.getClass();
        this.f27236a = lmi0Var;
    }

    public pmi0(cad cadVar, gii0 gii0Var, OnexDatabase onexDatabase, knf0 knf0Var, sjl0 sjl0Var, m1e m1eVar, wyu wyuVar, j1q0 j1q0Var, duj dujVar, tgk tgkVar, ctf0 ctf0Var, pru pruVar, ddm0 ddm0Var, ntu ntuVar, fsd fsdVar, ugf0 ugf0Var) {
        gii0Var.getClass();
        onexDatabase.getClass();
        knf0Var.getClass();
        sjl0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        j1q0Var.getClass();
        tgkVar.getClass();
        ctf0Var.getClass();
        ddm0Var.getClass();
        fsdVar.getClass();
        this.f27236a = new daf(cadVar, ugf0Var, ddm0Var, tgkVar, onexDatabase, gii0Var, knf0Var, sjl0Var, wyuVar, ntuVar, fsdVar);
    }

    public pmi0() {
        this.f27236a = maz.b(new a7n0(this));
    }

    public pmi0(ArrayList arrayList) {
        this.f27236a = Collections.unmodifiableList(arrayList);
    }
}
