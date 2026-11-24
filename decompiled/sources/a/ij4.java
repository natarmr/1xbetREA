package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.javax.sip.message.Response;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.right.DsCellRightListCheckBox;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ij4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14854a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = true;
        byte b = 0;
        switch (this.f14854a) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.u(fhlVar, StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 1:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L));
                zcl zclVar = qmk.f28987a;
                return pi9Var.a(new lf4((byte) 1, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - (pi9Var.getDensity() * 20.0f))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)) / 3.0f)) & 4294967295L)));
            case 2:
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pi9Var2.f27033a.d() & 4294967295L));
                zcl zclVar2 = qmk.f28987a;
                return pi9Var2.a(new lf4((byte) 2, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - (pi9Var2.getDensity() * 20.0f))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var2.f27033a.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var2.f27033a.d() & 4294967295L)) / 3.0f)) & 4294967295L)));
            case 3:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                bzu bzuVar = new bzu((byte) 23);
                bzuVar.g("static");
                bzuVar.g("img");
                bzuVar.g("android");
                bzuVar.g("actions");
                bzuVar.g("alt_design");
                bzuVar.g("authorization");
                bzuVar.g("visual_style");
                bzuVar.g("background_picture");
                bzuVar.g(iIntValue + ".svg");
                return ((StringBuilder) bzuVar.b).toString();
            case 5:
                List list = (List) obj;
                list.getClass();
                if (list.size() > 5) {
                    lc00 lc00VarB = kotlin.collections.a.b();
                    List listSubList = list.subList(0, 4);
                    ArrayList arrayList = new ArrayList(r3d.q(listSubList, 10));
                    Iterator it = listSubList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ju70.V((u54) it.next()));
                    }
                    lc00VarB.addAll(arrayList);
                    lc00VarB.add(ri4.f30520a);
                    return kotlin.collections.a.a(lc00VarB);
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(ju70.V((u54) it2.next()));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((si4) obj2).f32245a != 0) {
                        arrayList3.add(obj2);
                    }
                }
                return arrayList3;
            case 6:
                ((fhl) obj).getClass();
                return Unit.f46060a;
            case 7:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 8:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 9:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 8, null, null, aad.f, 6);
                return Unit.f46060a;
            case 10:
                q84 q84Var = (q84) obj;
                q84Var.getClass();
                return q84Var.f28282a;
            case 11:
                ((q84) obj).getClass();
                return sre0.f32672a.b(q84.class);
            case 12:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 13:
                ((a9q0) obj).getClass();
                return Unit.f46060a;
            case 14:
                ((a9q0) obj).getClass();
                return Unit.f46060a;
            case 15:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 16:
                int iIntValue2 = ((Integer) obj).intValue();
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                xuzVar.getClass();
                return new mdm(xuz.a(pb10Var, iIntValue2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 17:
                int iIntValue3 = ((Integer) obj).intValue();
                xuz xuzVar2 = pb10.c;
                pb10 pb10Var2 = pb10.e;
                xuzVar2.getClass();
                return new mdm(xuz.a(pb10Var2, iIntValue3), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
            case 18:
                df5 df5Var = (df5) obj;
                df5Var.getClass();
                vfc.J(df5Var);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((df5) obj).b1();
                return Unit.f46060a;
            case 20:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new rn5(cpVar, b));
                return Unit.f46060a;
            case 21:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                Context context = cpVar2.f40887a.getContext();
                context.getClass();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((cg3) cpVar2.u).b, (Property<AppCompatImageView, Float>) View.ROTATION, 0.0f, context.getResources().getConfiguration().getLayoutDirection() == 1 ? -360.0f : 360.0f);
                objectAnimatorOfFloat.setDuration(2000L);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                cpVar2.t(new go5(cpVar2, objectAnimatorOfFloat, cpVar2, objectAnimatorOfFloat, (byte) 0));
                cpVar2.x(new eo5(cpVar2, objectAnimatorOfFloat, (byte) 0));
                cpVar2.y(new fo5(objectAnimatorOfFloat, (byte) 0));
                fo5 fo5Var = new fo5(objectAnimatorOfFloat, (byte) 1);
                if (cpVar2.z != null) {
                    jf4.n("onFailedToRecycleView { ... } is already defined. Only one onFailedToRecycleView { ... } is allowed.");
                    return null;
                }
                cpVar2.z = fo5Var;
                cpVar2.z(new fo5(objectAnimatorOfFloat, (byte) 2));
                return Unit.f46060a;
            case 22:
                ko5 ko5Var = (ko5) obj;
                ko5Var.getClass();
                return ko5Var.f18614a;
            case 23:
                ((ko5) obj).getClass();
                return sre0.f32672a.b(ko5.class);
            case 24:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                obj.getClass();
                return new sx3((Set) obj, (byte) 1);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                xs5 xs5Var = (xs5) obj;
                xs5Var.getClass();
                return String.valueOf(xs5Var.f41399a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                View view = (View) obj;
                view.getClass();
                if (!(view instanceof DsCellRightListCheckBox) && !(view instanceof DsCellRightSwitch)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ((px40) obj).getClass();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ij4(byte b) {
        this.f14854a = b;
    }
}
