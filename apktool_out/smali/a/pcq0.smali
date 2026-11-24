.class public final La/pcq0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/qcq0;

.field public final synthetic k:Lkotlin/jvm/functions/Function1;

.field public final synthetic l:S


# direct methods
.method public constructor <init>(La/qcq0;Lkotlin/jvm/functions/Function1;JLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pcq0;->j:La/qcq0;

    .line 2
    .line 3
    iput-object p2, p0, La/pcq0;->k:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    long-to-int p1, p3

    .line 6
    iput-short p1, p0, La/pcq0;->l:S

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/pcq0;

    .line 2
    .line 3
    iget-short p1, p0, La/pcq0;->l:S

    .line 4
    .line 5
    int-to-long v3, p1

    .line 6
    iget-object v1, p0, La/pcq0;->j:La/qcq0;

    .line 7
    .line 8
    iget-object v2, p0, La/pcq0;->k:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    move-object v5, p2

    .line 11
    invoke-direct/range {v0 .. v5}, La/pcq0;-><init>(La/qcq0;Lkotlin/jvm/functions/Function1;JLa/yje;)V

    .line 12
    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, La/pcq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/pcq0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/pcq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/pcq0;->i:Z

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
    return-object p1

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
    iget-object p1, p0, La/pcq0;->j:La/qcq0;

    .line 25
    .line 26
    iget-object v1, p1, La/qcq0;->f:La/lne;

    .line 27
    .line 28
    iget-object p1, p1, La/qcq0;->b:La/vne;

    .line 29
    .line 30
    new-instance v4, La/a2f;

    .line 31
    .line 32
    const/16 v5, 0x8

    .line 33
    .line 34
    iget-object v6, p0, La/pcq0;->k:Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    invoke-direct {v4, v6, v2, v5}, La/a2f;-><init>(Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 37
    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    invoke-static {p1, v1, v4, v5}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-short v1, p0, La/pcq0;->l:S

    .line 45
    .line 46
    int-to-long v4, v1

    .line 47
    new-instance v1, La/z2n0;

    .line 48
    .line 49
    const/16 v6, 0xf

    .line 50
    .line 51
    invoke-direct {v1, p1, v2, v6}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 52
    .line 53
    .line 54
    iput-boolean v3, p0, La/pcq0;->i:Z

    .line 55
    .line 56
    invoke-static {v4, v5, v1, p0}, La/msm0;->u(JLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-ne p0, v0, :cond_2

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_2
    return-object p0
.end method
