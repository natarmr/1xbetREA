.class public La/vek;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/g93;


# static fields
.field public static final synthetic b:[La/iiy;


# instance fields
.field public final a:La/cu00;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/vek;

    .line 4
    .line 5
    const-string v2, "annotations"

    .line 6
    .line 7
    const-string v3, "getAnnotations()Ljava/util/List;"

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
    sput-object v1, La/vek;->b:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/eu00;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/cu00;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/vek;->a:La/cu00;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final bridge O0(La/swq;)La/t83;
    .locals 0

    .line 1
    invoke-static {p0, p1}, La/jar0;->R(La/g93;La/swq;)La/t83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public isEmpty()Z
    .locals 2

    .line 1
    sget-object v0, La/vek;->b:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/vek;->a:La/cu00;

    .line 10
    .line 11
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    sget-object v0, La/vek;->b:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/vek;->a:La/cu00;

    .line 10
    .line 11
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final bridge z0(La/swq;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, La/jar0;->U(La/g93;La/swq;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
