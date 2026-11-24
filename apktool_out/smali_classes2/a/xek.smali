.class public final La/xek;
.super La/flc;
.source "SourceFile"

# interfaces
.implements La/wek;


# instance fields
.field public final g1:La/v2d0;

.field public final h1:La/h950;

.field public final i1:La/roi0;

.field public final j1:La/xbu0;

.field public final k1:La/hfk;


# direct methods
.method public constructor <init>(La/wm40;La/x4e;La/g93;ZILa/v2d0;La/h950;La/roi0;La/xbu0;La/hfk;La/gmk0;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-eqz p5, :cond_1

    .line 8
    .line 9
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    if-nez p11, :cond_0

    .line 16
    .line 17
    sget-object v0, La/gmk0;->x0:La/gne0;

    .line 18
    .line 19
    move-object v6, v0

    .line 20
    move-object v1, p1

    .line 21
    move-object v2, p2

    .line 22
    move-object v3, p3

    .line 23
    move v4, p4

    .line 24
    move v5, p5

    .line 25
    move-object v0, p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object/from16 v6, p11

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    move-object v1, p1

    .line 31
    move-object v2, p2

    .line 32
    move-object v3, p3

    .line 33
    move v4, p4

    .line 34
    move v5, p5

    .line 35
    :goto_0
    invoke-direct/range {v0 .. v6}, La/flc;-><init>(La/wm40;La/x4e;La/g93;ZILa/gmk0;)V

    .line 36
    .line 37
    .line 38
    iput-object p6, p0, La/xek;->g1:La/v2d0;

    .line 39
    .line 40
    iput-object p7, p0, La/xek;->h1:La/h950;

    .line 41
    .line 42
    iput-object p8, p0, La/xek;->i1:La/roi0;

    .line 43
    .line 44
    move-object/from16 v1, p9

    .line 45
    .line 46
    iput-object v1, p0, La/xek;->j1:La/xbu0;

    .line 47
    .line 48
    move-object/from16 v1, p10

    .line 49
    .line 50
    iput-object v1, p0, La/xek;->k1:La/hfk;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    const/4 v0, 0x0

    .line 54
    throw v0
.end method


# virtual methods
.method public final A()La/h950;
    .locals 0

    .line 1
    iget-object p0, p0, La/xek;->h1:La/h950;

    .line 2
    .line 3
    return-object p0
.end method

.method public final B()La/hfk;
    .locals 0

    .line 1
    iget-object p0, p0, La/xek;->k1:La/hfk;

    .line 2
    .line 3
    return-object p0
.end method

.method public final F1(La/vjj;La/mer;ILa/g93;La/gmk0;)La/xek;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, La/xek;

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, La/wm40;

    .line 13
    .line 14
    move-object v2, p2

    .line 15
    check-cast v2, La/x4e;

    .line 16
    .line 17
    iget-object v9, p0, La/xek;->j1:La/xbu0;

    .line 18
    .line 19
    iget-object v10, p0, La/xek;->k1:La/hfk;

    .line 20
    .line 21
    iget-boolean v4, p0, La/flc;->f1:Z

    .line 22
    .line 23
    iget-object v6, p0, La/xek;->g1:La/v2d0;

    .line 24
    .line 25
    iget-object v7, p0, La/xek;->h1:La/h950;

    .line 26
    .line 27
    iget-object v8, p0, La/xek;->i1:La/roi0;

    .line 28
    .line 29
    move v5, p3

    .line 30
    move-object/from16 v3, p4

    .line 31
    .line 32
    move-object/from16 v11, p5

    .line 33
    .line 34
    invoke-direct/range {v0 .. v11}, La/xek;-><init>(La/wm40;La/x4e;La/g93;ZILa/v2d0;La/h950;La/roi0;La/xbu0;La/hfk;La/gmk0;)V

    .line 35
    .line 36
    .line 37
    iget-boolean p0, p0, La/oer;->w:Z

    .line 38
    .line 39
    iput-boolean p0, v0, La/oer;->w:Z

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    throw p0
.end method

.method public final O()La/z3;
    .locals 0

    .line 1
    iget-object p0, p0, La/xek;->g1:La/v2d0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isExternal()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isInline()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isSuspend()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final bridge synthetic q1(ILa/g93;La/vjj;La/mer;La/g950;La/gmk0;)La/oer;
    .locals 0

    .line 1
    move-object p5, p3

    .line 2
    move p3, p1

    .line 3
    move-object p1, p5

    .line 4
    move-object p5, p4

    .line 5
    move-object p4, p2

    .line 6
    move-object p2, p5

    .line 7
    move-object p5, p6

    .line 8
    invoke-virtual/range {p0 .. p5}, La/xek;->F1(La/vjj;La/mer;ILa/g93;La/gmk0;)La/xek;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final w()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final x()La/roi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xek;->i1:La/roi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic y1(ILa/g93;La/vjj;La/mer;La/g950;La/gmk0;)La/flc;
    .locals 0

    .line 1
    move-object p5, p3

    .line 2
    move p3, p1

    .line 3
    move-object p1, p5

    .line 4
    move-object p5, p4

    .line 5
    move-object p4, p2

    .line 6
    move-object p2, p5

    .line 7
    move-object p5, p6

    .line 8
    invoke-virtual/range {p0 .. p5}, La/xek;->F1(La/vjj;La/mer;ILa/g93;La/gmk0;)La/xek;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
