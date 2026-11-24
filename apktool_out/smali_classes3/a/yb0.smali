.class public final La/yb0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/duj;

.field public final c:La/mne;

.field public final d:La/tzi;

.field public final e:La/trm0;

.field public final f:La/m2c;

.field public final g:La/ol60;

.field public final h:La/p7m0;

.field public i:La/bby;


# direct methods
.method public constructor <init>(La/kc60;La/duj;La/mne;La/tzi;La/trm0;La/m2c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/yb0;->b:La/duj;

    .line 5
    .line 6
    iput-object p3, p0, La/yb0;->c:La/mne;

    .line 7
    .line 8
    iput-object p4, p0, La/yb0;->d:La/tzi;

    .line 9
    .line 10
    iput-object p5, p0, La/yb0;->e:La/trm0;

    .line 11
    .line 12
    iput-object p6, p0, La/yb0;->f:La/m2c;

    .line 13
    .line 14
    new-instance p2, La/ol60;

    .line 15
    .line 16
    const/4 p4, 0x3

    .line 17
    invoke-direct {p2, p4}, La/ol60;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, La/yb0;->g:La/ol60;

    .line 21
    .line 22
    sget-object p2, La/xb0;->a:La/xb0;

    .line 23
    .line 24
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iput-object p2, p0, La/yb0;->h:La/p7m0;

    .line 29
    .line 30
    invoke-virtual {p1}, La/kc60;->a()La/p7m0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-static {p1, p2}, La/dtb;->z(La/gmq;I)La/lnq;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance p2, La/qa;

    .line 40
    .line 41
    const/16 p4, 0xa

    .line 42
    .line 43
    const/4 p5, 0x0

    .line 44
    invoke-direct {p2, p0, p5, p4}, La/qa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 45
    .line 46
    .line 47
    new-instance p4, La/fnq;

    .line 48
    .line 49
    const/4 p5, 0x4

    .line 50
    invoke-direct {p4, p1, p2, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget-object p1, p3, La/mne;->b:La/dvj;

    .line 58
    .line 59
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object p1, La/rb0;->h:La/rb0;

    .line 64
    .line 65
    invoke-static {p4, p0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 66
    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 14

    .line 1
    iget-object v0, p0, La/yb0;->i:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v0, p0, La/yb0;->c:La/mne;

    .line 18
    .line 19
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 20
    .line 21
    new-instance v3, La/t90;

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v13, 0x2

    .line 25
    const/4 v7, 0x1

    .line 26
    iget-object v8, p0, La/yb0;->b:La/duj;

    .line 27
    .line 28
    const-class v9, La/duj;

    .line 29
    .line 30
    const-string v10, "handleError"

    .line 31
    .line 32
    const-string v11, "handleError(Ljava/lang/Throwable;)V"

    .line 33
    .line 34
    move-object v6, v3

    .line 35
    invoke-direct/range {v6 .. v13}, La/t90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 36
    .line 37
    .line 38
    new-instance v6, La/pa;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    const/16 v1, 0x9

    .line 42
    .line 43
    invoke-direct {v6, p0, v0, v1}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 44
    .line 45
    .line 46
    const/16 v7, 0xa

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/yb0;->i:La/bby;

    .line 54
    .line 55
    return-void
.end method
