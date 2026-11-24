.class public final synthetic La/mh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ln20;


# direct methods
.method public synthetic constructor <init>(La/ln20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mh20;->a:B

    iput-object p1, p0, La/mh20;->b:La/ln20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/mh20;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/mh20;->b:La/ln20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    iget-object v0, p0, La/ln20;->m0:La/bby;

    .line 11
    .line 12
    iget-object v1, p0, La/ln20;->V:La/duj;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {v0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    new-instance v0, La/eh20;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v0, p0, v2}, La/eh20;-><init>(La/ln20;B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, La/eh20;

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    invoke-direct {v0, p0, v2}, La/eh20;-><init>(La/ln20;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast p1, La/yc20;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, La/ln20;->n0:La/k820;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, La/k820;->d:La/mh20;

    .line 63
    .line 64
    sget-object v1, La/ob20;->a:La/ob20;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, La/mh20;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    instance-of v1, p1, La/zhi0;

    .line 70
    .line 71
    if-nez v1, :cond_1

    .line 72
    .line 73
    invoke-virtual {p0, p1}, La/k820;->a(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_1
    move-object v1, p1

    .line 79
    check-cast v1, La/zhi0;

    .line 80
    .line 81
    iget-object v2, v1, La/zhi0;->c:La/kuw;

    .line 82
    .line 83
    invoke-interface {v2}, La/kuw;->getErrorCode()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    iget-object v3, p0, La/k820;->a:La/mii0;

    .line 88
    .line 89
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v3, v3, La/mii0;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, La/kt2;

    .line 99
    .line 100
    const-string v5, "finbet_bet_error"

    .line 101
    .line 102
    const-string v6, "error_code"

    .line 103
    .line 104
    invoke-static {v6, v4, v3, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v3, p0, La/k820;->b:La/zr1;

    .line 108
    .line 109
    iget-object v3, v3, La/zr1;->a:La/s1p;

    .line 110
    .line 111
    const-wide/16 v4, 0xd1b

    .line 112
    .line 113
    invoke-static {v2, v3, v4, v5}, La/b1j;->r(ILa/s1p;J)V

    .line 114
    .line 115
    .line 116
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 117
    .line 118
    sget-object v2, La/i2o;->m2:La/i2o;

    .line 119
    .line 120
    const-string v3, ""

    .line 121
    .line 122
    if-ne v1, v2, :cond_3

    .line 123
    .line 124
    new-instance p0, La/zb20;

    .line 125
    .line 126
    new-instance v4, La/xdk0;

    .line 127
    .line 128
    sget-object v5, La/rek0;->b:La/rek0;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-nez p1, :cond_2

    .line 135
    .line 136
    move-object v6, v3

    .line 137
    goto :goto_0

    .line 138
    :cond_2
    move-object v6, p1

    .line 139
    :goto_0
    const/4 v10, 0x0

    .line 140
    const/16 v11, 0x7c

    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    const/4 v8, 0x0

    .line 144
    const/4 v9, 0x0

    .line 145
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 146
    .line 147
    .line 148
    invoke-direct {p0, v4}, La/zb20;-><init>(La/xdk0;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, p0}, La/mh20;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_3
    sget-object v2, La/i2o;->n2:La/i2o;

    .line 156
    .line 157
    if-ne v1, v2, :cond_5

    .line 158
    .line 159
    new-instance p0, La/sb20;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-nez p1, :cond_4

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_4
    move-object v3, p1

    .line 169
    :goto_1
    invoke-direct {p0, v3}, La/sb20;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, p0}, La/mh20;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_5
    sget-object v2, La/i2o;->q:La/i2o;

    .line 177
    .line 178
    if-ne v1, v2, :cond_7

    .line 179
    .line 180
    new-instance p0, La/bc20;

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-nez p1, :cond_6

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_6
    move-object v3, p1

    .line 190
    :goto_2
    invoke-direct {p0, v3}, La/bc20;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, p0}, La/mh20;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    invoke-virtual {p0, p1}, La/k820;->a(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object p0

    .line 203
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    iget-object p0, p0, La/ln20;->n0:La/k820;

    .line 209
    .line 210
    invoke-virtual {p0, p1}, La/k820;->a(Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object p0

    .line 216
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    iget-object p0, p0, La/ln20;->n0:La/k820;

    .line 222
    .line 223
    invoke-virtual {p0, p1}, La/k820;->a(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    iget-object p0, p0, La/ln20;->n0:La/k820;

    .line 235
    .line 236
    invoke-virtual {p0, p1}, La/k820;->a(Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object p0

    .line 242
    nop

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
