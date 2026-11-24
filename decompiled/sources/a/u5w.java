package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class u5w extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ x5w k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5w(x5w x5wVar, String str, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = x5wVar;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        String str = this.l;
        x5w x5wVar = this.k;
        switch (b) {
            case 0:
                return new u5w(x5wVar, str, yjeVar, (byte) 0);
            default:
                return new u5w(x5wVar, str, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((u5w) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws yxw {
        byte b = this.i;
        x5w x5wVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                afm0 afm0Var = x5wVar.c;
                sys0 sys0Var = x5wVar.b;
                s77 s77Var = x5wVar.e;
                String str = x5wVar.f;
                String str2 = x5wVar.h;
                this.j = true;
                Object objN = afm0Var.n(sys0Var, s77Var, str, this.l, str2, this);
                return objN == wneVar ? wneVar : objN;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                afm0 afm0Var2 = x5wVar.c;
                sys0 sys0Var2 = x5wVar.b;
                s77 s77Var2 = x5wVar.e;
                String str3 = x5wVar.f;
                String str4 = x5wVar.h;
                this.j = true;
                Object objN2 = afm0Var2.n(sys0Var2, s77Var2, str3, this.l, str4, this);
                return objN2 == wneVar2 ? wneVar2 : objN2;
        }
    }
}
