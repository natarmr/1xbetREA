.class public final La/gbl0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/ers;
.implements La/ocl0;
.implements La/odf0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "La/gbl0;",
        "La/yx5;",
        "La/ers;",
        "La/ocl0;",
        "La/odf0;",
        "",
        "<init>",
        "()V",
        "a/lme0",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c2:La/lme0;

.field public static final synthetic d2:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/mui;

.field public M1:La/cge0;

.field public N1:La/s9m0;

.field public O1:La/gfk0;

.field public P1:La/ivn;

.field public Q1:La/zx10;

.field public R1:La/xi70;

.field public S1:La/wdk0;

.field public final U1:Z

.field public final V1:La/kiu0;

.field public final W1:La/s0r;

.field public final X1:La/khf0;

.field public final Y1:La/phf0;

.field public final Z1:La/n0o0;

.field public final a2:La/n0o0;

.field public final b2:La/roi0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/gbl0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/sportgame/classic/impl/databinding/FragmentSportGameClassicLegacyBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "screenParams"

    .line 16
    .line 17
    const-string v5, "getScreenParams()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "storedComponentKey"

    .line 25
    .line 26
    const-string v6, "getStoredComponentKey()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/gbl0;->d2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/lme0;

    .line 45
    .line 46
    const/16 v1, 0x1a

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/lme0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/gbl0;->c2:La/lme0;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02da

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    sget-object v1, La/bp3;->a:La/bp3;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    const v2, 0x7f040b5d

    .line 14
    .line 15
    .line 16
    const v3, 0x7f040ae3

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/gbl0;->K1:La/e9o0;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, La/gbl0;->U1:Z

    .line 26
    .line 27
    new-instance v1, La/dbl0;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    invoke-direct {v1, p0, v2}, La/dbl0;-><init>(La/gbl0;B)V

    .line 31
    .line 32
    .line 33
    new-instance v3, La/fyk0;

    .line 34
    .line 35
    invoke-direct {v3, p0, v0}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    sget-object v0, La/wez;->b:La/wez;

    .line 39
    .line 40
    new-instance v4, La/fyk0;

    .line 41
    .line 42
    invoke-direct {v4, v3, v2}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-class v2, La/ncl0;

    .line 50
    .line 51
    sget-object v3, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    new-instance v3, La/s9i0;

    .line 58
    .line 59
    const/16 v4, 0x1c

    .line 60
    .line 61
    invoke-direct {v3, v0, v4}, La/s9i0;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    new-instance v4, La/s9i0;

    .line 65
    .line 66
    const/16 v5, 0x1d

    .line 67
    .line 68
    invoke-direct {v4, v0, v5}, La/s9i0;-><init>(La/a8z;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v2, v3, v4, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/gbl0;->V1:La/kiu0;

    .line 76
    .line 77
    sget-object v0, La/fbl0;->a:La/fbl0;

    .line 78
    .line 79
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/gbl0;->W1:La/s0r;

    .line 84
    .line 85
    new-instance v0, La/khf0;

    .line 86
    .line 87
    const-string v1, "params_key"

    .line 88
    .line 89
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, La/gbl0;->X1:La/khf0;

    .line 93
    .line 94
    new-instance v0, La/phf0;

    .line 95
    .line 96
    const-string v1, "GAME_SCREEN_COMPONENT_KEY"

    .line 97
    .line 98
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, La/gbl0;->Y1:La/phf0;

    .line 102
    .line 103
    new-instance v0, La/dbl0;

    .line 104
    .line 105
    const/4 v1, 0x3

    .line 106
    invoke-direct {v0, p0, v1}, La/dbl0;-><init>(La/gbl0;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, La/gbl0;->Z1:La/n0o0;

    .line 114
    .line 115
    new-instance v0, La/fzk0;

    .line 116
    .line 117
    const/4 v1, 0x5

    .line 118
    invoke-direct {v0, v1}, La/fzk0;-><init>(B)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iput-object v0, p0, La/gbl0;->a2:La/n0o0;

    .line 126
    .line 127
    new-instance v0, La/roi0;

    .line 128
    .line 129
    invoke-direct {v0, p0}, La/roi0;-><init>(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, La/gbl0;->b2:La/roi0;

    .line 133
    .line 134
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 12

    .line 1
    sget-object p1, La/ysf0;->a:Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, La/ysf0;->a:Landroid/util/TypedValue;

    .line 12
    .line 13
    const v2, 0x7f04001e

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-virtual {v0, v2, v1, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 18
    .line 19
    .line 20
    iget v0, v1, Landroid/util/TypedValue;->data:I

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v0, p1}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0}, La/gbl0;->I0()La/z4r;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v0, v0, La/z4r;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 39
    .line 40
    new-instance v1, La/y78;

    .line 41
    .line 42
    const/16 v2, 0x12

    .line 43
    .line 44
    invoke-direct {v1, p0, p1, v2}, La/y78;-><init>(Ljava/lang/Object;IB)V

    .line 45
    .line 46
    .line 47
    sget-object p1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 48
    .line 49
    invoke-static {v0, v1}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, La/gbl0;->I0()La/z4r;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object p1, p1, La/z4r;->e:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;

    .line 57
    .line 58
    invoke-virtual {p0}, La/gbl0;->J0()La/ncl0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->u(La/ncl0;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, La/gbl0;->I0()La/z4r;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object v4, p1, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 70
    .line 71
    iget-object p1, p0, La/gbl0;->Z1:La/n0o0;

    .line 72
    .line 73
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    move-object v5, p1

    .line 78
    check-cast v5, La/qfs;

    .line 79
    .line 80
    iget-object p1, p0, La/gbl0;->a2:La/n0o0;

    .line 81
    .line 82
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    move-object v6, p1

    .line 87
    check-cast v6, La/lnd;

    .line 88
    .line 89
    invoke-virtual {p0}, La/gbl0;->J0()La/ncl0;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {p0}, La/gbl0;->J0()La/ncl0;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    iget-object v9, p0, La/gbl0;->b2:La/roi0;

    .line 98
    .line 99
    invoke-virtual {p0}, La/gbl0;->J0()La/ncl0;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    move-object v11, p0

    .line 104
    invoke-virtual/range {v4 .. v11}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->F(La/qfs;La/lnd;La/ncl0;La/ncl0;La/roi0;La/ncl0;La/gbl0;)V

    .line 105
    .line 106
    .line 107
    new-instance p0, La/dbl0;

    .line 108
    .line 109
    invoke-direct {p0, v11, v3}, La/dbl0;-><init>(La/gbl0;B)V

    .line 110
    .line 111
    .line 112
    invoke-static {v11, p0}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final C0()V
    .locals 18

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    invoke-virtual {v4}, La/gbl0;->H0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, La/sal0;->a:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-wide v0, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 20
    .line 21
    invoke-static {v4}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v0, v1, v2}, La/sal0;->b(JLa/cb50;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, La/gbl0;->d2:[La/iiy;

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    aget-object v1, v1, v2

    .line 33
    .line 34
    iget-object v2, v4, La/gbl0;->Y1:La/phf0;

    .line 35
    .line 36
    invoke-virtual {v2, v4, v1, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v4}, La/gbl0;->H0()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    sget-object v0, La/sal0;->a:Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-boolean v9, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->b:Z

    .line 50
    .line 51
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-wide v7, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->a:J

    .line 56
    .line 57
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-wide v10, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 62
    .line 63
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-wide v12, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->d:J

    .line 68
    .line 69
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-wide v14, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->e:J

    .line 74
    .line 75
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v0, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->f:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 80
    .line 81
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-boolean v1, v1, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->g:Z

    .line 86
    .line 87
    move-object v6, v5

    .line 88
    new-instance v5, La/frs;

    .line 89
    .line 90
    move-object/from16 v16, v0

    .line 91
    .line 92
    move/from16 v17, v1

    .line 93
    .line 94
    invoke-direct/range {v5 .. v17}, La/frs;-><init>(Ljava/lang/String;JZJJJLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;Z)V

    .line 95
    .line 96
    .line 97
    move-object v0, v5

    .line 98
    new-instance v1, La/xrs;

    .line 99
    .line 100
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-wide v8, v2, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 105
    .line 106
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-boolean v10, v2, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->b:Z

    .line 111
    .line 112
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iget-wide v11, v2, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->a:J

    .line 117
    .line 118
    move-object v7, v1

    .line 119
    invoke-direct/range {v7 .. v12}, La/xrs;-><init>(JZJ)V

    .line 120
    .line 121
    .line 122
    new-instance v2, La/npn;

    .line 123
    .line 124
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    iget-wide v8, v3, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 129
    .line 130
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iget-boolean v3, v3, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->b:Z

    .line 135
    .line 136
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget-wide v10, v5, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->a:J

    .line 141
    .line 142
    move-object v5, v2

    .line 143
    move-object v7, v6

    .line 144
    move v6, v3

    .line 145
    invoke-direct/range {v5 .. v11}, La/npn;-><init>(ZLjava/lang/String;JJ)V

    .line 146
    .line 147
    .line 148
    move-object v6, v7

    .line 149
    new-instance v3, La/dbl0;

    .line 150
    .line 151
    const/4 v5, 0x0

    .line 152
    invoke-direct {v3, v4, v5}, La/dbl0;-><init>(La/gbl0;B)V

    .line 153
    .line 154
    .line 155
    move-object v5, v6

    .line 156
    invoke-static/range {v0 .. v5}, La/sal0;->a(La/frs;La/xrs;La/npn;Lkotlin/jvm/functions/Function0;La/yx5;Ljava/lang/String;)La/oui;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iget-object v1, v0, La/oui;->K:La/n5d0;

    .line 161
    .line 162
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, La/mui;

    .line 167
    .line 168
    iput-object v1, v4, La/gbl0;->L1:La/mui;

    .line 169
    .line 170
    iget-object v1, v0, La/oui;->k:La/zx10;

    .line 171
    .line 172
    new-instance v2, La/cge0;

    .line 173
    .line 174
    const/4 v3, 0x6

    .line 175
    invoke-direct {v2, v3}, La/cge0;-><init>(B)V

    .line 176
    .line 177
    .line 178
    iput-object v2, v4, La/gbl0;->M1:La/cge0;

    .line 179
    .line 180
    iget-object v2, v0, La/oui;->C:La/s9m0;

    .line 181
    .line 182
    iput-object v2, v4, La/gbl0;->N1:La/s9m0;

    .line 183
    .line 184
    iget-object v2, v0, La/oui;->D:La/gfk0;

    .line 185
    .line 186
    iput-object v2, v4, La/gbl0;->O1:La/gfk0;

    .line 187
    .line 188
    iget-object v2, v0, La/oui;->m:La/ivn;

    .line 189
    .line 190
    iput-object v2, v4, La/gbl0;->P1:La/ivn;

    .line 191
    .line 192
    iput-object v1, v4, La/gbl0;->Q1:La/zx10;

    .line 193
    .line 194
    iget-object v1, v0, La/oui;->q:La/rmd0;

    .line 195
    .line 196
    invoke-interface {v1}, La/rmd0;->f()La/xi70;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    iput-object v1, v4, La/gbl0;->R1:La/xi70;

    .line 201
    .line 202
    iget-object v0, v0, La/oui;->E:La/wdk0;

    .line 203
    .line 204
    iput-object v0, v4, La/gbl0;->S1:La/wdk0;

    .line 205
    .line 206
    return-void
.end method

.method public final D0()V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/gbl0;->J0()La/ncl0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ncl0;->S:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/qaf0;

    .line 8
    .line 9
    const/4 v1, 0x7

    .line 10
    invoke-direct {v2, v0, v1}, La/qaf0;-><init>(La/gmq;B)V

    .line 11
    .line 12
    .line 13
    new-instance v3, La/jbh0;

    .line 14
    .line 15
    const/4 v9, 0x4

    .line 16
    const/16 v10, 0x14

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    const-class v14, La/gbl0;

    .line 20
    .line 21
    const-string v7, "handleBackground"

    .line 22
    .line 23
    const-string v8, "handleBackground(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/GameHeaderBackgroundUiModel;)V"

    .line 24
    .line 25
    move-object/from16 v5, p0

    .line 26
    .line 27
    move-object v6, v14

    .line 28
    invoke-direct/range {v3 .. v10}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 29
    .line 30
    .line 31
    sget-object v0, La/lkz;->a:La/lkz;

    .line 32
    .line 33
    move-object v4, v3

    .line 34
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, La/myj0;

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v11, 0x0

    .line 50
    move-object v5, v11

    .line 51
    invoke-direct/range {v1 .. v6}, La/myj0;-><init>(La/qaf0;La/clz;La/jbh0;La/yje;C)V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x3

    .line 55
    invoke-static {v0, v5, v5, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 56
    .line 57
    .line 58
    invoke-virtual/range {p0 .. p0}, La/gbl0;->J0()La/ncl0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v0, v0, La/ncl0;->T:La/n0o0;

    .line 63
    .line 64
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v8, v0

    .line 69
    check-cast v8, La/qz40;

    .line 70
    .line 71
    new-instance v10, La/jbh0;

    .line 72
    .line 73
    const/16 v17, 0x4

    .line 74
    .line 75
    const/16 v18, 0x15

    .line 76
    .line 77
    const/4 v12, 0x2

    .line 78
    const-string v15, "updateProgress"

    .line 79
    .line 80
    const-string v16, "updateProgress(Z)V"

    .line 81
    .line 82
    move-object/from16 v13, p0

    .line 83
    .line 84
    move-object v11, v10

    .line 85
    invoke-direct/range {v11 .. v18}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 86
    .line 87
    .line 88
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v7, La/myj0;

    .line 101
    .line 102
    const/4 v12, 0x0

    .line 103
    move-object v11, v5

    .line 104
    invoke-direct/range {v7 .. v12}, La/myj0;-><init>(La/gmq;La/clz;La/jbh0;La/yje;B)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {p0 .. p0}, La/gbl0;->J0()La/ncl0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v0, v0, La/ncl0;->N:La/p7m0;

    .line 115
    .line 116
    new-instance v8, La/qaf0;

    .line 117
    .line 118
    const/16 v1, 0x8

    .line 119
    .line 120
    invoke-direct {v8, v0, v1}, La/qaf0;-><init>(La/gmq;B)V

    .line 121
    .line 122
    .line 123
    sget-object v0, La/lkz;->a:La/lkz;

    .line 124
    .line 125
    new-instance v10, La/jbh0;

    .line 126
    .line 127
    const/16 v18, 0x16

    .line 128
    .line 129
    const/4 v12, 0x2

    .line 130
    const-string v15, "handleCardTabUiModel"

    .line 131
    .line 132
    const-string v16, "handleCardTabUiModel(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/GameTabUiModel;)V"

    .line 133
    .line 134
    move-object v11, v10

    .line 135
    invoke-direct/range {v11 .. v18}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 136
    .line 137
    .line 138
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    new-instance v7, La/myj0;

    .line 151
    .line 152
    const/4 v12, 0x0

    .line 153
    move-object v11, v5

    .line 154
    invoke-direct/range {v7 .. v12}, La/myj0;-><init>(La/qaf0;La/clz;La/jbh0;La/yje;B)V

    .line 155
    .line 156
    .line 157
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {p0 .. p0}, La/gbl0;->J0()La/ncl0;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iget-object v3, v0, La/ncl0;->O:La/p7m0;

    .line 165
    .line 166
    iget-object v4, v0, La/ncl0;->U:La/p7m0;

    .line 167
    .line 168
    new-instance v6, La/p4b0;

    .line 169
    .line 170
    invoke-direct {v6, v0, v5, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 171
    .line 172
    .line 173
    new-instance v1, La/p6d;

    .line 174
    .line 175
    const/4 v7, 0x1

    .line 176
    invoke-direct {v1, v3, v4, v6, v7}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 177
    .line 178
    .line 179
    new-instance v3, La/i89;

    .line 180
    .line 181
    const/16 v4, 0x16

    .line 182
    .line 183
    invoke-direct {v3, v1, v4}, La/i89;-><init>(La/gmq;B)V

    .line 184
    .line 185
    .line 186
    iget-object v0, v0, La/ncl0;->o:La/mne;

    .line 187
    .line 188
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 189
    .line 190
    invoke-static {v3, v0}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    new-instance v10, La/jbh0;

    .line 195
    .line 196
    const/16 v18, 0x17

    .line 197
    .line 198
    const/4 v12, 0x2

    .line 199
    const-string v15, "handleScreenUiModel"

    .line 200
    .line 201
    const-string v16, "handleScreenUiModel(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/GameScreenUiModel;)V"

    .line 202
    .line 203
    move-object v11, v10

    .line 204
    invoke-direct/range {v11 .. v18}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 205
    .line 206
    .line 207
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    new-instance v7, La/myj0;

    .line 220
    .line 221
    const/4 v12, 0x0

    .line 222
    move-object v11, v5

    .line 223
    invoke-direct/range {v7 .. v12}, La/myj0;-><init>(La/gmq;La/clz;La/jbh0;La/yje;C)V

    .line 224
    .line 225
    .line 226
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {p0 .. p0}, La/gbl0;->J0()La/ncl0;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    iget-object v1, v0, La/ncl0;->Q:La/p7m0;

    .line 234
    .line 235
    new-instance v3, La/i89;

    .line 236
    .line 237
    invoke-direct {v3, v1, v4}, La/i89;-><init>(La/gmq;B)V

    .line 238
    .line 239
    .line 240
    new-instance v1, La/omi0;

    .line 241
    .line 242
    const/4 v4, 0x5

    .line 243
    invoke-direct {v1, v3, v0, v4}, La/omi0;-><init>(La/gmq;Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    new-instance v11, La/jbh0;

    .line 247
    .line 248
    const/16 v18, 0x18

    .line 249
    .line 250
    const/4 v12, 0x2

    .line 251
    const-string v15, "handleGameVideoUiModel"

    .line 252
    .line 253
    const-string v16, "handleGameVideoUiModel(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/GameBroadcastUiModel;)V"

    .line 254
    .line 255
    invoke-direct/range {v11 .. v18}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 256
    .line 257
    .line 258
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    new-instance v4, La/myj0;

    .line 271
    .line 272
    invoke-direct {v4, v1, v0, v11, v5}, La/myj0;-><init>(La/omi0;La/clz;La/jbh0;La/yje;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {p0 .. p0}, La/gbl0;->J0()La/ncl0;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    iget-object v1, v0, La/ncl0;->R:La/p7m0;

    .line 283
    .line 284
    new-instance v3, La/kbh0;

    .line 285
    .line 286
    const/16 v4, 0x1d

    .line 287
    .line 288
    invoke-direct {v3, v0, v5, v4}, La/kbh0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 289
    .line 290
    .line 291
    new-instance v0, La/s6n0;

    .line 292
    .line 293
    invoke-direct {v0, v1, v3}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 294
    .line 295
    .line 296
    new-instance v11, La/jbh0;

    .line 297
    .line 298
    const/16 v18, 0x19

    .line 299
    .line 300
    const-string v15, "handleSingleEvents"

    .line 301
    .line 302
    const-string v16, "handleSingleEvents(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/SportGameClassicEvent;)V"

    .line 303
    .line 304
    invoke-direct/range {v11 .. v18}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 305
    .line 306
    .line 307
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    new-instance v4, La/myj0;

    .line 320
    .line 321
    invoke-direct {v4, v0, v1, v11, v5}, La/myj0;-><init>(La/s6n0;La/clz;La/jbh0;La/yje;)V

    .line 322
    .line 323
    .line 324
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {p0 .. p0}, La/gbl0;->J0()La/ncl0;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v0}, La/ncl0;->w()La/qz40;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    new-instance v8, La/omi0;

    .line 336
    .line 337
    const/4 v3, 0x4

    .line 338
    invoke-direct {v8, v1, v0, v3}, La/omi0;-><init>(La/gmq;Ljava/lang/Object;B)V

    .line 339
    .line 340
    .line 341
    new-instance v10, La/jbh0;

    .line 342
    .line 343
    const/16 v18, 0x1a

    .line 344
    .line 345
    const-string v15, "handleGameContentModel"

    .line 346
    .line 347
    const-string v16, "handleGameContentModel(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/GameScreenContentUiModel;)V"

    .line 348
    .line 349
    move-object v11, v10

    .line 350
    invoke-direct/range {v11 .. v18}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 351
    .line 352
    .line 353
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 354
    .line 355
    .line 356
    move-result-object v9

    .line 357
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    new-instance v7, La/myj0;

    .line 366
    .line 367
    const/4 v12, 0x0

    .line 368
    move-object v11, v5

    .line 369
    invoke-direct/range {v7 .. v12}, La/myj0;-><init>(La/omi0;La/clz;La/jbh0;La/yje;B)V

    .line 370
    .line 371
    .line 372
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {p0 .. p0}, La/gbl0;->J0()La/ncl0;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    iget-object v0, v0, La/ncl0;->t:La/f3j;

    .line 380
    .line 381
    iget-object v0, v0, La/f3j;->q:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v0, La/p7m0;

    .line 384
    .line 385
    new-instance v1, La/h2c;

    .line 386
    .line 387
    const/16 v3, 0x9

    .line 388
    .line 389
    invoke-direct {v1, v0, v3}, La/h2c;-><init>(La/p7m0;B)V

    .line 390
    .line 391
    .line 392
    new-instance v11, La/jbh0;

    .line 393
    .line 394
    const/16 v18, 0x1b

    .line 395
    .line 396
    const/4 v12, 0x2

    .line 397
    const-string v15, "handleToolbarUiModel"

    .line 398
    .line 399
    const-string v16, "handleToolbarUiModel(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/toolbar/GameToolbarUiModel;)V"

    .line 400
    .line 401
    invoke-direct/range {v11 .. v18}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 402
    .line 403
    .line 404
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    new-instance v4, La/myj0;

    .line 417
    .line 418
    invoke-direct {v4, v1, v0, v11, v5}, La/myj0;-><init>(La/h2c;La/clz;La/jbh0;La/yje;)V

    .line 419
    .line 420
    .line 421
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {p0 .. p0}, La/gbl0;->J0()La/ncl0;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    iget-object v0, v0, La/ncl0;->t:La/f3j;

    .line 429
    .line 430
    iget-object v0, v0, La/f3j;->r:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v0, La/p7m0;

    .line 433
    .line 434
    new-instance v11, La/jbh0;

    .line 435
    .line 436
    const/16 v18, 0x1c

    .line 437
    .line 438
    const-string v15, "handleMenuClickEvent"

    .line 439
    .line 440
    const-string v16, "handleMenuClickEvent(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/toolbar/MenuClickEvent;)V"

    .line 441
    .line 442
    invoke-direct/range {v11 .. v18}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 443
    .line 444
    .line 445
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    new-instance v4, La/myj0;

    .line 458
    .line 459
    invoke-direct {v4, v0, v1, v11, v5}, La/myj0;-><init>(La/p7m0;La/clz;La/jbh0;La/yje;)V

    .line 460
    .line 461
    .line 462
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 463
    .line 464
    .line 465
    return-void
.end method

.method public final G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;
    .locals 2

    .line 1
    sget-object v0, La/gbl0;->d2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/gbl0;->X1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final H0()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, La/gbl0;->d2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/gbl0;->Y1:La/phf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final I0()La/z4r;
    .locals 2

    .line 1
    sget-object v0, La/gbl0;->d2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/gbl0;->W1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/z4r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final J0()La/ncl0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gbl0;->V1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ncl0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final K0(La/ucs;Landroid/widget/ImageView;I)V
    .locals 9

    .line 1
    iget-object v0, p1, La/ucs;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Ljava/lang/String;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p1, La/ucs;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {v0}, La/q3d;->i(Ljava/util/List;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne p3, v0, :cond_1

    .line 20
    .line 21
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 22
    .line 23
    iget-object p0, p1, La/ucs;->b:Ljava/lang/Integer;

    .line 24
    .line 25
    iget-object p1, p1, La/ucs;->c:Ljava/lang/Integer;

    .line 26
    .line 27
    const/16 p3, 0x32

    .line 28
    .line 29
    invoke-static {p2, v2, p1, p0, p3}, La/u0d;->d(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v6, La/ebl0;

    .line 40
    .line 41
    invoke-direct {v6, p2, p0, p1, p3}, La/ebl0;-><init>(Landroid/widget/ImageView;La/gbl0;La/ucs;I)V

    .line 42
    .line 43
    .line 44
    new-instance v7, La/ebl0;

    .line 45
    .line 46
    invoke-direct {v7, p0, p1, p2, p3}, La/ebl0;-><init>(La/gbl0;La/ucs;Landroid/widget/ImageView;I)V

    .line 47
    .line 48
    .line 49
    const/16 v8, 0xe

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    invoke-static/range {v1 .. v8}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/bbl0;

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    invoke-direct {p1, p0, v0}, La/bbl0;-><init>(La/gbl0;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "KEY_LANDSCAPE_ZONE_REQUEST"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/bbl0;

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    invoke-direct {p1, p0, v0}, La/bbl0;-><init>(La/gbl0;B)V

    .line 19
    .line 20
    .line 21
    const-string v0, "KEY_LANDSCAPE_VIDEO_REQUEST"

    .line 22
    .line 23
    invoke-static {p0, v0, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final Y()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, La/gbl0;->H0()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-lez v0, :cond_1

    .line 35
    .line 36
    sget-object v0, La/sal0;->a:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-virtual {p0}, La/gbl0;->H0()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object v2, La/sal0;->a:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    :cond_1
    iput-boolean v1, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 51
    .line 52
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/gbl0;->I0()La/z4r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->E()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, La/yx5;->Z()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final a()J
    .locals 2

    .line 1
    invoke-virtual {p0}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-wide v0, p0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public final b()La/pdf0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gbl0;->Q1:La/zx10;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "relatedGamesFeature"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final d0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/gbl0;->J0()La/ncl0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ncl0;->V:La/c4m0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, La/gbl0;->J0()La/ncl0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, v0, La/ncl0;->X:Lkotlin/Pair;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v1, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/bby;

    .line 24
    .line 25
    :cond_1
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, La/ncl0;->W:La/c4m0;

    .line 29
    .line 30
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 35
    .line 36
    return-void
.end method

.method public final e0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/gbl0;->J0()La/ncl0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/ncl0;->V:La/c4m0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, La/ncl0;->p:La/m1e;

    .line 21
    .line 22
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, La/bcl0;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x4

    .line 30
    invoke-direct {v1, p0, v2, v3}, La/bcl0;-><init>(La/ncl0;La/yje;B)V

    .line 31
    .line 32
    .line 33
    new-instance v2, La/fnq;

    .line 34
    .line 35
    invoke-direct {v2, v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v1, p0, La/ncl0;->o:La/mne;

    .line 43
    .line 44
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 45
    .line 46
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v2, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/ncl0;->V:La/c4m0;

    .line 55
    .line 56
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/gbl0;->S1:La/wdk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "request_key_notification_updated"

    .line 6
    .line 7
    invoke-static {p0, v0}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "snackbarManager"

    .line 15
    .line 16
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/gbl0;->S1:La/wdk0;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-boolean p2, p0, La/gbl0;->U1:Z

    .line 12
    .line 13
    invoke-static {p1, p0, p2}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "snackbarManager"

    .line 18
    .line 19
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public final u(Lkotlin/jvm/functions/Function0;)La/pcl0;
    .locals 18

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    invoke-virtual {v4}, La/gbl0;->H0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, La/sal0;->a:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-wide v0, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 20
    .line 21
    invoke-static {v4}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v0, v1, v2}, La/sal0;->b(JLa/cb50;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, La/gbl0;->d2:[La/iiy;

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    aget-object v1, v1, v2

    .line 33
    .line 34
    iget-object v2, v4, La/gbl0;->Y1:La/phf0;

    .line 35
    .line 36
    invoke-virtual {v2, v4, v1, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v4}, La/gbl0;->H0()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    sget-object v0, La/sal0;->a:Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-boolean v9, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->b:Z

    .line 50
    .line 51
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-wide v7, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->a:J

    .line 56
    .line 57
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-wide v10, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 62
    .line 63
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-wide v12, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->d:J

    .line 68
    .line 69
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-wide v14, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->e:J

    .line 74
    .line 75
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v0, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->f:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 80
    .line 81
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-boolean v1, v1, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->g:Z

    .line 86
    .line 87
    move-object v6, v5

    .line 88
    new-instance v5, La/frs;

    .line 89
    .line 90
    move-object/from16 v16, v0

    .line 91
    .line 92
    move/from16 v17, v1

    .line 93
    .line 94
    invoke-direct/range {v5 .. v17}, La/frs;-><init>(Ljava/lang/String;JZJJJLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;Z)V

    .line 95
    .line 96
    .line 97
    move-object v0, v5

    .line 98
    new-instance v1, La/xrs;

    .line 99
    .line 100
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-wide v8, v2, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 105
    .line 106
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-boolean v10, v2, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->b:Z

    .line 111
    .line 112
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iget-wide v11, v2, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->a:J

    .line 117
    .line 118
    move-object v7, v1

    .line 119
    invoke-direct/range {v7 .. v12}, La/xrs;-><init>(JZJ)V

    .line 120
    .line 121
    .line 122
    new-instance v2, La/npn;

    .line 123
    .line 124
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    iget-wide v8, v3, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 129
    .line 130
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iget-boolean v3, v3, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->b:Z

    .line 135
    .line 136
    invoke-virtual {v4}, La/gbl0;->G0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget-wide v10, v5, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->a:J

    .line 141
    .line 142
    move-object v5, v2

    .line 143
    move-object v7, v6

    .line 144
    move v6, v3

    .line 145
    invoke-direct/range {v5 .. v11}, La/npn;-><init>(ZLjava/lang/String;JJ)V

    .line 146
    .line 147
    .line 148
    move-object/from16 v3, p1

    .line 149
    .line 150
    move-object v5, v7

    .line 151
    invoke-static/range {v0 .. v5}, La/sal0;->a(La/frs;La/xrs;La/npn;Lkotlin/jvm/functions/Function0;La/yx5;Ljava/lang/String;)La/oui;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v0, v0, La/oui;->a:La/ugf0;

    .line 156
    .line 157
    return-object v0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/gbl0;->U1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gbl0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
