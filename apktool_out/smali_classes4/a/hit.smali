.class public final synthetic La/hit;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pg4;


# direct methods
.method public synthetic constructor <init>(La/pg4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hit;->a:B

    iput-object p1, p0, La/hit;->b:La/pg4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/hit;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/hit;->b:La/pg4;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/fee;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, La/zo80;

    .line 19
    .line 20
    iget-object p1, p1, La/zo80;->d:Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;

    .line 21
    .line 22
    iget p1, p1, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;->b:I

    .line 23
    .line 24
    iget-object p0, p0, La/pg4;->b:La/ctf0;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    new-array p1, v1, [Ljava/lang/Object;

    .line 29
    .line 30
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 31
    .line 32
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const v0, 0x7f1315ab

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-array p1, v1, [Ljava/lang/Object;

    .line 45
    .line 46
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 47
    .line 48
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const v0, 0x7f130448

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :goto_0
    return-object p0

    .line 60
    :pswitch_0
    iget-object v0, p0, La/pg4;->m:La/n0o0;

    .line 61
    .line 62
    iget-object v2, p0, La/pg4;->l:La/n0o0;

    .line 63
    .line 64
    check-cast p1, La/fee;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, La/pg4;->g:La/n0o0;

    .line 70
    .line 71
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, La/fee;

    .line 76
    .line 77
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-eqz p0, :cond_5

    .line 88
    .line 89
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, La/fee;

    .line 94
    .line 95
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {p0}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-eqz p0, :cond_5

    .line 106
    .line 107
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, La/fee;

    .line 112
    .line 113
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {p0}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    if-eqz p0, :cond_5

    .line 124
    .line 125
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, La/fee;

    .line 130
    .line 131
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {p0}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    const-wide/16 v3, 0x0

    .line 142
    .line 143
    if-eqz p0, :cond_1

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 146
    .line 147
    .line 148
    move-result-wide v5

    .line 149
    goto :goto_1

    .line 150
    :cond_1
    move-wide v5, v3

    .line 151
    :goto_1
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, La/zo80;

    .line 156
    .line 157
    iget-object p0, p0, La/zo80;->a:Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {p0}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    if-eqz p0, :cond_2

    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 166
    .line 167
    .line 168
    move-result-wide p0

    .line 169
    goto :goto_2

    .line 170
    :cond_2
    move-wide p0, v3

    .line 171
    :goto_2
    cmpl-double p0, v5, p0

    .line 172
    .line 173
    if-ltz p0, :cond_5

    .line 174
    .line 175
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    check-cast p0, La/fee;

    .line 180
    .line 181
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    check-cast p0, Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {p0}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    if-eqz p0, :cond_3

    .line 192
    .line 193
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 194
    .line 195
    .line 196
    move-result-wide p0

    .line 197
    goto :goto_3

    .line 198
    :cond_3
    move-wide p0, v3

    .line 199
    :goto_3
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, La/fee;

    .line 204
    .line 205
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v0}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-eqz v0, :cond_4

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 218
    .line 219
    .line 220
    move-result-wide v3

    .line 221
    :cond_4
    cmpl-double p0, p0, v3

    .line 222
    .line 223
    if-lez p0, :cond_5

    .line 224
    .line 225
    const/4 v1, 0x1

    .line 226
    :cond_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
