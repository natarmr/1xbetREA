package a;

import android.graphics.Path;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sva implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32857a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ sva(ArrayList arrayList, int i, int i2) {
        this.f32857a = (byte) 1;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f32857a;
        int i = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                int i3 = 0;
                int i4 = 0;
                for (Object obj3 : arrayList) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    pu90 pu90Var = (pu90) obj3;
                    ou90Var.m(pu90Var, i4, (i2 - pu90Var.b) / 2, arrayList.size() - i3);
                    int i6 = pu90Var.f27604a - i;
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    i4 += i6;
                    i3 = i5;
                }
                return Unit.f46060a;
            case 1:
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                for (pu90 pu90Var2 : (ArrayList) obj2) {
                    ou90Var2.m(pu90Var2, i2, 0, 0.0f);
                    i2 += pu90Var2.f27604a + i;
                }
                return Unit.f46060a;
            default:
                w03 w03Var = (w03) obj2;
                yn80 yn80Var = (yn80) obj;
                s03 s03Var = yn80Var.f42927a;
                int iD = yn80Var.d(i2);
                int iD2 = yn80Var.d(i);
                CharSequence charSequence = s03Var.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder sbT = dw9.t("start(", iD, ") or end(", ") is out of range [0..", iD2);
                    sbT.append(length);
                    sbT.append("], or start > end!");
                    ycx.a(sbT.toString());
                }
                Path path = new Path();
                y8q0 y8q0Var = s03Var.d;
                y8q0Var.f.getSelectionPath(iD, iD2, path);
                int i7 = y8q0Var.h;
                if (i7 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i7);
                }
                w03 w03Var2 = new w03(path);
                w03Var2.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(yn80Var.f)) & 4294967295L));
                w03.a(w03Var, w03Var2);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ sva(byte b, int i, int i2, Object obj) {
        this.f32857a = b;
        this.c = obj;
        this.b = i;
        this.d = i2;
    }
}
