package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qby {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pfw f28461a = new pfw("COMPLETING_ALREADY", (byte) 6);
    public static final pfw b = new pfw("COMPLETING_WAITING_CHILDREN", (byte) 6);
    public static final pfw c = new pfw("COMPLETING_RETRY", (byte) 6);
    public static final pfw d = new pfw("TOO_LATE_TO_CANCEL", (byte) 6);
    public static final pfw e = new pfw("SEALED", (byte) 6);
    public static final mtn f = new mtn(false);
    public static final mtn g = new mtn(true);

    public static final Object a(Object obj) {
        v4x v4xVar = obj instanceof v4x ? (v4x) obj : null;
        return v4xVar != null ? v4xVar.f36804a : obj;
    }
}
