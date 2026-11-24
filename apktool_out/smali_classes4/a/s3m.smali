.class public final La/s3m;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/x3m;

.field public final synthetic k:Z

.field public final synthetic l:F

.field public final synthetic m:La/t33;

.field public final synthetic n:F


# direct methods
.method public constructor <init>(La/x3m;ZFLa/t33;FLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/s3m;->j:La/x3m;

    .line 2
    .line 3
    iput-boolean p2, p0, La/s3m;->k:Z

    .line 4
    .line 5
    iput p3, p0, La/s3m;->l:F

    .line 6
    .line 7
    iput-object p4, p0, La/s3m;->m:La/t33;

    .line 8
    .line 9
    iput p5, p0, La/s3m;->n:F

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/s3m;

    .line 2
    .line 3
    iget-object v4, p0, La/s3m;->m:La/t33;

    .line 4
    .line 5
    iget v5, p0, La/s3m;->n:F

    .line 6
    .line 7
    iget-object v1, p0, La/s3m;->j:La/x3m;

    .line 8
    .line 9
    iget-boolean v2, p0, La/s3m;->k:Z

    .line 10
    .line 11
    iget v3, p0, La/s3m;->l:F

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/s3m;-><init>(La/x3m;ZFLa/t33;FLa/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/s3m;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/s3m;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/s3m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/s3m;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, La/zt2;

    .line 25
    .line 26
    iget-object v1, p0, La/s3m;->j:La/x3m;

    .line 27
    .line 28
    iget-boolean v4, p0, La/s3m;->k:Z

    .line 29
    .line 30
    iget v5, p0, La/s3m;->l:F

    .line 31
    .line 32
    invoke-direct {p1, v1, v4, v5}, La/zt2;-><init>(La/x3m;ZF)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v1, La/og;

    .line 40
    .line 41
    iget-object v4, p0, La/s3m;->m:La/t33;

    .line 42
    .line 43
    iget v5, p0, La/s3m;->n:F

    .line 44
    .line 45
    invoke-direct {v1, v4, v5, v2}, La/og;-><init>(La/t33;FLa/yje;)V

    .line 46
    .line 47
    .line 48
    iput-boolean v3, p0, La/s3m;->i:Z

    .line 49
    .line 50
    invoke-static {p1, v1, p0}, La/slb;->O(La/gmq;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-ne p0, v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0
.end method
