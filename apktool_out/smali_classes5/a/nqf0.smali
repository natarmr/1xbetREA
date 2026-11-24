.class public final La/nqf0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/mqf0;


# instance fields
.field public final a:Ljava/lang/Double;

.field public final b:La/bg8;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/mqf0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/nqf0;->Companion:La/mqf0;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Double;La/bg8;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x1c

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x1c

    .line 5
    .line 6
    if-ne v2, v0, :cond_2

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, p1, 0x1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iput-object v1, p0, La/nqf0;->a:Ljava/lang/Double;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-object p2, p0, La/nqf0;->a:Ljava/lang/Double;

    .line 19
    .line 20
    :goto_0
    and-int/lit8 p1, p1, 0x2

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    iput-object v1, p0, La/nqf0;->b:La/bg8;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iput-object p3, p0, La/nqf0;->b:La/bg8;

    .line 28
    .line 29
    :goto_1
    iput-object p4, p0, La/nqf0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p5, p0, La/nqf0;->d:Ljava/lang/String;

    .line 32
    .line 33
    iput p6, p0, La/nqf0;->e:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    sget-object p0, La/lqf0;->a:La/lqf0;

    .line 37
    .line 38
    invoke-virtual {p0}, La/lqf0;->getDescriptor()La/ugi0;

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

.method public constructor <init>(Ljava/lang/Double;La/bg8;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, La/nqf0;->a:Ljava/lang/Double;

    .line 48
    iput-object p2, p0, La/nqf0;->b:La/bg8;

    .line 49
    iput-object p3, p0, La/nqf0;->c:Ljava/lang/String;

    .line 50
    iput-object p4, p0, La/nqf0;->d:Ljava/lang/String;

    const/16 p1, 0x16

    .line 51
    iput p1, p0, La/nqf0;->e:I

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
    instance-of v1, p1, La/nqf0;

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
    check-cast p1, La/nqf0;

    .line 12
    .line 13
    iget-object v1, p0, La/nqf0;->a:Ljava/lang/Double;

    .line 14
    .line 15
    iget-object v3, p1, La/nqf0;->a:Ljava/lang/Double;

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
    iget-object v1, p0, La/nqf0;->b:La/bg8;

    .line 25
    .line 26
    iget-object v3, p1, La/nqf0;->b:La/bg8;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, La/nqf0;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, La/nqf0;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, La/nqf0;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, La/nqf0;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget p0, p0, La/nqf0;->e:I

    .line 58
    .line 59
    iget p1, p1, La/nqf0;->e:I

    .line 60
    .line 61
    if-eq p0, p1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/nqf0;->a:Ljava/lang/Double;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-object v3, p0, La/nqf0;->b:La/bg8;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v3}, La/bg8;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_1
    add-int/2addr v1, v0

    .line 25
    mul-int/2addr v1, v2

    .line 26
    iget-object v0, p0, La/nqf0;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v2, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v1, p0, La/nqf0;->d:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v2, v1}, La/ua80;->b(IILjava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget p0, p0, La/nqf0;->e:I

    .line 39
    .line 40
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/2addr p0, v0

    .line 45
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ResidentIncreaseBetRequest(bet="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/nqf0;->a:Ljava/lang/Double;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
    iget-object v1, p0, La/nqf0;->b:La/bg8;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", gameId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", lng="

    .line 29
    .line 30
    const-string v2, ", whence="

    .line 31
    .line 32
    iget-object v3, p0, La/nqf0;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, La/nqf0;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ")"

    .line 40
    .line 41
    iget p0, p0, La/nqf0;->e:I

    .line 42
    .line 43
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
