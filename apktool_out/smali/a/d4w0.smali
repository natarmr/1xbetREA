.class public final La/d4w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jot0;


# instance fields
.field public final a:La/b4w0;

.field public final b:F

.field public final c:F

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public f:Z

.field public g:La/pot0;

.field public h:La/odd;


# direct methods
.method public constructor <init>(La/b4w0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/d4w0;->a:La/b4w0;

    .line 5
    .line 6
    invoke-interface {p1}, La/b4w0;->k()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, La/d4w0;->b:F

    .line 11
    .line 12
    invoke-interface {p1}, La/b4w0;->c()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput p1, p0, La/d4w0;->c:F

    .line 17
    .line 18
    new-instance p1, La/c4w0;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p1, p0, v0}, La/c4w0;-><init>(La/d4w0;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/d4w0;->d:La/n0o0;

    .line 29
    .line 30
    new-instance p1, La/c4w0;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, p0, v0}, La/c4w0;-><init>(La/d4w0;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, La/d4w0;->e:La/n0o0;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a(La/e4w0;ZZ)La/ig00;
    .locals 3

    .line 1
    const-string v0, "Job.asListenableFuture"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, La/odd;

    .line 7
    .line 8
    invoke-direct {v1}, La/odd;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, La/d4w0;->h:La/odd;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const-string p2, "Cancelled due to another zoom value being set."

    .line 18
    .line 19
    invoke-static {p2, v2}, La/dw9;->z(Ljava/lang/String;La/odd;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v1, v2}, La/vzb;->g0(La/jzj;La/ndd;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    iput-object v1, p0, La/d4w0;->h:La/odd;

    .line 27
    .line 28
    invoke-static {}, La/ofm0;->v()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    iget-object v2, p0, La/d4w0;->e:La/n0o0;

    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, La/hy40;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, La/wh00;->l(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, La/hy40;

    .line 51
    .line 52
    invoke-virtual {p2, p1}, La/wh00;->i(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    iget-object p2, p0, La/d4w0;->g:La/pot0;

    .line 56
    .line 57
    if-eqz p2, :cond_4

    .line 58
    .line 59
    iget p1, p1, La/e4w0;->a:F

    .line 60
    .line 61
    iget-object p0, p0, La/d4w0;->a:La/b4w0;

    .line 62
    .line 63
    if-eqz p3, :cond_3

    .line 64
    .line 65
    invoke-interface {p0, p1, p2}, La/b4w0;->b(FLa/pot0;)La/jzj;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-interface {p0, p2}, La/b4w0;->i(La/pot0;)La/jzj;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :goto_2
    invoke-static {p0, v1}, La/vzb;->g0(La/jzj;La/ndd;)V

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    const-string p0, "Camera is not active."

    .line 79
    .line 80
    invoke-static {p0, v1}, La/dw9;->z(Ljava/lang/String;La/odd;)V

    .line 81
    .line 82
    .line 83
    :goto_3
    new-instance p0, La/tu9;

    .line 84
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    new-instance p1, La/msf0;

    .line 89
    .line 90
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, La/tu9;->c:La/msf0;

    .line 94
    .line 95
    new-instance p1, La/wu9;

    .line 96
    .line 97
    invoke-direct {p1, p0}, La/wu9;-><init>(La/tu9;)V

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, La/tu9;->b:La/wu9;

    .line 101
    .line 102
    const-class p2, La/gne;

    .line 103
    .line 104
    iput-object p2, p0, La/tu9;->a:Ljava/lang/Object;

    .line 105
    .line 106
    :try_start_0
    new-instance p2, La/ejd;

    .line 107
    .line 108
    const/16 p3, 0xe

    .line 109
    .line 110
    invoke-direct {p2, p0, p3}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, p2}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, La/tu9;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :catch_0
    move-exception p0

    .line 120
    invoke-virtual {p1, p0}, La/wu9;->b(Ljava/lang/Throwable;)Z

    .line 121
    .line 122
    .line 123
    :goto_4
    invoke-static {p1}, La/ro4;->c0(La/ig00;)La/ig00;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0
.end method

.method public final b(La/pot0;)V
    .locals 4

    .line 1
    iput-object p1, p0, La/d4w0;->g:La/pot0;

    .line 2
    .line 3
    iget-object p1, p0, La/d4w0;->e:La/n0o0;

    .line 4
    .line 5
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, La/hy40;

    .line 10
    .line 11
    invoke-virtual {p1}, La/wh00;->d()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, La/e4w0;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, La/d4w0;->d:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, La/e4w0;

    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, La/d4w0;->f:Z

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    const/4 v2, 0x0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    iget v0, p1, La/e4w0;->a:F

    .line 34
    .line 35
    const/high16 v3, 0x3f800000    # 1.0f

    .line 36
    .line 37
    cmpg-float v0, v0, v3

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    move v0, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v0, v1

    .line 44
    :goto_0
    invoke-virtual {p0, p1, v2, v0}, La/d4w0;->a(La/e4w0;ZZ)La/ig00;

    .line 45
    .line 46
    .line 47
    iput-boolean v1, p0, La/d4w0;->f:Z

    .line 48
    .line 49
    return-void
.end method

.method public final reset()V
    .locals 2

    .line 1
    iget-object v0, p0, La/d4w0;->d:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/e4w0;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p0, v0, v1, v1}, La/d4w0;->a(La/e4w0;ZZ)La/ig00;

    .line 11
    .line 12
    .line 13
    return-void
.end method
