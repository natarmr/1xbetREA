package androidx.emoji2.text;

import a.clz;
import a.dwj;
import a.glz;
import a.nr;
import a.pbx;
import a.qsn;
import a.rsn;
import a.zrq;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements pbx {
    @Override // a.pbx
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // a.pbx
    public final Object b(Context context) {
        Object objD;
        zrq zrqVar = new zrq(new dwj(context, (byte) 1));
        zrqVar.b = true;
        if (qsn.k == null) {
            synchronized (qsn.j) {
                try {
                    if (qsn.k == null) {
                        qsn.k = new qsn(zrqVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        nr nrVarN = nr.n(context);
        nrVarN.getClass();
        synchronized (nr.f) {
            try {
                objD = ((HashMap) nrVarN.b).get(ProcessLifecycleInitializer.class);
                if (objD == null) {
                    objD = nrVarN.d(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        glz glzVarX = ((clz) objD).x();
        glzVarX.a(new rsn(this, glzVarX));
        return Boolean.TRUE;
    }
}
