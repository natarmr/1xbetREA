package a;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class uwj0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36396a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ xxj0 c;

    public /* synthetic */ uwj0(kmq kmqVar, xxj0 xxj0Var, byte b) {
        this.f36396a = b;
        this.b = kmqVar;
        this.c = xxj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0198  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x0152  */
    /* JADX WARN: Code duplicated, block: B:96:0x0165  */
    /* JADX WARN: Code duplicated, block: B:99:0x0182  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        twj0 twj0Var;
        axj0 axj0Var;
        double d;
        String strC;
        double d2;
        double dB;
        String str;
        ank0 ank0Var;
        boolean z;
        boolean z2;
        boolean z3;
        AutoMaxUiModel autoMaxUiModel;
        boolean z4;
        double d3;
        String strA;
        bzj0 bzj0Var;
        byte b = this.f36396a;
        xxj0 xxj0Var = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof twj0) {
                    twj0Var = (twj0) yjeVar;
                    int i = twj0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        twj0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        twj0Var = new twj0(this, yjeVar);
                    }
                } else {
                    twj0Var = new twj0(this, yjeVar);
                }
                Object obj2 = twj0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = twj0Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    a40 a40Var = (a40) obj;
                    ctf0 ctf0Var = xxj0Var.m;
                    a40Var.getClass();
                    ctf0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    k1 k1Var = new k1(ctf0Var, a40Var, (byte) 20);
                    bnk0 bnk0Var = new bnk0();
                    k1Var.invoke(bnk0Var);
                    i40 i40Var = new i40(w6x.l(arrayList, bnk0Var.f2888a, arrayList));
                    twj0Var.j = 1;
                    if (kmqVar.a(i40Var, twj0Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof axj0) {
                    axj0Var = (axj0) yjeVar;
                    int i3 = axj0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        axj0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        axj0Var = new axj0(this, yjeVar);
                    }
                } else {
                    axj0Var = new axj0(this, yjeVar);
                }
                Object obj3 = axj0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = axj0Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    StepInputUiModel stepInputUiModel = (StepInputUiModel) obj;
                    ctf0 ctf0Var2 = xxj0Var.m;
                    stepInputUiModel.getClass();
                    boolean z5 = stepInputUiModel.q;
                    double d4 = stepInputUiModel.d;
                    boolean z6 = stepInputUiModel.n;
                    double d5 = stepInputUiModel.f46773a;
                    ctf0Var2.getClass();
                    boolean z7 = stepInputUiModel.j;
                    if (d5 == -1.0d) {
                        d = d4;
                    } else {
                        d = d4;
                        if (stepInputUiModel.b != 0.0d) {
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d5, p3u0.g);
                        }
                        String str2 = strC;
                        d2 = stepInputUiModel.d;
                        double d6 = stepInputUiModel.e;
                        dB = stepInputUiModel.b();
                        str = stepInputUiModel.f;
                        boolean z8 = stepInputUiModel.g;
                        if ((d2 > d5 && d5 <= dB) || d5 == -1.0d || (d5 > dB && z6)) {
                            ank0Var = h8x.r(z8, d2, str, d6);
                        } else if (d5 < d2) {
                            ank0Var = h8x.u(ctf0Var2, d2, str);
                        } else if (d5 > dB || z6) {
                            ank0Var = new ank0(iun.f15405a);
                        } else {
                            ank0Var = h8x.s(ctf0Var2, d6, str);
                        }
                        ank0 ank0Var2 = ank0Var;
                        boolean z9 = stepInputUiModel.m;
                        if (d5 < stepInputUiModel.b() || !z7) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (d5 > d || !z7) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z7) {
                            z3 = stepInputUiModel.k;
                        } else if (d5 == -1.0d) {
                            z3 = false;
                        } else {
                            double dB2 = stepInputUiModel.b();
                            if ((d <= d5 || d5 > dB2) && (!z6 || d5 <= stepInputUiModel.b())) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                        }
                        boolean z10 = stepInputUiModel.j;
                        boolean z11 = stepInputUiModel.n;
                        boolean z12 = stepInputUiModel.l;
                        autoMaxUiModel = stepInputUiModel.i;
                        if (autoMaxUiModel.f46769a || stepInputUiModel.g) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        double d7 = autoMaxUiModel.b;
                        if (z5) {
                            d3 = 2.0d;
                        } else {
                            d3 = 1.0d;
                        }
                        AutoMaxUiModel autoMaxUiModel2 = new AutoMaxUiModel(d7 / d3, z4);
                        double dB3 = stepInputUiModel.b();
                        boolean z13 = !((d > d5 && d5 <= dB3) || d5 == -1.0d || (d5 > dB3 && z11));
                        boolean z14 = stepInputUiModel.p;
                        if (z5) {
                            strA = ctf0Var2.b.a(R.string.factor_2x, Arrays.copyOf(new Object[0], 0));
                        } else {
                            strA = null;
                        }
                        bzj0Var = new bzj0(str2, z12, ank0Var2, z9, z, z2, z3, z10, z11, autoMaxUiModel2, z13, z14, strA);
                        axj0Var.j = 1;
                        if (kmqVar.a(bzj0Var, axj0Var) == wneVar2) {
                            return wneVar2;
                        }
                    }
                    strC = "";
                    String str3 = strC;
                    d2 = stepInputUiModel.d;
                    double d8 = stepInputUiModel.e;
                    dB = stepInputUiModel.b();
                    str = stepInputUiModel.f;
                    boolean z15 = stepInputUiModel.g;
                    if (d2 > d5) {
                        if (d5 < d2) {
                            ank0Var = h8x.u(ctf0Var2, d2, str);
                        } else if (d5 > dB) {
                            ank0Var = new ank0(iun.f15405a);
                        } else {
                            ank0Var = new ank0(iun.f15405a);
                        }
                    } else if (d5 < d2) {
                        ank0Var = h8x.u(ctf0Var2, d2, str);
                    } else if (d5 > dB) {
                        ank0Var = new ank0(iun.f15405a);
                    } else {
                        ank0Var = new ank0(iun.f15405a);
                    }
                    ank0 ank0Var3 = ank0Var;
                    boolean z16 = stepInputUiModel.m;
                    if (d5 < stepInputUiModel.b()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (d5 > d) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z7) {
                        z3 = stepInputUiModel.k;
                    } else if (d5 == -1.0d) {
                        z3 = false;
                    } else {
                        double dB4 = stepInputUiModel.b();
                        if (d <= d5) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                    }
                    boolean z17 = stepInputUiModel.j;
                    boolean z18 = stepInputUiModel.n;
                    boolean z19 = stepInputUiModel.l;
                    autoMaxUiModel = stepInputUiModel.i;
                    if (autoMaxUiModel.f46769a) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    double d9 = autoMaxUiModel.b;
                    if (z5) {
                        d3 = 2.0d;
                    } else {
                        d3 = 1.0d;
                    }
                    AutoMaxUiModel autoMaxUiModel3 = new AutoMaxUiModel(d9 / d3, z4);
                    double dB5 = stepInputUiModel.b();
                    boolean z110 = !((d > d5 && d5 <= dB5) || d5 == -1.0d || (d5 > dB5 && z18));
                    boolean z111 = stepInputUiModel.p;
                    if (z5) {
                        strA = ctf0Var2.b.a(R.string.factor_2x, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA = null;
                    }
                    bzj0Var = new bzj0(str3, z19, ank0Var3, z16, z, z2, z3, z17, z18, autoMaxUiModel3, z110, z111, strA);
                    axj0Var.j = 1;
                    if (kmqVar.a(bzj0Var, axj0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
