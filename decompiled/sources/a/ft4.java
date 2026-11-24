package a;

import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.WebSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class ft4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vby f10092a;
    public final mne b;
    public final at4 c;
    public final knf0 d;
    public final epi0 e;
    public final rp4 f;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();

    public ft4(vby vbyVar, mne mneVar, at4 at4Var, knf0 knf0Var, tgk tgkVar, epi0 epi0Var, us3 us3Var, rp4 rp4Var) {
        this.f10092a = vbyVar;
        this.b = mneVar;
        this.c = at4Var;
        this.d = knf0Var;
        this.e = epi0Var;
        this.f = rp4Var;
    }

    public final void a(WebSocket webSocket) {
        at4 at4Var = this.c;
        String str = at4Var.e;
        if (str.length() > 0) {
            String str2 = at4Var.f1417a.f32933a;
            bkk0[] bkk0VarArr = bkk0.f2753a;
            tyf0 tyf0Var = new tyf0(str2, new syf0(str));
            webSocket.a(this.f10092a.d(tyf0.Companion.serializer(), tyf0Var));
        }
        at4Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(WebSocket webSocket, ckk0 ckk0Var) {
        String strD;
        int iOrdinal = ckk0Var.ordinal();
        vby vbyVar = this.f10092a;
        at4 at4Var = this.c;
        switch (iOrdinal) {
            case 0:
                String str = at4Var.f1417a.f32933a;
                String strA = ckk0Var.a();
                zs4 zs4Var = at4Var.f;
                strD = vbyVar.d(mzf0.Companion.serializer(), new mzf0(str, strA, new kzf0(zs4Var.b, zs4Var.f44889a)));
                break;
            case 1:
            case 2:
            case 4:
            case 6:
                String str2 = at4Var.f1417a.f32933a;
                String strA2 = ckk0Var.a();
                int i = 1;
                switch (ckk0Var.ordinal()) {
                    case 0:
                    case 1:
                        strD = vbyVar.d(y080.Companion.serializer(), new y080(str2, strA2, new x080(Integer.valueOf(i))));
                        break;
                    case 2:
                        i = 2;
                        strD = vbyVar.d(y080.Companion.serializer(), new y080(str2, strA2, new x080(Integer.valueOf(i))));
                        break;
                    case 3:
                        i = 0;
                        strD = vbyVar.d(y080.Companion.serializer(), new y080(str2, strA2, new x080(Integer.valueOf(i))));
                        break;
                    case 4:
                        i = 6;
                        strD = vbyVar.d(y080.Companion.serializer(), new y080(str2, strA2, new x080(Integer.valueOf(i))));
                        break;
                    case 5:
                        i = 4;
                        strD = vbyVar.d(y080.Companion.serializer(), new y080(str2, strA2, new x080(Integer.valueOf(i))));
                        break;
                    case 6:
                        i = 5;
                        strD = vbyVar.d(y080.Companion.serializer(), new y080(str2, strA2, new x080(Integer.valueOf(i))));
                        break;
                    default:
                        t9f.b();
                        break;
                }
                return;
            case 3:
                strD = vbyVar.d(cof0.Companion.serializer(), new cof0(at4Var.f1417a.f32933a, ckk0Var.a(), new bof0(at4Var.e)));
                break;
            case 5:
                strD = vbyVar.d(en50.Companion.serializer(), new en50(at4Var.f1417a.f32933a, ckk0Var.a(), new dn50(at4Var.f.c)));
                break;
            default:
                t9f.b();
                return;
        }
        if (strD.length() > 0) {
            webSocket.a(strD);
        }
    }
}
