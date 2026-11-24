.class public final La/nst;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:La/h2c;

.field public final synthetic b:La/kki;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Z

.field public final synthetic j:Z


# direct methods
.method public constructor <init>(La/h2c;La/kki;JZJLjava/lang/String;Ljava/util/List;Ljava/util/List;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nst;->a:La/h2c;

    .line 5
    .line 6
    iput-object p2, p0, La/nst;->b:La/kki;

    .line 7
    .line 8
    iput-wide p3, p0, La/nst;->c:J

    .line 9
    .line 10
    iput-boolean p5, p0, La/nst;->d:Z

    .line 11
    .line 12
    iput-wide p6, p0, La/nst;->e:J

    .line 13
    .line 14
    iput-object p8, p0, La/nst;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p9, p0, La/nst;->g:Ljava/util/List;

    .line 17
    .line 18
    iput-object p10, p0, La/nst;->h:Ljava/util/List;

    .line 19
    .line 20
    iput-boolean p11, p0, La/nst;->i:Z

    .line 21
    .line 22
    iput-boolean p12, p0, La/nst;->j:Z

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/kst;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/kst;

    .line 11
    .line 12
    iget v3, v2, La/kst;->j:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/kst;->j:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/kst;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/kst;-><init>(La/nst;La/yje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/kst;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/kst;->j:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    if-ne v4, v5, :cond_1

    .line 39
    .line 40
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    return-object v0

    .line 51
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v6, La/mst;

    .line 55
    .line 56
    iget-boolean v1, v0, La/nst;->i:Z

    .line 57
    .line 58
    iget-boolean v4, v0, La/nst;->j:Z

    .line 59
    .line 60
    iget-object v8, v0, La/nst;->b:La/kki;

    .line 61
    .line 62
    iget-wide v9, v0, La/nst;->c:J

    .line 63
    .line 64
    iget-boolean v11, v0, La/nst;->d:Z

    .line 65
    .line 66
    iget-wide v12, v0, La/nst;->e:J

    .line 67
    .line 68
    iget-object v14, v0, La/nst;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v15, v0, La/nst;->g:Ljava/util/List;

    .line 71
    .line 72
    iget-object v7, v0, La/nst;->h:Ljava/util/List;

    .line 73
    .line 74
    move/from16 v17, v1

    .line 75
    .line 76
    move/from16 v18, v4

    .line 77
    .line 78
    move-object/from16 v16, v7

    .line 79
    .line 80
    move-object/from16 v7, p1

    .line 81
    .line 82
    invoke-direct/range {v6 .. v18}, La/mst;-><init>(La/kmq;La/kki;JZJLjava/lang/String;Ljava/util/List;Ljava/util/List;ZZ)V

    .line 83
    .line 84
    .line 85
    iput v5, v2, La/kst;->j:I

    .line 86
    .line 87
    iget-object v0, v0, La/nst;->a:La/h2c;

    .line 88
    .line 89
    invoke-virtual {v0, v6, v2}, La/h2c;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-ne v0, v3, :cond_3

    .line 94
    .line 95
    return-object v3

    .line 96
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object v0
.end method
