package a;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bgq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2568a;
    public final /* synthetic */ cgq b;

    public /* synthetic */ bgq(cgq cgqVar, byte b) {
        this.f2568a = b;
        this.b = cgqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q45 q45VarV;
        q45 q45VarG;
        byte b = this.f2568a;
        cgq cgqVar = this.b;
        switch (b) {
            case 0:
                cgqVar.a();
                return;
            case 1:
                cgqVar.a();
                return;
            default:
                Object obj = cgq.l;
                synchronized (obj) {
                    try {
                        nfq nfqVar = cgqVar.f4326a;
                        nfqVar.a();
                        chf0 chf0VarK = chf0.k(nfqVar.f23449a);
                        try {
                            q45VarV = cgqVar.c.v();
                            if (chf0VarK != null) {
                                chf0VarK.d0();
                            }
                        } catch (Throwable th) {
                            if (chf0VarK != null) {
                                chf0VarK.d0();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i = q45VarV.b;
                    boolean z = false;
                    if (i == 5) {
                        q45VarG = cgqVar.g(q45VarV);
                    } else if (i == 3) {
                        q45VarG = cgqVar.g(q45VarV);
                    } else if (!cgqVar.d.a(q45VarV)) {
                        return;
                    } else {
                        q45VarG = cgqVar.b(q45VarV);
                    }
                    synchronized (obj) {
                        try {
                            nfq nfqVar2 = cgqVar.f4326a;
                            nfqVar2.a();
                            chf0 chf0VarK2 = chf0.k(nfqVar2.f23449a);
                            try {
                                cgqVar.c.n(q45VarG);
                                if (chf0VarK2 != null) {
                                    chf0VarK2.d0();
                                }
                            } catch (Throwable th3) {
                                if (chf0VarK2 != null) {
                                    chf0VarK2.d0();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (cgqVar) {
                        try {
                            boolean z2 = q45VarG.b == 4;
                            String str = q45VarG.f28082a;
                            if (z2 && !TextUtils.isEmpty(str)) {
                                z = TextUtils.equals(q45VarV.f28082a, str) ? !(q45VarV.b == 4) : true;
                            }
                            if (z) {
                                Iterator it = cgqVar.j.iterator();
                                while (it.hasNext()) {
                                    FirebaseMessaging firebaseMessaging = ((igq) it.next()).f14746a;
                                    if (firebaseMessaging.d() != null) {
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            Log.d("FirebaseMessaging", "FID Change detected! Triggering re-sync");
                                        }
                                        synchronized (firebaseMessaging) {
                                            try {
                                                if (!firebaseMessaging.k) {
                                                    firebaseMessaging.g(0L);
                                                }
                                            } catch (Throwable th5) {
                                                throw th5;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    if (q45VarG.b == 4) {
                        String str2 = q45VarG.f28082a;
                        synchronized (cgqVar) {
                            cgqVar.i = str2;
                        }
                    }
                    int i2 = q45VarG.b;
                    if (i2 == 5) {
                        cgqVar.h(new egq((byte) 4));
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        cgqVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cgqVar.i(q45VarG);
                        return;
                    }
                } catch (egq e) {
                    cgqVar.h(e);
                    return;
                }
        }
    }
}
