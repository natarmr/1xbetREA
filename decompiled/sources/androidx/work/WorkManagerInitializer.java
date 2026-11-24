package androidx.work;

import a.cpv0;
import a.pbx;
import a.usd;
import a.wsd;
import a.wv00;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements pbx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45415a = wv00.h("WrkMgrInitializer");

    @Override // a.pbx
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // a.pbx
    public final Object b(Context context) {
        wv00.f().a(f45415a, "Initializing WorkManager with default configuration.");
        wsd wsdVar = new wsd(new usd());
        context.getClass();
        cpv0.e(context, wsdVar);
        cpv0 cpv0VarD = cpv0.d(context);
        cpv0VarD.getClass();
        return cpv0VarD;
    }
}
