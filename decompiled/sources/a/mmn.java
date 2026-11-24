package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mmn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22047a;

    public /* synthetic */ mmn(byte b) {
        this.f22047a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 4;
        u7k0 u7k0Var = null;
        byte b = 0;
        switch (this.f22047a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                return new kaj(context);
            case 1:
                e530 e530Var = (e530) obj;
                e530Var.getClass();
                return Long.valueOf(e530Var.f7212a);
            case 2:
                return Unit.f46060a;
            case 3:
                return Boolean.FALSE;
            case 4:
                return obj + Separators.COLON + sre0.f32672a.b(obj.getClass());
            case 5:
                a2n a2nVar = (a2n) obj;
                a2nVar.getClass();
                return a2nVar.getKey();
            case 6:
                a2n a2nVar2 = (a2n) obj;
                a2nVar2.getClass();
                return sre0.f32672a.b(a2nVar2.getClass());
            case 7:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new v3o(sjdVar);
            case 8:
                xa30 xa30Var = (xa30) obj;
                xa30Var.getClass();
                return new i6o(xa30Var);
            case 9:
                wus wusVar = (wus) obj;
                wusVar.getClass();
                return new j6o(wusVar);
            case 10:
                ((es10) obj).getClass();
                return Unit.f46060a;
            case 11:
                ((bmg) obj).getClass();
                return Unit.f46060a;
            case 12:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 5, null, null, y9a.b, 6);
                return Unit.f46060a;
            case 13:
                sjd sjdVar2 = (sjd) obj;
                sjdVar2.getClass();
                return new w8o(sjdVar2);
            case 14:
                int i2 = EventCardHeader.A;
                ((Drawable) obj).getClass();
                return Unit.f46060a;
            case 15:
                int i3 = EventCardHeader.A;
                ((Drawable) obj).getClass();
                return Unit.f46060a;
            case 16:
                List list = (List) obj;
                ArrayList arrayListU = twn.u(list);
                for (Object obj2 : list) {
                    if (((uog) obj2).b.length() > 0) {
                        arrayListU.add(obj2);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList<uog> arrayList = new ArrayList();
                for (Object obj3 : arrayListU) {
                    if (hashSet.add(Integer.valueOf(((uog) obj3).f36012a))) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.isEmpty()) {
                    return iun.f15405a;
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (uog uogVar : arrayList) {
                    int i4 = uogVar.f36012a;
                    String str = uogVar.c;
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String str2 = uogVar.l;
                    if (str2.length() == 0) {
                        sb.setLength(0);
                    } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                        sb.setLength(0);
                        sb.append(str2);
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0(str2, '/'));
                    }
                    arrayList2.add(new y8m(i4, str, new n0x(sb.toString()), uogVar.b, false));
                }
                return kotlin.collections.a.c(new zbo(new g9m(dyb.r0(arrayList2))));
            case 17:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(16.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                pz40 pz40Var = s6t0.f31722a;
                fhl.o0(fhlVar, s6t0.b().f33626a.getBackground(), 0L, 0L, jFloatToRawIntBits, null, 246);
                return Unit.f46060a;
            case 18:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.h(1);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((c53) obj).getClass();
                return new lie(kzn.f(ro4.m0(150, 150, null, 4), 0.0f, 6), kzn.g(ro4.m0(150, 0, null, 6), 0.0f, 6), u7k0Var, i);
            case 20:
                ((c53) obj).getClass();
                return new lie(kzn.f(ro4.m0(150, 150, null, 4), 0.0f, 6), kzn.g(ro4.m0(150, 0, null, 6), 0.0f, 6), u7k0Var, i);
            case 21:
                c53 c53Var = (c53) obj;
                c53Var.getClass();
                return c53Var.a(ay3.e0(kzn.d(null, 1.0f, 1), kzn.e(null, 3)), ay3.F(null, 2));
            case 22:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 23:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 24:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new kgh(cpVar, (byte) 15));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((x2p) obj).getClass();
                return sre0.f32672a.b(x2p.class);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.g(hczVar2, 10, null, null, tke.b, 6);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((FavoriteGroupHeaderUiItem) obj).getClass();
                return Unit.f46060a;
            default:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new e4p(b));
                return Unit.f46060a;
        }
    }
}
