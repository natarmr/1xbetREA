.class public final La/asf0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/zrf0;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Double;

.field public final d:J

.field public final e:La/bg8;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/zrf0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/asf0;->Companion:La/zrf0;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/Double;JLa/bg8;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0xb

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xb

    .line 5
    .line 6
    if-ne v2, v0, :cond_2

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput p2, p0, La/asf0;->a:I

    .line 12
    .line 13
    iput-object p3, p0, La/asf0;->b:Ljava/lang/String;

    .line 14
    .line 15
    and-int/lit8 p2, p1, 0x4

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, La/asf0;->c:Ljava/lang/Double;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput-object p4, p0, La/asf0;->c:Ljava/lang/Double;

    .line 23
    .line 24
    :goto_0
    iput-wide p5, p0, La/asf0;->d:J

    .line 25
    .line 26
    and-int/lit8 p1, p1, 0x10

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    iput-object v1, p0, La/asf0;->e:La/bg8;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iput-object p7, p0, La/asf0;->e:La/bg8;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    sget-object p0, La/yrf0;->a:La/yrf0;

    .line 37
    .line 38
    invoke-virtual {p0}, La/yrf0;->getDescriptor()La/ugi0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p1, v2, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 43
    .line 44
    .line 45
    throw v1
.end method

.method public constructor <init>(JLa/bg8;Ljava/lang/Double;Ljava/lang/String;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x16

    .line 47
    iput v0, p0, La/asf0;->a:I

    .line 48
    iput-object p5, p0, La/asf0;->b:Ljava/lang/String;

    .line 49
    iput-object p4, p0, La/asf0;->c:Ljava/lang/Double;

    .line 50
    iput-wide p1, p0, La/asf0;->d:J

    .line 51
    iput-object p3, p0, La/asf0;->e:La/bg8;

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
    instance-of v1, p1, La/asf0;

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
    check-cast p1, La/asf0;

    .line 12
    .line 13
    iget v1, p0, La/asf0;->a:I

    .line 14
    .line 15
    iget v3, p1, La/asf0;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, La/asf0;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p1, La/asf0;->b:Ljava/lang/String;

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
    iget-object v1, p0, La/asf0;->c:Ljava/lang/Double;

    .line 32
    .line 33
    iget-object v3, p1, La/asf0;->c:Ljava/lang/Double;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-wide v3, p0, La/asf0;->d:J

    .line 43
    .line 44
    iget-wide v5, p1, La/asf0;->d:J

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
    iget-object p0, p0, La/asf0;->e:La/bg8;

    .line 52
    .line 53
    iget-object p1, p1, La/asf0;->e:La/bg8;

    .line 54
    .line 55
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget v0, p0, La/asf0;->a:I

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
    iget-object v2, p0, La/asf0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object v3, p0, La/asf0;->c:Ljava/lang/Double;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    move v3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    :goto_0
    add-int/2addr v0, v3

    .line 28
    mul-int/2addr v0, v1

    .line 29
    iget-wide v3, p0, La/asf0;->d:J

    .line 30
    .line 31
    invoke-static {v0, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object p0, p0, La/asf0;->e:La/bg8;

    .line 36
    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {p0}, La/bg8;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    :goto_1
    add-int/2addr v0, v2

    .line 45
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", lng="

    .line 2
    .line 3
    const-string v1, ", bet="

    .line 4
    .line 5
    iget v2, p0, La/asf0;->a:I

    .line 6
    .line 7
    const-string v3, "ResidentStartGameRequest(whence="

    .line 8
    .line 9
    iget-object v4, p0, La/asf0;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/asf0;->c:Ljava/lang/Double;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", walletId="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-wide v1, p0, La/asf0;->d:J

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", bonusRequest="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, La/asf0;->e:La/bg8;

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, ")"

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
