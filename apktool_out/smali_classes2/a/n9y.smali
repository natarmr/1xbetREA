.class public final La/n9y;
.super La/i9y;
.source "SourceFile"


# instance fields
.field public final h:La/a8z;

.field public final i:La/a8z;

.field public final j:La/a8z;

.field public final k:La/a8z;

.field public final l:La/a8z;

.field public final m:La/a8z;


# direct methods
.method public constructor <init>(La/ihy;Ljava/lang/reflect/Method;Ljava/lang/Object;La/rgy;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, La/i9y;-><init>(La/ihy;Ljava/lang/reflect/Member;Ljava/lang/Object;La/rgy;)V

    .line 8
    .line 9
    .line 10
    sget-object p2, La/wez;->a:La/wez;

    .line 11
    .line 12
    new-instance p3, La/l9y;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-direct {p3, p0, v0}, La/l9y;-><init>(La/n9y;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p2, p3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    iput-object p3, p0, La/n9y;->h:La/a8z;

    .line 23
    .line 24
    new-instance p3, La/nsr;

    .line 25
    .line 26
    const/16 v0, 0xf

    .line 27
    .line 28
    invoke-direct {p3, p4, p0, v0}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p2, p3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    iput-object p3, p0, La/n9y;->i:La/a8z;

    .line 36
    .line 37
    new-instance p3, La/kch;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-direct {p3, p0, p1, p4, v0}, La/kch;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p2, p3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, La/n9y;->j:La/a8z;

    .line 48
    .line 49
    new-instance v1, La/o0t;

    .line 50
    .line 51
    invoke-virtual {p0}, La/n9y;->B()Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const/4 v7, 0x1

    .line 56
    const/16 v8, 0x9

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    const-class v4, La/tke;

    .line 60
    .line 61
    const-string v5, "isJavaMethodAnOperator"

    .line 62
    .line 63
    const-string v6, "isJavaMethodAnOperator(Ljava/lang/reflect/Method;)Z"

    .line 64
    .line 65
    invoke-direct/range {v1 .. v8}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 66
    .line 67
    .line 68
    invoke-static {p2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, La/n9y;->k:La/a8z;

    .line 73
    .line 74
    new-instance p1, La/l9y;

    .line 75
    .line 76
    const/4 p3, 0x1

    .line 77
    invoke-direct {p1, p0, p3}, La/l9y;-><init>(La/n9y;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, La/n9y;->l:La/a8z;

    .line 85
    .line 86
    new-instance p1, La/l9y;

    .line 87
    .line 88
    invoke-direct {p1, p0, v0}, La/l9y;-><init>(La/n9y;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 92
    .line 93
    .line 94
    new-instance p1, La/l9y;

    .line 95
    .line 96
    const/4 p3, 0x3

    .line 97
    invoke-direct {p1, p0, p3}, La/l9y;-><init>(La/n9y;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, La/n9y;->m:La/a8z;

    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/n9y;->B()Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->isVarArgs()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final B()Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    iget-object p0, p0, La/e9y;->d:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Ljava/lang/reflect/Method;

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
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/n9y;

    .line 8
    .line 9
    invoke-virtual {p0}, La/n9y;->B()Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object v1, La/op9;->NO_RECEIVER:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0, p1, p0, v1, p2}, La/n9y;-><init>(La/ihy;Ljava/lang/reflect/Method;Ljava/lang/Object;La/rgy;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, La/n9y;->j:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/m9y;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, La/m9y;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, La/n9y;->h:La/a8z;

    .line 15
    .line 16
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/util/List;

    .line 21
    .line 22
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/e9y;->d:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

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

.method public final getReturnType()La/kiy;
    .locals 1

    .line 1
    iget-object v0, p0, La/n9y;->j:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/m9y;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, La/m9y;->b:La/v2;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, La/n9y;->i:La/a8z;

    .line 15
    .line 16
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, La/v2;

    .line 21
    .line 22
    return-object p0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/n9y;->B()Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, La/azw;->L(Ljava/lang/reflect/Method;)Ljava/lang/String;

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
    iget-object p0, p0, La/n9y;->k:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final p()[Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/n9y;->B()Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

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
    iget-object p0, p0, La/n9y;->l:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, [Ljava/lang/reflect/TypeVariable;

    .line 11
    .line 12
    return-object p0
.end method

.method public final x()La/bv9;
    .locals 0

    .line 1
    iget-object p0, p0, La/n9y;->m:La/a8z;

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
    invoke-virtual {p0}, La/n9y;->B()Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

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
