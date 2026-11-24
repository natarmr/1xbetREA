package a;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w5v0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38601a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f38601a) {
            case 0:
                return Long.compare(((o5v0) obj).b, ((o5v0) obj2).b);
            default:
                return Integer.compare(((p5v0) obj).f26424a.b, ((p5v0) obj2).f26424a.b);
        }
    }
}
