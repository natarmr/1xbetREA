package a;

import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class oag extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ tag j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oag(tag tagVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = tagVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new oag(this.j, yjeVar, (byte) 0);
            case 1:
                return new oag(this.j, yjeVar, (byte) 1);
            default:
                return new oag(this.j, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((oag) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((oag) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((oag) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        tag tagVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                yje yjeVar = null;
                tagVar.k = qjj.W(jiu0.a(tagVar.s()), null, null, new sag(tagVar, yjeVar, (byte) 0), 3);
                tagVar.l = qjj.W(jiu0.a(tagVar.s()), null, null, new sag(tagVar, yjeVar, (byte) 1), 3);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                tagVar.j.f(zl9.f44569a);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ol60 ol60Var = tagVar.j;
                ((Date) tagVar.i.getValue()).getClass();
                ol60Var.f(new am9());
                break;
        }
        return Unit.f46060a;
    }
}
