.class public final La/w5m0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/t33;

.field public final synthetic l:La/zsf;

.field public final synthetic m:La/t33;

.field public final synthetic n:F

.field public final synthetic o:La/t33;

.field public final synthetic p:F


# direct methods
.method public constructor <init>(La/t33;La/zsf;La/t33;FLa/t33;FLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/w5m0;->k:La/t33;

    .line 2
    .line 3
    iput-object p2, p0, La/w5m0;->l:La/zsf;

    .line 4
    .line 5
    iput-object p3, p0, La/w5m0;->m:La/t33;

    .line 6
    .line 7
    iput p4, p0, La/w5m0;->n:F

    .line 8
    .line 9
    iput-object p5, p0, La/w5m0;->o:La/t33;

    .line 10
    .line 11
    iput p6, p0, La/w5m0;->p:F

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/w5m0;

    .line 2
    .line 3
    iget-object v5, p0, La/w5m0;->o:La/t33;

    .line 4
    .line 5
    iget v6, p0, La/w5m0;->p:F

    .line 6
    .line 7
    iget-object v1, p0, La/w5m0;->k:La/t33;

    .line 8
    .line 9
    iget-object v2, p0, La/w5m0;->l:La/zsf;

    .line 10
    .line 11
    iget-object v3, p0, La/w5m0;->m:La/t33;

    .line 12
    .line 13
    iget v4, p0, La/w5m0;->n:F

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, La/w5m0;-><init>(La/t33;La/zsf;La/t33;FLa/t33;FLa/yje;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/w5m0;->j:Ljava/lang/Object;

    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, La/w5m0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/w5m0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/w5m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/w5m0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vne;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v2, p0, La/w5m0;->i:Z

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/w5m0;->j:Ljava/lang/Object;

    .line 29
    .line 30
    iput-boolean v3, p0, La/w5m0;->i:Z

    .line 31
    .line 32
    const-wide/16 v4, 0xbb8

    .line 33
    .line 34
    invoke-static {v4, v5, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-ne p1, v1, :cond_2

    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_2
    :goto_0
    new-instance p1, La/pxn;

    .line 42
    .line 43
    iget-object v1, p0, La/w5m0;->k:La/t33;

    .line 44
    .line 45
    iget-object v7, p0, La/w5m0;->l:La/zsf;

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    invoke-direct {p1, v1, v7, v8, v3}, La/pxn;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x3

    .line 52
    invoke-static {v0, v8, v8, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 53
    .line 54
    .line 55
    new-instance v4, La/v5m0;

    .line 56
    .line 57
    iget v6, p0, La/w5m0;->n:F

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    iget-object v5, p0, La/w5m0;->m:La/t33;

    .line 61
    .line 62
    invoke-direct/range {v4 .. v9}, La/v5m0;-><init>(La/t33;FLa/zsf;La/yje;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v8, v8, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 66
    .line 67
    .line 68
    new-instance v4, La/v5m0;

    .line 69
    .line 70
    iget v6, p0, La/w5m0;->p:F

    .line 71
    .line 72
    const/4 v9, 0x1

    .line 73
    iget-object v5, p0, La/w5m0;->o:La/t33;

    .line 74
    .line 75
    invoke-direct/range {v4 .. v9}, La/v5m0;-><init>(La/t33;FLa/zsf;La/yje;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v8, v8, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0
.end method
