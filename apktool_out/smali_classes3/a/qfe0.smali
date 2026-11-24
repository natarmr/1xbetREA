.class public final La/qfe0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/wfe0;


# direct methods
.method public synthetic constructor <init>(La/wfe0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qfe0;->i:B

    iput-object p1, p0, La/qfe0;->k:La/wfe0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qfe0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qfe0;->k:La/wfe0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/qfe0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/qfe0;-><init>(La/wfe0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/qfe0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/qfe0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/qfe0;-><init>(La/wfe0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/qfe0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/qfe0;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/qfe0;-><init>(La/wfe0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/qfe0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/qfe0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/qfe0;-><init>(La/wfe0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/qfe0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qfe0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/qfe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qfe0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qfe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/sw00;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/qfe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/qfe0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/qfe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/sw00;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/qfe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/qfe0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/qfe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/qfe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/qfe0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/qfe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/qfe0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/qfe0;->k:La/wfe0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/qfe0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 v0, 0xa

    .line 20
    .line 21
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/mlr;

    .line 43
    .line 44
    iget-wide v2, v0, La/mlr;->a:J

    .line 45
    .line 46
    invoke-static {v2, v3, p1}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    sget-object p0, La/wfe0;->L:Ljava/lang/String;

    .line 55
    .line 56
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 57
    .line 58
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 59
    .line 60
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-object v4, p0

    .line 68
    check-cast v4, La/nfe0;

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    const/16 v9, 0x17f

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    const/4 v6, 0x0

    .line 75
    invoke-static/range {v4 .. v9}, La/nfe0;->a(La/nfe0;La/aie;ZLjava/util/Set;La/ql5;I)La/nfe0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_1

    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_0
    iget-object v0, p0, La/qfe0;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, La/sw00;

    .line 91
    .line 92
    sget-object v1, La/wne;->a:La/wne;

    .line 93
    .line 94
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-boolean p1, v0, La/sw00;->a:Z

    .line 98
    .line 99
    if-eqz p1, :cond_2

    .line 100
    .line 101
    iget-boolean p1, v0, La/sw00;->b:Z

    .line 102
    .line 103
    if-nez p1, :cond_2

    .line 104
    .line 105
    iget-object v0, p0, La/qfe0;->k:La/wfe0;

    .line 106
    .line 107
    iget-object v1, v0, La/wfe0;->w:La/kb0;

    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    const/4 v5, 0x6

    .line 111
    sget-object v2, La/eb0;->a:La/eb0;

    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    invoke-static/range {v0 .. v5}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 115
    .line 116
    .line 117
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_1
    iget-object p0, p0, La/qfe0;->j:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p0, La/sw00;

    .line 123
    .line 124
    sget-object v0, La/wne;->a:La/wne;

    .line 125
    .line 126
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, La/nfe0;

    .line 134
    .line 135
    iget-boolean p1, p1, La/nfe0;->d:Z

    .line 136
    .line 137
    iget-boolean v0, p0, La/sw00;->a:Z

    .line 138
    .line 139
    if-eq p1, v0, :cond_5

    .line 140
    .line 141
    iget-object p1, v1, La/i3t0;->i:La/ocj;

    .line 142
    .line 143
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 144
    .line 145
    :cond_3
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-object v2, v0

    .line 153
    check-cast v2, La/nfe0;

    .line 154
    .line 155
    iget-boolean v4, p0, La/sw00;->a:Z

    .line 156
    .line 157
    const/4 v6, 0x0

    .line 158
    const/16 v7, 0x1f7

    .line 159
    .line 160
    const/4 v3, 0x0

    .line 161
    const/4 v5, 0x0

    .line 162
    invoke-static/range {v2 .. v7}, La/nfe0;->a(La/nfe0;La/aie;ZLjava/util/Set;La/ql5;I)La/nfe0;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {p1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_3

    .line 171
    .line 172
    iget-boolean p0, p0, La/sw00;->a:Z

    .line 173
    .line 174
    if-eqz p0, :cond_4

    .line 175
    .line 176
    iget-object p0, v1, La/wfe0;->o:La/soc;

    .line 177
    .line 178
    invoke-virtual {p0}, La/soc;->b()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, La/wfe0;->P()V

    .line 182
    .line 183
    .line 184
    :cond_4
    invoke-virtual {v1}, La/wfe0;->O()V

    .line 185
    .line 186
    .line 187
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object p0

    .line 190
    :pswitch_2
    iget-object p0, p0, La/qfe0;->j:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p0, Ljava/lang/Throwable;

    .line 193
    .line 194
    sget-object v0, La/wne;->a:La/wne;

    .line 195
    .line 196
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    sget-object p1, La/wfe0;->L:Ljava/lang/String;

    .line 200
    .line 201
    iget-object p1, v1, La/i3t0;->i:La/ocj;

    .line 202
    .line 203
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 204
    .line 205
    :cond_6
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-object v2, v0

    .line 213
    check-cast v2, La/nfe0;

    .line 214
    .line 215
    const/4 v6, 0x0

    .line 216
    const/16 v7, 0x1fe

    .line 217
    .line 218
    sget-object v3, La/fhe;->a:La/fhe;

    .line 219
    .line 220
    const/4 v4, 0x0

    .line 221
    const/4 v5, 0x0

    .line 222
    invoke-static/range {v2 .. v7}, La/nfe0;->a(La/nfe0;La/aie;ZLjava/util/Set;La/ql5;I)La/nfe0;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {p1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_6

    .line 231
    .line 232
    iget-object p1, v1, La/wfe0;->t:La/duj;

    .line 233
    .line 234
    new-instance v0, La/k8e0;

    .line 235
    .line 236
    const/4 v1, 0x7

    .line 237
    invoke-direct {v0, v1}, La/k8e0;-><init>(B)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 241
    .line 242
    .line 243
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object p0

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
