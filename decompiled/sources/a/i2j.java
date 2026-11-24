package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class i2j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ j2j j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2j(j2j j2jVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = j2jVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j2j j2jVar = this.j;
        switch (b) {
            case 0:
                return new i2j(j2jVar, yjeVar, (byte) 0);
            default:
                return new i2j(j2jVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((i2j) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((i2j) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                j2j j2jVar = this.j;
                j2jVar.v = false;
                if (j2jVar.w) {
                    j2jVar.z();
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                j2j j2jVar2 = this.j;
                c4m0 c4m0Var = j2jVar2.p;
                byte b = 1;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    j2jVar2.p = sac.T(dub.f0(j2jVar2.g.a(), j2jVar2.h.a(), ((o0j) j2jVar2.l.f10686a.c).f, new fl9(j2jVar2, null, b)), d5c.S(jiu0.a(j2jVar2.s()), j2jVar2.d.b), new d7e(2, j2jVar2, j2j.class, "onError", "onError(Ljava/lang/Throwable;)V", 4, (byte) 25));
                }
                break;
        }
        return Unit.f46060a;
    }
}
