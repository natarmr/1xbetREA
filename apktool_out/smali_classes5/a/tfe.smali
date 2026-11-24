.class public final La/tfe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/cgk0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/tfe;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/tfe;->b:I

    .line 8
    .line 9
    iput-object p2, p0, La/tfe;->c:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 12
    iput-byte p3, p0, La/tfe;->a:B

    iput-object p1, p0, La/tfe;->c:Ljava/lang/Object;

    iput p2, p0, La/tfe;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/tfe;->a:B

    .line 2
    .line 3
    iget v1, p0, La/tfe;->b:I

    .line 4
    .line 5
    iget-object p0, p0, La/tfe;->c:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/omn;

    .line 11
    .line 12
    sget-object v0, La/omn;->p2:La/ddk;

    .line 13
    .line 14
    iget-object v0, p0, La/omn;->m2:La/phf0;

    .line 15
    .line 16
    sget-object v2, La/omn;->q2:[La/iiy;

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    aget-object v3, v2, v3

    .line 20
    .line 21
    invoke-virtual {v0, p0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v3, p0, La/omn;->n2:La/phf0;

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    aget-object v2, v2, v4

    .line 29
    .line 30
    invoke-virtual {v3, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v3, Lkotlin/Pair;

    .line 39
    .line 40
    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_0
    check-cast p0, La/mp9;

    .line 61
    .line 62
    invoke-interface {p0}, La/kp9;->z()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    check-cast p0, La/go80;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_1
    check-cast p0, Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/go80;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_2
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 86
    .line 87
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/v2;

    .line 92
    .line 93
    sget-object v0, La/wez;->a:La/wez;

    .line 94
    .line 95
    new-instance v2, La/svc;

    .line 96
    .line 97
    const/16 v3, 0x1c

    .line 98
    .line 99
    invoke-direct {v2, p0, v3}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v2, p0, La/v2;->a:La/mre0;

    .line 107
    .line 108
    const/4 v3, 0x0

    .line 109
    if-eqz v2, :cond_0

    .line 110
    .line 111
    invoke-virtual {v2}, La/mre0;->invoke()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Ljava/lang/reflect/Type;

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_0
    move-object v2, v3

    .line 119
    :goto_0
    instance-of v4, v2, Ljava/lang/Class;

    .line 120
    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    check-cast v2, Ljava/lang/Class;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-eqz p0, :cond_1

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    :goto_1
    move-object v3, p0

    .line 136
    goto :goto_2

    .line 137
    :cond_1
    const-class p0, Ljava/lang/Object;

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_2
    instance-of v4, v2, Ljava/lang/reflect/GenericArrayType;

    .line 145
    .line 146
    if-eqz v4, :cond_4

    .line 147
    .line 148
    if-nez v1, :cond_3

    .line 149
    .line 150
    check-cast v2, Ljava/lang/reflect/GenericArrayType;

    .line 151
    .line 152
    invoke-interface {v2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_3
    const-string v0, "Array type has been queried for a non-0th argument: "

    .line 161
    .line 162
    invoke-static {p0, v0}, La/ohq;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_4
    instance-of v2, v2, Ljava/lang/reflect/ParameterizedType;

    .line 167
    .line 168
    if-eqz v2, :cond_7

    .line 169
    .line 170
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast p0, Ljava/util/List;

    .line 175
    .line 176
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    move-object v3, p0

    .line 181
    check-cast v3, Ljava/lang/reflect/Type;

    .line 182
    .line 183
    instance-of p0, v3, Ljava/lang/reflect/WildcardType;

    .line 184
    .line 185
    if-nez p0, :cond_5

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_5
    check-cast v3, Ljava/lang/reflect/WildcardType;

    .line 189
    .line 190
    invoke-interface {v3}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-static {p0}, La/tx3;->B([Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, Ljava/lang/reflect/Type;

    .line 202
    .line 203
    if-nez p0, :cond_6

    .line 204
    .line 205
    invoke-interface {v3}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {p0}, La/tx3;->A([Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    check-cast p0, Ljava/lang/reflect/Type;

    .line 217
    .line 218
    :cond_6
    move-object v3, p0

    .line 219
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_7
    const-string v0, "Non-generic type has been queried for arguments: "

    .line 224
    .line 225
    invoke-static {p0, v0}, La/ohq;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    :goto_3
    return-object v3

    .line 229
    :pswitch_3
    check-cast p0, La/cgk0;

    .line 230
    .line 231
    invoke-virtual {p0, v1}, La/cgk0;->m(I)V

    .line 232
    .line 233
    .line 234
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object p0

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
