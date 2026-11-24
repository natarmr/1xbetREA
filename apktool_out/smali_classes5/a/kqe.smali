.class public final La/kqe;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/dqe;

.field public final c:La/mne;

.field public final d:La/lhf0;

.field public final e:La/vzg0;

.field public final f:La/p7m0;

.field public final g:La/ol60;

.field public h:La/bby;


# direct methods
.method public constructor <init>(La/dqe;La/mne;La/lhf0;La/vzg0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/kqe;->b:La/dqe;

    .line 5
    .line 6
    iput-object p2, p0, La/kqe;->c:La/mne;

    .line 7
    .line 8
    iput-object p3, p0, La/kqe;->d:La/lhf0;

    .line 9
    .line 10
    iput-object p4, p0, La/kqe;->e:La/vzg0;

    .line 11
    .line 12
    new-instance p1, La/hqe;

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    sget-object p3, La/lak0;->c:La/lak0;

    .line 16
    .line 17
    invoke-direct {p1, p3, p2}, La/hqe;-><init>(La/a4x;Z)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, La/kqe;->f:La/p7m0;

    .line 25
    .line 26
    new-instance p1, La/ol60;

    .line 27
    .line 28
    const/4 p2, 0x3

    .line 29
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/kqe;->g:La/ol60;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final w(Ljava/lang/String;)V
    .locals 13

    .line 1
    iget-object v0, p0, La/kqe;->h:La/bby;

    .line 2
    .line 3
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v0, p0, La/kqe;->c:La/mne;

    .line 11
    .line 12
    iget-object v4, v0, La/mne;->b:La/dvj;

    .line 13
    .line 14
    new-instance v2, La/z6e;

    .line 15
    .line 16
    const/4 v11, 0x0

    .line 17
    const/16 v12, 0x11

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    const-class v8, La/kqe;

    .line 21
    .line 22
    const-string v9, "handleSearchError"

    .line 23
    .line 24
    const-string v10, "handleSearchError(Ljava/lang/Throwable;)V"

    .line 25
    .line 26
    move-object v7, p0

    .line 27
    move-object v5, v2

    .line 28
    invoke-direct/range {v5 .. v12}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/jtb;

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    const/16 v0, 0x19

    .line 35
    .line 36
    invoke-direct {v5, v7, p1, p0, v0}, La/jtb;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 37
    .line 38
    .line 39
    const/16 v6, 0xa

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iput-object p0, v7, La/kqe;->h:La/bby;

    .line 47
    .line 48
    return-void
.end method
