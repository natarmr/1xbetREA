.class public final La/fnq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gmq;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(La/gmq;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/fnq;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/fnq;->c:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iput-object p1, p0, La/fnq;->b:La/gmq;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 12
    iput-byte p3, p0, La/fnq;->a:B

    iput-object p1, p0, La/fnq;->b:La/gmq;

    iput-object p2, p0, La/fnq;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/fnq;->a:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/high16 v2, -0x80000000

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, La/fnq;->c:Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    iget-object v7, p0, La/fnq;->b:La/gmq;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p0, La/vnq;

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    invoke-direct {p0, p1, v6, v0}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v7, p0, p2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object p1, La/wne;->a:La/wne;

    .line 28
    .line 29
    if-ne p0, p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    :goto_0
    return-object p0

    .line 35
    :pswitch_0
    new-instance p0, La/vnq;

    .line 36
    .line 37
    invoke-direct {p0, p1, v6, v3}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v7, p0, p2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sget-object p1, La/wne;->a:La/wne;

    .line 45
    .line 46
    if-ne p0, p1, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    :goto_1
    return-object p0

    .line 52
    :pswitch_1
    new-instance p0, La/vnq;

    .line 53
    .line 54
    invoke-direct {p0, p1, v6, v5}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v7, p0, p2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    sget-object p1, La/wne;->a:La/wne;

    .line 62
    .line 63
    if-ne p0, p1, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    :goto_2
    return-object p0

    .line 69
    :pswitch_2
    instance-of v0, p2, La/tnq;

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    move-object v0, p2

    .line 74
    check-cast v0, La/tnq;

    .line 75
    .line 76
    iget v3, v0, La/tnq;->j:I

    .line 77
    .line 78
    and-int v8, v3, v2

    .line 79
    .line 80
    if-eqz v8, :cond_3

    .line 81
    .line 82
    sub-int/2addr v3, v2

    .line 83
    iput v3, v0, La/tnq;->j:I

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    new-instance v0, La/tnq;

    .line 87
    .line 88
    invoke-direct {v0, p0, p2}, La/tnq;-><init>(La/fnq;La/yje;)V

    .line 89
    .line 90
    .line 91
    :goto_3
    iget-object p0, v0, La/tnq;->i:Ljava/lang/Object;

    .line 92
    .line 93
    sget-object p2, La/wne;->a:La/wne;

    .line 94
    .line 95
    iget v2, v0, La/tnq;->j:I

    .line 96
    .line 97
    if-eqz v2, :cond_5

    .line 98
    .line 99
    if-ne v2, v5, :cond_4

    .line 100
    .line 101
    iget-object p1, v0, La/tnq;->l:La/vnq;

    .line 102
    .line 103
    :try_start_0
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch La/t; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    .line 105
    .line 106
    goto :goto_5

    .line 107
    :catch_0
    move-exception p0

    .line 108
    goto :goto_4

    .line 109
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_5
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    new-instance p0, La/vnq;

    .line 117
    .line 118
    invoke-direct {p0, p1, v6}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    :try_start_1
    iput-object p0, v0, La/tnq;->l:La/vnq;

    .line 122
    .line 123
    iput v5, v0, La/tnq;->j:I

    .line 124
    .line 125
    invoke-interface {v7, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0
    :try_end_1
    .catch La/t; {:try_start_1 .. :try_end_1} :catch_1

    .line 129
    if-ne p0, p2, :cond_6

    .line 130
    .line 131
    move-object v4, p2

    .line 132
    goto :goto_6

    .line 133
    :catch_1
    move-exception p1

    .line 134
    move-object v10, p1

    .line 135
    move-object p1, p0

    .line 136
    move-object p0, v10

    .line 137
    :goto_4
    iget-object p2, p0, La/t;->a:Ljava/lang/Object;

    .line 138
    .line 139
    if-ne p2, p1, :cond_7

    .line 140
    .line 141
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, La/zvw;->O(Lkotlin/coroutines/CoroutineContext;)V

    .line 146
    .line 147
    .line 148
    :cond_6
    :goto_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    :goto_6
    return-object v4

    .line 151
    :cond_7
    throw p0

    .line 152
    :pswitch_3
    new-instance p0, La/hie0;

    .line 153
    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    .line 156
    .line 157
    new-instance v0, La/yj2;

    .line 158
    .line 159
    invoke-direct {v0, p0, p1, v6}, La/yj2;-><init>(La/hie0;La/kmq;Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v7, v0, p2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    sget-object p1, La/wne;->a:La/wne;

    .line 167
    .line 168
    if-ne p0, p1, :cond_8

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    :goto_7
    return-object p0

    .line 174
    :pswitch_4
    instance-of v0, p2, La/enq;

    .line 175
    .line 176
    if-eqz v0, :cond_9

    .line 177
    .line 178
    move-object v0, p2

    .line 179
    check-cast v0, La/enq;

    .line 180
    .line 181
    iget v8, v0, La/enq;->j:I

    .line 182
    .line 183
    and-int v9, v8, v2

    .line 184
    .line 185
    if-eqz v9, :cond_9

    .line 186
    .line 187
    sub-int/2addr v8, v2

    .line 188
    iput v8, v0, La/enq;->j:I

    .line 189
    .line 190
    goto :goto_8

    .line 191
    :cond_9
    new-instance v0, La/enq;

    .line 192
    .line 193
    invoke-direct {v0, p0, p2}, La/enq;-><init>(La/fnq;La/yje;)V

    .line 194
    .line 195
    .line 196
    :goto_8
    iget-object p0, v0, La/enq;->i:Ljava/lang/Object;

    .line 197
    .line 198
    sget-object p2, La/wne;->a:La/wne;

    .line 199
    .line 200
    iget v2, v0, La/enq;->j:I

    .line 201
    .line 202
    if-eqz v2, :cond_c

    .line 203
    .line 204
    if-eq v2, v5, :cond_b

    .line 205
    .line 206
    if-ne v2, v3, :cond_a

    .line 207
    .line 208
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    goto :goto_b

    .line 212
    :cond_a
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    goto :goto_c

    .line 216
    :cond_b
    iget p1, v0, La/enq;->n:I

    .line 217
    .line 218
    iget-object v1, v0, La/enq;->m:La/qsg0;

    .line 219
    .line 220
    iget-object v2, v0, La/enq;->l:La/kmq;

    .line 221
    .line 222
    :try_start_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 223
    .line 224
    .line 225
    move p0, p1

    .line 226
    move-object p1, v2

    .line 227
    goto :goto_9

    .line 228
    :catchall_0
    move-exception p0

    .line 229
    goto :goto_d

    .line 230
    :cond_c
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    new-instance v1, La/qsg0;

    .line 234
    .line 235
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-direct {v1, p1, p0}, La/qsg0;-><init>(La/kmq;Lkotlin/coroutines/CoroutineContext;)V

    .line 240
    .line 241
    .line 242
    :try_start_3
    iput-object p1, v0, La/enq;->l:La/kmq;

    .line 243
    .line 244
    iput-object v1, v0, La/enq;->m:La/qsg0;

    .line 245
    .line 246
    const/4 p0, 0x0

    .line 247
    iput p0, v0, La/enq;->n:I

    .line 248
    .line 249
    iput v5, v0, La/enq;->j:I

    .line 250
    .line 251
    invoke-interface {v6, v1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 255
    if-ne v2, p2, :cond_d

    .line 256
    .line 257
    goto :goto_a

    .line 258
    :cond_d
    :goto_9
    invoke-virtual {v1}, La/zje;->releaseIntercepted()V

    .line 259
    .line 260
    .line 261
    iput-object v4, v0, La/enq;->l:La/kmq;

    .line 262
    .line 263
    iput-object v4, v0, La/enq;->m:La/qsg0;

    .line 264
    .line 265
    iput p0, v0, La/enq;->n:I

    .line 266
    .line 267
    iput v3, v0, La/enq;->j:I

    .line 268
    .line 269
    invoke-interface {v7, p1, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    if-ne p0, p2, :cond_e

    .line 274
    .line 275
    :goto_a
    move-object v4, p2

    .line 276
    goto :goto_c

    .line 277
    :cond_e
    :goto_b
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    :goto_c
    return-object v4

    .line 280
    :goto_d
    invoke-virtual {v1}, La/zje;->releaseIntercepted()V

    .line 281
    .line 282
    .line 283
    throw p0

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
