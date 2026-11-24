.class public final La/fqc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g45;

.field public final b:La/oif0;

.field public final c:La/chf0;


# direct methods
.method public synthetic constructor <init>(La/g45;La/oif0;La/chf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fqc;->a:La/g45;

    iput-object p2, p0, La/fqc;->b:La/oif0;

    iput-object p3, p0, La/fqc;->c:La/chf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/fqc;->a:La/g45;

    .line 2
    .line 3
    iget-object v1, v0, La/g45;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/ave;

    .line 6
    .line 7
    instance-of v2, p1, La/eqc;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, p1

    .line 12
    check-cast v2, La/eqc;

    .line 13
    .line 14
    iget v3, v2, La/eqc;->k:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v2, La/eqc;->k:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, La/eqc;

    .line 27
    .line 28
    invoke-direct {v2, p0, p1}, La/eqc;-><init>(La/fqc;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p1, v2, La/eqc;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v2, La/eqc;->k:I

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x1

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    if-eq v4, v7, :cond_3

    .line 43
    .line 44
    if-eq v4, v6, :cond_2

    .line 45
    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_6

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0

    .line 59
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object p1, La/q4f;->b:La/q4f;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, La/g45;->g0(La/q4f;)V

    .line 73
    .line 74
    .line 75
    iput v7, v2, La/eqc;->k:I

    .line 76
    .line 77
    iget-object p1, p0, La/fqc;->b:La/oif0;

    .line 78
    .line 79
    invoke-virtual {p1, v2}, La/oif0;->e(La/zje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v3, :cond_5

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_5
    :goto_1
    iput v6, v2, La/eqc;->k:I

    .line 87
    .line 88
    iget-object p0, p0, La/fqc;->c:La/chf0;

    .line 89
    .line 90
    invoke-virtual {p0, v2}, La/chf0;->s(La/zje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-ne p0, v3, :cond_6

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_6
    :goto_2
    iget-object p0, v1, La/ave;->n:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 100
    .line 101
    .line 102
    iget-object p0, v0, La/g45;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, La/q7d0;

    .line 105
    .line 106
    const-string p1, "COUPON_KEY_PREFERENCE"

    .line 107
    .line 108
    invoke-virtual {p0, p1}, La/q7d0;->h(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const-string p1, "COUPON_TYPE_KEY_PREFERENCE"

    .line 112
    .line 113
    invoke-virtual {p0, p1}, La/q7d0;->h(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iput v5, v2, La/eqc;->k:I

    .line 117
    .line 118
    iget-object p0, v1, La/ave;->q:La/qoj0;

    .line 119
    .line 120
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 121
    .line 122
    invoke-virtual {p0, p1, v2}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v3, :cond_7

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    :goto_3
    if-ne p0, v3, :cond_8

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    :goto_4
    if-ne p0, v3, :cond_9

    .line 137
    .line 138
    :goto_5
    return-object v3

    .line 139
    :cond_9
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0
.end method

.method public b(La/q4f;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/fqc;->a:La/g45;

    .line 2
    .line 3
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/lye;

    .line 6
    .line 7
    instance-of v1, p2, La/z4v;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, p2

    .line 12
    check-cast v1, La/z4v;

    .line 13
    .line 14
    iget v2, v1, La/z4v;->m:I

    .line 15
    .line 16
    const/high16 v3, -0x80000000

    .line 17
    .line 18
    and-int v4, v2, v3

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    sub-int/2addr v2, v3

    .line 23
    iput v2, v1, La/z4v;->m:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v1, La/z4v;

    .line 27
    .line 28
    invoke-direct {v1, p0, p2}, La/z4v;-><init>(La/fqc;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p2, v1, La/z4v;->k:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v1, La/z4v;->m:I

    .line 36
    .line 37
    const/16 v4, 0x64

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x1

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    if-ne v3, v7, :cond_1

    .line 45
    .line 46
    iget p0, v1, La/z4v;->j:I

    .line 47
    .line 48
    iget-object p1, v1, La/z4v;->i:La/q4f;

    .line 49
    .line 50
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v6

    .line 61
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p2, p0, La/fqc;->b:La/oif0;

    .line 65
    .line 66
    invoke-virtual {p2}, La/oif0;->n()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iget-object v3, v0, La/lye;->n:La/p7m0;

    .line 71
    .line 72
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, La/en7;

    .line 77
    .line 78
    iget v8, v3, La/en7;->c:I

    .line 79
    .line 80
    iget-object v9, v0, La/lye;->g:Ljava/lang/Integer;

    .line 81
    .line 82
    if-eqz v9, :cond_3

    .line 83
    .line 84
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    goto/16 :goto_6

    .line 89
    .line 90
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    const/4 v10, 0x3

    .line 95
    if-eq v9, v10, :cond_d

    .line 96
    .line 97
    const/4 p0, 0x5

    .line 98
    if-eq v9, p0, :cond_5

    .line 99
    .line 100
    const/16 p0, 0xb

    .line 101
    .line 102
    if-eq v9, p0, :cond_4

    .line 103
    .line 104
    invoke-virtual {p1}, La/q4f;->a()I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    const/4 p1, 0x0

    .line 109
    const/16 p2, 0x1b

    .line 110
    .line 111
    invoke-static {v3, p1, p2}, La/en7;->a(La/en7;ZI)La/en7;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iput-object v6, v0, La/lye;->g:Ljava/lang/Integer;

    .line 116
    .line 117
    iget-object p2, v0, La/lye;->n:La/p7m0;

    .line 118
    .line 119
    invoke-virtual {p2, v6, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto/16 :goto_6

    .line 123
    .line 124
    :cond_4
    sget-object p0, La/q4f;->c:La/q4f;

    .line 125
    .line 126
    invoke-virtual {p0}, La/q4f;->a()I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    goto/16 :goto_6

    .line 131
    .line 132
    :cond_5
    invoke-virtual {p1}, La/q4f;->a()I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    new-instance p1, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    :cond_6
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_7

    .line 150
    .line 151
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    move-object v1, v0

    .line 156
    check-cast v1, La/hf6;

    .line 157
    .line 158
    iget-object v1, v1, La/hf6;->c:Ljava/util/List;

    .line 159
    .line 160
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_6

    .line 165
    .line 166
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    :cond_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_9

    .line 179
    .line 180
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    move-object v1, v0

    .line 185
    check-cast v1, La/hf6;

    .line 186
    .line 187
    iget-boolean v1, v1, La/hf6;->e:Z

    .line 188
    .line 189
    if-eqz v1, :cond_8

    .line 190
    .line 191
    move-object v6, v0

    .line 192
    :cond_9
    check-cast v6, La/hf6;

    .line 193
    .line 194
    if-eqz v6, :cond_a

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    sub-int/2addr p1, v7

    .line 201
    goto :goto_2

    .line 202
    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    :goto_2
    if-lez v8, :cond_c

    .line 207
    .line 208
    if-lt v8, p1, :cond_b

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_b
    move v5, v8

    .line 212
    :cond_c
    :goto_3
    mul-int/lit16 p0, p0, 0x2710

    .line 213
    .line 214
    invoke-static {v5, v4, p0, p1}, La/vqd;->a(IIII)I

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    goto :goto_6

    .line 219
    :cond_d
    iput-object p1, v1, La/z4v;->i:La/q4f;

    .line 220
    .line 221
    iput v8, v1, La/z4v;->j:I

    .line 222
    .line 223
    iput v7, v1, La/z4v;->m:I

    .line 224
    .line 225
    iget-object p0, p0, La/fqc;->c:La/chf0;

    .line 226
    .line 227
    invoke-virtual {p0, v1}, La/chf0;->p(La/yje;)Ljava/io/Serializable;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    if-ne p2, v2, :cond_e

    .line 232
    .line 233
    return-object v2

    .line 234
    :cond_e
    move p0, v8

    .line 235
    :goto_4
    check-cast p2, Ljava/util/List;

    .line 236
    .line 237
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-lez p0, :cond_10

    .line 242
    .line 243
    if-lt p0, v0, :cond_f

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_f
    move v5, p0

    .line 247
    :cond_10
    :goto_5
    invoke-virtual {p1}, La/q4f;->a()I

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    mul-int/lit16 p0, p0, 0x2710

    .line 256
    .line 257
    invoke-static {v5, v4, p0, p1}, La/vqd;->a(IIII)I

    .line 258
    .line 259
    .line 260
    move-result p0

    .line 261
    :goto_6
    new-instance p1, Ljava/lang/Integer;

    .line 262
    .line 263
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 264
    .line 265
    .line 266
    return-object p1
.end method
