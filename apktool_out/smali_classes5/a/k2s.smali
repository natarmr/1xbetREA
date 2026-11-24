.class public final synthetic La/k2s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o2s;


# direct methods
.method public synthetic constructor <init>(La/o2s;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k2s;->a:B

    iput-object p1, p0, La/k2s;->b:La/o2s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/k2s;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/high16 v3, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iget-object p0, p0, La/k2s;->b:La/o2s;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/o2s;->i:La/agk0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/agk0;->l()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget p0, p0, La/o2s;->j:F

    .line 20
    .line 21
    sub-float/2addr v0, p0

    .line 22
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_0
    iget-object v0, p0, La/o2s;->g:La/pz40;

    .line 28
    .line 29
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object p0, p0, La/o2s;->e:La/agk0;

    .line 34
    .line 35
    invoke-virtual {p0}, La/agk0;->l()F

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v1, Lkotlin/Pair;

    .line 44
    .line 45
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :pswitch_1
    iget-object v0, p0, La/o2s;->c:La/t33;

    .line 50
    .line 51
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    cmpg-float v0, v0, v2

    .line 62
    .line 63
    if-nez v0, :cond_0

    .line 64
    .line 65
    iget-object p0, p0, La/o2s;->d:La/t33;

    .line 66
    .line 67
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    sub-float p0, v3, p0

    .line 78
    .line 79
    invoke-static {p0, v2, v3}, La/l1e0;->c(FFF)F

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    :cond_0
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_2
    iget-object p0, p0, La/o2s;->c:La/t33;

    .line 89
    .line 90
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 101
    .line 102
    sub-double/2addr v0, v2

    .line 103
    div-double/2addr v0, v2

    .line 104
    const-wide/16 v2, 0x0

    .line 105
    .line 106
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    double-to-float p0, v0

    .line 111
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :pswitch_3
    iget-object p0, p0, La/o2s;->c:La/t33;

    .line 117
    .line 118
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    mul-float/2addr p0, v1

    .line 129
    sub-float p0, v3, p0

    .line 130
    .line 131
    invoke-static {p0, v2, v3}, La/l1e0;->c(FFF)F

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0

    .line 140
    :pswitch_4
    iget-object v0, p0, La/o2s;->c:La/t33;

    .line 141
    .line 142
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    cmpg-float v0, v0, v2

    .line 153
    .line 154
    if-nez v0, :cond_1

    .line 155
    .line 156
    iget-object p0, p0, La/o2s;->d:La/t33;

    .line 157
    .line 158
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    check-cast p0, Ljava/lang/Number;

    .line 163
    .line 164
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    mul-float/2addr p0, v1

    .line 169
    sub-float p0, v3, p0

    .line 170
    .line 171
    invoke-static {p0, v2, v3}, La/l1e0;->c(FFF)F

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    goto :goto_0

    .line 176
    :cond_1
    iget-object p0, p0, La/o2s;->c:La/t33;

    .line 177
    .line 178
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    check-cast p0, Ljava/lang/Number;

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    mul-float/2addr p0, v1

    .line 189
    sub-float p0, v3, p0

    .line 190
    .line 191
    invoke-static {p0, v2, v3}, La/l1e0;->c(FFF)F

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    return-object p0

    .line 200
    :pswitch_5
    iget-object p0, p0, La/o2s;->i:La/agk0;

    .line 201
    .line 202
    invoke-virtual {p0}, La/agk0;->l()F

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    return-object p0

    .line 215
    :pswitch_6
    iget p0, p0, La/o2s;->j:F

    .line 216
    .line 217
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
