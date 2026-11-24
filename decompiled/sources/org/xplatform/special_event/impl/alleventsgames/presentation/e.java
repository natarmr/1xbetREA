package org.xplatform.special_event.impl.alleventsgames.presentation;

import a.bby;
import a.bnn0;
import a.c4m0;
import a.d5c;
import a.dj1;
import a.e32;
import a.e42;
import a.f32;
import a.fnq;
import a.gep0;
import a.jiu0;
import a.m32;
import a.mne;
import a.n0w;
import a.n32;
import a.ocj;
import a.oyg0;
import a.p7m0;
import a.pd;
import a.q3d;
import a.s32;
import a.sac;
import a.v3c;
import a.wne;
import a.y32;
import a.yje;
import a.z1x;
import a.z32;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends bnn0 implements Function2 {
    public /* synthetic */ boolean i;
    public final /* synthetic */ f j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = fVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        e eVar = new e(this.j, yjeVar);
        eVar.i = ((Boolean) obj).booleanValue();
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((e) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        n32 n32Var;
        Object value2;
        n32 n32Var2;
        bby bbyVar;
        boolean z = this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        f fVar = this.j;
        oyg0 oyg0Var = fVar.f;
        ocj ocjVar = fVar.i;
        mne mneVar = fVar.v;
        if (z) {
            e32 e32Var = e32.f7113a;
            int i = f.Q;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                n32Var2 = (n32) value2;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, n32.a(n32Var2, null, null, null, null, null, new f32(e32Var, n32Var2.f.b), 223)));
            v3c.N(fVar.J);
            yje yjeVar = null;
            byte b = 1;
            fVar.J = sac.V(jiu0.a(fVar), new dj1((byte) 23), null, mneVar.f22085a, new z32(fVar, yjeVar, b), 10);
            c4m0 c4m0Var = fVar.K;
            byte b2 = 2;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                fVar.K = sac.T(new fnq(fVar.y.a(), new e42(fVar, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(fVar), mneVar.f22085a), new e42(fVar, yjeVar, (byte) 3));
            }
            c4m0 c4m0Var2 = fVar.L;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                fVar.L = sac.T(new fnq(fVar.z.d(), new e42(fVar, yjeVar, b), (byte) 4), d5c.S(jiu0.a(fVar), mneVar.f22085a), new pd(2, null, (byte) 11));
            }
            c4m0 c4m0Var3 = fVar.M;
            byte b3 = 0;
            if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                fVar.M = sac.T(new fnq(fVar.A.a(n0w.f22720a), new e42(fVar, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(fVar), mneVar.f22085a), new pd(2, null, (byte) 10));
            }
            AllEventGamesScreenParams allEventGamesScreenParams = fVar.q;
            if (allEventGamesScreenParams instanceof AllEventGamesScreenParams.ParticipantGames) {
                String str = ((AllEventGamesScreenParams.ParticipantGames) allEventGamesScreenParams).d;
                if (!(((n32) fVar.D()).f22828a instanceof gep0) && ((bbyVar = fVar.N) == null || !bbyVar.isActive())) {
                    fVar.N = sac.i0(jiu0.a(fVar), f.class.getSimpleName().concat(".loadParticipantStatistic"), 3, 3L, q3d.j(SocketTimeoutException.class, UnknownHostException.class), null, new y32(fVar, str, yjeVar, b3), null, mneVar.f22085a, new s32(fVar, b3), null, 592);
                }
            }
        } else {
            n32 n32Var3 = (n32) fVar.D();
            m32 m32Var = n32Var3.b.f5381a;
            m32 m32Var2 = m32.f21092a;
            if (m32Var == m32Var2 && n32Var3.c.f3651a == m32Var2 && n32Var3.d.f1881a == m32Var2) {
                v3c.N(fVar.N);
                v3c.N(fVar.K);
                v3c.N(fVar.L);
                v3c.N(fVar.M);
                e32 e32Var2 = e32.b;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    n32Var = (n32) value;
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, n32.a(n32Var, null, null, null, null, null, new f32(e32Var2, n32Var.f.b), 223)));
            }
        }
        return Unit.f46060a;
    }
}
