.class public final synthetic La/qgx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/qgx;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mox;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/qgx;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/qgx;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p0, La/ycy;->b:La/ewb0;

    .line 8
    .line 9
    return-object p0

    .line 10
    :pswitch_0
    sget-object p0, La/cdy;->b:La/wgi0;

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_1
    sget-object p0, La/mdy;->b:La/wgi0;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_2
    :try_start_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 17
    .line 18
    const-string p0, "antifraud"

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 28
    .line 29
    new-instance v0, La/g0g0;

    .line 30
    .line 31
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p0, v0

    .line 35
    :goto_0
    instance-of p0, p0, La/g0g0;

    .line 36
    .line 37
    xor-int/lit8 p0, p0, 0x1

    .line 38
    .line 39
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_3
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_4
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :pswitch_5
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_6
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :pswitch_7
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :pswitch_8
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_9
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_a
    new-instance p0, La/zw3;

    .line 94
    .line 95
    sget-object v1, La/i2y;->a:La/i2y;

    .line 96
    .line 97
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 98
    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_b
    new-instance p0, La/zw3;

    .line 102
    .line 103
    sget-object v1, La/h2y;->a:La/h2y;

    .line 104
    .line 105
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 106
    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_c
    new-instance p0, La/zw3;

    .line 110
    .line 111
    sget-object v1, La/f0y;->a:La/f0y;

    .line 112
    .line 113
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 114
    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_d
    new-instance p0, La/zw3;

    .line 118
    .line 119
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 120
    .line 121
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 122
    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_e
    new-instance p0, La/zw3;

    .line 126
    .line 127
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 128
    .line 129
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 130
    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_f
    new-instance p0, La/zw3;

    .line 134
    .line 135
    sget-object v1, La/okx;->a:La/okx;

    .line 136
    .line 137
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 138
    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_10
    new-instance p0, La/zw3;

    .line 142
    .line 143
    sget-object v1, La/okx;->a:La/okx;

    .line 144
    .line 145
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 146
    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_11
    new-instance p0, La/zw3;

    .line 150
    .line 151
    sget-object v1, La/f0y;->a:La/f0y;

    .line 152
    .line 153
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 154
    .line 155
    .line 156
    return-object p0

    .line 157
    :pswitch_12
    new-instance p0, La/zw3;

    .line 158
    .line 159
    sget-object v1, La/e0y;->a:La/e0y;

    .line 160
    .line 161
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 162
    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_13
    new-instance p0, La/zw3;

    .line 166
    .line 167
    sget-object v1, La/c2y;->a:La/c2y;

    .line 168
    .line 169
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 170
    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_14
    new-instance p0, La/zw3;

    .line 174
    .line 175
    sget-object v1, La/b2y;->a:La/b2y;

    .line 176
    .line 177
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 178
    .line 179
    .line 180
    return-object p0

    .line 181
    :pswitch_15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_17
    new-instance p0, La/ycl;

    .line 188
    .line 189
    const/high16 v0, 0x42400000    # 48.0f

    .line 190
    .line 191
    invoke-direct {p0, v0}, La/ycl;-><init>(F)V

    .line 192
    .line 193
    .line 194
    return-object p0

    .line 195
    :pswitch_18
    new-instance p0, La/zw3;

    .line 196
    .line 197
    sget-object v1, La/okx;->a:La/okx;

    .line 198
    .line 199
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 200
    .line 201
    .line 202
    return-object p0

    .line 203
    :pswitch_19
    new-instance p0, La/zw3;

    .line 204
    .line 205
    sget-object v1, La/okx;->a:La/okx;

    .line 206
    .line 207
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 208
    .line 209
    .line 210
    return-object p0

    .line 211
    :pswitch_1a
    const/4 p0, 0x0

    .line 212
    return-object p0

    .line 213
    :pswitch_1b
    sget p0, La/dix;->C:I

    .line 214
    .line 215
    sget-object p0, La/p030;->a:La/p030;

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_1c
    new-instance p0, La/zw3;

    .line 219
    .line 220
    sget-object v1, La/su20;->a:La/su20;

    .line 221
    .line 222
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 223
    .line 224
    .line 225
    return-object p0

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
