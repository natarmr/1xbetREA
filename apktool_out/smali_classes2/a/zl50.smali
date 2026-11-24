.class public final La/zl50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/baa;


# instance fields
.field public final a:La/pzs0;

.field public b:Lkotlin/jvm/functions/Function0;

.field public final c:La/zl50;

.field public final d:La/hzs0;

.field public final e:La/a8z;


# direct methods
.method public synthetic constructor <init>(La/pzs0;La/zek;La/hzs0;I)V
    .locals 2

    and-int/lit8 v0, p4, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p2, v1

    :cond_0
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_1

    move-object p3, v1

    .line 30
    :cond_1
    invoke-direct {p0, p1, p2, v1, p3}, La/zl50;-><init>(La/pzs0;Lkotlin/jvm/functions/Function0;La/zl50;La/hzs0;)V

    return-void
.end method

.method public constructor <init>(La/pzs0;Lkotlin/jvm/functions/Function0;La/zl50;La/hzs0;)V
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
    iput-object p1, p0, La/zl50;->a:La/pzs0;

    .line 8
    .line 9
    iput-object p2, p0, La/zl50;->b:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    iput-object p3, p0, La/zl50;->c:La/zl50;

    .line 12
    .line 13
    iput-object p4, p0, La/zl50;->d:La/hzs0;

    .line 14
    .line 15
    sget-object p1, La/wez;->a:La/wez;

    .line 16
    .line 17
    new-instance p2, La/ej50;

    .line 18
    .line 19
    const/4 p3, 0x1

    .line 20
    invoke-direct {p2, p0, p3}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, La/zl50;->e:La/a8z;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, La/zl50;->e:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, La/iun;->a:La/iun;

    .line 12
    .line 13
    :cond_0
    return-object p0
.end method

.method public final c()La/ary;
    .locals 0

    .line 1
    iget-object p0, p0, La/zl50;->a:La/pzs0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/pzs0;->b()La/wsy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, La/vsm0;->q(La/wsy;)La/ary;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

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
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    :goto_0
    const-class v2, La/zl50;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    return v2

    .line 23
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-object v1, p1

    .line 27
    check-cast v1, La/zl50;

    .line 28
    .line 29
    iget-object v3, p0, La/zl50;->c:La/zl50;

    .line 30
    .line 31
    if-nez v3, :cond_3

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_3
    move-object p0, v3

    .line 35
    :goto_1
    iget-object v1, v1, La/zl50;->c:La/zl50;

    .line 36
    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_4
    move-object p1, v1

    .line 41
    :goto_2
    if-ne p0, p1, :cond_5

    .line 42
    .line 43
    return v0

    .line 44
    :cond_5
    return v2
.end method

.method public final f()La/pzs0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zl50;->a:La/pzs0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, La/zl50;->c:La/zl50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/zl50;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final n()La/foc;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final p()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CapturedType("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/zl50;->a:La/pzs0;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
