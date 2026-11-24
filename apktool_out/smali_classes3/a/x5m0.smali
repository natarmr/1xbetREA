.class public final La/x5m0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/t33;

.field public final synthetic k:La/zsf;

.field public final synthetic l:La/t33;

.field public final synthetic m:F

.field public final synthetic n:La/t33;

.field public final synthetic o:F


# direct methods
.method public constructor <init>(La/t33;La/zsf;La/t33;FLa/t33;FLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x5m0;->j:La/t33;

    .line 2
    .line 3
    iput-object p2, p0, La/x5m0;->k:La/zsf;

    .line 4
    .line 5
    iput-object p3, p0, La/x5m0;->l:La/t33;

    .line 6
    .line 7
    iput p4, p0, La/x5m0;->m:F

    .line 8
    .line 9
    iput-object p5, p0, La/x5m0;->n:La/t33;

    .line 10
    .line 11
    iput p6, p0, La/x5m0;->o:F

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
    new-instance v0, La/x5m0;

    .line 2
    .line 3
    iget-object v5, p0, La/x5m0;->n:La/t33;

    .line 4
    .line 5
    iget v6, p0, La/x5m0;->o:F

    .line 6
    .line 7
    iget-object v1, p0, La/x5m0;->j:La/t33;

    .line 8
    .line 9
    iget-object v2, p0, La/x5m0;->k:La/zsf;

    .line 10
    .line 11
    iget-object v3, p0, La/x5m0;->l:La/t33;

    .line 12
    .line 13
    iget v4, p0, La/x5m0;->m:F

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, La/x5m0;-><init>(La/t33;La/zsf;La/t33;FLa/t33;FLa/yje;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/x5m0;->i:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/x5m0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/x5m0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/x5m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, La/x5m0;->i:Ljava/lang/Object;

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
    new-instance v2, La/w5m0;

    .line 11
    .line 12
    iget v8, p0, La/x5m0;->o:F

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    iget-object v3, p0, La/x5m0;->j:La/t33;

    .line 16
    .line 17
    iget-object v4, p0, La/x5m0;->k:La/zsf;

    .line 18
    .line 19
    iget-object v5, p0, La/x5m0;->l:La/t33;

    .line 20
    .line 21
    iget v6, p0, La/x5m0;->m:F

    .line 22
    .line 23
    iget-object v7, p0, La/x5m0;->n:La/t33;

    .line 24
    .line 25
    invoke-direct/range {v2 .. v9}, La/w5m0;-><init>(La/t33;La/zsf;La/t33;FLa/t33;FLa/yje;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x3

    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-static {v0, p1, p1, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0
.end method
