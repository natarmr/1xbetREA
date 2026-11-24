.class public final La/zs8;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:I

.field public final synthetic k:F

.field public final synthetic l:La/g6u0;

.field public final synthetic m:La/et8;

.field public final synthetic n:Z


# direct methods
.method public constructor <init>(IFLa/g6u0;La/et8;ZLa/yje;)V
    .locals 0

    .line 1
    iput p1, p0, La/zs8;->j:I

    .line 2
    .line 3
    iput p2, p0, La/zs8;->k:F

    .line 4
    .line 5
    iput-object p3, p0, La/zs8;->l:La/g6u0;

    .line 6
    .line 7
    iput-object p4, p0, La/zs8;->m:La/et8;

    .line 8
    .line 9
    iput-boolean p5, p0, La/zs8;->n:Z

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
    new-instance v0, La/zs8;

    .line 2
    .line 3
    iget-object v4, p0, La/zs8;->m:La/et8;

    .line 4
    .line 5
    iget-boolean v5, p0, La/zs8;->n:Z

    .line 6
    .line 7
    iget v1, p0, La/zs8;->j:I

    .line 8
    .line 9
    iget v2, p0, La/zs8;->k:F

    .line 10
    .line 11
    iget-object v3, p0, La/zs8;->l:La/g6u0;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/zs8;-><init>(IFLa/g6u0;La/et8;ZLa/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/zs8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/zs8;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/zs8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/zs8;->i:Z

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
    goto :goto_1

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
    iget p1, p0, La/zs8;->j:I

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    int-to-float p1, p1

    .line 31
    iget v1, p0, La/zs8;->k:F

    .line 32
    .line 33
    cmpg-float p1, p1, v1

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    if-gez p1, :cond_2

    .line 37
    .line 38
    move p1, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object p1, p0, La/zs8;->l:La/g6u0;

    .line 41
    .line 42
    iget-wide v3, p1, La/g6u0;->a:J

    .line 43
    .line 44
    invoke-static {v3, v4}, La/g6u0;->b(J)F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    cmpl-float v1, v3, v1

    .line 53
    .line 54
    iget-object v3, p0, La/zs8;->m:La/et8;

    .line 55
    .line 56
    if-lez v1, :cond_3

    .line 57
    .line 58
    iput-boolean v2, p0, La/zs8;->i:Z

    .line 59
    .line 60
    iget-boolean v1, p0, La/zs8;->n:Z

    .line 61
    .line 62
    invoke-virtual {v3, p1, v1, p0}, La/et8;->a(FZLa/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-ne p0, v0, :cond_4

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_3
    iget-object p0, v3, La/et8;->b:La/zr8;

    .line 70
    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0}, La/zr8;->c()V

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0
.end method
