package a;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bdx0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2422a = 0;
    public final /* synthetic */ FirebaseAuth b;

    public bdx0(FirebaseAuth firebaseAuth) {
        this.b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f2422a;
        FirebaseAuth firebaseAuth = this.b;
        switch (b) {
            case 0:
                Iterator it = firebaseAuth.c.iterator();
                if (it.hasNext()) {
                    throw rw2.h(it);
                }
                return;
            default:
                Iterator it2 = firebaseAuth.d.iterator();
                if (it2.hasNext()) {
                    throw rw2.h(it2);
                }
                Iterator it3 = firebaseAuth.b.iterator();
                if (it3.hasNext()) {
                    throw rw2.h(it3);
                }
                return;
        }
    }

    public bdx0(FirebaseAuth firebaseAuth, qmx qmxVar) {
        this.b = firebaseAuth;
    }
}
