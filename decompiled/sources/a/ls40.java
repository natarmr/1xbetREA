package a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ls40 implements ks40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20560a;
    public sje b;
    public final agk0 c = androidx.compose.runtime.e.a(1.0f);
    public c4m0 d;

    public ls40(Context context) {
        this.f20560a = context;
    }

    @Override // a.ks40
    public final float d() {
        yje yjeVar;
        n7m0 n7m0Var;
        if (this.d == null) {
            Context context = this.f20560a;
            hz40 hz40Var = sjv0.f32320a;
            synchronized (hz40Var) {
                try {
                    Object objG = hz40Var.g(context);
                    yjeVar = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        q99 q99VarD = vtb.d(-1, null, null, 6);
                        objG = vtb.h0(new vsg0(new lpp(contentResolver, uriFor, new awf(q99VarD, thb.y(Looper.getMainLooper())), q99VarD, context, null)), d5c.s(), new o6m0(Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        hz40Var.n(context, objG);
                    }
                    n7m0Var = (n7m0) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.c.m(((Number) n7m0Var.getValue()).floatValue());
            sje sjeVar = this.b;
            if (sjeVar == null) {
                jf4.n("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.d = qjj.W(sjeVar, null, null, new j940(n7m0Var, this, yjeVar, (byte) 5), 3);
        }
        return this.c.l();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }
}
