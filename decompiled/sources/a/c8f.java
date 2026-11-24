package a;

import java.io.File;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c8f implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3910a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f3910a) {
            case 0:
                return ((Integer) obj).intValue() != 0;
            default:
                return ((File) obj).exists();
        }
    }
}
