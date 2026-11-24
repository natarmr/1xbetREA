.class public final La/thv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:La/thv0;

.field public static final b:La/n0o0;

.field public static final c:La/gqw0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/thv0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/thv0;->a:La/thv0;

    .line 7
    .line 8
    const-class v0, La/uhv0;

    .line 9
    .line 10
    sget-object v1, La/sre0;->a:La/tre0;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    new-instance v0, La/y9v0;

    .line 20
    .line 21
    const/4 v1, 0x6

    .line 22
    invoke-direct {v0, v1}, La/y9v0;-><init>(B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, La/thv0;->b:La/n0o0;

    .line 30
    .line 31
    sget-object v0, La/gqw0;->j1:La/gqw0;

    .line 32
    .line 33
    sput-object v0, La/thv0;->c:La/gqw0;

    .line 34
    .line 35
    return-void
.end method

.method public static a(Landroid/content/Context;)La/w4p0;
    .locals 4

    .line 1
    sget-object v0, La/thv0;->b:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/jhv0;

    .line 8
    .line 9
    if-nez v0, :cond_5

    .line 10
    .line 11
    sget-object v0, La/auj0;->c:La/auj0;

    .line 12
    .line 13
    sget-object v0, La/auj0;->c:La/auj0;

    .line 14
    .line 15
    if-nez v0, :cond_4

    .line 16
    .line 17
    sget-object v0, La/auj0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 20
    .line 21
    .line 22
    :try_start_0
    sget-object v1, La/auj0;->c:La/auj0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    .line 24
    if-nez v1, :cond_3

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    :try_start_1
    invoke-static {}, La/xtj0;->b()La/sbu0;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object v3, La/sbu0;->f:La/sbu0;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v2, v2, La/sbu0;->e:La/n0o0;

    .line 40
    .line 41
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    check-cast v2, Ljava/math/BigInteger;

    .line 49
    .line 50
    iget-object v3, v3, La/sbu0;->e:La/n0o0;

    .line 51
    .line 52
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast v3, Ljava/math/BigInteger;

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-ltz v2, :cond_2

    .line 66
    .line 67
    new-instance v2, La/ytj0;

    .line 68
    .line 69
    invoke-direct {v2, p0}, La/ytj0;-><init>(Landroid/content/Context;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, La/ytj0;->e()Z

    .line 73
    .line 74
    .line 75
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    if-nez p0, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    move-object v1, v2

    .line 80
    :catchall_0
    :cond_2
    :goto_0
    :try_start_2
    new-instance p0, La/auj0;

    .line 81
    .line 82
    invoke-direct {p0, v1}, La/auj0;-><init>(La/ytj0;)V

    .line 83
    .line 84
    .line 85
    sput-object p0, La/auj0;->c:La/auj0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_1
    move-exception p0

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :goto_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 95
    .line 96
    .line 97
    throw p0

    .line 98
    :cond_4
    :goto_3
    sget-object v0, La/auj0;->c:La/auj0;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    :cond_5
    new-instance p0, La/w4p0;

    .line 104
    .line 105
    new-instance v1, La/njv0;

    .line 106
    .line 107
    invoke-direct {v1}, La/njv0;-><init>()V

    .line 108
    .line 109
    .line 110
    new-instance v2, La/bzs0;

    .line 111
    .line 112
    invoke-direct {v2}, La/bzs0;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-direct {p0, v1, v0, v2}, La/w4p0;-><init>(La/njv0;La/jhv0;La/bzs0;)V

    .line 116
    .line 117
    .line 118
    sget-object v0, La/thv0;->c:La/gqw0;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    return-object p0
.end method
