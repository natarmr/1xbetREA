.class public final La/b6m0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/t33;

.field public final synthetic k:La/zsf;

.field public final synthetic l:La/t33;

.field public final synthetic m:La/t33;

.field public final synthetic n:J

.field public final synthetic o:La/t33;

.field public final synthetic p:F


# direct methods
.method public constructor <init>(La/t33;La/zsf;La/t33;La/t33;JLa/t33;FLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/b6m0;->j:La/t33;

    .line 2
    .line 3
    iput-object p2, p0, La/b6m0;->k:La/zsf;

    .line 4
    .line 5
    iput-object p3, p0, La/b6m0;->l:La/t33;

    .line 6
    .line 7
    iput-object p4, p0, La/b6m0;->m:La/t33;

    .line 8
    .line 9
    iput-wide p5, p0, La/b6m0;->n:J

    .line 10
    .line 11
    iput-object p7, p0, La/b6m0;->o:La/t33;

    .line 12
    .line 13
    iput p8, p0, La/b6m0;->p:F

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/b6m0;

    .line 2
    .line 3
    iget-object v7, p0, La/b6m0;->o:La/t33;

    .line 4
    .line 5
    iget v8, p0, La/b6m0;->p:F

    .line 6
    .line 7
    iget-object v1, p0, La/b6m0;->j:La/t33;

    .line 8
    .line 9
    iget-object v2, p0, La/b6m0;->k:La/zsf;

    .line 10
    .line 11
    iget-object v3, p0, La/b6m0;->l:La/t33;

    .line 12
    .line 13
    iget-object v4, p0, La/b6m0;->m:La/t33;

    .line 14
    .line 15
    iget-wide v5, p0, La/b6m0;->n:J

    .line 16
    .line 17
    move-object v9, p2

    .line 18
    invoke-direct/range {v0 .. v9}, La/b6m0;-><init>(La/t33;La/zsf;La/t33;La/t33;JLa/t33;FLa/yje;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/b6m0;->i:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/b6m0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/b6m0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/b6m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/b6m0;->i:Ljava/lang/Object;

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
    new-instance p1, La/pxn;

    .line 11
    .line 12
    iget-object v1, p0, La/b6m0;->j:La/t33;

    .line 13
    .line 14
    iget-object v5, p0, La/b6m0;->k:La/zsf;

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x3

    .line 18
    invoke-direct {p1, v1, v5, v9, v10}, La/pxn;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v9, v9, p1, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 22
    .line 23
    .line 24
    new-instance p1, La/pxn;

    .line 25
    .line 26
    iget-object v1, p0, La/b6m0;->l:La/t33;

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    invoke-direct {p1, v1, v5, v9, v2}, La/pxn;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v9, v9, p1, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 33
    .line 34
    .line 35
    new-instance v2, La/oxn;

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x3

    .line 39
    iget-object v3, p0, La/b6m0;->m:La/t33;

    .line 40
    .line 41
    move-object v6, v5

    .line 42
    iget-wide v4, p0, La/b6m0;->n:J

    .line 43
    .line 44
    invoke-direct/range {v2 .. v8}, La/oxn;-><init>(La/t33;JLa/zsf;La/yje;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v9, v9, v2, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 48
    .line 49
    .line 50
    new-instance v2, La/v5m0;

    .line 51
    .line 52
    iget v4, p0, La/b6m0;->p:F

    .line 53
    .line 54
    const/4 v7, 0x2

    .line 55
    iget-object v3, p0, La/b6m0;->o:La/t33;

    .line 56
    .line 57
    move-object v5, v6

    .line 58
    move-object v6, v9

    .line 59
    invoke-direct/range {v2 .. v7}, La/v5m0;-><init>(La/t33;FLa/zsf;La/yje;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v6, v6, v2, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0
.end method
