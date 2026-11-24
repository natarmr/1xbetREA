package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d4u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5475a;

    public /* synthetic */ d4u0(byte b) {
        this.f5475a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 6;
        switch (this.f5475a) {
            case 0:
                jge0 jge0Var = (jge0) obj;
                return new s73(jge0Var.f16474a, jge0Var.b, jge0Var.c, jge0Var.d);
            case 1:
                s73 s73Var = (s73) obj;
                return new jge0(s73Var.f31731a, s73Var.b, s73Var.c, s73Var.d);
            case 2:
                return Float.valueOf(((p73) obj).f26486a);
            case 3:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.E(fhlVar, s6t0.b().f33626a.getSecondary(), 4.0f, 0L, 0.0f, null, 124);
                return Unit.f46060a;
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 5:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 6:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 7:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 8:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 9:
                obj.getClass();
                return Boolean.TRUE;
            case 10:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 11:
                ((yfu0) obj).getClass();
                return Unit.f46060a;
            case 12:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new tpu0(sjdVar);
            case 13:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.d = j1g.SYNTHETIC;
                n1gVar.e = new tq2();
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_REGULAR;
                return Unit.f46060a;
            case 14:
                axu0 axu0Var = (axu0) obj;
                axu0Var.getClass();
                boolean z = axu0Var.f1639a;
                String str = axu0Var.c;
                if (!z || str.length() <= 0) {
                    return "";
                }
                pn40 pn40Var = pn40.f27267a;
                return pn40.d(axu0Var.b, str, p3u0.c);
            case 15:
                axu0 axu0Var2 = (axu0) obj;
                axu0Var2.getClass();
                String str2 = axu0Var2.e;
                if (str2.length() <= 0) {
                    return "";
                }
                pn40 pn40Var2 = pn40.f27267a;
                return pn40.d(axu0Var2.d, str2, p3u0.c);
            case 16:
                a0v0 a0v0Var = (a0v0) obj;
                a0v0Var.getClass();
                if (a0v0Var instanceof zzu0) {
                    return "header_" + ((zzu0) a0v0Var).b;
                }
                if (a0v0Var instanceof yzu0) {
                    return h97.h(((yzu0) a0v0Var).f43533a, "account_");
                }
                t9f.b();
                return null;
            case 17:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new pgj0(cpVar, cpVar, (byte) 21));
                return Unit.f46060a;
            case 18:
                ((v870) obj).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 20:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case 21:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 22:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case 23:
                uxs0 uxs0Var = ccv0.Q1;
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(ro4.m0(Response.OK, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(Response.OK, 0, null, 6), 2));
            case 24:
                dqk0 dqk0Var = (dqk0) obj;
                dqk0Var.getClass();
                if (dqk0Var instanceof bqk0) {
                    return dqk0Var;
                }
                if (!(dqk0Var instanceof cqk0)) {
                    t9f.b();
                    return null;
                }
                Iterable iterable = (Iterable) ((cqk0) dqk0Var).f4798a;
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ifb) it.next()).getClass());
                }
                return arrayList;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new a8u0(cpVar2, b));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new a8u0(cpVar3, (byte) 7));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                for (int i = 0; i < 3; i++) {
                    hcz.e(hczVar, null, null, y0x0.g, 3);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b(0.99f);
                return Unit.f46060a;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                wxs0 wxs0Var = bgv0.L1;
                throw null;
        }
    }

    public /* synthetic */ d4u0(Object obj, byte b) {
        this.f5475a = b;
    }
}
