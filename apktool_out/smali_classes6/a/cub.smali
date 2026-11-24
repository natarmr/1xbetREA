.class public final La/cub;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/noj0;
.implements La/kmq;


# instance fields
.field public final a:La/q99;

.field public final b:La/vae0;

.field public final c:Ljava/util/List;


# direct methods
.method public constructor <init>(La/sje;La/i99;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, p2, v1}, La/vtb;->c(ILa/i99;Lkotlin/jvm/functions/Function1;)La/q99;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    iput-object p2, p0, La/cub;->a:La/q99;

    .line 11
    .line 12
    invoke-static {p2}, La/xkb;->V(La/htb;)La/itb;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    new-instance v0, La/o6m0;

    .line 17
    .line 18
    const-wide v2, 0x7fffffffffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v2, v3}, La/o6m0;-><init>(J)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {p2, p1, v0, v2}, La/vtb;->g0(La/gmq;La/vne;La/lpj0;I)La/vae0;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iput-object p2, p0, La/cub;->b:La/vae0;

    .line 32
    .line 33
    new-instance v0, La/igb;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    invoke-direct {v0, p0, v1, v2}, La/igb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    invoke-static {p1, v1, v1, v0, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    iget-object p1, p2, La/vae0;->a:La/noj0;

    .line 44
    .line 45
    invoke-interface {p1}, La/noj0;->d()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, La/cub;->c:Ljava/util/List;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/cub;->a:La/q99;

    .line 2
    .line 3
    invoke-interface {p0, p2, p1}, La/jbi0;->m(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, La/wne;->a:La/wne;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method

.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/bub;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/bub;

    .line 7
    .line 8
    iget v1, v0, La/bub;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/bub;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/bub;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/bub;-><init>(La/cub;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/bub;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/bub;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-eq v2, v4, :cond_1

    .line 36
    .line 37
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v3

    .line 43
    :cond_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v4, v0, La/bub;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/cub;->b:La/vae0;

    .line 53
    .line 54
    iget-object p0, p0, La/vae0;->a:La/noj0;

    .line 55
    .line 56
    invoke-interface {p0, p1, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-ne p0, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    invoke-static {}, La/csj;->b()V

    .line 64
    .line 65
    .line 66
    return-object v3
.end method

.method public final d()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/cub;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
