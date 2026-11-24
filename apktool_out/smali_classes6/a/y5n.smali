.class public final La/y5n;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:F

.field public final synthetic k:F

.field public final synthetic l:La/rah0;

.field public final synthetic m:F

.field public final synthetic n:La/vne;

.field public final synthetic o:La/t33;

.field public final synthetic p:La/t33;


# direct methods
.method public constructor <init>(FFLa/rah0;FLa/vne;La/t33;La/t33;La/yje;)V
    .locals 0

    .line 1
    iput p1, p0, La/y5n;->j:F

    .line 2
    .line 3
    iput p2, p0, La/y5n;->k:F

    .line 4
    .line 5
    iput-object p3, p0, La/y5n;->l:La/rah0;

    .line 6
    .line 7
    iput p4, p0, La/y5n;->m:F

    .line 8
    .line 9
    iput-object p5, p0, La/y5n;->n:La/vne;

    .line 10
    .line 11
    iput-object p6, p0, La/y5n;->o:La/t33;

    .line 12
    .line 13
    iput-object p7, p0, La/y5n;->p:La/t33;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    new-instance v0, La/y5n;

    .line 2
    .line 3
    iget-object v6, p0, La/y5n;->o:La/t33;

    .line 4
    .line 5
    iget-object v7, p0, La/y5n;->p:La/t33;

    .line 6
    .line 7
    iget v1, p0, La/y5n;->j:F

    .line 8
    .line 9
    iget v2, p0, La/y5n;->k:F

    .line 10
    .line 11
    iget-object v3, p0, La/y5n;->l:La/rah0;

    .line 12
    .line 13
    iget v4, p0, La/y5n;->m:F

    .line 14
    .line 15
    iget-object v5, p0, La/y5n;->n:La/vne;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, La/y5n;-><init>(FFLa/rah0;FLa/vne;La/t33;La/t33;La/yje;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/y5n;->i:Ljava/lang/Object;

    .line 22
    .line 23
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
    invoke-virtual {p0, p1, p2}, La/y5n;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/y5n;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/y5n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/y5n;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vne;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget p1, p0, La/y5n;->k:F

    .line 11
    .line 12
    const/high16 v1, 0x40000000    # 2.0f

    .line 13
    .line 14
    div-float v2, p1, v1

    .line 15
    .line 16
    iget v3, p0, La/y5n;->j:F

    .line 17
    .line 18
    add-float/2addr v2, v3

    .line 19
    iget-object v4, p0, La/y5n;->l:La/rah0;

    .line 20
    .line 21
    iget-object v5, v4, La/rah0;->b:La/cgk0;

    .line 22
    .line 23
    invoke-virtual {v5}, La/cgk0;->l()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    int-to-float v5, v5

    .line 28
    div-float/2addr v5, v1

    .line 29
    sub-float/2addr v2, v5

    .line 30
    iget v1, p0, La/y5n;->m:F

    .line 31
    .line 32
    add-float/2addr v2, v1

    .line 33
    float-to-int v1, v2

    .line 34
    iget-object v2, v4, La/rah0;->f:La/cgk0;

    .line 35
    .line 36
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-static {v1, v5, v2}, La/l1e0;->d(III)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    new-instance v2, La/pt8;

    .line 46
    .line 47
    const/4 v5, 0x1

    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-direct {v2, v4, v1, v6, v5}, La/pt8;-><init>(La/rah0;ILa/yje;B)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, La/y5n;->n:La/vne;

    .line 53
    .line 54
    const/4 v4, 0x3

    .line 55
    invoke-static {v1, v6, v6, v2, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 56
    .line 57
    .line 58
    new-instance v1, La/ly7;

    .line 59
    .line 60
    iget-object v2, p0, La/y5n;->o:La/t33;

    .line 61
    .line 62
    const/4 v5, 0x2

    .line 63
    invoke-direct {v1, v2, v3, v6, v5}, La/ly7;-><init>(La/t33;FLa/yje;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v6, v6, v1, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 67
    .line 68
    .line 69
    new-instance v1, La/ly7;

    .line 70
    .line 71
    iget-object p0, p0, La/y5n;->p:La/t33;

    .line 72
    .line 73
    invoke-direct {v1, p0, p1, v6, v4}, La/ly7;-><init>(La/t33;FLa/yje;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v6, v6, v1, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0
.end method
