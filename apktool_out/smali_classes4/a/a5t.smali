.class public final synthetic La/a5t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g9b0;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:La/d930;


# direct methods
.method public synthetic constructor <init>(La/g9b0;Ljava/lang/String;La/d930;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/a5t;->a:B

    iput-object p1, p0, La/a5t;->b:La/g9b0;

    iput-object p2, p0, La/a5t;->c:Ljava/lang/String;

    iput-object p3, p0, La/a5t;->d:La/d930;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/a5t;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x16

    .line 5
    .line 6
    iget-object v3, p0, La/a5t;->d:La/d930;

    .line 7
    .line 8
    iget-object v4, p0, La/a5t;->c:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p0, p0, La/a5t;->b:La/g9b0;

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    check-cast p1, La/cp;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 22
    .line 23
    check-cast v0, La/r7b0;

    .line 24
    .line 25
    iget-object v0, v0, La/r7b0;->b:Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesCollection;

    .line 26
    .line 27
    new-instance v6, La/hpr;

    .line 28
    .line 29
    invoke-direct {v6, p1, p0, v4, v2}, La/hpr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v6}, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesCollection;->setOnItemClickListener(Lkotlin/jvm/functions/Function2;)V

    .line 33
    .line 34
    .line 35
    new-instance p0, La/d5t;

    .line 36
    .line 37
    invoke-direct {p0, v5, p1, v3}, La/d5t;-><init>(BLa/cp;La/d930;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 41
    .line 42
    .line 43
    new-instance p0, La/e5t;

    .line 44
    .line 45
    invoke-direct {p0, v1, p1, v3}, La/e5t;-><init>(BLa/cp;La/d930;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0}, La/cp;->z(Lkotlin/jvm/functions/Function0;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_0
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 55
    .line 56
    check-cast v0, La/v6b0;

    .line 57
    .line 58
    iget-object v6, v0, La/v6b0;->b:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 59
    .line 60
    new-instance v7, La/b5t;

    .line 61
    .line 62
    invoke-direct {v7, v5, p1, p0, v4}, La/b5t;-><init>(BLa/cp;La/g9b0;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6, v7}, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->setOnItemClickListener(La/xdr;)V

    .line 66
    .line 67
    .line 68
    iget-object v6, v0, La/v6b0;->b:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 69
    .line 70
    new-instance v7, La/c5t;

    .line 71
    .line 72
    invoke-direct {v7, v5, p1, p0, v4}, La/c5t;-><init>(BLa/cp;La/g9b0;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v6, v7}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, v0, La/v6b0;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 79
    .line 80
    new-instance v6, La/c5t;

    .line 81
    .line 82
    invoke-direct {v6, v1, p1, p0, v4}, La/c5t;-><init>(BLa/cp;La/g9b0;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v1, La/cjj;

    .line 91
    .line 92
    new-instance v4, La/olh;

    .line 93
    .line 94
    const/16 v7, 0xf

    .line 95
    .line 96
    invoke-direct {v4, v6, v7}, La/olh;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, p0, v5, v4}, La/cjj;-><init>(La/ymx;ZLkotlin/jvm/functions/Function1;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/header/DsHeader;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    .line 104
    .line 105
    new-instance p0, La/kgh;

    .line 106
    .line 107
    invoke-direct {p0, p1, v2}, La/kgh;-><init>(La/cp;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 111
    .line 112
    .line 113
    new-instance p0, La/e5t;

    .line 114
    .line 115
    invoke-direct {p0, v5, p1, v3}, La/e5t;-><init>(BLa/cp;La/d930;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, p0}, La/cp;->z(Lkotlin/jvm/functions/Function0;)V

    .line 119
    .line 120
    .line 121
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_1
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 125
    .line 126
    check-cast v0, La/q7b0;

    .line 127
    .line 128
    iget-object v1, v0, La/q7b0;->b:Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;

    .line 129
    .line 130
    new-instance v2, La/b5t;

    .line 131
    .line 132
    const/4 v5, 0x0

    .line 133
    invoke-direct {v2, v5, p1, p0, v4}, La/b5t;-><init>(BLa/cp;La/g9b0;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;->setOnItemClickListener(La/xdr;)V

    .line 137
    .line 138
    .line 139
    iget-object v0, v0, La/q7b0;->b:Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;

    .line 140
    .line 141
    new-instance v1, La/c5t;

    .line 142
    .line 143
    invoke-direct {v1, v5, p1, p0, v4}, La/c5t;-><init>(BLa/cp;La/g9b0;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 147
    .line 148
    .line 149
    iget-object p0, p1, La/cp;->w:Landroid/content/Context;

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const v1, 0x7f0704be

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    iget-object v6, p1, La/xhe0;->a:Landroid/view/View;

    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    const v0, 0x7f07072d

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    const/4 v10, 0x0

    .line 179
    const/16 v11, 0x8

    .line 180
    .line 181
    move v9, v7

    .line 182
    invoke-static/range {v6 .. v11}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 183
    .line 184
    .line 185
    new-instance p0, La/d5t;

    .line 186
    .line 187
    invoke-direct {p0, v5, p1, v3}, La/d5t;-><init>(BLa/cp;La/d930;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 191
    .line 192
    .line 193
    new-instance p0, La/e5t;

    .line 194
    .line 195
    invoke-direct {p0, v5, p1, v3}, La/e5t;-><init>(BLa/cp;La/d930;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, p0}, La/cp;->z(Lkotlin/jvm/functions/Function0;)V

    .line 199
    .line 200
    .line 201
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object p0

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
