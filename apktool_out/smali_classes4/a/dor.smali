.class public final synthetic La/dor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:La/diu0;


# direct methods
.method public synthetic constructor <init>(La/diu0;JZB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/dor;->a:B

    iput-object p1, p0, La/dor;->d:La/diu0;

    iput-wide p2, p0, La/dor;->b:J

    iput-boolean p4, p0, La/dor;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/dor;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/dor;->d:La/diu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v4, v1

    .line 9
    check-cast v4, La/ncl0;

    .line 10
    .line 11
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, v4, La/ncl0;->o:La/mne;

    .line 16
    .line 17
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 18
    .line 19
    new-instance v2, La/kcl0;

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v3, 0x1

    .line 24
    const-class v5, La/ncl0;

    .line 25
    .line 26
    const-string v6, "handleFavoriteError"

    .line 27
    .line 28
    const-string v7, "handleFavoriteError(Ljava/lang/Throwable;)V"

    .line 29
    .line 30
    invoke-direct/range {v2 .. v9}, La/kcl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 31
    .line 32
    .line 33
    move-object v9, v2

    .line 34
    new-instance v2, La/bk5;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v3, 0x7

    .line 38
    move-object v7, v4

    .line 39
    iget-wide v4, p0, La/dor;->b:J

    .line 40
    .line 41
    iget-boolean v8, p0, La/dor;->c:Z

    .line 42
    .line 43
    invoke-direct/range {v2 .. v8}, La/bk5;-><init>(BJLa/yje;La/diu0;Z)V

    .line 44
    .line 45
    .line 46
    const/16 v10, 0xa

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    move-object v5, v0

    .line 50
    move-object v8, v1

    .line 51
    move-object v6, v9

    .line 52
    move-object v9, v2

    .line 53
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_0
    move-object v2, v1

    .line 60
    check-cast v2, La/yks;

    .line 61
    .line 62
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    iget-object v0, v2, La/yks;->q:La/mne;

    .line 67
    .line 68
    iget-object v9, v0, La/mne;->c:La/vs10;

    .line 69
    .line 70
    new-instance v0, La/h2s;

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    const/16 v7, 0xd

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    const-class v3, La/yks;

    .line 77
    .line 78
    const-string v4, "handleFavoriteError"

    .line 79
    .line 80
    const-string v5, "handleFavoriteError(Ljava/lang/Throwable;)V"

    .line 81
    .line 82
    invoke-direct/range {v0 .. v7}, La/h2s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 83
    .line 84
    .line 85
    move-object v7, v0

    .line 86
    new-instance v0, La/bk5;

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    const/4 v1, 0x5

    .line 90
    move-object v5, v2

    .line 91
    iget-wide v2, p0, La/dor;->b:J

    .line 92
    .line 93
    iget-boolean v6, p0, La/dor;->c:Z

    .line 94
    .line 95
    invoke-direct/range {v0 .. v6}, La/bk5;-><init>(BJLa/yje;La/diu0;Z)V

    .line 96
    .line 97
    .line 98
    move-object v3, v8

    .line 99
    const/16 v8, 0xa

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    move-object v4, v7

    .line 103
    move-object v6, v9

    .line 104
    move-object v7, v0

    .line 105
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_1
    move-object v2, v1

    .line 112
    check-cast v2, La/g9s;

    .line 113
    .line 114
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    iget-object v0, v2, La/g9s;->q:La/mne;

    .line 119
    .line 120
    iget-object v9, v0, La/mne;->c:La/vs10;

    .line 121
    .line 122
    new-instance v0, La/h2s;

    .line 123
    .line 124
    const/4 v6, 0x0

    .line 125
    const/4 v7, 0x5

    .line 126
    const/4 v1, 0x1

    .line 127
    const-class v3, La/g9s;

    .line 128
    .line 129
    const-string v4, "handleFavoriteError"

    .line 130
    .line 131
    const-string v5, "handleFavoriteError(Ljava/lang/Throwable;)V"

    .line 132
    .line 133
    invoke-direct/range {v0 .. v7}, La/h2s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 134
    .line 135
    .line 136
    move-object v7, v0

    .line 137
    new-instance v0, La/bk5;

    .line 138
    .line 139
    const/4 v4, 0x0

    .line 140
    const/4 v1, 0x4

    .line 141
    move-object v5, v2

    .line 142
    iget-wide v2, p0, La/dor;->b:J

    .line 143
    .line 144
    iget-boolean v6, p0, La/dor;->c:Z

    .line 145
    .line 146
    invoke-direct/range {v0 .. v6}, La/bk5;-><init>(BJLa/yje;La/diu0;Z)V

    .line 147
    .line 148
    .line 149
    move-object v3, v8

    .line 150
    const/16 v8, 0xa

    .line 151
    .line 152
    const/4 v5, 0x0

    .line 153
    move-object v4, v7

    .line 154
    move-object v6, v9

    .line 155
    move-object v7, v0

    .line 156
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 157
    .line 158
    .line 159
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_2
    move-object v2, v1

    .line 163
    check-cast v2, La/k4s;

    .line 164
    .line 165
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    iget-object v0, v2, La/k4s;->p:La/mne;

    .line 170
    .line 171
    iget-object v9, v0, La/mne;->c:La/vs10;

    .line 172
    .line 173
    new-instance v0, La/h2s;

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    const/4 v7, 0x1

    .line 177
    const/4 v1, 0x1

    .line 178
    const-class v3, La/k4s;

    .line 179
    .line 180
    const-string v4, "handleFavoriteError"

    .line 181
    .line 182
    const-string v5, "handleFavoriteError(Ljava/lang/Throwable;)V"

    .line 183
    .line 184
    invoke-direct/range {v0 .. v7}, La/h2s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 185
    .line 186
    .line 187
    move-object v7, v0

    .line 188
    new-instance v0, La/bk5;

    .line 189
    .line 190
    const/4 v4, 0x0

    .line 191
    const/4 v1, 0x3

    .line 192
    move-object v5, v2

    .line 193
    iget-wide v2, p0, La/dor;->b:J

    .line 194
    .line 195
    iget-boolean v6, p0, La/dor;->c:Z

    .line 196
    .line 197
    invoke-direct/range {v0 .. v6}, La/bk5;-><init>(BJLa/yje;La/diu0;Z)V

    .line 198
    .line 199
    .line 200
    move-object v3, v8

    .line 201
    const/16 v8, 0xa

    .line 202
    .line 203
    const/4 v5, 0x0

    .line 204
    move-object v4, v7

    .line 205
    move-object v6, v9

    .line 206
    move-object v7, v0

    .line 207
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 208
    .line 209
    .line 210
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_3
    move-object v2, v1

    .line 214
    check-cast v2, La/spr;

    .line 215
    .line 216
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    iget-object v0, v2, La/spr;->q:La/mne;

    .line 221
    .line 222
    iget-object v9, v0, La/mne;->c:La/vs10;

    .line 223
    .line 224
    new-instance v0, La/pop;

    .line 225
    .line 226
    const/4 v6, 0x0

    .line 227
    const/16 v7, 0x1c

    .line 228
    .line 229
    const/4 v1, 0x1

    .line 230
    const-class v3, La/spr;

    .line 231
    .line 232
    const-string v4, "handleFavoriteError"

    .line 233
    .line 234
    const-string v5, "handleFavoriteError(Ljava/lang/Throwable;)V"

    .line 235
    .line 236
    invoke-direct/range {v0 .. v7}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 237
    .line 238
    .line 239
    move-object v7, v0

    .line 240
    new-instance v0, La/bk5;

    .line 241
    .line 242
    const/4 v4, 0x0

    .line 243
    const/4 v1, 0x2

    .line 244
    move-object v5, v2

    .line 245
    iget-wide v2, p0, La/dor;->b:J

    .line 246
    .line 247
    iget-boolean v6, p0, La/dor;->c:Z

    .line 248
    .line 249
    invoke-direct/range {v0 .. v6}, La/bk5;-><init>(BJLa/yje;La/diu0;Z)V

    .line 250
    .line 251
    .line 252
    move-object v3, v8

    .line 253
    const/16 v8, 0xa

    .line 254
    .line 255
    const/4 v5, 0x0

    .line 256
    move-object v4, v7

    .line 257
    move-object v6, v9

    .line 258
    move-object v7, v0

    .line 259
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 260
    .line 261
    .line 262
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    return-object p0

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
