.class public final La/od00;
.super La/a1;
.source "SourceFile"


# instance fields
.field public final a:La/hd00;

.field public final b:I

.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/hd00;

    .line 5
    .line 6
    invoke-direct {v0}, La/b4e;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/od00;->a:La/hd00;

    .line 10
    .line 11
    iput p1, p0, La/od00;->b:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final b(La/p78;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, La/od00;->c:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/od00;->a:La/hd00;

    .line 6
    .line 7
    iget-object p0, p0, La/b4e;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/b4e;

    .line 10
    .line 11
    check-cast p0, La/p78;

    .line 12
    .line 13
    instance-of p1, p0, La/gc00;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    check-cast p0, La/gc00;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, La/gc00;->g:Z

    .line 21
    .line 22
    :cond_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public final d()La/p78;
    .locals 0

    .line 1
    iget-object p0, p0, La/od00;->a:La/hd00;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final g(La/yxk;)La/iyc;
    .locals 3

    .line 1
    iget-boolean v0, p1, La/yxk;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, La/od00;->a:La/hd00;

    .line 7
    .line 8
    iget-object v0, v0, La/b4e;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/b4e;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, La/yxk;->h()La/a1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, La/a1;->d()La/p78;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v2, v0, La/un80;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    instance-of v0, v0, La/hd00;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    :cond_1
    const/4 v1, 0x1

    .line 32
    :cond_2
    iput-boolean v1, p0, La/od00;->c:Z

    .line 33
    .line 34
    iget p0, p1, La/yxk;->e:I

    .line 35
    .line 36
    invoke-static {p0}, La/iyc;->a(I)La/iyc;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_3
    iget v0, p1, La/yxk;->g:I

    .line 42
    .line 43
    iget p0, p0, La/od00;->b:I

    .line 44
    .line 45
    if-lt v0, p0, :cond_4

    .line 46
    .line 47
    iget p1, p1, La/yxk;->c:I

    .line 48
    .line 49
    add-int/2addr p1, p0

    .line 50
    new-instance p0, La/iyc;

    .line 51
    .line 52
    const/4 v0, -0x1

    .line 53
    invoke-direct {p0, v0, p1, v1}, La/iyc;-><init>(IIZ)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method
