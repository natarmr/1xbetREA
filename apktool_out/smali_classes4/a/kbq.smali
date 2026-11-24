.class public final La/kbq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/jbq;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:D

.field public final d:J

.field public final e:D

.field public final f:J

.field public final g:I

.field public final h:J

.field public final i:D

.field public final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/jbq;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/kbq;->Companion:La/jbq;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(IJJDJDJIJDI)V
    .locals 2

    .line 1
    and-int/lit16 v0, p1, 0x3ff

    .line 2
    .line 3
    const/16 v1, 0x3ff

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p2, p0, La/kbq;->a:J

    .line 11
    .line 12
    iput-wide p4, p0, La/kbq;->b:J

    .line 13
    .line 14
    iput-wide p6, p0, La/kbq;->c:D

    .line 15
    .line 16
    iput-wide p8, p0, La/kbq;->d:J

    .line 17
    .line 18
    iput-wide p10, p0, La/kbq;->e:D

    .line 19
    .line 20
    iput-wide p12, p0, La/kbq;->f:J

    .line 21
    .line 22
    move/from16 p1, p14

    .line 23
    .line 24
    iput p1, p0, La/kbq;->g:I

    .line 25
    .line 26
    move-wide/from16 p1, p15

    .line 27
    .line 28
    iput-wide p1, p0, La/kbq;->h:J

    .line 29
    .line 30
    move-wide/from16 p1, p17

    .line 31
    .line 32
    iput-wide p1, p0, La/kbq;->i:D

    .line 33
    .line 34
    move/from16 p1, p19

    .line 35
    .line 36
    iput p1, p0, La/kbq;->j:I

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    sget-object p0, La/ibq;->a:La/ibq;

    .line 40
    .line 41
    invoke-virtual {p0}, La/ibq;->getDescriptor()La/ugi0;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    throw p0
.end method

.method public constructor <init>(JJDJDJI)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-wide p1, p0, La/kbq;->a:J

    .line 52
    iput-wide p3, p0, La/kbq;->b:J

    .line 53
    iput-wide p5, p0, La/kbq;->c:D

    .line 54
    iput-wide p7, p0, La/kbq;->d:J

    .line 55
    iput-wide p9, p0, La/kbq;->e:D

    .line 56
    iput-wide p11, p0, La/kbq;->f:J

    .line 57
    iput p13, p0, La/kbq;->g:I

    const-wide/16 p1, 0x6

    .line 58
    iput-wide p1, p0, La/kbq;->h:J

    const-wide/16 p1, 0x0

    .line 59
    iput-wide p1, p0, La/kbq;->i:D

    const/4 p1, 0x0

    .line 60
    iput p1, p0, La/kbq;->j:I

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
    instance-of v1, p1, La/kbq;

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
    check-cast p1, La/kbq;

    .line 12
    .line 13
    iget-wide v3, p0, La/kbq;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, La/kbq;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-wide v3, p0, La/kbq;->b:J

    .line 23
    .line 24
    iget-wide v5, p1, La/kbq;->b:J

    .line 25
    .line 26
    cmp-long v1, v3, v5

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-wide v3, p0, La/kbq;->c:D

    .line 32
    .line 33
    iget-wide v5, p1, La/kbq;->c:D

    .line 34
    .line 35
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-wide v3, p0, La/kbq;->d:J

    .line 43
    .line 44
    iget-wide v5, p1, La/kbq;->d:J

    .line 45
    .line 46
    cmp-long v1, v3, v5

    .line 47
    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-wide v3, p0, La/kbq;->e:D

    .line 52
    .line 53
    iget-wide v5, p1, La/kbq;->e:D

    .line 54
    .line 55
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    iget-wide v3, p0, La/kbq;->f:J

    .line 63
    .line 64
    iget-wide v5, p1, La/kbq;->f:J

    .line 65
    .line 66
    cmp-long v1, v3, v5

    .line 67
    .line 68
    if-eqz v1, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget v1, p0, La/kbq;->g:I

    .line 72
    .line 73
    iget v3, p1, La/kbq;->g:I

    .line 74
    .line 75
    if-eq v1, v3, :cond_8

    .line 76
    .line 77
    return v2

    .line 78
    :cond_8
    iget-wide v3, p0, La/kbq;->h:J

    .line 79
    .line 80
    iget-wide v5, p1, La/kbq;->h:J

    .line 81
    .line 82
    cmp-long v1, v3, v5

    .line 83
    .line 84
    if-eqz v1, :cond_9

    .line 85
    .line 86
    return v2

    .line 87
    :cond_9
    iget-wide v3, p0, La/kbq;->i:D

    .line 88
    .line 89
    iget-wide v5, p1, La/kbq;->i:D

    .line 90
    .line 91
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_a

    .line 96
    .line 97
    return v2

    .line 98
    :cond_a
    iget p0, p0, La/kbq;->j:I

    .line 99
    .line 100
    iget p1, p1, La/kbq;->j:I

    .line 101
    .line 102
    if-eq p0, p1, :cond_b

    .line 103
    .line 104
    return v2

    .line 105
    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/kbq;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-wide v2, p0, La/kbq;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/kbq;->c:D

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/kbq;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, La/kbq;->e:D

    .line 29
    .line 30
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/kbq;->f:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/kbq;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/kbq;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, La/kbq;->i:D

    .line 53
    .line 54
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget p0, p0, La/kbq;->j:I

    .line 59
    .line 60
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "FinanceBetDataRequest(seconds="

    .line 2
    .line 3
    const-string v1, ", expired="

    .line 4
    .line 5
    iget-wide v2, p0, La/kbq;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, La/kbq;->b:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", coef="

    .line 17
    .line 18
    const-string v2, ", instrumentId="

    .line 19
    .line 20
    iget-wide v3, p0, La/kbq;->c:D

    .line 21
    .line 22
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-wide v1, p0, La/kbq;->d:J

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", price="

    .line 31
    .line 32
    const-string v2, ", gameId="

    .line 33
    .line 34
    iget-wide v3, p0, La/kbq;->e:D

    .line 35
    .line 36
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", type="

    .line 40
    .line 41
    iget-wide v2, p0, La/kbq;->f:J

    .line 42
    .line 43
    iget v4, p0, La/kbq;->g:I

    .line 44
    .line 45
    invoke-static {v0, v2, v3, v1, v4}, La/ua80;->v(Ljava/lang/StringBuilder;JLjava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", kind="

    .line 49
    .line 50
    const-string v2, ", param="

    .line 51
    .line 52
    iget-wide v3, p0, La/kbq;->h:J

    .line 53
    .line 54
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v1, ", playerId="

    .line 58
    .line 59
    iget-wide v2, p0, La/kbq;->i:D

    .line 60
    .line 61
    iget p0, p0, La/kbq;->j:I

    .line 62
    .line 63
    invoke-static {v0, v2, v3, v1, p0}, La/rz4;->w(Ljava/lang/StringBuilder;DLjava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    const-string p0, ")"

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method
