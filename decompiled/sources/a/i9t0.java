package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i9t0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14405a;

    public /* synthetic */ i9t0(byte b) {
        this.f14405a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14405a) {
            case 0:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(833465673);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 1:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(1931718496);
                xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA2;
            case 2:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(1182393147);
                xcz xczVarA3 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA3;
            case 3:
                fet fetVar4 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar4.e0(416163860);
                xcz xczVarA4 = ddz.a(0, 0, fetVar4, 0, 3);
                fetVar4.r(false);
                return xczVarA4;
            case 4:
                fet fetVar5 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar5.e0(1802694016);
                xcz xczVarA5 = ddz.a(0, 0, fetVar5, 0, 3);
                fetVar5.r(false);
                return xczVarA5;
            case 5:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new qzs0((byte) 5));
                function2.invoke(new xns0((byte) 19));
                return Unit.f46060a;
            case 6:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.delegate_unsupported_message, viewGroup, false);
                TextView textView = (TextView) yum0.f(viewF, R.id.txtMessage);
                if (textView != null) {
                    return new e3k((LinearLayout) viewF, textView);
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(R.id.txtMessage)));
                return null;
            case 7:
                gqw0.z.invoke(obj);
                return Unit.f46060a;
            case 8:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 9:
                b0u0 b0u0Var = (b0u0) obj2;
                ((oyg0) obj).getClass();
                b0u0Var.getClass();
                vzt0 vzt0Var = b0u0Var.j;
                return b0u0.a(b0u0Var, null, null, null, null, null, null, false, vzt0.a(vzt0Var, null, 0L, 0L, !vzt0Var.d, 7), null, null, false, null, false, false, null, null, 33553919);
            case 10:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new qzs0((byte) 12));
                function4.invoke(new o1u0((byte) 1));
                return Unit.f46060a;
            case 11:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new qzs0((byte) 14));
                function6.invoke(new o1u0((byte) 2));
                return Unit.f46060a;
            case 12:
                wgv wgvVar = (wgv) obj;
                wgvVar.f = (List) obj2;
                wgvVar.g = true;
                wgvVar.c();
                return Unit.f46060a;
            case 13:
                a290 a290Var = (a290) obj;
                a290Var.h = ((wtm0) obj2).f39749a;
                a290Var.o = true;
                a290Var.c();
                return Unit.f46060a;
            case 14:
                a290 a290Var2 = (a290) obj;
                a290Var2.j = ((Float) obj2).floatValue();
                a290Var2.o = true;
                a290Var2.c();
                return Unit.f46060a;
            case 15:
                a290 a290Var3 = (a290) obj;
                a290Var3.k = ((Float) obj2).floatValue();
                a290Var3.p = true;
                a290Var3.c();
                return Unit.f46060a;
            case 16:
                a290 a290Var4 = (a290) obj;
                a290Var4.l = ((Float) obj2).floatValue();
                a290Var4.p = true;
                a290Var4.c();
                return Unit.f46060a;
            case 17:
                a290 a290Var5 = (a290) obj;
                a290Var5.m = ((Float) obj2).floatValue();
                a290Var5.p = true;
                a290Var5.c();
                return Unit.f46060a;
            case 18:
                ((a290) obj).c();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                a290 a290Var6 = (a290) obj;
                a290Var6.d = (List) obj2;
                a290Var6.n = true;
                a290Var6.c();
                return Unit.f46060a;
            case 20:
                a290 a290Var7 = (a290) obj;
                a290Var7.s.j(((c290) obj2).f3615a);
                a290Var7.c();
                return Unit.f46060a;
            case 21:
                a290 a290Var8 = (a290) obj;
                a290Var8.b = (t89) obj2;
                a290Var8.c();
                return Unit.f46060a;
            case 22:
                a290 a290Var9 = (a290) obj;
                a290Var9.c = ((Float) obj2).floatValue();
                a290Var9.c();
                return Unit.f46060a;
            case 23:
                a290 a290Var10 = (a290) obj;
                a290Var10.g = (t89) obj2;
                a290Var10.c();
                return Unit.f46060a;
            case 24:
                a290 a290Var11 = (a290) obj;
                a290Var11.e = ((Float) obj2).floatValue();
                a290Var11.c();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                a290 a290Var12 = (a290) obj;
                a290Var12.f = ((Float) obj2).floatValue();
                a290Var12.o = true;
                a290Var12.c();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                a290 a290Var13 = (a290) obj;
                a290Var13.i = ((ytm0) obj2).f43226a;
                a290Var13.o = true;
                a290Var13.c();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wgv wgvVar2 = (wgv) obj;
                wgvVar2.k = (String) obj2;
                wgvVar2.c();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wgv wgvVar3 = (wgv) obj;
                wgvVar3.l = ((Float) obj2).floatValue();
                wgvVar3.s = true;
                wgvVar3.c();
                return Unit.f46060a;
            default:
                wgv wgvVar4 = (wgv) obj;
                wgvVar4.m = ((Float) obj2).floatValue();
                wgvVar4.s = true;
                wgvVar4.c();
                return Unit.f46060a;
        }
    }
}
