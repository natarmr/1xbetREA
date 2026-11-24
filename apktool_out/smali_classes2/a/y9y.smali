.class public final La/y9y;
.super La/k8y;
.source "SourceFile"


# static fields
.field public static final synthetic g:[La/iiy;


# instance fields
.field public final f:La/cu00;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/y9y;

    .line 4
    .line 5
    const-string v2, "allValueArguments"

    .line 6
    .line 7
    const-string v3, "getAllValueArguments()Ljava/util/Map;"

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
    sput-object v1, La/y9y;->g:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/cqe0;La/f7u;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/i4m0;->w:La/swq;

    .line 5
    .line 6
    invoke-direct {p0, p2, p1, v0}, La/k8y;-><init>(La/f7u;La/cqe0;La/swq;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p2, La/f7u;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, La/v7i;

    .line 12
    .line 13
    iget-object p1, p1, La/v7i;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, La/eu00;

    .line 16
    .line 17
    new-instance p2, La/aaw;

    .line 18
    .line 19
    const/16 v0, 0xc

    .line 20
    .line 21
    invoke-direct {p2, p0, v0}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    new-instance v0, La/cu00;

    .line 25
    .line 26
    invoke-direct {v0, p1, p2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/y9y;->f:La/cu00;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final c()Ljava/util/Map;
    .locals 2

    .line 1
    sget-object v0, La/y9y;->g:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, La/y9y;->f:La/cu00;

    .line 7
    .line 8
    invoke-static {p0, v0}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Map;

    .line 13
    .line 14
    return-object p0
.end method
