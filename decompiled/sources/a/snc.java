package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.favorites.impl.presentation.screen.classic.models.ClassicFavoriteTab;

/* JADX INFO: loaded from: classes4.dex */
public final class snc extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ boc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ snc(boc bocVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = bocVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boc bocVar = this.j;
        switch (b) {
            case 0:
                return new snc(bocVar, yjeVar, (byte) 0);
            default:
                return new snc(bocVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((snc) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((snc) create((ya50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        boc bocVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                sff0 sff0VarA = bocVar.q.a();
                boolean zJ = bocVar.r.j();
                boolean z = sff0VarA.L.f30534a;
                mum0 mum0Var = sff0VarA.g;
                ymc ymcVar = new ymc(zJ, z, mum0Var.i.f12896a, mum0Var.n.f739a, mum0Var.B);
                p7m0 p7m0Var = bocVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, onc.a((onc) value, ymcVar, null, null, 0, null, false, false, null, false, 510)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (((onc) bocVar.D()).i) {
                    bocVar.G(new lnc(((onc) bocVar.D()).b));
                } else {
                    ClassicFavoriteTab classicFavoriteTab = (ClassicFavoriteTab) CollectionsKt.W(0, ClassicFavoriteTab.f);
                    if (classicFavoriteTab != null) {
                        bocVar.o.e("CURRENT_TAB_KEY", classicFavoriteTab);
                        bocVar.M(classicFavoriteTab);
                        p7m0 p7m0Var2 = bocVar.i.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                            bocVar.f.getClass();
                        } while (!p7m0Var2.m(value2, onc.a((onc) value2, null, classicFavoriteTab, null, 0, null, false, false, null, false, 509)));
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
