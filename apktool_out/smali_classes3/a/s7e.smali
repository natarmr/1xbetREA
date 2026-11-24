.class public final La/s7e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/g45;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/g45;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/s7e;->a:B

    iput-object p1, p0, La/s7e;->b:La/kmq;

    iput-object p2, p0, La/s7e;->c:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/s7e;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/s7e;->b:La/kmq;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/high16 v3, -0x80000000

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, p0, La/s7e;->c:La/g45;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, La/p8e;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/p8e;

    .line 22
    .line 23
    iget v7, v0, La/p8e;->j:I

    .line 24
    .line 25
    and-int v8, v7, v3

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    sub-int/2addr v7, v3

    .line 30
    iput v7, v0, La/p8e;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/p8e;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/p8e;-><init>(La/s7e;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/p8e;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v3, v0, La/p8e;->j:I

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    if-ne v3, v4, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    check-cast p1, La/kjt0;

    .line 60
    .line 61
    iget-object p0, v5, La/g45;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, La/i7e;

    .line 64
    .line 65
    iget-object p0, p0, La/i7e;->i:La/p7m0;

    .line 66
    .line 67
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/gxb;

    .line 72
    .line 73
    sget-object v2, La/gxb;->k:La/gxb;

    .line 74
    .line 75
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    iget-object p1, p1, La/kjt0;->c:La/n640;

    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    iget-object v2, v5, La/g45;->i:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, La/vby;

    .line 89
    .line 90
    invoke-static {p1, p0, v6, v2}, La/s0x;->b0(La/n640;La/gxb;Ljava/lang/String;La/vby;)La/a640;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    :cond_4
    :goto_1
    if-eqz v6, :cond_5

    .line 95
    .line 96
    iput v4, v0, La/p8e;->j:I

    .line 97
    .line 98
    invoke-interface {v1, v6, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-ne p0, p2, :cond_5

    .line 103
    .line 104
    move-object v6, p2

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    :goto_3
    return-object v6

    .line 109
    :pswitch_0
    instance-of v0, p2, La/j8e;

    .line 110
    .line 111
    if-eqz v0, :cond_6

    .line 112
    .line 113
    move-object v0, p2

    .line 114
    check-cast v0, La/j8e;

    .line 115
    .line 116
    iget v7, v0, La/j8e;->j:I

    .line 117
    .line 118
    and-int v8, v7, v3

    .line 119
    .line 120
    if-eqz v8, :cond_6

    .line 121
    .line 122
    sub-int/2addr v7, v3

    .line 123
    iput v7, v0, La/j8e;->j:I

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_6
    new-instance v0, La/j8e;

    .line 127
    .line 128
    invoke-direct {v0, p0, p2}, La/j8e;-><init>(La/s7e;La/yje;)V

    .line 129
    .line 130
    .line 131
    :goto_4
    iget-object p0, v0, La/j8e;->i:Ljava/lang/Object;

    .line 132
    .line 133
    sget-object p2, La/wne;->a:La/wne;

    .line 134
    .line 135
    iget v3, v0, La/j8e;->j:I

    .line 136
    .line 137
    if-eqz v3, :cond_8

    .line 138
    .line 139
    if-ne v3, v4, :cond_7

    .line 140
    .line 141
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_8
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    check-cast p1, La/om50;

    .line 153
    .line 154
    iget-object p0, v5, La/g45;->c:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p0, La/i7e;

    .line 157
    .line 158
    iget-object p0, p0, La/i7e;->i:La/p7m0;

    .line 159
    .line 160
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    check-cast p0, La/gxb;

    .line 165
    .line 166
    sget-object v2, La/gxb;->k:La/gxb;

    .line 167
    .line 168
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_9

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_9
    iget-object p1, p1, La/om50;->a:La/n640;

    .line 176
    .line 177
    if-eqz p1, :cond_a

    .line 178
    .line 179
    iget-object v2, v5, La/g45;->i:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v2, La/vby;

    .line 182
    .line 183
    invoke-static {p1, p0, v6, v2}, La/s0x;->b0(La/n640;La/gxb;Ljava/lang/String;La/vby;)La/a640;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    :cond_a
    :goto_5
    if-eqz v6, :cond_b

    .line 188
    .line 189
    iput v4, v0, La/j8e;->j:I

    .line 190
    .line 191
    invoke-interface {v1, v6, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    if-ne p0, p2, :cond_b

    .line 196
    .line 197
    move-object v6, p2

    .line 198
    goto :goto_7

    .line 199
    :cond_b
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    :goto_7
    return-object v6

    .line 202
    :pswitch_1
    instance-of v0, p2, La/r7e;

    .line 203
    .line 204
    if-eqz v0, :cond_c

    .line 205
    .line 206
    move-object v0, p2

    .line 207
    check-cast v0, La/r7e;

    .line 208
    .line 209
    iget v7, v0, La/r7e;->j:I

    .line 210
    .line 211
    and-int v8, v7, v3

    .line 212
    .line 213
    if-eqz v8, :cond_c

    .line 214
    .line 215
    sub-int/2addr v7, v3

    .line 216
    iput v7, v0, La/r7e;->j:I

    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_c
    new-instance v0, La/r7e;

    .line 220
    .line 221
    invoke-direct {v0, p0, p2}, La/r7e;-><init>(La/s7e;La/yje;)V

    .line 222
    .line 223
    .line 224
    :goto_8
    iget-object p0, v0, La/r7e;->i:Ljava/lang/Object;

    .line 225
    .line 226
    sget-object p2, La/wne;->a:La/wne;

    .line 227
    .line 228
    iget v3, v0, La/r7e;->j:I

    .line 229
    .line 230
    if-eqz v3, :cond_e

    .line 231
    .line 232
    if-ne v3, v4, :cond_d

    .line 233
    .line 234
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_a

    .line 242
    :cond_e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    check-cast p1, Ljava/util/Map;

    .line 246
    .line 247
    invoke-virtual {v5, p1}, La/g45;->V(Ljava/util/Map;)Ljava/util/HashMap;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    iput v4, v0, La/r7e;->j:I

    .line 252
    .line 253
    invoke-interface {v1, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    if-ne p0, p2, :cond_f

    .line 258
    .line 259
    move-object v6, p2

    .line 260
    goto :goto_a

    .line 261
    :cond_f
    :goto_9
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    :goto_a
    return-object v6

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
