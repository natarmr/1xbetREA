.class public final synthetic La/yjf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ekf0;


# direct methods
.method public synthetic constructor <init>(La/ekf0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yjf0;->a:B

    iput-object p1, p0, La/yjf0;->b:La/ekf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/yjf0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/16 v4, 0x20

    .line 8
    .line 9
    const-wide v5, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    iget-object p0, p0, La/yjf0;->b:La/ekf0;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/ekf0;->a:La/jw20;

    .line 21
    .line 22
    invoke-virtual {p0}, La/jw20;->e()La/iw20;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_0
    iget-object p0, p0, La/ekf0;->j:La/pz40;

    .line 28
    .line 29
    check-cast p0, La/hgk0;

    .line 30
    .line 31
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v7, 0x0

    .line 39
    :goto_0
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_1
    invoke-virtual {p0}, La/ekf0;->b()La/gkf0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, La/gkf0;->a()J

    .line 51
    .line 52
    .line 53
    move-result-wide v8

    .line 54
    shr-long v10, v8, v4

    .line 55
    .line 56
    long-to-int v1, v10

    .line 57
    int-to-float v1, v1

    .line 58
    and-long/2addr v8, v5

    .line 59
    long-to-int v8, v8

    .line 60
    int-to-float v8, v8

    .line 61
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    int-to-long v9, v1

    .line 66
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    int-to-long v11, v1

    .line 71
    shl-long v8, v9, v4

    .line 72
    .line 73
    and-long v10, v11, v5

    .line 74
    .line 75
    or-long/2addr v8, v10

    .line 76
    invoke-virtual {p0}, La/ekf0;->d()La/ma80;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {v8, v9, v1}, La/zdx;->z(JLa/ma80;)F

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-virtual {v0}, La/gkf0;->b()J

    .line 85
    .line 86
    .line 87
    move-result-wide v8

    .line 88
    invoke-virtual {p0}, La/ekf0;->d()La/ma80;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_2

    .line 97
    .line 98
    if-ne p0, v7, :cond_1

    .line 99
    .line 100
    shr-long v3, v8, v4

    .line 101
    .line 102
    :goto_1
    long-to-int p0, v3

    .line 103
    goto :goto_2

    .line 104
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_2
    and-long v3, v8, v5

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :goto_2
    int-to-float p0, p0

    .line 112
    add-float/2addr v1, p0

    .line 113
    sub-float/2addr v1, v2

    .line 114
    :cond_3
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    :goto_3
    return-object v3

    .line 119
    :pswitch_2
    invoke-virtual {p0}, La/ekf0;->b()La/gkf0;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    iget-object v1, p0, La/ekf0;->a:La/jw20;

    .line 126
    .line 127
    invoke-virtual {v1}, La/jw20;->e()La/iw20;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iget-object v1, v1, La/iw20;->a:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, La/mcz;

    .line 134
    .line 135
    iget-object v8, v1, La/mcz;->q:La/ma80;

    .line 136
    .line 137
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    if-eqz v8, :cond_5

    .line 142
    .line 143
    if-ne v8, v7, :cond_4

    .line 144
    .line 145
    invoke-virtual {v1}, La/mcz;->h()J

    .line 146
    .line 147
    .line 148
    move-result-wide v7

    .line 149
    shr-long/2addr v7, v4

    .line 150
    :goto_4
    long-to-int v1, v7

    .line 151
    goto :goto_5

    .line 152
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 153
    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_5
    invoke-virtual {v1}, La/mcz;->h()J

    .line 157
    .line 158
    .line 159
    move-result-wide v7

    .line 160
    and-long/2addr v7, v5

    .line 161
    goto :goto_4

    .line 162
    :goto_5
    int-to-float v1, v1

    .line 163
    invoke-virtual {v0}, La/gkf0;->a()J

    .line 164
    .line 165
    .line 166
    move-result-wide v7

    .line 167
    shr-long v9, v7, v4

    .line 168
    .line 169
    long-to-int v0, v9

    .line 170
    int-to-float v0, v0

    .line 171
    and-long/2addr v7, v5

    .line 172
    long-to-int v3, v7

    .line 173
    int-to-float v3, v3

    .line 174
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    int-to-long v7, v0

    .line 179
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    int-to-long v9, v0

    .line 184
    shl-long v3, v7, v4

    .line 185
    .line 186
    and-long/2addr v5, v9

    .line 187
    or-long/2addr v3, v5

    .line 188
    invoke-virtual {p0}, La/ekf0;->d()La/ma80;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {v3, v4, p0}, La/zdx;->z(JLa/ma80;)F

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    sub-float/2addr v1, p0

    .line 197
    sub-float/2addr v1, v2

    .line 198
    :cond_6
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    :goto_6
    return-object v3

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
