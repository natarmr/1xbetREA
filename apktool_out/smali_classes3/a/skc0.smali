.class public final synthetic La/skc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ukc0;


# direct methods
.method public synthetic constructor <init>(La/ukc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/skc0;->a:B

    iput-object p1, p0, La/skc0;->b:La/ukc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/skc0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/skc0;->b:La/ukc0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/ukc0;->Q1:[La/iiy;

    .line 10
    .line 11
    invoke-virtual {p0}, La/ukc0;->G0()La/clc0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p0, La/clc0;->q:La/p7m0;

    .line 16
    .line 17
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/zkc0;

    .line 22
    .line 23
    iget-boolean v0, v0, La/zkc0;->c:Z

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    iget-boolean v0, p0, La/clc0;->m:Z

    .line 29
    .line 30
    if-nez v0, :cond_4

    .line 31
    .line 32
    iget-object v0, p0, La/clc0;->k:La/tpx;

    .line 33
    .line 34
    iget-object v0, v0, La/tpx;->a:La/tnc0;

    .line 35
    .line 36
    iget-object v0, v0, La/tnc0;->b:La/dnc0;

    .line 37
    .line 38
    iget-boolean v0, v0, La/dnc0;->b:Z

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v0, p0, La/clc0;->r:Ljava/util/Map;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-virtual {p0}, La/clc0;->y()V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    :goto_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v3, La/ppb0;

    .line 63
    .line 64
    const/16 v0, 0x13

    .line 65
    .line 66
    invoke-direct {v3, p0, v0}, La/ppb0;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    new-instance v6, La/vkc0;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {v6, p0, v0, v1}, La/vkc0;-><init>(La/clc0;La/yje;B)V

    .line 73
    .line 74
    .line 75
    const/16 v7, 0xe

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    :goto_1
    iget-object p0, p0, La/clc0;->p:La/q99;

    .line 84
    .line 85
    new-instance v0, La/wkc0;

    .line 86
    .line 87
    const v1, 0x7f13095b

    .line 88
    .line 89
    .line 90
    invoke-direct {v0, v1}, La/wkc0;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p0, v0}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_0
    sget-object v0, La/ukc0;->Q1:[La/iiy;

    .line 100
    .line 101
    invoke-virtual {p0}, La/ukc0;->G0()La/clc0;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    iget-object v0, p0, La/clc0;->q:La/p7m0;

    .line 106
    .line 107
    iget-object v2, p0, La/clc0;->k:La/tpx;

    .line 108
    .line 109
    iget-object v2, v2, La/tpx;->a:La/tnc0;

    .line 110
    .line 111
    iget-object v2, v2, La/tnc0;->b:La/dnc0;

    .line 112
    .line 113
    iget-boolean v2, v2, La/dnc0;->b:Z

    .line 114
    .line 115
    if-eqz v2, :cond_5

    .line 116
    .line 117
    iget-boolean v2, p0, La/clc0;->l:Z

    .line 118
    .line 119
    if-eqz v2, :cond_5

    .line 120
    .line 121
    iget-object v2, p0, La/clc0;->g:La/pyu;

    .line 122
    .line 123
    iget-object v2, v2, La/pyu;->a:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v2, La/tnc0;

    .line 126
    .line 127
    iget-object v2, v2, La/tnc0;->b:La/dnc0;

    .line 128
    .line 129
    iget-object v2, v2, La/dnc0;->a:La/q7d0;

    .line 130
    .line 131
    const-string v3, "NEED_SHOW_GAME_NOT_FINISHED_DIALOG"

    .line 132
    .line 133
    invoke-virtual {v2}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_5

    .line 142
    .line 143
    iget-object p0, p0, La/clc0;->p:La/q99;

    .line 144
    .line 145
    sget-object v0, La/xkc0;->a:La/xkc0;

    .line 146
    .line 147
    invoke-interface {p0, v0}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_5
    iget-boolean v1, p0, La/clc0;->n:Z

    .line 152
    .line 153
    sget-object v2, La/v06;->a:La/v06;

    .line 154
    .line 155
    if-eqz v1, :cond_6

    .line 156
    .line 157
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    check-cast v1, La/zkc0;

    .line 162
    .line 163
    iget-boolean v1, v1, La/zkc0;->b:Z

    .line 164
    .line 165
    if-eqz v1, :cond_6

    .line 166
    .line 167
    invoke-virtual {p0, v2}, La/clc0;->w(La/i16;)V

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, La/zkc0;

    .line 176
    .line 177
    iget-boolean v0, v0, La/zkc0;->b:Z

    .line 178
    .line 179
    if-eqz v0, :cond_7

    .line 180
    .line 181
    iget-object p0, p0, La/clc0;->b:La/i1w0;

    .line 182
    .line 183
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v1, La/c8d;

    .line 188
    .line 189
    sget-object v2, La/y7d;->a:La/v7d;

    .line 190
    .line 191
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 192
    .line 193
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 194
    .line 195
    .line 196
    const/4 v2, 0x0

    .line 197
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    :goto_3
    move-object v1, v0

    .line 202
    check-cast v1, La/paw;

    .line 203
    .line 204
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_8

    .line 209
    .line 210
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, La/oe50;

    .line 215
    .line 216
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_7
    invoke-virtual {p0, v2}, La/clc0;->w(La/i16;)V

    .line 221
    .line 222
    .line 223
    :cond_8
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_1
    sget-object v0, La/ukc0;->Q1:[La/iiy;

    .line 227
    .line 228
    new-instance v0, La/ko60;

    .line 229
    .line 230
    const/16 v1, 0xa

    .line 231
    .line 232
    invoke-direct {v0, p0, v1}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 233
    .line 234
    .line 235
    return-object v0

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
