package a;

import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mrc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22264a;
    public final /* synthetic */ qrc0 b;

    public /* synthetic */ mrc0(qrc0 qrc0Var, byte b) {
        this.f22264a = b;
        this.b = qrc0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22264a;
        qrc0 qrc0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                qrc0Var.E.b(th, new r7a0(th, qrc0Var, (byte) 25));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                qrc0Var.E.b(th2, new t4c0((byte) 26));
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                qrc0Var.E.b(th3, new nrc0(qrc0Var, (byte) 0));
                break;
            default:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                if (th4 instanceof zhi0) {
                    x20 x20Var = qrc0Var.C;
                    ctf0 ctf0Var = qrc0Var.F;
                    long id = ((zqc0) qrc0Var.D()).e.getId();
                    int i = ((zhi0) th4).f44396a;
                    x20Var.f40143a.a(tx3.l0(new k1p[]{new i1p((byte) 2, id), new i1p(i, (byte) 0)}), 3308L);
                    b4j b4jVar = qrc0Var.D;
                    long id2 = ((zqc0) qrc0Var.D()).e.getId();
                    b4jVar.getClass();
                    LinkedHashMap linkedHashMapH = xp20.h(new Pair("promo_id", Long.valueOf(id2)));
                    if (i != 0) {
                        linkedHashMapH.put("error_code", Integer.valueOf(i));
                    }
                    b4jVar.f1961a.a("promo_buy_error", xp20.n(linkedHashMapH));
                    String message = th4.getMessage();
                    if (message != null) {
                        qrc0Var.G(new uqc0(new DialogFields((CharSequence) ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), (CharSequence) message, (CharSequence) ctf0Var.b.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, "SHOW_ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496)));
                    }
                } else {
                    qrc0Var.E.b(th4, new r7a0(th4, qrc0Var, (byte) 25));
                }
                break;
        }
        return Unit.f46060a;
    }
}
