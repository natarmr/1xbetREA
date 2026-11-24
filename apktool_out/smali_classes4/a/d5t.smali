.class public final synthetic La/d5t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/d930;


# direct methods
.method public synthetic constructor <init>(BLa/cp;La/d930;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/d5t;->a:B

    iput-object p2, p0, La/d5t;->b:La/cp;

    iput-object p3, p0, La/d5t;->c:La/d930;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/d5t;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/d5t;->c:La/d930;

    .line 4
    .line 5
    iget-object p0, p0, La/d5t;->b:La/cp;

    .line 6
    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    check-cast v0, La/r7b0;

    .line 19
    .line 20
    iget-object v0, v0, La/r7b0;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 21
    .line 22
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, La/sv60;

    .line 27
    .line 28
    iget-object v2, v2, La/sv60;->a:La/nrv;

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 31
    .line 32
    .line 33
    check-cast p1, La/r7b0;

    .line 34
    .line 35
    iget-object p1, p1, La/r7b0;->b:Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesCollection;

    .line 36
    .line 37
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/sv60;

    .line 42
    .line 43
    iget-object v0, v0, La/sv60;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    new-instance v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 v3, 0xa

    .line 48
    .line 49
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_0

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, La/rv60;

    .line 71
    .line 72
    iget-object v3, v3, La/rv60;->a:La/rvy;

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    new-instance v0, La/e5t;

    .line 79
    .line 80
    const/4 v3, 0x3

    .line 81
    invoke-direct {v0, v3, p0, v1}, La/e5t;-><init>(BLa/cp;La/d930;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    instance-of p1, p0, La/bvy;

    .line 89
    .line 90
    if-eqz p1, :cond_1

    .line 91
    .line 92
    check-cast p0, La/bvy;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    const/4 p0, 0x0

    .line 96
    :goto_1
    if-eqz p0, :cond_2

    .line 97
    .line 98
    new-instance p1, La/wss;

    .line 99
    .line 100
    invoke-direct {p1, v0, v3}, La/wss;-><init>(Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v2, p1}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 113
    .line 114
    check-cast p1, La/q7b0;

    .line 115
    .line 116
    iget-object p1, p1, La/q7b0;->b:Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;

    .line 117
    .line 118
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, La/qv60;

    .line 123
    .line 124
    iget v0, v0, La/qv60;->c:I

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;->setBackgroundResource(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, La/qv60;

    .line 134
    .line 135
    iget v0, v0, La/qv60;->d:I

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;->setBackgroundPictureResource(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, La/qv60;

    .line 145
    .line 146
    iget-object v0, v0, La/qv60;->a:La/nrv;

    .line 147
    .line 148
    iget-object v0, v0, La/nrv;->a:Ljava/lang/CharSequence;

    .line 149
    .line 150
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;->setTitle(Ljava/lang/CharSequence;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, La/qv60;

    .line 158
    .line 159
    iget-object v0, v0, La/qv60;->f:Ljava/util/ArrayList;

    .line 160
    .line 161
    new-instance v2, La/llo;

    .line 162
    .line 163
    const/4 v3, 0x4

    .line 164
    invoke-direct {v2, v1, p0, v3}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 165
    .line 166
    .line 167
    iget-object p0, p1, Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;->i:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 168
    .line 169
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    check-cast p0, La/o4s;

    .line 177
    .line 178
    invoke-virtual {p0, v0, v2}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 179
    .line 180
    .line 181
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
