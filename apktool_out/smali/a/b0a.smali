.class public final La/b0a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;
.implements La/vy9;


# instance fields
.field public final a:La/iev;

.field public final b:La/iev;

.field public final c:La/lrm0;

.field public final d:La/dmn0;

.field public final e:La/iw9;

.field public final f:La/z6r;

.field public final g:La/y6r;

.field public final h:La/x34;

.field public final i:La/zz9;

.field public final j:La/c0a;

.field public final k:La/d0a;

.field public final l:La/lev;

.field public final m:La/vne;

.field public final n:La/hke;

.field public final o:La/x04;


# direct methods
.method public constructor <init>(La/tz9;La/c1a;La/iev;La/iev;La/lrm0;La/dmn0;La/iw9;La/z6r;La/y6r;La/x34;La/zz9;La/c0a;La/d0a;La/lev;La/vne;La/hke;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p5

    iget v3, v1, La/tz9;->h:I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v2, La/lrm0;->f:Ljava/util/List;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p13 .. p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p14 .. p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v5, p3

    .line 2
    iput-object v5, v0, La/b0a;->a:La/iev;

    move-object/from16 v5, p4

    .line 3
    iput-object v5, v0, La/b0a;->b:La/iev;

    .line 4
    iput-object v2, v0, La/b0a;->c:La/lrm0;

    move-object/from16 v5, p6

    .line 5
    iput-object v5, v0, La/b0a;->d:La/dmn0;

    move-object/from16 v5, p7

    .line 6
    iput-object v5, v0, La/b0a;->e:La/iw9;

    move-object/from16 v5, p8

    .line 7
    iput-object v5, v0, La/b0a;->f:La/z6r;

    move-object/from16 v5, p9

    .line 8
    iput-object v5, v0, La/b0a;->g:La/y6r;

    move-object/from16 v5, p10

    .line 9
    iput-object v5, v0, La/b0a;->h:La/x34;

    move-object/from16 v5, p11

    .line 10
    iput-object v5, v0, La/b0a;->i:La/zz9;

    move-object/from16 v5, p12

    .line 11
    iput-object v5, v0, La/b0a;->j:La/c0a;

    move-object/from16 v5, p13

    .line 12
    iput-object v5, v0, La/b0a;->k:La/d0a;

    move-object/from16 v5, p14

    .line 13
    iput-object v5, v0, La/b0a;->l:La/lev;

    move-object/from16 v5, p15

    .line 14
    iput-object v5, v0, La/b0a;->m:La/vne;

    move-object/from16 v5, p16

    .line 15
    iput-object v5, v0, La/b0a;->n:La/hke;

    const/4 v5, 0x0

    .line 16
    invoke-static {v5}, La/o2e;->X(Z)La/x04;

    move-result-object v6

    iput-object v6, v0, La/b0a;->o:La/x04;

    .line 17
    iget-object v6, v1, La/tz9;->a:Ljava/lang/String;

    .line 18
    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v8, p2

    check-cast v8, La/ow9;

    invoke-virtual {v8, v7}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    .line 19
    const-string v9, "External"

    const-string v10, "Unknown"

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-nez v13, :cond_1

    const-string v7, "Front"

    goto :goto_3

    :cond_1
    :goto_0
    if-nez v7, :cond_2

    goto :goto_1

    .line 20
    :cond_2
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-ne v13, v12, :cond_3

    const-string v7, "Back"

    goto :goto_3

    :cond_3
    :goto_1
    if-nez v7, :cond_4

    goto :goto_2

    .line 21
    :cond_4
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v11, :cond_5

    move-object v7, v9

    goto :goto_3

    :cond_5
    :goto_2
    move-object v7, v10

    .line 22
    :goto_3
    sget-object v13, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8, v13}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    if-nez v13, :cond_6

    goto :goto_4

    .line 23
    :cond_6
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-nez v14, :cond_7

    const-string v9, "Limited"

    goto :goto_9

    :cond_7
    :goto_4
    if-nez v13, :cond_8

    goto :goto_5

    .line 24
    :cond_8
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-ne v14, v12, :cond_9

    const-string v9, "Full"

    goto :goto_9

    :cond_9
    :goto_5
    if-nez v13, :cond_a

    goto :goto_6

    .line 25
    :cond_a
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-ne v14, v11, :cond_b

    const-string v9, "Legacy"

    goto :goto_9

    :cond_b
    :goto_6
    if-nez v13, :cond_c

    goto :goto_7

    .line 26
    :cond_c
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v14

    const/4 v15, 0x3

    if-ne v14, v15, :cond_d

    const-string v9, "Level 3"

    goto :goto_9

    :cond_d
    :goto_7
    if-nez v13, :cond_e

    goto :goto_8

    .line 27
    :cond_e
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    const/4 v14, 0x4

    if-ne v13, v14, :cond_f

    goto :goto_9

    :cond_f
    :goto_8
    move-object v9, v10

    :goto_9
    if-ne v3, v12, :cond_10

    .line 28
    const-string v10, "High Speed"

    goto :goto_a

    :cond_10
    if-nez v3, :cond_11

    .line 29
    const-string v10, "Normal"

    goto :goto_a

    :cond_11
    if-ne v3, v11, :cond_12

    .line 30
    const-string v10, "Extension"

    .line 31
    :cond_12
    :goto_a
    sget-object v13, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8, v13}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [I

    if-eqz v8, :cond_13

    const/16 v13, 0xb

    .line 32
    invoke-static {v8, v13}, La/tx3;->w([II)Z

    move-result v8

    if-eqz v8, :cond_13

    .line 33
    const-string v8, "Logical"

    goto :goto_b

    .line 34
    :cond_13
    const-string v8, "Physical"

    .line 35
    :goto_b
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v15, " (Camera "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, ")\n"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    const-string v14, " ("

    const-string v5, ", "

    .line 38
    const-string v11, "  Facing:    "

    invoke-static {v11, v7, v14, v8, v5}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 39
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "  Mode:      "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0xa

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    const-string v5, "Outputs:\n"

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    iget-object v2, v2, La/lrm0;->g:Ljava/util/ArrayList;

    .line 43
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v9, "\n"

    const/16 v10, 0xc

    if-eqz v5, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/f3a;

    .line 44
    iget-object v5, v5, La/f3a;->b:Ljava/util/ArrayList;

    .line 45
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v11, 0x0

    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_14

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v15, v11, 0x1

    if-ltz v11, :cond_1c

    check-cast v14, La/krm0;

    const/16 p4, 0x0

    .line 46
    const-string v8, "  "

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v11, :cond_16

    .line 47
    iget-object v8, v14, La/krm0;->j:La/f3a;

    if-eqz v8, :cond_15

    .line 48
    iget v8, v8, La/f3a;->a:I

    .line 49
    invoke-static {v8}, La/mrm0;->a(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_d

    .line 50
    :cond_15
    const-string v0, "stream"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    throw p4

    .line 51
    :cond_16
    const-string v8, ""

    .line 52
    :goto_d
    invoke-static {v10, v8}, Lkotlin/text/StringsKt;->a0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    iget v8, v14, La/krm0;->a:I

    iget-object v11, v14, La/krm0;->d:Ljava/lang/String;

    move/from16 p6, v12

    .line 54
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v7, "Output-"

    invoke-direct {v12, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 55
    invoke-static {v10, v7}, Lkotlin/text/StringsKt;->a0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    iget-object v7, v14, La/krm0;->b:Landroid/util/Size;

    .line 57
    invoke-virtual {v7}, Landroid/util/Size;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v7}, Lkotlin/text/StringsKt;->a0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    iget v7, v14, La/krm0;->c:I

    .line 59
    invoke-static {v7}, La/grm0;->a(I)Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x10

    invoke-static {v8, v7}, Lkotlin/text/StringsKt;->a0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    iget-object v7, v14, La/krm0;->e:La/if80;

    const/16 v8, 0x5d

    .line 61
    const-string v12, " ["

    if-eqz v7, :cond_17

    .line 62
    iget-byte v7, v7, La/if80;->a:B

    .line 63
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, La/if80;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    :cond_17
    iget-object v7, v14, La/krm0;->f:La/hf80;

    move-object/from16 p8, v9

    if-eqz v7, :cond_18

    .line 65
    iget-wide v8, v7, La/hf80;->a:J

    .line 66
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v8, v9}, La/hf80;->a(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v8, 0x5d

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    :cond_18
    iget-object v7, v14, La/krm0;->g:La/jf80;

    if-eqz v7, :cond_19

    .line 68
    iget-wide v9, v7, La/jf80;->a:J

    .line 69
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    new-instance v8, Ljava/lang/StringBuilder;

    move-object/from16 p11, v2

    const-string v2, "StreamUseCase(value="

    invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 71
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v8, 0x5d

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_e

    :cond_19
    move-object/from16 p11, v2

    .line 72
    :goto_e
    iget-object v2, v14, La/krm0;->i:La/kf80;

    if-eqz v2, :cond_1a

    .line 73
    iget-wide v7, v2, La/kf80;->a:J

    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "StreamUseHint(value="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v7, 0x29

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 76
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v8, 0x5d

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    :cond_1a
    invoke-static {v11, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    .line 78
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    new-instance v2, La/g0a;

    invoke-direct {v2, v11}, La/g0a;-><init>(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    const-string v2, "]"

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1b
    move-object/from16 v2, p8

    .line 82
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v12, p6

    move-object v9, v2

    move v11, v15

    const/16 v7, 0xa

    const/16 v10, 0xc

    move-object/from16 v2, p11

    goto/16 :goto_c

    :cond_1c
    const/16 p4, 0x0

    .line 83
    invoke-static {}, La/q3d;->p()V

    throw p4

    :cond_1d
    move-object v2, v9

    move/from16 p6, v12

    const/16 p4, 0x0

    .line 84
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1e

    .line 85
    const-string v5, "Inputs:\n"

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/irm0;

    .line 87
    const-string v6, " "

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    iget v6, v5, La/irm0;->a:I

    .line 89
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Input-"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xc

    .line 90
    invoke-static {v7, v6}, Lkotlin/text/StringsKt;->a0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    iget v5, v5, La/irm0;->b:I

    .line 92
    invoke-static {v5}, La/grm0;->b(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lkotlin/text/StringsKt;->a0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-static/range {p6 .. p6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lkotlin/text/StringsKt;->a0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    .line 95
    :cond_1e
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Session Template: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    iget v4, v1, La/tz9;->f:I

    .line 97
    invoke-static {v4}, La/onf0;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0xa

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    const-string v2, "Session Parameters"

    .line 99
    iget-object v5, v1, La/tz9;->g:Ljava/util/Map;

    .line 100
    invoke-static {v13, v2, v5}, La/pzb;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/Map;)V

    .line 101
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "Default Template: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {p6 .. p6}, La/onf0;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    const-string v2, "Default Parameters"

    .line 103
    iget-object v4, v1, La/tz9;->i:Ljava/util/Map;

    .line 104
    invoke-static {v13, v2, v4}, La/pzb;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/Map;)V

    .line 105
    const-string v2, "Required Parameters"

    .line 106
    iget-object v4, v1, La/tz9;->l:Ljava/util/Map;

    .line 107
    invoke-static {v13, v2, v4}, La/pzb;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/Map;)V

    .line 108
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 109
    const-string v4, "CXCP"

    invoke-static {v4, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    iget-object v1, v1, La/tz9;->d:Ljava/util/ArrayList;

    move/from16 v2, p6

    if-ne v3, v2, :cond_23

    .line 111
    iget-object v2, v0, La/b0a;->c:La/lrm0;

    .line 112
    iget-object v2, v2, La/lrm0;->h:Ljava/util/ArrayList;

    .line 113
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_22

    .line 114
    iget-object v2, v0, La/b0a;->c:La/lrm0;

    .line 115
    iget-object v2, v2, La/lrm0;->h:Ljava/util/ArrayList;

    .line 116
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 117
    iget-object v3, v0, La/b0a;->c:La/lrm0;

    const/4 v4, 0x2

    if-gt v2, v4, :cond_21

    .line 118
    iget-object v2, v3, La/lrm0;->h:Ljava/util/ArrayList;

    if-eqz v2, :cond_1f

    .line 119
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1f

    goto :goto_11

    .line 120
    :cond_1f
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_23

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/krm0;

    .line 121
    invoke-virtual {v3}, La/krm0;->a()Z

    move-result v3

    if-eqz v3, :cond_20

    goto :goto_10

    .line 122
    :cond_20
    iget-object v0, v0, La/b0a;->c:La/lrm0;

    .line 123
    iget-object v0, v0, La/lrm0;->h:Ljava/util/ArrayList;

    .line 124
    const-string v1, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are "

    invoke-static {v0, v1}, La/hny;->v(Ljava/lang/Object;Ljava/lang/String;)V

    throw p4

    .line 125
    :cond_21
    const-string v0, "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are "

    .line 126
    iget-object v1, v3, La/lrm0;->h:Ljava/util/ArrayList;

    .line 127
    invoke-static {v1, v0}, La/hny;->v(Ljava/lang/Object;Ljava/lang/String;)V

    throw p4

    .line 128
    :cond_22
    const-string v0, "Cannot create a HIGH_SPEED CameraGraph without outputs."

    .line 129
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    throw p4

    :cond_23
    :goto_11
    if-eqz v1, :cond_26

    .line 130
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_25

    .line 131
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-ge v2, v3, :cond_26

    .line 132
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_24

    goto :goto_12

    .line 133
    :cond_24
    const-string v0, "Multi resolution reprocessing not supported under Android S"

    .line 134
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    throw p4

    .line 135
    :cond_25
    const-string v0, "At least one InputConfiguration is required for reprocessing"

    .line 136
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    throw p4

    .line 137
    :cond_26
    :goto_12
    iget-object v1, v0, La/b0a;->c:La/lrm0;

    .line 138
    iget-object v1, v1, La/lrm0;->e:La/jo20;

    .line 139
    invoke-virtual {v1}, La/jo20;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_27

    .line 140
    iget-object v0, v0, La/b0a;->d:La/dmn0;

    invoke-virtual {v0}, La/dmn0;->a()V

    :cond_27
    return-void
.end method


# virtual methods
.method public final c(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/a0a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/a0a;

    .line 7
    .line 8
    iget v1, v0, La/a0a;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/a0a;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/a0a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/a0a;-><init>(La/b0a;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/a0a;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/a0a;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/a0a;->k:I

    .line 51
    .line 52
    iget-object p1, p0, La/b0a;->l:La/lev;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, La/lev;->a(La/zje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    move-object v1, p1

    .line 62
    check-cast v1, La/m050;

    .line 63
    .line 64
    new-instance v0, La/e0a;

    .line 65
    .line 66
    iget-object v5, p0, La/b0a;->j:La/c0a;

    .line 67
    .line 68
    iget-object v6, p0, La/b0a;->k:La/d0a;

    .line 69
    .line 70
    iget-object v2, p0, La/b0a;->a:La/iev;

    .line 71
    .line 72
    iget-object v3, p0, La/b0a;->n:La/hke;

    .line 73
    .line 74
    iget-object v4, p0, La/b0a;->g:La/y6r;

    .line 75
    .line 76
    invoke-direct/range {v0 .. v6}, La/e0a;-><init>(La/m050;La/iev;La/hke;La/y6r;La/c0a;La/d0a;)V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method

.method public final close()V
    .locals 8

    .line 1
    iget-object v0, p0, La/b0a;->o:La/x04;

    .line 2
    .line 3
    invoke-virtual {v0}, La/x04;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_8

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "#close"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "CXCP"

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "Closing "

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/b0a;->a:La/iev;

    .line 49
    .line 50
    iget-object v0, v0, La/iev;->c:La/bev;

    .line 51
    .line 52
    invoke-virtual {v0}, La/bev;->close()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, La/b0a;->e:La/iw9;

    .line 56
    .line 57
    const-string v1, "Quirk: Closing "

    .line 58
    .line 59
    const-string v2, "Closed "

    .line 60
    .line 61
    iget-object v3, v0, La/iw9;->q:Ljava/lang/Object;

    .line 62
    .line 63
    monitor-enter v3

    .line 64
    :try_start_0
    invoke-virtual {v0}, La/iw9;->c()Z

    .line 65
    .line 66
    .line 67
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    const/4 v5, 0x0

    .line 69
    if-eqz v4, :cond_1

    .line 70
    .line 71
    :cond_0
    :goto_0
    monitor-exit v3

    .line 72
    goto/16 :goto_2

    .line 73
    .line 74
    :cond_1
    :try_start_1
    sget-object v4, La/ty9;->l0:La/ty9;

    .line 75
    .line 76
    iput-object v4, v0, La/iw9;->s:La/cy2;

    .line 77
    .line 78
    const-string v4, "CXCP"

    .line 79
    .line 80
    new-instance v6, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    iget-object v2, v0, La/iw9;->y:La/jnu0;

    .line 96
    .line 97
    iget-object v4, v0, La/iw9;->z:La/r9a;

    .line 98
    .line 99
    iput-object v5, v0, La/iw9;->y:La/jnu0;

    .line 100
    .line 101
    iput-object v5, v0, La/iw9;->z:La/r9a;

    .line 102
    .line 103
    iget-object v6, v0, La/iw9;->w:La/c4m0;

    .line 104
    .line 105
    if-eqz v6, :cond_2

    .line 106
    .line 107
    invoke-virtual {v6, v5}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :catchall_0
    move-exception p0

    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_2
    :goto_1
    iget-object v6, v0, La/iw9;->B:La/c4m0;

    .line 115
    .line 116
    if-eqz v6, :cond_3

    .line 117
    .line 118
    invoke-virtual {v6, v5}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    iput-object v5, v0, La/iw9;->B:La/c4m0;

    .line 122
    .line 123
    iget-object v6, v0, La/iw9;->C:La/c4m0;

    .line 124
    .line 125
    if-eqz v6, :cond_4

    .line 126
    .line 127
    invoke-virtual {v6, v5}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    iput-object v5, v0, La/iw9;->C:La/c4m0;

    .line 131
    .line 132
    iget-object v6, v0, La/iw9;->D:La/c4m0;

    .line 133
    .line 134
    if-eqz v6, :cond_5

    .line 135
    .line 136
    invoke-virtual {v6, v5}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    iput-object v5, v0, La/iw9;->D:La/c4m0;

    .line 140
    .line 141
    iget-object v6, v0, La/iw9;->g:La/qw9;

    .line 142
    .line 143
    invoke-static {v6}, La/dw9;->y(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v4, v2}, La/iw9;->b(La/r9a;La/jnu0;)V

    .line 147
    .line 148
    .line 149
    iget-object v2, v0, La/iw9;->d:La/tz9;

    .line 150
    .line 151
    iget-object v4, v2, La/tz9;->n:La/vz9;

    .line 152
    .line 153
    iget-boolean v4, v4, La/vz9;->e:Z

    .line 154
    .line 155
    if-nez v4, :cond_6

    .line 156
    .line 157
    iget-object v4, v0, La/iw9;->l:La/jx9;

    .line 158
    .line 159
    iget-object v2, v2, La/tz9;->a:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v4, v2}, La/jx9;->a(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_0

    .line 166
    .line 167
    :cond_6
    const-string v2, "CXCP"

    .line 168
    .line 169
    new-instance v4, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-object v1, v0, La/iw9;->d:La/tz9;

    .line 175
    .line 176
    iget-object v1, v1, La/tz9;->a:Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {v1}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v1, " during "

    .line 186
    .line 187
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v1, "#close"

    .line 194
    .line 195
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    iget-object v1, v0, La/iw9;->j:La/k7d0;

    .line 206
    .line 207
    iget-object v0, v0, La/iw9;->d:La/tz9;

    .line 208
    .line 209
    iget-object v0, v0, La/tz9;->a:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v1, v0}, La/k7d0;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 212
    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :goto_2
    iget-object v0, p0, La/b0a;->f:La/z6r;

    .line 217
    .line 218
    invoke-virtual {v0}, La/z6r;->close()V

    .line 219
    .line 220
    .line 221
    iget-object v0, p0, La/b0a;->g:La/y6r;

    .line 222
    .line 223
    invoke-virtual {v0}, La/y6r;->close()V

    .line 224
    .line 225
    .line 226
    iget-object v0, p0, La/b0a;->d:La/dmn0;

    .line 227
    .line 228
    invoke-virtual {v0}, La/dmn0;->close()V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, La/b0a;->c:La/lrm0;

    .line 232
    .line 233
    invoke-virtual {v0}, La/lrm0;->close()V

    .line 234
    .line 235
    .line 236
    iget-object v0, p0, La/b0a;->h:La/x34;

    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    iget-object v1, v0, La/x34;->c:Ljava/lang/Object;

    .line 242
    .line 243
    monitor-enter v1

    .line 244
    :try_start_2
    invoke-virtual {v0}, La/x34;->a()La/y34;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    iget-object v3, v0, La/x34;->d:Ljava/util/LinkedHashMap;

    .line 249
    .line 250
    invoke-interface {v3, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, La/x34;->a()La/y34;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    if-eqz v3, :cond_7

    .line 258
    .line 259
    invoke-virtual {v3, v2}, La/y34;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-nez v2, :cond_7

    .line 264
    .line 265
    iget-object v2, v0, La/x34;->b:La/vqc;

    .line 266
    .line 267
    iget-object v4, v0, La/x34;->a:La/sje;

    .line 268
    .line 269
    new-instance v6, La/cm3;

    .line 270
    .line 271
    const/4 v7, 0x6

    .line 272
    invoke-direct {v6, v0, v3, v5, v7}, La/cm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    sget-object v0, La/yne;->d:La/yne;

    .line 282
    .line 283
    new-instance v3, La/o3s;

    .line 284
    .line 285
    const/16 v7, 0x15

    .line 286
    .line 287
    invoke-direct {v3, v2, v6, v5, v7}, La/o3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 288
    .line 289
    .line 290
    const/4 v2, 0x1

    .line 291
    invoke-static {v4, v5, v0, v3, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 292
    .line 293
    .line 294
    :cond_7
    monitor-exit v1

    .line 295
    iget-object p0, p0, La/b0a;->m:La/vne;

    .line 296
    .line 297
    invoke-static {p0, v5}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 298
    .line 299
    .line 300
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :catchall_1
    move-exception p0

    .line 305
    monitor-exit v1

    .line 306
    throw p0

    .line 307
    :goto_3
    monitor-exit v3

    .line 308
    throw p0

    .line 309
    :cond_8
    return-void
.end method

.method public final d(ILandroid/view/Surface;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, La/mrm0;->a(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "#setSurface"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/view/Surface;->isValid()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const-string v0, "CXCP"

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, "#setSurface: "

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v2, " is invalid"

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object p0, p0, La/b0a;->d:La/dmn0;

    .line 64
    .line 65
    const-string v0, "Surface ("

    .line 66
    .line 67
    const-string v1, "Removed surface for "

    .line 68
    .line 69
    const-string v2, "Configured "

    .line 70
    .line 71
    const-string v3, "Refusing to configure "

    .line 72
    .line 73
    iget-object v4, p0, La/dmn0;->d:Ljava/util/Map;

    .line 74
    .line 75
    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    new-instance v5, La/mrm0;

    .line 80
    .line 81
    invoke-direct {v5, p1}, La/mrm0;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-nez v4, :cond_10

    .line 89
    .line 90
    iget-object v4, p0, La/dmn0;->e:Ljava/lang/Object;

    .line 91
    .line 92
    monitor-enter v4

    .line 93
    :try_start_0
    iget-boolean v5, p0, La/dmn0;->i:Z

    .line 94
    .line 95
    if-eqz v5, :cond_2

    .line 96
    .line 97
    if-eqz p2, :cond_1

    .line 98
    .line 99
    const-string p0, "CXCP"

    .line 100
    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p1}, La/mrm0;->a(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string p1, " with "

    .line 114
    .line 115
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p1, " after close!"

    .line 122
    .line 123
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :catchall_0
    move-exception p0

    .line 135
    goto/16 :goto_5

    .line 136
    .line 137
    :cond_1
    :goto_0
    monitor-exit v4

    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :cond_2
    :try_start_1
    const-string v3, "CXCP"

    .line 141
    .line 142
    if-eqz p2, :cond_3

    .line 143
    .line 144
    new-instance v1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {p1}, La/mrm0;->a(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v2, " with "

    .line 157
    .line 158
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    goto :goto_1

    .line 169
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, La/mrm0;->a(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    :goto_1
    invoke-static {v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    .line 187
    .line 188
    iget-object v1, p0, La/dmn0;->f:Ljava/util/LinkedHashMap;

    .line 189
    .line 190
    if-nez p2, :cond_4

    .line 191
    .line 192
    :try_start_2
    new-instance p2, La/mrm0;

    .line 193
    .line 194
    invoke-direct {p2, p1}, La/mrm0;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    check-cast p1, Landroid/view/Surface;

    .line 202
    .line 203
    iget-boolean p2, p0, La/dmn0;->h:Z

    .line 204
    .line 205
    if-eqz p2, :cond_6

    .line 206
    .line 207
    if-eqz p1, :cond_6

    .line 208
    .line 209
    iget-object p2, p0, La/dmn0;->g:Ljava/util/LinkedHashMap;

    .line 210
    .line 211
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    check-cast p1, Ljava/lang/AutoCloseable;

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_4
    new-instance v2, La/mrm0;

    .line 219
    .line 220
    invoke-direct {v2, p1}, La/mrm0;-><init>(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, Landroid/view/Surface;

    .line 228
    .line 229
    iget-object v2, p0, La/dmn0;->f:Ljava/util/LinkedHashMap;

    .line 230
    .line 231
    new-instance v3, La/mrm0;

    .line 232
    .line 233
    invoke-direct {v3, p1}, La/mrm0;-><init>(I)V

    .line 234
    .line 235
    .line 236
    invoke-interface {v2, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    iget-boolean p1, p0, La/dmn0;->h:Z

    .line 240
    .line 241
    if-eqz p1, :cond_6

    .line 242
    .line 243
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    if-nez p1, :cond_6

    .line 248
    .line 249
    iget-object p1, p0, La/dmn0;->g:Ljava/util/LinkedHashMap;

    .line 250
    .line 251
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-nez p1, :cond_5

    .line 256
    .line 257
    iget-object p1, p0, La/dmn0;->g:Ljava/util/LinkedHashMap;

    .line 258
    .line 259
    invoke-static {p1}, La/zys0;->c(Ljava/lang/Object;)Ljava/util/Map;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    check-cast p1, Ljava/lang/AutoCloseable;

    .line 268
    .line 269
    iget-object v0, p0, La/dmn0;->c:La/j3a;

    .line 270
    .line 271
    invoke-virtual {v0, p2}, La/j3a;->a(Landroid/view/Surface;)La/i3a;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iget-object v1, p0, La/dmn0;->g:Ljava/util/LinkedHashMap;

    .line 276
    .line 277
    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    goto :goto_2

    .line 281
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const-string p1, ") is already in use!"

    .line 290
    .line 291
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 299
    .line 300
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 308
    :cond_6
    const/4 p1, 0x0

    .line 309
    :goto_2
    monitor-exit v4

    .line 310
    invoke-virtual {p0}, La/dmn0;->a()V

    .line 311
    .line 312
    .line 313
    if-eqz p1, :cond_f

    .line 314
    .line 315
    instance-of p0, p1, Ljava/lang/AutoCloseable;

    .line 316
    .line 317
    if-eqz p0, :cond_7

    .line 318
    .line 319
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 320
    .line 321
    .line 322
    goto :goto_4

    .line 323
    :cond_7
    instance-of p0, p1, Ljava/util/concurrent/ExecutorService;

    .line 324
    .line 325
    if-eqz p0, :cond_b

    .line 326
    .line 327
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 328
    .line 329
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    if-ne p1, p0, :cond_8

    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_8
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 337
    .line 338
    .line 339
    move-result p0

    .line 340
    if-nez p0, :cond_f

    .line 341
    .line 342
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 343
    .line 344
    .line 345
    const/4 p2, 0x0

    .line 346
    :cond_9
    :goto_3
    if-nez p0, :cond_a

    .line 347
    .line 348
    :try_start_3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 349
    .line 350
    const-wide/16 v1, 0x1

    .line 351
    .line 352
    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 353
    .line 354
    .line 355
    move-result p0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 356
    goto :goto_3

    .line 357
    :catch_0
    if-nez p2, :cond_9

    .line 358
    .line 359
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    const/4 p2, 0x1

    .line 363
    goto :goto_3

    .line 364
    :cond_a
    if-eqz p2, :cond_f

    .line 365
    .line 366
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 371
    .line 372
    .line 373
    goto :goto_4

    .line 374
    :cond_b
    instance-of p0, p1, Landroid/content/res/TypedArray;

    .line 375
    .line 376
    if-eqz p0, :cond_c

    .line 377
    .line 378
    check-cast p1, Landroid/content/res/TypedArray;

    .line 379
    .line 380
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 381
    .line 382
    .line 383
    goto :goto_4

    .line 384
    :cond_c
    instance-of p0, p1, Landroid/media/MediaMetadataRetriever;

    .line 385
    .line 386
    if-eqz p0, :cond_d

    .line 387
    .line 388
    check-cast p1, Landroid/media/MediaMetadataRetriever;

    .line 389
    .line 390
    invoke-virtual {p1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 391
    .line 392
    .line 393
    goto :goto_4

    .line 394
    :cond_d
    instance-of p0, p1, Landroid/media/MediaDrm;

    .line 395
    .line 396
    if-eqz p0, :cond_e

    .line 397
    .line 398
    check-cast p1, Landroid/media/MediaDrm;

    .line 399
    .line 400
    invoke-virtual {p1}, Landroid/media/MediaDrm;->release()V

    .line 401
    .line 402
    .line 403
    goto :goto_4

    .line 404
    :cond_e
    invoke-static {}, La/e9d0;->o()V

    .line 405
    .line 406
    .line 407
    return-void

    .line 408
    :cond_f
    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 409
    .line 410
    .line 411
    return-void

    .line 412
    :goto_5
    monitor-exit v4

    .line 413
    throw p0

    .line 414
    :cond_10
    new-instance p2, Ljava/lang/StringBuilder;

    .line 415
    .line 416
    const-string v0, "Cannot configure surface for "

    .line 417
    .line 418
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-static {p1}, La/mrm0;->a(I)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    const-string v0, ", it is permanently assigned to "

    .line 429
    .line 430
    iget-object p0, p0, La/dmn0;->d:Ljava/util/Map;

    .line 431
    .line 432
    new-instance v1, La/mrm0;

    .line 433
    .line 434
    invoke-direct {v1, p1}, La/mrm0;-><init>(I)V

    .line 435
    .line 436
    .line 437
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    invoke-static {p2, v0, p0}, La/c99;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/b0a;->i:La/zz9;

    .line 2
    .line 3
    iget-object p0, p0, La/zz9;->a:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method
