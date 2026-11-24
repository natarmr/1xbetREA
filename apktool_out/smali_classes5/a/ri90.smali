.class public final synthetic La/ri90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xj80;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;La/xj80;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ri90;->a:B

    iput-object p1, p0, La/ri90;->c:La/cp;

    iput-object p2, p0, La/ri90;->b:La/xj80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/xj80;La/cp;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/ri90;->a:B

    iput-object p1, p0, La/ri90;->b:La/xj80;

    iput-object p2, p0, La/ri90;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/ri90;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ri90;->c:La/cp;

    .line 4
    .line 5
    iget-object p0, p0, La/ri90;->b:La/xj80;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, La/sde;

    .line 20
    .line 21
    iget-object p1, p1, La/sde;->a:La/ej90;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, La/xj80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v0, v1, La/cp;->u:La/yfu0;

    .line 39
    .line 40
    check-cast p1, La/sde;

    .line 41
    .line 42
    iget-object p1, p1, La/sde;->a:La/ej90;

    .line 43
    .line 44
    iget-boolean p1, p1, La/ej90;->a:Z

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    move-object p1, v0

    .line 49
    check-cast p1, La/vi90;

    .line 50
    .line 51
    iget-object p1, p1, La/vi90;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 52
    .line 53
    new-instance v2, La/ri90;

    .line 54
    .line 55
    const/4 v3, 0x3

    .line 56
    invoke-direct {v2, p0, v1, v3}, La/ri90;-><init>(La/xj80;La/cp;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v2}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    check-cast v0, La/vi90;

    .line 63
    .line 64
    iget-object p0, v0, La/vi90;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 65
    .line 66
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, La/sde;

    .line 71
    .line 72
    iget-object p1, p1, La/sde;->b:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    iget-object p0, v0, La/vi90;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 78
    .line 79
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, La/sde;

    .line 84
    .line 85
    iget p1, p1, La/sde;->c:I

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, La/rde;

    .line 103
    .line 104
    iget-object p1, p1, La/rde;->e:La/ej90;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/xj80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object p1, v1, La/cp;->u:La/yfu0;

    .line 118
    .line 119
    move-object v0, p1

    .line 120
    check-cast v0, La/si90;

    .line 121
    .line 122
    iget-object v0, v0, La/si90;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 123
    .line 124
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, La/rde;

    .line 129
    .line 130
    iget-object v2, v2, La/rde;->a:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    check-cast p1, La/si90;

    .line 136
    .line 137
    iget-object v0, p1, La/si90;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 138
    .line 139
    iget-object v2, p1, La/si90;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 140
    .line 141
    iget-object v3, p1, La/si90;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightMediumLabel;

    .line 142
    .line 143
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    check-cast v4, La/rde;

    .line 148
    .line 149
    iget-object v4, v4, La/rde;->b:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    const/4 v5, 0x1

    .line 156
    const/4 v6, 0x0

    .line 157
    if-lez v4, :cond_1

    .line 158
    .line 159
    move v4, v5

    .line 160
    goto :goto_0

    .line 161
    :cond_1
    move v4, v6

    .line 162
    :goto_0
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleVisible(Z)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p1, La/si90;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 166
    .line 167
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, La/rde;

    .line 172
    .line 173
    iget-object v0, v0, La/rde;->b:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, La/rde;

    .line 183
    .line 184
    iget-boolean p1, p1, La/rde;->d:Z

    .line 185
    .line 186
    if-eqz p1, :cond_2

    .line 187
    .line 188
    move p1, v6

    .line 189
    goto :goto_1

    .line 190
    :cond_2
    const/16 p1, 0x8

    .line 191
    .line 192
    :goto_1
    invoke-virtual {v3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    check-cast p1, La/rde;

    .line 200
    .line 201
    iget-object p1, p1, La/rde;->c:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v3, p1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightMediumLabel;->setText(Ljava/lang/CharSequence;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    check-cast p1, La/rde;

    .line 211
    .line 212
    iget-object p1, p1, La/rde;->e:La/ej90;

    .line 213
    .line 214
    iget-boolean p1, p1, La/ej90;->a:Z

    .line 215
    .line 216
    if-eqz p1, :cond_3

    .line 217
    .line 218
    new-instance p1, La/ri90;

    .line 219
    .line 220
    invoke-direct {p1, p0, v1, v5}, La/ri90;-><init>(La/xj80;La/cp;B)V

    .line 221
    .line 222
    .line 223
    invoke-static {v3, p1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 224
    .line 225
    .line 226
    :cond_3
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    check-cast p0, La/rde;

    .line 231
    .line 232
    sget-object p0, La/dj90;->a:La/dj90;

    .line 233
    .line 234
    sget-object p0, La/dj90;->a:La/dj90;

    .line 235
    .line 236
    invoke-virtual {v2, v6}, La/tw5;->setFirst(Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    check-cast p0, La/rde;

    .line 244
    .line 245
    sget-object p0, La/dj90;->a:La/dj90;

    .line 246
    .line 247
    invoke-virtual {v2, v6}, La/tw5;->setLast(Z)V

    .line 248
    .line 249
    .line 250
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object p0

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
