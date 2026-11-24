.class public final La/jch0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xcz;

.field public final b:La/vne;

.field public final c:La/ubh0;

.field public d:La/c4m0;

.field public final e:La/q99;


# direct methods
.method public constructor <init>(La/xcz;La/vne;La/ubh0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/jch0;->a:La/xcz;

    .line 8
    .line 9
    iput-object p2, p0, La/jch0;->b:La/vne;

    .line 10
    .line 11
    iput-object p3, p0, La/jch0;->c:La/ubh0;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    const/4 p2, 0x6

    .line 15
    const/4 p3, -0x1

    .line 16
    invoke-static {p3, p1, p1, p2}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/jch0;->e:La/q99;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(La/ech0;La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p2, La/fch0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/fch0;

    .line 7
    .line 8
    iget v1, v0, La/fch0;->k:I

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
    iput v1, v0, La/fch0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fch0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/fch0;-><init>(La/jch0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/fch0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fch0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p2, p1, La/ech0;->c:Lkotlin/jvm/functions/Function0;

    .line 59
    .line 60
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    check-cast p2, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    iget-object v2, p0, La/jch0;->c:La/ubh0;

    .line 71
    .line 72
    invoke-virtual {v2}, La/ubh0;->invoke()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget v6, p1, La/ech0;->b:F

    .line 83
    .line 84
    mul-float/2addr v2, v6

    .line 85
    const/high16 v6, 0x447a0000    # 1000.0f

    .line 86
    .line 87
    div-float/2addr v2, v6

    .line 88
    const/4 v6, 0x0

    .line 89
    cmpg-float v7, p2, v6

    .line 90
    .line 91
    if-lez v7, :cond_8

    .line 92
    .line 93
    cmpg-float v6, v2, v6

    .line 94
    .line 95
    if-gtz v6, :cond_4

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    div-float v2, p2, v2

    .line 99
    .line 100
    float-to-long v6, v2

    .line 101
    const-wide/16 v8, 0x1

    .line 102
    .line 103
    const-wide/16 v10, 0x64

    .line 104
    .line 105
    invoke-static/range {v6 .. v11}, La/l1e0;->f(JJJ)J

    .line 106
    .line 107
    .line 108
    move-result-wide v6

    .line 109
    long-to-float v8, v6

    .line 110
    div-float/2addr v8, v2

    .line 111
    mul-float/2addr v8, p2

    .line 112
    iget-object p1, p1, La/ech0;->a:La/dch0;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    if-ne p1, v5, :cond_5

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 124
    .line 125
    .line 126
    return-object v3

    .line 127
    :cond_6
    neg-float v8, v8

    .line 128
    :goto_1
    long-to-int p1, v6

    .line 129
    const/4 p2, 0x0

    .line 130
    sget-object v2, La/ihn;->d:La/z73;

    .line 131
    .line 132
    invoke-static {p1, p2, v2, v4}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iput v4, v0, La/fch0;->k:I

    .line 137
    .line 138
    iget-object p0, p0, La/jch0;->a:La/xcz;

    .line 139
    .line 140
    invoke-static {p0, v8, p1, v0}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-ne p0, v1, :cond_7

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_7
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_8
    :goto_3
    sget-object p0, La/wen;->b:La/uen;

    .line 151
    .line 152
    const-wide/16 p0, 0x64

    .line 153
    .line 154
    sget-object p2, La/bfn;->d:La/bfn;

    .line 155
    .line 156
    invoke-static {p0, p1, p2}, La/ibc;->w0(JLa/bfn;)J

    .line 157
    .line 158
    .line 159
    move-result-wide p0

    .line 160
    iput v5, v0, La/fch0;->k:I

    .line 161
    .line 162
    invoke-static {p0, p1, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-ne p0, v1, :cond_9

    .line 167
    .line 168
    :goto_4
    return-object v1

    .line 169
    :cond_9
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/gch0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/gch0;

    .line 7
    .line 8
    iget v1, v0, La/gch0;->m:I

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
    iput v1, v0, La/gch0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gch0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/gch0;-><init>(La/jch0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/gch0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gch0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget-object v2, v0, La/gch0;->i:La/ech0;

    .line 41
    .line 42
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object p1, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    iget-object v2, v0, La/gch0;->j:La/ech0;

    .line 54
    .line 55
    iget-object v6, v0, La/gch0;->i:La/ech0;

    .line 56
    .line 57
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object p1, v3

    .line 65
    :goto_1
    iget-object v2, p0, La/jch0;->e:La/q99;

    .line 66
    .line 67
    invoke-virtual {v2}, La/q99;->j()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v2}, La/ztb;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, La/ech0;

    .line 76
    .line 77
    if-nez v2, :cond_4

    .line 78
    .line 79
    move-object v2, p1

    .line 80
    :cond_4
    if-eqz v2, :cond_a

    .line 81
    .line 82
    sget-object p1, La/ech0;->e:La/ech0;

    .line 83
    .line 84
    invoke-virtual {v2, p1}, La/ech0;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_a

    .line 89
    .line 90
    iget-object p1, v2, La/ech0;->a:La/dch0;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    iget-object v6, p0, La/jch0;->a:La/xcz;

    .line 97
    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    if-ne p1, v5, :cond_5

    .line 101
    .line 102
    invoke-virtual {v6}, La/xcz;->d()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    goto :goto_2

    .line 107
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 108
    .line 109
    .line 110
    return-object v3

    .line 111
    :cond_6
    invoke-virtual {v6}, La/xcz;->c()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    :goto_2
    if-nez p1, :cond_7

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_7
    iget-object p1, v2, La/ech0;->d:Lkotlin/jvm/functions/Function1;

    .line 119
    .line 120
    iput-object v2, v0, La/gch0;->i:La/ech0;

    .line 121
    .line 122
    iput-object v2, v0, La/gch0;->j:La/ech0;

    .line 123
    .line 124
    iput v5, v0, La/gch0;->m:I

    .line 125
    .line 126
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v1, :cond_8

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_8
    move-object v6, v2

    .line 134
    :goto_3
    iput-object v6, v0, La/gch0;->i:La/ech0;

    .line 135
    .line 136
    iput-object v3, v0, La/gch0;->j:La/ech0;

    .line 137
    .line 138
    iput v4, v0, La/gch0;->m:I

    .line 139
    .line 140
    invoke-virtual {p0, v2, v0}, La/jch0;->a(La/ech0;La/zje;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-ne p1, v1, :cond_9

    .line 145
    .line 146
    :goto_4
    return-object v1

    .line 147
    :cond_9
    move-object p1, v6

    .line 148
    goto :goto_1

    .line 149
    :cond_a
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0
.end method

.method public final c(La/dch0;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    iget-object v3, p0, La/jch0;->a:La/xcz;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v3}, La/xcz;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    invoke-virtual {v3}, La/xcz;->c()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    if-nez v0, :cond_2

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    iget-object v0, p0, La/jch0;->d:La/c4m0;

    .line 30
    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    new-instance v0, La/hch0;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v0, p0, v3, v1}, La/hch0;-><init>(La/jch0;La/yje;B)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    iget-object v4, p0, La/jch0;->b:La/vne;

    .line 41
    .line 42
    invoke-static {v4, v3, v3, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/jch0;->d:La/c4m0;

    .line 47
    .line 48
    :cond_3
    new-instance v0, La/ech0;

    .line 49
    .line 50
    invoke-direct {v0, p1, p2, p3, p4}, La/ech0;-><init>(La/dch0;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, La/jch0;->e:La/q99;

    .line 54
    .line 55
    invoke-interface {p0, v0}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    return v2
.end method

.method public final d(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/ich0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ich0;

    .line 7
    .line 8
    iget v1, v0, La/ich0;->k:I

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
    iput v1, v0, La/ich0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ich0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ich0;-><init>(La/jch0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ich0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ich0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object p1, La/ech0;->e:La/ech0;

    .line 58
    .line 59
    iput v5, v0, La/ich0;->k:I

    .line 60
    .line 61
    iget-object v2, p0, La/jch0;->e:La/q99;

    .line 62
    .line 63
    invoke-interface {v2, v0, p1}, La/jbi0;->m(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v1, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    :goto_1
    iget-object p1, p0, La/jch0;->d:La/c4m0;

    .line 71
    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    iput v4, v0, La/ich0;->k:I

    .line 75
    .line 76
    invoke-static {p1, v0}, La/zvw;->H(La/bby;La/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v1, :cond_5

    .line 81
    .line 82
    :goto_2
    return-object v1

    .line 83
    :cond_5
    :goto_3
    iput-object v3, p0, La/jch0;->d:La/c4m0;

    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0
.end method
