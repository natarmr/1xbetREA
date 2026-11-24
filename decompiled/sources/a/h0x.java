package a;

/* JADX INFO: loaded from: classes.dex */
public interface h0x extends qae0 {
    public static final u15 h0;
    public static final u15 i0;
    public static final u15 j0;

    static {
        Class cls = Integer.TYPE;
        h0 = new u15("camerax.core.imageInput.inputFormat", cls, null);
        i0 = new u15("camerax.core.imageInput.secondaryInputFormat", cls, null);
        j0 = new u15("camerax.core.imageInput.inputDynamicRange", agn.class, null);
    }

    default int k() {
        return ((Integer) d(h0)).intValue();
    }
}
