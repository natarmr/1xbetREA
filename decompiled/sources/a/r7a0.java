package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.feature.promo_aggregator.impl.presentation.compose.PromoCodeCacheContentState;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r7a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29968a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r7a0(Object obj, Object obj2, byte b) {
        this.f29968a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Object krb0Var;
        Object value;
        byte b = this.f29968a;
        yje yjeVar = null;
        Object[] objArr = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                qjj.E((mm40) obj4, (t7a0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                kcx.n((mm40) obj4, (qhs0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                ydx.o((vea0) obj4, (x6f) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                cp cpVar = (cp) obj4;
                x6f x6fVar = (x6f) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ydx.o((vea0) cpVar.u(), x6fVar, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 4:
                cp cpVar2 = (cp) obj4;
                rpg rpgVar = (rpg) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    cww.i(null, (ifa0) cpVar2.u(), rpgVar, false, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                piz.s((f2a0) obj4, (f2a0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                ntr.L((g8a0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                mrv.S((mm40) obj4, (hca0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                mrv.P((jz30) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                ahy.G((sma0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                y860.I((mm40) obj4, (bra0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                Throwable th = (Throwable) obj4;
                f1b0 f1b0Var = (f1b0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                boolean z = th instanceof jfp;
                ctf0 ctf0Var = f1b0Var.t;
                if (z) {
                    f1b0Var.G(new vza0(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                } else {
                    f1b0Var.G(new tza0(jwb.G(th, ctf0Var)));
                }
                return Unit.f46060a;
            case 12:
                w4t w4tVar = (w4t) obj4;
                List list = (List) obj3;
                u2b0 u2b0Var = (u2b0) obj2;
                List<df40> list2 = u2b0Var.l;
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                for (df40 pe40Var : list2) {
                    if (pe40Var instanceof pe40) {
                        w4t w4tVar2 = ((pe40) pe40Var).f26833a;
                        if (w4tVar2.equals(w4tVar)) {
                            pe40Var = new pe40(w4tVar2, list.isEmpty() ? zxx.f45180a : new cyx(list));
                        }
                    }
                    arrayList.add(pe40Var);
                }
                return u2b0.a(u2b0Var, false, false, false, false, null, null, arrayList, 2047);
            case 13:
                ((Integer) obj2).getClass();
                cww.j((mm40) obj4, (lob0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                orb0 orb0Var = (orb0) obj4;
                ctf0 ctf0Var2 = orb0Var.n;
                uob0 uob0Var = orb0Var.s;
                Throwable th2 = (Throwable) obj3;
                Throwable th3 = (Throwable) obj;
                String str = (String) obj2;
                th3.getClass();
                str.getClass();
                if (th3 instanceof zhi0) {
                    String message = th3.getMessage();
                    if (message != null) {
                        str = message;
                    }
                    krb0Var = new krb0(j0x.R(uob0Var, str, ctf0Var2), !orb0Var.t);
                } else if (jcb.d0(th2) && !orb0Var.t) {
                    krb0Var = new jrb0(sa10.b(orb0Var.h, pb10.g, R.string.data_retrieval_error, 0, null, 28));
                } else {
                    if (jcb.d0(th2) && orb0Var.t) {
                        return Unit.f46060a;
                    }
                    krb0Var = new krb0(j0x.R(uob0Var, str, ctf0Var2), !orb0Var.t);
                }
                p7m0 p7m0Var = orb0Var.o;
                p7m0Var.getClass();
                p7m0Var.o(null, krb0Var);
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                d7x.i((mm40) obj4, (kxb0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                q1c0 q1c0Var = (q1c0) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e1c0.a(q1c0Var.c, function1, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                e1c0.a((mtl) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                d9x.s((z6c0) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = (org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) obj4;
                Throwable th4 = (Throwable) obj3;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((String) obj2).getClass();
                if ((th5 instanceof SocketTimeoutException) || (th5 instanceof ConnectException) || (th5 instanceof UnknownHostException) || (th5 instanceof zhi0) || (th5 instanceof IllegalArgumentException)) {
                    bVar.N();
                } else {
                    th4.printStackTrace();
                }
                return Unit.f46060a;
            case 20:
                org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar2 = (org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) obj4;
                String str2 = (String) obj3;
                Throwable th6 = (Throwable) obj;
                String str3 = (String) obj2;
                th6.getClass();
                str3.getClass();
                boolean z2 = th6 instanceof zhi0;
                if ((z2 && ((zhi0) th6).c == i2o.y2) || ((z2 && ((zhi0) th6).c == i2o.TooManyRequests) || (z2 && ((zhi0) th6).c == i2o.NotFound))) {
                    p7m0 p7m0Var2 = bVar2.i.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        bVar2.f.getClass();
                    } while (!p7m0Var2.m(value, iac0.a((iac0) value, PromoCodeCacheContentState.Error.f46658a, false, str3, str2, null, null, false, false, false, 8165)));
                    bVar2.p.e("CONTENT_STATE_KEY", ((iac0) bVar2.D()).b);
                } else if (!(th6 instanceof UnknownHostException)) {
                    sac.V(jiu0.a(bVar2), new wyb0((byte) 16), null, bVar2.r.c, new s9c0(bVar2, str3, yjeVar, objArr == true ? 1 : 0), 10);
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                xww.m((mm40) obj4, (fic0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                i4w0.e((vmc0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                i4w0.I((bnc0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                hew0.A((mm40) obj4, (muc0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                qrc0 qrc0Var = (qrc0) obj3;
                ctf0 ctf0Var3 = qrc0Var.F;
                String str4 = (String) obj2;
                ((Throwable) obj).getClass();
                str4.getClass();
                if (!(((Throwable) obj4) instanceof UnknownHostException)) {
                    qrc0Var.G(new uqc0(new DialogFields((CharSequence) ctf0Var3.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), (CharSequence) str4, (CharSequence) ctf0Var3.b.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, "SHOW_ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496)));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                hmw0.r((tsc0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                rl70 rl70Var = qwc0.Z1;
                ((qwc0) obj4).G0((Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                jh70 jh70Var = kxc0.Y1;
                ((kxc0) obj4).G0((Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                q5x.u((mm40) obj4, (hds) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ r7a0(Object obj, Object obj2, int i, byte b) {
        this.f29968a = b;
        this.b = obj;
        this.c = obj2;
    }
}
