.class public final La/xdt0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:La/xdt0;


# instance fields
.field public a:I

.field public b:[I

.field public c:[Ljava/lang/Object;

.field public d:I

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/xdt0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [I

    .line 5
    .line 6
    new-array v3, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3, v1}, La/xdt0;-><init>(I[I[Ljava/lang/Object;Z)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/xdt0;->f:La/xdt0;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(I[I[Ljava/lang/Object;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, La/xdt0;->d:I

    .line 6
    .line 7
    iput p1, p0, La/xdt0;->a:I

    .line 8
    .line 9
    iput-object p2, p0, La/xdt0;->b:[I

    .line 10
    .line 11
    iput-object p3, p0, La/xdt0;->c:[Ljava/lang/Object;

    .line 12
    .line 13
    iput-boolean p4, p0, La/xdt0;->e:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 7

    .line 1
    iget v0, p0, La/xdt0;->d:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    iget v3, p0, La/xdt0;->a:I

    .line 11
    .line 12
    if-ge v1, v3, :cond_6

    .line 13
    .line 14
    iget-object v3, p0, La/xdt0;->b:[I

    .line 15
    .line 16
    aget v3, v3, v1

    .line 17
    .line 18
    ushr-int/lit8 v4, v3, 0x3

    .line 19
    .line 20
    and-int/lit8 v3, v3, 0x7

    .line 21
    .line 22
    if-eqz v3, :cond_5

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    if-eq v3, v5, :cond_4

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    if-eq v3, v5, :cond_3

    .line 29
    .line 30
    const/4 v6, 0x3

    .line 31
    if-eq v3, v6, :cond_2

    .line 32
    .line 33
    const/4 v5, 0x5

    .line 34
    if-ne v3, v5, :cond_1

    .line 35
    .line 36
    iget-object v3, p0, La/xdt0;->c:[Ljava/lang/Object;

    .line 37
    .line 38
    aget-object v3, v3, v1

    .line 39
    .line 40
    check-cast v3, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {v4}, La/qyc;->c(I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    add-int/lit8 v3, v3, 0x4

    .line 50
    .line 51
    :goto_1
    add-int/2addr v3, v2

    .line 52
    move v2, v3

    .line 53
    goto :goto_3

    .line 54
    :cond_1
    new-instance p0, La/wnx;

    .line 55
    .line 56
    const-string v1, "Protocol message tag had invalid wire type."

    .line 57
    .line 58
    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, La/itt0;->o(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    return v0

    .line 65
    :cond_2
    invoke-static {v4}, La/qyc;->c(I)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    mul-int/2addr v3, v5

    .line 70
    iget-object v4, p0, La/xdt0;->c:[Ljava/lang/Object;

    .line 71
    .line 72
    aget-object v4, v4, v1

    .line 73
    .line 74
    check-cast v4, La/xdt0;

    .line 75
    .line 76
    invoke-virtual {v4}, La/xdt0;->a()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    :goto_2
    add-int/2addr v4, v3

    .line 81
    add-int/2addr v4, v2

    .line 82
    move v2, v4

    .line 83
    goto :goto_3

    .line 84
    :cond_3
    iget-object v3, p0, La/xdt0;->c:[Ljava/lang/Object;

    .line 85
    .line 86
    aget-object v3, v3, v1

    .line 87
    .line 88
    check-cast v3, La/lg9;

    .line 89
    .line 90
    invoke-static {v4}, La/qyc;->c(I)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-virtual {v3}, La/lg9;->size()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-static {v3, v3, v4, v2}, La/f140;->x(IIII)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    goto :goto_3

    .line 103
    :cond_4
    iget-object v3, p0, La/xdt0;->c:[Ljava/lang/Object;

    .line 104
    .line 105
    aget-object v3, v3, v1

    .line 106
    .line 107
    check-cast v3, Ljava/lang/Long;

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {v4}, La/qyc;->c(I)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    add-int/lit8 v3, v3, 0x8

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    iget-object v3, p0, La/xdt0;->c:[Ljava/lang/Object;

    .line 120
    .line 121
    aget-object v3, v3, v1

    .line 122
    .line 123
    check-cast v3, Ljava/lang/Long;

    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 126
    .line 127
    .line 128
    move-result-wide v5

    .line 129
    invoke-static {v4}, La/qyc;->c(I)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    invoke-static {v5, v6}, La/qyc;->e(J)I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    goto :goto_2

    .line 138
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :cond_6
    iput v2, p0, La/xdt0;->d:I

    .line 143
    .line 144
    return v2
.end method

.method public final b(La/prc;)V
    .locals 7

    .line 1
    iget v0, p0, La/xdt0;->a:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, La/prc;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/qyc;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    iget v3, p0, La/xdt0;->a:I

    .line 17
    .line 18
    if-ge v2, v3, :cond_6

    .line 19
    .line 20
    iget-object v3, p0, La/xdt0;->b:[I

    .line 21
    .line 22
    aget v3, v3, v2

    .line 23
    .line 24
    iget-object v4, p0, La/xdt0;->c:[Ljava/lang/Object;

    .line 25
    .line 26
    aget-object v4, v4, v2

    .line 27
    .line 28
    ushr-int/lit8 v5, v3, 0x3

    .line 29
    .line 30
    and-int/lit8 v3, v3, 0x7

    .line 31
    .line 32
    if-eqz v3, :cond_5

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    if-eq v3, v6, :cond_4

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    if-eq v3, v6, :cond_3

    .line 39
    .line 40
    const/4 v6, 0x3

    .line 41
    if-eq v3, v6, :cond_2

    .line 42
    .line 43
    const/4 v6, 0x5

    .line 44
    if-ne v3, v6, :cond_1

    .line 45
    .line 46
    check-cast v4, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v0, v5, v6}, La/qyc;->m(II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, La/qyc;->i(I)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    new-instance p0, La/wnx;

    .line 60
    .line 61
    const-string p1, "Protocol message tag had invalid wire type."

    .line 62
    .line 63
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, La/ohq;->p(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    invoke-virtual {v0, v5, v6}, La/qyc;->m(II)V

    .line 71
    .line 72
    .line 73
    check-cast v4, La/xdt0;

    .line 74
    .line 75
    invoke-virtual {v4, p1}, La/xdt0;->b(La/prc;)V

    .line 76
    .line 77
    .line 78
    const/4 v3, 0x4

    .line 79
    invoke-virtual {v0, v5, v3}, La/qyc;->m(II)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    check-cast v4, La/lg9;

    .line 84
    .line 85
    invoke-virtual {v0, v5, v6}, La/qyc;->m(II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v4}, La/qyc;->h(La/lg9;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    check-cast v4, Ljava/lang/Long;

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v3

    .line 98
    invoke-virtual {v0, v5, v6}, La/qyc;->m(II)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v3, v4}, La/qyc;->j(J)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    check-cast v4, Ljava/lang/Long;

    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v3

    .line 111
    invoke-virtual {v0, v5, v1}, La/qyc;->m(II)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v3, v4}, La/qyc;->o(J)V

    .line 115
    .line 116
    .line 117
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_6
    :goto_2
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_1
    instance-of v1, p1, La/xdt0;

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_2
    check-cast p1, La/xdt0;

    .line 14
    .line 15
    iget v1, p0, La/xdt0;->a:I

    .line 16
    .line 17
    iget v2, p1, La/xdt0;->a:I

    .line 18
    .line 19
    if-ne v1, v2, :cond_7

    .line 20
    .line 21
    iget-object v2, p0, La/xdt0;->b:[I

    .line 22
    .line 23
    iget-object v3, p1, La/xdt0;->b:[I

    .line 24
    .line 25
    move v4, v0

    .line 26
    :goto_0
    if-ge v4, v1, :cond_4

    .line 27
    .line 28
    aget v5, v2, v4

    .line 29
    .line 30
    aget v6, v3, v4

    .line 31
    .line 32
    if-eq v5, v6, :cond_3

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    iget-object v1, p0, La/xdt0;->c:[Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p1, p1, La/xdt0;->c:[Ljava/lang/Object;

    .line 41
    .line 42
    iget p0, p0, La/xdt0;->a:I

    .line 43
    .line 44
    move v2, v0

    .line 45
    :goto_1
    if-ge v2, p0, :cond_6

    .line 46
    .line 47
    aget-object v3, v1, v2

    .line 48
    .line 49
    aget-object v4, p1, v2

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_5

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_6
    :goto_2
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_7
    :goto_3
    return v0
.end method

.method public final hashCode()I
    .locals 8

    .line 1
    iget v0, p0, La/xdt0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x20f

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    mul-int/lit8 v1, v1, 0x1f

    .line 7
    .line 8
    iget-object v2, p0, La/xdt0;->b:[I

    .line 9
    .line 10
    const/16 v3, 0x11

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    move v6, v3

    .line 14
    move v5, v4

    .line 15
    :goto_0
    if-ge v5, v0, :cond_0

    .line 16
    .line 17
    mul-int/lit8 v6, v6, 0x1f

    .line 18
    .line 19
    aget v7, v2, v5

    .line 20
    .line 21
    add-int/2addr v6, v7

    .line 22
    add-int/lit8 v5, v5, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    add-int/2addr v1, v6

    .line 26
    mul-int/lit8 v1, v1, 0x1f

    .line 27
    .line 28
    iget-object v0, p0, La/xdt0;->c:[Ljava/lang/Object;

    .line 29
    .line 30
    iget p0, p0, La/xdt0;->a:I

    .line 31
    .line 32
    :goto_1
    if-ge v4, p0, :cond_1

    .line 33
    .line 34
    mul-int/lit8 v3, v3, 0x1f

    .line 35
    .line 36
    aget-object v2, v0, v4

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-int/2addr v3, v2

    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    add-int/2addr v1, v3

    .line 47
    return v1
.end method
