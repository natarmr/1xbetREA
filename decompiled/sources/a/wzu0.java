package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wzu0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40036a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wzu0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f40036a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object g0g0Var;
        Object g0g0Var2;
        int i;
        byte b = 1;
        ?? r3 = 0;
        switch (this.f40036a) {
            case 0:
                pzu0 pzu0Var = (pzu0) obj;
                pzu0Var.getClass();
                ((k3t0) this.receiver).x(pzu0Var);
                return Unit.f46060a;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((u0v0) this.receiver).M(th);
                return Unit.f46060a;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((u0v0) this.receiver).M(th2);
                return Unit.f46060a;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((u0v0) this.receiver).M(th3);
                return Unit.f46060a;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((u0v0) this.receiver).M(th4);
                return Unit.f46060a;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((u0v0) this.receiver).M(th5);
                return Unit.f46060a;
            case 6:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((u0v0) this.receiver).M(th6);
                return Unit.f46060a;
            case 7:
                String str = (String) obj;
                str.getClass();
                o3v0 o3v0Var = (o3v0) this.receiver;
                o3v0Var.getClass();
                try {
                    e0g0 e0g0Var = j0g0.b;
                    vby vbyVar = o3v0Var.f24604a;
                    vbyVar.getClass();
                    g0g0Var = l8x.r0((ww70) vbyVar.b(ww70.Companion.serializer(), str));
                    break;
                } catch (Throwable th7) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th7);
                }
                return (String) (g0g0Var instanceof g0g0 ? 0 : g0g0Var);
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                r3v0 r3v0Var = (r3v0) this.receiver;
                r3v0Var.getClass();
                try {
                    e0g0 e0g0Var3 = j0g0.b;
                    vby vbyVar2 = r3v0Var.f29804a;
                    vbyVar2.getClass();
                    g0g0Var2 = l8x.r0((ww70) vbyVar2.b(ww70.Companion.serializer(), str2));
                    break;
                } catch (Throwable th8) {
                    e0g0 e0g0Var4 = j0g0.b;
                    g0g0Var2 = new g0g0(th8);
                }
                return (String) (g0g0Var2 instanceof g0g0 ? null : g0g0Var2);
            case 9:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                d7v0 d7v0Var = (d7v0) this.receiver;
                d7v0Var.y(new t6v0(sa10.b(d7v0Var.j, pb10.g, R.string.data_retrieval_error, 0, null, 28)));
                d7v0Var.f.a(th9);
                return Unit.f46060a;
            case 10:
                d9v0 d9v0Var = (d9v0) obj;
                d9v0Var.getClass();
                v8v0 v8v0Var = (v8v0) this.receiver;
                bzs0 bzs0Var = v8v0.P1;
                v8v0Var.getClass();
                if (d9v0Var instanceof b9v0) {
                    ccq0.V(v8v0Var, "SHOW_CHANGE_BONUS_ERROR_REQUEST_KEY", new t8v0(v8v0Var, (byte) 2));
                    ii iiVar = v8v0Var.M1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = v8v0Var.H(R.string.error);
                    String strH2 = v8v0Var.H(R.string.registration_bonus_participation_error_message);
                    n12 n12Var = n12.b;
                    String strH3 = v8v0Var.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "SHOW_CHANGE_BONUS_ERROR_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12Var, false, 1496);
                    androidx.fragment.app.e eVarC = v8v0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else {
                    ccq0.V(v8v0Var, "UNKNOWN_ERROR_DIALOG_KEY", new t8v0(v8v0Var, b));
                    ii iiVar2 = v8v0Var.M1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = v8v0Var.H(R.string.error);
                    String strH5 = v8v0Var.H(R.string.daily_task_update_error);
                    n12 n12Var2 = n12.b;
                    String strH6 = v8v0Var.H(R.string.ok_new);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, "UNKNOWN_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12Var2, false, 1496);
                    androidx.fragment.app.e eVarC2 = v8v0Var.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                }
                ((k3t0) v8v0Var.O1.getValue()).x(l8v0.f19622a);
                return Unit.f46060a;
            case 11:
                o8v0 o8v0Var = (o8v0) obj;
                o8v0Var.getClass();
                ((k3t0) this.receiver).x(o8v0Var);
                return Unit.f46060a;
            case 12:
                yfv0 yfv0Var = (yfv0) obj;
                yfv0Var.getClass();
                ((k3t0) this.receiver).x(yfv0Var);
                return Unit.f46060a;
            case 13:
                rlv0 rlv0Var = (rlv0) obj;
                rlv0Var.getClass();
                ((k3t0) this.receiver).x(rlv0Var);
                return Unit.f46060a;
            case 14:
                hmv0 hmv0Var = (hmv0) obj;
                hmv0Var.getClass();
                ((k3t0) this.receiver).x(hmv0Var);
                return Unit.f46060a;
            case 15:
                cnv0 cnv0Var = (cnv0) obj;
                cnv0Var.getClass();
                ((k3t0) this.receiver).x(cnv0Var);
                return Unit.f46060a;
            case 16:
                lwv0 lwv0Var = (lwv0) obj;
                lwv0Var.getClass();
                jvv0 jvv0Var = (jvv0) this.receiver;
                jvv0Var.getClass();
                return (kvv0) ((gvv0) jvv0Var.f17222a.getValue()).f11994a.get(lwv0Var);
            case 17:
                lwv0 lwv0Var2 = (lwv0) obj;
                lwv0Var2.getClass();
                hsv0 hsv0Var = (hsv0) this.receiver;
                u950 u950Var = hsv0Var.c;
                if (u950Var != null) {
                    ListIterator listIterator = u950Var.listIterator(u950Var.f35267a.size());
                    while (true) {
                        paw pawVar = (paw) listIterator;
                        if (pawVar.hasPrevious()) {
                            rb50 rb50Var = (rb50) pawVar.previous();
                            rb50Var.getClass();
                            if (rb50Var.equals(lwv0Var2)) {
                                i = pawVar.b + 1;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i != -1) {
                        hsv0Var.b((rb50) u950Var.remove(i));
                    }
                }
                return Unit.f46060a;
            case 18:
                pyv0 pyv0Var = (pyv0) obj;
                pyv0Var.getClass();
                ((k3t0) this.receiver).x(pyv0Var);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                o1w0 o1w0Var = (o1w0) this.receiver;
                sac.V(o1w0Var.f, k1w0.f17550a, null, o1w0Var.e.f22085a, new a2f(function1, r3, (byte) 13), 10);
                return Unit.f46060a;
            case 20:
                throw rw2.g(obj);
            case 21:
                throw rw2.g(obj);
            case 22:
                throw rw2.g(obj);
            case 23:
                throw rw2.g(obj);
            case 24:
                throw rw2.g(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                throw rw2.g(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                throw rw2.g(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                throw rw2.g(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                throw rw2.g(obj);
            default:
                throw rw2.g(obj);
        }
    }
}
