.class public final La/m8z;
.super La/p4;
.source "SourceFile"


# instance fields
.field public final c:La/j8z;

.field public final d:La/jbz;

.field public final e:I

.field public final synthetic f:La/jbz;

.field public final synthetic g:La/d9z;

.field public final synthetic h:Z

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:J


# direct methods
.method public constructor <init>(La/j8z;La/jbz;ILa/d9z;ZIIJ)V
    .locals 0

    .line 1
    iput-object p2, p0, La/m8z;->f:La/jbz;

    .line 2
    .line 3
    iput-object p4, p0, La/m8z;->g:La/d9z;

    .line 4
    .line 5
    iput-boolean p5, p0, La/m8z;->h:Z

    .line 6
    .line 7
    iput p6, p0, La/m8z;->i:I

    .line 8
    .line 9
    iput p7, p0, La/m8z;->j:I

    .line 10
    .line 11
    iput-wide p8, p0, La/m8z;->k:J

    .line 12
    .line 13
    const/4 p4, 0x6

    .line 14
    invoke-direct {p0, p4}, La/p4;-><init>(B)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/m8z;->c:La/j8z;

    .line 18
    .line 19
    iput-object p2, p0, La/m8z;->d:La/jbz;

    .line 20
    .line 21
    iput p3, p0, La/m8z;->e:I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final n1(IJIII)La/r8z;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/m8z;->c:La/j8z;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, La/j8z;->d(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v2, v2, La/j8z;->b:La/i8z;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Landroidx/compose/foundation/lazy/layout/b;->a(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v12

    .line 17
    iget-object v2, v0, La/m8z;->d:La/jbz;

    .line 18
    .line 19
    move-wide/from16 v14, p2

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1, v14, v15}, La/p4;->z0(La/jbz;IJ)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    invoke-static {v14, v15}, La/p4e;->g(J)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-static {v14, v15}, La/p4e;->k(J)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    :goto_0
    move v4, v2

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {v14, v15}, La/p4e;->f(J)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    const-string v2, "does not have fixed height"

    .line 44
    .line 45
    invoke-static {v2}, La/adx;->a(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-static {v14, v15}, La/p4e;->j(J)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    goto :goto_0

    .line 53
    :goto_1
    iget-object v2, v0, La/m8z;->f:La/jbz;

    .line 54
    .line 55
    iget-object v2, v2, La/jbz;->b:La/c5n0;

    .line 56
    .line 57
    invoke-interface {v2}, La/cnx;->getLayoutDirection()La/k6z;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget-object v2, v0, La/m8z;->g:La/d9z;

    .line 62
    .line 63
    iget-object v13, v2, La/d9z;->m:La/dbz;

    .line 64
    .line 65
    new-instance v2, La/r8z;

    .line 66
    .line 67
    iget v8, v0, La/m8z;->j:I

    .line 68
    .line 69
    iget-wide v10, v0, La/m8z;->k:J

    .line 70
    .line 71
    move-object v5, v2

    .line 72
    move-object v2, v3

    .line 73
    iget-boolean v3, v0, La/m8z;->h:Z

    .line 74
    .line 75
    iget v7, v0, La/m8z;->i:I

    .line 76
    .line 77
    move/from16 v16, p4

    .line 78
    .line 79
    move/from16 v17, p5

    .line 80
    .line 81
    move-object v0, v5

    .line 82
    move/from16 v5, p6

    .line 83
    .line 84
    invoke-direct/range {v0 .. v17}, La/r8z;-><init>(ILjava/lang/Object;ZIILa/k6z;IILjava/util/List;JLjava/lang/Object;La/dbz;JII)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method

.method public final w0(IIIJ)La/kbz;
    .locals 7

    .line 1
    iget v6, p0, La/m8z;->e:I

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move v1, p1

    .line 5
    move v4, p2

    .line 6
    move v5, p3

    .line 7
    move-wide v2, p4

    .line 8
    invoke-virtual/range {v0 .. v6}, La/m8z;->n1(IJIII)La/r8z;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
