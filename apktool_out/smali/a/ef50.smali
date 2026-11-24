.class public abstract La/ef50;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/ye50;

.field public b:Z


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, La/ef50;->a:La/ye50;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v1, p0, La/ef50;->b:Z

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, p0, v2}, La/ye50;->e(La/ef50;La/xe50;)V

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-virtual {v0}, La/ye50;->d()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, La/ye50;->i()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    iget-object v1, v0, La/ye50;->e:La/ff50;

    .line 26
    .line 27
    invoke-virtual {v0}, La/ye50;->f()La/viq;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v0}, La/ye50;->g()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v0, v1, La/ff50;->h:La/ef50;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_7

    .line 44
    .line 45
    iget v0, v1, La/ff50;->g:I

    .line 46
    .line 47
    const/4 v5, -0x1

    .line 48
    if-eq v5, v0, :cond_3

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    iget-object v0, v1, La/ff50;->f:La/af50;

    .line 52
    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {v1, v5}, La/ff50;->c(I)La/af50;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_4
    iput-object v2, v1, La/ff50;->f:La/af50;

    .line 60
    .line 61
    iput v3, v1, La/ff50;->g:I

    .line 62
    .line 63
    iput-object v2, v1, La/ff50;->h:La/ef50;

    .line 64
    .line 65
    sget-object v5, La/hf50;->a:La/hf50;

    .line 66
    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    if-eqz v4, :cond_6

    .line 70
    .line 71
    iget-object v0, v4, La/viq;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, La/jg60;

    .line 74
    .line 75
    iget-object v0, v0, La/jg60;->a:Ljava/lang/Runnable;

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    iput-object v5, v0, La/af50;->d:La/jf50;

    .line 82
    .line 83
    invoke-virtual {v0}, La/af50;->d()V

    .line 84
    .line 85
    .line 86
    :cond_6
    :goto_0
    iget-object v0, v1, La/ff50;->a:La/p7m0;

    .line 87
    .line 88
    invoke-virtual {v0, v2, v5}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :cond_7
    :goto_1
    iput-boolean v3, p0, La/ef50;->b:Z

    .line 92
    .line 93
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public d()V
    .locals 0

    .line 1
    return-void
.end method
