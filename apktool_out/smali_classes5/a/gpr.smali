.class public final La/gpr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/spr;


# direct methods
.method public synthetic constructor <init>(La/spr;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gpr;->a:B

    iput-object p1, p0, La/gpr;->b:La/spr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte p2, p0, La/gpr;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/gpr;->b:La/spr;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    new-instance p1, La/obg;

    .line 16
    .line 17
    const/4 p2, 0x6

    .line 18
    invoke-direct {p1, p2, p0}, La/obg;-><init>(BZ)V

    .line 19
    .line 20
    .line 21
    sget p0, La/spr;->j0:I

    .line 22
    .line 23
    invoke-virtual {v0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, La/l9s;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    instance-of p0, p1, La/k9s;

    .line 34
    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    move-object v1, p1

    .line 38
    check-cast v1, La/k9s;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    instance-of p0, p1, La/j9s;

    .line 42
    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    :goto_0
    new-instance p0, La/hpr;

    .line 46
    .line 47
    const/4 p2, 0x0

    .line 48
    invoke-direct {p0, p1, v1, v0, p2}, La/hpr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    sget p1, La/spr;->j0:I

    .line 52
    .line 53
    invoke-virtual {v0, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 54
    .line 55
    .line 56
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 60
    .line 61
    .line 62
    :goto_1
    return-object v1

    .line 63
    :pswitch_1
    check-cast p1, La/u5s;

    .line 64
    .line 65
    instance-of p2, p1, La/l5s;

    .line 66
    .line 67
    iget-object v8, p0, La/gpr;->b:La/spr;

    .line 68
    .line 69
    if-eqz p2, :cond_2

    .line 70
    .line 71
    check-cast p1, La/l5s;

    .line 72
    .line 73
    iget-wide v3, p1, La/l5s;->a:J

    .line 74
    .line 75
    sget p0, La/spr;->j0:I

    .line 76
    .line 77
    new-instance v2, La/bor;

    .line 78
    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v5, 0x1

    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v7, 0x1

    .line 83
    invoke-direct/range {v2 .. v9}, La/bor;-><init>(JZZZLa/i3t0;B)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_2

    .line 90
    .line 91
    :cond_2
    instance-of p0, p1, La/n5s;

    .line 92
    .line 93
    if-eqz p0, :cond_3

    .line 94
    .line 95
    check-cast p1, La/n5s;

    .line 96
    .line 97
    iget-wide v3, p1, La/n5s;->a:J

    .line 98
    .line 99
    sget p0, La/spr;->j0:I

    .line 100
    .line 101
    new-instance v2, La/bor;

    .line 102
    .line 103
    const/4 v9, 0x0

    .line 104
    const/4 v5, 0x1

    .line 105
    const/4 v6, 0x0

    .line 106
    const/4 v7, 0x0

    .line 107
    invoke-direct/range {v2 .. v9}, La/bor;-><init>(JZZZLa/i3t0;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_2

    .line 114
    .line 115
    :cond_3
    instance-of p0, p1, La/q5s;

    .line 116
    .line 117
    if-eqz p0, :cond_4

    .line 118
    .line 119
    check-cast p1, La/q5s;

    .line 120
    .line 121
    iget-wide v3, p1, La/q5s;->a:J

    .line 122
    .line 123
    sget p0, La/spr;->j0:I

    .line 124
    .line 125
    new-instance v2, La/bor;

    .line 126
    .line 127
    const/4 v9, 0x0

    .line 128
    const/4 v5, 0x0

    .line 129
    const/4 v6, 0x1

    .line 130
    const/4 v7, 0x0

    .line 131
    invoke-direct/range {v2 .. v9}, La/bor;-><init>(JZZZLa/i3t0;B)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v8, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 135
    .line 136
    .line 137
    new-instance p0, La/nuq;

    .line 138
    .line 139
    const/16 p1, 0x16

    .line 140
    .line 141
    invoke-direct {p0, p1}, La/nuq;-><init>(B)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v8, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_4
    instance-of p0, p1, La/r5s;

    .line 149
    .line 150
    if-eqz p0, :cond_5

    .line 151
    .line 152
    check-cast p1, La/r5s;

    .line 153
    .line 154
    iget-wide v3, p1, La/r5s;->a:J

    .line 155
    .line 156
    sget p0, La/spr;->j0:I

    .line 157
    .line 158
    new-instance v2, La/bor;

    .line 159
    .line 160
    const/4 v9, 0x0

    .line 161
    const/4 v5, 0x0

    .line 162
    const/4 v6, 0x1

    .line 163
    const/4 v7, 0x0

    .line 164
    invoke-direct/range {v2 .. v9}, La/bor;-><init>(JZZZLa/i3t0;B)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v8, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    new-instance p0, La/nuq;

    .line 171
    .line 172
    const/16 p1, 0x17

    .line 173
    .line 174
    invoke-direct {p0, p1}, La/nuq;-><init>(B)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v8, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_5
    instance-of p0, p1, La/s5s;

    .line 182
    .line 183
    if-eqz p0, :cond_6

    .line 184
    .line 185
    check-cast p1, La/s5s;

    .line 186
    .line 187
    iget-wide v3, p1, La/s5s;->a:J

    .line 188
    .line 189
    iget-boolean v5, p1, La/s5s;->b:Z

    .line 190
    .line 191
    sget p0, La/spr;->j0:I

    .line 192
    .line 193
    new-instance v2, La/bor;

    .line 194
    .line 195
    const/4 v9, 0x0

    .line 196
    const/4 v6, 0x0

    .line 197
    const/4 v7, 0x0

    .line 198
    invoke-direct/range {v2 .. v9}, La/bor;-><init>(JZZZLa/i3t0;B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v8, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 202
    .line 203
    .line 204
    new-instance p0, La/nuq;

    .line 205
    .line 206
    const/16 p1, 0x18

    .line 207
    .line 208
    invoke-direct {p0, p1}, La/nuq;-><init>(B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v8, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_6
    sget-object p0, La/j5s;->a:La/j5s;

    .line 216
    .line 217
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    if-nez p0, :cond_8

    .line 222
    .line 223
    sget-object p0, La/p5s;->a:La/p5s;

    .line 224
    .line 225
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p0

    .line 229
    if-eqz p0, :cond_7

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_8
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    :goto_3
    return-object v1

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
