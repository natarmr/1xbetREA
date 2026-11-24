package a;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes3.dex */
public final class fwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final shk f10265a;

    public fwk(shk shkVar) {
        shkVar.getClass();
        this.f10265a = shkVar;
    }

    public final void a(Configuration configuration) {
        Object value;
        configuration.getClass();
        shk shkVar = this.f10265a;
        shkVar.getClass();
        Configuration configuration2 = new Configuration(configuration);
        p7m0 p7m0Var = shkVar.f32216a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ahk.a((ahk) value, configuration2, new z6k(configuration2.densityDpi / 160.0f, configuration2.fontScale), null, null, null, 60)));
    }
}
