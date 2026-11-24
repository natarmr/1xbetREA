.class public final Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic B:I


# instance fields
.field public final A:La/n0o0;

.field public final q:La/a8z;

.field public final r:La/a8z;

.field public final s:La/a8z;

.field public final t:La/n0o0;

.field public u:La/hbk0;

.field public v:I

.field public w:La/ah3;

.field public final x:La/n0o0;

.field public final y:La/n0o0;

.field public final z:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance p2, La/ch3;

    .line 14
    .line 15
    invoke-direct {p2, p0, p3}, La/ch3;-><init>(Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;B)V

    .line 16
    .line 17
    .line 18
    sget-object p3, La/wez;->b:La/wez;

    .line 19
    .line 20
    invoke-static {p3, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->q:La/a8z;

    .line 25
    .line 26
    new-instance p2, La/ch3;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {p2, p0, v1}, La/ch3;-><init>(Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p3, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->r:La/a8z;

    .line 37
    .line 38
    new-instance p2, La/ch3;

    .line 39
    .line 40
    invoke-direct {p2, p0, v0}, La/ch3;-><init>(Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p3, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iput-object p2, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->s:La/a8z;

    .line 48
    .line 49
    new-instance p2, La/yg3;

    .line 50
    .line 51
    const/4 p3, 0x4

    .line 52
    invoke-direct {p2, p1, p3}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->t:La/n0o0;

    .line 60
    .line 61
    const/4 p1, -0x1

    .line 62
    iput p1, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->v:I

    .line 63
    .line 64
    new-instance p1, La/ch3;

    .line 65
    .line 66
    const/4 p2, 0x3

    .line 67
    invoke-direct {p1, p0, p2}, La/ch3;-><init>(Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->x:La/n0o0;

    .line 75
    .line 76
    new-instance p1, La/ch3;

    .line 77
    .line 78
    invoke-direct {p1, p0, p3}, La/ch3;-><init>(Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->y:La/n0o0;

    .line 86
    .line 87
    new-instance p1, La/ch3;

    .line 88
    .line 89
    const/4 p2, 0x5

    .line 90
    invoke-direct {p1, p0, p2}, La/ch3;-><init>(Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->z:La/n0o0;

    .line 98
    .line 99
    new-instance p1, La/ch3;

    .line 100
    .line 101
    const/4 p2, 0x6

    .line 102
    invoke-direct {p1, p0, p2}, La/ch3;-><init>(Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p1, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->A:La/n0o0;

    .line 110
    .line 111
    return-void
.end method

.method private final getAppLogo()Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->A:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getAppStartContentFacade()La/hg3;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/hg3;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getAppVersion()Lorg/xplatform/app_start/impl/presentation/view/content/version/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->x:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getBlockOverlay()La/dg3;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->s:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/dg3;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getLoader()Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->z:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getPartner()Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->y:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getSmartBackgroundInflater()La/abk0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->r:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/abk0;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final setBottomContentTranslationY(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->w:La/ah3;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v2, La/dh3;->a:[I

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    aget v0, v2, v0

    .line 15
    .line 16
    :goto_0
    if-eq v0, v1, :cond_a

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-eq v0, v1, :cond_8

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    if-eq v0, v1, :cond_a

    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    if-eq v0, v1, :cond_5

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    if-eq v0, v1, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    :goto_1
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getAppVersion()Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getPartner()Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 54
    .line 55
    .line 56
    :cond_4
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getLoader()Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-eqz p0, :cond_e

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_5
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getAppVersion()Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_6

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 73
    .line 74
    .line 75
    :cond_6
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getPartner()Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz v0, :cond_7

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 82
    .line 83
    .line 84
    :cond_7
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getPartner()Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-eqz v0, :cond_e

    .line 89
    .line 90
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getLoader()Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-eqz p0, :cond_e

    .line 95
    .line 96
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_8
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getAppVersion()Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_9

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 107
    .line 108
    .line 109
    :cond_9
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getPartner()Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    if-eqz p0, :cond_e

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_a
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getAppVersion()Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_b

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 126
    .line 127
    .line 128
    :cond_b
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getPartner()Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-eqz v0, :cond_c

    .line 133
    .line 134
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 135
    .line 136
    .line 137
    :cond_c
    iget-object v0, p0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->t:La/n0o0;

    .line 138
    .line 139
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_e

    .line 150
    .line 151
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getLoader()Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-eqz v0, :cond_d

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 158
    .line 159
    .line 160
    :cond_d
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getAppLogo()Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    if-eqz p0, :cond_e

    .line 165
    .line 166
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 167
    .line 168
    .line 169
    :cond_e
    return-void
.end method

.method public final u(La/nh3;La/qg3;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, v1, La/nh3;->b:La/ig3;

    .line 11
    .line 12
    iget-object v1, v1, La/nh3;->a:La/hbk0;

    .line 13
    .line 14
    iget-object v4, v0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->u:La/hbk0;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getSmartBackgroundInflater()La/abk0;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4, v1, v2}, La/abk0;->a(La/hbk0;Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->u:La/hbk0;

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_0
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_b

    .line 35
    .line 36
    iput-object v1, v0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->u:La/hbk0;

    .line 37
    .line 38
    instance-of v4, v1, La/gbk0;

    .line 39
    .line 40
    const v7, 0x7f0a0e27

    .line 41
    .line 42
    .line 43
    const v8, 0x7f0a0e2a

    .line 44
    .line 45
    .line 46
    if-eqz v4, :cond_6

    .line 47
    .line 48
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-eqz v4, :cond_4

    .line 53
    .line 54
    instance-of v8, v4, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;

    .line 55
    .line 56
    if-eqz v8, :cond_1

    .line 57
    .line 58
    check-cast v4, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/4 v4, 0x0

    .line 62
    :goto_0
    if-eqz v4, :cond_2

    .line 63
    .line 64
    move-object v8, v1

    .line 65
    check-cast v8, La/gbk0;

    .line 66
    .line 67
    iget-object v9, v8, La/gbk0;->b:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v8, v8, La/gbk0;->c:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v4, v9, v8}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    if-eqz v4, :cond_3

    .line 75
    .line 76
    invoke-virtual {v4}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->e()V

    .line 77
    .line 78
    .line 79
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    const/4 v4, 0x0

    .line 83
    :goto_1
    if-nez v4, :cond_b

    .line 84
    .line 85
    :cond_4
    new-instance v4, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-direct {v4, v8}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    if-eqz v7, :cond_5

    .line 105
    .line 106
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    check-cast v1, La/gbk0;

    .line 110
    .line 111
    iget-object v7, v1, La/gbk0;->b:Ljava/lang/String;

    .line 112
    .line 113
    iget-object v1, v1, La/gbk0;->c:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v4, v7, v1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->e()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, v2}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->setOnPlayerReadyListener(Lkotlin/jvm/functions/Function0;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    instance-of v2, v1, La/bbk0;

    .line 129
    .line 130
    if-eqz v2, :cond_b

    .line 131
    .line 132
    invoke-virtual {v0, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    if-eqz v2, :cond_9

    .line 137
    .line 138
    instance-of v4, v2, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;

    .line 139
    .line 140
    if-eqz v4, :cond_7

    .line 141
    .line 142
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_7
    const/4 v2, 0x0

    .line 146
    :goto_2
    if-eqz v2, :cond_8

    .line 147
    .line 148
    move-object v4, v1

    .line 149
    check-cast v4, La/bbk0;

    .line 150
    .line 151
    iget-object v4, v4, La/bbk0;->b:La/y0x;

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->setImageParams(La/y0x;)V

    .line 154
    .line 155
    .line 156
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_8
    const/4 v2, 0x0

    .line 160
    :goto_3
    if-nez v2, :cond_b

    .line 161
    .line 162
    :cond_9
    new-instance v2, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;

    .line 163
    .line 164
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-direct {v2, v4}, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 175
    .line 176
    .line 177
    check-cast v1, La/bbk0;

    .line 178
    .line 179
    iget-object v1, v1, La/bbk0;->b:La/y0x;

    .line 180
    .line 181
    invoke-virtual {v2, v1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->setImageParams(La/y0x;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    if-eqz v1, :cond_a

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 191
    .line 192
    .line 193
    :cond_a
    invoke-virtual {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 194
    .line 195
    .line 196
    :cond_b
    :goto_4
    iget-object v1, v0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->w:La/ah3;

    .line 197
    .line 198
    iget-object v2, v3, La/ig3;->b:La/ah3;

    .line 199
    .line 200
    if-eq v1, v2, :cond_c

    .line 201
    .line 202
    iput-object v2, v0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->w:La/ah3;

    .line 203
    .line 204
    :cond_c
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getAppStartContentFacade()La/hg3;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    iget-object v0, v0, La/hg3;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 212
    .line 213
    iget-object v1, v3, La/ig3;->e:La/dx00;

    .line 214
    .line 215
    iget-object v2, v3, La/ig3;->a:Ljava/lang/String;

    .line 216
    .line 217
    iget-object v4, v3, La/ig3;->c:La/wg3;

    .line 218
    .line 219
    iget-object v7, v3, La/ig3;->d:La/ix80;

    .line 220
    .line 221
    const v8, 0x7f0a00b6

    .line 222
    .line 223
    .line 224
    if-eqz v1, :cond_d

    .line 225
    .line 226
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    check-cast v9, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 231
    .line 232
    if-eqz v9, :cond_d

    .line 233
    .line 234
    invoke-virtual {v9, v1}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setContent(La/dx00;)V

    .line 235
    .line 236
    .line 237
    :cond_d
    const v9, 0x7f0a0b13

    .line 238
    .line 239
    .line 240
    if-eqz v7, :cond_e

    .line 241
    .line 242
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    check-cast v10, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 247
    .line 248
    if-eqz v10, :cond_e

    .line 249
    .line 250
    invoke-virtual {v10, v7}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setContent(La/ix80;)V

    .line 251
    .line 252
    .line 253
    :cond_e
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    const v11, 0x7f0a00b7

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v11}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    if-nez v12, :cond_f

    .line 265
    .line 266
    new-instance v12, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 267
    .line 268
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-direct {v12, v13}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;-><init>(Landroid/content/Context;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v10, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    :cond_f
    const v12, 0x7f0a09b7

    .line 282
    .line 283
    .line 284
    if-eqz v4, :cond_10

    .line 285
    .line 286
    invoke-virtual {v0, v12}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    if-nez v13, :cond_10

    .line 291
    .line 292
    new-instance v13, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 293
    .line 294
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 295
    .line 296
    .line 297
    move-result-object v14

    .line 298
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-direct {v13, v14}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;-><init>(Landroid/content/Context;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v10, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    :cond_10
    if-eqz v1, :cond_11

    .line 308
    .line 309
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 310
    .line 311
    .line 312
    move-result-object v13

    .line 313
    if-nez v13, :cond_11

    .line 314
    .line 315
    new-instance v13, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 316
    .line 317
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 318
    .line 319
    .line 320
    move-result-object v14

    .line 321
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-direct {v13, v14}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;-><init>(Landroid/content/Context;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v10, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :cond_11
    if-eqz v7, :cond_12

    .line 331
    .line 332
    invoke-virtual {v0, v9}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 333
    .line 334
    .line 335
    move-result-object v13

    .line 336
    if-nez v13, :cond_12

    .line 337
    .line 338
    new-instance v13, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 339
    .line 340
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 341
    .line 342
    .line 343
    move-result-object v14

    .line 344
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-direct {v13, v14}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;-><init>(Landroid/content/Context;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v10, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    :cond_12
    invoke-static {v10}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 354
    .line 355
    .line 356
    move-result-object v10

    .line 357
    iget-object v3, v3, La/ig3;->b:La/ah3;

    .line 358
    .line 359
    const/4 v13, -0x1

    .line 360
    if-nez v3, :cond_13

    .line 361
    .line 362
    move v3, v13

    .line 363
    goto :goto_5

    .line 364
    :cond_13
    sget-object v14, La/gg3;->a:[I

    .line 365
    .line 366
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    aget v3, v14, v3

    .line 371
    .line 372
    :goto_5
    const/4 v14, -0x2

    .line 373
    if-eq v3, v13, :cond_51

    .line 374
    .line 375
    const/16 v8, 0xa

    .line 376
    .line 377
    const/4 v15, 0x1

    .line 378
    if-eq v3, v15, :cond_48

    .line 379
    .line 380
    const/4 v15, 0x2

    .line 381
    const v13, 0x7f0706f8

    .line 382
    .line 383
    .line 384
    if-eq v3, v15, :cond_3b

    .line 385
    .line 386
    const/4 v15, 0x3

    .line 387
    if-eq v3, v15, :cond_2e

    .line 388
    .line 389
    const/4 v15, 0x4

    .line 390
    if-eq v3, v15, :cond_21

    .line 391
    .line 392
    const/4 v13, 0x5

    .line 393
    if-ne v3, v13, :cond_20

    .line 394
    .line 395
    new-instance v3, Ljava/util/ArrayList;

    .line 396
    .line 397
    invoke-static {v10, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 398
    .line 399
    .line 400
    move-result v8

    .line 401
    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v10, v5}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    :goto_6
    move-object v13, v8

    .line 409
    check-cast v13, La/paw;

    .line 410
    .line 411
    invoke-virtual {v13}, La/paw;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v15

    .line 415
    if-eqz v15, :cond_1f

    .line 416
    .line 417
    invoke-virtual {v13}, La/paw;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v13

    .line 421
    check-cast v13, Landroid/view/View;

    .line 422
    .line 423
    if-nez v13, :cond_14

    .line 424
    .line 425
    goto/16 :goto_19

    .line 426
    .line 427
    :cond_14
    instance-of v15, v13, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 428
    .line 429
    const v9, 0x7f07070c

    .line 430
    .line 431
    .line 432
    if-eqz v15, :cond_16

    .line 433
    .line 434
    move-object v15, v13

    .line 435
    check-cast v15, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 436
    .line 437
    new-instance v6, La/kj3;

    .line 438
    .line 439
    invoke-direct {v6}, La/kj3;-><init>()V

    .line 440
    .line 441
    .line 442
    iput v12, v6, La/kj3;->a:I

    .line 443
    .line 444
    iput-short v14, v6, La/kj3;->b:S

    .line 445
    .line 446
    iput-short v14, v6, La/kj3;->c:S

    .line 447
    .line 448
    iput v5, v6, La/kj3;->d:I

    .line 449
    .line 450
    iput v11, v6, La/kj3;->f:I

    .line 451
    .line 452
    iput v5, v6, La/kj3;->e:I

    .line 453
    .line 454
    iput v5, v6, La/kj3;->h:I

    .line 455
    .line 456
    invoke-virtual {v6}, La/kj3;->a()La/jj3;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    invoke-virtual {v15, v6}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->setContainerLayoutParams(La/jj3;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v15}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 464
    .line 465
    .line 466
    move-result-object v6

    .line 467
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 468
    .line 469
    .line 470
    move-result-object v6

    .line 471
    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDimension(I)F

    .line 472
    .line 473
    .line 474
    move-result v6

    .line 475
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    const/16 v9, 0xd

    .line 480
    .line 481
    move-object/from16 v16, v8

    .line 482
    .line 483
    const/4 v8, 0x0

    .line 484
    invoke-static {v13, v6, v8, v9}, La/sj3;->M0(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;I)V

    .line 485
    .line 486
    .line 487
    if-eqz v4, :cond_15

    .line 488
    .line 489
    invoke-virtual {v15, v4}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->setLoaderType(La/wg3;)V

    .line 490
    .line 491
    .line 492
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 493
    .line 494
    goto/16 :goto_9

    .line 495
    .line 496
    :cond_15
    move-object v6, v8

    .line 497
    goto/16 :goto_9

    .line 498
    .line 499
    :cond_16
    move-object/from16 v16, v8

    .line 500
    .line 501
    const/4 v8, 0x0

    .line 502
    instance-of v6, v13, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 503
    .line 504
    if-eqz v6, :cond_18

    .line 505
    .line 506
    check-cast v13, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 507
    .line 508
    new-instance v6, La/kj3;

    .line 509
    .line 510
    invoke-direct {v6}, La/kj3;-><init>()V

    .line 511
    .line 512
    .line 513
    const v9, 0x7f0a0b13

    .line 514
    .line 515
    .line 516
    iput v9, v6, La/kj3;->a:I

    .line 517
    .line 518
    const/4 v9, -0x1

    .line 519
    iput-short v9, v6, La/kj3;->b:S

    .line 520
    .line 521
    iput-short v14, v6, La/kj3;->c:S

    .line 522
    .line 523
    iput v5, v6, La/kj3;->d:I

    .line 524
    .line 525
    iput v11, v6, La/kj3;->g:I

    .line 526
    .line 527
    iput v5, v6, La/kj3;->e:I

    .line 528
    .line 529
    iput v5, v6, La/kj3;->h:I

    .line 530
    .line 531
    const/high16 v9, 0x3f800000    # 1.0f

    .line 532
    .line 533
    iput v9, v6, La/kj3;->i:F

    .line 534
    .line 535
    invoke-virtual {v6}, La/kj3;->a()La/jj3;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    invoke-virtual {v13, v6}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setContainerLayoutParams(La/jj3;)V

    .line 540
    .line 541
    .line 542
    if-eqz v7, :cond_17

    .line 543
    .line 544
    invoke-virtual {v13, v7}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setContent(La/ix80;)V

    .line 545
    .line 546
    .line 547
    :cond_17
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 548
    .line 549
    goto/16 :goto_9

    .line 550
    .line 551
    :cond_18
    instance-of v6, v13, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 552
    .line 553
    if-eqz v6, :cond_1e

    .line 554
    .line 555
    invoke-virtual {v10}, La/lc00;->isEmpty()Z

    .line 556
    .line 557
    .line 558
    move-result v6

    .line 559
    if-eqz v6, :cond_1a

    .line 560
    .line 561
    :cond_19
    move v6, v5

    .line 562
    goto :goto_7

    .line 563
    :cond_1a
    invoke-virtual {v10, v5}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 564
    .line 565
    .line 566
    move-result-object v6

    .line 567
    :cond_1b
    move-object v15, v6

    .line 568
    check-cast v15, La/paw;

    .line 569
    .line 570
    invoke-virtual {v15}, La/paw;->hasNext()Z

    .line 571
    .line 572
    .line 573
    move-result v17

    .line 574
    if-eqz v17, :cond_19

    .line 575
    .line 576
    invoke-virtual {v15}, La/paw;->next()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v15

    .line 580
    check-cast v15, Landroid/view/View;

    .line 581
    .line 582
    instance-of v15, v15, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 583
    .line 584
    if-eqz v15, :cond_1b

    .line 585
    .line 586
    const/4 v6, 0x1

    .line 587
    :goto_7
    check-cast v13, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 588
    .line 589
    new-instance v15, La/kj3;

    .line 590
    .line 591
    invoke-direct {v15}, La/kj3;-><init>()V

    .line 592
    .line 593
    .line 594
    const v8, 0x7f0a00b6

    .line 595
    .line 596
    .line 597
    iput v8, v15, La/kj3;->a:I

    .line 598
    .line 599
    iput v5, v15, La/kj3;->d:I

    .line 600
    .line 601
    if-eqz v6, :cond_1c

    .line 602
    .line 603
    const/high16 v6, 0x3f800000    # 1.0f

    .line 604
    .line 605
    iput v6, v15, La/kj3;->i:F

    .line 606
    .line 607
    iput v9, v15, La/kj3;->n:I

    .line 608
    .line 609
    iput v12, v15, La/kj3;->g:I

    .line 610
    .line 611
    goto :goto_8

    .line 612
    :cond_1c
    iput v11, v15, La/kj3;->g:I

    .line 613
    .line 614
    :goto_8
    iput v5, v15, La/kj3;->e:I

    .line 615
    .line 616
    iput v5, v15, La/kj3;->h:I

    .line 617
    .line 618
    invoke-virtual {v15}, La/kj3;->a()La/jj3;

    .line 619
    .line 620
    .line 621
    move-result-object v6

    .line 622
    invoke-virtual {v13, v6}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setContainerLayoutParams(La/jj3;)V

    .line 623
    .line 624
    .line 625
    if-eqz v1, :cond_1d

    .line 626
    .line 627
    invoke-virtual {v13, v1}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setContent(La/dx00;)V

    .line 628
    .line 629
    .line 630
    :cond_1d
    const/16 v6, 0x50

    .line 631
    .line 632
    invoke-virtual {v13, v6}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setViewGravity(I)V

    .line 633
    .line 634
    .line 635
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 636
    .line 637
    goto :goto_9

    .line 638
    :cond_1e
    instance-of v6, v13, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 639
    .line 640
    if-eqz v6, :cond_52

    .line 641
    .line 642
    check-cast v13, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 643
    .line 644
    new-instance v6, La/kj3;

    .line 645
    .line 646
    invoke-direct {v6}, La/kj3;-><init>()V

    .line 647
    .line 648
    .line 649
    iput v11, v6, La/kj3;->a:I

    .line 650
    .line 651
    const/4 v9, -0x1

    .line 652
    iput-short v9, v6, La/kj3;->b:S

    .line 653
    .line 654
    iput-short v14, v6, La/kj3;->c:S

    .line 655
    .line 656
    iput v5, v6, La/kj3;->d:I

    .line 657
    .line 658
    iput v5, v6, La/kj3;->f:I

    .line 659
    .line 660
    iput v5, v6, La/kj3;->e:I

    .line 661
    .line 662
    iput v5, v6, La/kj3;->h:I

    .line 663
    .line 664
    const/high16 v9, 0x3f800000    # 1.0f

    .line 665
    .line 666
    iput v9, v6, La/kj3;->i:F

    .line 667
    .line 668
    iput v9, v6, La/kj3;->j:F

    .line 669
    .line 670
    const v8, 0x7f0706ea

    .line 671
    .line 672
    .line 673
    iput v8, v6, La/kj3;->k:I

    .line 674
    .line 675
    const v9, 0x7f070717

    .line 676
    .line 677
    .line 678
    iput v9, v6, La/kj3;->o:I

    .line 679
    .line 680
    iput v8, v6, La/kj3;->m:I

    .line 681
    .line 682
    iput v9, v6, La/kj3;->p:I

    .line 683
    .line 684
    invoke-virtual {v6}, La/kj3;->a()La/jj3;

    .line 685
    .line 686
    .line 687
    move-result-object v6

    .line 688
    invoke-virtual {v13, v6}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setViewLayoutParams(La/jj3;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v13, v2}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setContent(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 695
    .line 696
    :goto_9
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    move-object/from16 v8, v16

    .line 700
    .line 701
    const v9, 0x7f0a0b13

    .line 702
    .line 703
    .line 704
    goto/16 :goto_6

    .line 705
    .line 706
    :cond_1f
    invoke-static {v0, v10}, La/mym0;->g(Landroid/view/ViewGroup;La/lc00;)V

    .line 707
    .line 708
    .line 709
    return-void

    .line 710
    :cond_20
    invoke-static {}, La/t9f;->b()V

    .line 711
    .line 712
    .line 713
    return-void

    .line 714
    :cond_21
    move v3, v8

    .line 715
    new-instance v6, Ljava/util/ArrayList;

    .line 716
    .line 717
    invoke-static {v10, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v10, v5}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 725
    .line 726
    .line 727
    move-result-object v3

    .line 728
    :goto_a
    move-object v8, v3

    .line 729
    check-cast v8, La/paw;

    .line 730
    .line 731
    invoke-virtual {v8}, La/paw;->hasNext()Z

    .line 732
    .line 733
    .line 734
    move-result v9

    .line 735
    if-eqz v9, :cond_2d

    .line 736
    .line 737
    invoke-virtual {v8}, La/paw;->next()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v8

    .line 741
    check-cast v8, Landroid/view/View;

    .line 742
    .line 743
    if-nez v8, :cond_22

    .line 744
    .line 745
    goto/16 :goto_19

    .line 746
    .line 747
    :cond_22
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 748
    .line 749
    if-eqz v9, :cond_24

    .line 750
    .line 751
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 752
    .line 753
    new-instance v9, La/kj3;

    .line 754
    .line 755
    invoke-direct {v9}, La/kj3;-><init>()V

    .line 756
    .line 757
    .line 758
    iput v12, v9, La/kj3;->a:I

    .line 759
    .line 760
    iput-short v14, v9, La/kj3;->b:S

    .line 761
    .line 762
    iput-short v14, v9, La/kj3;->c:S

    .line 763
    .line 764
    iput v5, v9, La/kj3;->d:I

    .line 765
    .line 766
    iput v11, v9, La/kj3;->g:I

    .line 767
    .line 768
    iput v5, v9, La/kj3;->e:I

    .line 769
    .line 770
    iput v5, v9, La/kj3;->h:I

    .line 771
    .line 772
    const/high16 v15, 0x3f800000    # 1.0f

    .line 773
    .line 774
    iput v15, v9, La/kj3;->i:F

    .line 775
    .line 776
    iput v13, v9, La/kj3;->o:I

    .line 777
    .line 778
    iput v13, v9, La/kj3;->p:I

    .line 779
    .line 780
    invoke-virtual {v9}, La/kj3;->a()La/jj3;

    .line 781
    .line 782
    .line 783
    move-result-object v9

    .line 784
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->setContainerLayoutParams(La/jj3;)V

    .line 785
    .line 786
    .line 787
    if-eqz v4, :cond_23

    .line 788
    .line 789
    invoke-virtual {v8, v4}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->setLoaderType(La/wg3;)V

    .line 790
    .line 791
    .line 792
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 793
    .line 794
    goto/16 :goto_d

    .line 795
    .line 796
    :cond_23
    const/4 v8, 0x0

    .line 797
    goto/16 :goto_d

    .line 798
    .line 799
    :cond_24
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 800
    .line 801
    if-eqz v9, :cond_2a

    .line 802
    .line 803
    invoke-virtual {v10}, La/lc00;->isEmpty()Z

    .line 804
    .line 805
    .line 806
    move-result v9

    .line 807
    if-eqz v9, :cond_26

    .line 808
    .line 809
    :cond_25
    move v9, v5

    .line 810
    goto :goto_b

    .line 811
    :cond_26
    invoke-virtual {v10, v5}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 812
    .line 813
    .line 814
    move-result-object v9

    .line 815
    :cond_27
    move-object v15, v9

    .line 816
    check-cast v15, La/paw;

    .line 817
    .line 818
    invoke-virtual {v15}, La/paw;->hasNext()Z

    .line 819
    .line 820
    .line 821
    move-result v17

    .line 822
    if-eqz v17, :cond_25

    .line 823
    .line 824
    invoke-virtual {v15}, La/paw;->next()Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v15

    .line 828
    check-cast v15, Landroid/view/View;

    .line 829
    .line 830
    instance-of v15, v15, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 831
    .line 832
    if-eqz v15, :cond_27

    .line 833
    .line 834
    const/4 v9, 0x1

    .line 835
    :goto_b
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 836
    .line 837
    new-instance v15, La/kj3;

    .line 838
    .line 839
    invoke-direct {v15}, La/kj3;-><init>()V

    .line 840
    .line 841
    .line 842
    const v13, 0x7f0a0b13

    .line 843
    .line 844
    .line 845
    iput v13, v15, La/kj3;->a:I

    .line 846
    .line 847
    const/4 v13, -0x1

    .line 848
    iput-short v13, v15, La/kj3;->b:S

    .line 849
    .line 850
    iput-short v14, v15, La/kj3;->c:S

    .line 851
    .line 852
    iput v5, v15, La/kj3;->d:I

    .line 853
    .line 854
    if-eqz v9, :cond_28

    .line 855
    .line 856
    move v9, v12

    .line 857
    goto :goto_c

    .line 858
    :cond_28
    move v9, v11

    .line 859
    :goto_c
    iput v9, v15, La/kj3;->g:I

    .line 860
    .line 861
    iput v5, v15, La/kj3;->e:I

    .line 862
    .line 863
    iput v5, v15, La/kj3;->h:I

    .line 864
    .line 865
    const/high16 v9, 0x3f800000    # 1.0f

    .line 866
    .line 867
    iput v9, v15, La/kj3;->i:F

    .line 868
    .line 869
    invoke-virtual {v15}, La/kj3;->a()La/jj3;

    .line 870
    .line 871
    .line 872
    move-result-object v9

    .line 873
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setContainerLayoutParams(La/jj3;)V

    .line 874
    .line 875
    .line 876
    if-eqz v7, :cond_29

    .line 877
    .line 878
    invoke-virtual {v8, v7}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setContent(La/ix80;)V

    .line 879
    .line 880
    .line 881
    :cond_29
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 882
    .line 883
    goto :goto_d

    .line 884
    :cond_2a
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 885
    .line 886
    if-eqz v9, :cond_2c

    .line 887
    .line 888
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 889
    .line 890
    new-instance v9, La/kj3;

    .line 891
    .line 892
    invoke-direct {v9}, La/kj3;-><init>()V

    .line 893
    .line 894
    .line 895
    const v13, 0x7f0a00b6

    .line 896
    .line 897
    .line 898
    iput v13, v9, La/kj3;->a:I

    .line 899
    .line 900
    iput v5, v9, La/kj3;->d:I

    .line 901
    .line 902
    iput v5, v9, La/kj3;->f:I

    .line 903
    .line 904
    iput v5, v9, La/kj3;->e:I

    .line 905
    .line 906
    iput v5, v9, La/kj3;->h:I

    .line 907
    .line 908
    invoke-virtual {v9}, La/kj3;->a()La/jj3;

    .line 909
    .line 910
    .line 911
    move-result-object v9

    .line 912
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setContainerLayoutParams(La/jj3;)V

    .line 913
    .line 914
    .line 915
    if-eqz v1, :cond_2b

    .line 916
    .line 917
    invoke-virtual {v8, v1}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setContent(La/dx00;)V

    .line 918
    .line 919
    .line 920
    :cond_2b
    const/16 v9, 0x11

    .line 921
    .line 922
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setViewGravity(I)V

    .line 923
    .line 924
    .line 925
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 926
    .line 927
    goto :goto_d

    .line 928
    :cond_2c
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 929
    .line 930
    if-eqz v9, :cond_52

    .line 931
    .line 932
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 933
    .line 934
    new-instance v9, La/kj3;

    .line 935
    .line 936
    invoke-direct {v9}, La/kj3;-><init>()V

    .line 937
    .line 938
    .line 939
    iput v11, v9, La/kj3;->a:I

    .line 940
    .line 941
    const/4 v13, -0x1

    .line 942
    iput-short v13, v9, La/kj3;->b:S

    .line 943
    .line 944
    iput-short v14, v9, La/kj3;->c:S

    .line 945
    .line 946
    iput v5, v9, La/kj3;->d:I

    .line 947
    .line 948
    iput v5, v9, La/kj3;->f:I

    .line 949
    .line 950
    iput v5, v9, La/kj3;->e:I

    .line 951
    .line 952
    iput v5, v9, La/kj3;->h:I

    .line 953
    .line 954
    const/high16 v15, 0x3f800000    # 1.0f

    .line 955
    .line 956
    iput v15, v9, La/kj3;->i:F

    .line 957
    .line 958
    iput v15, v9, La/kj3;->j:F

    .line 959
    .line 960
    const v13, 0x7f0706ea

    .line 961
    .line 962
    .line 963
    iput v13, v9, La/kj3;->k:I

    .line 964
    .line 965
    const v15, 0x7f070717

    .line 966
    .line 967
    .line 968
    iput v15, v9, La/kj3;->l:I

    .line 969
    .line 970
    iput v13, v9, La/kj3;->m:I

    .line 971
    .line 972
    iput v15, v9, La/kj3;->n:I

    .line 973
    .line 974
    invoke-virtual {v9}, La/kj3;->a()La/jj3;

    .line 975
    .line 976
    .line 977
    move-result-object v9

    .line 978
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setViewLayoutParams(La/jj3;)V

    .line 979
    .line 980
    .line 981
    invoke-virtual {v8, v2}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setContent(Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 985
    .line 986
    :goto_d
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    const v13, 0x7f0706f8

    .line 990
    .line 991
    .line 992
    goto/16 :goto_a

    .line 993
    .line 994
    :cond_2d
    invoke-static {v0, v10}, La/mym0;->g(Landroid/view/ViewGroup;La/lc00;)V

    .line 995
    .line 996
    .line 997
    return-void

    .line 998
    :cond_2e
    move v3, v8

    .line 999
    new-instance v6, Ljava/util/ArrayList;

    .line 1000
    .line 1001
    invoke-static {v10, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1002
    .line 1003
    .line 1004
    move-result v3

    .line 1005
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v10, v5}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v3

    .line 1012
    :goto_e
    move-object v8, v3

    .line 1013
    check-cast v8, La/paw;

    .line 1014
    .line 1015
    invoke-virtual {v8}, La/paw;->hasNext()Z

    .line 1016
    .line 1017
    .line 1018
    move-result v9

    .line 1019
    if-eqz v9, :cond_3a

    .line 1020
    .line 1021
    invoke-virtual {v8}, La/paw;->next()Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v8

    .line 1025
    check-cast v8, Landroid/view/View;

    .line 1026
    .line 1027
    if-nez v8, :cond_2f

    .line 1028
    .line 1029
    goto/16 :goto_19

    .line 1030
    .line 1031
    :cond_2f
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 1032
    .line 1033
    if-eqz v9, :cond_31

    .line 1034
    .line 1035
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 1036
    .line 1037
    new-instance v9, La/kj3;

    .line 1038
    .line 1039
    invoke-direct {v9}, La/kj3;-><init>()V

    .line 1040
    .line 1041
    .line 1042
    iput v12, v9, La/kj3;->a:I

    .line 1043
    .line 1044
    iput-short v14, v9, La/kj3;->b:S

    .line 1045
    .line 1046
    iput-short v14, v9, La/kj3;->c:S

    .line 1047
    .line 1048
    iput v5, v9, La/kj3;->d:I

    .line 1049
    .line 1050
    iput v11, v9, La/kj3;->g:I

    .line 1051
    .line 1052
    iput v5, v9, La/kj3;->e:I

    .line 1053
    .line 1054
    iput v5, v9, La/kj3;->h:I

    .line 1055
    .line 1056
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1057
    .line 1058
    iput v15, v9, La/kj3;->i:F

    .line 1059
    .line 1060
    const v13, 0x7f0706f8

    .line 1061
    .line 1062
    .line 1063
    iput v13, v9, La/kj3;->o:I

    .line 1064
    .line 1065
    iput v13, v9, La/kj3;->p:I

    .line 1066
    .line 1067
    invoke-virtual {v9}, La/kj3;->a()La/jj3;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v9

    .line 1071
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->setContainerLayoutParams(La/jj3;)V

    .line 1072
    .line 1073
    .line 1074
    if-eqz v4, :cond_30

    .line 1075
    .line 1076
    invoke-virtual {v8, v4}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->setLoaderType(La/wg3;)V

    .line 1077
    .line 1078
    .line 1079
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1080
    .line 1081
    goto/16 :goto_11

    .line 1082
    .line 1083
    :cond_30
    const/4 v8, 0x0

    .line 1084
    goto/16 :goto_11

    .line 1085
    .line 1086
    :cond_31
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 1087
    .line 1088
    if-eqz v9, :cond_37

    .line 1089
    .line 1090
    invoke-virtual {v10}, La/lc00;->isEmpty()Z

    .line 1091
    .line 1092
    .line 1093
    move-result v9

    .line 1094
    if-eqz v9, :cond_33

    .line 1095
    .line 1096
    :cond_32
    move v9, v5

    .line 1097
    goto :goto_f

    .line 1098
    :cond_33
    invoke-virtual {v10, v5}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v9

    .line 1102
    :cond_34
    move-object v13, v9

    .line 1103
    check-cast v13, La/paw;

    .line 1104
    .line 1105
    invoke-virtual {v13}, La/paw;->hasNext()Z

    .line 1106
    .line 1107
    .line 1108
    move-result v15

    .line 1109
    if-eqz v15, :cond_32

    .line 1110
    .line 1111
    invoke-virtual {v13}, La/paw;->next()Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v13

    .line 1115
    check-cast v13, Landroid/view/View;

    .line 1116
    .line 1117
    instance-of v13, v13, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 1118
    .line 1119
    if-eqz v13, :cond_34

    .line 1120
    .line 1121
    const/4 v9, 0x1

    .line 1122
    :goto_f
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 1123
    .line 1124
    new-instance v13, La/kj3;

    .line 1125
    .line 1126
    invoke-direct {v13}, La/kj3;-><init>()V

    .line 1127
    .line 1128
    .line 1129
    const v15, 0x7f0a0b13

    .line 1130
    .line 1131
    .line 1132
    iput v15, v13, La/kj3;->a:I

    .line 1133
    .line 1134
    const/4 v15, -0x1

    .line 1135
    iput-short v15, v13, La/kj3;->b:S

    .line 1136
    .line 1137
    iput-short v14, v13, La/kj3;->c:S

    .line 1138
    .line 1139
    iput v5, v13, La/kj3;->d:I

    .line 1140
    .line 1141
    if-eqz v9, :cond_35

    .line 1142
    .line 1143
    move v9, v12

    .line 1144
    goto :goto_10

    .line 1145
    :cond_35
    move v9, v11

    .line 1146
    :goto_10
    iput v9, v13, La/kj3;->g:I

    .line 1147
    .line 1148
    iput v5, v13, La/kj3;->e:I

    .line 1149
    .line 1150
    iput v5, v13, La/kj3;->h:I

    .line 1151
    .line 1152
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1153
    .line 1154
    iput v15, v13, La/kj3;->i:F

    .line 1155
    .line 1156
    invoke-virtual {v13}, La/kj3;->a()La/jj3;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v9

    .line 1160
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setContainerLayoutParams(La/jj3;)V

    .line 1161
    .line 1162
    .line 1163
    if-eqz v7, :cond_36

    .line 1164
    .line 1165
    invoke-virtual {v8, v7}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setContent(La/ix80;)V

    .line 1166
    .line 1167
    .line 1168
    :cond_36
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1169
    .line 1170
    goto :goto_11

    .line 1171
    :cond_37
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 1172
    .line 1173
    if-eqz v9, :cond_39

    .line 1174
    .line 1175
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 1176
    .line 1177
    new-instance v9, La/kj3;

    .line 1178
    .line 1179
    invoke-direct {v9}, La/kj3;-><init>()V

    .line 1180
    .line 1181
    .line 1182
    const v13, 0x7f0a00b6

    .line 1183
    .line 1184
    .line 1185
    iput v13, v9, La/kj3;->a:I

    .line 1186
    .line 1187
    iput v5, v9, La/kj3;->d:I

    .line 1188
    .line 1189
    iput v11, v9, La/kj3;->g:I

    .line 1190
    .line 1191
    iput v5, v9, La/kj3;->e:I

    .line 1192
    .line 1193
    iput v5, v9, La/kj3;->h:I

    .line 1194
    .line 1195
    const/4 v13, 0x0

    .line 1196
    iput v13, v9, La/kj3;->i:F

    .line 1197
    .line 1198
    const v13, 0x7f070729

    .line 1199
    .line 1200
    .line 1201
    iput v13, v9, La/kj3;->l:I

    .line 1202
    .line 1203
    invoke-virtual {v9}, La/kj3;->a()La/jj3;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v9

    .line 1207
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setContainerLayoutParams(La/jj3;)V

    .line 1208
    .line 1209
    .line 1210
    if-eqz v1, :cond_38

    .line 1211
    .line 1212
    invoke-virtual {v8, v1}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setContent(La/dx00;)V

    .line 1213
    .line 1214
    .line 1215
    :cond_38
    const/16 v9, 0x30

    .line 1216
    .line 1217
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setViewGravity(I)V

    .line 1218
    .line 1219
    .line 1220
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1221
    .line 1222
    goto :goto_11

    .line 1223
    :cond_39
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 1224
    .line 1225
    if-eqz v9, :cond_52

    .line 1226
    .line 1227
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 1228
    .line 1229
    new-instance v9, La/kj3;

    .line 1230
    .line 1231
    invoke-direct {v9}, La/kj3;-><init>()V

    .line 1232
    .line 1233
    .line 1234
    iput v11, v9, La/kj3;->a:I

    .line 1235
    .line 1236
    const/4 v13, -0x1

    .line 1237
    iput-short v13, v9, La/kj3;->b:S

    .line 1238
    .line 1239
    iput-short v14, v9, La/kj3;->c:S

    .line 1240
    .line 1241
    iput v5, v9, La/kj3;->d:I

    .line 1242
    .line 1243
    iput v5, v9, La/kj3;->f:I

    .line 1244
    .line 1245
    iput v5, v9, La/kj3;->e:I

    .line 1246
    .line 1247
    iput v5, v9, La/kj3;->h:I

    .line 1248
    .line 1249
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1250
    .line 1251
    iput v15, v9, La/kj3;->i:F

    .line 1252
    .line 1253
    iput v15, v9, La/kj3;->j:F

    .line 1254
    .line 1255
    const v13, 0x7f0706ea

    .line 1256
    .line 1257
    .line 1258
    iput v13, v9, La/kj3;->k:I

    .line 1259
    .line 1260
    const v15, 0x7f070717

    .line 1261
    .line 1262
    .line 1263
    iput v15, v9, La/kj3;->o:I

    .line 1264
    .line 1265
    iput v13, v9, La/kj3;->m:I

    .line 1266
    .line 1267
    iput v15, v9, La/kj3;->p:I

    .line 1268
    .line 1269
    invoke-virtual {v9}, La/kj3;->a()La/jj3;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v9

    .line 1273
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setViewLayoutParams(La/jj3;)V

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v8, v2}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setContent(Ljava/lang/String;)V

    .line 1277
    .line 1278
    .line 1279
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1280
    .line 1281
    :goto_11
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1282
    .line 1283
    .line 1284
    goto/16 :goto_e

    .line 1285
    .line 1286
    :cond_3a
    invoke-static {v0, v10}, La/mym0;->g(Landroid/view/ViewGroup;La/lc00;)V

    .line 1287
    .line 1288
    .line 1289
    return-void

    .line 1290
    :cond_3b
    move v3, v8

    .line 1291
    new-instance v6, Ljava/util/ArrayList;

    .line 1292
    .line 1293
    invoke-static {v10, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1294
    .line 1295
    .line 1296
    move-result v3

    .line 1297
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v10, v5}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v3

    .line 1304
    :goto_12
    move-object v8, v3

    .line 1305
    check-cast v8, La/paw;

    .line 1306
    .line 1307
    invoke-virtual {v8}, La/paw;->hasNext()Z

    .line 1308
    .line 1309
    .line 1310
    move-result v9

    .line 1311
    if-eqz v9, :cond_47

    .line 1312
    .line 1313
    invoke-virtual {v8}, La/paw;->next()Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v8

    .line 1317
    check-cast v8, Landroid/view/View;

    .line 1318
    .line 1319
    if-nez v8, :cond_3c

    .line 1320
    .line 1321
    goto/16 :goto_19

    .line 1322
    .line 1323
    :cond_3c
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 1324
    .line 1325
    if-eqz v9, :cond_42

    .line 1326
    .line 1327
    invoke-virtual {v10}, La/lc00;->isEmpty()Z

    .line 1328
    .line 1329
    .line 1330
    move-result v9

    .line 1331
    if-eqz v9, :cond_3e

    .line 1332
    .line 1333
    :cond_3d
    move v9, v5

    .line 1334
    goto :goto_13

    .line 1335
    :cond_3e
    invoke-virtual {v10, v5}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v9

    .line 1339
    :cond_3f
    move-object v13, v9

    .line 1340
    check-cast v13, La/paw;

    .line 1341
    .line 1342
    invoke-virtual {v13}, La/paw;->hasNext()Z

    .line 1343
    .line 1344
    .line 1345
    move-result v15

    .line 1346
    if-eqz v15, :cond_3d

    .line 1347
    .line 1348
    invoke-virtual {v13}, La/paw;->next()Ljava/lang/Object;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v13

    .line 1352
    check-cast v13, Landroid/view/View;

    .line 1353
    .line 1354
    instance-of v13, v13, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 1355
    .line 1356
    if-eqz v13, :cond_3f

    .line 1357
    .line 1358
    const/4 v9, 0x1

    .line 1359
    :goto_13
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 1360
    .line 1361
    new-instance v13, La/kj3;

    .line 1362
    .line 1363
    invoke-direct {v13}, La/kj3;-><init>()V

    .line 1364
    .line 1365
    .line 1366
    iput v12, v13, La/kj3;->a:I

    .line 1367
    .line 1368
    iput-short v14, v13, La/kj3;->b:S

    .line 1369
    .line 1370
    iput-short v14, v13, La/kj3;->c:S

    .line 1371
    .line 1372
    iput v5, v13, La/kj3;->d:I

    .line 1373
    .line 1374
    iput v5, v13, La/kj3;->e:I

    .line 1375
    .line 1376
    iput v5, v13, La/kj3;->h:I

    .line 1377
    .line 1378
    if-eqz v9, :cond_40

    .line 1379
    .line 1380
    const v15, 0x7f0a0b13

    .line 1381
    .line 1382
    .line 1383
    iput v15, v13, La/kj3;->g:I

    .line 1384
    .line 1385
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1386
    .line 1387
    iput v15, v13, La/kj3;->i:F

    .line 1388
    .line 1389
    :goto_14
    const v9, 0x7f0706f8

    .line 1390
    .line 1391
    .line 1392
    goto :goto_15

    .line 1393
    :cond_40
    iput v5, v13, La/kj3;->f:I

    .line 1394
    .line 1395
    const v9, 0x3f59999a    # 0.85f

    .line 1396
    .line 1397
    .line 1398
    iput v9, v13, La/kj3;->i:F

    .line 1399
    .line 1400
    goto :goto_14

    .line 1401
    :goto_15
    iput v9, v13, La/kj3;->o:I

    .line 1402
    .line 1403
    iput v9, v13, La/kj3;->p:I

    .line 1404
    .line 1405
    invoke-virtual {v13}, La/kj3;->a()La/jj3;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v13

    .line 1409
    invoke-virtual {v8, v13}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->setContainerLayoutParams(La/jj3;)V

    .line 1410
    .line 1411
    .line 1412
    if-eqz v4, :cond_41

    .line 1413
    .line 1414
    invoke-virtual {v8, v4}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->setLoaderType(La/wg3;)V

    .line 1415
    .line 1416
    .line 1417
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1418
    .line 1419
    goto/16 :goto_16

    .line 1420
    .line 1421
    :cond_41
    const/4 v8, 0x0

    .line 1422
    goto/16 :goto_16

    .line 1423
    .line 1424
    :cond_42
    const v9, 0x7f0706f8

    .line 1425
    .line 1426
    .line 1427
    instance-of v13, v8, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 1428
    .line 1429
    if-eqz v13, :cond_44

    .line 1430
    .line 1431
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 1432
    .line 1433
    new-instance v13, La/kj3;

    .line 1434
    .line 1435
    invoke-direct {v13}, La/kj3;-><init>()V

    .line 1436
    .line 1437
    .line 1438
    const v15, 0x7f0a0b13

    .line 1439
    .line 1440
    .line 1441
    iput v15, v13, La/kj3;->a:I

    .line 1442
    .line 1443
    const/4 v15, -0x1

    .line 1444
    iput-short v15, v13, La/kj3;->b:S

    .line 1445
    .line 1446
    iput-short v14, v13, La/kj3;->c:S

    .line 1447
    .line 1448
    iput v5, v13, La/kj3;->d:I

    .line 1449
    .line 1450
    iput v11, v13, La/kj3;->g:I

    .line 1451
    .line 1452
    iput v5, v13, La/kj3;->e:I

    .line 1453
    .line 1454
    iput v5, v13, La/kj3;->h:I

    .line 1455
    .line 1456
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1457
    .line 1458
    iput v15, v13, La/kj3;->i:F

    .line 1459
    .line 1460
    invoke-virtual {v13}, La/kj3;->a()La/jj3;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v13

    .line 1464
    invoke-virtual {v8, v13}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setContainerLayoutParams(La/jj3;)V

    .line 1465
    .line 1466
    .line 1467
    if-eqz v7, :cond_43

    .line 1468
    .line 1469
    invoke-virtual {v8, v7}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setContent(La/ix80;)V

    .line 1470
    .line 1471
    .line 1472
    :cond_43
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1473
    .line 1474
    goto :goto_16

    .line 1475
    :cond_44
    instance-of v13, v8, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 1476
    .line 1477
    if-eqz v13, :cond_46

    .line 1478
    .line 1479
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 1480
    .line 1481
    new-instance v13, La/kj3;

    .line 1482
    .line 1483
    invoke-direct {v13}, La/kj3;-><init>()V

    .line 1484
    .line 1485
    .line 1486
    const v15, 0x7f0a00b6

    .line 1487
    .line 1488
    .line 1489
    iput v15, v13, La/kj3;->a:I

    .line 1490
    .line 1491
    iput v5, v13, La/kj3;->d:I

    .line 1492
    .line 1493
    iput v11, v13, La/kj3;->g:I

    .line 1494
    .line 1495
    iput v5, v13, La/kj3;->e:I

    .line 1496
    .line 1497
    iput v5, v13, La/kj3;->h:I

    .line 1498
    .line 1499
    const/4 v15, 0x0

    .line 1500
    iput v15, v13, La/kj3;->i:F

    .line 1501
    .line 1502
    const v15, 0x7f070729

    .line 1503
    .line 1504
    .line 1505
    iput v15, v13, La/kj3;->l:I

    .line 1506
    .line 1507
    invoke-virtual {v13}, La/kj3;->a()La/jj3;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v13

    .line 1511
    invoke-virtual {v8, v13}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setContainerLayoutParams(La/jj3;)V

    .line 1512
    .line 1513
    .line 1514
    if-eqz v1, :cond_45

    .line 1515
    .line 1516
    invoke-virtual {v8, v1}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setContent(La/dx00;)V

    .line 1517
    .line 1518
    .line 1519
    :cond_45
    const/16 v13, 0x30

    .line 1520
    .line 1521
    invoke-virtual {v8, v13}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setViewGravity(I)V

    .line 1522
    .line 1523
    .line 1524
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1525
    .line 1526
    goto :goto_16

    .line 1527
    :cond_46
    const/16 v13, 0x30

    .line 1528
    .line 1529
    instance-of v15, v8, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 1530
    .line 1531
    if-eqz v15, :cond_52

    .line 1532
    .line 1533
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 1534
    .line 1535
    new-instance v15, La/kj3;

    .line 1536
    .line 1537
    invoke-direct {v15}, La/kj3;-><init>()V

    .line 1538
    .line 1539
    .line 1540
    iput v11, v15, La/kj3;->a:I

    .line 1541
    .line 1542
    const/4 v9, -0x1

    .line 1543
    iput-short v9, v15, La/kj3;->b:S

    .line 1544
    .line 1545
    iput-short v14, v15, La/kj3;->c:S

    .line 1546
    .line 1547
    iput v5, v15, La/kj3;->d:I

    .line 1548
    .line 1549
    iput v5, v15, La/kj3;->f:I

    .line 1550
    .line 1551
    iput v5, v15, La/kj3;->e:I

    .line 1552
    .line 1553
    iput v5, v15, La/kj3;->h:I

    .line 1554
    .line 1555
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1556
    .line 1557
    iput v9, v15, La/kj3;->i:F

    .line 1558
    .line 1559
    iput v9, v15, La/kj3;->j:F

    .line 1560
    .line 1561
    const v9, 0x7f0706ea

    .line 1562
    .line 1563
    .line 1564
    iput v9, v15, La/kj3;->k:I

    .line 1565
    .line 1566
    const v13, 0x7f070717

    .line 1567
    .line 1568
    .line 1569
    iput v13, v15, La/kj3;->o:I

    .line 1570
    .line 1571
    iput v9, v15, La/kj3;->m:I

    .line 1572
    .line 1573
    iput v13, v15, La/kj3;->p:I

    .line 1574
    .line 1575
    invoke-virtual {v15}, La/kj3;->a()La/jj3;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v9

    .line 1579
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setViewLayoutParams(La/jj3;)V

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v8, v2}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setContent(Ljava/lang/String;)V

    .line 1583
    .line 1584
    .line 1585
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1586
    .line 1587
    :goto_16
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1588
    .line 1589
    .line 1590
    goto/16 :goto_12

    .line 1591
    .line 1592
    :cond_47
    invoke-static {v0, v10}, La/mym0;->g(Landroid/view/ViewGroup;La/lc00;)V

    .line 1593
    .line 1594
    .line 1595
    return-void

    .line 1596
    :cond_48
    move v3, v8

    .line 1597
    new-instance v6, Ljava/util/ArrayList;

    .line 1598
    .line 1599
    invoke-static {v10, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1600
    .line 1601
    .line 1602
    move-result v3

    .line 1603
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1604
    .line 1605
    .line 1606
    invoke-virtual {v10, v5}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v3

    .line 1610
    :goto_17
    move-object v8, v3

    .line 1611
    check-cast v8, La/paw;

    .line 1612
    .line 1613
    invoke-virtual {v8}, La/paw;->hasNext()Z

    .line 1614
    .line 1615
    .line 1616
    move-result v9

    .line 1617
    if-eqz v9, :cond_50

    .line 1618
    .line 1619
    invoke-virtual {v8}, La/paw;->next()Ljava/lang/Object;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v8

    .line 1623
    check-cast v8, Landroid/view/View;

    .line 1624
    .line 1625
    if-nez v8, :cond_49

    .line 1626
    .line 1627
    goto/16 :goto_19

    .line 1628
    .line 1629
    :cond_49
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 1630
    .line 1631
    if-eqz v9, :cond_4b

    .line 1632
    .line 1633
    move-object v9, v8

    .line 1634
    check-cast v9, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;

    .line 1635
    .line 1636
    new-instance v13, La/kj3;

    .line 1637
    .line 1638
    invoke-direct {v13}, La/kj3;-><init>()V

    .line 1639
    .line 1640
    .line 1641
    iput v12, v13, La/kj3;->a:I

    .line 1642
    .line 1643
    iput-short v14, v13, La/kj3;->b:S

    .line 1644
    .line 1645
    iput-short v14, v13, La/kj3;->c:S

    .line 1646
    .line 1647
    iput v5, v13, La/kj3;->d:I

    .line 1648
    .line 1649
    iput v5, v13, La/kj3;->f:I

    .line 1650
    .line 1651
    iput v5, v13, La/kj3;->e:I

    .line 1652
    .line 1653
    iput v5, v13, La/kj3;->h:I

    .line 1654
    .line 1655
    const/4 v15, 0x0

    .line 1656
    iput v15, v13, La/kj3;->i:F

    .line 1657
    .line 1658
    invoke-virtual {v13}, La/kj3;->a()La/jj3;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v13

    .line 1662
    invoke-virtual {v9, v13}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->setContainerLayoutParams(La/jj3;)V

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v13

    .line 1669
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v13

    .line 1673
    const v12, 0x7f070729

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual {v13, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1677
    .line 1678
    .line 1679
    move-result v20

    .line 1680
    const/16 v22, 0x0

    .line 1681
    .line 1682
    const/16 v23, 0xd

    .line 1683
    .line 1684
    const/16 v19, 0x0

    .line 1685
    .line 1686
    const/16 v21, 0x0

    .line 1687
    .line 1688
    move-object/from16 v18, v8

    .line 1689
    .line 1690
    invoke-static/range {v18 .. v23}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 1691
    .line 1692
    .line 1693
    if-eqz v4, :cond_4a

    .line 1694
    .line 1695
    invoke-virtual {v9, v4}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->setLoaderType(La/wg3;)V

    .line 1696
    .line 1697
    .line 1698
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1699
    .line 1700
    goto/16 :goto_18

    .line 1701
    .line 1702
    :cond_4a
    const/4 v8, 0x0

    .line 1703
    goto/16 :goto_18

    .line 1704
    .line 1705
    :cond_4b
    const v12, 0x7f070729

    .line 1706
    .line 1707
    .line 1708
    const/4 v15, 0x0

    .line 1709
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 1710
    .line 1711
    if-eqz v9, :cond_4d

    .line 1712
    .line 1713
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 1714
    .line 1715
    new-instance v9, La/kj3;

    .line 1716
    .line 1717
    invoke-direct {v9}, La/kj3;-><init>()V

    .line 1718
    .line 1719
    .line 1720
    const v13, 0x7f0a0b13

    .line 1721
    .line 1722
    .line 1723
    iput v13, v9, La/kj3;->a:I

    .line 1724
    .line 1725
    const/4 v12, -0x1

    .line 1726
    iput-short v12, v9, La/kj3;->b:S

    .line 1727
    .line 1728
    iput-short v14, v9, La/kj3;->c:S

    .line 1729
    .line 1730
    iput v5, v9, La/kj3;->d:I

    .line 1731
    .line 1732
    iput v11, v9, La/kj3;->g:I

    .line 1733
    .line 1734
    iput v5, v9, La/kj3;->e:I

    .line 1735
    .line 1736
    iput v5, v9, La/kj3;->h:I

    .line 1737
    .line 1738
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1739
    .line 1740
    iput v12, v9, La/kj3;->i:F

    .line 1741
    .line 1742
    invoke-virtual {v9}, La/kj3;->a()La/jj3;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v9

    .line 1746
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setContainerLayoutParams(La/jj3;)V

    .line 1747
    .line 1748
    .line 1749
    if-eqz v7, :cond_4c

    .line 1750
    .line 1751
    invoke-virtual {v8, v7}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setContent(La/ix80;)V

    .line 1752
    .line 1753
    .line 1754
    :cond_4c
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1755
    .line 1756
    goto :goto_18

    .line 1757
    :cond_4d
    const v13, 0x7f0a0b13

    .line 1758
    .line 1759
    .line 1760
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 1761
    .line 1762
    if-eqz v9, :cond_4f

    .line 1763
    .line 1764
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;

    .line 1765
    .line 1766
    new-instance v9, La/kj3;

    .line 1767
    .line 1768
    invoke-direct {v9}, La/kj3;-><init>()V

    .line 1769
    .line 1770
    .line 1771
    const v12, 0x7f0a00b6

    .line 1772
    .line 1773
    .line 1774
    iput v12, v9, La/kj3;->a:I

    .line 1775
    .line 1776
    iput v5, v9, La/kj3;->d:I

    .line 1777
    .line 1778
    iput v5, v9, La/kj3;->f:I

    .line 1779
    .line 1780
    iput v5, v9, La/kj3;->e:I

    .line 1781
    .line 1782
    iput v5, v9, La/kj3;->h:I

    .line 1783
    .line 1784
    invoke-virtual {v9}, La/kj3;->a()La/jj3;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v9

    .line 1788
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setContainerLayoutParams(La/jj3;)V

    .line 1789
    .line 1790
    .line 1791
    if-eqz v1, :cond_4e

    .line 1792
    .line 1793
    invoke-virtual {v8, v1}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setContent(La/dx00;)V

    .line 1794
    .line 1795
    .line 1796
    :cond_4e
    const/16 v9, 0x11

    .line 1797
    .line 1798
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/logo/b;->setViewGravity(I)V

    .line 1799
    .line 1800
    .line 1801
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1802
    .line 1803
    goto :goto_18

    .line 1804
    :cond_4f
    const v12, 0x7f0a00b6

    .line 1805
    .line 1806
    .line 1807
    instance-of v9, v8, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 1808
    .line 1809
    if-eqz v9, :cond_52

    .line 1810
    .line 1811
    check-cast v8, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 1812
    .line 1813
    new-instance v9, La/kj3;

    .line 1814
    .line 1815
    invoke-direct {v9}, La/kj3;-><init>()V

    .line 1816
    .line 1817
    .line 1818
    iput v11, v9, La/kj3;->a:I

    .line 1819
    .line 1820
    const/4 v12, -0x1

    .line 1821
    iput-short v12, v9, La/kj3;->b:S

    .line 1822
    .line 1823
    iput-short v14, v9, La/kj3;->c:S

    .line 1824
    .line 1825
    iput v5, v9, La/kj3;->d:I

    .line 1826
    .line 1827
    iput v5, v9, La/kj3;->f:I

    .line 1828
    .line 1829
    iput v5, v9, La/kj3;->e:I

    .line 1830
    .line 1831
    iput v5, v9, La/kj3;->h:I

    .line 1832
    .line 1833
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1834
    .line 1835
    iput v12, v9, La/kj3;->i:F

    .line 1836
    .line 1837
    const v12, 0x7f0706ea

    .line 1838
    .line 1839
    .line 1840
    iput v12, v9, La/kj3;->k:I

    .line 1841
    .line 1842
    const v13, 0x7f070717

    .line 1843
    .line 1844
    .line 1845
    iput v13, v9, La/kj3;->o:I

    .line 1846
    .line 1847
    iput v12, v9, La/kj3;->m:I

    .line 1848
    .line 1849
    iput v13, v9, La/kj3;->p:I

    .line 1850
    .line 1851
    invoke-virtual {v9}, La/kj3;->a()La/jj3;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v9

    .line 1855
    invoke-virtual {v8, v9}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setViewLayoutParams(La/jj3;)V

    .line 1856
    .line 1857
    .line 1858
    invoke-virtual {v8, v2}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setContent(Ljava/lang/String;)V

    .line 1859
    .line 1860
    .line 1861
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1862
    .line 1863
    :goto_18
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1864
    .line 1865
    .line 1866
    const v12, 0x7f0a09b7

    .line 1867
    .line 1868
    .line 1869
    goto/16 :goto_17

    .line 1870
    .line 1871
    :cond_50
    invoke-static {v0, v10}, La/mym0;->g(Landroid/view/ViewGroup;La/lc00;)V

    .line 1872
    .line 1873
    .line 1874
    return-void

    .line 1875
    :cond_51
    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v1

    .line 1879
    if-nez v1, :cond_52

    .line 1880
    .line 1881
    new-instance v1, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;

    .line 1882
    .line 1883
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v3

    .line 1887
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1888
    .line 1889
    .line 1890
    invoke-direct {v1, v3}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;-><init>(Landroid/content/Context;)V

    .line 1891
    .line 1892
    .line 1893
    new-instance v3, La/kj3;

    .line 1894
    .line 1895
    invoke-direct {v3}, La/kj3;-><init>()V

    .line 1896
    .line 1897
    .line 1898
    iput v11, v3, La/kj3;->a:I

    .line 1899
    .line 1900
    const/4 v13, -0x1

    .line 1901
    iput-short v13, v3, La/kj3;->b:S

    .line 1902
    .line 1903
    iput-short v14, v3, La/kj3;->c:S

    .line 1904
    .line 1905
    iput v5, v3, La/kj3;->d:I

    .line 1906
    .line 1907
    iput v5, v3, La/kj3;->f:I

    .line 1908
    .line 1909
    iput v5, v3, La/kj3;->e:I

    .line 1910
    .line 1911
    iput v5, v3, La/kj3;->h:I

    .line 1912
    .line 1913
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1914
    .line 1915
    iput v15, v3, La/kj3;->i:F

    .line 1916
    .line 1917
    iput v15, v3, La/kj3;->j:F

    .line 1918
    .line 1919
    const v13, 0x7f0706ea

    .line 1920
    .line 1921
    .line 1922
    iput v13, v3, La/kj3;->k:I

    .line 1923
    .line 1924
    const v15, 0x7f070717

    .line 1925
    .line 1926
    .line 1927
    iput v15, v3, La/kj3;->o:I

    .line 1928
    .line 1929
    iput v13, v3, La/kj3;->m:I

    .line 1930
    .line 1931
    iput v15, v3, La/kj3;->p:I

    .line 1932
    .line 1933
    invoke-virtual {v3}, La/kj3;->a()La/jj3;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v3

    .line 1937
    invoke-virtual {v1, v3}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setViewLayoutParams(La/jj3;)V

    .line 1938
    .line 1939
    .line 1940
    invoke-virtual {v1, v2}, Lorg/xplatform/app_start/impl/presentation/view/content/version/b;->setContent(Ljava/lang/String;)V

    .line 1941
    .line 1942
    .line 1943
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1944
    .line 1945
    .line 1946
    :cond_52
    :goto_19
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getBlockOverlay()La/dg3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, La/dg3;->b:La/n0o0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/ImageView;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 19
    .line 20
    iget-object p0, p0, La/dg3;->b:La/n0o0;

    .line 21
    .line 22
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-static {p0}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->getBlockOverlay()La/dg3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/dg3;->b:La/n0o0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/widget/ImageView;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Landroid/widget/ImageView;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    const/16 v1, 0x3c

    .line 30
    .line 31
    invoke-static {p0, p1, v0, v0, v1}, La/u0d;->d(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
