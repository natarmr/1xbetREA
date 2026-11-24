package a;

import android.view.MenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ow20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ MenuItem k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow20(MenuItem menuItem, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = menuItem;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        MenuItem menuItem = this.k;
        switch (b) {
            case 0:
                ow20 ow20Var = new ow20(menuItem, yjeVar, (byte) 0);
                ow20Var.j = obj;
                return ow20Var;
            default:
                ow20 ow20Var2 = new ow20(menuItem, yjeVar, (byte) 1);
                ow20Var2.j = obj;
                return ow20Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ow20) create((y630) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ow20) create((z630) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        MenuItem menuItem = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((y630) obj2).f42077a) {
                    menuItem.collapseActionView();
                } else {
                    menuItem.expandActionView();
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (((z630) obj2).f43845a) {
                    menuItem.collapseActionView();
                } else {
                    menuItem.expandActionView();
                }
                break;
        }
        return Unit.f46060a;
    }
}
