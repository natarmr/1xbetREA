.class public abstract La/rdk;
.super La/ock;
.source "SourceFile"

# interfaces
.implements La/ire0;


# static fields
.field public static final n:La/ddk;

.field public static final synthetic o:[La/iiy;

.field public static final p:Ljava/lang/Object;


# instance fields
.field public final h:La/ihy;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/Object;

.field public final l:La/a8z;

.field public final m:La/mre0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/rdk;

    .line 4
    .line 5
    const-string v2, "descriptor"

    .line 6
    .line 7
    const-string v3, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/rdk;->o:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/ddk;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/rdk;->n:La/ddk;

    .line 26
    .line 27
    new-instance v0, Ljava/lang/Object;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, La/rdk;->p:Ljava/lang/Object;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(La/ihy;La/d0d0;La/rgy;)V
    .locals 8

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    invoke-interface {p2}, La/vjj;->getName()La/g950;

    move-result-object v0

    invoke-virtual {v0}, La/g950;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    invoke-static {p2}, La/sog0;->b(La/d0d0;)La/g1x;

    move-result-object v0

    invoke-virtual {v0}, La/g1x;->o()Ljava/lang/String;

    move-result-object v4

    .line 43
    sget-object v6, La/op9;->NO_RECEIVER:Ljava/lang/Object;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    move-object v7, p3

    .line 44
    invoke-direct/range {v1 .. v7}, La/rdk;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/String;La/d0d0;Ljava/lang/Object;La/rgy;)V

    return-void
.end method

.method public constructor <init>(La/ihy;Ljava/lang/String;Ljava/lang/String;La/d0d0;Ljava/lang/Object;La/rgy;)V
    .locals 0

    .line 1
    invoke-direct {p0, p6}, La/ock;-><init>(La/rgy;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rdk;->h:La/ihy;

    .line 5
    .line 6
    iput-object p2, p0, La/rdk;->i:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, La/rdk;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, La/rdk;->k:Ljava/lang/Object;

    .line 11
    .line 12
    sget-object p1, La/wez;->a:La/wez;

    .line 13
    .line 14
    new-instance p2, La/bdk;

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    invoke-direct {p2, p0, p3}, La/bdk;-><init>(La/rdk;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, La/rdk;->l:La/a8z;

    .line 25
    .line 26
    new-instance p1, La/bdk;

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-direct {p1, p0, p2}, La/bdk;-><init>(La/rdk;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p4, p1}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La/rdk;->m:La/mre0;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(La/ihy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 7

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    .line 39
    sget-object v6, La/rgy;->k:La/rgy;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 40
    invoke-direct/range {v0 .. v6}, La/rdk;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/String;La/d0d0;Ljava/lang/Object;La/rgy;)V

    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/reflect/Member;
    .locals 6

    .line 1
    invoke-virtual {p0}, La/rdk;->B()La/d0d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, La/d0d0;->v()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    sget-object v0, La/sog0;->a:La/qlc;

    .line 14
    .line 15
    invoke-virtual {p0}, La/rdk;->B()La/d0d0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, La/sog0;->b(La/d0d0;)La/g1x;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v2, v0, La/qfy;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    check-cast v0, La/qfy;

    .line 28
    .line 29
    iget-object v2, v0, La/qfy;->d:La/h950;

    .line 30
    .line 31
    iget-object v0, v0, La/qfy;->c:La/xfy;

    .line 32
    .line 33
    iget v3, v0, La/xfy;->b:I

    .line 34
    .line 35
    const/16 v4, 0x10

    .line 36
    .line 37
    and-int/2addr v3, v4

    .line 38
    if-ne v3, v4, :cond_2

    .line 39
    .line 40
    iget-object v0, v0, La/xfy;->g:La/vfy;

    .line 41
    .line 42
    iget v3, v0, La/vfy;->b:I

    .line 43
    .line 44
    and-int/lit8 v4, v3, 0x1

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    if-ne v4, v5, :cond_1

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    and-int/2addr v3, v4

    .line 51
    if-ne v3, v4, :cond_1

    .line 52
    .line 53
    iget v1, v0, La/vfy;->c:I

    .line 54
    .line 55
    invoke-interface {v2, v1}, La/h950;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget v0, v0, La/vfy;->d:I

    .line 60
    .line 61
    invoke-interface {v2, v0}, La/h950;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object p0, p0, La/rdk;->h:La/ihy;

    .line 66
    .line 67
    invoke-virtual {p0, v1, v0}, La/ihy;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_1
    return-object v1

    .line 73
    :cond_2
    invoke-virtual {p0}, La/rdk;->y()Ljava/lang/reflect/Field;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public final B()La/d0d0;
    .locals 2

    .line 1
    sget-object v0, La/rdk;->o:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, La/rdk;->m:La/mre0;

    .line 7
    .line 8
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/d0d0;

    .line 16
    .line 17
    return-object p0
.end method

.method public abstract C()La/fdk;
.end method

.method public final G()La/bv9;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/rdk;->C()La/fdk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public final K()La/ihy;
    .locals 0

    .line 1
    iget-object p0, p0, La/rdk;->h:La/ihy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final L()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/rdk;->k:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

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
    iget-object v0, p0, La/rdk;->h:La/ihy;

    .line 9
    .line 10
    invoke-interface {p1}, La/dre0;->K()La/ihy;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, La/rdk;->i:Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {p1}, La/qgy;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, La/rdk;->j:Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {p1}, La/ire0;->getSignature()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object p0, p0, La/rdk;->k:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-interface {p1}, La/dre0;->L()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 59
    return p0
.end method

.method public final findJavaDeclaration()Ljava/lang/reflect/GenericDeclaration;
    .locals 1

    .line 1
    iget-object v0, p0, La/rdk;->h:La/ihy;

    .line 2
    .line 3
    iget-object p0, p0, La/rdk;->j:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p0}, La/t9x;->E(La/ghy;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/rdk;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/rdk;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/rdk;->h:La/ihy;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, La/rdk;->i:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, La/rdk;->j:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final isSuspend()Z
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
    iget-object v1, p0, La/rdk;->i:Ljava/lang/String;

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
    invoke-virtual {p0}, La/ock;->getReturnType()La/kiy;

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

.method public final u()La/wdk;
    .locals 4

    .line 1
    new-instance v0, La/wdk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/rdk;->B()La/d0d0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, La/kp9;->getReturnType()La/wsy;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, La/xvw;->R(La/ire0;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v2, La/bdk;

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-direct {v2, p0, v3}, La/bdk;-><init>(La/rdk;B)V

    .line 26
    .line 27
    .line 28
    move-object p0, v2

    .line 29
    :goto_0
    const/4 v2, 0x0

    .line 30
    invoke-direct {v0, v1, p0, v2}, La/wdk;-><init>(La/wsy;Lkotlin/jvm/functions/Function0;Z)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public final x()La/bv9;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/rdk;->C()La/fdk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/fdk;->x()La/bv9;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final y()Ljava/lang/reflect/Field;
    .locals 0

    .line 1
    iget-object p0, p0, La/rdk;->l:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/reflect/Field;

    .line 8
    .line 9
    return-object p0
.end method

.method public final bridge synthetic z()La/mp9;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/rdk;->B()La/d0d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
