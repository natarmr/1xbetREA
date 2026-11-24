package a;

import android.content.Context;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class er90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8270a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8270a) {
            case 0:
                ((Integer) obj).getClass();
                return Boolean.TRUE;
            case 1:
                return new bee(((Boolean) obj).booleanValue());
            case 2:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 3:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 4:
                return Unit.f46060a;
            case 5:
                throw rw2.g(obj);
            case 6:
                o2a0 o2a0Var = (o2a0) obj;
                o2a0Var.getClass();
                return Float.valueOf(o2a0Var.f24523a);
            case 7:
                o2a0 o2a0Var2 = (o2a0) obj;
                o2a0Var2.getClass();
                return Float.valueOf(o2a0Var2.b);
            case 8:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(yyw.o0((tdn) it.next(), list.size() > 1));
                }
                return dyb.o0(arrayList);
            case 9:
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(yyw.o0((tdn) it2.next(), list2.size() > 1));
                }
                return dyb.o0(arrayList2);
            case 10:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 11:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 12:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 13:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 14:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 15:
                j6a0 j6a0Var = (j6a0) obj;
                j6a0Var.getClass();
                return j6a0Var.c;
            case 16:
                y130 y130Var = (y130) obj;
                y130Var.getClass();
                return new w6a0(y130Var);
            case 17:
                ((View) obj).getClass();
                return Unit.f46060a;
            case 18:
                ((View) obj).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((String) obj).getClass();
                return Unit.f46060a;
            case 20:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                long jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                long jD = fhlVar.d();
                float fMax = Math.max(Float.intBitsToFloat((int) ((jD >> 32) & 2147483647L)), Float.intBitsToFloat((int) (jD & 2147483647L))) / 2.0f;
                zcl zclVar = qmk.f28987a;
                fhl.E(fhlVar, jM121getTransparent0d7_KjU, fhlVar.w0(2.0f) + fMax, 0L, 0.0f, null, 60);
                return Unit.f46060a;
            case 21:
                ((ny20) obj).getClass();
                return Unit.f46060a;
            case 22:
                ((xgl0) obj).getClass();
                return Unit.f46060a;
            case 23:
                g8a0 g8a0Var = (g8a0) obj;
                g8a0Var.getClass();
                return g8a0Var.f10856a;
            case 24:
                jz30 jz30Var = (jz30) obj;
                jz30Var.getClass();
                return jz30Var.f17391a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            default:
                Context context = (Context) obj;
                context.getClass();
                TableViewImpl tableViewImpl = new TableViewImpl(context, null, 0);
                mla0 mla0Var = new mla0(tableViewImpl, true, R.dimen.text_12);
                mla0Var.l = tableViewImpl;
                tableViewImpl.setAdapter(mla0Var);
                return tableViewImpl;
        }
    }

    public /* synthetic */ er90(byte b) {
        this.f8270a = b;
    }
}
