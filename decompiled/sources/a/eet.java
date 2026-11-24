package a;

/* JADX INFO: loaded from: classes.dex */
public final class eet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7689a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eet(Object obj, byte b) {
        this.f7689a = b;
        this.b = obj;
    }

    public final void a() {
        byte b = this.f7689a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((fet) obj).A--;
                break;
            default:
                ((ogk0) obj).k--;
                break;
        }
    }

    public final void b() {
        byte b = this.f7689a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((fet) obj).A++;
                break;
            default:
                ((ogk0) obj).k++;
                break;
        }
    }
}
