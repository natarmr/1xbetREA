.class public final La/bg60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:La/ag60;


# direct methods
.method public constructor <init>(La/ag60;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/bg60;->a:La/ag60;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 5

    .line 1
    iget-object p0, p0, La/bg60;->a:La/ag60;

    .line 2
    .line 3
    iget-object v0, p0, La/ef50;->a:La/ye50;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v1, p0, La/ef50;->b:Z

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, p0, v2}, La/ye50;->e(La/ef50;La/xe50;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-virtual {v0}, La/ye50;->d()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, La/ye50;->i()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v3, 0x0

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    iget-object v0, v0, La/ye50;->e:La/ff50;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, La/ff50;->h:La/ef50;

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_6

    .line 39
    .line 40
    iget v1, v0, La/ff50;->g:I

    .line 41
    .line 42
    const/4 v4, -0x1

    .line 43
    if-eq v4, v1, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    iget-object v1, v0, La/ff50;->f:La/af50;

    .line 47
    .line 48
    if-nez v1, :cond_4

    .line 49
    .line 50
    invoke-virtual {v0, v4}, La/ff50;->c(I)La/af50;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :cond_4
    iput-object v2, v0, La/ff50;->f:La/af50;

    .line 55
    .line 56
    iput v3, v0, La/ff50;->g:I

    .line 57
    .line 58
    iput-object v2, v0, La/ff50;->h:La/ef50;

    .line 59
    .line 60
    sget-object v4, La/hf50;->a:La/hf50;

    .line 61
    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    iput-object v4, v1, La/af50;->d:La/jf50;

    .line 65
    .line 66
    invoke-virtual {v1}, La/af50;->c()V

    .line 67
    .line 68
    .line 69
    :cond_5
    iget-object v0, v0, La/ff50;->a:La/p7m0;

    .line 70
    .line 71
    invoke-virtual {v0, v2, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_6
    :goto_0
    iput-boolean v3, p0, La/ef50;->b:Z

    .line 75
    .line 76
    return-void
.end method

.method public final onBackInvoked()V
    .locals 0

    .line 1
    iget-object p0, p0, La/bg60;->a:La/ag60;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ef50;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/xww;->b0(Landroid/window/BackEvent;)La/xe50;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p0, p0, La/bg60;->a:La/ag60;

    .line 9
    .line 10
    iget-object v0, p0, La/ef50;->a:La/ye50;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-boolean v1, p0, La/ef50;->b:Z

    .line 16
    .line 17
    if-eqz v1, :cond_5

    .line 18
    .line 19
    invoke-virtual {v0}, La/ye50;->d()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, La/ye50;->i()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, v0, La/ye50;->e:La/ff50;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, La/ff50;->h:La/ef50;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_5

    .line 41
    .line 42
    iget p0, v0, La/ff50;->g:I

    .line 43
    .line 44
    const/4 v1, -0x1

    .line 45
    if-eq v1, p0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object p0, v0, La/ff50;->f:La/af50;

    .line 49
    .line 50
    if-nez p0, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0, v1}, La/ff50;->c(I)La/af50;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    :cond_3
    if-eqz p0, :cond_4

    .line 57
    .line 58
    new-instance v2, La/if50;

    .line 59
    .line 60
    invoke-direct {v2, p1, v1}, La/if50;-><init>(La/xe50;I)V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, La/af50;->d:La/jf50;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, La/af50;->e(La/xe50;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    iget-object p0, v0, La/ff50;->a:La/p7m0;

    .line 69
    .line 70
    new-instance v0, La/if50;

    .line 71
    .line 72
    invoke-direct {v0, p1, v1}, La/if50;-><init>(La/xe50;I)V

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    invoke-virtual {p0, p1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    :cond_5
    :goto_0
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/xww;->b0(Landroid/window/BackEvent;)La/xe50;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p0, p0, La/bg60;->a:La/ag60;

    .line 9
    .line 10
    iget-object v0, p0, La/ef50;->a:La/ye50;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-boolean v1, p0, La/ef50;->b:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, p0, p1}, La/ye50;->e(La/ef50;La/xe50;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, La/ef50;->b:Z

    .line 24
    .line 25
    :cond_1
    :goto_0
    return-void
.end method
