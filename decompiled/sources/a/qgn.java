package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qgn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28694a;
    public final ArrayList b;

    public qgn(byte b) {
        switch (b) {
            case 1:
                this.f28694a = new ArrayList(0);
                this.b = new ArrayList(0);
                break;
            default:
                this.f28694a = new ArrayList();
                this.b = new ArrayList();
                break;
        }
    }

    public void a(int[] iArr, String str) {
        this.f28694a.add(iArr);
        this.b.add(str);
    }
}
