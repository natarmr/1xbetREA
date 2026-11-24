package a;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.collection.MutableIntList;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class rx2 extends ok50 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ p6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx2(p6 p6Var, byte b) {
        super((byte) 3);
        this.d = b;
        this.e = p6Var;
    }

    @Override // a.ok50
    public void d(int i, k7 k7Var, String str, Bundle bundle) {
        switch (this.d) {
            case 0:
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) this.e;
                MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.o1;
                androidComposeViewAccessibilityDelegateCompat.j(i, k7Var, str, bundle);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:106:0x0219  */
    /* JADX WARN: Code duplicated, block: B:111:0x022c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0236  */
    /* JADX WARN: Code duplicated, block: B:115:0x0245  */
    /* JADX WARN: Code duplicated, block: B:117:0x0264  */
    /* JADX WARN: Code duplicated, block: B:119:0x026d  */
    /* JADX WARN: Code duplicated, block: B:11:0x0047  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:127:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:140:0x0302  */
    /* JADX WARN: Code duplicated, block: B:142:0x0325  */
    /* JADX WARN: Code duplicated, block: B:144:0x032b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0331  */
    /* JADX WARN: Code duplicated, block: B:149:0x033d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0347  */
    /* JADX WARN: Code duplicated, block: B:154:0x035e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0391  */
    /* JADX WARN: Code duplicated, block: B:160:0x039a  */
    /* JADX WARN: Code duplicated, block: B:162:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:168:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:171:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:173:0x03e6 A[LOOP:3: B:170:0x03d2->B:173:0x03e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0405  */
    /* JADX WARN: Code duplicated, block: B:180:0x0415  */
    /* JADX WARN: Code duplicated, block: B:186:0x0433  */
    /* JADX WARN: Code duplicated, block: B:189:0x043f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0457  */
    /* JADX WARN: Code duplicated, block: B:195:0x047a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0488  */
    /* JADX WARN: Code duplicated, block: B:205:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:209:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:212:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:215:0x0502  */
    /* JADX WARN: Code duplicated, block: B:217:0x050c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0519  */
    /* JADX WARN: Code duplicated, block: B:223:0x0526  */
    /* JADX WARN: Code duplicated, block: B:224:0x052a  */
    /* JADX WARN: Code duplicated, block: B:227:0x0542  */
    /* JADX WARN: Code duplicated, block: B:230:0x0547  */
    /* JADX WARN: Code duplicated, block: B:232:0x054b  */
    /* JADX WARN: Code duplicated, block: B:233:0x0550  */
    /* JADX WARN: Code duplicated, block: B:235:0x0554  */
    /* JADX WARN: Code duplicated, block: B:238:0x0560  */
    /* JADX WARN: Code duplicated, block: B:241:0x0565  */
    /* JADX WARN: Code duplicated, block: B:243:0x056b  */
    /* JADX WARN: Code duplicated, block: B:244:0x056f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0576  */
    /* JADX WARN: Code duplicated, block: B:249:0x0580  */
    /* JADX WARN: Code duplicated, block: B:254:0x0592  */
    /* JADX WARN: Code duplicated, block: B:256:0x059a  */
    /* JADX WARN: Code duplicated, block: B:259:0x059f  */
    /* JADX WARN: Code duplicated, block: B:260:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:264:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:267:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:269:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:272:0x05d1 A[LOOP:7: B:268:0x05b8->B:272:0x05d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:278:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:281:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:283:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:284:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:287:0x0601  */
    /* JADX WARN: Code duplicated, block: B:290:0x0608  */
    /* JADX WARN: Code duplicated, block: B:292:0x060c  */
    /* JADX WARN: Code duplicated, block: B:293:0x0610  */
    /* JADX WARN: Code duplicated, block: B:296:0x061b  */
    /* JADX WARN: Code duplicated, block: B:298:0x0625  */
    /* JADX WARN: Code duplicated, block: B:299:0x0629  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:302:0x0641  */
    /* JADX WARN: Code duplicated, block: B:305:0x0653  */
    /* JADX WARN: Code duplicated, block: B:308:0x0658  */
    /* JADX WARN: Code duplicated, block: B:309:0x065d  */
    /* JADX WARN: Code duplicated, block: B:312:0x0677  */
    /* JADX WARN: Code duplicated, block: B:314:0x068a  */
    /* JADX WARN: Code duplicated, block: B:316:0x0694  */
    /* JADX WARN: Code duplicated, block: B:317:0x069c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:320:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:321:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:324:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:327:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:329:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:330:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:335:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:338:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:341:0x06fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:348:0x0709 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:352:0x0710  */
    /* JADX WARN: Code duplicated, block: B:355:0x071a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:360:0x073a  */
    /* JADX WARN: Code duplicated, block: B:362:0x0744  */
    /* JADX WARN: Code duplicated, block: B:365:0x075a  */
    /* JADX WARN: Code duplicated, block: B:368:0x076c  */
    /* JADX WARN: Code duplicated, block: B:370:0x0776  */
    /* JADX WARN: Code duplicated, block: B:373:0x078c  */
    /* JADX WARN: Code duplicated, block: B:376:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:379:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:383:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:384:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:386:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:389:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:394:0x080b  */
    /* JADX WARN: Code duplicated, block: B:395:0x080e  */
    /* JADX WARN: Code duplicated, block: B:398:0x0830  */
    /* JADX WARN: Code duplicated, block: B:400:0x0836  */
    /* JADX WARN: Code duplicated, block: B:409:0x0857  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:411:0x085d  */
    /* JADX WARN: Code duplicated, block: B:419:0x0875  */
    /* JADX WARN: Code duplicated, block: B:421:0x087b  */
    /* JADX WARN: Code duplicated, block: B:423:0x0885  */
    /* JADX WARN: Code duplicated, block: B:425:0x088d  */
    /* JADX WARN: Code duplicated, block: B:428:0x0891  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:431:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:433:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:441:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:444:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:447:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:449:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:452:0x0901  */
    /* JADX WARN: Code duplicated, block: B:454:0x090d  */
    /* JADX WARN: Code duplicated, block: B:455:0x0913  */
    /* JADX WARN: Code duplicated, block: B:458:0x091c  */
    /* JADX WARN: Code duplicated, block: B:459:0x092b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:462:0x0933  */
    /* JADX WARN: Code duplicated, block: B:466:0x0941  */
    /* JADX WARN: Code duplicated, block: B:469:0x0946  */
    /* JADX WARN: Code duplicated, block: B:472:0x0951  */
    /* JADX WARN: Code duplicated, block: B:475:0x0956  */
    /* JADX WARN: Code duplicated, block: B:476:0x095c  */
    /* JADX WARN: Code duplicated, block: B:479:0x0964  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:484:0x0989  */
    /* JADX WARN: Code duplicated, block: B:487:0x098e  */
    /* JADX WARN: Code duplicated, block: B:488:0x099b  */
    /* JADX WARN: Code duplicated, block: B:490:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:492:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:494:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:496:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:500:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:502:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:503:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:505:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:507:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:511:0x0a10 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:514:0x0a20  */
    /* JADX WARN: Code duplicated, block: B:516:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:518:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:521:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:524:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:527:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:531:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:532:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:534:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:539:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:540:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:544:0x0a95 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:547:0x0aa5  */
    /* JADX WARN: Code duplicated, block: B:549:0x0aa8  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:551:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:554:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:557:0x0acf  */
    /* JADX WARN: Code duplicated, block: B:560:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:562:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:565:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:568:0x0afd  */
    /* JADX WARN: Code duplicated, block: B:571:0x0b0c  */
    /* JADX WARN: Code duplicated, block: B:572:0x0b10  */
    /* JADX WARN: Code duplicated, block: B:575:0x0b1f  */
    /* JADX WARN: Code duplicated, block: B:577:0x0b29  */
    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:580:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:583:0x0b55  */
    /* JADX WARN: Code duplicated, block: B:586:0x0b69  */
    /* JADX WARN: Code duplicated, block: B:588:0x0b79  */
    /* JADX WARN: Code duplicated, block: B:590:0x0b8f  */
    /* JADX WARN: Code duplicated, block: B:591:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:593:0x0b94  */
    /* JADX WARN: Code duplicated, block: B:595:0x0ba6 A[LOOP:9: B:594:0x0ba4->B:595:0x0ba6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:598:0x0bb9  */
    /* JADX WARN: Code duplicated, block: B:600:0x0bbf  */
    /* JADX WARN: Code duplicated, block: B:601:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:603:0x0bce  */
    /* JADX WARN: Code duplicated, block: B:605:0x0bdb  */
    /* JADX WARN: Code duplicated, block: B:609:0x0bee  */
    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    /* JADX WARN: Code duplicated, block: B:611:0x0bf9  */
    /* JADX WARN: Code duplicated, block: B:614:0x0c10  */
    /* JADX WARN: Code duplicated, block: B:615:0x0c14  */
    /* JADX WARN: Code duplicated, block: B:618:0x0c21  */
    /* JADX WARN: Code duplicated, block: B:620:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:621:0x0c31  */
    /* JADX WARN: Code duplicated, block: B:623:0x0c3d  */
    /* JADX WARN: Code duplicated, block: B:626:0x0c49  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:631:0x0c65  */
    /* JADX WARN: Code duplicated, block: B:641:0x0c7a  */
    /* JADX WARN: Code duplicated, block: B:643:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:662:0x0461 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x05d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x05c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x0872 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x086d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x09d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x0171  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ee  */
    /* JADX WARN: Instruction removed from duplicated block: B:641:0x0c7a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v25, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.ArrayList] */
    @Override // a.ok50
    public final k7 e(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        k7 k7Var;
        int i2;
        tai0 tai0VarL;
        Integer numValueOf;
        int iIntValue;
        dy40 dy40Var;
        gnk0 gnk0Var;
        Resources resources;
        nai0 nai0Var;
        hz40 hz40Var;
        Object objG;
        ucg0 ucg0Var;
        AccessibilityManager accessibilityManager;
        gnk0 gnk0Var2;
        boolean zN;
        List listI;
        int size;
        boolean z;
        int i3;
        int i4;
        AccessibilityNodeInfo accessibilityNodeInfo;
        j83 j83VarU;
        tai0 tai0Var;
        nai0 nai0Var2;
        ucg0 ucg0Var2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        hz40 hz40Var2;
        Resources resources2;
        SpannableString spannableString;
        zai0 zai0Var;
        hz40 hz40Var3;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        Resources resources3;
        tai0 tai0Var2;
        String strT;
        Object objG2;
        evq0 evq0Var;
        Object objG3;
        Boolean bool;
        ucg0 ucg0Var3;
        int i5;
        nai0 nai0Var3;
        Object objG4;
        List list;
        String str;
        Object objG5;
        String str2;
        Object objG6;
        Object objG7;
        int i6;
        Object objG8;
        Boolean bool2;
        Object objG9;
        Integer num;
        int iIntValue2;
        zai0 zai0Var2;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat;
        int i7;
        boolean z2;
        tai0 tai0VarL2;
        dk00 dk00Var;
        m6 m6Var;
        m6 m6Var2;
        m6 m6Var3;
        String strT2;
        int i8;
        int i9;
        g3c0 g3c0Var;
        Object objG10;
        m3d m3dVar;
        ArrayList arrayList;
        Object objG11;
        boolean zM;
        int size2;
        int size3;
        List listI2;
        int size4;
        int i10;
        tai0 tai0Var3;
        t9h0 t9h0Var;
        t9h0 t9h0Var2;
        CharSequence charSequence;
        boolean zY;
        int iD;
        AndroidComposeView androidComposeView;
        Bundle bundle;
        int iD2;
        String str3;
        k7 k7Var2;
        k33 k33VarK;
        k33 k33VarK2;
        m6 m6Var4;
        m6 m6Var5;
        m6 m6Var6;
        zai0 zai0Var3;
        List list2;
        int size5;
        MutableIntList mutableIntList;
        int i11;
        gnk0 gnk0Var3;
        boolean z3;
        ry40 ry40Var;
        MutableIntList mutableIntList2;
        int[] iArr;
        int i12;
        int i13;
        ArrayList arrayList2;
        Object objG12;
        Object objG13;
        Object objG14;
        e7z e7zVar;
        d7 d7Var;
        d7 d7Var2;
        Object objG15;
        m6 m6Var7;
        float f;
        cvc cvcVar;
        zai0 zai0Var4;
        float f2;
        float f3;
        float f4;
        ArrayList arrayList3;
        CharSequence charSequenceG;
        m6 m6Var8;
        String str4;
        List list3;
        e7z e7zVarV;
        nai0 nai0VarX;
        boolean zD;
        Object objG16;
        nai0 nai0VarX2;
        m6 m6Var9;
        m6 m6Var10;
        m6 m6Var11;
        m6 m6Var12;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        boolean z4;
        boolean z5;
        boolean z6;
        int iD3;
        tai0 tai0VarL3;
        boolean zBooleanValue;
        nai0 nai0Var4;
        zai0 zai0Var5;
        boolean zBooleanValue2;
        Object objG17;
        mrq fontFamilyResolver;
        w6k density;
        ywu ywuVar;
        SpannableString spannableString2;
        List list4;
        ArrayList arrayList4;
        SpannableString spannableString3;
        ?? arrayList5;
        int size6;
        int i14;
        ?? arrayList6;
        int size7;
        int i15;
        List listA;
        int size8;
        int i16;
        i83 i83Var;
        int i17;
        Object obj;
        int i18;
        kb00 kb00Var;
        WeakHashMap weakHashMap;
        Object vhdVar;
        cot0 cot0Var;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size9;
        int i19;
        i83 i83Var2;
        h7u0 h7u0Var;
        int i20;
        int i21;
        int size10;
        int i22;
        i83 i83Var3;
        int size11;
        int i23;
        int i24;
        int i25;
        smk0 smk0VarA;
        f8q0 f8q0Var;
        k5q0 k5q0Var;
        nrq nrqVar;
        lsq lsqVar;
        SpannableString spannableString4;
        psq psqVar;
        int i26;
        int i27;
        int i28;
        long j;
        int i29;
        msq msqVar;
        int i30;
        tai0 tai0Var4;
        gkx gkxVarS;
        int i31;
        k33 k33Var;
        vai0 vai0Var;
        boolean zD2;
        tai0 tai0Var5;
        byte b;
        byte b2;
        String strO;
        Object parentForAccessibility;
        View view;
        byte b3 = this.d;
        p6 p6Var = this.e;
        switch (b3) {
            case 0:
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = (AndroidComposeViewAccessibilityDelegateCompat) p6Var;
                AccessibilityManager accessibilityManager2 = androidComposeViewAccessibilityDelegateCompat2.g;
                MutableIntList mutableIntList3 = AndroidComposeViewAccessibilityDelegateCompat.o1;
                AndroidComposeView androidComposeView2 = androidComposeViewAccessibilityDelegateCompat2.d;
                if (androidComposeView2.getComposeViewContext().d().x().i == lkz.f20223a) {
                    if (accessibilityManager2.isEnabled()) {
                        k7Var2 = null;
                    } else {
                        k7Var2 = new k7(AccessibilityNodeInfo.obtain());
                    }
                    androidComposeViewAccessibilityDelegateCompat = androidComposeViewAccessibilityDelegateCompat2;
                    i6 = i;
                } else {
                    vai0 vai0Var2 = (vai0) androidComposeViewAccessibilityDelegateCompat2.s().b(i);
                    if (vai0Var2 == null) {
                        if (accessibilityManager2.isEnabled()) {
                            k7Var2 = null;
                        } else {
                            k7Var2 = new k7(AccessibilityNodeInfo.obtain());
                        }
                        androidComposeViewAccessibilityDelegateCompat = androidComposeViewAccessibilityDelegateCompat2;
                        i6 = i;
                    } else {
                        tai0 tai0Var6 = vai0Var2.f37089a;
                        nai0 nai0VarK = tai0Var6.k();
                        e7z e7zVar2 = tai0Var6.c;
                        Object objG18 = nai0VarK.f23193a.g(xai0.o);
                        if (objG18 == null) {
                            objG18 = null;
                        }
                        boolean zD3 = Intrinsics.d(objG18, Boolean.TRUE);
                        if (!zD3) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            k7Var = new k7(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                r6.p(accessibilityNodeInfoObtain, zD3);
                            } else {
                                k7Var.h(64, zD3);
                            }
                            if (i == -1) {
                                parentForAccessibility = androidComposeView2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    view = (View) parentForAccessibility;
                                } else {
                                    view = null;
                                }
                                k7Var.b = -1;
                                accessibilityNodeInfoObtain.setParent(view);
                            } else {
                                tai0VarL = tai0Var6.l();
                                if (tai0VarL != null) {
                                    numValueOf = Integer.valueOf(tai0VarL.f);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    xcx.c("semanticsNode " + i + " has null parent");
                                    csj.b();
                                    return null;
                                }
                                iIntValue = numValueOf.intValue();
                                if (iIntValue == androidComposeView2.getSemanticsOwner().a().f) {
                                    iIntValue = -1;
                                }
                                k7Var.b = iIntValue;
                                accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                            }
                            k7Var.c = i;
                            accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
                            k7Var.i(androidComposeViewAccessibilityDelegateCompat2.k(vai0Var2));
                            dy40Var = androidComposeViewAccessibilityDelegateCompat2.k1;
                            gnk0Var = androidComposeViewAccessibilityDelegateCompat2.s;
                            resources = androidComposeView2.getContext().getResources();
                            k7Var.j("android.view.View");
                            nai0Var = tai0Var6.d;
                            hz40Var = nai0Var.f23193a;
                            if (hz40Var.c(xai0.G)) {
                                k7Var.j("android.widget.EditText");
                            }
                            if (hz40Var.c(xai0.C)) {
                                k7Var.j("android.widget.TextView");
                            }
                            objG = hz40Var.g(xai0.z);
                            if (objG == null) {
                                objG = null;
                            }
                            ucg0Var = (ucg0) objG;
                            if (ucg0Var != null) {
                                b = ucg0Var.f35427a;
                                if (tai0Var6.n()) {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    gnk0Var2 = gnk0Var;
                                    if (tai0Var6.i((4 & 1) != 0 ? !tai0Var6.b : false, (4 & 2) == 0).isEmpty()) {
                                    }
                                } else {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    gnk0Var2 = gnk0Var;
                                }
                                if (b == b2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (b == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strO = x1x.O(b);
                                    if (b == 5 || p8a.Z(tai0Var6) || nai0Var.c) {
                                        k7Var.j(strO);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                gnk0Var2 = gnk0Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(phu0.S(tai0Var6));
                            if (i2 >= 34) {
                                zN = r6.n(accessibilityManager);
                            } else {
                                zN = true;
                            }
                            listI = tai0Var6.i((4 & 1) != 0 ? !tai0Var6.b : false, (4 & 2) == 0);
                            size = listI.size();
                            z = zN;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                accessibilityNodeInfo = k7Var.f17795a;
                                if (i4 < size) {
                                    int i32 = size;
                                    tai0Var4 = (tai0) listI.get(i4);
                                    List list5 = listI;
                                    gkxVarS = androidComposeViewAccessibilityDelegateCompat2.s();
                                    int i33 = i4;
                                    i31 = tai0Var4.f;
                                    if (gkxVarS.a(i31)) {
                                        k33Var = androidComposeView2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(tai0Var4.c);
                                        if (i31 != -1) {
                                            if (k33Var != null) {
                                                accessibilityNodeInfoObtain.addChild(k33Var);
                                            } else {
                                                vai0Var = (vai0) androidComposeViewAccessibilityDelegateCompat2.s().b(i31);
                                                if (vai0Var != null || (tai0Var5 = vai0Var.f37089a) == null) {
                                                    zD2 = false;
                                                } else {
                                                    Object objG19 = tai0Var5.k().f23193a.g(xai0.o);
                                                    if (objG19 == null) {
                                                        objG19 = null;
                                                    }
                                                    zD2 = Intrinsics.d(objG19, Boolean.TRUE);
                                                }
                                                if (z || !zD2) {
                                                    accessibilityNodeInfo.addChild(androidComposeView2, i31);
                                                }
                                            }
                                            dy40Var.f(i31, i3);
                                            i3++;
                                        }
                                    }
                                    i4 = i33 + 1;
                                    listI = list5;
                                    size = i32;
                                } else {
                                    if (i == androidComposeViewAccessibilityDelegateCompat2.k) {
                                        accessibilityNodeInfo.setAccessibilityFocused(true);
                                        k7Var.b(d7.g);
                                    } else {
                                        accessibilityNodeInfo.setAccessibilityFocused(false);
                                        k7Var.b(d7.f);
                                    }
                                    j83VarU = p8a.U(tai0Var6);
                                    if (j83VarU != null) {
                                        fontFamilyResolver = androidComposeView2.getFontFamilyResolver();
                                        density = androidComposeView2.getDensity();
                                        ywuVar = androidComposeViewAccessibilityDelegateCompat2.g1;
                                        String str5 = j83VarU.b;
                                        list4 = j83VarU.f16067a;
                                        spannableString2 = new SpannableString(str5);
                                        arrayList4 = j83VarU.c;
                                        if (arrayList4 != null) {
                                            size11 = arrayList4.size();
                                            i23 = 0;
                                            while (i23 < size11) {
                                                int i34 = size11;
                                                i83 i83Var4 = (i83) arrayList4.get(i23);
                                                int i35 = i23;
                                                smk0 smk0Var = (smk0) i83Var4.f14321a;
                                                ArrayList arrayList7 = arrayList4;
                                                i24 = i83Var4.b;
                                                i25 = i83Var4.c;
                                                nai0 nai0Var5 = nai0Var;
                                                ucg0 ucg0Var4 = ucg0Var;
                                                tai0 tai0Var7 = tai0Var6;
                                                smk0VarA = smk0.a(smk0Var, 0L, null, 65503);
                                                e8q0 e8q0Var = smk0VarA.f32451a;
                                                f8q0Var = smk0VarA.j;
                                                k5q0Var = smk0VarA.m;
                                                nrqVar = smk0VarA.f;
                                                lsqVar = smk0VarA.d;
                                                AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo;
                                                hz40 hz40Var4 = hz40Var;
                                                azw.U(spannableString2, e8q0Var.h(), i24, i25);
                                                spannableString4 = spannableString2;
                                                azw.V(spannableString4, smk0VarA.b, density, i24, i25);
                                                psqVar = smk0VarA.c;
                                                if (psqVar == null || lsqVar != null) {
                                                    if (psqVar == null) {
                                                        psqVar = psq.e;
                                                    }
                                                    if (lsqVar != null) {
                                                        i26 = lsqVar.f20592a;
                                                    } else {
                                                        i26 = 0;
                                                    }
                                                    StyleSpan styleSpan = new StyleSpan(zgc.K(psqVar, i26));
                                                    i27 = 33;
                                                    spannableString4.setSpan(styleSpan, i24, i25, 33);
                                                } else {
                                                    i27 = 33;
                                                }
                                                if (nrqVar == null) {
                                                    i28 = i27;
                                                } else if (nrqVar instanceof vjt) {
                                                    spannableString4.setSpan(new TypefaceSpan(((vjt) nrqVar).f), i24, i25, i27);
                                                    i28 = i27;
                                                } else if (Build.VERSION.SDK_INT >= 28) {
                                                    msqVar = smk0VarA.e;
                                                    if (msqVar != null) {
                                                        i30 = msqVar.f22332a;
                                                    } else {
                                                        i30 = 65535;
                                                    }
                                                    Object value = ((orq) fontFamilyResolver).b(nrqVar, psq.e, 0, i30).getValue();
                                                    value.getClass();
                                                    i28 = 33;
                                                    spannableString4.setSpan(ia3.h((Typeface) value), i24, i25, 33);
                                                } else {
                                                    i28 = 33;
                                                }
                                                if (k5q0Var != null) {
                                                    i29 = k5q0Var.f17733a;
                                                    if ((i29 | 1) == i29) {
                                                        spannableString4.setSpan(new UnderlineSpan(), i24, i25, i28);
                                                    }
                                                    if ((i29 | 2) == i29) {
                                                        spannableString4.setSpan(new StrikethroughSpan(), i24, i25, i28);
                                                    }
                                                }
                                                if (f8q0Var != null) {
                                                    spannableString4.setSpan(new ScaleXSpan(f8q0Var.f9121a), i24, i25, i28);
                                                }
                                                azw.W(spannableString4, smk0VarA.k, i24, i25);
                                                j = smk0VarA.l;
                                                if (j != 16) {
                                                    spannableString4.setSpan(new BackgroundColorSpan(fbc.U(j)), i24, i25, 33);
                                                }
                                                i23 = i35 + 1;
                                                spannableString2 = spannableString4;
                                                resources = resources;
                                                size11 = i34;
                                                arrayList4 = arrayList7;
                                                nai0Var = nai0Var5;
                                                ucg0Var = ucg0Var4;
                                                tai0Var6 = tai0Var7;
                                                hz40Var = hz40Var4;
                                                accessibilityNodeInfo = accessibilityNodeInfo4;
                                            }
                                        }
                                        tai0Var = tai0Var6;
                                        nai0Var2 = nai0Var;
                                        ucg0Var2 = ucg0Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        hz40Var2 = hz40Var;
                                        spannableString3 = spannableString2;
                                        resources2 = resources;
                                        int length = str5.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size10 = list4.size();
                                            while (i22 < size10) {
                                                Object obj2 = list4.get(i22);
                                                i83Var3 = (i83) obj2;
                                                if (!(i83Var3.f14321a instanceof h7u0) && k83.b(0, length, i83Var3.b, i83Var3.c)) {
                                                    arrayList5.add(obj2);
                                                }
                                            }
                                        } else {
                                            arrayList5 = iun.f15405a;
                                        }
                                        arrayList5.getClass();
                                        size6 = arrayList5.size();
                                        while (i14 < size6) {
                                            i83 i83Var5 = (i83) arrayList5.get(i14);
                                            h7u0Var = (h7u0) i83Var5.f14321a;
                                            i20 = i83Var5.b;
                                            i21 = i83Var5.c;
                                            if (h7u0Var instanceof h7u0) {
                                                t9f.b();
                                                return null;
                                            }
                                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(h7u0Var.f12593a).build(), i20, i21, 33);
                                        }
                                        int length2 = str5.length();
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size9 = list4.size();
                                            while (i19 < size9) {
                                                Object obj3 = list4.get(i19);
                                                i83Var2 = (i83) obj3;
                                                if (!(i83Var2.f14321a instanceof cot0) && k83.b(0, length2, i83Var2.b, i83Var2.c)) {
                                                    arrayList6.add(obj3);
                                                }
                                            }
                                        } else {
                                            arrayList6 = iun.f15405a;
                                        }
                                        arrayList6.getClass();
                                        size7 = arrayList6.size();
                                        while (i15 < size7) {
                                            i83 i83Var6 = (i83) arrayList6.get(i15);
                                            cot0Var = (cot0) i83Var6.f14321a;
                                            int i36 = i83Var6.b;
                                            int i37 = i83Var6.c;
                                            weakHashMap2 = (WeakHashMap) ywuVar.b;
                                            uRLSpan = weakHashMap2.get(cot0Var);
                                            if (uRLSpan == null) {
                                                uRLSpan = new URLSpan(cot0Var.f4719a);
                                                weakHashMap2.put(cot0Var, uRLSpan);
                                            }
                                            spannableString3.setSpan((URLSpan) uRLSpan, i36, i37, 33);
                                        }
                                        listA = j83VarU.a(str5.length());
                                        size8 = listA.size();
                                        while (i16 < size8) {
                                            i83Var = (i83) listA.get(i16);
                                            i17 = i83Var.b;
                                            obj = i83Var.f14321a;
                                            i18 = i83Var.c;
                                            if (i17 != i18) {
                                                kb00Var = (kb00) obj;
                                                if ((kb00Var instanceof jb00) || ((jb00) kb00Var).c != null) {
                                                    weakHashMap = (WeakHashMap) ywuVar.d;
                                                    vhdVar = weakHashMap.get(i83Var);
                                                    if (vhdVar == null) {
                                                        vhdVar = new vhd(kb00Var);
                                                        weakHashMap.put(i83Var, vhdVar);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) vhdVar, i17, i18, 33);
                                                } else {
                                                    obj.getClass();
                                                    jb00 jb00Var = (jb00) obj;
                                                    i83 i83Var7 = new i83(i17, i18, jb00Var);
                                                    WeakHashMap weakHashMap3 = (WeakHashMap) ywuVar.c;
                                                    Object uRLSpan2 = weakHashMap3.get(i83Var7);
                                                    if (uRLSpan2 == null) {
                                                        uRLSpan2 = new URLSpan(jb00Var.f16214a);
                                                        weakHashMap3.put(i83Var7, uRLSpan2);
                                                    }
                                                    spannableString3.setSpan((URLSpan) uRLSpan2, i17, i18, 33);
                                                }
                                            }
                                        }
                                        spannableString = (SpannableString) AndroidComposeViewAccessibilityDelegateCompat.P(spannableString3);
                                    } else {
                                        dy40Var = dy40Var;
                                        tai0Var = tai0Var6;
                                        nai0Var2 = nai0Var;
                                        ucg0Var2 = ucg0Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        hz40Var2 = hz40Var;
                                        resources2 = resources;
                                        spannableString = null;
                                    }
                                    k7Var.o(spannableString);
                                    zai0Var = xai0.O;
                                    hz40Var3 = hz40Var2;
                                    if (hz40Var3.c(zai0Var)) {
                                        accessibilityNodeInfoObtain.setContentInvalid(true);
                                        objG17 = hz40Var3.g(zai0Var);
                                        if (objG17 == null) {
                                            objG17 = null;
                                        }
                                        accessibilityNodeInfo3 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo3.setError((CharSequence) objG17);
                                    } else {
                                        accessibilityNodeInfo3 = accessibilityNodeInfo2;
                                    }
                                    resources3 = resources2;
                                    tai0Var2 = tai0Var;
                                    strT = p8a.T(tai0Var2, resources3);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        e7.o(accessibilityNodeInfo3, strT);
                                    } else {
                                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strT);
                                    }
                                    accessibilityNodeInfo3.setCheckable(p8a.S(tai0Var2));
                                    objG2 = hz40Var3.g(xai0.L);
                                    if (objG2 == null) {
                                        objG2 = null;
                                    }
                                    evq0Var = (evq0) objG2;
                                    if (evq0Var != null) {
                                        if (evq0Var == evq0.f8484a) {
                                            accessibilityNodeInfo3.setChecked(true);
                                        } else if (evq0Var == evq0.b) {
                                            accessibilityNodeInfo3.setChecked(false);
                                        }
                                    }
                                    objG3 = hz40Var3.g(xai0.K);
                                    if (objG3 == null) {
                                        objG3 = null;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (ucg0Var2 == null) {
                                            ucg0Var3 = ucg0Var2;
                                            i5 = 4;
                                        } else {
                                            ucg0Var3 = ucg0Var2;
                                            i5 = 4;
                                            if (ucg0Var3.f35427a == 4) {
                                                accessibilityNodeInfoObtain.setSelected(zBooleanValue2);
                                            }
                                        }
                                        accessibilityNodeInfo3.setChecked(zBooleanValue2);
                                    } else {
                                        ucg0Var3 = ucg0Var2;
                                        i5 = 4;
                                    }
                                    nai0Var3 = nai0Var2;
                                    if (nai0Var3.c || tai0Var2.i((4 & 1) != 0 ? !tai0Var2.b : false, (4 & 2) == 0).isEmpty()) {
                                        objG4 = hz40Var3.g(xai0.f40557a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) CollectionsKt.firstOrNull(list);
                                        } else {
                                            str = null;
                                        }
                                        accessibilityNodeInfo3.setContentDescription(str);
                                    }
                                    objG5 = hz40Var3.g(xai0.A);
                                    if (objG5 == null) {
                                        objG5 = null;
                                    }
                                    str2 = (String) objG5;
                                    if (str2 != null) {
                                        tai0VarL3 = tai0Var2;
                                        while (true) {
                                            if (tai0VarL3 != null) {
                                                nai0Var4 = tai0VarL3.d;
                                                zai0Var5 = epv0.l;
                                                if (nai0Var4.f23193a.c(zai0Var5)) {
                                                    zBooleanValue = ((Boolean) nai0Var4.c(zai0Var5)).booleanValue();
                                                } else {
                                                    tai0VarL3 = tai0VarL3.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfoObtain.setViewIdResourceName(str2);
                                        }
                                    }
                                    objG6 = hz40Var3.g(xai0.h);
                                    if (objG6 == null) {
                                        objG6 = null;
                                    }
                                    if (((Unit) objG6) != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo3.setHeading(true);
                                        } else {
                                            k7Var.h(2, true);
                                        }
                                    }
                                    objG7 = hz40Var3.g(xai0.i);
                                    if (objG7 == null) {
                                        objG7 = null;
                                    }
                                    if (((Unit) objG7) != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            accessibilityNodeInfoObtain.setTextEntryKey(true);
                                        } else {
                                            k7Var.h(8, true);
                                        }
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = dy40Var.d(tai0Var2.f);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfoObtain.setDrawingOrder(iD3);
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    accessibilityNodeInfoObtain.setPassword(hz40Var3.c(xai0.N));
                                    objG8 = hz40Var3.g(xai0.Q);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    bool2 = Boolean.TRUE;
                                    accessibilityNodeInfoObtain.setEditable(Intrinsics.d(objG8, bool2));
                                    objG9 = hz40Var3.g(xai0.R);
                                    if (objG9 == null) {
                                        objG9 = null;
                                    }
                                    num = (Integer) objG9;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    accessibilityNodeInfo3.setMaxTextLength(iIntValue2);
                                    accessibilityNodeInfo3.setEnabled(p8a.P(tai0Var2));
                                    zai0Var2 = xai0.l;
                                    accessibilityNodeInfo3.setFocusable(hz40Var3.c(zai0Var2));
                                    if (accessibilityNodeInfoObtain.isFocusable()) {
                                        accessibilityNodeInfo3.setFocused(((Boolean) nai0Var3.c(zai0Var2)).booleanValue());
                                        if (accessibilityNodeInfoObtain.isFocused()) {
                                            i7 = 2;
                                            k7Var.a(2);
                                            androidComposeViewAccessibilityDelegateCompat = androidComposeViewAccessibilityDelegateCompat2;
                                            androidComposeViewAccessibilityDelegateCompat.l = i6;
                                        } else {
                                            androidComposeViewAccessibilityDelegateCompat = androidComposeViewAccessibilityDelegateCompat2;
                                            i7 = 2;
                                            z2 = true;
                                            k7Var.a(1);
                                        }
                                        accessibilityNodeInfo3.setVisibleToUser(phu0.R(tai0Var2) ^ z2);
                                        if (tai0Var2.n()) {
                                            tai0VarL2 = tai0Var2.l();
                                            tai0VarL2.getClass();
                                        } else {
                                            tai0VarL2 = tai0Var2;
                                        }
                                        if (tai0VarL2.m().j()) {
                                            accessibilityNodeInfo3.setVisibleToUser(false);
                                        }
                                        dk00Var = (dk00) q0x.L(nai0Var3, xai0.k);
                                        if (dk00Var != null) {
                                            z6 = dk00Var.f6211a;
                                            if (z6 || !z6) {
                                                i7 = 1;
                                            }
                                            accessibilityNodeInfoObtain.setLiveRegion(i7);
                                        }
                                        accessibilityNodeInfo3.setClickable(false);
                                        m6Var = (m6) q0x.L(nai0Var3, mai0.b);
                                        if (m6Var != null) {
                                            boolean zD4 = Intrinsics.d(q0x.L(nai0Var3, xai0.K), bool2);
                                            z4 = (ucg0Var3 == null && ucg0Var3.f35427a == 4) || (ucg0Var3 != null && ucg0Var3.f35427a == 3);
                                            if (z4 || (z4 && !zD4)) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            accessibilityNodeInfo3.setClickable(z5);
                                            if (p8a.P(tai0Var2) && accessibilityNodeInfoObtain.isClickable()) {
                                                k7Var.b(new d7(16, m6Var.f21241a));
                                            }
                                        }
                                        accessibilityNodeInfo3.setLongClickable(false);
                                        m6Var2 = (m6) q0x.L(nai0Var3, mai0.c);
                                        if (m6Var2 != null) {
                                            accessibilityNodeInfo3.setLongClickable(true);
                                            if (p8a.P(tai0Var2)) {
                                                k7Var.b(new d7(32, m6Var2.f21241a));
                                            }
                                        }
                                        m6Var3 = (m6) q0x.L(nai0Var3, mai0.q);
                                        if (m6Var3 != null) {
                                            k7Var.b(new d7(16384, m6Var3.f21241a));
                                        }
                                        if (p8a.P(tai0Var2)) {
                                            m6Var9 = (m6) q0x.L(nai0Var3, mai0.k);
                                            if (m6Var9 != null) {
                                                k7Var.b(new d7(2097152, m6Var9.f21241a));
                                            }
                                            m6Var10 = (m6) q0x.L(nai0Var3, mai0.p);
                                            if (m6Var10 != null) {
                                                k7Var.b(new d7(android.R.id.accessibilityActionImeEnter, m6Var10.f21241a));
                                            }
                                            m6Var11 = (m6) q0x.L(nai0Var3, mai0.r);
                                            if (m6Var11 != null) {
                                                k7Var.b(new d7(65536, m6Var11.f21241a));
                                            }
                                            m6Var12 = (m6) q0x.L(nai0Var3, mai0.s);
                                            if (m6Var12 != null && accessibilityNodeInfoObtain.isFocused()) {
                                                primaryClipDescription = ((c5k) androidComposeView2.getClipboardManager()).f().getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    k7Var.b(new d7(32768, m6Var12.f21241a));
                                                }
                                            }
                                        }
                                        strT2 = AndroidComposeViewAccessibilityDelegateCompat.t(tai0Var2);
                                        if (strT2 != null && strT2.length() != 0) {
                                            accessibilityNodeInfoObtain.setTextSelection(androidComposeViewAccessibilityDelegateCompat.r(tai0Var2), androidComposeViewAccessibilityDelegateCompat.q(tai0Var2));
                                            m6Var8 = (m6) q0x.L(nai0Var3, mai0.j);
                                            if (m6Var8 != null) {
                                                str4 = m6Var8.f21241a;
                                            } else {
                                                str4 = null;
                                            }
                                            k7Var.b(new d7(131072, str4));
                                            k7Var.a(256);
                                            k7Var.a(512);
                                            accessibilityNodeInfo3.setMovementGranularities(11);
                                            list3 = (List) q0x.L(nai0Var3, xai0.f40557a);
                                            if ((list3 != null || list3.isEmpty()) && hz40Var3.c(mai0.f21459a) && (!hz40Var3.c(xai0.G) || Intrinsics.d(q0x.L(nai0Var3, zai0Var2), bool2))) {
                                                e7zVarV = e7zVar2.v();
                                                while (true) {
                                                    if (e7zVarV == null) {
                                                        e7zVarV = null;
                                                    } else {
                                                        nai0VarX2 = e7zVarV.x();
                                                        if (nai0VarX2 == null && nai0VarX2.c) {
                                                            if (nai0VarX2.f23193a.c(xai0.G)) {
                                                            }
                                                        }
                                                        e7zVarV = e7zVarV.v();
                                                    }
                                                }
                                                if (e7zVarV == null) {
                                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                                } else {
                                                    nai0VarX = e7zVarV.x();
                                                    if (nai0VarX != null) {
                                                        objG16 = nai0VarX.f23193a.g(xai0.l);
                                                        if (objG16 == null) {
                                                            objG16 = null;
                                                        }
                                                        zD = Intrinsics.d(objG16, Boolean.TRUE);
                                                    } else {
                                                        zD = false;
                                                    }
                                                    if (zD) {
                                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                        }
                                        i8 = Build.VERSION.SDK_INT;
                                        if (i8 >= 26) {
                                            arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            charSequenceG = k7Var.g();
                                            if (charSequenceG != null && charSequenceG.length() != 0 && hz40Var3.c(mai0.f21459a)) {
                                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (hz40Var3.c(xai0.A)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (hz40Var3.c(xai0.S)) {
                                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            i9 = Build.VERSION.SDK_INT;
                                            if (i9 >= 26) {
                                                accessibilityNodeInfoObtain.setAvailableExtraData(arrayList3);
                                            }
                                            i8 = i9;
                                        } else {
                                            i9 = i8;
                                        }
                                        g3c0Var = (g3c0) q0x.L(nai0Var3, xai0.c);
                                        if (g3c0Var != null) {
                                            f = g3c0Var.f10603a;
                                            cvcVar = g3c0Var.b;
                                            zai0Var4 = mai0.i;
                                            if (hz40Var3.c(zai0Var4)) {
                                                k7Var.j("android.widget.SeekBar");
                                            } else {
                                                k7Var.j("android.widget.ProgressBar");
                                            }
                                            if (g3c0Var != g3c0.c) {
                                                accessibilityNodeInfoObtain.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, cvcVar.f5023a, cvcVar.b, f));
                                            }
                                            if (hz40Var3.c(zai0Var4) && p8a.P(tai0Var2)) {
                                                f2 = cvcVar.b;
                                                f3 = cvcVar.f5023a;
                                                if (f2 < f3) {
                                                    f2 = f3;
                                                }
                                                if (f < f2) {
                                                    k7Var.b(d7.h);
                                                }
                                                f4 = cvcVar.b;
                                                if (f3 > f4) {
                                                    f3 = f4;
                                                }
                                                if (f > f3) {
                                                    k7Var.b(d7.i);
                                                }
                                            }
                                        } else {
                                            resources3 = resources3;
                                        }
                                        if (p8a.P(tai0Var2) && (m6Var7 = (m6) q0x.L(nai0Var3, mai0.i)) != null) {
                                            k7Var.b(new d7(android.R.id.accessibilityActionSetProgress, m6Var7.f21241a));
                                        }
                                        objG10 = tai0Var2.k().f23193a.g(xai0.f);
                                        if (objG10 == null) {
                                            objG10 = null;
                                        }
                                        m3dVar = (m3d) objG10;
                                        if (m3dVar != null) {
                                            k7Var.k(i7.b(m3dVar.f21109a, m3dVar.b, 0));
                                        } else {
                                            arrayList = new ArrayList();
                                            objG11 = tai0Var2.k().f23193a.g(xai0.e);
                                            if (objG11 == null) {
                                                objG11 = null;
                                            }
                                            if (objG11 != null) {
                                                listI2 = tai0Var2.i((4 & 1) != 0 ? !tai0Var2.b : false, (4 & 2) == 0);
                                                size4 = listI2.size();
                                                while (i10 < size4) {
                                                    tai0Var3 = (tai0) listI2.get(i10);
                                                    if (tai0Var3.k().f23193a.c(xai0.K)) {
                                                        arrayList.add(tai0Var3);
                                                    }
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                zM = v3c.M(arrayList);
                                                if (zM) {
                                                    size2 = 1;
                                                } else {
                                                    size2 = arrayList.size();
                                                }
                                                if (zM) {
                                                    size3 = arrayList.size();
                                                } else {
                                                    size3 = 1;
                                                }
                                                k7Var.k(i7.b(size2, size3, 0));
                                            }
                                        }
                                        v3c.b0(k7Var, tai0Var2);
                                        t9h0Var = (t9h0) q0x.L(nai0Var3, xai0.v);
                                        m6 m6Var13 = (m6) q0x.L(nai0Var3, mai0.d);
                                        if (t9h0Var != null && m6Var13 != null) {
                                            objG14 = tai0Var2.k().f23193a.g(xai0.f);
                                            if (objG14 == null) {
                                                objG14 = null;
                                            }
                                            if (objG14 == null) {
                                                objG15 = tai0Var2.k().f23193a.g(xai0.e);
                                                if (objG15 == null) {
                                                    objG15 = null;
                                                }
                                                if (objG15 == null) {
                                                    k7Var.j("android.widget.HorizontalScrollView");
                                                }
                                            }
                                            if (((Number) t9h0Var.b.invoke()).floatValue() > 0.0f) {
                                                k7Var.n(true);
                                            }
                                            if (p8a.P(tai0Var2)) {
                                                if (AndroidComposeViewAccessibilityDelegateCompat.z(t9h0Var)) {
                                                    k7Var.b(d7.h);
                                                    e7zVar = e7zVar2;
                                                    if (e7zVar.A == k6z.b) {
                                                        d7Var2 = d7.n;
                                                    } else {
                                                        d7Var2 = d7.p;
                                                    }
                                                    k7Var.b(d7Var2);
                                                } else {
                                                    e7zVar = e7zVar2;
                                                }
                                                if (AndroidComposeViewAccessibilityDelegateCompat.y(t9h0Var)) {
                                                    k7Var.b(d7.i);
                                                    if (e7zVar.A == k6z.b) {
                                                        d7Var = d7.p;
                                                    } else {
                                                        d7Var = d7.n;
                                                    }
                                                    k7Var.b(d7Var);
                                                }
                                            }
                                        }
                                        t9h0Var2 = (t9h0) q0x.L(nai0Var3, xai0.w);
                                        if (t9h0Var2 != null && m6Var13 != null) {
                                            objG12 = tai0Var2.k().f23193a.g(xai0.f);
                                            if (objG12 == null) {
                                                objG12 = null;
                                            }
                                            if (objG12 == null) {
                                                objG13 = tai0Var2.k().f23193a.g(xai0.e);
                                                if (objG13 == null) {
                                                    objG13 = null;
                                                }
                                                if (objG13 == null) {
                                                    k7Var.j("android.widget.ScrollView");
                                                }
                                            }
                                            if (((Number) t9h0Var2.b.invoke()).floatValue() > 0.0f) {
                                                k7Var.n(true);
                                            }
                                            if (p8a.P(tai0Var2)) {
                                                if (AndroidComposeViewAccessibilityDelegateCompat.z(t9h0Var2)) {
                                                    k7Var.b(d7.h);
                                                    k7Var.b(d7.o);
                                                }
                                                if (AndroidComposeViewAccessibilityDelegateCompat.y(t9h0Var2)) {
                                                    k7Var.b(d7.i);
                                                    k7Var.b(d7.m);
                                                }
                                            }
                                        }
                                        if (i8 >= 29) {
                                            ny9.N(k7Var, tai0Var2);
                                        }
                                        charSequence = (CharSequence) q0x.L(nai0Var3, xai0.d);
                                        if (i9 >= 28) {
                                            accessibilityNodeInfo3.setPaneTitle(charSequence);
                                        } else {
                                            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (p8a.P(tai0Var2)) {
                                            m6Var4 = (m6) q0x.L(nai0Var3, mai0.t);
                                            if (m6Var4 != null) {
                                                k7Var.b(new d7(262144, m6Var4.f21241a));
                                            }
                                            m6Var5 = (m6) q0x.L(nai0Var3, mai0.u);
                                            if (m6Var5 != null) {
                                                k7Var.b(new d7(524288, m6Var5.f21241a));
                                            }
                                            m6Var6 = (m6) q0x.L(nai0Var3, mai0.v);
                                            if (m6Var6 != null) {
                                                k7Var.b(new d7(1048576, m6Var6.f21241a));
                                            }
                                            zai0Var3 = mai0.x;
                                            if (hz40Var3.c(zai0Var3)) {
                                                list2 = (List) nai0Var3.c(zai0Var3);
                                                size5 = list2.size();
                                                mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.o1;
                                                i11 = mutableIntList.b;
                                                if (size5 < i11) {
                                                    jf4.n(ua80.e(i11, "Can't have more than ", " custom actions for one widget"));
                                                    return null;
                                                }
                                                gnk0 gnk0Var4 = new gnk0(0);
                                                ry40 ry40VarA = v960.a();
                                                gnk0Var3 = gnk0Var2;
                                                if (jd8.X(gnk0Var3.c, i6, gnk0Var3.f11593a) >= 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    ry40Var = (ry40) j2e.L(gnk0Var3, i6);
                                                    mutableIntList2 = new MutableIntList();
                                                    iArr = mutableIntList.f45342a;
                                                    i12 = mutableIntList.b;
                                                    while (i13 < i12) {
                                                        mutableIntList2.a(iArr[i13]);
                                                    }
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        rw2.w(list2.get(0));
                                                        ry40Var.getClass();
                                                        throw null;
                                                    }
                                                    if (arrayList2.size() <= 0) {
                                                        rw2.w(arrayList2.get(0));
                                                        mutableIntList2.c(0);
                                                        throw null;
                                                    }
                                                } else if (list2.size() > 0) {
                                                    rw2.w(list2.get(0));
                                                    mutableIntList.c(0);
                                                    throw null;
                                                }
                                                androidComposeViewAccessibilityDelegateCompat.r.c(i6, gnk0Var4);
                                                gnk0Var3.c(i6, ry40VarA);
                                            }
                                        }
                                        zY = p8a.Y(tai0Var2, resources3);
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo3.setScreenReaderFocusable(zY);
                                        } else {
                                            k7Var.h(1, zY);
                                        }
                                        iD = androidComposeViewAccessibilityDelegateCompat.B.d(i6);
                                        if (iD != -1) {
                                            k33VarK2 = x1x.K(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                            if (k33VarK2 != null) {
                                                accessibilityNodeInfo3.setTraversalBefore(k33VarK2);
                                                androidComposeView = androidComposeView2;
                                            } else {
                                                androidComposeView = androidComposeView2;
                                                accessibilityNodeInfo3.setTraversalBefore(androidComposeView, iD);
                                            }
                                            bundle = null;
                                            androidComposeViewAccessibilityDelegateCompat.j(i6, k7Var, androidComposeViewAccessibilityDelegateCompat.Z, null);
                                        } else {
                                            androidComposeView = androidComposeView2;
                                            bundle = null;
                                        }
                                        iD2 = androidComposeViewAccessibilityDelegateCompat.Y.d(i6);
                                        if (iD2 != -1 && (k33VarK = x1x.K(androidComposeView.getAndroidViewsHandler$ui(), iD2)) != null) {
                                            accessibilityNodeInfo3.setTraversalAfter(k33VarK);
                                            androidComposeViewAccessibilityDelegateCompat.j(i6, k7Var, androidComposeViewAccessibilityDelegateCompat.f1, bundle);
                                        }
                                        str3 = (String) q0x.L(nai0Var3, epv0.m);
                                        if (str3 != null) {
                                            k7Var.j(str3);
                                        }
                                        k7Var2 = k7Var;
                                    } else {
                                        androidComposeViewAccessibilityDelegateCompat = androidComposeViewAccessibilityDelegateCompat2;
                                        i7 = 2;
                                    }
                                    z2 = true;
                                    accessibilityNodeInfo3.setVisibleToUser(phu0.R(tai0Var2) ^ z2);
                                    if (tai0Var2.n()) {
                                        tai0VarL2 = tai0Var2.l();
                                        tai0VarL2.getClass();
                                    } else {
                                        tai0VarL2 = tai0Var2;
                                    }
                                    if (tai0VarL2.m().j()) {
                                        accessibilityNodeInfo3.setVisibleToUser(false);
                                    }
                                    dk00Var = (dk00) q0x.L(nai0Var3, xai0.k);
                                    if (dk00Var != null) {
                                        z6 = dk00Var.f6211a;
                                        if (z6) {
                                            i7 = 1;
                                        } else {
                                            i7 = 1;
                                        }
                                        accessibilityNodeInfoObtain.setLiveRegion(i7);
                                    }
                                    accessibilityNodeInfo3.setClickable(false);
                                    m6Var = (m6) q0x.L(nai0Var3, mai0.b);
                                    if (m6Var != null) {
                                        boolean zD5 = Intrinsics.d(q0x.L(nai0Var3, xai0.K), bool2);
                                        if (ucg0Var3 == null) {
                                        }
                                        if (z4) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                        }
                                        accessibilityNodeInfo3.setClickable(z5);
                                        if (p8a.P(tai0Var2)) {
                                            k7Var.b(new d7(16, m6Var.f21241a));
                                        }
                                    }
                                    accessibilityNodeInfo3.setLongClickable(false);
                                    m6Var2 = (m6) q0x.L(nai0Var3, mai0.c);
                                    if (m6Var2 != null) {
                                        accessibilityNodeInfo3.setLongClickable(true);
                                        if (p8a.P(tai0Var2)) {
                                            k7Var.b(new d7(32, m6Var2.f21241a));
                                        }
                                    }
                                    m6Var3 = (m6) q0x.L(nai0Var3, mai0.q);
                                    if (m6Var3 != null) {
                                        k7Var.b(new d7(16384, m6Var3.f21241a));
                                    }
                                    if (p8a.P(tai0Var2)) {
                                        m6Var9 = (m6) q0x.L(nai0Var3, mai0.k);
                                        if (m6Var9 != null) {
                                            k7Var.b(new d7(2097152, m6Var9.f21241a));
                                        }
                                        m6Var10 = (m6) q0x.L(nai0Var3, mai0.p);
                                        if (m6Var10 != null) {
                                            k7Var.b(new d7(android.R.id.accessibilityActionImeEnter, m6Var10.f21241a));
                                        }
                                        m6Var11 = (m6) q0x.L(nai0Var3, mai0.r);
                                        if (m6Var11 != null) {
                                            k7Var.b(new d7(65536, m6Var11.f21241a));
                                        }
                                        m6Var12 = (m6) q0x.L(nai0Var3, mai0.s);
                                        if (m6Var12 != null) {
                                            primaryClipDescription = ((c5k) androidComposeView2.getClipboardManager()).f().getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                k7Var.b(new d7(32768, m6Var12.f21241a));
                                            }
                                        }
                                    }
                                    strT2 = AndroidComposeViewAccessibilityDelegateCompat.t(tai0Var2);
                                    if (strT2 != null) {
                                        accessibilityNodeInfoObtain.setTextSelection(androidComposeViewAccessibilityDelegateCompat.r(tai0Var2), androidComposeViewAccessibilityDelegateCompat.q(tai0Var2));
                                        m6Var8 = (m6) q0x.L(nai0Var3, mai0.j);
                                        if (m6Var8 != null) {
                                            str4 = m6Var8.f21241a;
                                        } else {
                                            str4 = null;
                                        }
                                        k7Var.b(new d7(131072, str4));
                                        k7Var.a(256);
                                        k7Var.a(512);
                                        accessibilityNodeInfo3.setMovementGranularities(11);
                                        list3 = (List) q0x.L(nai0Var3, xai0.f40557a);
                                        if (list3 != null) {
                                            e7zVarV = e7zVar2.v();
                                            while (true) {
                                                if (e7zVarV == null) {
                                                    e7zVarV = null;
                                                } else {
                                                    nai0VarX2 = e7zVarV.x();
                                                    if (nai0VarX2 == null) {
                                                    }
                                                    e7zVarV = e7zVarV.v();
                                                }
                                            }
                                            if (e7zVarV == null) {
                                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                            } else {
                                                nai0VarX = e7zVarV.x();
                                                if (nai0VarX != null) {
                                                    objG16 = nai0VarX.f23193a.g(xai0.l);
                                                    if (objG16 == null) {
                                                        objG16 = null;
                                                    }
                                                    zD = Intrinsics.d(objG16, Boolean.TRUE);
                                                } else {
                                                    zD = false;
                                                }
                                                if (zD) {
                                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                                }
                                            }
                                        } else {
                                            e7zVarV = e7zVar2.v();
                                            while (true) {
                                                if (e7zVarV == null) {
                                                    e7zVarV = null;
                                                } else {
                                                    nai0VarX2 = e7zVarV.x();
                                                    if (nai0VarX2 == null) {
                                                    }
                                                    e7zVarV = e7zVarV.v();
                                                }
                                            }
                                            if (e7zVarV == null) {
                                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                            } else {
                                                nai0VarX = e7zVarV.x();
                                                if (nai0VarX != null) {
                                                    objG16 = nai0VarX.f23193a.g(xai0.l);
                                                    if (objG16 == null) {
                                                        objG16 = null;
                                                    }
                                                    zD = Intrinsics.d(objG16, Boolean.TRUE);
                                                } else {
                                                    zD = false;
                                                }
                                                if (zD) {
                                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                    }
                                    i8 = Build.VERSION.SDK_INT;
                                    if (i8 >= 26) {
                                        arrayList3 = new ArrayList();
                                        arrayList3.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = k7Var.g();
                                        if (charSequenceG != null) {
                                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (hz40Var3.c(xai0.A)) {
                                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (hz40Var3.c(xai0.S)) {
                                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        i9 = Build.VERSION.SDK_INT;
                                        if (i9 >= 26) {
                                            accessibilityNodeInfoObtain.setAvailableExtraData(arrayList3);
                                        }
                                        i8 = i9;
                                    } else {
                                        i9 = i8;
                                    }
                                    g3c0Var = (g3c0) q0x.L(nai0Var3, xai0.c);
                                    if (g3c0Var != null) {
                                        f = g3c0Var.f10603a;
                                        cvcVar = g3c0Var.b;
                                        zai0Var4 = mai0.i;
                                        if (hz40Var3.c(zai0Var4)) {
                                            k7Var.j("android.widget.SeekBar");
                                        } else {
                                            k7Var.j("android.widget.ProgressBar");
                                        }
                                        if (g3c0Var != g3c0.c) {
                                            accessibilityNodeInfoObtain.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, cvcVar.f5023a, cvcVar.b, f));
                                        }
                                        if (hz40Var3.c(zai0Var4)) {
                                            f2 = cvcVar.b;
                                            f3 = cvcVar.f5023a;
                                            if (f2 < f3) {
                                                f2 = f3;
                                            }
                                            if (f < f2) {
                                                k7Var.b(d7.h);
                                            }
                                            f4 = cvcVar.b;
                                            if (f3 > f4) {
                                                f3 = f4;
                                            }
                                            if (f > f3) {
                                                k7Var.b(d7.i);
                                            }
                                        }
                                    } else {
                                        resources3 = resources3;
                                    }
                                    if (p8a.P(tai0Var2)) {
                                        k7Var.b(new d7(android.R.id.accessibilityActionSetProgress, m6Var7.f21241a));
                                    }
                                    objG10 = tai0Var2.k().f23193a.g(xai0.f);
                                    if (objG10 == null) {
                                        objG10 = null;
                                    }
                                    m3dVar = (m3d) objG10;
                                    if (m3dVar != null) {
                                        k7Var.k(i7.b(m3dVar.f21109a, m3dVar.b, 0));
                                    } else {
                                        arrayList = new ArrayList();
                                        objG11 = tai0Var2.k().f23193a.g(xai0.e);
                                        if (objG11 == null) {
                                            objG11 = null;
                                        }
                                        if (objG11 != null) {
                                            listI2 = tai0Var2.i((4 & 1) != 0 ? !tai0Var2.b : false, (4 & 2) == 0);
                                            size4 = listI2.size();
                                            while (i10 < size4) {
                                                tai0Var3 = (tai0) listI2.get(i10);
                                                if (tai0Var3.k().f23193a.c(xai0.K)) {
                                                    arrayList.add(tai0Var3);
                                                }
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            zM = v3c.M(arrayList);
                                            if (zM) {
                                                size2 = 1;
                                            } else {
                                                size2 = arrayList.size();
                                            }
                                            if (zM) {
                                                size3 = arrayList.size();
                                            } else {
                                                size3 = 1;
                                            }
                                            k7Var.k(i7.b(size2, size3, 0));
                                        }
                                    }
                                    v3c.b0(k7Var, tai0Var2);
                                    t9h0Var = (t9h0) q0x.L(nai0Var3, xai0.v);
                                    m6 m6Var14 = (m6) q0x.L(nai0Var3, mai0.d);
                                    if (t9h0Var != null) {
                                        objG14 = tai0Var2.k().f23193a.g(xai0.f);
                                        if (objG14 == null) {
                                            objG14 = null;
                                        }
                                        if (objG14 == null) {
                                            objG15 = tai0Var2.k().f23193a.g(xai0.e);
                                            if (objG15 == null) {
                                                objG15 = null;
                                            }
                                            if (objG15 == null) {
                                                k7Var.j("android.widget.HorizontalScrollView");
                                            }
                                        }
                                        if (((Number) t9h0Var.b.invoke()).floatValue() > 0.0f) {
                                            k7Var.n(true);
                                        }
                                        if (p8a.P(tai0Var2)) {
                                            if (AndroidComposeViewAccessibilityDelegateCompat.z(t9h0Var)) {
                                                k7Var.b(d7.h);
                                                e7zVar = e7zVar2;
                                                if (e7zVar.A == k6z.b) {
                                                    d7Var2 = d7.n;
                                                } else {
                                                    d7Var2 = d7.p;
                                                }
                                                k7Var.b(d7Var2);
                                            } else {
                                                e7zVar = e7zVar2;
                                            }
                                            if (AndroidComposeViewAccessibilityDelegateCompat.y(t9h0Var)) {
                                                k7Var.b(d7.i);
                                                if (e7zVar.A == k6z.b) {
                                                    d7Var = d7.p;
                                                } else {
                                                    d7Var = d7.n;
                                                }
                                                k7Var.b(d7Var);
                                            }
                                        }
                                    }
                                    t9h0Var2 = (t9h0) q0x.L(nai0Var3, xai0.w);
                                    if (t9h0Var2 != null) {
                                        objG12 = tai0Var2.k().f23193a.g(xai0.f);
                                        if (objG12 == null) {
                                            objG12 = null;
                                        }
                                        if (objG12 == null) {
                                            objG13 = tai0Var2.k().f23193a.g(xai0.e);
                                            if (objG13 == null) {
                                                objG13 = null;
                                            }
                                            if (objG13 == null) {
                                                k7Var.j("android.widget.ScrollView");
                                            }
                                        }
                                        if (((Number) t9h0Var2.b.invoke()).floatValue() > 0.0f) {
                                            k7Var.n(true);
                                        }
                                        if (p8a.P(tai0Var2)) {
                                            if (AndroidComposeViewAccessibilityDelegateCompat.z(t9h0Var2)) {
                                                k7Var.b(d7.h);
                                                k7Var.b(d7.o);
                                            }
                                            if (AndroidComposeViewAccessibilityDelegateCompat.y(t9h0Var2)) {
                                                k7Var.b(d7.i);
                                                k7Var.b(d7.m);
                                            }
                                        }
                                    }
                                    if (i8 >= 29) {
                                        ny9.N(k7Var, tai0Var2);
                                    }
                                    charSequence = (CharSequence) q0x.L(nai0Var3, xai0.d);
                                    if (i9 >= 28) {
                                        accessibilityNodeInfo3.setPaneTitle(charSequence);
                                    } else {
                                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                    }
                                    if (p8a.P(tai0Var2)) {
                                        m6Var4 = (m6) q0x.L(nai0Var3, mai0.t);
                                        if (m6Var4 != null) {
                                            k7Var.b(new d7(262144, m6Var4.f21241a));
                                        }
                                        m6Var5 = (m6) q0x.L(nai0Var3, mai0.u);
                                        if (m6Var5 != null) {
                                            k7Var.b(new d7(524288, m6Var5.f21241a));
                                        }
                                        m6Var6 = (m6) q0x.L(nai0Var3, mai0.v);
                                        if (m6Var6 != null) {
                                            k7Var.b(new d7(1048576, m6Var6.f21241a));
                                        }
                                        zai0Var3 = mai0.x;
                                        if (hz40Var3.c(zai0Var3)) {
                                            list2 = (List) nai0Var3.c(zai0Var3);
                                            size5 = list2.size();
                                            mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.o1;
                                            i11 = mutableIntList.b;
                                            if (size5 < i11) {
                                                jf4.n(ua80.e(i11, "Can't have more than ", " custom actions for one widget"));
                                                return null;
                                            }
                                            gnk0 gnk0Var5 = new gnk0(0);
                                            ry40 ry40VarA2 = v960.a();
                                            gnk0Var3 = gnk0Var2;
                                            if (jd8.X(gnk0Var3.c, i6, gnk0Var3.f11593a) >= 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                ry40Var = (ry40) j2e.L(gnk0Var3, i6);
                                                mutableIntList2 = new MutableIntList();
                                                iArr = mutableIntList.f45342a;
                                                i12 = mutableIntList.b;
                                                while (i13 < i12) {
                                                    mutableIntList2.a(iArr[i13]);
                                                }
                                                arrayList2 = new ArrayList();
                                                if (list2.size() <= 0) {
                                                    rw2.w(list2.get(0));
                                                    ry40Var.getClass();
                                                    throw null;
                                                }
                                                if (arrayList2.size() <= 0) {
                                                    rw2.w(arrayList2.get(0));
                                                    mutableIntList2.c(0);
                                                    throw null;
                                                }
                                            } else if (list2.size() > 0) {
                                                rw2.w(list2.get(0));
                                                mutableIntList.c(0);
                                                throw null;
                                            }
                                            androidComposeViewAccessibilityDelegateCompat.r.c(i6, gnk0Var5);
                                            gnk0Var3.c(i6, ry40VarA2);
                                        }
                                    }
                                    zY = p8a.Y(tai0Var2, resources3);
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        accessibilityNodeInfo3.setScreenReaderFocusable(zY);
                                    } else {
                                        k7Var.h(1, zY);
                                    }
                                    iD = androidComposeViewAccessibilityDelegateCompat.B.d(i6);
                                    if (iD != -1) {
                                        k33VarK2 = x1x.K(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                        if (k33VarK2 != null) {
                                            accessibilityNodeInfo3.setTraversalBefore(k33VarK2);
                                            androidComposeView = androidComposeView2;
                                        } else {
                                            androidComposeView = androidComposeView2;
                                            accessibilityNodeInfo3.setTraversalBefore(androidComposeView, iD);
                                        }
                                        bundle = null;
                                        androidComposeViewAccessibilityDelegateCompat.j(i6, k7Var, androidComposeViewAccessibilityDelegateCompat.Z, null);
                                    } else {
                                        androidComposeView = androidComposeView2;
                                        bundle = null;
                                    }
                                    iD2 = androidComposeViewAccessibilityDelegateCompat.Y.d(i6);
                                    if (iD2 != -1) {
                                        accessibilityNodeInfo3.setTraversalAfter(k33VarK);
                                        androidComposeViewAccessibilityDelegateCompat.j(i6, k7Var, androidComposeViewAccessibilityDelegateCompat.f1, bundle);
                                    }
                                    str3 = (String) q0x.L(nai0Var3, epv0.m);
                                    if (str3 != null) {
                                        k7Var.j(str3);
                                    }
                                    k7Var2 = k7Var;
                                }
                            }
                        } else if (Build.VERSION.SDK_INT >= 34 ? r6.n(accessibilityManager2) : true) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            k7Var = new k7(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                r6.p(accessibilityNodeInfoObtain, zD3);
                            } else {
                                k7Var.h(64, zD3);
                            }
                            if (i == -1) {
                                parentForAccessibility = androidComposeView2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    view = (View) parentForAccessibility;
                                } else {
                                    view = null;
                                }
                                k7Var.b = -1;
                                accessibilityNodeInfoObtain.setParent(view);
                            } else {
                                tai0VarL = tai0Var6.l();
                                if (tai0VarL != null) {
                                    numValueOf = Integer.valueOf(tai0VarL.f);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    xcx.c("semanticsNode " + i + " has null parent");
                                    csj.b();
                                    return null;
                                }
                                iIntValue = numValueOf.intValue();
                                if (iIntValue == androidComposeView2.getSemanticsOwner().a().f) {
                                    iIntValue = -1;
                                }
                                k7Var.b = iIntValue;
                                accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                            }
                            k7Var.c = i;
                            accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
                            k7Var.i(androidComposeViewAccessibilityDelegateCompat2.k(vai0Var2));
                            dy40Var = androidComposeViewAccessibilityDelegateCompat2.k1;
                            gnk0Var = androidComposeViewAccessibilityDelegateCompat2.s;
                            resources = androidComposeView2.getContext().getResources();
                            k7Var.j("android.view.View");
                            nai0Var = tai0Var6.d;
                            hz40Var = nai0Var.f23193a;
                            if (hz40Var.c(xai0.G)) {
                                k7Var.j("android.widget.EditText");
                            }
                            if (hz40Var.c(xai0.C)) {
                                k7Var.j("android.widget.TextView");
                            }
                            objG = hz40Var.g(xai0.z);
                            if (objG == null) {
                                objG = null;
                            }
                            ucg0Var = (ucg0) objG;
                            if (ucg0Var != null) {
                                b = ucg0Var.f35427a;
                                if (tai0Var6.n()) {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    gnk0Var2 = gnk0Var;
                                } else {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    gnk0Var2 = gnk0Var;
                                    if (tai0Var6.i((4 & 1) != 0 ? !tai0Var6.b : false, (4 & 2) == 0).isEmpty()) {
                                    }
                                }
                                if (b == b2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (b == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strO = x1x.O(b);
                                    if (b == 5) {
                                        k7Var.j(strO);
                                    } else {
                                        k7Var.j(strO);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                gnk0Var2 = gnk0Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(phu0.S(tai0Var6));
                            if (i2 >= 34) {
                                zN = r6.n(accessibilityManager);
                            } else {
                                zN = true;
                            }
                            listI = tai0Var6.i((4 & 1) != 0 ? !tai0Var6.b : false, (4 & 2) == 0);
                            size = listI.size();
                            z = zN;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                accessibilityNodeInfo = k7Var.f17795a;
                                if (i4 < size) {
                                    int i38 = size;
                                    tai0Var4 = (tai0) listI.get(i4);
                                    List list6 = listI;
                                    gkxVarS = androidComposeViewAccessibilityDelegateCompat2.s();
                                    int i39 = i4;
                                    i31 = tai0Var4.f;
                                    if (gkxVarS.a(i31)) {
                                        k33Var = androidComposeView2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(tai0Var4.c);
                                        if (i31 != -1) {
                                            if (k33Var != null) {
                                                accessibilityNodeInfoObtain.addChild(k33Var);
                                            } else {
                                                vai0Var = (vai0) androidComposeViewAccessibilityDelegateCompat2.s().b(i31);
                                                if (vai0Var != null) {
                                                    zD2 = false;
                                                } else {
                                                    zD2 = false;
                                                }
                                                if (z) {
                                                    accessibilityNodeInfo.addChild(androidComposeView2, i31);
                                                } else {
                                                    accessibilityNodeInfo.addChild(androidComposeView2, i31);
                                                }
                                            }
                                            dy40Var.f(i31, i3);
                                            i3++;
                                        }
                                    }
                                    i4 = i39 + 1;
                                    listI = list6;
                                    size = i38;
                                } else {
                                    if (i == androidComposeViewAccessibilityDelegateCompat2.k) {
                                        accessibilityNodeInfo.setAccessibilityFocused(true);
                                        k7Var.b(d7.g);
                                    } else {
                                        accessibilityNodeInfo.setAccessibilityFocused(false);
                                        k7Var.b(d7.f);
                                    }
                                    j83VarU = p8a.U(tai0Var6);
                                    if (j83VarU != null) {
                                        fontFamilyResolver = androidComposeView2.getFontFamilyResolver();
                                        density = androidComposeView2.getDensity();
                                        ywuVar = androidComposeViewAccessibilityDelegateCompat2.g1;
                                        String str6 = j83VarU.b;
                                        list4 = j83VarU.f16067a;
                                        spannableString2 = new SpannableString(str6);
                                        arrayList4 = j83VarU.c;
                                        if (arrayList4 != null) {
                                            size11 = arrayList4.size();
                                            i23 = 0;
                                            while (i23 < size11) {
                                                int i310 = size11;
                                                i83 i83Var8 = (i83) arrayList4.get(i23);
                                                int i311 = i23;
                                                smk0 smk0Var2 = (smk0) i83Var8.f14321a;
                                                ArrayList arrayList8 = arrayList4;
                                                i24 = i83Var8.b;
                                                i25 = i83Var8.c;
                                                nai0 nai0Var6 = nai0Var;
                                                ucg0 ucg0Var5 = ucg0Var;
                                                tai0 tai0Var8 = tai0Var6;
                                                smk0VarA = smk0.a(smk0Var2, 0L, null, 65503);
                                                e8q0 e8q0Var2 = smk0VarA.f32451a;
                                                f8q0Var = smk0VarA.j;
                                                k5q0Var = smk0VarA.m;
                                                nrqVar = smk0VarA.f;
                                                lsqVar = smk0VarA.d;
                                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfo;
                                                hz40 hz40Var5 = hz40Var;
                                                azw.U(spannableString2, e8q0Var2.h(), i24, i25);
                                                spannableString4 = spannableString2;
                                                azw.V(spannableString4, smk0VarA.b, density, i24, i25);
                                                psqVar = smk0VarA.c;
                                                if (psqVar == null) {
                                                    if (psqVar == null) {
                                                        psqVar = psq.e;
                                                    }
                                                    if (lsqVar != null) {
                                                        i26 = lsqVar.f20592a;
                                                    } else {
                                                        i26 = 0;
                                                    }
                                                    StyleSpan styleSpan2 = new StyleSpan(zgc.K(psqVar, i26));
                                                    i27 = 33;
                                                    spannableString4.setSpan(styleSpan2, i24, i25, 33);
                                                } else {
                                                    if (psqVar == null) {
                                                        psqVar = psq.e;
                                                    }
                                                    if (lsqVar != null) {
                                                        i26 = lsqVar.f20592a;
                                                    } else {
                                                        i26 = 0;
                                                    }
                                                    StyleSpan styleSpan3 = new StyleSpan(zgc.K(psqVar, i26));
                                                    i27 = 33;
                                                    spannableString4.setSpan(styleSpan3, i24, i25, 33);
                                                }
                                                if (nrqVar == null) {
                                                    i28 = i27;
                                                } else if (nrqVar instanceof vjt) {
                                                    spannableString4.setSpan(new TypefaceSpan(((vjt) nrqVar).f), i24, i25, i27);
                                                    i28 = i27;
                                                } else if (Build.VERSION.SDK_INT >= 28) {
                                                    msqVar = smk0VarA.e;
                                                    if (msqVar != null) {
                                                        i30 = msqVar.f22332a;
                                                    } else {
                                                        i30 = 65535;
                                                    }
                                                    Object value2 = ((orq) fontFamilyResolver).b(nrqVar, psq.e, 0, i30).getValue();
                                                    value2.getClass();
                                                    i28 = 33;
                                                    spannableString4.setSpan(ia3.h((Typeface) value2), i24, i25, 33);
                                                } else {
                                                    i28 = 33;
                                                }
                                                if (k5q0Var != null) {
                                                    i29 = k5q0Var.f17733a;
                                                    if ((i29 | 1) == i29) {
                                                        spannableString4.setSpan(new UnderlineSpan(), i24, i25, i28);
                                                    }
                                                    if ((i29 | 2) == i29) {
                                                        spannableString4.setSpan(new StrikethroughSpan(), i24, i25, i28);
                                                    }
                                                }
                                                if (f8q0Var != null) {
                                                    spannableString4.setSpan(new ScaleXSpan(f8q0Var.f9121a), i24, i25, i28);
                                                }
                                                azw.W(spannableString4, smk0VarA.k, i24, i25);
                                                j = smk0VarA.l;
                                                if (j != 16) {
                                                    spannableString4.setSpan(new BackgroundColorSpan(fbc.U(j)), i24, i25, 33);
                                                }
                                                i23 = i311 + 1;
                                                spannableString2 = spannableString4;
                                                resources = resources;
                                                size11 = i310;
                                                arrayList4 = arrayList8;
                                                nai0Var = nai0Var6;
                                                ucg0Var = ucg0Var5;
                                                tai0Var6 = tai0Var8;
                                                hz40Var = hz40Var5;
                                                accessibilityNodeInfo = accessibilityNodeInfo5;
                                            }
                                        }
                                        tai0Var = tai0Var6;
                                        nai0Var2 = nai0Var;
                                        ucg0Var2 = ucg0Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        hz40Var2 = hz40Var;
                                        spannableString3 = spannableString2;
                                        resources2 = resources;
                                        int length3 = str6.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size10 = list4.size();
                                            for (i22 = 0; i22 < size10; i22++) {
                                                Object obj4 = list4.get(i22);
                                                i83Var3 = (i83) obj4;
                                                if (!(i83Var3.f14321a instanceof h7u0)) {
                                                }
                                            }
                                        } else {
                                            arrayList5 = iun.f15405a;
                                        }
                                        arrayList5.getClass();
                                        size6 = arrayList5.size();
                                        for (i14 = 0; i14 < size6; i14++) {
                                            i83 i83Var9 = (i83) arrayList5.get(i14);
                                            h7u0Var = (h7u0) i83Var9.f14321a;
                                            i20 = i83Var9.b;
                                            i21 = i83Var9.c;
                                            if (h7u0Var instanceof h7u0) {
                                                t9f.b();
                                                return null;
                                            }
                                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(h7u0Var.f12593a).build(), i20, i21, 33);
                                        }
                                        int length4 = str6.length();
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size9 = list4.size();
                                            for (i19 = 0; i19 < size9; i19++) {
                                                Object obj5 = list4.get(i19);
                                                i83Var2 = (i83) obj5;
                                                if (!(i83Var2.f14321a instanceof cot0)) {
                                                }
                                            }
                                        } else {
                                            arrayList6 = iun.f15405a;
                                        }
                                        arrayList6.getClass();
                                        size7 = arrayList6.size();
                                        for (i15 = 0; i15 < size7; i15++) {
                                            i83 i83Var10 = (i83) arrayList6.get(i15);
                                            cot0Var = (cot0) i83Var10.f14321a;
                                            int i312 = i83Var10.b;
                                            int i313 = i83Var10.c;
                                            weakHashMap2 = (WeakHashMap) ywuVar.b;
                                            uRLSpan = weakHashMap2.get(cot0Var);
                                            if (uRLSpan == null) {
                                                uRLSpan = new URLSpan(cot0Var.f4719a);
                                                weakHashMap2.put(cot0Var, uRLSpan);
                                            }
                                            spannableString3.setSpan((URLSpan) uRLSpan, i312, i313, 33);
                                        }
                                        listA = j83VarU.a(str6.length());
                                        size8 = listA.size();
                                        for (i16 = 0; i16 < size8; i16++) {
                                            i83Var = (i83) listA.get(i16);
                                            i17 = i83Var.b;
                                            obj = i83Var.f14321a;
                                            i18 = i83Var.c;
                                            if (i17 != i18) {
                                                kb00Var = (kb00) obj;
                                                if (kb00Var instanceof jb00) {
                                                    weakHashMap = (WeakHashMap) ywuVar.d;
                                                    vhdVar = weakHashMap.get(i83Var);
                                                    if (vhdVar == null) {
                                                        vhdVar = new vhd(kb00Var);
                                                        weakHashMap.put(i83Var, vhdVar);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) vhdVar, i17, i18, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) ywuVar.d;
                                                    vhdVar = weakHashMap.get(i83Var);
                                                    if (vhdVar == null) {
                                                        vhdVar = new vhd(kb00Var);
                                                        weakHashMap.put(i83Var, vhdVar);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) vhdVar, i17, i18, 33);
                                                }
                                            }
                                        }
                                        spannableString = (SpannableString) AndroidComposeViewAccessibilityDelegateCompat.P(spannableString3);
                                    } else {
                                        dy40Var = dy40Var;
                                        tai0Var = tai0Var6;
                                        nai0Var2 = nai0Var;
                                        ucg0Var2 = ucg0Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        hz40Var2 = hz40Var;
                                        resources2 = resources;
                                        spannableString = null;
                                    }
                                    k7Var.o(spannableString);
                                    zai0Var = xai0.O;
                                    hz40Var3 = hz40Var2;
                                    if (hz40Var3.c(zai0Var)) {
                                        accessibilityNodeInfoObtain.setContentInvalid(true);
                                        objG17 = hz40Var3.g(zai0Var);
                                        if (objG17 == null) {
                                            objG17 = null;
                                        }
                                        accessibilityNodeInfo3 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo3.setError((CharSequence) objG17);
                                    } else {
                                        accessibilityNodeInfo3 = accessibilityNodeInfo2;
                                    }
                                    resources3 = resources2;
                                    tai0Var2 = tai0Var;
                                    strT = p8a.T(tai0Var2, resources3);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        e7.o(accessibilityNodeInfo3, strT);
                                    } else {
                                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strT);
                                    }
                                    accessibilityNodeInfo3.setCheckable(p8a.S(tai0Var2));
                                    objG2 = hz40Var3.g(xai0.L);
                                    if (objG2 == null) {
                                        objG2 = null;
                                    }
                                    evq0Var = (evq0) objG2;
                                    if (evq0Var != null) {
                                        if (evq0Var == evq0.f8484a) {
                                            accessibilityNodeInfo3.setChecked(true);
                                        } else if (evq0Var == evq0.b) {
                                            accessibilityNodeInfo3.setChecked(false);
                                        }
                                    }
                                    objG3 = hz40Var3.g(xai0.K);
                                    if (objG3 == null) {
                                        objG3 = null;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (ucg0Var2 == null) {
                                            ucg0Var3 = ucg0Var2;
                                            i5 = 4;
                                        } else {
                                            ucg0Var3 = ucg0Var2;
                                            i5 = 4;
                                            if (ucg0Var3.f35427a == 4) {
                                                accessibilityNodeInfoObtain.setSelected(zBooleanValue2);
                                            }
                                        }
                                        accessibilityNodeInfo3.setChecked(zBooleanValue2);
                                    } else {
                                        ucg0Var3 = ucg0Var2;
                                        i5 = 4;
                                    }
                                    nai0Var3 = nai0Var2;
                                    if (nai0Var3.c) {
                                        objG4 = hz40Var3.g(xai0.f40557a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) CollectionsKt.firstOrNull(list);
                                        } else {
                                            str = null;
                                        }
                                        accessibilityNodeInfo3.setContentDescription(str);
                                    } else {
                                        objG4 = hz40Var3.g(xai0.f40557a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) CollectionsKt.firstOrNull(list);
                                        } else {
                                            str = null;
                                        }
                                        accessibilityNodeInfo3.setContentDescription(str);
                                    }
                                    objG5 = hz40Var3.g(xai0.A);
                                    if (objG5 == null) {
                                        objG5 = null;
                                    }
                                    str2 = (String) objG5;
                                    if (str2 != null) {
                                        tai0VarL3 = tai0Var2;
                                        while (true) {
                                            if (tai0VarL3 != null) {
                                                nai0Var4 = tai0VarL3.d;
                                                zai0Var5 = epv0.l;
                                                if (nai0Var4.f23193a.c(zai0Var5)) {
                                                    zBooleanValue = ((Boolean) nai0Var4.c(zai0Var5)).booleanValue();
                                                } else {
                                                    tai0VarL3 = tai0VarL3.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfoObtain.setViewIdResourceName(str2);
                                        }
                                    }
                                    objG6 = hz40Var3.g(xai0.h);
                                    if (objG6 == null) {
                                        objG6 = null;
                                    }
                                    if (((Unit) objG6) != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo3.setHeading(true);
                                        } else {
                                            k7Var.h(2, true);
                                        }
                                    }
                                    objG7 = hz40Var3.g(xai0.i);
                                    if (objG7 == null) {
                                        objG7 = null;
                                    }
                                    if (((Unit) objG7) != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            accessibilityNodeInfoObtain.setTextEntryKey(true);
                                        } else {
                                            k7Var.h(8, true);
                                        }
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = dy40Var.d(tai0Var2.f);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfoObtain.setDrawingOrder(iD3);
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    accessibilityNodeInfoObtain.setPassword(hz40Var3.c(xai0.N));
                                    objG8 = hz40Var3.g(xai0.Q);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    bool2 = Boolean.TRUE;
                                    accessibilityNodeInfoObtain.setEditable(Intrinsics.d(objG8, bool2));
                                    objG9 = hz40Var3.g(xai0.R);
                                    if (objG9 == null) {
                                        objG9 = null;
                                    }
                                    num = (Integer) objG9;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    accessibilityNodeInfo3.setMaxTextLength(iIntValue2);
                                    accessibilityNodeInfo3.setEnabled(p8a.P(tai0Var2));
                                    zai0Var2 = xai0.l;
                                    accessibilityNodeInfo3.setFocusable(hz40Var3.c(zai0Var2));
                                    if (accessibilityNodeInfoObtain.isFocusable()) {
                                        accessibilityNodeInfo3.setFocused(((Boolean) nai0Var3.c(zai0Var2)).booleanValue());
                                        if (accessibilityNodeInfoObtain.isFocused()) {
                                            i7 = 2;
                                            k7Var.a(2);
                                            androidComposeViewAccessibilityDelegateCompat = androidComposeViewAccessibilityDelegateCompat2;
                                            androidComposeViewAccessibilityDelegateCompat.l = i6;
                                        } else {
                                            androidComposeViewAccessibilityDelegateCompat = androidComposeViewAccessibilityDelegateCompat2;
                                            i7 = 2;
                                            z2 = true;
                                            k7Var.a(1);
                                        }
                                        accessibilityNodeInfo3.setVisibleToUser(phu0.R(tai0Var2) ^ z2);
                                        if (tai0Var2.n()) {
                                            tai0VarL2 = tai0Var2.l();
                                            tai0VarL2.getClass();
                                        } else {
                                            tai0VarL2 = tai0Var2;
                                        }
                                        if (tai0VarL2.m().j()) {
                                            accessibilityNodeInfo3.setVisibleToUser(false);
                                        }
                                        dk00Var = (dk00) q0x.L(nai0Var3, xai0.k);
                                        if (dk00Var != null) {
                                            z6 = dk00Var.f6211a;
                                            if (z6) {
                                                i7 = 1;
                                            } else {
                                                i7 = 1;
                                            }
                                            accessibilityNodeInfoObtain.setLiveRegion(i7);
                                        }
                                        accessibilityNodeInfo3.setClickable(false);
                                        m6Var = (m6) q0x.L(nai0Var3, mai0.b);
                                        if (m6Var != null) {
                                            boolean zD6 = Intrinsics.d(q0x.L(nai0Var3, xai0.K), bool2);
                                            if (ucg0Var3 == null) {
                                            }
                                            if (z4) {
                                                z5 = true;
                                            } else {
                                                z5 = true;
                                            }
                                            accessibilityNodeInfo3.setClickable(z5);
                                            if (p8a.P(tai0Var2)) {
                                                k7Var.b(new d7(16, m6Var.f21241a));
                                            }
                                        }
                                        accessibilityNodeInfo3.setLongClickable(false);
                                        m6Var2 = (m6) q0x.L(nai0Var3, mai0.c);
                                        if (m6Var2 != null) {
                                            accessibilityNodeInfo3.setLongClickable(true);
                                            if (p8a.P(tai0Var2)) {
                                                k7Var.b(new d7(32, m6Var2.f21241a));
                                            }
                                        }
                                        m6Var3 = (m6) q0x.L(nai0Var3, mai0.q);
                                        if (m6Var3 != null) {
                                            k7Var.b(new d7(16384, m6Var3.f21241a));
                                        }
                                        if (p8a.P(tai0Var2)) {
                                            m6Var9 = (m6) q0x.L(nai0Var3, mai0.k);
                                            if (m6Var9 != null) {
                                                k7Var.b(new d7(2097152, m6Var9.f21241a));
                                            }
                                            m6Var10 = (m6) q0x.L(nai0Var3, mai0.p);
                                            if (m6Var10 != null) {
                                                k7Var.b(new d7(android.R.id.accessibilityActionImeEnter, m6Var10.f21241a));
                                            }
                                            m6Var11 = (m6) q0x.L(nai0Var3, mai0.r);
                                            if (m6Var11 != null) {
                                                k7Var.b(new d7(65536, m6Var11.f21241a));
                                            }
                                            m6Var12 = (m6) q0x.L(nai0Var3, mai0.s);
                                            if (m6Var12 != null) {
                                                primaryClipDescription = ((c5k) androidComposeView2.getClipboardManager()).f().getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    k7Var.b(new d7(32768, m6Var12.f21241a));
                                                }
                                            }
                                        }
                                        strT2 = AndroidComposeViewAccessibilityDelegateCompat.t(tai0Var2);
                                        if (strT2 != null) {
                                            accessibilityNodeInfoObtain.setTextSelection(androidComposeViewAccessibilityDelegateCompat.r(tai0Var2), androidComposeViewAccessibilityDelegateCompat.q(tai0Var2));
                                            m6Var8 = (m6) q0x.L(nai0Var3, mai0.j);
                                            if (m6Var8 != null) {
                                                str4 = m6Var8.f21241a;
                                            } else {
                                                str4 = null;
                                            }
                                            k7Var.b(new d7(131072, str4));
                                            k7Var.a(256);
                                            k7Var.a(512);
                                            accessibilityNodeInfo3.setMovementGranularities(11);
                                            list3 = (List) q0x.L(nai0Var3, xai0.f40557a);
                                            if (list3 != null) {
                                                e7zVarV = e7zVar2.v();
                                                while (true) {
                                                    if (e7zVarV == null) {
                                                        e7zVarV = null;
                                                    } else {
                                                        nai0VarX2 = e7zVarV.x();
                                                        if (nai0VarX2 == null) {
                                                        }
                                                        e7zVarV = e7zVarV.v();
                                                    }
                                                }
                                                if (e7zVarV == null) {
                                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                                } else {
                                                    nai0VarX = e7zVarV.x();
                                                    if (nai0VarX != null) {
                                                        objG16 = nai0VarX.f23193a.g(xai0.l);
                                                        if (objG16 == null) {
                                                            objG16 = null;
                                                        }
                                                        zD = Intrinsics.d(objG16, Boolean.TRUE);
                                                    } else {
                                                        zD = false;
                                                    }
                                                    if (zD) {
                                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                                    }
                                                }
                                            } else {
                                                e7zVarV = e7zVar2.v();
                                                while (true) {
                                                    if (e7zVarV == null) {
                                                        e7zVarV = null;
                                                    } else {
                                                        nai0VarX2 = e7zVarV.x();
                                                        if (nai0VarX2 == null) {
                                                        }
                                                        e7zVarV = e7zVarV.v();
                                                    }
                                                }
                                                if (e7zVarV == null) {
                                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                                } else {
                                                    nai0VarX = e7zVarV.x();
                                                    if (nai0VarX != null) {
                                                        objG16 = nai0VarX.f23193a.g(xai0.l);
                                                        if (objG16 == null) {
                                                            objG16 = null;
                                                        }
                                                        zD = Intrinsics.d(objG16, Boolean.TRUE);
                                                    } else {
                                                        zD = false;
                                                    }
                                                    if (zD) {
                                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                        }
                                        i8 = Build.VERSION.SDK_INT;
                                        if (i8 >= 26) {
                                            arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            charSequenceG = k7Var.g();
                                            if (charSequenceG != null) {
                                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (hz40Var3.c(xai0.A)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (hz40Var3.c(xai0.S)) {
                                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            i9 = Build.VERSION.SDK_INT;
                                            if (i9 >= 26) {
                                                accessibilityNodeInfoObtain.setAvailableExtraData(arrayList3);
                                            }
                                            i8 = i9;
                                        } else {
                                            i9 = i8;
                                        }
                                        g3c0Var = (g3c0) q0x.L(nai0Var3, xai0.c);
                                        if (g3c0Var != null) {
                                            f = g3c0Var.f10603a;
                                            cvcVar = g3c0Var.b;
                                            zai0Var4 = mai0.i;
                                            if (hz40Var3.c(zai0Var4)) {
                                                k7Var.j("android.widget.SeekBar");
                                            } else {
                                                k7Var.j("android.widget.ProgressBar");
                                            }
                                            if (g3c0Var != g3c0.c) {
                                                accessibilityNodeInfoObtain.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, cvcVar.f5023a, cvcVar.b, f));
                                            }
                                            if (hz40Var3.c(zai0Var4)) {
                                                f2 = cvcVar.b;
                                                f3 = cvcVar.f5023a;
                                                if (f2 < f3) {
                                                    f2 = f3;
                                                }
                                                if (f < f2) {
                                                    k7Var.b(d7.h);
                                                }
                                                f4 = cvcVar.b;
                                                if (f3 > f4) {
                                                    f3 = f4;
                                                }
                                                if (f > f3) {
                                                    k7Var.b(d7.i);
                                                }
                                            }
                                        } else {
                                            resources3 = resources3;
                                        }
                                        if (p8a.P(tai0Var2)) {
                                            k7Var.b(new d7(android.R.id.accessibilityActionSetProgress, m6Var7.f21241a));
                                        }
                                        objG10 = tai0Var2.k().f23193a.g(xai0.f);
                                        if (objG10 == null) {
                                            objG10 = null;
                                        }
                                        m3dVar = (m3d) objG10;
                                        if (m3dVar != null) {
                                            k7Var.k(i7.b(m3dVar.f21109a, m3dVar.b, 0));
                                        } else {
                                            arrayList = new ArrayList();
                                            objG11 = tai0Var2.k().f23193a.g(xai0.e);
                                            if (objG11 == null) {
                                                objG11 = null;
                                            }
                                            if (objG11 != null) {
                                                listI2 = tai0Var2.i((4 & 1) != 0 ? !tai0Var2.b : false, (4 & 2) == 0);
                                                size4 = listI2.size();
                                                for (i10 = 0; i10 < size4; i10++) {
                                                    tai0Var3 = (tai0) listI2.get(i10);
                                                    if (tai0Var3.k().f23193a.c(xai0.K)) {
                                                        arrayList.add(tai0Var3);
                                                    }
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                zM = v3c.M(arrayList);
                                                if (zM) {
                                                    size2 = 1;
                                                } else {
                                                    size2 = arrayList.size();
                                                }
                                                if (zM) {
                                                    size3 = arrayList.size();
                                                } else {
                                                    size3 = 1;
                                                }
                                                k7Var.k(i7.b(size2, size3, 0));
                                            }
                                        }
                                        v3c.b0(k7Var, tai0Var2);
                                        t9h0Var = (t9h0) q0x.L(nai0Var3, xai0.v);
                                        m6 m6Var15 = (m6) q0x.L(nai0Var3, mai0.d);
                                        if (t9h0Var != null) {
                                            objG14 = tai0Var2.k().f23193a.g(xai0.f);
                                            if (objG14 == null) {
                                                objG14 = null;
                                            }
                                            if (objG14 == null) {
                                                objG15 = tai0Var2.k().f23193a.g(xai0.e);
                                                if (objG15 == null) {
                                                    objG15 = null;
                                                }
                                                if (objG15 == null) {
                                                    k7Var.j("android.widget.HorizontalScrollView");
                                                }
                                            }
                                            if (((Number) t9h0Var.b.invoke()).floatValue() > 0.0f) {
                                                k7Var.n(true);
                                            }
                                            if (p8a.P(tai0Var2)) {
                                                if (AndroidComposeViewAccessibilityDelegateCompat.z(t9h0Var)) {
                                                    k7Var.b(d7.h);
                                                    e7zVar = e7zVar2;
                                                    if (e7zVar.A == k6z.b) {
                                                        d7Var2 = d7.n;
                                                    } else {
                                                        d7Var2 = d7.p;
                                                    }
                                                    k7Var.b(d7Var2);
                                                } else {
                                                    e7zVar = e7zVar2;
                                                }
                                                if (AndroidComposeViewAccessibilityDelegateCompat.y(t9h0Var)) {
                                                    k7Var.b(d7.i);
                                                    if (e7zVar.A == k6z.b) {
                                                        d7Var = d7.p;
                                                    } else {
                                                        d7Var = d7.n;
                                                    }
                                                    k7Var.b(d7Var);
                                                }
                                            }
                                        }
                                        t9h0Var2 = (t9h0) q0x.L(nai0Var3, xai0.w);
                                        if (t9h0Var2 != null) {
                                            objG12 = tai0Var2.k().f23193a.g(xai0.f);
                                            if (objG12 == null) {
                                                objG12 = null;
                                            }
                                            if (objG12 == null) {
                                                objG13 = tai0Var2.k().f23193a.g(xai0.e);
                                                if (objG13 == null) {
                                                    objG13 = null;
                                                }
                                                if (objG13 == null) {
                                                    k7Var.j("android.widget.ScrollView");
                                                }
                                            }
                                            if (((Number) t9h0Var2.b.invoke()).floatValue() > 0.0f) {
                                                k7Var.n(true);
                                            }
                                            if (p8a.P(tai0Var2)) {
                                                if (AndroidComposeViewAccessibilityDelegateCompat.z(t9h0Var2)) {
                                                    k7Var.b(d7.h);
                                                    k7Var.b(d7.o);
                                                }
                                                if (AndroidComposeViewAccessibilityDelegateCompat.y(t9h0Var2)) {
                                                    k7Var.b(d7.i);
                                                    k7Var.b(d7.m);
                                                }
                                            }
                                        }
                                        if (i8 >= 29) {
                                            ny9.N(k7Var, tai0Var2);
                                        }
                                        charSequence = (CharSequence) q0x.L(nai0Var3, xai0.d);
                                        if (i9 >= 28) {
                                            accessibilityNodeInfo3.setPaneTitle(charSequence);
                                        } else {
                                            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (p8a.P(tai0Var2)) {
                                            m6Var4 = (m6) q0x.L(nai0Var3, mai0.t);
                                            if (m6Var4 != null) {
                                                k7Var.b(new d7(262144, m6Var4.f21241a));
                                            }
                                            m6Var5 = (m6) q0x.L(nai0Var3, mai0.u);
                                            if (m6Var5 != null) {
                                                k7Var.b(new d7(524288, m6Var5.f21241a));
                                            }
                                            m6Var6 = (m6) q0x.L(nai0Var3, mai0.v);
                                            if (m6Var6 != null) {
                                                k7Var.b(new d7(1048576, m6Var6.f21241a));
                                            }
                                            zai0Var3 = mai0.x;
                                            if (hz40Var3.c(zai0Var3)) {
                                                list2 = (List) nai0Var3.c(zai0Var3);
                                                size5 = list2.size();
                                                mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.o1;
                                                i11 = mutableIntList.b;
                                                if (size5 < i11) {
                                                    jf4.n(ua80.e(i11, "Can't have more than ", " custom actions for one widget"));
                                                    return null;
                                                }
                                                gnk0 gnk0Var6 = new gnk0(0);
                                                ry40 ry40VarA3 = v960.a();
                                                gnk0Var3 = gnk0Var2;
                                                if (jd8.X(gnk0Var3.c, i6, gnk0Var3.f11593a) >= 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    ry40Var = (ry40) j2e.L(gnk0Var3, i6);
                                                    mutableIntList2 = new MutableIntList();
                                                    iArr = mutableIntList.f45342a;
                                                    i12 = mutableIntList.b;
                                                    for (i13 = 0; i13 < i12; i13++) {
                                                        mutableIntList2.a(iArr[i13]);
                                                    }
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        rw2.w(list2.get(0));
                                                        ry40Var.getClass();
                                                        throw null;
                                                    }
                                                    if (arrayList2.size() <= 0) {
                                                        rw2.w(arrayList2.get(0));
                                                        mutableIntList2.c(0);
                                                        throw null;
                                                    }
                                                } else if (list2.size() > 0) {
                                                    rw2.w(list2.get(0));
                                                    mutableIntList.c(0);
                                                    throw null;
                                                }
                                                androidComposeViewAccessibilityDelegateCompat.r.c(i6, gnk0Var6);
                                                gnk0Var3.c(i6, ry40VarA3);
                                            }
                                        }
                                        zY = p8a.Y(tai0Var2, resources3);
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo3.setScreenReaderFocusable(zY);
                                        } else {
                                            k7Var.h(1, zY);
                                        }
                                        iD = androidComposeViewAccessibilityDelegateCompat.B.d(i6);
                                        if (iD != -1) {
                                            k33VarK2 = x1x.K(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                            if (k33VarK2 != null) {
                                                accessibilityNodeInfo3.setTraversalBefore(k33VarK2);
                                                androidComposeView = androidComposeView2;
                                            } else {
                                                androidComposeView = androidComposeView2;
                                                accessibilityNodeInfo3.setTraversalBefore(androidComposeView, iD);
                                            }
                                            bundle = null;
                                            androidComposeViewAccessibilityDelegateCompat.j(i6, k7Var, androidComposeViewAccessibilityDelegateCompat.Z, null);
                                        } else {
                                            androidComposeView = androidComposeView2;
                                            bundle = null;
                                        }
                                        iD2 = androidComposeViewAccessibilityDelegateCompat.Y.d(i6);
                                        if (iD2 != -1) {
                                            accessibilityNodeInfo3.setTraversalAfter(k33VarK);
                                            androidComposeViewAccessibilityDelegateCompat.j(i6, k7Var, androidComposeViewAccessibilityDelegateCompat.f1, bundle);
                                        }
                                        str3 = (String) q0x.L(nai0Var3, epv0.m);
                                        if (str3 != null) {
                                            k7Var.j(str3);
                                        }
                                        k7Var2 = k7Var;
                                    } else {
                                        androidComposeViewAccessibilityDelegateCompat = androidComposeViewAccessibilityDelegateCompat2;
                                        i7 = 2;
                                    }
                                    z2 = true;
                                    accessibilityNodeInfo3.setVisibleToUser(phu0.R(tai0Var2) ^ z2);
                                    if (tai0Var2.n()) {
                                        tai0VarL2 = tai0Var2.l();
                                        tai0VarL2.getClass();
                                    } else {
                                        tai0VarL2 = tai0Var2;
                                    }
                                    if (tai0VarL2.m().j()) {
                                        accessibilityNodeInfo3.setVisibleToUser(false);
                                    }
                                    dk00Var = (dk00) q0x.L(nai0Var3, xai0.k);
                                    if (dk00Var != null) {
                                        z6 = dk00Var.f6211a;
                                        if (z6) {
                                            i7 = 1;
                                        } else {
                                            i7 = 1;
                                        }
                                        accessibilityNodeInfoObtain.setLiveRegion(i7);
                                    }
                                    accessibilityNodeInfo3.setClickable(false);
                                    m6Var = (m6) q0x.L(nai0Var3, mai0.b);
                                    if (m6Var != null) {
                                        boolean zD7 = Intrinsics.d(q0x.L(nai0Var3, xai0.K), bool2);
                                        if (ucg0Var3 == null) {
                                        }
                                        if (z4) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                        }
                                        accessibilityNodeInfo3.setClickable(z5);
                                        if (p8a.P(tai0Var2)) {
                                            k7Var.b(new d7(16, m6Var.f21241a));
                                        }
                                    }
                                    accessibilityNodeInfo3.setLongClickable(false);
                                    m6Var2 = (m6) q0x.L(nai0Var3, mai0.c);
                                    if (m6Var2 != null) {
                                        accessibilityNodeInfo3.setLongClickable(true);
                                        if (p8a.P(tai0Var2)) {
                                            k7Var.b(new d7(32, m6Var2.f21241a));
                                        }
                                    }
                                    m6Var3 = (m6) q0x.L(nai0Var3, mai0.q);
                                    if (m6Var3 != null) {
                                        k7Var.b(new d7(16384, m6Var3.f21241a));
                                    }
                                    if (p8a.P(tai0Var2)) {
                                        m6Var9 = (m6) q0x.L(nai0Var3, mai0.k);
                                        if (m6Var9 != null) {
                                            k7Var.b(new d7(2097152, m6Var9.f21241a));
                                        }
                                        m6Var10 = (m6) q0x.L(nai0Var3, mai0.p);
                                        if (m6Var10 != null) {
                                            k7Var.b(new d7(android.R.id.accessibilityActionImeEnter, m6Var10.f21241a));
                                        }
                                        m6Var11 = (m6) q0x.L(nai0Var3, mai0.r);
                                        if (m6Var11 != null) {
                                            k7Var.b(new d7(65536, m6Var11.f21241a));
                                        }
                                        m6Var12 = (m6) q0x.L(nai0Var3, mai0.s);
                                        if (m6Var12 != null) {
                                            primaryClipDescription = ((c5k) androidComposeView2.getClipboardManager()).f().getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                k7Var.b(new d7(32768, m6Var12.f21241a));
                                            }
                                        }
                                    }
                                    strT2 = AndroidComposeViewAccessibilityDelegateCompat.t(tai0Var2);
                                    if (strT2 != null) {
                                        accessibilityNodeInfoObtain.setTextSelection(androidComposeViewAccessibilityDelegateCompat.r(tai0Var2), androidComposeViewAccessibilityDelegateCompat.q(tai0Var2));
                                        m6Var8 = (m6) q0x.L(nai0Var3, mai0.j);
                                        if (m6Var8 != null) {
                                            str4 = m6Var8.f21241a;
                                        } else {
                                            str4 = null;
                                        }
                                        k7Var.b(new d7(131072, str4));
                                        k7Var.a(256);
                                        k7Var.a(512);
                                        accessibilityNodeInfo3.setMovementGranularities(11);
                                        list3 = (List) q0x.L(nai0Var3, xai0.f40557a);
                                        if (list3 != null) {
                                            e7zVarV = e7zVar2.v();
                                            while (true) {
                                                if (e7zVarV == null) {
                                                    e7zVarV = null;
                                                } else {
                                                    nai0VarX2 = e7zVarV.x();
                                                    if (nai0VarX2 == null) {
                                                    }
                                                    e7zVarV = e7zVarV.v();
                                                }
                                            }
                                            if (e7zVarV == null) {
                                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                            } else {
                                                nai0VarX = e7zVarV.x();
                                                if (nai0VarX != null) {
                                                    objG16 = nai0VarX.f23193a.g(xai0.l);
                                                    if (objG16 == null) {
                                                        objG16 = null;
                                                    }
                                                    zD = Intrinsics.d(objG16, Boolean.TRUE);
                                                } else {
                                                    zD = false;
                                                }
                                                if (zD) {
                                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                                }
                                            }
                                        } else {
                                            e7zVarV = e7zVar2.v();
                                            while (true) {
                                                if (e7zVarV == null) {
                                                    e7zVarV = null;
                                                } else {
                                                    nai0VarX2 = e7zVarV.x();
                                                    if (nai0VarX2 == null) {
                                                    }
                                                    e7zVarV = e7zVarV.v();
                                                }
                                            }
                                            if (e7zVarV == null) {
                                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                            } else {
                                                nai0VarX = e7zVarV.x();
                                                if (nai0VarX != null) {
                                                    objG16 = nai0VarX.f23193a.g(xai0.l);
                                                    if (objG16 == null) {
                                                        objG16 = null;
                                                    }
                                                    zD = Intrinsics.d(objG16, Boolean.TRUE);
                                                } else {
                                                    zD = false;
                                                }
                                                if (zD) {
                                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                    }
                                    i8 = Build.VERSION.SDK_INT;
                                    if (i8 >= 26) {
                                        arrayList3 = new ArrayList();
                                        arrayList3.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = k7Var.g();
                                        if (charSequenceG != null) {
                                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (hz40Var3.c(xai0.A)) {
                                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (hz40Var3.c(xai0.S)) {
                                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        i9 = Build.VERSION.SDK_INT;
                                        if (i9 >= 26) {
                                            accessibilityNodeInfoObtain.setAvailableExtraData(arrayList3);
                                        }
                                        i8 = i9;
                                    } else {
                                        i9 = i8;
                                    }
                                    g3c0Var = (g3c0) q0x.L(nai0Var3, xai0.c);
                                    if (g3c0Var != null) {
                                        f = g3c0Var.f10603a;
                                        cvcVar = g3c0Var.b;
                                        zai0Var4 = mai0.i;
                                        if (hz40Var3.c(zai0Var4)) {
                                            k7Var.j("android.widget.SeekBar");
                                        } else {
                                            k7Var.j("android.widget.ProgressBar");
                                        }
                                        if (g3c0Var != g3c0.c) {
                                            accessibilityNodeInfoObtain.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, cvcVar.f5023a, cvcVar.b, f));
                                        }
                                        if (hz40Var3.c(zai0Var4)) {
                                            f2 = cvcVar.b;
                                            f3 = cvcVar.f5023a;
                                            if (f2 < f3) {
                                                f2 = f3;
                                            }
                                            if (f < f2) {
                                                k7Var.b(d7.h);
                                            }
                                            f4 = cvcVar.b;
                                            if (f3 > f4) {
                                                f3 = f4;
                                            }
                                            if (f > f3) {
                                                k7Var.b(d7.i);
                                            }
                                        }
                                    } else {
                                        resources3 = resources3;
                                    }
                                    if (p8a.P(tai0Var2)) {
                                        k7Var.b(new d7(android.R.id.accessibilityActionSetProgress, m6Var7.f21241a));
                                    }
                                    objG10 = tai0Var2.k().f23193a.g(xai0.f);
                                    if (objG10 == null) {
                                        objG10 = null;
                                    }
                                    m3dVar = (m3d) objG10;
                                    if (m3dVar != null) {
                                        k7Var.k(i7.b(m3dVar.f21109a, m3dVar.b, 0));
                                    } else {
                                        arrayList = new ArrayList();
                                        objG11 = tai0Var2.k().f23193a.g(xai0.e);
                                        if (objG11 == null) {
                                            objG11 = null;
                                        }
                                        if (objG11 != null) {
                                            listI2 = tai0Var2.i((4 & 1) != 0 ? !tai0Var2.b : false, (4 & 2) == 0);
                                            size4 = listI2.size();
                                            while (i10 < size4) {
                                                tai0Var3 = (tai0) listI2.get(i10);
                                                if (tai0Var3.k().f23193a.c(xai0.K)) {
                                                    arrayList.add(tai0Var3);
                                                }
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            zM = v3c.M(arrayList);
                                            if (zM) {
                                                size2 = 1;
                                            } else {
                                                size2 = arrayList.size();
                                            }
                                            if (zM) {
                                                size3 = arrayList.size();
                                            } else {
                                                size3 = 1;
                                            }
                                            k7Var.k(i7.b(size2, size3, 0));
                                        }
                                    }
                                    v3c.b0(k7Var, tai0Var2);
                                    t9h0Var = (t9h0) q0x.L(nai0Var3, xai0.v);
                                    m6 m6Var16 = (m6) q0x.L(nai0Var3, mai0.d);
                                    if (t9h0Var != null) {
                                        objG14 = tai0Var2.k().f23193a.g(xai0.f);
                                        if (objG14 == null) {
                                            objG14 = null;
                                        }
                                        if (objG14 == null) {
                                            objG15 = tai0Var2.k().f23193a.g(xai0.e);
                                            if (objG15 == null) {
                                                objG15 = null;
                                            }
                                            if (objG15 == null) {
                                                k7Var.j("android.widget.HorizontalScrollView");
                                            }
                                        }
                                        if (((Number) t9h0Var.b.invoke()).floatValue() > 0.0f) {
                                            k7Var.n(true);
                                        }
                                        if (p8a.P(tai0Var2)) {
                                            if (AndroidComposeViewAccessibilityDelegateCompat.z(t9h0Var)) {
                                                k7Var.b(d7.h);
                                                e7zVar = e7zVar2;
                                                if (e7zVar.A == k6z.b) {
                                                    d7Var2 = d7.n;
                                                } else {
                                                    d7Var2 = d7.p;
                                                }
                                                k7Var.b(d7Var2);
                                            } else {
                                                e7zVar = e7zVar2;
                                            }
                                            if (AndroidComposeViewAccessibilityDelegateCompat.y(t9h0Var)) {
                                                k7Var.b(d7.i);
                                                if (e7zVar.A == k6z.b) {
                                                    d7Var = d7.p;
                                                } else {
                                                    d7Var = d7.n;
                                                }
                                                k7Var.b(d7Var);
                                            }
                                        }
                                    }
                                    t9h0Var2 = (t9h0) q0x.L(nai0Var3, xai0.w);
                                    if (t9h0Var2 != null) {
                                        objG12 = tai0Var2.k().f23193a.g(xai0.f);
                                        if (objG12 == null) {
                                            objG12 = null;
                                        }
                                        if (objG12 == null) {
                                            objG13 = tai0Var2.k().f23193a.g(xai0.e);
                                            if (objG13 == null) {
                                                objG13 = null;
                                            }
                                            if (objG13 == null) {
                                                k7Var.j("android.widget.ScrollView");
                                            }
                                        }
                                        if (((Number) t9h0Var2.b.invoke()).floatValue() > 0.0f) {
                                            k7Var.n(true);
                                        }
                                        if (p8a.P(tai0Var2)) {
                                            if (AndroidComposeViewAccessibilityDelegateCompat.z(t9h0Var2)) {
                                                k7Var.b(d7.h);
                                                k7Var.b(d7.o);
                                            }
                                            if (AndroidComposeViewAccessibilityDelegateCompat.y(t9h0Var2)) {
                                                k7Var.b(d7.i);
                                                k7Var.b(d7.m);
                                            }
                                        }
                                    }
                                    if (i8 >= 29) {
                                        ny9.N(k7Var, tai0Var2);
                                    }
                                    charSequence = (CharSequence) q0x.L(nai0Var3, xai0.d);
                                    if (i9 >= 28) {
                                        accessibilityNodeInfo3.setPaneTitle(charSequence);
                                    } else {
                                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                    }
                                    if (p8a.P(tai0Var2)) {
                                        m6Var4 = (m6) q0x.L(nai0Var3, mai0.t);
                                        if (m6Var4 != null) {
                                            k7Var.b(new d7(262144, m6Var4.f21241a));
                                        }
                                        m6Var5 = (m6) q0x.L(nai0Var3, mai0.u);
                                        if (m6Var5 != null) {
                                            k7Var.b(new d7(524288, m6Var5.f21241a));
                                        }
                                        m6Var6 = (m6) q0x.L(nai0Var3, mai0.v);
                                        if (m6Var6 != null) {
                                            k7Var.b(new d7(1048576, m6Var6.f21241a));
                                        }
                                        zai0Var3 = mai0.x;
                                        if (hz40Var3.c(zai0Var3)) {
                                            list2 = (List) nai0Var3.c(zai0Var3);
                                            size5 = list2.size();
                                            mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.o1;
                                            i11 = mutableIntList.b;
                                            if (size5 < i11) {
                                                jf4.n(ua80.e(i11, "Can't have more than ", " custom actions for one widget"));
                                                return null;
                                            }
                                            gnk0 gnk0Var7 = new gnk0(0);
                                            ry40 ry40VarA4 = v960.a();
                                            gnk0Var3 = gnk0Var2;
                                            if (jd8.X(gnk0Var3.c, i6, gnk0Var3.f11593a) >= 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                ry40Var = (ry40) j2e.L(gnk0Var3, i6);
                                                mutableIntList2 = new MutableIntList();
                                                iArr = mutableIntList.f45342a;
                                                i12 = mutableIntList.b;
                                                while (i13 < i12) {
                                                    mutableIntList2.a(iArr[i13]);
                                                }
                                                arrayList2 = new ArrayList();
                                                if (list2.size() <= 0) {
                                                    rw2.w(list2.get(0));
                                                    ry40Var.getClass();
                                                    throw null;
                                                }
                                                if (arrayList2.size() <= 0) {
                                                    rw2.w(arrayList2.get(0));
                                                    mutableIntList2.c(0);
                                                    throw null;
                                                }
                                            } else if (list2.size() > 0) {
                                                rw2.w(list2.get(0));
                                                mutableIntList.c(0);
                                                throw null;
                                            }
                                            androidComposeViewAccessibilityDelegateCompat.r.c(i6, gnk0Var7);
                                            gnk0Var3.c(i6, ry40VarA4);
                                        }
                                    }
                                    zY = p8a.Y(tai0Var2, resources3);
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        accessibilityNodeInfo3.setScreenReaderFocusable(zY);
                                    } else {
                                        k7Var.h(1, zY);
                                    }
                                    iD = androidComposeViewAccessibilityDelegateCompat.B.d(i6);
                                    if (iD != -1) {
                                        k33VarK2 = x1x.K(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                        if (k33VarK2 != null) {
                                            accessibilityNodeInfo3.setTraversalBefore(k33VarK2);
                                            androidComposeView = androidComposeView2;
                                        } else {
                                            androidComposeView = androidComposeView2;
                                            accessibilityNodeInfo3.setTraversalBefore(androidComposeView, iD);
                                        }
                                        bundle = null;
                                        androidComposeViewAccessibilityDelegateCompat.j(i6, k7Var, androidComposeViewAccessibilityDelegateCompat.Z, null);
                                    } else {
                                        androidComposeView = androidComposeView2;
                                        bundle = null;
                                    }
                                    iD2 = androidComposeViewAccessibilityDelegateCompat.Y.d(i6);
                                    if (iD2 != -1) {
                                        accessibilityNodeInfo3.setTraversalAfter(k33VarK);
                                        androidComposeViewAccessibilityDelegateCompat.j(i6, k7Var, androidComposeViewAccessibilityDelegateCompat.f1, bundle);
                                    }
                                    str3 = (String) q0x.L(nai0Var3, epv0.m);
                                    if (str3 != null) {
                                        k7Var.j(str3);
                                    }
                                    k7Var2 = k7Var;
                                }
                            }
                        } else {
                            androidComposeViewAccessibilityDelegateCompat = androidComposeViewAccessibilityDelegateCompat2;
                            i6 = i;
                            k7Var2 = null;
                        }
                    }
                }
                if (!androidComposeViewAccessibilityDelegateCompat.o) {
                    return k7Var2;
                }
                if (i6 == androidComposeViewAccessibilityDelegateCompat.k) {
                    androidComposeViewAccessibilityDelegateCompat.m = k7Var2;
                }
                if (i6 != androidComposeViewAccessibilityDelegateCompat.l) {
                    return k7Var2;
                }
                androidComposeViewAccessibilityDelegateCompat.n = k7Var2;
                return k7Var2;
            default:
                return new k7(AccessibilityNodeInfo.obtain(((qac) p6Var).n(i).f17795a));
        }
    }

    @Override // a.ok50
    public final k7 h(int i) {
        byte b = this.d;
        p6 p6Var = this.e;
        switch (b) {
            case 0:
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) p6Var;
                if (i != 1) {
                    if (i == 2) {
                        return e(androidComposeViewAccessibilityDelegateCompat.k);
                    }
                    jf4.o(twn.m(i, "Unknown focus type: "));
                    return null;
                }
                int i2 = androidComposeViewAccessibilityDelegateCompat.l;
                if (i2 == Integer.MIN_VALUE) {
                    return null;
                }
                return e(i2);
            default:
                qac qacVar = (qac) p6Var;
                int i3 = i == 2 ? qacVar.k : qacVar.l;
                if (i3 == Integer.MIN_VALUE) {
                    return null;
                }
                return e(i3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:129:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:189:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:305:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:306:0x04db  */
    /* JADX WARN: Code duplicated, block: B:309:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:310:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:313:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:314:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:317:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:318:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:321:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:322:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:325:0x0500  */
    /* JADX WARN: Code duplicated, block: B:326:0x0502  */
    /* JADX WARN: Code duplicated, block: B:333:0x050e  */
    /* JADX WARN: Code duplicated, block: B:340:0x051a  */
    /* JADX WARN: Code duplicated, block: B:343:0x051f  */
    /* JADX WARN: Code duplicated, block: B:345:0x0527  */
    /* JADX WARN: Code duplicated, block: B:348:0x0532  */
    /* JADX WARN: Code duplicated, block: B:351:0x0537  */
    /* JADX WARN: Code duplicated, block: B:353:0x053b  */
    /* JADX WARN: Code duplicated, block: B:355:0x0543  */
    /* JADX WARN: Code duplicated, block: B:356:0x0545  */
    /* JADX WARN: Code duplicated, block: B:360:0x054b  */
    /* JADX WARN: Code duplicated, block: B:363:0x0552  */
    /* JADX WARN: Code duplicated, block: B:366:0x0559  */
    /* JADX WARN: Code duplicated, block: B:367:0x056c  */
    /* JADX WARN: Code duplicated, block: B:369:0x0587  */
    /* JADX WARN: Code duplicated, block: B:372:0x058c  */
    /* JADX WARN: Code duplicated, block: B:377:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:380:0x05af  */
    /* JADX WARN: Code duplicated, block: B:384:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:386:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:389:0x05c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:430:0x064e  */
    /* JADX WARN: Code duplicated, block: B:433:0x065a  */
    /* JADX WARN: Code duplicated, block: B:436:0x065f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:438:0x0663  */
    /* JADX WARN: Code duplicated, block: B:439:0x0668  */
    /* JADX WARN: Code duplicated, block: B:441:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:442:0x0673  */
    /* JADX WARN: Code duplicated, block: B:445:0x0678  */
    /* JADX WARN: Code duplicated, block: B:448:0x067f  */
    /* JADX WARN: Code duplicated, block: B:450:0x0687  */
    /* JADX WARN: Code duplicated, block: B:456:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:458:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:460:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:461:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:463:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:465:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:466:0x06be  */
    /* JADX WARN: Code duplicated, block: B:469:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:532:0x07b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:533:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:535:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:536:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:539:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:540:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:546:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:551:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:563:0x0807  */
    /* JADX WARN: Code duplicated, block: B:568:0x081a  */
    /* JADX WARN: Code duplicated, block: B:575:0x082c  */
    /* JADX WARN: Code duplicated, block: B:577:0x0830  */
    /* JADX WARN: Code duplicated, block: B:579:0x083a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:581:0x0841  */
    /* JADX WARN: Code duplicated, block: B:583:0x0846  */
    /* JADX WARN: Code duplicated, block: B:595:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:597:0x08ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:598:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:599:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:601:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:602:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:605:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:607:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:619:0x08f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:620:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:621:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:624:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:625:0x0902  */
    /* JADX WARN: Code duplicated, block: B:628:0x091d  */
    /* JADX WARN: Code duplicated, block: B:630:0x0924  */
    /* JADX WARN: Code duplicated, block: B:632:0x0937  */
    /* JADX WARN: Code duplicated, block: B:641:0x0952  */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0245, code lost:
    
        r1 = null;
     */
    @Override // a.ok50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(int r28, int r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 2486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rx2.n(int, int, android.os.Bundle):boolean");
    }
}
