.class public final La/mvh0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Z

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/pvh0;

.field public final synthetic m:La/oms0;

.field public final synthetic n:F


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/pvh0;La/oms0;FLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mvh0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, La/mvh0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, La/mvh0;->l:La/pvh0;

    .line 6
    .line 7
    iput-object p4, p0, La/mvh0;->m:La/oms0;

    .line 8
    .line 9
    iput p5, p0, La/mvh0;->n:F

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/mvh0;

    .line 2
    .line 3
    iget-object v4, p0, La/mvh0;->m:La/oms0;

    .line 4
    .line 5
    iget v5, p0, La/mvh0;->n:F

    .line 6
    .line 7
    iget-object v1, p0, La/mvh0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v2, p0, La/mvh0;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v3, p0, La/mvh0;->l:La/pvh0;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, La/mvh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/pvh0;La/oms0;FLa/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/mvh0;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/mvh0;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/mvh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/mvh0;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, La/hnr;

    .line 25
    .line 26
    iget v8, p0, La/mvh0;->n:F

    .line 27
    .line 28
    const/4 v9, 0x0

    .line 29
    iget-object v4, p0, La/mvh0;->j:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v5, p0, La/mvh0;->k:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v6, p0, La/mvh0;->l:La/pvh0;

    .line 34
    .line 35
    iget-object v7, p0, La/mvh0;->m:La/oms0;

    .line 36
    .line 37
    invoke-direct/range {v3 .. v9}, La/hnr;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/pvh0;La/oms0;FLa/yje;)V

    .line 38
    .line 39
    .line 40
    iput-boolean v2, p0, La/mvh0;->i:Z

    .line 41
    .line 42
    invoke-static {p0, v3}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-ne p0, v0, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0
.end method
