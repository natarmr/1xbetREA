.class public final La/pxm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sxm;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:La/jwm;

.field public final d:La/jwm;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;La/jwm;La/jwm;)V
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
    iput-object p1, p0, La/pxm;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, La/pxm;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, La/pxm;->c:La/jwm;

    .line 15
    .line 16
    iput-object p4, p0, La/pxm;->d:La/jwm;

    .line 17
    .line 18
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
    instance-of v0, p1, La/pxm;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/pxm;

    .line 10
    .line 11
    iget-object v0, p0, La/pxm;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/pxm;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/pxm;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/pxm;->b:Ljava/lang/String;

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
    iget-object v0, p0, La/pxm;->c:La/jwm;

    .line 34
    .line 35
    iget-object v1, p1, La/pxm;->c:La/jwm;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/jwm;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, La/pxm;->d:La/jwm;

    .line 45
    .line 46
    iget-object p1, p1, La/pxm;->d:La/jwm;

    .line 47
    .line 48
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    :goto_0
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 57
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/pxm;->a:Ljava/lang/String;

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
    iget-object v1, p0, La/pxm;->b:Ljava/lang/String;

    .line 10
    .line 11
    const/16 v2, 0x1f

    .line 12
    .line 13
    invoke-static {v0, v2, v1}, La/ua80;->b(IILjava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, La/pxm;->c:La/jwm;

    .line 18
    .line 19
    invoke-static {v1, v0, v2}, La/b1j;->d(La/jwm;II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object p0, p0, La/pxm;->d:La/jwm;

    .line 24
    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, La/jwm;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    :goto_0
    add-int/2addr v0, p0

    .line 34
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", opponentIcon=null, topInfoLabel="

    .line 2
    .line 3
    const-string v1, ", twoLabelInfo="

    .line 4
    .line 5
    const-string v2, "V2(opponentName="

    .line 6
    .line 7
    iget-object v3, p0, La/pxm;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/pxm;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", threeLabelInfo="

    .line 16
    .line 17
    const-string v2, ")"

    .line 18
    .line 19
    iget-object v3, p0, La/pxm;->c:La/jwm;

    .line 20
    .line 21
    iget-object p0, p0, La/pxm;->d:La/jwm;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, p0, v2}, La/b1j;->l(Ljava/lang/StringBuilder;La/jwm;Ljava/lang/String;La/jwm;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
