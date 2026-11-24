package a;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.app_update.api.presentation.AppUpdateScreenParams;
import org.xplatform.app_update.impl.navigation.AppUpdateScreenFacadeImpl$getLockScreen$1;
import org.xplatform.app_update.impl.navigation.AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;
import org.xplatform.app_update.impl.presentation.update_screen.views.AppUpdateScreenLayout;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneCellGameView;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneGameView;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.wallet.impl.navigation.WalletsScreen$WalletsScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b33 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1882a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b33(im3 im3Var, gr00 gr00Var) {
        this.f1882a = (byte) 4;
        this.b = im3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [a.zb5] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r5v13 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? arrayList;
        List<jdw> list;
        byte b = this.f1882a;
        byte b2 = 2;
        byte b3 = 10;
        byte b4 = 0;
        ?? I = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) obj2;
                I = eVar != null ? eVar.I(((FragmentContainerView) obj).getId()) : 0;
                if (I != 0 && !eVar.a0()) {
                    ?? zb5Var = new zb5(eVar);
                    zb5Var.n(I);
                    zb5Var.h();
                }
                return Unit.f46060a;
            case 1:
                ((e7z) obj2).a0((w6k) obj);
                return Unit.f46060a;
            case 2:
                o93 o93Var = (o93) obj;
                pek0 pek0Var = q93.Q1;
                o93Var.getClass();
                ((k3t0) ((q93) obj2).M1.getValue()).x(o93Var);
                return Unit.f46060a;
            case 3:
                List list2 = (List) obj;
                list2.getClass();
                long jLongValue = ((Number) ((fee) ((n0o0) ((db2) obj2).b).getValue()).c()).longValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((vcw) obj3).f37207a == jLongValue) {
                        arrayList2.add(obj3);
                    }
                }
                vcw vcwVar = (vcw) CollectionsKt.firstOrNull(arrayList2);
                if (vcwVar == null || (list = vcwVar.c) == null) {
                    arrayList = iun.f15405a;
                } else {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (jdw jdwVar : list) {
                        jdwVar.getClass();
                        long j = jdwVar.f16349a;
                        String str = jdwVar.b;
                        StaticColors staticColors = StaticColors.INSTANCE;
                        b2l0 b2l0Var = new b2l0(str, staticColors.m123getWhite0d7_KjU());
                        d4d d4dVar = d4d.CYBER_GRAY_TON7;
                        zcl zclVar = qmk.f28987a;
                        l3l0 l3l0Var = new l3l0(16.0f);
                        p1l0 p1l0Var = p1l0.FAVORITE_ICON;
                        String strValueOf = jdwVar.e;
                        if (strValueOf.length() == 0) {
                            strValueOf = String.valueOf(j);
                        }
                        arrayList.add(new qa5(j, new zrm(b2l0Var, new t1l0(p1l0Var, null, strValueOf, null, null, null, 250), new v2l0(staticColors.m130getWhite600d7_KjU()), d4dVar, l3l0Var, 32)));
                    }
                }
                return arrayList.isEmpty() ? iun.f15405a : arrayList;
            case 4:
                im3 im3Var = (im3) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                if (im3Var instanceof gm3) {
                    gm3 gm3Var = (gm3) im3Var;
                    boolean z = gm3Var.b;
                    AppUpdateScreenFactoryImpl$getAppUpdateScreen$1 appUpdateScreenFactoryImpl$getAppUpdateScreen$1 = new AppUpdateScreenFactoryImpl$getAppUpdateScreen$1(new AppUpdateScreenParams(gm3Var.f11523a, z, gm3Var.c));
                    if (z) {
                        k0w0Var.b(new y0w0(appUpdateScreenFactoryImpl$getAppUpdateScreen$1));
                    } else {
                        k0w0Var.h(appUpdateScreenFactoryImpl$getAppUpdateScreen$1);
                    }
                } else {
                    if (!(im3Var instanceof hm3)) {
                        t9f.b();
                        return null;
                    }
                    k0w0Var.h(new AppUpdateScreenFacadeImpl$getLockScreen$1());
                }
                return Unit.f46060a;
            case 5:
                int i = AppUpdateScreenLayout.A;
                ((View) obj).getClass();
                Function0 function0 = ((AppUpdateScreenLayout) obj2).y;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 6:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = ((fo3) obj2).h;
                p7m0Var.getClass();
                p7m0Var.o(null, wn3.f39429a);
                return Unit.f46060a;
            case 7:
                int i2 = AppleFortuneCellGameView.u;
                ((View) obj).getClass();
                ((tp3) obj2).invoke();
                return Unit.f46060a;
            case 8:
                AppleFortuneGameView appleFortuneGameView = (AppleFortuneGameView) obj2;
                View view = (View) obj;
                int i3 = AppleFortuneGameView.t;
                view.getClass();
                sab sabVar = (sab) view;
                if (appleFortuneGameView.n == sabVar.getRow() && appleFortuneGameView.h && ((Boolean) appleFortuneGameView.f46347a.invoke(Integer.valueOf(sabVar.getColumn()))).booleanValue()) {
                    sab.u(R.drawable.grass_arrow_active_cell, (sab) ((List) appleFortuneGameView.i.get(sabVar.getRow())).get(sabVar.getColumn() - 1));
                    appleFortuneGameView.r = sabVar;
                }
                return Unit.f46060a;
            case 9:
                kq3 kq3Var = (kq3) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                sac.V(jiu0.a(kq3Var), aq3.f1278a, null, kq3Var.f.f22085a, new bq3(kq3Var, I, b4), 10);
                kq3Var.w(new xy5(false));
                kq3Var.C(th);
                return Unit.f46060a;
            case 10:
                f04 f04Var = (f04) obj2;
                h7d h7dVar = (h7d) obj;
                h7dVar.getClass();
                p7m0 p7m0Var2 = f04Var.e;
                mfr mfrVar = f04Var.p;
                if (((Boolean) p7m0Var2.getValue()).booleanValue()) {
                    Handler handler = (Handler) f04Var.o.getValue();
                    handler.removeCallbacks(mfrVar);
                    ((AtomicReference) mfrVar.b).set(h7dVar);
                    handler.post(mfrVar);
                } else {
                    Iterator it = f04Var.m.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(h7dVar);
                    }
                }
                return Unit.f46060a;
            case 11:
                k14 k14Var = (k14) obj2;
                TypedArray typedArray = (TypedArray) obj;
                typedArray.getClass();
                int i4 = k14Var.e;
                View view2 = k14Var.f17500a;
                k14Var.e = typedArray.getDimensionPixelOffset(34, i4);
                Integer numL = ktt0.l(typedArray, 2);
                if (numL != null) {
                    int iIntValue = numL.intValue();
                    Drawable background = view2.getBackground();
                    GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                    if (gradientDrawable != null) {
                        gradientDrawable.mutate();
                        gradientDrawable.setColor(iIntValue);
                    }
                }
                if (k14Var.f) {
                    if (view2.isAttachedToWindow()) {
                        ViewParent parent = view2.getParent();
                        ViewParent parent2 = parent != null ? parent.getParent() : null;
                        k14Var.f(parent2 instanceof View ? (View) parent2 : null, (View) k14Var.h.get());
                    } else {
                        view2.addOnAttachStateChangeListener(new j14(view2, k14Var, b4));
                    }
                }
                return Unit.f46060a;
            case 12:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                ((zzj) cpVar.u).b.setOnClickListener(new wg(obj2, (Object) cpVar, (byte) 4));
                cpVar.t(new j9(cpVar, (byte) 19));
                return Unit.f46060a;
            case 13:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                gfk0 gfk0Var = d54.R1;
                ((d54) obj2).G0().x(new y44(zBooleanValue));
                return Unit.f46060a;
            case 14:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                dyb.O(((bsx) cpVar2.u).d, new ys3((bk2) obj2, cpVar2, b2));
                cpVar2.t(new j9(cpVar2, (byte) 20));
                return Unit.f46060a;
            case 15:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                abi0Var.b(cbi0.b, Integer.valueOf(((ra4) obj2).f30115a));
                return Unit.f46060a;
            case 16:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                mi70 mi70Var = ((kd4) obj2).b;
                k0w0Var2.h(new BindPhoneNumberScreen(new i38(17)));
                return Unit.f46060a;
            case 17:
                hl4 hl4Var = (hl4) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                hl4Var.d.b(th2, new fa2(hl4Var, b3));
                return Unit.f46060a;
            case 18:
                il4 il4Var = (il4) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                il4Var.d.b(th3, new fa2((Object) il4Var, (byte) 11));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Boolean.valueOf(Intrinsics.d(((ob50) obj).b, ((ob50) obj2).b));
            case 20:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                qgd qgdVar = (qgd) ((kb0) obj2).o;
                xuz xuzVar = sb50.f31916a;
                qgdVar.getClass();
                k0w0Var3.h(new WalletsScreen$WalletsScreen("addbalance"));
                return Unit.f46060a;
            case 21:
                tjz tjzVar = (tjz) obj;
                gfk0 gfk0Var2 = ii5.O1;
                tjzVar.getClass();
                ((ii5) obj2).J0().L(tjzVar);
                return Unit.f46060a;
            case 22:
                ((ro5) obj2).l = null;
                return Boolean.FALSE;
            case 23:
                ((rr5) obj2).o = null;
                return Boolean.FALSE;
            case 24:
                ((tr5) obj2).k = null;
                return Boolean.FALSE;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((wr5) obj2).l = null;
                return Boolean.FALSE;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((yr5) obj2).h = null;
                return Boolean.FALSE;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((fs5) obj2).g = null;
                return Boolean.FALSE;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((hs5) obj2).h = null;
                return Boolean.FALSE;
            default:
                ((ms5) obj2).f = null;
                return Boolean.FALSE;
        }
    }

    public /* synthetic */ b33(Object obj, byte b) {
        this.f1882a = b;
        this.b = obj;
    }
}
