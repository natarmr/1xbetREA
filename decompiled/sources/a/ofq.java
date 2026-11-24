package a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;

/* JADX INFO: loaded from: classes2.dex */
public final class ofq implements amw0, lyw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25182a;
    public final /* synthetic */ FirebaseAuth b;

    public /* synthetic */ ofq(FirebaseAuth firebaseAuth, byte b) {
        this.f25182a = b;
        this.b = firebaseAuth;
    }

    @Override // a.amw0
    public final void a(Status status) {
        byte b = this.f25182a;
        FirebaseAuth firebaseAuth = this.b;
        switch (b) {
            case 0:
                int i = status.f45486a;
                if (i == 17011 || i == 17021 || i == 17005 || i == 17091) {
                    firebaseAuth.c();
                }
                break;
            default:
                int i2 = status.f45486a;
                if (i2 == 17011 || i2 == 17021 || i2 == 17005) {
                    firebaseAuth.c();
                }
                break;
        }
    }

    @Override // a.lyw0
    public final void b(zzaia zzaiaVar, FirebaseUser firebaseUser) {
        byte b = this.f25182a;
        FirebaseAuth firebaseAuth = this.b;
        switch (b) {
            case 0:
                s0x.H(zzaiaVar);
                s0x.H(firebaseUser);
                ((zzad) firebaseUser).f45652a = zzaiaVar;
                FirebaseAuth.f(firebaseAuth, firebaseUser, zzaiaVar, true, true);
                break;
            default:
                FirebaseAuth.f(firebaseAuth, firebaseUser, zzaiaVar, true, true);
                break;
        }
    }
}
