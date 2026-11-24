.class public final synthetic La/ysc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dtc0;


# direct methods
.method public synthetic constructor <init>(La/dtc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ysc0;->a:B

    iput-object p1, p0, La/ysc0;->b:La/dtc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/ysc0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x11

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object p0, p0, La/ysc0;->b:La/dtc0;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Throwable;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La/dtc0;->v:La/x20;

    .line 18
    .line 19
    const-string v4, "promo_shop"

    .line 20
    .line 21
    invoke-virtual {v0, v4}, La/x20;->t(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    instance-of v0, p1, La/zhi0;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    check-cast v0, La/zhi0;

    .line 30
    .line 31
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 32
    .line 33
    sget-object v5, La/i2o;->l1:La/i2o;

    .line 34
    .line 35
    if-ne v0, v5, :cond_1

    .line 36
    .line 37
    new-instance v0, La/msc0;

    .line 38
    .line 39
    iget-object v2, p0, La/dtc0;->p:La/ctf0;

    .line 40
    .line 41
    new-array v3, v1, [Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 44
    .line 45
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const v3, 0x7f1307bb

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_0

    .line 61
    .line 62
    const-string p1, ""

    .line 63
    .line 64
    :cond_0
    invoke-direct {v0, v1, p1}, La/msc0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, p0, La/dtc0;->y:La/duj;

    .line 72
    .line 73
    new-instance v1, La/xh20;

    .line 74
    .line 75
    invoke-direct {v1, p0, v3, v2}, La/xh20;-><init>(Ljava/lang/Object;ZB)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    iget-object p0, p0, La/dtc0;->u:La/b4j;

    .line 82
    .line 83
    invoke-virtual {p0, v4}, La/b4j;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, La/dtc0;->y:La/duj;

    .line 93
    .line 94
    new-instance v1, La/xh20;

    .line 95
    .line 96
    invoke-direct {v1, p0, v3, v2}, La/xh20;-><init>(Ljava/lang/Object;ZB)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    .line 109
    .line 110
    if-eqz v0, :cond_2

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    instance-of v0, p1, Ljava/net/UnknownHostException;

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    :goto_1
    iget-object p1, p0, La/dtc0;->B:La/c4m0;

    .line 118
    .line 119
    if-eqz p1, :cond_3

    .line 120
    .line 121
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-ne p1, v3, :cond_3

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    iget-object p1, p0, La/dtc0;->q:La/m1e;

    .line 129
    .line 130
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-instance v0, La/wk30;

    .line 135
    .line 136
    const/16 v1, 0x19

    .line 137
    .line 138
    invoke-direct {v0, p1, v1}, La/wk30;-><init>(La/gmq;B)V

    .line 139
    .line 140
    .line 141
    invoke-static {v0, v3}, La/dtb;->U(La/gmq;I)La/qnq;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    new-instance v0, La/d7a0;

    .line 146
    .line 147
    const/4 v1, 0x7

    .line 148
    const/4 v2, 0x0

    .line 149
    invoke-direct {v0, p0, v2, v1}, La/d7a0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 150
    .line 151
    .line 152
    new-instance v1, La/fnq;

    .line 153
    .line 154
    const/4 v3, 0x4

    .line 155
    invoke-direct {v1, p1, v0, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 156
    .line 157
    .line 158
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    new-instance v0, La/s9c0;

    .line 163
    .line 164
    const/4 v3, 0x5

    .line 165
    invoke-direct {v0, p0, v2, v3}, La/s9c0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 166
    .line 167
    .line 168
    invoke-static {v1, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    iput-object p1, p0, La/dtc0;->B:La/c4m0;

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_4
    iget-object v0, p0, La/dtc0;->y:La/duj;

    .line 176
    .line 177
    new-instance v3, La/xh20;

    .line 178
    .line 179
    invoke-direct {v3, p0, v1, v2}, La/xh20;-><init>(Ljava/lang/Object;ZB)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, p1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    :goto_2
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 186
    .line 187
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 188
    .line 189
    :cond_5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 197
    .line 198
    move-object v2, v0

    .line 199
    check-cast v2, La/rrc0;

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    const/4 v10, 0x1

    .line 205
    const v11, 0xfd7f

    .line 206
    .line 207
    .line 208
    const/4 v3, 0x0

    .line 209
    const/4 v4, 0x0

    .line 210
    const/4 v5, 0x0

    .line 211
    const/4 v6, 0x0

    .line 212
    const/4 v7, 0x0

    .line 213
    const/4 v8, 0x0

    .line 214
    const/4 v9, 0x0

    .line 215
    invoke-static/range {v2 .. v11}, La/rrc0;->a(La/rrc0;Ljava/util/List;IZZLjava/lang/String;ZZZI)La/rrc0;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_5

    .line 224
    .line 225
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object p0

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
