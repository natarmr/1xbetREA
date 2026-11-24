package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes.dex */
public final class w6f extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ r7f j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6f(r7f r7fVar, long j, long j2, long j3, long j4, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.j = r7fVar;
        this.k = j;
        this.l = j2;
        this.m = j3;
        this.n = j4;
        this.o = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new w6f(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w6f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        final r7f r7fVar = this.j;
        if (!z) {
            z1x.P(obj);
            h3c h3cVar = r7fVar.q1;
            this.i = true;
            obj = h3cVar.b(this.k, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        final boolean zBooleanValue = ((Boolean) obj).booleanValue();
        i1w0 i1w0Var = r7fVar.V0;
        final long j = this.l;
        final long j2 = this.m;
        final long j3 = this.k;
        final long j4 = this.n;
        final boolean z2 = this.o;
        i1w0Var.d(new Function1() { // from class: a.v6f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ((k0w0) obj2).c(r7fVar.E0.h(new GameScreenGeneralParams(j, j2, j3, j4, zBooleanValue, 0L, z2, GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN)));
                return Unit.f46060a;
            }
        });
        return Unit.f46060a;
    }
}
