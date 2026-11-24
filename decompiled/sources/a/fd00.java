package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class fd00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ed00 f9336a;
    public static final ed00 b;

    static {
        c5d0 c5d0Var = c5d0.c;
        ed00 ed00Var = null;
        try {
            ed00Var = (ed00) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f9336a = ed00Var;
        b = new ed00();
    }
}
