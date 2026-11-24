package a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdb;

/* JADX INFO: loaded from: classes2.dex */
public final class bzw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3494a;
    public final Boolean b;
    public final long c;
    public final zzdb d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final String h;

    public bzw0(Context context, zzdb zzdbVar, Long l, Long l2) {
        this.e = true;
        s0x.H(context);
        Context applicationContext = context.getApplicationContext();
        s0x.H(applicationContext);
        this.f3494a = applicationContext;
        this.f = l;
        this.g = l2;
        if (zzdbVar != null) {
            this.d = zzdbVar;
            this.e = zzdbVar.c;
            this.c = zzdbVar.b;
            this.h = zzdbVar.e;
            Bundle bundle = zzdbVar.d;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
