.class public final La/dv9;
.super La/sv9;
.source "SourceFile"


# instance fields
.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;Z)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x1

    .line 20
    :goto_0
    array-length v3, v1

    .line 21
    const/4 v4, 0x0

    .line 22
    if-gt v3, v2, :cond_1

    .line 23
    .line 24
    new-array v1, v4, [Ljava/lang/reflect/Type;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    array-length v3, v1

    .line 28
    sub-int/2addr v3, v2

    .line 29
    invoke-static {v1, v4, v3}, La/qx3;->k([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_1
    check-cast v1, [Ljava/lang/reflect/Type;

    .line 34
    .line 35
    invoke-direct {p0, p1, v0, v1}, La/sv9;-><init>(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 36
    .line 37
    .line 38
    iput-boolean p2, p0, La/dv9;->e:Z

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    invoke-virtual {p0, v0}, La/sv9;->d(I)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iget-boolean v1, p0, La/dv9;->e:Z

    .line 10
    .line 11
    iget-object p0, p0, La/sv9;->c:Ljava/lang/reflect/Member;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 16
    .line 17
    new-instance v1, La/jdg0;

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-direct {v1, v2}, La/jdg0;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, La/jdg0;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, La/jdg0;->a(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/jdg0;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v1, La/jdg0;->b:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    new-array v0, v0, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_0
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 50
    .line 51
    new-instance v1, La/jdg0;

    .line 52
    .line 53
    const/4 v2, 0x2

    .line 54
    invoke-direct {v1, v2}, La/jdg0;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p1}, La/jdg0;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v0}, La/jdg0;->a(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, v1, La/jdg0;->b:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    new-array v0, v0, [Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method
