.class public final La/tc9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t83;


# instance fields
.field public final a:La/ary;

.field public final b:La/swq;

.field public final c:Ljava/util/Map;

.field public final d:La/a8z;


# direct methods
.method public constructor <init>(La/ary;La/swq;Ljava/util/Map;)V
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/tc9;->a:La/ary;

    .line 14
    .line 15
    iput-object p2, p0, La/tc9;->b:La/swq;

    .line 16
    .line 17
    iput-object p3, p0, La/tc9;->c:Ljava/util/Map;

    .line 18
    .line 19
    sget-object p1, La/wez;->a:La/wez;

    .line 20
    .line 21
    new-instance p2, La/h79;

    .line 22
    .line 23
    const/4 p3, 0x4

    .line 24
    invoke-direct {p2, p0, p3}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, La/tc9;->d:La/a8z;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final b()La/gmk0;
    .locals 0

    .line 1
    sget-object p0, La/gmk0;->x0:La/gne0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, La/tc9;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()La/swq;
    .locals 0

    .line 1
    iget-object p0, p0, La/tc9;->b:La/swq;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getType()La/wsy;
    .locals 0

    .line 1
    iget-object p0, p0, La/tc9;->d:La/a8z;

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
    check-cast p0, La/wsy;

    .line 11
    .line 12
    return-object p0
.end method
