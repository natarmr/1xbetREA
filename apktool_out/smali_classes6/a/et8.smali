.class public final La/et8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/t33;

.field public b:La/zr8;

.field public final c:La/pz40;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, La/xf0;->c(F)La/t33;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, La/et8;->a:La/t33;

    .line 10
    .line 11
    sget-object v0, La/iun;->a:La/iun;

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/et8;->c:La/pz40;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(FZLa/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, La/ct8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/ct8;

    .line 7
    .line 8
    iget v1, v0, La/ct8;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ct8;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ct8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/ct8;-><init>(La/et8;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/ct8;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ct8;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p3, La/jie0;

    .line 51
    .line 52
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v5, p0, La/et8;->a:La/t33;

    .line 56
    .line 57
    invoke-virtual {v5}, La/t33;->d()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    iput v2, p3, La/jie0;->a:F

    .line 68
    .line 69
    new-instance v6, Ljava/lang/Float;

    .line 70
    .line 71
    invoke-direct {v6, p1}, Ljava/lang/Float;-><init>(F)V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x2

    .line 75
    invoke-static {p1}, La/uzb;->Y(I)La/sjj;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v10, La/r91;

    .line 80
    .line 81
    const/4 v2, 0x5

    .line 82
    invoke-direct {v10, p3, p0, p2, v2}, La/r91;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 83
    .line 84
    .line 85
    iput v3, v0, La/ct8;->k:I

    .line 86
    .line 87
    invoke-virtual {v5}, La/t33;->d()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    sget-object p3, La/hp4;->j:La/lxs0;

    .line 92
    .line 93
    iget-object v2, p3, La/lxs0;->a:Lkotlin/jvm/functions/Function1;

    .line 94
    .line 95
    invoke-interface {v2, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, La/t73;

    .line 100
    .line 101
    new-instance v7, La/rjj;

    .line 102
    .line 103
    invoke-direct {v7, p1, p3, p2, v2}, La/rjj;-><init>(La/sjj;La/lxs0;Ljava/lang/Object;La/t73;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, v5, La/t33;->c:La/l73;

    .line 107
    .line 108
    iget-wide v8, p1, La/l73;->d:J

    .line 109
    .line 110
    iget-object p1, v5, La/t33;->f:La/h050;

    .line 111
    .line 112
    new-instance v4, La/r33;

    .line 113
    .line 114
    const/4 v11, 0x0

    .line 115
    invoke-direct/range {v4 .. v11}, La/r33;-><init>(La/t33;Ljava/lang/Object;La/z63;JLkotlin/jvm/functions/Function1;La/yje;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p1, v4, v0}, La/h050;->a(La/h050;Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-ne p1, v1, :cond_3

    .line 123
    .line 124
    return-object v1

    .line 125
    :cond_3
    :goto_1
    iget-object p0, p0, La/et8;->b:La/zr8;

    .line 126
    .line 127
    if-eqz p0, :cond_4

    .line 128
    .line 129
    invoke-virtual {p0}, La/zr8;->c()V

    .line 130
    .line 131
    .line 132
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0
.end method

.method public final b(IZZLa/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, La/dt8;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/dt8;

    .line 9
    .line 10
    iget v3, v1, La/dt8;->k:I

    .line 11
    .line 12
    const/high16 v4, -0x80000000

    .line 13
    .line 14
    and-int v5, v3, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    sub-int/2addr v3, v4

    .line 19
    iput v3, v1, La/dt8;->k:I

    .line 20
    .line 21
    :goto_0
    move-object v7, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, La/dt8;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, La/dt8;-><init>(La/et8;La/zje;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v7, La/dt8;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v9, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v1, v7, La/dt8;->k:I

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v6, :cond_1

    .line 40
    .line 41
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v8, p0, La/et8;->a:La/t33;

    .line 55
    .line 56
    invoke-virtual {v8}, La/t33;->d()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    int-to-float v1, p1

    .line 67
    add-float/2addr v1, v0

    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x6

    .line 70
    const/16 v10, 0x1f4

    .line 71
    .line 72
    invoke-static {v10, v4, v3, v5}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    new-instance v3, La/jie0;

    .line 77
    .line 78
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    iput v0, v3, La/jie0;->a:F

    .line 82
    .line 83
    new-instance v11, Ljava/lang/Float;

    .line 84
    .line 85
    invoke-direct {v11, v1}, Ljava/lang/Float;-><init>(F)V

    .line 86
    .line 87
    .line 88
    new-instance v0, La/bt8;

    .line 89
    .line 90
    move-object v2, v3

    .line 91
    move v3, v1

    .line 92
    move-object v1, v2

    .line 93
    move-object v2, p0

    .line 94
    move v4, p2

    .line 95
    move v5, p3

    .line 96
    invoke-direct/range {v0 .. v5}, La/bt8;-><init>(La/jie0;La/et8;FZZ)V

    .line 97
    .line 98
    .line 99
    move-object v1, v0

    .line 100
    iput v6, v7, La/dt8;->k:I

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    move-object v2, v8

    .line 104
    const/4 v8, 0x4

    .line 105
    move-object v6, v1

    .line 106
    move-object v4, v10

    .line 107
    move-object v3, v11

    .line 108
    invoke-static/range {v2 .. v8}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-ne v1, v9, :cond_3

    .line 113
    .line 114
    return-object v9

    .line 115
    :cond_3
    :goto_2
    iget-object v0, p0, La/et8;->b:La/zr8;

    .line 116
    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    invoke-virtual {v0}, La/zr8;->c()V

    .line 120
    .line 121
    .line 122
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0
.end method
