package a;

import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.championships.hltv.SelectAwardParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$selectAwardsScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qp7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29102a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qp7(long j, long j2, Object obj, byte b) {
        this.f29102a = b;
        this.b = j;
        this.c = j2;
        this.d = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29102a;
        long j = this.b;
        long j2 = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(((zfm0) ((yfm0) ((gr00) obj2).c)).a(j2, String.valueOf(j)));
                return Unit.f46060a;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.k(((zfm0) ((uzg) obj2).e).a(j2, String.valueOf(j)));
                return Unit.f46060a;
            case 2:
                ems emsVar = (ems) obj2;
                ((ya30) obj).getClass();
                long j3 = emsVar.f8062a;
                long j4 = emsVar.b;
                m9s m9sVar = emsVar.d;
                String str = m9sVar.i;
                List list = emsVar.c;
                long j5 = m9sVar.p;
                long j6 = m9sVar.o;
                long j7 = this.b;
                boolean zI = jpm0.i(list, j7, j6, j5);
                String str2 = m9sVar.j;
                List list2 = emsVar.c;
                long j8 = m9sVar.p;
                long j9 = m9sVar.o;
                long j10 = this.c;
                boolean zI2 = jpm0.i(list2, j10, j9, j8);
                boolean z = m9sVar.x;
                str.getClass();
                str2.getClass();
                return new ya30(zI, zI2, j7, j10, str, str2, j3, j4, z);
            case 3:
                hfw hfwVar = (hfw) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                vqc vqcVar = hfwVar.y;
                SelectAwardParams selectAwardParams = new SelectAwardParams(((lew) hfwVar.D()).f19925a, this.b, this.c);
                vqcVar.getClass();
                k0w0Var3.h(new CyberGamesScreenFactoryImpl$selectAwardsScreen$1(vqcVar, selectAwardParams));
                return Unit.f46060a;
            case 4:
                s730 s730Var = (s730) obj2;
                List<Pair> list3 = (List) obj;
                atz atzVar = s730.Q1;
                list3.getClass();
                s730Var.G0().f.setVisibility(0);
                s730Var.G0().f.removeViews(1, s730Var.G0().f.getChildCount() - 1);
                TextView textView = s730Var.G0().h;
                rdj rdjVar = rdj.f30294a;
                textView.setText(rdj.g(new ynq0(((long) (((((o700) ((Pair) CollectionsKt.U(list3)).b).f24761a - 0.3f) * (j2 - j)) / 98.0f)) + j), efj.UNIQUE_2, Boolean.valueOf(DateFormat.is24HourFormat(s730Var.o0())), false, 56));
                for (Pair pair : list3) {
                    LayoutInflater layoutInflaterB0 = s730Var.q1;
                    if (layoutInflaterB0 == null) {
                        layoutInflaterB0 = s730Var.b0(null);
                        s730Var.q1 = layoutInflaterB0;
                    }
                    View viewInflate = layoutInflaterB0.inflate(R.layout.chart_coef_cell, (ViewGroup) null, false);
                    int i = R.id.coef;
                    TextView textView2 = (TextView) yum0.f(viewInflate, R.id.coef);
                    if (textView2 != null) {
                        i = R.id.market_name;
                        TextView textView3 = (TextView) yum0.f(viewInflate, R.id.market_name);
                        if (textView3 != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            textView3.setText(String.format("%s:", Arrays.copyOf(new Object[]{pair.f46059a}, 1)));
                            textView2.setText(((o700) pair.b).c);
                            s730Var.G0().f.addView(linearLayout);
                            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        }
                    }
                    hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                    return null;
                }
                s730Var.G0().f.measure(-2, -2);
                return Unit.f46060a;
            case 5:
                o2a0 o2a0Var = (o2a0) obj2;
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                final float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32));
                final float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L));
                float f = fIntBitsToFloat2 / 2.0f;
                zcl zclVar = qmk.f28987a;
                float density = pi9Var.getDensity() * 2.0f;
                boolean z2 = o2a0Var.h;
                float f2 = o2a0Var.f24523a;
                float f3 = o2a0Var.b;
                float f4 = z2 ? f3 : f2;
                if (!z2) {
                    f2 = f3;
                }
                float f5 = f2 + f4;
                float fC = f5 <= 0.0f ? 0.5f : l1e0.c(f4 / f5, 0.0f, 1.0f);
                float f6 = density / 2.0f;
                final float fC2 = l1e0.c((fC * fIntBitsToFloat) - f6, 0.0f, fIntBitsToFloat);
                final float fC3 = l1e0.c(((1.0f - fC) * fIntBitsToFloat) - f6, 0.0f, fIntBitsToFloat);
                final float fMin = Math.min(f, fC2 / 2.0f);
                final float fMin2 = Math.min(f, fC3 / 2.0f);
                final long j11 = this.b;
                final long j12 = this.c;
                return pi9Var.a(new Function1() { // from class: a.fna0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        fhl fhlVar = (fhl) obj3;
                        fhlVar.getClass();
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fC2);
                        float f7 = fIntBitsToFloat2;
                        long jFloatToRawIntBits3 = (jFloatToRawIntBits2 << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                        float f8 = fMin;
                        fhl.o0(fhlVar, j11, jFloatToRawIntBits, jFloatToRawIntBits3, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), null, 240);
                        float f9 = fIntBitsToFloat;
                        float f10 = fC3;
                        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f9 - f10)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                        float f11 = fMin2;
                        fhl.o0(fhlVar, j12, jFloatToRawIntBits4, jFloatToRawIntBits5, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), null, 240);
                        return Unit.f46060a;
                    }
                });
            case 6:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                k0w0Var4.h(((v3b0) obj2).t.q(new fr1(new fs80(null, this.b, kotlin.collections.a.c(Long.valueOf(j2)), null, 0L, false, 121), null, 2)));
                return Unit.f46060a;
            case 7:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.b(String.valueOf(j));
                n1gVar.c = j2;
                n1gVar.e = ((e5l0) ((tjb0) obj2).d()).g;
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_REGULAR;
                return Unit.f46060a;
            default:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.o0(fhlVar, this.b, 0L, 0L, this.c, (vtm0) obj2, 230);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ qp7(Object obj, long j, long j2, byte b) {
        this.f29102a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }
}
