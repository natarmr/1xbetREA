package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class hmq0 extends a3h0 implements Runnable {
    public final long f;

    public hmq0(long j, zje zjeVar) {
        super(zjeVar, zjeVar.getContext());
        this.f = j;
    }

    @Override // a.a2, a.pby
    public final String P() {
        return super.P() + "(timeMillis=" + this.f + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        CoroutineContext coroutineContext = this.d;
        qcc.T(coroutineContext);
        rne rneVar = (rne) coroutineContext.get(rne.c);
        String str = rneVar != null ? rneVar.b : null;
        String strH = axq.h(this.f, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder sbT = kng0.t("Coroutine \"", str, "\" ");
            if (strH.length() > 0) {
                strH = Character.toLowerCase(strH.charAt(0)) + strH.substring(1);
            }
            sbT.append(strH);
            strH = sbT.toString();
        }
        r(new gmq0(strH, this));
    }
}
