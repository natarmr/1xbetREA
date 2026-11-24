.class public final La/q7g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q7g;->a:B

    iput-object p1, p0, La/q7g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/q7g;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/q7g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/q7g;

    .line 9
    .line 10
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/riu0;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p0, La/c9k;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_1
    check-cast p0, La/q7g;

    .line 21
    .line 22
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, La/riu0;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_2
    check-cast p0, La/u8k;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_3
    check-cast p0, La/m3k0;

    .line 33
    .line 34
    iget-object p0, p0, La/m3k0;->i:La/kyq0;

    .line 35
    .line 36
    const v0, 0x3c23d70a    # 0.01f

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    cmpl-float v0, v1, v0

    .line 41
    .line 42
    if-lez v0, :cond_0

    .line 43
    .line 44
    const/high16 v1, 0x3f800000    # 1.0f

    .line 45
    .line 46
    :cond_0
    iget-wide v2, p0, La/kyq0;->a:J

    .line 47
    .line 48
    iget-wide v4, p0, La/kyq0;->b:J

    .line 49
    .line 50
    sget-object p0, La/ihn;->c:La/zsf;

    .line 51
    .line 52
    invoke-virtual {p0, v1}, La/zsf;->a(F)F

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p0, v2, v3, v4, v5}, La/fbc;->P(FJJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    new-instance p0, La/y3d;

    .line 61
    .line 62
    invoke-direct {p0, v0, v1}, La/y3d;-><init>(J)V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_4
    check-cast p0, La/q7g;

    .line 67
    .line 68
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, La/riu0;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_5
    check-cast p0, La/ysj;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_6
    check-cast p0, La/jgj;

    .line 79
    .line 80
    invoke-virtual {p0}, La/jgj;->invoke()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, La/riu0;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_7
    check-cast p0, La/q7g;

    .line 88
    .line 89
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, La/riu0;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_8
    check-cast p0, La/ngj;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_9
    check-cast p0, La/q7g;

    .line 100
    .line 101
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, La/riu0;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_a
    check-cast p0, La/dsh;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_b
    check-cast p0, La/x4h;

    .line 112
    .line 113
    invoke-virtual {p0}, La/x4h;->invoke()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, La/riu0;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_c
    check-cast p0, La/x4h;

    .line 121
    .line 122
    invoke-virtual {p0}, La/x4h;->invoke()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, La/riu0;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_d
    check-cast p0, La/q7g;

    .line 130
    .line 131
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, La/riu0;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_e
    check-cast p0, La/upg;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_f
    check-cast p0, La/q7g;

    .line 142
    .line 143
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    check-cast p0, La/riu0;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_10
    check-cast p0, La/vgg;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_11
    check-cast p0, La/q7g;

    .line 154
    .line 155
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, La/riu0;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_12
    check-cast p0, La/wcg;

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_13
    check-cast p0, La/q7g;

    .line 166
    .line 167
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    check-cast p0, La/riu0;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_14
    check-cast p0, La/dcg;

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_15
    check-cast p0, La/q7g;

    .line 178
    .line 179
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    check-cast p0, La/riu0;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_16
    check-cast p0, La/b9g;

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_17
    check-cast p0, La/q7g;

    .line 190
    .line 191
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    check-cast p0, La/riu0;

    .line 196
    .line 197
    return-object p0

    .line 198
    :pswitch_18
    check-cast p0, La/h8g;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_19
    check-cast p0, La/q7g;

    .line 202
    .line 203
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    check-cast p0, La/riu0;

    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_1a
    check-cast p0, La/y7g;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_1b
    check-cast p0, La/q7g;

    .line 214
    .line 215
    invoke-virtual {p0}, La/q7g;->invoke()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    check-cast p0, La/riu0;

    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_1c
    check-cast p0, La/s7g;

    .line 223
    .line 224
    return-object p0

    .line 225
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
