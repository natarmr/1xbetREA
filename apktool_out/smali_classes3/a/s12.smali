.class public final La/s12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/r12;


# instance fields
.field public final a:La/ii;

.field public final b:La/ctf0;

.field public final c:Ljava/util/ArrayList;

.field public final d:La/sje;

.field public e:La/bby;

.field public f:Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;

.field public g:Landroidx/fragment/app/e;


# direct methods
.method public constructor <init>(La/lqt0;La/ii;La/ctf0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/s12;->a:La/ii;

    .line 11
    .line 12
    iput-object p3, p0, La/s12;->b:La/ctf0;

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/s12;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object p2, La/tvk;->a:La/rwj;

    .line 26
    .line 27
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, La/s12;->d:La/sje;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a(La/q12;)V
    .locals 7

    .line 1
    iget-object v0, p0, La/s12;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/s12;->e:La/bby;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, La/bby;->isActive()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, 0x1

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v2, La/dj1;

    .line 19
    .line 20
    const/16 p1, 0x15

    .line 21
    .line 22
    invoke-direct {v2, p1}, La/dj1;-><init>(B)V

    .line 23
    .line 24
    .line 25
    new-instance v5, La/pa;

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    const/16 v0, 0x13

    .line 29
    .line 30
    invoke-direct {v5, p0, p1, v0}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 31
    .line 32
    .line 33
    const/16 v6, 0xe

    .line 34
    .line 35
    iget-object v1, p0, La/s12;->d:La/sje;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/s12;->e:La/bby;

    .line 44
    .line 45
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, La/s12;->f:Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, La/m51;

    .line 6
    .line 7
    const/16 v2, 0xb

    .line 8
    .line 9
    invoke-direct {v1, v0, v2}, La/m51;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/s12;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {v0, v1}, La/w3d;->y(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, La/s12;->f:Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;

    .line 19
    .line 20
    iput-object v0, p0, La/s12;->g:Landroidx/fragment/app/e;

    .line 21
    .line 22
    return-void
.end method
