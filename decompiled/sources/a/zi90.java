package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zi90 extends cz40 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi90(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.b = b;
    }

    @Override // a.eiy
    public final Object get() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((View) this.receiver).getVisibility() == 0);
            case 1:
                return Boolean.valueOf(((xva0) this.receiver).e);
            default:
                return Boolean.valueOf(((View) this.receiver).getVisibility() == 0);
        }
    }

    @Override // a.rhy
    public final void set(Object obj) {
        switch (this.b) {
            case 0:
                ((View) this.receiver).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                break;
            case 1:
                ((xva0) this.receiver).e = ((Boolean) obj).booleanValue();
                break;
            default:
                ((View) this.receiver).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                break;
        }
    }
}
