package a;

import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.GameVideoPlayerColorScheme;

/* JADX INFO: loaded from: classes4.dex */
public abstract class axs {
    public static final zws a(GameVideoPlayerColorScheme gameVideoPlayerColorScheme) {
        gameVideoPlayerColorScheme.getClass();
        if (gameVideoPlayerColorScheme != null) {
            if (gameVideoPlayerColorScheme instanceof GameVideoPlayerColorScheme.Static) {
                return new zws(R.attr.uikitStaticBlack40, R.attr.uikitStaticWhite, R.attr.uikitStaticWhite);
            }
            if (gameVideoPlayerColorScheme instanceof GameVideoPlayerColorScheme.Theme) {
                return new zws(R.attr.uikitSecondary10, R.attr.uikitTextPrimary, R.attr.uikitSecondary40);
            }
        }
        t9f.b();
        return null;
    }
}
