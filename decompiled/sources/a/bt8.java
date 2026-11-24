package a;

import android.content.Context;
import android.util.TypedValue;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.aggregator.game.impl.game.navigation.AggregatorGameScreens$AggregatorPreloadGameScreen;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bt8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3170a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bt8(jie0 jie0Var, et8 et8Var, float f, boolean z, boolean z2) {
        this.f3170a = (byte) 0;
        this.d = jie0Var;
        this.e = et8Var;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zr8 zr8Var;
        byte b = this.f3170a;
        boolean z = true;
        int i = R.color.static_red;
        byte b2 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z2 = this.c;
        boolean z3 = this.b;
        switch (b) {
            case 0:
                jie0 jie0Var = (jie0) obj3;
                et8 et8Var = (et8) obj2;
                t33 t33Var = (t33) obj;
                t33Var.getClass();
                int iFloatValue = (int) (((Number) t33Var.d()).floatValue() - jie0Var.f16571a);
                jie0Var.f16571a = ((Number) t33Var.d()).floatValue();
                if (iFloatValue != 0 && (zr8Var = et8Var.b) != null) {
                    ((Number) t33Var.d()).floatValue();
                    zr8Var.a(iFloatValue, 0, !z3, z2);
                }
                break;
            case 1:
                pn10 pn10Var = (pn10) obj3;
                jo10 jo10Var = (jo10) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                if (z3) {
                    if (pn10Var.U == null) {
                        p7m0 p7m0Var = pn10Var.i.f25029a;
                        while (true) {
                            Object value = p7m0Var.getValue();
                            value.getClass();
                            pn10Var.f.getClass();
                            jo10 jo10Var2 = jo10Var;
                            if (!p7m0Var.m(value, tm10.a((tm10) value, null, null, null, null, null, null, false, jo10Var, null, false, null, false, 0L, false, null, null, false, false, false, null, null, 3407743))) {
                                jo10Var = jo10Var2;
                            }
                        }
                    } else {
                        pn10Var.T(jo10Var, pn10Var.c0);
                    }
                }
                if (!(th instanceof UnknownHostException) && !z2) {
                    pn10Var.O(th);
                }
                break;
            case 2:
                mlr mlrVar = (mlr) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h((AggregatorGameScreens$AggregatorPreloadGameScreen) obj3).f14945a;
                bjk bjkVar = cfx0.o;
                if (z3 || (!z2 && mlrVar.n)) {
                    z = false;
                }
                c8dVar.f3908a = new v7d(z, bjkVar, bjkVar);
                break;
            case 3:
                fqh0 fqh0Var = (fqh0) obj3;
                rku0 rku0Var = (rku0) obj;
                rku0Var.getClass();
                DsSettingsCell dsSettingsCell = rku0Var.f30667a;
                dsSettingsCell.getClass();
                dyb.O(dsSettingsCell, new dff0((Function1) obj2, fqh0Var, (byte) 27));
                dsSettingsCell.setFirst(z3);
                dsSettingsCell.setLast(z2);
                DsCellMiddleTitle dsCellMiddleTitle = rku0Var.b;
                dsCellMiddleTitle.setTitle(fqh0Var.c);
                dsCellMiddleTitle.setSubtitle(fqh0Var.d);
                TypedValue typedValue = j5d.f15927a;
                Context context = dsCellMiddleTitle.getContext();
                context.getClass();
                if (fqh0Var.b) {
                    i = R.color.static_green;
                }
                dsCellMiddleTitle.setSubtitleTextColor(context.getColor(i));
                rku0Var.d.setVisibility(!z2 ? 0 : 8);
                rku0Var.c.setVisibility(fqh0Var.e ? 0 : 8);
                dsCellMiddleTitle.setTitleMaxLinesForce(2);
                break;
            default:
                gqh0 gqh0Var = (gqh0) obj3;
                sku0 sku0Var = (sku0) obj;
                sku0Var.getClass();
                DsSettingsCell dsSettingsCell2 = sku0Var.f32369a;
                dsSettingsCell2.setFirst(z3);
                dsSettingsCell2.setLast(z2);
                DsCellRightSwitch dsCellRightSwitch = sku0Var.c;
                dsCellRightSwitch.setOnCheckedChangeListener(null);
                boolean z4 = gqh0Var.b;
                boolean z5 = gqh0Var.c;
                dsCellRightSwitch.setChecked(z4);
                wwb.D(dsCellRightSwitch, new kqh0((Function1) obj2, gqh0Var, b2));
                DsCellMiddleTitle dsCellMiddleTitle2 = sku0Var.b;
                dsCellMiddleTitle2.setTitleMaxLinesForce(2);
                dsCellMiddleTitle2.setTitle(gqh0Var.d);
                dsCellMiddleTitle2.setSubtitle(gqh0Var.f);
                TypedValue typedValue2 = j5d.f15927a;
                Context context2 = dsCellMiddleTitle2.getContext();
                context2.getClass();
                if (gqh0Var.b) {
                    i = R.color.static_green;
                }
                dsCellMiddleTitle2.setSubtitleTextColor(context2.getColor(i));
                dsCellRightSwitch.setEnabled(z5);
                sku0Var.d.setVisibility(z2 ? 8 : 0);
                dsCellMiddleTitle2.setEnabled(z5);
                dsCellMiddleTitle2.setTitleMaxLinesForce(2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bt8(AggregatorGameScreens$AggregatorPreloadGameScreen aggregatorGameScreens$AggregatorPreloadGameScreen, boolean z, boolean z2, mlr mlrVar) {
        this.f3170a = (byte) 2;
        this.d = aggregatorGameScreens$AggregatorPreloadGameScreen;
        this.b = z;
        this.c = z2;
        this.e = mlrVar;
    }

    public /* synthetic */ bt8(boolean z, pn10 pn10Var, jo10 jo10Var, boolean z2) {
        this.f3170a = (byte) 1;
        this.b = z;
        this.d = pn10Var;
        this.e = jo10Var;
        this.c = z2;
    }

    public /* synthetic */ bt8(boolean z, boolean z2, hqh0 hqh0Var, Function1 function1, byte b) {
        this.f3170a = b;
        this.b = z;
        this.c = z2;
        this.d = hqh0Var;
        this.e = function1;
    }
}
