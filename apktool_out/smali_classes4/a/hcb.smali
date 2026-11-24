.class public final synthetic La/hcb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r4b0;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/r4b0;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hcb;->a:B

    iput-object p1, p0, La/hcb;->b:La/r4b0;

    iput-object p2, p0, La/hcb;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/hcb;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/hcb;->c:La/cp;

    .line 4
    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, La/zgb;

    .line 18
    .line 19
    iget-object v1, p0, La/hcb;->b:La/r4b0;

    .line 20
    .line 21
    iget-object p0, v1, La/r4b0;->c:La/i1w0;

    .line 22
    .line 23
    iget-object v0, v1, La/r4b0;->p:La/luu;

    .line 24
    .line 25
    iget-object v0, v0, La/luu;->a:La/nok0;

    .line 26
    .line 27
    invoke-virtual {v0}, La/nok0;->a()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/4 v4, 0x1

    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    move-object v5, v3

    .line 52
    check-cast v5, La/lok0;

    .line 53
    .line 54
    iget-object v5, v5, La/lok0;->t:Ljava/util/List;

    .line 55
    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_0

    .line 74
    .line 75
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    check-cast v6, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-ne v6, v4, :cond_2

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    const/4 v3, 0x0

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    move-object v5, v2

    .line 107
    check-cast v5, La/lok0;

    .line 108
    .line 109
    iget v5, v5, La/lok0;->a:I

    .line 110
    .line 111
    iget-wide v6, p1, La/zgb;->l:J

    .line 112
    .line 113
    long-to-int v6, v6

    .line 114
    if-ne v5, v6, :cond_4

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    move-object v2, v3

    .line 118
    :goto_1
    check-cast v2, La/lok0;

    .line 119
    .line 120
    if-eqz v2, :cond_7

    .line 121
    .line 122
    iget-object p1, v1, La/r4b0;->r:La/y3v;

    .line 123
    .line 124
    iget v0, v2, La/lok0;->a:I

    .line 125
    .line 126
    iget-object v1, v2, La/lok0;->b:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p1, v0, v1}, La/y3v;->h(ILjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    instance-of v1, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 137
    .line 138
    if-eqz v1, :cond_6

    .line 139
    .line 140
    new-instance v1, La/e1w0;

    .line 141
    .line 142
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 143
    .line 144
    invoke-direct {v1, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 145
    .line 146
    .line 147
    new-instance p1, La/c8d;

    .line 148
    .line 149
    sget-object v2, La/y7d;->a:La/v7d;

    .line 150
    .line 151
    invoke-direct {p1, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_6
    new-instance v1, La/w0w0;

    .line 159
    .line 160
    invoke-direct {v1, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 161
    .line 162
    .line 163
    new-instance p1, La/c8d;

    .line 164
    .line 165
    sget-object v2, La/y7d;->a:La/v7d;

    .line 166
    .line 167
    invoke-direct {p1, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    :goto_2
    const/4 p1, 0x0

    .line 174
    invoke-static {p0, v0, p1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    :goto_3
    move-object v0, p1

    .line 179
    check-cast v0, La/paw;

    .line 180
    .line 181
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_9

    .line 186
    .line 187
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, La/oe50;

    .line 192
    .line 193
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    iget v0, p1, La/zgb;->i:I

    .line 198
    .line 199
    if-ne v0, v4, :cond_8

    .line 200
    .line 201
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    iget-object p0, v1, La/r4b0;->n:La/mne;

    .line 206
    .line 207
    iget-object v8, p0, La/mne;->a:La/rwj;

    .line 208
    .line 209
    new-instance v9, La/o690;

    .line 210
    .line 211
    const/16 p0, 0xb

    .line 212
    .line 213
    invoke-direct {v9, v1, p1, v3, p0}, La/o690;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 214
    .line 215
    .line 216
    const/16 v10, 0xb

    .line 217
    .line 218
    const/4 v6, 0x0

    .line 219
    const/4 v7, 0x0

    .line 220
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_8
    iget-wide v2, p1, La/zgb;->a:J

    .line 225
    .line 226
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    iget-object v2, p1, La/zgb;->d:Ljava/lang/String;

    .line 235
    .line 236
    iget-wide v4, p1, La/zgb;->b:J

    .line 237
    .line 238
    new-instance v0, La/as0;

    .line 239
    .line 240
    const/16 v6, 0x9

    .line 241
    .line 242
    invoke-direct/range {v0 .. v6}, La/as0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 246
    .line 247
    .line 248
    :cond_9
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_0
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    check-cast p1, La/fcb;

    .line 256
    .line 257
    iget-wide v0, p1, La/fcb;->a:J

    .line 258
    .line 259
    iget-object p0, p0, La/hcb;->b:La/r4b0;

    .line 260
    .line 261
    invoke-virtual {p0, v0, v1}, La/r4b0;->x(J)V

    .line 262
    .line 263
    .line 264
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
