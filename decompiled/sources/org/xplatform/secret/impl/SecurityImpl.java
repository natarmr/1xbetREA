package org.xplatform.secret.impl;

import a.d5c;
import a.jf4;
import a.maz;
import a.n0o0;
import a.odd;
import a.p23;
import a.p7w0;
import a.qem0;
import a.qjj;
import a.tvk;
import a.v7w0;
import a.wne;
import a.wnh0;
import a.z1x;
import a.zje;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import org.xplatform.secret.impl.SecurityImpl;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lorg/xplatform/secret/impl/SecurityImpl;", "La/wnh0;", "", "applicationId", "", "isTest", "defaultKey", "getNativeKey", "(Ljava/lang/String;ZZ)Ljava/lang/String;", "defaultV", "getNativeIV", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SecurityImpl implements wnh0 {
    public static final odd f = new odd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46922a;
    public final n0o0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;

    static {
        qjj.W(d5c.a(e.c(qem0.e(), tvk.f34603a)), null, null, new p23(2, null, (byte) 14), 3);
    }

    public SecurityImpl(String str) {
        this.f46922a = str;
        final byte b = 0;
        this.b = maz.b(new Function0(this) { // from class: a.jrh0
            public final /* synthetic */ SecurityImpl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                SecurityImpl securityImpl = this.b;
                switch (b2) {
                    case 0:
                        return SecurityImpl.c(securityImpl);
                    case 1:
                        return SecurityImpl.d(securityImpl);
                    case 2:
                        return SecurityImpl.a(securityImpl);
                    default:
                        return SecurityImpl.b(securityImpl);
                }
            }
        });
        final byte b2 = 1;
        this.c = maz.b(new Function0(this) { // from class: a.jrh0
            public final /* synthetic */ SecurityImpl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                SecurityImpl securityImpl = this.b;
                switch (b3) {
                    case 0:
                        return SecurityImpl.c(securityImpl);
                    case 1:
                        return SecurityImpl.d(securityImpl);
                    case 2:
                        return SecurityImpl.a(securityImpl);
                    default:
                        return SecurityImpl.b(securityImpl);
                }
            }
        });
        final byte b3 = 2;
        this.d = maz.b(new Function0(this) { // from class: a.jrh0
            public final /* synthetic */ SecurityImpl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                SecurityImpl securityImpl = this.b;
                switch (b4) {
                    case 0:
                        return SecurityImpl.c(securityImpl);
                    case 1:
                        return SecurityImpl.d(securityImpl);
                    case 2:
                        return SecurityImpl.a(securityImpl);
                    default:
                        return SecurityImpl.b(securityImpl);
                }
            }
        });
        final byte b4 = 3;
        this.e = maz.b(new Function0(this) { // from class: a.jrh0
            public final /* synthetic */ SecurityImpl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                SecurityImpl securityImpl = this.b;
                switch (b5) {
                    case 0:
                        return SecurityImpl.c(securityImpl);
                    case 1:
                        return SecurityImpl.d(securityImpl);
                    case 2:
                        return SecurityImpl.a(securityImpl);
                    default:
                        return SecurityImpl.b(securityImpl);
                }
            }
        });
    }

    public static final String a(SecurityImpl securityImpl) {
        return securityImpl.getNativeKey(securityImpl.f46922a, false, true);
    }

    public static final String b(SecurityImpl securityImpl) {
        return securityImpl.getNativeIV(securityImpl.f46922a, false, true);
    }

    public static final String c(SecurityImpl securityImpl) {
        return securityImpl.getNativeKey(securityImpl.f46922a, false, false);
    }

    public static final String d(SecurityImpl securityImpl) {
        return securityImpl.getNativeIV(securityImpl.f46922a, false, false);
    }

    private final native String getNativeIV(String applicationId, boolean isTest, boolean defaultV);

    private final native String getNativeKey(String applicationId, boolean isTest, boolean defaultKey);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(boolean z, zje zjeVar) {
        p7w0 p7w0Var;
        if (zjeVar instanceof p7w0) {
            p7w0Var = (p7w0) zjeVar;
            int i = p7w0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                p7w0Var.l = i - Integer.MIN_VALUE;
            } else {
                p7w0Var = new p7w0(this, zjeVar);
            }
        } else {
            p7w0Var = new p7w0(this, zjeVar);
        }
        Object obj = p7w0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = p7w0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            p7w0Var.i = z;
            p7w0Var.l = 1;
            if (f.q(p7w0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = p7w0Var.i;
            z1x.P(obj);
        }
        return z ? (String) this.e.getValue() : (String) this.c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(boolean z, zje zjeVar) {
        v7w0 v7w0Var;
        if (zjeVar instanceof v7w0) {
            v7w0Var = (v7w0) zjeVar;
            int i = v7w0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                v7w0Var.l = i - Integer.MIN_VALUE;
            } else {
                v7w0Var = new v7w0(this, zjeVar);
            }
        } else {
            v7w0Var = new v7w0(this, zjeVar);
        }
        Object obj = v7w0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = v7w0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            v7w0Var.i = z;
            v7w0Var.l = 1;
            if (f.q(v7w0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = v7w0Var.i;
            z1x.P(obj);
        }
        return z ? (String) this.d.getValue() : (String) this.b.getValue();
    }
}
