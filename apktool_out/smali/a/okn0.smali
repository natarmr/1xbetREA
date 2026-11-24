.class public final La/okn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qpg0;


# instance fields
.field public final a:La/w7r;


# direct methods
.method public constructor <init>(La/w7r;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/okn0;->a:La/w7r;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final bridge synthetic Z0(Ljava/lang/String;)La/xpg0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/okn0;->a(Ljava/lang/String;)La/bln0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final a(Ljava/lang/String;)La/bln0;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/okn0;->a:La/w7r;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x3

    .line 22
    if-ge v1, v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const v3, 0x1367f

    .line 44
    .line 45
    .line 46
    if-eq v2, v3, :cond_3

    .line 47
    .line 48
    const v3, 0x1403a

    .line 49
    .line 50
    .line 51
    if-eq v2, v3, :cond_2

    .line 52
    .line 53
    const v3, 0x14fc2

    .line 54
    .line 55
    .line 56
    if-eq v2, v3, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const-string v2, "WIT"

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const-string v2, "SEL"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    const-string v2, "PRA"

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    :cond_4
    new-instance v0, La/zkn0;

    .line 86
    .line 87
    const/4 v2, 0x1

    .line 88
    invoke-direct {v0, p0, p1, v2}, La/bln0;-><init>(La/w7r;Ljava/lang/String;B)V

    .line 89
    .line 90
    .line 91
    new-array p0, v1, [I

    .line 92
    .line 93
    iput-object p0, v0, La/zkn0;->e:[I

    .line 94
    .line 95
    new-array p0, v1, [J

    .line 96
    .line 97
    iput-object p0, v0, La/zkn0;->f:[J

    .line 98
    .line 99
    new-array p0, v1, [D

    .line 100
    .line 101
    iput-object p0, v0, La/zkn0;->g:[D

    .line 102
    .line 103
    new-array p0, v1, [Ljava/lang/String;

    .line 104
    .line 105
    iput-object p0, v0, La/zkn0;->h:[Ljava/lang/String;

    .line 106
    .line 107
    new-array p0, v1, [[B

    .line 108
    .line 109
    iput-object p0, v0, La/zkn0;->i:[[B

    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_5
    :goto_0
    new-instance v0, La/aln0;

    .line 113
    .line 114
    invoke-direct {v0, p0, p1}, La/aln0;-><init>(La/w7r;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, La/okn0;->a:La/w7r;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
