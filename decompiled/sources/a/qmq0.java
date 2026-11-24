package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qmq0 implements xrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qmq0 f28997a;
    public static final /* synthetic */ qmq0[] b;
    public static final /* synthetic */ c0o c;

    static {
        bnz bnzVar = bnz.f2907a;
        qmq0 qmq0Var = new qmq0(Payload.RESPONSE_TIMEOUT, 0);
        f28997a = qmq0Var;
        qmq0[] qmq0VarArr = {qmq0Var};
        b = qmq0VarArr;
        c = new c0o(qmq0VarArr);
    }

    public static qmq0 valueOf(String str) {
        return (qmq0) Enum.valueOf(qmq0.class, str);
    }

    public static qmq0[] values() {
        return (qmq0[]) b.clone();
    }

    @Override // a.xrz
    public final bnz a() {
        return bnz.d;
    }

    @Override // a.xrz
    public final int getId() {
        return 33;
    }
}
