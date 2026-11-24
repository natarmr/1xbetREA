.class public final synthetic La/vi6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i3t0;


# direct methods
.method public synthetic constructor <init>(La/i3t0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vi6;->a:B

    iput-object p1, p0, La/vi6;->b:La/i3t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/vi6;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vi6;->b:La/i3t0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/prk0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p1, La/prk0;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    check-cast p1, La/q7f0;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v0, La/t7f0;

    .line 36
    .line 37
    invoke-direct {v0, p1}, La/t7f0;-><init>(La/q7f0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_2
    check-cast p1, La/wgl0;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    instance-of v0, p1, La/vgl0;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    new-instance v0, La/rcn;

    .line 56
    .line 57
    new-instance v1, La/y030;

    .line 58
    .line 59
    check-cast p1, La/vgl0;

    .line 60
    .line 61
    iget-object p1, p1, La/vgl0;->a:La/xgl0;

    .line 62
    .line 63
    invoke-direct {v1, p1}, La/y030;-><init>(La/xgl0;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v1}, La/rcn;-><init>(La/g130;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_3
    check-cast p1, La/g130;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v0, La/l6a0;

    .line 81
    .line 82
    invoke-direct {v0, p1}, La/l6a0;-><init>(La/g130;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/az20;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_5
    check-cast p1, La/thv;

    .line 103
    .line 104
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_6
    check-cast p1, La/bem;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v0, La/ehw;

    .line 116
    .line 117
    invoke-direct {v0, p1}, La/ehw;-><init>(La/bem;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_7
    check-cast p1, La/yhw;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_8
    check-cast p1, La/uid;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance v0, La/obh;

    .line 143
    .line 144
    invoke-direct {v0, p1}, La/obh;-><init>(La/uid;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_9
    check-cast p1, Ljava/lang/Long;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 156
    .line 157
    .line 158
    move-result-wide v0

    .line 159
    new-instance p1, La/m6h;

    .line 160
    .line 161
    invoke-direct {p1, v0, v1}, La/m6h;-><init>(J)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0

    .line 170
    :pswitch_a
    check-cast p1, La/lwk;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    sget-object p1, La/cig;->a:La/cig;

    .line 176
    .line 177
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    new-instance p1, La/ty2;

    .line 181
    .line 182
    const/16 v0, 0xa

    .line 183
    .line 184
    invoke-direct {p1, p0, v0}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 185
    .line 186
    .line 187
    return-object p1

    .line 188
    :pswitch_b
    check-cast p1, La/d6b;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object p0

    .line 199
    :pswitch_c
    check-cast p1, La/g130;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    new-instance v0, La/a6b;

    .line 205
    .line 206
    invoke-direct {v0, p1}, La/a6b;-><init>(La/g130;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_d
    check-cast p1, La/qi6;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object p0

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
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
