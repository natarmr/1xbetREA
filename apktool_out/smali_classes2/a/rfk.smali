.class public final La/rfk;
.super La/f0d0;
.source "SourceFile"

# interfaces
.implements La/wek;


# instance fields
.field public final B:La/p3d0;

.field public final Y:La/h950;

.field public final Z:La/roi0;

.field public final f1:La/xbu0;

.field public final g1:La/hfk;


# direct methods
.method public constructor <init>(La/vjj;La/d0d0;La/g93;La/gm40;La/tek;ZLa/g950;IZZZZZLa/p3d0;La/h950;La/roi0;La/xbu0;La/hfk;)V
    .locals 15

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    if-eqz p8, :cond_0

    .line 17
    .line 18
    invoke-virtual/range {p14 .. p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v9, La/gmk0;->x0:La/gne0;

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    move-object/from16 v2, p2

    .line 30
    .line 31
    move-object/from16 v3, p3

    .line 32
    .line 33
    move-object/from16 v4, p4

    .line 34
    .line 35
    move-object/from16 v5, p5

    .line 36
    .line 37
    move/from16 v6, p6

    .line 38
    .line 39
    move-object/from16 v7, p7

    .line 40
    .line 41
    move/from16 v8, p8

    .line 42
    .line 43
    move/from16 v10, p9

    .line 44
    .line 45
    move/from16 v11, p10

    .line 46
    .line 47
    move/from16 v13, p11

    .line 48
    .line 49
    move/from16 v14, p12

    .line 50
    .line 51
    move/from16 v12, p13

    .line 52
    .line 53
    invoke-direct/range {v0 .. v14}, La/f0d0;-><init>(La/vjj;La/d0d0;La/g93;La/gm40;La/tek;ZLa/g950;ILa/gmk0;ZZZZZ)V

    .line 54
    .line 55
    .line 56
    move-object/from16 v1, p14

    .line 57
    .line 58
    iput-object v1, p0, La/rfk;->B:La/p3d0;

    .line 59
    .line 60
    move-object/from16 v1, p15

    .line 61
    .line 62
    iput-object v1, p0, La/rfk;->Y:La/h950;

    .line 63
    .line 64
    move-object/from16 v1, p16

    .line 65
    .line 66
    iput-object v1, p0, La/rfk;->Z:La/roi0;

    .line 67
    .line 68
    move-object/from16 v1, p17

    .line 69
    .line 70
    iput-object v1, p0, La/rfk;->f1:La/xbu0;

    .line 71
    .line 72
    move-object/from16 v1, p18

    .line 73
    .line 74
    iput-object v1, p0, La/rfk;->g1:La/hfk;

    .line 75
    .line 76
    return-void

    .line 77
    :cond_0
    const/4 p0, 0x0

    .line 78
    throw p0
.end method


# virtual methods
.method public final A()La/h950;
    .locals 0

    .line 1
    iget-object p0, p0, La/rfk;->Y:La/h950;

    .line 2
    .line 3
    return-object p0
.end method

.method public final B()La/hfk;
    .locals 0

    .line 1
    iget-object p0, p0, La/rfk;->g1:La/hfk;

    .line 2
    .line 3
    return-object p0
.end method

.method public final O()La/z3;
    .locals 0

    .line 1
    iget-object p0, p0, La/rfk;->B:La/p3d0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isExternal()Z
    .locals 1

    .line 1
    sget-object v0, La/njq;->H:La/kjq;

    .line 2
    .line 3
    iget-object p0, p0, La/rfk;->B:La/p3d0;

    .line 4
    .line 5
    iget p0, p0, La/p3d0;->d:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final r1(La/vjj;La/gm40;La/tek;La/d0d0;ILa/g950;)La/f0d0;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    if-eqz p5, :cond_0

    .line 13
    .line 14
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v1, La/rfk;

    .line 18
    .line 19
    invoke-virtual {v0}, La/p4;->getAnnotations()La/g93;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v0}, La/rfk;->isExternal()Z

    .line 24
    .line 25
    .line 26
    move-result v11

    .line 27
    iget-object v2, v0, La/rfk;->f1:La/xbu0;

    .line 28
    .line 29
    iget-object v4, v0, La/rfk;->g1:La/hfk;

    .line 30
    .line 31
    iget-boolean v6, v0, La/f0d0;->g:Z

    .line 32
    .line 33
    iget-boolean v9, v0, La/f0d0;->o:Z

    .line 34
    .line 35
    iget-boolean v10, v0, La/f0d0;->p:Z

    .line 36
    .line 37
    iget-boolean v12, v0, La/f0d0;->s:Z

    .line 38
    .line 39
    iget-boolean v13, v0, La/f0d0;->q:Z

    .line 40
    .line 41
    iget-object v14, v0, La/rfk;->B:La/p3d0;

    .line 42
    .line 43
    iget-object v15, v0, La/rfk;->Y:La/h950;

    .line 44
    .line 45
    iget-object v0, v0, La/rfk;->Z:La/roi0;

    .line 46
    .line 47
    move-object/from16 v5, p3

    .line 48
    .line 49
    move/from16 v8, p5

    .line 50
    .line 51
    move-object/from16 v7, p6

    .line 52
    .line 53
    move-object/from16 v16, v0

    .line 54
    .line 55
    move-object v0, v1

    .line 56
    move-object/from16 v17, v2

    .line 57
    .line 58
    move-object/from16 v18, v4

    .line 59
    .line 60
    move-object/from16 v1, p1

    .line 61
    .line 62
    move-object/from16 v4, p2

    .line 63
    .line 64
    move-object/from16 v2, p4

    .line 65
    .line 66
    invoke-direct/range {v0 .. v18}, La/rfk;-><init>(La/vjj;La/d0d0;La/g93;La/gm40;La/tek;ZLa/g950;IZZZZZLa/p3d0;La/h950;La/roi0;La/xbu0;La/hfk;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_0
    const/4 v0, 0x0

    .line 71
    throw v0
.end method

.method public final x()La/roi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/rfk;->Z:La/roi0;

    .line 2
    .line 3
    return-object p0
.end method
