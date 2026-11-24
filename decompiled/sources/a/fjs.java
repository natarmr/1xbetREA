package a;

import android.javax.sip.message.Request;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fjs implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9658a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ fjs(boolean z, int i, ArrayList arrayList, int i2) {
        this.f9658a = (byte) 0;
        this.b = z;
        this.d = i;
        this.c = arrayList;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9658a;
        int i = this.e;
        int i2 = this.d;
        ArrayList arrayList = this.c;
        boolean z = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                if (z) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        pu90 pu90Var = (pu90) arrayList.get(i3);
                        i2 -= pu90Var.f27604a + i;
                        ou90Var.g(pu90Var, i2, 0, 1.0f);
                    }
                } else {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        pu90 pu90Var2 = (pu90) arrayList.get(i5);
                        ou90Var.m(pu90Var2, i4, 0, 1.0f);
                        i4 += pu90Var2.f27604a + i;
                    }
                }
                break;
            case 1:
                ou90Var.getClass();
                if (z) {
                    int size3 = arrayList.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i6 = size3 - 1;
                            pu90 pu90Var3 = (pu90) arrayList.get(size3);
                            Object objN = pu90Var3.n();
                            p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                            Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                            if (Intrinsics.d(objG0, Request.INFO)) {
                                ou90Var.g(pu90Var3, i2 - pu90Var3.f27604a, i - pu90Var3.b, 0.0f);
                            } else if (Intrinsics.d(objG0, "SCORE")) {
                                ou90Var.g(pu90Var3, 0, 0, 0.0f);
                            }
                            if (i6 >= 0) {
                                size3 = i6;
                            }
                        }
                    }
                } else {
                    int size4 = arrayList.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i7 = size4 - 1;
                            pu90 pu90Var4 = (pu90) arrayList.get(size4);
                            Object objN2 = pu90Var4.n();
                            p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                            Object objG1 = p6zVar2 != null ? p6zVar2.g0() : null;
                            if (Intrinsics.d(objG1, Request.INFO)) {
                                ou90Var.g(pu90Var4, 0, i - pu90Var4.b, 0.0f);
                            } else if (Intrinsics.d(objG1, "SCORE")) {
                                ou90Var.g(pu90Var4, i2 - pu90Var4.f27604a, 0, 0.0f);
                            }
                            if (i7 >= 0) {
                                size4 = i7;
                            }
                        }
                    }
                }
                break;
            default:
                ou90Var.getClass();
                if (z) {
                    int size5 = arrayList.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i8 = size5 - 1;
                            pu90 pu90Var5 = (pu90) arrayList.get(size5);
                            Object objN3 = pu90Var5.n();
                            p6z p6zVar3 = objN3 instanceof p6z ? (p6z) objN3 : null;
                            Object objG2 = p6zVar3 != null ? p6zVar3.g0() : null;
                            if (Intrinsics.d(objG2, Request.INFO)) {
                                ou90Var.g(pu90Var5, i2 - pu90Var5.f27604a, i - pu90Var5.b, 0.0f);
                            } else if (Intrinsics.d(objG2, "SCORE")) {
                                ou90Var.g(pu90Var5, 0, 0, 0.0f);
                            }
                            if (i8 >= 0) {
                                size5 = i8;
                            }
                        }
                    }
                } else {
                    int size6 = arrayList.size() - 1;
                    if (size6 >= 0) {
                        while (true) {
                            int i9 = size6 - 1;
                            pu90 pu90Var6 = (pu90) arrayList.get(size6);
                            Object objN4 = pu90Var6.n();
                            p6z p6zVar4 = objN4 instanceof p6z ? (p6z) objN4 : null;
                            Object objG3 = p6zVar4 != null ? p6zVar4.g0() : null;
                            if (Intrinsics.d(objG3, Request.INFO)) {
                                ou90Var.g(pu90Var6, 0, i - pu90Var6.b, 0.0f);
                            } else if (Intrinsics.d(objG3, "SCORE")) {
                                ou90Var.g(pu90Var6, i2 - pu90Var6.f27604a, 0, 0.0f);
                            }
                            if (i9 >= 0) {
                                size6 = i9;
                            }
                        }
                    }
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fjs(boolean z, ArrayList arrayList, int i, int i2, byte b) {
        this.f9658a = b;
        this.b = z;
        this.c = arrayList;
        this.d = i;
        this.e = i2;
    }
}
