.class public final synthetic La/a1i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w6k;

.field public final synthetic c:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/w6k;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/a1i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a1i;->c:La/pz40;

    iput-object p2, p0, La/a1i;->b:La/w6k;

    return-void
.end method

.method public synthetic constructor <init>(La/w6k;La/pz40;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/a1i;->a:B

    iput-object p1, p0, La/a1i;->b:La/w6k;

    iput-object p2, p0, La/a1i;->c:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/a1i;->a:B

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    iget-object v4, p0, La/a1i;->c:La/pz40;

    .line 11
    .line 12
    iget-object p0, p0, La/a1i;->b:La/w6k;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, La/bdl;

    .line 18
    .line 19
    iget-wide v5, p1, La/bdl;->a:J

    .line 20
    .line 21
    invoke-static {v5, v6}, La/bdl;->b(J)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-interface {p0, v0}, La/w6k;->T(F)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-wide v5, p1, La/bdl;->a:J

    .line 30
    .line 31
    invoke-static {v5, v6}, La/bdl;->a(J)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-interface {p0, p1}, La/w6k;->T(F)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    int-to-long v5, v0

    .line 40
    shl-long v0, v5, v1

    .line 41
    .line 42
    int-to-long p0, p0

    .line 43
    and-long/2addr p0, v2

    .line 44
    or-long/2addr p0, v0

    .line 45
    new-instance v0, La/qkx;

    .line 46
    .line 47
    invoke-direct {v0, p0, p1}, La/qkx;-><init>(J)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v4, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_0
    check-cast p1, Lkotlin/jvm/functions/Function0;

    .line 57
    .line 58
    new-instance v0, La/vpj0;

    .line 59
    .line 60
    const/4 v1, 0x7

    .line 61
    invoke-direct {v0, p1, v1}, La/vpj0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 62
    .line 63
    .line 64
    new-instance p1, La/a1i;

    .line 65
    .line 66
    const/4 v1, 0x6

    .line 67
    invoke-direct {p1, p0, v4, v1}, La/a1i;-><init>(La/w6k;La/pz40;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, La/op10;->a()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_2

    .line 75
    .line 76
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 77
    .line 78
    const/16 v1, 0x1c

    .line 79
    .line 80
    if-ne p0, v1, :cond_0

    .line 81
    .line 82
    sget-object p0, La/aw90;->a:La/aw90;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    sget-object p0, La/cw90;->a:La/cw90;

    .line 86
    .line 87
    :goto_0
    invoke-static {}, La/op10;->a()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    new-instance v1, La/lp10;

    .line 94
    .line 95
    invoke-direct {v1, v0, p1, p0}, La/lp10;-><init>(La/vpj0;La/a1i;La/yv90;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    sget-object v1, La/jm40;->b:La/jm40;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    const-string p0, "Magnifier is only supported on API level 28 and higher."

    .line 103
    .line 104
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    :goto_1
    return-object v1

    .line 109
    :pswitch_1
    check-cast p1, La/j6z;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-interface {p1}, La/j6z;->g()J

    .line 115
    .line 116
    .line 117
    move-result-wide v0

    .line 118
    and-long/2addr v0, v2

    .line 119
    long-to-int p1, v0

    .line 120
    invoke-interface {p0, p1}, La/w6k;->r0(I)F

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    new-instance p1, La/ycl;

    .line 125
    .line 126
    invoke-direct {p1, p0}, La/ycl;-><init>(F)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v4, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0

    .line 135
    :pswitch_2
    check-cast p1, La/qkx;

    .line 136
    .line 137
    iget-wide v0, p1, La/qkx;->a:J

    .line 138
    .line 139
    and-long/2addr v0, v2

    .line 140
    long-to-int p1, v0

    .line 141
    invoke-interface {p0, p1}, La/w6k;->r0(I)F

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    new-instance p1, La/ycl;

    .line 146
    .line 147
    invoke-direct {p1, p0}, La/ycl;-><init>(F)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v4, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_3
    check-cast p1, La/j6z;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-interface {p1}, La/j6z;->g()J

    .line 162
    .line 163
    .line 164
    move-result-wide v0

    .line 165
    and-long/2addr v0, v2

    .line 166
    long-to-int p1, v0

    .line 167
    invoke-interface {p0, p1}, La/w6k;->r0(I)F

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    new-instance p1, La/ycl;

    .line 172
    .line 173
    invoke-direct {p1, p0}, La/ycl;-><init>(F)V

    .line 174
    .line 175
    .line 176
    invoke-interface {v4, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_4
    check-cast p1, La/j6z;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-interface {p1}, La/j6z;->g()J

    .line 188
    .line 189
    .line 190
    move-result-wide v0

    .line 191
    and-long/2addr v0, v2

    .line 192
    long-to-int p1, v0

    .line 193
    invoke-interface {p0, p1}, La/w6k;->r0(I)F

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    sget-object p1, La/qmk;->a:La/zcl;

    .line 198
    .line 199
    const/high16 p1, 0x42600000    # 56.0f

    .line 200
    .line 201
    sub-float/2addr p0, p1

    .line 202
    new-instance p1, La/ycl;

    .line 203
    .line 204
    invoke-direct {p1, p0}, La/ycl;-><init>(F)V

    .line 205
    .line 206
    .line 207
    invoke-interface {v4, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_5
    check-cast p1, La/qkx;

    .line 214
    .line 215
    iget-wide v2, p1, La/qkx;->a:J

    .line 216
    .line 217
    shr-long v0, v2, v1

    .line 218
    .line 219
    long-to-int p1, v0

    .line 220
    invoke-interface {p0, p1}, La/w6k;->r0(I)F

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    new-instance p1, La/ycl;

    .line 225
    .line 226
    invoke-direct {p1, p0}, La/ycl;-><init>(F)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v4, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
