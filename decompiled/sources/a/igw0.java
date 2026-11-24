package a;

/* JADX INFO: loaded from: classes2.dex */
public final class igw0 extends RuntimeException {
    public igw0() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zew0 a() {
        return new zew0(getMessage());
    }
}
