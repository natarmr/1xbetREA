.class public final La/lss0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nss0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/lss0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/lss0;->b:Ljava/lang/String;

    .line 10
    .line 11
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
    instance-of v0, p1, La/lss0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/lss0;

    .line 10
    .line 11
    iget-object v0, p0, La/lss0;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/lss0;->a:Ljava/lang/String;

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
    iget-object p0, p0, La/lss0;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object p1, p1, La/lss0;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const v0, 0x7f080f5f

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    mul-int/2addr v0, v1

    .line 11
    const v2, 0x7f080f60

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, La/lss0;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object p0, p0, La/lss0;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v0

    .line 31
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", scoreImage="

    .line 2
    .line 3
    const-string v1, ", amount="

    .line 4
    .line 5
    const-string v2, "Content(backImage="

    .line 6
    .line 7
    const v3, 0x7f080f5f

    .line 8
    .line 9
    .line 10
    const v4, 0x7f080f60

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v3, v0, v1, v4}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, ", currency="

    .line 18
    .line 19
    const-string v2, ")"

    .line 20
    .line 21
    iget-object v3, p0, La/lss0;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p0, p0, La/lss0;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v3, v1, p0, v2}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
