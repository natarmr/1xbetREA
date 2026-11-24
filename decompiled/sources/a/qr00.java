package a;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class qr00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lqd f29187a = new lqd(new ejd(rr00.f30958a, (byte) 3));

    public static ze50 a(fet fetVar) {
        ze50 ze50Var = (ze50) fetVar.k(f29187a);
        if (ze50Var == null) {
            fetVar.e0(950835668);
            Object baseContext = (Context) fetVar.k(dy2.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof ze50) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            ze50Var = (ze50) baseContext;
        } else {
            fetVar.e0(950834211);
        }
        fetVar.r(false);
        return ze50Var;
    }
}
