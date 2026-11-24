.class public final La/wtv0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Z

.field public final synthetic k:La/buv0;

.field public final synthetic l:F

.field public final synthetic m:I

.field public final synthetic n:F


# direct methods
.method public constructor <init>(ZLa/buv0;FIFLa/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/wtv0;->j:Z

    .line 2
    .line 3
    iput-object p2, p0, La/wtv0;->k:La/buv0;

    .line 4
    .line 5
    iput p3, p0, La/wtv0;->l:F

    .line 6
    .line 7
    iput p4, p0, La/wtv0;->m:I

    .line 8
    .line 9
    iput p5, p0, La/wtv0;->n:F

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
    new-instance v0, La/wtv0;

    .line 2
    .line 3
    iget v4, p0, La/wtv0;->m:I

    .line 4
    .line 5
    iget v5, p0, La/wtv0;->n:F

    .line 6
    .line 7
    iget-boolean v1, p0, La/wtv0;->j:Z

    .line 8
    .line 9
    iget-object v2, p0, La/wtv0;->k:La/buv0;

    .line 10
    .line 11
    iget v3, p0, La/wtv0;->l:F

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/wtv0;-><init>(ZLa/buv0;FIFLa/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/wtv0;->i:Ljava/lang/Object;

    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, La/wtv0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/wtv0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/wtv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/wtv0;->i:Ljava/lang/Object;

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
    new-instance v2, La/c4a;

    .line 11
    .line 12
    const/4 v7, 0x2

    .line 13
    iget-object v3, p0, La/wtv0;->k:La/buv0;

    .line 14
    .line 15
    iget v4, p0, La/wtv0;->l:F

    .line 16
    .line 17
    iget v5, p0, La/wtv0;->m:I

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    invoke-direct/range {v2 .. v7}, La/c4a;-><init>(Ljava/lang/Object;FILa/yje;B)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x3

    .line 24
    invoke-static {v0, v6, v6, v2, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 25
    .line 26
    .line 27
    iget-boolean v1, p0, La/wtv0;->j:Z

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    new-instance v1, La/vtv0;

    .line 32
    .line 33
    iget p0, p0, La/wtv0;->n:F

    .line 34
    .line 35
    invoke-direct {v1, v3, p0, v5, v6}, La/vtv0;-><init>(La/buv0;FILa/yje;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v6, v6, v1, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0
.end method
