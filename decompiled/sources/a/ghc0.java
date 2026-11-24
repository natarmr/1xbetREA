package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.makebet_promocodes.api.presentation.models.PromoCodeInfoUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class ghc0 extends bnn0 implements Function2 {
    public afc0 i;
    public String j;
    public String k;
    public ol60 l;
    public double m;
    public boolean n;
    public final /* synthetic */ jhc0 o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghc0(jhc0 jhc0Var, String str, yje yjeVar) {
        super(2, yjeVar);
        this.o = jhc0Var;
        this.p = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ghc0(this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ghc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String str;
        afc0 afc0Var;
        ol60 ol60Var;
        double d;
        String str2;
        wne wneVar = wne.f39444a;
        boolean z = this.n;
        Object obj2 = null;
        if (!z) {
            z1x.P(obj);
            jhc0 jhc0Var = this.o;
            for (Object obj3 : ((lgc0) ((onv) jhc0Var.h.f40284a).f25567a).b) {
                if (((afc0) obj3).f772a.equals(this.p)) {
                    obj2 = obj3;
                    break;
                }
            }
            afc0 afc0Var2 = (afc0) obj2;
            if (afc0Var2 != null) {
                ol60 ol60Var2 = jhc0Var.o;
                str = afc0Var2.f772a;
                double d2 = afc0Var2.b;
                String str3 = afc0Var2.i.b;
                nou nouVar = jhc0Var.f;
                this.i = afc0Var2;
                this.j = str3;
                this.k = str;
                this.l = ol60Var2;
                this.m = d2;
                this.n = true;
                obj = nouVar.a(tl5.c, this);
                if (obj == wneVar) {
                    return wneVar;
                }
                afc0Var = afc0Var2;
                ol60Var = ol60Var2;
                d = d2;
                str2 = str3;
            }
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        double d3 = this.m;
        ol60 ol60Var3 = this.l;
        String str4 = this.k;
        String str5 = this.j;
        afc0Var = this.i;
        z1x.P(obj);
        ol60Var = ol60Var3;
        str2 = str5;
        d = d3;
        str = str4;
        ol60Var.f(new xgc0(new PromoCodeInfoUiModel(d, afc0Var.k, str, str2, ((ql5) obj).f)));
        return Unit.f46060a;
    }
}
