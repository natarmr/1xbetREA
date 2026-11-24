.class public final La/rxf0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/lang/String;

.field public j:Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

.field public k:B

.field public final synthetic l:La/sxf0;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:La/we50;


# direct methods
.method public constructor <init>(La/sxf0;Ljava/lang/String;La/we50;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/rxf0;->l:La/sxf0;

    .line 2
    .line 3
    iput-object p2, p0, La/rxf0;->m:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, La/rxf0;->n:La/we50;

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
    new-instance p1, La/rxf0;

    .line 2
    .line 3
    iget-object v0, p0, La/rxf0;->m:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, La/rxf0;->n:La/we50;

    .line 6
    .line 7
    iget-object p0, p0, La/rxf0;->l:La/sxf0;

    .line 8
    .line 9
    invoke-direct {p1, p0, v0, v1, p2}, La/rxf0;-><init>(La/sxf0;Ljava/lang/String;La/we50;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/rxf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/rxf0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/rxf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/rxf0;->l:La/sxf0;

    .line 2
    .line 3
    iget-object v1, v0, La/sxf0;->c:La/i1w0;

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v3, p0, La/rxf0;->k:B

    .line 8
    .line 9
    iget-object v4, p0, La/rxf0;->m:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    if-eqz v3, :cond_3

    .line 16
    .line 17
    if-eq v3, v7, :cond_2

    .line 18
    .line 19
    if-eq v3, v6, :cond_1

    .line 20
    .line 21
    if-ne v3, v5, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, La/rxf0;->j:Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v8

    .line 36
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_2
    iget-object v3, p0, La/rxf0;->i:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, v0, La/sxf0;->k:La/s31;

    .line 51
    .line 52
    iget-object p1, p1, La/s31;->a:La/kt2;

    .line 53
    .line 54
    new-instance v3, Lkotlin/Pair;

    .line 55
    .line 56
    const-string v9, "option"

    .line 57
    .line 58
    const-string v10, "email"

    .line 59
    .line 60
    invoke-direct {v3, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v3}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const-string v9, "login_lost_pass"

    .line 68
    .line 69
    invoke-interface {p1, v9, v3}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    iget-object p1, v0, La/sxf0;->u:Ljava/lang/String;

    .line 79
    .line 80
    move-object v3, p1

    .line 81
    goto :goto_0

    .line 82
    :cond_4
    move-object v3, v4

    .line 83
    :goto_0
    iput-object v3, p0, La/rxf0;->i:Ljava/lang/String;

    .line 84
    .line 85
    iput-byte v7, p0, La/rxf0;->k:B

    .line 86
    .line 87
    new-instance p1, La/p6a;

    .line 88
    .line 89
    const-string v9, ""

    .line 90
    .line 91
    const-string v10, "RepairPassword"

    .line 92
    .line 93
    invoke-direct {p1, v10, v9, v9}, La/v0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object v9, v0, La/sxf0;->h:La/cyh;

    .line 97
    .line 98
    invoke-virtual {v9, p1}, La/cyh;->a(La/v0;)La/p5a;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance v9, La/tye0;

    .line 103
    .line 104
    const/16 v10, 0xa

    .line 105
    .line 106
    invoke-direct {v9, v0, v8, v10}, La/tye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 107
    .line 108
    .line 109
    new-instance v10, La/fnq;

    .line 110
    .line 111
    const/4 v11, 0x4

    .line 112
    invoke-direct {v10, p1, v9, v11}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 113
    .line 114
    .line 115
    new-instance p1, La/nv;

    .line 116
    .line 117
    const/4 v9, 0x6

    .line 118
    invoke-direct {p1, v10, v8, v9}, La/nv;-><init>(La/fnq;La/yje;B)V

    .line 119
    .line 120
    .line 121
    new-instance v9, La/vsg0;

    .line 122
    .line 123
    invoke-direct {v9, p1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v9, p0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v2, :cond_5

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_5
    :goto_1
    check-cast p1, La/ynb0;

    .line 134
    .line 135
    iget-object v9, v0, La/sxf0;->g:La/ljf0;

    .line 136
    .line 137
    iget-object v10, p1, La/ynb0;->b:Ljava/lang/String;

    .line 138
    .line 139
    iget-object p1, p1, La/ynb0;->a:Ljava/lang/String;

    .line 140
    .line 141
    iput-object v8, p0, La/rxf0;->i:Ljava/lang/String;

    .line 142
    .line 143
    iput-byte v6, p0, La/rxf0;->k:B

    .line 144
    .line 145
    iget-object v6, v9, La/ljf0;->a:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v6, La/n660;

    .line 148
    .line 149
    invoke-virtual {v6, v3, v10, p1, p0}, La/n660;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-ne p1, v2, :cond_6

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_6
    :goto_2
    check-cast p1, La/swp0;

    .line 157
    .line 158
    new-instance v3, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

    .line 159
    .line 160
    iget-object v6, p0, La/rxf0;->n:La/we50;

    .line 161
    .line 162
    invoke-direct {v3, v4, v6}, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;-><init>(Ljava/lang/String;La/we50;)V

    .line 163
    .line 164
    .line 165
    iget-object v4, v0, La/sxf0;->m:La/iqt;

    .line 166
    .line 167
    iget-object v4, v4, La/iqt;->a:La/gst0;

    .line 168
    .line 169
    invoke-virtual {v4}, La/gst0;->a()Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-eqz v4, :cond_8

    .line 174
    .line 175
    iget-object v0, v0, La/sxf0;->e:La/xzb;

    .line 176
    .line 177
    iput-object v8, p0, La/rxf0;->i:Ljava/lang/String;

    .line 178
    .line 179
    iput-object v3, p0, La/rxf0;->j:Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

    .line 180
    .line 181
    iput-byte v5, p0, La/rxf0;->k:B

    .line 182
    .line 183
    invoke-virtual {v0, p1, v7, p0}, La/xzb;->a(La/swp0;ZLa/zje;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-ne p1, v2, :cond_7

    .line 188
    .line 189
    :goto_3
    return-object v2

    .line 190
    :cond_7
    move-object p0, v3

    .line 191
    :goto_4
    check-cast p1, La/pfi0;

    .line 192
    .line 193
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    new-instance v2, Lorg/xplatform/security/impl/presentation/email/send_code/screen/CheckEmailCodeScreen;

    .line 198
    .line 199
    iget v3, p1, La/pfi0;->a:I

    .line 200
    .line 201
    iget-object p1, p1, La/pfi0;->b:La/swp0;

    .line 202
    .line 203
    new-instance v4, Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams$RestorePassword;

    .line 204
    .line 205
    invoke-direct {v4, p1, v3, p0}, Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams$RestorePassword;-><init>(La/swp0;ILorg/xplatform/security/api/presentation/models/SendEmailIntention;)V

    .line 206
    .line 207
    .line 208
    invoke-direct {v2, v4}, Lorg/xplatform/security/impl/presentation/email/send_code/screen/CheckEmailCodeScreen;-><init>(Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 212
    .line 213
    .line 214
    iget-object p0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 215
    .line 216
    const/4 p1, 0x0

    .line 217
    invoke-static {v1, p0, p1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    :goto_5
    move-object p1, p0

    .line 222
    check-cast p1, La/paw;

    .line 223
    .line 224
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_9

    .line 229
    .line 230
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    check-cast p1, La/oe50;

    .line 235
    .line 236
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_8
    new-instance p0, La/zlb0;

    .line 241
    .line 242
    const/16 v2, 0x13

    .line 243
    .line 244
    invoke-direct {p0, v0, v3, p1, v2}, La/zlb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, p0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 248
    .line 249
    .line 250
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object p0
.end method
