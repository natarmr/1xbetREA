.class public La/k8y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rnb0;


# static fields
.field public static final synthetic e:[La/iiy;


# instance fields
.field public final a:La/swq;

.field public final b:La/gmk0;

.field public final c:La/cu00;

.field public final d:La/dqe0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/k8y;

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    const-string v3, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

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
    sput-object v1, La/k8y;->e:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/f7u;La/cqe0;La/swq;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p3, p0, La/k8y;->a:La/swq;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-static {p2}, La/m2a;->v(La/x8y;)La/rog0;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object p3, La/gmk0;->x0:La/gne0;

    .line 20
    .line 21
    :goto_0
    iput-object p3, p0, La/k8y;->b:La/gmk0;

    .line 22
    .line 23
    iget-object p3, p1, La/f7u;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p3, La/v7i;

    .line 26
    .line 27
    iget-object p3, p3, La/v7i;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p3, La/eu00;

    .line 30
    .line 31
    new-instance v0, La/nsr;

    .line 32
    .line 33
    const/16 v1, 0xd

    .line 34
    .line 35
    invoke-direct {v0, p1, p0, v1}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    new-instance p1, La/cu00;

    .line 39
    .line 40
    invoke-direct {p1, p3, v0}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, La/k8y;->c:La/cu00;

    .line 44
    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    invoke-virtual {p2}, La/cqe0;->b()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->V(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, La/dqe0;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 p1, 0x0

    .line 59
    :goto_1
    iput-object p1, p0, La/k8y;->d:La/dqe0;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final b()La/gmk0;
    .locals 0

    .line 1
    iget-object p0, p0, La/k8y;->b:La/gmk0;

    .line 2
    .line 3
    return-object p0
.end method

.method public c()Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p0, La/lun;->a:La/lun;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final d()La/swq;
    .locals 0

    .line 1
    iget-object p0, p0, La/k8y;->a:La/swq;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getType()La/wsy;
    .locals 2

    .line 1
    sget-object v0, La/k8y;->e:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, La/k8y;->c:La/cu00;

    .line 7
    .line 8
    invoke-static {p0, v0}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/kzj0;

    .line 16
    .line 17
    return-object p0
.end method
