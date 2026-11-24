package a;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f3w0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8884a = 1;
    public final /* synthetic */ mie0 b;
    public final /* synthetic */ zae0 c;
    public final /* synthetic */ mie0 d;
    public final /* synthetic */ mie0 e;

    public /* synthetic */ f3w0(zae0 zae0Var, mie0 mie0Var, mie0 mie0Var2, mie0 mie0Var3) {
        this.c = zae0Var;
        this.b = mie0Var;
        this.d = mie0Var2;
        this.e = mie0Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        byte b = this.f8884a;
        mie0 mie0Var = this.e;
        mie0 mie0Var2 = this.d;
        zae0 zae0Var = this.c;
        mie0 mie0Var3 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        ohq.l("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    byte b2 = zae0Var.readByte();
                    boolean z = (b2 & 1) == 1;
                    boolean z2 = (b2 & 2) == 2;
                    boolean z3 = (b2 & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        ohq.l("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    if (z) {
                        mie0Var3.f21842a = Integer.valueOf(zae0Var.e());
                    }
                    if (z2) {
                        mie0Var2.f21842a = Integer.valueOf(zae0Var.e());
                    }
                    if (z3) {
                        mie0Var.f21842a = Integer.valueOf(zae0Var.e());
                    }
                }
                return Unit.f46060a;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 == 1) {
                    if (mie0Var3.f21842a != null) {
                        ohq.l("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        return null;
                    }
                    if (jLongValue2 != 24) {
                        ohq.l("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        return null;
                    }
                    mie0Var3.f21842a = Long.valueOf(zae0Var.k());
                    mie0Var2.f21842a = Long.valueOf(zae0Var.k());
                    mie0Var.f21842a = Long.valueOf(zae0Var.k());
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ f3w0(mie0 mie0Var, zae0 zae0Var, mie0 mie0Var2, mie0 mie0Var3) {
        this.b = mie0Var;
        this.c = zae0Var;
        this.d = mie0Var2;
        this.e = mie0Var3;
    }
}
