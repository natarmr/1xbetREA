package a;

import android.gov.nist.core.LexerCore;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xg1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40819a;

    public /* synthetic */ xg1(int i) {
        this.f40819a = (byte) 16;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40819a) {
            case 0:
                return Unit.f46060a;
            case 1:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case 2:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 3:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case 4:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new dj1((byte) 3));
                function2.invoke(new c51((byte) 9));
                return Unit.f46060a;
            case 5:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 6:
                ((Long) obj).longValue();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 7:
                Integer num = (Integer) obj;
                num.intValue();
                ((pu1) obj2).getClass();
                return new Pair(pu1.class, num);
            case 8:
                Integer num2 = (Integer) obj;
                num2.intValue();
                nw1 nw1Var = (nw1) obj2;
                nw1Var.getClass();
                if (nw1Var instanceof mw1) {
                    return new Pair(nw1Var.getClass(), num2);
                }
                if (nw1Var instanceof lw1) {
                    return new Pair(nw1Var.getClass(), Long.valueOf(((lw1) nw1Var).f20739a));
                }
                t9f.b();
                return null;
            case 9:
                Integer num3 = (Integer) obj;
                num3.intValue();
                ((ot1) obj2).getClass();
                return num3;
            case 10:
                Integer num4 = (Integer) obj;
                num4.intValue();
                ((lu1) obj2).getClass();
                return num4;
            case 11:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 12:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 13:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 14:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new dj1((byte) 8));
                function4.invoke(new c51((byte) 17));
                return Unit.f46060a;
            case 15:
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                ccq0.B(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 17:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 18:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new dj1((byte) 16));
                function6.invoke(new c51((byte) 25));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Function1 function7 = (Function1) obj;
                Function1 function8 = (Function1) obj2;
                function7.getClass();
                function8.getClass();
                function7.invoke(a42.f202a);
                function8.invoke(new t32((byte) 0));
                return Unit.f46060a;
            case 20:
                Function1 function9 = (Function1) obj;
                Function1 function10 = (Function1) obj2;
                function9.getClass();
                function10.getClass();
                function9.invoke(b42.f1936a);
                function10.invoke(new c51((byte) 29));
                return Unit.f46060a;
            case 21:
                c52 c52Var = (c52) obj2;
                ((oyg0) obj).getClass();
                c52Var.getClass();
                List list = c52Var.d;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(un7.a((un7) it.next(), true));
                }
                return c52.a(c52Var, null, arrayList, null, 4087);
            case 22:
                c52 c52Var2 = (c52) obj2;
                ((oyg0) obj).getClass();
                c52Var2.getClass();
                List list2 = c52Var2.b;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(h0w.a((h0w) it2.next(), true));
                }
                return c52.a(c52Var2, arrayList2, null, null, LexerCore.ID_NO_WHITESPACE);
            case 23:
                c52 c52Var3 = (c52) obj2;
                ((oyg0) obj).getClass();
                c52Var3.getClass();
                List list3 = c52Var3.d;
                ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(un7.a((un7) it3.next(), true));
                }
                return c52.a(c52Var3, null, arrayList3, null, 4087);
            case 24:
                c52 c52Var4 = (c52) obj2;
                ((oyg0) obj).getClass();
                c52Var4.getClass();
                List list4 = c52Var4.b;
                ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(h0w.a((h0w) it4.next(), true));
                }
                return c52.a(c52Var4, arrayList4, null, null, LexerCore.ID_NO_WHITESPACE);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                oyg0 oyg0Var = (oyg0) obj;
                g72 g72Var = (g72) obj2;
                oyg0Var.getClass();
                g72Var.getClass();
                xun xunVar = xun.f41520a;
                q7x.F(oyg0Var, xunVar, "KEY_SELECTED_IDS");
                q7x.F(oyg0Var, Boolean.FALSE, "KEY_SELECTION_ENABLE");
                return g72.a(g72Var, null, null, false, null, false, false, false, false, false, xunVar, null, null, 425983);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return Unit.f46060a;
        }
    }

    public /* synthetic */ xg1(byte b) {
        this.f40819a = b;
    }
}
