.class public final synthetic La/vk8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/fqm;Lkotlin/jvm/functions/Function2;La/pz40;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/vk8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/vk8;->b:I

    iput-object p2, p0, La/vk8;->c:Ljava/lang/Object;

    iput-object p3, p0, La/vk8;->d:Ljava/lang/Object;

    iput-object p4, p0, La/vk8;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/vk8;->a:B

    iput-object p1, p0, La/vk8;->c:Ljava/lang/Object;

    iput p2, p0, La/vk8;->b:I

    iput-object p3, p0, La/vk8;->d:Ljava/lang/Object;

    iput-object p4, p0, La/vk8;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalFieldView;La/egf;Ljava/util/ArrayList;I)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/vk8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vk8;->c:Ljava/lang/Object;

    iput-object p2, p0, La/vk8;->d:Ljava/lang/Object;

    iput-object p3, p0, La/vk8;->e:Ljava/lang/Object;

    iput p4, p0, La/vk8;->b:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/vk8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x40b00000    # 5.5f

    .line 5
    .line 6
    iget-object v3, p0, La/vk8;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, La/vk8;->d:Ljava/lang/Object;

    .line 9
    .line 10
    iget v5, p0, La/vk8;->b:I

    .line 11
    .line 12
    iget-object p0, p0, La/vk8;->c:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    check-cast v4, La/xk80;

    .line 20
    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    new-instance v0, La/ei60;

    .line 24
    .line 25
    invoke-virtual {v4}, La/xk80;->k()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v4}, La/xk80;->n()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-direct {v0, v5, v1, v2, v3}, La/ei60;-><init>(IIILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    check-cast p0, La/t33;

    .line 43
    .line 44
    check-cast v4, La/t33;

    .line 45
    .line 46
    check-cast v3, La/t33;

    .line 47
    .line 48
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    cmpg-float p0, p0, v2

    .line 59
    .line 60
    if-nez p0, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    int-to-float p0, v5

    .line 64
    invoke-virtual {v4}, La/t33;->d()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    mul-float v1, v0, p0

    .line 75
    .line 76
    :goto_0
    int-to-float p0, v5

    .line 77
    invoke-virtual {v3}, La/t33;->d()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    mul-float/2addr v0, p0

    .line 88
    sub-float/2addr v0, v1

    .line 89
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_1
    check-cast p0, La/t33;

    .line 95
    .line 96
    check-cast v4, La/t33;

    .line 97
    .line 98
    check-cast v3, La/fav;

    .line 99
    .line 100
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Ljava/lang/Number;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    cmpg-float v0, v0, v2

    .line 111
    .line 112
    if-nez v0, :cond_1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    div-int/lit8 v0, v5, 0x2

    .line 116
    .line 117
    int-to-float v0, v0

    .line 118
    invoke-virtual {v4}, La/t33;->d()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    mul-float/2addr v1, v0

    .line 129
    :goto_1
    sget-object v0, La/fav;->a:La/fav;

    .line 130
    .line 131
    if-ne v3, v0, :cond_2

    .line 132
    .line 133
    int-to-float v0, v5

    .line 134
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    check-cast p0, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    mul-float/2addr p0, v0

    .line 145
    add-float/2addr p0, v1

    .line 146
    goto :goto_2

    .line 147
    :cond_2
    int-to-float v0, v5

    .line 148
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, Ljava/lang/Number;

    .line 153
    .line 154
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    mul-float/2addr p0, v0

    .line 159
    sub-float/2addr p0, v1

    .line 160
    :goto_2
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :pswitch_2
    check-cast p0, La/fqm;

    .line 166
    .line 167
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 168
    .line 169
    check-cast v3, La/pz40;

    .line 170
    .line 171
    iget-object p0, p0, La/fqm;->c:Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    const/4 v0, 0x1

    .line 178
    sub-int/2addr p0, v0

    .line 179
    if-ne v5, p0, :cond_3

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_3
    const/4 v0, 0x0

    .line 183
    :goto_3
    if-eqz v0, :cond_4

    .line 184
    .line 185
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 186
    .line 187
    invoke-interface {v3, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_4
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-interface {v4, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_3
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalFieldView;

    .line 205
    .line 206
    check-cast v4, La/egf;

    .line 207
    .line 208
    check-cast v3, Ljava/util/ArrayList;

    .line 209
    .line 210
    iget p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalFieldView;->d:I

    .line 211
    .line 212
    int-to-float p0, p0

    .line 213
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    check-cast v0, La/cgf;

    .line 218
    .line 219
    const-wide/16 v1, 0x0

    .line 220
    .line 221
    invoke-static {v4, p0, v0, v1, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalFieldView;->c(La/egf;FLa/cgf;J)V

    .line 222
    .line 223
    .line 224
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_4
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 228
    .line 229
    check-cast v4, La/jh8;

    .line 230
    .line 231
    check-cast v3, Ljava/lang/String;

    .line 232
    .line 233
    new-instance v0, La/vh8;

    .line 234
    .line 235
    check-cast v4, La/gh8;

    .line 236
    .line 237
    iget-object v1, v4, La/gh8;->b:La/csr;

    .line 238
    .line 239
    invoke-direct {v0, v5, v1, v3}, La/vh8;-><init>(ILa/csr;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    invoke-static {}, La/dyb;->u0()V

    .line 246
    .line 247
    .line 248
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
