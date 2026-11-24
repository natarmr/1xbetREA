.class public final La/mxl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/fxl;

.field public final c:La/kxl;

.field public final d:La/zwl;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;La/fxl;La/kxl;La/zwl;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/mxl;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, La/mxl;->b:La/fxl;

    .line 13
    .line 14
    iput-object p3, p0, La/mxl;->c:La/kxl;

    .line 15
    .line 16
    iput-object p4, p0, La/mxl;->d:La/zwl;

    .line 17
    .line 18
    iput-boolean p5, p0, La/mxl;->e:Z

    .line 19
    .line 20
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;La/fxl;ZI)V
    .locals 6

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 21
    sget-object p2, La/exl;->a:La/exl;

    :cond_0
    move-object v2, p2

    .line 22
    sget-object v3, La/jxl;->a:La/jxl;

    .line 23
    sget-object v4, La/xwl;->a:La/xwl;

    move-object v0, p0

    move-object v1, p1

    move v5, p3

    .line 24
    invoke-direct/range {v0 .. v5}, La/mxl;-><init>(Ljava/lang/String;La/fxl;La/kxl;La/zwl;Z)V

    return-void
.end method

.method public static a(La/mxl;Z)La/mxl;
    .locals 6

    .line 1
    iget-object v1, p0, La/mxl;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v2, p0, La/mxl;->b:La/fxl;

    .line 4
    .line 5
    iget-object v3, p0, La/mxl;->c:La/kxl;

    .line 6
    .line 7
    iget-object v4, p0, La/mxl;->d:La/zwl;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v0, La/mxl;

    .line 22
    .line 23
    move v5, p1

    .line 24
    invoke-direct/range {v0 .. v5}, La/mxl;-><init>(Ljava/lang/String;La/fxl;La/kxl;La/zwl;Z)V

    .line 25
    .line 26
    .line 27
    return-object v0
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
    instance-of v0, p1, La/mxl;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/mxl;

    .line 10
    .line 11
    iget-object v0, p0, La/mxl;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/mxl;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/mxl;->b:La/fxl;

    .line 23
    .line 24
    iget-object v1, p1, La/mxl;->b:La/fxl;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, La/mxl;->c:La/kxl;

    .line 34
    .line 35
    iget-object v1, p1, La/mxl;->c:La/kxl;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, La/mxl;->d:La/zwl;

    .line 45
    .line 46
    iget-object v1, p1, La/mxl;->d:La/zwl;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-boolean p0, p0, La/mxl;->e:Z

    .line 56
    .line 57
    iget-boolean p1, p1, La/mxl;->e:Z

    .line 58
    .line 59
    if-eq p0, p1, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    const/4 p0, 0x0

    .line 63
    invoke-static {p0, p0}, Ljava/lang/Float;->compare(FF)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_7
    invoke-static {p0, p0}, Ljava/lang/Float;->compare(FF)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_8

    .line 75
    .line 76
    :goto_0
    const/4 p0, 0x0

    .line 77
    return p0

    .line 78
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 79
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/mxl;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit16 v0, v0, 0x3c1

    .line 8
    .line 9
    iget-object v1, p0, La/mxl;->b:La/fxl;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    const/16 v0, 0x1f

    .line 17
    .line 18
    mul-int/2addr v1, v0

    .line 19
    iget-object v2, p0, La/mxl;->c:La/kxl;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v2, v1

    .line 26
    mul-int/2addr v2, v0

    .line 27
    iget-object v1, p0, La/mxl;->d:La/zwl;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v2

    .line 34
    const v2, 0xe1781

    .line 35
    .line 36
    .line 37
    mul-int/2addr v1, v2

    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-static {v1, v0, v2}, La/brm0;->e(IIZ)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/16 v3, 0x745f

    .line 44
    .line 45
    invoke-static {v1, v3, v2}, La/brm0;->e(IIZ)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget-boolean p0, p0, La/mxl;->e:Z

    .line 50
    .line 51
    const v2, 0x34e63b41

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2, p0}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-static {p0, v1, v0}, Lc;->a(IFI)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    add-int/2addr v0, p0

    .line 68
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DsChipModel(text="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/mxl;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", valueText=null, leftIcon="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/mxl;->b:La/fxl;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", rightIcon="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/mxl;->c:La/kxl;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", iconTint="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/mxl;->d:La/zwl;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", backgroundActiveColor=null, textActiveColor=null, textMaxLines=null, unlimitedLines=false, disable=false, counter=null, badge=null, selected="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", backgroundDisabledColor=null, textDisabledColor=null, valueDisabledColor=null, leftIconDisabledTint=null, rightIconDisabledTint=null, leftIconRadius=0.0, rightIconRadius=0.0)"

    .line 49
    .line 50
    iget-boolean p0, p0, La/mxl;->e:Z

    .line 51
    .line 52
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method
