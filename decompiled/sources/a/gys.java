package a;

import org.xplatform.game_broadcasting.impl.presentation.video.GameVideoView;

/* JADX INFO: loaded from: classes4.dex */
public final class gys implements ky90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GameVideoView f12146a;

    public gys(GameVideoView gameVideoView) {
        this.f12146a = gameVideoView;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // a.ky90
    public final void G(dlo dloVar) {
        boolean z;
        long jA;
        dloVar.getClass();
        int i = dloVar.f6293a;
        int i2 = GameVideoView.u;
        GameVideoView gameVideoView = this.f12146a;
        ulo uloVar = gameVideoView.j;
        if (uloVar != null) {
            z = uloVar.r();
        }
        gameVideoView.o = z;
        if (gameVideoView.i.length() == 0 || xx90.f41646a.contains(Integer.valueOf(i))) {
            gameVideoView.h();
            gameVideoView.setProgressVisible(false);
            gameVideoView.h.invoke();
        } else {
            if (i == 1002) {
                wen.b.getClass();
                jA = 0;
            } else {
                jA = gameVideoView.q.a();
            }
            gameVideoView.o(jA);
        }
    }

    @Override // a.ky90
    public final void f(int i) {
        GameVideoView gameVideoView = this.f12146a;
        if (i == 2) {
            gameVideoView.setProgressVisible(true);
            return;
        }
        if (i != 3) {
            return;
        }
        int i2 = GameVideoView.u;
        gameVideoView.h();
        gameVideoView.setProgressVisible(false);
        gameVideoView.getOnMediaFileReddyListener().invoke();
        if (gameVideoView.k) {
            gameVideoView.setVolume(100.0d);
        } else {
            gameVideoView.setVolume(0.0d);
        }
    }
}
