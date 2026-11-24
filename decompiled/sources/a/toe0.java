package a;

import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class toe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ woe0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ toe0(woe0 woe0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = woe0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        woe0 woe0Var = this.k;
        switch (b) {
            case 0:
                toe0 toe0Var = new toe0(woe0Var, yjeVar, (byte) 0);
                toe0Var.j = ((Boolean) obj).booleanValue();
                return toe0Var;
            case 1:
                toe0 toe0Var2 = new toe0(woe0Var, yjeVar, (byte) 1);
                toe0Var2.j = ((Boolean) obj).booleanValue();
                return toe0Var2;
            default:
                toe0 toe0Var3 = new toe0(woe0Var, yjeVar, (byte) 2);
                toe0Var3.j = ((Boolean) obj).booleanValue();
                return toe0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        yje yjeVar = (yje) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((toe0) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        woe0 woe0Var = this.k;
        boolean z = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gne0 gne0Var = woe0.S1;
                woe0Var.G0().f.setEnabled(z);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                gne0 gne0Var2 = woe0.S1;
                final byte b2 = 0;
                woe0Var.G0().e.setVisibility(z ? 0 : 8);
                if (z) {
                    final AppBarLayout appBarLayout = woe0Var.G0().b;
                    appBarLayout.post(new Runnable() { // from class: a.qoe0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppBarLayout.Behavior behavior;
                            byte b3 = b2;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            switch (b3) {
                                case 0:
                                    gne0 gne0Var3 = woe0.S1;
                                    ViewGroup.LayoutParams layoutParams = appBarLayout2.getLayoutParams();
                                    ble bleVar = layoutParams instanceof ble ? (ble) layoutParams : null;
                                    yke ykeVar = bleVar != null ? bleVar.f2790a : null;
                                    behavior = ykeVar instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) ykeVar : null;
                                    if (behavior != null) {
                                        behavior.o = new roe0();
                                    }
                                    appBarLayout2.setLayoutParams(bleVar);
                                    break;
                                default:
                                    gne0 gne0Var4 = woe0.S1;
                                    ViewGroup.LayoutParams layoutParams2 = appBarLayout2.getLayoutParams();
                                    ble bleVar2 = layoutParams2 instanceof ble ? (ble) layoutParams2 : null;
                                    yke ykeVar2 = bleVar2 != null ? bleVar2.f2790a : null;
                                    behavior = ykeVar2 instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) ykeVar2 : null;
                                    if (behavior != null) {
                                        behavior.o = new uoe0();
                                    }
                                    appBarLayout2.setLayoutParams(bleVar2);
                                    break;
                            }
                        }
                    });
                } else {
                    final AppBarLayout appBarLayout2 = woe0Var.G0().b;
                    final byte b3 = 1;
                    appBarLayout2.post(new Runnable() { // from class: a.qoe0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppBarLayout.Behavior behavior;
                            byte b4 = b3;
                            AppBarLayout appBarLayout3 = appBarLayout2;
                            switch (b4) {
                                case 0:
                                    gne0 gne0Var3 = woe0.S1;
                                    ViewGroup.LayoutParams layoutParams = appBarLayout3.getLayoutParams();
                                    ble bleVar = layoutParams instanceof ble ? (ble) layoutParams : null;
                                    yke ykeVar = bleVar != null ? bleVar.f2790a : null;
                                    behavior = ykeVar instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) ykeVar : null;
                                    if (behavior != null) {
                                        behavior.o = new roe0();
                                    }
                                    appBarLayout3.setLayoutParams(bleVar);
                                    break;
                                default:
                                    gne0 gne0Var4 = woe0.S1;
                                    ViewGroup.LayoutParams layoutParams2 = appBarLayout3.getLayoutParams();
                                    ble bleVar2 = layoutParams2 instanceof ble ? (ble) layoutParams2 : null;
                                    yke ykeVar2 = bleVar2 != null ? bleVar2.f2790a : null;
                                    behavior = ykeVar2 instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) ykeVar2 : null;
                                    if (behavior != null) {
                                        behavior.o = new uoe0();
                                    }
                                    appBarLayout3.setLayoutParams(bleVar2);
                                    break;
                            }
                        }
                    });
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                gne0 gne0Var3 = woe0.S1;
                woe0Var.G0().f.setClickable(z);
                break;
        }
        return Unit.f46060a;
    }
}
