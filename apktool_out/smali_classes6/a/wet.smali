.class public final La/wet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/vet;

.field public static final f:[La/a8z;


# instance fields
.field public final a:J

.field public final b:Ljava/util/List;

.field public final c:I

.field public final d:I

.field public final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/vet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/wet;->Companion:La/vet;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/tet;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v2}, La/tet;-><init>(B)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x5

    .line 21
    new-array v1, v1, [La/a8z;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    aput-object v3, v1, v2

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    aput-object v0, v1, v2

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    aput-object v3, v1, v0

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    aput-object v3, v1, v0

    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    aput-object v3, v1, v0

    .line 37
    .line 38
    sput-object v1, La/wet;->f:[La/a8z;

    .line 39
    .line 40
    return-void
.end method

.method public synthetic constructor <init>(IIIJLjava/lang/String;Ljava/util/List;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x1d

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ne v1, v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p4, p0, La/wet;->a:J

    .line 11
    .line 12
    and-int/lit8 p1, p1, 0x2

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, La/wet;->b:Ljava/util/List;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-object p7, p0, La/wet;->b:Ljava/util/List;

    .line 29
    .line 30
    :goto_0
    iput p2, p0, La/wet;->c:I

    .line 31
    .line 32
    iput p3, p0, La/wet;->d:I

    .line 33
    .line 34
    iput-object p6, p0, La/wet;->e:Ljava/lang/String;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    sget-object p0, La/uet;->a:La/uet;

    .line 38
    .line 39
    invoke-virtual {p0}, La/uet;->getDescriptor()La/ugi0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    throw p0
.end method

.method public constructor <init>(IJLjava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-wide p2, p0, La/wet;->a:J

    .line 50
    iput-object p5, p0, La/wet;->b:Ljava/util/List;

    .line 51
    iput p1, p0, La/wet;->c:I

    const/16 p1, 0x16

    .line 52
    iput p1, p0, La/wet;->d:I

    .line 53
    iput-object p4, p0, La/wet;->e:Ljava/lang/String;

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
    instance-of v1, p1, La/wet;

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
    check-cast p1, La/wet;

    .line 12
    .line 13
    iget-wide v3, p0, La/wet;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, La/wet;->a:J

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
    iget-object v1, p0, La/wet;->b:Ljava/util/List;

    .line 23
    .line 24
    iget-object v3, p1, La/wet;->b:Ljava/util/List;

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
    iget v1, p0, La/wet;->c:I

    .line 34
    .line 35
    iget v3, p1, La/wet;->c:I

    .line 36
    .line 37
    if-eq v1, v3, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget v1, p0, La/wet;->d:I

    .line 41
    .line 42
    iget v3, p1, La/wet;->d:I

    .line 43
    .line 44
    if-eq v1, v3, :cond_5

    .line 45
    .line 46
    return v2

    .line 47
    :cond_5
    iget-object p0, p0, La/wet;->e:Ljava/lang/String;

    .line 48
    .line 49
    iget-object p1, p1, La/wet;->e:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_6

    .line 56
    .line 57
    return v2

    .line 58
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, La/wet;->a:J

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
    iget-object v2, p0, La/wet;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/wet;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/wet;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, La/wet;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "GemsOdysseyActionRequest(userId="

    .line 2
    .line 3
    const-string v1, ", userChoice="

    .line 4
    .line 5
    iget-wide v2, p0, La/wet;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/wet;->b:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/cs0;->p(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", actionStep="

    .line 14
    .line 15
    const-string v2, ", whence="

    .line 16
    .line 17
    iget v3, p0, La/wet;->c:I

    .line 18
    .line 19
    iget v4, p0, La/wet;->d:I

    .line 20
    .line 21
    invoke-static {v3, v4, v1, v2, v0}, La/rw2;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", lng="

    .line 25
    .line 26
    const-string v2, ")"

    .line 27
    .line 28
    iget-object p0, p0, La/wet;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, p0, v2}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
