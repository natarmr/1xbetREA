.class public final La/oak;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/pak;

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public constructor <init>(La/pak;IILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/oak;->j:La/pak;

    .line 2
    .line 3
    iput p2, p0, La/oak;->k:I

    .line 4
    .line 5
    iput p3, p0, La/oak;->l:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance p1, La/oak;

    .line 2
    .line 3
    iget v0, p0, La/oak;->k:I

    .line 4
    .line 5
    iget v1, p0, La/oak;->l:I

    .line 6
    .line 7
    iget-object p0, p0, La/oak;->j:La/pak;

    .line 8
    .line 9
    invoke-direct {p1, p0, v0, v1, p2}, La/oak;-><init>(La/pak;IILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/oak;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/oak;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/oak;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/oak;->j:La/pak;

    .line 2
    .line 3
    iget-object v1, v0, La/pak;->b:La/i1w0;

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v3, p0, La/oak;->i:B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v3, :cond_2

    .line 13
    .line 14
    if-eq v3, v6, :cond_1

    .line 15
    .line 16
    if-ne v3, v5, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v0, La/pak;->d:La/ljf0;

    .line 38
    .line 39
    sget-object v3, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->b:La/art;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget v3, p0, La/oak;->l:I

    .line 45
    .line 46
    invoke-static {v3}, La/art;->c(I)Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iput-byte v6, p0, La/oak;->i:B

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v6, La/q100;

    .line 56
    .line 57
    iget v3, v3, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->a:I

    .line 58
    .line 59
    iget v7, p0, La/oak;->k:I

    .line 60
    .line 61
    invoke-direct {v6, v7, v3}, La/q100;-><init>(II)V

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget-object p1, p1, La/ljf0;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, La/pzu;

    .line 71
    .line 72
    invoke-virtual {p1, v3, p0}, La/pzu;->r0(Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v2, :cond_3

    .line 77
    .line 78
    goto/16 :goto_3

    .line 79
    .line 80
    :cond_3
    :goto_0
    check-cast p1, La/h500;

    .line 81
    .line 82
    iget-object v3, p1, La/h500;->c:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-nez v3, :cond_5

    .line 89
    .line 90
    iget-object p0, v0, La/pak;->c:La/ani0;

    .line 91
    .line 92
    iget-object p1, p1, La/h500;->c:Ljava/util/List;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object p0, p0, La/ani0;->a:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, La/pmi;

    .line 103
    .line 104
    iget-object p0, p0, La/pmi;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p0, La/xio;

    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    sget-object v0, La/iun;->a:La/iun;

    .line 112
    .line 113
    iput-object v0, p0, La/xio;->b:Ljava/util/List;

    .line 114
    .line 115
    iput-object p1, p0, La/xio;->c:Ljava/util/List;

    .line 116
    .line 117
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    new-instance p1, Lorg/xplatform/responsible_game/impl/navigation/ResponsibleGamblingScreens$GamblingExamScreen;

    .line 122
    .line 123
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 124
    .line 125
    .line 126
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    new-instance v0, La/e1w0;

    .line 131
    .line 132
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 133
    .line 134
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 135
    .line 136
    .line 137
    new-instance p1, La/c8d;

    .line 138
    .line 139
    sget-object v2, La/y7d;->a:La/v7d;

    .line 140
    .line 141
    invoke-direct {p1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_4
    new-instance v0, La/w0w0;

    .line 149
    .line 150
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 151
    .line 152
    .line 153
    new-instance p1, La/c8d;

    .line 154
    .line 155
    sget-object v2, La/y7d;->a:La/v7d;

    .line 156
    .line 157
    invoke-direct {p1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    :goto_1
    invoke-static {v1, p0, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    :goto_2
    move-object p1, p0

    .line 168
    check-cast p1, La/paw;

    .line 169
    .line 170
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_8

    .line 175
    .line 176
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, La/oe50;

    .line 181
    .line 182
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_5
    iget-object p1, p1, La/h500;->a:Ljava/util/List;

    .line 187
    .line 188
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-nez p1, :cond_7

    .line 193
    .line 194
    iput-byte v5, p0, La/oak;->i:B

    .line 195
    .line 196
    const-wide/16 v5, 0xdac

    .line 197
    .line 198
    invoke-static {v5, v6, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    if-ne p0, v2, :cond_6

    .line 203
    .line 204
    :goto_3
    return-object v2

    .line 205
    :cond_6
    :goto_4
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    new-instance p1, La/c8d;

    .line 210
    .line 211
    sget-object v0, La/y7d;->a:La/v7d;

    .line 212
    .line 213
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 214
    .line 215
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 216
    .line 217
    .line 218
    invoke-static {p0, p1, v1, p0, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    :goto_5
    move-object p1, p0

    .line 223
    check-cast p1, La/paw;

    .line 224
    .line 225
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_8

    .line 230
    .line 231
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    check-cast p1, La/oe50;

    .line 236
    .line 237
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_7
    sget-object p0, La/lak;->a:La/lak;

    .line 242
    .line 243
    invoke-virtual {v0, p0}, La/pak;->w(La/nak;)V

    .line 244
    .line 245
    .line 246
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object p0
.end method
