package a;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class kvb0 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18951a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kvb0(Object obj, byte b) {
        this.f18951a = b;
        this.b = obj;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        byte b = this.f18951a;
        Object obj = this.b;
        switch (b) {
            case 0:
                lvb0 lvb0Var = (lvb0) obj;
                try {
                    lyn lynVar = lyn.c;
                    Mac mac = (Mac) lynVar.f20870a.a(lvb0Var.f20707a);
                    mac.init(lvb0Var.b);
                    return mac;
                } catch (GeneralSecurityException e) {
                    itt0.o(e);
                    return null;
                }
            case 1:
                return ((Function0) ((fuj0) obj).f10166a).invoke();
            default:
                lvb0 lvb0Var2 = (lvb0) obj;
                try {
                    gix0 gix0Var = gix0.c;
                    Mac mac2 = (Mac) gix0Var.f11371a.zza(lvb0Var2.f20707a);
                    mac2.init(lvb0Var2.b);
                    return mac2;
                } catch (GeneralSecurityException e2) {
                    itt0.o(e2);
                    return null;
                }
        }
    }
}
