.class public final La/xmt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ant;

.field public final b:La/pmi;

.field public final c:La/epc;

.field public final d:La/mne;

.field public final e:La/kqc;

.field public final f:La/pru;


# direct methods
.method public constructor <init>(La/ant;La/pmi;La/epc;La/mne;La/kqc;La/pru;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xmt;->a:La/ant;

    .line 5
    .line 6
    iput-object p2, p0, La/xmt;->b:La/pmi;

    .line 7
    .line 8
    iput-object p3, p0, La/xmt;->c:La/epc;

    .line 9
    .line 10
    iput-object p4, p0, La/xmt;->d:La/mne;

    .line 11
    .line 12
    iput-object p5, p0, La/xmt;->e:La/kqc;

    .line 13
    .line 14
    iput-object p6, p0, La/xmt;->f:La/pru;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(J)La/gmq;
    .locals 6

    .line 1
    new-instance v0, La/ze1;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x4

    .line 5
    move-object v1, p0

    .line 6
    move-wide v2, p1

    .line 7
    invoke-direct/range {v0 .. v5}, La/ze1;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 8
    .line 9
    .line 10
    new-instance p0, La/vsg0;

    .line 11
    .line 12
    invoke-direct {p0, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-static {p0, p1}, La/uvw;->Q(La/gmq;Z)La/a1g;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p1, v1, La/xmt;->d:La/mne;

    .line 21
    .line 22
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 23
    .line 24
    invoke-static {p0, p1}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
