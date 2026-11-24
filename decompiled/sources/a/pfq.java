package a;

import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;

/* JADX INFO: loaded from: classes2.dex */
public final class pfq implements lyw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f26916a;

    public pfq(FirebaseAuth firebaseAuth) {
        this.f26916a = firebaseAuth;
    }

    @Override // a.lyw0
    public final void b(zzaia zzaiaVar, FirebaseUser firebaseUser) {
        s0x.H(zzaiaVar);
        s0x.H(firebaseUser);
        ((zzad) firebaseUser).f45652a = zzaiaVar;
        FirebaseAuth.f(this.f26916a, firebaseUser, zzaiaVar, true, false);
    }
}
