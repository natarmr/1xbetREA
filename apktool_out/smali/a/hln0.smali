.class public final La/hln0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:La/m6m0;

.field public final B:La/cgx0;

.field public final C:La/pxv;

.field public final a:La/c1a;

.field public final b:La/ewn;

.field public final c:La/egp;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/LinkedHashMap;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/ArrayList;

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public final s:Z

.field public final t:Z

.field public final u:Z

.field public v:La/m55;

.field public final w:Ljava/util/ArrayList;

.field public final x:La/erm0;

.field public final y:La/xvk;

.field public final z:La/ugf0;


# direct methods
.method public constructor <init>(Landroid/content/Context;La/c1a;La/ewn;La/egp;)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, La/hln0;->a:La/c1a;

    move-object/from16 v2, p3

    .line 3
    iput-object v2, v0, La/hln0;->b:La/ewn;

    move-object/from16 v2, p4

    .line 4
    iput-object v2, v0, La/hln0;->c:La/egp;

    .line 5
    move-object v2, v1

    check-cast v2, La/ow9;

    .line 6
    iget-object v3, v2, La/ow9;->a:Ljava/lang/String;

    .line 7
    iput-object v3, v0, La/hln0;->d:Ljava/lang/String;

    .line 8
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v4}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    iput v4, v0, La/hln0;->e:I

    .line 9
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v0, La/hln0;->f:Ljava/util/ArrayList;

    .line 10
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v0, La/hln0;->g:Ljava/util/ArrayList;

    .line 11
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v0, La/hln0;->h:Ljava/util/ArrayList;

    .line 12
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, v0, La/hln0;->i:Ljava/util/ArrayList;

    .line 13
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, v0, La/hln0;->j:Ljava/util/ArrayList;

    .line 14
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, v0, La/hln0;->k:Ljava/util/ArrayList;

    .line 15
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v10, v0, La/hln0;->l:Ljava/util/LinkedHashMap;

    .line 16
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, v0, La/hln0;->m:Ljava/util/ArrayList;

    .line 17
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v0, La/hln0;->n:Ljava/util/ArrayList;

    .line 18
    sget-object v11, La/c1a;->a0:La/b1a;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, La/b1a;->b(La/c1a;)Z

    move-result v11

    iput-boolean v11, v0, La/hln0;->t:Z

    .line 19
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v0, La/hln0;->w:Ljava/util/ArrayList;

    .line 20
    invoke-virtual {v0}, La/hln0;->k()La/erm0;

    move-result-object v12

    iput-object v12, v0, La/hln0;->x:La/erm0;

    .line 21
    sget-object v12, La/mhk;->a:La/kpd0;

    const-class v12, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;

    .line 22
    invoke-static {}, La/mhk;->a()La/kpd0;

    move-result-object v13

    invoke-virtual {v13, v12}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    move-result-object v12

    .line 23
    check-cast v12, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;

    .line 24
    sget-object v13, La/xvk;->g:La/pek;

    move-object/from16 v14, p1

    invoke-virtual {v13, v14}, La/pek;->m(Landroid/content/Context;)La/xvk;

    move-result-object v13

    iput-object v13, v0, La/hln0;->y:La/xvk;

    .line 25
    new-instance v13, La/ugf0;

    .line 26
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 27
    sget-object v15, La/mhk;->a:La/kpd0;

    const-class v15, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;

    move/from16 p3, v11

    .line 28
    invoke-static {}, La/mhk;->a()La/kpd0;

    move-result-object v11

    invoke-virtual {v11, v15}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    move-result-object v11

    .line 29
    check-cast v11, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;

    iput-object v11, v13, La/ugf0;->a:Ljava/lang/Object;

    .line 30
    iput-object v13, v0, La/hln0;->z:La/ugf0;

    .line 31
    new-instance v11, La/m6m0;

    const/16 v13, 0xc

    .line 32
    invoke-direct {v11, v13}, La/m6m0;-><init>(B)V

    .line 33
    iput-object v11, v0, La/hln0;->A:La/m6m0;

    .line 34
    new-instance v11, La/cgx0;

    invoke-direct {v11, v1}, La/cgx0;-><init>(La/c1a;)V

    iput-object v11, v0, La/hln0;->B:La/cgx0;

    .line 35
    new-instance v13, La/pxv;

    invoke-direct {v13, v1}, La/pxv;-><init>(La/c1a;)V

    iput-object v13, v0, La/hln0;->C:La/pxv;

    .line 36
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v1}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    const/4 v13, 0x3

    if-eqz v1, :cond_1

    .line 37
    invoke-static {v1, v13}, La/tx3;->w([II)Z

    move-result v15

    iput-boolean v15, v0, La/hln0;->o:Z

    const/4 v15, 0x6

    .line 38
    invoke-static {v1, v15}, La/tx3;->w([II)Z

    move-result v15

    .line 39
    iput-boolean v15, v0, La/hln0;->p:Z

    const/16 v15, 0x10

    .line 40
    invoke-static {v1, v15}, La/tx3;->w([II)Z

    move-result v15

    .line 41
    iput-boolean v15, v0, La/hln0;->s:Z

    const/4 v15, 0x1

    .line 42
    invoke-static {v1, v15}, La/tx3;->w([II)Z

    move-result v1

    .line 43
    iput-boolean v1, v0, La/hln0;->u:Z

    .line 44
    :cond_1
    iget-boolean v1, v0, La/hln0;->o:Z

    .line 45
    iget-boolean v15, v0, La/hln0;->p:Z

    .line 46
    sget-object v16, La/piv;->a:La/n0o0;

    .line 47
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    move/from16 v16, v1

    .line 48
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v17, v12

    .line 49
    new-instance v12, La/sln0;

    invoke-direct {v12}, La/sln0;-><init>()V

    .line 50
    sget-object v18, La/wln0;->e:La/urm0;

    sget-object v14, La/vln0;->a:La/vln0;

    move/from16 v18, v15

    sget-object v15, La/tln0;->m:La/tln0;

    move-object/from16 v19, v7

    .line 51
    sget-object v7, La/wln0;->e:La/urm0;

    move-object/from16 v20, v2

    .line 52
    invoke-static {v14, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v2

    .line 53
    invoke-virtual {v12, v2}, La/sln0;->a(La/wln0;)V

    .line 54
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 56
    sget-object v12, La/vln0;->c:La/vln0;

    move-object/from16 v21, v9

    .line 57
    invoke-static {v12, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v9

    .line 58
    invoke-virtual {v2, v9}, La/sln0;->a(La/wln0;)V

    .line 59
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 61
    sget-object v9, La/vln0;->b:La/vln0;

    move-object/from16 v22, v10

    .line 62
    invoke-static {v9, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v10

    .line 63
    invoke-virtual {v2, v10}, La/sln0;->a(La/wln0;)V

    .line 64
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 66
    sget-object v10, La/tln0;->f:La/tln0;

    move-object/from16 v23, v11

    .line 67
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 68
    invoke-static {v2, v11, v12, v15, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 69
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 70
    invoke-static {v9, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 71
    invoke-static {v2, v11, v12, v15, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 72
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 73
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 74
    invoke-static {v2, v11, v14, v10, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 75
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 76
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 77
    invoke-static {v2, v11, v9, v10, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 78
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 79
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 80
    invoke-static {v2, v11, v9, v10, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 81
    invoke-static {v12, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 82
    invoke-virtual {v2, v11}, La/sln0;->a(La/wln0;)V

    .line 83
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz v4, :cond_2

    const/4 v1, 0x1

    if-eq v4, v1, :cond_2

    const/4 v1, 0x3

    if-eq v4, v1, :cond_2

    const/4 v1, 0x4

    if-eq v4, v1, :cond_2

    move-object/from16 v24, v5

    :goto_1
    const/4 v1, 0x1

    goto/16 :goto_2

    .line 85
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 86
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 87
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 88
    invoke-virtual {v2, v11}, La/sln0;->a(La/wln0;)V

    .line 89
    sget-object v11, La/tln0;->l:La/tln0;

    move-object/from16 v24, v5

    .line 90
    invoke-static {v14, v11, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v5

    .line 91
    invoke-virtual {v2, v5}, La/sln0;->a(La/wln0;)V

    .line 92
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 94
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v5

    .line 95
    invoke-static {v2, v5, v9, v11, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 96
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 97
    invoke-static {v9, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v5

    .line 98
    invoke-static {v2, v5, v9, v11, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 99
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 100
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v5

    .line 101
    invoke-static {v2, v5, v14, v11, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 102
    invoke-static {v12, v11, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v5

    .line 103
    invoke-virtual {v2, v5}, La/sln0;->a(La/wln0;)V

    .line 104
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 106
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v5

    .line 107
    invoke-static {v2, v5, v9, v11, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 108
    invoke-static {v12, v11, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v5

    .line 109
    invoke-virtual {v2, v5}, La/sln0;->a(La/wln0;)V

    .line 110
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 112
    invoke-static {v9, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v5

    .line 113
    invoke-static {v2, v5, v9, v10, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 114
    invoke-static {v12, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v5

    .line 115
    invoke-virtual {v2, v5}, La/sln0;->a(La/wln0;)V

    .line 116
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :goto_2
    if-eq v4, v1, :cond_3

    const/4 v2, 0x3

    if-eq v4, v2, :cond_3

    goto :goto_3

    .line 118
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 119
    new-instance v5, La/sln0;

    invoke-direct {v5}, La/sln0;-><init>()V

    .line 120
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 121
    invoke-static {v5, v11, v14, v15, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 122
    invoke-static {v2, v5}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v5

    .line 123
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 124
    invoke-static {v5, v11, v9, v15, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 125
    invoke-static {v2, v5}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v5

    .line 126
    invoke-static {v9, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 127
    invoke-static {v5, v11, v9, v15, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 128
    invoke-static {v2, v5}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v5

    .line 129
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 130
    invoke-static {v5, v11, v14, v10, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 131
    invoke-static {v12, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 132
    invoke-virtual {v5, v11}, La/sln0;->a(La/wln0;)V

    .line 133
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    new-instance v5, La/sln0;

    invoke-direct {v5}, La/sln0;-><init>()V

    .line 135
    sget-object v11, La/tln0;->c:La/tln0;

    .line 136
    invoke-static {v9, v11, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v1

    .line 137
    invoke-static {v5, v1, v14, v10, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 138
    invoke-static {v9, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v1

    .line 139
    invoke-virtual {v5, v1}, La/sln0;->a(La/wln0;)V

    .line 140
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    new-instance v1, La/sln0;

    invoke-direct {v1}, La/sln0;-><init>()V

    .line 142
    invoke-static {v9, v11, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v5

    .line 143
    invoke-static {v1, v5, v9, v10, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 144
    invoke-static {v9, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v5

    .line 145
    invoke-virtual {v1, v5}, La/sln0;->a(La/wln0;)V

    .line 146
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :goto_3
    if-eqz v16, :cond_4

    .line 148
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 149
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 150
    sget-object v5, La/vln0;->e:La/vln0;

    .line 151
    invoke-static {v5, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 152
    invoke-virtual {v2, v11}, La/sln0;->a(La/wln0;)V

    .line 153
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 155
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 156
    invoke-static {v2, v11, v5, v15, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 157
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 158
    invoke-static {v9, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 159
    invoke-static {v2, v11, v5, v15, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 160
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 161
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 162
    invoke-static {v2, v11, v14, v10, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 163
    invoke-static {v5, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 164
    invoke-virtual {v2, v11}, La/sln0;->a(La/wln0;)V

    .line 165
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 167
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 168
    invoke-static {v2, v11, v9, v10, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 169
    invoke-static {v5, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 170
    invoke-virtual {v2, v11}, La/sln0;->a(La/wln0;)V

    .line 171
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 173
    invoke-static {v9, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 174
    invoke-static {v2, v11, v9, v10, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 175
    invoke-static {v5, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 176
    invoke-virtual {v2, v11}, La/sln0;->a(La/wln0;)V

    .line 177
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 179
    invoke-static {v14, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 180
    invoke-static {v2, v11, v12, v15, v7}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 181
    invoke-static {v5, v15, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 182
    invoke-virtual {v2, v11}, La/sln0;->a(La/wln0;)V

    .line 183
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 185
    invoke-static {v9, v10, v7}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v7

    .line 186
    invoke-virtual {v2, v7}, La/sln0;->a(La/wln0;)V

    .line 187
    invoke-static {v12, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v7

    invoke-virtual {v2, v7}, La/sln0;->a(La/wln0;)V

    .line 188
    invoke-static {v5, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v5

    invoke-virtual {v2, v5}, La/sln0;->a(La/wln0;)V

    .line 189
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_4
    if-eqz v18, :cond_5

    if-nez v4, :cond_5

    .line 191
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 192
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 193
    invoke-static {v14, v10, v2, v14, v15}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 194
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 195
    invoke-static {v14, v10, v2, v9, v15}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 196
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 197
    invoke-static {v9, v10, v2, v9, v15}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 198
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_5
    const/4 v1, 0x3

    if-ne v4, v1, :cond_6

    .line 200
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 201
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 202
    invoke-static {v14, v10}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 203
    sget-object v4, La/tln0;->c:La/tln0;

    .line 204
    invoke-static {v14, v4, v2, v9, v15}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 205
    sget-object v5, La/vln0;->e:La/vln0;

    invoke-static {v5, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v7

    invoke-virtual {v2, v7}, La/sln0;->a(La/wln0;)V

    .line 206
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 208
    invoke-static {v14, v10, v2, v14, v4}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 209
    invoke-static {v12, v15, v2, v5, v15}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 210
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 212
    :cond_6
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 213
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v17, :cond_c

    .line 214
    sget-object v1, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->a:La/sln0;

    .line 215
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 216
    const-string v2, "heroqltevzw"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    .line 217
    const-string v2, "heroqltetmo"

    .line 218
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_5

    .line 219
    :cond_7
    invoke-static {}, La/mbc;->c0()Z

    move-result v1

    if-nez v1, :cond_9

    .line 220
    invoke-static {}, La/mbc;->d0()Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    .line 221
    :cond_8
    sget-object v1, La/iun;->a:La/iun;

    goto :goto_6

    .line 222
    :cond_9
    :goto_4
    sget-object v1, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->b:La/sln0;

    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_6

    .line 223
    :cond_a
    :goto_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 224
    const-string v2, "1"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 225
    sget-object v2, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->a:La/sln0;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_6
    if-nez v1, :cond_d

    .line 226
    :cond_c
    sget-object v1, La/iun;->a:La/iun;

    .line 227
    :cond_d
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 228
    iget-boolean v1, v0, La/hln0;->s:Z

    if-eqz v1, :cond_e

    .line 229
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 230
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 231
    sget-object v3, La/tln0;->p:La/tln0;

    .line 232
    invoke-static {v9, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 233
    sget-object v4, La/tln0;->l:La/tln0;

    invoke-static {v14, v4}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v5

    invoke-virtual {v2, v5}, La/sln0;->a(La/wln0;)V

    .line 234
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 236
    invoke-static {v12, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 237
    invoke-static {v14, v4}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v5

    invoke-virtual {v2, v5}, La/sln0;->a(La/wln0;)V

    .line 238
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 240
    sget-object v5, La/vln0;->e:La/vln0;

    .line 241
    invoke-static {v5, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 242
    invoke-static {v14, v4}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 243
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 245
    invoke-static {v9, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 246
    invoke-static {v12, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 247
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 249
    invoke-static {v12, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 250
    invoke-static {v12, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 251
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 253
    invoke-static {v5, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 254
    invoke-static {v12, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 255
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 257
    invoke-static {v9, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 258
    invoke-static {v9, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 259
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 261
    invoke-static {v12, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 262
    invoke-static {v9, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 263
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 265
    invoke-static {v5, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 266
    invoke-static {v9, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 267
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 269
    invoke-static {v9, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 270
    invoke-static {v5, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 271
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 273
    invoke-static {v12, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 274
    invoke-static {v5, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 275
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 277
    invoke-static {v5, v3, v2, v14, v10}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 278
    invoke-static {v5, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v3

    invoke-virtual {v2, v3}, La/sln0;->a(La/wln0;)V

    .line 279
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 281
    :cond_e
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.camera.concurrent"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    .line 282
    iput-boolean v1, v0, La/hln0;->q:Z

    if-eqz v1, :cond_f

    .line 283
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 284
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 285
    sget-object v3, La/tln0;->i:La/tln0;

    invoke-static {v9, v3}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 286
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 288
    invoke-static {v14, v3}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 289
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 291
    invoke-static {v12, v3}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 292
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 294
    sget-object v4, La/tln0;->e:La/tln0;

    .line 295
    invoke-static {v9, v4, v2, v12, v3}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 296
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 297
    invoke-static {v14, v4, v2, v12, v3}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 298
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 299
    invoke-static {v9, v4, v2, v9, v3}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 300
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 301
    invoke-static {v9, v4, v2, v14, v3}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 302
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 303
    invoke-static {v14, v4, v2, v9, v3}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 304
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 305
    invoke-static {v14, v4, v2, v14, v3}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 306
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v24

    .line 307
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_f
    move-object/from16 v1, v23

    .line 308
    iget-boolean v1, v1, La/cgx0;->b:Z

    if-eqz v1, :cond_10

    .line 309
    new-instance v1, La/sln0;

    invoke-direct {v1}, La/sln0;-><init>()V

    .line 310
    invoke-static {v14, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v2

    invoke-virtual {v1, v2}, La/sln0;->a(La/wln0;)V

    .line 311
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 312
    invoke-static {v9, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v3

    invoke-virtual {v2, v3}, La/sln0;->a(La/wln0;)V

    .line 313
    new-instance v3, La/sln0;

    invoke-direct {v3}, La/sln0;-><init>()V

    .line 314
    invoke-static {v14, v10}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v3, v4}, La/sln0;->a(La/wln0;)V

    .line 315
    invoke-static {v12, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v3, v4}, La/sln0;->a(La/wln0;)V

    .line 316
    new-instance v4, La/sln0;

    invoke-direct {v4}, La/sln0;-><init>()V

    .line 317
    invoke-static {v14, v10}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v5

    invoke-virtual {v4, v5}, La/sln0;->a(La/wln0;)V

    .line 318
    invoke-static {v9, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v5

    invoke-virtual {v4, v5}, La/sln0;->a(La/wln0;)V

    .line 319
    new-instance v5, La/sln0;

    invoke-direct {v5}, La/sln0;-><init>()V

    .line 320
    invoke-static {v9, v10}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v6

    invoke-virtual {v5, v6}, La/sln0;->a(La/wln0;)V

    .line 321
    invoke-static {v9, v15}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v6

    invoke-virtual {v5, v6}, La/sln0;->a(La/wln0;)V

    .line 322
    new-instance v6, La/sln0;

    invoke-direct {v6}, La/sln0;-><init>()V

    .line 323
    invoke-static {v14, v10}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v7

    invoke-virtual {v6, v7}, La/sln0;->a(La/wln0;)V

    .line 324
    sget-object v7, La/tln0;->l:La/tln0;

    invoke-static {v14, v7}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v8

    invoke-virtual {v6, v8}, La/sln0;->a(La/wln0;)V

    .line 325
    new-instance v8, La/sln0;

    invoke-direct {v8}, La/sln0;-><init>()V

    .line 326
    invoke-static {v14, v10, v8, v14, v7}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 327
    invoke-static {v9, v7}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v11

    invoke-virtual {v8, v11}, La/sln0;->a(La/wln0;)V

    .line 328
    new-instance v11, La/sln0;

    invoke-direct {v11}, La/sln0;-><init>()V

    .line 329
    invoke-static {v14, v10, v11, v14, v7}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 330
    invoke-static {v12, v7}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v7

    invoke-virtual {v11, v7}, La/sln0;->a(La/wln0;)V

    move-object/from16 v23, v1

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    move-object/from16 v27, v5

    move-object/from16 v28, v6

    move-object/from16 v29, v8

    move-object/from16 v30, v11

    .line 331
    filled-new-array/range {v23 .. v30}, [La/sln0;

    move-result-object v1

    .line 332
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v2, v22

    .line 333
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_10
    if-eqz p3, :cond_11

    .line 334
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 335
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 336
    sget-object v3, La/tln0;->i:La/tln0;

    invoke-static {v14, v3}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 337
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 339
    invoke-static {v9, v3}, La/y2m0;->b(La/vln0;La/tln0;)La/wln0;

    move-result-object v4

    invoke-virtual {v2, v4}, La/sln0;->a(La/wln0;)V

    .line 340
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 342
    invoke-static {v14, v3, v2, v12, v15}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 343
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 344
    invoke-static {v9, v3, v2, v12, v15}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 345
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 346
    invoke-static {v14, v3, v2, v9, v15}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 347
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 348
    invoke-static {v9, v3, v2, v9, v15}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 349
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 350
    invoke-static {v14, v10, v2, v14, v3}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 351
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 352
    invoke-static {v9, v10, v2, v14, v3}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 353
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 354
    invoke-static {v14, v10, v2, v9, v3}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 355
    invoke-static {v1, v2}, La/axq;->e(Ljava/util/ArrayList;La/sln0;)La/sln0;

    move-result-object v2

    .line 356
    invoke-static {v9, v10, v2, v9, v3}, La/brm0;->y(La/vln0;La/tln0;La/sln0;La/vln0;La/tln0;)V

    .line 357
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v21

    .line 358
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 359
    :cond_11
    sget-object v1, La/vrm0;->a:La/u15;

    .line 360
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    const/4 v3, 0x0

    if-ge v1, v2, :cond_12

    goto :goto_7

    .line 361
    :cond_12
    invoke-static {}, La/uq6;->e()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v5, v20

    invoke-virtual {v5, v4}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [J

    if-eqz v4, :cond_14

    .line 362
    array-length v4, v4

    if-nez v4, :cond_13

    goto :goto_7

    :cond_13
    const/4 v3, 0x1

    .line 363
    :cond_14
    :goto_7
    iput-boolean v3, v0, La/hln0;->r:Z

    if-eqz v3, :cond_15

    if-lt v1, v2, :cond_15

    .line 364
    new-instance v1, La/sln0;

    invoke-direct {v1}, La/sln0;-><init>()V

    .line 365
    sget-object v2, La/tln0;->i:La/tln0;

    .line 366
    sget-object v3, La/urm0;->f:La/urm0;

    .line 367
    invoke-static {v14, v2, v3}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v4

    .line 368
    invoke-virtual {v1, v4}, La/sln0;->a(La/wln0;)V

    .line 369
    new-instance v4, La/sln0;

    invoke-direct {v4}, La/sln0;-><init>()V

    .line 370
    invoke-static {v9, v2, v3}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v2

    .line 371
    invoke-virtual {v4, v2}, La/sln0;->a(La/wln0;)V

    .line 372
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    .line 373
    sget-object v3, La/tln0;->l:La/tln0;

    .line 374
    sget-object v5, La/urm0;->d:La/urm0;

    .line 375
    invoke-static {v14, v3, v5}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v6

    .line 376
    invoke-virtual {v2, v6}, La/sln0;->a(La/wln0;)V

    .line 377
    new-instance v6, La/sln0;

    invoke-direct {v6}, La/sln0;-><init>()V

    .line 378
    invoke-static {v9, v3, v5}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v7

    .line 379
    invoke-virtual {v6, v7}, La/sln0;->a(La/wln0;)V

    .line 380
    new-instance v7, La/sln0;

    invoke-direct {v7}, La/sln0;-><init>()V

    .line 381
    sget-object v8, La/urm0;->e:La/urm0;

    .line 382
    invoke-static {v12, v15, v8}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v11

    .line 383
    invoke-virtual {v7, v11}, La/sln0;->a(La/wln0;)V

    .line 384
    new-instance v11, La/sln0;

    invoke-direct {v11}, La/sln0;-><init>()V

    .line 385
    invoke-static {v9, v15, v8}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v13

    .line 386
    invoke-virtual {v11, v13}, La/sln0;->a(La/wln0;)V

    .line 387
    new-instance v13, La/sln0;

    invoke-direct {v13}, La/sln0;-><init>()V

    .line 388
    sget-object v0, La/urm0;->c:La/urm0;

    move-object/from16 v20, v1

    invoke-static {v14, v10, v0}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v1

    .line 389
    invoke-virtual {v13, v1}, La/sln0;->a(La/wln0;)V

    .line 390
    invoke-static {v12, v15, v8}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v1

    .line 391
    invoke-virtual {v13, v1}, La/sln0;->a(La/wln0;)V

    .line 392
    new-instance v1, La/sln0;

    invoke-direct {v1}, La/sln0;-><init>()V

    move-object/from16 v22, v2

    .line 393
    invoke-static {v14, v10, v0}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v2

    .line 394
    invoke-virtual {v1, v2}, La/sln0;->a(La/wln0;)V

    .line 395
    invoke-static {v9, v15, v8}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v2

    .line 396
    invoke-virtual {v1, v2}, La/sln0;->a(La/wln0;)V

    .line 397
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    move-object/from16 v27, v1

    .line 398
    invoke-static {v14, v10, v0}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v1

    .line 399
    invoke-virtual {v2, v1}, La/sln0;->a(La/wln0;)V

    .line 400
    invoke-static {v14, v3, v5}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v1

    .line 401
    invoke-virtual {v2, v1}, La/sln0;->a(La/wln0;)V

    .line 402
    new-instance v1, La/sln0;

    invoke-direct {v1}, La/sln0;-><init>()V

    move-object/from16 v28, v2

    .line 403
    invoke-static {v14, v10, v0}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v2

    .line 404
    invoke-virtual {v1, v2}, La/sln0;->a(La/wln0;)V

    .line 405
    invoke-static {v9, v3, v5}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v2

    .line 406
    invoke-virtual {v1, v2}, La/sln0;->a(La/wln0;)V

    .line 407
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    move-object/from16 v29, v1

    .line 408
    invoke-static {v14, v10, v0}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v1

    .line 409
    invoke-virtual {v2, v1}, La/sln0;->a(La/wln0;)V

    .line 410
    invoke-static {v9, v10, v0}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v1

    .line 411
    invoke-virtual {v2, v1}, La/sln0;->a(La/wln0;)V

    .line 412
    new-instance v1, La/sln0;

    invoke-direct {v1}, La/sln0;-><init>()V

    move-object/from16 v30, v2

    .line 413
    invoke-static {v14, v10, v0}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v2

    .line 414
    invoke-static {v1, v2, v14, v3, v5}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 415
    invoke-static {v12, v3, v8}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v2

    .line 416
    invoke-virtual {v1, v2}, La/sln0;->a(La/wln0;)V

    .line 417
    new-instance v2, La/sln0;

    invoke-direct {v2}, La/sln0;-><init>()V

    move-object/from16 v31, v1

    .line 418
    invoke-static {v14, v10, v0}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v1

    .line 419
    invoke-static {v2, v1, v9, v3, v5}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 420
    invoke-static {v12, v3, v8}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v1

    .line 421
    invoke-virtual {v2, v1}, La/sln0;->a(La/wln0;)V

    .line 422
    new-instance v1, La/sln0;

    invoke-direct {v1}, La/sln0;-><init>()V

    .line 423
    invoke-static {v14, v10, v0}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v3

    .line 424
    invoke-static {v1, v3, v9, v10, v0}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 425
    invoke-static {v12, v15, v8}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    move-result-object v0

    .line 426
    invoke-virtual {v1, v0}, La/sln0;->a(La/wln0;)V

    move-object/from16 v33, v1

    move-object/from16 v32, v2

    move-object/from16 v21, v4

    move-object/from16 v23, v6

    move-object/from16 v24, v7

    move-object/from16 v25, v11

    move-object/from16 v26, v13

    .line 427
    filled-new-array/range {v20 .. v33}, [La/sln0;

    move-result-object v0

    .line 428
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, v19

    .line 429
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 430
    :cond_15
    invoke-virtual/range {p0 .. p0}, La/hln0;->c()V

    return-void
.end method

.method public static b(La/hln0;La/gln0;Ljava/util/ArrayList;)Z
    .locals 6

    .line 1
    sget-object v3, La/lun;->a:La/lun;

    .line 2
    .line 3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v4, La/iun;->a:La/iun;

    .line 7
    .line 8
    move-object v5, v4

    .line 9
    move-object v0, p0

    .line 10
    move-object v1, p1

    .line 11
    move-object v2, p2

    .line 12
    invoke-virtual/range {v0 .. v5}, La/hln0;->a(La/gln0;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static d(Landroid/util/Range;I[Landroid/util/Range;)Landroid/util/Range;
    .locals 19

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    sget-object v2, La/h55;->h:Landroid/util/Range;

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_0
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :cond_1
    new-instance v4, Landroid/util/Range;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    check-cast v5, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v3}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    check-cast v3, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-direct {v4, v5, v3}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 70
    .line 71
    .line 72
    array-length v3, v1

    .line 73
    const/4 v5, 0x0

    .line 74
    move v6, v5

    .line 75
    :goto_0
    if-ge v5, v3, :cond_f

    .line 76
    .line 77
    aget-object v7, v1, v5

    .line 78
    .line 79
    invoke-virtual {v7}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-ge v0, v8, :cond_2

    .line 90
    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :cond_2
    sget-object v8, La/h55;->h:Landroid/util/Range;

    .line 94
    .line 95
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_3

    .line 100
    .line 101
    move-object v2, v7

    .line 102
    :cond_3
    invoke-virtual {v7, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_4

    .line 107
    .line 108
    move-object v2, v7

    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :cond_4
    :try_start_0
    invoke-virtual {v7, v4}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {v8}, La/hln0;->i(Landroid/util/Range;)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-nez v6, :cond_5

    .line 123
    .line 124
    move-object v2, v7

    .line 125
    move v6, v8

    .line 126
    goto/16 :goto_3

    .line 127
    .line 128
    :cond_5
    if-lt v8, v6, :cond_e

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {v8}, La/hln0;->i(Landroid/util/Range;)I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    int-to-double v8, v8

    .line 145
    invoke-virtual {v7, v4}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-static {v10}, La/hln0;->i(Landroid/util/Range;)I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    int-to-double v10, v10

    .line 157
    invoke-static {v7}, La/hln0;->i(Landroid/util/Range;)I

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    int-to-double v12, v12

    .line 162
    div-double v12, v10, v12

    .line 163
    .line 164
    invoke-static {v2}, La/hln0;->i(Landroid/util/Range;)I

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    int-to-double v14, v14

    .line 169
    div-double v14, v8, v14

    .line 170
    .line 171
    cmpl-double v16, v10, v8

    .line 172
    .line 173
    const-wide/high16 v17, 0x3fe0000000000000L    # 0.5

    .line 174
    .line 175
    if-lez v16, :cond_6

    .line 176
    .line 177
    cmpl-double v8, v12, v17

    .line 178
    .line 179
    if-gez v8, :cond_9

    .line 180
    .line 181
    cmpl-double v8, v12, v14

    .line 182
    .line 183
    if-ltz v8, :cond_a

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_6
    cmpg-double v8, v10, v8

    .line 187
    .line 188
    if-nez v8, :cond_8

    .line 189
    .line 190
    cmpl-double v8, v12, v14

    .line 191
    .line 192
    if-lez v8, :cond_7

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_7
    cmpg-double v8, v12, v14

    .line 196
    .line 197
    if-nez v8, :cond_a

    .line 198
    .line 199
    invoke-virtual {v7}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    check-cast v8, Ljava/lang/Number;

    .line 204
    .line 205
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    invoke-virtual {v2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    check-cast v9, Ljava/lang/Number;

    .line 214
    .line 215
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    if-le v8, v9, :cond_a

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_8
    cmpg-double v8, v14, v17

    .line 223
    .line 224
    if-gez v8, :cond_a

    .line 225
    .line 226
    cmpl-double v8, v12, v14

    .line 227
    .line 228
    if-lez v8, :cond_a

    .line 229
    .line 230
    :cond_9
    :goto_1
    move-object v2, v7

    .line 231
    :cond_a
    invoke-virtual {v4, v2}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-static {v8}, La/hln0;->i(Landroid/util/Range;)I

    .line 239
    .line 240
    .line 241
    move-result v6
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    goto :goto_3

    .line 243
    :catch_0
    if-eqz v6, :cond_b

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_b
    invoke-static {v7, v4}, La/hln0;->h(Landroid/util/Range;Landroid/util/Range;)I

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-static {v2, v4}, La/hln0;->h(Landroid/util/Range;Landroid/util/Range;)I

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    if-ge v8, v9, :cond_c

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_c
    invoke-static {v7, v4}, La/hln0;->h(Landroid/util/Range;Landroid/util/Range;)I

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    invoke-static {v2, v4}, La/hln0;->h(Landroid/util/Range;Landroid/util/Range;)I

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    if-ne v8, v9, :cond_e

    .line 269
    .line 270
    invoke-virtual {v7}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    check-cast v8, Ljava/lang/Number;

    .line 275
    .line 276
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    check-cast v9, Ljava/lang/Number;

    .line 285
    .line 286
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    if-le v8, v9, :cond_d

    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_d
    invoke-static {v7}, La/hln0;->i(Landroid/util/Range;)I

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    invoke-static {v2}, La/hln0;->i(Landroid/util/Range;)I

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    if-ge v8, v9, :cond_e

    .line 302
    .line 303
    :goto_2
    move-object v2, v7

    .line 304
    :cond_e
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 305
    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :cond_f
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    return-object v2
.end method

.method public static f(Landroid/hardware/camera2/params/StreamConfigurationMap;IZLandroid/util/Rational;)Landroid/util/Size;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 3
    .line 4
    const/16 v1, 0x22

    .line 5
    .line 6
    if-ne p1, v1, :cond_1

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const-class v1, Landroid/graphics/SurfaceTexture;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    .line 24
    .line 25
    .line 26
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_1

    .line 28
    :goto_0
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 29
    .line 30
    new-instance v2, La/g0g0;

    .line 31
    .line 32
    invoke-direct {v2, v1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    move-object v1, v2

    .line 36
    :goto_1
    nop

    .line 37
    instance-of v2, v1, La/g0g0;

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    move-object v1, v0

    .line 42
    :cond_2
    check-cast v1, [Landroid/util/Size;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    if-eqz p3, :cond_6

    .line 48
    .line 49
    new-instance v3, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    array-length v4, v1

    .line 55
    move v5, v2

    .line 56
    :goto_2
    if-ge v5, v4, :cond_4

    .line 57
    .line 58
    aget-object v6, v1, v5

    .line 59
    .line 60
    invoke-static {p3, v6}, La/ky3;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_3

    .line 65
    .line 66
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    new-array p3, v2, [Landroid/util/Size;

    .line 73
    .line 74
    invoke-virtual {v3, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    move-object v1, p3

    .line 79
    check-cast v1, [Landroid/util/Size;

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    move-object v1, v0

    .line 83
    :cond_6
    :goto_3
    if-eqz v1, :cond_b

    .line 84
    .line 85
    array-length p3, v1

    .line 86
    if-nez p3, :cond_7

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_7
    new-instance p3, La/ycd;

    .line 90
    .line 91
    invoke-direct {p3, v2}, La/ycd;-><init>(Z)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {v1, p3}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Landroid/util/Size;

    .line 106
    .line 107
    sget-object v2, La/v7k0;->a:Landroid/util/Size;

    .line 108
    .line 109
    if-eqz p2, :cond_a

    .line 110
    .line 111
    if-eqz p0, :cond_8

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getHighResolutionOutputSizes(I)[Landroid/util/Size;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    :cond_8
    if-eqz v0, :cond_a

    .line 118
    .line 119
    array-length p0, v0

    .line 120
    if-nez p0, :cond_9

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_9
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {p0, p3}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    move-object v2, p0

    .line 135
    check-cast v2, Landroid/util/Size;

    .line 136
    .line 137
    :cond_a
    :goto_4
    filled-new-array {v1, v2}, [Landroid/util/Size;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0, p3}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    check-cast p0, Landroid/util/Size;

    .line 150
    .line 151
    return-object p0

    .line 152
    :cond_b
    :goto_5
    return-object v0
.end method

.method public static h(Landroid/util/Range;Landroid/util/Range;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-le v0, v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    check-cast p1, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    sub-int/2addr p0, p1

    .line 67
    return p0

    .line 68
    :cond_0
    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast p0, Ljava/lang/Number;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    sub-int/2addr p1, p0

    .line 92
    return p1

    .line 93
    :cond_1
    const-string p0, "Ranges must not intersect"

    .line 94
    .line 95
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 p0, 0x0

    .line 99
    return p0
.end method

.method public static i(Landroid/util/Range;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast p0, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    sub-int/2addr v0, p0

    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    return v0
.end method

.method public static o(Landroid/util/Range;Landroid/util/Range;Z)Landroid/util/Range;
    .locals 2

    .line 1
    sget-object v0, La/h55;->h:Landroid/util/Range;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    if-eqz p2, :cond_3

    .line 34
    .line 35
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const-string p2, "All targetFrameRate should be the same if strict fps is required"

    .line 40
    .line 41
    invoke-static {p2, p1}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    :try_start_0
    invoke-virtual {p1, p0}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :catch_0
    :goto_0
    return-object p1
.end method


# virtual methods
.method public final a(La/gln0;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Z
    .locals 22

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
    move-object/from16 v3, p4

    .line 8
    .line 9
    iget-object v4, v1, La/gln0;->d:La/rfu0;

    .line 10
    .line 11
    iget-boolean v5, v1, La/gln0;->h:Z

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v8, v0, La/hln0;->l:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-interface {v8, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v9

    .line 33
    const-string v10, "Required value was null."

    .line 34
    .line 35
    if-eqz v9, :cond_0

    .line 36
    .line 37
    invoke-virtual {v8, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast v8, Ljava/util/List;

    .line 45
    .line 46
    move/from16 v18, v5

    .line 47
    .line 48
    move-object/from16 v20, v7

    .line 49
    .line 50
    move-object/from16 v19, v10

    .line 51
    .line 52
    const/16 v16, 0x0

    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_0
    new-instance v9, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    iget v13, v1, La/gln0;->a:I

    .line 62
    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    sget-object v13, La/piv;->a:La/n0o0;

    .line 66
    .line 67
    iget-object v13, v0, La/hln0;->a:La/c1a;

    .line 68
    .line 69
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance v14, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    const/16 v11, 0x23

    .line 85
    .line 86
    if-lt v15, v11, :cond_3

    .line 87
    .line 88
    invoke-static {}, La/oa3;->x()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 89
    .line 90
    .line 91
    move-result-object v15

    .line 92
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast v13, La/ow9;

    .line 96
    .line 97
    invoke-virtual {v13, v15}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    if-eqz v13, :cond_2

    .line 102
    .line 103
    check-cast v13, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    if-lt v13, v11, :cond_1

    .line 110
    .line 111
    sget-object v11, La/rfu0;->d:La/rfu0;

    .line 112
    .line 113
    if-eq v4, v11, :cond_1

    .line 114
    .line 115
    sget-object v11, La/piv;->a:La/n0o0;

    .line 116
    .line 117
    invoke-virtual {v11}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    check-cast v11, Ljava/util/List;

    .line 122
    .line 123
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 124
    .line 125
    .line 126
    :cond_1
    const/16 v11, 0x24

    .line 127
    .line 128
    if-lt v13, v11, :cond_3

    .line 129
    .line 130
    sget-object v11, La/rfu0;->e:La/rfu0;

    .line 131
    .line 132
    if-eq v4, v11, :cond_3

    .line 133
    .line 134
    sget-object v11, La/piv;->b:La/n0o0;

    .line 135
    .line 136
    invoke-virtual {v11}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    check-cast v11, Ljava/util/List;

    .line 141
    .line 142
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_2
    invoke-static {v10}, La/jf4;->o(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return v16

    .line 150
    :cond_3
    :goto_0
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 151
    .line 152
    .line 153
    move/from16 v18, v5

    .line 154
    .line 155
    move-object/from16 v20, v7

    .line 156
    .line 157
    move-object/from16 v19, v10

    .line 158
    .line 159
    goto/16 :goto_3

    .line 160
    .line 161
    :cond_4
    const/16 v16, 0x0

    .line 162
    .line 163
    iget-boolean v11, v1, La/gln0;->e:Z

    .line 164
    .line 165
    if-eqz v11, :cond_6

    .line 166
    .line 167
    iget-object v11, v0, La/hln0;->n:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    if-eqz v14, :cond_5

    .line 174
    .line 175
    sget-object v14, La/piv;->a:La/n0o0;

    .line 176
    .line 177
    new-instance v14, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    new-instance v15, La/sln0;

    .line 183
    .line 184
    invoke-direct {v15}, La/sln0;-><init>()V

    .line 185
    .line 186
    .line 187
    sget-object v17, La/wln0;->e:La/urm0;

    .line 188
    .line 189
    sget-object v6, La/vln0;->d:La/vln0;

    .line 190
    .line 191
    sget-object v12, La/tln0;->m:La/tln0;

    .line 192
    .line 193
    move/from16 v18, v5

    .line 194
    .line 195
    sget-object v5, La/wln0;->e:La/urm0;

    .line 196
    .line 197
    move-object/from16 v19, v10

    .line 198
    .line 199
    invoke-static {v6, v12, v5}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    invoke-virtual {v15, v10}, La/sln0;->a(La/wln0;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    new-instance v10, La/sln0;

    .line 210
    .line 211
    invoke-direct {v10}, La/sln0;-><init>()V

    .line 212
    .line 213
    .line 214
    sget-object v15, La/vln0;->a:La/vln0;

    .line 215
    .line 216
    move-object/from16 v20, v7

    .line 217
    .line 218
    sget-object v7, La/tln0;->f:La/tln0;

    .line 219
    .line 220
    invoke-static {v15, v7, v5}, La/y2m0;->a(La/vln0;La/tln0;La/urm0;)La/wln0;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    invoke-static {v10, v7, v6, v12, v5}, La/axq;->v(La/sln0;La/wln0;La/vln0;La/tln0;La/urm0;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_5
    move/from16 v18, v5

    .line 235
    .line 236
    move-object/from16 v20, v7

    .line 237
    .line 238
    move-object/from16 v19, v10

    .line 239
    .line 240
    :goto_1
    if-nez v13, :cond_e

    .line 241
    .line 242
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 243
    .line 244
    .line 245
    goto/16 :goto_3

    .line 246
    .line 247
    :cond_6
    move/from16 v18, v5

    .line 248
    .line 249
    move-object/from16 v20, v7

    .line 250
    .line 251
    move-object/from16 v19, v10

    .line 252
    .line 253
    iget-boolean v5, v1, La/gln0;->f:Z

    .line 254
    .line 255
    if-eqz v5, :cond_9

    .line 256
    .line 257
    iget-object v5, v0, La/hln0;->k:Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    if-eqz v6, :cond_8

    .line 264
    .line 265
    iget-object v6, v0, La/hln0;->C:La/pxv;

    .line 266
    .line 267
    iget-object v7, v6, La/pxv;->b:La/n0o0;

    .line 268
    .line 269
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    check-cast v7, Ljava/lang/Boolean;

    .line 274
    .line 275
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 276
    .line 277
    .line 278
    move-result v7

    .line 279
    if-nez v7, :cond_7

    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_7
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 283
    .line 284
    .line 285
    iget-object v6, v6, La/pxv;->c:La/n0o0;

    .line 286
    .line 287
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    move-object v11, v6

    .line 292
    check-cast v11, Landroid/util/Size;

    .line 293
    .line 294
    if-eqz v11, :cond_8

    .line 295
    .line 296
    const/16 v6, 0x22

    .line 297
    .line 298
    invoke-virtual {v0, v6}, La/hln0;->n(I)La/m55;

    .line 299
    .line 300
    .line 301
    move-result-object v12

    .line 302
    sget-object v6, La/piv;->a:La/n0o0;

    .line 303
    .line 304
    new-instance v6, Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 307
    .line 308
    .line 309
    sget-object v7, La/wln0;->e:La/urm0;

    .line 310
    .line 311
    sget-object v14, La/uln0;->b:La/uln0;

    .line 312
    .line 313
    sget-object v15, La/wln0;->e:La/urm0;

    .line 314
    .line 315
    const/16 v10, 0x22

    .line 316
    .line 317
    const/4 v13, 0x0

    .line 318
    invoke-static/range {v10 .. v15}, La/y2m0;->d(ILandroid/util/Size;La/m55;ILa/uln0;La/urm0;)La/wln0;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    new-instance v10, La/sln0;

    .line 323
    .line 324
    invoke-direct {v10}, La/sln0;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v10, v7}, La/sln0;->a(La/wln0;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    new-instance v10, La/sln0;

    .line 334
    .line 335
    invoke-direct {v10}, La/sln0;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v10, v7}, La/sln0;->a(La/wln0;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v10, v7}, La/sln0;->a(La/wln0;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 348
    .line 349
    .line 350
    :cond_8
    :goto_2
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 351
    .line 352
    .line 353
    goto :goto_3

    .line 354
    :cond_9
    iget v5, v1, La/gln0;->b:I

    .line 355
    .line 356
    const/16 v6, 0x8

    .line 357
    .line 358
    if-ne v5, v6, :cond_d

    .line 359
    .line 360
    const/4 v6, 0x1

    .line 361
    if-eq v13, v6, :cond_c

    .line 362
    .line 363
    iget-object v5, v0, La/hln0;->g:Ljava/util/ArrayList;

    .line 364
    .line 365
    const/4 v6, 0x2

    .line 366
    if-eq v13, v6, :cond_b

    .line 367
    .line 368
    sget-object v6, La/rfu0;->e:La/rfu0;

    .line 369
    .line 370
    if-ne v4, v6, :cond_a

    .line 371
    .line 372
    iget-object v5, v0, La/hln0;->j:Ljava/util/ArrayList;

    .line 373
    .line 374
    :cond_a
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 375
    .line 376
    .line 377
    goto :goto_3

    .line 378
    :cond_b
    iget-object v6, v0, La/hln0;->i:Ljava/util/ArrayList;

    .line 379
    .line 380
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 381
    .line 382
    .line 383
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 384
    .line 385
    .line 386
    goto :goto_3

    .line 387
    :cond_c
    iget-object v5, v0, La/hln0;->f:Ljava/util/ArrayList;

    .line 388
    .line 389
    goto :goto_4

    .line 390
    :cond_d
    const/16 v6, 0xa

    .line 391
    .line 392
    if-ne v5, v6, :cond_e

    .line 393
    .line 394
    if-nez v13, :cond_e

    .line 395
    .line 396
    iget-object v5, v0, La/hln0;->m:Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 399
    .line 400
    .line 401
    :cond_e
    :goto_3
    move-object v5, v9

    .line 402
    :goto_4
    invoke-interface {v8, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-object v8, v5

    .line 406
    :goto_5
    if-eqz v8, :cond_10

    .line 407
    .line 408
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    if-eqz v5, :cond_10

    .line 413
    .line 414
    :cond_f
    move/from16 v6, v16

    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_10
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    :cond_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v6

    .line 425
    if-eqz v6, :cond_f

    .line 426
    .line 427
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    check-cast v6, La/sln0;

    .line 432
    .line 433
    invoke-virtual {v6, v2}, La/sln0;->c(Ljava/util/ArrayList;)Ljava/util/List;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    if-eqz v6, :cond_11

    .line 438
    .line 439
    const/4 v6, 0x1

    .line 440
    :goto_6
    if-eqz v6, :cond_22

    .line 441
    .line 442
    if-eqz v18, :cond_22

    .line 443
    .line 444
    new-instance v5, La/wii0;

    .line 445
    .line 446
    invoke-direct {v5}, La/wii0;-><init>()V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    move/from16 v7, v16

    .line 454
    .line 455
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 456
    .line 457
    .line 458
    move-result v8

    .line 459
    if-eqz v8, :cond_20

    .line 460
    .line 461
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    add-int/lit8 v9, v7, 0x1

    .line 466
    .line 467
    if-ltz v7, :cond_1f

    .line 468
    .line 469
    check-cast v8, La/wln0;

    .line 470
    .line 471
    iget v11, v8, La/wln0;->d:I

    .line 472
    .line 473
    invoke-virtual {v0, v11}, La/hln0;->n(I)La/m55;

    .line 474
    .line 475
    .line 476
    move-result-object v11

    .line 477
    iget-object v12, v11, La/m55;->f:Ljava/util/LinkedHashMap;

    .line 478
    .line 479
    iget v13, v8, La/wln0;->d:I

    .line 480
    .line 481
    iget-object v14, v8, La/wln0;->b:La/tln0;

    .line 482
    .line 483
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 484
    .line 485
    .line 486
    move-result v15

    .line 487
    const/16 v18, 0x0

    .line 488
    .line 489
    const/4 v10, 0x3

    .line 490
    if-eq v15, v10, :cond_12

    .line 491
    .line 492
    packed-switch v15, :pswitch_data_0

    .line 493
    .line 494
    .line 495
    iget-object v11, v14, La/tln0;->b:Landroid/util/Size;

    .line 496
    .line 497
    goto :goto_8

    .line 498
    :pswitch_0
    const-string v0, "Not supported config size"

    .line 499
    .line 500
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    return v16

    .line 504
    :pswitch_1
    iget-object v11, v11, La/m55;->i:Ljava/util/LinkedHashMap;

    .line 505
    .line 506
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object v12

    .line 510
    invoke-virtual {v11, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v11

    .line 514
    check-cast v11, Landroid/util/Size;

    .line 515
    .line 516
    goto :goto_8

    .line 517
    :pswitch_2
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 518
    .line 519
    .line 520
    move-result-object v11

    .line 521
    invoke-virtual {v12, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v11

    .line 525
    check-cast v11, Landroid/util/Size;

    .line 526
    .line 527
    goto :goto_8

    .line 528
    :pswitch_3
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 529
    .line 530
    .line 531
    move-result-object v11

    .line 532
    invoke-virtual {v12, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v11

    .line 536
    check-cast v11, Landroid/util/Size;

    .line 537
    .line 538
    goto :goto_8

    .line 539
    :pswitch_4
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 540
    .line 541
    .line 542
    move-result-object v11

    .line 543
    invoke-virtual {v12, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v11

    .line 547
    check-cast v11, Landroid/util/Size;

    .line 548
    .line 549
    goto :goto_8

    .line 550
    :pswitch_5
    iget-object v11, v11, La/m55;->e:Landroid/util/Size;

    .line 551
    .line 552
    goto :goto_8

    .line 553
    :cond_12
    iget-object v11, v11, La/m55;->c:Landroid/util/Size;

    .line 554
    .line 555
    :goto_8
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    move-object/from16 v12, p5

    .line 559
    .line 560
    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v7

    .line 564
    check-cast v7, Ljava/lang/Number;

    .line 565
    .line 566
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v7

    .line 574
    check-cast v7, La/fpt0;

    .line 575
    .line 576
    move-object/from16 v13, p3

    .line 577
    .line 578
    invoke-interface {v13, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v14

    .line 582
    if-eqz v14, :cond_1e

    .line 583
    .line 584
    check-cast v14, La/agn;

    .line 585
    .line 586
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    invoke-interface {v7}, La/h0x;->k()I

    .line 590
    .line 591
    .line 592
    move-result v15

    .line 593
    new-instance v10, La/dgp;

    .line 594
    .line 595
    invoke-direct {v10, v15, v11}, La/hzj;-><init>(ILandroid/util/Size;)V

    .line 596
    .line 597
    .line 598
    sget-object v15, La/upt0;->b:La/sxs0;

    .line 599
    .line 600
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    invoke-interface {v7}, La/fpt0;->v()La/hpt0;

    .line 604
    .line 605
    .line 606
    move-result-object v15

    .line 607
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 608
    .line 609
    .line 610
    move-result v15

    .line 611
    if-eqz v15, :cond_17

    .line 612
    .line 613
    move-object/from16 v21, v6

    .line 614
    .line 615
    const/4 v6, 0x1

    .line 616
    if-eq v15, v6, :cond_16

    .line 617
    .line 618
    const/4 v6, 0x2

    .line 619
    if-eq v15, v6, :cond_15

    .line 620
    .line 621
    const/4 v6, 0x3

    .line 622
    if-eq v15, v6, :cond_14

    .line 623
    .line 624
    const/4 v6, 0x4

    .line 625
    if-eq v15, v6, :cond_13

    .line 626
    .line 627
    sget-object v6, La/upt0;->h:La/upt0;

    .line 628
    .line 629
    goto :goto_9

    .line 630
    :cond_13
    sget-object v6, La/upt0;->g:La/upt0;

    .line 631
    .line 632
    goto :goto_9

    .line 633
    :cond_14
    sget-object v6, La/upt0;->f:La/upt0;

    .line 634
    .line 635
    goto :goto_9

    .line 636
    :cond_15
    sget-object v6, La/upt0;->e:La/upt0;

    .line 637
    .line 638
    goto :goto_9

    .line 639
    :cond_16
    sget-object v6, La/upt0;->c:La/upt0;

    .line 640
    .line 641
    goto :goto_9

    .line 642
    :cond_17
    move-object/from16 v21, v6

    .line 643
    .line 644
    sget-object v6, La/upt0;->d:La/upt0;

    .line 645
    .line 646
    :goto_9
    iget-object v6, v6, La/upt0;->a:Ljava/lang/Class;

    .line 647
    .line 648
    if-eqz v6, :cond_18

    .line 649
    .line 650
    iput-object v6, v10, La/hzj;->j:Ljava/lang/Class;

    .line 651
    .line 652
    :cond_18
    invoke-static {v7, v11}, La/tii0;->d(La/fpt0;Landroid/util/Size;)La/tii0;

    .line 653
    .line 654
    .line 655
    move-result-object v6

    .line 656
    iget-object v11, v6, La/sii0;->b:La/ucs0;

    .line 657
    .line 658
    const/4 v15, -0x1

    .line 659
    invoke-virtual {v6, v10, v14, v15}, La/tii0;->b(La/hzj;La/agn;I)V

    .line 660
    .line 661
    .line 662
    iget-object v10, v1, La/gln0;->i:Landroid/util/Range;

    .line 663
    .line 664
    sget-object v14, La/h55;->h:Landroid/util/Range;

    .line 665
    .line 666
    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    move-result v14

    .line 670
    if-nez v14, :cond_19

    .line 671
    .line 672
    goto :goto_a

    .line 673
    :cond_19
    move-object/from16 v10, v18

    .line 674
    .line 675
    :goto_a
    if-nez v10, :cond_1a

    .line 676
    .line 677
    sget-object v10, La/rwq;->d:Landroid/util/Range;

    .line 678
    .line 679
    :cond_1a
    sget-object v14, La/t7a;->h:La/u15;

    .line 680
    .line 681
    iget-object v15, v11, La/ucs0;->d:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v15, La/wy40;

    .line 684
    .line 685
    invoke-virtual {v15, v14, v10}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 686
    .line 687
    .line 688
    sget-object v10, La/rfu0;->e:La/rfu0;

    .line 689
    .line 690
    if-ne v4, v10, :cond_1b

    .line 691
    .line 692
    sget-object v10, La/fpt0;->O0:La/u15;

    .line 693
    .line 694
    iget-object v11, v11, La/ucs0;->d:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v11, La/wy40;

    .line 697
    .line 698
    move-object/from16 v14, v20

    .line 699
    .line 700
    invoke-virtual {v11, v10, v14}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    goto :goto_b

    .line 704
    :cond_1b
    move-object/from16 v14, v20

    .line 705
    .line 706
    sget-object v10, La/rfu0;->d:La/rfu0;

    .line 707
    .line 708
    if-ne v4, v10, :cond_1c

    .line 709
    .line 710
    sget-object v10, La/fpt0;->P0:La/u15;

    .line 711
    .line 712
    iget-object v11, v11, La/ucs0;->d:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v11, La/wy40;

    .line 715
    .line 716
    invoke-virtual {v11, v10, v14}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    :cond_1c
    :goto_b
    invoke-virtual {v6}, La/tii0;->c()La/xii0;

    .line 720
    .line 721
    .line 722
    move-result-object v6

    .line 723
    invoke-virtual {v5, v6}, La/wii0;->a(La/xii0;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v5}, La/wii0;->c()Z

    .line 727
    .line 728
    .line 729
    move-result v6

    .line 730
    new-instance v10, Ljava/lang/StringBuilder;

    .line 731
    .line 732
    const-string v11, "Cannot create a combined SessionConfig for feature combo after adding "

    .line 733
    .line 734
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    const-string v7, " with "

    .line 741
    .line 742
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    const-string v7, " due to ["

    .line 749
    .line 750
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    iget-boolean v7, v5, La/wii0;->m:Z

    .line 754
    .line 755
    if-nez v7, :cond_1d

    .line 756
    .line 757
    const-string v7, "Template is not set"

    .line 758
    .line 759
    goto :goto_c

    .line 760
    :cond_1d
    iget-object v7, v5, La/wii0;->l:Ljava/lang/StringBuilder;

    .line 761
    .line 762
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v7

    .line 766
    :goto_c
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 767
    .line 768
    .line 769
    const-string v7, "]; surfaceConfigList = "

    .line 770
    .line 771
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    const-string v7, ", featureSettings = "

    .line 778
    .line 779
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 780
    .line 781
    .line 782
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 783
    .line 784
    .line 785
    const-string v7, ", newUseCaseConfigs = "

    .line 786
    .line 787
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v7

    .line 797
    invoke-static {v7, v6}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 798
    .line 799
    .line 800
    move v7, v9

    .line 801
    move-object/from16 v20, v14

    .line 802
    .line 803
    move-object/from16 v6, v21

    .line 804
    .line 805
    goto/16 :goto_7

    .line 806
    .line 807
    :cond_1e
    invoke-static/range {v19 .. v19}, La/jf4;->o(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    return v16

    .line 811
    :cond_1f
    const/16 v18, 0x0

    .line 812
    .line 813
    invoke-static {}, La/q3d;->p()V

    .line 814
    .line 815
    .line 816
    throw v18

    .line 817
    :cond_20
    invoke-virtual {v5}, La/wii0;->b()La/xii0;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    iget-object v0, v0, La/hln0;->c:La/egp;

    .line 822
    .line 823
    invoke-interface {v0, v1}, La/egp;->l(La/xii0;)Z

    .line 824
    .line 825
    .line 826
    move-result v0

    .line 827
    invoke-virtual {v1}, La/xii0;->b()Ljava/util/List;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 832
    .line 833
    .line 834
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 839
    .line 840
    .line 841
    move-result v2

    .line 842
    if-eqz v2, :cond_21

    .line 843
    .line 844
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    check-cast v2, La/hzj;

    .line 849
    .line 850
    invoke-virtual {v2}, La/hzj;->a()V

    .line 851
    .line 852
    .line 853
    goto :goto_d

    .line 854
    :cond_21
    return v0

    .line 855
    :cond_22
    return v6

    .line 856
    nop

    .line 857
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 11

    .line 1
    iget-object v0, p0, La/hln0;->y:La/xvk;

    .line 2
    .line 3
    invoke-virtual {v0}, La/xvk;->c()Landroid/util/Size;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    :try_start_0
    iget-object v0, p0, La/hln0;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/hln0;->j()Landroid/util/Size;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    :goto_0
    move-object v6, v0

    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :catch_0
    :cond_0
    iget-object v0, p0, La/hln0;->x:La/erm0;

    .line 22
    .line 23
    iget-object v0, v0, La/erm0;->d:La/roi0;

    .line 24
    .line 25
    iget-object v0, v0, La/roi0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    :try_start_1
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-class v2, Landroid/media/MediaRecorder;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    goto :goto_2

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v0, v1

    .line 44
    goto :goto_2

    .line 45
    :goto_1
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 46
    .line 47
    new-instance v2, La/g0g0;

    .line 48
    .line 49
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v0, v2

    .line 53
    :goto_2
    nop

    .line 54
    instance-of v2, v0, La/g0g0;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    move-object v0, v1

    .line 59
    :cond_2
    check-cast v0, [Landroid/util/Size;

    .line 60
    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    :cond_3
    move-object v0, v1

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    new-instance v2, La/ycd;

    .line 66
    .line 67
    const/4 v3, 0x1

    .line 68
    invoke-direct {v2, v3}, La/ycd;-><init>(Z)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 72
    .line 73
    .line 74
    array-length v2, v0

    .line 75
    const/4 v3, 0x0

    .line 76
    :goto_3
    if-ge v3, v2, :cond_3

    .line 77
    .line 78
    aget-object v5, v0, v3

    .line 79
    .line 80
    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    sget-object v7, La/v7k0;->e:Landroid/util/Size;

    .line 85
    .line 86
    invoke-virtual {v7}, Landroid/util/Size;->getWidth()I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-gt v6, v8, :cond_5

    .line 91
    .line 92
    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    invoke-virtual {v7}, Landroid/util/Size;->getHeight()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-gt v6, v7, :cond_5

    .line 101
    .line 102
    move-object v0, v5

    .line 103
    goto :goto_4

    .line 104
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :goto_4
    if-eqz v0, :cond_6

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    sget-object v0, La/v7k0;->c:Landroid/util/Size;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :goto_5
    sget-object v2, La/v7k0;->b:Landroid/util/Size;

    .line 117
    .line 118
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 119
    .line 120
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 121
    .line 122
    .line 123
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 124
    .line 125
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 126
    .line 127
    .line 128
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 129
    .line 130
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 131
    .line 132
    .line 133
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 134
    .line 135
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 136
    .line 137
    .line 138
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 139
    .line 140
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 141
    .line 142
    .line 143
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 144
    .line 145
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 146
    .line 147
    .line 148
    new-instance v1, La/m55;

    .line 149
    .line 150
    invoke-direct/range {v1 .. v10}, La/m55;-><init>(Landroid/util/Size;Ljava/util/LinkedHashMap;Landroid/util/Size;Ljava/util/LinkedHashMap;Landroid/util/Size;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V

    .line 151
    .line 152
    .line 153
    iput-object v1, p0, La/hln0;->v:La/m55;

    .line 154
    .line 155
    return-void
.end method

.method public final e(ILandroid/util/Size;ZI)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_6

    .line 3
    .line 4
    const/16 p3, 0x22

    .line 5
    .line 6
    if-ne p1, p3, :cond_5

    .line 7
    .line 8
    iget-object p0, p0, La/hln0;->C:La/pxv;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, La/pxv;->c(Landroid/util/Size;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    if-nez p0, :cond_1

    .line 29
    .line 30
    new-instance p0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string p1, "No supported high speed  fps for "

    .line 33
    .line 34
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p1, "HighSpeedResolver"

    .line 45
    .line 46
    invoke-static {p1, p0}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Landroid/util/Range;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Ljava/lang/Integer;

    .line 72
    .line 73
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_3

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, Landroid/util/Range;

    .line 84
    .line 85
    invoke-virtual {p2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    check-cast p2, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    if-gez p3, :cond_2

    .line 96
    .line 97
    move-object p1, p2

    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    goto :goto_3

    .line 107
    :cond_4
    invoke-static {}, La/itt0;->a()V

    .line 108
    .line 109
    .line 110
    return v0

    .line 111
    :cond_5
    const-string p0, "Check failed."

    .line 112
    .line 113
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return v0

    .line 117
    :cond_6
    invoke-virtual {p0}, La/hln0;->k()La/erm0;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    const-string v1, "CXCP"

    .line 122
    .line 123
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    const-wide/16 v2, 0x0

    .line 127
    .line 128
    :try_start_0
    iget-object p3, p3, La/erm0;->d:La/roi0;

    .line 129
    .line 130
    invoke-virtual {p3, p1, p2}, La/roi0;->h(ILandroid/util/Size;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    goto :goto_2

    .line 135
    :catch_0
    move-exception p3

    .line 136
    invoke-static {}, La/l8x;->j0()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_7

    .line 141
    .line 142
    new-instance v4, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v5, "Unable to get min frame duration for format = "

    .line 145
    .line 146
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v5, " and size = "

    .line 153
    .line 154
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-static {v1, v4, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 165
    .line 166
    .line 167
    :cond_7
    move-wide v4, v2

    .line 168
    :goto_2
    cmp-long p3, v4, v2

    .line 169
    .line 170
    if-gtz p3, :cond_9

    .line 171
    .line 172
    iget-boolean p0, p0, La/hln0;->u:Z

    .line 173
    .line 174
    if-eqz p0, :cond_8

    .line 175
    .line 176
    invoke-static {}, La/l8x;->j0()Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    if-eqz p0, :cond_a

    .line 181
    .line 182
    const-string p0, "minFrameDuration: "

    .line 183
    .line 184
    const-string p3, " is invalid for imageFormat = "

    .line 185
    .line 186
    invoke-static {p1, v4, v5, p0, p3}, La/brm0;->q(IJLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    const-string p1, ", size = "

    .line 191
    .line 192
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_8
    const v0, 0x7fffffff

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_9
    const-wide p0, 0x41cdcd6500000000L    # 1.0E9

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    long-to-double p2, v4

    .line 216
    div-double/2addr p0, p2

    .line 217
    double-to-int v0, p0

    .line 218
    :cond_a
    :goto_3
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    .line 219
    .line 220
    .line 221
    move-result p0

    .line 222
    return p0
.end method

.method public final g(La/gln0;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Ljava/util/List;
    .locals 11

    .line 1
    sget-object v0, La/vrm0;->a:La/u15;

    .line 2
    .line 3
    iget v0, p1, La/gln0;->a:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_7

    .line 7
    .line 8
    iget v0, p1, La/gln0;->b:I

    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    if-ne v0, v2, :cond_7

    .line 13
    .line 14
    iget-boolean p1, p1, La/gln0;->f:Z

    .line 15
    .line 16
    if-nez p1, :cond_7

    .line 17
    .line 18
    iget-object p1, p0, La/hln0;->h:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_7

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/sln0;

    .line 35
    .line 36
    invoke-virtual {v0, p2}, La/sln0;->c(Ljava/util/ArrayList;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    sget-object v2, La/vrm0;->a:La/u15;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/4 v3, 0x0

    .line 49
    move v4, v3

    .line 50
    :goto_0
    const/4 v5, 0x1

    .line 51
    if-ge v4, v2, :cond_6

    .line 52
    .line 53
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, La/wln0;

    .line 58
    .line 59
    iget-object v6, v6, La/wln0;->c:La/urm0;

    .line 60
    .line 61
    iget-wide v6, v6, La/urm0;->a:J

    .line 62
    .line 63
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-interface {p3, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    sget-object v9, La/hpt0;->e:La/hpt0;

    .line 72
    .line 73
    if-eqz v8, :cond_2

    .line 74
    .line 75
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-virtual {p3, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, La/l15;

    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v8, v8, La/l15;->e:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    if-ne v10, v5, :cond_1

    .line 95
    .line 96
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    move-object v9, v5

    .line 101
    check-cast v9, La/hpt0;

    .line 102
    .line 103
    :cond_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {v9, v6, v7, v8}, La/vrm0;->b(La/hpt0;JLjava/util/List;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-nez v5, :cond_4

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-interface {p4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_5

    .line 122
    .line 123
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {p4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    check-cast v5, La/fpt0;

    .line 135
    .line 136
    invoke-interface {v5}, La/fpt0;->v()La/hpt0;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-interface {v5}, La/fpt0;->v()La/hpt0;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    if-ne v10, v9, :cond_3

    .line 148
    .line 149
    check-cast v5, La/rrm0;

    .line 150
    .line 151
    sget-object v9, La/rrm0;->b:La/u15;

    .line 152
    .line 153
    invoke-interface {v5, v9}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    check-cast v5, Ljava/util/List;

    .line 158
    .line 159
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_3
    sget-object v5, La/iun;->a:La/iun;

    .line 164
    .line 165
    :goto_1
    invoke-static {v8, v6, v7, v5}, La/vrm0;->b(La/hpt0;JLjava/util/List;)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-nez v5, :cond_4

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_5
    const-string p0, "SurfaceConfig does not map to any use case"

    .line 176
    .line 177
    invoke-static {p0}, La/c99;->l(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    return-object v1

    .line 181
    :cond_6
    move v3, v5

    .line 182
    :goto_2
    new-instance v2, La/o0k0;

    .line 183
    .line 184
    const/16 v4, 0x13

    .line 185
    .line 186
    invoke-direct {v2, p0, v0, v4}, La/o0k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 187
    .line 188
    .line 189
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    if-eqz v3, :cond_0

    .line 194
    .line 195
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    check-cast v2, Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_0

    .line 206
    .line 207
    return-object v0

    .line 208
    :cond_7
    return-object v1
.end method

.method public final j()Landroid/util/Size;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/16 v0, 0xd

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/16 v0, 0xa

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/16 v0, 0x8

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const/16 v0, 0xc

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/4 v0, 0x6

    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const/4 v0, 0x5

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const/4 v0, 0x4

    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    filled-new-array/range {v1 .. v8}, [Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    iget-object v2, p0, La/hln0;->b:La/ewn;

    .line 74
    .line 75
    invoke-interface {v2, v1}, La/ewn;->a(I)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_0

    .line 80
    .line 81
    invoke-interface {v2, v1}, La/ewn;->b(I)La/n35;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    iget-object v1, v1, La/n35;->d:Ljava/util/List;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_0

    .line 97
    .line 98
    const/4 p0, 0x0

    .line 99
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    check-cast p0, La/o35;

    .line 107
    .line 108
    new-instance v0, Landroid/util/Size;

    .line 109
    .line 110
    iget v1, p0, La/o35;->e:I

    .line 111
    .line 112
    iget p0, p0, La/o35;->f:I

    .line 113
    .line 114
    invoke-direct {v0, v1, p0}, Landroid/util/Size;-><init>(II)V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_1
    const/4 p0, 0x0

    .line 119
    return-object p0
.end method

.method public final k()La/erm0;
    .locals 3

    .line 1
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/hln0;->a:La/c1a;

    .line 7
    .line 8
    move-object v1, p0

    .line 9
    check-cast v1, La/ow9;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v1, La/erm0;

    .line 20
    .line 21
    new-instance v2, La/cf80;

    .line 22
    .line 23
    invoke-direct {v2, p0}, La/cf80;-><init>(La/c1a;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v0, v2}, La/erm0;-><init>(Landroid/hardware/camera2/params/StreamConfigurationMap;La/cf80;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    const-string p0, "Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP"

    .line 31
    .line 32
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public final l(ILjava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Z)Ljava/util/ArrayList;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/l15;

    .line 21
    .line 22
    iget-object v2, v1, La/l15;->a:La/wln0;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/lit8 v2, v2, -0x1

    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    move-object v3, p6

    .line 38
    invoke-interface {p6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const/4 p3, 0x0

    .line 47
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    add-int/lit8 v1, p3, 0x1

    .line 54
    .line 55
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    move-object v4, v2

    .line 60
    check-cast v4, Landroid/util/Size;

    .line 61
    .line 62
    invoke-virtual {p5, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    check-cast p3, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    check-cast p3, La/fpt0;

    .line 77
    .line 78
    invoke-interface {p3}, La/h0x;->k()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-interface {p3}, La/fpt0;->u()La/urm0;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    sget-object v5, La/wln0;->e:La/urm0;

    .line 87
    .line 88
    invoke-virtual {p0, v3}, La/hln0;->n(I)La/m55;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-eqz p8, :cond_1

    .line 93
    .line 94
    sget-object v6, La/uln0;->a:La/uln0;

    .line 95
    .line 96
    :goto_2
    move-object v7, v6

    .line 97
    move v6, p1

    .line 98
    goto :goto_3

    .line 99
    :cond_1
    sget-object v6, La/uln0;->b:La/uln0;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :goto_3
    invoke-static/range {v3 .. v8}, La/y2m0;->d(ILandroid/util/Size;La/m55;ILa/uln0;La/urm0;)La/wln0;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    add-int/lit8 v3, v3, -0x1

    .line 114
    .line 115
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    move-object/from16 v4, p7

    .line 120
    .line 121
    invoke-interface {v4, v3, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move p3, v1

    .line 125
    goto :goto_1

    .line 126
    :cond_2
    return-object v0
.end method

.method public final m()La/m55;
    .locals 0

    .line 1
    iget-object p0, p0, La/hln0;->v:La/m55;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "surfaceSizeDefinition"

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

.method public final n(I)La/m55;
    .locals 5

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/hln0;->w:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, La/hln0;->m()La/m55;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/m55;->b:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    sget-object v2, La/v7k0;->d:Landroid/util/Size;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, v2, p1}, La/hln0;->s(Ljava/util/LinkedHashMap;Landroid/util/Size;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/hln0;->m()La/m55;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v0, v0, La/m55;->d:Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    sget-object v2, La/v7k0;->f:Landroid/util/Size;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0, v2, p1}, La/hln0;->s(Ljava/util/LinkedHashMap;Landroid/util/Size;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/hln0;->m()La/m55;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, La/m55;->f:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {p0, v0, p1, v2}, La/hln0;->r(Ljava/util/LinkedHashMap;ILandroid/util/Rational;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, La/hln0;->m()La/m55;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v0, v0, La/m55;->g:Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    sget-object v3, La/ky3;->a:Landroid/util/Rational;

    .line 58
    .line 59
    invoke-virtual {p0, v0, p1, v3}, La/hln0;->r(Ljava/util/LinkedHashMap;ILandroid/util/Rational;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, La/hln0;->m()La/m55;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v0, v0, La/m55;->h:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    sget-object v3, La/ky3;->c:Landroid/util/Rational;

    .line 69
    .line 70
    invoke-virtual {p0, v0, p1, v3}, La/hln0;->r(Ljava/util/LinkedHashMap;ILandroid/util/Rational;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, La/hln0;->m()La/m55;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v0, v0, La/m55;->i:Ljava/util/LinkedHashMap;

    .line 78
    .line 79
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 80
    .line 81
    const/16 v4, 0x1f

    .line 82
    .line 83
    if-lt v3, v4, :cond_2

    .line 84
    .line 85
    iget-boolean v3, p0, La/hln0;->s:Z

    .line 86
    .line 87
    if-nez v3, :cond_0

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    invoke-static {}, La/tl50;->m()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v4, p0, La/hln0;->a:La/c1a;

    .line 98
    .line 99
    check-cast v4, La/ow9;

    .line 100
    .line 101
    invoke-virtual {v4, v3}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 106
    .line 107
    if-nez v3, :cond_1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    const/4 v4, 0x1

    .line 111
    invoke-static {v3, p1, v4, v2}, La/hln0;->f(Landroid/hardware/camera2/params/StreamConfigurationMap;IZLandroid/util/Rational;)Landroid/util/Size;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :cond_2
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    :cond_3
    invoke-virtual {p0}, La/hln0;->m()La/m55;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0
.end method

.method public final p(La/gln0;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)La/tmn0;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v1, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v10, p6

    .line 12
    .line 13
    iget-boolean v11, v9, La/gln0;->f:Z

    .line 14
    .line 15
    const-string v12, "CXCP"

    .line 16
    .line 17
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v5, "resolveSpecsBySettings: featureSettings = "

    .line 26
    .line 27
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v12, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-boolean v13, v9, La/gln0;->g:Z

    .line 41
    .line 42
    iget-object v14, v9, La/gln0;->i:Landroid/util/Range;

    .line 43
    .line 44
    const-string v15, ". New configs: "

    .line 45
    .line 46
    iget-object v3, v0, La/hln0;->d:Ljava/lang/String;

    .line 47
    .line 48
    const-string v5, "No supported surface combination is found for camera device - Id : "

    .line 49
    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    if-nez v13, :cond_5

    .line 54
    .line 55
    new-instance v8, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v17

    .line 64
    :goto_0
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v18

    .line 68
    if-eqz v18, :cond_1

    .line 69
    .line 70
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v18

    .line 74
    move-object/from16 v6, v18

    .line 75
    .line 76
    check-cast v6, La/l15;

    .line 77
    .line 78
    iget-object v6, v6, La/l15;->a:La/wln0;

    .line 79
    .line 80
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    new-instance v6, La/ycd;

    .line 85
    .line 86
    invoke-direct {v6, v7}, La/ycd;-><init>(Z)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v17

    .line 93
    invoke-interface/range {v17 .. v17}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v17

    .line 97
    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v18

    .line 101
    if-eqz v18, :cond_3

    .line 102
    .line 103
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v18

    .line 107
    move-object/from16 v7, v18

    .line 108
    .line 109
    check-cast v7, La/fpt0;

    .line 110
    .line 111
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v18

    .line 115
    move/from16 v21, v13

    .line 116
    .line 117
    move-object/from16 v13, v18

    .line 118
    .line 119
    check-cast v13, Ljava/util/List;

    .line 120
    .line 121
    if-eqz v13, :cond_2

    .line 122
    .line 123
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v18

    .line 127
    if-nez v18, :cond_2

    .line 128
    .line 129
    invoke-static {v13, v6}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    move-object/from16 v23, v13

    .line 134
    .line 135
    check-cast v23, Landroid/util/Size;

    .line 136
    .line 137
    invoke-interface {v7}, La/h0x;->k()I

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    invoke-interface {v7}, La/fpt0;->u()La/urm0;

    .line 142
    .line 143
    .line 144
    move-result-object v27

    .line 145
    sget-object v7, La/wln0;->e:La/urm0;

    .line 146
    .line 147
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v13}, La/hln0;->n(I)La/m55;

    .line 151
    .line 152
    .line 153
    move-result-object v24

    .line 154
    iget v7, v9, La/gln0;->a:I

    .line 155
    .line 156
    sget-object v26, La/uln0;->b:La/uln0;

    .line 157
    .line 158
    move/from16 v25, v7

    .line 159
    .line 160
    move/from16 v22, v13

    .line 161
    .line 162
    invoke-static/range {v22 .. v27}, La/y2m0;->d(ILandroid/util/Size;La/m55;ILa/uln0;La/urm0;)La/wln0;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move/from16 v13, v21

    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    goto :goto_1

    .line 173
    :cond_2
    const-string v0, "No available output size is found for "

    .line 174
    .line 175
    const/16 v1, 0x2e

    .line 176
    .line 177
    invoke-static {v1, v0, v7}, La/ohq;->i(ILjava/lang/String;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    return-object v16

    .line 181
    :cond_3
    move/from16 v21, v13

    .line 182
    .line 183
    invoke-static {v0, v9, v8}, La/hln0;->b(La/hln0;La/gln0;Ljava/util/ArrayList;)Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-eqz v6, :cond_4

    .line 188
    .line 189
    :goto_2
    const/16 v6, 0x2e

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v1, ". May be attempting to bind too many use cases. Existing surfaces: "

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v1, ". GroupableFeature settings: "

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const/16 v6, 0x2e

    .line 223
    .line 224
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v1

    .line 241
    :cond_5
    move/from16 v21, v13

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :goto_3
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 245
    .line 246
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 247
    .line 248
    .line 249
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v13

    .line 261
    move-object/from16 v17, v8

    .line 262
    .line 263
    if-eqz v13, :cond_c

    .line 264
    .line 265
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v13

    .line 269
    check-cast v13, La/fpt0;

    .line 270
    .line 271
    new-instance v6, Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 274
    .line 275
    .line 276
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 277
    .line 278
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v22

    .line 285
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    check-cast v22, Ljava/util/List;

    .line 289
    .line 290
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v22

    .line 294
    :goto_5
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v23

    .line 298
    if-eqz v23, :cond_b

    .line 299
    .line 300
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v23

    .line 304
    move-object/from16 v1, v23

    .line 305
    .line 306
    check-cast v1, Landroid/util/Size;

    .line 307
    .line 308
    invoke-interface {v13}, La/h0x;->k()I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    move-object/from16 v23, v3

    .line 313
    .line 314
    invoke-interface {v13, v1}, La/fpt0;->w(Landroid/util/Size;)I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    invoke-interface {v13}, La/fpt0;->u()La/urm0;

    .line 319
    .line 320
    .line 321
    move-result-object v29

    .line 322
    sget-object v24, La/wln0;->e:La/urm0;

    .line 323
    .line 324
    invoke-virtual {v0, v2}, La/hln0;->n(I)La/m55;

    .line 325
    .line 326
    .line 327
    move-result-object v26

    .line 328
    move-object/from16 v25, v1

    .line 329
    .line 330
    iget v1, v9, La/gln0;->a:I

    .line 331
    .line 332
    move/from16 v27, v1

    .line 333
    .line 334
    iget-boolean v1, v9, La/gln0;->h:Z

    .line 335
    .line 336
    if-eqz v1, :cond_6

    .line 337
    .line 338
    sget-object v1, La/uln0;->a:La/uln0;

    .line 339
    .line 340
    :goto_6
    move-object/from16 v28, v1

    .line 341
    .line 342
    move/from16 v24, v2

    .line 343
    .line 344
    goto :goto_7

    .line 345
    :cond_6
    sget-object v1, La/uln0;->b:La/uln0;

    .line 346
    .line 347
    goto :goto_6

    .line 348
    :goto_7
    invoke-static/range {v24 .. v29}, La/y2m0;->d(ILandroid/util/Size;La/m55;ILa/uln0;La/urm0;)La/wln0;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    move/from16 v2, v24

    .line 353
    .line 354
    move-object/from16 v24, v5

    .line 355
    .line 356
    move v5, v2

    .line 357
    move-object/from16 v2, v25

    .line 358
    .line 359
    iget-object v1, v1, La/wln0;->b:La/tln0;

    .line 360
    .line 361
    move-object/from16 v25, v15

    .line 362
    .line 363
    sget-object v15, La/h55;->h:Landroid/util/Range;

    .line 364
    .line 365
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v26

    .line 369
    if-eqz v26, :cond_7

    .line 370
    .line 371
    const v3, 0x7fffffff

    .line 372
    .line 373
    .line 374
    goto :goto_8

    .line 375
    :cond_7
    invoke-virtual {v0, v5, v2, v11, v3}, La/hln0;->e(ILandroid/util/Size;ZI)I

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    :goto_8
    if-eqz v21, :cond_8

    .line 380
    .line 381
    sget-object v5, La/tln0;->q:La/tln0;

    .line 382
    .line 383
    if-eq v1, v5, :cond_a

    .line 384
    .line 385
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v5

    .line 389
    if-nez v5, :cond_8

    .line 390
    .line 391
    invoke-virtual {v14}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    check-cast v5, Ljava/lang/Number;

    .line 396
    .line 397
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 398
    .line 399
    .line 400
    move-result v5

    .line 401
    if-ge v3, v5, :cond_8

    .line 402
    .line 403
    goto :goto_9

    .line 404
    :cond_8
    invoke-virtual {v8, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    check-cast v5, Ljava/util/Set;

    .line 409
    .line 410
    if-nez v5, :cond_9

    .line 411
    .line 412
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 413
    .line 414
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-interface {v8, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    :cond_9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-interface {v5, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-nez v1, :cond_a

    .line 429
    .line 430
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-interface {v5, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    :cond_a
    :goto_9
    move-object/from16 v2, p2

    .line 441
    .line 442
    move-object/from16 v1, p3

    .line 443
    .line 444
    move-object/from16 v3, v23

    .line 445
    .line 446
    move-object/from16 v5, v24

    .line 447
    .line 448
    move-object/from16 v15, v25

    .line 449
    .line 450
    goto/16 :goto_5

    .line 451
    .line 452
    :cond_b
    move-object/from16 v23, v3

    .line 453
    .line 454
    move-object/from16 v24, v5

    .line 455
    .line 456
    move-object/from16 v25, v15

    .line 457
    .line 458
    invoke-interface {v7, v13, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-object/from16 v2, p2

    .line 462
    .line 463
    move-object/from16 v1, p3

    .line 464
    .line 465
    move-object/from16 v8, v17

    .line 466
    .line 467
    const/16 v6, 0x2e

    .line 468
    .line 469
    goto/16 :goto_4

    .line 470
    .line 471
    :cond_c
    move-object/from16 v23, v3

    .line 472
    .line 473
    move-object/from16 v24, v5

    .line 474
    .line 475
    move-object/from16 v25, v15

    .line 476
    .line 477
    new-instance v1, Ljava/util/ArrayList;

    .line 478
    .line 479
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {p5 .. p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    iget-object v13, v0, La/hln0;->a:La/c1a;

    .line 491
    .line 492
    if-eqz v3, :cond_17

    .line 493
    .line 494
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    check-cast v3, Ljava/lang/Number;

    .line 499
    .line 500
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v5

    .line 512
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    check-cast v5, Ljava/util/List;

    .line 516
    .line 517
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    check-cast v3, La/fpt0;

    .line 522
    .line 523
    invoke-interface {v3}, La/h0x;->k()I

    .line 524
    .line 525
    .line 526
    move-result v3

    .line 527
    iget-object v6, v0, La/hln0;->A:La/m6m0;

    .line 528
    .line 529
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    iget-object v6, v0, La/hln0;->x:La/erm0;

    .line 536
    .line 537
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    new-instance v8, La/i2a;

    .line 541
    .line 542
    invoke-direct {v8, v13, v6}, La/i2a;-><init>(La/c1a;La/erm0;)V

    .line 543
    .line 544
    .line 545
    const-class v6, Landroidx/camera/camera2/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    .line 546
    .line 547
    invoke-static {}, La/mhk;->a()La/kpd0;

    .line 548
    .line 549
    .line 550
    move-result-object v13

    .line 551
    invoke-virtual {v13, v6}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    check-cast v6, Landroidx/camera/camera2/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    .line 556
    .line 557
    if-eqz v6, :cond_d

    .line 558
    .line 559
    goto :goto_b

    .line 560
    :cond_d
    invoke-virtual {v8}, La/i2a;->a()La/kpd0;

    .line 561
    .line 562
    .line 563
    move-result-object v6

    .line 564
    const-class v8, Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk;

    .line 565
    .line 566
    invoke-virtual {v6, v8}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    .line 567
    .line 568
    .line 569
    move-result-object v6

    .line 570
    check-cast v6, Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk;

    .line 571
    .line 572
    if-eqz v6, :cond_e

    .line 573
    .line 574
    :goto_b
    const/16 v6, 0x100

    .line 575
    .line 576
    invoke-virtual {v0, v6}, La/hln0;->n(I)La/m55;

    .line 577
    .line 578
    .line 579
    move-result-object v8

    .line 580
    iget-object v8, v8, La/m55;->f:Ljava/util/LinkedHashMap;

    .line 581
    .line 582
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 583
    .line 584
    .line 585
    move-result-object v6

    .line 586
    invoke-virtual {v8, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v6

    .line 590
    check-cast v6, Landroid/util/Size;

    .line 591
    .line 592
    if-eqz v6, :cond_e

    .line 593
    .line 594
    new-instance v8, Landroid/util/Rational;

    .line 595
    .line 596
    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    .line 597
    .line 598
    .line 599
    move-result v13

    .line 600
    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    .line 601
    .line 602
    .line 603
    move-result v6

    .line 604
    invoke-direct {v8, v13, v6}, Landroid/util/Rational;-><init>(II)V

    .line 605
    .line 606
    .line 607
    goto :goto_c

    .line 608
    :cond_e
    move-object/from16 v8, v16

    .line 609
    .line 610
    :goto_c
    if-nez v8, :cond_f

    .line 611
    .line 612
    new-instance v6, Ljava/util/ArrayList;

    .line 613
    .line 614
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 615
    .line 616
    .line 617
    goto :goto_e

    .line 618
    :cond_f
    new-instance v6, Ljava/util/ArrayList;

    .line 619
    .line 620
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 621
    .line 622
    .line 623
    new-instance v13, Ljava/util/ArrayList;

    .line 624
    .line 625
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 626
    .line 627
    .line 628
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 633
    .line 634
    .line 635
    move-result v15

    .line 636
    if-eqz v15, :cond_11

    .line 637
    .line 638
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v15

    .line 642
    check-cast v15, Landroid/util/Size;

    .line 643
    .line 644
    invoke-static {v8, v15}, La/ky3;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 645
    .line 646
    .line 647
    move-result v17

    .line 648
    if-eqz v17, :cond_10

    .line 649
    .line 650
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    goto :goto_d

    .line 654
    :cond_10
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 655
    .line 656
    .line 657
    goto :goto_d

    .line 658
    :cond_11
    const/4 v15, 0x0

    .line 659
    invoke-virtual {v13, v15, v6}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 660
    .line 661
    .line 662
    move-object v6, v13

    .line 663
    :goto_e
    sget-object v5, La/wln0;->e:La/urm0;

    .line 664
    .line 665
    sget-object v5, La/wln0;->h:Ljava/util/LinkedHashMap;

    .line 666
    .line 667
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    invoke-virtual {v5, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v3

    .line 675
    check-cast v3, La/vln0;

    .line 676
    .line 677
    if-nez v3, :cond_12

    .line 678
    .line 679
    sget-object v3, La/vln0;->a:La/vln0;

    .line 680
    .line 681
    :cond_12
    iget-object v5, v0, La/hln0;->z:La/ugf0;

    .line 682
    .line 683
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    iget-object v5, v5, La/ugf0;->a:Ljava/lang/Object;

    .line 687
    .line 688
    check-cast v5, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;

    .line 689
    .line 690
    if-nez v5, :cond_13

    .line 691
    .line 692
    goto :goto_10

    .line 693
    :cond_13
    invoke-static {v3}, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;->b(La/vln0;)Landroid/util/Size;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    if-nez v3, :cond_14

    .line 698
    .line 699
    goto :goto_10

    .line 700
    :cond_14
    new-instance v5, Ljava/util/ArrayList;

    .line 701
    .line 702
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 706
    .line 707
    .line 708
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 709
    .line 710
    .line 711
    move-result-object v6

    .line 712
    :cond_15
    :goto_f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 713
    .line 714
    .line 715
    move-result v8

    .line 716
    if-eqz v8, :cond_16

    .line 717
    .line 718
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v8

    .line 722
    check-cast v8, Landroid/util/Size;

    .line 723
    .line 724
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    move-result v13

    .line 728
    if-nez v13, :cond_15

    .line 729
    .line 730
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    goto :goto_f

    .line 734
    :cond_16
    move-object v6, v5

    .line 735
    :goto_10
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    goto/16 :goto_a

    .line 739
    .line 740
    :cond_17
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 741
    .line 742
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 743
    .line 744
    .line 745
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 746
    .line 747
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 748
    .line 749
    .line 750
    iget-object v15, v0, La/hln0;->C:La/pxv;

    .line 751
    .line 752
    const/16 v17, 0x1

    .line 753
    .line 754
    if-eqz v11, :cond_1b

    .line 755
    .line 756
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 760
    .line 761
    .line 762
    move-result v2

    .line 763
    if-eqz v2, :cond_18

    .line 764
    .line 765
    sget-object v1, La/iun;->a:La/iun;

    .line 766
    .line 767
    goto :goto_13

    .line 768
    :cond_18
    invoke-static {v1}, La/pxv;->a(Ljava/util/List;)Ljava/util/List;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    new-instance v3, Ljava/util/ArrayList;

    .line 773
    .line 774
    const/16 v5, 0xa

    .line 775
    .line 776
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 777
    .line 778
    .line 779
    move-result v5

    .line 780
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 781
    .line 782
    .line 783
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 788
    .line 789
    .line 790
    move-result v5

    .line 791
    if-eqz v5, :cond_1a

    .line 792
    .line 793
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v5

    .line 797
    check-cast v5, Landroid/util/Size;

    .line 798
    .line 799
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 800
    .line 801
    .line 802
    move-result v8

    .line 803
    move-object/from16 p3, v2

    .line 804
    .line 805
    new-instance v2, Ljava/util/ArrayList;

    .line 806
    .line 807
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 808
    .line 809
    .line 810
    const/4 v4, 0x0

    .line 811
    :goto_12
    if-ge v4, v8, :cond_19

    .line 812
    .line 813
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    add-int/lit8 v4, v4, 0x1

    .line 817
    .line 818
    goto :goto_12

    .line 819
    :cond_19
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-object/from16 v2, p3

    .line 823
    .line 824
    move-object/from16 v4, p4

    .line 825
    .line 826
    goto :goto_11

    .line 827
    :cond_1a
    move-object v1, v3

    .line 828
    :goto_13
    move-object/from16 v28, v1

    .line 829
    .line 830
    goto/16 :goto_19

    .line 831
    .line 832
    :cond_1b
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    move/from16 v3, v17

    .line 837
    .line 838
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 839
    .line 840
    .line 841
    move-result v4

    .line 842
    if-eqz v4, :cond_1c

    .line 843
    .line 844
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v4

    .line 848
    check-cast v4, Ljava/util/List;

    .line 849
    .line 850
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 851
    .line 852
    .line 853
    move-result v4

    .line 854
    mul-int/2addr v3, v4

    .line 855
    goto :goto_14

    .line 856
    :cond_1c
    if-eqz v3, :cond_71

    .line 857
    .line 858
    new-instance v2, Ljava/util/ArrayList;

    .line 859
    .line 860
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 861
    .line 862
    .line 863
    const/4 v4, 0x0

    .line 864
    :goto_15
    if-ge v4, v3, :cond_1d

    .line 865
    .line 866
    new-instance v5, Ljava/util/ArrayList;

    .line 867
    .line 868
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    add-int/lit8 v4, v4, 0x1

    .line 875
    .line 876
    goto :goto_15

    .line 877
    :cond_1d
    const/4 v4, 0x0

    .line 878
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v5

    .line 882
    check-cast v5, Ljava/util/List;

    .line 883
    .line 884
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 885
    .line 886
    .line 887
    move-result v4

    .line 888
    div-int v4, v3, v4

    .line 889
    .line 890
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 891
    .line 892
    .line 893
    move-result v5

    .line 894
    move/from16 v22, v3

    .line 895
    .line 896
    const/4 v8, 0x0

    .line 897
    :goto_16
    if-ge v8, v5, :cond_20

    .line 898
    .line 899
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v26

    .line 903
    move/from16 p3, v4

    .line 904
    .line 905
    move-object/from16 v4, v26

    .line 906
    .line 907
    check-cast v4, Ljava/util/List;

    .line 908
    .line 909
    move/from16 v26, v5

    .line 910
    .line 911
    const/4 v5, 0x0

    .line 912
    :goto_17
    if-ge v5, v3, :cond_1e

    .line 913
    .line 914
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v27

    .line 918
    move-object/from16 v28, v2

    .line 919
    .line 920
    move-object/from16 v2, v27

    .line 921
    .line 922
    check-cast v2, Ljava/util/List;

    .line 923
    .line 924
    rem-int v27, v5, v22

    .line 925
    .line 926
    move/from16 v29, v3

    .line 927
    .line 928
    div-int v3, v27, p3

    .line 929
    .line 930
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v3

    .line 934
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    add-int/lit8 v5, v5, 0x1

    .line 938
    .line 939
    move-object/from16 v2, v28

    .line 940
    .line 941
    move/from16 v3, v29

    .line 942
    .line 943
    goto :goto_17

    .line 944
    :cond_1e
    move-object/from16 v28, v2

    .line 945
    .line 946
    move/from16 v29, v3

    .line 947
    .line 948
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 949
    .line 950
    .line 951
    move-result v2

    .line 952
    add-int/lit8 v2, v2, -0x1

    .line 953
    .line 954
    if-ge v8, v2, :cond_1f

    .line 955
    .line 956
    add-int/lit8 v2, v8, 0x1

    .line 957
    .line 958
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    check-cast v2, Ljava/util/List;

    .line 963
    .line 964
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 965
    .line 966
    .line 967
    move-result v2

    .line 968
    div-int v4, p3, v2

    .line 969
    .line 970
    move/from16 v22, p3

    .line 971
    .line 972
    goto :goto_18

    .line 973
    :cond_1f
    move/from16 v4, p3

    .line 974
    .line 975
    :goto_18
    add-int/lit8 v8, v8, 0x1

    .line 976
    .line 977
    move/from16 v5, v26

    .line 978
    .line 979
    move-object/from16 v2, v28

    .line 980
    .line 981
    move/from16 v3, v29

    .line 982
    .line 983
    goto :goto_16

    .line 984
    :cond_20
    move-object/from16 v28, v2

    .line 985
    .line 986
    :goto_19
    sget-object v1, La/vrm0;->a:La/u15;

    .line 987
    .line 988
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    :cond_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 993
    .line 994
    .line 995
    move-result v2

    .line 996
    if-eqz v2, :cond_22

    .line 997
    .line 998
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v2

    .line 1002
    check-cast v2, La/l15;

    .line 1003
    .line 1004
    iget-object v3, v2, La/l15;->e:Ljava/util/List;

    .line 1005
    .line 1006
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1007
    .line 1008
    .line 1009
    const/4 v4, 0x0

    .line 1010
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v3

    .line 1014
    check-cast v3, La/hpt0;

    .line 1015
    .line 1016
    iget-object v2, v2, La/l15;->f:La/drd;

    .line 1017
    .line 1018
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1022
    .line 1023
    .line 1024
    invoke-static {v2, v3}, La/vrm0;->c(La/drd;La/hpt0;)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v2

    .line 1028
    if-eqz v2, :cond_21

    .line 1029
    .line 1030
    :goto_1a
    move/from16 v1, v17

    .line 1031
    .line 1032
    goto :goto_1b

    .line 1033
    :cond_22
    const/4 v4, 0x0

    .line 1034
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v1

    .line 1038
    :cond_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1039
    .line 1040
    .line 1041
    move-result v2

    .line 1042
    if-eqz v2, :cond_24

    .line 1043
    .line 1044
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    check-cast v2, La/fpt0;

    .line 1049
    .line 1050
    invoke-interface {v2}, La/fpt0;->v()La/hpt0;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v3

    .line 1054
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1055
    .line 1056
    .line 1057
    invoke-static {v2, v3}, La/vrm0;->c(La/drd;La/hpt0;)Z

    .line 1058
    .line 1059
    .line 1060
    move-result v2

    .line 1061
    if-eqz v2, :cond_23

    .line 1062
    .line 1063
    goto :goto_1a

    .line 1064
    :cond_24
    move v1, v4

    .line 1065
    :goto_1b
    iget-boolean v2, v0, La/hln0;->r:Z

    .line 1066
    .line 1067
    if-eqz v2, :cond_27

    .line 1068
    .line 1069
    if-nez v1, :cond_27

    .line 1070
    .line 1071
    invoke-interface/range {v28 .. v28}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v20

    .line 1075
    move-object/from16 v1, v16

    .line 1076
    .line 1077
    :goto_1c
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    .line 1078
    .line 1079
    .line 1080
    move-result v2

    .line 1081
    if-eqz v2, :cond_26

    .line 1082
    .line 1083
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v1

    .line 1087
    move-object v3, v1

    .line 1088
    check-cast v3, Ljava/util/List;

    .line 1089
    .line 1090
    iget v1, v9, La/gln0;->a:I

    .line 1091
    .line 1092
    const/4 v8, 0x0

    .line 1093
    move-object/from16 v2, p2

    .line 1094
    .line 1095
    move-object/from16 v5, p5

    .line 1096
    .line 1097
    move/from16 v18, v4

    .line 1098
    .line 1099
    move-object/from16 v19, v13

    .line 1100
    .line 1101
    move-object/from16 v30, v23

    .line 1102
    .line 1103
    move-object/from16 v31, v24

    .line 1104
    .line 1105
    const v13, 0x7fffffff

    .line 1106
    .line 1107
    .line 1108
    move-object/from16 v4, p4

    .line 1109
    .line 1110
    invoke-virtual/range {v0 .. v8}, La/hln0;->l(ILjava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Z)Ljava/util/ArrayList;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v1

    .line 1114
    move-object v2, v6

    .line 1115
    move-object v3, v7

    .line 1116
    invoke-virtual {v0, v9, v1, v2, v3}, La/hln0;->g(La/gln0;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Ljava/util/List;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v1

    .line 1120
    if-eqz v1, :cond_25

    .line 1121
    .line 1122
    goto :goto_1d

    .line 1123
    :cond_25
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    .line 1127
    .line 1128
    .line 1129
    move-object v6, v2

    .line 1130
    move-object v7, v3

    .line 1131
    move/from16 v4, v18

    .line 1132
    .line 1133
    move-object/from16 v13, v19

    .line 1134
    .line 1135
    move-object/from16 v23, v30

    .line 1136
    .line 1137
    move-object/from16 v24, v31

    .line 1138
    .line 1139
    goto :goto_1c

    .line 1140
    :cond_26
    move/from16 v18, v4

    .line 1141
    .line 1142
    move-object v2, v6

    .line 1143
    move-object v3, v7

    .line 1144
    move-object/from16 v19, v13

    .line 1145
    .line 1146
    move-object/from16 v30, v23

    .line 1147
    .line 1148
    move-object/from16 v31, v24

    .line 1149
    .line 1150
    const v13, 0x7fffffff

    .line 1151
    .line 1152
    .line 1153
    :goto_1d
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 1154
    .line 1155
    .line 1156
    move-result v4

    .line 1157
    if-eqz v4, :cond_28

    .line 1158
    .line 1159
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1160
    .line 1161
    const-string v5, "orderedSurfaceConfigListForStreamUseCase = "

    .line 1162
    .line 1163
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v4

    .line 1173
    invoke-static {v12, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1174
    .line 1175
    .line 1176
    goto :goto_1e

    .line 1177
    :cond_27
    move/from16 v18, v4

    .line 1178
    .line 1179
    move-object v2, v6

    .line 1180
    move-object v3, v7

    .line 1181
    move-object/from16 v19, v13

    .line 1182
    .line 1183
    move-object/from16 v30, v23

    .line 1184
    .line 1185
    move-object/from16 v31, v24

    .line 1186
    .line 1187
    const v13, 0x7fffffff

    .line 1188
    .line 1189
    .line 1190
    move-object/from16 v1, v16

    .line 1191
    .line 1192
    :cond_28
    :goto_1e
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v4

    .line 1196
    move v5, v13

    .line 1197
    :goto_1f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1198
    .line 1199
    .line 1200
    move-result v6

    .line 1201
    if-eqz v6, :cond_29

    .line 1202
    .line 1203
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v6

    .line 1207
    check-cast v6, La/l15;

    .line 1208
    .line 1209
    iget v7, v6, La/l15;->b:I

    .line 1210
    .line 1211
    iget-object v8, v6, La/l15;->c:Landroid/util/Size;

    .line 1212
    .line 1213
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1214
    .line 1215
    .line 1216
    iget v6, v6, La/l15;->j:I

    .line 1217
    .line 1218
    invoke-virtual {v0, v7, v8, v11, v6}, La/hln0;->e(ILandroid/util/Size;ZI)I

    .line 1219
    .line 1220
    .line 1221
    move-result v6

    .line 1222
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 1223
    .line 1224
    .line 1225
    move-result v5

    .line 1226
    goto :goto_1f

    .line 1227
    :cond_29
    invoke-interface/range {v28 .. v28}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v20

    .line 1231
    move v4, v13

    .line 1232
    move v8, v4

    .line 1233
    move-object/from16 v24, v16

    .line 1234
    .line 1235
    move-object/from16 v26, v24

    .line 1236
    .line 1237
    move/from16 v22, v18

    .line 1238
    .line 1239
    move/from16 v23, v22

    .line 1240
    .line 1241
    :goto_20
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    .line 1242
    .line 1243
    .line 1244
    move-result v6

    .line 1245
    const-string v27, "Required value was null."

    .line 1246
    .line 1247
    if-eqz v6, :cond_3a

    .line 1248
    .line 1249
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v6

    .line 1253
    check-cast v6, Ljava/util/List;

    .line 1254
    .line 1255
    move-object v7, v3

    .line 1256
    move-object v3, v6

    .line 1257
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 1258
    .line 1259
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1260
    .line 1261
    .line 1262
    move-object/from16 v28, v7

    .line 1263
    .line 1264
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 1265
    .line 1266
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1267
    .line 1268
    .line 1269
    move-object/from16 v29, v1

    .line 1270
    .line 1271
    iget v1, v9, La/gln0;->a:I

    .line 1272
    .line 1273
    move/from16 v32, v8

    .line 1274
    .line 1275
    iget-boolean v8, v9, La/gln0;->h:Z

    .line 1276
    .line 1277
    move-object/from16 v34, v2

    .line 1278
    .line 1279
    move/from16 v33, v4

    .line 1280
    .line 1281
    move v13, v5

    .line 1282
    move-object/from16 v35, v28

    .line 1283
    .line 1284
    move-object/from16 v36, v29

    .line 1285
    .line 1286
    move/from16 v9, v32

    .line 1287
    .line 1288
    move-object/from16 v2, p2

    .line 1289
    .line 1290
    move-object/from16 v4, p4

    .line 1291
    .line 1292
    move-object/from16 v5, p5

    .line 1293
    .line 1294
    invoke-virtual/range {v0 .. v8}, La/hln0;->l(ILjava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Z)Ljava/util/ArrayList;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v1

    .line 1298
    move-object v8, v3

    .line 1299
    move-object v2, v6

    .line 1300
    move-object v3, v7

    .line 1301
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v6

    .line 1305
    move-object/from16 p3, v1

    .line 1306
    .line 1307
    move v7, v13

    .line 1308
    move/from16 v1, v18

    .line 1309
    .line 1310
    :goto_21
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1311
    .line 1312
    .line 1313
    move-result v29

    .line 1314
    if-eqz v29, :cond_2a

    .line 1315
    .line 1316
    add-int/lit8 v29, v1, 0x1

    .line 1317
    .line 1318
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v32

    .line 1322
    move-object/from16 v37, v6

    .line 1323
    .line 1324
    move-object/from16 v6, v32

    .line 1325
    .line 1326
    check-cast v6, Landroid/util/Size;

    .line 1327
    .line 1328
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v1

    .line 1332
    check-cast v1, Ljava/lang/Number;

    .line 1333
    .line 1334
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1335
    .line 1336
    .line 1337
    move-result v1

    .line 1338
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v1

    .line 1342
    check-cast v1, La/fpt0;

    .line 1343
    .line 1344
    invoke-interface {v1}, La/h0x;->k()I

    .line 1345
    .line 1346
    .line 1347
    move-result v4

    .line 1348
    invoke-interface {v1, v6}, La/fpt0;->w(Landroid/util/Size;)I

    .line 1349
    .line 1350
    .line 1351
    move-result v1

    .line 1352
    invoke-virtual {v0, v4, v6, v11, v1}, La/hln0;->e(ILandroid/util/Size;ZI)I

    .line 1353
    .line 1354
    .line 1355
    move-result v1

    .line 1356
    invoke-static {v7, v1}, Ljava/lang/Math;->min(II)I

    .line 1357
    .line 1358
    .line 1359
    move-result v7

    .line 1360
    move-object/from16 v4, p4

    .line 1361
    .line 1362
    move/from16 v1, v29

    .line 1363
    .line 1364
    move-object/from16 v6, v37

    .line 1365
    .line 1366
    goto :goto_21

    .line 1367
    :cond_2a
    sget-object v1, La/h55;->h:Landroid/util/Range;

    .line 1368
    .line 1369
    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1370
    .line 1371
    .line 1372
    move-result v1

    .line 1373
    if-nez v1, :cond_2b

    .line 1374
    .line 1375
    if-ge v7, v13, :cond_2b

    .line 1376
    .line 1377
    invoke-virtual {v14}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v1

    .line 1381
    check-cast v1, Ljava/lang/Number;

    .line 1382
    .line 1383
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1384
    .line 1385
    .line 1386
    move-result v1

    .line 1387
    if-ge v7, v1, :cond_2b

    .line 1388
    .line 1389
    move/from16 v29, v18

    .line 1390
    .line 1391
    goto :goto_22

    .line 1392
    :cond_2b
    move/from16 v29, v17

    .line 1393
    .line 1394
    :goto_22
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 1395
    .line 1396
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v1

    .line 1403
    move/from16 v6, v18

    .line 1404
    .line 1405
    :goto_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1406
    .line 1407
    .line 1408
    move-result v32

    .line 1409
    if-eqz v32, :cond_30

    .line 1410
    .line 1411
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v32

    .line 1415
    add-int/lit8 v37, v6, 0x1

    .line 1416
    .line 1417
    if-ltz v6, :cond_2f

    .line 1418
    .line 1419
    move-object/from16 v0, v32

    .line 1420
    .line 1421
    check-cast v0, La/wln0;

    .line 1422
    .line 1423
    move-object/from16 v32, v1

    .line 1424
    .line 1425
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v1

    .line 1429
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v1

    .line 1433
    check-cast v1, La/l15;

    .line 1434
    .line 1435
    if-eqz v1, :cond_2c

    .line 1436
    .line 1437
    iget-object v1, v1, La/l15;->d:La/agn;

    .line 1438
    .line 1439
    if-nez v1, :cond_2d

    .line 1440
    .line 1441
    :cond_2c
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v1

    .line 1445
    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v1

    .line 1449
    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v1

    .line 1453
    if-eqz v1, :cond_2e

    .line 1454
    .line 1455
    check-cast v1, La/agn;

    .line 1456
    .line 1457
    :cond_2d
    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1458
    .line 1459
    .line 1460
    move-object/from16 v0, p0

    .line 1461
    .line 1462
    move-object/from16 v1, v32

    .line 1463
    .line 1464
    move/from16 v6, v37

    .line 1465
    .line 1466
    goto :goto_23

    .line 1467
    :cond_2e
    invoke-static/range {v27 .. v27}, La/jf4;->o(Ljava/lang/String;)V

    .line 1468
    .line 1469
    .line 1470
    return-object v16

    .line 1471
    :cond_2f
    invoke-static {}, La/q3d;->p()V

    .line 1472
    .line 1473
    .line 1474
    throw v16

    .line 1475
    :cond_30
    sget-object v0, La/wez;->b:La/wez;

    .line 1476
    .line 1477
    move-object v1, v0

    .line 1478
    new-instance v0, La/co0;

    .line 1479
    .line 1480
    move v6, v7

    .line 1481
    const/16 v7, 0x9

    .line 1482
    .line 1483
    move-object v10, v3

    .line 1484
    move-object/from16 v3, p3

    .line 1485
    .line 1486
    move/from16 p3, v13

    .line 1487
    .line 1488
    move-object v13, v10

    .line 1489
    move-object v10, v1

    .line 1490
    move-object/from16 v32, v8

    .line 1491
    .line 1492
    move/from16 v37, v11

    .line 1493
    .line 1494
    move-object/from16 v1, p0

    .line 1495
    .line 1496
    move-object v11, v2

    .line 1497
    move v8, v6

    .line 1498
    move-object/from16 v2, p1

    .line 1499
    .line 1500
    move-object v6, v5

    .line 1501
    move-object/from16 v5, p4

    .line 1502
    .line 1503
    invoke-direct/range {v0 .. v7}, La/co0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1504
    .line 1505
    .line 1506
    move-object v4, v1

    .line 1507
    move-object v1, v0

    .line 1508
    move-object v0, v4

    .line 1509
    move-object v4, v5

    .line 1510
    move-object v5, v6

    .line 1511
    invoke-static {v10, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v1

    .line 1515
    if-nez v22, :cond_34

    .line 1516
    .line 1517
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    check-cast v1, Ljava/lang/Boolean;

    .line 1522
    .line 1523
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1524
    .line 1525
    .line 1526
    move-result v1

    .line 1527
    if-eqz v1, :cond_34

    .line 1528
    .line 1529
    const v1, 0x7fffffff

    .line 1530
    .line 1531
    .line 1532
    if-ne v9, v1, :cond_31

    .line 1533
    .line 1534
    goto :goto_24

    .line 1535
    :cond_31
    if-ge v9, v8, :cond_32

    .line 1536
    .line 1537
    :goto_24
    move v9, v8

    .line 1538
    move-object/from16 v24, v32

    .line 1539
    .line 1540
    :cond_32
    if-eqz v29, :cond_34

    .line 1541
    .line 1542
    if-eqz v23, :cond_33

    .line 1543
    .line 1544
    move-object/from16 v40, v26

    .line 1545
    .line 1546
    move-object/from16 v39, v32

    .line 1547
    .line 1548
    move/from16 v42, v33

    .line 1549
    .line 1550
    move-object/from16 v1, v36

    .line 1551
    .line 1552
    goto/16 :goto_28

    .line 1553
    .line 1554
    :cond_33
    move v9, v8

    .line 1555
    move/from16 v22, v17

    .line 1556
    .line 1557
    move-object/from16 v24, v32

    .line 1558
    .line 1559
    :cond_34
    move-object/from16 v1, v36

    .line 1560
    .line 1561
    if-eqz v1, :cond_39

    .line 1562
    .line 1563
    if-nez v23, :cond_39

    .line 1564
    .line 1565
    invoke-virtual {v0, v2, v3, v11, v13}, La/hln0;->g(La/gln0;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Ljava/util/List;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v3

    .line 1569
    if-eqz v3, :cond_39

    .line 1570
    .line 1571
    move/from16 v13, v33

    .line 1572
    .line 1573
    const v3, 0x7fffffff

    .line 1574
    .line 1575
    .line 1576
    if-ne v13, v3, :cond_35

    .line 1577
    .line 1578
    goto :goto_25

    .line 1579
    :cond_35
    if-ge v13, v8, :cond_36

    .line 1580
    .line 1581
    :goto_25
    move v13, v8

    .line 1582
    move-object/from16 v26, v32

    .line 1583
    .line 1584
    :cond_36
    if-eqz v29, :cond_38

    .line 1585
    .line 1586
    if-eqz v22, :cond_37

    .line 1587
    .line 1588
    move/from16 v42, v8

    .line 1589
    .line 1590
    move v8, v9

    .line 1591
    move-object/from16 v39, v24

    .line 1592
    .line 1593
    move-object/from16 v40, v32

    .line 1594
    .line 1595
    goto :goto_28

    .line 1596
    :cond_37
    move/from16 v5, p3

    .line 1597
    .line 1598
    move-object/from16 v10, p6

    .line 1599
    .line 1600
    move v4, v8

    .line 1601
    move v8, v9

    .line 1602
    move/from16 v23, v17

    .line 1603
    .line 1604
    move-object/from16 v26, v32

    .line 1605
    .line 1606
    :goto_26
    move-object/from16 v3, v35

    .line 1607
    .line 1608
    move/from16 v11, v37

    .line 1609
    .line 1610
    const v13, 0x7fffffff

    .line 1611
    .line 1612
    .line 1613
    move-object v9, v2

    .line 1614
    move-object/from16 v2, v34

    .line 1615
    .line 1616
    goto/16 :goto_20

    .line 1617
    .line 1618
    :cond_38
    :goto_27
    move/from16 v5, p3

    .line 1619
    .line 1620
    move-object/from16 v10, p6

    .line 1621
    .line 1622
    move v8, v9

    .line 1623
    move v4, v13

    .line 1624
    goto :goto_26

    .line 1625
    :cond_39
    move/from16 v13, v33

    .line 1626
    .line 1627
    goto :goto_27

    .line 1628
    :cond_3a
    move-object/from16 v5, p5

    .line 1629
    .line 1630
    move-object/from16 v34, v2

    .line 1631
    .line 1632
    move-object/from16 v35, v3

    .line 1633
    .line 1634
    move v13, v4

    .line 1635
    move-object v2, v9

    .line 1636
    move/from16 v37, v11

    .line 1637
    .line 1638
    move-object/from16 v4, p4

    .line 1639
    .line 1640
    move v9, v8

    .line 1641
    move/from16 v42, v13

    .line 1642
    .line 1643
    move-object/from16 v39, v24

    .line 1644
    .line 1645
    move-object/from16 v40, v26

    .line 1646
    .line 1647
    :goto_28
    if-nez v39, :cond_3c

    .line 1648
    .line 1649
    :cond_3b
    :goto_29
    move-object/from16 v3, v16

    .line 1650
    .line 1651
    goto :goto_2a

    .line 1652
    :cond_3c
    if-eqz v21, :cond_3d

    .line 1653
    .line 1654
    sget-object v3, La/h55;->h:Landroid/util/Range;

    .line 1655
    .line 1656
    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1657
    .line 1658
    .line 1659
    move-result v3

    .line 1660
    if-nez v3, :cond_3d

    .line 1661
    .line 1662
    const v13, 0x7fffffff

    .line 1663
    .line 1664
    .line 1665
    if-eq v8, v13, :cond_3b

    .line 1666
    .line 1667
    invoke-virtual {v14}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v3

    .line 1671
    check-cast v3, Ljava/lang/Number;

    .line 1672
    .line 1673
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1674
    .line 1675
    .line 1676
    move-result v3

    .line 1677
    if-ge v8, v3, :cond_3d

    .line 1678
    .line 1679
    goto :goto_29

    .line 1680
    :cond_3d
    new-instance v38, La/eln0;

    .line 1681
    .line 1682
    const v43, 0x7fffffff

    .line 1683
    .line 1684
    .line 1685
    move/from16 v41, v8

    .line 1686
    .line 1687
    invoke-direct/range {v38 .. v43}, La/eln0;-><init>(Ljava/util/List;Ljava/util/List;III)V

    .line 1688
    .line 1689
    .line 1690
    move-object/from16 v3, v38

    .line 1691
    .line 1692
    :goto_2a
    if-eqz v3, :cond_70

    .line 1693
    .line 1694
    iget v0, v3, La/eln0;->c:I

    .line 1695
    .line 1696
    iget-object v6, v3, La/eln0;->a:Ljava/util/List;

    .line 1697
    .line 1698
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 1699
    .line 1700
    .line 1701
    move-result v7

    .line 1702
    if-eqz v7, :cond_3e

    .line 1703
    .line 1704
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1705
    .line 1706
    const-string v8, "resolveSpecsBySettings: bestSizesAndFps = "

    .line 1707
    .line 1708
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1709
    .line 1710
    .line 1711
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1712
    .line 1713
    .line 1714
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v7

    .line 1718
    invoke-static {v12, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1719
    .line 1720
    .line 1721
    :cond_3e
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 1722
    .line 1723
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1724
    .line 1725
    .line 1726
    sget-object v8, La/h55;->h:Landroid/util/Range;

    .line 1727
    .line 1728
    invoke-static {v14, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1729
    .line 1730
    .line 1731
    move-result v9

    .line 1732
    if-nez v9, :cond_43

    .line 1733
    .line 1734
    if-eqz v37, :cond_3f

    .line 1735
    .line 1736
    invoke-virtual {v15, v6}, La/pxv;->b(Ljava/util/List;)[Landroid/util/Range;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v8

    .line 1740
    goto :goto_2b

    .line 1741
    :cond_3f
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 1742
    .line 1743
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1744
    .line 1745
    .line 1746
    move-object/from16 v13, v19

    .line 1747
    .line 1748
    check-cast v13, La/ow9;

    .line 1749
    .line 1750
    invoke-virtual {v13, v8}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v8

    .line 1754
    check-cast v8, [Landroid/util/Range;

    .line 1755
    .line 1756
    :goto_2b
    invoke-static {v14, v0, v8}, La/hln0;->d(Landroid/util/Range;I[Landroid/util/Range;)Landroid/util/Range;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v9

    .line 1760
    if-nez v21, :cond_40

    .line 1761
    .line 1762
    iget-boolean v10, v2, La/gln0;->j:Z

    .line 1763
    .line 1764
    if-eqz v10, :cond_41

    .line 1765
    .line 1766
    :cond_40
    invoke-virtual {v9, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1767
    .line 1768
    .line 1769
    move-result v10

    .line 1770
    if-eqz v10, :cond_42

    .line 1771
    .line 1772
    :cond_41
    move-object v8, v9

    .line 1773
    goto :goto_2c

    .line 1774
    :cond_42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1775
    .line 1776
    const-string v2, "Target FPS range "

    .line 1777
    .line 1778
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1779
    .line 1780
    .line 1781
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1782
    .line 1783
    .line 1784
    const-string v2, " is not supported. Max FPS supported by the calculated best combination: "

    .line 1785
    .line 1786
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1787
    .line 1788
    .line 1789
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1790
    .line 1791
    .line 1792
    const-string v0, ". Calculated best FPS range for device: "

    .line 1793
    .line 1794
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1795
    .line 1796
    .line 1797
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1798
    .line 1799
    .line 1800
    invoke-static {v8}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v0

    .line 1804
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1805
    .line 1806
    .line 1807
    const-string v2, ". Device supported FPS ranges: "

    .line 1808
    .line 1809
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1813
    .line 1814
    .line 1815
    const/16 v6, 0x2e

    .line 1816
    .line 1817
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1818
    .line 1819
    .line 1820
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v0

    .line 1824
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1825
    .line 1826
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v0

    .line 1830
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1831
    .line 1832
    .line 1833
    throw v1

    .line 1834
    :cond_43
    if-eqz v37, :cond_44

    .line 1835
    .line 1836
    invoke-virtual {v15, v6}, La/pxv;->b(Ljava/util/List;)[Landroid/util/Range;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v8

    .line 1840
    sget-object v9, La/pxv;->f:Landroid/util/Range;

    .line 1841
    .line 1842
    invoke-static {v9, v0, v8}, La/hln0;->d(Landroid/util/Range;I[Landroid/util/Range;)Landroid/util/Range;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v8

    .line 1846
    :cond_44
    :goto_2c
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v4

    .line 1850
    move/from16 v9, v18

    .line 1851
    .line 1852
    :goto_2d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1853
    .line 1854
    .line 1855
    move-result v10

    .line 1856
    const-string v11, "Null expectedFrameRateRange"

    .line 1857
    .line 1858
    if-eqz v10, :cond_4c

    .line 1859
    .line 1860
    add-int/lit8 v10, v9, 0x1

    .line 1861
    .line 1862
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v12

    .line 1866
    check-cast v12, La/fpt0;

    .line 1867
    .line 1868
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v9

    .line 1872
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 1873
    .line 1874
    .line 1875
    move-result v9

    .line 1876
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v9

    .line 1880
    check-cast v9, Landroid/util/Size;

    .line 1881
    .line 1882
    invoke-static {v9}, La/h55;->a(Landroid/util/Size;)La/qgd;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v9

    .line 1886
    invoke-static/range {v37 .. v37}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v13

    .line 1890
    iput-object v13, v9, La/qgd;->e:Ljava/lang/Object;

    .line 1891
    .line 1892
    move-object/from16 v13, p6

    .line 1893
    .line 1894
    invoke-virtual {v13, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v14

    .line 1898
    if-eqz v14, :cond_4b

    .line 1899
    .line 1900
    check-cast v14, La/agn;

    .line 1901
    .line 1902
    iput-object v14, v9, La/qgd;->d:Ljava/lang/Object;

    .line 1903
    .line 1904
    sget-object v14, La/vrm0;->a:La/u15;

    .line 1905
    .line 1906
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1907
    .line 1908
    .line 1909
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v14

    .line 1913
    sget-object v15, La/hx9;->h:La/u15;

    .line 1914
    .line 1915
    invoke-interface {v12, v15}, La/qae0;->f(La/u15;)Z

    .line 1916
    .line 1917
    .line 1918
    move-result v20

    .line 1919
    move-object/from16 p0, v4

    .line 1920
    .line 1921
    if-eqz v20, :cond_45

    .line 1922
    .line 1923
    invoke-interface {v12, v15}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v4

    .line 1927
    invoke-virtual {v14, v15, v4}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 1928
    .line 1929
    .line 1930
    :cond_45
    sget-object v4, La/fpt0;->L0:La/u15;

    .line 1931
    .line 1932
    invoke-interface {v12, v4}, La/qae0;->f(La/u15;)Z

    .line 1933
    .line 1934
    .line 1935
    move-result v15

    .line 1936
    if-eqz v15, :cond_46

    .line 1937
    .line 1938
    invoke-interface {v12, v4}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v15

    .line 1942
    invoke-virtual {v14, v4, v15}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 1943
    .line 1944
    .line 1945
    :cond_46
    sget-object v4, La/nzw;->b:La/u15;

    .line 1946
    .line 1947
    invoke-interface {v12, v4}, La/qae0;->f(La/u15;)Z

    .line 1948
    .line 1949
    .line 1950
    move-result v15

    .line 1951
    if-eqz v15, :cond_47

    .line 1952
    .line 1953
    invoke-interface {v12, v4}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v15

    .line 1957
    invoke-virtual {v14, v4, v15}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 1958
    .line 1959
    .line 1960
    :cond_47
    sget-object v4, La/h0x;->h0:La/u15;

    .line 1961
    .line 1962
    invoke-interface {v12, v4}, La/qae0;->f(La/u15;)Z

    .line 1963
    .line 1964
    .line 1965
    move-result v15

    .line 1966
    if-eqz v15, :cond_48

    .line 1967
    .line 1968
    invoke-interface {v12, v4}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 1969
    .line 1970
    .line 1971
    move-result-object v15

    .line 1972
    invoke-virtual {v14, v4, v15}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 1973
    .line 1974
    .line 1975
    :cond_48
    new-instance v4, La/hx9;

    .line 1976
    .line 1977
    const/16 v15, 0x14

    .line 1978
    .line 1979
    invoke-direct {v4, v14, v15}, La/h03;-><init>(Ljava/lang/Object;B)V

    .line 1980
    .line 1981
    .line 1982
    iput-object v4, v9, La/qgd;->g:Ljava/lang/Object;

    .line 1983
    .line 1984
    iget-boolean v4, v2, La/gln0;->c:Z

    .line 1985
    .line 1986
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v4

    .line 1990
    iput-object v4, v9, La/qgd;->h:Ljava/lang/Object;

    .line 1991
    .line 1992
    sget-object v4, La/h55;->h:Landroid/util/Range;

    .line 1993
    .line 1994
    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1995
    .line 1996
    .line 1997
    move-result v4

    .line 1998
    if-nez v4, :cond_4a

    .line 1999
    .line 2000
    if-eqz v8, :cond_49

    .line 2001
    .line 2002
    iput-object v8, v9, La/qgd;->f:Ljava/lang/Object;

    .line 2003
    .line 2004
    goto :goto_2e

    .line 2005
    :cond_49
    invoke-static {v11}, La/hny;->u(Ljava/lang/String;)V

    .line 2006
    .line 2007
    .line 2008
    return-object v16

    .line 2009
    :cond_4a
    :goto_2e
    invoke-virtual {v9}, La/qgd;->i()La/h55;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v4

    .line 2013
    invoke-interface {v7, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2014
    .line 2015
    .line 2016
    move-object/from16 v4, p0

    .line 2017
    .line 2018
    move v9, v10

    .line 2019
    goto/16 :goto_2d

    .line 2020
    .line 2021
    :cond_4b
    invoke-static/range {v27 .. v27}, La/jf4;->n(Ljava/lang/String;)V

    .line 2022
    .line 2023
    .line 2024
    return-object v16

    .line 2025
    :cond_4c
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 2026
    .line 2027
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2028
    .line 2029
    .line 2030
    if-eqz v1, :cond_6f

    .line 2031
    .line 2032
    iget-object v4, v3, La/eln0;->b:Ljava/util/List;

    .line 2033
    .line 2034
    iget v5, v3, La/eln0;->d:I

    .line 2035
    .line 2036
    if-ne v0, v5, :cond_6f

    .line 2037
    .line 2038
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 2039
    .line 2040
    .line 2041
    move-result v0

    .line 2042
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2043
    .line 2044
    .line 2045
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 2046
    .line 2047
    .line 2048
    move-result v5

    .line 2049
    if-ne v0, v5, :cond_6f

    .line 2050
    .line 2051
    invoke-static {v6, v4}, Lkotlin/collections/CollectionsKt;->T0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v0

    .line 2055
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2056
    .line 2057
    .line 2058
    move-result v4

    .line 2059
    if-eqz v4, :cond_4d

    .line 2060
    .line 2061
    goto :goto_2f

    .line 2062
    :cond_4d
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v0

    .line 2066
    :cond_4e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2067
    .line 2068
    .line 2069
    move-result v4

    .line 2070
    if-eqz v4, :cond_4f

    .line 2071
    .line 2072
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v4

    .line 2076
    check-cast v4, Lkotlin/Pair;

    .line 2077
    .line 2078
    iget-object v5, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 2079
    .line 2080
    iget-object v4, v4, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 2081
    .line 2082
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2083
    .line 2084
    .line 2085
    move-result v4

    .line 2086
    if-nez v4, :cond_4e

    .line 2087
    .line 2088
    goto/16 :goto_3c

    .line 2089
    .line 2090
    :cond_4f
    :goto_2f
    sget-object v0, La/vrm0;->a:La/u15;

    .line 2091
    .line 2092
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2093
    .line 2094
    .line 2095
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2096
    .line 2097
    const/16 v4, 0x21

    .line 2098
    .line 2099
    const-string v5, "Null dynamicRange"

    .line 2100
    .line 2101
    if-ge v0, v4, :cond_50

    .line 2102
    .line 2103
    goto/16 :goto_39

    .line 2104
    .line 2105
    :cond_50
    new-instance v0, Ljava/util/ArrayList;

    .line 2106
    .line 2107
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v4

    .line 2111
    check-cast v4, Ljava/util/Collection;

    .line 2112
    .line 2113
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2114
    .line 2115
    .line 2116
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v4

    .line 2120
    :goto_30
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2121
    .line 2122
    .line 2123
    move-result v6

    .line 2124
    if-eqz v6, :cond_52

    .line 2125
    .line 2126
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v6

    .line 2130
    check-cast v6, La/l15;

    .line 2131
    .line 2132
    iget-object v6, v6, La/l15;->f:La/drd;

    .line 2133
    .line 2134
    if-eqz v6, :cond_51

    .line 2135
    .line 2136
    goto :goto_30

    .line 2137
    :cond_51
    invoke-static/range {v27 .. v27}, La/jf4;->n(Ljava/lang/String;)V

    .line 2138
    .line 2139
    .line 2140
    return-object v16

    .line 2141
    :cond_52
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v4

    .line 2145
    :goto_31
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2146
    .line 2147
    .line 2148
    move-result v6

    .line 2149
    if-eqz v6, :cond_55

    .line 2150
    .line 2151
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v6

    .line 2155
    check-cast v6, La/fpt0;

    .line 2156
    .line 2157
    invoke-virtual {v7, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2158
    .line 2159
    .line 2160
    move-result-object v6

    .line 2161
    if-eqz v6, :cond_54

    .line 2162
    .line 2163
    check-cast v6, La/h55;

    .line 2164
    .line 2165
    iget-object v6, v6, La/h55;->f:La/drd;

    .line 2166
    .line 2167
    if-eqz v6, :cond_53

    .line 2168
    .line 2169
    goto :goto_31

    .line 2170
    :cond_53
    invoke-static/range {v27 .. v27}, La/jf4;->n(Ljava/lang/String;)V

    .line 2171
    .line 2172
    .line 2173
    return-object v16

    .line 2174
    :cond_54
    invoke-static/range {v27 .. v27}, La/jf4;->n(Ljava/lang/String;)V

    .line 2175
    .line 2176
    .line 2177
    return-object v16

    .line 2178
    :cond_55
    invoke-static {}, La/uq6;->e()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v4

    .line 2182
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2183
    .line 2184
    .line 2185
    move-object/from16 v13, v19

    .line 2186
    .line 2187
    check-cast v13, La/ow9;

    .line 2188
    .line 2189
    invoke-virtual {v13, v4}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v4

    .line 2193
    check-cast v4, [J

    .line 2194
    .line 2195
    if-eqz v4, :cond_68

    .line 2196
    .line 2197
    array-length v6, v4

    .line 2198
    if-nez v6, :cond_56

    .line 2199
    .line 2200
    goto/16 :goto_39

    .line 2201
    .line 2202
    :cond_56
    new-instance v6, Ljava/util/HashSet;

    .line 2203
    .line 2204
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 2205
    .line 2206
    .line 2207
    array-length v8, v4

    .line 2208
    move/from16 v9, v18

    .line 2209
    .line 2210
    :goto_32
    if-ge v9, v8, :cond_57

    .line 2211
    .line 2212
    aget-wide v12, v4, v9

    .line 2213
    .line 2214
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v10

    .line 2218
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2219
    .line 2220
    .line 2221
    add-int/lit8 v9, v9, 0x1

    .line 2222
    .line 2223
    goto :goto_32

    .line 2224
    :cond_57
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 2225
    .line 2226
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2227
    .line 2228
    .line 2229
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2230
    .line 2231
    .line 2232
    move-result-object v8

    .line 2233
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2234
    .line 2235
    .line 2236
    move-result v9

    .line 2237
    const-wide/16 v12, 0x0

    .line 2238
    .line 2239
    if-eqz v9, :cond_5a

    .line 2240
    .line 2241
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2242
    .line 2243
    .line 2244
    move-result-object v8

    .line 2245
    check-cast v8, La/l15;

    .line 2246
    .line 2247
    iget-object v9, v8, La/l15;->f:La/drd;

    .line 2248
    .line 2249
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2250
    .line 2251
    .line 2252
    sget-object v10, La/hx9;->h:La/u15;

    .line 2253
    .line 2254
    invoke-interface {v9, v10}, La/drd;->f(La/u15;)Z

    .line 2255
    .line 2256
    .line 2257
    move-result v9

    .line 2258
    if-nez v9, :cond_58

    .line 2259
    .line 2260
    :goto_33
    move/from16 v9, v17

    .line 2261
    .line 2262
    move/from16 v8, v18

    .line 2263
    .line 2264
    goto :goto_34

    .line 2265
    :cond_58
    iget-object v8, v8, La/l15;->f:La/drd;

    .line 2266
    .line 2267
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2268
    .line 2269
    .line 2270
    invoke-interface {v8, v10}, La/drd;->d(La/u15;)Ljava/lang/Object;

    .line 2271
    .line 2272
    .line 2273
    move-result-object v8

    .line 2274
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2275
    .line 2276
    .line 2277
    check-cast v8, Ljava/lang/Number;

    .line 2278
    .line 2279
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 2280
    .line 2281
    .line 2282
    move-result-wide v8

    .line 2283
    cmp-long v8, v8, v12

    .line 2284
    .line 2285
    if-nez v8, :cond_59

    .line 2286
    .line 2287
    goto :goto_33

    .line 2288
    :cond_59
    move/from16 v8, v17

    .line 2289
    .line 2290
    move/from16 v9, v18

    .line 2291
    .line 2292
    goto :goto_34

    .line 2293
    :cond_5a
    move/from16 v8, v18

    .line 2294
    .line 2295
    move v9, v8

    .line 2296
    :goto_34
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v10

    .line 2300
    :goto_35
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 2301
    .line 2302
    .line 2303
    move-result v14

    .line 2304
    if-eqz v14, :cond_60

    .line 2305
    .line 2306
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v14

    .line 2310
    check-cast v14, La/fpt0;

    .line 2311
    .line 2312
    sget-object v15, La/hx9;->h:La/u15;

    .line 2313
    .line 2314
    invoke-interface {v14, v15}, La/qae0;->f(La/u15;)Z

    .line 2315
    .line 2316
    .line 2317
    move-result v19

    .line 2318
    const-string v20, "Either all use cases must have non-default stream use case assigned or none should have it"

    .line 2319
    .line 2320
    if-nez v19, :cond_5c

    .line 2321
    .line 2322
    if-nez v8, :cond_5b

    .line 2323
    .line 2324
    :goto_36
    move/from16 v9, v17

    .line 2325
    .line 2326
    goto :goto_35

    .line 2327
    :cond_5b
    invoke-static/range {v20 .. v20}, La/jf4;->o(Ljava/lang/String;)V

    .line 2328
    .line 2329
    .line 2330
    return-object v16

    .line 2331
    :cond_5c
    invoke-interface {v14, v15}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v14

    .line 2335
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2336
    .line 2337
    .line 2338
    check-cast v14, Ljava/lang/Number;

    .line 2339
    .line 2340
    invoke-virtual {v14}, Ljava/lang/Number;->longValue()J

    .line 2341
    .line 2342
    .line 2343
    move-result-wide v14

    .line 2344
    cmp-long v19, v14, v12

    .line 2345
    .line 2346
    if-nez v19, :cond_5e

    .line 2347
    .line 2348
    if-nez v8, :cond_5d

    .line 2349
    .line 2350
    goto :goto_36

    .line 2351
    :cond_5d
    invoke-static/range {v20 .. v20}, La/jf4;->o(Ljava/lang/String;)V

    .line 2352
    .line 2353
    .line 2354
    return-object v16

    .line 2355
    :cond_5e
    if-nez v9, :cond_5f

    .line 2356
    .line 2357
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2358
    .line 2359
    .line 2360
    move-result-object v8

    .line 2361
    invoke-interface {v4, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2362
    .line 2363
    .line 2364
    move/from16 v8, v17

    .line 2365
    .line 2366
    goto :goto_35

    .line 2367
    :cond_5f
    invoke-static/range {v20 .. v20}, La/jf4;->o(Ljava/lang/String;)V

    .line 2368
    .line 2369
    .line 2370
    return-object v16

    .line 2371
    :cond_60
    if-nez v9, :cond_68

    .line 2372
    .line 2373
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2374
    .line 2375
    .line 2376
    move-result-object v4

    .line 2377
    :cond_61
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2378
    .line 2379
    .line 2380
    move-result v8

    .line 2381
    if-eqz v8, :cond_62

    .line 2382
    .line 2383
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2384
    .line 2385
    .line 2386
    move-result-object v8

    .line 2387
    check-cast v8, Ljava/lang/Number;

    .line 2388
    .line 2389
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 2390
    .line 2391
    .line 2392
    move-result-wide v8

    .line 2393
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2394
    .line 2395
    .line 2396
    move-result-object v8

    .line 2397
    invoke-virtual {v6, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 2398
    .line 2399
    .line 2400
    move-result v8

    .line 2401
    if-nez v8, :cond_61

    .line 2402
    .line 2403
    goto/16 :goto_39

    .line 2404
    .line 2405
    :cond_62
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2406
    .line 2407
    .line 2408
    move-result-object v1

    .line 2409
    :cond_63
    :goto_37
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2410
    .line 2411
    .line 2412
    move-result v4

    .line 2413
    if-eqz v4, :cond_66

    .line 2414
    .line 2415
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2416
    .line 2417
    .line 2418
    move-result-object v4

    .line 2419
    check-cast v4, La/l15;

    .line 2420
    .line 2421
    iget-object v6, v4, La/l15;->f:La/drd;

    .line 2422
    .line 2423
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2424
    .line 2425
    .line 2426
    sget-object v8, La/hx9;->h:La/u15;

    .line 2427
    .line 2428
    invoke-interface {v6, v8}, La/drd;->d(La/u15;)Ljava/lang/Object;

    .line 2429
    .line 2430
    .line 2431
    move-result-object v8

    .line 2432
    check-cast v8, Ljava/lang/Long;

    .line 2433
    .line 2434
    invoke-static {v6, v8}, La/vrm0;->a(La/drd;Ljava/lang/Long;)La/hx9;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v6

    .line 2438
    if-eqz v6, :cond_63

    .line 2439
    .line 2440
    iget-object v8, v4, La/l15;->c:Landroid/util/Size;

    .line 2441
    .line 2442
    invoke-static {v8}, La/h55;->a(Landroid/util/Size;)La/qgd;

    .line 2443
    .line 2444
    .line 2445
    move-result-object v8

    .line 2446
    iget v9, v4, La/l15;->g:I

    .line 2447
    .line 2448
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2449
    .line 2450
    .line 2451
    move-result-object v9

    .line 2452
    iput-object v9, v8, La/qgd;->e:Ljava/lang/Object;

    .line 2453
    .line 2454
    iget-object v9, v4, La/l15;->h:Landroid/util/Range;

    .line 2455
    .line 2456
    if-eqz v9, :cond_65

    .line 2457
    .line 2458
    iput-object v9, v8, La/qgd;->f:Ljava/lang/Object;

    .line 2459
    .line 2460
    iget-object v9, v4, La/l15;->d:La/agn;

    .line 2461
    .line 2462
    if-eqz v9, :cond_64

    .line 2463
    .line 2464
    iput-object v9, v8, La/qgd;->d:Ljava/lang/Object;

    .line 2465
    .line 2466
    iput-object v6, v8, La/qgd;->g:Ljava/lang/Object;

    .line 2467
    .line 2468
    invoke-virtual {v8}, La/qgd;->i()La/h55;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v6

    .line 2472
    invoke-interface {v2, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2473
    .line 2474
    .line 2475
    goto :goto_37

    .line 2476
    :cond_64
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 2477
    .line 2478
    .line 2479
    return-object v16

    .line 2480
    :cond_65
    invoke-static {v11}, La/hny;->u(Ljava/lang/String;)V

    .line 2481
    .line 2482
    .line 2483
    return-object v16

    .line 2484
    :cond_66
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2485
    .line 2486
    .line 2487
    move-result-object v0

    .line 2488
    :cond_67
    :goto_38
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2489
    .line 2490
    .line 2491
    move-result v1

    .line 2492
    if-eqz v1, :cond_6f

    .line 2493
    .line 2494
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2495
    .line 2496
    .line 2497
    move-result-object v1

    .line 2498
    check-cast v1, La/fpt0;

    .line 2499
    .line 2500
    invoke-virtual {v7, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2501
    .line 2502
    .line 2503
    move-result-object v4

    .line 2504
    check-cast v4, La/h55;

    .line 2505
    .line 2506
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2507
    .line 2508
    .line 2509
    iget-object v5, v4, La/h55;->f:La/drd;

    .line 2510
    .line 2511
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2512
    .line 2513
    .line 2514
    sget-object v6, La/hx9;->h:La/u15;

    .line 2515
    .line 2516
    invoke-interface {v5, v6}, La/drd;->d(La/u15;)Ljava/lang/Object;

    .line 2517
    .line 2518
    .line 2519
    move-result-object v6

    .line 2520
    check-cast v6, Ljava/lang/Long;

    .line 2521
    .line 2522
    invoke-static {v5, v6}, La/vrm0;->a(La/drd;Ljava/lang/Long;)La/hx9;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v5

    .line 2526
    if-eqz v5, :cond_67

    .line 2527
    .line 2528
    invoke-virtual {v4}, La/h55;->b()La/qgd;

    .line 2529
    .line 2530
    .line 2531
    move-result-object v4

    .line 2532
    iput-object v5, v4, La/qgd;->g:Ljava/lang/Object;

    .line 2533
    .line 2534
    invoke-virtual {v4}, La/qgd;->i()La/h55;

    .line 2535
    .line 2536
    .line 2537
    move-result-object v4

    .line 2538
    invoke-interface {v7, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2539
    .line 2540
    .line 2541
    goto :goto_38

    .line 2542
    :cond_68
    :goto_39
    sget-object v0, La/vrm0;->a:La/u15;

    .line 2543
    .line 2544
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 2545
    .line 2546
    .line 2547
    move-result v0

    .line 2548
    move/from16 v4, v18

    .line 2549
    .line 2550
    :goto_3a
    if-ge v4, v0, :cond_6f

    .line 2551
    .line 2552
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2553
    .line 2554
    .line 2555
    move-result-object v6

    .line 2556
    check-cast v6, La/wln0;

    .line 2557
    .line 2558
    iget-object v6, v6, La/wln0;->c:La/urm0;

    .line 2559
    .line 2560
    iget-wide v8, v6, La/urm0;->a:J

    .line 2561
    .line 2562
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2563
    .line 2564
    .line 2565
    move-result-object v6

    .line 2566
    move-object/from16 v10, v34

    .line 2567
    .line 2568
    invoke-interface {v10, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2569
    .line 2570
    .line 2571
    move-result v6

    .line 2572
    if-eqz v6, :cond_6c

    .line 2573
    .line 2574
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2575
    .line 2576
    .line 2577
    move-result-object v6

    .line 2578
    invoke-virtual {v10, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2579
    .line 2580
    .line 2581
    move-result-object v6

    .line 2582
    check-cast v6, La/l15;

    .line 2583
    .line 2584
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2585
    .line 2586
    .line 2587
    iget-object v12, v6, La/l15;->f:La/drd;

    .line 2588
    .line 2589
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2590
    .line 2591
    .line 2592
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2593
    .line 2594
    .line 2595
    move-result-object v8

    .line 2596
    invoke-static {v12, v8}, La/vrm0;->a(La/drd;Ljava/lang/Long;)La/hx9;

    .line 2597
    .line 2598
    .line 2599
    move-result-object v8

    .line 2600
    if-eqz v8, :cond_69

    .line 2601
    .line 2602
    iget-object v9, v6, La/l15;->c:Landroid/util/Size;

    .line 2603
    .line 2604
    invoke-static {v9}, La/h55;->a(Landroid/util/Size;)La/qgd;

    .line 2605
    .line 2606
    .line 2607
    move-result-object v9

    .line 2608
    iget v12, v6, La/l15;->g:I

    .line 2609
    .line 2610
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2611
    .line 2612
    .line 2613
    move-result-object v12

    .line 2614
    iput-object v12, v9, La/qgd;->e:Ljava/lang/Object;

    .line 2615
    .line 2616
    iget-object v12, v6, La/l15;->h:Landroid/util/Range;

    .line 2617
    .line 2618
    if-eqz v12, :cond_6b

    .line 2619
    .line 2620
    iput-object v12, v9, La/qgd;->f:Ljava/lang/Object;

    .line 2621
    .line 2622
    iget-object v12, v6, La/l15;->d:La/agn;

    .line 2623
    .line 2624
    if-eqz v12, :cond_6a

    .line 2625
    .line 2626
    iput-object v12, v9, La/qgd;->d:Ljava/lang/Object;

    .line 2627
    .line 2628
    iput-object v8, v9, La/qgd;->g:Ljava/lang/Object;

    .line 2629
    .line 2630
    invoke-virtual {v9}, La/qgd;->i()La/h55;

    .line 2631
    .line 2632
    .line 2633
    move-result-object v8

    .line 2634
    invoke-interface {v2, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2635
    .line 2636
    .line 2637
    :cond_69
    move-object/from16 v12, v35

    .line 2638
    .line 2639
    goto :goto_3b

    .line 2640
    :cond_6a
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 2641
    .line 2642
    .line 2643
    return-object v16

    .line 2644
    :cond_6b
    invoke-static {v11}, La/hny;->u(Ljava/lang/String;)V

    .line 2645
    .line 2646
    .line 2647
    return-object v16

    .line 2648
    :cond_6c
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2649
    .line 2650
    .line 2651
    move-result-object v6

    .line 2652
    move-object/from16 v12, v35

    .line 2653
    .line 2654
    invoke-interface {v12, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2655
    .line 2656
    .line 2657
    move-result v6

    .line 2658
    if-eqz v6, :cond_6e

    .line 2659
    .line 2660
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2661
    .line 2662
    .line 2663
    move-result-object v6

    .line 2664
    invoke-virtual {v12, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2665
    .line 2666
    .line 2667
    move-result-object v6

    .line 2668
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2669
    .line 2670
    .line 2671
    check-cast v6, La/fpt0;

    .line 2672
    .line 2673
    invoke-virtual {v7, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v13

    .line 2677
    check-cast v13, La/h55;

    .line 2678
    .line 2679
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2680
    .line 2681
    .line 2682
    iget-object v14, v13, La/h55;->f:La/drd;

    .line 2683
    .line 2684
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2685
    .line 2686
    .line 2687
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2688
    .line 2689
    .line 2690
    move-result-object v8

    .line 2691
    invoke-static {v14, v8}, La/vrm0;->a(La/drd;Ljava/lang/Long;)La/hx9;

    .line 2692
    .line 2693
    .line 2694
    move-result-object v8

    .line 2695
    if-eqz v8, :cond_6d

    .line 2696
    .line 2697
    invoke-virtual {v13}, La/h55;->b()La/qgd;

    .line 2698
    .line 2699
    .line 2700
    move-result-object v9

    .line 2701
    iput-object v8, v9, La/qgd;->g:Ljava/lang/Object;

    .line 2702
    .line 2703
    invoke-virtual {v9}, La/qgd;->i()La/h55;

    .line 2704
    .line 2705
    .line 2706
    move-result-object v8

    .line 2707
    invoke-interface {v7, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2708
    .line 2709
    .line 2710
    :cond_6d
    :goto_3b
    add-int/lit8 v4, v4, 0x1

    .line 2711
    .line 2712
    move-object/from16 v34, v10

    .line 2713
    .line 2714
    move-object/from16 v35, v12

    .line 2715
    .line 2716
    goto/16 :goto_3a

    .line 2717
    .line 2718
    :cond_6e
    const-string v0, "SurfaceConfig does not map to any use case"

    .line 2719
    .line 2720
    invoke-static {v0}, La/c99;->l(Ljava/lang/Object;)V

    .line 2721
    .line 2722
    .line 2723
    return-object v16

    .line 2724
    :cond_6f
    :goto_3c
    new-instance v0, La/tmn0;

    .line 2725
    .line 2726
    iget v1, v3, La/eln0;->e:I

    .line 2727
    .line 2728
    invoke-direct {v0, v7, v2, v1}, La/tmn0;-><init>(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;I)V

    .line 2729
    .line 2730
    .line 2731
    return-object v0

    .line 2732
    :cond_70
    const/16 v6, 0x2e

    .line 2733
    .line 2734
    const-string v1, " and Hardware level: "

    .line 2735
    .line 2736
    move-object/from16 v2, v30

    .line 2737
    .line 2738
    move-object/from16 v3, v31

    .line 2739
    .line 2740
    invoke-static {v3, v2, v1}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2741
    .line 2742
    .line 2743
    move-result-object v1

    .line 2744
    iget v0, v0, La/hln0;->e:I

    .line 2745
    .line 2746
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2747
    .line 2748
    .line 2749
    const-string v0, ". May be the specified resolution is too large and not supported. Existing surfaces: "

    .line 2750
    .line 2751
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2752
    .line 2753
    .line 2754
    move-object/from16 v2, p2

    .line 2755
    .line 2756
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2757
    .line 2758
    .line 2759
    move-object/from16 v0, v25

    .line 2760
    .line 2761
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2762
    .line 2763
    .line 2764
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2765
    .line 2766
    .line 2767
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2768
    .line 2769
    .line 2770
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2771
    .line 2772
    .line 2773
    move-result-object v0

    .line 2774
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 2775
    .line 2776
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2777
    .line 2778
    .line 2779
    move-result-object v0

    .line 2780
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2781
    .line 2782
    .line 2783
    throw v1

    .line 2784
    :cond_71
    const-string v0, "Failed to find supported resolutions."

    .line 2785
    .line 2786
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 2787
    .line 2788
    .line 2789
    return-object v16
.end method

.method public final q(IILandroid/util/Size;La/urm0;)La/wln0;
    .locals 7

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/wln0;->e:La/urm0;

    .line 5
    .line 6
    invoke-virtual {p0, p2}, La/hln0;->n(I)La/m55;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    sget-object v5, La/uln0;->b:La/uln0;

    .line 11
    .line 12
    move v4, p1

    .line 13
    move v1, p2

    .line 14
    move-object v2, p3

    .line 15
    move-object v6, p4

    .line 16
    invoke-static/range {v1 .. v6}, La/y2m0;->d(ILandroid/util/Size;La/m55;ILa/uln0;La/urm0;)La/wln0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final r(Ljava/util/LinkedHashMap;ILandroid/util/Rational;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/hln0;->x:La/erm0;

    .line 2
    .line 3
    iget-object p0, p0, La/erm0;->d:La/roi0;

    .line 4
    .line 5
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p0, p2, v0, p3}, La/hln0;->f(Landroid/hardware/camera2/params/StreamConfigurationMap;IZLandroid/util/Rational;)Landroid/util/Size;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p1, p2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final s(Ljava/util/LinkedHashMap;Landroid/util/Size;I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/hln0;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, La/hln0;->x:La/erm0;

    .line 7
    .line 8
    iget-object p0, p0, La/erm0;->d:La/roi0;

    .line 9
    .line 10
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p0, p3, v1, v0}, La/hln0;->f(Landroid/hardware/camera2/params/StreamConfigurationMap;IZLandroid/util/Rational;)Landroid/util/Size;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    filled-new-array {p2, p0}, [Landroid/util/Size;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    new-instance p2, La/ycd;

    .line 36
    .line 37
    invoke-direct {p2, v1}, La/ycd;-><init>(Z)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, p2}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    move-object p2, p0

    .line 45
    check-cast p2, Landroid/util/Size;

    .line 46
    .line 47
    :goto_0
    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final t(La/gln0;)V
    .locals 12

    .line 1
    iget v0, p1, La/gln0;->a:I

    .line 2
    .line 3
    iget-boolean v1, p1, La/gln0;->g:Z

    .line 4
    .line 5
    const-string v2, "CONCURRENT_CAMERA"

    .line 6
    .line 7
    const-string v3, "ULTRA_HIGH_RESOLUTION_CAMERA"

    .line 8
    .line 9
    const-string v4, "DEFAULT"

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const-string v7, " camera mode."

    .line 14
    .line 15
    iget-object v8, p0, La/hln0;->d:Ljava/lang/String;

    .line 16
    .line 17
    const-string v9, "Camera device Id is "

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    iget-boolean v10, p1, La/gln0;->e:Z

    .line 22
    .line 23
    if-nez v10, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const-string p0, ". Ultra HDR is not currently supported in "

    .line 27
    .line 28
    invoke-static {v9, v8, p0}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eq v0, v6, :cond_2

    .line 33
    .line 34
    if-eq v0, v5, :cond_1

    .line 35
    .line 36
    move-object v2, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v2, v3

    .line 39
    :cond_2
    :goto_0
    invoke-static {p0, v2, v7}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    :goto_1
    if-eqz v0, :cond_7

    .line 48
    .line 49
    iget v10, p1, La/gln0;->b:I

    .line 50
    .line 51
    const/16 v11, 0xa

    .line 52
    .line 53
    if-eq v10, v11, :cond_4

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_4
    const-string p0, ". 10 bit dynamic range is not currently supported in "

    .line 57
    .line 58
    invoke-static {v9, v8, p0}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eq v0, v6, :cond_6

    .line 63
    .line 64
    if-eq v0, v5, :cond_5

    .line 65
    .line 66
    move-object v2, v4

    .line 67
    goto :goto_2

    .line 68
    :cond_5
    move-object v2, v3

    .line 69
    :cond_6
    :goto_2
    invoke-static {p0, v2, v7}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_7
    :goto_3
    if-eqz v0, :cond_b

    .line 78
    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_8
    const-string p0, ". feature combination is not currently supported in "

    .line 83
    .line 84
    invoke-static {v9, v8, p0}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-eq v0, v6, :cond_a

    .line 89
    .line 90
    if-eq v0, v5, :cond_9

    .line 91
    .line 92
    move-object v2, v4

    .line 93
    goto :goto_4

    .line 94
    :cond_9
    move-object v2, v3

    .line 95
    :cond_a
    :goto_4
    invoke-static {p0, v2, v7}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_b
    :goto_5
    iget-boolean p1, p1, La/gln0;->f:Z

    .line 104
    .line 105
    if-eqz p1, :cond_d

    .line 106
    .line 107
    if-nez v1, :cond_c

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_c
    const-string p0, "High-speed session is not supported with feature combination"

    .line 111
    .line 112
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_d
    :goto_6
    if-eqz p1, :cond_f

    .line 117
    .line 118
    iget-object p0, p0, La/hln0;->C:La/pxv;

    .line 119
    .line 120
    iget-object p0, p0, La/pxv;->b:La/n0o0;

    .line 121
    .line 122
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-eqz p0, :cond_e

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_e
    const-string p0, "High-speed session is not supported on this device."

    .line 136
    .line 137
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_f
    :goto_7
    return-void
.end method
