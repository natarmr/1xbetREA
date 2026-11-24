.class public final La/kr5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final B:La/kr5;


# instance fields
.field public final A:Ljava/lang/String;

.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Z

.field public final m:I

.field public final n:La/oo5;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/util/List;

.field public final t:Ljava/util/List;

.field public final u:I

.field public final v:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:I

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 28

    .line 1
    new-instance v0, La/kr5;

    .line 2
    .line 3
    sget-object v1, La/iun;->a:La/iun;

    .line 4
    .line 5
    sget-object v14, La/oo5;->d:La/oo5;

    .line 6
    .line 7
    sget-object v2, La/us5;->a:[La/us5;

    .line 8
    .line 9
    const-string v26, ""

    .line 10
    .line 11
    const-string v27, ""

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const-string v4, ""

    .line 16
    .line 17
    const-string v5, ""

    .line 18
    .line 19
    const-string v6, ""

    .line 20
    .line 21
    const-string v7, ""

    .line 22
    .line 23
    const-string v8, ""

    .line 24
    .line 25
    const-string v9, ""

    .line 26
    .line 27
    const-string v10, ""

    .line 28
    .line 29
    const-string v11, ""

    .line 30
    .line 31
    const/4 v12, 0x0

    .line 32
    const/4 v13, 0x0

    .line 33
    const-string v15, ""

    .line 34
    .line 35
    const-string v16, ""

    .line 36
    .line 37
    const-string v17, ""

    .line 38
    .line 39
    const-string v18, ""

    .line 40
    .line 41
    const/16 v21, 0x0

    .line 42
    .line 43
    const-string v22, ""

    .line 44
    .line 45
    const-string v23, ""

    .line 46
    .line 47
    const/16 v24, 0x9

    .line 48
    .line 49
    const-string v25, ""

    .line 50
    .line 51
    move-object/from16 v19, v1

    .line 52
    .line 53
    move-object/from16 v20, v1

    .line 54
    .line 55
    invoke-direct/range {v0 .. v27}, La/kr5;-><init>(Ljava/util/List;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILa/oo5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sput-object v0, La/kr5;->B:La/kr5;

    .line 59
    .line 60
    return-void
.end method

.method public constructor <init>(Ljava/util/List;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILa/oo5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p19 .. p19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p20 .. p20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/kr5;->a:Ljava/util/List;

    .line 17
    .line 18
    iput p2, p0, La/kr5;->b:I

    .line 19
    .line 20
    iput p3, p0, La/kr5;->c:I

    .line 21
    .line 22
    iput-object p4, p0, La/kr5;->d:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p5, p0, La/kr5;->e:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p6, p0, La/kr5;->f:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p7, p0, La/kr5;->g:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p8, p0, La/kr5;->h:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p9, p0, La/kr5;->i:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p10, p0, La/kr5;->j:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p11, p0, La/kr5;->k:Ljava/lang/String;

    .line 37
    .line 38
    iput-boolean p12, p0, La/kr5;->l:Z

    .line 39
    .line 40
    iput p13, p0, La/kr5;->m:I

    .line 41
    .line 42
    iput-object p14, p0, La/kr5;->n:La/oo5;

    .line 43
    .line 44
    iput-object p15, p0, La/kr5;->o:Ljava/lang/String;

    .line 45
    .line 46
    move-object/from16 p1, p16

    .line 47
    .line 48
    iput-object p1, p0, La/kr5;->p:Ljava/lang/String;

    .line 49
    .line 50
    move-object/from16 p1, p17

    .line 51
    .line 52
    iput-object p1, p0, La/kr5;->q:Ljava/lang/String;

    .line 53
    .line 54
    move-object/from16 p1, p18

    .line 55
    .line 56
    iput-object p1, p0, La/kr5;->r:Ljava/lang/String;

    .line 57
    .line 58
    move-object/from16 p1, p19

    .line 59
    .line 60
    iput-object p1, p0, La/kr5;->s:Ljava/util/List;

    .line 61
    .line 62
    move-object/from16 p1, p20

    .line 63
    .line 64
    iput-object p1, p0, La/kr5;->t:Ljava/util/List;

    .line 65
    .line 66
    move/from16 p1, p21

    .line 67
    .line 68
    iput p1, p0, La/kr5;->u:I

    .line 69
    .line 70
    move-object/from16 p1, p22

    .line 71
    .line 72
    iput-object p1, p0, La/kr5;->v:Ljava/lang/String;

    .line 73
    .line 74
    move-object/from16 p1, p23

    .line 75
    .line 76
    iput-object p1, p0, La/kr5;->w:Ljava/lang/String;

    .line 77
    .line 78
    move/from16 p1, p24

    .line 79
    .line 80
    iput p1, p0, La/kr5;->x:I

    .line 81
    .line 82
    move-object/from16 p1, p25

    .line 83
    .line 84
    iput-object p1, p0, La/kr5;->y:Ljava/lang/String;

    .line 85
    .line 86
    move-object/from16 p1, p26

    .line 87
    .line 88
    iput-object p1, p0, La/kr5;->z:Ljava/lang/String;

    .line 89
    .line 90
    move-object/from16 p1, p27

    .line 91
    .line 92
    iput-object p1, p0, La/kr5;->A:Ljava/lang/String;

    .line 93
    .line 94
    return-void
.end method

.method public static b(La/kr5;I)La/kr5;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/kr5;->a:Ljava/util/List;

    .line 4
    .line 5
    iget v2, v0, La/kr5;->b:I

    .line 6
    .line 7
    iget v3, v0, La/kr5;->c:I

    .line 8
    .line 9
    iget-object v4, v0, La/kr5;->d:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, v0, La/kr5;->e:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v0, La/kr5;->f:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, v0, La/kr5;->g:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, v0, La/kr5;->h:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v9, v0, La/kr5;->i:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v10, v0, La/kr5;->j:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v11, v0, La/kr5;->k:Ljava/lang/String;

    .line 24
    .line 25
    iget-boolean v12, v0, La/kr5;->l:Z

    .line 26
    .line 27
    iget v13, v0, La/kr5;->m:I

    .line 28
    .line 29
    iget-object v14, v0, La/kr5;->n:La/oo5;

    .line 30
    .line 31
    iget-object v15, v0, La/kr5;->o:Ljava/lang/String;

    .line 32
    .line 33
    move-object/from16 v16, v1

    .line 34
    .line 35
    iget-object v1, v0, La/kr5;->p:Ljava/lang/String;

    .line 36
    .line 37
    move-object/from16 v17, v1

    .line 38
    .line 39
    iget-object v1, v0, La/kr5;->q:Ljava/lang/String;

    .line 40
    .line 41
    move-object/from16 v18, v1

    .line 42
    .line 43
    iget-object v1, v0, La/kr5;->r:Ljava/lang/String;

    .line 44
    .line 45
    move-object/from16 v19, v1

    .line 46
    .line 47
    iget-object v1, v0, La/kr5;->s:Ljava/util/List;

    .line 48
    .line 49
    move-object/from16 v20, v1

    .line 50
    .line 51
    iget-object v1, v0, La/kr5;->t:Ljava/util/List;

    .line 52
    .line 53
    move-object/from16 v21, v1

    .line 54
    .line 55
    iget v1, v0, La/kr5;->u:I

    .line 56
    .line 57
    move/from16 v22, v1

    .line 58
    .line 59
    iget-object v1, v0, La/kr5;->v:Ljava/lang/String;

    .line 60
    .line 61
    move-object/from16 v23, v1

    .line 62
    .line 63
    iget-object v1, v0, La/kr5;->w:Ljava/lang/String;

    .line 64
    .line 65
    move-object/from16 v24, v1

    .line 66
    .line 67
    iget-object v1, v0, La/kr5;->y:Ljava/lang/String;

    .line 68
    .line 69
    move-object/from16 v25, v1

    .line 70
    .line 71
    iget-object v1, v0, La/kr5;->z:Ljava/lang/String;

    .line 72
    .line 73
    move-object/from16 v26, v1

    .line 74
    .line 75
    iget-object v1, v0, La/kr5;->A:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v0, La/kr5;

    .line 93
    .line 94
    move-object/from16 v27, v1

    .line 95
    .line 96
    move-object/from16 v1, v16

    .line 97
    .line 98
    move-object/from16 v16, v17

    .line 99
    .line 100
    move-object/from16 v17, v18

    .line 101
    .line 102
    move-object/from16 v18, v19

    .line 103
    .line 104
    move-object/from16 v19, v20

    .line 105
    .line 106
    move-object/from16 v20, v21

    .line 107
    .line 108
    move/from16 v21, v22

    .line 109
    .line 110
    move-object/from16 v22, v23

    .line 111
    .line 112
    move-object/from16 v23, v24

    .line 113
    .line 114
    move/from16 v24, p1

    .line 115
    .line 116
    invoke-direct/range {v0 .. v27}, La/kr5;-><init>(Ljava/util/List;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILa/oo5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/kr5;->n:La/oo5;

    .line 2
    .line 3
    sget-object v1, La/oo5;->d:La/oo5;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, La/kr5;->m:I

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget p0, p0, La/kr5;->u:I

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, La/kr5;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/kr5;->n:La/oo5;

    .line 6
    .line 7
    sget-object v1, La/oo5;->d:La/oo5;

    .line 8
    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, La/kr5;->a()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/kr5;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/kr5;

    .line 12
    .line 13
    iget-object v0, p0, La/kr5;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v1, p1, La/kr5;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget v0, p0, La/kr5;->b:I

    .line 26
    .line 27
    iget v1, p1, La/kr5;->b:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget v0, p0, La/kr5;->c:I

    .line 34
    .line 35
    iget v1, p1, La/kr5;->c:I

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_4
    iget-object v0, p0, La/kr5;->d:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, p1, La/kr5;->d:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_5
    iget-object v0, p0, La/kr5;->e:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v1, p1, La/kr5;->e:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_6
    iget-object v0, p0, La/kr5;->f:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v1, p1, La/kr5;->f:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :cond_7
    iget-object v0, p0, La/kr5;->g:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v1, p1, La/kr5;->g:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_8

    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :cond_8
    iget-object v0, p0, La/kr5;->h:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v1, p1, La/kr5;->h:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_9

    .line 98
    .line 99
    goto/16 :goto_0

    .line 100
    .line 101
    :cond_9
    iget-object v0, p0, La/kr5;->i:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v1, p1, La/kr5;->i:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_a

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :cond_a
    iget-object v0, p0, La/kr5;->j:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v1, p1, La/kr5;->j:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_b

    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    .line 125
    :cond_b
    iget-object v0, p0, La/kr5;->k:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v1, p1, La/kr5;->k:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_c

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_c
    iget-boolean v0, p0, La/kr5;->l:Z

    .line 138
    .line 139
    iget-boolean v1, p1, La/kr5;->l:Z

    .line 140
    .line 141
    if-eq v0, v1, :cond_d

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_d
    iget v0, p0, La/kr5;->m:I

    .line 146
    .line 147
    iget v1, p1, La/kr5;->m:I

    .line 148
    .line 149
    if-eq v0, v1, :cond_e

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_e
    iget-object v0, p0, La/kr5;->n:La/oo5;

    .line 154
    .line 155
    iget-object v1, p1, La/kr5;->n:La/oo5;

    .line 156
    .line 157
    if-eq v0, v1, :cond_f

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_f
    iget-object v0, p0, La/kr5;->o:Ljava/lang/String;

    .line 162
    .line 163
    iget-object v1, p1, La/kr5;->o:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-nez v0, :cond_10

    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_10
    iget-object v0, p0, La/kr5;->p:Ljava/lang/String;

    .line 174
    .line 175
    iget-object v1, p1, La/kr5;->p:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-nez v0, :cond_11

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_11
    iget-object v0, p0, La/kr5;->q:Ljava/lang/String;

    .line 186
    .line 187
    iget-object v1, p1, La/kr5;->q:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_12

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_12
    iget-object v0, p0, La/kr5;->r:Ljava/lang/String;

    .line 198
    .line 199
    iget-object v1, p1, La/kr5;->r:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-nez v0, :cond_13

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_13
    iget-object v0, p0, La/kr5;->s:Ljava/util/List;

    .line 209
    .line 210
    iget-object v1, p1, La/kr5;->s:Ljava/util/List;

    .line 211
    .line 212
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-nez v0, :cond_14

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_14
    iget-object v0, p0, La/kr5;->t:Ljava/util/List;

    .line 220
    .line 221
    iget-object v1, p1, La/kr5;->t:Ljava/util/List;

    .line 222
    .line 223
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-nez v0, :cond_15

    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_15
    iget v0, p0, La/kr5;->u:I

    .line 231
    .line 232
    iget v1, p1, La/kr5;->u:I

    .line 233
    .line 234
    if-eq v0, v1, :cond_16

    .line 235
    .line 236
    goto :goto_0

    .line 237
    :cond_16
    iget-object v0, p0, La/kr5;->v:Ljava/lang/String;

    .line 238
    .line 239
    iget-object v1, p1, La/kr5;->v:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_17

    .line 246
    .line 247
    goto :goto_0

    .line 248
    :cond_17
    iget-object v0, p0, La/kr5;->w:Ljava/lang/String;

    .line 249
    .line 250
    iget-object v1, p1, La/kr5;->w:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_18

    .line 257
    .line 258
    goto :goto_0

    .line 259
    :cond_18
    iget v0, p0, La/kr5;->x:I

    .line 260
    .line 261
    iget v1, p1, La/kr5;->x:I

    .line 262
    .line 263
    if-eq v0, v1, :cond_19

    .line 264
    .line 265
    goto :goto_0

    .line 266
    :cond_19
    iget-object v0, p0, La/kr5;->y:Ljava/lang/String;

    .line 267
    .line 268
    iget-object v1, p1, La/kr5;->y:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-nez v0, :cond_1a

    .line 275
    .line 276
    goto :goto_0

    .line 277
    :cond_1a
    iget-object v0, p0, La/kr5;->z:Ljava/lang/String;

    .line 278
    .line 279
    iget-object v1, p1, La/kr5;->z:Ljava/lang/String;

    .line 280
    .line 281
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-nez v0, :cond_1b

    .line 286
    .line 287
    goto :goto_0

    .line 288
    :cond_1b
    iget-object p0, p0, La/kr5;->A:Ljava/lang/String;

    .line 289
    .line 290
    iget-object p1, p1, La/kr5;->A:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result p0

    .line 296
    if-nez p0, :cond_1c

    .line 297
    .line 298
    :goto_0
    const/4 p0, 0x0

    .line 299
    return p0

    .line 300
    :cond_1c
    :goto_1
    const/4 p0, 0x1

    .line 301
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/kr5;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, La/kr5;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/kr5;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/kr5;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/kr5;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/kr5;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/kr5;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/kr5;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/kr5;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/kr5;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/kr5;->k:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, La/kr5;->l:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v2, p0, La/kr5;->m:I

    .line 77
    .line 78
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, La/kr5;->n:La/oo5;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    add-int/2addr v2, v0

    .line 89
    mul-int/2addr v2, v1

    .line 90
    iget-object v0, p0, La/kr5;->o:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-object v2, p0, La/kr5;->p:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object v2, p0, La/kr5;->q:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget-object v2, p0, La/kr5;->r:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget-object v2, p0, La/kr5;->s:Ljava/util/List;

    .line 115
    .line 116
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iget-object v2, p0, La/kr5;->t:Ljava/util/List;

    .line 121
    .line 122
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    iget v2, p0, La/kr5;->u:I

    .line 127
    .line 128
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iget-object v2, p0, La/kr5;->v:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    iget-object v2, p0, La/kr5;->w:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    iget v2, p0, La/kr5;->x:I

    .line 145
    .line 146
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    iget-object v2, p0, La/kr5;->y:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    iget-object v2, p0, La/kr5;->z:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    iget-object p0, p0, La/kr5;->A:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    add-int/2addr p0, v0

    .line 169
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BannerModel(ref="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/kr5;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", bannerId="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, La/kr5;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", sortID="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", translateId="

    .line 29
    .line 30
    const-string v2, ", prizeId="

    .line 31
    .line 32
    iget v3, p0, La/kr5;->c:I

    .line 33
    .line 34
    iget-object v4, p0, La/kr5;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", url="

    .line 40
    .line 41
    const-string v2, ", previewUrl="

    .line 42
    .line 43
    iget-object v3, p0, La/kr5;->e:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v4, p0, La/kr5;->f:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", squareImageUrl="

    .line 51
    .line 52
    const-string v2, ", bigSquareImageUrl="

    .line 53
    .line 54
    iget-object v3, p0, La/kr5;->g:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v4, p0, La/kr5;->h:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v1, ", verticalImageUrl="

    .line 62
    .line 63
    const-string v2, ", horizontalImage="

    .line 64
    .line 65
    iget-object v3, p0, La/kr5;->i:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v4, p0, La/kr5;->j:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string v1, ", action="

    .line 73
    .line 74
    const-string v2, ", lotteryId="

    .line 75
    .line 76
    iget-object v3, p0, La/kr5;->k:Ljava/lang/String;

    .line 77
    .line 78
    iget-boolean v4, p0, La/kr5;->l:Z

    .line 79
    .line 80
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 81
    .line 82
    .line 83
    iget v1, p0, La/kr5;->m:I

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ", actionType="

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, La/kr5;->n:La/oo5;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v1, ", title="

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", description="

    .line 104
    .line 105
    const-string v2, ", ruleDescription="

    .line 106
    .line 107
    iget-object v3, p0, La/kr5;->o:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v4, p0, La/kr5;->p:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-string v1, ", gameDescription="

    .line 115
    .line 116
    const-string v2, ", types="

    .line 117
    .line 118
    iget-object v3, p0, La/kr5;->q:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v4, p0, La/kr5;->r:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v1, ", tabs="

    .line 126
    .line 127
    const-string v2, ", prizeFlag="

    .line 128
    .line 129
    iget-object v3, p0, La/kr5;->s:Ljava/util/List;

    .line 130
    .line 131
    iget-object v4, p0, La/kr5;->t:Ljava/util/List;

    .line 132
    .line 133
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 134
    .line 135
    .line 136
    const-string v1, ", deeplink="

    .line 137
    .line 138
    const-string v2, ", siteLink="

    .line 139
    .line 140
    iget v3, p0, La/kr5;->u:I

    .line 141
    .line 142
    iget-object v4, p0, La/kr5;->v:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 145
    .line 146
    .line 147
    const-string v1, ", bannerType="

    .line 148
    .line 149
    const-string v2, ", ticketsChipsName="

    .line 150
    .line 151
    iget v3, p0, La/kr5;->x:I

    .line 152
    .line 153
    iget-object v4, p0, La/kr5;->w:Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 156
    .line 157
    .line 158
    const-string v1, ", content="

    .line 159
    .line 160
    const-string v2, ", info="

    .line 161
    .line 162
    iget-object v3, p0, La/kr5;->y:Ljava/lang/String;

    .line 163
    .line 164
    iget-object v4, p0, La/kr5;->z:Ljava/lang/String;

    .line 165
    .line 166
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v1, ")"

    .line 170
    .line 171
    iget-object p0, p0, La/kr5;->A:Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0
.end method
