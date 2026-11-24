package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class i1v extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wdu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1v(wdu wduVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = wduVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        wdu wduVar = this.k;
        switch (b) {
            case 0:
                return new i1v(wduVar, yjeVar, (byte) 0);
            default:
                return new i1v(wduVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((i1v) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        wdu wduVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    Object objC = wduVar.c(this);
                    return objC == wneVar ? wneVar : objC;
                }
                if (z) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    Object objC2 = wduVar.c(this);
                    return objC2 == wneVar2 ? wneVar2 : objC2;
                }
                if (z2) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
