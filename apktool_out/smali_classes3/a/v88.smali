.class public final La/v88;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r990;

.field public final b:La/duj;

.field public final c:La/ieu;

.field public final d:La/abu;

.field public final e:La/drm0;

.field public f:La/i1w0;

.field public final g:La/sje;

.field public h:Z

.field public i:J


# direct methods
.method public constructor <init>(La/r990;La/duj;La/ieu;La/abu;La/drm0;La/v6k;La/mne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/v88;->a:La/r990;

    .line 5
    .line 6
    iput-object p2, p0, La/v88;->b:La/duj;

    .line 7
    .line 8
    iput-object p3, p0, La/v88;->c:La/ieu;

    .line 9
    .line 10
    iput-object p4, p0, La/v88;->d:La/abu;

    .line 11
    .line 12
    iput-object p5, p0, La/v88;->e:La/drm0;

    .line 13
    .line 14
    iget-object p1, p7, La/mne;->b:La/dvj;

    .line 15
    .line 16
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/v88;->g:La/sje;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic b(La/v88;La/i1w0;JI)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const-wide/16 p2, 0x0

    .line 6
    .line 7
    :cond_0
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p0, p1, p4, p2, p3}, La/v88;->a(La/i1w0;ZJ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(La/i1w0;ZJ)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/v88;->f:La/i1w0;

    .line 5
    .line 6
    iput-boolean p2, p0, La/v88;->h:Z

    .line 7
    .line 8
    iput-wide p3, p0, La/v88;->i:J

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iget-object v0, p0, La/v88;->g:La/sje;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance v1, La/t88;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-direct {v1, p0, p2}, La/t88;-><init>(La/v88;B)V

    .line 19
    .line 20
    .line 21
    new-instance v4, La/u88;

    .line 22
    .line 23
    invoke-direct {v4, p0, p2, p1, p2}, La/u88;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 24
    .line 25
    .line 26
    const/16 v5, 0xe

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v1, La/t88;

    .line 35
    .line 36
    const/4 p2, 0x1

    .line 37
    invoke-direct {v1, p0, p2}, La/t88;-><init>(La/v88;B)V

    .line 38
    .line 39
    .line 40
    new-instance v4, La/qv3;

    .line 41
    .line 42
    const/16 p2, 0xf

    .line 43
    .line 44
    invoke-direct {v4, p0, p1, p2}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 45
    .line 46
    .line 47
    const/16 v5, 0xe

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 52
    .line 53
    .line 54
    return-void
.end method
