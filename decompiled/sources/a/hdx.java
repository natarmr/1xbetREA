package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class hdx implements tgi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12893a;

    public /* synthetic */ hdx(byte b) {
        this.f12893a = b;
    }

    public static int b(wvq0 wvq0Var, boolean z) {
        int i;
        if (Intrinsics.d(wvq0Var.e(), cy2.V)) {
            i = z ? 2 : 1;
        } else {
            i = 0;
        }
        return (wvq0Var.f(0).c - wvq0Var.f(0).b) - i;
    }

    @Override // a.tgi0
    public final j910 a(dgu dguVar, List list) {
        vr00 vr00VarI;
        vr00 vr00VarG;
        switch (this.f12893a) {
            case 0:
                list.getClass();
                j910 j910Var = new j910((byte) 26);
                ArrayList arrayList = new ArrayList();
                wvq0 xvq0Var = new xvq0(dguVar, list);
                n0o0 n0o0VarB = maz.b(new z0x(dguVar, list, (byte) 1));
                int i = -239;
                int i2 = -239;
                while (xvq0Var.e() != null) {
                    if (!Intrinsics.d(xvq0Var.e(), cy2.F) || (vr00VarI = gst.i(xvq0Var, (qb00) n0o0VarB.getValue())) == null) {
                        int i3 = xvq0Var.f39851a;
                        if (i + 1 != i3) {
                            if (i2 != -239) {
                                arrayList.add(new IntRange(i2, i, 1));
                            }
                            i2 = i3;
                        }
                        xvq0Var = xvq0Var.a();
                        i = i3;
                    } else {
                        xvq0Var = vr00VarI.f37876a.a();
                        j910Var.E(vr00VarI);
                    }
                }
                if (i2 != -239) {
                    arrayList.add(new IntRange(i2, i, 1));
                }
                j910Var.D(arrayList);
                return j910Var;
            case 1:
                ar20 ar20Var = cy2.V;
                ar20 ar20Var2 = cy2.U;
                list.getClass();
                j910 j910Var2 = new j910((byte) 26);
                ArrayList arrayList2 = new ArrayList();
                wvq0 xvq0Var2 = new xvq0(dguVar, list);
                int i4 = -239;
                int i5 = -239;
                while (true) {
                    ar20 ar20VarE = xvq0Var2.e();
                    int i6 = xvq0Var2.f39851a;
                    if (ar20VarE == null) {
                        if (i5 != -239) {
                            arrayList2.add(new IntRange(i5, i4, 1));
                        }
                        j910Var2.D(arrayList2);
                        return j910Var2;
                    }
                    if (Intrinsics.d(xvq0Var2.e(), ar20Var2) || Intrinsics.d(xvq0Var2.e(), ar20Var)) {
                        wvq0 wvq0VarA = xvq0Var2.a();
                        int iB = b(xvq0Var2, true);
                        while (true) {
                            if (wvq0VarA.e() == null) {
                                wvq0VarA = null;
                            } else if ((!Intrinsics.d(wvq0VarA.e(), ar20Var2) && !Intrinsics.d(wvq0VarA.e(), ar20Var)) || b(wvq0VarA, false) != iB) {
                                wvq0VarA = wvq0VarA.a();
                            }
                        }
                        if (wvq0VarA != null) {
                            ((ArrayList) j910Var2.b).add(new sgi0(new IntRange(i6, wvq0VarA.f39851a + 1, 1), wb.t));
                            xvq0Var2 = wvq0VarA.a();
                        }
                    }
                    if (i4 + 1 != i6) {
                        if (i5 != -239) {
                            arrayList2.add(new IntRange(i5, i4, 1));
                        }
                        i5 = i6;
                    }
                    xvq0Var2 = xvq0Var2.a();
                    i4 = i6;
                }
                break;
            case 2:
                list.getClass();
                j910 j910Var3 = new j910((byte) 26);
                ArrayList arrayList3 = new ArrayList();
                wvq0 xvq0Var3 = new xvq0(dguVar, list);
                n0o0 n0o0VarB2 = maz.b(new z0x(dguVar, list, (byte) 0));
                int i7 = -239;
                int i8 = -239;
                while (true) {
                    ar20 ar20VarE2 = xvq0Var3.e();
                    int i9 = xvq0Var3.f39851a;
                    if (ar20VarE2 == null) {
                        if (i8 != -239) {
                            arrayList3.add(new IntRange(i8, i7, 1));
                        }
                        j910Var3.D(arrayList3);
                        return j910Var3;
                    }
                    if (Intrinsics.d(xvq0Var3.e(), cy2.K) && Intrinsics.d(xvq0Var3.g(), cy2.F)) {
                        vr00 vr00VarI2 = gst.i(xvq0Var3.a(), (qb00) n0o0VarB2.getValue());
                        if (vr00VarI2 == null) {
                            vr00VarI2 = efx.G(xvq0Var3.a(), (qb00) n0o0VarB2.getValue());
                        }
                        if (vr00VarI2 != null) {
                            wvq0 wvq0Var = vr00VarI2.f37876a;
                            ((ArrayList) j910Var3.b).add(new sgi0(new IntRange(i9, wvq0Var.f39851a + 1, 1), wb.G));
                            j910Var3.E(vr00VarI2);
                            xvq0Var3 = wvq0Var.a();
                        }
                    }
                    if (i7 + 1 != i9) {
                        if (i8 != -239) {
                            arrayList3.add(new IntRange(i8, i7, 1));
                        }
                        i8 = i9;
                    }
                    xvq0Var3 = xvq0Var3.a();
                    i7 = i9;
                }
                break;
            default:
                list.getClass();
                j910 j910Var4 = new j910((byte) 26);
                ArrayList arrayList4 = new ArrayList();
                wvq0 xvq0Var4 = new xvq0(dguVar, list);
                n0o0 n0o0VarB3 = maz.b(new z0x(dguVar, list, (byte) 2));
                int i10 = -239;
                int i11 = -239;
                while (xvq0Var4.e() != null) {
                    if (!Intrinsics.d(xvq0Var4.e(), cy2.F) || (vr00VarG = efx.G(xvq0Var4, (qb00) n0o0VarB3.getValue())) == null) {
                        int i12 = xvq0Var4.f39851a;
                        if (i10 + 1 != i12) {
                            if (i11 != -239) {
                                arrayList4.add(new IntRange(i11, i10, 1));
                            }
                            i11 = i12;
                        }
                        xvq0Var4 = xvq0Var4.a();
                        i10 = i12;
                    } else {
                        xvq0Var4 = vr00VarG.f37876a.a();
                        j910Var4.E(vr00VarG);
                    }
                }
                if (i11 != -239) {
                    arrayList4.add(new IntRange(i11, i10, 1));
                }
                j910Var4.D(arrayList4);
                return j910Var4;
        }
    }
}
