package a;

import android.content.Context;
import org.xplatform.game_broadcasting.impl.presentation.video.window_screen.GameVideoWindowService;
import org.xplatform.game_broadcasting.impl.presentation.zone.window_screen.GameZoneWindowService;

/* JADX INFO: loaded from: classes4.dex */
public final class zsr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44918a;
    public final lut b;
    public final mpx c;
    public final mpx d;
    public final sdi0 e;
    public final xsc f;
    public final yqc g;

    public zsr(Context context, lut lutVar, mpx mpxVar, mpx mpxVar2, sdi0 sdi0Var, xsc xscVar, yqc yqcVar) {
        context.getClass();
        this.f44918a = context;
        this.b = lutVar;
        this.c = mpxVar;
        this.d = mpxVar2;
        this.e = sdi0Var;
        this.f = xscVar;
        this.g = yqcVar;
    }

    public final void a() {
        int i = GameVideoWindowService.k;
        Context context = this.f44918a;
        pzb.o0(context);
        int i2 = GameZoneWindowService.g;
        u1c.P(context);
        this.d.b(false);
        this.f.b();
        this.e.b(false);
        this.g.v();
    }
}
