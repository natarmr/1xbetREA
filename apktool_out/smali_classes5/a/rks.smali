.class public final La/rks;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yks;


# direct methods
.method public synthetic constructor <init>(La/yks;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rks;->a:B

    iput-object p1, p0, La/rks;->b:La/yks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte p2, p0, La/rks;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/rks;->b:La/yks;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    new-instance p1, La/obg;

    .line 15
    .line 16
    const/16 p2, 0xc

    .line 17
    .line 18
    invoke-direct {p1, p2, p0}, La/obg;-><init>(BZ)V

    .line 19
    .line 20
    .line 21
    sget p0, La/yks;->m0:I

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
    check-cast p1, La/k9s;

    .line 30
    .line 31
    new-instance p0, La/tjs;

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-direct {p0, p1, v0, p2}, La/tjs;-><init>(La/k9s;La/yks;B)V

    .line 35
    .line 36
    .line 37
    sget p1, La/yks;->m0:I

    .line 38
    .line 39
    invoke-virtual {v0, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    check-cast p1, La/u5s;

    .line 46
    .line 47
    instance-of p2, p1, La/l5s;

    .line 48
    .line 49
    iget-object v6, p0, La/rks;->b:La/yks;

    .line 50
    .line 51
    if-eqz p2, :cond_0

    .line 52
    .line 53
    check-cast p1, La/l5s;

    .line 54
    .line 55
    iget-wide v1, p1, La/l5s;->a:J

    .line 56
    .line 57
    sget p0, La/yks;->m0:I

    .line 58
    .line 59
    new-instance v0, La/bor;

    .line 60
    .line 61
    const/4 v7, 0x2

    .line 62
    const/4 v3, 0x0

    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x1

    .line 65
    invoke-direct/range {v0 .. v7}, La/bor;-><init>(JZZZLa/i3t0;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_0
    instance-of p0, p1, La/n5s;

    .line 74
    .line 75
    if-eqz p0, :cond_1

    .line 76
    .line 77
    check-cast p1, La/n5s;

    .line 78
    .line 79
    iget-wide v1, p1, La/n5s;->a:J

    .line 80
    .line 81
    sget p0, La/yks;->m0:I

    .line 82
    .line 83
    new-instance v0, La/bor;

    .line 84
    .line 85
    const/4 v7, 0x2

    .line 86
    const/4 v3, 0x1

    .line 87
    const/4 v4, 0x0

    .line 88
    const/4 v5, 0x0

    .line 89
    invoke-direct/range {v0 .. v7}, La/bor;-><init>(JZZZLa/i3t0;B)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_1
    instance-of p0, p1, La/q5s;

    .line 98
    .line 99
    if-eqz p0, :cond_2

    .line 100
    .line 101
    check-cast p1, La/q5s;

    .line 102
    .line 103
    iget-wide v1, p1, La/q5s;->a:J

    .line 104
    .line 105
    sget p0, La/yks;->m0:I

    .line 106
    .line 107
    new-instance v0, La/bor;

    .line 108
    .line 109
    const/4 v7, 0x2

    .line 110
    const/4 v3, 0x0

    .line 111
    const/4 v4, 0x1

    .line 112
    const/4 v5, 0x0

    .line 113
    invoke-direct/range {v0 .. v7}, La/bor;-><init>(JZZZLa/i3t0;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    new-instance p0, La/t4s;

    .line 120
    .line 121
    const/16 p1, 0x16

    .line 122
    .line 123
    invoke-direct {p0, p1}, La/t4s;-><init>(B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_2
    instance-of p0, p1, La/r5s;

    .line 131
    .line 132
    if-eqz p0, :cond_3

    .line 133
    .line 134
    check-cast p1, La/r5s;

    .line 135
    .line 136
    iget-wide v1, p1, La/r5s;->a:J

    .line 137
    .line 138
    sget p0, La/yks;->m0:I

    .line 139
    .line 140
    new-instance v0, La/bor;

    .line 141
    .line 142
    const/4 v7, 0x2

    .line 143
    const/4 v3, 0x0

    .line 144
    const/4 v4, 0x1

    .line 145
    const/4 v5, 0x0

    .line 146
    invoke-direct/range {v0 .. v7}, La/bor;-><init>(JZZZLa/i3t0;B)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    new-instance p0, La/t4s;

    .line 153
    .line 154
    const/16 p1, 0x17

    .line 155
    .line 156
    invoke-direct {p0, p1}, La/t4s;-><init>(B)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_3
    instance-of p0, p1, La/s5s;

    .line 164
    .line 165
    if-eqz p0, :cond_4

    .line 166
    .line 167
    check-cast p1, La/s5s;

    .line 168
    .line 169
    iget-wide v1, p1, La/s5s;->a:J

    .line 170
    .line 171
    iget-boolean v3, p1, La/s5s;->b:Z

    .line 172
    .line 173
    sget p0, La/yks;->m0:I

    .line 174
    .line 175
    new-instance v0, La/bor;

    .line 176
    .line 177
    const/4 v7, 0x2

    .line 178
    const/4 v4, 0x0

    .line 179
    const/4 v5, 0x0

    .line 180
    invoke-direct/range {v0 .. v7}, La/bor;-><init>(JZZZLa/i3t0;B)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 184
    .line 185
    .line 186
    new-instance p0, La/t4s;

    .line 187
    .line 188
    const/16 p1, 0x18

    .line 189
    .line 190
    invoke-direct {p0, p1}, La/t4s;-><init>(B)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v6, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 194
    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_4
    sget-object p0, La/j5s;->a:La/j5s;

    .line 198
    .line 199
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-nez p0, :cond_6

    .line 204
    .line 205
    sget-object p0, La/p5s;->a:La/p5s;

    .line 206
    .line 207
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    if-eqz p0, :cond_5

    .line 212
    .line 213
    goto :goto_0

    .line 214
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 215
    .line 216
    .line 217
    const/4 p0, 0x0

    .line 218
    goto :goto_1

    .line 219
    :cond_6
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    :goto_1
    return-object p0

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
