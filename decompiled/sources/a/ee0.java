package a;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.media.AudioRecord;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;

/* JADX INFO: loaded from: classes3.dex */
public final class ee0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(k3t0 k3t0Var, cr4 cr4Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = cr4Var;
        this.l = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                ee0 ee0Var = new ee0(obj3, obj2, yjeVar, (byte) 0);
                ee0Var.j = obj;
                return ee0Var;
            case 1:
                lkz lkzVar = lkz.f20223a;
                return new ee0((k3t0) this.j, (uu0) obj3, (pz40) obj2, yjeVar);
            case 2:
                lkz lkzVar2 = lkz.f20223a;
                return new ee0((k3t0) this.j, (kv0) obj3, (pz40) obj2, yjeVar);
            case 3:
                lkz lkzVar3 = lkz.f20223a;
                return new ee0((k3t0) this.j, (ea1) obj3, (pz40) obj2, yjeVar);
            case 4:
                lkz lkzVar4 = lkz.f20223a;
                return new ee0((k3t0) this.j, (ae1) obj3, (pz40) obj2, yjeVar);
            case 5:
                lkz lkzVar5 = lkz.f20223a;
                return new ee0((k3t0) this.j, (t42) obj3, (pz40) obj2, yjeVar);
            case 6:
                ee0 ee0Var2 = new ee0(obj3, obj2, yjeVar, (byte) 6);
                ee0Var2.j = obj;
                return ee0Var2;
            case 7:
                ee0 ee0Var3 = new ee0(obj3, obj2, yjeVar, (byte) 7);
                ee0Var3.j = obj;
                return ee0Var3;
            case 8:
                ee0 ee0Var4 = new ee0(obj3, obj2, yjeVar, (byte) 8);
                ee0Var4.j = obj;
                return ee0Var4;
            case 9:
                return new ee0((mii0) this.j, (String) obj2, (yk3) obj3, yjeVar);
            case 10:
                ee0 ee0Var5 = new ee0(obj3, obj2, yjeVar, (byte) 10);
                ee0Var5.j = obj;
                return ee0Var5;
            case 11:
                return new ee0((oms0) this.j, (p54) obj3, (Function1) obj2, yjeVar, (byte) 11);
            case 12:
                lkz lkzVar6 = lkz.f20223a;
                return new ee0((k3t0) this.j, (cr4) obj3, (pz40) obj2, yjeVar);
            case 13:
                return new ee0((gr00) this.j, (ed5) obj3, (dd5) obj2, yjeVar, (byte) 13);
            case 14:
                return new ee0((Context) this.j, (dz5) obj3, (Intent) obj2, yjeVar, (byte) 14);
            case 15:
                lkz lkzVar7 = lkz.f20223a;
                return new ee0((k3t0) this.j, (is6) obj3, (pz40) obj2, yjeVar);
            case 16:
                return new ee0((f97) this.j, (kzv) obj3, (ql5) obj2, yjeVar, (byte) 16);
            case 17:
                return new ee0((rv2) this.j, (Function0) obj3, (pkk0) obj2, yjeVar, (byte) 17);
            case 18:
                return new ee0((gfj) this.j, (Function1) obj3, (l7m0) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ee0((ffj) this.j, (Function1) obj3, (l7m0) obj2, yjeVar, (byte) 19);
            case 20:
                lkz lkzVar8 = lkz.f20223a;
                return new ee0((k3t0) this.j, (ut9) obj3, (pz40) obj2, yjeVar);
            case 21:
                return new ee0((l7m0) this.j, (agk0) obj3, (agk0) obj2, yjeVar, (byte) 21);
            case 22:
                return new ee0((mua) this.j, (pz40) obj3, (pz40) obj2, yjeVar, (byte) 22);
            case 23:
                return new ee0((fua) this.j, (udl0) obj3, (ArrayList) obj2, yjeVar, (byte) 23);
            case 24:
                lkz lkzVar9 = lkz.f20223a;
                return new ee0((k3t0) this.j, (esc) obj3, (pz40) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ee0((Throwable) this.j, (ConfirmationAuthenticatorWorker) obj3, (Application) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ee0((Throwable) this.j, (g1e) obj3, (m7a) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ee0 ee0Var6 = new ee0(obj3, obj2, yjeVar, (byte) 27);
                ee0Var6.j = obj;
                return ee0Var6;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ee0 ee0Var7 = new ee0((String) obj2, (Set) obj3, yjeVar);
                ee0Var7.j = obj;
                return ee0Var7;
            default:
                ee0 ee0Var8 = new ee0(obj3, obj2, yjeVar, (byte) 29);
                ee0Var8.j = obj;
                return ee0Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ee0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ee0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ee0) create((kc3) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ee0) create((i8d) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ee0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((ee0) create((hbe) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((ee0) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ee0) create((bm9) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        wd0 wd0Var;
        Object value2;
        Object value3;
        jh3 jh3Var;
        ArrayList arrayList;
        AudioRecord audioRecord;
        String str;
        Object value4;
        i77 i77Var;
        pkk0 pkk0Var;
        byte b = this.i;
        Object obj2 = this.k;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                List<s5d0> list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                for (s5d0 s5d0Var : list) {
                    s5d0Var.getClass();
                    arrayList2.add(new eol(s5d0Var.f31650a, new n0x(s5d0Var.c), false, s5d0Var.b, String.valueOf(s5d0Var.h), "", new m0x(R.drawable.ic_aggregator_placeholder, null, 6)));
                }
                String str2 = (String) obj3;
                int i = oe0.I;
                p7m0 p7m0Var = ((oe0) obj2).i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    wd0Var = (wd0) value;
                } while (!p7m0Var.m(value, arrayList2.isEmpty() ? wd0.a(wd0Var, rd0.f30266a, list, str2, 4) : wd0.a(wd0Var, new qd0(arrayList2), list, str2, 4)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar = lkz.f20223a;
                oc ocVar = new oc(2, (Function1) ((pz40) obj3).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 9);
                clz clzVarW = aac.W((uu0) obj2);
                qjj.W(x0x.Q(clzVarW.x()), null, null, new kz((i89) gmqVarC, clzVarW, ocVar, (yje) null, (byte) 0, (byte) 0), 3);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC2 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar2 = lkz.f20223a;
                oc ocVar2 = new oc(2, (Function1) ((pz40) obj3).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 10);
                clz clzVarW2 = aac.W((kv0) obj2);
                qjj.W(x0x.Q(clzVarW2.x()), null, null, new kz((i89) gmqVarC2, clzVarW2, ocVar2, (yje) null, (byte) 0, (char) 0), 3);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC3 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar3 = lkz.f20223a;
                oc ocVar3 = new oc(2, (Function1) ((pz40) obj3).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 15);
                clz clzVarW3 = aac.W((ea1) obj2);
                qjj.W(x0x.Q(clzVarW3.x()), null, null, new y51((i89) gmqVarC3, clzVarW3, ocVar3, (yje) null, (byte) 0), 3);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC4 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar4 = lkz.f20223a;
                oc ocVar4 = new oc(2, (Function1) ((pz40) obj3).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 18);
                clz clzVarW4 = aac.W((ae1) obj2);
                qjj.W(x0x.Q(clzVarW4.x()), null, null, new y51((i89) gmqVarC4, clzVarW4, ocVar4, (yje) null, 0), 3);
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC5 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar5 = lkz.f20223a;
                oc ocVar5 = new oc(2, (Function1) ((pz40) obj3).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 26);
                clz clzVarW5 = aac.W((t42) obj2);
                qjj.W(x0x.Q(clzVarW5.x()), null, null, new y51((i89) gmqVarC5, clzVarW5, ocVar5, (yje) null, (char) 0, (byte) 0), 3);
                return Unit.f46060a;
            case 6:
                List list2 = (List) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                Date date = (Date) obj3;
                int i2 = zb2.A;
                p7m0 p7m0Var2 = ((zb2) obj2).i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, dc2.a((dc2) value2, list2, null, false, false, false, false, false, null, date, 7110)));
                return Unit.f46060a;
            case 7:
                kc3 kc3Var = (kc3) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                dc3 dc3Var = (dc3) obj3;
                TextView textView = (TextView) dc3Var.e;
                ImageView imageView = (ImageView) dc3Var.d;
                String str3 = kc3Var.f18040a;
                jc3 jc3Var = kc3Var.c;
                textView.setText(str3);
                textView.requestLayout();
                List list3 = u0d.f34849a;
                u0d.j(imageView, jc3Var.f16257a, kc3Var.b, 0, null, null, null, 508);
                return Unit.f46060a;
            case 8:
                vw5 vw5Var = (vw5) obj3;
                i8d i8dVar = (i8d) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (i8dVar == i8d.c || i8dVar == i8d.d) {
                    ij3 ij3Var = (ij3) obj2;
                    kh3 kh3VarB = vw5Var.b();
                    fnf0 fnf0VarE = vw5Var.e();
                    p7m0 p7m0Var3 = ij3Var.j0;
                    do {
                        value3 = p7m0Var3.getValue();
                        jh3Var = (jh3) value3;
                        List<npm0> list4 = jh3Var.d;
                        arrayList = new ArrayList(r3d.q(list4, 10));
                        for (npm0 npm0Var : list4) {
                            if (npm0Var.f23921a == kh3VarB) {
                                List<mpm0> list5 = npm0Var.b;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list5, 10));
                                for (mpm0 mpm0VarA : list5) {
                                    if (Intrinsics.d(mpm0VarA.f22186a, fnf0VarE)) {
                                        mpm0VarA = mpm0.a(mpm0VarA);
                                    }
                                    arrayList3.add(mpm0VarA);
                                }
                                npm0Var = new npm0(npm0Var.f23921a, arrayList3);
                            }
                            arrayList.add(npm0Var);
                        }
                    } while (!p7m0Var3.m(value3, jh3.a(jh3Var, null, arrayList, null, null, null, null, null, null, false, false, 4087)));
                    ij3Var.b.e(fnf0VarE.a(), Boolean.TRUE);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                mii0 mii0Var = (mii0) this.j;
                krv0 krv0Var = (krv0) mii0Var.b;
                File fileA = ((hk3) mii0Var.e).a((String) obj3);
                yk3 yk3Var = (yk3) obj2;
                krv0Var.getClass();
                krv0Var.f18787a = false;
                byte[] bArr = new byte[8192];
                long length = fileA.length() - 8192;
                if (length <= 0) {
                    length = 0;
                }
                if (length > 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(fileA, "r");
                    try {
                        randomAccessFile.seek(length);
                        randomAccessFile.read(bArr, 0, 8192);
                        randomAccessFile.close();
                        krv0Var.b = true;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            bkb.E(randomAccessFile, th);
                            throw th2;
                        }
                    }
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(yk3Var.f42768a, 8192);
                try {
                    krv0Var.a(fileA, bufferedInputStream, yk3Var.b + fileA.length(), bArr);
                    bufferedInputStream.close();
                    return Unit.f46060a;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        bkb.E(bufferedInputStream, th3);
                        throw th4;
                    }
                }
            case 10:
                v34 v34Var = (v34) obj2;
                vne vneVar = (vne) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                short[] sArr = new short[160];
                while (true) {
                    int i3 = 0;
                    while (true) {
                        if (d5c.R(vneVar) && (audioRecord = v34Var.f36716a) != null) {
                            int i4 = audioRecord.read(sArr, i3, 160 - i3);
                            if (i4 <= 0 || (i3 = i3 + i4) != 160) {
                            }
                        }
                    }
                    if (!v34Var.e.get()) {
                        ((q99) obj3).f(Arrays.copyOf(sArr, 160));
                    }
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                oms0 oms0Var = (oms0) this.j;
                boolean z = oms0Var.f25519a.y0() == ((hgk0) oms0Var.d).getValue();
                if (((p54) obj2).b && z) {
                    ((Function1) obj3).invoke(v44.f36761a);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC6 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar6 = lkz.f20223a;
                df2 df2Var = new df2(2, (Function1) ((pz40) obj3).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 21);
                clz clzVarW6 = aac.W((cr4) obj2);
                qjj.W(x0x.Q(clzVarW6.x()), null, null, new ac4((i89) gmqVarC6, clzVarW6, df2Var, (yje) null, 0), 3);
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                bf3 bf3Var = (bf3) ((gr00) this.j).b;
                ed5 ed5Var = (ed5) obj2;
                dd5 dd5Var = (dd5) obj3;
                ed5Var.getClass();
                dd5Var.getClass();
                int iOrdinal = ed5Var.ordinal();
                if (iOrdinal == 0) {
                    str = "START_";
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    str = "UPDATE_";
                }
                bf3Var.b(str, "BACKGROUND_SMALL_VIDEO_URN", dd5Var.f5880a);
                bf3Var.b(str, "BACKGROUND_SMALL_PREVIEW_URN", dd5Var.b);
                bf3Var.b(str, "BACKGROUND_SMALL_IMAGE_URN", dd5Var.c);
                bf3Var.b(str, "BACKGROUND_MEDIUM_VIDEO_URN", dd5Var.d);
                bf3Var.b(str, "BACKGROUND_MEDIUM_PREVIEW_URN", dd5Var.e);
                bf3Var.b(str, "BACKGROUND_MEDIUM_IMAGE_URN", dd5Var.f);
                bf3Var.b(str, "BACKGROUND_LARGE_VIDEO_URN", dd5Var.g);
                bf3Var.b(str, "BACKGROUND_LARGE_PREVIEW_URN", dd5Var.h);
                bf3Var.b(str, "BACKGROUND_LARGE_IMAGE_URN", dd5Var.i);
                bf3Var.b(str, "BACKGROUND_LOGO_URN", dd5Var.j);
                bf3Var.b(str, "BACKGROUND_PARTNERS_URN", dd5Var.k);
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                Context context = (Context) this.j;
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                dz5 dz5Var = (dz5) obj2;
                appWidgetManager.getClass();
                dz5Var.onUpdate(context, appWidgetManager, new int[0]);
                dz5Var.n(context, (Intent) obj3);
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC7 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar7 = lkz.f20223a;
                df2 df2Var2 = new df2(2, (Function1) ((pz40) obj3).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 29);
                clz clzVarW7 = aac.W((is6) obj2);
                qjj.W(x0x.Q(clzVarW7.x()), null, null, new td6((i89) gmqVarC7, clzVarW7, df2Var2, (yje) null, (char) 0), 3);
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                f97 f97Var = (f97) this.j;
                ctf0 ctf0Var = f97Var.r;
                int i5 = f97.R0;
                p7m0 p7m0Var4 = f97Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    i77Var = (i77) value4;
                } while (!p7m0Var4.m(value4, i77.a(i77Var, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, i77Var.H, null, null, -3, 2045)));
                String strA = ctf0Var.b.a(R.string.bet_sell_successfully, Arrays.copyOf(new Object[0], 0));
                double d = ((kzv) obj2).m;
                String str4 = ((ql5) obj3).f;
                pn40 pn40Var = pn40.f27267a;
                f97Var.G(new q67(strA, kng0.l(ctf0Var.b.a(R.string.amount_will_be_credited, Arrays.copyOf(new Object[0], 0)), Separators.SP, BidiFormatter.getInstance().unicodeWrap(pn40.d(d, str4, p3u0.c), TextDirectionHeuristics.LTR))));
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                pz40 pz40Var = ((rv2) this.j).c;
                if (((hgk0) pz40Var).getValue() == pt2.f27542a) {
                    ((Function0) obj2).invoke();
                }
                if (((hgk0) pz40Var).getValue() != pt2.c && (pkk0Var = (pkk0) obj3) != null) {
                    ((r3k) pkk0Var).a();
                }
                return Unit.f46060a;
            case 18:
                gfj gfjVar = (gfj) this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                if (!((Boolean) ((l7m0) obj3).getValue()).booleanValue() && gfjVar.Q() != null) {
                    gfjVar.i.setValue(null);
                    ((Function1) obj2).invoke(null);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                if (!((Boolean) ((l7m0) obj3).getValue()).booleanValue()) {
                    ((ffj) this.j).f.setValue(null);
                    ((Function1) obj2).invoke(null);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC8 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar8 = lkz.f20223a;
                o47 o47Var = new o47(2, (Function1) ((pz40) obj3).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 16);
                clz clzVarW8 = aac.W((ut9) obj2);
                qjj.W(x0x.Q(clzVarW8.x()), null, null, new l19((i89) gmqVarC8, clzVarW8, o47Var, (yje) null, 0), 3);
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                int iOrdinal2 = ((hea) ((l7m0) this.j).getValue()).ordinal();
                if (iOrdinal2 == 0) {
                    ((agk0) obj2).m(0.5f);
                } else if (iOrdinal2 == 1) {
                    ((agk0) obj3).m(0.5f);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                if (((dja) ((pz40) obj2).getValue()) == null) {
                    ((pz40) obj3).setValue(((mua) this.j).b);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                fua fuaVar = (fua) this.j;
                mta mtaVar = fuaVar.f10153a;
                udl0 udl0Var = (udl0) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                mtaVar.getClass();
                q7d0 q7d0Var = mtaVar.f22361a;
                q7d0Var.g("KEY_CARDS_INFO_SETTINGS_SPORT_GAME_TYPE", udl0Var.name());
                q7d0Var.g("KEY_CARDS_INFO_SETTINGS_ORDER", CollectionsKt.b0(arrayList4, Separators.COMMA, null, null, new d69((byte) 26), 30));
                kta ktaVar = fuaVar.c;
                ktaVar.getClass();
                ktaVar.f18853a.o(null, new lta(udl0Var, arrayList4));
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC9 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar9 = lkz.f20223a;
                mhc mhcVar = new mhc(2, (Function1) ((pz40) obj3).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 3);
                clz clzVarW9 = aac.W((esc) obj2);
                qjj.W(x0x.Q(clzVarW9.x()), null, null, new vxb((i89) gmqVarC9, clzVarW9, mhcVar, (yje) null, 0), 3);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Application application = (Application) obj3;
                ConfirmationAuthenticatorWorker confirmationAuthenticatorWorker = (ConfirmationAuthenticatorWorker) obj2;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                Throwable th5 = (Throwable) this.j;
                if (th5 instanceof oqt0) {
                    Intent intent = new Intent(j120.Q(application));
                    Bundle bundle = new Bundle();
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(confirmationAuthenticatorWorker.b.b.f21460a);
                    mapUnmodifiableMap.getClass();
                    PersistableBundle persistableBundle = new PersistableBundle(mapUnmodifiableMap.size());
                    for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                        zg90.a(persistableBundle, (String) entry.getKey(), entry.getValue());
                    }
                    bundle.putAll(persistableBundle);
                    Intent intentPutExtra = intent.putExtras(bundle).putExtra("OPEN_SCREEN", "AUTHENTICATOR");
                    intentPutExtra.getClass();
                    String string = application.getString(R.string.authorization);
                    string.getClass();
                    List listC = kotlin.collections.a.c(new y660(string, intentPutExtra, klx.f18512a));
                    intentPutExtra.putExtra("LOCAL_NOTIFICATION_TYPE", sr00.d);
                    t760 t760Var = confirmationAuthenticatorWorker.k;
                    if (t760Var == null) {
                        Intrinsics.h("notificationService");
                        throw null;
                    }
                    t760.a(t760Var, intentPutExtra, (String) confirmationAuthenticatorWorker.s.getValue(), (String) confirmationAuthenticatorWorker.t.getValue(), 67108864, null, null, null, ((String) confirmationAuthenticatorWorker.r.getValue()).hashCode(), listC, 624);
                } else {
                    String message = th5 instanceof zhi0 ? th5.getMessage() : "";
                    ctf0 ctf0Var2 = confirmationAuthenticatorWorker.i;
                    if (ctf0Var2 == null) {
                        Intrinsics.h("resourceManager");
                        throw null;
                    }
                    Toast.makeText(application, sj3.j0(message, ctf0Var2.b.a(R.string.error_get_data, Arrays.copyOf(new Object[0], 0))), 1).show();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                g1e g1eVar = (g1e) obj2;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                Throwable th6 = (Throwable) this.j;
                if ((th6 instanceof SocketTimeoutException) || (th6 instanceof UnknownHostException)) {
                    g1eVar.C.f(o0e.f24420a);
                } else {
                    g1eVar.e.b(th6, new y0e(g1eVar, (byte) 0));
                }
                if (((m7a) obj3) == m7a.c) {
                    g1eVar.x();
                    g1eVar.B();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                dbe dbeVar = (dbe) obj3;
                iik iikVar = (iik) obj2;
                hbe hbeVar = (hbe) this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                vsf0 vsf0Var = hbeVar.f12766a;
                i9e0 i9e0Var = hbeVar.b;
                int iOrdinal3 = vsf0Var.ordinal();
                if (iOrdinal3 == 0) {
                    iikVar.e.setImageResource(R.drawable.radio_btn_unselected);
                    iikVar.d.setImageResource(R.drawable.radio_btn_unselected);
                } else if (iOrdinal3 == 1) {
                    iikVar.e.setImageResource(R.drawable.radio_btn_selected);
                    iikVar.d.setImageResource(R.drawable.radio_btn_unselected);
                } else {
                    if (iOrdinal3 != 2) {
                        t9f.b();
                        return null;
                    }
                    dbeVar.L0().e.setImageResource(R.drawable.radio_btn_unselected);
                    dbeVar.L0().d.setImageResource(R.drawable.radio_btn_selected);
                }
                boolean z2 = i9e0Var instanceof h9e0;
                if (z2) {
                    int i6 = ((h9e0) i9e0Var).f12672a;
                    LinearLayout linearLayout = iikVar.g;
                    int childCount = linearLayout.getChildCount();
                    int i7 = 0;
                    while (i7 < childCount) {
                        View childAt = linearLayout.getChildAt(i7);
                        childAt.getClass();
                        ((ImageView) childAt).setImageResource(i7 <= i6 + (-1) ? R.drawable.ic_supplib_star_active : R.drawable.ic_supplib_star_inactive);
                        i7++;
                    }
                } else {
                    LinearLayout linearLayout2 = iikVar.g;
                    int childCount2 = linearLayout2.getChildCount();
                    for (int i8 = 0; i8 < childCount2; i8++) {
                        View childAt2 = linearLayout2.getChildAt(i8);
                        childAt2.getClass();
                        ((ImageView) childAt2).setImageResource(R.drawable.ic_supplib_star_inactive);
                    }
                }
                iikVar.f.setEnabled(vsf0Var != vsf0.f37948a && z2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                qpg0 qpg0Var = (qpg0) this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ0 = qpg0Var.Z0((String) obj3);
                try {
                    Iterator it = ((Set) obj2).iterator();
                    int i9 = 1;
                    while (it.hasNext()) {
                        xpg0VarZ0.o(i9, ((Number) it.next()).longValue());
                        i9++;
                    }
                    int iP = x0x.P(xpg0VarZ0, ParameterNames.ID);
                    int iP2 = x0x.P(xpg0VarZ0, "code");
                    int iP3 = x0x.P(xpg0VarZ0, "name");
                    int iP4 = x0x.P(xpg0VarZ0, "top");
                    int iP5 = x0x.P(xpg0VarZ0, "ruble_to_currency_rate");
                    int iP6 = x0x.P(xpg0VarZ0, "symbol");
                    int iP7 = x0x.P(xpg0VarZ0, "min_out_deposit");
                    int iP8 = x0x.P(xpg0VarZ0, "min_out_deposit_electron");
                    int iP9 = x0x.P(xpg0VarZ0, "min_sum_bets");
                    int iP10 = x0x.P(xpg0VarZ0, "round");
                    int iP11 = x0x.P(xpg0VarZ0, "registration_hidden");
                    int iP12 = x0x.P(xpg0VarZ0, "crypto");
                    int iP13 = x0x.P(xpg0VarZ0, "initialBet");
                    int iP14 = x0x.P(xpg0VarZ0, "betStep");
                    ArrayList arrayList5 = new ArrayList();
                    while (xpg0VarZ0.W0()) {
                        int i10 = iP2;
                        int i11 = iP3;
                        arrayList5.add(new tuf(xpg0VarZ0.getLong(iP), xpg0VarZ0.J0(iP2), xpg0VarZ0.J0(iP3), ((int) xpg0VarZ0.getLong(iP4)) != 0, xpg0VarZ0.getDouble(iP5), xpg0VarZ0.J0(iP6), xpg0VarZ0.getDouble(iP7), xpg0VarZ0.getDouble(iP8), xpg0VarZ0.getDouble(iP9), (int) xpg0VarZ0.getLong(iP10), ((int) xpg0VarZ0.getLong(iP11)) != 0, ((int) xpg0VarZ0.getLong(iP12)) != 0, xpg0VarZ0.getDouble(iP13), xpg0VarZ0.getDouble(iP14)));
                        iP2 = i10;
                        iP3 = i11;
                        break;
                    }
                    return arrayList5;
                } finally {
                    xpg0VarZ0.close();
                }
            default:
                CyberCalendarParams cyberCalendarParams = (CyberCalendarParams) obj3;
                s7g s7gVar = (s7g) obj2;
                bm9 bm9Var = (bm9) this.j;
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(bm9Var, zl9.f44569a)) {
                    String simpleName = f7g.class.getSimpleName();
                    if (s7gVar.C().J(simpleName) == null) {
                        f7g.o2.getClass();
                        f7g f7gVar = new f7g();
                        f7gVar.m2.J(f7gVar, f7g.p2[1], cyberCalendarParams);
                        f7gVar.H0(s7gVar.C(), simpleName);
                    }
                } else {
                    if (!(bm9Var instanceof am9)) {
                        t9f.b();
                        return null;
                    }
                    String simpleName2 = h8g.class.getSimpleName();
                    if (s7gVar.C().J(simpleName2) == null) {
                        h8g.l2.getClass();
                        h8g h8gVar = new h8g();
                        h8gVar.i2.J(h8gVar, h8g.m2[0], cyberCalendarParams);
                        h8gVar.H0(s7gVar.C(), simpleName2);
                    }
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(k3t0 k3t0Var, uu0 uu0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = uu0Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(k3t0 k3t0Var, kv0 kv0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = kv0Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(k3t0 k3t0Var, ea1 ea1Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = ea1Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(k3t0 k3t0Var, ae1 ae1Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = ae1Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(k3t0 k3t0Var, t42 t42Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = t42Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(mii0 mii0Var, String str, yk3 yk3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        this.j = mii0Var;
        this.l = str;
        this.k = yk3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(k3t0 k3t0Var, is6 is6Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = is6Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(k3t0 k3t0Var, ut9 ut9Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = ut9Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(k3t0 k3t0Var, esc escVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = escVar;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee0(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(String str, Set set, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        this.l = str;
        this.k = set;
    }
}
