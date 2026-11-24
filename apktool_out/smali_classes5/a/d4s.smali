.class public final La/d4s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/k4s;


# direct methods
.method public synthetic constructor <init>(La/k4s;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/d4s;->a:B

    iput-object p1, p0, La/d4s;->b:La/k4s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte p2, p0, La/d4s;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/d4s;->b:La/k4s;

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
    move-result p1

    .line 14
    new-instance p2, La/obg;

    .line 15
    .line 16
    const/4 v0, 0x7

    .line 17
    invoke-direct {p2, v0, p1}, La/obg;-><init>(BZ)V

    .line 18
    .line 19
    .line 20
    sget p1, La/k4s;->c0:I

    .line 21
    .line 22
    invoke-virtual {p0, p2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, La/k9s;

    .line 29
    .line 30
    new-instance p2, La/h3s;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p2, p1, v0}, La/h3s;-><init>(La/k9s;B)V

    .line 34
    .line 35
    .line 36
    sget p1, La/k4s;->c0:I

    .line 37
    .line 38
    invoke-virtual {p0, p2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    check-cast p1, La/u5s;

    .line 45
    .line 46
    instance-of p2, p1, La/l5s;

    .line 47
    .line 48
    if-eqz p2, :cond_0

    .line 49
    .line 50
    check-cast p1, La/l5s;

    .line 51
    .line 52
    iget-wide v1, p1, La/l5s;->a:J

    .line 53
    .line 54
    sget p1, La/k4s;->c0:I

    .line 55
    .line 56
    new-instance v0, La/i3s;

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    const/4 v4, 0x0

    .line 60
    const/4 v5, 0x1

    .line 61
    invoke-direct/range {v0 .. v5}, La/i3s;-><init>(JZZZ)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_0
    instance-of p2, p1, La/n5s;

    .line 70
    .line 71
    if-eqz p2, :cond_1

    .line 72
    .line 73
    check-cast p1, La/n5s;

    .line 74
    .line 75
    iget-wide v1, p1, La/n5s;->a:J

    .line 76
    .line 77
    sget p1, La/k4s;->c0:I

    .line 78
    .line 79
    new-instance v0, La/i3s;

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    const/4 v4, 0x0

    .line 83
    const/4 v5, 0x0

    .line 84
    invoke-direct/range {v0 .. v5}, La/i3s;-><init>(JZZZ)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_0

    .line 91
    .line 92
    :cond_1
    instance-of p2, p1, La/q5s;

    .line 93
    .line 94
    if-eqz p2, :cond_2

    .line 95
    .line 96
    check-cast p1, La/q5s;

    .line 97
    .line 98
    iget-wide v1, p1, La/q5s;->a:J

    .line 99
    .line 100
    sget p1, La/k4s;->c0:I

    .line 101
    .line 102
    new-instance v0, La/i3s;

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    const/4 v4, 0x1

    .line 106
    const/4 v5, 0x0

    .line 107
    invoke-direct/range {v0 .. v5}, La/i3s;-><init>(JZZZ)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 111
    .line 112
    .line 113
    new-instance p1, La/gwr;

    .line 114
    .line 115
    const/16 p2, 0x1a

    .line 116
    .line 117
    invoke-direct {p1, p2}, La/gwr;-><init>(B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    instance-of p2, p1, La/r5s;

    .line 125
    .line 126
    if-eqz p2, :cond_3

    .line 127
    .line 128
    check-cast p1, La/r5s;

    .line 129
    .line 130
    iget-wide v1, p1, La/r5s;->a:J

    .line 131
    .line 132
    sget p1, La/k4s;->c0:I

    .line 133
    .line 134
    new-instance v0, La/i3s;

    .line 135
    .line 136
    const/4 v3, 0x0

    .line 137
    const/4 v4, 0x1

    .line 138
    const/4 v5, 0x0

    .line 139
    invoke-direct/range {v0 .. v5}, La/i3s;-><init>(JZZZ)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 143
    .line 144
    .line 145
    new-instance p1, La/gwr;

    .line 146
    .line 147
    const/16 p2, 0x1b

    .line 148
    .line 149
    invoke-direct {p1, p2}, La/gwr;-><init>(B)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_3
    instance-of p2, p1, La/s5s;

    .line 157
    .line 158
    if-eqz p2, :cond_4

    .line 159
    .line 160
    check-cast p1, La/s5s;

    .line 161
    .line 162
    iget-wide v1, p1, La/s5s;->a:J

    .line 163
    .line 164
    iget-boolean v3, p1, La/s5s;->b:Z

    .line 165
    .line 166
    sget p1, La/k4s;->c0:I

    .line 167
    .line 168
    new-instance v0, La/i3s;

    .line 169
    .line 170
    const/4 v4, 0x0

    .line 171
    const/4 v5, 0x0

    .line 172
    invoke-direct/range {v0 .. v5}, La/i3s;-><init>(JZZZ)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 176
    .line 177
    .line 178
    new-instance p1, La/gwr;

    .line 179
    .line 180
    const/16 p2, 0x1c

    .line 181
    .line 182
    invoke-direct {p1, p2}, La/gwr;-><init>(B)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_4
    sget-object p0, La/j5s;->a:La/j5s;

    .line 190
    .line 191
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-nez p0, :cond_6

    .line 196
    .line 197
    sget-object p0, La/p5s;->a:La/p5s;

    .line 198
    .line 199
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-eqz p0, :cond_5

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 207
    .line 208
    .line 209
    const/4 p0, 0x0

    .line 210
    goto :goto_1

    .line 211
    :cond_6
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    :goto_1
    return-object p0

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
