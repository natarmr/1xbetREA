.class public final La/svt0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:B


# direct methods
.method public constructor <init>(La/fd40;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/fd40;->b:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p1, La/fd40;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget v0, p1, La/fd40;->a:I

    .line 22
    .line 23
    iput v0, p0, La/svt0;->a:I

    .line 24
    .line 25
    iget-object v0, p1, La/fd40;->b:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v0, p0, La/svt0;->b:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v0, p1, La/fd40;->c:Ljava/lang/String;

    .line 30
    .line 31
    iput-object v0, p0, La/svt0;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v0, p1, La/fd40;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    iput-object v0, p0, La/svt0;->d:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    iget-byte p1, p1, La/fd40;->d:B

    .line 40
    .line 41
    iput-byte p1, p0, La/svt0;->e:B

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    const-string p0, "version is null or empty"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :cond_1
    const-string p0, "method is null or empty"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

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
    const-class v1, La/svt0;

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
    goto :goto_1

    .line 21
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p1, La/svt0;

    .line 25
    .line 26
    iget-object v0, p0, La/svt0;->b:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p1, La/svt0;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    iget-object p0, p0, La/svt0;->d:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    iget-object p1, p1, La/svt0;->d:Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_4

    .line 46
    .line 47
    :goto_1
    const/4 p0, 0x0

    .line 48
    return p0

    .line 49
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 50
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, La/svt0;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, La/svt0;->d:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "VKMethodCall(method=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/svt0;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', args="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/svt0;->d:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 p0, 0x29

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
