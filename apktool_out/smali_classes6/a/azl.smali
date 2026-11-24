.class public final La/azl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vj50;


# instance fields
.field public final synthetic a:B

.field public final b:La/oyq0;

.field public final c:La/sjj;

.field public final d:La/nul0;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/bzl;La/oyq0;La/sjj;La/nul0;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/azl;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, La/azl;->e:Ljava/lang/Object;

    .line 24
    iput-object p2, p0, La/azl;->b:La/oyq0;

    .line 25
    iput-object p3, p0, La/azl;->c:La/sjj;

    .line 26
    iput-object p4, p0, La/azl;->d:La/nul0;

    return-void
.end method

.method public constructor <init>(La/sjj;La/nul0;La/oyq0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/azl;->a:B

    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p4, p0, La/azl;->e:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p3, p0, La/azl;->b:La/oyq0;

    .line 16
    .line 17
    iput-object p1, p0, La/azl;->c:La/sjj;

    .line 18
    .line 19
    iput-object p2, p0, La/azl;->d:La/nul0;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final C(IJ)J
    .locals 6

    .line 1
    iget-byte p1, p0, La/azl;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/azl;->e:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/azl;->b:La/oyq0;

    .line 12
    .line 13
    const-wide/16 v4, 0x0

    .line 14
    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    and-long/2addr v2, p2

    .line 19
    long-to-int p1, v2

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    cmpl-float v2, v2, v1

    .line 25
    .line 26
    if-gtz v2, :cond_2

    .line 27
    .line 28
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 29
    .line 30
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p0, La/oyq0;->c:La/agk0;

    .line 44
    .line 45
    iget-object v2, p0, La/oyq0;->c:La/agk0;

    .line 46
    .line 47
    invoke-virtual {v0}, La/agk0;->l()F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {v2}, La/agk0;->l()F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    add-float/2addr p1, v3

    .line 60
    invoke-virtual {p0, p1}, La/oyq0;->c(F)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, La/agk0;->l()F

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    cmpg-float p0, v0, p0

    .line 68
    .line 69
    if-nez p0, :cond_1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const/4 p0, 0x2

    .line 73
    invoke-static {p2, p3, v1, v1, p0}, La/ne60;->a(JFFI)J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    :cond_2
    :goto_0
    return-wide v4

    .line 78
    :pswitch_0
    check-cast v0, La/bzl;

    .line 79
    .line 80
    iget-object p1, v0, La/bzl;->e:La/l7m0;

    .line 81
    .line 82
    check-cast p1, La/hgk0;

    .line 83
    .line 84
    invoke-virtual {p1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Lkotlin/jvm/functions/Function0;

    .line 89
    .line 90
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    iget-object p1, p0, La/oyq0;->c:La/agk0;

    .line 104
    .line 105
    iget-object v0, p0, La/oyq0;->c:La/agk0;

    .line 106
    .line 107
    invoke-virtual {p1}, La/agk0;->l()F

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-virtual {v0}, La/agk0;->l()F

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    and-long/2addr p2, v2

    .line 116
    long-to-int p2, p2

    .line 117
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    add-float/2addr p2, v4

    .line 122
    invoke-virtual {p0, p2}, La/oyq0;->c(F)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, La/agk0;->l()F

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    sub-float/2addr p0, p1

    .line 130
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    int-to-long p1, p1

    .line 135
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    int-to-long v0, p0

    .line 140
    const/16 p0, 0x20

    .line 141
    .line 142
    shl-long p0, p1, p0

    .line 143
    .line 144
    and-long p2, v0, v2

    .line 145
    .line 146
    or-long v4, p0, p2

    .line 147
    .line 148
    :goto_1
    return-wide v4

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final S(IJJ)J
    .locals 5

    .line 1
    iget-byte p1, p0, La/azl;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/azl;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/azl;->b:La/oyq0;

    .line 6
    .line 7
    const-wide v1, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    packed-switch p1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 18
    .line 19
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :cond_0
    iget-object p1, p0, La/oyq0;->b:La/agk0;

    .line 34
    .line 35
    iget-object v0, p0, La/oyq0;->c:La/agk0;

    .line 36
    .line 37
    invoke-virtual {p1}, La/agk0;->l()F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    and-long/2addr p2, v1

    .line 42
    long-to-int p2, p2

    .line 43
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    add-float/2addr p3, p1

    .line 48
    invoke-virtual {p0, p3}, La/oyq0;->b(F)V

    .line 49
    .line 50
    .line 51
    and-long p3, p4, v1

    .line 52
    .line 53
    long-to-int p1, p3

    .line 54
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    const/4 p4, 0x0

    .line 59
    cmpg-float p3, p3, p4

    .line 60
    .line 61
    const/16 p5, 0x20

    .line 62
    .line 63
    if-gez p3, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0}, La/agk0;->l()F

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    invoke-virtual {v0}, La/agk0;->l()F

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    add-float/2addr p1, p3

    .line 78
    invoke-virtual {p0, p1}, La/oyq0;->c(F)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, La/agk0;->l()F

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    sub-float/2addr p0, p2

    .line 86
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    int-to-long p1, p1

    .line 91
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    :goto_0
    int-to-long p3, p0

    .line 96
    shl-long p0, p1, p5

    .line 97
    .line 98
    and-long p2, p3, v1

    .line 99
    .line 100
    or-long v3, p0, p2

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    cmpg-float p2, p2, p4

    .line 108
    .line 109
    if-nez p2, :cond_2

    .line 110
    .line 111
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    cmpl-float p2, p2, p4

    .line 116
    .line 117
    if-lez p2, :cond_2

    .line 118
    .line 119
    invoke-virtual {p0, p4}, La/oyq0;->b(F)V

    .line 120
    .line 121
    .line 122
    :cond_2
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    cmpl-float p2, p2, p4

    .line 127
    .line 128
    if-lez p2, :cond_3

    .line 129
    .line 130
    invoke-virtual {v0}, La/agk0;->l()F

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    invoke-virtual {v0}, La/agk0;->l()F

    .line 135
    .line 136
    .line 137
    move-result p3

    .line 138
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    add-float/2addr p1, p3

    .line 143
    invoke-virtual {p0, p1}, La/oyq0;->c(F)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, La/agk0;->l()F

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    sub-float/2addr p0, p2

    .line 151
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    int-to-long p1, p1

    .line 156
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    goto :goto_0

    .line 161
    :cond_3
    :goto_1
    return-wide v3

    .line 162
    :pswitch_0
    check-cast v0, La/bzl;

    .line 163
    .line 164
    iget-object p1, v0, La/bzl;->e:La/l7m0;

    .line 165
    .line 166
    check-cast p1, La/hgk0;

    .line 167
    .line 168
    invoke-virtual {p1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, Lkotlin/jvm/functions/Function0;

    .line 173
    .line 174
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-nez p1, :cond_4

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_4
    iget-object p1, p0, La/oyq0;->b:La/agk0;

    .line 188
    .line 189
    invoke-virtual {p1}, La/agk0;->l()F

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    and-long/2addr p2, v1

    .line 194
    long-to-int p2, p2

    .line 195
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    add-float/2addr p2, p1

    .line 200
    invoke-virtual {p0, p2}, La/oyq0;->b(F)V

    .line 201
    .line 202
    .line 203
    :goto_2
    return-wide v3

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(JJLa/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v5, p5

    .line 8
    .line 9
    iget-byte v6, v0, La/azl;->a:B

    .line 10
    .line 11
    iget-object v7, v0, La/azl;->d:La/nul0;

    .line 12
    .line 13
    iget-object v8, v0, La/azl;->c:La/sjj;

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    const-string v10, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    const/high16 v11, -0x80000000

    .line 19
    .line 20
    const/4 v12, 0x1

    .line 21
    const/4 v13, 0x2

    .line 22
    iget-object v14, v0, La/azl;->b:La/oyq0;

    .line 23
    .line 24
    packed-switch v6, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    instance-of v6, v5, La/oip;

    .line 28
    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    move-object v6, v5

    .line 32
    check-cast v6, La/oip;

    .line 33
    .line 34
    iget v15, v6, La/oip;->n:I

    .line 35
    .line 36
    and-int v16, v15, v11

    .line 37
    .line 38
    if-eqz v16, :cond_0

    .line 39
    .line 40
    sub-int/2addr v15, v11

    .line 41
    iput v15, v6, La/oip;->n:I

    .line 42
    .line 43
    :goto_0
    move-object v5, v6

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    new-instance v6, La/oip;

    .line 46
    .line 47
    invoke-direct {v6, v0, v5}, La/oip;-><init>(La/azl;La/zje;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_1
    iget-object v6, v5, La/oip;->l:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object v11, La/wne;->a:La/wne;

    .line 54
    .line 55
    iget v15, v5, La/oip;->n:I

    .line 56
    .line 57
    if-eqz v15, :cond_3

    .line 58
    .line 59
    if-eq v15, v12, :cond_2

    .line 60
    .line 61
    if-ne v15, v13, :cond_1

    .line 62
    .line 63
    iget-wide v0, v5, La/oip;->k:J

    .line 64
    .line 65
    invoke-static {v6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_1
    invoke-static {v10}, La/jf4;->n(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_2
    iget-wide v0, v5, La/oip;->j:J

    .line 74
    .line 75
    iget-wide v2, v5, La/oip;->i:J

    .line 76
    .line 77
    invoke-static {v6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-wide/from16 v17, v2

    .line 81
    .line 82
    move-wide v3, v0

    .line 83
    move-wide/from16 v1, v17

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    invoke-static {v6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v3, v4}, La/g6u0;->c(J)F

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    const/4 v9, 0x0

    .line 94
    cmpl-float v6, v6, v9

    .line 95
    .line 96
    if-lez v6, :cond_4

    .line 97
    .line 98
    invoke-virtual {v14, v9}, La/oyq0;->b(F)V

    .line 99
    .line 100
    .line 101
    :cond_4
    iput-wide v1, v5, La/oip;->i:J

    .line 102
    .line 103
    iput-wide v3, v5, La/oip;->j:J

    .line 104
    .line 105
    iput v12, v5, La/oip;->n:I

    .line 106
    .line 107
    invoke-super/range {v0 .. v5}, La/vj50;->g(JJLa/zje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    if-ne v6, v11, :cond_5

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    :goto_2
    check-cast v6, La/g6u0;

    .line 115
    .line 116
    iget-wide v9, v6, La/g6u0;->a:J

    .line 117
    .line 118
    invoke-static {v3, v4}, La/g6u0;->c(J)F

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    iput-wide v1, v5, La/oip;->i:J

    .line 123
    .line 124
    iput-wide v3, v5, La/oip;->j:J

    .line 125
    .line 126
    iput-wide v9, v5, La/oip;->k:J

    .line 127
    .line 128
    iput v13, v5, La/oip;->n:I

    .line 129
    .line 130
    invoke-static {v14, v0, v8, v7, v5}, La/nip;->e(La/oyq0;FLa/sjj;La/nul0;La/zje;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    if-ne v6, v11, :cond_6

    .line 135
    .line 136
    :goto_3
    move-object v9, v11

    .line 137
    goto :goto_5

    .line 138
    :cond_6
    move-wide v0, v9

    .line 139
    :goto_4
    check-cast v6, La/g6u0;

    .line 140
    .line 141
    iget-wide v2, v6, La/g6u0;->a:J

    .line 142
    .line 143
    invoke-static {v0, v1, v2, v3}, La/g6u0;->e(JJ)J

    .line 144
    .line 145
    .line 146
    move-result-wide v0

    .line 147
    new-instance v9, La/g6u0;

    .line 148
    .line 149
    invoke-direct {v9, v0, v1}, La/g6u0;-><init>(J)V

    .line 150
    .line 151
    .line 152
    :goto_5
    return-object v9

    .line 153
    :pswitch_0
    instance-of v6, v5, La/zyl;

    .line 154
    .line 155
    if-eqz v6, :cond_7

    .line 156
    .line 157
    move-object v6, v5

    .line 158
    check-cast v6, La/zyl;

    .line 159
    .line 160
    iget v15, v6, La/zyl;->n:I

    .line 161
    .line 162
    and-int v16, v15, v11

    .line 163
    .line 164
    if-eqz v16, :cond_7

    .line 165
    .line 166
    sub-int/2addr v15, v11

    .line 167
    iput v15, v6, La/zyl;->n:I

    .line 168
    .line 169
    :goto_6
    move-object v5, v6

    .line 170
    goto :goto_7

    .line 171
    :cond_7
    new-instance v6, La/zyl;

    .line 172
    .line 173
    invoke-direct {v6, v0, v5}, La/zyl;-><init>(La/azl;La/zje;)V

    .line 174
    .line 175
    .line 176
    goto :goto_6

    .line 177
    :goto_7
    iget-object v6, v5, La/zyl;->l:Ljava/lang/Object;

    .line 178
    .line 179
    sget-object v11, La/wne;->a:La/wne;

    .line 180
    .line 181
    iget v15, v5, La/zyl;->n:I

    .line 182
    .line 183
    if-eqz v15, :cond_a

    .line 184
    .line 185
    if-eq v15, v12, :cond_9

    .line 186
    .line 187
    if-ne v15, v13, :cond_8

    .line 188
    .line 189
    iget-wide v0, v5, La/zyl;->k:J

    .line 190
    .line 191
    invoke-static {v6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto :goto_a

    .line 195
    :cond_8
    invoke-static {v10}, La/jf4;->n(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_b

    .line 199
    :cond_9
    iget-wide v0, v5, La/zyl;->j:J

    .line 200
    .line 201
    iget-wide v2, v5, La/zyl;->i:J

    .line 202
    .line 203
    invoke-static {v6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    goto :goto_8

    .line 207
    :cond_a
    invoke-static {v6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    iput-wide v1, v5, La/zyl;->i:J

    .line 211
    .line 212
    iput-wide v3, v5, La/zyl;->j:J

    .line 213
    .line 214
    iput v12, v5, La/zyl;->n:I

    .line 215
    .line 216
    invoke-super/range {v0 .. v5}, La/vj50;->g(JJLa/zje;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    if-ne v6, v11, :cond_b

    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_b
    move-wide/from16 v2, p1

    .line 224
    .line 225
    move-wide/from16 v0, p3

    .line 226
    .line 227
    :goto_8
    check-cast v6, La/g6u0;

    .line 228
    .line 229
    iget-wide v9, v6, La/g6u0;->a:J

    .line 230
    .line 231
    invoke-static {v0, v1}, La/g6u0;->c(J)F

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    iput-wide v2, v5, La/zyl;->i:J

    .line 236
    .line 237
    iput-wide v0, v5, La/zyl;->j:J

    .line 238
    .line 239
    iput-wide v9, v5, La/zyl;->k:J

    .line 240
    .line 241
    iput v13, v5, La/zyl;->n:I

    .line 242
    .line 243
    invoke-static {v14, v4, v8, v7, v5}, La/mbc;->b0(La/oyq0;FLa/sjj;La/nul0;La/zje;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    if-ne v6, v11, :cond_c

    .line 248
    .line 249
    :goto_9
    move-object v9, v11

    .line 250
    goto :goto_b

    .line 251
    :cond_c
    move-wide v0, v9

    .line 252
    :goto_a
    check-cast v6, La/g6u0;

    .line 253
    .line 254
    iget-wide v2, v6, La/g6u0;->a:J

    .line 255
    .line 256
    invoke-static {v0, v1, v2, v3}, La/g6u0;->e(JJ)J

    .line 257
    .line 258
    .line 259
    move-result-wide v0

    .line 260
    new-instance v9, La/g6u0;

    .line 261
    .line 262
    invoke-direct {v9, v0, v1}, La/g6u0;-><init>(J)V

    .line 263
    .line 264
    .line 265
    :goto_b
    return-object v9

    .line 266
    nop

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
