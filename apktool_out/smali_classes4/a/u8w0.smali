.class public final La/u8w0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/s8w0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:F

.field public final e:F

.field public final f:F

.field public final g:[F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/s8w0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/u8w0;->Companion:La/s8w0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;IFFF)V
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
    iput-object p2, p0, La/u8w0;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, p0, La/u8w0;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput p4, p0, La/u8w0;->c:I

    .line 15
    .line 16
    iput p5, p0, La/u8w0;->d:F

    .line 17
    .line 18
    iput p6, p0, La/u8w0;->e:F

    .line 19
    .line 20
    iput p7, p0, La/u8w0;->f:F

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    new-array p1, p1, [F

    .line 24
    .line 25
    iput-object p1, p0, La/u8w0;->g:[F

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    sget-object p0, La/r8w0;->b:La/zna0;

    .line 29
    .line 30
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IFFF[F)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, La/u8w0;->a:Ljava/lang/String;

    .line 37
    iput-object p2, p0, La/u8w0;->b:Ljava/lang/String;

    .line 38
    iput p3, p0, La/u8w0;->c:I

    .line 39
    iput p4, p0, La/u8w0;->d:F

    .line 40
    iput p5, p0, La/u8w0;->e:F

    .line 41
    iput p6, p0, La/u8w0;->f:F

    .line 42
    iput-object p7, p0, La/u8w0;->g:[F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 v0, 0x0

    .line 12
    :goto_0
    const-class v1, La/u8w0;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p1, La/u8w0;

    .line 25
    .line 26
    iget v0, p0, La/u8w0;->c:I

    .line 27
    .line 28
    iget v1, p1, La/u8w0;->c:I

    .line 29
    .line 30
    if-eq v0, v1, :cond_3

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_3
    iget v0, p0, La/u8w0;->d:F

    .line 34
    .line 35
    iget v1, p1, La/u8w0;->d:F

    .line 36
    .line 37
    cmpg-float v0, v0, v1

    .line 38
    .line 39
    if-nez v0, :cond_7

    .line 40
    .line 41
    iget v0, p0, La/u8w0;->e:F

    .line 42
    .line 43
    iget v1, p1, La/u8w0;->e:F

    .line 44
    .line 45
    cmpg-float v0, v0, v1

    .line 46
    .line 47
    if-nez v0, :cond_7

    .line 48
    .line 49
    iget v0, p0, La/u8w0;->f:F

    .line 50
    .line 51
    iget v1, p1, La/u8w0;->f:F

    .line 52
    .line 53
    cmpg-float v0, v0, v1

    .line 54
    .line 55
    if-nez v0, :cond_7

    .line 56
    .line 57
    iget-object v0, p0, La/u8w0;->a:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, p1, La/u8w0;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    iget-object v0, p0, La/u8w0;->b:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v1, p1, La/u8w0;->b:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_5

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_5
    iget-object p0, p0, La/u8w0;->g:[F

    .line 80
    .line 81
    iget-object p1, p1, La/u8w0;->g:[F

    .line 82
    .line 83
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([F[F)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-nez p0, :cond_6

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 91
    return p0

    .line 92
    :cond_7
    :goto_2
    const/4 p0, 0x0

    .line 93
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/u8w0;->c:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    mul-int/2addr v0, v1

    .line 6
    iget v2, p0, La/u8w0;->d:F

    .line 7
    .line 8
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v2, p0, La/u8w0;->e:F

    .line 13
    .line 14
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v2, p0, La/u8w0;->f:F

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/u8w0;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/u8w0;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object p0, p0, La/u8w0;->g:[F

    .line 37
    .line 38
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([F)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    add-int/2addr p0, v0

    .line 43
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SensorData(name="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/u8w0;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", vendor="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/u8w0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", version="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, La/u8w0;->c:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", power="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, La/u8w0;->d:F

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", maxRange="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v1, p0, La/u8w0;->e:F

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", resolution="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, La/u8w0;->f:F

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", values="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, La/u8w0;->g:[F

    .line 69
    .line 70
    invoke-static {p0}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const/16 p0, 0x29

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method
