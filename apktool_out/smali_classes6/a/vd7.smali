.class public final La/vd7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroid/view/ViewGroup;

.field public final c:Landroid/view/View;

.field public final d:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;B)V
    .locals 0

    .line 16
    iput-byte p4, p0, La/vd7;->a:B

    iput-object p1, p0, La/vd7;->b:Landroid/view/ViewGroup;

    iput-object p2, p0, La/vd7;->c:Landroid/view/View;

    iput-object p3, p0, La/vd7;->d:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/FrameLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V
    .locals 0

    .line 15
    iput-byte p5, p0, La/vd7;->a:B

    iput-object p1, p0, La/vd7;->b:Landroid/view/ViewGroup;

    iput-object p3, p0, La/vd7;->c:Landroid/view/View;

    iput-object p4, p0, La/vd7;->d:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 0

    const/16 p4, 0x17

    iput-byte p4, p0, La/vd7;->a:B

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, La/vd7;->b:Landroid/view/ViewGroup;

    .line 19
    iput-object p2, p0, La/vd7;->c:Landroid/view/View;

    .line 20
    iput-object p3, p0, La/vd7;->d:Landroid/view/View;

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;Lorg/xplatform/uikit/components/account_info/DsAccountInfo;Lorg/xplatform/uikit/components/buttons/DsButton;)V
    .locals 1

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    iput-byte v0, p0, La/vd7;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/vd7;->b:Landroid/view/ViewGroup;

    .line 9
    .line 10
    iput-object p2, p0, La/vd7;->d:Landroid/view/View;

    .line 11
    .line 12
    iput-object p3, p0, La/vd7;->c:Landroid/view/View;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Landroid/view/View;)La/vd7;
    .locals 4

    .line 1
    const v0, 0x7f0a0c70

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const v0, 0x7f0a0c71

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoBiletNumbersView;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    new-instance v0, La/vd7;

    .line 24
    .line 25
    check-cast p0, Landroid/widget/LinearLayout;

    .line 26
    .line 27
    const/16 v3, 0x18

    .line 28
    .line 29
    invoke-direct {v0, p0, v1, v2, v3}, La/vd7;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;B)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v0, "Missing required view with ID: "

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method

.method public static b(Landroid/view/View;)La/vd7;
    .locals 4

    .line 1
    const v0, 0x7f0a08c8

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const v0, 0x7f0a1243

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Landroid/widget/TextView;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    new-instance v0, La/vd7;

    .line 24
    .line 25
    check-cast p0, Landroid/widget/LinearLayout;

    .line 26
    .line 27
    const/16 v3, 0x19

    .line 28
    .line 29
    invoke-direct {v0, p0, v1, v2, v3}, La/vd7;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;B)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v0, "Missing required view with ID: "

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vd7;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vd7;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_1
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_2
    check-cast p0, Landroid/widget/LinearLayout;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_3
    check-cast p0, Landroid/widget/LinearLayout;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_4
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_5
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_6
    check-cast p0, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_7
    check-cast p0, Landroid/widget/LinearLayout;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_8
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_9
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/motion/AppBarMotionLayout;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_a
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_b
    check-cast p0, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_c
    check-cast p0, Lorg/xplatform/uikit/components/header/Header;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_d
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_e
    check-cast p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSingleTeam;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_f
    check-cast p0, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoLive;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_10
    check-cast p0, Lorg/xplatform/uikit_sport/eventcard/info/EventCardInfoFavorites;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_11
    check-cast p0, La/zao;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_12
    check-cast p0, Lorg/xplatform/uikit/components/upload_documents/DsDocumentStatus;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_13
    check-cast p0, La/j7l;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_14
    check-cast p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarWeekView;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_15
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_16
    check-cast p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_17
    check-cast p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightIconAndButton;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_18
    check-cast p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDropAndButton;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_19
    check-cast p0, Landroid/widget/FrameLayout;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_1a
    check-cast p0, La/o3b;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_1b
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
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
