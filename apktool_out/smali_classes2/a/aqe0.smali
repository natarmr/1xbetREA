.class public final La/aqe0;
.super La/u0;
.source "SourceFile"


# static fields
.field public static final d:La/aqe0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/aqe0;

    .line 2
    .line 3
    sget-object v1, La/fty;->f:La/fty;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, La/cgx0;

    .line 9
    .line 10
    sget-object v3, La/v9y;->d:La/w9y;

    .line 11
    .line 12
    iget-object v4, v3, La/w9y;->b:La/fty;

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    iget v4, v4, La/fty;->d:I

    .line 17
    .line 18
    iget v5, v1, La/fty;->d:I

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    if-gtz v4, :cond_0

    .line 22
    .line 23
    iget-object v3, v3, La/w9y;->c:La/zlf0;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v3, v3, La/w9y;->a:La/zlf0;

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v4, La/zlf0;->c:La/zlf0;

    .line 32
    .line 33
    if-ne v3, v4, :cond_1

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v4, v3

    .line 38
    :goto_1
    new-instance v5, La/ydy;

    .line 39
    .line 40
    invoke-direct {v5, v3, v4}, La/ydy;-><init>(La/zlf0;La/zlf0;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, La/w0;

    .line 44
    .line 45
    const/16 v4, 0x1a

    .line 46
    .line 47
    invoke-direct {v3, v1, v4}, La/w0;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v2, v5, v3}, La/cgx0;-><init>(La/ydy;La/w0;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v2}, La/u0;-><init>(La/cgx0;)V

    .line 54
    .line 55
    .line 56
    sput-object v0, La/aqe0;->d:La/aqe0;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)La/swq;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, La/sgy;->v()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    new-instance p1, La/swq;

    .line 17
    .line 18
    invoke-direct {p1, p0}, La/swq;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/iun;->a:La/iun;

    .line 7
    .line 8
    return-object p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
