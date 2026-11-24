.class public final La/b9y;
.super La/ere0;
.source "SourceFile"

# interfaces
.implements La/eiy;
.implements La/ire0;


# static fields
.field public static final h:Ljava/lang/reflect/Method;


# instance fields
.field public final c:La/xgy;

.field public final d:La/a0o;

.field public final e:La/a8z;

.field public final f:La/a9y;

.field public final g:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    sget-object v0, La/xtt0;->a:La/swq;

    .line 2
    .line 3
    const-class v0, Lkotlin/Unit;

    .line 4
    .line 5
    invoke-static {v0}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "kotlin.enums.EnumEntriesKt"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    array-length v1, v0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    move v4, v3

    .line 26
    :goto_0
    if-ge v3, v1, :cond_2

    .line 27
    .line 28
    aget-object v5, v0, v3

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const-string v7, "enumEntries"

    .line 35
    .line 36
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v6}, La/tx3;->X([Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    check-cast v6, Ljava/lang/Class;

    .line 54
    .line 55
    if-eqz v6, :cond_1

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_1

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    const-class v7, Ljava/lang/Enum;

    .line 68
    .line 69
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_1

    .line 74
    .line 75
    if-nez v4, :cond_0

    .line 76
    .line 77
    const/4 v2, 0x1

    .line 78
    move v4, v2

    .line 79
    move-object v2, v5

    .line 80
    goto :goto_1

    .line 81
    :cond_0
    const-string v0, "Array contains more than one matching element."

    .line 82
    .line 83
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    if-eqz v4, :cond_3

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    sput-object v2, La/b9y;->h:Ljava/lang/reflect/Method;

    .line 96
    .line 97
    return-void

    .line 98
    :cond_3
    const-string v0, "Array contains no element matching the predicate."

    .line 99
    .line 100
    invoke-static {v0}, La/v4i0;->o(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public constructor <init>(La/xgy;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/rgy;->k:La/rgy;

    .line 5
    .line 6
    invoke-direct {p0, v0}, La/ere0;-><init>(La/rgy;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/b9y;->c:La/xgy;

    .line 10
    .line 11
    invoke-static {p1}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object v0, La/b9y;->h:Ljava/lang/reflect/Method;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast p1, La/a0o;

    .line 34
    .line 35
    iput-object p1, p0, La/b9y;->d:La/a0o;

    .line 36
    .line 37
    sget-object p1, La/wez;->a:La/wez;

    .line 38
    .line 39
    new-instance v0, La/y8y;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {v0, p0, v1}, La/y8y;-><init>(La/b9y;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, La/b9y;->e:La/a8z;

    .line 50
    .line 51
    new-instance v0, La/a9y;

    .line 52
    .line 53
    invoke-direct {v0, p0}, La/a9y;-><init>(La/b9y;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, La/b9y;->f:La/a9y;

    .line 57
    .line 58
    new-instance v0, La/y8y;

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    invoke-direct {v0, p0, v1}, La/y8y;-><init>(La/b9y;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, La/b9y;->g:La/a8z;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final G()La/bv9;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final H(La/ihy;La/rgy;)La/dre0;
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
    new-instance p1, La/b9y;

    .line 8
    .line 9
    iget-object p0, p0, La/b9y;->c:La/xgy;

    .line 10
    .line 11
    invoke-direct {p1, p0}, La/b9y;-><init>(La/xgy;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public final K()La/ihy;
    .locals 0

    .line 1
    iget-object p0, p0, La/b9y;->c:La/xgy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final L()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic d()La/ciy;
    .locals 0

    .line 10
    invoke-virtual {p0}, La/b9y;->d()La/diy;

    move-result-object p0

    return-object p0
.end method

.method public final d()La/diy;
    .locals 0

    .line 1
    iget-object p0, p0, La/b9y;->g:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/diy;

    .line 8
    .line 9
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-static {p1}, La/xtt0;->c(Ljava/lang/Object;)La/ire0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p0, p0, La/b9y;->c:La/xgy;

    .line 9
    .line 10
    invoke-interface {p1}, La/dre0;->K()La/ihy;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    const-string p0, "entries"

    .line 21
    .line 22
    invoke-interface {p1}, La/qgy;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    const-string p0, "getEntries()Lkotlin/enums/EnumEntries;"

    .line 33
    .line 34
    invoke-interface {p1}, La/ire0;->getSignature()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    invoke-interface {p1}, La/dre0;->L()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    const/4 p0, 0x1

    .line 56
    return p0

    .line 57
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 58
    return p0
.end method

.method public final findJavaDeclaration()Ljava/lang/reflect/GenericDeclaration;
    .locals 1

    .line 1
    iget-object p0, p0, La/b9y;->c:La/xgy;

    .line 2
    .line 3
    const-string v0, "getEntries()Lkotlin/enums/EnumEntries;"

    .line 4
    .line 5
    invoke-static {p0, v0}, La/t9x;->E(La/ghy;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final get()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/b9y;->d:La/a0o;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "entries"

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

.method public final getReturnType()La/kiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/b9y;->e:La/a8z;

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
    const-string p0, "getEntries()Lkotlin/enums/EnumEntries;"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVisibility()La/viy;
    .locals 0

    .line 1
    sget-object p0, La/viy;->a:La/viy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object p0, p0, La/b9y;->c:La/xgy;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xgy;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    const v0, -0x5edd7b70

    .line 10
    .line 11
    .line 12
    add-int/2addr p0, v0

    .line 13
    mul-int/lit8 p0, p0, 0x1f

    .line 14
    .line 15
    const v0, -0x7c6b8a9a

    .line 16
    .line 17
    .line 18
    add-int/2addr p0, v0

    .line 19
    return p0
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/b9y;->d:La/a0o;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isSuspend()Z
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

.method public final t()Z
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
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p0}, La/rv00;->k(Ljava/lang/StringBuilder;La/qgy;)V

    .line 7
    .line 8
    .line 9
    instance-of v1, p0, La/uhy;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string v1, "var "

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v1, "val "

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p0}, La/rv00;->m(Ljava/lang/StringBuilder;La/qgy;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "entries"

    .line 25
    .line 26
    invoke-static {v1, v0}, La/rv00;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 27
    .line 28
    .line 29
    const-string v1, ": "

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/b9y;->getReturnType()La/kiy;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-static {p0, v1}, La/rv00;->z(La/kiy;Z)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public final x()La/bv9;
    .locals 0

    .line 1
    iget-object p0, p0, La/b9y;->f:La/a9y;

    .line 2
    .line 3
    return-object p0
.end method

.method public final y()Ljava/lang/reflect/Field;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
