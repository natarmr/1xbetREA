.class public final La/lhf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/oer;La/xzs0;)V
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    iput-byte v0, p0, La/lhf;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/lhf;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, La/lhf;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La/lhf;->a:B

    iput-object p1, p0, La/lhf;->b:Ljava/lang/Object;

    iput-object p2, p0, La/lhf;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/lhf;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/lhf;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;

    .line 19
    .line 20
    const v1, 0x7f0d069c

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    const v0, 0x7f0a0818

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Landroid/widget/ImageView;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const v0, 0x7f0a089a

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Landroid/widget/ImageView;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    const v0, 0x7f0a08f3

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Landroid/widget/ImageView;

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    const v0, 0x7f0a10c1

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Landroid/widget/TextView;

    .line 67
    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    const v0, 0x7f0a11df

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Landroid/widget/TextView;

    .line 78
    .line 79
    if-eqz v2, :cond_0

    .line 80
    .line 81
    const v0, 0x7f0a12b6

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Landroid/widget/TextView;

    .line 89
    .line 90
    if-eqz v3, :cond_0

    .line 91
    .line 92
    new-instance v0, La/chu0;

    .line 93
    .line 94
    invoke-direct {v0, p0, v1, v2, v3}, La/chu0;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    const-string v0, "Missing required view with ID: "

    .line 107
    .line 108
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const/4 p0, 0x0

    .line 116
    return-object p0
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 100

    move-object/from16 v0, p0

    iget-byte v1, v0, La/lhf;->a:B

    const v2, 0x7f0a09ea

    const/16 v3, 0xa

    const v4, 0x7f0a0da8

    const v5, 0x7f0a06b9

    const v6, 0x7f0a066e

    const v7, 0x7f0a03e5

    const v8, 0x7f0a01a0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const-string v11, "Missing required view with ID: "

    const/4 v12, 0x0

    packed-switch v1, :pswitch_data_0

    .line 1
    new-instance v1, La/mbk0;

    invoke-direct {v1}, La/mbk0;-><init>()V

    .line 2
    iget-object v2, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v2, La/oer;

    invoke-virtual {v2}, La/oer;->k()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/mer;

    .line 3
    iget-object v4, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v4, La/xzs0;

    invoke-interface {v3, v4}, La/mer;->f(La/xzs0;)La/mer;

    move-result-object v3

    invoke-virtual {v1, v3}, La/mbk0;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1

    .line 4
    :pswitch_0
    invoke-direct {v0}, La/lhf;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 5
    :pswitch_1
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, La/shq;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, La/shq;

    const v2, 0x7f0d065c

    .line 6
    invoke-virtual {v1, v2, v0, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const v0, 0x7f0a118e

    .line 8
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_1

    const v0, 0x7f0a1260

    .line 9
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_1

    .line 10
    new-instance v12, La/zcu0;

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct {v12, v1, v2, v3}, La/zcu0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;)V

    goto :goto_1

    .line 11
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_1
    return-object v12

    .line 13
    :pswitch_2
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, La/bhp;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, La/zgp;

    .line 14
    iget v0, v0, La/zgp;->a:I

    .line 15
    invoke-direct {v2, v0}, La/bhp;-><init>(I)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 17
    :pswitch_3
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, La/m2p;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, La/x2p;

    invoke-direct {v2, v0}, La/m2p;-><init>(La/x2p;)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 19
    :pswitch_4
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, La/wma0;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, La/cp;

    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/upo;

    .line 20
    iget-wide v2, v0, La/upo;->a:J

    .line 21
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, La/wma0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 23
    :pswitch_5
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, La/wma0;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, La/cp;

    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/upo;

    .line 24
    iget-wide v2, v0, La/upo;->a:J

    .line 25
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, La/wma0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 27
    :pswitch_6
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    const v2, 0x7f0d069b

    .line 28
    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v1, 0x7f0a1041

    .line 29
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_2

    .line 30
    new-instance v12, La/ahu0;

    invoke-direct {v12, v0, v2}, La/ahu0;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;Landroid/widget/TextView;)V

    goto :goto_2

    .line 31
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 32
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_2
    return-object v12

    .line 33
    :pswitch_7
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;

    const v2, 0x7f0d0698

    .line 34
    invoke-virtual {v1, v2, v0, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 36
    move-object v0, v1

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    const v2, 0x7f0a08f7

    .line 37
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    if-eqz v3, :cond_3

    const v2, 0x7f0a12c8

    .line 38
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_3

    .line 39
    new-instance v12, La/zgu0;

    invoke-direct {v12, v0, v3}, La/zgu0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;)V

    goto :goto_3

    .line 40
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 41
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_3
    return-object v12

    .line 42
    :pswitch_8
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    const v0, 0x7f0d0190

    .line 43
    invoke-virtual {v1, v0, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 44
    invoke-static {v14, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v0, :cond_8

    .line 45
    invoke-static {v14, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/TextView;

    if-eqz v15, :cond_7

    const v0, 0x7f0a049e

    .line 46
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsGameView;

    if-eqz v16, :cond_6

    .line 47
    invoke-static {v14, v6}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/Button;

    if-eqz v17, :cond_5

    .line 48
    invoke-static {v14, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v0, :cond_4

    .line 49
    invoke-static {v14, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v18

    if-eqz v18, :cond_9

    .line 50
    new-instance v13, La/qhn;

    invoke-direct/range {v13 .. v18}, La/qhn;-><init>(Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;Landroid/widget/TextView;Lorg/xplatform/eastern_nights/presentation/views/EasternNightsGameView;Landroid/widget/Button;Landroid/view/View;)V

    move-object v12, v13

    goto :goto_5

    :cond_4
    move v4, v5

    goto :goto_4

    :cond_5
    move v4, v6

    goto :goto_4

    :cond_6
    move v4, v0

    goto :goto_4

    :cond_7
    move v4, v7

    goto :goto_4

    :cond_8
    move v4, v8

    .line 51
    :cond_9
    :goto_4
    invoke-virtual {v14}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_5
    return-object v12

    .line 53
    :pswitch_9
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;

    const v0, 0x7f0d0172

    .line 54
    invoke-virtual {v1, v0, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 55
    invoke-static {v14, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v0, :cond_e

    .line 56
    invoke-static {v14, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/TextView;

    if-eqz v15, :cond_d

    const v0, 0x7f0a047f

    .line 57
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldGameView;

    if-eqz v16, :cond_c

    .line 58
    invoke-static {v14, v6}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/Button;

    if-eqz v17, :cond_b

    .line 59
    invoke-static {v14, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v0, :cond_a

    .line 60
    invoke-static {v14, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v18

    if-eqz v18, :cond_f

    .line 61
    new-instance v13, La/efl;

    invoke-direct/range {v13 .. v18}, La/efl;-><init>(Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;Landroid/widget/TextView;Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldGameView;Landroid/widget/Button;Landroid/view/View;)V

    move-object v12, v13

    goto :goto_7

    :cond_a
    move v4, v5

    goto :goto_6

    :cond_b
    move v4, v6

    goto :goto_6

    :cond_c
    move v4, v0

    goto :goto_6

    :cond_d
    move v4, v7

    goto :goto_6

    :cond_e
    move v4, v8

    .line 62
    :cond_f
    :goto_6
    invoke-virtual {v14}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_7
    return-object v12

    .line 64
    :pswitch_a
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, La/w6l;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, La/w6l;

    const v0, 0x7f0d016d

    .line 65
    invoke-virtual {v1, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v0, 0x7f0a0094

    .line 66
    invoke-static {v3, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ImageView;

    if-eqz v4, :cond_10

    const v0, 0x7f0a0161

    .line 67
    invoke-static {v3, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_10

    const v0, 0x7f0a06f7

    .line 68
    invoke-static {v3, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/ImageView;

    if-eqz v6, :cond_10

    const v0, 0x7f0a0fcb

    .line 69
    invoke-static {v3, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_10

    .line 70
    new-instance v2, La/x6l;

    invoke-direct/range {v2 .. v7}, La/x6l;-><init>(La/w6l;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    move-object v12, v2

    goto :goto_8

    .line 71
    :cond_10
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 72
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_8
    return-object v12

    .line 73
    :pswitch_b
    iget-object v1, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v1, La/a8z;

    .line 74
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/riu0;

    .line 75
    instance-of v2, v1, La/wmv;

    if-eqz v2, :cond_11

    move-object v12, v1

    check-cast v12, La/wmv;

    :cond_11
    if-eqz v12, :cond_12

    invoke-interface {v12}, La/wmv;->n()La/miu0;

    move-result-object v1

    if-nez v1, :cond_13

    .line 76
    :cond_12
    iget-object v0, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v0, La/ptk;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    move-result-object v1

    :cond_13
    return-object v1

    .line 77
    :pswitch_c
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, La/ffk;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, La/d3d0;

    .line 78
    iget-object v2, v1, La/ffk;->l:La/g45;

    .line 79
    iget-object v2, v2, La/g45;->a:Ljava/lang/Object;

    check-cast v2, La/f6i;

    .line 80
    iget-object v2, v2, La/f6i;->g:Ljava/lang/Object;

    check-cast v2, La/m83;

    .line 81
    iget-object v1, v1, La/ffk;->u:La/p4d0;

    .line 82
    invoke-interface {v2, v1, v0}, La/w83;->a(La/v0;La/d3d0;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 83
    :pswitch_d
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, La/wdk;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 84
    iget-object v2, v1, La/wdk;->b:La/wsy;

    invoke-virtual {v2}, La/wsy;->J()Ljava/util/List;

    move-result-object v2

    .line 85
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_14

    .line 86
    sget-object v12, La/iun;->a:La/iun;

    goto/16 :goto_d

    .line 87
    :cond_14
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v10

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v3, 0x1

    if-ltz v3, :cond_1a

    .line 89
    check-cast v5, La/pzs0;

    const/4 v7, 0x2

    if-nez v0, :cond_15

    move-object v11, v12

    goto :goto_a

    .line 90
    :cond_15
    new-instance v8, La/vdk;

    invoke-direct {v8, v1, v7}, La/vdk;-><init>(La/wdk;B)V

    .line 91
    new-instance v11, La/tfe;

    invoke-direct {v11, v8, v3, v9}, La/tfe;-><init>(Ljava/lang/Object;IB)V

    .line 92
    :goto_a
    invoke-virtual {v5}, La/pzs0;->c()Z

    move-result v3

    if-eqz v3, :cond_16

    sget-object v3, Lkotlin/reflect/KTypeProjection;->c:La/piy;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    sget-object v3, Lkotlin/reflect/KTypeProjection;->d:Lkotlin/reflect/KTypeProjection;

    goto :goto_c

    .line 94
    :cond_16
    new-instance v3, La/wdk;

    invoke-virtual {v5}, La/pzs0;->b()La/wsy;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    invoke-direct {v3, v8, v11, v10}, La/wdk;-><init>(La/wsy;Lkotlin/jvm/functions/Function0;Z)V

    .line 96
    invoke-virtual {v5}, La/pzs0;->a()La/t3u0;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eqz v5, :cond_19

    if-eq v5, v9, :cond_18

    if-ne v5, v7, :cond_17

    .line 97
    sget-object v5, Lkotlin/reflect/KTypeProjection;->c:La/piy;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    new-instance v5, Lkotlin/reflect/KTypeProjection;

    sget-object v7, La/uiy;->c:La/uiy;

    invoke-direct {v5, v3, v7}, Lkotlin/reflect/KTypeProjection;-><init>(La/kiy;La/uiy;)V

    :goto_b
    move-object v3, v5

    goto :goto_c

    .line 99
    :cond_17
    invoke-static {}, La/t9f;->b()V

    goto :goto_d

    .line 100
    :cond_18
    sget-object v5, Lkotlin/reflect/KTypeProjection;->c:La/piy;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    new-instance v5, Lkotlin/reflect/KTypeProjection;

    sget-object v7, La/uiy;->b:La/uiy;

    invoke-direct {v5, v3, v7}, Lkotlin/reflect/KTypeProjection;-><init>(La/kiy;La/uiy;)V

    goto :goto_b

    .line 102
    :cond_19
    sget-object v5, Lkotlin/reflect/KTypeProjection;->c:La/piy;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, La/piy;->a(La/kiy;)Lkotlin/reflect/KTypeProjection;

    move-result-object v3

    .line 103
    :goto_c
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v6

    goto :goto_9

    :cond_1a
    invoke-static {}, La/q3d;->p()V

    throw v12

    :cond_1b
    move-object v12, v4

    :goto_d
    return-object v12

    .line 104
    :pswitch_e
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, La/qck;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 105
    iget-object v2, v1, La/qck;->h:La/ihy;

    .line 106
    iget-object v1, v1, La/qck;->i:Ljava/lang/String;

    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    const-string v3, "<init>"

    .line 110
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1c

    .line 111
    invoke-virtual {v2}, La/ihy;->D()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    goto :goto_e

    :cond_1c
    invoke-static {v0}, La/g950;->e(Ljava/lang/String;)La/g950;

    move-result-object v3

    invoke-virtual {v2, v3}, La/ihy;->F(La/g950;)Ljava/util/Collection;

    move-result-object v3

    .line 112
    :goto_e
    move-object v10, v3

    check-cast v10, Ljava/lang/Iterable;

    .line 113
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 114
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1d
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, La/mer;

    .line 115
    invoke-static {v6}, La/sog0;->c(La/mer;)La/q0x;

    move-result-object v6

    invoke-virtual {v6}, La/q0x;->H()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1d

    .line 116
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 117
    :cond_1e
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-eq v4, v9, :cond_20

    .line 118
    sget-object v14, La/j9x;->m:La/j9x;

    const/16 v15, 0x1e

    const-string v11, "\n"

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v3

    .line 119
    new-instance v4, La/poe;

    .line 120
    const-string v5, "\' (JVM signature: "

    const-string v6, ") not resolved in "

    .line 121
    const-string v7, "Function \'"

    invoke-static {v7, v0, v5, v1, v6}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 122
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 123
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1f

    const-string v1, " no members found"

    goto :goto_10

    :cond_1f
    const-string v1, "\n"

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 124
    :goto_10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 125
    invoke-direct {v4, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 126
    throw v4

    .line 127
    :cond_20
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/mer;

    return-object v0

    .line 128
    :pswitch_f
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, La/ock;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, La/rgy;

    .line 129
    invoke-virtual {v1}, La/ock;->z()La/mp9;

    move-result-object v2

    invoke-interface {v2}, La/kp9;->getTypeParameters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 131
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 132
    check-cast v5, La/hzs0;

    .line 133
    new-instance v6, La/niy;

    invoke-static {v1}, La/fre0;->h0(La/dre0;)La/dre0;

    move-result-object v7

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v6, v7, v5}, La/niy;-><init>(La/oiy;La/hzs0;)V

    .line 134
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 135
    :cond_21
    invoke-interface {v1}, La/qgy;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v4}, La/rgy;->b(Ljava/lang/String;Ljava/util/List;)La/siy;

    move-result-object v0

    .line 136
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_23

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/niy;

    .line 137
    invoke-virtual {v5}, La/niy;->getUpperBounds()Ljava/util/List;

    move-result-object v6

    .line 138
    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v6, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_22

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 140
    check-cast v8, La/kiy;

    .line 141
    invoke-interface {v1}, La/qgy;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v8, v9}, La/siy;->c(La/kiy;Ljava/lang/String;)La/kiy;

    move-result-object v8

    .line 142
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 143
    :cond_22
    iput-object v7, v5, La/niy;->g:Ljava/util/List;

    goto :goto_12

    :cond_23
    return-object v4

    .line 144
    :pswitch_10
    iget-object v1, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v1, La/a8z;

    .line 145
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/riu0;

    .line 146
    instance-of v2, v1, La/wmv;

    if-eqz v2, :cond_24

    move-object v12, v1

    check-cast v12, La/wmv;

    :cond_24
    if-eqz v12, :cond_25

    invoke-interface {v12}, La/wmv;->n()La/miu0;

    move-result-object v1

    if-nez v1, :cond_26

    .line 147
    :cond_25
    iget-object v0, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v0, La/ngj;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    move-result-object v1

    :cond_26
    return-object v1

    .line 148
    :pswitch_11
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;

    const v0, 0x7f0d05be

    .line 149
    invoke-virtual {v1, v0, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v0, 0x7f0a02b7

    .line 150
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v1, :cond_27

    const v0, 0x7f0a056e

    .line 151
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v15

    if-eqz v15, :cond_27

    const v0, 0x7f0a0585

    .line 152
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_27

    const v0, 0x7f0a0586

    .line 153
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Landroid/widget/TextView;

    if-eqz v16, :cond_27

    const v0, 0x7f0a058c

    .line 154
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_27

    const v0, 0x7f0a0594

    .line 155
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_27

    const v0, 0x7f0a0595

    .line 156
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Landroid/widget/TextView;

    if-eqz v17, :cond_27

    const v0, 0x7f0a059a

    .line 157
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_27

    const v0, 0x7f0a059b

    .line 158
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Landroid/widget/TextView;

    if-eqz v18, :cond_27

    const v0, 0x7f0a059c

    .line 159
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_27

    const v0, 0x7f0a059d

    .line 160
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Landroid/widget/TextView;

    if-eqz v19, :cond_27

    const v0, 0x7f0a059e

    .line 161
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v20, v1

    check-cast v20, Landroid/widget/TextView;

    if-eqz v20, :cond_27

    const v0, 0x7f0a05a4

    .line 162
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_27

    const v0, 0x7f0a05a5

    .line 163
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v21, v1

    check-cast v21, Landroid/widget/TextView;

    if-eqz v21, :cond_27

    .line 164
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Landroid/widget/ImageView;

    if-eqz v22, :cond_28

    const v2, 0x7f0a0d02

    .line 165
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v23

    if-eqz v23, :cond_28

    const v2, 0x7f0a0d1b

    .line 166
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_28

    const v2, 0x7f0a0d1c

    .line 167
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Landroid/widget/TextView;

    if-eqz v24, :cond_28

    const v2, 0x7f0a0d22

    .line 168
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_28

    const v2, 0x7f0a0d2a

    .line 169
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_28

    const v2, 0x7f0a0d2b

    .line 170
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v25, v0

    check-cast v25, Landroid/widget/TextView;

    if-eqz v25, :cond_28

    const v2, 0x7f0a0d30

    .line 171
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_28

    const v2, 0x7f0a0d31

    .line 172
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Landroid/widget/TextView;

    if-eqz v26, :cond_28

    const v2, 0x7f0a0d32

    .line 173
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_28

    const v2, 0x7f0a0d33

    .line 174
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Landroid/widget/TextView;

    if-eqz v27, :cond_28

    const v2, 0x7f0a0d34

    .line 175
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v28, v0

    check-cast v28, Landroid/widget/TextView;

    if-eqz v28, :cond_28

    const v2, 0x7f0a0d3a

    .line 176
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_28

    const v2, 0x7f0a0d3b

    .line 177
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v29, v0

    check-cast v29, Landroid/widget/TextView;

    if-eqz v29, :cond_28

    const v2, 0x7f0a0d58

    .line 178
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v30, v0

    check-cast v30, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/SectorView;

    if-eqz v30, :cond_28

    const v2, 0x7f0a0ecb

    .line 179
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v31, v0

    check-cast v31, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    if-eqz v31, :cond_28

    const v2, 0x7f0a1456

    .line 180
    invoke-static {v14, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v32, v0

    check-cast v32, Landroid/widget/TextView;

    if-eqz v32, :cond_28

    .line 181
    new-instance v13, La/i1o0;

    invoke-direct/range {v13 .. v32}, La/i1o0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/SectorView;Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;Landroid/widget/TextView;)V

    move-object v12, v13

    goto :goto_14

    :cond_27
    move v2, v0

    .line 182
    :cond_28
    invoke-virtual {v14}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 183
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_14
    return-object v12

    .line 184
    :pswitch_12
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, La/smh;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 186
    :pswitch_13
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Landroid/app/Application;

    .line 187
    instance-of v2, v1, La/af3;

    if-eqz v2, :cond_29

    check-cast v1, La/af3;

    goto :goto_15

    :cond_29
    move-object v1, v12

    :goto_15
    const-class v2, La/ujh;

    if-eqz v1, :cond_2c

    .line 188
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    move-result-object v1

    .line 189
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/o5d0;

    if-eqz v1, :cond_2a

    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/ze3;

    goto :goto_16

    :cond_2a
    move-object v1, v12

    :goto_16
    instance-of v3, v1, La/ujh;

    if-nez v3, :cond_2b

    move-object v1, v12

    :cond_2b
    check-cast v1, La/ujh;

    if-eqz v1, :cond_2c

    .line 190
    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, La/kkh;

    .line 191
    iget-object v5, v0, La/kkh;->a:Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;

    .line 192
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    iget-object v4, v1, La/ujh;->a:La/oeg0;

    .line 194
    iget-object v6, v1, La/ujh;->b:La/gr00;

    .line 195
    iget-object v3, v1, La/ujh;->c:La/cad;

    .line 196
    iget-object v0, v1, La/ujh;->d:La/pyg;

    .line 197
    iget-object v7, v1, La/ujh;->e:La/qv2;

    .line 198
    iget-object v8, v1, La/ujh;->f:La/h3c;

    .line 199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    new-instance v2, La/zei;

    invoke-direct/range {v2 .. v8}, La/zei;-><init>(La/cad;La/oeg0;Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;La/gr00;La/qv2;La/h3c;)V

    move-object v12, v2

    goto :goto_17

    .line 202
    :cond_2c
    const-string v0, "Cannot create dependency "

    .line 203
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 204
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    :goto_17
    return-object v12

    .line 205
    :pswitch_14
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;

    const v0, 0x7f0d05c5

    .line 206
    invoke-virtual {v1, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v0, 0x7f0a0569

    .line 207
    invoke-static {v3, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2d

    .line 208
    invoke-static {v1}, La/n1o0;->a(Landroid/view/View;)La/n1o0;

    move-result-object v4

    const v0, 0x7f0a05bd

    .line 209
    invoke-static {v3, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2d

    .line 210
    invoke-static {v1}, La/n1o0;->a(Landroid/view/View;)La/n1o0;

    move-result-object v5

    const v0, 0x7f0a0609

    .line 211
    invoke-static {v3, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2d

    .line 212
    invoke-static {v1}, La/n1o0;->a(Landroid/view/View;)La/n1o0;

    move-result-object v6

    const v0, 0x7f0a0cfd

    .line 213
    invoke-static {v3, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2d

    .line 214
    invoke-static {v1}, La/n1o0;->a(Landroid/view/View;)La/n1o0;

    move-result-object v7

    const v0, 0x7f0a0e1a

    .line 215
    invoke-static {v3, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2d

    .line 216
    invoke-static {v1}, La/n1o0;->a(Landroid/view/View;)La/n1o0;

    move-result-object v8

    const v0, 0x7f0a0f93

    .line 217
    invoke-static {v3, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2d

    .line 218
    invoke-static {v1}, La/n1o0;->a(Landroid/view/View;)La/n1o0;

    move-result-object v9

    .line 219
    new-instance v2, La/o1o0;

    invoke-direct/range {v2 .. v9}, La/o1o0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;La/n1o0;La/n1o0;La/n1o0;La/n1o0;La/n1o0;La/n1o0;)V

    move-object v12, v2

    goto :goto_18

    .line 220
    :cond_2d
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 221
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_18
    return-object v12

    .line 222
    :pswitch_15
    iget-object v1, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v1, La/a8z;

    .line 223
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/riu0;

    .line 224
    instance-of v2, v1, La/wmv;

    if-eqz v2, :cond_2e

    move-object v12, v1

    check-cast v12, La/wmv;

    :cond_2e
    if-eqz v12, :cond_2f

    invoke-interface {v12}, La/wmv;->n()La/miu0;

    move-result-object v1

    if-nez v1, :cond_30

    .line 225
    :cond_2f
    iget-object v0, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v0, La/y4h;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    move-result-object v1

    :cond_30
    return-object v1

    .line 226
    :pswitch_16
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;

    const v0, 0x7f0d05c3

    .line 227
    invoke-virtual {v1, v0, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v0, 0x7f0a03ae

    .line 228
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Landroid/widget/TextView;

    if-eqz v15, :cond_38

    const v0, 0x7f0a03af

    .line 229
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Landroid/widget/TextView;

    if-eqz v16, :cond_38

    const v0, 0x7f0a03b0

    .line 230
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Landroid/widget/TextView;

    if-eqz v17, :cond_38

    const v0, 0x7f0a0499

    .line 231
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakCardDeckView;

    if-eqz v18, :cond_38

    const v0, 0x7f0a0576

    .line 232
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_38

    const v0, 0x7f0a0b56

    .line 233
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;

    if-eqz v5, :cond_37

    const v2, 0x7f0a0b60

    .line 234
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_36

    const v9, 0x7f0a0b6a

    .line 235
    invoke-static {v1, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_35

    .line 236
    new-instance v3, La/k1o0;

    move-object v4, v1

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, La/k1o0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;Landroid/widget/TextView;Landroid/widget/TextView;B)V

    const v1, 0x7f0a07fe

    .line 237
    invoke-static {v14, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    move-object/from16 v20, v4

    check-cast v20, Landroid/widget/ImageView;

    if-eqz v20, :cond_34

    const v1, 0x7f0a0971

    .line 238
    invoke-static {v14, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    const v1, 0x7f0a0a06

    .line 239
    invoke-static {v14, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    move-object/from16 v21, v4

    check-cast v21, Landroid/widget/TextView;

    if-eqz v21, :cond_34

    const v1, 0x7f0a0b48

    .line 240
    invoke-static {v14, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    move-object/from16 v22, v4

    check-cast v22, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;

    if-eqz v22, :cond_34

    const v1, 0x7f0a0d0c

    .line 241
    invoke-static {v14, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_34

    .line 242
    invoke-static {v4, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v25, v1

    check-cast v25, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;

    if-eqz v25, :cond_33

    .line 243
    invoke-static {v4, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Landroid/widget/TextView;

    if-eqz v26, :cond_32

    .line 244
    invoke-static {v4, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Landroid/widget/TextView;

    if-eqz v27, :cond_31

    .line 245
    new-instance v23, La/k1o0;

    move-object/from16 v24, v4

    check-cast v24, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v28, 0x1

    invoke-direct/range {v23 .. v28}, La/k1o0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 246
    new-instance v13, La/m1o0;

    move-object/from16 v19, v3

    invoke-direct/range {v13 .. v23}, La/m1o0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakCardDeckView;La/k1o0;Landroid/widget/ImageView;Landroid/widget/TextView;Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;La/k1o0;)V

    move-object v12, v13

    goto :goto_1c

    :cond_31
    move v0, v9

    goto :goto_19

    :cond_32
    move v0, v2

    .line 247
    :cond_33
    :goto_19
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 248
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    goto :goto_1c

    :cond_34
    move v0, v1

    goto :goto_1b

    :cond_35
    move v0, v9

    goto :goto_1a

    :cond_36
    move v0, v2

    .line 249
    :cond_37
    :goto_1a
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 250
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    goto :goto_1c

    .line 251
    :cond_38
    :goto_1b
    invoke-virtual {v14}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 252
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_1c
    return-object v12

    .line 253
    :pswitch_17
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, La/ejg;

    .line 254
    iget-object v0, v0, La/ejg;->a:La/ygq0;

    .line 255
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 257
    :pswitch_18
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;

    const v2, 0x7f0d00a7

    .line 258
    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v1, 0x7f0a0873

    .line 259
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v2, :cond_39

    const v1, 0x7f0a0894

    .line 260
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    if-eqz v3, :cond_39

    const v1, 0x7f0a0d78

    .line 261
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lorg/xplatform/uikit/components/separator/DsSeparator;

    if-eqz v4, :cond_39

    const v1, 0x7f0a10db

    .line 262
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_39

    .line 263
    new-instance v12, La/b6g;

    invoke-direct {v12, v0, v2, v3, v4}, La/b6g;-><init>(Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    goto :goto_1d

    .line 264
    :cond_39
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 265
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_1d
    return-object v12

    .line 266
    :pswitch_19
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;

    const v0, 0x7f0d00cf

    .line 267
    invoke-virtual {v1, v0, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v0, 0x7f0a0786

    .line 268
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Landroid/widget/ImageView;

    if-eqz v15, :cond_3a

    const v0, 0x7f0a0787

    .line 269
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Landroid/widget/ImageView;

    if-eqz v16, :cond_3a

    const v0, 0x7f0a0788

    .line 270
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Landroid/widget/ImageView;

    if-eqz v17, :cond_3a

    const v0, 0x7f0a0789

    .line 271
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Landroid/widget/ImageView;

    if-eqz v18, :cond_3a

    const v0, 0x7f0a078a

    .line 272
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Landroid/widget/ImageView;

    if-eqz v19, :cond_3a

    const v0, 0x7f0a078b

    .line 273
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v20, v1

    check-cast v20, Landroid/widget/ImageView;

    if-eqz v20, :cond_3a

    const v0, 0x7f0a078c

    .line 274
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v21, v1

    check-cast v21, Landroid/widget/ImageView;

    if-eqz v21, :cond_3a

    const v0, 0x7f0a078d

    .line 275
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v22, v1

    check-cast v22, Landroid/widget/ImageView;

    if-eqz v22, :cond_3a

    const v0, 0x7f0a078e

    .line 276
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v23, v1

    check-cast v23, Landroid/widget/ImageView;

    if-eqz v23, :cond_3a

    const v0, 0x7f0a078f

    .line 277
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v24, v1

    check-cast v24, Landroid/widget/ImageView;

    if-eqz v24, :cond_3a

    const v0, 0x7f0a0790

    .line 278
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v25, v1

    check-cast v25, Landroid/widget/ImageView;

    if-eqz v25, :cond_3a

    const v0, 0x7f0a0791

    .line 279
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v26, v1

    check-cast v26, Landroid/widget/ImageView;

    if-eqz v26, :cond_3a

    const v0, 0x7f0a0793

    .line 280
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v27, v1

    check-cast v27, Landroid/widget/ImageView;

    if-eqz v27, :cond_3a

    const v0, 0x7f0a0794

    .line 281
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v28, v1

    check-cast v28, Landroid/widget/ImageView;

    if-eqz v28, :cond_3a

    const v0, 0x7f0a0795

    .line 282
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v29, v1

    check-cast v29, Landroid/widget/ImageView;

    if-eqz v29, :cond_3a

    const v0, 0x7f0a0796

    .line 283
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v30, v1

    check-cast v30, Landroid/widget/ImageView;

    if-eqz v30, :cond_3a

    const v0, 0x7f0a0797

    .line 284
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v31, v1

    check-cast v31, Landroid/widget/ImageView;

    if-eqz v31, :cond_3a

    const v0, 0x7f0a0798

    .line 285
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v32, v1

    check-cast v32, Landroid/widget/ImageView;

    if-eqz v32, :cond_3a

    const v0, 0x7f0a07a1

    .line 286
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v33, v1

    check-cast v33, Landroid/widget/ImageView;

    if-eqz v33, :cond_3a

    const v0, 0x7f0a07a2

    .line 287
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v34, v1

    check-cast v34, Landroid/widget/ImageView;

    if-eqz v34, :cond_3a

    const v0, 0x7f0a07a3

    .line 288
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v35, v1

    check-cast v35, Landroid/widget/ImageView;

    if-eqz v35, :cond_3a

    const v0, 0x7f0a07a4

    .line 289
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v36, v1

    check-cast v36, Landroid/widget/ImageView;

    if-eqz v36, :cond_3a

    const v0, 0x7f0a07a5

    .line 290
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v37, v1

    check-cast v37, Landroid/widget/ImageView;

    if-eqz v37, :cond_3a

    const v0, 0x7f0a07a6

    .line 291
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v38, v1

    check-cast v38, Landroid/widget/ImageView;

    if-eqz v38, :cond_3a

    const v0, 0x7f0a07aa

    .line 292
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v39, v1

    check-cast v39, Landroid/widget/ImageView;

    if-eqz v39, :cond_3a

    const v0, 0x7f0a07ab

    .line 293
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v40, v1

    check-cast v40, Landroid/widget/ImageView;

    if-eqz v40, :cond_3a

    const v0, 0x7f0a07ac

    .line 294
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v41, v1

    check-cast v41, Landroid/widget/ImageView;

    if-eqz v41, :cond_3a

    const v0, 0x7f0a07ad

    .line 295
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v42, v1

    check-cast v42, Landroid/widget/ImageView;

    if-eqz v42, :cond_3a

    const v0, 0x7f0a07ae

    .line 296
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v43, v1

    check-cast v43, Landroid/widget/ImageView;

    if-eqz v43, :cond_3a

    const v0, 0x7f0a07af

    .line 297
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v44, v1

    check-cast v44, Landroid/widget/ImageView;

    if-eqz v44, :cond_3a

    const v0, 0x7f0a0847

    .line 298
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v45, v1

    check-cast v45, Landroid/widget/ImageView;

    if-eqz v45, :cond_3a

    const v0, 0x7f0a0856

    .line 299
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v46, v1

    check-cast v46, Landroid/widget/ImageView;

    if-eqz v46, :cond_3a

    const v0, 0x7f0a0858

    .line 300
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v47, v1

    check-cast v47, Landroid/widget/ImageView;

    if-eqz v47, :cond_3a

    const v0, 0x7f0a08a9

    .line 301
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v48, v1

    check-cast v48, Landroid/widget/ImageView;

    if-eqz v48, :cond_3a

    const v0, 0x7f0a08dd

    .line 302
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v49, v1

    check-cast v49, Landroid/widget/ImageView;

    if-eqz v49, :cond_3a

    const v0, 0x7f0a0f0a

    .line 303
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v50, v1

    check-cast v50, Landroid/widget/ImageView;

    if-eqz v50, :cond_3a

    const v0, 0x7f0a104a

    .line 304
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v51, v1

    check-cast v51, Landroid/widget/TextView;

    if-eqz v51, :cond_3a

    const v0, 0x7f0a1050

    .line 305
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v52, v1

    check-cast v52, Landroid/widget/TextView;

    if-eqz v52, :cond_3a

    const v0, 0x7f0a10de

    .line 306
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v53, v1

    check-cast v53, Landroid/widget/TextView;

    if-eqz v53, :cond_3a

    const v0, 0x7f0a110d

    .line 307
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v54, v1

    check-cast v54, Landroid/widget/TextView;

    if-eqz v54, :cond_3a

    const v0, 0x7f0a110e

    .line 308
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v55, v1

    check-cast v55, Landroid/widget/TextView;

    if-eqz v55, :cond_3a

    const v0, 0x7f0a1111

    .line 309
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v56, v1

    check-cast v56, Landroid/widget/TextView;

    if-eqz v56, :cond_3a

    const v0, 0x7f0a1114

    .line 310
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v57, v1

    check-cast v57, Landroid/widget/TextView;

    if-eqz v57, :cond_3a

    const v0, 0x7f0a1115

    .line 311
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v58, v1

    check-cast v58, Landroid/widget/TextView;

    if-eqz v58, :cond_3a

    const v0, 0x7f0a1116

    .line 312
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v59, v1

    check-cast v59, Landroid/widget/TextView;

    if-eqz v59, :cond_3a

    const v0, 0x7f0a1117

    .line 313
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v60, v1

    check-cast v60, Landroid/widget/TextView;

    if-eqz v60, :cond_3a

    const v0, 0x7f0a1129

    .line 314
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v61, v1

    check-cast v61, Landroid/widget/TextView;

    if-eqz v61, :cond_3a

    const v0, 0x7f0a112a

    .line 315
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v62, v1

    check-cast v62, Landroid/widget/TextView;

    if-eqz v62, :cond_3a

    const v0, 0x7f0a112b

    .line 316
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v63, v1

    check-cast v63, Landroid/widget/TextView;

    if-eqz v63, :cond_3a

    const v0, 0x7f0a112c

    .line 317
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v64, v1

    check-cast v64, Landroid/widget/TextView;

    if-eqz v64, :cond_3a

    const v0, 0x7f0a112d

    .line 318
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v65, v1

    check-cast v65, Landroid/widget/TextView;

    if-eqz v65, :cond_3a

    const v0, 0x7f0a112e

    .line 319
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v66, v1

    check-cast v66, Landroid/widget/TextView;

    if-eqz v66, :cond_3a

    const v0, 0x7f0a112f

    .line 320
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v67, v1

    check-cast v67, Landroid/widget/TextView;

    if-eqz v67, :cond_3a

    const v0, 0x7f0a1131

    .line 321
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v68, v1

    check-cast v68, Landroid/widget/TextView;

    if-eqz v68, :cond_3a

    const v0, 0x7f0a1132

    .line 322
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v69, v1

    check-cast v69, Landroid/widget/TextView;

    if-eqz v69, :cond_3a

    const v0, 0x7f0a1133

    .line 323
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v70, v1

    check-cast v70, Landroid/widget/TextView;

    if-eqz v70, :cond_3a

    const v0, 0x7f0a1134

    .line 324
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v71, v1

    check-cast v71, Landroid/widget/TextView;

    if-eqz v71, :cond_3a

    const v0, 0x7f0a1135

    .line 325
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v72, v1

    check-cast v72, Landroid/widget/TextView;

    if-eqz v72, :cond_3a

    const v0, 0x7f0a1136

    .line 326
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v73, v1

    check-cast v73, Landroid/widget/TextView;

    if-eqz v73, :cond_3a

    const v0, 0x7f0a1137

    .line 327
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v74, v1

    check-cast v74, Landroid/widget/TextView;

    if-eqz v74, :cond_3a

    const v0, 0x7f0a1159

    .line 328
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v75, v1

    check-cast v75, Landroid/widget/TextView;

    if-eqz v75, :cond_3a

    const v0, 0x7f0a1164

    .line 329
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v76, v1

    check-cast v76, Landroid/widget/TextView;

    if-eqz v76, :cond_3a

    const v0, 0x7f0a117e

    .line 330
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v77, v1

    check-cast v77, Landroid/widget/TextView;

    if-eqz v77, :cond_3a

    const v0, 0x7f0a11f9

    .line 331
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v78, v1

    check-cast v78, Landroid/widget/TextView;

    if-eqz v78, :cond_3a

    const v0, 0x7f0a11fa

    .line 332
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v79, v1

    check-cast v79, Landroid/widget/TextView;

    if-eqz v79, :cond_3a

    const v0, 0x7f0a11fd

    .line 333
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v80, v1

    check-cast v80, Landroid/widget/TextView;

    if-eqz v80, :cond_3a

    const v0, 0x7f0a1200

    .line 334
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v81, v1

    check-cast v81, Landroid/widget/TextView;

    if-eqz v81, :cond_3a

    const v0, 0x7f0a1201

    .line 335
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v82, v1

    check-cast v82, Landroid/widget/TextView;

    if-eqz v82, :cond_3a

    const v0, 0x7f0a1202

    .line 336
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v83, v1

    check-cast v83, Landroid/widget/TextView;

    if-eqz v83, :cond_3a

    const v0, 0x7f0a1203

    .line 337
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v84, v1

    check-cast v84, Landroid/widget/TextView;

    if-eqz v84, :cond_3a

    const v0, 0x7f0a123d

    .line 338
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v85, v1

    check-cast v85, Landroid/widget/TextView;

    if-eqz v85, :cond_3a

    const v0, 0x7f0a124f

    .line 339
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v86, v1

    check-cast v86, Landroid/widget/TextView;

    if-eqz v86, :cond_3a

    const v0, 0x7f0a1250

    .line 340
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v87, v1

    check-cast v87, Landroid/widget/TextView;

    if-eqz v87, :cond_3a

    const v0, 0x7f0a1251

    .line 341
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v88, v1

    check-cast v88, Landroid/widget/TextView;

    if-eqz v88, :cond_3a

    const v0, 0x7f0a1252

    .line 342
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v89, v1

    check-cast v89, Landroid/widget/TextView;

    if-eqz v89, :cond_3a

    const v0, 0x7f0a1253

    .line 343
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v90, v1

    check-cast v90, Landroid/widget/TextView;

    if-eqz v90, :cond_3a

    const v0, 0x7f0a1254

    .line 344
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v91, v1

    check-cast v91, Landroid/widget/TextView;

    if-eqz v91, :cond_3a

    const v0, 0x7f0a1255

    .line 345
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v92, v1

    check-cast v92, Landroid/widget/TextView;

    if-eqz v92, :cond_3a

    const v0, 0x7f0a1269

    .line 346
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v93, v1

    check-cast v93, Landroid/widget/TextView;

    if-eqz v93, :cond_3a

    const v0, 0x7f0a1379

    .line 347
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v94

    if-eqz v94, :cond_3a

    const v0, 0x7f0a137c

    .line 348
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v95

    if-eqz v95, :cond_3a

    const v0, 0x7f0a137e

    .line 349
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v96

    if-eqz v96, :cond_3a

    const v0, 0x7f0a1381

    .line 350
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v97

    if-eqz v97, :cond_3a

    const v0, 0x7f0a139d

    .line 351
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v98

    if-eqz v98, :cond_3a

    const v0, 0x7f0a13b5

    .line 352
    invoke-static {v14, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v99

    if-eqz v99, :cond_3a

    .line 353
    new-instance v13, La/fth;

    invoke-direct/range {v13 .. v99}, La/fth;-><init>(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    move-object v12, v13

    goto :goto_1e

    .line 354
    :cond_3a
    invoke-virtual {v14}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 355
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_1e
    return-object v12

    .line 356
    :pswitch_1a
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;

    const v3, 0x7f0d00c9

    .line 357
    invoke-virtual {v1, v3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 358
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_3b

    .line 359
    new-instance v12, La/zsh;

    invoke-direct {v12, v0, v1}, La/zsh;-><init>(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;Landroid/widget/ImageView;)V

    goto :goto_1f

    .line 360
    :cond_3b
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 361
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_1f
    return-object v12

    .line 362
    :pswitch_1b
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/game_log/bomb/Cs2GameLogBombTimerView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/game_log/bomb/Cs2GameLogBombTimerView;

    const v2, 0x7f0d00c4

    .line 363
    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v1, 0x7f0a016f

    .line 364
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v2, :cond_3c

    const v1, 0x7f0a0173

    .line 365
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_3c

    .line 366
    new-instance v12, La/ush;

    invoke-direct {v12, v0, v2, v3}, La/ush;-><init>(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/game_log/bomb/Cs2GameLogBombTimerView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    goto :goto_20

    .line 367
    :cond_3c
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 368
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_20
    return-object v12

    .line 369
    :pswitch_1c
    iget-object v1, v0, La/lhf;->b:Ljava/lang/Object;

    check-cast v1, Lorg/xplatform/crystal/presentation/views/CrystalStatusView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/lhf;->c:Ljava/lang/Object;

    check-cast v0, Lorg/xplatform/crystal/presentation/views/CrystalStatusView;

    const v2, 0x7f0d00a1

    .line 370
    invoke-virtual {v1, v2, v0, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 371
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const v0, 0x7f0a00f9

    .line 372
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v2, :cond_3d

    const v0, 0x7f0a03e7

    .line 373
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_3d

    const v0, 0x7f0a0be9

    .line 374
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v3, :cond_3d

    .line 375
    new-instance v12, La/mhf;

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct {v12, v1, v2, v3}, La/mhf;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;)V

    goto :goto_21

    .line 376
    :cond_3d
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 377
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    :goto_21
    return-object v12

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
