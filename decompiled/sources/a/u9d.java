package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u9d extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35278a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9d(kie0 kie0Var, kie0 kie0Var2, CharSequence charSequence, kie0 kie0Var3) {
        super(1);
        this.f35278a = (byte) 0;
        this.b = kie0Var;
        this.c = kie0Var2;
        this.e = charSequence;
        this.d = kie0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x019d  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ab  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2;
        byte b = this.f35278a;
        boolean z = false;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                kie0 kie0Var = (kie0) obj5;
                CharSequence charSequence = (CharSequence) obj4;
                kie0 kie0Var2 = (kie0) obj3;
                int i3 = kie0Var2.f18333a;
                kie0 kie0Var3 = (kie0) obj2;
                int i4 = kie0Var3.f18333a;
                while (kie0Var2.f18333a < iIntValue && kie0Var3.f18333a < charSequence.length()) {
                    char cCharAt = charSequence.charAt(kie0Var3.f18333a);
                    if (cCharAt == ' ') {
                        i2 = 1;
                    } else {
                        if (cCharAt != '\t') {
                            if (kie0Var3.f18333a == charSequence.length()) {
                                kie0Var2.f18333a = Integer.MAX_VALUE;
                            }
                            i = kie0Var2.f18333a;
                            if (iIntValue <= i) {
                                kie0Var2.f18333a = i - iIntValue;
                                z = true;
                            } else {
                                kie0Var3.f18333a = i4;
                                kie0Var2.f18333a = i3;
                            }
                            return Boolean.valueOf(z);
                        }
                        i2 = 4 - (kie0Var.f18333a % 4);
                    }
                    kie0Var2.f18333a += i2;
                    kie0Var.f18333a += i2;
                    kie0Var3.f18333a++;
                }
                if (kie0Var3.f18333a == charSequence.length()) {
                    kie0Var2.f18333a = Integer.MAX_VALUE;
                }
                i = kie0Var2.f18333a;
                if (iIntValue <= i) {
                    kie0Var2.f18333a = i - iIntValue;
                    z = true;
                } else {
                    kie0Var3.f18333a = i4;
                    kie0Var2.f18333a = i3;
                }
                return Boolean.valueOf(z);
            case 1:
                uag0 uag0Var = (uag0) obj;
                toj0 toj0Var = (toj0) obj3;
                l7m0 l7m0Var = (l7m0) obj2;
                float fFloatValue = l7m0Var != null ? ((Number) l7m0Var.getValue()).floatValue() : 1.0f;
                sd60 sd60Var = toj0Var.c;
                agk0 agk0Var = (agk0) sd60Var.e;
                float fL = fFloatValue * ((toj0Var.b() && ((Boolean) ((hgk0) ((pz40) sd60Var.b)).getValue()).booleanValue()) ? ((agk0) sd60Var.c).l() : 1.0f);
                if (toj0Var.b()) {
                    toj0Var.f = fL;
                }
                uag0Var.b(fL);
                l7m0 l7m0Var2 = (l7m0) obj5;
                float fFloatValue2 = l7m0Var2 != null ? ((Number) l7m0Var2.getValue()).floatValue() : 1.0f;
                boolean z2 = toj0Var.b() && ((Boolean) ((hgk0) ((pz40) sd60Var.d)).getValue()).booleanValue();
                float fL2 = fFloatValue2 * (z2 ? agk0Var.l() : 1.0f);
                if (toj0Var.b()) {
                    toj0Var.g = fL2;
                    if (z2) {
                        agk0Var.l();
                    }
                    if (z2) {
                        i6u0 i6u0Var = toj0Var.j;
                        if (i6u0Var == null) {
                            i6u0Var = new i6u0(false);
                            toj0Var.j = i6u0Var;
                        }
                        i5d0 i5d0Var = nzj.f24376a;
                        i6u0Var.a(fL2, wen.e(plq0.b(toj0Var.d)));
                    }
                }
                uag0Var.w(fL2);
                uag0Var.y(fL2);
                l7m0 l7m0Var3 = (l7m0) obj4;
                long j = l7m0Var3 != null ? ((ils0) l7m0Var3.getValue()).f14995a : ils0.b;
                if (toj0Var.b() && ((Boolean) ((hgk0) ((pz40) sd60Var.f)).getValue()).booleanValue()) {
                    j = ((ils0) ((hgk0) ((pz40) sd60Var.g)).getValue()).f14995a;
                }
                if (toj0Var.b()) {
                    toj0Var.h = j;
                }
                uag0Var.G(j);
                return Unit.f46060a;
            default:
                alo aloVar = (alo) obj5;
                int iOrdinal = ((azn) obj).ordinal();
                ils0 ils0Var = null;
                if (iOrdinal == 0) {
                    k1h0 k1h0Var = ((pzn) obj2).f27854a.d;
                    if (k1h0Var != null) {
                        ils0Var = new ils0(k1h0Var.b);
                    } else {
                        k1h0 k1h0Var2 = aloVar.f1078a.d;
                        if (k1h0Var2 != null) {
                            ils0Var = new ils0(k1h0Var2.b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    ils0Var = (ils0) obj3;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    k1h0 k1h0Var3 = aloVar.f1078a.d;
                    ils0Var = new ils0(k1h0Var3 != null ? k1h0Var3.b : ((toj0) obj4).h);
                }
                return new ils0(ils0Var != null ? ils0Var.f14995a : ils0.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9d(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.f35278a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
