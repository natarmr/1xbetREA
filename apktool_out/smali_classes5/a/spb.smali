.class public final synthetic La/spb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xpb;


# direct methods
.method public synthetic constructor <init>(La/xpb;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/spb;->a:B

    iput-object p1, p0, La/spb;->b:La/xpb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/spb;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/spb;->b:La/xpb;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/xpb;->S1:La/gl5;

    .line 10
    .line 11
    invoke-virtual {p0}, La/xpb;->H0()La/eqb;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p0, La/eqb;->y:La/c4m0;

    .line 16
    .line 17
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/eqb;->u:La/p7m0;

    .line 21
    .line 22
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    sget-object v0, La/xpb;->S1:La/gl5;

    .line 34
    .line 35
    invoke-virtual {p0}, La/xpb;->H0()La/eqb;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-boolean v0, p0, La/eqb;->z:Z

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object v0, p0, La/eqb;->o:La/au0;

    .line 44
    .line 45
    iget-object v0, v0, La/au0;->a:La/s1p;

    .line 46
    .line 47
    const-wide/16 v1, 0x2c61

    .line 48
    .line 49
    sget-object v3, La/xun;->a:La/xun;

    .line 50
    .line 51
    invoke-virtual {v0, v3, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, La/eqb;->n:La/zg;

    .line 55
    .line 56
    iget-object v0, v0, La/zg;->a:La/kt2;

    .line 57
    .line 58
    const-string v1, "acc_change_log_done"

    .line 59
    .line 60
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    invoke-virtual {p0}, La/eqb;->y()V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_1
    sget-object v0, La/xpb;->S1:La/gl5;

    .line 70
    .line 71
    invoke-virtual {p0}, La/xpb;->H0()La/eqb;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, La/eqb;->y()V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_2
    sget-object v0, La/xpb;->S1:La/gl5;

    .line 82
    .line 83
    invoke-virtual {p0}, La/xpb;->H0()La/eqb;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {p0}, La/xpb;->G0()La/yyq;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iget-object p0, p0, La/yyq;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 92
    .line 93
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    iget-boolean v2, v0, La/eqb;->z:Z

    .line 102
    .line 103
    if-eqz v2, :cond_1

    .line 104
    .line 105
    iget-object v2, v0, La/eqb;->o:La/au0;

    .line 106
    .line 107
    iget-object v2, v2, La/au0;->a:La/s1p;

    .line 108
    .line 109
    const-wide/16 v3, 0x2c60

    .line 110
    .line 111
    sget-object v5, La/xun;->a:La/xun;

    .line 112
    .line 113
    invoke-virtual {v2, v5, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 114
    .line 115
    .line 116
    iget-object v2, v0, La/eqb;->n:La/zg;

    .line 117
    .line 118
    iget-object v2, v2, La/zg;->a:La/kt2;

    .line 119
    .line 120
    const-string v3, "acc_change_log_input"

    .line 121
    .line 122
    invoke-interface {v2, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_1
    invoke-virtual {v0, p0}, La/eqb;->A(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-nez v2, :cond_2

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_2
    new-instance v2, La/bqb;

    .line 133
    .line 134
    const/4 v3, 0x0

    .line 135
    invoke-direct {v2, v0, v1, v3}, La/bqb;-><init>(La/eqb;La/yje;B)V

    .line 136
    .line 137
    .line 138
    new-instance v4, La/vsg0;

    .line 139
    .line 140
    invoke-direct {v4, v2}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    new-instance v2, La/zo1;

    .line 144
    .line 145
    const/16 v5, 0x8

    .line 146
    .line 147
    invoke-direct {v2, v1, v0, v5}, La/zo1;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 148
    .line 149
    .line 150
    invoke-static {v4, v2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    new-instance v4, La/bqb;

    .line 155
    .line 156
    const/4 v6, 0x1

    .line 157
    invoke-direct {v4, v0, v1, v6}, La/bqb;-><init>(La/eqb;La/yje;B)V

    .line 158
    .line 159
    .line 160
    new-instance v7, La/fnq;

    .line 161
    .line 162
    const/4 v8, 0x4

    .line 163
    invoke-direct {v7, v2, v4, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 164
    .line 165
    .line 166
    new-instance v2, La/nv;

    .line 167
    .line 168
    invoke-direct {v2, v7, v1, v6}, La/nv;-><init>(La/fnq;La/yje;B)V

    .line 169
    .line 170
    .line 171
    new-instance v4, La/vsg0;

    .line 172
    .line 173
    invoke-direct {v4, v2}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    new-instance v2, La/fe0;

    .line 177
    .line 178
    invoke-direct {v2, v1, v0, p0}, La/fe0;-><init>(La/yje;La/eqb;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v4, v2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    new-instance v2, La/aqb;

    .line 186
    .line 187
    invoke-direct {v2, v0, v1, v6}, La/aqb;-><init>(La/eqb;La/yje;B)V

    .line 188
    .line 189
    .line 190
    new-instance v4, La/fnq;

    .line 191
    .line 192
    invoke-direct {v4, p0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 193
    .line 194
    .line 195
    new-instance p0, La/fob;

    .line 196
    .line 197
    const/4 v2, 0x3

    .line 198
    invoke-direct {p0, v0, v1, v2}, La/fob;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 199
    .line 200
    .line 201
    new-instance v2, La/fnq;

    .line 202
    .line 203
    invoke-direct {v2, v4, p0, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 204
    .line 205
    .line 206
    new-instance p0, La/rj;

    .line 207
    .line 208
    const/16 v4, 0xa

    .line 209
    .line 210
    invoke-direct {p0, v0, v1, v4}, La/rj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 211
    .line 212
    .line 213
    new-instance v4, La/dnq;

    .line 214
    .line 215
    invoke-direct {v4, v2, p0, v6}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 216
    .line 217
    .line 218
    new-instance p0, La/e00;

    .line 219
    .line 220
    invoke-direct {p0, v0, v1, v5}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 221
    .line 222
    .line 223
    new-instance v1, La/dnq;

    .line 224
    .line 225
    invoke-direct {v1, v4, p0, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 226
    .line 227
    .line 228
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    iget-object v2, v0, La/eqb;->g:La/mne;

    .line 233
    .line 234
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 235
    .line 236
    invoke-static {p0, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-static {v1, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    iput-object p0, v0, La/eqb;->y:La/c4m0;

    .line 245
    .line 246
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object p0

    .line 249
    :pswitch_3
    sget-object v0, La/xpb;->S1:La/gl5;

    .line 250
    .line 251
    new-instance v0, La/vpb;

    .line 252
    .line 253
    invoke-direct {v0, p0}, La/vpb;-><init>(La/xpb;)V

    .line 254
    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_4
    new-instance v0, La/q0h0;

    .line 258
    .line 259
    iget-object p0, p0, La/xpb;->M1:La/fci;

    .line 260
    .line 261
    if-eqz p0, :cond_3

    .line 262
    .line 263
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 264
    .line 265
    .line 266
    return-object v0

    .line 267
    :cond_3
    const-string p0, "viewModelFactory"

    .line 268
    .line 269
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v1

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
