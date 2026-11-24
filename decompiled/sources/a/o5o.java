package a;

import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o5o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c4m0 f24696a;
    public static Long b;
    public static final n0o0 c = maz.b(new urn((byte) 5));

    public static final void a(j1h j1hVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-550959247);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(j1hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = n5o.f22953a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = (i2 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new yhn((Object) j1hVar, (byte) 13);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, mm40Var, (Function1) objP2, fetVar2, 6, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(j1hVar, i, (byte) 7);
        }
    }

    public static final void b(long j, TextView textView) {
        long millis = j - TimeUnit.DAYS.toMillis(j / 86400000);
        long millis2 = millis - TimeUnit.HOURS.toMillis(millis / 3600000);
        long j2 = millis2 / 60000;
        textView.setText(textView.getContext().getString(R.string.move_in_v2, by7.c().e(w6x.q(StringsKt.b0(2, String.valueOf(j2)), " : ", StringsKt.b0(2, String.valueOf((millis2 - TimeUnit.MINUTES.toMillis(j2)) / 1000))))));
    }
}
