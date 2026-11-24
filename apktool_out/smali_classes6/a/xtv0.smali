.class public final La/xtv0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:Z

.field public final synthetic k:La/buv0;

.field public final synthetic l:F

.field public final synthetic m:I

.field public final synthetic n:F


# direct methods
.method public constructor <init>(ZLa/buv0;FIFLa/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/xtv0;->j:Z

    .line 2
    .line 3
    iput-object p2, p0, La/xtv0;->k:La/buv0;

    .line 4
    .line 5
    iput p3, p0, La/xtv0;->l:F

    .line 6
    .line 7
    iput p4, p0, La/xtv0;->m:I

    .line 8
    .line 9
    iput p5, p0, La/xtv0;->n:F

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
    new-instance v0, La/xtv0;

    .line 2
    .line 3
    iget v4, p0, La/xtv0;->m:I

    .line 4
    .line 5
    iget v5, p0, La/xtv0;->n:F

    .line 6
    .line 7
    iget-boolean v1, p0, La/xtv0;->j:Z

    .line 8
    .line 9
    iget-object v2, p0, La/xtv0;->k:La/buv0;

    .line 10
    .line 11
    iget v3, p0, La/xtv0;->l:F

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/xtv0;-><init>(ZLa/buv0;FIFLa/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/xtv0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/xtv0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/xtv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v2, p0, La/xtv0;->k:La/buv0;

    .line 2
    .line 3
    iget-object v7, v2, La/buv0;->i:La/pz40;

    .line 4
    .line 5
    iget-object v0, v2, La/buv0;->j:La/t33;

    .line 6
    .line 7
    sget-object v8, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v1, p0, La/xtv0;->i:B

    .line 10
    .line 11
    const/4 v9, 0x2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v1, v9, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    move-object p0, v0

    .line 25
    goto :goto_3

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-boolean p1, p0, La/xtv0;->j:Z

    .line 41
    .line 42
    if-nez p1, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/high16 v1, 0x3f800000    # 1.0f

    .line 55
    .line 56
    cmpl-float p1, p1, v1

    .line 57
    .line 58
    if-ltz p1, :cond_3

    .line 59
    .line 60
    new-instance p1, Ljava/lang/Float;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-direct {p1, v1}, Ljava/lang/Float;-><init>(F)V

    .line 64
    .line 65
    .line 66
    iput-byte v3, p0, La/xtv0;->i:B

    .line 67
    .line 68
    invoke-virtual {v0, p0, p1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v8, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    :goto_0
    :try_start_1
    new-instance v0, La/wtv0;

    .line 76
    .line 77
    iget-boolean v1, p0, La/xtv0;->j:Z

    .line 78
    .line 79
    iget v3, p0, La/xtv0;->l:F

    .line 80
    .line 81
    iget v4, p0, La/xtv0;->m:I

    .line 82
    .line 83
    iget v5, p0, La/xtv0;->n:F

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    invoke-direct/range {v0 .. v6}, La/wtv0;-><init>(ZLa/buv0;FIFLa/yje;)V

    .line 87
    .line 88
    .line 89
    iput-byte v9, p0, La/xtv0;->i:B

    .line 90
    .line 91
    invoke-static {p0, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    if-ne p0, v8, :cond_4

    .line 96
    .line 97
    :goto_1
    return-object v8

    .line 98
    :cond_4
    :goto_2
    sget-object p0, La/buv0;->m:La/zsf;

    .line 99
    .line 100
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 101
    .line 102
    check-cast v7, La/hgk0;

    .line 103
    .line 104
    invoke-virtual {v7, p0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :goto_3
    sget-object p1, La/buv0;->m:La/zsf;

    .line 111
    .line 112
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 113
    .line 114
    check-cast v7, La/hgk0;

    .line 115
    .line 116
    invoke-virtual {v7, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    throw p0
.end method
