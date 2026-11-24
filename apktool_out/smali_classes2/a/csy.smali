.class public final La/csy;
.super La/hre0;
.source "SourceFile"


# instance fields
.field public final a:La/pry;

.field public final b:La/jqy;

.field public final c:I

.field public final d:La/aiy;

.field public final e:Ljava/lang/String;

.field public final f:La/a8z;


# direct methods
.method public constructor <init>(La/pry;La/jqy;ILa/aiy;La/nzs0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/hre0;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/csy;->a:La/pry;

    .line 11
    .line 12
    iput-object p2, p0, La/csy;->b:La/jqy;

    .line 13
    .line 14
    iput p3, p0, La/csy;->c:I

    .line 15
    .line 16
    iput-object p4, p0, La/csy;->d:La/aiy;

    .line 17
    .line 18
    iget-object p1, p2, La/jqy;->b:Ljava/lang/String;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    const-string p3, "<"

    .line 22
    .line 23
    invoke-static {p1, p3, p2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-nez p2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    iput-object p1, p0, La/csy;->e:Ljava/lang/String;

    .line 32
    .line 33
    sget-object p1, La/wez;->a:La/wez;

    .line 34
    .line 35
    new-instance p2, La/nsr;

    .line 36
    .line 37
    const/16 p3, 0x15

    .line 38
    .line 39
    invoke-direct {p2, p0, p5, p3}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, La/csy;->f:La/a8z;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final c()La/dre0;
    .locals 0

    .line 1
    iget-object p0, p0, La/csy;->a:La/pry;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Z
    .locals 3

    .line 1
    sget-object v0, La/j24;->a:[La/iiy;

    .line 2
    .line 3
    iget-object p0, p0, La/csy;->b:La/jqy;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/j24;->C:La/c5k;

    .line 9
    .line 10
    sget-object v1, La/j24;->a:[La/iiy;

    .line 11
    .line 12
    const/16 v2, 0x38

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/csy;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j()I
    .locals 0

    .line 1
    iget p0, p0, La/csy;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()La/aiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/csy;->d:La/aiy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()La/kiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/csy;->f:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/kiy;

    .line 8
    .line 9
    return-object p0
.end method

.method public final q()Z
    .locals 3

    .line 1
    iget-object v0, p0, La/csy;->a:La/pry;

    .line 2
    .line 3
    instance-of v1, v0, La/osy;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    invoke-interface {v0}, La/dre0;->K()La/ihy;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v1, v1, La/zhy;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, La/fre0;->X(La/dre0;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "Only constructors and top-level callables are supported for now: "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, La/dre0;->K()La/ihy;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, La/qgy;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object p0, p0, La/csy;->e:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v0, p0}, La/hny;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return p0

    .line 47
    :cond_1
    :goto_0
    sget-object v0, La/j24;->a:[La/iiy;

    .line 48
    .line 49
    iget-object p0, p0, La/csy;->b:La/jqy;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    sget-object v0, La/j24;->C:La/c5k;

    .line 55
    .line 56
    sget-object v1, La/j24;->a:[La/iiy;

    .line 57
    .line 58
    const/16 v2, 0x38

    .line 59
    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    invoke-virtual {v0, v1, p0}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0
.end method

.method public final u()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/csy;->b:La/jqy;

    .line 2
    .line 3
    iget-object p0, p0, La/jqy;->d:La/fqy;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method
