package a;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.graphics.Point;
import android.javax.sip.message.Response;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.appsflyer.share.attribution.RequestError;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class xm30 extends mm30 {
    public static final int[] f3 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, Response.TEMPORARILY_UNAVAILABLE};
    public static boolean g3;
    public static boolean h3;
    public boolean A2;
    public pfu0 B2;
    public boolean C2;
    public int D2;
    public List E2;
    public Surface F2;
    public PlaceholderSurface G2;
    public e7k0 H2;
    public boolean I2;
    public int J2;
    public int K2;
    public long L2;
    public int M2;
    public int N2;
    public int O2;
    public uch0 P2;
    public long Q2;
    public boolean R2;
    public long S2;
    public int T2;
    public long U2;
    public qfu0 V2;
    public qfu0 W2;
    public int X2;
    public boolean Y2;
    public int Z2;
    public wm30 a3;
    public seu0 b3;
    public long c3;
    public boolean d3;
    public int e3;
    public final Context k2;
    public final boolean l2;
    public final fck0 m2;
    public final byte n2;
    public final boolean o2;
    public final ueu0 p2;
    public final br8 q2;
    public final fiq r2;
    public final yzn0 s2;
    public final long t2;
    public final veu0 u2;
    public final PriorityQueue v2;
    public j6 w2;
    public boolean x2;
    public boolean y2;
    public boolean z2;

    /* JADX WARN: Illegal instructions before constructor call */
    public xm30(vm30 vm30Var) {
        Context context = vm30Var.f37658a;
        super(context.getApplicationContext(), 2, vm30Var.c);
        Context applicationContext = context.getApplicationContext();
        this.k2 = applicationContext;
        this.n2 = vm30Var.g;
        this.B2 = null;
        this.m2 = new fck0(vm30Var.e, vm30Var.f);
        this.l2 = this.B2 == null;
        this.p2 = new ueu0(applicationContext, this, vm30Var.d);
        this.q2 = new br8();
        this.r2 = new fiq(new viq(this, (byte) 21));
        HashSet hashSet = hn30.f13332a;
        this.o2 = "NVIDIA".equals(Build.MANUFACTURER);
        this.H2 = e7k0.c;
        this.J2 = 1;
        this.K2 = 0;
        this.V2 = qfu0.d;
        this.Z2 = 0;
        this.W2 = null;
        this.X2 = -1000;
        this.c3 = -9223372036854775807L;
        this.s2 = new yzn0((byte) 10);
        this.v2 = new PriorityQueue();
        this.t2 = -15000L;
        this.u2 = new veu0();
        this.P2 = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x013f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:122:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x0177  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:130:0x0184  */
    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x019e  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0200  */
    /* JADX WARN: Code duplicated, block: B:169:0x020a  */
    /* JADX WARN: Code duplicated, block: B:170:0x020e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0218  */
    /* JADX WARN: Code duplicated, block: B:174:0x021c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0226  */
    /* JADX WARN: Code duplicated, block: B:178:0x022a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0234  */
    /* JADX WARN: Code duplicated, block: B:182:0x0238  */
    /* JADX WARN: Code duplicated, block: B:185:0x0242  */
    /* JADX WARN: Code duplicated, block: B:186:0x0246  */
    /* JADX WARN: Code duplicated, block: B:189:0x0250  */
    /* JADX WARN: Code duplicated, block: B:190:0x0254  */
    /* JADX WARN: Code duplicated, block: B:193:0x025e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0262  */
    /* JADX WARN: Code duplicated, block: B:197:0x026c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0270  */
    /* JADX WARN: Code duplicated, block: B:201:0x027a  */
    /* JADX WARN: Code duplicated, block: B:202:0x027e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0288  */
    /* JADX WARN: Code duplicated, block: B:206:0x028c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0296  */
    /* JADX WARN: Code duplicated, block: B:210:0x029a  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:221:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:225:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:229:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:230:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:233:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:241:0x0306  */
    /* JADX WARN: Code duplicated, block: B:242:0x030a  */
    /* JADX WARN: Code duplicated, block: B:245:0x0314  */
    /* JADX WARN: Code duplicated, block: B:246:0x0318  */
    /* JADX WARN: Code duplicated, block: B:249:0x0322  */
    /* JADX WARN: Code duplicated, block: B:250:0x0326  */
    /* JADX WARN: Code duplicated, block: B:253:0x0330  */
    /* JADX WARN: Code duplicated, block: B:254:0x0334  */
    /* JADX WARN: Code duplicated, block: B:257:0x033e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0342  */
    /* JADX WARN: Code duplicated, block: B:261:0x034c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0350  */
    /* JADX WARN: Code duplicated, block: B:265:0x035a  */
    /* JADX WARN: Code duplicated, block: B:266:0x035e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0368  */
    /* JADX WARN: Code duplicated, block: B:270:0x036c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0376  */
    /* JADX WARN: Code duplicated, block: B:274:0x037a  */
    /* JADX WARN: Code duplicated, block: B:277:0x0384  */
    /* JADX WARN: Code duplicated, block: B:278:0x0388  */
    /* JADX WARN: Code duplicated, block: B:281:0x0392  */
    /* JADX WARN: Code duplicated, block: B:282:0x0396  */
    /* JADX WARN: Code duplicated, block: B:285:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:293:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:294:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:297:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:298:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:302:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:306:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:313:0x0402  */
    /* JADX WARN: Code duplicated, block: B:314:0x0406  */
    /* JADX WARN: Code duplicated, block: B:317:0x0410  */
    /* JADX WARN: Code duplicated, block: B:318:0x0414  */
    /* JADX WARN: Code duplicated, block: B:321:0x041e  */
    /* JADX WARN: Code duplicated, block: B:322:0x0422  */
    /* JADX WARN: Code duplicated, block: B:325:0x042c  */
    /* JADX WARN: Code duplicated, block: B:326:0x0430  */
    /* JADX WARN: Code duplicated, block: B:329:0x043a  */
    /* JADX WARN: Code duplicated, block: B:330:0x043e  */
    /* JADX WARN: Code duplicated, block: B:333:0x0448  */
    /* JADX WARN: Code duplicated, block: B:334:0x044c  */
    /* JADX WARN: Code duplicated, block: B:337:0x0456  */
    /* JADX WARN: Code duplicated, block: B:338:0x045a  */
    /* JADX WARN: Code duplicated, block: B:341:0x0464  */
    /* JADX WARN: Code duplicated, block: B:342:0x0468  */
    /* JADX WARN: Code duplicated, block: B:345:0x0472  */
    /* JADX WARN: Code duplicated, block: B:346:0x0476  */
    /* JADX WARN: Code duplicated, block: B:349:0x0480  */
    /* JADX WARN: Code duplicated, block: B:350:0x0484  */
    /* JADX WARN: Code duplicated, block: B:353:0x048e  */
    /* JADX WARN: Code duplicated, block: B:354:0x0492  */
    /* JADX WARN: Code duplicated, block: B:357:0x049c  */
    /* JADX WARN: Code duplicated, block: B:358:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:361:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:366:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:370:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:381:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:386:0x0502  */
    /* JADX WARN: Code duplicated, block: B:389:0x050c  */
    /* JADX WARN: Code duplicated, block: B:390:0x0510  */
    /* JADX WARN: Code duplicated, block: B:393:0x051a  */
    /* JADX WARN: Code duplicated, block: B:394:0x051e  */
    /* JADX WARN: Code duplicated, block: B:397:0x0528  */
    /* JADX WARN: Code duplicated, block: B:398:0x052c  */
    /* JADX WARN: Code duplicated, block: B:401:0x0536  */
    /* JADX WARN: Code duplicated, block: B:402:0x053a  */
    /* JADX WARN: Code duplicated, block: B:405:0x0544  */
    /* JADX WARN: Code duplicated, block: B:406:0x0548  */
    /* JADX WARN: Code duplicated, block: B:409:0x0552  */
    /* JADX WARN: Code duplicated, block: B:410:0x0556  */
    /* JADX WARN: Code duplicated, block: B:413:0x0560  */
    /* JADX WARN: Code duplicated, block: B:414:0x0564  */
    /* JADX WARN: Code duplicated, block: B:417:0x056e  */
    /* JADX WARN: Code duplicated, block: B:418:0x0572  */
    /* JADX WARN: Code duplicated, block: B:421:0x057c  */
    /* JADX WARN: Code duplicated, block: B:422:0x0580  */
    /* JADX WARN: Code duplicated, block: B:425:0x058a  */
    /* JADX WARN: Code duplicated, block: B:426:0x058e  */
    /* JADX WARN: Code duplicated, block: B:429:0x0598  */
    /* JADX WARN: Code duplicated, block: B:430:0x059c  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:434:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:445:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:449:0x05de  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:454:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:457:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:461:0x0608  */
    /* JADX WARN: Code duplicated, block: B:462:0x060c  */
    /* JADX WARN: Code duplicated, block: B:465:0x0616  */
    /* JADX WARN: Code duplicated, block: B:466:0x061a  */
    /* JADX WARN: Code duplicated, block: B:469:0x0624  */
    /* JADX WARN: Code duplicated, block: B:470:0x0628  */
    /* JADX WARN: Code duplicated, block: B:473:0x0632  */
    /* JADX WARN: Code duplicated, block: B:474:0x0636  */
    /* JADX WARN: Code duplicated, block: B:477:0x0640  */
    /* JADX WARN: Code duplicated, block: B:478:0x0644  */
    /* JADX WARN: Code duplicated, block: B:481:0x064e  */
    /* JADX WARN: Code duplicated, block: B:482:0x0652  */
    /* JADX WARN: Code duplicated, block: B:485:0x065c  */
    /* JADX WARN: Code duplicated, block: B:486:0x0660  */
    /* JADX WARN: Code duplicated, block: B:489:0x066a  */
    /* JADX WARN: Code duplicated, block: B:490:0x066e  */
    /* JADX WARN: Code duplicated, block: B:493:0x0678  */
    /* JADX WARN: Code duplicated, block: B:494:0x067c  */
    /* JADX WARN: Code duplicated, block: B:497:0x0686  */
    /* JADX WARN: Code duplicated, block: B:498:0x068a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0694  */
    /* JADX WARN: Code duplicated, block: B:502:0x0698  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:509:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:513:0x06be  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:517:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:518:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:521:0x06da  */
    /* JADX WARN: Code duplicated, block: B:522:0x06de  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:530:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:533:0x0704  */
    /* JADX WARN: Code duplicated, block: B:534:0x0708  */
    /* JADX WARN: Code duplicated, block: B:537:0x0712  */
    /* JADX WARN: Code duplicated, block: B:538:0x0716  */
    /* JADX WARN: Code duplicated, block: B:541:0x0720  */
    /* JADX WARN: Code duplicated, block: B:542:0x0724  */
    /* JADX WARN: Code duplicated, block: B:545:0x072e  */
    /* JADX WARN: Code duplicated, block: B:546:0x0732  */
    /* JADX WARN: Code duplicated, block: B:549:0x073c  */
    /* JADX WARN: Code duplicated, block: B:552:0x0746  */
    /* JADX WARN: Code duplicated, block: B:553:0x0749  */
    /* JADX WARN: Code duplicated, block: B:556:0x0753  */
    /* JADX WARN: Code duplicated, block: B:557:0x0756  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f A[Catch: all -> 0x08c0, TRY_LEAVE, TryCatch #0 {all -> 0x08c0, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0023, B:664:0x08bb, B:52:0x0094, B:55:0x009f, B:98:0x011a, B:667:0x08c2), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x0760  */
    /* JADX WARN: Code duplicated, block: B:561:0x0764  */
    /* JADX WARN: Code duplicated, block: B:564:0x076e  */
    /* JADX WARN: Code duplicated, block: B:565:0x0772  */
    /* JADX WARN: Code duplicated, block: B:568:0x077c  */
    /* JADX WARN: Code duplicated, block: B:569:0x0780  */
    /* JADX WARN: Code duplicated, block: B:572:0x078a  */
    /* JADX WARN: Code duplicated, block: B:573:0x078e  */
    /* JADX WARN: Code duplicated, block: B:576:0x0798  */
    /* JADX WARN: Code duplicated, block: B:577:0x079c  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:581:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:592:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:596:0x07de  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:601:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:604:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:608:0x0808  */
    /* JADX WARN: Code duplicated, block: B:609:0x080c  */
    /* JADX WARN: Code duplicated, block: B:612:0x0816  */
    /* JADX WARN: Code duplicated, block: B:613:0x081a  */
    /* JADX WARN: Code duplicated, block: B:616:0x0824  */
    /* JADX WARN: Code duplicated, block: B:617:0x0828  */
    /* JADX WARN: Code duplicated, block: B:620:0x0832  */
    /* JADX WARN: Code duplicated, block: B:621:0x0836  */
    /* JADX WARN: Code duplicated, block: B:624:0x0840  */
    /* JADX WARN: Code duplicated, block: B:625:0x0844  */
    /* JADX WARN: Code duplicated, block: B:628:0x084e  */
    /* JADX WARN: Code duplicated, block: B:629:0x0851  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:632:0x085b  */
    /* JADX WARN: Code duplicated, block: B:633:0x085d  */
    /* JADX WARN: Code duplicated, block: B:636:0x0867  */
    /* JADX WARN: Code duplicated, block: B:637:0x0869  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:640:0x0873  */
    /* JADX WARN: Code duplicated, block: B:641:0x0875  */
    /* JADX WARN: Code duplicated, block: B:644:0x087f  */
    /* JADX WARN: Code duplicated, block: B:645:0x0881  */
    /* JADX WARN: Code duplicated, block: B:648:0x088b  */
    /* JADX WARN: Code duplicated, block: B:649:0x088d  */
    /* JADX WARN: Code duplicated, block: B:652:0x0897  */
    /* JADX WARN: Code duplicated, block: B:653:0x0899  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:660:0x08af  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a A[Catch: all -> 0x08c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08c0, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0023, B:664:0x08bb, B:52:0x0094, B:55:0x009f, B:98:0x011a, B:667:0x08c2), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean G0(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (xm30.class) {
            try {
                if (!g3) {
                    HashSet hashSet = hn30.f13332a;
                    int i = Build.VERSION.SDK_INT;
                    byte b3 = 28;
                    if (i <= 28) {
                        String str4 = Build.DEVICE;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b2 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b2 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b2 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b2 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b2 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b2 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b2 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b2 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                    str2 = Build.MODEL;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        default:
                                            if (i <= 26) {
                                                str3 = Build.DEVICE;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b3 = 0;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b3 = 1;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b3 = 2;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b3 = 3;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b3 = 4;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b3 = 5;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b3 = 6;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b3 = 7;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b3 = 8;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b3 = 9;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b3 = 10;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b3 = 11;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b3 = 12;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b3 = 13;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b3 = 14;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b3 = 15;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b3 = 16;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b3 = 17;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b3 = 18;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b3 = 19;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b3 = 20;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b3 = 21;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b3 = 22;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b3 = 23;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b3 = 24;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b3 = 25;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b3 = 26;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b3 = 27;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b3 = 29;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b3 = 30;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b3 = 31;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b3 = 32;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b3 = 33;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b3 = 34;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b3 = 35;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b3 = 36;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b3 = 37;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b3 = 38;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b3 = 39;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b3 = 40;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b3 = 41;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b3 = 42;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b3 = 43;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case TokenTypes.PRIVACY /* 2126 */:
                                                        if (!str3.equals("C1")) {
                                                            b3 = 44;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b3 = 45;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b3 = 46;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b3 = 47;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b3 = 48;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b3 = 49;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b3 = 50;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b3 = 51;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b3 = 52;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b3 = 53;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b3 = 54;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b3 = 55;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b3 = 56;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b3 = 57;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b3 = 58;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b3 = 59;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b3 = 60;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b3 = 61;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b3 = 62;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b3 = 63;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b3 = 64;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b3 = 65;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b3 = 66;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b3 = 67;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b3 = 68;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b3 = 69;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b3 = 70;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b3 = 71;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b3 = 72;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b3 = 73;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b3 = 74;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b3 = 75;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b3 = 76;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b3 = 77;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b3 = 78;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b3 = 79;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b3 = 80;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b3 = 81;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b3 = 82;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b3 = 83;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b3 = 84;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b3 = 85;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b3 = 86;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b3 = 87;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b3 = 88;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b3 = 89;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b3 = 90;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b3 = 91;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b3 = 92;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b3 = 93;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b3 = 94;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b3 = 95;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b3 = 96;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b3 = 97;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b3 = 98;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b3 = 99;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b3 = 100;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b3 = 101;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b3 = 102;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b3 = 103;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b3 = 104;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b3 = 105;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b3 = 106;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b3 = 107;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b3 = 108;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b3 = 109;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b3 = 110;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b3 = 111;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b3 = 112;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b3 = 113;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b3 = 114;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b3 = 115;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b3 = 116;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b3 = 117;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b3 = 118;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b3 = 119;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b3 = 120;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b3 = 121;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b3 = 122;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b3 = 123;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b3 = 124;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b3 = 125;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b3 = 126;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b3 = 127;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b3 = 128;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b3 = 129;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b3 = 130;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b3 = 131;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b3 = 132;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b3 = 133;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b3 = 134;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b3 = 135;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b3 = 136;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b3 = 137;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b3 = 138;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b3 = 139;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b3 = -1;
                                                        break;
                                                }
                                                switch (b3) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                                    case 32:
                                                    case 33:
                                                    case 34:
                                                    case 35:
                                                    case 36:
                                                    case 37:
                                                    case 38:
                                                    case 39:
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                    case 43:
                                                    case 44:
                                                    case 45:
                                                    case 46:
                                                    case 47:
                                                    case 48:
                                                    case 49:
                                                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case Response.TRYING /* 100 */:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z = true;
                                break;
                        }
                    } else if (i <= 27) {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = 0;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = 1;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = 2;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = 3;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = 4;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = 5;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = 6;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = 7;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = 8;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = 9;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = 10;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = 11;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = 12;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = 13;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = 14;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = 15;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = 16;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = 17;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = 18;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = 19;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = 20;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = 21;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = 22;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = 23;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = 24;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = 25;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = 26;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = 27;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = 29;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = 30;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = 31;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = 32;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = 33;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = 34;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = 35;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = 36;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = 37;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = 38;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = 39;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = 40;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = 41;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = 42;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = 43;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case TokenTypes.PRIVACY /* 2126 */:
                                            if (!str3.equals("C1")) {
                                                b3 = 44;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = 45;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = 46;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = 47;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = 48;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = 49;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = 50;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = 51;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = 52;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = 53;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = 54;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = 55;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = 56;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = 57;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = 58;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = 59;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = 60;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = 61;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = 62;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = 63;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = 64;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = 65;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = 66;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = 67;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = 68;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = 69;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = 70;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = 71;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = 72;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = 73;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = 74;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = 75;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = 76;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = 77;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = 78;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = 79;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = 80;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = 81;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = 82;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = 83;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = 84;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = 85;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = 86;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = 87;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = 88;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = 89;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = 90;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = 91;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = 92;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = 93;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = 94;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = 95;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = 96;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = 97;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = 98;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = 99;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = 100;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = 101;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = 102;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = 103;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = 104;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = 105;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = 106;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = 107;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = 108;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = 109;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = 110;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = 111;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = 112;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = 113;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = 114;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = 115;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = 116;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = 117;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = 118;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = 119;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = 120;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = 121;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = 122;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = 123;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = 124;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = 125;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = 126;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = 127;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = 128;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = 129;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = 130;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = 131;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = 132;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = 133;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = 134;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = 135;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = 136;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = 137;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = 138;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = 139;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case Response.TRYING /* 100 */:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    } else {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 43;
                                            }
                                            break;
                                        case TokenTypes.PRIVACY /* 2126 */:
                                            if (!str3.equals("C1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 139;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case Response.TRYING /* 100 */:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    }
                    h3 = z;
                    g3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public static int H0(jm30 jm30Var, androidx.media3.common.b bVar) {
        int i = bVar.w;
        int i2 = bVar.x;
        if (i != -1 && i2 != -1) {
            String str = bVar.p;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairB = jyc.b(bVar);
                if (pairB == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    HashSet hashSet = hn30.f13332a;
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !jm30Var.f)))) {
                        return ((vtt0.g(i2, 16) * vtt0.g(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List I0(Context context, androidx.media3.common.b bVar, boolean z, boolean z2) {
        List listE;
        String str = bVar.p;
        if (str == null) {
            v3x v3xVar = b4x.b;
            return rcf0.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !x8x.l(context)) {
            String strC = qm30.c(bVar);
            if (strC == null) {
                v3x v3xVar2 = b4x.b;
                listE = rcf0.e;
            } else {
                listE = qm30.e(strC, z, z2);
            }
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        return qm30.g(bVar, z, z2);
    }

    public static int J0(jm30 jm30Var, androidx.media3.common.b bVar) {
        int i = bVar.q;
        List list = bVar.s;
        if (i == -1) {
            return H0(jm30Var, bVar);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return bVar.q + length;
    }

    @Override // a.mm30
    public final boolean A0() {
        jm30 jm30Var = this.t1;
        if (this.B2 != null && jm30Var != null) {
            String str = jm30Var.f16746a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.A0();
    }

    @Override // a.mm30, a.j16
    public final void C(float f, float f2) {
        super.C(f, f2);
        pfu0 pfu0Var = this.B2;
        if (pfu0Var != null) {
            pfu0Var.q(f);
        } else {
            this.p2.g(f);
        }
        veu0 veu0Var = this.u2;
        if (veu0Var != null) {
            veu0Var.c(f);
        }
    }

    @Override // a.mm30
    public final int C0(androidx.media3.common.b bVar) {
        boolean z;
        int i = 0;
        if (!mg40.m(bVar.p)) {
            return j16.f(0, 0, 0, 0);
        }
        boolean z2 = bVar.t != null;
        Context context = this.k2;
        List listI0 = I0(context, bVar, z2, false);
        if (z2 && listI0.isEmpty()) {
            listI0 = I0(context, bVar, false, false);
        }
        if (listI0.isEmpty()) {
            return j16.f(1, 0, 0, 0);
        }
        int i2 = bVar.T;
        if (i2 != 0 && i2 != 2) {
            return j16.f(2, 0, 0, 0);
        }
        jm30 jm30Var = (jm30) listI0.get(0);
        boolean zE = jm30Var.e(context, bVar);
        if (!zE) {
            int i3 = 1;
            while (true) {
                if (i3 >= listI0.size()) {
                    z = true;
                    break;
                }
                jm30 jm30Var2 = (jm30) listI0.get(i3);
                if (jm30Var2.e(context, bVar)) {
                    z = false;
                    zE = true;
                    jm30Var = jm30Var2;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zE ? 4 : 3;
        int i5 = jm30Var.f(bVar) ? 16 : 8;
        int i6 = jm30Var.g ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(bVar.p) && !x8x.l(context)) {
            i7 = 256;
        }
        if (zE) {
            List listI1 = I0(context, bVar, z2, true);
            if (!listI1.isEmpty()) {
                HashMap map = qm30.f28964a;
                ArrayList arrayList = new ArrayList(listI1);
                Collections.sort(arrayList, new gi2(new uq((Object) context, (Object) bVar, (byte) 19), (byte) 6));
                jm30 jm30Var3 = (jm30) arrayList.get(0);
                if (jm30Var3.e(context, bVar) && jm30Var3.f(bVar)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // a.j16
    public final boolean F(long j) {
        if (this.Q1 == -9223372036854775807L || j < this.Q2) {
            return false;
        }
        long j2 = this.a2;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // a.mm30
    public final alj J(jm30 jm30Var, androidx.media3.common.b bVar, androidx.media3.common.b bVar2, boolean z) {
        int i;
        alj aljVarB = jm30Var.b(bVar, bVar2);
        float f = bVar.B;
        float f2 = bVar2.B;
        int i2 = aljVarB.e;
        j6 j6Var = this.w2;
        j6Var.getClass();
        if (bVar2.w > j6Var.f15959a || bVar2.x > j6Var.b) {
            i2 |= 256;
        }
        if (J0(jm30Var, bVar2) > j6Var.c) {
            i2 |= 64;
        }
        if (this.K2 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!jm30Var.f || !z))) {
            float fMax = Math.max(f2, f) / Math.min(f2, f);
            if (Math.abs(fMax - Math.round(fMax)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        return new alj(jm30Var.f16746a, bVar, bVar2, i3 != 0 ? 0 : aljVarB.d, i3);
    }

    @Override // a.mm30
    public final hm30 K(IllegalStateException illegalStateException, jm30 jm30Var) {
        Surface surface = this.F2;
        rm30 rm30Var = new rm30(illegalStateException, jm30Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return rm30Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Surface K0(jm30 jm30Var) {
        boolean z;
        wu90 wu90Var;
        int i;
        RuntimeException runtimeException;
        Error error;
        pfu0 pfu0Var = this.B2;
        if (pfu0Var != null) {
            return pfu0Var.getInputSurface();
        }
        Surface surface = this.F2;
        if (surface != null) {
            return surface;
        }
        PlaceholderSurface placeholderSurface = null;
        if (Build.VERSION.SDK_INT >= 35 && jm30Var.h) {
            return null;
        }
        x0x.K(S0(jm30Var));
        PlaceholderSurface placeholderSurface2 = this.G2;
        if (placeholderSurface2 != null && placeholderSurface2.f45389a != jm30Var.f) {
            if (placeholderSurface2 != null) {
                placeholderSurface2.release();
                this.G2 = null;
            } else {
                placeholderSurface = placeholderSurface2;
            }
            placeholderSurface2 = placeholderSurface;
        }
        if (placeholderSurface2 != null) {
            return placeholderSurface2;
        }
        Context context = this.k2;
        boolean z2 = jm30Var.f;
        boolean z3 = false;
        if (z2) {
            if (!PlaceholderSurface.b(context)) {
                z = false;
            }
            x0x.K(z);
            wu90Var = new wu90("ExoPlayer:PlaceholderSurface");
            if (z2) {
                i = PlaceholderSurface.d;
            } else {
                i = 0;
            }
            wu90Var.start();
            Handler handler = new Handler(wu90Var.getLooper(), wu90Var);
            wu90Var.b = handler;
            wu90Var.f39780a = new sgn(handler);
            synchronized (wu90Var) {
                wu90Var.b.obtainMessage(1, i, 0).sendToTarget();
                while (wu90Var.e == null && wu90Var.d == null && wu90Var.c == null) {
                    try {
                        wu90Var.wait();
                    } catch (InterruptedException unused) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            runtimeException = wu90Var.d;
            if (runtimeException == null) {
                throw runtimeException;
            }
            error = wu90Var.c;
            if (error == null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface3 = wu90Var.e;
            placeholderSurface3.getClass();
            this.G2 = placeholderSurface3;
            return placeholderSurface3;
        }
        int i2 = PlaceholderSurface.d;
        z = true;
        x0x.K(z);
        wu90Var = new wu90("ExoPlayer:PlaceholderSurface");
        if (z2) {
            i = PlaceholderSurface.d;
        } else {
            i = 0;
        }
        wu90Var.start();
        Handler handler2 = new Handler(wu90Var.getLooper(), wu90Var);
        wu90Var.b = handler2;
        wu90Var.f39780a = new sgn(handler2);
        synchronized (wu90Var) {
            wu90Var.b.obtainMessage(1, i, 0).sendToTarget();
            while (wu90Var.e == null) {
                wu90Var.wait();
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            runtimeException = wu90Var.d;
            if (runtimeException == null) {
                throw runtimeException;
            }
            error = wu90Var.c;
            if (error == null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface4 = wu90Var.e;
            placeholderSurface4.getClass();
            this.G2 = placeholderSurface4;
            return placeholderSurface4;
        }
    }

    public final boolean L0(jm30 jm30Var) {
        if (this.B2 != null) {
            return true;
        }
        Surface surface = this.F2;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && jm30Var.h) || S0(jm30Var);
        }
        return true;
    }

    public final boolean M0(wkj wkjVar) {
        if (l() || wkjVar.m(536870912)) {
            return true;
        }
        long j = this.r;
        return j == -9223372036854775807L || j - (wkjVar.i - this.Z1.c) <= 100000;
    }

    public final void N0() {
        if (this.M2 > 0) {
            this.g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.L2;
            int i = this.M2;
            fck0 fck0Var = this.m2;
            Handler handler = (Handler) fck0Var.b;
            if (handler != null) {
                handler.post(new ffu0(fck0Var, i, j));
            }
            this.M2 = 0;
            this.L2 = jElapsedRealtime;
        }
    }

    public final void O0() {
        dm30 dm30Var;
        if (this.Y2 && (dm30Var = this.m1) != null) {
            this.a3 = new wm30(this, dm30Var);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                dm30Var.b(bundle);
            }
        }
    }

    public final void P0(dm30 dm30Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        dm30Var.n(i, j);
        Trace.endSection();
        this.Y1.e++;
        this.N2 = 0;
        if (this.B2 == null) {
            qfu0 qfu0Var = this.V2;
            boolean zEquals = qfu0Var.equals(qfu0.d);
            fck0 fck0Var = this.m2;
            if (!zEquals && !qfu0Var.equals(this.W2)) {
                this.W2 = qfu0Var;
                fck0Var.j(qfu0Var);
            }
            ueu0 ueu0Var = this.p2;
            boolean z = ueu0Var.e != 3;
            ueu0Var.e = 3;
            ueu0Var.k.getClass();
            ueu0Var.g = vtt0.M(SystemClock.elapsedRealtime());
            if (!z || (surface = this.F2) == null) {
                return;
            }
            Handler handler = (Handler) fck0Var.b;
            if (handler != null) {
                handler.post(new tx9(fck0Var, surface, SystemClock.elapsedRealtime(), (byte) 3));
            }
            this.I2 = true;
        }
    }

    public final void Q0(Object obj) throws dlo {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.F2;
        fck0 fck0Var = this.m2;
        if (surface2 == surface) {
            if (surface != null) {
                qfu0 qfu0Var = this.W2;
                if (qfu0Var != null) {
                    fck0Var.j(qfu0Var);
                }
                Surface surface3 = this.F2;
                if (surface3 == null || !this.I2 || (handler = (Handler) fck0Var.b) == null) {
                    return;
                }
                handler.post(new tx9(fck0Var, surface3, SystemClock.elapsedRealtime(), (byte) 3));
                return;
            }
            return;
        }
        this.F2 = surface;
        pfu0 pfu0Var = this.B2;
        ueu0 ueu0Var = this.p2;
        if (pfu0Var == null) {
            ueu0Var.f(surface);
        }
        boolean z = false;
        this.I2 = false;
        byte b = this.h;
        dm30 dm30Var = this.m1;
        if (dm30Var != null) {
            if (this.B2 == null) {
                jm30 jm30Var = this.t1;
                jm30Var.getClass();
                if (!L0(jm30Var) || this.x2) {
                    q0();
                    a0();
                } else {
                    Surface surfaceK0 = K0(jm30Var);
                    if (surfaceK0 != null) {
                        dm30Var.i(surfaceK0);
                    } else {
                        if (Build.VERSION.SDK_INT < 35) {
                            v4i0.e();
                            return;
                        }
                        dm30Var.f();
                    }
                    z = true;
                }
            } else {
                z = true;
            }
        }
        if (surface != null) {
            qfu0 qfu0Var2 = this.W2;
            if (qfu0Var2 != null) {
                fck0Var.j(qfu0Var2);
            }
        } else {
            this.W2 = null;
            pfu0 pfu0Var2 = this.B2;
            if (pfu0Var2 != null) {
                pfu0Var2.r();
            }
        }
        if (b == 2) {
            pfu0 pfu0Var3 = this.B2;
            if (pfu0Var3 != null) {
                pfu0Var3.v(z);
            } else {
                ueu0Var.c(z);
            }
        }
        O0();
    }

    @Override // a.mm30
    public final int R(wkj wkjVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.P2 == null && !this.Y2) || wkjVar.i >= this.l || M0(wkjVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean R0(long j, long j2, boolean z, boolean z2) throws dlo {
        if (this.B2 != null && this.l2) {
            j2 -= -this.c3;
        }
        if (j < -500000 && !z) {
            ixg0 ixg0Var = this.i;
            ixg0Var.getClass();
            int iD = ixg0Var.d(j2 - this.k);
            if (iD != 0) {
                this.Q2 = j2;
                boolean z3 = this.p2.h != -9223372036854775807L;
                PriorityQueue priorityQueue = this.v2;
                Iterator it = priorityQueue.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    if (((Long) it.next()).longValue() < this.l || z3) {
                        i2++;
                    } else {
                        i++;
                    }
                }
                priorityQueue.clear();
                tkj tkjVar = this.Y1;
                if (z2) {
                    int i3 = tkjVar.d + iD;
                    tkjVar.f += this.O2;
                    tkjVar.d = i3 + i + i2;
                } else {
                    tkjVar.j++;
                    U0(iD + i, this.O2);
                    this.Y1.d += i2;
                }
                if (P()) {
                    a0();
                }
                pfu0 pfu0Var = this.B2;
                if (pfu0Var != null) {
                    pfu0Var.s(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // a.mm30
    public final float S(float f, androidx.media3.common.b bVar, androidx.media3.common.b[] bVarArr) {
        jm30 jm30Var;
        float fA = -1.0f;
        for (androidx.media3.common.b bVar2 : bVarArr) {
            float f2 = bVar2.B;
            if (f2 != -1.0f) {
                fA = Math.max(fA, f2);
            }
        }
        if (fA == -1.0f && this.m1 != null) {
            fiq fiqVar = this.r2;
            if (fiqVar.a() != -9223372036854775807L) {
                fA = 1.0E9f / fiqVar.a();
            }
        }
        float f4 = fA == -1.0f ? -1.0f : fA * f;
        if (this.P2 == null || (jm30Var = this.t1) == null) {
            return f4;
        }
        int i = bVar.w;
        int i2 = bVar.x;
        float f5 = -3.4028235E38f;
        if (jm30Var.i) {
            float f6 = jm30Var.l;
            if (f6 != -3.4028235E38f && jm30Var.j == i && jm30Var.k == i2) {
                f5 = f6;
            } else {
                f5 = 1024.0f;
                if (!jm30Var.g(1024.0d, i, i2)) {
                    float f7 = 0.0f;
                    while (true) {
                        float f8 = f5 - f7;
                        if (Math.abs(f8) <= 5.0f) {
                            break;
                        }
                        float f9 = (f8 / 2.0f) + f7;
                        if (jm30Var.g(f9, i, i2)) {
                            f7 = f9;
                        } else {
                            f5 = f9;
                        }
                    }
                    f5 = f7;
                }
                jm30Var.l = f5;
                jm30Var.j = i;
                jm30Var.k = i2;
            }
        }
        return f4 != -1.0f ? Math.max(f4, f5) : f5;
    }

    public final boolean S0(jm30 jm30Var) {
        if (this.Y2 || G0(jm30Var.f16746a)) {
            return false;
        }
        return !jm30Var.f || PlaceholderSurface.b(this.k2);
    }

    @Override // a.mm30
    public final ArrayList T(androidx.media3.common.b bVar, boolean z) {
        boolean z2 = this.Y2;
        Context context = this.k2;
        List listI0 = I0(context, bVar, z, z2);
        HashMap map = qm30.f28964a;
        ArrayList arrayList = new ArrayList(listI0);
        Collections.sort(arrayList, new gi2(new uq((Object) context, (Object) bVar, (byte) 19), (byte) 6));
        return arrayList;
    }

    public final void T0(dm30 dm30Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        dm30Var.k(i);
        Trace.endSection();
        this.Y1.f++;
    }

    public final void U0(int i, int i2) {
        tkj tkjVar = this.Y1;
        tkjVar.h += i;
        int i3 = i + i2;
        tkjVar.g += i3;
        this.M2 += i3;
        int i4 = this.N2 + i3;
        this.N2 = i4;
        tkjVar.i = Math.max(i4, tkjVar.i);
        byte b = this.n2;
        if (b <= 0 || this.M2 < b) {
            return;
        }
        N0();
    }

    public final void V0(long j) {
        tkj tkjVar = this.Y1;
        tkjVar.k += j;
        tkjVar.l++;
        this.S2 += j;
        this.T2++;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x013c, please report this as an issue */
    @Override // a.mm30
    public final pzu W(jm30 jm30Var, androidx.media3.common.b bVar, MediaCrypto mediaCrypto, float f) {
        c4d c4dVar;
        int i;
        j6 j6Var;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b;
        boolean z;
        Pair pairB;
        int iH0;
        String str = jm30Var.c;
        androidx.media3.common.b[] bVarArr = this.j;
        bVarArr.getClass();
        int i2 = bVar.w;
        float f2 = bVar.B;
        c4d c4dVar2 = bVar.H;
        int i3 = bVar.x;
        int iJ0 = J0(jm30Var, bVar);
        if (bVarArr.length == 1) {
            if (iJ0 != -1 && (iH0 = H0(jm30Var, bVar)) != -1) {
                iJ0 = Math.min((int) (iJ0 * 1.5f), iH0);
            }
            j6Var = new j6(i2, i3, iJ0);
            c4dVar = c4dVar2;
            i = i3;
        } else {
            int length = bVarArr.length;
            int iMax = i2;
            int iMax2 = i3;
            int i4 = 0;
            boolean z2 = false;
            while (i4 < length) {
                androidx.media3.common.b bVar2 = bVarArr[i4];
                androidx.media3.common.b[] bVarArr2 = bVarArr;
                if (c4dVar2 != null && bVar2.H == null) {
                    awq awqVarA = bVar2.a();
                    awqVarA.G = c4dVar2;
                    bVar2 = new androidx.media3.common.b(awqVarA);
                }
                alj aljVarB = jm30Var.b(bVar, bVar2);
                int i5 = length;
                int i6 = bVar2.x;
                if (aljVarB.d != 0) {
                    int i7 = bVar2.w;
                    b = -1;
                    z2 |= i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iJ0 = Math.max(iJ0, J0(jm30Var, bVar2));
                } else {
                    b = -1;
                }
                length = i5;
                i4++;
                bVarArr = bVarArr2;
            }
            if (z2) {
                f1t0.g0("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z3 = i3 > i2;
                int i8 = z3 ? i3 : i2;
                boolean z4 = z3;
                int i9 = z3 ? i2 : i3;
                float f4 = i9 / i8;
                int i10 = 0;
                while (true) {
                    c4dVar = c4dVar2;
                    if (i10 < 9) {
                        int i11 = f3[i10];
                        int i12 = i10;
                        int i13 = (int) (i11 * f4);
                        if (i11 > i8 && i13 > i9) {
                            if (!z4) {
                                i13 = i11;
                            }
                            if (!z4) {
                                i11 = i13;
                            }
                            int i14 = i9;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = jm30Var.d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(vtt0.g(i13, widthAlignment) * widthAlignment, vtt0.g(i11, heightAlignment) * heightAlignment);
                            }
                            if (point != null) {
                                i = i3;
                                if (jm30Var.g(f2, point.x, point.y)) {
                                }
                            } else {
                                i = i3;
                            }
                            i10 = i12 + 1;
                            i3 = i;
                            c4dVar2 = c4dVar;
                            i9 = i14;
                            i8 = i8;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            awq awqVarA2 = bVar.a();
                            awqVarA2.v = iMax;
                            awqVarA2.w = iMax2;
                            iJ0 = Math.max(iJ0, H0(jm30Var, new androidx.media3.common.b(awqVarA2)));
                            f1t0.g0("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i = i3;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        awq awqVarA3 = bVar.a();
                        awqVarA3.v = iMax;
                        awqVarA3.w = iMax2;
                        iJ0 = Math.max(iJ0, H0(jm30Var, new androidx.media3.common.b(awqVarA3)));
                        f1t0.g0("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                c4dVar = c4dVar2;
                i = i3;
            }
            j6Var = new j6(iMax, iMax2, iJ0);
        }
        this.w2 = j6Var;
        int i15 = this.Y2 ? this.Z2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        c9x.K(mediaFormat, bVar.s);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        c9x.A(mediaFormat, "rotation-degrees", bVar.C);
        if (c4dVar != null) {
            c4d c4dVar3 = c4dVar;
            c9x.A(mediaFormat, "color-transfer", c4dVar3.c);
            c9x.A(mediaFormat, "color-standard", c4dVar3.f3719a);
            c9x.A(mediaFormat, "color-range", c4dVar3.b);
            byte[] bArr = c4dVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(bVar.p) && (pairB = jyc.b(bVar)) != null) {
            c9x.A(mediaFormat, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", j6Var.f15959a);
        mediaFormat.setInteger("max-height", j6Var.b);
        c9x.A(mediaFormat, "max-input-size", j6Var.c);
        mediaFormat.setInteger(RemoteMessageConst.Notification.PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.o2) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.X2));
        }
        H(mediaFormat);
        Surface surfaceK0 = K0(jm30Var);
        if (this.B2 != null && !vtt0.J(this.k2)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new pzu(jm30Var, mediaFormat, bVar, surfaceK0, mediaCrypto, (Object) null);
    }

    @Override // a.mm30
    public final void X(wkj wkjVar) {
        ByteBuffer byteBuffer = wkjVar.j;
        if (byteBuffer != null && byteBuffer.remaining() >= 7) {
            byte b = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            byteBuffer.position(0);
            if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && (b3 == 0 || b3 == 1)) {
                if (this.z2) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    dm30 dm30Var = this.m1;
                    dm30Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    dm30Var.b(bundle);
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT >= 37) {
                byte[] bArr2 = jyc.f17352a;
                int iRemaining = byteBuffer.remaining();
                byte[] bArr3 = jyc.d;
                if (iRemaining < bArr3.length) {
                    return;
                }
                int iPosition = byteBuffer.position();
                for (int i = 0; i < bArr3.length; i++) {
                    if (byteBuffer.get(iPosition + i) != bArr3[i]) {
                        return;
                    }
                }
                byteBuffer.position(5);
                int iRemaining2 = byteBuffer.remaining();
                byte[] bArr4 = new byte[iRemaining2];
                byteBuffer.get(bArr4);
                byteBuffer.position(0);
                boolean z = iRemaining2 > 0;
                this.A2 = z;
                if (z) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putByteArray("hdr-st2094-50-info", bArr4);
                    dm30 dm30Var2 = this.m1;
                    dm30Var2.getClass();
                    dm30Var2.b(bundle2);
                }
            }
        }
    }

    @Override // a.mm30, a.j16, a.x8a0
    public final void c(int i, Object obj) throws dlo {
        if (i == 1) {
            Q0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            seu0 seu0Var = (seu0) obj;
            this.b3 = seu0Var;
            pfu0 pfu0Var = this.B2;
            if (pfu0Var != null) {
                pfu0Var.u(seu0Var);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.Z2 != iIntValue) {
                this.Z2 = iIntValue;
                if (this.Y2) {
                    q0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.J2 = iIntValue2;
            dm30 dm30Var = this.m1;
            if (dm30Var != null) {
                dm30Var.g(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.K2 = iIntValue3;
            pfu0 pfu0Var2 = this.B2;
            if (pfu0Var2 != null) {
                pfu0Var2.p(iIntValue3);
                return;
            }
            zeu0 zeu0Var = this.p2.b;
            if (zeu0Var.i == iIntValue3) {
                return;
            }
            zeu0Var.i = iIntValue3;
            zeu0Var.c(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(teu0.f33840a)) {
                pfu0 pfu0Var3 = this.B2;
                if (pfu0Var3 == null || !pfu0Var3.b()) {
                    return;
                }
                this.B2.j();
                return;
            }
            this.E2 = list;
            pfu0 pfu0Var4 = this.B2;
            if (pfu0Var4 != null) {
                pfu0Var4.g(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            e7k0 e7k0Var = (e7k0) obj;
            if (e7k0Var.f7331a == 0 || e7k0Var.b == 0) {
                return;
            }
            this.H2 = e7k0Var;
            pfu0 pfu0Var5 = this.B2;
            if (pfu0Var5 != null) {
                Surface surface = this.F2;
                surface.getClass();
                pfu0Var5.l(surface, e7k0Var);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.X2 = ((Integer) obj).intValue();
                dm30 dm30Var2 = this.m1;
                if (dm30Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.X2));
                    dm30Var2.b(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.F2;
                Q0(null);
                obj.getClass();
                ((xm30) obj).c(1, surface2);
                break;
            case 18:
                boolean z = this.P2 != null;
                uch0 uch0Var = (uch0) obj;
                this.P2 = uch0Var;
                if (z != (uch0Var != null)) {
                    D0(this.n1);
                }
                break;
            default:
                super.c(i, obj);
                break;
        }
    }

    @Override // a.mm30
    public final boolean c0(androidx.media3.common.b bVar) throws dlo {
        pfu0 pfu0Var = this.B2;
        if (pfu0Var == null || pfu0Var.b()) {
            return true;
        }
        try {
            return this.B2.k(bVar);
        } catch (ofu0 e) {
            throw g(e, bVar, false, 7000);
        }
    }

    @Override // a.mm30
    public final void d0(Exception exc) {
        f1t0.R("MediaCodecVideoRenderer", "Video codec error", exc);
        fck0 fck0Var = this.m2;
        Handler handler = (Handler) fck0Var.b;
        if (handler != null) {
            handler.post(new ffu0(fck0Var, (Object) exc, (byte) 4));
        }
    }

    @Override // a.mm30
    public final void e0(long j, long j2, String str) {
        String str2;
        boolean z;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        fck0 fck0Var = this.m2;
        Handler handler = (Handler) fck0Var.b;
        if (handler != null) {
            str2 = str;
            handler.post(new ffu0(fck0Var, str2, j, j2));
        } else {
            str2 = str;
        }
        this.x2 = G0(str2);
        jm30 jm30Var = this.t1;
        jm30Var.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(jm30Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = jm30Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else {
                    if (codecProfileLevelArr[i].profile == 16384) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
        } else {
            z = false;
            break;
        }
        this.z2 = z;
        if (Build.VERSION.SDK_INT < 37) {
            jm30 jm30Var2 = this.t1;
            jm30Var2.getClass();
            if (jm30Var2.b.equals("video/av01")) {
                z2 = true;
            }
        }
        this.y2 = z2;
        O0();
    }

    @Override // a.mm30
    public final void f0(hyc hycVar) {
        fck0 fck0Var = this.m2;
        Handler handler = (Handler) fck0Var.b;
        if (handler != null) {
            handler.post(new qaq0(fck0Var, hycVar, (byte) 17));
        }
    }

    @Override // a.mm30
    public final void g0(String str) {
        fck0 fck0Var = this.m2;
        Handler handler = (Handler) fck0Var.b;
        if (handler != null) {
            handler.post(new ffu0(fck0Var, (Object) str, (byte) 1));
        }
    }

    @Override // a.j16
    public final void h() {
        pfu0 pfu0Var = this.B2;
        if (pfu0Var == null) {
            ueu0 ueu0Var = this.p2;
            if (ueu0Var.e == 0) {
                ueu0Var.e = 1;
                return;
            }
            return;
        }
        int i = this.D2;
        if (i == 0 || i == 1) {
            this.D2 = 0;
        } else {
            pfu0Var.m();
        }
    }

    @Override // a.mm30
    public final alj h0(hsj hsjVar) throws dlo {
        alj aljVarH0 = super.h0(hsjVar);
        this.A2 = false;
        androidx.media3.common.b bVar = (androidx.media3.common.b) hsjVar.b;
        bVar.getClass();
        fck0 fck0Var = this.m2;
        Handler handler = (Handler) fck0Var.b;
        if (handler != null) {
            handler.post(new ffu0(fck0Var, bVar, aljVarH0));
        }
        veu0 veu0Var = this.u2;
        if (veu0Var != null) {
            veu0Var.b();
        }
        return aljVarH0;
    }

    @Override // a.mm30
    public final void i0(androidx.media3.common.b bVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        dm30 dm30Var = this.m1;
        if (dm30Var != null) {
            dm30Var.g(this.J2);
        }
        if (this.Y2) {
            i = bVar.w;
            integer = bVar.x;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = bVar.E;
        int i2 = bVar.C;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.V2 = new qfu0(i, f, integer);
        pfu0 pfu0Var = this.B2;
        if (pfu0Var == null || !this.d3) {
            float f2 = bVar.B;
            fiq fiqVar = this.r2;
            fiqVar.f = f2;
            fiqVar.f9601a.c();
            fiqVar.b.c();
            fiqVar.c = false;
            fiqVar.d = -9223372036854775807L;
            fiqVar.e = 0;
            fiqVar.c();
        } else {
            if (i <= 0 || integer <= 0) {
                return;
            }
            awq awqVarA = bVar.a();
            awqVarA.v = i;
            awqVarA.w = integer;
            awqVarA.D = f;
            androidx.media3.common.b bVar2 = new androidx.media3.common.b(awqVarA);
            int i4 = this.D2;
            List list = this.E2;
            if (list == null) {
                v3x v3xVar = b4x.b;
                list = rcf0.e;
            }
            pfu0Var.f(bVar2, this.Z1.b, i4, list);
            this.D2 = 2;
        }
        this.d3 = false;
    }

    @Override // a.j16
    public final String k() {
        return "MediaCodecVideoRenderer";
    }

    @Override // a.mm30
    public final void k0(long j) {
        super.k0(j);
        if (this.Y2) {
            return;
        }
        this.O2--;
    }

    @Override // a.mm30
    public final void l0() {
        pfu0 pfu0Var = this.B2;
        if (pfu0Var != null) {
            pfu0Var.e();
            long j = this.c3;
            if (j == -9223372036854775807L) {
                j = this.Z1.b;
                this.c3 = j;
            }
            this.B2.d(-j);
        } else {
            this.p2.e(2);
        }
        this.d3 = true;
        O0();
    }

    @Override // a.j16
    public final boolean m() {
        if (!this.U1) {
            return false;
        }
        pfu0 pfu0Var = this.B2;
        return pfu0Var == null || pfu0Var.a();
    }

    @Override // a.mm30
    public final void m0(wkj wkjVar) {
        ByteBuffer byteBuffer;
        int iD0;
        int i;
        ByteBuffer byteBuffer2;
        c4d c4dVar;
        jm30 jm30Var = this.t1;
        jm30Var.getClass();
        String str = jm30Var.b;
        if (str.equals("video/av01") && (byteBuffer2 = wkjVar.g) != null) {
            androidx.media3.common.b bVar = this.n1;
            boolean z = (bVar == null || (c4dVar = bVar.H) == null || c4dVar.e <= 8) ? false : true;
            if (this.A2 && !byteBuffer2.isReadOnly()) {
                lv00.V(byteBuffer2, false);
            } else if (z && this.y2 && !byteBuffer2.isReadOnly()) {
                lv00.V(byteBuffer2, true);
            }
            yzn0 yzn0Var = this.s2;
            if (yzn0Var != null && wkjVar.m(1)) {
                int iPosition = byteBuffer2.position();
                int iLimit = byteBuffer2.limit();
                byteBuffer2.limit(Math.min(iLimit, iPosition + 500));
                ByteBuffer byteBuffer3 = (ByteBuffer) yzn0Var.f43523a;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer2);
                byteBuffer3.flip();
                byteBuffer2.position(iPosition);
                byteBuffer2.limit(iLimit);
            }
        } else if (str.equals("video/hevc") && (byteBuffer = wkjVar.g) != null && this.A2 && !byteBuffer.isReadOnly()) {
            ByteBuffer byteBuffer4 = wkjVar.g;
            int iPosition2 = byteBuffer4.position();
            int iLimit2 = byteBuffer4.limit();
            if (iLimit2 - iPosition2 >= 4) {
                while (iPosition2 < iLimit2) {
                    int iD1 = ibc.d0(byteBuffer4, iPosition2, iLimit2);
                    if (iD1 == iLimit2 || (iD0 = iD1 + 3) >= iLimit2 || ((i = (byteBuffer4.get(iD0) & 126) >> 1) >= 0 && i <= 31)) {
                        break;
                    }
                    if (i == 39) {
                        int i2 = iD1 + 5;
                        iD0 = ibc.d0(byteBuffer4, i2, iLimit2);
                        int i3 = 0;
                        while (i2 < iD0) {
                            int i4 = 0;
                            while (i2 < iD0) {
                                int i5 = byteBuffer4.get(i2) & 255;
                                if (i5 != 3 || i3 < 2) {
                                    i3 = i5 == 0 ? i3 + 1 : 0;
                                    int i6 = i2 + 1;
                                    i4 += i5;
                                    if (i5 != 255) {
                                        if (i4 == 4) {
                                            byteBuffer4.put(i2, (byte) -2);
                                        }
                                        i2 = i6;
                                        break;
                                    }
                                    i2 = i6;
                                } else {
                                    i2++;
                                    i3 = 0;
                                }
                            }
                            if (i2 >= iD0) {
                                break;
                            }
                            int i7 = 0;
                            while (i2 < iD0) {
                                int i8 = byteBuffer4.get(i2) & 255;
                                if (i8 != 3 || i3 < 2) {
                                    i3 = i8 == 0 ? i3 + 1 : 0;
                                    i2++;
                                    i7 += i8;
                                    if (i8 != 255) {
                                        break;
                                    }
                                } else {
                                    i2++;
                                    i3 = 0;
                                }
                            }
                            int i9 = 0;
                            while (i9 < i7 && i2 < iD0) {
                                int i10 = i2 + 1;
                                int i11 = byteBuffer4.get(i2) & 255;
                                if (i11 != 3 || i3 < 2) {
                                    if (i11 == 0) {
                                        i3++;
                                    }
                                    i9++;
                                    i2 = i10;
                                } else {
                                    i9--;
                                }
                                i3 = 0;
                                i9++;
                                i2 = i10;
                            }
                        }
                    }
                    iPosition2 = iD0;
                }
            }
        }
        this.e3 = 0;
        int iR = R(wkjVar);
        if ((Build.VERSION.SDK_INT < 34 || (iR & 32) == 0) && !this.Y2) {
            this.O2++;
        }
    }

    @Override // a.j16
    public final boolean o() {
        boolean z;
        boolean zIsReady;
        if (this.Z == null) {
            z = false;
        } else {
            if (l()) {
                zIsReady = this.n;
            } else {
                ixg0 ixg0Var = this.i;
                ixg0Var.getClass();
                zIsReady = ixg0Var.isReady();
            }
            if (!zIsReady && this.D1 < 0) {
                if (this.B1 != -9223372036854775807L) {
                    this.g.getClass();
                    if (SystemClock.elapsedRealtime() < this.B1) {
                    }
                }
                z = false;
            }
            z = true;
        }
        pfu0 pfu0Var = this.B2;
        if (pfu0Var != null) {
            return pfu0Var.h(z);
        }
        if (z && (this.m1 == null || this.Y2)) {
            return true;
        }
        return this.p2.b(z);
    }

    @Override // a.mm30
    public final boolean o0(long j, long j2, dm30 dm30Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.b bVar) {
        fiq fiqVar;
        dm30Var.getClass();
        long j4 = j3 - this.Z1.c;
        boolean z3 = this.p2.h != -9223372036854775807L;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.v2;
            Long l = (Long) priorityQueue.peek();
            fiqVar = this.r2;
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            fiqVar.b(1000 * l.longValue());
            if (l.longValue() < this.l || z3) {
                i5++;
            } else {
                i4++;
            }
        }
        U0(i4, 0);
        this.Y1.d += i5;
        fiqVar.b(j3 * 1000);
        pfu0 pfu0Var = this.B2;
        if (pfu0Var != null) {
            if (!z || z2) {
                return pfu0Var.c(j3, new tm30(this, dm30Var, i, j4));
            }
            T0(dm30Var, i);
            return true;
        }
        int iA = this.p2.a(j3, j, j2, this.Z1.b, z, z2, fiqVar.a(), fiqVar.h, this.q2);
        br8 br8Var = this.q2;
        veu0 veu0Var = this.u2;
        if (veu0Var != null && iA != 5 && iA != 4) {
            veu0Var.a(j3, br8Var.b);
        }
        if (iA == 0) {
            this.g.getClass();
            long jNanoTime = System.nanoTime();
            seu0 seu0Var = this.b3;
            if (seu0Var != null) {
                seu0Var.d(j4, jNanoTime, bVar, this.o1);
            }
            P0(dm30Var, i, jNanoTime);
            V0(br8Var.b);
            return true;
        }
        if (iA == 1) {
            long j5 = br8Var.c;
            long j6 = br8Var.b;
            if (j5 == this.U2) {
                T0(dm30Var, i);
            } else {
                seu0 seu0Var2 = this.b3;
                if (seu0Var2 != null) {
                    seu0Var2.d(j4, j5, bVar, this.o1);
                }
                P0(dm30Var, i, j5);
            }
            V0(j6);
            this.U2 = j5;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            dm30Var.k(i);
            Trace.endSection();
            U0(0, 1);
            V0(br8Var.b);
            return true;
        }
        if (iA == 3) {
            T0(dm30Var, i);
            V0(br8Var.b);
            return true;
        }
        if (iA == 4 || iA == 5) {
            return false;
        }
        jf4.n(String.valueOf(iA));
        return false;
    }

    @Override // a.mm30, a.j16
    public final void p() {
        tkj tkjVar;
        fck0 fck0Var = this.m2;
        this.W2 = null;
        O0();
        this.I2 = false;
        this.a3 = null;
        this.R2 = y0();
        byte b = 16;
        try {
            super.p();
            tkjVar = this.Y1;
            fck0Var.getClass();
            synchronized (tkjVar) {
            }
        } finally {
            tkjVar = this.Y1;
            fck0Var.getClass();
            synchronized (tkjVar) {
                Handler handler = (Handler) fck0Var.b;
                if (handler != null) {
                    handler.post(new qaq0(fck0Var, tkjVar, b));
                }
                fck0Var.j(qfu0.d);
            }
        }
    }

    @Override // a.j16
    public final void q(boolean z, boolean z2) {
        pfu0 pfu0Var;
        this.Y1 = new tkj();
        tjf0 tjf0Var = this.d;
        tjf0Var.getClass();
        boolean z3 = tjf0Var.b;
        x0x.K((z3 && this.Z2 == 0) ? false : true);
        if (this.Y2 != z3) {
            this.Y2 = z3;
            q0();
        }
        tkj tkjVar = this.Y1;
        fck0 fck0Var = this.m2;
        Handler handler = (Handler) fck0Var.b;
        if (handler != null) {
            handler.post(new ffu0(fck0Var, (Object) tkjVar, (byte) 5));
        }
        boolean z4 = this.C2;
        ueu0 ueu0Var = this.p2;
        if (!z4) {
            if (this.E2 != null && this.B2 == null) {
                by90 by90Var = new by90(this.k2, ueu0Var);
                by90Var.d = true;
                long j = this.t2;
                by90Var.g = j != -9223372036854775807L ? -j : -9223372036854775807L;
                l9o0 l9o0Var = this.g;
                l9o0Var.getClass();
                by90Var.e = l9o0Var;
                x0x.K(!by90Var.f);
                if (by90Var.c == null) {
                    by90Var.c = new ey90();
                }
                gy90 gy90Var = new gy90(by90Var);
                by90Var.f = true;
                if (1 >= gy90Var.p) {
                    gy90Var.p = 1;
                }
                SparseArray sparseArray = gy90Var.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    pfu0Var = (pfu0) sparseArray.get(0);
                } else {
                    cy90 cy90Var = new cy90(gy90Var, gy90Var.f12117a);
                    gy90Var.g.add(cy90Var);
                    sparseArray.put(0, cy90Var);
                    pfu0Var = cy90Var;
                }
                this.B2 = pfu0Var;
            }
            this.C2 = true;
        }
        pfu0 pfu0Var2 = this.B2;
        if (pfu0Var2 == null) {
            l9o0 l9o0Var2 = this.g;
            l9o0Var2.getClass();
            ueu0Var.k = l9o0Var2;
            ueu0Var.e(!z2 ? 1 : 0);
            return;
        }
        pfu0Var2.i(new sm30(this));
        seu0 seu0Var = this.b3;
        if (seu0Var != null) {
            this.B2.u(seu0Var);
        }
        if (this.F2 != null && !this.H2.equals(e7k0.c)) {
            this.B2.l(this.F2, this.H2);
        }
        this.B2.p(this.K2);
        this.B2.q(this.k1);
        List list = this.E2;
        if (list != null) {
            this.B2.g(list);
        }
        this.D2 = !z2 ? 1 : 0;
        this.c2 = true;
    }

    @Override // a.mm30, a.j16
    public final void r(long j, boolean z, boolean z2) throws dlo {
        pfu0 pfu0Var = this.B2;
        if (pfu0Var != null && !z) {
            pfu0Var.s(true);
        }
        if (z2) {
            this.Q2 = j;
        }
        super.r(j, z, z2);
        pfu0 pfu0Var2 = this.B2;
        ueu0 ueu0Var = this.p2;
        if (pfu0Var2 == null) {
            ueu0Var.b.b();
            ueu0Var.f = -9223372036854775807L;
            ueu0Var.e = Math.min(ueu0Var.e, 1);
            ueu0Var.h = -9223372036854775807L;
            ueu0Var.m = false;
        }
        veu0 veu0Var = this.u2;
        if (veu0Var != null) {
            veu0Var.b();
        }
        if (z) {
            pfu0 pfu0Var3 = this.B2;
            if (pfu0Var3 != null) {
                pfu0Var3.v(false);
            } else {
                ueu0Var.c(false);
            }
        }
        O0();
        this.N2 = 0;
    }

    @Override // a.mm30
    public final void r0() {
        pfu0 pfu0Var = this.B2;
        if (pfu0Var != null) {
            pfu0Var.e();
        } else {
            long j = this.Z1.h;
        }
    }

    @Override // a.j16
    public final void s() {
        pfu0 pfu0Var = this.B2;
        if (pfu0Var == null || !this.l2) {
            return;
        }
        pfu0Var.release();
    }

    @Override // a.j16
    public final void t() {
        try {
            try {
                this.G1 = false;
                s0();
                q0();
                ivn ivnVar = this.h1;
                if (ivnVar != null) {
                    ivnVar.m(null);
                }
                this.h1 = null;
                this.C2 = false;
                this.c3 = -9223372036854775807L;
                this.A2 = false;
                PlaceholderSurface placeholderSurface = this.G2;
                if (placeholderSurface != null) {
                    placeholderSurface.release();
                    this.G2 = null;
                }
            } catch (Throwable th) {
                ivn ivnVar2 = this.h1;
                if (ivnVar2 != null) {
                    ivnVar2.m(null);
                }
                this.h1 = null;
                throw th;
            }
        } catch (Throwable th2) {
            this.C2 = false;
            this.c3 = -9223372036854775807L;
            this.A2 = false;
            PlaceholderSurface placeholderSurface2 = this.G2;
            if (placeholderSurface2 != null) {
                placeholderSurface2.release();
                this.G2 = null;
            }
            throw th2;
        }
    }

    @Override // a.mm30
    public final void t0() {
        super.t0();
        this.v2.clear();
        this.O2 = 0;
        this.e3 = 0;
        this.R2 = false;
        yzn0 yzn0Var = this.s2;
        if (yzn0Var != null) {
            yzn0Var.b = null;
            ByteBuffer byteBuffer = (ByteBuffer) yzn0Var.f43523a;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // a.j16
    public final void u() {
        this.M2 = 0;
        this.g.getClass();
        this.L2 = SystemClock.elapsedRealtime();
        this.S2 = 0L;
        this.T2 = 0;
        pfu0 pfu0Var = this.B2;
        if (pfu0Var != null) {
            pfu0Var.o();
        } else {
            this.p2.d();
        }
    }

    @Override // a.j16
    public final void v() {
        N0();
        int i = this.T2;
        if (i != 0) {
            long j = this.S2;
            fck0 fck0Var = this.m2;
            Handler handler = (Handler) fck0Var.b;
            if (handler != null) {
                handler.post(new ffu0(fck0Var, j, i));
            }
            this.S2 = 0L;
            this.T2 = 0;
        }
        pfu0 pfu0Var = this.B2;
        if (pfu0Var != null) {
            pfu0Var.n();
        } else {
            ueu0 ueu0Var = this.p2;
            ueu0Var.d = false;
            ueu0Var.h = -9223372036854775807L;
            zeu0 zeu0Var = ueu0Var.b;
            zeu0Var.d = false;
            weu0 weu0Var = zeu0Var.c;
            if (weu0Var != null) {
                weu0Var.b();
            }
            zeu0Var.a();
        }
        veu0 veu0Var = this.u2;
        if (veu0Var != null) {
            veu0Var.b();
        }
    }

    @Override // a.mm30, a.j16
    public final void w(androidx.media3.common.b[] bVarArr, long j, long j2, vn30 vn30Var) {
        super.w(bVarArr, j, j2, vn30Var);
        veu0 veu0Var = this.u2;
        if (veu0Var != null) {
            veu0Var.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140  */
    @Override // a.mm30
    public final boolean x0(wkj wkjVar) {
        boolean z;
        ByteBuffer byteBuffer;
        int iLimit;
        ke60 ke60Var;
        nqd nqdVar;
        boolean z2 = false;
        if (!M0(wkjVar)) {
            long j = wkjVar.i;
            boolean z3 = j < this.l;
            veu0 veu0Var = this.u2;
            if (veu0Var != null) {
                long j2 = veu0Var.f37301a;
                long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : (long) (((j - j2) * veu0Var.c) + veu0Var.b);
                if (j3 == -9223372036854775807L || j3 >= this.t2) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((z3 || z) && !wkjVar.m(268435456)) {
                if (!wkjVar.m(67108864)) {
                    yzn0 yzn0Var = this.s2;
                    if (yzn0Var != null) {
                        ByteBuffer byteBuffer2 = (ByteBuffer) yzn0Var.f43523a;
                        jm30 jm30Var = this.t1;
                        jm30Var.getClass();
                        if (jm30Var.b.equals("video/av01") && (byteBuffer = wkjVar.g) != null) {
                            boolean z4 = z3 || this.e3 <= 0;
                            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            byteBufferAsReadOnlyBuffer.flip();
                            if (byteBuffer2.hasRemaining()) {
                                yzn0Var.x(d9x.T(byteBuffer2));
                                byteBuffer2.position(byteBuffer2.limit());
                            }
                            ArrayList arrayListT = d9x.T(byteBufferAsReadOnlyBuffer);
                            yzn0Var.x(arrayListT);
                            int size = arrayListT.size() - 1;
                            int i = 0;
                            while (size >= 0) {
                                je60 je60Var = (je60) arrayListT.get(size);
                                int i2 = je60Var.f16358a;
                                if (i2 != 2 && i2 != 15) {
                                    if ((i2 == 3 && !z4) || ((i2 != 6 && i2 != 3) || (ke60Var = (ke60) yzn0Var.b) == null)) {
                                        break;
                                    }
                                    try {
                                        nqdVar = new nqd(ke60Var, je60Var);
                                    } catch (ie60 unused) {
                                        nqdVar = null;
                                    }
                                    if (nqdVar == null || nqdVar.b) {
                                        break;
                                    }
                                }
                                if (((je60) arrayListT.get(size)).f16358a == 6 || ((je60) arrayListT.get(size)).f16358a == 3) {
                                    i++;
                                }
                                size--;
                            }
                            if (i > 1 || size + 1 >= 8) {
                                iLimit = byteBufferAsReadOnlyBuffer.limit();
                            } else {
                                iLimit = size >= 0 ? ((je60) arrayListT.get(size)).b.limit() : byteBufferAsReadOnlyBuffer.position();
                            }
                            if (iLimit == 0) {
                                wkjVar.v();
                            } else if (iLimit != byteBufferAsReadOnlyBuffer.limit()) {
                                j6 j6Var = this.w2;
                                j6Var.getClass();
                                if (j6Var.c + iLimit < byteBufferAsReadOnlyBuffer.capacity() && !wkjVar.m(1073741824)) {
                                    ByteBuffer byteBuffer3 = wkjVar.g;
                                    byteBuffer3.getClass();
                                    byteBuffer3.position(iLimit);
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (!z3) {
                            this.e3++;
                        }
                        this.v2.add(Long.valueOf(wkjVar.i));
                    }
                    return z2;
                }
                wkjVar.v();
                z2 = true;
                if (z2) {
                    if (!z3) {
                        this.e3++;
                    }
                    this.v2.add(Long.valueOf(wkjVar.i));
                }
                return z2;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // a.mm30
    public final boolean y0() {
        boolean z;
        if (this.N1) {
            androidx.media3.common.b bVar = this.n1;
            long j = this.r;
            if (j != -9223372036854775807L) {
                if (this.e2 + 1 + j > Long.MAX_VALUE - (this.Z1.c + j)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (this.P2 == null || this.R2 || this.Y2 || ((bVar != null && bVar.r > 0) || z || this.Z1.h != -9223372036854775807L)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.mm30, a.j16
    public final void z(long j, long j2) throws dlo {
        pfu0 pfu0Var = this.B2;
        if (pfu0Var != null) {
            try {
                pfu0Var.t(j, j2);
            } catch (ofu0 e) {
                throw g(e, e.f25185a, false, 7001);
            }
        }
        super.z(j, j2);
    }

    @Override // a.mm30
    public final boolean z0(jm30 jm30Var) {
        return L0(jm30Var);
    }
}
