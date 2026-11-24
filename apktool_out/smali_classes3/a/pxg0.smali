.class public final La/pxg0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/oxg0;

.field public static final p:[La/a8z;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/List;

.field public final f:I

.field public final g:I

.field public final h:J

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:D

.field public final m:Z

.field public final n:Ljava/util/List;

.field public final o:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/oxg0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/pxg0;->Companion:La/oxg0;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/j6g0;

    .line 11
    .line 12
    const/16 v2, 0x16

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/j6g0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, La/j6g0;

    .line 22
    .line 23
    const/16 v3, 0x17

    .line 24
    .line 25
    invoke-direct {v2, v3}, La/j6g0;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, La/j6g0;

    .line 33
    .line 34
    const/16 v4, 0x18

    .line 35
    .line 36
    invoke-direct {v3, v4}, La/j6g0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/16 v3, 0xf

    .line 44
    .line 45
    new-array v3, v3, [La/a8z;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    aput-object v5, v3, v4

    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    aput-object v5, v3, v4

    .line 53
    .line 54
    const/4 v4, 0x2

    .line 55
    aput-object v5, v3, v4

    .line 56
    .line 57
    const/4 v4, 0x3

    .line 58
    aput-object v5, v3, v4

    .line 59
    .line 60
    const/4 v4, 0x4

    .line 61
    aput-object v1, v3, v4

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    aput-object v5, v3, v1

    .line 65
    .line 66
    const/4 v1, 0x6

    .line 67
    aput-object v5, v3, v1

    .line 68
    .line 69
    const/4 v1, 0x7

    .line 70
    aput-object v5, v3, v1

    .line 71
    .line 72
    const/16 v1, 0x8

    .line 73
    .line 74
    aput-object v5, v3, v1

    .line 75
    .line 76
    const/16 v1, 0x9

    .line 77
    .line 78
    aput-object v5, v3, v1

    .line 79
    .line 80
    const/16 v1, 0xa

    .line 81
    .line 82
    aput-object v5, v3, v1

    .line 83
    .line 84
    const/16 v1, 0xb

    .line 85
    .line 86
    aput-object v5, v3, v1

    .line 87
    .line 88
    const/16 v1, 0xc

    .line 89
    .line 90
    aput-object v5, v3, v1

    .line 91
    .line 92
    const/16 v1, 0xd

    .line 93
    .line 94
    aput-object v2, v3, v1

    .line 95
    .line 96
    const/16 v1, 0xe

    .line 97
    .line 98
    aput-object v0, v3, v1

    .line 99
    .line 100
    sput-object v3, La/pxg0;->p:[La/a8z;

    .line 101
    .line 102
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;IIJIIIDZLjava/util/List;Ljava/util/List;)V
    .locals 2

    .line 1
    and-int/lit16 v0, p1, 0x7fff

    .line 2
    .line 3
    const/16 v1, 0x7fff

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/pxg0;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p3, p0, La/pxg0;->b:J

    .line 13
    .line 14
    iput-object p5, p0, La/pxg0;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p6, p0, La/pxg0;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p7, p0, La/pxg0;->e:Ljava/util/List;

    .line 19
    .line 20
    iput p8, p0, La/pxg0;->f:I

    .line 21
    .line 22
    iput p9, p0, La/pxg0;->g:I

    .line 23
    .line 24
    iput-wide p10, p0, La/pxg0;->h:J

    .line 25
    .line 26
    iput p12, p0, La/pxg0;->i:I

    .line 27
    .line 28
    iput p13, p0, La/pxg0;->j:I

    .line 29
    .line 30
    move/from16 p1, p14

    .line 31
    .line 32
    iput p1, p0, La/pxg0;->k:I

    .line 33
    .line 34
    move-wide/from16 p1, p15

    .line 35
    .line 36
    iput-wide p1, p0, La/pxg0;->l:D

    .line 37
    .line 38
    move/from16 p1, p17

    .line 39
    .line 40
    iput-boolean p1, p0, La/pxg0;->m:Z

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, La/pxg0;->n:Ljava/util/List;

    .line 45
    .line 46
    move-object/from16 p1, p19

    .line 47
    .line 48
    iput-object p1, p0, La/pxg0;->o:Ljava/util/List;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    sget-object p0, La/nxg0;->a:La/nxg0;

    .line 52
    .line 53
    invoke-virtual {p0}, La/nxg0;->getDescriptor()La/ugi0;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;JIIIDZLjava/util/List;La/iun;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, La/pxg0;->a:Ljava/lang/String;

    .line 64
    iput-wide p2, p0, La/pxg0;->b:J

    .line 65
    iput-object p4, p0, La/pxg0;->c:Ljava/lang/String;

    .line 66
    iput-object p5, p0, La/pxg0;->d:Ljava/lang/String;

    .line 67
    iput-object p6, p0, La/pxg0;->e:Ljava/util/List;

    const/4 p1, 0x1

    .line 68
    iput p1, p0, La/pxg0;->f:I

    const/16 p1, 0x16

    .line 69
    iput p1, p0, La/pxg0;->g:I

    .line 70
    iput-wide p7, p0, La/pxg0;->h:J

    .line 71
    iput p9, p0, La/pxg0;->i:I

    .line 72
    iput p10, p0, La/pxg0;->j:I

    .line 73
    iput p11, p0, La/pxg0;->k:I

    .line 74
    iput-wide p12, p0, La/pxg0;->l:D

    .line 75
    iput-boolean p14, p0, La/pxg0;->m:Z

    .line 76
    iput-object p15, p0, La/pxg0;->n:Ljava/util/List;

    move-object/from16 p1, p16

    .line 77
    iput-object p1, p0, La/pxg0;->o:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/pxg0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/pxg0;

    .line 12
    .line 13
    iget-object v1, p0, La/pxg0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, La/pxg0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-wide v3, p0, La/pxg0;->b:J

    .line 25
    .line 26
    iget-wide v5, p1, La/pxg0;->b:J

    .line 27
    .line 28
    cmp-long v1, v3, v5

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-object v1, p0, La/pxg0;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, La/pxg0;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object v1, p0, La/pxg0;->d:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v3, p1, La/pxg0;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    iget-object v1, p0, La/pxg0;->e:Ljava/util/List;

    .line 56
    .line 57
    iget-object v3, p1, La/pxg0;->e:Ljava/util/List;

    .line 58
    .line 59
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_6

    .line 64
    .line 65
    return v2

    .line 66
    :cond_6
    iget v1, p0, La/pxg0;->f:I

    .line 67
    .line 68
    iget v3, p1, La/pxg0;->f:I

    .line 69
    .line 70
    if-eq v1, v3, :cond_7

    .line 71
    .line 72
    return v2

    .line 73
    :cond_7
    iget v1, p0, La/pxg0;->g:I

    .line 74
    .line 75
    iget v3, p1, La/pxg0;->g:I

    .line 76
    .line 77
    if-eq v1, v3, :cond_8

    .line 78
    .line 79
    return v2

    .line 80
    :cond_8
    iget-wide v3, p0, La/pxg0;->h:J

    .line 81
    .line 82
    iget-wide v5, p1, La/pxg0;->h:J

    .line 83
    .line 84
    cmp-long v1, v3, v5

    .line 85
    .line 86
    if-eqz v1, :cond_9

    .line 87
    .line 88
    return v2

    .line 89
    :cond_9
    iget v1, p0, La/pxg0;->i:I

    .line 90
    .line 91
    iget v3, p1, La/pxg0;->i:I

    .line 92
    .line 93
    if-eq v1, v3, :cond_a

    .line 94
    .line 95
    return v2

    .line 96
    :cond_a
    iget v1, p0, La/pxg0;->j:I

    .line 97
    .line 98
    iget v3, p1, La/pxg0;->j:I

    .line 99
    .line 100
    if-eq v1, v3, :cond_b

    .line 101
    .line 102
    return v2

    .line 103
    :cond_b
    iget v1, p0, La/pxg0;->k:I

    .line 104
    .line 105
    iget v3, p1, La/pxg0;->k:I

    .line 106
    .line 107
    if-eq v1, v3, :cond_c

    .line 108
    .line 109
    return v2

    .line 110
    :cond_c
    iget-wide v3, p0, La/pxg0;->l:D

    .line 111
    .line 112
    iget-wide v5, p1, La/pxg0;->l:D

    .line 113
    .line 114
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_d

    .line 119
    .line 120
    return v2

    .line 121
    :cond_d
    iget-boolean v1, p0, La/pxg0;->m:Z

    .line 122
    .line 123
    iget-boolean v3, p1, La/pxg0;->m:Z

    .line 124
    .line 125
    if-eq v1, v3, :cond_e

    .line 126
    .line 127
    return v2

    .line 128
    :cond_e
    iget-object v1, p0, La/pxg0;->n:Ljava/util/List;

    .line 129
    .line 130
    iget-object v3, p1, La/pxg0;->n:Ljava/util/List;

    .line 131
    .line 132
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_f

    .line 137
    .line 138
    return v2

    .line 139
    :cond_f
    iget-object p0, p0, La/pxg0;->o:Ljava/util/List;

    .line 140
    .line 141
    iget-object p1, p1, La/pxg0;->o:Ljava/util/List;

    .line 142
    .line 143
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-nez p0, :cond_10

    .line 148
    .line 149
    return v2

    .line 150
    :cond_10
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/pxg0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-wide v2, p0, La/pxg0;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/pxg0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/pxg0;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/pxg0;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/pxg0;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/pxg0;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/pxg0;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, La/pxg0;->i:I

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, La/pxg0;->j:I

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, La/pxg0;->k:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-wide v2, p0, La/pxg0;->l:D

    .line 71
    .line 72
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean v2, p0, La/pxg0;->m:Z

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, La/pxg0;->n:Ljava/util/List;

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object p0, p0, La/pxg0;->o:Ljava/util/List;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    add-int/2addr p0, v0

    .line 95
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "SaveBetsRequest(betId="

    .line 2
    .line 3
    const-string v1, ", userId="

    .line 4
    .line 5
    iget-wide v2, p0, La/pxg0;->b:J

    .line 6
    .line 7
    iget-object v4, p0, La/pxg0;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v4, v1}, La/f140;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", appGuid="

    .line 14
    .line 15
    const-string v2, ", lng="

    .line 16
    .line 17
    iget-object v3, p0, La/pxg0;->c:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v4, p0, La/pxg0;->d:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", events="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, La/pxg0;->e:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", partner="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget v1, p0, La/pxg0;->f:I

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", source="

    .line 45
    .line 46
    const-string v2, ", expressNum="

    .line 47
    .line 48
    iget v3, p0, La/pxg0;->g:I

    .line 49
    .line 50
    invoke-static {v0, v1, v3, v2}, La/rw2;->x(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v1, ", vid="

    .line 54
    .line 55
    iget-wide v2, p0, La/pxg0;->h:J

    .line 56
    .line 57
    iget v4, p0, La/pxg0;->i:I

    .line 58
    .line 59
    invoke-static {v0, v2, v3, v1, v4}, La/ua80;->v(Ljava/lang/StringBuilder;JLjava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    const-string v1, ", cfView="

    .line 63
    .line 64
    const-string v2, ", checkCf="

    .line 65
    .line 66
    iget v3, p0, La/pxg0;->j:I

    .line 67
    .line 68
    iget v4, p0, La/pxg0;->k:I

    .line 69
    .line 70
    invoke-static {v3, v4, v1, v2, v0}, La/rw2;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 71
    .line 72
    .line 73
    const-string v1, ", antiExpressCoef="

    .line 74
    .line 75
    const-string v2, ", withLobby="

    .line 76
    .line 77
    iget-wide v3, p0, La/pxg0;->l:D

    .line 78
    .line 79
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v1, ", eventsIndexes="

    .line 83
    .line 84
    const-string v2, ", minBetSystems="

    .line 85
    .line 86
    iget-object v3, p0, La/pxg0;->n:Ljava/util/List;

    .line 87
    .line 88
    iget-boolean v4, p0, La/pxg0;->m:Z

    .line 89
    .line 90
    invoke-static {v0, v1, v3, v2, v4}, La/vqd;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    const-string v1, ")"

    .line 94
    .line 95
    iget-object p0, p0, La/pxg0;->o:Ljava/util/List;

    .line 96
    .line 97
    invoke-static {v0, p0, v1}, La/dw9;->r(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method
