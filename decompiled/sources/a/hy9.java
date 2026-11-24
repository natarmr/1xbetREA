package a;

/* JADX INFO: loaded from: classes.dex */
public interface hy9 extends qae0 {
    public static final u15 H = new u15("camerax.core.camera.useCaseConfigFactory", ipt0.class, null);
    public static final u15 J = new u15("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);
    public static final u15 N = new u15("camerax.core.camera.SessionProcessor", dki0.class, null);
    public static final u15 P = new u15("camerax.core.camera.isPostviewSupported", Boolean.class, null);
    public static final u15 W = new u15("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    default void o() {
        if (e(N, null) == null) {
            return;
        }
        hny.b();
    }
}
