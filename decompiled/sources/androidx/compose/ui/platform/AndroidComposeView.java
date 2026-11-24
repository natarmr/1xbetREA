package androidx.compose.ui.platform;

import a.a13;
import a.a8q0;
import a.aaq0;
import a.adw;
import a.afv;
import a.aqq;
import a.ax2;
import a.b6a;
import a.bfx;
import a.bg80;
import a.bhu0;
import a.bki0;
import a.bpa0;
import a.bx2;
import a.by2;
import a.c13;
import a.c7z;
import a.caq0;
import a.cg80;
import a.clz;
import a.cpa0;
import a.cs0;
import a.csj;
import a.cx2;
import a.cy2;
import a.d12;
import a.d13;
import a.d5c;
import a.d7x;
import a.d810;
import a.dfv;
import a.dx2;
import a.e7z;
import a.e9x;
import a.ebc;
import a.eg80;
import a.eox;
import a.epv0;
import a.er90;
import a.erv0;
import a.esb0;
import a.ex2;
import a.ey40;
import a.f3k;
import a.f42;
import a.f8;
import a.fck0;
import a.fpa0;
import a.fx2;
import a.fy2;
import a.fy40;
import a.g1v0;
import a.g2t0;
import a.g7z;
import a.gfv;
import a.gge0;
import a.glz;
import a.gx2;
import a.gy2;
import a.gy4;
import a.gzg0;
import a.h0q0;
import a.h2t0;
import a.h7k;
import a.h7x;
import a.hge0;
import a.hgk0;
import a.hie0;
import a.hkx;
import a.hny;
import a.hrq;
import a.hz40;
import a.hzg0;
import a.i0h0;
import a.i7z;
import a.ilp0;
import a.ils0;
import a.iqq;
import a.iuc;
import a.iw2;
import a.iy2;
import a.iz40;
import a.j910;
import a.jf4;
import a.jge0;
import a.jgk0;
import a.jk8;
import a.jk9;
import a.jlz;
import a.jpq;
import a.jw2;
import a.k23;
import a.k3x;
import a.k6z;
import a.k7n0;
import a.k7x;
import a.ka3;
import a.kd30;
import a.keg0;
import a.klz;
import a.kng0;
import a.kpa0;
import a.kuc;
import a.lbk;
import a.leg0;
import a.lf2;
import a.lgb;
import a.llz;
import a.lm40;
import a.lx2;
import a.m6;
import a.mai0;
import a.mc;
import a.mie0;
import a.mrq;
import a.mx2;
import a.nai0;
import a.nd80;
import a.neg0;
import a.niu0;
import a.nnw0;
import a.nqq;
import a.ns40;
import a.nx2;
import a.o8q0;
import a.o9q0;
import a.oaw;
import a.oge0;
import a.ogk0;
import a.oif0;
import a.omv;
import a.os40;
import a.ou90;
import a.owk;
import a.ox2;
import a.p33;
import a.p460;
import a.p4e;
import a.pa3;
import a.pgk0;
import a.piu0;
import a.pkk0;
import a.pnd0;
import a.pv00;
import a.pz40;
import a.q660;
import a.q860;
import a.q8a;
import a.q8q0;
import a.qhu0;
import a.qj30;
import a.qm40;
import a.qo8;
import a.qsn;
import a.qu90;
import a.qvj;
import a.qzb;
import a.r3k;
import a.r580;
import a.r860;
import a.raw;
import a.rcz;
import a.rdx;
import a.rfk0;
import a.rgu0;
import a.rhv0;
import a.riu0;
import a.ro4;
import a.rs00;
import a.rv00;
import a.rz2;
import a.s460;
import a.s5a;
import a.s860;
import a.sgy;
import a.shv0;
import a.sj30;
import a.skd;
import a.spq;
import a.sre0;
import a.sv90;
import a.t9f;
import a.td9;
import a.ty40;
import a.tzi;
import a.u710;
import a.u9h0;
import a.uc9;
import a.ufd;
import a.ui30;
import a.ujn;
import a.upq;
import a.uw2;
import a.uzb;
import a.v1h0;
import a.v4i0;
import a.v6x;
import a.v9g0;
import a.v9q;
import a.vbf;
import a.vbk;
import a.vcc;
import a.vdx;
import a.vi30;
import a.vn00;
import a.vun;
import a.vx2;
import a.vy40;
import a.w55;
import a.w5z;
import a.w6;
import a.w6k;
import a.w960;
import a.wai0;
import a.wdx;
import a.wgu0;
import a.wne;
import a.wpq;
import a.wso0;
import a.wx2;
import a.wy2;
import a.x1x;
import a.xai0;
import a.xcx;
import a.xd2;
import a.xfk0;
import a.xfx;
import a.xw3;
import a.xz40;
import a.y6;
import a.yex;
import a.yez;
import a.ypq;
import a.z1x;
import a.zbk;
import a.zex;
import a.zfn;
import a.zje;
import a.zn00;
import a.zn20;
import a.zx2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.e;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\u0004:\u0006Ì\u0002Í\u0002Î\u0002J\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b\"\u0010#R+\u0010+\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u00105\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010=\u001a\u0004\u0018\u0001068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010D\u001a\u00020>2\u0006\u0010?\u001a\u00020>8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR+\u0010K\u001a\u00020E2\u0006\u0010$\u001a\u00020E8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010&\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010Q\u001a\u00020L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010_\u001a\u00020Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R+\u0010b\u001a\u00020`2\u0006\u0010$\u001a\u00020`8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010&\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001b\u0010i\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010cR\u0017\u0010o\u001a\u00020j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR \u0010v\u001a\u00020p8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bq\u0010r\u0012\u0004\bu\u00104\u001a\u0004\bs\u0010tR \u0010|\u001a\b\u0012\u0004\u0012\u00020p0w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u001d\u0010\u0082\u0001\u001a\u00020}8\u0016X\u0096\u0004¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010\u0088\u0001\u001a\u00030\u0083\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0096\u0001\u001a\u00030\u0091\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u009c\u0001\u001a\u00030\u0097\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R3\u0010£\u0001\u001a\u00030\u009d\u00012\u0007\u0010$\u001a\u00030\u009d\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u009e\u0001\u0010&\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R \u0010¨\u0001\u001a\u00030¤\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b¥\u0001\u0010g\u001a\u0006\b¦\u0001\u0010§\u0001R\"\u0010®\u0001\u001a\u0005\u0018\u00010©\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\"\u0010´\u0001\u001a\u0005\u0018\u00010¯\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R \u0010º\u0001\u001a\u00030µ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R'\u0010¿\u0001\u001a\u00020`8V@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0005\b½\u0001\u0010c\"\u0005\b¾\u0001\u0010eR/\u0010Æ\u0001\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\bÀ\u0001\u0010Á\u0001\u0012\u0005\bÅ\u0001\u00104\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0005\bÄ\u0001\u0010\u0016R \u0010Ë\u0001\u001a\u00030Ç\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bÈ\u0001\u0010&\u001a\u0006\bÉ\u0001\u0010Ê\u0001R3\u0010Ò\u0001\u001a\u00030Ì\u00012\u0007\u0010$\u001a\u00030Ì\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bÍ\u0001\u0010&\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R \u0010Ø\u0001\u001a\u00030Ó\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001RD\u0010â\u0001\u001a\u0016\u0012\u0005\u0012\u00030Ú\u0001\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00140Ù\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÛ\u0001\u0010Ü\u0001\u0012\u0005\bá\u0001\u00104\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R'\u0010æ\u0001\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bã\u0001\u0010¼\u0001\u001a\u0005\bä\u0001\u0010c\"\u0005\bå\u0001\u0010eR \u0010ì\u0001\u001a\u00030ç\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001R'\u0010ï\u0001\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bí\u0001\u0010(\"\u0005\bî\u0001\u0010*R\u0018\u0010ó\u0001\u001a\u00030ð\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010ò\u0001R\u0017\u0010ö\u0001\u001a\u00020!8VX\u0096\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010õ\u0001R\u0015\u0010ú\u0001\u001a\u00030÷\u00018F¢\u0006\b\u001a\u0006\bø\u0001\u0010ù\u0001R\u001f\u0010ÿ\u0001\u001a\u00030û\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bþ\u0001\u00104\u001a\u0006\bü\u0001\u0010ý\u0001R\u0018\u0010\u0083\u0002\u001a\u00030\u0080\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002R\u0018\u0010\u0087\u0002\u001a\u00030\u0084\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R*\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0005\b\u008c\u0002\u0010\u001aR\u0018\u0010\u0090\u0002\u001a\u00030\u008d\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0018\u0010\u0094\u0002\u001a\u00030\u0091\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0018\u0010\u0098\u0002\u001a\u00030\u0095\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0018\u0010\u009c\u0002\u001a\u00030\u0099\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0017\u0010\u009e\u0002\u001a\u00020\u00128VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010Ã\u0001R\u0016\u0010 \u0002\u001a\u00020`8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0002\u0010cR\u001f\u0010¥\u0002\u001a\u00030¡\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b¤\u0002\u00104\u001a\u0006\b¢\u0002\u0010£\u0002R\u0018\u0010©\u0002\u001a\u00030¦\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b§\u0002\u0010¨\u0002R\u0018\u0010\u00ad\u0002\u001a\u00030ª\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010¬\u0002R\u001f\u0010²\u0002\u001a\u00030®\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b±\u0002\u00104\u001a\u0006\b¯\u0002\u0010°\u0002R\u0018\u0010¶\u0002\u001a\u00030³\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0002\u0010µ\u0002R\u0018\u0010º\u0002\u001a\u00030·\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¸\u0002\u0010¹\u0002R\u0018\u0010¾\u0002\u001a\u00030»\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0002\u0010½\u0002R\u0013\u0010À\u0002\u001a\u00020`8F¢\u0006\u0007\u001a\u0005\b¿\u0002\u0010cR\u0019\u0010Ã\u0002\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010Â\u0002R\u0018\u0010Ç\u0002\u001a\u00030Ä\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010Æ\u0002R\u0018\u0010Ë\u0002\u001a\u00030È\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010Ê\u0002¨\u0006Ï\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "La/cg80;", "La/sv90;", "", "La/vi30;", "La/qvj;", "La/nd80;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "La/upq;", "", "getImportantForAutofill", "()I", "La/jge0;", "getEmbeddedViewFocusRect", "()La/jge0;", "", "intervalMillis", "", "setAccessibilityEventBatchIntervalMillis", "(J)V", "La/keg0;", "handler", "setUncaughtExceptionHandler", "(La/keg0;)V", "Lkotlin/Function1;", "La/skd;", "callback", "setOnReadyForComposition", "(Lkotlin/jvm/functions/Function1;)V", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "<set-?>", "a", "La/pz40;", "get_composeViewContext", "()La/skd;", "set_composeViewContext", "(La/skd;)V", "_composeViewContext", "La/v6x;", "d", "La/v6x;", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui", "()La/v6x;", "setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui", "(La/v6x;)V", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations", "()V", "primaryDirectionalMotionAxisOverride", "La/jlz;", "e", "La/jlz;", "getFrameEndScheduler$ui", "()La/jlz;", "setFrameEndScheduler$ui", "(La/jlz;)V", "frameEndScheduler", "La/v9g0;", "value", "h", "La/v9g0;", "getRetainedValuesStore", "()La/v9g0;", "retainedValuesStore", "La/w6k;", "k", "getDensity", "()La/w6k;", "setDensity", "(La/w6k;)V", "density", "La/wpq;", "m", "La/wpq;", "getFocusOwner", "()La/wpq;", "focusOwner", "Lkotlin/coroutines/CoroutineContext;", "n", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "La/wy2;", "o", "La/wy2;", "getDragAndDropManager", "()La/wy2;", "dragAndDropManager", "", "p", "isAttached", "()Z", "setAttached", "(Z)V", "q", "La/l7m0;", "getDerivedIsAttached", "derivedIsAttached", "La/xfx;", "r", "La/xfx;", "getInsetsListener", "()La/xfx;", "insetsListener", "La/e7z;", "s", "La/e7z;", "getRoot", "()La/e7z;", "getRoot$annotations", "root", "La/ey40;", "t", "La/ey40;", "getLayoutNodes", "()La/ey40;", "layoutNodes", "La/oge0;", "u", "La/oge0;", "getRectManager", "()La/oge0;", "rectManager", "La/wai0;", "v", "La/wai0;", "getSemanticsOwner", "()La/wai0;", "semanticsOwner", "La/iy2;", "x", "La/iy2;", "getContentCaptureManager$ui", "()La/iy2;", "setContentCaptureManager$ui", "(La/iy2;)V", "contentCaptureManager", "La/afv;", "y", "La/afv;", "getGraphicsContext", "()La/afv;", "graphicsContext", "La/w55;", "z", "La/w55;", "getAutofillTree", "()La/w55;", "autofillTree", "Landroid/content/res/Configuration;", "j1", "getConfiguration", "()Landroid/content/res/Configuration;", "setConfiguration", "(Landroid/content/res/Configuration;)V", "configuration", "La/rs00;", "k1", "getLocaleList", "()La/rs00;", "localeList", "La/iw2;", "l1", "La/iw2;", "getAutofill", "()La/iw2;", "autofill", "La/jw2;", "m1", "La/jw2;", "getAutofillManager", "()La/jw2;", "autofillManager", "La/eg80;", "o1", "La/eg80;", "getSnapshotObserver", "()La/eg80;", "snapshotObserver", "p1", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "showLayoutBounds", "A1", "J", "getLastMatrixRecalculationAnimationTime$ui", "()J", "setLastMatrixRecalculationAnimationTime$ui", "getLastMatrixRecalculationAnimationTime$ui$annotations", "lastMatrixRecalculationAnimationTime", "La/mrq;", "I1", "getFontFamilyResolver", "()La/mrq;", "fontFamilyResolver", "La/k6z;", "J1", "getLayoutDirection", "()La/k6z;", "setLayoutDirection", "(La/k6z;)V", "layoutDirection", "La/qm40;", "L1", "La/qm40;", "getModifierLocalManager", "()La/qm40;", "modifierLocalManager", "Lkotlin/Function2;", "La/jpq;", "Z1", "Lkotlin/jvm/functions/Function2;", "getPlayNavigationSoundEffect$ui", "()Lkotlin/jvm/functions/Function2;", "setPlayNavigationSoundEffect$ui", "(Lkotlin/jvm/functions/Function2;)V", "getPlayNavigationSoundEffect$ui$annotations", "playNavigationSoundEffect", "e2", "getComposeViewContextIncrementedDuringInit$ui", "setComposeViewContextIncrementedDuringInit$ui", "composeViewContextIncrementedDuringInit", "La/cpa0;", "i2", "La/cpa0;", "getPointerIconService", "()La/cpa0;", "pointerIconService", "getComposeViewContext", "setComposeViewContext", "composeViewContext", "La/g7z;", "getSharedDrawScope", "()La/g7z;", "sharedDrawScope", "getView", "()Landroid/view/View;", "view", "La/owk;", "getSavedStateRegistry", "()La/owk;", "savedStateRegistry", "La/rhv0;", "getWindowInfo", "()La/rhv0;", "getWindowInfo$annotations", "windowInfo", "La/wgu0;", "getViewConfiguration", "()La/wgu0;", "viewConfiguration", "La/leg0;", "getRootForTest", "()La/leg0;", "rootForTest", "uncaughtExceptionHandler", "La/keg0;", "getUncaughtExceptionHandler$ui", "()La/keg0;", "setUncaughtExceptionHandler$ui", "La/w6;", "getAccessibilityManager", "()La/w6;", "accessibilityManager", "La/kuc;", "getClipboardManager", "()La/kuc;", "clipboardManager", "La/iuc;", "getClipboard", "()La/iuc;", "clipboard", "La/p33;", "getAndroidViewsHandler$ui", "()La/p33;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "La/o8q0;", "getTextInputService", "()La/o8q0;", "getTextInputService$annotations", "textInputService", "La/pkk0;", "getSoftwareKeyboardController", "()La/pkk0;", "softwareKeyboardController", "La/ou90;", "getPlacementScope", "()La/ou90;", "placementScope", "La/hrq;", "getFontLoader", "()La/hrq;", "getFontLoader$annotations", "fontLoader", "La/omv;", "getHapticFeedBack", "()La/omv;", "hapticFeedBack", "La/bfx;", "getInputModeManager", "()La/bfx;", "inputModeManager", "La/aaq0;", "getTextToolbar", "()La/aaq0;", "textToolbar", "getScrollCaptureInProgress", "scrollCaptureInProgress", "getOutOfFrameExecutor", "()Landroidx/compose/ui/platform/AndroidComposeView;", "outOfFrameExecutor", "La/b6a;", "getCanvasHolder", "()La/b6a;", "canvasHolder", "La/q8q0;", "getLegacyTextInputServiceAndroid", "()La/q8q0;", "legacyTextInputServiceAndroid", "a/f42", "a/uc9", "a/ix2", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidComposeView extends ViewGroup implements cg80, sv90, leg0, vi30, qvj, nd80, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, upq {
    public static Class j2;
    public static Method k2;
    public static Method l2;
    public static final vy40 m2 = new vy40();
    public static d12 n2;
    public static Method o2;
    public static Method p2;
    public final vy40 A;

    /* JADX INFO: renamed from: A1, reason: from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;
    public vy40 B;
    public boolean B1;
    public long C1;
    public Function1 D1;
    public q8q0 E1;
    public o8q0 F1;
    public final AtomicReference G1;
    public r3k H1;

    /* JADX INFO: renamed from: I1, reason: from kotlin metadata */
    public final pz40 fontFamilyResolver;

    /* JADX INFO: renamed from: J1, reason: from kotlin metadata */
    public final pz40 layoutDirection;
    public bfx K1;

    /* JADX INFO: renamed from: L1, reason: from kotlin metadata */
    public final qm40 modifierLocalManager;
    public k23 M1;
    public MotionEvent N1;
    public long O1;
    public final fck0 P1;
    public final vy40 Q1;
    public float R1;
    public float S1;
    public float U1;
    public float V1;
    public final mx2 W1;
    public final gx2 X1;
    public boolean Y1;

    /* JADX INFO: renamed from: Z1, reason: from kotlin metadata */
    public Function2 playNavigationSoundEffect;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final pz40 _composeViewContext;
    public final qo8 a2;
    public long b;
    public final bx2 b2;
    public final boolean c;
    public final bx2 c2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public v6x primaryDirectionalMotionAxisOverride;
    public boolean d2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public jlz frameEndScheduler;

    /* JADX INFO: renamed from: e2, reason: from kotlin metadata */
    public boolean composeViewContextIncrementedDuringInit;
    public klz f;
    public boolean f1;
    public boolean f2;
    public owk g;
    public boolean g1;
    public final u9h0 g2;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public v9g0 retainedValuesStore;
    public final ns40 h1;
    public View h2;
    public final xw3 i;
    public final td9 i1;
    public final lx2 i2;
    public final gx2 j;

    /* JADX INFO: renamed from: j1, reason: from kotlin metadata */
    public final pz40 configuration;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final pz40 density;
    public final zbk k1;
    public final View l;

    /* JADX INFO: renamed from: l1, reason: from kotlin metadata */
    public final iw2 autofill;
    public final ypq m;

    /* JADX INFO: renamed from: m1, reason: from kotlin metadata */
    public final jw2 autofillManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public CoroutineContext coroutineContext;
    public boolean n1;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final wy2 dragAndDropManager;

    /* JADX INFO: renamed from: o1, reason: from kotlin metadata */
    public final eg80 snapshotObserver;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final pz40 isAttached;

    /* JADX INFO: renamed from: p1, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public final zbk q;
    public p33 q1;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final xfx insetsListener;
    public p4e r1;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final e7z root;
    public boolean s1;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final ey40 layoutNodes;
    public final h7k t1;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final oge0 rectManager;
    public long u1;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final wai0 semanticsOwner;
    public final int[] v1;
    public final AndroidComposeViewAccessibilityDelegateCompat w;
    public final float[] w1;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public iy2 contentCaptureManager;
    public final Matrix x1;
    public final rz2 y;
    public final float[] y1;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final w55 autofillTree;
    public final float[] z1;

    public AndroidComposeView(Context context, skd skdVar) {
        k6z k6zVar;
        super(context);
        this._composeViewContext = e.e(skdVar);
        this.b = 9205357640488583168L;
        byte b = 1;
        this.c = true;
        this.retainedValuesStore = rv00.p;
        this.i = new xw3();
        byte b2 = 0;
        this.j = new gx2(this, b2);
        this.density = e.d(q8a.e(context), ujn.A);
        this.m = new ypq(this, this);
        this.coroutineContext = skdVar.c().k();
        this.dragAndDropManager = new wy2();
        this.isAttached = e.e(Boolean.FALSE);
        byte b3 = 2;
        this.q = jgk0.b(new bx2(this, b3));
        this.insetsListener = new xfx();
        e7z e7zVar = new e7z(3);
        e7zVar.d0(neg0.c);
        e7zVar.a0(getDensity());
        e7zVar.f0(getViewConfiguration());
        e7zVar.e0(new nx2(this).e(((ypq) getFocusOwner()).e).e(getDragAndDropManager().c));
        this.root = e7zVar;
        ey40 ey40Var = hkx.f13229a;
        this.layoutNodes = new ey40();
        this.rectManager = new oge0(m17getLayoutNodes(), this);
        this.semanticsOwner = new wai0(getRoot(), new vun(), m17getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.w = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new iy2(this, new f8(0, this, cy2.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, (byte) 8));
        this.y = new rz2(this);
        this.autofillTree = new w55();
        this.A = new vy40();
        this.h1 = new ns40();
        e7z root = getRoot();
        td9 td9Var = new td9();
        td9Var.b = root;
        td9Var.c = new oaw((rdx) root.h1.d);
        td9Var.d = new pv00((byte) 13);
        td9Var.e = new raw();
        this.i1 = td9Var;
        this.configuration = e.e(new Configuration(context.getResources().getConfiguration()));
        this.k1 = jgk0.b(new bx2(this, (byte) 3));
        this.autofill = c() ? new iw2(this, getAutofillTree()) : null;
        this.autofillManager = c() ? new jw2(new j910(context), getSemanticsOwner(), this, getRectManager(), context.getPackageName()) : null;
        this.snapshotObserver = new eg80(new ax2(this, b));
        this.t1 = new h7k(getRoot());
        this.u1 = 9223372034707292159L;
        this.v1 = new int[]{0, 0};
        this.w1 = ui30.a();
        this.x1 = new Matrix();
        this.y1 = ui30.a();
        this.z1 = ui30.a();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.C1 = 9187343241974906880L;
        this.G1 = new AtomicReference(null);
        this.fontFamilyResolver = skdVar.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = spq.f32599a;
        if (layoutDirection != 0) {
            k6zVar = layoutDirection != 1 ? null : k6z.b;
        } else {
            k6zVar = k6z.f17794a;
        }
        this.layoutDirection = e.e(k6zVar == null ? k6z.f17794a : k6zVar);
        this.modifierLocalManager = new qm40(this);
        this.P1 = new fck0((byte) 17);
        this.Q1 = new vy40();
        this.R1 = Float.NaN;
        this.S1 = Float.NaN;
        this.U1 = Float.NaN;
        this.V1 = Float.NaN;
        this.W1 = new mx2(this, b2);
        this.X1 = new gx2(this, b);
        this.playNavigationSoundEffect = new f42(this, b);
        this.a2 = new qo8(context, new ax2(this, b3));
        this.b2 = new bx2(this, (byte) 4);
        this.c2 = new bx2(this, b2);
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            by2.f3399a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        rgu0.o(this, androidComposeViewAccessibilityDelegateCompat);
        setOnDragListener(getDragAndDropManager());
        if (i >= 29) {
            wx2.f39911a.a(this);
        }
        if (m()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.l = view;
            addView(view, -1);
        }
        this.g2 = i >= 31 ? new u9h0() : null;
        this.i2 = new lx2(this);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void d(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).v();
            } else if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt);
            }
        }
    }

    public static long e(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            g2t0 g2t0Var = h2t0.b;
            return size;
        }
        if (mode == 0) {
            g2t0 g2t0Var2 = h2t0.b;
            return 2147483647L;
        }
        if (mode != 1073741824) {
            v4i0.e();
            return 0L;
        }
        long j = size;
        g2t0 g2t0Var3 = h2t0.b;
        return j | (j << 32);
    }

    public static final boolean g(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    private final b6a getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    @lbk
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    private final q8q0 getLegacyTextInputServiceAndroid() {
        q8q0 q8q0Var = this.E1;
        if (q8q0Var != null) {
            return q8q0Var;
        }
        q8q0 q8q0Var2 = new q8q0(getView(), this, new ex2(this, (byte) 0));
        this.E1 = q8q0Var2;
        return q8q0Var2;
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m14getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @lbk
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    private final skd get_composeViewContext() {
        return (skd) ((hgk0) this._composeViewContext).getValue();
    }

    public static void j(e7z e7zVar) {
        e7zVar.E();
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            j((e7z) objArr[i2]);
        }
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean n(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !os40.f25767a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        ((hgk0) this.isAttached).setValue(Boolean.valueOf(z));
    }

    private void setDensity(w6k w6kVar) {
        ((hgk0) this.density).setValue(w6kVar);
    }

    private void setLayoutDirection(k6z k6zVar) {
        ((hgk0) this.layoutDirection).setValue(k6zVar);
    }

    private final void set_composeViewContext(skd skdVar) {
        ((hgk0) this._composeViewContext).setValue(skdVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    public final void A(ViewStructure viewStructure) {
        jw2 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            e7z e7zVar = autofillManager.b.f38828a;
            AutofillId autofillId = autofillManager.g;
            String str = autofillManager.e;
            oge0 oge0Var = autofillManager.d;
            wdx.c0(viewStructure, e7zVar, autofillId, str, oge0Var);
            Object[] objArr = w960.f38764a;
            vy40 vy40Var = new vy40(2);
            vy40Var.a(e7zVar);
            vy40Var.a(viewStructure);
            while (vy40Var.j()) {
                Object objL = vy40Var.l(vy40Var.b - 1);
                objL.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objL;
                Object objL2 = vy40Var.l(vy40Var.b - 1);
                objL2.getClass();
                ty40 ty40Var = (ty40) ((e7z) objL2).o();
                int i = ((xz40) ty40Var.b).c;
                for (int i2 = 0; i2 < i; i2++) {
                    e7z e7zVar2 = (e7z) ty40Var.get(i2);
                    if (!e7zVar2.s1 && e7zVar2.I() && e7zVar2.J()) {
                        nai0 nai0VarX = e7zVar2.x();
                        if (nai0VarX != null) {
                            hz40 hz40Var = nai0VarX.f23193a;
                            if (hz40Var.b(mai0.g) || hz40Var.b(mai0.h) || hz40Var.b(xai0.r) || hz40Var.b(xai0.s) || (Build.VERSION.SDK_INT >= 34 && hz40Var.b(epv0.n))) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                wdx.c0(viewStructureNewChild, e7zVar2, autofillManager.g, str, oge0Var);
                                vy40Var.a(e7zVar2);
                                vy40Var.a(viewStructureNewChild);
                            } else {
                                vy40Var.a(e7zVar2);
                                vy40Var.a(viewStructure2);
                            }
                        } else {
                            vy40Var.a(e7zVar2);
                            vy40Var.a(viewStructure2);
                        }
                    }
                }
            }
        }
        iw2 autofill = getAutofill();
        if (autofill != null) {
            w55 w55Var = autofill.b;
            LinkedHashMap linkedHashMap = w55Var.f38568a;
            LinkedHashMap linkedHashMap2 = w55Var.f38568a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    hny.b();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                viewStructureNewChild2.setAutofillId(autofill.c, iIntValue);
                viewStructureNewChild2.setId(iIntValue, autofill.f15469a.getContext().getPackageName(), null, null);
                viewStructureNewChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    public final void B() {
        if (this.B1) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            D();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.v1;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.C1 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void C(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        D();
        float x = motionEvent.getX();
        long jB = ui30.b((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), this.y1);
        this.C1 = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L);
    }

    public final void D() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.y1;
        int[] iArr = this.v1;
        if (i >= 29) {
            jk9.f16656a.a(this, fArr, this.x1, iArr);
        } else {
            ui30.d(fArr);
            ro4.l0(this, fArr, this.w1, iArr);
        }
        d7x.C(fArr, this.z1);
    }

    public final boolean E() {
        if (ebc.f7512a) {
            if (isFocused()) {
                return true;
            }
        } else if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void F(Function0 function0) {
        xw3 xw3Var = this.i;
        boolean zIsEmpty = xw3Var.isEmpty();
        xw3Var.addLast(function0);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.j);
            } else {
                jf4.o("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void G(e7z e7zVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (e7zVar != null) {
            while (e7zVar != null && e7zVar.s() == c7z.f3886a) {
                if (!this.s1) {
                    e7z e7zVarV = e7zVar.v();
                    if (e7zVarV == null) {
                        break;
                    }
                    long j = ((rdx) e7zVarV.h1.d).d;
                    if (p4e.g(j) && p4e.f(j)) {
                        break;
                    }
                }
                e7zVar = e7zVar.v();
            }
            if (e7zVar == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long H(long j) {
        B();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.C1 >> 32));
        return ui30.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.C1 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.z1);
    }

    public final int I(MotionEvent motionEvent) {
        Object obj;
        if (this.d2) {
            this.d2 = false;
            yez yezVar = getComposeViewContext().t;
            ((hgk0) shv0.f32234a).setValue(new kpa0(motionEvent.getMetaState()));
        }
        ns40 ns40Var = this.h1;
        zn00 zn00VarC = ns40Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        td9 td9Var = this.i1;
        if (zn00VarC == null) {
            if (!td9Var.f33756a) {
                ((u710) ((pv00) td9Var.d).f27640a).a();
                ((oaw) td9Var.c).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) zn00VarC.f44650a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = arrayList.get(size);
            if (((fpa0) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        fpa0 fpa0Var = (fpa0) obj;
        if (fpa0Var != null) {
            this.b = fpa0Var.d;
        }
        int iF = td9Var.f(zn00VarC, this, o(motionEvent));
        zn00VarC.b = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iF & 1) != 0) {
            return iF;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        ns40Var.c.delete(pointerId);
        ns40Var.b.delete(pointerId);
        return iF;
    }

    public final void J(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jR = r((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jR >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jR & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        zn00 zn00VarC = this.h1.c(motionEventObtain, this);
        zn00VarC.getClass();
        this.i1.f(zn00VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void K(Function2 function2, zje zjeVar) {
        ox2 ox2Var;
        if (zjeVar instanceof ox2) {
            ox2Var = (ox2) zjeVar;
            int i = ox2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ox2Var.k = i - Integer.MIN_VALUE;
            } else {
                ox2Var = new ox2(this, zjeVar);
            }
        } else {
            ox2Var = new ox2(this, zjeVar);
        }
        Object obj = ox2Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ox2Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            ax2 ax2Var = new ax2(this, (byte) 0);
            ox2Var.k = 1;
            if (d5c.J(ox2Var, new pnd0((byte) 11, null, this.G1, ax2Var, function2)) == wneVar) {
                return;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            z1x.P(obj);
        }
        csj.b();
    }

    public final void L(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (Intrinsics.d(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(q8a.e(getContext()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final void M() {
        boolean z;
        int i;
        int[] iArr = this.v1;
        getLocationOnScreen(iArr);
        long j = this.u1;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.lastMatrixRecalculationAnimationTime >= 0) {
            z = false;
        } else {
            this.u1 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                xz40 xz40VarA = getRoot().A();
                Object[] objArr = xz40VarA.f41739a;
                int i5 = xz40VarA.c;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((e7z) objArr[i6]).i1.p.N0();
                }
                z = true;
            }
        }
        B();
        View rootView = this.h2;
        if (rootView == null) {
            rootView = getRootView();
            this.h2 = rootView;
        }
        oge0 rectManager = getRectManager();
        long j3 = this.u1;
        long J = x1x.J(this.C1);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.y1;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
        }
        vn00 vn00Var = rectManager.d;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.g = vn00Var.b(j3, J, fArr, width, height) || rectManager.g;
        this.t1.e(z);
        getRectManager().a();
    }

    public final void N(float f) {
        if (m()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.R1) || f > this.R1) {
                    this.R1 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.S1) || f < this.S1) {
                    this.S1 = f;
                }
            }
        }
    }

    @Override // a.upq
    public final void a(nqq nqqVar, nqq nqqVar2) {
        tzi tziVar;
        boolean z;
        tzi tziVar2;
        boolean z2;
        if (nqqVar != null) {
            nqq nqqVar3 = nqqVar;
            if (!nqqVar3.f20279a.n) {
                xcx.b("visitAncestors called on an unattached node");
            }
            lm40 lm40Var = nqqVar3.f20279a;
            e7z e7zVarZ = vcc.Z(nqqVar);
            iz40 iz40Var = null;
            ArrayList arrayList = null;
            while (e7zVarZ != null) {
                if ((((lm40) e7zVarZ.h1.g).d & 2097152) != 0) {
                    while (lm40Var != null) {
                        if ((lm40Var.c & 2097152) != 0) {
                            lm40 lm40VarV = lm40Var;
                            xz40 xz40Var = null;
                            while (lm40VarV != null) {
                                if (lm40VarV instanceof h7x) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(lm40VarV);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (lm40VarV.c & 2097152) != 0 && (lm40VarV instanceof f3k)) {
                                    int i = 0;
                                    for (lm40 lm40Var2 = ((f3k) lm40VarV).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                                        if ((lm40Var2.c & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                lm40VarV = lm40Var2;
                                            } else {
                                                if (xz40Var == null) {
                                                    xz40Var = new xz40(new lm40[16]);
                                                }
                                                if (lm40VarV != null) {
                                                    xz40Var.b(lm40VarV);
                                                    lm40VarV = null;
                                                }
                                                xz40Var.b(lm40Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lm40VarV = vcc.V(xz40Var);
                            }
                        }
                        lm40Var = lm40Var.e;
                    }
                }
                e7zVarZ = e7zVarZ.v();
                lm40Var = (e7zVarZ == null || (tziVar2 = e7zVarZ.h1) == null) ? null : (wso0) tziVar2.f;
            }
            if (arrayList == null) {
                return;
            }
            if (nqqVar2 != null) {
                if (!nqqVar2.f20279a.n) {
                    xcx.b("visitAncestors called on an unattached node");
                }
                lm40 lm40Var3 = nqqVar2.f20279a;
                e7z e7zVarZ2 = vcc.Z(nqqVar2);
                iz40 iz40Var2 = null;
                while (e7zVarZ2 != null) {
                    if ((((lm40) e7zVarZ2.h1.g).d & 2097152) != 0) {
                        while (lm40Var3 != null) {
                            if ((lm40Var3.c & 2097152) != 0) {
                                lm40 lm40VarV2 = lm40Var3;
                                xz40 xz40Var2 = null;
                                while (lm40VarV2 != null) {
                                    if (lm40VarV2 instanceof h7x) {
                                        if (iz40Var2 == null) {
                                            iz40 iz40Var3 = v1h0.f36630a;
                                            iz40Var2 = new iz40();
                                        }
                                        iz40Var2.a(lm40VarV2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (lm40VarV2.c & 2097152) != 0 && (lm40VarV2 instanceof f3k)) {
                                        int i2 = 0;
                                        for (lm40 lm40Var4 = ((f3k) lm40VarV2).p; lm40Var4 != null; lm40Var4 = lm40Var4.f) {
                                            if ((lm40Var4.c & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    lm40VarV2 = lm40Var4;
                                                } else {
                                                    if (xz40Var2 == null) {
                                                        xz40Var2 = new xz40(new lm40[16]);
                                                    }
                                                    if (lm40VarV2 != null) {
                                                        xz40Var2.b(lm40VarV2);
                                                        lm40VarV2 = null;
                                                    }
                                                    xz40Var2.b(lm40Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    lm40VarV2 = vcc.V(xz40Var2);
                                }
                            }
                            lm40Var3 = lm40Var3.e;
                        }
                    }
                    e7zVarZ2 = e7zVarZ2.v();
                    lm40Var3 = (e7zVarZ2 == null || (tziVar = e7zVarZ2.h1) == null) ? null : (wso0) tziVar.f;
                }
                iz40Var = iz40Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                h7x h7xVar = (h7x) arrayList.get(i3);
                if (!(iz40Var != null ? iz40Var.c(h7xVar) : false)) {
                    h7xVar.z0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (!ebc.f7512a) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        nqq nqqVar = ((ypq) getFocusOwner()).c;
        if (!nqqVar.n) {
            return;
        }
        if (!nqqVar.f20279a.n) {
            xcx.b("visitSubtreeIf called on an unattached node");
        }
        xz40 xz40Var = new xz40(new lm40[16]);
        lm40 lm40Var = nqqVar.f20279a;
        lm40 lm40Var2 = lm40Var.f;
        if (lm40Var2 == null) {
            vcc.v(xz40Var, lm40Var);
        } else {
            xz40Var.b(lm40Var2);
        }
        while (true) {
            int i3 = xz40Var.c;
            if (i3 == 0) {
                return;
            }
            lm40 lm40Var3 = (lm40) xz40Var.k(i3 - 1);
            if ((lm40Var3.d & 1024) != 0) {
                for (lm40 lm40Var4 = lm40Var3; lm40Var4 != null && lm40Var4.n; lm40Var4 = lm40Var4.f) {
                    if ((lm40Var4.c & 1024) != 0) {
                        lm40 lm40VarV = lm40Var4;
                        xz40 xz40Var2 = null;
                        while (lm40VarV != null) {
                            int i4 = 0;
                            if (lm40VarV instanceof nqq) {
                                nqq nqqVar2 = (nqq) lm40VarV;
                                if (nqqVar2.n && nqqVar2.b1().f1309a) {
                                    super.addFocusables(arrayList, i, i2);
                                    nqq nqqVar3 = ((ypq) getFocusOwner()).c;
                                    if (nqqVar3.n) {
                                        if (!nqqVar3.f20279a.n) {
                                            xcx.b("visitSubtreeIf called on an unattached node");
                                        }
                                        xz40 xz40Var3 = new xz40(new lm40[16]);
                                        lm40 lm40Var5 = nqqVar3.f20279a;
                                        lm40 lm40Var6 = lm40Var5.f;
                                        if (lm40Var6 == null) {
                                            vcc.v(xz40Var3, lm40Var5);
                                        } else {
                                            xz40Var3.b(lm40Var6);
                                        }
                                        while (true) {
                                            int i5 = xz40Var3.c;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            lm40 lm40Var7 = (lm40) xz40Var3.k(i5 - 1);
                                            if ((lm40Var7.d & 1024) != 0) {
                                                for (lm40 lm40Var8 = lm40Var7; lm40Var8 != null && lm40Var8.n; lm40Var8 = lm40Var8.f) {
                                                    if ((lm40Var8.c & 1024) != 0) {
                                                        lm40 lm40VarV2 = lm40Var8;
                                                        xz40 xz40Var4 = null;
                                                        while (lm40VarV2 != null) {
                                                            if (lm40VarV2 instanceof nqq) {
                                                                nqq nqqVar4 = (nqq) lm40VarV2;
                                                                if (nqqVar4.n) {
                                                                    aqq aqqVarB1 = nqqVar4.b1();
                                                                    if (nqqVar4.n && !nqqVar4.o && aqqVarB1.f1309a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((lm40VarV2.c & 1024) != 0 && (lm40VarV2 instanceof f3k)) {
                                                                int i6 = 0;
                                                                for (lm40 lm40Var9 = ((f3k) lm40VarV2).p; lm40Var9 != null; lm40Var9 = lm40Var9.f) {
                                                                    if ((lm40Var9.c & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            lm40VarV2 = lm40Var9;
                                                                        } else {
                                                                            if (xz40Var4 == null) {
                                                                                xz40Var4 = new xz40(new lm40[16]);
                                                                            }
                                                                            if (lm40VarV2 != null) {
                                                                                xz40Var4.b(lm40VarV2);
                                                                                lm40VarV2 = null;
                                                                            }
                                                                            xz40Var4.b(lm40Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            lm40VarV2 = vcc.V(xz40Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            vcc.v(xz40Var3, lm40Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                for (lm40 lm40Var10 = ((f3k) lm40VarV).p; lm40Var10 != null; lm40Var10 = lm40Var10.f) {
                                    if ((lm40Var10.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lm40VarV = lm40Var10;
                                        } else {
                                            if (xz40Var2 == null) {
                                                xz40Var2 = new xz40(new lm40[16]);
                                            }
                                            if (lm40VarV != null) {
                                                xz40Var2.b(lm40VarV);
                                                lm40VarV = null;
                                            }
                                            xz40Var2.b(lm40Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            lm40VarV = vcc.V(xz40Var2);
                        }
                    }
                }
            }
            vcc.v(xz40Var, lm40Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        nai0 nai0VarX;
        Function1 function1;
        Function1 function2;
        if (c()) {
            jw2 autofillManager = getAutofillManager();
            if (autofillManager != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    AutofillValue autofillValueI = y6.i(sparseArray.get(iKeyAt));
                    e7z e7zVar = (e7z) autofillManager.b.c.b(iKeyAt);
                    if (e7zVar != null && (nai0VarX = e7zVar.x()) != null) {
                        hz40 hz40Var = nai0VarX.f23193a;
                        Object objG = hz40Var.g(mai0.g);
                        if (objG == null) {
                            objG = null;
                        }
                        m6 m6Var = (m6) objG;
                        if (m6Var != null && (function2 = (Function1) m6Var.b) != null) {
                        }
                        Object objG2 = hz40Var.g(mai0.h);
                        m6 m6Var2 = (m6) (objG2 != null ? objG2 : null);
                        if (m6Var2 != null && (function1 = (Function1) m6Var2.b) != null) {
                        }
                    }
                }
            }
            iw2 autofill = getAutofill();
            if (autofill != null) {
                w55 w55Var = autofill.b;
                if (w55Var.f38568a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int iKeyAt2 = sparseArray.keyAt(i2);
                    AutofillValue autofillValueI2 = y6.i(sparseArray.get(iKeyAt2));
                    if (autofillValueI2.isText()) {
                        autofillValueI2.getTextValue().toString();
                        if (w55Var.f38568a.get(Integer.valueOf(iKeyAt2)) != null) {
                            hny.b();
                            return;
                        }
                    } else {
                        if (autofillValueI2.isDate()) {
                            throw new q660("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (autofillValueI2.isList()) {
                            throw new q660("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (autofillValueI2.isToggle()) {
                            throw new q660("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    public final void b(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.w;
        if (Intrinsics.d(str, androidComposeViewAccessibilityDelegateCompat.Z)) {
            int iD2 = androidComposeViewAccessibilityDelegateCompat.B.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!Intrinsics.d(str, androidComposeViewAccessibilityDelegateCompat.f1) || (iD = androidComposeViewAccessibilityDelegateCompat.Y.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.w.m(i, this.b, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.w.m(i, this.b, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vy40 vy40Var = this.A;
        if (!isAttachedToWindow()) {
            j(getRoot());
        }
        s(true);
        xfk0.h().m();
        this.f1 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            b6a canvasHolder = getCanvasHolder();
            uw2 uw2Var = canvasHolder.f2042a;
            Canvas canvas2 = uw2Var.f36374a;
            uw2Var.f36374a = canvas;
            getRoot().j(uw2Var, null);
            canvasHolder.f2042a.f36374a = canvas2;
            if (vy40Var.j()) {
                int i = vy40Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((gfv) ((bg80) vy40Var.g(i2))).g();
                }
            }
            int i3 = qhu0.f28759a;
            vy40Var.d();
            this.f1 = false;
            Trace.endSection();
            vy40 vy40Var2 = this.B;
            if (vy40Var2 != null) {
                vy40Var.b(vy40Var2);
                vy40Var2.d();
            }
            if (m()) {
                if (Float.compare(this.R1, this.U1) != 0) {
                    float f = this.R1;
                    this.U1 = f;
                    pa3.a(this, f);
                }
                View view = this.l;
                if (view != null) {
                    if (Float.compare(this.S1, this.V1) != 0) {
                        float f2 = this.S1;
                        this.V1 = f2;
                        pa3.a(view, f2);
                    }
                    if (!Float.isNaN(this.S1)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.R1 = Float.NaN;
                this.S1 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r44) {
        /*
            Method dump skipped, instruction units count: 2047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0163, code lost:
    
        if (p(r25) == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((ypq) getFocusOwner()).f(keyEvent, new mc((Object) this, (Object) keyEvent, (byte) 22));
        }
        yez yezVar = getComposeViewContext().t;
        ((hgk0) shv0.f32234a).setValue(new kpa0(keyEvent.getMetaState()));
        return ((ypq) getFocusOwner()).f(keyEvent, new v9q((byte) 17)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        tzi tziVar;
        if (isFocused()) {
            ypq ypqVar = (ypq) getFocusOwner();
            if (ypqVar.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                nqq nqqVarZ = uzb.Z(ypqVar.c);
                if (nqqVarZ != null) {
                    if (!nqqVarZ.f20279a.n) {
                        xcx.b("visitAncestors called on an unattached node");
                    }
                    lm40 lm40Var = nqqVarZ.f20279a;
                    e7z e7zVarZ = vcc.Z(nqqVarZ);
                    while (e7zVarZ != null) {
                        if ((((lm40) e7zVarZ.h1.g).d & 131072) != 0) {
                            while (lm40Var != null) {
                                if ((lm40Var.c & 131072) != 0) {
                                    lm40 lm40VarV = lm40Var;
                                    xz40 xz40Var = null;
                                    while (lm40VarV != null) {
                                        if ((lm40VarV.c & 131072) != 0 && (lm40VarV instanceof f3k)) {
                                            int i = 0;
                                            for (lm40 lm40Var2 = ((f3k) lm40VarV).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                                                if ((lm40Var2.c & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        lm40VarV = lm40Var2;
                                                    } else {
                                                        if (xz40Var == null) {
                                                            xz40Var = new xz40(new lm40[16]);
                                                        }
                                                        if (lm40VarV != null) {
                                                            xz40Var.b(lm40VarV);
                                                            lm40VarV = null;
                                                        }
                                                        xz40Var.b(lm40Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        lm40VarV = vcc.V(xz40Var);
                                    }
                                }
                                lm40Var = lm40Var.e;
                            }
                        }
                        e7zVarZ = e7zVarZ.v();
                        lm40Var = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (c()) {
            this.f2 = true;
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                this.f2 = false;
                A(viewStructure);
            } catch (Throwable th) {
                this.f2 = false;
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            vx2.f38181a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object gy4Var;
        nqq nqqVarH;
        if (this.Y1) {
            gx2 gx2Var = this.X1;
            removeCallbacks(gx2Var);
            MotionEvent motionEvent2 = this.N1;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.Y1 = false;
            } else {
                gx2Var.run();
            }
        }
        if (!n(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || p(motionEvent))) {
            int i = i(motionEvent);
            int i2 = 1;
            if ((i & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (gy4Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    gy4Var = new gy4(i2);
                }
                if (gy4Var.equals(new gy4(i2)) && (nqqVarH = ((ypq) getFocusOwner()).h()) != null) {
                    s460 s460VarY = vcc.Y(nqqVarH);
                    if (!k7x.C(s460VarY).w(s460VarY, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((ypq) getFocusOwner()).b(false);
                    }
                }
            }
            if ((i & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final bg80 f(Function2 function2, p460 p460Var, dfv dfvVar) {
        xz40 xz40Var;
        Reference referencePoll;
        Object obj;
        if (dfvVar != null) {
            return new gfv(dfvVar, null, this, function2, p460Var);
        }
        do {
            fck0 fck0Var = this.P1;
            ReferenceQueue referenceQueue = (ReferenceQueue) fck0Var.c;
            xz40Var = (xz40) fck0Var.b;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                xz40Var.j(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i = xz40Var.c;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) xz40Var.k(i - 1)).get();
        } while (obj == null);
        bg80 bg80Var = (bg80) obj;
        if (bg80Var == null) {
            return new gfv(getGraphicsContext().b(), getGraphicsContext(), this, function2, p460Var);
        }
        gfv gfvVar = (gfv) bg80Var;
        afv afvVar = gfvVar.b;
        if (afvVar == null) {
            throw cs0.g("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!gfvVar.f11224a.s) {
            xcx.a("layer should have been released before reuse");
        }
        gfvVar.f11224a = afvVar.b();
        gfvVar.g = false;
        gfvVar.d = function2;
        gfvVar.e = p460Var;
        gfvVar.q = false;
        gfvVar.r = false;
        gfvVar.s = true;
        ui30.d(gfvVar.h);
        float[] fArr = gfvVar.i;
        if (fArr != null) {
            ui30.d(fArr);
        }
        gfvVar.o = ils0.b;
        gfvVar.t = false;
        gfvVar.f = 9223372034707292159L;
        gfvVar.p = null;
        gfvVar.n = 0;
        return bg80Var;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return uc9.S(this, accessibilityId);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        jge0 jge0VarA;
        if (view == null || this.t1.b) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !cy2.y(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            nqq nqqVarZ = uzb.Z(((ypq) getFocusOwner()).c);
            jge0VarA = nqqVarZ != null ? uzb.a0(nqqVarZ) : null;
            if (jge0VarA == null) {
                jge0VarA = spq.a(view, this);
            }
        } else {
            jge0VarA = spq.a(view, this);
        }
        jpq jpqVarD = spq.d(i);
        int i2 = jpqVarD != null ? jpqVarD.f16914a : 6;
        mie0 mie0Var = new mie0();
        if (((ypq) getFocusOwner()).g(i2, jge0VarA, new cx2(mie0Var, (byte) 0)) == null) {
            return view;
        }
        Object obj = mie0Var.f21842a;
        if (obj != null) {
            if (viewFindNextFocus != null) {
                if (i2 == 1 || i2 == 2) {
                    if (!ebc.f7512a) {
                        return super.focusSearch(view, i);
                    }
                } else if (k7n0.y(uzb.a0((nqq) obj), spq.a(viewFindNextFocus, this), jge0VarA, i2)) {
                }
            }
            return this;
        }
        if (viewFindNextFocus == null) {
            return super.focusSearch(view, i);
        }
        return viewFindNextFocus;
    }

    @Override // a.cg80
    public w6 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final p33 getAndroidViewsHandler$ui() {
        if (this.q1 == null) {
            p33 p33Var = new p33(getContext());
            this.q1 = p33Var;
            addView(p33Var, -1);
            requestLayout();
        }
        p33 p33Var2 = this.q1;
        p33Var2.getClass();
        return p33Var2;
    }

    @Override // a.cg80
    public w55 getAutofillTree() {
        return this.autofillTree;
    }

    @Override // a.cg80
    public iuc getClipboard() {
        return getComposeViewContext().n;
    }

    @Override // a.cg80
    public kuc getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final skd getComposeViewContext() {
        return get_composeViewContext();
    }

    /* JADX INFO: renamed from: getComposeViewContextIncrementedDuringInit$ui, reason: from getter */
    public final boolean getComposeViewContextIncrementedDuringInit() {
        return this.composeViewContextIncrementedDuringInit;
    }

    public final Configuration getConfiguration() {
        return (Configuration) ((hgk0) this.configuration).getValue();
    }

    /* JADX INFO: renamed from: getContentCaptureManager$ui, reason: from getter */
    public final iy2 getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // a.cg80
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // a.cg80
    public w6k getDensity() {
        return (w6k) ((hgk0) this.density).getValue();
    }

    @Override // a.sv90
    public jge0 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            nqq nqqVarZ = uzb.Z(((ypq) getFocusOwner()).c);
            if (nqqVarZ != null) {
                return uzb.a0(nqqVarZ);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return spq.a(viewFindFocus, this);
        }
        return null;
    }

    @Override // a.cg80
    public wpq getFocusOwner() {
        return this.m;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        jge0 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f16474a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (Intrinsics.d(((ypq) getFocusOwner()).g(6, null, new xd2((byte) 25)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // a.cg80
    public mrq getFontFamilyResolver() {
        return (mrq) this.fontFamilyResolver.getValue();
    }

    @Override // a.cg80
    public hrq getFontLoader() {
        return getComposeViewContext().o;
    }

    /* JADX INFO: renamed from: getFrameEndScheduler$ui, reason: from getter */
    public final jlz getFrameEndScheduler() {
        return this.frameEndScheduler;
    }

    @Override // a.cg80
    public afv getGraphicsContext() {
        return this.y;
    }

    @Override // a.cg80
    public omv getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return ((oif0) this.t1.e).E() || !this.i.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // a.cg80
    public bfx getInputModeManager() {
        bfx bfxVar = this.K1;
        if (bfxVar == null) {
            bfxVar = new bfx(isInTouchMode() ? 1 : 2);
            this.K1 = bfxVar;
        }
        return bfxVar;
    }

    public final xfx getInsetsListener() {
        return this.insetsListener;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, a.cg80
    public k6z getLayoutDirection() {
        return (k6z) ((hgk0) this.layoutDirection).getValue();
    }

    @Override // a.cg80
    public rs00 getLocaleList() {
        return (rs00) this.k1.getValue();
    }

    public long getMeasureIteration() {
        if (this.t1.b) {
            return 1L;
        }
        xcx.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    @Override // a.cg80
    public qm40 getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // a.cg80
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // a.cg80
    public ou90 getPlacementScope() {
        er90 er90Var = qu90.f29337a;
        return new d810(this, (byte) 1);
    }

    public final Function2<jpq, Boolean, Unit> getPlayNavigationSoundEffect$ui() {
        return this.playNavigationSoundEffect;
    }

    @Override // a.cg80
    public cpa0 getPointerIconService() {
        return this.i2;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name and from getter */
    public final v6x getPrimaryDirectionalMotionAxisOverride() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    @Override // a.cg80
    public oge0 getRectManager() {
        return this.rectManager;
    }

    @Override // a.cg80
    public v9g0 getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // a.cg80
    public e7z getRoot() {
        return this.root;
    }

    public final owk getSavedStateRegistry() {
        owk owkVar = this.g;
        if (owkVar != null) {
            return owkVar;
        }
        skd composeViewContext = getComposeViewContext();
        composeViewContext.g();
        i0h0 i0h0Var = composeViewContext.e;
        i0h0Var.getClass();
        Object parent = getParent();
        parent.getClass();
        View view = (View) parent;
        Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
        LinkedHashMap linkedHashMap = null;
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view.getId());
        }
        String strK = kng0.k("SaveableStateRegistry:", strValueOf);
        kd30 kd30VarH = i0h0Var.h();
        Bundle bundleH = kd30VarH.H(strK);
        if (bundleH != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str : bundleH.keySet()) {
                ArrayList parcelableArrayList = bundleH.getParcelableArrayList(str);
                parcelableArrayList.getClass();
                linkedHashMap.put(str, parcelableArrayList);
            }
        }
        vbk vbkVar = new vbk((byte) 20);
        zfn zfnVar = hzg0.f13904a;
        gzg0 gzg0Var = new gzg0(linkedHashMap, vbkVar);
        boolean z = false;
        if (kd30VarH.L(strK) == null) {
            try {
                kd30VarH.S(strK, new ufd(gzg0Var, (byte) 1));
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        owk owkVar2 = new owk(gzg0Var, new lf2(z, (Object) kd30VarH, (Object) strK, (byte) 6));
        this.g = owkVar2;
        return owkVar2;
    }

    public final boolean getScrollCaptureInProgress() {
        u9h0 u9h0Var;
        if (Build.VERSION.SDK_INT >= 31 && (u9h0Var = this.g2) != null && ((Boolean) ((hgk0) u9h0Var.f35284a).getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AndroidComposeView) {
                return ((AndroidComposeView) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    @Override // a.cg80
    public wai0 getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // a.cg80
    public g7z getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    @Override // a.cg80
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? ka3.f17944a.a(this) : this.showLayoutBounds;
    }

    @Override // a.cg80
    public eg80 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // a.cg80
    public pkk0 getSoftwareKeyboardController() {
        r3k r3kVar = this.H1;
        if (r3kVar != null) {
            return r3kVar;
        }
        r3k r3kVar2 = new r3k(getTextInputService());
        this.H1 = r3kVar2;
        return r3kVar2;
    }

    @Override // a.cg80
    public o8q0 getTextInputService() {
        o8q0 o8q0Var = this.F1;
        if (o8q0Var != null) {
            return o8q0Var;
        }
        o8q0 o8q0Var2 = new o8q0(getLegacyTextInputServiceAndroid());
        this.F1 = o8q0Var2;
        return o8q0Var2;
    }

    @Override // a.cg80
    public aaq0 getTextToolbar() {
        k23 k23Var = this.M1;
        if (k23Var != null) {
            return k23Var;
        }
        k23 k23Var2 = new k23();
        new w5z(new a13(k23Var2, (byte) 4));
        caq0[] caq0VarArr = caq0.f4025a;
        this.M1 = k23Var2;
        return k23Var2;
    }

    public final keg0 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public View getView() {
        return this;
    }

    @Override // a.cg80
    public wgu0 getViewConfiguration() {
        return getComposeViewContext().r;
    }

    @Override // a.cg80
    public rhv0 getWindowInfo() {
        return getComposeViewContext().t;
    }

    public final void h(e7z e7zVar, boolean z) {
        this.t1.k(e7zVar, z);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:103:0x014b A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0150  */
    /* JADX WARN: Code duplicated, block: B:107:0x015a  */
    /* JADX WARN: Code duplicated, block: B:108:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0163 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0175 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0178 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0189 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #3 {all -> 0x007b, blocks: (B:14:0x0039, B:16:0x0043, B:22:0x0053, B:38:0x0082, B:40:0x0086, B:41:0x0098, B:50:0x00ab, B:52:0x00b1, B:119:0x0189, B:120:0x0195, B:25:0x005b, B:31:0x0067, B:34:0x006f), top: B:149:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01af A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:121:0x0199, B:124:0x01a3, B:126:0x01a7, B:128:0x01af, B:130:0x01b9, B:129:0x01b2), top: B:147:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b2 A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:121:0x0199, B:124:0x01a3, B:126:0x01a7, B:128:0x01af, B:130:0x01b9, B:129:0x01b2), top: B:147:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0114 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:86:0x011a A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0126 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:91:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0140  */
    public final int i(MotionEvent motionEvent) throws Throwable {
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z;
        AndroidComposeView androidComposeView;
        int i;
        boolean z2;
        MotionEvent motionEvent3;
        int I;
        oaw oawVar;
        AndroidComposeView androidComposeView2;
        MotionEvent motionEvent4;
        int pointerId;
        int action;
        ns40 ns40Var;
        MotionEvent motionEvent5;
        float x;
        float x2;
        boolean z3;
        MotionEvent motionEvent6;
        long eventTime;
        boolean z4;
        oaw oawVar2;
        AndroidComposeView androidComposeView3 = this;
        androidComposeView3.removeCallbacks(androidComposeView3.W1);
        try {
            C(motionEvent);
            androidComposeView3.B1 = true;
            androidComposeView3.s(false);
            hie0 hie0Var = new hie0();
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent7 = androidComposeView3.N1;
                boolean z5 = motionEvent7 != null && motionEvent7.getToolType(0) == 3;
                td9 td9Var = androidComposeView3.i1;
                if (motionEvent7 == null) {
                    motionEvent2 = motionEvent7;
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z5) {
                        androidComposeView = this;
                        i = 9;
                    } else {
                        androidComposeView = this;
                        i = 9;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8) {
                        hie0Var.f13108a = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = androidComposeView.N1;
                    if (motionEvent3 != null) {
                        motionEvent4 = androidComposeView.N1;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        ns40Var = androidComposeView.h1;
                        if (action == i) {
                            if (motionEvent.getAction() == 0) {
                                motionEvent5 = androidComposeView.N1;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent8 = androidComposeView.N1;
                                if (motionEvent8 != null) {
                                }
                                x2 = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x == x2) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                motionEvent6 = androidComposeView.N1;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (pointerId >= 0) {
                                        ns40Var.c.delete(pointerId);
                                        ns40Var.b.delete(pointerId);
                                    }
                                    oawVar2 = (oaw) td9Var.c;
                                    if (oawVar2.d) {
                                        oawVar2.d = true;
                                    } else {
                                        oawVar2.g.f40250a.g();
                                    }
                                } else {
                                    if (pointerId >= 0) {
                                        ns40Var.c.delete(pointerId);
                                        ns40Var.b.delete(pointerId);
                                    }
                                    oawVar2 = (oaw) td9Var.c;
                                    if (oawVar2.d) {
                                        oawVar2.d = true;
                                    } else {
                                        oawVar2.g.f40250a.g();
                                    }
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            motionEvent5 = androidComposeView.N1;
                            if (motionEvent5 != null) {
                                x = motionEvent5.getX();
                            } else {
                                x = Float.NaN;
                            }
                            MotionEvent motionEvent9 = androidComposeView.N1;
                            if (motionEvent9 != null) {
                            }
                            x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            if (x == x2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            motionEvent6 = androidComposeView.N1;
                            if (motionEvent6 != null) {
                                eventTime = motionEvent6.getEventTime();
                            } else {
                                eventTime = -1;
                            }
                            if (eventTime != motionEvent.getEventTime()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z3) {
                                if (pointerId >= 0) {
                                    ns40Var.c.delete(pointerId);
                                    ns40Var.b.delete(pointerId);
                                }
                                oawVar2 = (oaw) td9Var.c;
                                if (oawVar2.d) {
                                    oawVar2.d = true;
                                } else {
                                    oawVar2.g.f40250a.g();
                                }
                            } else {
                                if (pointerId >= 0) {
                                    ns40Var.c.delete(pointerId);
                                    ns40Var.b.delete(pointerId);
                                }
                                oawVar2 = (oaw) td9Var.c;
                                if (oawVar2.d) {
                                    oawVar2.d = true;
                                } else {
                                    oawVar2.g.f40250a.g();
                                }
                            }
                        }
                    }
                    androidComposeView.N1 = MotionEvent.obtainNoHistory(motionEvent);
                    if (hie0Var.f13108a) {
                        androidComposeView.J(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    I = I(motionEvent);
                    Trace.endSection();
                    if ((I & 4) != 0) {
                        androidComposeView2 = this;
                    } else {
                        oawVar = (oaw) td9Var.c;
                        if (oawVar.d) {
                            oawVar.d = true;
                        } else {
                            oawVar.g.f40250a.g();
                        }
                        androidComposeView2 = this;
                        androidComposeView2.J(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    androidComposeView2.B1 = false;
                    return I;
                }
                try {
                    if (!((motionEvent7.getSource() == motionEvent.getSource() && motionEvent7.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                        motionEvent2 = motionEvent7;
                    } else if (motionEvent7.getButtonState() != 0 || (actionMasked = motionEvent7.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        motionEvent2 = motionEvent7;
                        if (!td9Var.f33756a) {
                            ((u710) ((pv00) td9Var.d).f27640a).a();
                            ((oaw) td9Var.c).c();
                        }
                    } else if (motionEvent7.getActionMasked() == 10 || !z5) {
                        motionEvent2 = motionEvent7;
                    } else {
                        androidComposeView3.J(motionEvent7, 10, motionEvent7.getEventTime(), true);
                        motionEvent2 = motionEvent7;
                    }
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z5 || !z || actionMasked2 == 3 || actionMasked2 == 9 || !o(motionEvent)) {
                        androidComposeView = this;
                        i = 9;
                    } else {
                        i = 9;
                        androidComposeView = this;
                        androidComposeView.J(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8 && !z2 && motionEvent2 != null && !motionEvent2.isFromSource(4098)) {
                        hie0Var.f13108a = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = androidComposeView.N1;
                    if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                        motionEvent4 = androidComposeView.N1;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        ns40Var = androidComposeView.h1;
                        if (action == i || motionEvent.getHistorySize() != 0) {
                            if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                motionEvent5 = androidComposeView.N1;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent10 = androidComposeView.N1;
                                float y3 = motionEvent10 != null ? motionEvent10.getY() : Float.NaN;
                                x2 = motionEvent.getX();
                                float y4 = motionEvent.getY();
                                if (x == x2 || y3 != y4) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                motionEvent6 = androidComposeView.N1;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z3 || z4) {
                                    if (pointerId >= 0) {
                                        ns40Var.c.delete(pointerId);
                                        ns40Var.b.delete(pointerId);
                                    }
                                    oawVar2 = (oaw) td9Var.c;
                                    if (oawVar2.d) {
                                        oawVar2.d = true;
                                    } else {
                                        oawVar2.g.f40250a.g();
                                    }
                                }
                            }
                        } else if (pointerId >= 0) {
                            ns40Var.c.delete(pointerId);
                            ns40Var.b.delete(pointerId);
                        }
                    }
                    androidComposeView.N1 = MotionEvent.obtainNoHistory(motionEvent);
                    if (hie0Var.f13108a) {
                        androidComposeView.J(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    I = I(motionEvent);
                    try {
                        Trace.endSection();
                        if ((I & 4) != 0 && hie0Var.f13108a) {
                            oawVar = (oaw) td9Var.c;
                            if (oawVar.d) {
                                oawVar.d = true;
                            } else {
                                oawVar.g.f40250a.g();
                            }
                            androidComposeView2 = this;
                            androidComposeView2.J(motionEvent, 9, motionEvent.getEventTime(), true);
                        } else {
                            androidComposeView2 = this;
                        }
                        androidComposeView2.B1 = false;
                        return I;
                    } catch (Throwable th) {
                        th = th;
                        androidComposeView3 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        androidComposeView3.B1 = false;
        throw th;
    }

    public final void k(e7z e7zVar) {
        this.t1.B(e7zVar, false);
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            k((e7z) objArr[i2]);
        }
    }

    public final boolean o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        v9g0 v9g0Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().I()) {
            getRoot().c(this);
        }
        byte b = 1;
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(uc9.W());
        }
        this.insetsListener.onViewAttachedToWindow(this);
        if (!this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().e();
        }
        int i = 0;
        this.composeViewContextIncrementedDuringInit = false;
        k(getRoot());
        j(getRoot());
        getSnapshotObserver().f7752a.e();
        AndroidComposeView outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            jf4.n("Expected the view to be attached to window.");
            return;
        }
        outOfFrameExecutor.F(new bx2(this, b));
        clz clzVarD = getComposeViewContext().d();
        skd composeViewContext = getComposeViewContext();
        composeViewContext.g();
        riu0 riu0Var = composeViewContext.f;
        jlz jlzVar = this.frameEndScheduler;
        if (clzVarD == null || riu0Var == null || jlzVar == null) {
            v9g0Var = null;
        } else {
            piu0 piu0VarG = riu0Var.g();
            niu0 niu0Var = new niu0();
            vbf vbfVar = vbf.b;
            piu0VarG.getClass();
            vbfVar.getClass();
            h0q0 h0q0Var = new h0q0(piu0VarG, niu0Var, vbfVar);
            sgy sgyVarB = sre0.f32672a.b(llz.class);
            String strV = sgyVarB.v();
            if (strV == null) {
                jf4.o("Local and anonymous classes can not be ViewModels");
                return;
            }
            llz llzVar = (llz) h0q0Var.t(sgyVarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strV));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            ey40 ey40Var = llzVar.b;
            Object objB = ey40Var.b(id);
            if (objB == null) {
                objB = new vy40(1);
                ey40Var.j(id, objB);
            }
            vy40 vy40Var = (vy40) objB;
            Object[] objArr = vy40Var.f38232a;
            int i2 = vy40Var.b;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((klz) obj).c) {
                    break;
                } else {
                    i++;
                }
            }
            klz klzVar = (klz) obj;
            if (klzVar == null) {
                klzVar = new klz();
                vy40Var.a(klzVar);
            }
            klzVar.c = true;
            this.f = klzVar;
            v9g0Var = klzVar.b;
        }
        if (v9g0Var == null) {
            v9g0Var = rv00.p;
        }
        this.retainedValuesStore = v9g0Var;
        Function1 function1 = this.D1;
        if (function1 != null) {
            function1.invoke(getComposeViewContext());
            this.D1 = null;
        }
        glz glzVarX = getComposeViewContext().d().x();
        glzVarX.a(this);
        glzVarX.a(this.contentCaptureManager);
        ((hgk0) getInputModeManager().f2526a).setValue(new zex(isInTouchMode() ? (byte) 1 : (byte) 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            zx2.f45138a.b(this);
        }
        jw2 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ((ypq) getFocusOwner()).g.a(autofillManager);
            getSemanticsOwner().d.a(autofillManager);
        }
        ((ypq) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        bki0 bki0Var = (bki0) this.G1.get();
        c13 c13Var = (c13) (bki0Var != null ? bki0Var.b : null);
        if (c13Var == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        bki0 bki0Var2 = (bki0) c13Var.d.get();
        yex yexVar = (yex) (bki0Var2 != null ? bki0Var2.b : null);
        return yexVar != null && (yexVar.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0140  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0154  */
    /* JADX WARN: Code duplicated, block: B:112:0x0159  */
    /* JADX WARN: Code duplicated, block: B:114:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0164  */
    /* JADX WARN: Code duplicated, block: B:121:0x0193  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection r860Var;
        int i;
        int i2;
        bki0 bki0Var = (bki0) this.G1.get();
        c13 c13Var = (c13) (bki0Var != null ? bki0Var.b : null);
        byte b = 15;
        if (c13Var != null) {
            bki0 bki0Var2 = (bki0) c13Var.d.get();
            yex yexVar = (yex) (bki0Var2 != null ? bki0Var2.b : null);
            if (yexVar == null) {
                return null;
            }
            synchronized (yexVar.c) {
                if (yexVar.e) {
                    return null;
                }
                hge0 hge0VarA = yexVar.f42512a.a(editorInfo);
                adw adwVar = new adw(yexVar, b);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 34) {
                    r860Var = new s860(hge0VarA, adwVar);
                } else {
                    r860Var = i3 >= 25 ? new r860(hge0VarA, adwVar) : new q860(hge0VarA, adwVar);
                }
                yexVar.d.b(new g1v0(r860Var));
                return r860Var;
            }
        }
        q8q0 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.d) {
            return null;
        }
        k3x k3xVar = legacyTextInputServiceAndroid.h;
        a8q0 a8q0Var = legacyTextInputServiceAndroid.g;
        int i4 = k3xVar.e;
        boolean z = k3xVar.f17640a;
        int i5 = 4;
        int i6 = 3;
        if (i4 == 1) {
            i = z ? 6 : 0;
        } else if (i4 == 0) {
            i = 1;
        } else if (i4 == 2) {
            i = 2;
        } else if (i4 == 6) {
            i = 5;
        } else if (i4 == 5) {
            i = 7;
        } else if (i4 == 3) {
            i = 3;
        } else if (i4 == 4) {
            i = 4;
        } else {
            if (i4 != 7) {
                jf4.n("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i7 = k3xVar.d;
        if (i7 != 1) {
            if (i7 == 2) {
                editorInfo.inputType = 1;
                i |= Integer.MIN_VALUE;
                editorInfo.imeOptions = i;
            } else if (i7 == 3) {
                editorInfo.inputType = 2;
                i5 = 2;
            } else {
                if (i7 == 4) {
                    editorInfo.inputType = 3;
                } else {
                    i6 = 17;
                    if (i7 == 5) {
                        editorInfo.inputType = 17;
                    } else if (i7 == 6) {
                        i5 = 33;
                        editorInfo.inputType = 33;
                    } else if (i7 == 7) {
                        i5 = 129;
                        editorInfo.inputType = 129;
                    } else if (i7 == 8) {
                        editorInfo.inputType = 18;
                        i5 = 18;
                    } else if (i7 == 9) {
                        i5 = 8194;
                        editorInfo.inputType = 8194;
                    } else if (i7 == 10) {
                        i5 = 145;
                        editorInfo.inputType = 145;
                    } else if (i7 == 11) {
                        i5 = 113;
                        editorInfo.inputType = 113;
                    } else if (i7 == 12) {
                        i5 = 97;
                        editorInfo.inputType = 97;
                    } else if (i7 == 13) {
                        i5 = 49;
                        editorInfo.inputType = 49;
                    } else if (i7 == 14) {
                        i5 = 65;
                        editorInfo.inputType = 65;
                    } else if (i7 == 15) {
                        i5 = 81;
                        editorInfo.inputType = 81;
                    } else if (i7 == 16) {
                        i5 = 177;
                        editorInfo.inputType = 177;
                    } else if (i7 == 17) {
                        i5 = 193;
                        editorInfo.inputType = 193;
                    } else if (i7 == 18) {
                        editorInfo.inputType = 4;
                    } else {
                        i5 = 20;
                        if (i7 == 19) {
                            editorInfo.inputType = 20;
                        } else if (i7 == 20) {
                            i5 = 36;
                            editorInfo.inputType = 36;
                        } else if (i7 == 21) {
                            i5 = 4098;
                            editorInfo.inputType = 4098;
                        } else if (i7 == 22) {
                            i5 = 12290;
                            editorInfo.inputType = 12290;
                        } else if (i7 == 23) {
                            i5 = 8210;
                            editorInfo.inputType = 8210;
                        } else if (i7 == 24) {
                            i5 = 4114;
                            editorInfo.inputType = 4114;
                        } else {
                            if (i7 != 25) {
                                jf4.n("Invalid Keyboard Type");
                                return null;
                            }
                            i5 = 12306;
                            editorInfo.inputType = 12306;
                        }
                    }
                }
                i5 = i6;
            }
            if (!z && (i5 & 15) == 1) {
                i5 |= 131072;
                editorInfo.inputType = i5;
                if (i4 == 1) {
                    editorInfo.imeOptions = i | 1073741824;
                }
            }
            if ((i5 & 15) == 1) {
                i2 = k3xVar.b;
                if (i2 == 1) {
                    i5 |= 4096;
                    editorInfo.inputType = i5;
                } else if (i2 == 2) {
                    i5 |= 8192;
                    editorInfo.inputType = i5;
                } else if (i2 == 3) {
                    i5 |= 16384;
                    editorInfo.inputType = i5;
                }
                if (k3xVar.c) {
                    editorInfo.inputType = 32768 | i5;
                }
            }
            long j = a8q0Var.b;
            int i8 = o9q0.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            nnw0.H(editorInfo, a8q0Var.f440a.b);
            editorInfo.imeOptions |= 33554432;
            if (qsn.d()) {
                qsn.a().i(editorInfo);
            }
            gge0 gge0Var = new gge0(legacyTextInputServiceAndroid.g, new ilp0(legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
            legacyTextInputServiceAndroid.i.add(new WeakReference(gge0Var));
            return gge0Var;
        }
        editorInfo.inputType = 1;
        i5 = 1;
        if (!z) {
            i5 |= 131072;
            editorInfo.inputType = i5;
            if (i4 == 1) {
                editorInfo.imeOptions = i | 1073741824;
            }
        }
        if ((i5 & 15) == 1) {
            i2 = k3xVar.b;
            if (i2 == 1) {
                i5 |= 4096;
                editorInfo.inputType = i5;
            } else if (i2 == 2) {
                i5 |= 8192;
                editorInfo.inputType = i5;
            } else if (i2 == 3) {
                i5 |= 16384;
                editorInfo.inputType = i5;
            }
            if (k3xVar.c) {
                editorInfo.inputType = 32768 | i5;
            }
        }
        long j3 = a8q0Var.b;
        int i9 = o9q0.c;
        editorInfo.initialSelStart = (int) (j3 >> 32);
        editorInfo.initialSelEnd = (int) (j3 & 4294967295L);
        nnw0.H(editorInfo, a8q0Var.f440a.b);
        editorInfo.imeOptions |= 33554432;
        if (qsn.d()) {
            qsn.a().i(editorInfo);
        }
        gge0 gge0Var2 = new gge0(legacyTextInputServiceAndroid.g, new ilp0(legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
        legacyTextInputServiceAndroid.i.add(new WeakReference(gge0Var2));
        return gge0Var2;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        iy2 iy2Var = this.contentCaptureManager;
        iy2Var.getClass();
        gy2.h(iy2Var, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.insetsListener.onViewDetachedFromWindow(this);
        View view = this.l;
        if (m() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            vy40 vy40Var = m2;
            synchronized (vy40Var) {
                vy40Var.k(this);
            }
        }
        getComposeViewContext().b();
        pgk0 pgk0Var = getSnapshotObserver().f7752a;
        jk8 jk8Var = pgk0Var.h;
        if (jk8Var != null) {
            jk8Var.a();
        }
        pgk0Var.a();
        glz glzVarX = getComposeViewContext().d().x();
        glzVarX.f(this.contentCaptureManager);
        glzVarX.f(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        klz klzVar = this.f;
        if (klzVar != null) {
            klzVar.c = false;
        }
        this.f = null;
        if (i >= 31) {
            zx2.f45138a.a(this);
        }
        jw2 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().d.k(autofillManager);
            ((ypq) getFocusOwner()).g.k(autofillManager);
        }
        oge0 rectManager = getRectManager();
        rectManager.g = rectManager.d.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        oge0 rectManager2 = getRectManager();
        fx2 fx2Var = rectManager2.i;
        if (fx2Var != null) {
            rectManager2.b.removeCallbacks(fx2Var);
            rectManager2.i = null;
        }
        ((ypq) getFocusOwner()).g.k(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        ypq ypqVar = (ypq) getFocusOwner();
        qzb.R0(ypqVar.c, true);
        if (ypqVar.h() != null) {
            nqq nqqVarH = ypqVar.h();
            ypqVar.k(null);
            if (nqqVarH != null) {
                nqqVarH.a1(iqq.f15221a, iqq.c);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        M();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        L(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.lastMatrixRecalculationAnimationTime = 0L;
            this.t1.t(this.b2);
            this.r1 = null;
            M();
            if (this.q1 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        h7k h7kVar = this.t1;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().I()) {
                getRoot().c(this);
            }
            if (!isAttachedToWindow()) {
                k(getRoot());
            }
            long jE = e(i);
            g2t0 g2t0Var = h2t0.b;
            long jE2 = e(i2);
            long jN = lgb.N((int) (jE >>> 32), (int) (jE & 4294967295L), (int) (jE2 >>> 32), (int) (4294967295L & jE2));
            p4e p4eVar = this.r1;
            if (p4eVar == null) {
                this.r1 = new p4e(jN);
                this.s1 = false;
            } else if (!p4e.c(p4eVar.f26347a, jN)) {
                this.s1 = true;
            }
            h7kVar.C(jN);
            h7kVar.v();
            setMeasuredDimension(getRoot().i1.p.f27604a, getRoot().i1.p.b);
            if (this.q1 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().i1.p.f27604a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().i1.p.b, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!c() || viewStructure == null || this.f2) {
            return;
        }
        A(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        bpa0 bpa0Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (bpa0Var = ((lx2) getPointerIconService()).f20793a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return bpa0Var instanceof d13 ? PointerIcon.getSystemIcon(context, ((d13) bpa0Var).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // a.qvj
    public final void onResume(clz clzVar) {
        s5a s5aVarV;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(uc9.W());
        }
        klz klzVar = this.f;
        if (klzVar != null) {
            jlz jlzVar = this.frameEndScheduler;
            jlzVar.getClass();
            zn20 zn20Var = (zn20) klzVar.f18514a.b;
            if (!zn20Var.f44653a || zn20Var.c) {
                return;
            }
            try {
                s5aVarV = ((erv0) jlzVar).f8300a.v(new rcz(klzVar, (byte) 7));
            } catch (CancellationException unused) {
                if (!zn20Var.b) {
                    if (zn20Var.c) {
                        esb0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    zn20Var.a();
                    zn20Var.c = true;
                }
                s5aVarV = null;
            }
            s5a s5aVar = klzVar.d;
            if (s5aVar != null) {
                s5aVar.cancel();
            }
            klzVar.d = s5aVarV;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        k6z k6zVar;
        if (this.c) {
            int[] iArr = spq.f32599a;
            if (i != 0) {
                k6zVar = i != 1 ? null : k6z.b;
            } else {
                k6zVar = k6z.f17794a;
            }
            if (k6zVar == null) {
                k6zVar = k6z.f17794a;
            }
            setLayoutDirection(k6zVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        u9h0 u9h0Var;
        if (Build.VERSION.SDK_INT < 31 || (u9h0Var = this.g2) == null) {
            return;
        }
        u9h0Var.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        M();
    }

    @Override // a.qvj
    public final void onStop(clz clzVar) {
        klz klzVar = this.f;
        if (klzVar != null) {
            zn20 zn20Var = (zn20) klzVar.f18514a.b;
            if (zn20Var.f44653a && !zn20Var.c) {
                s5a s5aVar = klzVar.d;
                if (s5aVar != null) {
                    s5aVar.cancel();
                }
                klzVar.d = null;
                return;
            }
            if (zn20Var.b) {
                return;
            }
            if (!zn20Var.c) {
                esb0.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!zn20Var.d.i()) {
                esb0.a("Attempted to start retaining exited values with pending exited values");
            }
            zn20Var.c = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        ((hgk0) getInputModeManager().f2526a).setValue(new zex(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        iy2 iy2Var = this.contentCaptureManager;
        iy2Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            gy2.b(iy2Var, longSparseArray);
        } else {
            iy2Var.f15568a.post(new fy2(iy2Var, longSparseArray, (byte) 0));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zW;
        this.d2 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zW = uc9.W())) {
            return;
        }
        setShowLayoutBounds(zW);
        j(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.N1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void q(float[] fArr) {
        B();
        ui30.f(fArr, this.y1);
        cy2.G(fArr, Float.intBitsToFloat((int) (this.C1 >> 32)), Float.intBitsToFloat((int) (this.C1 & 4294967295L)), this.w1);
    }

    public final long r(long j) {
        B();
        long jB = ui30.b(j, this.y1);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.C1 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.C1 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2;
        byte b = 0;
        byte b2 = 1;
        if (ebc.f7512a) {
            if (!isFocused()) {
                jpq jpqVarD = spq.d(i);
                i2 = jpqVarD != null ? jpqVarD.f16914a : 7;
                Boolean boolG = ((ypq) getFocusOwner()).g(i2, rect != null ? e9x.X(rect) : null, new dx2(i2, b2));
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.d(boolG, bool)) {
                    if (!Intrinsics.d(((ypq) getFocusOwner()).g(i2, null, new dx2(i2, (byte) 2)), bool)) {
                        if (hasFocus() && (i2 == 1 || i2 == 2)) {
                            return ((ypq) getFocusOwner()).j(i2);
                        }
                        return false;
                    }
                }
            }
        } else if (!isFocused()) {
            if (((ypq) getFocusOwner()).c.e1().a()) {
                return super.requestFocus(i, rect);
            }
            jpq jpqVarD2 = spq.d(i);
            i2 = jpqVarD2 != null ? jpqVarD2.f16914a : 7;
            return Intrinsics.d(((ypq) getFocusOwner()).g(i2, rect != null ? e9x.X(rect) : null, new dx2(i2, b)), Boolean.TRUE);
        }
        return true;
    }

    public final void s(boolean z) {
        h7k h7kVar = this.t1;
        if (((oif0) h7kVar.e).E() || ((xz40) ((kd30) h7kVar.f).f18086a).c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (h7kVar.t(z ? this.b2 : this.c2)) {
                    requestLayout();
                }
                h7kVar.e(false);
                getRectManager().a();
                if (this.g1) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.g1 = false;
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.w.h = intervalMillis;
    }

    public final void setComposeViewContext(skd skdVar) {
        if (getCoroutineContext() != skdVar.c().k() && !((ty40) getRoot().o()).isEmpty()) {
            xcx.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        rfk0 rfk0VarJ = vdx.J();
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            skd skdVar2 = get_composeViewContext();
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            if (skdVar != skdVar2) {
                if (isAttachedToWindow()) {
                    skdVar2.b();
                    skdVar.e();
                }
                set_composeViewContext(skdVar);
                setCoroutineContext(skdVar.c().k());
            }
        } catch (Throwable th) {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.composeViewContextIncrementedDuringInit = z;
    }

    public final void setConfiguration(Configuration configuration) {
        ((hgk0) this.configuration).setValue(configuration);
    }

    public final void setContentCaptureManager$ui(iy2 iy2Var) {
        this.contentCaptureManager = iy2Var;
    }

    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
    }

    public final void setFrameEndScheduler$ui(jlz jlzVar) {
        this.frameEndScheduler = jlzVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnReadyForComposition(Function1<? super skd, Unit> callback) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.composeViewContextIncrementedDuringInit) {
            callback.invoke(getComposeViewContext());
        } else {
            this.D1 = callback;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(Function2<? super jpq, ? super Boolean, Unit> function2) {
        this.playNavigationSoundEffect = function2;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m16setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(v6x v6xVar) {
        this.primaryDirectionalMotionAxisOverride = v6xVar;
    }

    @Override // a.cg80
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public void setUncaughtExceptionHandler(keg0 handler) {
        this.t1.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(e7z e7zVar, long j) {
        h7k h7kVar = this.t1;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            h7kVar.u(e7zVar, j);
            if (!((oif0) h7kVar.e).E()) {
                h7kVar.e(false);
                getRectManager().a();
                this.c2.invoke();
                if (this.g1) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.g1 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean u(int i) {
        if (ebc.f7512a) {
            if (i != 7 && i != 8) {
                Integer numC = spq.c(i);
                if (numC == null) {
                    throw cs0.g("Invalid focus direction");
                }
                int iIntValue = numC.intValue();
                nqq nqqVarH = ((ypq) getFocusOwner()).h();
                if (nqqVarH == null) {
                    jf4.n("findNextViewInEmbeddedView called when owner does not have anything focused.");
                    return false;
                }
                Integer numC2 = spq.c(i);
                if (numC2 == null) {
                    throw cs0.g("Invalid focus direction");
                }
                int iIntValue2 = numC2.intValue();
                bhu0 bhu0Var = vcc.Z(nqqVarH).p;
                View interopView = bhu0Var != null ? bhu0Var.getInteropView() : null;
                View viewFindFocus = findFocus();
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = getRootView();
                rootView.getClass();
                View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
                if (viewFindNextFocus == null || interopView == null || !cy2.y(interopView, viewFindNextFocus)) {
                    viewFindNextFocus = null;
                }
                if (viewFindNextFocus != null) {
                    return spq.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
                }
            }
        } else if (i != 7 && i != 8) {
            Integer numC3 = spq.c(i);
            if (numC3 == null) {
                throw cs0.g("Invalid focus direction");
            }
            int iIntValue3 = numC3.intValue();
            jge0 embeddedViewFocusRect = getEmbeddedViewFocusRect();
            Rect rectV = embeddedViewFocusRect != null ? e9x.V(embeddedViewFocusRect) : null;
            FocusFinder focusFinder2 = FocusFinder.getInstance();
            View viewFindNextFocus2 = rectV == null ? focusFinder2.findNextFocus(this, findFocus(), iIntValue3) : focusFinder2.findNextFocusFromRect(this, rectV, iIntValue3);
            if (viewFindNextFocus2 != null) {
                return spq.b(viewFindNextFocus2, Integer.valueOf(iIntValue3), rectV);
            }
        }
        return false;
    }

    public final void v() {
        vy40 vy40Var;
        jw2 autofillManager;
        Object[] objArr;
        if (this.n1) {
            pgk0 pgk0Var = getSnapshotObserver().f7752a;
            r580 r580Var = new r580((byte) 10);
            synchronized (pgk0Var.g) {
                try {
                    xz40 xz40Var = pgk0Var.f;
                    int i = xz40Var.c;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = xz40Var.f41739a;
                        if (i2 >= i) {
                            break;
                        }
                        ogk0 ogk0Var = (ogk0) objArr[i2];
                        ogk0Var.d(r580Var);
                        if (!ogk0Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = xz40Var.f41739a;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    xz40Var.c = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.n1 = false;
        }
        p33 p33Var = this.q1;
        if (p33Var != null) {
            d(p33Var);
        }
        if (c() && (autofillManager = getAutofillManager()) != null) {
            fy40 fy40Var = autofillManager.h;
            if (fy40Var.d == 0 && autofillManager.i) {
                autofillManager.f17231a.m().commit();
                autofillManager.i = false;
            }
            if (fy40Var.d != 0) {
                autofillManager.i = true;
            }
        }
        while (this.Q1.j() && this.Q1.g(0) != null) {
            int i5 = this.Q1.b;
            int i6 = 0;
            while (true) {
                vy40Var = this.Q1;
                if (i6 < i5) {
                    Function0 function0 = (Function0) vy40Var.g(i6);
                    this.Q1.o(i6, null);
                    if (function0 != null) {
                        function0.invoke();
                    }
                    i6++;
                }
            }
            vy40Var.m(0, i5);
        }
    }

    public final void w(e7z e7zVar) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.w;
        androidComposeViewAccessibilityDelegateCompat.x = true;
        if (androidComposeViewAccessibilityDelegateCompat.v()) {
            androidComposeViewAccessibilityDelegateCompat.w(e7zVar);
        }
        iy2 iy2Var = this.contentCaptureManager;
        iy2Var.f = true;
        if (iy2Var.d()) {
            iy2Var.g.f(Unit.f46060a);
        }
    }

    public final void x(e7z e7zVar, boolean z, boolean z2, boolean z3) {
        e7z e7zVarV;
        e7z e7zVarV2;
        h7k h7kVar = this.t1;
        if (!z) {
            if (h7kVar.B(e7zVar, z2) && z3) {
                G(e7zVar);
                return;
            }
            return;
        }
        oif0 oif0Var = (oif0) h7kVar.e;
        e7z e7zVar2 = e7zVar.i;
        i7z i7zVar = e7zVar.i1;
        if (e7zVar2 == null) {
            xcx.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = i7zVar.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    t9f.b();
                    return;
                }
                if (!i7zVar.e || z2) {
                    i7zVar.e = true;
                    i7zVar.p.v = true;
                    if (e7zVar.s1) {
                        return;
                    }
                    if ((Intrinsics.d(e7zVar.K(), Boolean.TRUE) || h7k.m(e7zVar)) && ((e7zVarV = e7zVar.v()) == null || !e7zVarV.i1.e)) {
                        oif0Var.a(e7zVar, eox.f8158a);
                    } else if ((e7zVar.J() || h7k.n(e7zVar)) && ((e7zVarV2 = e7zVar.v()) == null || !e7zVarV2.r())) {
                        oif0Var.a(e7zVar, eox.c);
                    }
                    if (h7kVar.c || !z3) {
                        return;
                    }
                    G(e7zVar);
                    return;
                }
                return;
            }
        }
        ((xz40) h7kVar.h).b(new qj30(e7zVar, true, z2));
    }

    public final void y(e7z e7zVar, boolean z, boolean z2) {
        i7z i7zVar = e7zVar.i1;
        h7k h7kVar = this.t1;
        if (!z) {
            h7kVar.getClass();
            int iOrdinal = i7zVar.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                t9f.b();
                return;
            }
            e7z e7zVarV = e7zVar.v();
            boolean z3 = e7zVarV == null || e7zVarV.J();
            if (!z2) {
                if (e7zVar.r()) {
                    return;
                }
                if (e7zVar.q() && e7zVar.J() == z3 && e7zVar.J() == i7zVar.p.u) {
                    return;
                }
            }
            sj30 sj30Var = i7zVar.p;
            sj30Var.w = true;
            sj30Var.x = true;
            if (!e7zVar.s1 && sj30Var.u && z3) {
                if ((e7zVarV == null || !e7zVarV.q()) && (e7zVarV == null || !e7zVarV.r())) {
                    ((oif0) h7kVar.e).a(e7zVar, eox.d);
                }
                if (h7kVar.c) {
                    return;
                }
                G(null);
                return;
            }
            return;
        }
        oif0 oif0Var = (oif0) h7kVar.e;
        int iOrdinal2 = i7zVar.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    t9f.b();
                    return;
                }
            }
        }
        if ((i7zVar.e || i7zVar.f) && !z2) {
            return;
        }
        i7zVar.f = true;
        i7zVar.g = true;
        sj30 sj30Var2 = i7zVar.p;
        sj30Var2.w = true;
        sj30Var2.x = true;
        if (e7zVar.s1) {
            return;
        }
        e7z e7zVarV2 = e7zVar.v();
        if (Intrinsics.d(e7zVar.K(), Boolean.TRUE) && ((e7zVarV2 == null || !e7zVarV2.i1.e) && (e7zVarV2 == null || !e7zVarV2.i1.f))) {
            oif0Var.a(e7zVar, eox.b);
        } else if (e7zVar.J() && ((e7zVarV2 == null || !e7zVarV2.q()) && (e7zVarV2 == null || !e7zVarV2.r()))) {
            oif0Var.a(e7zVar, eox.d);
        }
        if (h7kVar.c) {
            return;
        }
        G(null);
    }

    public final void z() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.w;
        androidComposeViewAccessibilityDelegateCompat.x = true;
        Handler handler = androidComposeViewAccessibilityDelegateCompat.d.getHandler();
        if (androidComposeViewAccessibilityDelegateCompat.v() && !androidComposeViewAccessibilityDelegateCompat.j1 && handler != null) {
            androidComposeViewAccessibilityDelegateCompat.j1 = true;
            handler.post(androidComposeViewAccessibilityDelegateCompat.l1);
        }
        iy2 iy2Var = this.contentCaptureManager;
        iy2Var.f = true;
        Handler handler2 = iy2Var.f15568a.getHandler();
        if (!iy2Var.d() || iy2Var.l || handler2 == null) {
            return;
        }
        iy2Var.l = true;
        handler2.post(iy2Var.m);
    }

    @Override // a.cg80
    public iw2 getAutofill() {
        return this.autofill;
    }

    @Override // a.cg80
    public jw2 getAutofillManager() {
        return this.autofillManager;
    }

    @Override // a.cg80
    public wy2 getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: from getter and merged with bridge method [inline-methods] */
    public ey40 m17getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    public leg0 getRootForTest() {
        return this;
    }

    public final void setUncaughtExceptionHandler$ui(keg0 keg0Var) {
    }
}
