.class public final La/jew0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfw0;


# instance fields
.field public final a:La/mew0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/bew0;->b:La/bew0;

    .line 2
    .line 3
    sget v0, La/ldw0;->a:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(La/mew0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jew0;->a:La/mew0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/io/InputStream;La/bew0;)La/mew0;
    .locals 2

    .line 1
    const/16 v0, 0x1000

    .line 2
    .line 3
    invoke-static {p1, v0}, La/tdw0;->h(Ljava/io/InputStream;I)La/tdw0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget v0, La/mew0;->zzd:I

    .line 8
    .line 9
    iget-object p0, p0, La/jew0;->a:La/mew0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/mew0;->g()La/mew0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :try_start_0
    sget-object v0, La/agw0;->c:La/agw0;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, La/agw0;->a(Ljava/lang/Class;)La/egw0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p1, La/tdw0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, La/hu5;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v1, La/hu5;

    .line 33
    .line 34
    invoke-direct {v1, p1}, La/hu5;-><init>(La/tdw0;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-interface {v0, p0, v1, p2}, La/egw0;->e(Ljava/lang/Object;La/hu5;La/bew0;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, p0}, La/egw0;->h(Ljava/lang/Object;)V
    :try_end_0
    .catch La/zew0; {:try_start_0 .. :try_end_0} :catch_3
    .catch La/igw0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    invoke-virtual {p1, p2}, La/tdw0;->r(I)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    invoke-static {p0, p1}, La/mew0;->o(La/mew0;Z)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    new-instance p0, La/igw0;

    .line 56
    .line 57
    invoke-direct {p0}, La/igw0;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, La/igw0;->a()La/zew0;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    throw p0

    .line 65
    :catch_0
    move-exception p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    instance-of p1, p1, La/zew0;

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, La/zew0;

    .line 79
    .line 80
    throw p0

    .line 81
    :cond_2
    throw p0

    .line 82
    :catch_1
    move-exception p0

    .line 83
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    instance-of p1, p1, La/zew0;

    .line 88
    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, La/zew0;

    .line 96
    .line 97
    throw p0

    .line 98
    :cond_3
    new-instance p1, La/zew0;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :catch_2
    move-exception p0

    .line 109
    invoke-virtual {p0}, La/igw0;->a()La/zew0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    throw p0

    .line 114
    :catch_3
    move-exception p0

    .line 115
    iget-boolean p1, p0, La/zew0;->a:Z

    .line 116
    .line 117
    if-eqz p1, :cond_4

    .line 118
    .line 119
    new-instance p1, La/zew0;

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    throw p1

    .line 129
    :cond_4
    throw p0
.end method
