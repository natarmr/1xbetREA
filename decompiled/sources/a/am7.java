package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class am7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ fm7 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am7(fm7 fm7Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fm7Var;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.l;
        fm7 fm7Var = this.k;
        switch (b) {
            case 0:
                return new am7(fm7Var, str, yjeVar, (byte) 0);
            default:
                return new am7(fm7Var, str, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((am7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        fm7 fm7Var = this.k;
        String str = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                fvt0 fvt0Var = fm7Var.B;
                mne mneVar = fm7Var.p;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ocl oclVar = fm7Var.M;
                    this.j = true;
                    obj = oclVar.j();
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
                if (axq.y(Long.parseLong(str), (List) obj)) {
                    int i = fm7.p0;
                    sac.V(jiu0.a(fm7Var), null, null, mneVar.b, new zl7(fm7Var, str, yjeVar, (byte) 2), 11);
                } else if (!fm7Var.G.i()) {
                    fvt0Var.x(Long.parseLong(str));
                    fm7Var.G(wk7.f39294a);
                } else if (fm7Var.F.a()) {
                    sac.V(jiu0.a(fm7Var), new ql7(fm7Var, (byte) 4), null, mneVar.b, new ex1((Object) fm7Var, (Object) str, yjeVar, (byte) 17), 10);
                } else {
                    fvt0Var.x(Long.parseLong(str));
                    fm7Var.G(cl7.f4542a);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    jtj jtjVar = fm7Var.c0;
                    this.j = true;
                    obj = ((nvu) jtjVar.b).v(((k7u) jtjVar.c).f17841a.b().getId(), this, str);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                vk7 vk7Var = new vk7(str, (byte[]) obj);
                int i2 = fm7.p0;
                fm7Var.G(vk7Var);
                return Unit.f46060a;
        }
    }
}
