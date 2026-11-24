.class public final La/vtv0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/buv0;

.field public final synthetic k:F

.field public final synthetic l:I


# direct methods
.method public constructor <init>(La/buv0;FILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vtv0;->j:La/buv0;

    .line 2
    .line 3
    iput p2, p0, La/vtv0;->k:F

    .line 4
    .line 5
    iput p3, p0, La/vtv0;->l:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance p1, La/vtv0;

    .line 2
    .line 3
    iget v0, p0, La/vtv0;->k:F

    .line 4
    .line 5
    iget v1, p0, La/vtv0;->l:I

    .line 6
    .line 7
    iget-object p0, p0, La/vtv0;->j:La/buv0;

    .line 8
    .line 9
    invoke-direct {p1, p0, v0, v1, p2}, La/vtv0;-><init>(La/buv0;FILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/vtv0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/vtv0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/vtv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, La/vtv0;->j:La/buv0;

    .line 2
    .line 3
    iget-object v0, v0, La/buv0;->b:La/glt0;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/vtv0;->i:B

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x2

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-eq v2, v3, :cond_1

    .line 14
    .line 15
    if-ne v2, v4, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-byte v3, p0, La/vtv0;->i:B

    .line 36
    .line 37
    iget p1, p0, La/vtv0;->k:F

    .line 38
    .line 39
    invoke-virtual {v0, p1, p0}, La/glt0;->g(FLa/yje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v1, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 47
    sget-object v2, La/buv0;->m:La/zsf;

    .line 48
    .line 49
    iget v3, p0, La/vtv0;->l:I

    .line 50
    .line 51
    invoke-static {v3, p1, v2, v4}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-byte v4, p0, La/vtv0;->i:B

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v0, v2, p1, p0}, La/glt0;->a(FLa/j73;La/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-ne p0, v1, :cond_4

    .line 63
    .line 64
    :goto_1
    return-object v1

    .line 65
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0
.end method
