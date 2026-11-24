.class public final La/ny7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/t33;

.field public final synthetic k:F

.field public final synthetic l:La/t33;

.field public final synthetic m:La/t33;


# direct methods
.method public constructor <init>(La/t33;FLa/t33;La/t33;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ny7;->j:La/t33;

    .line 2
    .line 3
    iput p2, p0, La/ny7;->k:F

    .line 4
    .line 5
    iput-object p3, p0, La/ny7;->l:La/t33;

    .line 6
    .line 7
    iput-object p4, p0, La/ny7;->m:La/t33;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/ny7;

    .line 2
    .line 3
    iget-object v3, p0, La/ny7;->l:La/t33;

    .line 4
    .line 5
    iget-object v4, p0, La/ny7;->m:La/t33;

    .line 6
    .line 7
    iget-object v1, p0, La/ny7;->j:La/t33;

    .line 8
    .line 9
    iget v2, p0, La/ny7;->k:F

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/ny7;-><init>(La/t33;FLa/t33;La/t33;La/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/ny7;->i:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/ny7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ny7;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ny7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, La/ny7;->i:Ljava/lang/Object;

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
    new-instance p1, La/ly7;

    .line 11
    .line 12
    iget-object v1, p0, La/ny7;->j:La/t33;

    .line 13
    .line 14
    iget v2, p0, La/ny7;->k:F

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct {p1, v1, v2, v3, v4}, La/ly7;-><init>(La/t33;FLa/yje;B)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    invoke-static {v0, v3, v3, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 23
    .line 24
    .line 25
    new-instance p1, La/my7;

    .line 26
    .line 27
    iget-object v2, p0, La/ny7;->l:La/t33;

    .line 28
    .line 29
    invoke-direct {p1, v2, v3, v4}, La/my7;-><init>(La/t33;La/yje;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v3, v3, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 33
    .line 34
    .line 35
    new-instance p1, La/my7;

    .line 36
    .line 37
    iget-object p0, p0, La/ny7;->m:La/t33;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-direct {p1, p0, v3, v2}, La/my7;-><init>(La/t33;La/yje;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v3, v3, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
