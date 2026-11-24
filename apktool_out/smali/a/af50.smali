.class public abstract La/af50;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/df50;

.field public b:Ljava/util/List;

.field public c:Ljava/util/List;

.field public d:La/jf50;

.field public e:Z

.field public f:Z

.field public g:La/ye50;


# direct methods
.method public constructor <init>(La/df50;ZI)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/af50;->a:La/df50;

    .line 8
    .line 9
    sget-object p1, La/iun;->a:La/iun;

    .line 10
    .line 11
    iput-object p1, p0, La/af50;->b:Ljava/util/List;

    .line 12
    .line 13
    iput-object p1, p0, La/af50;->c:Ljava/util/List;

    .line 14
    .line 15
    sget-object p1, La/hf50;->a:La/hf50;

    .line 16
    .line 17
    iput-object p1, p0, La/af50;->d:La/jf50;

    .line 18
    .line 19
    iput-boolean p2, p0, La/af50;->e:Z

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, La/af50;->f:Z

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, La/af50;->g:La/ye50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/ye50;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    iget-boolean p0, p0, La/af50;->e:Z

    .line 14
    .line 15
    return p0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, La/af50;->g:La/ye50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/ye50;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    iget-boolean p0, p0, La/af50;->f:Z

    .line 14
    .line 15
    return p0
.end method

.method public abstract c()V
.end method

.method public abstract d()V
.end method

.method public abstract e(La/xe50;)V
.end method

.method public abstract f(La/xe50;)V
.end method

.method public g()V
    .locals 0

    .line 1
    return-void
.end method

.method public final h()V
    .locals 5

    .line 1
    iget-object v0, p0, La/af50;->g:La/ye50;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, v0, La/ye50;->g:La/xy40;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, La/xy40;->h(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    iget-object v0, v0, La/ye50;->e:La/ff50;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, La/ff50;->f:La/af50;

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget v1, v0, La/ff50;->g:I

    .line 28
    .line 29
    const/4 v3, -0x1

    .line 30
    sget-object v4, La/hf50;->a:La/hf50;

    .line 31
    .line 32
    if-eq v1, v3, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    if-eq v1, v3, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iput-object v4, p0, La/af50;->d:La/jf50;

    .line 39
    .line 40
    invoke-virtual {p0}, La/af50;->g()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iput-object v4, p0, La/af50;->d:La/jf50;

    .line 45
    .line 46
    invoke-virtual {p0}, La/af50;->c()V

    .line 47
    .line 48
    .line 49
    :goto_0
    iput-object v2, v0, La/ff50;->f:La/af50;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    iput v1, v0, La/ff50;->g:I

    .line 53
    .line 54
    iput-object v2, v0, La/ff50;->h:La/ef50;

    .line 55
    .line 56
    :cond_2
    iget-object v1, v0, La/ff50;->d:La/xw3;

    .line 57
    .line 58
    invoke-virtual {v1, p0}, La/xw3;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, La/ff50;->e:La/xw3;

    .line 62
    .line 63
    invoke-virtual {v1, p0}, La/xw3;->remove(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    iput-object v2, p0, La/af50;->g:La/ye50;

    .line 67
    .line 68
    invoke-virtual {v0}, La/ff50;->b()V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method public final i(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/af50;->e:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, La/af50;->e:Z

    .line 7
    .line 8
    iget-object p0, p0, La/af50;->g:La/ye50;

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, La/ye50;->e:La/ff50;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, La/ff50;->b()V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method
