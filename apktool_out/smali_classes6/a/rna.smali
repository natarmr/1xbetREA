.class public final La/rna;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/rna;

.field public static final d:La/rna;


# instance fields
.field public final a:B

.field public final b:B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/rna;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, La/rna;-><init>(II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/rna;->c:La/rna;

    .line 10
    .line 11
    new-instance v0, La/rna;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v0, v1, v2}, La/rna;-><init>(II)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/rna;->d:La/rna;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, La/rna;->a:B

    .line 5
    .line 6
    iput-byte p2, p0, La/rna;->b:B

    .line 7
    .line 8
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
    instance-of v0, p1, La/rna;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/rna;

    .line 10
    .line 11
    iget-byte v0, p0, La/rna;->a:B

    .line 12
    .line 13
    iget-byte v1, p1, La/rna;->a:B

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-byte p0, p0, La/rna;->b:B

    .line 19
    .line 20
    iget-byte p1, p1, La/rna;->b:B

    .line 21
    .line 22
    if-eq p0, p1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    const p0, 0x3f666666    # 0.9f

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p0}, Ljava/lang/Float;->compare(FF)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_4

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_4
    const p0, 0x3e99999a    # 0.3f

    .line 36
    .line 37
    .line 38
    invoke-static {p0, p0}, Ljava/lang/Float;->compare(FF)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_5

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_5
    const/high16 p0, 0x41a00000    # 20.0f

    .line 46
    .line 47
    invoke-static {p0, p0}, Ljava/lang/Float;->compare(FF)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_6

    .line 52
    .line 53
    :goto_0
    const/4 p0, 0x0

    .line 54
    return p0

    .line 55
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 56
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-byte v0, p0, La/rna;->a:B

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
    iget-byte p0, p0, La/rna;->b:B

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const v0, 0x3f666666    # 0.9f

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0, v1}, Lc;->a(IFI)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const v0, 0x3e99999a    # 0.3f

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1}, Lc;->a(IFI)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const/high16 v0, 0x41a00000    # 20.0f

    .line 31
    .line 32
    invoke-static {p0, v0, v1}, Lc;->a(IFI)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    const v0, 0x7f080d34

    .line 37
    .line 38
    .line 39
    invoke-static {v0, p0, v1}, La/twn;->a(III)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    const v0, 0x7f080484

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    add-int/2addr v0, p0

    .line 51
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ", topDeckMargin="

    .line 2
    .line 3
    const-string v1, ", scaleInterval=0.9, swipeThreshold=0.3, maxRotationDegree=20.0, acceptGradient="

    .line 4
    .line 5
    const-string v2, "CardStackSetting(visibleCount="

    .line 6
    .line 7
    iget-byte v3, p0, La/rna;->a:B

    .line 8
    .line 9
    iget-byte p0, p0, La/rna;->b:B

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, p0}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, ", declineGradient="

    .line 16
    .line 17
    const-string v1, ")"

    .line 18
    .line 19
    const v2, 0x7f080d34

    .line 20
    .line 21
    .line 22
    const v3, 0x7f080484

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3, v0, v1, p0}, La/w6x;->o(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
