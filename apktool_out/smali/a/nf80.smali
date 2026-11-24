.class public final La/nf80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pf00;


# instance fields
.field public final a:La/zi80;

.field public final b:La/fvt0;

.field public c:I

.field public d:I

.field public e:I

.field public f:B

.field public g:B


# direct methods
.method public constructor <init>(La/zi80;La/zi80;La/fvt0;)V
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
    iput-object p2, p0, La/nf80;->a:La/zi80;

    .line 8
    .line 9
    iput-object p3, p0, La/nf80;->b:La/fvt0;

    .line 10
    .line 11
    iget p2, p1, La/zi80;->c:I

    .line 12
    .line 13
    iput p2, p0, La/nf80;->c:I

    .line 14
    .line 15
    iget p2, p1, La/zi80;->d:I

    .line 16
    .line 17
    iput p2, p0, La/nf80;->d:I

    .line 18
    .line 19
    iget p1, p1, La/zi80;->b:I

    .line 20
    .line 21
    iput p1, p0, La/nf80;->e:I

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-byte p1, p0, La/nf80;->f:B

    .line 25
    .line 26
    iput-byte p1, p0, La/nf80;->g:B

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final c(II)V
    .locals 4

    .line 1
    iget v0, p0, La/nf80;->e:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-object v3, p0, La/nf80;->b:La/fvt0;

    .line 6
    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-byte v0, p0, La/nf80;->g:B

    .line 11
    .line 12
    if-ne v0, v2, :cond_4

    .line 13
    .line 14
    :goto_0
    if-lez p1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iget-byte v0, p0, La/nf80;->f:B

    .line 18
    .line 19
    if-ne v0, v2, :cond_2

    .line 20
    .line 21
    :goto_1
    iget v0, p0, La/nf80;->c:I

    .line 22
    .line 23
    add-int/2addr p1, v0

    .line 24
    invoke-virtual {v3, p1, p2}, La/fvt0;->c(II)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_2
    iget p1, p0, La/nf80;->c:I

    .line 29
    .line 30
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-lez p1, :cond_3

    .line 35
    .line 36
    iput-byte v1, p0, La/nf80;->f:B

    .line 37
    .line 38
    rsub-int/lit8 v0, p1, 0x0

    .line 39
    .line 40
    iget v1, p0, La/nf80;->c:I

    .line 41
    .line 42
    add-int/2addr v0, v1

    .line 43
    sget-object v1, La/jmk;->b:La/jmk;

    .line 44
    .line 45
    invoke-virtual {v3, v0, p1, v1}, La/fvt0;->f(IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget v0, p0, La/nf80;->c:I

    .line 49
    .line 50
    sub-int/2addr v0, p1

    .line 51
    iput v0, p0, La/nf80;->c:I

    .line 52
    .line 53
    :cond_3
    sub-int p1, p2, p1

    .line 54
    .line 55
    if-lez p1, :cond_6

    .line 56
    .line 57
    iget v0, p0, La/nf80;->c:I

    .line 58
    .line 59
    invoke-virtual {v3, v0, p1}, La/fvt0;->c(II)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    iget v0, p0, La/nf80;->d:I

    .line 64
    .line 65
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-lez v0, :cond_5

    .line 70
    .line 71
    iput-byte v1, p0, La/nf80;->g:B

    .line 72
    .line 73
    iget v1, p0, La/nf80;->c:I

    .line 74
    .line 75
    add-int/2addr v1, p1

    .line 76
    sget-object v2, La/jmk;->b:La/jmk;

    .line 77
    .line 78
    invoke-virtual {v3, v1, v0, v2}, La/fvt0;->f(IILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget v1, p0, La/nf80;->d:I

    .line 82
    .line 83
    sub-int/2addr v1, v0

    .line 84
    iput v1, p0, La/nf80;->d:I

    .line 85
    .line 86
    :cond_5
    sub-int v1, p2, v0

    .line 87
    .line 88
    if-lez v1, :cond_6

    .line 89
    .line 90
    add-int/2addr p1, v0

    .line 91
    iget v0, p0, La/nf80;->c:I

    .line 92
    .line 93
    add-int/2addr p1, v0

    .line 94
    invoke-virtual {v3, p1, v1}, La/fvt0;->c(II)V

    .line 95
    .line 96
    .line 97
    :cond_6
    :goto_2
    iget p1, p0, La/nf80;->e:I

    .line 98
    .line 99
    add-int/2addr p1, p2

    .line 100
    iput p1, p0, La/nf80;->e:I

    .line 101
    .line 102
    return-void
.end method

.method public final d(II)V
    .locals 7

    .line 1
    add-int v0, p1, p2

    .line 2
    .line 3
    iget v1, p0, La/nf80;->e:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget-object v3, p0, La/nf80;->a:La/zi80;

    .line 7
    .line 8
    const/4 v4, 0x3

    .line 9
    iget-object v5, p0, La/nf80;->b:La/fvt0;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-byte v0, p0, La/nf80;->g:B

    .line 16
    .line 17
    if-ne v0, v4, :cond_5

    .line 18
    .line 19
    :goto_0
    if-lez p1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-byte v0, p0, La/nf80;->f:B

    .line 23
    .line 24
    if-ne v0, v4, :cond_2

    .line 25
    .line 26
    :goto_1
    iget v0, p0, La/nf80;->c:I

    .line 27
    .line 28
    add-int/2addr p1, v0

    .line 29
    invoke-virtual {v5, p1, p2}, La/fvt0;->d(II)V

    .line 30
    .line 31
    .line 32
    goto :goto_4

    .line 33
    :cond_2
    iget p1, v3, La/zi80;->c:I

    .line 34
    .line 35
    iget v0, p0, La/nf80;->c:I

    .line 36
    .line 37
    sub-int/2addr p1, v0

    .line 38
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-gez p1, :cond_3

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    move v6, p1

    .line 46
    :goto_2
    sub-int p1, p2, v6

    .line 47
    .line 48
    if-lez p1, :cond_4

    .line 49
    .line 50
    iget v0, p0, La/nf80;->c:I

    .line 51
    .line 52
    invoke-virtual {v5, v0, p1}, La/fvt0;->d(II)V

    .line 53
    .line 54
    .line 55
    :cond_4
    if-lez v6, :cond_8

    .line 56
    .line 57
    iput-byte v2, p0, La/nf80;->f:B

    .line 58
    .line 59
    iget p1, p0, La/nf80;->c:I

    .line 60
    .line 61
    sget-object v0, La/jmk;->a:La/jmk;

    .line 62
    .line 63
    invoke-virtual {v5, p1, v6, v0}, La/fvt0;->f(IILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget p1, p0, La/nf80;->c:I

    .line 67
    .line 68
    add-int/2addr p1, v6

    .line 69
    iput p1, p0, La/nf80;->c:I

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_5
    iget v0, v3, La/zi80;->d:I

    .line 73
    .line 74
    iget v1, p0, La/nf80;->d:I

    .line 75
    .line 76
    sub-int/2addr v0, v1

    .line 77
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-gez v0, :cond_6

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_6
    move v6, v0

    .line 85
    :goto_3
    sub-int v0, p2, v6

    .line 86
    .line 87
    if-lez v6, :cond_7

    .line 88
    .line 89
    iput-byte v2, p0, La/nf80;->g:B

    .line 90
    .line 91
    iget v1, p0, La/nf80;->c:I

    .line 92
    .line 93
    add-int/2addr v1, p1

    .line 94
    sget-object v2, La/jmk;->a:La/jmk;

    .line 95
    .line 96
    invoke-virtual {v5, v1, v6, v2}, La/fvt0;->f(IILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget v1, p0, La/nf80;->d:I

    .line 100
    .line 101
    add-int/2addr v1, v6

    .line 102
    iput v1, p0, La/nf80;->d:I

    .line 103
    .line 104
    :cond_7
    if-lez v0, :cond_8

    .line 105
    .line 106
    add-int/2addr p1, v6

    .line 107
    iget v1, p0, La/nf80;->c:I

    .line 108
    .line 109
    add-int/2addr p1, v1

    .line 110
    invoke-virtual {v5, p1, v0}, La/fvt0;->d(II)V

    .line 111
    .line 112
    .line 113
    :cond_8
    :goto_4
    iget p1, p0, La/nf80;->e:I

    .line 114
    .line 115
    sub-int/2addr p1, p2

    .line 116
    iput p1, p0, La/nf80;->e:I

    .line 117
    .line 118
    return-void
.end method

.method public final f(IILjava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, La/nf80;->c:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object p0, p0, La/nf80;->b:La/fvt0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3}, La/fvt0;->f(IILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final g(II)V
    .locals 1

    .line 1
    iget v0, p0, La/nf80;->c:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    add-int/2addr p2, v0

    .line 5
    iget-object p0, p0, La/nf80;->b:La/fvt0;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, La/fvt0;->g(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
