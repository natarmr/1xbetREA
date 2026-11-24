package a;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xplatform.game_broadcasting.impl.presentation.video.window_screen.GameVideoWindowService;
import org.xplatform.game_broadcasting.impl.presentation.zone.window_screen.GameZoneWindowService;

/* JADX INFO: loaded from: classes5.dex */
public final class js3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ApplicationLoader f17030a;

    public js3(ApplicationLoader applicationLoader) {
        this.f17030a = applicationLoader;
    }

    public final void a() {
        ApplicationLoader applicationLoader = this.f17030a;
        z7z z7zVar = applicationLoader.r;
        yje yjeVar = null;
        if (z7zVar == null) {
            Intrinsics.h("gameBroadcastingServiceFactory");
            throw null;
        }
        zsr zsrVar = (zsr) z7zVar.get();
        Context context = zsrVar.f44918a;
        if (zsrVar.b.a()) {
            int i = GameVideoWindowService.k;
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) GameVideoWindowService.class);
            intent.setAction("ACTION_PAUSE");
            j47.B0(context, intent);
        } else if (zsrVar.c.c()) {
            int i2 = GameZoneWindowService.g;
            context.getClass();
            Intent intent2 = new Intent(context, (Class<?>) GameZoneWindowService.class);
            intent2.setAction("ACTION_PAUSE");
            j47.B0(context, intent2);
        } else {
            if (sj3.p0(context, GameVideoWindowService.class)) {
                int i3 = GameVideoWindowService.k;
                pzb.o0(context);
            }
            if (sj3.p0(context, GameZoneWindowService.class)) {
                int i4 = GameZoneWindowService.g;
                u1c.P(context);
            }
        }
        z7z z7zVar2 = applicationLoader.j;
        if (z7zVar2 == null) {
            Intrinsics.h("prophylaxisFeature");
            throw null;
        }
        v3c.N(((c1d0) z7zVar2.get()).b().d);
        sac.V(applicationLoader.Z, null, null, null, new is3(applicationLoader, yjeVar, (byte) 0), 15);
        applicationLoader.g(false);
    }

    public final void b() {
        ApplicationLoader applicationLoader = this.f17030a;
        yje yjeVar = null;
        sac.V(applicationLoader.Z, null, null, null, new is3(applicationLoader, yjeVar, (byte) 1), 15);
        applicationLoader.e();
        boolean zL = sj3.L(applicationLoader);
        zlt0 zlt0VarRa = applicationLoader.c().Ra();
        byte b = 0;
        if (!zL && zlt0VarRa.n()) {
            ((vlk) zlt0VarRa.b).f37628a.e("subscribeOnBetUpdates", false);
        }
        sac.V(applicationLoader.Z, gs3.f11809a, null, null, new hs3(applicationLoader, yjeVar, b), 14);
        z7z z7zVar = applicationLoader.r;
        if (z7zVar == null) {
            Intrinsics.h("gameBroadcastingServiceFactory");
            throw null;
        }
        zsr zsrVar = (zsr) z7zVar.get();
        Context context = zsrVar.f44918a;
        context.getClass();
        if (Settings.canDrawOverlays(context)) {
            if (zsrVar.b.a()) {
                int i = GameVideoWindowService.k;
                Intent intent = new Intent(context, (Class<?>) GameVideoWindowService.class);
                intent.setAction("ACTION_START");
                try {
                    e0g0 e0g0Var = j0g0.b;
                    context.startService(intent);
                    return;
                } catch (Throwable unused) {
                    e0g0 e0g0Var2 = j0g0.b;
                    return;
                }
            }
            if (zsrVar.c.c()) {
                int i2 = GameZoneWindowService.g;
                Intent intent2 = new Intent(context, (Class<?>) GameZoneWindowService.class);
                intent2.setAction("ACTION_START");
                try {
                    e0g0 e0g0Var3 = j0g0.b;
                    context.startService(intent2);
                } catch (Throwable unused2) {
                    e0g0 e0g0Var4 = j0g0.b;
                }
            }
        }
    }
}
