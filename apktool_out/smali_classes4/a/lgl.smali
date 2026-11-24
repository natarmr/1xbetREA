.class public final La/lgl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/kgl;

.field public static final h:[La/a8z;


# instance fields
.field public final a:J

.field public final b:La/bg8;

.field public final c:J

.field public final d:Ljava/lang/Double;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/kgl;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/lgl;->Companion:La/kgl;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/xal;

    .line 11
    .line 12
    const/16 v2, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/xal;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x7

    .line 22
    new-array v1, v1, [La/a8z;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v3, v1, v2

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    aput-object v3, v1, v2

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    aput-object v3, v1, v2

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    aput-object v3, v1, v2

    .line 36
    .line 37
    const/4 v2, 0x4

    .line 38
    aput-object v3, v1, v2

    .line 39
    .line 40
    const/4 v2, 0x5

    .line 41
    aput-object v3, v1, v2

    .line 42
    .line 43
    const/4 v2, 0x6

    .line 44
    aput-object v0, v1, v2

    .line 45
    .line 46
    sput-object v1, La/lgl;->h:[La/a8z;

    .line 47
    .line 48
    return-void
.end method

.method public synthetic constructor <init>(IJLa/bg8;JLjava/lang/Double;ILjava/lang/String;Ljava/util/List;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x75

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x75

    .line 5
    .line 6
    if-ne v2, v0, :cond_2

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-wide p2, p0, La/lgl;->a:J

    .line 12
    .line 13
    and-int/lit8 p2, p1, 0x2

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    iput-object v1, p0, La/lgl;->b:La/bg8;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iput-object p4, p0, La/lgl;->b:La/bg8;

    .line 21
    .line 22
    :goto_0
    iput-wide p5, p0, La/lgl;->c:J

    .line 23
    .line 24
    and-int/lit8 p1, p1, 0x8

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iput-object v1, p0, La/lgl;->d:Ljava/lang/Double;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iput-object p7, p0, La/lgl;->d:Ljava/lang/Double;

    .line 32
    .line 33
    :goto_1
    iput p8, p0, La/lgl;->e:I

    .line 34
    .line 35
    iput-object p9, p0, La/lgl;->f:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p10, p0, La/lgl;->g:Ljava/util/List;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    sget-object p0, La/jgl;->a:La/jgl;

    .line 41
    .line 42
    invoke-virtual {p0}, La/jgl;->getDescriptor()La/ugi0;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p1, v2, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 47
    .line 48
    .line 49
    throw v1
.end method

.method public constructor <init>(JLa/bg8;JLjava/lang/Double;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-wide p1, p0, La/lgl;->a:J

    .line 52
    iput-object p3, p0, La/lgl;->b:La/bg8;

    .line 53
    iput-wide p4, p0, La/lgl;->c:J

    .line 54
    iput-object p6, p0, La/lgl;->d:Ljava/lang/Double;

    const/16 p1, 0x16

    .line 55
    iput p1, p0, La/lgl;->e:I

    .line 56
    iput-object p7, p0, La/lgl;->f:Ljava/lang/String;

    .line 57
    iput-object p8, p0, La/lgl;->g:Ljava/util/List;

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
    instance-of v1, p1, La/lgl;

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
    check-cast p1, La/lgl;

    .line 12
    .line 13
    iget-wide v3, p0, La/lgl;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, La/lgl;->a:J

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
    iget-object v1, p0, La/lgl;->b:La/bg8;

    .line 23
    .line 24
    iget-object v3, p1, La/lgl;->b:La/bg8;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-wide v3, p0, La/lgl;->c:J

    .line 34
    .line 35
    iget-wide v5, p1, La/lgl;->c:J

    .line 36
    .line 37
    cmp-long v1, v3, v5

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, La/lgl;->d:Ljava/lang/Double;

    .line 43
    .line 44
    iget-object v3, p1, La/lgl;->d:Ljava/lang/Double;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget v1, p0, La/lgl;->e:I

    .line 54
    .line 55
    iget v3, p1, La/lgl;->e:I

    .line 56
    .line 57
    if-eq v1, v3, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-object v1, p0, La/lgl;->f:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v3, p1, La/lgl;->f:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object p0, p0, La/lgl;->g:Ljava/util/List;

    .line 72
    .line 73
    iget-object p1, p1, La/lgl;->g:Ljava/util/List;

    .line 74
    .line 75
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-nez p0, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-wide v0, p0, La/lgl;->a:J

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, La/lgl;->b:La/bg8;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v3}, La/bg8;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_0
    add-int/2addr v0, v3

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget-wide v3, p0, La/lgl;->c:J

    .line 24
    .line 25
    invoke-static {v0, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v3, p0, La/lgl;->d:Ljava/lang/Double;

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    :goto_1
    add-int/2addr v0, v2

    .line 39
    mul-int/2addr v0, v1

    .line 40
    iget v2, p0, La/lgl;->e:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/lgl;->f:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object p0, p0, La/lgl;->g:Ljava/util/List;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    add-int/2addr p0, v0

    .line 59
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DragonsGoldRequest(userId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, La/lgl;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", bonusRequest="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/lgl;->b:La/bg8;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", walletId="

    .line 24
    .line 25
    const-string v2, ", betSum="

    .line 26
    .line 27
    iget-wide v3, p0, La/lgl;->c:J

    .line 28
    .line 29
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, La/lgl;->d:Ljava/lang/Double;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", whence="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget v1, p0, La/lgl;->e:I

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", lng="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", gameType="

    .line 53
    .line 54
    const-string v2, ")"

    .line 55
    .line 56
    iget-object v3, p0, La/lgl;->f:Ljava/lang/String;

    .line 57
    .line 58
    iget-object p0, p0, La/lgl;->g:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v3, v1, v2, v0, p0}, La/rw2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
