package a;

import android.content.Context;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.Html;
import android.text.Spanned;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.resources.UiText;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final class s9c0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s9c0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new s9c0((org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) this.j, (String) obj2, yjeVar, (byte) 0);
            case 1:
                s9c0 s9c0Var = new s9c0((pac0) obj2, yjeVar, (byte) 1);
                s9c0Var.j = obj;
                return s9c0Var;
            case 2:
                s9c0 s9c0Var2 = new s9c0((idc0) obj2, yjeVar, (byte) 2);
                s9c0Var2.j = obj;
                return s9c0Var2;
            case 3:
                s9c0 s9c0Var3 = new s9c0((ikc0) obj2, yjeVar, (byte) 3);
                s9c0Var3.j = obj;
                return s9c0Var3;
            case 4:
                s9c0 s9c0Var4 = new s9c0((ukc0) obj2, yjeVar, (byte) 4);
                s9c0Var4.j = obj;
                return s9c0Var4;
            case 5:
                s9c0 s9c0Var5 = new s9c0((dtc0) obj2, yjeVar, (byte) 5);
                s9c0Var5.j = obj;
                return s9c0Var5;
            case 6:
                s9c0 s9c0Var6 = new s9c0((kvc0) obj2, yjeVar, (byte) 6);
                s9c0Var6.j = obj;
                return s9c0Var6;
            case 7:
                s9c0 s9c0Var7 = new s9c0((g1d0) obj2, yjeVar, (byte) 7);
                s9c0Var7.j = obj;
                return s9c0Var7;
            case 8:
                s9c0 s9c0Var8 = new s9c0((pzu) obj2, yjeVar, (byte) 8);
                s9c0Var8.j = obj;
                return s9c0Var8;
            case 9:
                return new s9c0((ned0) this.j, (p4i0) obj2, yjeVar, (byte) 9);
            case 10:
                return new s9c0((ned0) this.j, (ked0) obj2, yjeVar, (byte) 10);
            case 11:
                return new s9c0((fgd0) this.j, (xfd0) obj2, yjeVar, (byte) 11);
            case 12:
                s9c0 s9c0Var9 = new s9c0((shd0) obj2, yjeVar, (byte) 12);
                s9c0Var9.j = obj;
                return s9c0Var9;
            case 13:
                return new s9c0((jid0) this.j, (hid0) obj2, yjeVar, (byte) 13);
            case 14:
                return new s9c0((ijd0) this.j, (ejd0) obj2, yjeVar, (byte) 14);
            case 15:
                return new s9c0((xcz) this.j, (pz40) obj2, yjeVar, (byte) 15);
            case 16:
                return new s9c0((qnd0) this.j, (String) obj2, yjeVar, (byte) 16);
            case 17:
                return new s9c0((tod0) this.j, (mod0) obj2, yjeVar, (byte) 17);
            case 18:
                s9c0 s9c0Var10 = new s9c0((lrd0) obj2, yjeVar, (byte) 18);
                s9c0Var10.j = obj;
                return s9c0Var10;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                s9c0 s9c0Var11 = new s9c0((rwd0) obj2, yjeVar, (byte) 19);
                s9c0Var11.j = obj;
                return s9c0Var11;
            case 20:
                s9c0 s9c0Var12 = new s9c0((hxd0) obj2, yjeVar, (byte) 20);
                s9c0Var12.j = obj;
                return s9c0Var12;
            case 21:
                s9c0 s9c0Var13 = new s9c0((i4e0) obj2, yjeVar, (byte) 21);
                s9c0Var13.j = obj;
                return s9c0Var13;
            case 22:
                s9c0 s9c0Var14 = new s9c0((k7e0) obj2, yjeVar, (byte) 22);
                s9c0Var14.j = obj;
                return s9c0Var14;
            case 23:
                s9c0 s9c0Var15 = new s9c0((x8e0) obj2, yjeVar, (byte) 23);
                s9c0Var15.j = obj;
                return s9c0Var15;
            case 24:
                s9c0 s9c0Var16 = new s9c0((xbe0) obj2, yjeVar, (byte) 24);
                s9c0Var16.j = obj;
                return s9c0Var16;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new s9c0((nde0) this.j, (mde0) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                s9c0 s9c0Var17 = new s9c0((lge0) obj2, yjeVar, (byte) 26);
                s9c0Var17.j = obj;
                return s9c0Var17;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                s9c0 s9c0Var18 = new s9c0((gme0) obj2, yjeVar, (byte) 27);
                s9c0Var18.j = obj;
                return s9c0Var18;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                s9c0 s9c0Var19 = new s9c0((ppe0) obj2, yjeVar, (byte) 28);
                s9c0Var19.j = obj;
                return s9c0Var19;
            default:
                return new s9c0((tpe0) this.j, (Throwable) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((s9c0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((s9c0) create((ivc0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((s9c0) create((mkc0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((s9c0) create((zkc0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((s9c0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((s9c0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((s9c0) create((f2d0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((s9c0) create(obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((s9c0) create((vgd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((s9c0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((s9c0) create((xwd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((s9c0) create((kam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((s9c0) create((m4e0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((s9c0) create((w2m0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((s9c0) create((j6i0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((s9c0) create((mde0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((s9c0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((s9c0) create((ype0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((s9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x063b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0652 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x0654  */
    /* JADX WARN: Code duplicated, block: B:172:0x065f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x0661  */
    /* JADX WARN: Code duplicated, block: B:176:0x066c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x066e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0679 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x067b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0686  */
    /* JADX WARN: Code duplicated, block: B:190:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:210:0x072c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0738  */
    /* JADX WARN: Code duplicated, block: B:284:0x069e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x06ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws IOException {
        String type;
        Cursor cursorQuery;
        String strConcat;
        File file;
        File file2;
        InputStream inputStreamOpenInputStream;
        FileOutputStream fileOutputStream;
        Object value;
        Object value2;
        String str;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        byte b = this.i;
        byte b2 = 3;
        byte b3 = 2;
        byte b4 = 1;
        char c = 1;
        yje yjeVar = null;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = (org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) this.j;
                eac0 eac0Var = new eac0((String) obj2);
                int i = org.xplatform.feature.promo_aggregator.impl.presentation.compose.b.Q;
                bVar.G(eac0Var);
                return Unit.f46060a;
            case 1:
                Throwable th = (Throwable) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ((pac0) obj2).p.b(th, new t4c0((byte) 13));
                return Unit.f46060a;
            case 2:
                ivc0 ivc0Var = (ivc0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                jh70 jh70Var = idc0.S1;
                ((idc0) obj2).L0().b.setEnabled(ivc0Var instanceof hvc0);
                return Unit.f46060a;
            case 3:
                ikc0 ikc0Var = (ikc0) obj2;
                mkc0 mkc0Var = (mkc0) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (mkc0Var != null) {
                    if (mkc0Var instanceof kkc0) {
                        int i2 = ((kkc0) mkc0Var).f18430a;
                        iiy[] iiyVarArr = ikc0.O1;
                        if (i2 > 0) {
                            ikc0Var.G0().b.setText(R.string.your_win3_title);
                            ikc0Var.G0().d.setText(ikc0Var.I(R.string.your_win3_value_v2, String.valueOf(i2)));
                            ikc0Var.G0().d.setVisibility(0);
                        } else {
                            ikc0Var.G0().b.setText(R.string.game_lose_status);
                            ikc0Var.G0().d.setText("");
                            ikc0Var.G0().d.setVisibility(8);
                        }
                        ikc0Var.G0().b.setVisibility(0);
                        ikc0Var.G0().c.setVisibility(0);
                    } else if (mkc0Var instanceof lkc0) {
                        boolean z = ((lkc0) mkc0Var).f20195a;
                        iiy[] iiyVarArr2 = ikc0.O1;
                        ikc0Var.G0().d.setText("");
                        if (z) {
                            String strI = ikc0Var.I(R.string.click_play_to_start_v2, kng0.l("<b>", ikc0Var.H(R.string.play_button), "</b>"));
                            TextView textView = ikc0Var.G0().b;
                            strI.getClass();
                            Spanned spannedFromHtml = Html.fromHtml(strI, 0);
                            spannedFromHtml.getClass();
                            textView.setText(spannedFromHtml);
                        } else {
                            ikc0Var.G0().b.setText(R.string.buy_games_to_start);
                        }
                        ikc0Var.G0().b.setVisibility(0);
                        ikc0Var.G0().c.setVisibility(0);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 4:
                zkc0 zkc0Var = (zkc0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ukc0 ukc0Var = (ukc0) obj2;
                iiy[] iiyVarArr3 = ukc0.Q1;
                Object objN = ukc0Var.O1.n(ukc0.Q1[0], ukc0Var);
                objN.getClass();
                DsNavigationBar dsNavigationBar = ((tuc0) objN).b;
                String str2 = zkc0Var.f44526a;
                boolean z2 = zkc0Var.c;
                dsNavigationBar.setTitle(str2);
                e1i e1iVarB = dsNavigationBar.b("RULES_BUTTON");
                if (e1iVarB != null) {
                    e1iVarB.setNavigationBarButtonAlpha(!z2);
                    e1iVarB.setNavigationBarButtonEnable(z2);
                }
                if (zkc0Var.b) {
                    dsNavigationBar.setBackIconAlpha(1.0f);
                } else {
                    dsNavigationBar.setBackIconAlpha(0.5f);
                }
                return Unit.f46060a;
            case 5:
                Throwable th2 = (Throwable) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                dtc0 dtc0Var = (dtc0) obj2;
                int i3 = dtc0.D;
                dtc0Var.y.b(th2, new xh20((Object) dtc0Var, (boolean) (c == true ? 1 : 0), (byte) 17));
                return Unit.f46060a;
            case 6:
                List list = (List) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                kvc0 kvc0Var = (kvc0) obj2;
                sbq sbqVar = (sbq) CollectionsKt.W(kvc0Var.b.l, list);
                kvc0Var.B = sbqVar != null ? sbqVar.b : 0.0d;
                return Unit.f46060a;
            case 7:
                g1d0 g1d0Var = (g1d0) obj2;
                f2d0 f2d0Var = (f2d0) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                if (f2d0Var instanceof d2d0) {
                    xi70 xi70Var = g1d0.N1;
                    Object objN2 = g1d0Var.M1.n(g1d0.O1[0], g1d0Var);
                    objN2.getClass();
                    TextView textView2 = ((h3r) objN2).b;
                    rdj rdjVar = rdj.f30294a;
                    boolean zIs24HourFormat = DateFormat.is24HourFormat(g1d0Var.o0());
                    d2d0 d2d0Var = (d2d0) f2d0Var;
                    long j = d2d0Var.f5351a;
                    efj efjVar = efj.UNIQUE_1;
                    textView2.setText(g1d0Var.I(R.string.prophylaxis_message, rdj.g(new znq0(j), efjVar, Boolean.valueOf(zIs24HourFormat), false, 56), rdj.g(new znq0(d2d0Var.b), efjVar, Boolean.valueOf(DateFormat.is24HourFormat(g1d0Var.o0())), false, 56)));
                } else if (Intrinsics.d(f2d0Var, e2d0.b)) {
                    Context contextD = g1d0Var.D();
                    if (contextD != null) {
                        j120.g0(contextD, i120.U());
                    }
                } else if (!Intrinsics.d(f2d0Var, e2d0.f7078a)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                Object obj3 = this.j;
                pzu pzuVar = (pzu) obj2;
                xw3 xw3Var = (xw3) pzuVar.f;
                xw3Var.addLast(obj3);
                q99 q99Var = (q99) pzuVar.e;
                for (Object objJ = q99Var.j(); !(objJ instanceof ytb); objJ = q99Var.j()) {
                    ztb.c(objJ);
                    xw3Var.addLast(objJ);
                }
                Log.d("CXCP", "PruningProcessingQueue: Pruning " + xw3Var);
                ((Function1) pzuVar.f27863a).invoke(xw3Var);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                ned0 ned0Var = (ned0) this.j;
                iw20 iw20Var = ned0Var.s;
                p4i0 p4i0Var = (p4i0) obj2;
                iw20Var.getClass();
                us00 us00Var = ((dbv) iw20Var.f15470a).f5821a;
                String string = p4i0Var.f26355a;
                Uri uri = Uri.parse(string);
                uri.getClass();
                if (Intrinsics.d(uri.getScheme(), RemoteMessageConst.Notification.CONTENT) && !uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    try {
                        int iIntValue = p4i0Var.b.intValue() & 3;
                        if (iIntValue != 0) {
                            us00Var.getContentResolver().takePersistableUriPermission(uri, iIntValue);
                        } else {
                            us00Var.getContentResolver().takePersistableUriPermission(uri, 1);
                        }
                        break;
                    } catch (SecurityException e) {
                        Log.w("NotificationSoundFileDS", "Failed to get persistable permission for URI: " + uri, e);
                        if (Build.VERSION.SDK_INT <= 28) {
                            type = us00Var.getContentResolver().getType(uri);
                            if (type == null && StringsKt.O(type, "mp3", false)) {
                                strConcat = ".mp3";
                            } else if (type == null && StringsKt.O(type, "ogg", false)) {
                                strConcat = ".ogg";
                            } else if (type == null && StringsKt.O(type, "wav", false)) {
                                strConcat = ".wav";
                            } else if (type == null && StringsKt.O(type, "m4a", false)) {
                                strConcat = ".m4a";
                            } else if (type == null && StringsKt.O(type, "aac", false)) {
                                strConcat = ".aac";
                            } else {
                                cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                if (cursorQuery == null) {
                                    jf4.n("Required value was null.");
                                    return null;
                                }
                                try {
                                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                    string2.getClass();
                                    strConcat = Separators.DOT.concat(StringsKt.p0(string2, Separators.DOT, ""));
                                    cursorQuery.close();
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        bkb.E(cursorQuery, th3);
                                        throw th4;
                                    }
                                }
                            }
                            file = new File(us00Var.getFilesDir(), "notification_sounds");
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            file2 = new File(file, UUID.randomUUID() + strConcat);
                            inputStreamOpenInputStream = us00Var.getContentResolver().openInputStream(uri);
                            if (inputStreamOpenInputStream != null) {
                                jf4.n("Required value was null.");
                                return null;
                            }
                            try {
                                fileOutputStream = new FileOutputStream(file2);
                                try {
                                    wha0.J(inputStreamOpenInputStream, fileOutputStream, 8192);
                                    fileOutputStream.close();
                                    inputStreamOpenInputStream.close();
                                    string = FileProvider.c(us00Var, file2, us00Var.getPackageName() + ".provider").toString();
                                    string.getClass();
                                } catch (Throwable th5) {
                                    try {
                                        throw th5;
                                    } catch (Throwable th6) {
                                        bkb.E(fileOutputStream, th5);
                                        throw th6;
                                    }
                                }
                            } catch (Throwable th7) {
                                try {
                                    throw th7;
                                } catch (Throwable th8) {
                                    bkb.E(inputStreamOpenInputStream, th7);
                                    throw th8;
                                }
                            }
                        }
                    } catch (Exception e2) {
                        Log.w("NotificationSoundFileDS", "Exception while getting persistable permission for URI: " + uri, e2);
                        if (Build.VERSION.SDK_INT <= 28) {
                            type = us00Var.getContentResolver().getType(uri);
                            if (type == null) {
                                if (type == null) {
                                    if (type == null) {
                                        if (type == null) {
                                            if (type == null) {
                                                cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                                if (cursorQuery == null) {
                                                    jf4.n("Required value was null.");
                                                    return null;
                                                }
                                                String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                                string3.getClass();
                                                strConcat = Separators.DOT.concat(StringsKt.p0(string3, Separators.DOT, ""));
                                                cursorQuery.close();
                                            } else {
                                                cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                                if (cursorQuery == null) {
                                                    jf4.n("Required value was null.");
                                                    return null;
                                                }
                                                String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                                string4.getClass();
                                                strConcat = Separators.DOT.concat(StringsKt.p0(string4, Separators.DOT, ""));
                                                cursorQuery.close();
                                            }
                                        } else if (type == null) {
                                            cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                            if (cursorQuery == null) {
                                                jf4.n("Required value was null.");
                                                return null;
                                            }
                                            String string5 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            string5.getClass();
                                            strConcat = Separators.DOT.concat(StringsKt.p0(string5, Separators.DOT, ""));
                                            cursorQuery.close();
                                        } else {
                                            cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                            if (cursorQuery == null) {
                                                jf4.n("Required value was null.");
                                                return null;
                                            }
                                            String string6 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            string6.getClass();
                                            strConcat = Separators.DOT.concat(StringsKt.p0(string6, Separators.DOT, ""));
                                            cursorQuery.close();
                                        }
                                    } else if (type == null) {
                                        if (type == null) {
                                            cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                            if (cursorQuery == null) {
                                                jf4.n("Required value was null.");
                                                return null;
                                            }
                                            String string7 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            string7.getClass();
                                            strConcat = Separators.DOT.concat(StringsKt.p0(string7, Separators.DOT, ""));
                                            cursorQuery.close();
                                        } else {
                                            cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                            if (cursorQuery == null) {
                                                jf4.n("Required value was null.");
                                                return null;
                                            }
                                            String string8 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            string8.getClass();
                                            strConcat = Separators.DOT.concat(StringsKt.p0(string8, Separators.DOT, ""));
                                            cursorQuery.close();
                                        }
                                    } else if (type == null) {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string9 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string9.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string9, Separators.DOT, ""));
                                        cursorQuery.close();
                                    } else {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string10 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string10.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string10, Separators.DOT, ""));
                                        cursorQuery.close();
                                    }
                                } else if (type == null) {
                                    if (type == null) {
                                        if (type == null) {
                                            cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                            if (cursorQuery == null) {
                                                jf4.n("Required value was null.");
                                                return null;
                                            }
                                            String string11 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            string11.getClass();
                                            strConcat = Separators.DOT.concat(StringsKt.p0(string11, Separators.DOT, ""));
                                            cursorQuery.close();
                                        } else {
                                            cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                            if (cursorQuery == null) {
                                                jf4.n("Required value was null.");
                                                return null;
                                            }
                                            String string12 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            string12.getClass();
                                            strConcat = Separators.DOT.concat(StringsKt.p0(string12, Separators.DOT, ""));
                                            cursorQuery.close();
                                        }
                                    } else if (type == null) {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string13 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string13.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string13, Separators.DOT, ""));
                                        cursorQuery.close();
                                    } else {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string14 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string14.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string14, Separators.DOT, ""));
                                        cursorQuery.close();
                                    }
                                } else if (type == null) {
                                    if (type == null) {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string15 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string15.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string15, Separators.DOT, ""));
                                        cursorQuery.close();
                                    } else {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string16 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string16.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string16, Separators.DOT, ""));
                                        cursorQuery.close();
                                    }
                                } else if (type == null) {
                                    cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                    if (cursorQuery == null) {
                                        jf4.n("Required value was null.");
                                        return null;
                                    }
                                    String string17 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                    string17.getClass();
                                    strConcat = Separators.DOT.concat(StringsKt.p0(string17, Separators.DOT, ""));
                                    cursorQuery.close();
                                } else {
                                    cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                    if (cursorQuery == null) {
                                        jf4.n("Required value was null.");
                                        return null;
                                    }
                                    String string18 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                    string18.getClass();
                                    strConcat = Separators.DOT.concat(StringsKt.p0(string18, Separators.DOT, ""));
                                    cursorQuery.close();
                                }
                            } else if (type == null) {
                                if (type == null) {
                                    if (type == null) {
                                        if (type == null) {
                                            cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                            if (cursorQuery == null) {
                                                jf4.n("Required value was null.");
                                                return null;
                                            }
                                            String string19 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            string19.getClass();
                                            strConcat = Separators.DOT.concat(StringsKt.p0(string19, Separators.DOT, ""));
                                            cursorQuery.close();
                                        } else {
                                            cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                            if (cursorQuery == null) {
                                                jf4.n("Required value was null.");
                                                return null;
                                            }
                                            String string110 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            string110.getClass();
                                            strConcat = Separators.DOT.concat(StringsKt.p0(string110, Separators.DOT, ""));
                                            cursorQuery.close();
                                        }
                                    } else if (type == null) {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string111 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string111.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string111, Separators.DOT, ""));
                                        cursorQuery.close();
                                    } else {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string112 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string112.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string112, Separators.DOT, ""));
                                        cursorQuery.close();
                                    }
                                } else if (type == null) {
                                    if (type == null) {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string113 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string113.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string113, Separators.DOT, ""));
                                        cursorQuery.close();
                                    } else {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string114 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string114.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string114, Separators.DOT, ""));
                                        cursorQuery.close();
                                    }
                                } else if (type == null) {
                                    cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                    if (cursorQuery == null) {
                                        jf4.n("Required value was null.");
                                        return null;
                                    }
                                    String string115 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                    string115.getClass();
                                    strConcat = Separators.DOT.concat(StringsKt.p0(string115, Separators.DOT, ""));
                                    cursorQuery.close();
                                } else {
                                    cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                    if (cursorQuery == null) {
                                        jf4.n("Required value was null.");
                                        return null;
                                    }
                                    String string116 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                    string116.getClass();
                                    strConcat = Separators.DOT.concat(StringsKt.p0(string116, Separators.DOT, ""));
                                    cursorQuery.close();
                                }
                            } else if (type == null) {
                                if (type == null) {
                                    if (type == null) {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string117 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string117.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string117, Separators.DOT, ""));
                                        cursorQuery.close();
                                    } else {
                                        cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                        if (cursorQuery == null) {
                                            jf4.n("Required value was null.");
                                            return null;
                                        }
                                        String string118 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                        string118.getClass();
                                        strConcat = Separators.DOT.concat(StringsKt.p0(string118, Separators.DOT, ""));
                                        cursorQuery.close();
                                    }
                                } else if (type == null) {
                                    cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                    if (cursorQuery == null) {
                                        jf4.n("Required value was null.");
                                        return null;
                                    }
                                    String string119 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                    string119.getClass();
                                    strConcat = Separators.DOT.concat(StringsKt.p0(string119, Separators.DOT, ""));
                                    cursorQuery.close();
                                } else {
                                    cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                    if (cursorQuery == null) {
                                        jf4.n("Required value was null.");
                                        return null;
                                    }
                                    String string1110 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                    string1110.getClass();
                                    strConcat = Separators.DOT.concat(StringsKt.p0(string1110, Separators.DOT, ""));
                                    cursorQuery.close();
                                }
                            } else if (type == null) {
                                if (type == null) {
                                    cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                    if (cursorQuery == null) {
                                        jf4.n("Required value was null.");
                                        return null;
                                    }
                                    String string1111 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                    string1111.getClass();
                                    strConcat = Separators.DOT.concat(StringsKt.p0(string1111, Separators.DOT, ""));
                                    cursorQuery.close();
                                } else {
                                    cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                    if (cursorQuery == null) {
                                        jf4.n("Required value was null.");
                                        return null;
                                    }
                                    String string1112 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                    string1112.getClass();
                                    strConcat = Separators.DOT.concat(StringsKt.p0(string1112, Separators.DOT, ""));
                                    cursorQuery.close();
                                }
                            } else if (type == null) {
                                cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                if (cursorQuery == null) {
                                    jf4.n("Required value was null.");
                                    return null;
                                }
                                String string1113 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                string1113.getClass();
                                strConcat = Separators.DOT.concat(StringsKt.p0(string1113, Separators.DOT, ""));
                                cursorQuery.close();
                            } else {
                                cursorQuery = us00Var.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                if (cursorQuery == null) {
                                    jf4.n("Required value was null.");
                                    return null;
                                }
                                String string1114 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                string1114.getClass();
                                strConcat = Separators.DOT.concat(StringsKt.p0(string1114, Separators.DOT, ""));
                                cursorQuery.close();
                            }
                            file = new File(us00Var.getFilesDir(), "notification_sounds");
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            file2 = new File(file, UUID.randomUUID() + strConcat);
                            inputStreamOpenInputStream = us00Var.getContentResolver().openInputStream(uri);
                            if (inputStreamOpenInputStream != null) {
                                jf4.n("Required value was null.");
                                return null;
                            }
                            fileOutputStream = new FileOutputStream(file2);
                            wha0.J(inputStreamOpenInputStream, fileOutputStream, 8192);
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            string = FileProvider.c(us00Var, file2, us00Var.getPackageName() + ".provider").toString();
                            string.getClass();
                        }
                    }
                }
                string.getClass();
                if (StringsKt.O(string, "file://", false)) {
                    ned0Var.x(ied0.f14628a);
                }
                dq00 dq00Var = ned0Var.n.f37823a;
                ((us3) dq00Var.c).getClass();
                ((q7d0) ((nw20) dq00Var.b).f24215a).g("BaseChannelId", "prod_id_channel_base" + UUID.randomUUID());
                vpt vptVar = ned0Var.r;
                vptVar.getClass();
                ((q7d0) ((nw20) vptVar.f37823a.b).f24215a).g("GlobalSoundPath", string);
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                ((ned0) this.j).z.f((ked0) obj2);
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                ((fgd0) this.j).s.f((xfd0) obj2);
                return Unit.f46060a;
            case 12:
                shd0 shd0Var = (shd0) obj2;
                p7m0 p7m0Var = shd0Var.t;
                vgd0 vgd0Var = (vgd0) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                boolean zD = Intrinsics.d(vgd0Var, tgd0.f33905a);
                wgd0 wgd0Var = wgd0.f39111a;
                if (zD) {
                    do {
                        value3 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value3, lhd0.a((lhd0) value3, null, shd0Var.x(), null, wgd0Var, 39)));
                } else if (vgd0Var instanceof ugd0) {
                    do {
                        value2 = p7m0Var.getValue();
                        long j2 = ((ugd0) vgd0Var).f35620a;
                        str = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}, 2));
                    } while (!p7m0Var.m(value2, lhd0.a((lhd0) value2, null, shd0Var.x(), null, new xgd0(etm0.m(str, shd0Var.p.b.a(R.string.restore_password_confirm_timer_v2, Arrays.copyOf(new Object[]{str}, 1)))), 39)));
                } else {
                    if (!(vgd0Var instanceof sgd0)) {
                        t9f.b();
                        return null;
                    }
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, lhd0.a((lhd0) value, null, shd0Var.x(), null, wgd0Var, 39)));
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                ((jid0) this.j).l.f((hid0) obj2);
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                ((ijd0) this.j).i.f((ejd0) obj2);
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                if (((xcz) this.j).j.a()) {
                    ((pz40) obj2).setValue(Boolean.TRUE);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                ((qnd0) this.j).n.f(new lrn((String) obj2));
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                tod0 tod0Var = (tod0) this.j;
                mod0 mod0Var = (mod0) obj2;
                tod0Var.n.f(new dod0(e9x.I(tod0Var.k, mod0Var.g, mod0Var.d)));
                return Unit.f46060a;
            case 18:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                lrd0 lrd0Var = (lrd0) obj2;
                nc5 nc5VarS = lrd0Var.A.s(lrd0Var.o, lrd0Var.p, uaq0Var, 0L);
                p7m0 p7m0Var2 = lrd0Var.i.f25029a;
                do {
                    value4 = p7m0Var2.getValue();
                    value4.getClass();
                } while (!p7m0Var2.m(value4, yqd0.a((yqd0) value4, false, false, false, null, null, null, null, null, null, nc5VarS, false, 1535)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xwd0 xwd0Var = (xwd0) this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                if (xwd0Var == null) {
                    t9f.b();
                    return null;
                }
                rwd0 rwd0Var = (rwd0) obj2;
                String string20 = rwd0Var.G().getString(xwd0Var.f41605a);
                string20.getClass();
                wdk0 wdk0Var = rwd0Var.M1;
                if (wdk0Var != null) {
                    wdk0.k(wdk0Var, new xdk0(rek0.b, string20, null, null, null, null, 124), rwd0Var, null, null, false, null, 1020);
                    return Unit.f46060a;
                }
                Intrinsics.h("snackbarManager");
                throw null;
            case 20:
                kam0 kam0Var = (kam0) this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                if (kam0Var.b) {
                    p7m0 p7m0Var3 = ((hxd0) obj2).K;
                    do {
                        value5 = p7m0Var3.getValue();
                        ((Boolean) value5).getClass();
                    } while (!p7m0Var3.m(value5, Boolean.TRUE));
                }
                return Unit.f46060a;
            case 21:
                i4e0 i4e0Var = (i4e0) obj2;
                m4e0 m4e0Var = (m4e0) this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                if (m4e0Var != null && i4e0Var.F().J("FILTER_DIALOG_TAG") == null) {
                    fl70 fl70Var = l4e0.n2;
                    List list2 = m4e0Var.f21166a;
                    i6i0 i6i0Var = m4e0Var.b;
                    fl70Var.getClass();
                    list2.getClass();
                    l4e0 l4e0Var = new l4e0();
                    iiy[] iiyVarArr4 = l4e0.o2;
                    l4e0Var.k2.x(l4e0Var, iiyVarArr4[0], "EXTRA_REQUEST_KEY");
                    l4e0Var.m2.u(l4e0Var, iiyVarArr4[2], i6i0Var);
                    l4e0Var.l2.I(l4e0Var, iiyVarArr4[1], list2);
                    l4e0Var.H0(i4e0Var.F(), "FILTER_DIALOG_TAG");
                    ((k3t0) i4e0Var.O1.getValue()).x(c4e0.f3721a);
                }
                return Unit.f46060a;
            case 22:
                k7e0 k7e0Var = (k7e0) obj2;
                w2m0 w2m0Var = (w2m0) this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                if (w2m0Var != null) {
                    boolean z3 = w2m0Var instanceof v2m0;
                    x1m0 x1m0Var = x1m0.f40129a;
                    if (z3) {
                        nh70 nh70Var = k7e0.S1;
                        k7e0Var.G0().x(b2m0.f1859a);
                        k7e0Var.G0().x(x1m0Var);
                    } else if (w2m0Var instanceof u2m0) {
                        int i4 = bhv.k2;
                        androidx.fragment.app.e eVarC = k7e0Var.C();
                        eVarC.getClass();
                        if (eVarC.J("select_group_dialog_request_key") == null) {
                            new bhv().H0(eVarC, "select_group_dialog_request_key");
                        }
                        k7e0Var.G0().x(x1m0Var);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 23:
                j6i0 j6i0Var = (j6i0) this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                x8e0 x8e0Var = (x8e0) obj2;
                if (!Intrinsics.d(j6i0Var, ((l8e0) x8e0Var.D()).h)) {
                    p7m0 p7m0Var4 = x8e0Var.i.f25029a;
                    do {
                        value6 = p7m0Var4.getValue();
                        value6.getClass();
                    } while (!p7m0Var4.m(value6, l8e0.a((l8e0) value6, false, false, null, null, null, j6i0Var, 0, false, false, 1919)));
                    x8e0Var.M();
                }
                return Unit.f46060a;
            case 24:
                mde0 mde0Var = (mde0) this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                xbe0 xbe0Var = (xbe0) obj2;
                if (mde0Var instanceof kde0) {
                    String str3 = ((kde0) mde0Var).f18103a;
                    iiy[] iiyVarArr5 = xbe0.Q1;
                    ii iiVar = xbe0Var.L1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = xbe0Var.H(R.string.error);
                    String strH2 = xbe0Var.H(R.string.ok_new);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str3, (CharSequence) strH2, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC2 = xbe0Var.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                } else {
                    iiy[] iiyVarArr6 = xbe0.Q1;
                    wdk0 wdk0Var2 = xbe0Var.M1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var = rek0.b;
                    String strH3 = xbe0Var.H(R.string.something_went_wrong);
                    strH3.getClass();
                    wdk0.k(wdk0Var2, new xdk0(rek0Var, strH3, null, null, null, null, 124), xbe0Var, null, null, false, null, 1020);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                ((nde0) this.j).j.f((mde0) obj2);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                vne vneVar = (vne) this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                lge0 lge0Var = (lge0) obj2;
                qjj.W(vneVar, null, null, new wj60(lge0Var, yjeVar, b4), 3);
                qjj.W(vneVar, null, null, new wj60(lge0Var, yjeVar, b3), 3);
                return qjj.W(vneVar, null, null, new wj60(lge0Var, yjeVar, b2), 3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th9 = (Throwable) this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                ((gme0) obj2).q.b(th9, new k8e0((byte) 12));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ppe0 ppe0Var = (ppe0) obj2;
                ype0 ype0Var = (ype0) this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(ype0Var, vpe0.f37800a)) {
                    zie0 zie0Var = ppe0.S1;
                    ppe0Var.G0().f.setVisibility(8);
                } else if (ype0Var instanceof xpe0) {
                    zie0 zie0Var2 = ppe0.S1;
                    ppe0Var.G0().c.setVisibility(0);
                    ppe0Var.G0().d.setVisibility(8);
                    ppe0Var.G0().e.setVisibility(8);
                    ppe0Var.G0().f.setVisibility(0);
                    ppe0Var.G0().g.setVisibility(0);
                    TextView textView3 = ppe0Var.G0().g;
                    une0 une0Var = ((xpe0) ype0Var).f41266a;
                    textView3.setText(une0Var.g);
                    pv00 pv00Var = ppe0Var.N1;
                    if (pv00Var == null) {
                        Intrinsics.h("referralsRecyclerFragmentDelegate");
                        throw null;
                    }
                    ((gkz) pv00Var.f27640a).A(une0Var.f);
                    ppe0Var.G0().h.setText(une0Var.c);
                } else if (Intrinsics.d(ype0Var, vpe0.b)) {
                    zie0 zie0Var3 = ppe0.S1;
                    ppe0Var.G0().c.setVisibility(8);
                    ppe0Var.G0().d.setVisibility(0);
                    ppe0Var.G0().e.setVisibility(8);
                } else if (ype0Var instanceof wpe0) {
                    ii iiVar2 = ppe0Var.L1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    yme0 yme0Var = ((wpe0) ype0Var).f39541a;
                    DialogFields dialogFields2 = new DialogFields((CharSequence) yme0Var.f42884a.a(ppe0Var.o0()).toString(), (CharSequence) yme0Var.b.a(ppe0Var.o0()).toString(), (CharSequence) yme0Var.c.a(ppe0Var.o0()).toString(), yme0Var.d.a(ppe0Var.o0()).toString(), (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1520);
                    androidx.fragment.app.e eVarC3 = ppe0Var.C();
                    eVarC3.getClass();
                    iiVar2.d(dialogFields2, eVarC3);
                    ppe0Var.G0().d.setVisibility(8);
                } else {
                    if (!(ype0Var instanceof upe0)) {
                        t9f.b();
                        return null;
                    }
                    zie0 zie0Var4 = ppe0.S1;
                    ppe0Var.G0().c.setVisibility(8);
                    ppe0Var.G0().d.setVisibility(8);
                    ppe0Var.G0().f.setVisibility(8);
                    ppe0Var.G0().g.setVisibility(8);
                    LottieView lottieView = ppe0Var.G0().e;
                    lottieView.v(((upe0) ype0Var).f36063a);
                    lottieView.setVisibility(0);
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var5 = ((tpe0) this.j).i;
                int errorCode = ((zhi0) ((Throwable) obj2)).c.getErrorCode();
                wpe0 wpe0Var = new wpe0((errorCode == 1 || errorCode == 2) ? new yme0(new UiText.ByRes(R.string.error, new CharSequence[0]), new UiText.ByRes(R.string.referral_not_found, new CharSequence[0]), new UiText.ByRes(R.string.ok_new, new CharSequence[0])) : errorCode != 3 ? new yme0(new UiText.ByRes(R.string.error, new CharSequence[0]), new UiText.ByRes(R.string.request_error, new CharSequence[0]), new UiText.ByRes(R.string.ok_new, new CharSequence[0])) : new yme0(new UiText.ByRes(R.string.error, new CharSequence[0]), new UiText.ByRes(R.string.referral_was_deleted, new CharSequence[0]), new UiText.ByRes(R.string.ok_new, new CharSequence[0])));
                p7m0Var5.getClass();
                p7m0Var5.o(null, wpe0Var);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s9c0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
