package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ypc extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypc(String str, CharSequence charSequence, byte b) {
        super(charSequence != null ? charSequence.toString() : null);
        switch (b) {
            case 1:
                str.getClass();
                super(charSequence != null ? charSequence.toString() : null);
                break;
            default:
                break;
        }
    }
}
