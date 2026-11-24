.class public final La/p7r;
.super La/c2;
.source "SourceFile"

# interfaces
.implements La/ue80;


# instance fields
.field public final synthetic c:La/s7r;


# direct methods
.method public constructor <init>(La/s7r;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/p7r;->c:La/s7r;

    .line 2
    .line 3
    const/4 p1, 0x7

    .line 4
    invoke-direct {p0, p1}, La/c2;-><init>(B)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/c2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/odd;

    .line 4
    .line 5
    new-instance v1, La/bf80;

    .line 6
    .line 7
    invoke-direct {v1, p1}, La/bf80;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, La/pby;->N(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/p7r;->c:La/s7r;

    .line 14
    .line 15
    iget-object p1, p0, La/s7r;->f:La/c14;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p1, La/c14;->a:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, La/r7r;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    if-ne v2, v3, :cond_1

    .line 30
    .line 31
    sget-object v1, La/r7r;->d:La/r7r;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v2, "Unexpected frame state for "

    .line 39
    .line 40
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p0, "! State is "

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const/16 p0, 0x20

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_2
    sget-object v1, La/r7r;->b:La/r7r;

    .line 68
    .line 69
    :goto_0
    invoke-virtual {p1, v0, v1}, La/c14;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_0

    .line 74
    .line 75
    iget-object p1, p0, La/s7r;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    sget-object p1, La/r7r;->d:La/r7r;

    .line 91
    .line 92
    if-ne v1, p1, :cond_4

    .line 93
    .line 94
    iget-object p0, p0, La/s7r;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_3

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    invoke-static {p0}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    throw p0

    .line 115
    :cond_4
    :goto_1
    return-void

    .line 116
    :cond_5
    invoke-static {p1}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    throw p0
.end method
