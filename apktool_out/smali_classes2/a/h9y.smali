.class public final La/h9y;
.super La/i9y;
.source "SourceFile"


# instance fields
.field public final h:La/a8z;

.field public final i:La/a8z;

.field public final j:La/a8z;

.field public final k:La/a8z;


# direct methods
.method public constructor <init>(La/ihy;Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, La/rgy;->k:La/rgy;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, v0}, La/i9y;-><init>(La/ihy;Ljava/lang/reflect/Member;Ljava/lang/Object;La/rgy;)V

    .line 10
    .line 11
    .line 12
    sget-object p2, La/wez;->a:La/wez;

    .line 13
    .line 14
    new-instance p3, La/f9y;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p3, p0, v0}, La/f9y;-><init>(La/h9y;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p2, p3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    iput-object p3, p0, La/h9y;->h:La/a8z;

    .line 25
    .line 26
    new-instance p3, La/g9y;

    .line 27
    .line 28
    invoke-direct {p3, p1, v0}, La/g9y;-><init>(La/ihy;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p2, p3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, La/h9y;->i:La/a8z;

    .line 36
    .line 37
    new-instance p1, La/f9y;

    .line 38
    .line 39
    const/4 p3, 0x1

    .line 40
    invoke-direct {p1, p0, p3}, La/f9y;-><init>(La/h9y;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, La/h9y;->j:La/a8z;

    .line 48
    .line 49
    new-instance p1, La/f9y;

    .line 50
    .line 51
    const/4 p3, 0x2

    .line 52
    invoke-direct {p1, p0, p3}, La/f9y;-><init>(La/h9y;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, La/h9y;->k:La/a8z;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/h9y;->B()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->isVarArgs()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final B()Ljava/lang/reflect/Constructor;
    .locals 0

    .line 1
    iget-object p0, p0, La/e9y;->d:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    return-object p0
.end method

.method public final G()La/bv9;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final H(La/ihy;La/rgy;)La/dre0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, La/rgy;->k:La/rgy;

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance p2, La/h9y;

    .line 16
    .line 17
    invoke-virtual {p0}, La/h9y;->B()Ljava/lang/reflect/Constructor;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object v0, La/op9;->NO_RECEIVER:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {p2, p1, p0, v0}, La/h9y;-><init>(La/ihy;Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p2

    .line 27
    :cond_0
    const-string p1, "Constructors cannot have fake overrides: "

    .line 28
    .line 29
    invoke-static {p0, p1}, La/hny;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/h9y;->j:La/a8z;

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
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "<init>"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReturnType()La/kiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/h9y;->i:La/a8z;

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

.method public final getSignature()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/h9y;->B()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, La/azw;->J(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final isOperator()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final m()La/fm40;
    .locals 0

    .line 1
    sget-object p0, La/fm40;->b:La/fm40;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()[Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/h9y;->B()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final u()[Ljava/lang/reflect/TypeVariable;
    .locals 0

    .line 1
    iget-object p0, p0, La/h9y;->h:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [Ljava/lang/reflect/TypeVariable;

    .line 8
    .line 9
    return-object p0
.end method

.method public final x()La/bv9;
    .locals 0

    .line 1
    iget-object p0, p0, La/h9y;->k:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bv9;

    .line 8
    .line 9
    return-object p0
.end method

.method public final z()[Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/h9y;->B()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
