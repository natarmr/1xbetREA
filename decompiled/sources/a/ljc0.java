package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ljc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20143a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object rpc0Var;
        Object rhc0Var;
        switch (this.f20143a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case 5:
                rnc0 rnc0Var = (rnc0) obj;
                rnc0Var.getClass();
                return Integer.valueOf(rnc0Var.f30783a.f11874a);
            case 6:
                wpc0 wpc0Var = (wpc0) obj;
                wpc0Var.getClass();
                boolean z = wpc0Var.b;
                List list = wpc0Var.e;
                String str = wpc0Var.f39538a;
                if (z) {
                    return new upc0(str);
                }
                if (wpc0Var.c) {
                    rpc0Var = new tpc0(str, wpc0Var.d);
                } else {
                    if (list.isEmpty()) {
                        return new spc0(str);
                    }
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(s0x.e0((vrc0) it.next()));
                    }
                    rpc0Var = new rpc0(str, arrayList);
                }
                return rpc0Var;
            case 7:
                erc0 erc0Var = (erc0) obj;
                erc0Var.getClass();
                boolean z2 = erc0Var instanceof crc0;
                fmm fmmVar = fmm.f9790a;
                mlm mlmVar = mlm.f21997a;
                jlm jlmVar = jlm.f16723a;
                if (z2) {
                    crc0 crc0Var = (crc0) erc0Var;
                    String str2 = crc0Var.b;
                    String str3 = crc0Var.f4839a;
                    pz40 pz40Var = s6t0.f31722a;
                    rhc0Var = new qhc0(str3, str2, s6t0.b().f33626a.getBackground(), new imm(jlmVar, mlmVar, fmmVar, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), false, null), d2j.a(str2));
                } else {
                    if (!(erc0Var instanceof drc0)) {
                        t9f.b();
                        return null;
                    }
                    drc0 drc0Var = (drc0) erc0Var;
                    String str4 = drc0Var.b;
                    hds hdsVar = drc0Var.f6554a;
                    pz40 pz40Var2 = s6t0.f31722a;
                    rhc0Var = new rhc0(hdsVar, str4, s6t0.b().f33626a.getBackground(), new imm(jlmVar, mlmVar, fmmVar, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), false, null), d2j.a(str4));
                }
                return rhc0Var;
            case 8:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 9:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                x0x.s(((y2k) cpVar.u).f41908a);
                return Unit.f46060a;
            case 10:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new ui80(cpVar2, (byte) 15));
                return Unit.f46060a;
            case 11:
                obj.getClass();
                return (Set) obj;
            case 12:
                cuc0 cuc0Var = (cuc0) obj;
                cuc0Var.getClass();
                return Long.valueOf(cuc0Var.getId());
            case 13:
                cuc0 cuc0Var2 = (cuc0) obj;
                cuc0Var2.getClass();
                return sre0.f32672a.b(cuc0Var2.getClass());
            case 14:
                return Boolean.FALSE;
            case 15:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 16:
                ((List) obj).getClass();
                return Unit.f46060a;
            case 17:
                int iIntValue = ((Integer) obj).intValue();
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                xuzVar.getClass();
                return new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 18:
                int iIntValue2 = ((Integer) obj).intValue();
                xuz xuzVar2 = pb10.c;
                pb10 pb10Var2 = pb10.e;
                xuzVar2.getClass();
                return new mdm(xuz.a(pb10Var2, iIntValue2), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                g7z g7zVar = (g7z) obj;
                nr nrVar = g7zVar.f10839a.b;
                long jP = nrVar.p();
                nrVar.i().l();
                try {
                    ((fvt0) nrVar.b).k(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    g7zVar.a();
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVar, jP);
                }
            case 20:
                Float f = (Float) obj;
                f.getClass();
                return new d9d0(new t33(f, hp4.j, null, 12));
            case 21:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case 22:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                th8.printStackTrace();
                return Unit.f46060a;
            case 23:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                th9.printStackTrace();
                return Unit.f46060a;
            case 24:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                th10.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                th11.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((kba) obj).getClass();
                return sre0.f32672a.b(kba.class);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.a(abi0Var, StaticColors.INSTANCE.m126getWhite200d7_KjU());
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                th12.printStackTrace();
                return Unit.f46060a;
            default:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ljc0(byte b) {
        this.f20143a = b;
    }
}
