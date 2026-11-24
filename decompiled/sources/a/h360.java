package a;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class h360 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rz50 k;
    public final /* synthetic */ kmq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h360(rz50 rz50Var, kmq kmqVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rz50Var;
        this.l = kmqVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new h360(this.k, this.l, yjeVar, (byte) 0);
            default:
                return new h360(this.k, this.l, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((h360) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        mz50 mz50Var = mz50.f22637a;
        kmq kmqVar = this.l;
        rz50 rz50Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    Collection collection = (Collection) m7x.B(rz50Var.h);
                    if (collection == null || collection.isEmpty()) {
                        rz50 rz50VarA = rz50.a(rz50Var, null, mz50Var, 127);
                        this.j = true;
                        if (kmqVar.a(rz50VarA, this) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    Collection collection2 = (Collection) m7x.B(rz50Var.h);
                    if (collection2 == null || collection2.isEmpty()) {
                        rz50 rz50VarA2 = rz50.a(rz50Var, null, mz50Var, 127);
                        this.j = true;
                        if (kmqVar.a(rz50VarA2, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
