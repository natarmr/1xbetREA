.class public final La/jkq;
.super La/v2;
.source "SourceFile"


# instance fields
.field public final b:La/v2;

.field public final c:La/v2;

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(La/v2;La/v2;ZLkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p4}, La/v2;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jkq;->b:La/v2;

    .line 5
    .line 6
    iput-object p2, p0, La/jkq;->c:La/v2;

    .line 7
    .line 8
    iput-boolean p3, p0, La/jkq;->d:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final A(Z)La/v2;
    .locals 3

    .line 1
    iget-object v0, p0, La/jkq;->b:La/v2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/v2;->A(Z)La/v2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La/jkq;->c:La/v2;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, La/v2;->A(Z)La/v2;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, La/v2;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    new-instance v1, La/jkq;

    .line 27
    .line 28
    iget-boolean p0, p0, La/jkq;->d:Z

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v1, v0, p1, p0, v2}, La/jkq;-><init>(La/v2;La/v2;ZLkotlin/jvm/functions/Function0;)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public final B(Z)La/v2;
    .locals 3

    .line 1
    iget-object v0, p0, La/jkq;->b:La/v2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/v2;->B(Z)La/v2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La/jkq;->c:La/v2;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, La/v2;->B(Z)La/v2;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, La/v2;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    new-instance v1, La/jkq;

    .line 27
    .line 28
    iget-boolean p0, p0, La/jkq;->d:Z

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v1, v0, p1, p0, v2}, La/jkq;-><init>(La/v2;La/v2;ZLkotlin/jvm/functions/Function0;)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public final C()La/v2;
    .locals 0

    .line 1
    iget-object p0, p0, La/jkq;->c:La/v2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final M()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/jkq;->b:La/v2;

    .line 2
    .line 3
    invoke-interface {p0}, La/kiy;->M()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final c()La/kiy;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final f()La/a8z;
    .locals 0

    .line 1
    iget-object p0, p0, La/jkq;->b:La/v2;

    .line 2
    .line 3
    invoke-virtual {p0}, La/v2;->f()La/a8z;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/jkq;->b:La/v2;

    .line 2
    .line 3
    invoke-interface {p0}, La/kiy;->h()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final j()La/sgy;
    .locals 0

    .line 1
    iget-object p0, p0, La/jkq;->b:La/v2;

    .line 2
    .line 3
    invoke-virtual {p0}, La/v2;->j()La/sgy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final n()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final o()La/fhy;
    .locals 1

    .line 1
    iget-object p0, p0, La/jkq;->b:La/v2;

    .line 2
    .line 3
    invoke-interface {p0}, La/kiy;->o()La/fhy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, La/sgy;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, La/sgy;

    .line 12
    .line 13
    invoke-static {p0}, La/azw;->H(La/sgy;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v0, La/sre0;->a:La/tre0;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_0
    return-object p0
.end method

.method public final p()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final q()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/jkq;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public final u()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final z()La/v2;
    .locals 0

    .line 1
    iget-object p0, p0, La/jkq;->b:La/v2;

    .line 2
    .line 3
    return-object p0
.end method
