.class public final La/ps60;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/os60;

.field public static final g:[La/a8z;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/os60;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ps60;->Companion:La/os60;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/fq60;

    .line 11
    .line 12
    const/4 v2, 0x4

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
    const/4 v1, 0x6

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
    aput-object v4, v1, v2

    .line 37
    .line 38
    const/4 v2, 0x5

    .line 39
    aput-object v0, v1, v2

    .line 40
    .line 41
    sput-object v1, La/ps60;->g:[La/a8z;

    .line 42
    .line 43
    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;IIILjava/util/Set;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x3f

    .line 2
    .line 3
    const/16 v1, 0x3f

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput p2, p0, La/ps60;->a:I

    .line 11
    .line 12
    iput-object p3, p0, La/ps60;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput p4, p0, La/ps60;->c:I

    .line 15
    .line 16
    iput p5, p0, La/ps60;->d:I

    .line 17
    .line 18
    iput p6, p0, La/ps60;->e:I

    .line 19
    .line 20
    iput-object p7, p0, La/ps60;->f:Ljava/util/Set;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object p0, La/ns60;->a:La/ns60;

    .line 24
    .line 25
    invoke-virtual {p0}, La/ns60;->getDescriptor()La/ugi0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/Set;)V
    .locals 1

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x16

    .line 35
    iput v0, p0, La/ps60;->a:I

    .line 36
    iput-object p1, p0, La/ps60;->b:Ljava/lang/String;

    const/4 p1, 0x1

    .line 37
    iput p1, p0, La/ps60;->c:I

    const/16 p1, 0x54d

    .line 38
    iput p1, p0, La/ps60;->d:I

    .line 39
    iput p2, p0, La/ps60;->e:I

    .line 40
    iput-object p3, p0, La/ps60;->f:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/ps60;

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
    check-cast p1, La/ps60;

    .line 12
    .line 13
    iget v1, p0, La/ps60;->a:I

    .line 14
    .line 15
    iget v3, p1, La/ps60;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, La/ps60;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p1, La/ps60;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget v1, p0, La/ps60;->c:I

    .line 32
    .line 33
    iget v3, p1, La/ps60;->c:I

    .line 34
    .line 35
    if-eq v1, v3, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    iget v1, p0, La/ps60;->d:I

    .line 39
    .line 40
    iget v3, p1, La/ps60;->d:I

    .line 41
    .line 42
    if-eq v1, v3, :cond_5

    .line 43
    .line 44
    return v2

    .line 45
    :cond_5
    iget v1, p0, La/ps60;->e:I

    .line 46
    .line 47
    iget v3, p1, La/ps60;->e:I

    .line 48
    .line 49
    if-eq v1, v3, :cond_6

    .line 50
    .line 51
    return v2

    .line 52
    :cond_6
    iget-object p0, p0, La/ps60;->f:Ljava/util/Set;

    .line 53
    .line 54
    iget-object p1, p1, La/ps60;->f:Ljava/util/Set;

    .line 55
    .line 56
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_7

    .line 61
    .line 62
    return v2

    .line 63
    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/ps60;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-object v2, p0, La/ps60;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/ps60;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/ps60;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/ps60;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object p0, p0, La/ps60;->f:Ljava/util/Set;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", language="

    .line 2
    .line 3
    const-string v1, ", refId="

    .line 4
    .line 5
    iget v2, p0, La/ps60;->a:I

    .line 6
    .line 7
    const-string v3, "OneXGamesByGameIdsNotAuthRequest(whence="

    .line 8
    .line 9
    iget-object v4, p0, La/ps60;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", groupId="

    .line 16
    .line 17
    const-string v2, ", countryId="

    .line 18
    .line 19
    iget v3, p0, La/ps60;->c:I

    .line 20
    .line 21
    iget v4, p0, La/ps60;->d:I

    .line 22
    .line 23
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, La/ps60;->e:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", gameIdSet="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, La/ps60;->f:Ljava/util/Set;

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p0, ")"

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
