.class public abstract La/uo9;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)La/vo9;
    .locals 2

    .line 1
    invoke-static {p1}, La/ay3;->S(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-class p2, Ljava/util/concurrent/CompletableFuture;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eq p0, p2, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    instance-of p0, p1, Ljava/lang/reflect/ParameterizedType;

    .line 12
    .line 13
    if-eqz p0, :cond_3

    .line 14
    .line 15
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    invoke-static {p0, p1}, La/ay3;->R(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, La/ay3;->S(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const-class v1, La/jtf0;

    .line 27
    .line 28
    if-eq p2, v1, :cond_1

    .line 29
    .line 30
    new-instance p0, La/rrc;

    .line 31
    .line 32
    const/4 p2, 0x5

    .line 33
    invoke-direct {p0, p1, p2}, La/rrc;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    instance-of p2, p1, Ljava/lang/reflect/ParameterizedType;

    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 42
    .line 43
    invoke-static {p0, p1}, La/ay3;->R(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    new-instance p1, La/prc;

    .line 48
    .line 49
    const/4 p2, 0x6

    .line 50
    invoke-direct {p1, p0, p2}, La/prc;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_2
    const-string p0, "Response must be parameterized as Response<Foo> or Response<? extends Foo>"

    .line 55
    .line 56
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_3
    const-string p0, "CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>"

    .line 61
    .line 62
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method
