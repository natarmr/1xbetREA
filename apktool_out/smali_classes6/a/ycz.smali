.class public final La/ycz;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:J

.field public j:F

.field public k:Z

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:F


# direct methods
.method public constructor <init>(FLa/yje;)V
    .locals 0

    .line 1
    iput p1, p0, La/ycz;->m:F

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/ycz;

    .line 2
    .line 3
    iget p0, p0, La/ycz;->m:F

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, La/ycz;-><init>(FLa/yje;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, La/ycz;->l:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/qah0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/ycz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ycz;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ycz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, La/ycz;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/qah0;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v2, p0, La/ycz;->k:Z

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    if-ne v2, v3, :cond_1

    .line 13
    .line 14
    iget v2, p0, La/ycz;->j:F

    .line 15
    .line 16
    iget-wide v4, p0, La/ycz;->i:J

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    move p1, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    const/4 p1, 0x0

    .line 38
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v6

    .line 42
    sub-long/2addr v6, v4

    .line 43
    const-wide/16 v8, 0x258

    .line 44
    .line 45
    cmp-long v2, v6, v8

    .line 46
    .line 47
    if-lez v2, :cond_3

    .line 48
    .line 49
    move-wide v6, v8

    .line 50
    :cond_3
    long-to-float v2, v6

    .line 51
    const/high16 v10, 0x44160000    # 600.0f

    .line 52
    .line 53
    div-float/2addr v2, v10

    .line 54
    sget-object v10, La/ihn;->a:La/zsf;

    .line 55
    .line 56
    invoke-virtual {v10, v2}, La/zsf;->a(F)F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    iget v10, p0, La/ycz;->m:F

    .line 61
    .line 62
    mul-float/2addr v2, v10

    .line 63
    sub-float p1, v2, p1

    .line 64
    .line 65
    invoke-interface {v0, p1}, La/qah0;->a(F)F

    .line 66
    .line 67
    .line 68
    cmp-long p1, v6, v8

    .line 69
    .line 70
    if-gez p1, :cond_4

    .line 71
    .line 72
    new-instance p1, La/z8z;

    .line 73
    .line 74
    const/4 v6, 0x5

    .line 75
    invoke-direct {p1, v6}, La/z8z;-><init>(B)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, La/ycz;->l:Ljava/lang/Object;

    .line 79
    .line 80
    iput-wide v4, p0, La/ycz;->i:J

    .line 81
    .line 82
    iput v2, p0, La/ycz;->j:F

    .line 83
    .line 84
    iput-boolean v3, p0, La/ycz;->k:Z

    .line 85
    .line 86
    invoke-static {p1, p0}, La/s0x;->k0(Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v1, :cond_0

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0
.end method
