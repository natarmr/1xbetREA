.class public final La/lzn;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/ozn;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:La/pu90;

.field public final synthetic f:J

.field public final synthetic g:La/u9d;


# direct methods
.method public constructor <init>(La/ozn;La/uls0;JJJLa/pu90;JLa/u9d;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/lzn;->a:La/ozn;

    .line 2
    .line 3
    iput-object p2, p0, La/lzn;->b:La/l7m0;

    .line 4
    .line 5
    iput-wide p5, p0, La/lzn;->c:J

    .line 6
    .line 7
    iput-wide p7, p0, La/lzn;->d:J

    .line 8
    .line 9
    iput-object p9, p0, La/lzn;->e:La/pu90;

    .line 10
    .line 11
    iput-wide p10, p0, La/lzn;->f:J

    .line 12
    .line 13
    iput-object p12, p0, La/lzn;->g:La/u9d;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/ou90;

    .line 3
    .line 4
    iget-object p1, p0, La/lzn;->a:La/ozn;

    .line 5
    .line 6
    iget-object v1, p1, La/ozn;->v:La/toj0;

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    iget-object v4, p0, La/lzn;->b:La/l7m0;

    .line 11
    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, La/ikx;

    .line 19
    .line 20
    iget-wide v4, v4, La/ikx;->a:J

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-wide v4, v2

    .line 24
    :goto_0
    invoke-virtual {v1}, La/toj0;->b()Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, La/toj0;->b()Z

    .line 28
    .line 29
    .line 30
    invoke-static {v4, v5, v2, v3}, La/ikx;->d(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    invoke-virtual {v1}, La/toj0;->b()Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iput-wide v4, v1, La/toj0;->i:J

    .line 41
    .line 42
    :cond_1
    iget-object v7, p1, La/ozn;->z:La/u12;

    .line 43
    .line 44
    if-eqz v7, :cond_2

    .line 45
    .line 46
    iget-wide v10, p0, La/lzn;->d:J

    .line 47
    .line 48
    sget-object v12, La/k6z;->a:La/k6z;

    .line 49
    .line 50
    iget-wide v8, p0, La/lzn;->c:J

    .line 51
    .line 52
    invoke-interface/range {v7 .. v12}, La/u12;->a(JJLa/k6z;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    :cond_2
    invoke-static {v2, v3, v4, v5}, La/ikx;->d(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    const/16 p1, 0x20

    .line 61
    .line 62
    shr-long v3, v1, p1

    .line 63
    .line 64
    long-to-int v3, v3

    .line 65
    iget-wide v4, p0, La/lzn;->f:J

    .line 66
    .line 67
    shr-long v6, v4, p1

    .line 68
    .line 69
    long-to-int p1, v6

    .line 70
    add-int/2addr v3, p1

    .line 71
    const-wide v6, 0xffffffffL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    and-long/2addr v1, v6

    .line 77
    long-to-int p1, v1

    .line 78
    and-long v1, v4, v6

    .line 79
    .line 80
    long-to-int v1, v1

    .line 81
    add-int/2addr p1, v1

    .line 82
    const/4 v4, 0x0

    .line 83
    iget-object v5, p0, La/lzn;->g:La/u9d;

    .line 84
    .line 85
    iget-object v1, p0, La/lzn;->e:La/pu90;

    .line 86
    .line 87
    move v2, v3

    .line 88
    move v3, p1

    .line 89
    invoke-virtual/range {v0 .. v5}, La/ou90;->D(La/pu90;IIFLkotlin/jvm/functions/Function1;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0
.end method
