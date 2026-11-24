.class public final synthetic La/ulw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroid/widget/FrameLayout;La/o0x;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/ulw;->a:B

    iput-object p1, p0, La/ulw;->b:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/ulw;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/ulw;->a:B

    iput-object p1, p0, La/ulw;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/ulw;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/ulw;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ulw;->c:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iget-object p0, p0, La/ulw;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/cp;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 16
    .line 17
    check-cast v0, La/bzx;

    .line 18
    .line 19
    iget-object v2, v0, La/bzx;->b:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 20
    .line 21
    new-instance v3, La/o7x;

    .line 22
    .line 23
    const/16 v4, 0x15

    .line 24
    .line 25
    invoke-direct {v3, p0, p1, v4}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 29
    .line 30
    .line 31
    iget-object v2, v0, La/bzx;->e:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 32
    .line 33
    new-instance v3, La/o7x;

    .line 34
    .line 35
    const/16 v4, 0x16

    .line 36
    .line 37
    invoke-direct {v3, p0, p1, v4}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 41
    .line 42
    .line 43
    iget-object p0, v0, La/bzx;->c:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 44
    .line 45
    new-instance v0, La/tcc;

    .line 46
    .line 47
    const/4 v2, 0x3

    .line 48
    invoke-direct {v0, v1, v2}, La/tcc;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->setOnItemClickListener(La/xdr;)V

    .line 52
    .line 53
    .line 54
    new-instance p0, La/a8u0;

    .line 55
    .line 56
    const/16 v0, 0xa

    .line 57
    .line 58
    invoke-direct {p0, p1, v0}, La/a8u0;-><init>(La/cp;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 68
    .line 69
    sget v0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->h:I

    .line 70
    .line 71
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_1
    check-cast p1, La/cp;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 92
    .line 93
    check-cast v0, La/bzx;

    .line 94
    .line 95
    iget-object v2, v0, La/bzx;->b:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 96
    .line 97
    new-instance v3, La/xb;

    .line 98
    .line 99
    const/16 v4, 0x1d

    .line 100
    .line 101
    invoke-direct {v3, p0, p1, v4}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 105
    .line 106
    .line 107
    iget-object v2, v0, La/bzx;->e:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 108
    .line 109
    new-instance v3, La/o7x;

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    invoke-direct {v3, p0, p1, v4}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 113
    .line 114
    .line 115
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 116
    .line 117
    .line 118
    iget-object p0, v0, La/bzx;->c:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 119
    .line 120
    new-instance v0, La/tcc;

    .line 121
    .line 122
    const/4 v2, 0x1

    .line 123
    invoke-direct {v0, v1, v2}, La/tcc;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->setOnItemClickListener(La/xdr;)V

    .line 127
    .line 128
    .line 129
    new-instance p0, La/b1w;

    .line 130
    .line 131
    const/16 v0, 0x9

    .line 132
    .line 133
    invoke-direct {p0, p1, v0}, La/b1w;-><init>(La/cp;B)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 137
    .line 138
    .line 139
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 143
    .line 144
    sget v0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/HorizontalPromoStoreCollectionItem;->h:I

    .line 145
    .line 146
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
