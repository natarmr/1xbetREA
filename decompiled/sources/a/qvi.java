package a;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
public final class qvi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ msi f29387a;

    public qvi(msi msiVar) {
        this.f29387a = msiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        rvi rviVar = (rvi) this.f29387a.c;
        i1w0 i1w0Var = rviVar.g;
        ctf0 ctf0Var = rviVar.k;
        vby vbyVar = rviVar.l;
        final us00 us00Var = rviVar.m;
        yuu yuuVar = new yuu(vbyVar, us00Var);
        vbyVar.getClass();
        final n660 n660Var = new n660();
        n660Var.f22981a = vbyVar;
        final byte b = 0;
        n660Var.b = maz.b(new Function0() { // from class: a.xwn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                byte b2 = b;
                n660 n660Var2 = n660Var;
                us00 us00Var2 = us00Var;
                switch (b2) {
                    case 0:
                        InputStream inputStreamOpen = us00Var2.getAssets().open("gameEventsCardOne.json");
                        try {
                            byte[] bArr = new byte[inputStreamOpen.available()];
                            inputStreamOpen.read(bArr);
                            String str = new String(bArr, Charsets.UTF_8);
                            inputStreamOpen.close();
                            vby vbyVar2 = (vby) n660Var2.f22981a;
                            vbyVar2.getClass();
                            return (d600) vbyVar2.b(d600.Companion.serializer(), str);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                bkb.E(inputStreamOpen, th);
                                throw th2;
                            }
                        }
                    case 1:
                        InputStream inputStreamOpen2 = us00Var2.getAssets().open("gameEventsCardTwo.json");
                        try {
                            byte[] bArr2 = new byte[inputStreamOpen2.available()];
                            inputStreamOpen2.read(bArr2);
                            String str2 = new String(bArr2, Charsets.UTF_8);
                            inputStreamOpen2.close();
                            vby vbyVar3 = (vby) n660Var2.f22981a;
                            vbyVar3.getClass();
                            return (d600) vbyVar3.b(d600.Companion.serializer(), str2);
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                bkb.E(inputStreamOpen2, th3);
                                throw th4;
                            }
                        }
                    default:
                        InputStream inputStreamOpen3 = us00Var2.getAssets().open("gameEventsCardThree.json");
                        try {
                            byte[] bArr3 = new byte[inputStreamOpen3.available()];
                            inputStreamOpen3.read(bArr3);
                            String str3 = new String(bArr3, Charsets.UTF_8);
                            inputStreamOpen3.close();
                            vby vbyVar4 = (vby) n660Var2.f22981a;
                            vbyVar4.getClass();
                            return (d600) vbyVar4.b(d600.Companion.serializer(), str3);
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                bkb.E(inputStreamOpen3, th5);
                                throw th6;
                            }
                        }
                }
            }
        });
        final byte b2 = 1;
        n660Var.c = maz.b(new Function0() { // from class: a.xwn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                byte b3 = b2;
                n660 n660Var2 = n660Var;
                us00 us00Var2 = us00Var;
                switch (b3) {
                    case 0:
                        InputStream inputStreamOpen = us00Var2.getAssets().open("gameEventsCardOne.json");
                        try {
                            byte[] bArr = new byte[inputStreamOpen.available()];
                            inputStreamOpen.read(bArr);
                            String str = new String(bArr, Charsets.UTF_8);
                            inputStreamOpen.close();
                            vby vbyVar2 = (vby) n660Var2.f22981a;
                            vbyVar2.getClass();
                            return (d600) vbyVar2.b(d600.Companion.serializer(), str);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                bkb.E(inputStreamOpen, th);
                                throw th2;
                            }
                        }
                    case 1:
                        InputStream inputStreamOpen2 = us00Var2.getAssets().open("gameEventsCardTwo.json");
                        try {
                            byte[] bArr2 = new byte[inputStreamOpen2.available()];
                            inputStreamOpen2.read(bArr2);
                            String str2 = new String(bArr2, Charsets.UTF_8);
                            inputStreamOpen2.close();
                            vby vbyVar3 = (vby) n660Var2.f22981a;
                            vbyVar3.getClass();
                            return (d600) vbyVar3.b(d600.Companion.serializer(), str2);
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                bkb.E(inputStreamOpen2, th3);
                                throw th4;
                            }
                        }
                    default:
                        InputStream inputStreamOpen3 = us00Var2.getAssets().open("gameEventsCardThree.json");
                        try {
                            byte[] bArr3 = new byte[inputStreamOpen3.available()];
                            inputStreamOpen3.read(bArr3);
                            String str3 = new String(bArr3, Charsets.UTF_8);
                            inputStreamOpen3.close();
                            vby vbyVar4 = (vby) n660Var2.f22981a;
                            vbyVar4.getClass();
                            return (d600) vbyVar4.b(d600.Companion.serializer(), str3);
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                bkb.E(inputStreamOpen3, th5);
                                throw th6;
                            }
                        }
                }
            }
        });
        final byte b3 = 2;
        n660Var.d = maz.b(new Function0() { // from class: a.xwn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                byte b4 = b3;
                n660 n660Var2 = n660Var;
                us00 us00Var2 = us00Var;
                switch (b4) {
                    case 0:
                        InputStream inputStreamOpen = us00Var2.getAssets().open("gameEventsCardOne.json");
                        try {
                            byte[] bArr = new byte[inputStreamOpen.available()];
                            inputStreamOpen.read(bArr);
                            String str = new String(bArr, Charsets.UTF_8);
                            inputStreamOpen.close();
                            vby vbyVar2 = (vby) n660Var2.f22981a;
                            vbyVar2.getClass();
                            return (d600) vbyVar2.b(d600.Companion.serializer(), str);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                bkb.E(inputStreamOpen, th);
                                throw th2;
                            }
                        }
                    case 1:
                        InputStream inputStreamOpen2 = us00Var2.getAssets().open("gameEventsCardTwo.json");
                        try {
                            byte[] bArr2 = new byte[inputStreamOpen2.available()];
                            inputStreamOpen2.read(bArr2);
                            String str2 = new String(bArr2, Charsets.UTF_8);
                            inputStreamOpen2.close();
                            vby vbyVar3 = (vby) n660Var2.f22981a;
                            vbyVar3.getClass();
                            return (d600) vbyVar3.b(d600.Companion.serializer(), str2);
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                bkb.E(inputStreamOpen2, th3);
                                throw th4;
                            }
                        }
                    default:
                        InputStream inputStreamOpen3 = us00Var2.getAssets().open("gameEventsCardThree.json");
                        try {
                            byte[] bArr3 = new byte[inputStreamOpen3.available()];
                            inputStreamOpen3.read(bArr3);
                            String str3 = new String(bArr3, Charsets.UTF_8);
                            inputStreamOpen3.close();
                            vby vbyVar4 = (vby) n660Var2.f22981a;
                            vbyVar4.getClass();
                            return (d600) vbyVar4.b(d600.Companion.serializer(), str3);
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                bkb.E(inputStreamOpen3, th5);
                                throw th6;
                            }
                        }
                }
            }
        });
        edu eduVar = new edu(new g090(yuuVar, n660Var), rviVar.f, (byte) 12);
        boolean zBooleanValue = rviVar.n.booleanValue();
        wyu wyuVar = rviVar.f31168a;
        wsf0 wsf0Var = rviVar.o;
        g45 g45Var = (g45) wsf0Var.b;
        ahu ahuVarY = g45Var.y();
        m0u m0uVarT = g45Var.t();
        nrt nrtVarQ = g45Var.q();
        mne mneVar = rviVar.e;
        ali aliVar = new ali(ahuVarY, m0uVarT, nrtVarQ, mneVar);
        z7u z7uVar = rviVar.p;
        zri zriVar = rviVar.q;
        hnu hnuVarG = ((qgd) rviVar.r.f30839a).G();
        g45 g45Var2 = (g45) wsf0Var.b;
        return new arn0(vzg0Var, i1w0Var, ctf0Var, eduVar, zBooleanValue, wyuVar, aliVar, mneVar, z7uVar, zriVar, new uii(hnuVarG, g45Var2.q(), g45Var2.y(), g45Var2.t(), g45Var2.F(), mneVar), ((g45) wsf0Var.b).p(), rviVar.s, new m6m0((byte) 8), rviVar.i, rviVar.t, rviVar.u, rviVar.v);
    }
}
