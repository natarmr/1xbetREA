.class public final La/wz80;
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
    iput-byte p2, p0, La/wz80;->a:B

    iput-object p1, p0, La/wz80;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wz80;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wz80;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/wz80;

    .line 9
    .line 10
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

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
    check-cast p0, La/z6b0;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_1
    check-cast p0, La/r6b0;

    .line 21
    .line 22
    invoke-virtual {p0}, La/r6b0;->invoke()Ljava/lang/Object;

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
    check-cast p0, La/u4b0;

    .line 30
    .line 31
    invoke-virtual {p0}, La/u4b0;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/riu0;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_3
    check-cast p0, La/u4b0;

    .line 39
    .line 40
    invoke-virtual {p0}, La/u4b0;->invoke()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/riu0;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_4
    check-cast p0, La/wz80;

    .line 48
    .line 49
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/riu0;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_5
    check-cast p0, La/d4b0;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_6
    check-cast p0, La/wz80;

    .line 60
    .line 61
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/riu0;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_7
    check-cast p0, La/lja0;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_8
    check-cast p0, La/wz80;

    .line 72
    .line 73
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/riu0;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_9
    check-cast p0, La/uia0;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_a
    check-cast p0, La/wz80;

    .line 84
    .line 85
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, La/riu0;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_b
    check-cast p0, La/kia0;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_c
    check-cast p0, La/wz80;

    .line 96
    .line 97
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, La/riu0;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_d
    check-cast p0, La/tha0;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_e
    check-cast p0, La/xk80;

    .line 108
    .line 109
    invoke-virtual {p0}, La/xk80;->k()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p0}, La/xk80;->l()F

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    new-instance v1, Lkotlin/Pair;

    .line 126
    .line 127
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-object v1

    .line 131
    :pswitch_f
    check-cast p0, La/wz80;

    .line 132
    .line 133
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, La/riu0;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_10
    check-cast p0, La/et90;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_11
    check-cast p0, La/wz80;

    .line 144
    .line 145
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    check-cast p0, La/riu0;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_12
    check-cast p0, La/zo90;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_13
    check-cast p0, La/wz80;

    .line 156
    .line 157
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    check-cast p0, La/riu0;

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_14
    check-cast p0, La/aj90;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_15
    check-cast p0, La/wz80;

    .line 168
    .line 169
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, La/riu0;

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_16
    check-cast p0, La/o890;

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_17
    check-cast p0, La/wz80;

    .line 180
    .line 181
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    check-cast p0, La/riu0;

    .line 186
    .line 187
    return-object p0

    .line 188
    :pswitch_18
    check-cast p0, La/w590;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_19
    check-cast p0, La/z090;

    .line 192
    .line 193
    invoke-virtual {p0}, La/z090;->invoke()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    check-cast p0, La/riu0;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_1a
    check-cast p0, La/z090;

    .line 201
    .line 202
    invoke-virtual {p0}, La/z090;->invoke()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    check-cast p0, La/riu0;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_1b
    check-cast p0, La/wz80;

    .line 210
    .line 211
    invoke-virtual {p0}, La/wz80;->invoke()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    check-cast p0, La/riu0;

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_1c
    check-cast p0, La/xz80;

    .line 219
    .line 220
    return-object p0

    .line 221
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
