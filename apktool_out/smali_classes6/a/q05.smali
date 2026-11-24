.class public final synthetic La/q05;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/u12;

.field public final synthetic c:J

.field public final synthetic d:La/y9q0;

.field public final synthetic e:La/psq;

.field public final synthetic f:La/nrq;

.field public final synthetic g:J

.field public final synthetic h:F

.field public final synthetic i:La/j83;

.field public final synthetic j:Z

.field public final synthetic k:I

.field public final synthetic l:Z

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:La/jhn0;

.field public final synthetic o:B

.field public final synthetic p:Z

.field public final synthetic q:Ljava/util/Map;

.field public final synthetic r:Lkotlin/jvm/functions/Function1;

.field public final synthetic s:J

.field public final synthetic t:J

.field public final synthetic u:J


# direct methods
.method public synthetic constructor <init>(La/mm40;La/u12;JLa/y9q0;La/psq;La/nrq;JFLa/j83;ZIZLjava/util/List;La/jhn0;IILjava/util/Map;Lkotlin/jvm/functions/Function1;JJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q05;->a:La/mm40;

    iput-object p2, p0, La/q05;->b:La/u12;

    iput-wide p3, p0, La/q05;->c:J

    iput-object p5, p0, La/q05;->d:La/y9q0;

    iput-object p6, p0, La/q05;->e:La/psq;

    iput-object p7, p0, La/q05;->f:La/nrq;

    iput-wide p8, p0, La/q05;->g:J

    iput p10, p0, La/q05;->h:F

    iput-object p11, p0, La/q05;->i:La/j83;

    iput-boolean p12, p0, La/q05;->j:Z

    iput p13, p0, La/q05;->k:I

    iput-boolean p14, p0, La/q05;->l:Z

    iput-object p15, p0, La/q05;->m:Ljava/util/List;

    move-object/from16 p1, p16

    iput-object p1, p0, La/q05;->n:La/jhn0;

    move/from16 p1, p17

    iput-byte p1, p0, La/q05;->o:B

    move/from16 p1, p18

    iput-boolean p1, p0, La/q05;->p:Z

    move-object/from16 p1, p19

    iput-object p1, p0, La/q05;->q:Ljava/util/Map;

    move-object/from16 p1, p20

    iput-object p1, p0, La/q05;->r:Lkotlin/jvm/functions/Function1;

    move-wide/from16 p1, p21

    iput-wide p1, p0, La/q05;->s:J

    move-wide/from16 p1, p23

    iput-wide p1, p0, La/q05;->t:J

    move-wide/from16 p1, p25

    iput-wide p1, p0, La/q05;->u:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    check-cast v4, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eq v2, v3, :cond_0

    .line 20
    .line 21
    move v2, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    :goto_0
    and-int/2addr v1, v5

    .line 25
    invoke-virtual {v4, v1, v2}, La/fet;->U(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const-string v1, "BOX_WITH_CONSTRAINTS"

    .line 32
    .line 33
    iget-object v2, v0, La/q05;->a:La/mm40;

    .line 34
    .line 35
    invoke-static {v2, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v5, La/s05;

    .line 40
    .line 41
    iget-wide v6, v0, La/q05;->c:J

    .line 42
    .line 43
    iget-object v8, v0, La/q05;->d:La/y9q0;

    .line 44
    .line 45
    iget-object v9, v0, La/q05;->e:La/psq;

    .line 46
    .line 47
    iget-object v10, v0, La/q05;->f:La/nrq;

    .line 48
    .line 49
    iget-wide v11, v0, La/q05;->g:J

    .line 50
    .line 51
    iget-object v13, v0, La/q05;->b:La/u12;

    .line 52
    .line 53
    iget v14, v0, La/q05;->h:F

    .line 54
    .line 55
    iget-object v15, v0, La/q05;->i:La/j83;

    .line 56
    .line 57
    iget-boolean v2, v0, La/q05;->j:Z

    .line 58
    .line 59
    iget v3, v0, La/q05;->k:I

    .line 60
    .line 61
    move-object/from16 p1, v1

    .line 62
    .line 63
    iget-boolean v1, v0, La/q05;->l:Z

    .line 64
    .line 65
    move/from16 v18, v1

    .line 66
    .line 67
    iget-object v1, v0, La/q05;->m:Ljava/util/List;

    .line 68
    .line 69
    move-object/from16 v19, v1

    .line 70
    .line 71
    iget-object v1, v0, La/q05;->n:La/jhn0;

    .line 72
    .line 73
    move-object/from16 v20, v1

    .line 74
    .line 75
    iget-byte v1, v0, La/q05;->o:B

    .line 76
    .line 77
    move/from16 v21, v1

    .line 78
    .line 79
    iget-boolean v1, v0, La/q05;->p:Z

    .line 80
    .line 81
    move/from16 v22, v1

    .line 82
    .line 83
    iget-object v1, v0, La/q05;->q:Ljava/util/Map;

    .line 84
    .line 85
    move-object/from16 v23, v1

    .line 86
    .line 87
    iget-object v1, v0, La/q05;->r:Lkotlin/jvm/functions/Function1;

    .line 88
    .line 89
    move-object/from16 v24, v1

    .line 90
    .line 91
    move/from16 v16, v2

    .line 92
    .line 93
    iget-wide v1, v0, La/q05;->s:J

    .line 94
    .line 95
    move-wide/from16 v25, v1

    .line 96
    .line 97
    iget-wide v1, v0, La/q05;->t:J

    .line 98
    .line 99
    move-wide/from16 v27, v1

    .line 100
    .line 101
    iget-wide v0, v0, La/q05;->u:J

    .line 102
    .line 103
    move-wide/from16 v29, v0

    .line 104
    .line 105
    move/from16 v17, v3

    .line 106
    .line 107
    invoke-direct/range {v5 .. v30}, La/s05;-><init>(JLa/y9q0;La/psq;La/nrq;JLa/u12;FLa/j83;ZIZLjava/util/List;La/jhn0;IILjava/util/Map;Lkotlin/jvm/functions/Function1;JJJ)V

    .line 108
    .line 109
    .line 110
    const v0, -0x78c9954d

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v5, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    const/16 v5, 0xc00

    .line 118
    .line 119
    const/4 v6, 0x4

    .line 120
    const/4 v2, 0x0

    .line 121
    move-object/from16 v0, p1

    .line 122
    .line 123
    move-object v1, v13

    .line 124
    invoke-static/range {v0 .. v6}, La/nnw0;->g(La/mm40;La/u12;ZLa/ugd;La/fet;II)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_1
    invoke-virtual {v4}, La/fet;->X()V

    .line 129
    .line 130
    .line 131
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object v0
.end method
