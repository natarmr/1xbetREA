.class public final La/sx2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:J

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/woq;JIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/sx2;->a:I

    .line 5
    .line 6
    iput-object p2, p0, La/sx2;->f:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p3, p0, La/sx2;->b:J

    .line 9
    .line 10
    iput p5, p0, La/sx2;->c:I

    .line 11
    .line 12
    iput p6, p0, La/sx2;->d:I

    .line 13
    .line 14
    iput p7, p0, La/sx2;->e:I

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(La/tai0;IIIIJ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, La/sx2;->f:Ljava/lang/Object;

    .line 19
    iput p2, p0, La/sx2;->a:I

    .line 20
    iput p3, p0, La/sx2;->c:I

    .line 21
    iput p4, p0, La/sx2;->d:I

    .line 22
    iput p5, p0, La/sx2;->e:I

    .line 23
    iput-wide p6, p0, La/sx2;->b:J

    return-void
.end method


# virtual methods
.method public a(La/soq;ZIIII)La/wvb;
    .locals 0

    .line 1
    iget-boolean p1, p1, La/soq;->b:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p0, p0, La/sx2;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/woq;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object p0, La/voq;->a:La/voq;

    .line 14
    .line 15
    :goto_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public b(ZIJLa/akx;IIIZZ)La/soq;
    .locals 14

    .line 1
    move/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v2, p5

    .line 4
    .line 5
    move/from16 v3, p6

    .line 6
    .line 7
    iget-object v4, p0, La/sx2;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v4, La/woq;

    .line 10
    .line 11
    add-int v7, p7, p8

    .line 12
    .line 13
    const/4 v11, 0x1

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    new-instance v0, La/soq;

    .line 17
    .line 18
    invoke-direct {v0, v11, v11}, La/soq;-><init>(ZZ)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    iget-wide v5, v2, La/akx;->a:J

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v2, La/voq;->a:La/voq;

    .line 28
    .line 29
    sget-object v2, La/voq;->a:La/voq;

    .line 30
    .line 31
    iget v2, p0, La/sx2;->c:I

    .line 32
    .line 33
    if-lt v3, v2, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-wide v8, 0xffffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long v12, p3, v8

    .line 42
    .line 43
    long-to-int v2, v12

    .line 44
    and-long v12, v5, v8

    .line 45
    .line 46
    long-to-int v4, v12

    .line 47
    sub-int/2addr v2, v4

    .line 48
    if-gez v2, :cond_2

    .line 49
    .line 50
    :goto_0
    new-instance v0, La/soq;

    .line 51
    .line 52
    invoke-direct {v0, v11, v11}, La/soq;-><init>(ZZ)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    if-nez v1, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    iget v2, p0, La/sx2;->a:I

    .line 60
    .line 61
    const/16 v4, 0x20

    .line 62
    .line 63
    if-lt v1, v2, :cond_4

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    shr-long v1, p3, v4

    .line 67
    .line 68
    long-to-int v1, v1

    .line 69
    shr-long v12, v5, v4

    .line 70
    .line 71
    long-to-int v2, v12

    .line 72
    sub-int/2addr v1, v2

    .line 73
    if-gez v1, :cond_6

    .line 74
    .line 75
    :goto_1
    if-eqz p9, :cond_5

    .line 76
    .line 77
    new-instance v0, La/soq;

    .line 78
    .line 79
    invoke-direct {v0, v11, v11}, La/soq;-><init>(ZZ)V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_5
    iget-wide v1, p0, La/sx2;->b:J

    .line 84
    .line 85
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    and-long v12, p3, v8

    .line 90
    .line 91
    long-to-int v2, v12

    .line 92
    iget v10, p0, La/sx2;->e:I

    .line 93
    .line 94
    sub-int/2addr v2, v10

    .line 95
    sub-int v2, v2, p8

    .line 96
    .line 97
    invoke-static {v1, v2}, La/akx;->a(II)J

    .line 98
    .line 99
    .line 100
    move-result-wide v1

    .line 101
    shr-long v12, v5, v4

    .line 102
    .line 103
    long-to-int v4, v12

    .line 104
    iget v10, p0, La/sx2;->d:I

    .line 105
    .line 106
    sub-int/2addr v4, v10

    .line 107
    and-long/2addr v5, v8

    .line 108
    long-to-int v5, v5

    .line 109
    invoke-static {v4, v5}, La/akx;->a(II)J

    .line 110
    .line 111
    .line 112
    move-result-wide v4

    .line 113
    new-instance v6, La/akx;

    .line 114
    .line 115
    invoke-direct {v6, v4, v5}, La/akx;-><init>(J)V

    .line 116
    .line 117
    .line 118
    add-int/2addr v3, v11

    .line 119
    const/4 v9, 0x1

    .line 120
    const/4 v10, 0x0

    .line 121
    move-object v5, v6

    .line 122
    move v6, v3

    .line 123
    move-wide v3, v1

    .line 124
    const/4 v2, 0x0

    .line 125
    const/4 v8, 0x0

    .line 126
    move-object v0, p0

    .line 127
    move v1, p1

    .line 128
    invoke-virtual/range {v0 .. v10}, La/sx2;->b(ZIJLa/akx;IIIZZ)La/soq;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-instance v1, La/soq;

    .line 133
    .line 134
    iget-boolean v0, v0, La/soq;->b:Z

    .line 135
    .line 136
    invoke-direct {v1, v11, v0}, La/soq;-><init>(ZZ)V

    .line 137
    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_6
    :goto_2
    new-instance v0, La/soq;

    .line 141
    .line 142
    const/4 v1, 0x0

    .line 143
    invoke-direct {v0, v1, v1}, La/soq;-><init>(ZZ)V

    .line 144
    .line 145
    .line 146
    return-object v0
.end method
