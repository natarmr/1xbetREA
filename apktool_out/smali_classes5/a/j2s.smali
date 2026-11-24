.class public final La/j2s;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/ers;
.implements La/ocl0;
.implements La/odf0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "La/j2s;",
        "La/yx5;",
        "La/ers;",
        "La/ocl0;",
        "La/odf0;",
        "<init>",
        "()V",
        "a/xak",
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
.field public static final b2:La/xak;

.field public static final synthetic c2:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/nui;

.field public M1:La/ndf0;

.field public N1:La/uuz;

.field public O1:La/gfk0;

.field public P1:La/nek;

.field public Q1:La/xak;

.field public R1:La/zx10;

.field public S1:La/xi70;

.field public U1:La/wdk0;

.field public V1:La/poq0;

.field public final W1:Z

.field public final X1:La/a8z;

.field public final Y1:La/s0r;

.field public final Z1:La/khf0;

.field public final a2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/j2s;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/sportgame/classic/impl/databinding/FragmentSportGameClassicBinding;"

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
    sput-object v1, La/j2s;->c2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/xak;

    .line 45
    .line 46
    const/16 v1, 0x17

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/xak;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/j2s;->b2:La/xak;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d02d9

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
    const v3, 0x7f040ae1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/j2s;->K1:La/e9o0;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, La/j2s;->W1:Z

    .line 26
    .line 27
    const-class v0, La/k4s;

    .line 28
    .line 29
    sget-object v1, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, La/y1s;

    .line 36
    .line 37
    const/4 v2, 0x2

    .line 38
    invoke-direct {v1, p0, v2}, La/y1s;-><init>(La/j2s;B)V

    .line 39
    .line 40
    .line 41
    const/16 v2, 0xe

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/j2s;->X1:La/a8z;

    .line 49
    .line 50
    sget-object v0, La/i2s;->a:La/i2s;

    .line 51
    .line 52
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/j2s;->Y1:La/s0r;

    .line 57
    .line 58
    new-instance v0, La/khf0;

    .line 59
    .line 60
    const-string v1, "params_key"

    .line 61
    .line 62
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, La/j2s;->Z1:La/khf0;

    .line 66
    .line 67
    new-instance v0, La/phf0;

    .line 68
    .line 69
    const-string v1, "GAME_SCREEN_COMPONENT_KEY"

    .line 70
    .line 71
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, La/j2s;->a2:La/phf0;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/y1s;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/y1s;-><init>(La/j2s;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, La/j2s;->c2:[La/iiy;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aget-object p1, p1, v1

    .line 14
    .line 15
    iget-object v2, p0, La/j2s;->Y1:La/s0r;

    .line 16
    .line 17
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p1, La/y4r;

    .line 25
    .line 26
    iget-object p1, p1, La/y4r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 27
    .line 28
    sget-object v2, La/qek0;->h:La/qek0;

    .line 29
    .line 30
    new-instance v3, La/f2s;

    .line 31
    .line 32
    invoke-direct {v3, p0, v1}, La/f2s;-><init>(La/j2s;B)V

    .line 33
    .line 34
    .line 35
    new-instance p0, La/ugd;

    .line 36
    .line 37
    const v1, 0x1acafe65

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v1, v0, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-static {p1, v2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final C0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/j2s;->I0()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, La/sal0;->a:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-wide v0, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 18
    .line 19
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v0, v1, v2}, La/sal0;->b(JLa/cb50;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, La/j2s;->c2:[La/iiy;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    aget-object v1, v1, v2

    .line 31
    .line 32
    iget-object v2, p0, La/j2s;->a2:La/phf0;

    .line 33
    .line 34
    invoke-virtual {v2, p0, v1, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    new-instance v0, La/y1s;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, p0, v1}, La/y1s;-><init>(La/j2s;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, La/j2s;->G0(Lkotlin/jvm/functions/Function0;)La/oui;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, v0, La/oui;->L:La/n5d0;

    .line 48
    .line 49
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, La/nui;

    .line 54
    .line 55
    iput-object v1, p0, La/j2s;->L1:La/nui;

    .line 56
    .line 57
    iget-object v1, v0, La/oui;->I:La/ndf0;

    .line 58
    .line 59
    iput-object v1, p0, La/j2s;->M1:La/ndf0;

    .line 60
    .line 61
    iget-object v1, v0, La/oui;->J:La/uuz;

    .line 62
    .line 63
    iput-object v1, p0, La/j2s;->N1:La/uuz;

    .line 64
    .line 65
    iget-object v1, v0, La/oui;->D:La/gfk0;

    .line 66
    .line 67
    iput-object v1, p0, La/j2s;->O1:La/gfk0;

    .line 68
    .line 69
    new-instance v1, La/nek;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, La/j2s;->P1:La/nek;

    .line 75
    .line 76
    new-instance v1, La/xak;

    .line 77
    .line 78
    const/16 v2, 0x1a

    .line 79
    .line 80
    invoke-direct {v1, v2}, La/xak;-><init>(B)V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, La/j2s;->Q1:La/xak;

    .line 84
    .line 85
    iget-object v1, v0, La/oui;->k:La/zx10;

    .line 86
    .line 87
    iput-object v1, p0, La/j2s;->R1:La/zx10;

    .line 88
    .line 89
    iget-object v1, v0, La/oui;->q:La/rmd0;

    .line 90
    .line 91
    invoke-interface {v1}, La/rmd0;->f()La/xi70;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iput-object v1, p0, La/j2s;->S1:La/xi70;

    .line 96
    .line 97
    iget-object v1, v0, La/oui;->E:La/wdk0;

    .line 98
    .line 99
    iput-object v1, p0, La/j2s;->U1:La/wdk0;

    .line 100
    .line 101
    iget-object v0, v0, La/oui;->H:La/poq0;

    .line 102
    .line 103
    iput-object v0, p0, La/j2s;->V1:La/poq0;

    .line 104
    .line 105
    return-void
.end method

.method public final G0(Lkotlin/jvm/functions/Function0;)La/oui;
    .locals 20

    .line 1
    sget-object v0, La/sal0;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, La/j2s;->I0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean v5, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->b:Z

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-wide v3, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->a:J

    .line 18
    .line 19
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-wide v6, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 24
    .line 25
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-wide v8, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->d:J

    .line 30
    .line 31
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-wide v10, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->e:J

    .line 36
    .line 37
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v12, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->f:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 42
    .line 43
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-boolean v13, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->g:Z

    .line 48
    .line 49
    new-instance v14, La/frs;

    .line 50
    .line 51
    move-object v1, v14

    .line 52
    invoke-direct/range {v1 .. v13}, La/frs;-><init>(Ljava/lang/String;JZJJJLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;Z)V

    .line 53
    .line 54
    .line 55
    new-instance v15, La/xrs;

    .line 56
    .line 57
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-wide v1, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 62
    .line 63
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-boolean v3, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->b:Z

    .line 68
    .line 69
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-wide v4, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->a:J

    .line 74
    .line 75
    move-object v0, v15

    .line 76
    invoke-direct/range {v0 .. v5}, La/xrs;-><init>(JZJ)V

    .line 77
    .line 78
    .line 79
    new-instance v0, La/npn;

    .line 80
    .line 81
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-wide v3, v1, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 86
    .line 87
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-boolean v1, v1, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->b:Z

    .line 92
    .line 93
    invoke-virtual/range {p0 .. p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget-wide v5, v2, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->a:J

    .line 98
    .line 99
    invoke-virtual/range {p0 .. p0}, La/j2s;->I0()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-direct/range {v0 .. v6}, La/npn;-><init>(ZLjava/lang/String;JJ)V

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {p0 .. p0}, La/j2s;->I0()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v19

    .line 110
    move-object/from16 v18, p0

    .line 111
    .line 112
    move-object/from16 v17, p1

    .line 113
    .line 114
    move-object/from16 v16, v0

    .line 115
    .line 116
    invoke-static/range {v14 .. v19}, La/sal0;->a(La/frs;La/xrs;La/npn;Lkotlin/jvm/functions/Function0;La/yx5;Ljava/lang/String;)La/oui;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    return-object v0
.end method

.method public final H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;
    .locals 2

    .line 1
    sget-object v0, La/j2s;->c2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/j2s;->Z1:La/khf0;

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

.method public final I0()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, La/j2s;->c2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/j2s;->a2:La/phf0;

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

.method public final J0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/j2s;->X1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
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
    invoke-virtual {p0}, La/j2s;->I0()Ljava/lang/String;

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
    invoke-virtual {p0}, La/j2s;->I0()Ljava/lang/String;

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

.method public final a()J
    .locals 2

    .line 1
    invoke-virtual {p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

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
    iget-object p0, p0, La/j2s;->R1:La/zx10;

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
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/hxm0;->m(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/j2s;->J0()La/k3t0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, La/t1s;->a:La/t1s;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 19
    .line 20
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, La/hxm0;->n(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/j2s;->J0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/r1s;->a:La/r1s;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/j2s;->U1:La/wdk0;

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
    iget-object p1, p0, La/j2s;->U1:La/wdk0;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-boolean p2, p0, La/j2s;->W1:Z

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
    .locals 3

    .line 1
    invoke-virtual {p0}, La/j2s;->I0()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, La/sal0;->a:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {p0}, La/j2s;->H0()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-wide v0, v0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 18
    .line 19
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v0, v1, v2}, La/sal0;->b(JLa/cb50;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, La/j2s;->c2:[La/iiy;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    aget-object v1, v1, v2

    .line 31
    .line 32
    iget-object v2, p0, La/j2s;->a2:La/phf0;

    .line 33
    .line 34
    invoke-virtual {v2, p0, v1, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0, p1}, La/j2s;->G0(Lkotlin/jvm/functions/Function0;)La/oui;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-object p0, p0, La/oui;->a:La/ugf0;

    .line 42
    .line 43
    return-object p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/j2s;->W1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/j2s;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
