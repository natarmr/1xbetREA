.class public final La/j8y;
.super La/hre0;
.source "SourceFile"


# instance fields
.field public final a:La/i8y;

.field public final b:Ljava/lang/reflect/Method;

.field public final c:I

.field public final d:La/a8z;


# direct methods
.method public constructor <init>(La/i8y;Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/hre0;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/j8y;->a:La/i8y;

    .line 8
    .line 9
    iput-object p2, p0, La/j8y;->b:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    iput p3, p0, La/j8y;->c:I

    .line 12
    .line 13
    sget-object p1, La/wez;->a:La/wez;

    .line 14
    .line 15
    new-instance p2, La/aaw;

    .line 16
    .line 17
    const/16 p3, 0x8

    .line 18
    .line 19
    invoke-direct {p2, p0, p3}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, La/j8y;->d:La/a8z;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final c()La/dre0;
    .locals 0

    .line 1
    iget-object p0, p0, La/j8y;->a:La/i8y;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/j8y;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/j8y;->b:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final j()I
    .locals 0

    .line 1
    iget p0, p0, La/j8y;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()La/aiy;
    .locals 0

    .line 1
    sget-object p0, La/aiy;->d:La/aiy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()La/kiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/j8y;->d:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/kiy;

    .line 8
    .line 9
    return-object p0
.end method

.method public final q()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/j8y;->b:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final u()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, La/j8y;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "value"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, La/j8y;->b:Ljava/lang/reflect/Method;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method
