.class public final La/q2e0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic s:I


# instance fields
.field public final o:La/i1w0;

.field public final p:La/pru;

.field public final q:La/s9m0;

.field public final r:La/dpi0;


# direct methods
.method public constructor <init>(La/i1w0;La/ctf0;La/pru;La/s9m0;La/dpi0;La/jgu;La/mne;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/p2e0;

    .line 5
    .line 6
    const/4 v6, 0x0

    .line 7
    invoke-direct {v2, p3, v6}, La/p2e0;-><init>(La/pru;B)V

    .line 8
    .line 9
    .line 10
    new-instance v3, La/iv80;

    .line 11
    .line 12
    const/16 v0, 0xe

    .line 13
    .line 14
    invoke-direct {v3, p2, v0}, La/iv80;-><init>(La/ctf0;B)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p7, La/mne;->c:La/vs10;

    .line 18
    .line 19
    iget-object p7, p7, La/mne;->b:La/dvj;

    .line 20
    .line 21
    invoke-static {p2, p7}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v1, 0x0

    .line 27
    move-object v0, p0

    .line 28
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, v0, La/q2e0;->o:La/i1w0;

    .line 32
    .line 33
    iput-object p3, v0, La/q2e0;->p:La/pru;

    .line 34
    .line 35
    iput-object p4, v0, La/q2e0;->q:La/s9m0;

    .line 36
    .line 37
    iput-object p5, v0, La/q2e0;->r:La/dpi0;

    .line 38
    .line 39
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 40
    .line 41
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object p2, v0, La/i3t0;->f:La/oyg0;

    .line 51
    .line 52
    move-object p3, p1

    .line 53
    check-cast p3, La/t2e0;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/4 p2, 0x5

    .line 59
    const/4 p4, 0x1

    .line 60
    invoke-static {p3, v6, p4, p2}, La/t2e0;->a(La/t2e0;IZI)La/t2e0;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {p0, p1, p2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    iget-object p0, p6, La/jgu;->a:La/iw20;

    .line 71
    .line 72
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, La/gxu;

    .line 75
    .line 76
    iget-object p0, p0, La/gxu;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, La/vwb0;

    .line 79
    .line 80
    const-string p1, "RATE_APP_DIALOG_SHOWN_KEY"

    .line 81
    .line 82
    invoke-virtual {p0, p1, p4}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    const-string p1, "RATE_APP_DIALOG_SHOWN_TIME_KEY"

    .line 86
    .line 87
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 88
    .line 89
    .line 90
    move-result-wide p2

    .line 91
    invoke-virtual {p0, p1, p2, p3}, La/vwb0;->g(Ljava/lang/String;J)V

    .line 92
    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, La/l2e0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, La/k2e0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 12
    .line 13
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, La/t2e0;

    .line 24
    .line 25
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-object v4, p1

    .line 31
    check-cast v4, La/k2e0;

    .line 32
    .line 33
    iget v4, v4, La/k2e0;->a:I

    .line 34
    .line 35
    const/4 v5, 0x6

    .line 36
    invoke-static {v3, v4, v1, v5}, La/t2e0;->a(La/t2e0;IZI)La/t2e0;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    sget-object v0, La/j2e0;->a:La/j2e0;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v2, 0x3

    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    iget-object p1, p0, La/q2e0;->p:La/pru;

    .line 57
    .line 58
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-boolean p1, p1, La/sff0;->G:Z

    .line 63
    .line 64
    iget-object v0, p0, La/q2e0;->r:La/dpi0;

    .line 65
    .line 66
    iget-object v0, v0, La/dpi0;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, La/iw20;

    .line 69
    .line 70
    iget-object v0, v0, La/iw20;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, La/gxu;

    .line 73
    .line 74
    iget-object v0, v0, La/gxu;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, La/q7d0;

    .line 77
    .line 78
    const-string v3, "RATE_APP_PERFORMED_KEY"

    .line 79
    .line 80
    const/4 v4, 0x1

    .line 81
    invoke-virtual {v0, v3, v4}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, La/t2e0;

    .line 89
    .line 90
    iget v0, v0, La/t2e0;->a:I

    .line 91
    .line 92
    iget-object v3, p0, La/q2e0;->o:La/i1w0;

    .line 93
    .line 94
    if-gt v0, v2, :cond_2

    .line 95
    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    new-instance p1, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;

    .line 99
    .line 100
    sget-object v0, La/pjn0;->a:La/pjn0;

    .line 101
    .line 102
    sget-object v2, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams$None;->a:Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams$None;

    .line 103
    .line 104
    invoke-direct {p1, v1, v0, v2}, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;-><init>(ZLa/pjn0;Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v3}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object p0, p0, La/q2e0;->q:La/s9m0;

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {p1}, La/s9m0;->f(Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    new-instance p1, La/d1w0;

    .line 121
    .line 122
    invoke-direct {p1, p0}, La/d1w0;-><init>(La/m7h0;)V

    .line 123
    .line 124
    .line 125
    new-instance p0, La/c8d;

    .line 126
    .line 127
    sget-object v2, La/y7d;->a:La/v7d;

    .line 128
    .line 129
    invoke-direct {p0, v2, p1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0, p0, v3, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    :goto_0
    move-object p1, p0

    .line 137
    check-cast p1, La/paw;

    .line 138
    .line 139
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_4

    .line 144
    .line 145
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, La/oe50;

    .line 150
    .line 151
    invoke-virtual {v3, p1}, La/i1w0;->a(La/oe50;)V

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_2
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, La/t2e0;

    .line 160
    .line 161
    iget-object p1, p1, La/t2e0;->c:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {p1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-nez p1, :cond_3

    .line 168
    .line 169
    new-instance p1, La/s2e0;

    .line 170
    .line 171
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, La/t2e0;

    .line 176
    .line 177
    iget-object v0, v0, La/t2e0;->c:Ljava/lang/String;

    .line 178
    .line 179
    invoke-direct {p1, v0}, La/s2e0;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :cond_3
    invoke-static {v3}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    new-instance p1, La/c8d;

    .line 190
    .line 191
    sget-object v0, La/y7d;->a:La/v7d;

    .line 192
    .line 193
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 194
    .line 195
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 196
    .line 197
    .line 198
    invoke-static {p0, p1, v3, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    :goto_1
    move-object p1, p0

    .line 203
    check-cast p1, La/paw;

    .line 204
    .line 205
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_4

    .line 210
    .line 211
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    check-cast p1, La/oe50;

    .line 216
    .line 217
    invoke-virtual {v3, p1}, La/i1w0;->a(La/oe50;)V

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_4
    return-void

    .line 222
    :cond_5
    sget-object v0, La/i2e0;->a:La/i2e0;

    .line 223
    .line 224
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_6

    .line 229
    .line 230
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    new-instance v0, La/coc0;

    .line 235
    .line 236
    const/4 v1, 0x7

    .line 237
    const/4 v3, 0x0

    .line 238
    invoke-direct {v0, p0, v3, v1}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 239
    .line 240
    .line 241
    invoke-static {p1, v3, v3, v0, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_6
    sget-object v0, La/h2e0;->a:La/h2e0;

    .line 246
    .line 247
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-eqz p1, :cond_7

    .line 252
    .line 253
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 258
    .line 259
    .line 260
    return-void
.end method
