.class public final La/vs60;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/us60;

.field public static final h:[La/a8z;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/us60;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/vs60;->Companion:La/us60;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/fq60;

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    invoke-direct {v1, v2}, La/fq60;-><init>(B)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x7

    .line 21
    new-array v1, v1, [La/a8z;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    aput-object v4, v1, v3

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    aput-object v4, v1, v3

    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    aput-object v4, v1, v3

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    aput-object v4, v1, v3

    .line 35
    .line 36
    const/4 v3, 0x4

    .line 37
    aput-object v4, v1, v3

    .line 38
    .line 39
    const/4 v3, 0x5

    .line 40
    aput-object v4, v1, v3

    .line 41
    .line 42
    aput-object v0, v1, v2

    .line 43
    .line 44
    sput-object v1, La/vs60;->h:[La/a8z;

    .line 45
    .line 46
    return-void
.end method

.method public synthetic constructor <init>(IJILjava/lang/String;IIILjava/util/Set;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x7f

    .line 2
    .line 3
    const/16 v1, 0x7f

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p2, p0, La/vs60;->a:J

    .line 11
    .line 12
    iput p4, p0, La/vs60;->b:I

    .line 13
    .line 14
    iput-object p5, p0, La/vs60;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput p6, p0, La/vs60;->d:I

    .line 17
    .line 18
    iput p7, p0, La/vs60;->e:I

    .line 19
    .line 20
    iput p8, p0, La/vs60;->f:I

    .line 21
    .line 22
    iput-object p9, p0, La/vs60;->g:Ljava/util/Set;

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object p0, La/ts60;->a:La/ts60;

    .line 26
    .line 27
    invoke-virtual {p0}, La/ts60;->getDescriptor()La/ugi0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    throw p0
.end method

.method public constructor <init>(JLjava/lang/String;ILjava/util/Set;)V
    .locals 0

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-wide p1, p0, La/vs60;->a:J

    const/16 p1, 0x16

    .line 38
    iput p1, p0, La/vs60;->b:I

    .line 39
    iput-object p3, p0, La/vs60;->c:Ljava/lang/String;

    const/4 p1, 0x1

    .line 40
    iput p1, p0, La/vs60;->d:I

    const/16 p1, 0x54d

    .line 41
    iput p1, p0, La/vs60;->e:I

    .line 42
    iput p4, p0, La/vs60;->f:I

    .line 43
    iput-object p5, p0, La/vs60;->g:Ljava/util/Set;

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
    instance-of v1, p1, La/vs60;

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
    check-cast p1, La/vs60;

    .line 12
    .line 13
    iget-wide v3, p0, La/vs60;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, La/vs60;->a:J

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
    iget v1, p0, La/vs60;->b:I

    .line 23
    .line 24
    iget v3, p1, La/vs60;->b:I

    .line 25
    .line 26
    if-eq v1, v3, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    iget-object v1, p0, La/vs60;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p1, La/vs60;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget v1, p0, La/vs60;->d:I

    .line 41
    .line 42
    iget v3, p1, La/vs60;->d:I

    .line 43
    .line 44
    if-eq v1, v3, :cond_5

    .line 45
    .line 46
    return v2

    .line 47
    :cond_5
    iget v1, p0, La/vs60;->e:I

    .line 48
    .line 49
    iget v3, p1, La/vs60;->e:I

    .line 50
    .line 51
    if-eq v1, v3, :cond_6

    .line 52
    .line 53
    return v2

    .line 54
    :cond_6
    iget v1, p0, La/vs60;->f:I

    .line 55
    .line 56
    iget v3, p1, La/vs60;->f:I

    .line 57
    .line 58
    if-eq v1, v3, :cond_7

    .line 59
    .line 60
    return v2

    .line 61
    :cond_7
    iget-object p0, p0, La/vs60;->g:Ljava/util/Set;

    .line 62
    .line 63
    iget-object p1, p1, La/vs60;->g:Ljava/util/Set;

    .line 64
    .line 65
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_8

    .line 70
    .line 71
    return v2

    .line 72
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, La/vs60;->a:J

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
    iget v2, p0, La/vs60;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/vs60;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/vs60;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/vs60;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/vs60;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object p0, p0, La/vs60;->g:Ljava/util/Set;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "OneXGamesByGameIdsRequestOld(userId="

    .line 2
    .line 3
    const-string v1, ", whence="

    .line 4
    .line 5
    iget v2, p0, La/vs60;->b:I

    .line 6
    .line 7
    iget-wide v3, p0, La/vs60;->a:J

    .line 8
    .line 9
    invoke-static {v2, v3, v4, v0, v1}, La/brm0;->q(IJLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", language="

    .line 14
    .line 15
    const-string v2, ", refId="

    .line 16
    .line 17
    iget v3, p0, La/vs60;->d:I

    .line 18
    .line 19
    iget-object v4, p0, La/vs60;->c:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v3, v1, v4, v2, v0}, La/axq;->s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", groupId="

    .line 25
    .line 26
    const-string v2, ", countryId="

    .line 27
    .line 28
    iget v3, p0, La/vs60;->e:I

    .line 29
    .line 30
    iget v4, p0, La/vs60;->f:I

    .line 31
    .line 32
    invoke-static {v3, v4, v1, v2, v0}, La/rw2;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 33
    .line 34
    .line 35
    const-string v1, ", gameIdSet="

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/vs60;->g:Ljava/util/Set;

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, ")"

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method
