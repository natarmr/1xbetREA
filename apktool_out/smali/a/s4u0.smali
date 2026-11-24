.class public final La/s4u0;
.super La/pm80;
.source "SourceFile"


# instance fields
.field public final f:La/pz40;

.field public final g:La/pz40;

.field public final h:La/y3u0;

.field public i:La/mld;

.field public final j:La/pz40;

.field public k:F

.field public l:La/a4d;


# direct methods
.method public constructor <init>(La/wgv;)V
    .locals 3

    .line 1
    invoke-direct {p0}, La/pm80;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/h7k0;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, La/h7k0;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, La/s4u0;->f:La/pz40;

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/s4u0;->g:La/pz40;

    .line 24
    .line 25
    new-instance v0, La/y3u0;

    .line 26
    .line 27
    invoke-direct {v0, p1}, La/y3u0;-><init>(La/wgv;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, La/rbt0;

    .line 31
    .line 32
    const/4 v1, 0x7

    .line 33
    invoke-direct {p1, p0, v1}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    iput-object p1, v0, La/y3u0;->f:Lkotlin/jvm/functions/Function0;

    .line 37
    .line 38
    iput-object v0, p0, La/s4u0;->h:La/y3u0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    sget-object v0, La/m2a;->v:La/m2a;

    .line 43
    .line 44
    invoke-static {p1, v0}, Landroidx/compose/runtime/e;->d(Ljava/lang/Object;La/igk0;)La/pz40;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/s4u0;->j:La/pz40;

    .line 49
    .line 50
    const/high16 p1, 0x3f800000    # 1.0f

    .line 51
    .line 52
    iput p1, p0, La/s4u0;->k:F

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a(F)Z
    .locals 0

    .line 1
    iput p1, p0, La/s4u0;->k:F

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0
.end method

.method public final b(La/a4d;)Z
    .locals 0

    .line 1
    iput-object p1, p0, La/s4u0;->l:La/a4d;

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-object p0, p0, La/s4u0;->f:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/h7k0;

    .line 10
    .line 11
    iget-wide v0, p0, La/h7k0;->a:J

    .line 12
    .line 13
    return-wide v0
.end method

.method public final j(La/fhl;)V
    .locals 10

    .line 1
    iget-object v0, p0, La/s4u0;->l:La/a4d;

    .line 2
    .line 3
    iget-object v1, p0, La/s4u0;->h:La/y3u0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v1, La/y3u0;->g:La/pz40;

    .line 8
    .line 9
    check-cast v0, La/hgk0;

    .line 10
    .line 11
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/a4d;

    .line 16
    .line 17
    :cond_0
    iget-object v2, p0, La/s4u0;->g:La/pz40;

    .line 18
    .line 19
    check-cast v2, La/hgk0;

    .line 20
    .line 21
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, La/fhl;->getLayoutDirection()La/k6z;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v3, La/k6z;->b:La/k6z;

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-interface {p1}, La/fhl;->E0()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, La/nr;->p()J

    .line 50
    .line 51
    .line 52
    move-result-wide v5

    .line 53
    invoke-virtual {v4}, La/nr;->i()La/x5a;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-interface {v7}, La/x5a;->l()V

    .line 58
    .line 59
    .line 60
    :try_start_0
    iget-object v7, v4, La/nr;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v7, La/fvt0;

    .line 63
    .line 64
    const/high16 v8, -0x40800000    # -1.0f

    .line 65
    .line 66
    const/high16 v9, 0x3f800000    # 1.0f

    .line 67
    .line 68
    invoke-virtual {v7, v8, v9, v2, v3}, La/fvt0;->z(FFJ)V

    .line 69
    .line 70
    .line 71
    iget v2, p0, La/s4u0;->k:F

    .line 72
    .line 73
    invoke-virtual {v1, p1, v2, v0}, La/y3u0;->e(La/fhl;FLa/a4d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    invoke-static {v4, v5, v6}, Lc;->g(La/nr;J)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p0

    .line 81
    invoke-static {v4, v5, v6}, Lc;->g(La/nr;J)V

    .line 82
    .line 83
    .line 84
    throw p0

    .line 85
    :cond_1
    iget v2, p0, La/s4u0;->k:F

    .line 86
    .line 87
    invoke-virtual {v1, p1, v2, v0}, La/y3u0;->e(La/fhl;FLa/a4d;)V

    .line 88
    .line 89
    .line 90
    :goto_0
    iget-object p0, p0, La/s4u0;->j:La/pz40;

    .line 91
    .line 92
    check-cast p0, La/hgk0;

    .line 93
    .line 94
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    return-void
.end method
