package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zvm implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45065a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zvm(byte b, l7m0 l7m0Var, boolean z) {
        this.f45065a = b;
        this.b = l7m0Var;
        this.c = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f45065a;
        boolean z = this.c;
        l7m0 l7m0Var = this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        int i = iIntValue & 17;
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    int i2 = 0;
                    for (Object obj4 : (List) l7m0Var.getValue()) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        fetVar.b0(-1573845433, Integer.valueOf(i2));
                        vdb.x(null, (oem) obj4, z, fetVar, 0);
                        fetVar.r(false);
                        i2 = i3;
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    int i4 = 0;
                    for (Object obj5 : (List) l7m0Var.getValue()) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            q3d.p();
                            throw null;
                        }
                        fetVar.b0(-165842530, Integer.valueOf(i4));
                        vdb.x(null, (oem) obj5, z, fetVar, 0);
                        fetVar.r(false);
                        i4 = i5;
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    int i6 = 0;
                    for (Object obj6 : (List) l7m0Var.getValue()) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            q3d.p();
                            throw null;
                        }
                        fetVar.b0(-137213379, Integer.valueOf(i6));
                        vdb.x(null, (oem) obj6, z, fetVar, 0);
                        fetVar.r(false);
                        i6 = i7;
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    int i8 = 0;
                    for (Object obj7 : (List) l7m0Var.getValue()) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            q3d.p();
                            throw null;
                        }
                        fetVar.b0(-108584228, Integer.valueOf(i8));
                        vdb.x(null, (oem) obj7, z, fetVar, 0);
                        fetVar.r(false);
                        i8 = i9;
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
        }
    }
}
