.class public La/zhi0;
.super Ljava/io/IOException;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final a:I

.field public final b:I

.field public c:La/kuw;

.field public final d:La/uhi0;

.field public final e:Z

.field public final f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 112
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 113
    sget-object v0, La/ujn;->n:La/juw;

    .line 114
    iput-object v0, p0, La/zhi0;->c:La/kuw;

    const/4 v0, 0x1

    .line 115
    iput-boolean v0, p0, La/zhi0;->e:Z

    return-void
.end method

.method public constructor <init>(La/uhi0;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    iget-object v0, p1, La/uhi0;->b:Ljava/lang/String;

    .line 100
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 101
    sget-object v0, La/ujn;->n:La/juw;

    .line 102
    iput-object v0, p0, La/zhi0;->c:La/kuw;

    const/4 v1, 0x1

    .line 103
    iput-boolean v1, p0, La/zhi0;->e:Z

    .line 104
    iput-object p1, p0, La/zhi0;->d:La/uhi0;

    .line 105
    iget-object v1, p1, La/uhi0;->g:La/w0o;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 106
    iget-object v3, v1, La/w0o;->b:La/i2o;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_1

    move-object v0, v3

    .line 107
    :cond_1
    iput-object v0, p0, La/zhi0;->c:La/kuw;

    if-eqz v1, :cond_2

    .line 108
    iget-object v2, v1, La/w0o;->a:Ljava/lang/Integer;

    :cond_2
    const/4 v0, 0x0

    if-eqz v2, :cond_3

    .line 109
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_3
    move v1, v0

    :goto_1
    iput v1, p0, La/zhi0;->b:I

    .line 110
    iget-object p1, p1, La/uhi0;->c:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    .line 111
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_4
    iput v0, p0, La/zhi0;->a:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 117
    sget-object p1, La/ujn;->n:La/juw;

    .line 118
    iput-object p1, p0, La/zhi0;->c:La/kuw;

    const/4 p1, 0x1

    .line 119
    iput-boolean p1, p0, La/zhi0;->e:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILa/uhi0;Ljava/lang/Integer;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, La/ujn;->n:La/juw;

    .line 8
    .line 9
    iput-object p1, p0, La/zhi0;->c:La/kuw;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, La/zhi0;->e:Z

    .line 13
    .line 14
    iput-object p3, p0, La/zhi0;->d:La/uhi0;

    .line 15
    .line 16
    sget-object v0, La/i2o;->Companion:La/h2o;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {p2}, La/h2o;->a(I)La/kuw;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/zhi0;->c:La/kuw;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz p4, :cond_1

    .line 29
    .line 30
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    sget-object v2, La/pnm0;->c:Lkotlin/ranges/IntRange;

    .line 35
    .line 36
    iget v3, v2, Lkotlin/ranges/a;->a:I

    .line 37
    .line 38
    iget v2, v2, Lkotlin/ranges/a;->b:I

    .line 39
    .line 40
    if-gt v1, v2, :cond_0

    .line 41
    .line 42
    if-gt v3, v1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v1, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    move v1, p1

    .line 48
    :goto_1
    iput-boolean v1, p0, La/zhi0;->e:Z

    .line 49
    .line 50
    if-eqz p4, :cond_2

    .line 51
    .line 52
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    move v1, v0

    .line 58
    :goto_2
    iput v1, p0, La/zhi0;->a:I

    .line 59
    .line 60
    if-eqz p3, :cond_4

    .line 61
    .line 62
    iget-object p3, p3, La/uhi0;->g:La/w0o;

    .line 63
    .line 64
    if-eqz p3, :cond_3

    .line 65
    .line 66
    iget-object p3, p3, La/w0o;->a:Ljava/lang/Integer;

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    const/4 p3, 0x0

    .line 70
    :goto_3
    if-eqz p3, :cond_4

    .line 71
    .line 72
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    :cond_4
    iput p2, p0, La/zhi0;->b:I

    .line 77
    .line 78
    if-eqz p4, :cond_5

    .line 79
    .line 80
    sget-object p2, La/pnm0;->b:Lkotlin/ranges/IntRange;

    .line 81
    .line 82
    iget p3, p2, Lkotlin/ranges/a;->a:I

    .line 83
    .line 84
    iget p2, p2, Lkotlin/ranges/a;->b:I

    .line 85
    .line 86
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p4

    .line 90
    if-gt p3, p4, :cond_5

    .line 91
    .line 92
    if-gt p4, p2, :cond_5

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    move p1, v0

    .line 96
    :goto_4
    iput-boolean p1, p0, La/zhi0;->f:Z

    .line 97
    .line 98
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Integer;I)V
    .locals 1

    and-int/lit8 p4, p4, 0x8

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p3, v0

    .line 120
    :cond_0
    invoke-direct {p0, p1, p2, v0, p3}, La/zhi0;-><init>(Ljava/lang/String;ILa/uhi0;Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;La/kuw;Ljava/lang/Integer;I)V
    .locals 2

    and-int/lit8 p4, p4, 0x8

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p3, v0

    .line 121
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 123
    sget-object p1, La/ujn;->n:La/juw;

    .line 124
    iput-object p1, p0, La/zhi0;->c:La/kuw;

    const/4 p4, 0x1

    .line 125
    iput-boolean p4, p0, La/zhi0;->e:Z

    .line 126
    iput-object v0, p0, La/zhi0;->d:La/uhi0;

    if-nez p2, :cond_1

    move-object p2, p1

    .line 127
    :cond_1
    iput-object p2, p0, La/zhi0;->c:La/kuw;

    const/4 p1, 0x0

    if-eqz p3, :cond_3

    .line 128
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 129
    sget-object v0, La/pnm0;->c:Lkotlin/ranges/IntRange;

    .line 130
    iget v1, v0, Lkotlin/ranges/a;->a:I

    .line 131
    iget v0, v0, Lkotlin/ranges/a;->b:I

    if-gt p2, v0, :cond_2

    if-gt v1, p2, :cond_2

    goto :goto_0

    :cond_2
    move p2, p1

    goto :goto_1

    :cond_3
    :goto_0
    move p2, p4

    .line 132
    :goto_1
    iput-boolean p2, p0, La/zhi0;->e:Z

    if-eqz p3, :cond_4

    .line 133
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_2

    :cond_4
    move p2, p1

    :goto_2
    iput p2, p0, La/zhi0;->a:I

    .line 134
    iput p1, p0, La/zhi0;->b:I

    if-eqz p3, :cond_5

    .line 135
    sget-object p2, La/pnm0;->b:Lkotlin/ranges/IntRange;

    .line 136
    iget v0, p2, Lkotlin/ranges/a;->a:I

    .line 137
    iget p2, p2, Lkotlin/ranges/a;->b:I

    .line 138
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    if-gt v0, p3, :cond_5

    if-gt p3, p2, :cond_5

    goto :goto_3

    :cond_5
    move p4, p1

    .line 139
    :goto_3
    iput-boolean p4, p0, La/zhi0;->f:Z

    return-void
.end method
