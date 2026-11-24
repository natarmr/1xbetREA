.class public final La/ye50;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/ye50;

.field public final b:La/viq;

.field public c:Z

.field public d:Z

.field public final e:La/ff50;

.field public final f:La/xy40;

.field public final g:La/xy40;

.field public final h:La/xy40;


# direct methods
.method public constructor <init>(La/ye50;La/viq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ye50;->a:La/ye50;

    .line 5
    .line 6
    iput-object p2, p0, La/ye50;->b:La/viq;

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    iput-boolean p2, p0, La/ye50;->d:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, La/ye50;->e:La/ff50;

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    :cond_0
    new-instance p1, La/ff50;

    .line 18
    .line 19
    invoke-direct {p1}, La/ff50;-><init>()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iput-object p1, p0, La/ye50;->e:La/ff50;

    .line 23
    .line 24
    invoke-static {}, La/ha80;->a()La/xy40;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/ye50;->f:La/xy40;

    .line 29
    .line 30
    invoke-static {}, La/ha80;->a()La/xy40;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, La/ye50;->g:La/xy40;

    .line 35
    .line 36
    invoke-static {}, La/ha80;->a()La/xy40;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, La/ye50;->h:La/xy40;

    .line 41
    .line 42
    iget-object p1, p0, La/ye50;->a:La/ye50;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object p1, p1, La/ye50;->f:La/xy40;

    .line 47
    .line 48
    invoke-virtual {p1, p0}, La/xy40;->g(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public static a(La/ye50;La/af50;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/ye50;->d()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/ye50;->g:La/xy40;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, La/xy40;->a(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, La/ye50;->e:La/ff50;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v1, p1, La/af50;->g:La/ye50;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    iget-object v1, v0, La/ff50;->e:La/xw3;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, La/xw3;->addFirst(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object p0, p1, La/af50;->g:La/ye50;

    .line 33
    .line 34
    invoke-virtual {v0}, La/ff50;->b()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const-string p0, "Handler \'"

    .line 39
    .line 40
    const-string v0, "\' is already registered with a dispatcher"

    .line 41
    .line 42
    invoke-static {p1, v0, p0}, La/e9d0;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method


# virtual methods
.method public final b(La/ef50;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ye50;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ye50;->h:La/xy40;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, La/xy40;->a(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, La/ye50;->e:La/ff50;

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    invoke-virtual {v0, p0, p1, v1}, La/ff50;->a(La/ye50;La/ef50;I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final c(La/ag60;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/ye50;->d()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-eq p2, v0, :cond_1

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p0, "Unsupported priority value: "

    .line 11
    .line 12
    invoke-static {p2, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, La/ye50;->h:La/xy40;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, La/xy40;->a(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, La/ye50;->e:La/ff50;

    .line 29
    .line 30
    invoke-virtual {v0, p0, p1, p2}, La/ff50;->a(La/ye50;La/ef50;I)V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
.end method

.method public final d()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ye50;->h()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "This NavigationEventDispatcher has already been disposed and cannot be used."

    .line 9
    .line 10
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e(La/ef50;La/xe50;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ye50;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ye50;->i()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p0, p0, La/ye50;->e:La/ff50;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v0, p0, La/ff50;->g:I

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, -0x1

    .line 22
    invoke-virtual {p0, v0}, La/ff50;->c(I)La/af50;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, La/ff50;->f:La/af50;

    .line 27
    .line 28
    iput v0, p0, La/ff50;->g:I

    .line 29
    .line 30
    iput-object p1, p0, La/ff50;->h:La/ef50;

    .line 31
    .line 32
    if-eqz p2, :cond_3

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    new-instance p1, La/if50;

    .line 37
    .line 38
    invoke-direct {p1, p2, v0}, La/if50;-><init>(La/xe50;I)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v1, La/af50;->d:La/jf50;

    .line 42
    .line 43
    invoke-virtual {v1, p2}, La/af50;->f(La/xe50;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object p0, p0, La/ff50;->a:La/p7m0;

    .line 47
    .line 48
    new-instance p1, La/if50;

    .line 49
    .line 50
    invoke-direct {p1, p2, v0}, La/if50;-><init>(La/xe50;I)V

    .line 51
    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    invoke-virtual {p0, p2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_0
    return-void
.end method

.method public final f()La/viq;
    .locals 1

    .line 1
    iget-object v0, p0, La/ye50;->b:La/viq;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, La/ye50;->a:La/ye50;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/ye50;->f()La/viq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_1
    return-object v0
.end method

.method public final g()V
    .locals 0

    .line 1
    iget-object p0, p0, La/ye50;->a:La/ye50;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/ye50;->g()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final h()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/ye50;->a:La/ye50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/ye50;->h()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-boolean p0, p0, La/ye50;->c:Z

    .line 14
    .line 15
    return p0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-object v0, p0, La/ye50;->a:La/ye50;

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
    iget-boolean p0, p0, La/ye50;->d:Z

    .line 14
    .line 15
    return p0
.end method
