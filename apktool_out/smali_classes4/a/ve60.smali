.class public final La/ve60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vf80;


# instance fields
.field public final a:La/vne;

.field public final b:La/t33;

.field public final c:La/ue60;


# direct methods
.method public constructor <init>(La/vne;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ve60;->a:La/vne;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-static {p1}, La/xf0;->c(F)La/t33;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, La/ve60;->b:La/t33;

    .line 15
    .line 16
    new-instance p1, La/ue60;

    .line 17
    .line 18
    invoke-direct {p1, p0}, La/ue60;-><init>(La/ve60;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/ve60;->c:La/ue60;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()La/yzj;
    .locals 0

    .line 1
    iget-object p0, p0, La/ve60;->c:La/ue60;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/ve60;->b:La/t33;

    .line 2
    .line 3
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 v0, 0x0

    .line 14
    cmpg-float p0, p0, v0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    move p0, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    :goto_0
    xor-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final c(JILkotlin/jvm/functions/Function1;)J
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-wide v6, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long v2, p1, v6

    .line 9
    .line 10
    long-to-int v0, v2

    .line 11
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, v1, La/ve60;->b:La/t33;

    .line 20
    .line 21
    invoke-virtual {v3}, La/t33;->d()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    cmpg-float v2, v2, v4

    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    move v2, v8

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v2, 0x0

    .line 43
    :goto_0
    invoke-virtual {v3}, La/t33;->d()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    float-to-double v4, v4

    .line 58
    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    .line 59
    .line 60
    cmpl-double v4, v4, v9

    .line 61
    .line 62
    iget-object v11, v1, La/ve60;->a:La/vne;

    .line 63
    .line 64
    const/4 v12, 0x3

    .line 65
    move v5, v4

    .line 66
    const/4 v4, 0x0

    .line 67
    if-lez v5, :cond_2

    .line 68
    .line 69
    if-nez v2, :cond_2

    .line 70
    .line 71
    invoke-virtual {v3}, La/t33;->d()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-virtual {v3}, La/t33;->d()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Ljava/lang/Number;

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    add-float/2addr v5, v3

    .line 96
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    cmpg-float v3, v3, v5

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    if-nez v3, :cond_1

    .line 108
    .line 109
    new-instance v0, La/te60;

    .line 110
    .line 111
    const/4 v5, 0x1

    .line 112
    move-wide/from16 v2, p1

    .line 113
    .line 114
    invoke-direct/range {v0 .. v5}, La/te60;-><init>(La/ve60;JLa/yje;B)V

    .line 115
    .line 116
    .line 117
    move-object v5, v4

    .line 118
    move-wide v3, v2

    .line 119
    invoke-static {v11, v5, v5, v0, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 120
    .line 121
    .line 122
    const/4 v0, 0x2

    .line 123
    invoke-static {v3, v4, v13, v13, v0}, La/ne60;->a(JFFI)J

    .line 124
    .line 125
    .line 126
    move-result-wide v13

    .line 127
    move-wide v15, v6

    .line 128
    goto :goto_1

    .line 129
    :cond_1
    move-object v5, v4

    .line 130
    move-wide/from16 v3, p1

    .line 131
    .line 132
    new-instance v14, La/w620;

    .line 133
    .line 134
    const/16 v15, 0x1a

    .line 135
    .line 136
    invoke-direct {v14, v1, v5, v15}, La/w620;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 137
    .line 138
    .line 139
    invoke-static {v11, v5, v5, v14, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 140
    .line 141
    .line 142
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    add-float/2addr v0, v2

    .line 147
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    int-to-long v13, v2

    .line 152
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    move-wide v15, v6

    .line 157
    int-to-long v5, v0

    .line 158
    const/16 v0, 0x20

    .line 159
    .line 160
    shl-long/2addr v13, v0

    .line 161
    and-long/2addr v5, v15

    .line 162
    or-long/2addr v13, v5

    .line 163
    goto :goto_1

    .line 164
    :cond_2
    move-wide/from16 v3, p1

    .line 165
    .line 166
    move-wide v15, v6

    .line 167
    const-wide/16 v13, 0x0

    .line 168
    .line 169
    :goto_1
    invoke-static {v3, v4, v13, v14}, La/ne60;->e(JJ)J

    .line 170
    .line 171
    .line 172
    move-result-wide v3

    .line 173
    new-instance v0, La/ne60;

    .line 174
    .line 175
    invoke-direct {v0, v3, v4}, La/ne60;-><init>(J)V

    .line 176
    .line 177
    .line 178
    move-object/from16 v5, p4

    .line 179
    .line 180
    invoke-interface {v5, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, La/ne60;

    .line 185
    .line 186
    iget-wide v6, v0, La/ne60;->a:J

    .line 187
    .line 188
    invoke-static {v3, v4, v6, v7}, La/ne60;->e(JJ)J

    .line 189
    .line 190
    .line 191
    move-result-wide v3

    .line 192
    move-wide/from16 p1, v3

    .line 193
    .line 194
    and-long v2, p1, v15

    .line 195
    .line 196
    long-to-int v0, v2

    .line 197
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    float-to-double v2, v0

    .line 206
    cmpl-double v0, v2, v9

    .line 207
    .line 208
    if-lez v0, :cond_3

    .line 209
    .line 210
    move/from16 v0, p3

    .line 211
    .line 212
    if-ne v0, v8, :cond_3

    .line 213
    .line 214
    new-instance v0, La/te60;

    .line 215
    .line 216
    const/4 v4, 0x0

    .line 217
    const/4 v5, 0x0

    .line 218
    move-wide/from16 v2, p1

    .line 219
    .line 220
    invoke-direct/range {v0 .. v5}, La/te60;-><init>(La/ve60;JLa/yje;B)V

    .line 221
    .line 222
    .line 223
    invoke-static {v11, v4, v4, v0, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 224
    .line 225
    .line 226
    :cond_3
    invoke-static {v13, v14, v6, v7}, La/ne60;->f(JJ)J

    .line 227
    .line 228
    .line 229
    move-result-wide v0

    .line 230
    return-wide v0
.end method

.method public final d(JLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, La/se60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/se60;

    .line 7
    .line 8
    iget v1, v0, La/se60;->l:I

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
    iput v1, v0, La/se60;->l:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/se60;

    .line 22
    .line 23
    invoke-direct {v0, p0, p4}, La/se60;-><init>(La/ve60;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p4, v6, La/se60;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/se60;->l:I

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_4

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v4

    .line 52
    :cond_2
    iget-wide p1, v6, La/se60;->i:J

    .line 53
    .line 54
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance p4, La/g6u0;

    .line 62
    .line 63
    invoke-direct {p4, p1, p2}, La/g6u0;-><init>(J)V

    .line 64
    .line 65
    .line 66
    iput-wide p1, v6, La/se60;->i:J

    .line 67
    .line 68
    iput v3, v6, La/se60;->l:I

    .line 69
    .line 70
    invoke-interface {p3, p4, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    if-ne p4, v0, :cond_4

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    :goto_2
    check-cast p4, La/g6u0;

    .line 78
    .line 79
    iget-wide p3, p4, La/g6u0;->a:J

    .line 80
    .line 81
    invoke-static {p1, p2, p3, p4}, La/g6u0;->d(JJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide p3

    .line 85
    invoke-static {p3, p4}, La/g6u0;->c(J)F

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    const/4 p4, 0x7

    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-static {v1, v1, v4, p4}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    move p4, v2

    .line 96
    new-instance v2, Ljava/lang/Float;

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    .line 100
    .line 101
    .line 102
    new-instance v4, Ljava/lang/Float;

    .line 103
    .line 104
    invoke-direct {v4, p3}, Ljava/lang/Float;-><init>(F)V

    .line 105
    .line 106
    .line 107
    iput-wide p1, v6, La/se60;->i:J

    .line 108
    .line 109
    iput p4, v6, La/se60;->l:I

    .line 110
    .line 111
    iget-object v1, p0, La/ve60;->b:La/t33;

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    const/16 v7, 0x8

    .line 115
    .line 116
    invoke-static/range {v1 .. v7}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-ne p0, v0, :cond_5

    .line 121
    .line 122
    :goto_3
    return-object v0

    .line 123
    :cond_5
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0
.end method
