.class public final La/z7u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/edo;


# direct methods
.method public constructor <init>(La/edo;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/z7u;->a:La/edo;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/z7u;->a:La/edo;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/z7u;->a:La/edo;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/util/List;La/zje;)Ljava/io/Serializable;
    .locals 9

    .line 1
    instance-of v0, p2, La/kfu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/kfu;

    .line 7
    .line 8
    iget v1, v0, La/kfu;->l:I

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
    iput v1, v0, La/kfu;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/kfu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/kfu;-><init>(La/z7u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/kfu;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/kfu;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, La/kfu;->i:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
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
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    sget-object p0, La/iun;->a:La/iun;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_3
    new-instance p2, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_b

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, La/a5w;

    .line 82
    .line 83
    if-eqz v2, :cond_a

    .line 84
    .line 85
    instance-of v5, v2, La/vw4;

    .line 86
    .line 87
    const/16 v6, 0xa

    .line 88
    .line 89
    if-eqz v5, :cond_4

    .line 90
    .line 91
    check-cast v2, La/vw4;

    .line 92
    .line 93
    iget-object v2, v2, La/vw4;->T:Ljava/util/List;

    .line 94
    .line 95
    new-instance v5, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-eqz v6, :cond_9

    .line 113
    .line 114
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    check-cast v6, La/z0w;

    .line 119
    .line 120
    iget-wide v6, v6, La/z0w;->F:J

    .line 121
    .line 122
    invoke-static {v6, v7, v5}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    instance-of v5, v2, La/kzv;

    .line 127
    .line 128
    if-eqz v5, :cond_5

    .line 129
    .line 130
    check-cast v2, La/kzv;

    .line 131
    .line 132
    iget-object v2, v2, La/kzv;->Y:Ljava/util/List;

    .line 133
    .line 134
    new-instance v5, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_9

    .line 152
    .line 153
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    check-cast v6, La/z0w;

    .line 158
    .line 159
    iget-wide v6, v6, La/z0w;->F:J

    .line 160
    .line 161
    invoke-static {v6, v7, v5}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_5
    instance-of v5, v2, La/z7y;

    .line 166
    .line 167
    if-eqz v5, :cond_6

    .line 168
    .line 169
    sget-object v5, La/iun;->a:La/iun;

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_6
    instance-of v5, v2, La/for0;

    .line 173
    .line 174
    if-eqz v5, :cond_7

    .line 175
    .line 176
    sget-object v5, La/iun;->a:La/iun;

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_7
    instance-of v5, v2, La/nc10;

    .line 180
    .line 181
    if-eqz v5, :cond_8

    .line 182
    .line 183
    sget-object v5, La/iun;->a:La/iun;

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_8
    instance-of v2, v2, La/y21;

    .line 187
    .line 188
    if-eqz v2, :cond_a

    .line 189
    .line 190
    sget-object v5, La/iun;->a:La/iun;

    .line 191
    .line 192
    :cond_9
    :goto_4
    invoke-static {p2, v5}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 197
    .line 198
    .line 199
    return-object v3

    .line 200
    :cond_b
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-nez p1, :cond_f

    .line 205
    .line 206
    iput-object p2, v0, La/kfu;->i:Ljava/util/ArrayList;

    .line 207
    .line 208
    iput v4, v0, La/kfu;->l:I

    .line 209
    .line 210
    iget-object p0, p0, La/z7u;->a:La/edo;

    .line 211
    .line 212
    invoke-virtual {p0, v0}, La/edo;->b(La/zje;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    if-ne p0, v1, :cond_c

    .line 217
    .line 218
    return-object v1

    .line 219
    :cond_c
    move-object v8, p2

    .line 220
    move-object p2, p0

    .line 221
    move-object p0, v8

    .line 222
    :goto_5
    check-cast p2, Ljava/util/List;

    .line 223
    .line 224
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    new-instance p1, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    :cond_d
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_e

    .line 242
    .line 243
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    move-object v1, v0

    .line 248
    check-cast v1, La/xco;

    .line 249
    .line 250
    iget-wide v1, v1, La/xco;->a:J

    .line 251
    .line 252
    new-instance v3, Ljava/lang/Long;

    .line 253
    .line 254
    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 255
    .line 256
    .line 257
    invoke-interface {p0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-eqz v1, :cond_d

    .line 262
    .line 263
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_e
    return-object p1

    .line 268
    :cond_f
    sget-object p0, La/iun;->a:La/iun;

    .line 269
    .line 270
    return-object p0
.end method

.method public b(ILa/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/y7u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/y7u;

    .line 7
    .line 8
    iget v1, v0, La/y7u;->l:I

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
    iput v1, v0, La/y7u;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/y7u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/y7u;-><init>(La/z7u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/y7u;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/y7u;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget p1, v0, La/y7u;->i:I

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput p1, v0, La/y7u;->i:I

    .line 53
    .line 54
    iput v4, v0, La/y7u;->l:I

    .line 55
    .line 56
    iget-object p0, p0, La/z7u;->a:La/edo;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, La/edo;->b(La/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-ne p2, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    .line 66
    .line 67
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_5

    .line 76
    .line 77
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    move-object v0, p2

    .line 82
    check-cast v0, La/xco;

    .line 83
    .line 84
    iget-wide v0, v0, La/xco;->a:J

    .line 85
    .line 86
    int-to-long v4, p1

    .line 87
    cmp-long v0, v0, v4

    .line 88
    .line 89
    if-nez v0, :cond_4

    .line 90
    .line 91
    move-object v3, p2

    .line 92
    :cond_5
    check-cast v3, La/xco;

    .line 93
    .line 94
    if-eqz v3, :cond_7

    .line 95
    .line 96
    iget-object p0, v3, La/xco;->b:Ljava/lang/String;

    .line 97
    .line 98
    if-nez p0, :cond_6

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    return-object p0

    .line 102
    :cond_7
    :goto_2
    const-string p0, ""

    .line 103
    .line 104
    return-object p0
.end method

.method public c(JLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/apx;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/apx;

    .line 7
    .line 8
    iget v1, v0, La/apx;->k:I

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
    iput v1, v0, La/apx;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/apx;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/apx;-><init>(La/z7u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/apx;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/apx;->k:I

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
    iput v3, v0, La/apx;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/z7u;->a:La/edo;

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2, v0}, La/edo;->a(JLa/zje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    if-ne p3, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    check-cast p3, La/xco;

    .line 62
    .line 63
    if-eqz p3, :cond_4

    .line 64
    .line 65
    iget-boolean p0, p3, La/xco;->e:Z

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    const/4 p0, 0x0

    .line 69
    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method
